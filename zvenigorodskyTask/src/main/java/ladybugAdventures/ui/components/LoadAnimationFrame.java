package ladybugAdventures.ui.components;

import ladybugAdventures.util.ResourceProvider;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class LoadAnimationFrame {
    private final static Shell shell = new Shell(Display.getDefault(),SWT.ON_TOP);
    private static Image image;
    public void show(){
    	image = new Image(shell.getDisplay(),ResourceProvider.getResInpStr(ResourceProvider.LOAD_ICON_ID));
        shell.setSize(200,100);
        Rectangle splashRect = shell.getBounds();
        Rectangle displayRect = Display.getDefault().getBounds();
        int x = (displayRect.width - splashRect.width) / 2;
        int y = (displayRect.height - splashRect.height) / 2;
        shell.setLocation(x, y);
//        final ProgressBar bar = new ProgressBar(splash, SWT.NONE);
//        bar.setMaximum(SPLASH_MAX);
 
        Label label = new Label(shell, SWT.NONE);
        label.setImage(image);
 
        FormLayout layout = new FormLayout();
        shell.setLayout(layout);
 
        FormData labelData = new FormData();
        labelData.right = new FormAttachment(100, 0);
        labelData.bottom = new FormAttachment(100, 0);
        label.setLayoutData(labelData);
 
//        FormData progressData = new FormData();
//        progressData.left = new FormAttachment(0, -5);
//        progressData.right = new FormAttachment(100, 0);
//        progressData.bottom = new FormAttachment(100, 0);
//        bar.setLayoutData(progressData);
//        splash.pack();
 
        
        try{
			try {
				shell.open();
				shell.layout();
				while (!shell.isDisposed()) {
					if (!shell.getDisplay().readAndDispatch()) {
						shell.getDisplay().sleep();
					}
				}
			} finally {
				if (!shell.isDisposed()) {
					shell.dispose();
				}
			}
		}
		finally{
			shell.getDisplay().dispose();
			
		}
    }
    public void closeLoading(){
    	shell.close();
    	shell.dispose();
    }
	public static void main(String[] args) {
		new LoadAnimationFrame().show();

	}

}
