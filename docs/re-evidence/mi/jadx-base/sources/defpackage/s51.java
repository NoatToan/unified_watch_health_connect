package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class s51 extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fe f33302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gd f33303b;

    public s51(fe feVar) {
        this.f33302a = feVar;
    }

    public static s51 h(Object obj) {
        if (obj instanceof s51) {
            return (s51) obj;
        }
        if (obj != null) {
            return new s51(se.q(obj));
        }
        return null;
    }

    public fe g() {
        return this.f33302a;
    }

    public gd i() {
        return this.f33303b;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(this.f33302a);
        gd gdVar = this.f33303b;
        if (gdVar != null) {
            idVar.a(gdVar);
        }
        return new xg5(idVar);
    }

    public s51(fe feVar, gd gdVar) {
        this.f33302a = feVar;
        this.f33303b = gdVar;
    }

    public s51(se seVar) {
        if (seVar.size() >= 1 && seVar.size() <= 2) {
            this.f33302a = fe.w(seVar.t(0));
            if (seVar.size() == 2) {
                this.f33303b = seVar.t(1);
                return;
            } else {
                this.f33303b = null;
                return;
            }
        }
        throw new IllegalArgumentException("Bad sequence size: " + seVar.size());
    }
}
