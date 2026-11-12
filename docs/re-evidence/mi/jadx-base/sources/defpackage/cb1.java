package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public abstract class cb1 {
    Animatable2.AnimationCallback mPlatformCallback;

    public class a extends Animatable2.AnimationCallback {
        public a() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            cb1.this.onAnimationEnd(drawable);
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            cb1.this.onAnimationStart(drawable);
        }
    }

    @RequiresApi(23)
    public Animatable2.AnimationCallback getPlatformCallback() {
        if (this.mPlatformCallback == null) {
            this.mPlatformCallback = new a();
        }
        return this.mPlatformCallback;
    }

    public void onAnimationEnd(Drawable drawable) {
    }

    public void onAnimationStart(Drawable drawable) {
    }
}
