package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.work.Data;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public class ova {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f29724b = null;
    public Executor c;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES20.glDeleteTextures(1, new int[]{ova.this.f29723a}, 0);
        }
    }

    public ova(Executor executor) {
        this.c = executor;
        e();
    }

    public int b(int i) {
        GLES20.glActiveTexture(33984 + i);
        GLES20.glBindTexture(3553, this.f29723a);
        return i;
    }

    public void c() {
        GLES20.glBindTexture(3553, this.f29723a);
    }

    public int d() {
        return this.f29723a;
    }

    public final void e() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.f29723a = i;
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, Data.MAX_DATA_BYTES, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    public void f(Bitmap bitmap) {
        if (bitmap != this.f29724b) {
            this.f29724b = bitmap;
            c();
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        this.f29724b = null;
        this.c.execute(new a());
    }

    public void g() {
        f(Bitmap.createBitmap(2, 2, Bitmap.Config.ARGB_8888));
    }

    public void h(int i, int i2) {
        c();
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
    }
}
