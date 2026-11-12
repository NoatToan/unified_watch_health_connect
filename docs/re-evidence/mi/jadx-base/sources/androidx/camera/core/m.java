package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.RequiresApi;
import defpackage.q4d;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface m extends AutoCloseable {

    public interface a {
        int a();

        int b();

        ByteBuffer getBuffer();
    }

    q4d H();

    void a0(Rect rect);

    @Override // java.lang.AutoCloseable
    void close();

    int getFormat();

    int getHeight();

    int getWidth();

    Rect k0();

    Image p0();

    @SuppressLint({"ArrayReturn"})
    a[] x();
}
