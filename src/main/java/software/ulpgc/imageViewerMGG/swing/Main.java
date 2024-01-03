package software.ulpgc.imageViewerMGG.swing;

import software.ulpgc.imageViewerMGG.interfaces.Image;
import software.ulpgc.imageViewerMGG.model.ImagePresenter;
import software.ulpgc.imageViewerMGG.mocks.MockImageLoader;

public class Main {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        ImagePresenter presenter = new ImagePresenter(frame.getImageDisplay());
        presenter.show(image());
        frame.setVisible(true);
    }

    private static Image image() {
        return new MockImageLoader().load();
    }
}
