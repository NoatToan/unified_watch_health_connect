package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class wf2 extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public cd f37912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wd f37913b;

    public wf2(te teVar) {
        this.f37912a = cd.r(false);
        this.f37913b = null;
        if (teVar.size() == 0) {
            this.f37912a = null;
            this.f37913b = null;
            return;
        }
        if (teVar.t(0) instanceof cd) {
            this.f37912a = cd.q(teVar.t(0));
        } else {
            this.f37912a = null;
            this.f37913b = wd.o(teVar.t(0));
        }
        if (teVar.size() > 1) {
            if (this.f37912a == null) {
                throw new IllegalArgumentException("wrong sequence in constructor");
            }
            this.f37913b = wd.o(teVar.t(1));
        }
    }

    public static wf2 g(Object obj) {
        if (obj instanceof wf2) {
            return (wf2) obj;
        }
        if (obj instanceof spr) {
            return g(spr.a((spr) obj));
        }
        if (obj != null) {
            return new wf2(te.q(obj));
        }
        return null;
    }

    public BigInteger h() {
        wd wdVar = this.f37913b;
        if (wdVar != null) {
            return wdVar.r();
        }
        return null;
    }

    public boolean i() {
        cd cdVar = this.f37912a;
        return cdVar != null && cdVar.t();
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        cd cdVar = this.f37912a;
        if (cdVar != null) {
            jdVar.a(cdVar);
        }
        wd wdVar = this.f37913b;
        if (wdVar != null) {
            jdVar.a(wdVar);
        }
        return new yg5(jdVar);
    }

    public String toString() {
        StringBuilder sb;
        if (this.f37913b != null) {
            sb = new StringBuilder();
            sb.append("BasicConstraints: isCa(");
            sb.append(i());
            sb.append("), pathLenConstraint = ");
            sb.append(this.f37913b.r());
        } else {
            if (this.f37912a == null) {
                return "BasicConstraints: isCa(false)";
            }
            sb = new StringBuilder();
            sb.append("BasicConstraints: isCa(");
            sb.append(i());
            sb.append(")");
        }
        return sb.toString();
    }
}
