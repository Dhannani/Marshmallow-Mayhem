package application;

import javafx.scene.shape.*;
import java.util.ArrayList;
import javafx.scene.*;
import javafx.scene.paint.*;

public class Wall extends RectangleComponent
{
	Group wallGroup;
	//Rectangle newWall;
	static ArrayList<Wall> wallsArray = new ArrayList<Wall>();
	
	public Wall( Group g, double x, double y, double width, double height )
	{
		wallGroup = g;
		component = new Rectangle();
		component.setFill( Color.MAROON );
		component.setWidth( width );
		component.setHeight( height );
		component.setTranslateX( x );
		component.setTranslateY( y );
		g.getChildren().add( component );
		wallsArray.add( 0, this );
	}
	
	public static ArrayList<Wall> getWall()
	{
		return wallsArray;
	}
	
	public void breakWall(Wall w)
	{
		wallGroup.getChildren().remove( component );
		wallsArray.remove(this);
	}
	
	public static void reset()
	{
		wallsArray.clear();
	}
}