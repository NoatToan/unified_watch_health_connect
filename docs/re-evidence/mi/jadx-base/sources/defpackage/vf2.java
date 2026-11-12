package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class vf2 extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bd f36833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vd f36834b;

    public vf2(se seVar) {
        this.f36833a = bd.r(false);
        this.f36834b = null;
        if (seVar.size() == 0) {
            this.f36833a = null;
            this.f36834b = null;
            return;
        }
        if (seVar.t(0) instanceof bd) {
            this.f36833a = bd.q(seVar.t(0));
        } else {
            this.f36833a = null;
            this.f36834b = vd.o(seVar.t(0));
        }
        if (seVar.size() > 1) {
            if (this.f36833a == null) {
                throw new IllegalArgumentException("wrong sequence in constructor");
            }
            this.f36834b = vd.o(seVar.t(1));
        }
    }

    public static vf2 g(Object obj) {
        if (obj instanceof vf2) {
            return (vf2) obj;
        }
        if (obj instanceof rpr) {
            return g(rpr.a((rpr) obj));
        }
        if (obj != null) {
            return new vf2(se.q(obj));
        }
        return null;
    }

    public BigInteger h() {
        vd vdVar = this.f36834b;
        if (vdVar != null) {
            return vdVar.r();
        }
        return null;
    }

    public boolean i() {
        bd bdVar = this.f36833a;
        return bdVar != null && bdVar.t();
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        bd bdVar = this.f36833a;
        if (bdVar != null) {
            idVar.a(bdVar);
        }
        vd vdVar = this.f36834b;
        if (vdVar != null) {
            idVar.a(vdVar);
        }
        return new xg5(idVar);
    }

    public String toString() {
        if (this.f36834b != null) {
            return "BasicConstraints: isCa(" + i() + "), pathLenConstraint = " + this.f36834b.r();
        }
        if (this.f36833a == null) {
            return "BasicConstraints: isCa(false)";
        }
        return "BasicConstraints: isCa(" + i() + ")";
    }
}
