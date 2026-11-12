package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class t51 extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ee f34319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hd f34320b;

    public t51(ee eeVar) {
        this.f34319a = eeVar;
    }

    public static t51 h(Object obj) {
        if (obj instanceof t51) {
            return (t51) obj;
        }
        if (obj != null) {
            return new t51(te.q(obj));
        }
        return null;
    }

    public ee g() {
        return this.f34319a;
    }

    public hd i() {
        return this.f34320b;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(this.f34319a);
        hd hdVar = this.f34320b;
        if (hdVar != null) {
            jdVar.a(hdVar);
        }
        return new yg5(jdVar);
    }

    public t51(ee eeVar, hd hdVar) {
        this.f34319a = eeVar;
        this.f34320b = hdVar;
    }

    public t51(te teVar) {
        if (teVar.size() >= 1 && teVar.size() <= 2) {
            this.f34319a = ee.w(teVar.t(0));
            this.f34320b = teVar.size() == 2 ? teVar.t(1) : null;
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + teVar.size());
        }
    }
}
