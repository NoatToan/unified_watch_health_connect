package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public class c6d {
    public <Z> lxq<ImageView, Z> a(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new up2(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new n47(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
