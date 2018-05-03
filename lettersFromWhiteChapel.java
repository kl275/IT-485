import java.util.LinkedList;
import java.lang.StringBuilder;
import java.util.Scanner;

class lettersFromWhiteChapel
{
    //board variables
    final int size = 196; // board size is 195 nodes, but I don't feel like doing math behind the array interface at the moment
    int row;
    int columns;
    int[][] adjMatrix = new int[size][size]; // adjacency matrix to list what nodes connect to each other

    public void lettersFromWhiteChapel()
	{
        // initialize adjmatrix to have no connections, which will be entered later
        for (row = 0; row < size; row++) {
            for (columns = 0; columns < size; columns++) 
			{
                adjMatrix[row][columns] = 0;
            }
        }
        buildWhiteChapelBoard();
    }

    void buildWhiteChapelBoard()
	{
        adjMatrix[1][2] = 1;
        adjMatrix[1][6] = 1;
        adjMatrix[1][7] = 1;
        adjMatrix[1][8] = 1;
        adjMatrix[1][9] = 1;
        adjMatrix[1][24] = 1;
        adjMatrix[1][26] = 1;
        adjMatrix[1][28] = 1;

        adjMatrix[2][1] = 1;
        adjMatrix[2][3] = 1;
        adjMatrix[2][8] = 1;
        adjMatrix[2][9] = 1;
        adjMatrix[2][11] = 1;
        adjMatrix[2][26] = 1;
        adjMatrix[2][28] = 1;

        adjMatrix[3][2] = 1;
        adjMatrix[3][4] = 1;
        adjMatrix[3][5] = 1;
        adjMatrix[3][9] = 1;
        adjMatrix[3][11] = 1;

        adjMatrix[4][3] = 1;
        adjMatrix[4][5] = 1;
        adjMatrix[4][10] = 1;
        adjMatrix[4][11] = 1;
        adjMatrix[4][12] = 1;
        adjMatrix[4][30] = 1;

        adjMatrix[5][3] = 1;
        adjMatrix[5][4] = 1;
        adjMatrix[5][12] = 1;
        adjMatrix[5][13] = 1;
        adjMatrix[5][15] = 1;
        adjMatrix[5][16] = 1;
        adjMatrix[5][17] = 1;

        adjMatrix[6][1] = 1;
        adjMatrix[6][7] = 1;
        adjMatrix[6][24] = 1;
        adjMatrix[6][25] = 1;
        adjMatrix[6][26] = 1;
        adjMatrix[6][44] = 1;

        adjMatrix[7][1] = 1;
        adjMatrix[7][6] = 1;
        adjMatrix[7][24] = 1;
        adjMatrix[7][25] = 1;
        adjMatrix[7][26] = 1;
        adjMatrix[7][44] = 1;

        adjMatrix[8][1] = 1;
        adjMatrix[8][2] = 1;
        adjMatrix[8][9] = 1;
        adjMatrix[8][10] = 1;
        adjMatrix[8][26] = 1;
        adjMatrix[8][28] = 1;

        adjMatrix[9][1] = 1;
        adjMatrix[9][2] = 1;
        adjMatrix[9][3] = 1;
        adjMatrix[9][8] = 1;
        adjMatrix[9][10] = 1;
        adjMatrix[9][11] = 1;
        adjMatrix[9][26] = 1;
        adjMatrix[9][28] = 1;

        adjMatrix[10][4] = 1;
        adjMatrix[10][8] = 1;
        adjMatrix[10][9] = 1;
        adjMatrix[10][11] = 1;
        adjMatrix[10][12] = 1;
        adjMatrix[10][30] = 1;

        adjMatrix[11][2] = 1;
        adjMatrix[11][3] = 1;
        adjMatrix[11][4] = 1;
        adjMatrix[11][9] = 1;
        adjMatrix[11][10] = 1;
        adjMatrix[11][12] = 1;
        adjMatrix[11][30] = 1;

        adjMatrix[12][4] = 1;
        adjMatrix[12][5] = 1;
        adjMatrix[12][10] = 1;
        adjMatrix[12][11] = 1;
        adjMatrix[12][13] = 1;
        adjMatrix[12][15] = 1;
        adjMatrix[12][16] = 1;
        adjMatrix[12][17] = 1;
        adjMatrix[12][30] = 1;

        adjMatrix[13][5] = 1;
        adjMatrix[13][12] = 1;
        adjMatrix[13][14] = 1;
        adjMatrix[13][15] = 1;
        adjMatrix[13][16] = 1;
        adjMatrix[13][17] = 1;
        adjMatrix[13][30] = 1;
        adjMatrix[13][32] = 1;

        adjMatrix[14][13] = 1;
        adjMatrix[14][30] = 1;
        adjMatrix[14][31] = 1;
        adjMatrix[14][32] = 1;
        adjMatrix[14][33] = 1;
        adjMatrix[14][52] = 1;
        adjMatrix[14][54] = 1;

        adjMatrix[15][5] = 1;
        adjMatrix[15][12] = 1;
        adjMatrix[15][13] = 1;
        adjMatrix[15][16] = 1;
        adjMatrix[15][17] = 1;
        adjMatrix[15][33] = 1;
        adjMatrix[15][34] = 1;
        adjMatrix[15][35] = 1;
        adjMatrix[15][36] = 1;

        adjMatrix[16][5] = 1;
        adjMatrix[16][12] = 1;
        adjMatrix[16][13] = 1;
        adjMatrix[16][15] = 1;
        adjMatrix[16][17] = 1;
        adjMatrix[16][33] = 1;
        adjMatrix[16][34] = 1;
        adjMatrix[16][35] = 1;
        adjMatrix[16][36] = 1;

        adjMatrix[17][5] = 1;
        adjMatrix[17][12] = 1;
        adjMatrix[17][13] = 1;
        adjMatrix[17][15] = 1;
        adjMatrix[17][16] = 1;
        adjMatrix[17][18] = 1;
        adjMatrix[17][36] = 1;
        adjMatrix[17][38] = 1;

        adjMatrix[18][17] = 1;
        adjMatrix[18][19] = 1;
        adjMatrix[18][20] = 1;
        adjMatrix[18][36] = 1;
        adjMatrix[18][38] = 1;
        adjMatrix[18][39] = 1;

        adjMatrix[19][18] = 1;
        adjMatrix[19][20] = 1;
        adjMatrix[19][39] = 1;

        adjMatrix[20][18] = 1;
        adjMatrix[20][19] = 1;
        adjMatrix[20][21] = 1;
        adjMatrix[20][40] = 1;
        adjMatrix[20][41] = 1;
        adjMatrix[20][42] = 1;

        adjMatrix[21][20] = 1;
        adjMatrix[21][23] = 1;
        adjMatrix[21][40] = 1;
        adjMatrix[21][41] = 1;
        adjMatrix[21][42] = 1;

        adjMatrix[22][23] = 1;
        adjMatrix[22][42] = 1;
        adjMatrix[22][77] = 1;

        adjMatrix[23][21] = 1;
        adjMatrix[23][22] = 1;
        adjMatrix[23][77] = 1;

        adjMatrix[24][1] = 1;
        adjMatrix[24][6] = 1;
        adjMatrix[24][7] = 1;
        adjMatrix[24][25] = 1;
        adjMatrix[24][26] = 1;
        adjMatrix[24][43] = 1;
        adjMatrix[24][44] = 1;
        adjMatrix[24][59] = 1;

        adjMatrix[25][6] = 1;
        adjMatrix[25][7] = 1;
        adjMatrix[25][24] = 1;
        adjMatrix[25][26] = 1;
        adjMatrix[25][43] = 1;
        adjMatrix[25][44] = 1;
        adjMatrix[25][59] = 1;

        adjMatrix[26][1] = 1;
        adjMatrix[26][2] = 1;
        adjMatrix[26][6] = 1;
        adjMatrix[26][7] = 1;
        adjMatrix[26][8] = 1;
        adjMatrix[26][9] = 1;
        adjMatrix[26][24] = 1;
        adjMatrix[26][25] = 1;
        adjMatrix[26][27] = 1;
        adjMatrix[26][28] = 1;
        adjMatrix[26][44] = 1;
        adjMatrix[26][46] = 1;
        adjMatrix[26][79] = 1;

        adjMatrix[27][26] = 1;
        adjMatrix[27][28] = 1;
        adjMatrix[27][29] = 1;
        adjMatrix[27][44] = 1;
        adjMatrix[27][45] = 1;
        adjMatrix[27][46] = 1;
        adjMatrix[27][47] = 1;
        adjMatrix[27][48] = 1;
        adjMatrix[27][79] = 1;

        adjMatrix[28][1] = 1;
        adjMatrix[28][2] = 1;
        adjMatrix[28][8] = 1;
        adjMatrix[28][9] = 1;
        adjMatrix[28][26] = 1;
        adjMatrix[28][27] = 1;
        adjMatrix[28][29] = 1;
        adjMatrix[28][45] = 1;
        adjMatrix[28][46] = 1;
        adjMatrix[28][47] = 1;
        adjMatrix[28][48] = 1;

        adjMatrix[29][27] = 1;
        adjMatrix[29][28] = 1;
        adjMatrix[29][30] = 1;
        adjMatrix[29][45] = 1;
        adjMatrix[29][46] = 1;
        adjMatrix[29][47] = 1;
        adjMatrix[29][48] = 1;
        adjMatrix[29][49] = 1;
        adjMatrix[29][50] = 1;
        adjMatrix[29][64] = 1;
        adjMatrix[29][66] = 1;

        adjMatrix[30][4] = 1;
        adjMatrix[30][10] = 1;
        adjMatrix[30][11] = 1;
        adjMatrix[30][12] = 1;
        adjMatrix[30][13] = 1;
        adjMatrix[30][14] = 1;
        adjMatrix[30][29] = 1;
        adjMatrix[30][32] = 1;
        adjMatrix[30][49] = 1;
        adjMatrix[30][50] = 1;
        adjMatrix[30][64] = 1;
        adjMatrix[30][66] = 1;

        adjMatrix[31][14] = 1;
        adjMatrix[31][32] = 1;
        adjMatrix[31][33] = 1;
        adjMatrix[31][50] = 1;
        adjMatrix[31][51] = 1;
        adjMatrix[31][52] = 1;
        adjMatrix[31][54] = 1;

        adjMatrix[32][13] = 1;
        adjMatrix[32][14] = 1;
        adjMatrix[32][30] = 1;
        adjMatrix[32][31] = 1;
        adjMatrix[32][33] = 1;
        adjMatrix[32][52] = 1;
        adjMatrix[32][54] = 1;

        adjMatrix[33][14] = 1;
        adjMatrix[33][15] = 1;
        adjMatrix[33][16] = 1;
        adjMatrix[33][31] = 1;
        adjMatrix[33][32] = 1;
        adjMatrix[33][34] = 1;
        adjMatrix[33][35] = 1;
        adjMatrix[33][36] = 1;
        adjMatrix[33][52] = 1;
        adjMatrix[33][54] = 1;

        adjMatrix[34][15] = 1;
        adjMatrix[34][16] = 1;
        adjMatrix[34][33] = 1;
        adjMatrix[34][35] = 1;
        adjMatrix[34][36] = 1;
        adjMatrix[34][37] = 1;
        adjMatrix[34][53] = 1;
        adjMatrix[34][54] = 1;
        adjMatrix[34][55] = 1;
        adjMatrix[34][68] = 1;

        adjMatrix[35][15] = 1;
        adjMatrix[35][16] = 1;
        adjMatrix[35][33] = 1;
        adjMatrix[35][34] = 1;
        adjMatrix[35][36] = 1;
        adjMatrix[35][37] = 1;
        adjMatrix[35][53] = 1;
        adjMatrix[35][54] = 1;
        adjMatrix[35][55] = 1;
        adjMatrix[35][68] = 1;

        adjMatrix[36][15] = 1;
        adjMatrix[36][16] = 1;
        adjMatrix[36][17] = 1;
        adjMatrix[36][18] = 1;
        adjMatrix[36][33] = 1;
        adjMatrix[36][34] = 1;
        adjMatrix[36][35] = 1;
        adjMatrix[36][38] = 1;

        adjMatrix[37][34] = 1;
        adjMatrix[37][35] = 1;
        adjMatrix[37][38] = 1;
        adjMatrix[37][39] = 1;
        adjMatrix[37][53] = 1;
        adjMatrix[37][54] = 1;
        adjMatrix[37][55] = 1;
        adjMatrix[37][68] = 1;

        adjMatrix[38][17] = 1;
        adjMatrix[38][18] = 1;
        adjMatrix[38][36] = 1;
        adjMatrix[38][37] = 1;
        adjMatrix[38][39] = 1;

        adjMatrix[39][18] = 1;
        adjMatrix[39][19] = 1;
        adjMatrix[39][37] = 1;
        adjMatrix[39][38] = 1;
        adjMatrix[39][56] = 1;

        adjMatrix[40][20] = 1;
        adjMatrix[40][21] = 1;
        adjMatrix[40][41] = 1;
        adjMatrix[40][42] = 1;
        adjMatrix[40][57] = 1;
        adjMatrix[40][58] = 1;
        adjMatrix[40][73] = 1;

        adjMatrix[41][20] = 1;
        adjMatrix[41][21] = 1;
        adjMatrix[41][40] = 1;
        adjMatrix[41][42] = 1;
        adjMatrix[41][57] = 1;
        adjMatrix[41][58] = 1;
        adjMatrix[41][73] = 1;

        adjMatrix[42][20] = 1;
        adjMatrix[42][21] = 1;
        adjMatrix[42][22] = 1;
        adjMatrix[42][40] = 1;
        adjMatrix[42][41] = 1;
        adjMatrix[42][57] = 1;
        adjMatrix[42][58] = 1;
        adjMatrix[42][73] = 1;

        adjMatrix[43][24] = 1;
        adjMatrix[43][25] = 1;
        adjMatrix[43][44] = 1;
        adjMatrix[43][59] = 1;

        adjMatrix[44][6] = 1;
        adjMatrix[44][7] = 1;
        adjMatrix[44][24] = 1;
        adjMatrix[44][25] = 1;
        adjMatrix[44][26] = 1;
        adjMatrix[44][27] = 1;
        adjMatrix[44][43] = 1;
        adjMatrix[44][46] = 1;
        adjMatrix[44][59] = 1;
        adjMatrix[44][79] = 1;

        adjMatrix[45][27] = 1;
        adjMatrix[45][28] = 1;
        adjMatrix[45][29] = 1;
        adjMatrix[45][46] = 1;
        adjMatrix[45][47] = 1;
        adjMatrix[45][48] = 1;
        adjMatrix[45][61] = 1;

        adjMatrix[46][27] = 1;
        adjMatrix[46][28] = 1;
        adjMatrix[46][29] = 1;
        adjMatrix[46][45] = 1;
        adjMatrix[46][47] = 1;
        adjMatrix[46][48] = 1;

        adjMatrix[47][27] = 1;
        adjMatrix[47][28] = 1;
        adjMatrix[47][29] = 1;
        adjMatrix[47][45] = 1;
        adjMatrix[47][46] = 1;
        adjMatrix[47][48] = 1;
        adjMatrix[47][61] = 1;

        adjMatrix[48][27] = 1;
        adjMatrix[48][28] = 1;
        adjMatrix[48][29] = 1;
        adjMatrix[48][45] = 1;
        adjMatrix[48][46] = 1;
        adjMatrix[48][47] = 1;
        adjMatrix[48][49] = 1;
        adjMatrix[48][62] = 1;
        adjMatrix[48][63] = 1;
        adjMatrix[48][64] = 1;

        adjMatrix[49][29] = 1;
        adjMatrix[49][30] = 1;
        adjMatrix[49][48] = 1;
        adjMatrix[49][50] = 1;
        adjMatrix[49][62] = 1;
        adjMatrix[49][63] = 1;
        adjMatrix[49][64] = 1;
        adjMatrix[49][66] = 1;

        adjMatrix[50][29] = 1;
        adjMatrix[50][30] = 1;
        adjMatrix[50][31] = 1;
        adjMatrix[50][49] = 1;
        adjMatrix[50][51] = 1;
        adjMatrix[50][52] = 1;
        adjMatrix[50][64] = 1;
        adjMatrix[50][66] = 1;

        adjMatrix[51][31] = 1;
        adjMatrix[51][50] = 1;
        adjMatrix[51][52] = 1;
        adjMatrix[51][65] = 1;
        adjMatrix[51][66] = 1;
        adjMatrix[51][67] = 1;
        adjMatrix[51][84] = 1;

        adjMatrix[52][14] = 1;
        adjMatrix[52][31] = 1;
        adjMatrix[52][32] = 1;
        adjMatrix[52][33] = 1;
        adjMatrix[52][50] = 1;
        adjMatrix[52][51] = 1;
        adjMatrix[52][53] = 1;
        adjMatrix[52][54] = 1;
        adjMatrix[52][67] = 1;

        adjMatrix[53][34] = 1;
        adjMatrix[53][35] = 1;
        adjMatrix[53][37] = 1;
        adjMatrix[53][51] = 1;
        adjMatrix[53][52] = 1;
        adjMatrix[53][54] = 1;
        adjMatrix[53][55] = 1;
        adjMatrix[53][67] = 1;
        adjMatrix[53][68] = 1;

        adjMatrix[54][14] = 1;
        adjMatrix[54][31] = 1;
        adjMatrix[54][32] = 1;
        adjMatrix[54][33] = 1;
        adjMatrix[54][34] = 1;
        adjMatrix[54][35] = 1;
        adjMatrix[54][37] = 1;
        adjMatrix[54][52] = 1;
        adjMatrix[54][53] = 1;
        adjMatrix[54][55] = 1;
        adjMatrix[54][68] = 1;

        adjMatrix[55][34] = 1;
        adjMatrix[55][35] = 1;
        adjMatrix[55][37] = 1;
        adjMatrix[55][53] = 1;
        adjMatrix[55][54] = 1;
        adjMatrix[55][56] = 1;
        adjMatrix[55][68] = 1;
        adjMatrix[55][69] = 1;
        adjMatrix[55][86] = 1;
        adjMatrix[55][102] = 1;

        adjMatrix[56][39] = 1;
        adjMatrix[56][55] = 1;
        adjMatrix[56][57] = 1;
        adjMatrix[56][68] = 1;
        adjMatrix[56][69] = 1;
        adjMatrix[56][86] = 1;
        adjMatrix[56][102] = 1;

        adjMatrix[57][40] = 1;
        adjMatrix[57][41] = 1;
        adjMatrix[57][42] = 1;
        adjMatrix[57][56] = 1;
        adjMatrix[57][58] = 1;
        adjMatrix[57][73] = 1;

        adjMatrix[58][40] = 1;
        adjMatrix[58][41] = 1;
        adjMatrix[58][42] = 1;
        adjMatrix[58][57] = 1;
        adjMatrix[58][73] = 1;
        adjMatrix[58][74] = 1;
        adjMatrix[58][75] = 1;
        adjMatrix[58][76] = 1;

        adjMatrix[59][24] = 1;
        adjMatrix[59][25] = 1;
        adjMatrix[59][43] = 1;
        adjMatrix[59][44] = 1;
        adjMatrix[59][60] = 1;
        adjMatrix[59][78] = 1;
        adjMatrix[59][95] = 1;
        adjMatrix[59][96] = 1;

        adjMatrix[60][59] = 1;
        adjMatrix[60][78] = 1;
        adjMatrix[60][79] = 1;
        adjMatrix[60][95] = 1;
        adjMatrix[60][96] = 1;

        adjMatrix[61][45] = 1;
        adjMatrix[61][47] = 1;

        adjMatrix[62][48] = 1;
        adjMatrix[62][49] = 1;
        adjMatrix[62][63] = 1;
        adjMatrix[62][64] = 1;
        adjMatrix[62][80] = 1;
        adjMatrix[62][82] = 1;

        adjMatrix[63][48] = 1;
        adjMatrix[63][49] = 1;
        adjMatrix[63][62] = 1;
        adjMatrix[63][64] = 1;
        adjMatrix[63][65] = 1;
        adjMatrix[63][82] = 1;
        adjMatrix[63][83] = 1;

        adjMatrix[64][29] = 1;
        adjMatrix[64][30] = 1;
        adjMatrix[64][48] = 1;
        adjMatrix[64][49] = 1;
        adjMatrix[64][50] = 1;
        adjMatrix[64][62] = 1;
        adjMatrix[64][63] = 1;
        adjMatrix[64][66] = 1;

        adjMatrix[65][51] = 1;
        adjMatrix[65][63] = 1;
        adjMatrix[65][66] = 1;
        adjMatrix[65][67] = 1;
        adjMatrix[65][82] = 1;
        adjMatrix[65][83] = 1;
        adjMatrix[65][84] = 1;

        adjMatrix[66][29] = 1;
        adjMatrix[66][30] = 1;
        adjMatrix[66][49] = 1;
        adjMatrix[66][50] = 1;
        adjMatrix[66][51] = 1;
        adjMatrix[66][64] = 1;
        adjMatrix[66][65] = 1;
        adjMatrix[66][67] = 1;
        adjMatrix[66][84] = 1;

        adjMatrix[67][51] = 1;
        adjMatrix[67][52] = 1;
        adjMatrix[67][53] = 1;
        adjMatrix[67][65] = 1;
        adjMatrix[67][66] = 1;
        adjMatrix[67][84] = 1;

        adjMatrix[68][34] = 1;
        adjMatrix[68][35] = 1;
        adjMatrix[68][37] = 1;
        adjMatrix[68][53] = 1;
        adjMatrix[68][54] = 1;
        adjMatrix[68][55] = 1;
        adjMatrix[68][56] = 1;
        adjMatrix[68][69] = 1;
        adjMatrix[68][86] = 1;
        adjMatrix[68][102] = 1;

        adjMatrix[69][55] = 1;
        adjMatrix[69][56] = 1;
        adjMatrix[69][68] = 1;
        adjMatrix[69][70] = 1;
        adjMatrix[69][86] = 1;
        adjMatrix[69][102] = 1;
        adjMatrix[69][103] = 1;
        adjMatrix[69][127] = 1;

        adjMatrix[70][69] = 1;
        adjMatrix[70][71] = 1;
        adjMatrix[70][87] = 1;
        adjMatrix[70][103] = 1;

        adjMatrix[71][70] = 1;
        adjMatrix[71][72] = 1;
        adjMatrix[71][87] = 1;
        adjMatrix[71][88] = 1;
        adjMatrix[71][104] = 1;

        adjMatrix[72][71] = 1;
        adjMatrix[72][73] = 1;
        adjMatrix[72][74] = 1;
        adjMatrix[72][88] = 1;
        adjMatrix[72][89] = 1;
        adjMatrix[72][90] = 1;

        adjMatrix[73][40] = 1;
        adjMatrix[73][41] = 1;
        adjMatrix[73][42] = 1;
        adjMatrix[73][57] = 1;
        adjMatrix[73][58] = 1;
        adjMatrix[73][72] = 1;
        adjMatrix[73][74] = 1;
        adjMatrix[73][75] = 1;
        adjMatrix[73][76] = 1;
        adjMatrix[73][89] = 1;
        adjMatrix[73][90] = 1;

        adjMatrix[74][58] = 1;
        adjMatrix[74][72] = 1;
        adjMatrix[74][73] = 1;
        adjMatrix[74][75] = 1;
        adjMatrix[74][76] = 1;
        adjMatrix[74][89] = 1;
        adjMatrix[74][90] = 1;

        adjMatrix[75][58] = 1;
        adjMatrix[75][73] = 1;
        adjMatrix[75][74] = 1;
        adjMatrix[75][76] = 1;
        adjMatrix[75][77] = 1;
        adjMatrix[75][90] = 1;
        adjMatrix[75][91] = 1;
        adjMatrix[75][92] = 1;
        adjMatrix[75][93] = 1;
        adjMatrix[75][94] = 1;

        adjMatrix[76][58] = 1;
        adjMatrix[76][73] = 1;
        adjMatrix[76][74] = 1;
        adjMatrix[76][75] = 1;
        adjMatrix[76][77] = 1;
        adjMatrix[76][90] = 1;
        adjMatrix[76][91] = 1;
        adjMatrix[76][92] = 1;
        adjMatrix[76][93] = 1;
        adjMatrix[76][94] = 1;

        adjMatrix[77][22] = 1;
        adjMatrix[77][23] = 1;
        adjMatrix[77][75] = 1;
        adjMatrix[77][76] = 1;
        adjMatrix[77][90] = 1;
        adjMatrix[77][91] = 1;
        adjMatrix[77][92] = 1;
        adjMatrix[77][93] = 1;
        adjMatrix[77][94] = 1;

        adjMatrix[78][59] = 1;
        adjMatrix[78][60] = 1;
        adjMatrix[78][79] = 1;
        adjMatrix[78][80] = 1;
        adjMatrix[78][95] = 1;
        adjMatrix[78][96] = 1;
        adjMatrix[78][97] = 1;

        adjMatrix[79][26] = 1;
        adjMatrix[79][27] = 1;
        adjMatrix[79][44] = 1;
        adjMatrix[79][46] = 1;
        adjMatrix[79][60] = 1;
        adjMatrix[79][78] = 1;
        adjMatrix[79][80] = 1;
        adjMatrix[79][97] = 1;

        adjMatrix[80][62] = 1;
        adjMatrix[80][78] = 1;
        adjMatrix[80][79] = 1;
        adjMatrix[80][81] = 1;
        adjMatrix[80][82] = 1;
        adjMatrix[80][97] = 1;
        adjMatrix[80][98] = 1;

        adjMatrix[81][80] = 1;
        adjMatrix[81][118] = 1;

        adjMatrix[82][62] = 1;
        adjMatrix[82][63] = 1;
        adjMatrix[82][65] = 1;
        adjMatrix[82][80] = 1;
        adjMatrix[82][83] = 1;
        adjMatrix[82][98] = 1;

        adjMatrix[83][63] = 1;
        adjMatrix[83][65] = 1;
        adjMatrix[83][82] = 1;
        adjMatrix[83][99] = 1;
        adjMatrix[83][100] = 1;
        adjMatrix[83][120] = 1;

        adjMatrix[84][51] = 1;
        adjMatrix[84][65] = 1;
        adjMatrix[84][66] = 1;
        adjMatrix[84][67] = 1;
        adjMatrix[84][85] = 1;
        adjMatrix[84][86] = 1;
        adjMatrix[84][99] = 1;
        adjMatrix[84][100] = 1;

        adjMatrix[85][84] = 1;
        adjMatrix[85][86] = 1;
        adjMatrix[85][99] = 1;
        adjMatrix[85][100] = 1;
        adjMatrix[85][101] = 1;
        adjMatrix[85][124] = 1;
        adjMatrix[85][126] = 1;

        adjMatrix[86][55] = 1;
        adjMatrix[86][56] = 1;
        adjMatrix[86][68] = 1;
        adjMatrix[86][69] = 1;
        adjMatrix[86][84] = 1;
        adjMatrix[86][85] = 1;
        adjMatrix[86][99] = 1;
        adjMatrix[86][100] = 1;
        adjMatrix[86][102] = 1;

        adjMatrix[87][70] = 1;
        adjMatrix[87][71] = 1;
        adjMatrix[87][104] = 1;
        adjMatrix[87][129] = 1;

        adjMatrix[88][71] = 1;
        adjMatrix[88][72] = 1;
        adjMatrix[88][104] = 1;
        adjMatrix[88][105] = 1;
        adjMatrix[88][130] = 1;

        adjMatrix[89][72] = 1;
        adjMatrix[89][73] = 1;
        adjMatrix[89][74] = 1;
        adjMatrix[89][90] = 1;
        adjMatrix[89][91] = 1;
        adjMatrix[89][105] = 1;
        adjMatrix[89][106] = 1;
        adjMatrix[89][107] = 1;

        adjMatrix[90][72] = 1;
        adjMatrix[90][73] = 1;
        adjMatrix[90][74] = 1;
        adjMatrix[90][75] = 1;
        adjMatrix[90][76] = 1;
        adjMatrix[90][77] = 1;
        adjMatrix[90][89] = 1;
        adjMatrix[90][91] = 1;
        adjMatrix[90][92] = 1;
        adjMatrix[90][93] = 1;
        adjMatrix[90][94] = 1;

        adjMatrix[91][75] = 1;
        adjMatrix[91][76] = 1;
        adjMatrix[91][77] = 1;
        adjMatrix[91][89] = 1;
        adjMatrix[91][90] = 1;
        adjMatrix[91][92] = 1;
        adjMatrix[91][93] = 1;
        adjMatrix[91][94] = 1;
        adjMatrix[91][105] = 1;
        adjMatrix[91][106] = 1;
        adjMatrix[91][107] = 1;

        adjMatrix[92][75] = 1;
        adjMatrix[92][76] = 1;
        adjMatrix[92][77] = 1;
        adjMatrix[92][90] = 1;
        adjMatrix[92][91] = 1;
        adjMatrix[92][93] = 1;
        adjMatrix[92][94] = 1;
        adjMatrix[92][107] = 1;
        adjMatrix[92][108] = 1;
        adjMatrix[92][109] = 1;
        adjMatrix[92][110] = 1;
        adjMatrix[92][132] = 1;

        adjMatrix[93][75] = 1;
        adjMatrix[93][76] = 1;
        adjMatrix[93][77] = 1;
        adjMatrix[93][90] = 1;
        adjMatrix[93][91] = 1;
        adjMatrix[93][92] = 1;
        adjMatrix[93][94] = 1;
        adjMatrix[93][109] = 1;
        adjMatrix[93][110] = 1;
        adjMatrix[93][111] = 1;

        adjMatrix[94][75] = 1;
        adjMatrix[94][76] = 1;
        adjMatrix[94][77] = 1;
        adjMatrix[94][90] = 1;
        adjMatrix[94][91] = 1;
        adjMatrix[94][92] = 1;
        adjMatrix[94][93] = 1;
        adjMatrix[94][109] = 1;
        adjMatrix[94][110] = 1;
        adjMatrix[94][111] = 1;

        adjMatrix[95][59] = 1;
        adjMatrix[95][60] = 1;
        adjMatrix[95][78] = 1;
        adjMatrix[95][96] = 1;
        adjMatrix[95][112] = 1;
        adjMatrix[95][113] = 1;
        adjMatrix[95][114] = 1;

        adjMatrix[96][59] = 1;
        adjMatrix[96][60] = 1;
        adjMatrix[96][78] = 1;
        adjMatrix[96][95] = 1;
        adjMatrix[96][97] = 1;
        adjMatrix[96][112] = 1;
        adjMatrix[96][113] = 1;
        adjMatrix[96][114] = 1;
        adjMatrix[96][115] = 1;
        adjMatrix[96][116] = 1;

        adjMatrix[97][78] = 1;
        adjMatrix[97][79] = 1;
        adjMatrix[97][80] = 1;
        adjMatrix[97][96] = 1;
        adjMatrix[97][115] = 1;
        adjMatrix[97][116] = 1;
        adjMatrix[97][117] = 1;

        adjMatrix[98][62] = 1;
        adjMatrix[98][80] = 1;
        adjMatrix[98][82] = 1;
        adjMatrix[98][118] = 1;
        adjMatrix[98][119] = 1;
        adjMatrix[98][120] = 1;
        adjMatrix[98][121] = 1;
        adjMatrix[98][122] = 1;
        adjMatrix[98][123] = 1;

        adjMatrix[99][83] = 1;
        adjMatrix[99][84] = 1;
        adjMatrix[99][85] = 1;
        adjMatrix[99][86] = 1;
        adjMatrix[99][100] = 1;
        adjMatrix[99][120] = 1;

        adjMatrix[100][83] = 1;
        adjMatrix[100][84] = 1;
        adjMatrix[100][85] = 1;
        adjMatrix[100][86] = 1;
        adjMatrix[100][99] = 1;
        adjMatrix[100][120] = 1;
        adjMatrix[100][122] = 1;
        adjMatrix[100][123] = 1;
        adjMatrix[100][124] = 1;
        adjMatrix[100][125] = 1;
        adjMatrix[100][140] = 1;
        adjMatrix[100][141] = 1;
        adjMatrix[100][155] = 1;
        adjMatrix[100][170] = 1;

        adjMatrix[101][85] = 1;
        adjMatrix[101][102] = 1;
        adjMatrix[101][124] = 1;
        adjMatrix[101][125] = 1;
        adjMatrix[101][126] = 1;
        adjMatrix[101][127] = 1;
        adjMatrix[101][142] = 1;
        adjMatrix[101][143] = 1;
        adjMatrix[101][156] = 1;

        adjMatrix[102][55] = 1;
        adjMatrix[102][56] = 1;
        adjMatrix[102][68] = 1;
        adjMatrix[102][69] = 1;
        adjMatrix[102][86] = 1;
        adjMatrix[102][101] = 1;
        adjMatrix[102][125] = 1;
        adjMatrix[102][126] = 1;
        adjMatrix[102][127] = 1;
        adjMatrix[102][142] = 1;
        adjMatrix[102][143] = 1;
        adjMatrix[102][156] = 1;

        adjMatrix[103][69] = 1;
        adjMatrix[103][70] = 1;
        adjMatrix[103][127] = 1;
        adjMatrix[103][128] = 1;

        adjMatrix[104][71] = 1;
        adjMatrix[104][87] = 1;
        adjMatrix[104][88] = 1;
        adjMatrix[104][105] = 1;
        adjMatrix[104][129] = 1;
        adjMatrix[104][130] = 1;
        adjMatrix[104][145] = 1;

        adjMatrix[105][88] = 1;
        adjMatrix[105][89] = 1;
        adjMatrix[105][91] = 1;
        adjMatrix[105][104] = 1;
        adjMatrix[105][106] = 1;
        adjMatrix[105][107] = 1;
        adjMatrix[105][130] = 1;

        adjMatrix[106][89] = 1;
        adjMatrix[106][91] = 1;
        adjMatrix[106][105] = 1;
        adjMatrix[106][107] = 1;
        adjMatrix[106][108] = 1;
        adjMatrix[106][131] = 1;
        adjMatrix[106][132] = 1;
        adjMatrix[106][133] = 1;
        adjMatrix[106][134] = 1;

        adjMatrix[107][89] = 1;
        adjMatrix[107][91] = 1;
        adjMatrix[107][92] = 1;
        adjMatrix[107][105] = 1;
        adjMatrix[107][106] = 1;
        adjMatrix[107][108] = 1;
        adjMatrix[107][109] = 1;
        adjMatrix[107][110] = 1;
        adjMatrix[107][132] = 1;

        adjMatrix[108][92] = 1;
        adjMatrix[108][106] = 1;
        adjMatrix[108][107] = 1;
        adjMatrix[108][109] = 1;
        adjMatrix[108][110] = 1;
        adjMatrix[108][131] = 1;
        adjMatrix[108][132] = 1;
        adjMatrix[108][133] = 1;
        adjMatrix[108][134] = 1;

        adjMatrix[109][92] = 1;
        adjMatrix[109][93] = 1;
        adjMatrix[109][94] = 1;
        adjMatrix[109][107] = 1;
        adjMatrix[109][108] = 1;
        adjMatrix[109][110] = 1;
        adjMatrix[109][111] = 1;
        adjMatrix[109][132] = 1;

        adjMatrix[110][92] = 1;
        adjMatrix[110][93] = 1;
        adjMatrix[110][94] = 1;
        adjMatrix[110][107] = 1;
        adjMatrix[110][108] = 1;
        adjMatrix[110][109] = 1;
        adjMatrix[110][111] = 1;
        adjMatrix[110][132] = 1;

        adjMatrix[111][93] = 1;
        adjMatrix[111][94] = 1;
        adjMatrix[111][109] = 1;
        adjMatrix[111][110] = 1;
        adjMatrix[111][134] = 1;
        adjMatrix[111][147] = 1;

        adjMatrix[112][95] = 1;
        adjMatrix[112][96] = 1;
        adjMatrix[112][113] = 1;
        adjMatrix[112][114] = 1;
        adjMatrix[112][135] = 1;
        adjMatrix[112][148] = 1;
        adjMatrix[112][162] = 1;

        adjMatrix[113][95] = 1;
        adjMatrix[113][96] = 1;
        adjMatrix[113][112] = 1;
        adjMatrix[113][114] = 1;
        adjMatrix[113][135] = 1;
        adjMatrix[113][136] = 1;
        adjMatrix[113][137] = 1;
        adjMatrix[113][138] = 1;
        adjMatrix[113][148] = 1;

        adjMatrix[114][95] = 1;
        adjMatrix[114][96] = 1;
        adjMatrix[114][112] = 1;
        adjMatrix[114][113] = 1;
        adjMatrix[114][115] = 1;
        adjMatrix[114][135] = 1;
        adjMatrix[114][136] = 1;
        adjMatrix[114][137] = 1;
        adjMatrix[114][138] = 1;
        adjMatrix[114][148] = 1;

        adjMatrix[115][96] = 1;
        adjMatrix[115][97] = 1;
        adjMatrix[115][114] = 1;
        adjMatrix[115][116] = 1;
        adjMatrix[115][137] = 1;

        adjMatrix[116][96] = 1;
        adjMatrix[116][97] = 1;
        adjMatrix[116][115] = 1;
        adjMatrix[116][117] = 1;
        adjMatrix[116][118] = 1;
        adjMatrix[116][139] = 1;
        adjMatrix[116][150] = 1;
        adjMatrix[116][151] = 1;

        adjMatrix[117][97] = 1;
        adjMatrix[117][116] = 1;
        adjMatrix[117][118] = 1;
        adjMatrix[117][139] = 1;
        adjMatrix[117][150] = 1;
        adjMatrix[117][151] = 1;

        adjMatrix[118][81] = 1;
        adjMatrix[118][98] = 1;
        adjMatrix[118][116] = 1;
        adjMatrix[118][117] = 1;
        adjMatrix[118][119] = 1;
        adjMatrix[118][120] = 1;
        adjMatrix[118][121] = 1;
        adjMatrix[118][122] = 1;
        adjMatrix[118][123] = 1;
        adjMatrix[118][139] = 1;
        adjMatrix[118][150] = 1;
        adjMatrix[118][151] = 1;

        adjMatrix[119][98] = 1;
        adjMatrix[119][118] = 1;
        adjMatrix[119][120] = 1;
        adjMatrix[119][121] = 1;
        adjMatrix[119][122] = 1;
        adjMatrix[119][123] = 1;
        adjMatrix[119][151] = 1;
        adjMatrix[119][153] = 1;

        adjMatrix[120][83] = 1;
        adjMatrix[120][98] = 1;
        adjMatrix[120][99] = 1;
        adjMatrix[120][100] = 1;
        adjMatrix[120][118] = 1;
        adjMatrix[120][119] = 1;
        adjMatrix[120][121] = 1;
        adjMatrix[120][122] = 1;
        adjMatrix[120][123] = 1;

        adjMatrix[121][98] = 1;
        adjMatrix[121][118] = 1;
        adjMatrix[121][119] = 1;
        adjMatrix[121][120] = 1;
        adjMatrix[121][122] = 1;
        adjMatrix[121][123] = 1;
        adjMatrix[121][151] = 1;
        adjMatrix[121][153] = 1;

        adjMatrix[122][98] = 1;
        adjMatrix[122][100] = 1;
        adjMatrix[122][118] = 1;
        adjMatrix[122][119] = 1;
        adjMatrix[122][120] = 1;
        adjMatrix[122][121] = 1;
        adjMatrix[122][123] = 1;
        adjMatrix[122][124] = 1;
        adjMatrix[122][125] = 1;
        adjMatrix[122][140] = 1;
        adjMatrix[122][141] = 1;
        adjMatrix[122][155] = 1;
        adjMatrix[122][170] = 1;

        adjMatrix[123][98] = 1;
        adjMatrix[123][100] = 1;
        adjMatrix[123][118] = 1;
        adjMatrix[123][119] = 1;
        adjMatrix[123][120] = 1;
        adjMatrix[123][121] = 1;
        adjMatrix[123][122] = 1;
        adjMatrix[123][124] = 1;
        adjMatrix[123][125] = 1;
        adjMatrix[123][140] = 1;
        adjMatrix[123][141] = 1;
        adjMatrix[123][155] = 1;
        adjMatrix[123][170] = 1;

        adjMatrix[124][85] = 1;
        adjMatrix[124][100] = 1;
        adjMatrix[124][101] = 1;
        adjMatrix[124][122] = 1;
        adjMatrix[124][123] = 1;
        adjMatrix[124][125] = 1;
        adjMatrix[124][126] = 1;
        adjMatrix[124][140] = 1;
        adjMatrix[124][141] = 1;
        adjMatrix[124][155] = 1;
        adjMatrix[124][170] = 1;

        adjMatrix[125][100] = 1;
        adjMatrix[125][101] = 1;
        adjMatrix[125][102] = 1;
        adjMatrix[125][122] = 1;
        adjMatrix[125][123] = 1;
        adjMatrix[125][124] = 1;
        adjMatrix[125][126] = 1;
        adjMatrix[125][127] = 1;
        adjMatrix[125][140] = 1;
        adjMatrix[125][141] = 1;
        adjMatrix[125][142] = 1;
        adjMatrix[125][143] = 1;
        adjMatrix[125][155] = 1;
        adjMatrix[125][156] = 1;
        adjMatrix[125][170] = 1;

        adjMatrix[126][85] = 1;
        adjMatrix[126][101] = 1;
        adjMatrix[126][102] = 1;
        adjMatrix[126][124] = 1;
        adjMatrix[126][125] = 1;
        adjMatrix[126][127] = 1;
        adjMatrix[126][142] = 1;
        adjMatrix[126][143] = 1;
        adjMatrix[126][156] = 1;

        adjMatrix[127][69] = 1;
        adjMatrix[127][101] = 1;
        adjMatrix[127][102] = 1;
        adjMatrix[127][103] = 1;
        adjMatrix[127][125] = 1;
        adjMatrix[127][126] = 1;
        adjMatrix[127][128] = 1;
        adjMatrix[127][142] = 1;
        adjMatrix[127][143] = 1;
        adjMatrix[127][156] = 1;

        adjMatrix[128][103] = 1;
        adjMatrix[128][127] = 1;
        adjMatrix[128][143] = 1;
        adjMatrix[128][144] = 1;
        adjMatrix[128][159] = 1;

        adjMatrix[129][87] = 1;
        adjMatrix[129][104] = 1;
        adjMatrix[129][144] = 1;
        adjMatrix[129][145] = 1;
        adjMatrix[129][159] = 1;
        adjMatrix[129][160] = 1;
        adjMatrix[129][173] = 1;

        adjMatrix[130][88] = 1;
        adjMatrix[130][104] = 1;
        adjMatrix[130][105] = 1;
        adjMatrix[130][131] = 1;
        adjMatrix[130][145] = 1;
        adjMatrix[130][146] = 1;
        adjMatrix[130][161] = 1;

        adjMatrix[131][106] = 1;
        adjMatrix[131][108] = 1;
        adjMatrix[131][130] = 1;
        adjMatrix[131][132] = 1;
        adjMatrix[131][133] = 1;
        adjMatrix[131][134] = 1;
        adjMatrix[131][145] = 1;
        adjMatrix[131][146] = 1;
        adjMatrix[131][161] = 1;

        adjMatrix[132][92] = 1;
        adjMatrix[132][106] = 1;
        adjMatrix[132][107] = 1;
        adjMatrix[132][108] = 1;
        adjMatrix[132][109] = 1;
        adjMatrix[132][110] = 1;
        adjMatrix[132][131] = 1;
        adjMatrix[132][133] = 1;
        adjMatrix[132][134] = 1;

        adjMatrix[133][106] = 1;
        adjMatrix[133][108] = 1;
        adjMatrix[133][131] = 1;
        adjMatrix[133][132] = 1;
        adjMatrix[133][134] = 1;
        adjMatrix[133][146] = 1;
        adjMatrix[133][147] = 1;

        adjMatrix[134][106] = 1;
        adjMatrix[134][108] = 1;
        adjMatrix[134][111] = 1;
        adjMatrix[134][131] = 1;
        adjMatrix[134][132] = 1;
        adjMatrix[134][133] = 1;
        adjMatrix[134][147] = 1;

        adjMatrix[135][112] = 1;
        adjMatrix[135][113] = 1;
        adjMatrix[135][114] = 1;
        adjMatrix[135][136] = 1;
        adjMatrix[135][137] = 1;
        adjMatrix[135][138] = 1;
        adjMatrix[135][148] = 1;

        adjMatrix[136][113] = 1;
        adjMatrix[136][114] = 1;
        adjMatrix[136][135] = 1;
        adjMatrix[136][137] = 1;
        adjMatrix[136][138] = 1;
        adjMatrix[136][139] = 1;
        adjMatrix[136][148] = 1;
        adjMatrix[136][149] = 1;
        adjMatrix[136][163] = 1;
        adjMatrix[136][164] = 1;
        adjMatrix[136][174] = 1;

        adjMatrix[137][113] = 1;
        adjMatrix[137][114] = 1;
        adjMatrix[137][115] = 1;
        adjMatrix[137][135] = 1;
        adjMatrix[137][136] = 1;
        adjMatrix[137][138] = 1;
        adjMatrix[137][148] = 1;

        adjMatrix[138][113] = 1;
        adjMatrix[138][114] = 1;
        adjMatrix[138][135] = 1;
        adjMatrix[138][136] = 1;
        adjMatrix[138][137] = 1;
        adjMatrix[138][139] = 1;
        adjMatrix[138][148] = 1;
        adjMatrix[138][149] = 1;
        adjMatrix[138][163] = 1;
        adjMatrix[138][164] = 1;
        adjMatrix[138][174] = 1;

        adjMatrix[139][116] = 1;
        adjMatrix[139][117] = 1;
        adjMatrix[139][118] = 1;
        adjMatrix[139][136] = 1;
        adjMatrix[139][138] = 1;
        adjMatrix[139][149] = 1;
        adjMatrix[139][150] = 1;
        adjMatrix[139][151] = 1;
        adjMatrix[139][163] = 1;
        adjMatrix[139][164] = 1;
        adjMatrix[139][174] = 1;

        adjMatrix[140][100] = 1;
        adjMatrix[140][122] = 1;
        adjMatrix[140][123] = 1;
        adjMatrix[140][124] = 1;
        adjMatrix[140][125] = 1;
        adjMatrix[140][141] = 1;
        adjMatrix[140][152] = 1;
        adjMatrix[140][153] = 1;
        adjMatrix[140][154] = 1;
        adjMatrix[140][155] = 1;
        adjMatrix[140][168] = 1;
        adjMatrix[140][170] = 1;
        adjMatrix[140][180] = 1;

        adjMatrix[141][100] = 1;
        adjMatrix[141][122] = 1;
        adjMatrix[141][123] = 1;
        adjMatrix[141][124] = 1;
        adjMatrix[141][125] = 1;
        adjMatrix[141][140] = 1;
        adjMatrix[141][155] = 1;
        adjMatrix[141][170] = 1;

        adjMatrix[142][101] = 1;
        adjMatrix[142][102] = 1;
        adjMatrix[142][125] = 1;
        adjMatrix[142][126] = 1;
        adjMatrix[142][127] = 1;
        adjMatrix[142][143] = 1;
        adjMatrix[142][156] = 1;
        adjMatrix[142][158] = 1;

        adjMatrix[143][101] = 1;
        adjMatrix[143][102] = 1;
        adjMatrix[143][125] = 1;
        adjMatrix[143][126] = 1;
        adjMatrix[143][127] = 1;
        adjMatrix[143][128] = 1;
        adjMatrix[143][142] = 1;
        adjMatrix[143][144] = 1;
        adjMatrix[143][156] = 1;
        adjMatrix[143][158] = 1;
        adjMatrix[143][159] = 1;

        adjMatrix[144][128] = 1;
        adjMatrix[144][129] = 1;
        adjMatrix[144][143] = 1;
        adjMatrix[144][145] = 1;
        adjMatrix[144][159] = 1;
        adjMatrix[144][160] = 1;
        adjMatrix[144][173] = 1;

        adjMatrix[145][104] = 1;
        adjMatrix[145][129] = 1;
        adjMatrix[145][130] = 1;
        adjMatrix[145][131] = 1;
        adjMatrix[145][144] = 1;
        adjMatrix[145][146] = 1;
        adjMatrix[145][159] = 1;
        adjMatrix[145][160] = 1;
        adjMatrix[145][161] = 1;

        adjMatrix[146][130] = 1;
        adjMatrix[146][131] = 1;
        adjMatrix[146][133] = 1;
        adjMatrix[146][145] = 1;
        adjMatrix[146][147] = 1;
        adjMatrix[146][161] = 1;

        adjMatrix[147][111] = 1;
        adjMatrix[147][133] = 1;
        adjMatrix[147][134] = 1;
        adjMatrix[147][146] = 1;

        adjMatrix[148][112] = 1;
        adjMatrix[148][113] = 1;
        adjMatrix[148][114] = 1;
        adjMatrix[148][135] = 1;
        adjMatrix[148][136] = 1;
        adjMatrix[148][137] = 1;
        adjMatrix[148][138] = 1;
        adjMatrix[148][149] = 1;
        adjMatrix[148][162] = 1;
        adjMatrix[148][163] = 1;

        adjMatrix[149][136] = 1;
        adjMatrix[149][138] = 1;
        adjMatrix[149][139] = 1;
        adjMatrix[149][148] = 1;
        adjMatrix[149][162] = 1;
        adjMatrix[149][163] = 1;
        adjMatrix[149][164] = 1;
        adjMatrix[149][174] = 1;

        adjMatrix[150][116] = 1;
        adjMatrix[150][117] = 1;
        adjMatrix[150][118] = 1;
        adjMatrix[150][139] = 1;
        adjMatrix[150][151] = 1;
        adjMatrix[150][166] = 1;
        adjMatrix[150][176] = 1;

        adjMatrix[151][116] = 1;
        adjMatrix[151][117] = 1;
        adjMatrix[151][118] = 1;
        adjMatrix[151][119] = 1;
        adjMatrix[151][121] = 1;
        adjMatrix[151][139] = 1;
        adjMatrix[151][150] = 1;
        adjMatrix[151][153] = 1;
        adjMatrix[151][166] = 1;
        adjMatrix[151][176] = 1;

        adjMatrix[152][140] = 1;
        adjMatrix[152][153] = 1;
        adjMatrix[152][154] = 1;
        adjMatrix[152][165] = 1;
        adjMatrix[152][166] = 1;
        adjMatrix[152][167] = 1;
        adjMatrix[152][168] = 1;
        adjMatrix[152][177] = 1;
        adjMatrix[152][178] = 1;
        adjMatrix[152][180] = 1;

        adjMatrix[153][119] = 1;
        adjMatrix[153][121] = 1;
        adjMatrix[153][140] = 1;
        adjMatrix[153][151] = 1;
        adjMatrix[153][152] = 1;
        adjMatrix[153][154] = 1;
        adjMatrix[153][168] = 1;
        adjMatrix[153][180] = 1;

        adjMatrix[154][140] = 1;
        adjMatrix[154][152] = 1;
        adjMatrix[154][153] = 1;
        adjMatrix[154][168] = 1;
        adjMatrix[154][169] = 1;
        adjMatrix[154][170] = 1;
        adjMatrix[154][180] = 1;

        adjMatrix[155][100] = 1;
        adjMatrix[155][122] = 1;
        adjMatrix[155][123] = 1;
        adjMatrix[155][124] = 1;
        adjMatrix[155][125] = 1;
        adjMatrix[155][140] = 1;
        adjMatrix[155][141] = 1;
        adjMatrix[155][170] = 1;
        adjMatrix[155][181] = 1;
        adjMatrix[155][182] = 1;

        adjMatrix[156][101] = 1;
        adjMatrix[156][102] = 1;
        adjMatrix[156][125] = 1;
        adjMatrix[156][126] = 1;
        adjMatrix[156][127] = 1;
        adjMatrix[156][142] = 1;
        adjMatrix[156][143] = 1;
        adjMatrix[156][157] = 1;
        adjMatrix[156][171] = 1;
        adjMatrix[156][183] = 1;

        adjMatrix[157][156] = 1;
        adjMatrix[157][158] = 1;
        adjMatrix[157][159] = 1;
        adjMatrix[157][171] = 1;
        adjMatrix[157][172] = 1;
        adjMatrix[157][183] = 1;
        adjMatrix[157][185] = 1;

        adjMatrix[158][142] = 1;
        adjMatrix[158][143] = 1;
        adjMatrix[158][157] = 1;
        adjMatrix[158][159] = 1;
        adjMatrix[158][171] = 1;
        adjMatrix[158][172] = 1;
        adjMatrix[158][183] = 1;
        adjMatrix[158][185] = 1;

        adjMatrix[159][128] = 1;
        adjMatrix[159][129] = 1;
        adjMatrix[159][143] = 1;
        adjMatrix[159][144] = 1;
        adjMatrix[159][145] = 1;
        adjMatrix[159][157] = 1;
        adjMatrix[159][158] = 1;
        adjMatrix[159][160] = 1;
        adjMatrix[159][171] = 1;
        adjMatrix[159][172] = 1;
        adjMatrix[159][173] = 1;
        adjMatrix[159][185] = 1;
        adjMatrix[159][187] = 1;
        adjMatrix[159][195] = 1;

        adjMatrix[160][129] = 1;
        adjMatrix[160][144] = 1;
        adjMatrix[160][145] = 1;
        adjMatrix[160][159] = 1;
        adjMatrix[160][161] = 1;
        adjMatrix[160][173] = 1;

        adjMatrix[161][130] = 1;
        adjMatrix[161][131] = 1;
        adjMatrix[161][145] = 1;
        adjMatrix[161][146] = 1;
        adjMatrix[161][160] = 1;

        adjMatrix[162][112] = 1;
        adjMatrix[162][135] = 1;
        adjMatrix[162][148] = 1;
        adjMatrix[162][149] = 1;
        adjMatrix[162][163] = 1;

        adjMatrix[163][136] = 1;
        adjMatrix[163][138] = 1;
        adjMatrix[163][139] = 1;
        adjMatrix[163][148] = 1;
        adjMatrix[163][149] = 1;
        adjMatrix[163][162] = 1;
        adjMatrix[163][164] = 1;
        adjMatrix[163][174] = 1;

        adjMatrix[164][136] = 1;
        adjMatrix[164][138] = 1;
        adjMatrix[164][139] = 1;
        adjMatrix[164][149] = 1;
        adjMatrix[164][163] = 1;
        adjMatrix[164][174] = 1;
        adjMatrix[164][175] = 1;
        adjMatrix[164][188] = 1;

        adjMatrix[165][152] = 1;
        adjMatrix[165][166] = 1;
        adjMatrix[165][167] = 1;
        adjMatrix[165][177] = 1;
        adjMatrix[165][178] = 1;
        adjMatrix[165][189] = 1;

        adjMatrix[166][150] = 1;
        adjMatrix[166][151] = 1;
        adjMatrix[166][152] = 1;
        adjMatrix[166][165] = 1;
        adjMatrix[166][167] = 1;
        adjMatrix[166][176] = 1;
        adjMatrix[166][177] = 1;
        adjMatrix[166][178] = 1;

        adjMatrix[167][152] = 1;
        adjMatrix[167][165] = 1;
        adjMatrix[167][166] = 1;
        adjMatrix[167][177] = 1;
        adjMatrix[167][178] = 1;
        adjMatrix[167][179] = 1;

        adjMatrix[168][140] = 1;
        adjMatrix[168][152] = 1;
        adjMatrix[168][153] = 1;
        adjMatrix[168][154] = 1;
        adjMatrix[168][169] = 1;
        adjMatrix[168][170] = 1;
        adjMatrix[168][180] = 1;

        adjMatrix[169][154] = 1;
        adjMatrix[169][168] = 1;
        adjMatrix[169][170] = 1;
        adjMatrix[169][180] = 1;
        adjMatrix[169][181] = 1;
        adjMatrix[169][191] = 1;

        adjMatrix[170][100] = 1;
        adjMatrix[170][122] = 1;
        adjMatrix[170][123] = 1;
        adjMatrix[170][124] = 1;
        adjMatrix[170][125] = 1;
        adjMatrix[170][140] = 1;
        adjMatrix[170][141] = 1;
        adjMatrix[170][154] = 1;
        adjMatrix[170][155] = 1;
        adjMatrix[170][168] = 1;
        adjMatrix[170][169] = 1;
        adjMatrix[170][181] = 1;
        adjMatrix[170][182] = 1;

        adjMatrix[171][156] = 1;
        adjMatrix[171][157] = 1;
        adjMatrix[171][158] = 1;
        adjMatrix[171][159] = 1;
        adjMatrix[171][172] = 1;
        adjMatrix[171][183] = 1;
        adjMatrix[171][185] = 1;

        adjMatrix[172][157] = 1;
        adjMatrix[172][158] = 1;
        adjMatrix[172][159] = 1;
        adjMatrix[172][171] = 1;
        adjMatrix[172][173] = 1;
        adjMatrix[172][183] = 1;
        adjMatrix[172][185] = 1;
        adjMatrix[172][187] = 1;
        adjMatrix[172][195] = 1;

        adjMatrix[173][129] = 1;
        adjMatrix[173][144] = 1;
        adjMatrix[173][145] = 1;
        adjMatrix[173][159] = 1;
        adjMatrix[173][160] = 1;
        adjMatrix[173][172] = 1;
        adjMatrix[173][185] = 1;
        adjMatrix[173][187] = 1;
        adjMatrix[173][195] = 1;

        adjMatrix[174][136] = 1;
        adjMatrix[174][138] = 1;
        adjMatrix[174][139] = 1;
        adjMatrix[174][149] = 1;
        adjMatrix[174][163] = 1;
        adjMatrix[174][164] = 1;
        adjMatrix[174][175] = 1;
        adjMatrix[174][188] = 1;

        adjMatrix[175][164] = 1;
        adjMatrix[175][174] = 1;
        adjMatrix[175][176] = 1;
        adjMatrix[175][188] = 1;
        adjMatrix[175][190] = 1;

        adjMatrix[176][150] = 1;
        adjMatrix[176][151] = 1;
        adjMatrix[176][166] = 1;
        adjMatrix[176][175] = 1;
        adjMatrix[176][188] = 1;
        adjMatrix[176][190] = 1;

        adjMatrix[177][152] = 1;
        adjMatrix[177][165] = 1;
        adjMatrix[177][166] = 1;
        adjMatrix[177][167] = 1;
        adjMatrix[177][178] = 1;
        adjMatrix[177][189] = 1;

        adjMatrix[178][152] = 1;
        adjMatrix[178][165] = 1;
        adjMatrix[178][166] = 1;
        adjMatrix[178][167] = 1;
        adjMatrix[178][177] = 1;
        adjMatrix[178][179] = 1;
        adjMatrix[178][189] = 1;
        adjMatrix[178][190] = 1;
        adjMatrix[178][191] = 1;

        adjMatrix[179][167] = 1;
        adjMatrix[179][178] = 1;
        adjMatrix[179][189] = 1;
        adjMatrix[179][190] = 1;
        adjMatrix[179][191] = 1;

        adjMatrix[180][140] = 1;
        adjMatrix[180][152] = 1;
        adjMatrix[180][153] = 1;
        adjMatrix[180][154] = 1;
        adjMatrix[180][168] = 1;
        adjMatrix[180][169] = 1;
        adjMatrix[180][181] = 1;
        adjMatrix[180][191] = 1;

        adjMatrix[181][155] = 1;
        adjMatrix[181][169] = 1;
        adjMatrix[181][170] = 1;
        adjMatrix[181][180] = 1;
        adjMatrix[181][182] = 1;
        adjMatrix[181][191] = 1;

        adjMatrix[182][155] = 1;
        adjMatrix[182][170] = 1;
        adjMatrix[182][181] = 1;
        adjMatrix[182][183] = 1;
        adjMatrix[182][192] = 1;

        adjMatrix[183][156] = 1;
        adjMatrix[183][157] = 1;
        adjMatrix[183][158] = 1;
        adjMatrix[183][159] = 1;
        adjMatrix[183][171] = 1;
        adjMatrix[183][172] = 1;
        adjMatrix[183][182] = 1;
        adjMatrix[183][184] = 1;
        adjMatrix[183][185] = 1;
        adjMatrix[183][186] = 1;
        adjMatrix[183][192] = 1;
        adjMatrix[183][193] = 1;

        adjMatrix[184][183] = 1;
        adjMatrix[184][185] = 1;
        adjMatrix[184][186] = 1;
        adjMatrix[184][192] = 1;
        adjMatrix[184][193] = 1;
        adjMatrix[184][194] = 1;

        adjMatrix[185][157] = 1;
        adjMatrix[185][158] = 1;
        adjMatrix[185][159] = 1;
        adjMatrix[185][171] = 1;
        adjMatrix[185][172] = 1;
        adjMatrix[185][173] = 1;
        adjMatrix[185][183] = 1;
        adjMatrix[185][184] = 1;
        adjMatrix[185][186] = 1;
        adjMatrix[185][187] = 1;
        adjMatrix[185][193] = 1;
        adjMatrix[185][195] = 1;

        adjMatrix[186][183] = 1;
        adjMatrix[186][184] = 1;
        adjMatrix[186][185] = 1;
        adjMatrix[186][187] = 1;
        adjMatrix[186][193] = 1;
        adjMatrix[186][194] = 1;
        adjMatrix[186][195] = 1;

        adjMatrix[187][159] = 1;
        adjMatrix[187][172] = 1;
        adjMatrix[187][173] = 1;
        adjMatrix[187][185] = 1;
        adjMatrix[187][186] = 1;
        adjMatrix[187][193] = 1;
        adjMatrix[187][194] = 1;
        adjMatrix[187][195] = 1;

        adjMatrix[188][164] = 1;
        adjMatrix[188][174] = 1;
        adjMatrix[188][175] = 1;
        adjMatrix[188][176] = 1;
        adjMatrix[188][190] = 1;

        adjMatrix[189][165] = 1;
        adjMatrix[189][177] = 1;
        adjMatrix[189][178] = 1;
        adjMatrix[189][179] = 1;
        adjMatrix[189][190] = 1;
        adjMatrix[189][191] = 1;

        adjMatrix[190][175] = 1;
        adjMatrix[190][176] = 1;
        adjMatrix[190][178] = 1;
        adjMatrix[190][179] = 1;
        adjMatrix[190][188] = 1;
        adjMatrix[190][189] = 1;
        adjMatrix[190][191] = 1;

        adjMatrix[191][169] = 1;
        adjMatrix[191][178] = 1;
        adjMatrix[191][179] = 1;
        adjMatrix[191][180] = 1;
        adjMatrix[191][181] = 1;
        adjMatrix[191][189] = 1;
        adjMatrix[191][190] = 1;

        adjMatrix[192][182] = 1;
        adjMatrix[192][183] = 1;
        adjMatrix[192][184] = 1;
        adjMatrix[192][193] = 1;
        adjMatrix[192][194] = 1;

        adjMatrix[193][183] = 1;
        adjMatrix[193][184] = 1;
        adjMatrix[193][185] = 1;
        adjMatrix[193][186] = 1;
        adjMatrix[193][187] = 1;
        adjMatrix[193][192] = 1;
        adjMatrix[193][194] = 1;
        adjMatrix[193][195] = 1;

        adjMatrix[194][184] = 1;
        adjMatrix[194][186] = 1;
        adjMatrix[194][187] = 1;
        adjMatrix[194][192] = 1;
        adjMatrix[194][193] = 1;
        adjMatrix[194][195] = 1;

        adjMatrix[195][159] = 1;
        adjMatrix[195][172] = 1;
        adjMatrix[195][173] = 1;
        adjMatrix[195][185] = 1;
        adjMatrix[195][186] = 1;
        adjMatrix[195][187] = 1;
        adjMatrix[195][193] = 1;
        adjMatrix[195][194] = 1;
    }

    private void findPath(int startNode, int endNode, StringBuilder recommendedPath) {
        LinkedList<Integer> startNodeToVisit = new LinkedList<Integer>();
        LinkedList<Integer> startNodeVisited = new LinkedList<Integer>();
        LinkedList<Integer> endNodeToVisit = new LinkedList<Integer>();
        LinkedList<Integer> endNodeVisited = new LinkedList<Integer>();
        LinkedList<Integer> finalPath = new LinkedList<Integer>();

        // Set the start and end points for path finding.
        int currentStartNode = startNode;
        int currentEndNode = endNode;

        // This is a breadth first search that create two linked lists,
        // one for where Jack currently is, and the other for where
        // Jack aims to arrive. The currentNodes, declared above, are used
        // to create the linked lists that track nodes that have and have
        // not been visited. This function will terminate when both paths
        // meet in a middle.

        while (currentStartNode != currentEndNode) {
            // iterate over the adjacency matrix
            for (columns = 1; columns < size; columns++) {
                // check the adjacency matrix to see if a node connects to
                // another node, and that the node has not been visited before
                if (adjMatrix[currentStartNode][columns] == 1) {
                    if (!(startNodeVisited.contains(columns))) {
                        startNodeToVisit.add(columns);
                    }
                }
                // add current node to visited nodes, and move current node
                // to the first node in the nodes to visit.
                startNodeVisited.add(currentStartNode);
                currentStartNode = startNodeToVisit.pop();

                // check if Jack can move to that spot, and.....
                if (adjMatrix[currentEndNode][columns] == 1) {
                    // that Jack hasn't moved there previously
                    if (!endNodeVisited.contains(columns)) {
                        startNodeToVisit.add(columns);
                    }
                }
                endNodeVisited.add(currentStartNode);
                currentEndNode = endNodeToVisit.pop();
            }
        }

        // build the final path. The .peek() method returns null
        // if the visited linked list is empty.
        while (startNodeVisited.peek() != null) {
            finalPath.add(startNodeVisited.pop());
        }

        while (endNodeVisited.peek() != null) {
            finalPath.add(endNodeVisited.pop());
        }

        // build the string to print out at the end by adding
        // the nodes to the recommendedPath string
        while (finalPath.peek() != null) {
            recommendedPath.append(finalPath.pop());
            recommendedPath.append(" ");
        }
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        StringBuilder recommendedPath = new StringBuilder();
        recommendedPath.append("Recommended path is: ");

        System.out.println("What position is Jack on? ");
        int startingNode = sc.nextInt();
        System.out.println("Where is Jack's hideaway? ");
        int endNode = sc.nextInt();

        lettersFromWhiteChapel saucyJack = new lettersFromWhiteChapel();

        saucyJack.findPath(startingNode, endNode, recommendedPath);
        System.out.println(recommendedPath);
    }
}