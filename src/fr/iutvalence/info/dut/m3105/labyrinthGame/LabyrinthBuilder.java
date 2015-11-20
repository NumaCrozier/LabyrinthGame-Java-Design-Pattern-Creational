package fr.iutvalence.info.dut.m3105.labyrinthGame;

public class LabyrinthBuilder {

	private int width;

	private int height;

	private Position exitPosition;

	public void setHeight(int height)
	{
		
	}
	
	public void setWidth(int width)
	{
		
	}
	
	public void setExitPosition(Position position)
	{
		
	}
	
	public void addForbiddenCellPos(Position position)
	{
		
	}
	
	public void getLabyrinth(int width, int height, Position exitPosition, Position positions)
	{
		Labyrinth labyrinth = new Labyrinth(width,height,positions,exitPosition);
	}
}
