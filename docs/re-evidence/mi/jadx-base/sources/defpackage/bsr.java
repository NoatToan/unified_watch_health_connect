package defpackage;

import org.bouncycastle.pqc.crypto.xmss.e;

/* JADX INFO: loaded from: classes3.dex */
public final class bsr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final asr f4574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f4575b;
    public final int c;
    public final int d;

    public bsr(int i, aw6 aw6Var) {
        if (i < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (aw6Var == null) {
            throw new NullPointerException("digest == null");
        }
        e eVar = new e(new g3r(aw6Var));
        this.f4575b = eVar;
        this.c = i;
        this.d = a();
        this.f4574a = ay5.b(b().getAlgorithmName(), c(), g(), eVar.d().c(), i);
    }

    public final int a() {
        int i = 2;
        while (true) {
            int i2 = this.c;
            if (i > i2) {
                throw new IllegalStateException("should never happen...");
            }
            if ((i2 - i) % 2 == 0) {
                return i;
            }
            i++;
        }
    }

    public aw6 b() {
        return this.f4575b.d().a();
    }

    public int c() {
        return this.f4575b.d().b();
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public e f() {
        return this.f4575b;
    }

    public int g() {
        return this.f4575b.d().d();
    }
}
