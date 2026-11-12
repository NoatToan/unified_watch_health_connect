package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class cj5 extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5396b;
    public int c;
    public int d;

    public cj5(se seVar) {
        this.f5395a = vd.o(seVar.t(0)).q().intValue();
        if (seVar.t(1) instanceof vd) {
            this.f5396b = ((vd) seVar.t(1)).q().intValue();
        } else {
            if (!(seVar.t(1) instanceof se)) {
                throw new IllegalArgumentException("object parse error");
            }
            se seVarQ = se.q(seVar.t(1));
            this.f5396b = vd.o(seVarQ.t(0)).q().intValue();
            this.c = vd.o(seVarQ.t(1)).q().intValue();
            this.d = vd.o(seVarQ.t(2)).q().intValue();
        }
    }

    public static cj5 g(Object obj) {
        if (obj instanceof cj5) {
            return (cj5) obj;
        }
        if (obj != null) {
            return new cj5(se.q(obj));
        }
        return null;
    }

    public int h() {
        return this.f5396b;
    }

    public int i() {
        return this.c;
    }

    public int j() {
        return this.d;
    }

    public int k() {
        return this.f5395a;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(new vd(this.f5395a));
        if (this.c == 0) {
            idVar.a(new vd(this.f5396b));
        } else {
            id idVar2 = new id();
            idVar2.a(new vd(this.f5396b));
            idVar2.a(new vd(this.c));
            idVar2.a(new vd(this.d));
            idVar.a(new xg5(idVar2));
        }
        return new xg5(idVar);
    }
}
