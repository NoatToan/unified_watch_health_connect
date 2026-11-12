package defpackage;

import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes7.dex */
public class tc1 {
    public static void a(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        b(imageView);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(1000L);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setRepeatCount(-1);
        imageView.setAnimation(rotateAnimation);
        imageView.startAnimation(rotateAnimation);
    }

    public static void b(ImageView imageView) {
        RotateAnimation rotateAnimation;
        if (imageView == null || (rotateAnimation = (RotateAnimation) imageView.getAnimation()) == null) {
            return;
        }
        rotateAnimation.cancel();
        imageView.setAnimation(null);
    }
}
