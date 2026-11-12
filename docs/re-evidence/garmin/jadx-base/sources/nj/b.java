package nj;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes7.dex */
public class b extends e<Bitmap> {
    public b(ImageView imageView) {
        super(imageView);
    }

    @Override // nj.e
    public final void d(Bitmap bitmap) {
        ((ImageView) this.f126225b).setImageBitmap(bitmap);
    }

    @Deprecated
    public b(ImageView imageView, boolean z14) {
        super(imageView, z14);
    }
}
