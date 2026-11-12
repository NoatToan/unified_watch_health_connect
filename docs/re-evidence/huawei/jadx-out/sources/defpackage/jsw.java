package defpackage;

import android.content.Context;
import android.opengl.GLES20;

/* JADX INFO: loaded from: classes10.dex */
public class jsw extends jsv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int[] f38990c;
    protected int[] d;

    public jsw(Context context, int i, int i2) {
        super(context, i, i2);
    }

    @Override // defpackage.jsv
    protected void e() {
        this.h.clear();
        this.h.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    @Override // defpackage.jsv
    public void e(int i, int i2, int i3, int i4) {
        super.e(i, i2, i3, i4);
        d();
    }

    private void d() {
        if (this.f38990c != null) {
            c();
        }
        int[] iArr = new int[1];
        this.f38990c = iArr;
        GLES20.glGenFramebuffers(1, iArr, 0);
        int[] iArr2 = new int[1];
        this.d = iArr2;
        jsz.a(iArr2);
        GLES20.glBindTexture(3553, this.d[0]);
        GLES20.glTexImage2D(3553, 0, 6408, this.j, this.i, 0, 6408, 5121, null);
        GLES20.glBindFramebuffer(36160, this.f38990c[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.d[0], 0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    public void c() {
        int[] iArr = this.d;
        if (iArr != null) {
            GLES20.glDeleteTextures(1, iArr, 0);
            this.d = null;
        }
        int[] iArr2 = this.f38990c;
        if (iArr2 != null) {
            GLES20.glDeleteFramebuffers(1, iArr2, 0);
            this.f38990c = null;
        }
    }
}
