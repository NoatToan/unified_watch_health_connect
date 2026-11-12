package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.Image;
import androidx.camera.core.internal.utils.ImageUtil;
import b0.m0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface e extends AutoCloseable {

    public interface a {
        ByteBuffer d();

        int e();

        int f();
    }

    m0 A0();

    @SuppressLint({"ArrayReturn"})
    a[] A2();

    default Bitmap C0() {
        return ImageUtil.a(this);
    }

    int getFormat();

    int getHeight();

    Image getImage();

    int getWidth();
}
