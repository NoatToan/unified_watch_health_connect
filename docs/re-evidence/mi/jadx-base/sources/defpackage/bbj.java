package defpackage;

import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class bbj implements KeySpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[][] f4022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public short[] f4023b;
    public short[][] c;
    public short[] d;
    public int[] e;
    public s6e[] f;

    public bbj(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, s6e[] s6eVarArr) {
        this.f4022a = sArr;
        this.f4023b = sArr2;
        this.c = sArr3;
        this.d = sArr4;
        this.e = iArr;
        this.f = s6eVarArr;
    }

    public short[] a() {
        return this.f4023b;
    }

    public short[] b() {
        return this.d;
    }

    public short[][] c() {
        return this.f4022a;
    }

    public short[][] d() {
        return this.c;
    }

    public s6e[] e() {
        return this.f;
    }

    public int[] f() {
        return this.e;
    }
}
