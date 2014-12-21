package technologyOfProgramming.zvenigorodskyTask.ui.graphic.components;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.gui.AbstractComponent;
import org.newdawn.slick.gui.GUIContext;

import technologyOfProgramming.zvenigorodskyTask.util.ResourceProvider;
import technologyOfProgramming.zvenigorodskyTask.util.ResourceProvider;

public class FieldCellRenderer extends AbstractComponent {
	
	private int x,y,width,height;
	private Image image;
	public FieldCellRenderer(GUIContext container,int width, int heigth) throws SlickException {
		super(container);
		image = new Image(ResourceProvider.getResInpStr(ResourceProvider.EMPTY_CELL_ID),
				ResourceProvider.EMPTY_CELL_ID,false);
		this.width = width;
		this.height = width;
//		image = image.
	}
	
	@Override
	public void render(GUIContext container, Graphics g) throws SlickException {
//		g.scale(width, height);
//		g.drawImage(image, x, y);
		image.draw(x, y, width, height);

	}

	@Override
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

}
