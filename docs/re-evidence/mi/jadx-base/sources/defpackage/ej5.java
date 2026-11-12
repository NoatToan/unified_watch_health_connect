package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ej5 extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BigInteger f16697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cj5 f16698b;
    public vd c;
    public ge d;
    public vd e;
    public ge f;

    public ej5(se seVar) {
        this.f16697a = BigInteger.valueOf(0L);
        int i = 0;
        if (seVar.t(0) instanceof ef) {
            ef efVar = (ef) seVar.t(0);
            if (!efVar.r() || efVar.q() != 0) {
                throw new IllegalArgumentException("object parse error");
            }
            this.f16697a = vd.o(efVar.getLoadedObject()).r();
            i = 1;
        }
        this.f16698b = cj5.g(seVar.t(i));
        this.c = vd.o(seVar.t(i + 1));
        this.d = ge.q(seVar.t(i + 2));
        this.e = vd.o(seVar.t(i + 3));
        this.f = ge.q(seVar.t(i + 4));
    }

    public static ej5 k(Object obj) {
        if (obj instanceof ej5) {
            return (ej5) obj;
        }
        if (obj != null) {
            return new ej5(se.q(obj));
        }
        return null;
    }

    public BigInteger g() {
        return this.c.r();
    }

    public byte[] h() {
        return wj1.d(this.d.r());
    }

    public cj5 i() {
        return this.f16698b;
    }

    public byte[] j() {
        return wj1.d(this.f.r());
    }

    public BigInteger l() {
        return this.e.r();
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        if (this.f16697a.compareTo(BigInteger.valueOf(0L)) != 0) {
            idVar.a(new hh5(true, 0, new vd(this.f16697a)));
        }
        idVar.a(this.f16698b);
        idVar.a(this.c);
        idVar.a(this.d);
        idVar.a(this.e);
        idVar.a(this.f);
        return new xg5(idVar);
    }
}
