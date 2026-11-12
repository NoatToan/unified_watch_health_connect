package nj;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes7.dex */
public class d extends e<Drawable> {
    public d(ImageView imageView) {
        super(imageView);
    }

    @Override // nj.e
    public final void d(Drawable drawable) {
        ((ImageView) this.f126225b).setImageDrawable(drawable);
    }

    @Deprecated
    public d(ImageView imageView, boolean z14) {
        super(imageView, z14);
    }
}
