package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class jwa extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vd f23200b;
    public vd c;
    public vd d;

    public jwa(int i, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f23199a = i;
        this.f23200b = new vd(bigInteger);
        this.c = new vd(bigInteger2);
        this.d = new vd(bigInteger3);
    }

    public BigInteger g() {
        return this.d.q();
    }

    public BigInteger h() {
        return this.f23200b.q();
    }

    public BigInteger i() {
        return this.c.q();
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(new vd(this.f23199a));
        idVar.a(this.f23200b);
        idVar.a(this.c);
        idVar.a(this.d);
        return new xg5(idVar);
    }
}
