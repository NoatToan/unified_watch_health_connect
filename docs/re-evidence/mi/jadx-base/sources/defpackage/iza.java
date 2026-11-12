package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public final class iza implements jza.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cq2 f22251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nj1 f22252b;

    public iza(cq2 cq2Var, nj1 nj1Var) {
        this.f22251a = cq2Var;
        this.f22252b = nj1Var;
    }

    @Override // jza.a
    public byte[] a(int i) {
        nj1 nj1Var = this.f22252b;
        return nj1Var == null ? new byte[i] : (byte[]) nj1Var.a(i, byte[].class);
    }

    @Override // jza.a
    public Bitmap b(int i, int i2, Bitmap.Config config) {
        return this.f22251a.c(i, i2, config);
    }

    @Override // jza.a
    public void c(Bitmap bitmap) {
        this.f22251a.a(bitmap);
    }

    @Override // jza.a
    public int[] d(int i) {
        nj1 nj1Var = this.f22252b;
        return nj1Var == null ? new int[i] : (int[]) nj1Var.a(i, int[].class);
    }

    @Override // jza.a
    public void e(byte[] bArr) {
        nj1 nj1Var = this.f22252b;
        if (nj1Var == null) {
            return;
        }
        nj1Var.put(bArr);
    }

    @Override // jza.a
    public void f(int[] iArr) {
        nj1 nj1Var = this.f22252b;
        if (nj1Var == null) {
            return;
        }
        nj1Var.put(iArr);
    }
}
