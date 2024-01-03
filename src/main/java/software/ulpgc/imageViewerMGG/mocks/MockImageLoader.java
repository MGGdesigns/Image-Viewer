package software.ulpgc.imageViewerMGG.mocks;

import software.ulpgc.imageViewerMGG.interfaces.Image;
import software.ulpgc.imageViewerMGG.interfaces.ImageLoader;

public class MockImageLoader implements ImageLoader {
    private final String[] ids = new String[] {"1.jpg","2.jpg","3.jpg", "4.jpg"};
    @Override
    public Image load() {
        return imageAt(0);
    }

    private Image imageAt(int i) {
        return new Image() {
            @Override
            public String id() {
                return ids[i];
            }

            @Override
            public Image next() {
                return imageAt((i + 1) % ids.length);
            }

            @Override
            public Image prev() {
                return imageAt(i > 0 ? i -1 : ids.length-1);
            }
        };
    }
}
