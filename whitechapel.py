def getStart():
	print("Where is Jack starting from?")
	startNode = int(input())
	return startNode
	
def getEnd():
	print("Where is Jack going to?")
	endNode  = int(input())
	return endNode
	
def pathSearch():
	from LfWmap import mapWhitechapel as ripperMap
	sNodePath=[]
	sNodeVisited=[]
	sNodeToVisit=[]
	eNodePath=[]
	eNodeVisited=[]
	eNodeToVisit=[]
	finalPath=[]
	sNode=getStart()
	currentSNode=sNode
	sNodeVisited.append(currentSNode)
	eNode=getEnd()
	currentENode=eNode
	eNodeVisited.append(currentENode)
	while (currentSNode != currentENode):
		for node in ripperMap[currentSNode]:
			if node not in sNodeVisited:
				sNodeToVisit.append(node)
		sNodeVisited.append(currentSNode)
		currentSNode=sNodeToVisit.pop(0)
		for node in ripperMap[currentENode]:
			if node not in eNodeVisited:
				eNodeToVisit.append(node)
		eNodeVisited.append(currentENode)
		currenteNode=eNodeToVisit.pop(0)
	eNodeVisited.append(currentENode)
	eNodeVisited=eNodeVisited.reverse()
	for node in sNodeVisited:
			finalPath.append(node)
	for number in eNodeVisited:
			finalPath.append(number)
	recPath="Recommended path for Jack is:"
	for node in finalPath:
		recPath = recPath + " "
		recPath = recPath + node
	print(recPath)
