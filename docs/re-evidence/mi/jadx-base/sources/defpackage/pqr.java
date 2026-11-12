package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class pqr extends be implements tqr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fe f30657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public pe f30658b;

    public pqr(int i, int i2) {
        this(i, i2, 0, 0);
    }

    public static pqr h(Object obj) {
        if (obj instanceof pqr) {
            return (pqr) obj;
        }
        if (obj != null) {
            return new pqr(se.q(obj));
        }
        return null;
    }

    public fe g() {
        return this.f30657a;
    }

    public pe i() {
        return this.f30658b;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(this.f30657a);
        idVar.a(this.f30658b);
        return new xg5(idVar);
    }

    public pqr(BigInteger bigInteger) {
        this.f30657a = tqr.i9;
        this.f30658b = new vd(bigInteger);
    }

    public pqr(int i, int i2, int i3, int i4) {
        this.f30657a = tqr.j9;
        id idVar = new id();
        idVar.a(new vd(i));
        if (i3 == 0) {
            if (i4 == 0) {
                idVar.a(tqr.l9);
                idVar.a(new vd(i2));
            } else {
                throw new IllegalArgumentException("inconsistent k values");
            }
        } else if (i3 > i2 && i4 > i3) {
            idVar.a(tqr.m9);
            id idVar2 = new id();
            idVar2.a(new vd(i2));
            idVar2.a(new vd(i3));
            idVar2.a(new vd(i4));
            idVar.a(new xg5(idVar2));
        } else {
            throw new IllegalArgumentException("inconsistent k values");
        }
        this.f30658b = new xg5(idVar);
    }

    public pqr(se seVar) {
        this.f30657a = fe.w(seVar.t(0));
        this.f30658b = seVar.t(1).toASN1Primitive();
    }
}
