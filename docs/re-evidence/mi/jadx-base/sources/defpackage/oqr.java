package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class oqr extends de {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static sqr f29400b = new sqr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g87 f29401a;

    public oqr(int i, int i2, int i3, int i4, he heVar) {
        this(new g87.a(i, i2, i3, i4, new BigInteger(1, heVar.r())));
    }

    public g87 g() {
        return this.f29401a;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        return new qg5(f29400b.c(this.f29401a.t(), f29400b.b(this.f29401a)));
    }

    public oqr(g87 g87Var) {
        this.f29401a = g87Var;
    }

    public oqr(BigInteger bigInteger, he heVar) {
        this(new g87.b(bigInteger, new BigInteger(1, heVar.r())));
    }
}
