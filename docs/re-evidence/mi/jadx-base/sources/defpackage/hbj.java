package defpackage;

import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class hbj implements KeySpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[][] f19909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public short[][] f19910b;
    public short[] c;
    public int d;

    public hbj(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.d = i;
        this.f19909a = sArr;
        this.f19910b = sArr2;
        this.c = sArr3;
    }

    public short[][] a() {
        return this.f19909a;
    }

    public short[] b() {
        return this.c;
    }

    public short[][] c() {
        return this.f19910b;
    }

    public int d() {
        return this.d;
    }
}
