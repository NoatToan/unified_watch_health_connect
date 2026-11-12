package defpackage;

import android.opengl.GLES20;
import androidx.work.Data;

/* JADX INFO: loaded from: classes10.dex */
public class goa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19183a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19184b = 0;
    public int c = 0;
    public int d = 0;

    public boolean a() {
        if (this.d == 0) {
            this.d = b(this.f19183a, this.f19184b, 6408);
        }
        GLES20.glBindFramebuffer(36160, this.c);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.d, 0);
        return true;
    }

    public final int b(int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i4 = iArr[0];
        if (i4 == 0) {
            throw new RuntimeException("Could not create a new texture buffer object, glErrorString : " + GLES20.glGetString(GLES20.glGetError()));
        }
        GLES20.glBindTexture(3553, i4);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, Data.MAX_DATA_BYTES, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, i3, 5121, null);
        return iArr[0];
    }

    public void c() {
        GLES20.glBindFramebuffer(36160, 0);
    }

    public int d() {
        return this.d;
    }

    public void e(int i, int i2) {
        this.f19183a = i;
        this.f19184b = i2;
        c();
        f();
        g(i, i2);
    }

    public void f() {
        this.f19183a = 0;
        this.f19184b = 0;
        GLES20.glDeleteFramebuffers(1, new int[]{this.c}, 0);
        GLES20.glDeleteTextures(1, new int[]{this.d}, 0);
        this.c = 0;
        this.d = 0;
    }

    public boolean g(int i, int i2) {
        this.f19183a = i;
        this.f19184b = i2;
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int i3 = iArr[0];
        if (i3 != 0) {
            this.c = i3;
            return true;
        }
        throw new RuntimeException("Could not create a new frame buffer object, glErrorString : " + GLES20.glGetString(GLES20.glGetError()));
    }
}
