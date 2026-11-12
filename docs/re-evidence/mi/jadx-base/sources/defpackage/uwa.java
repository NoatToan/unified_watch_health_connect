package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class uwa extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ee f36211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ee f36212b;
    public ee c;

    public uwa(ee eeVar, ee eeVar2) {
        this.f36211a = eeVar;
        this.f36212b = eeVar2;
        this.c = null;
    }

    public static uwa i(Object obj) {
        if (obj instanceof uwa) {
            return (uwa) obj;
        }
        if (obj != null) {
            return new uwa(te.q(obj));
        }
        return null;
    }

    public ee g() {
        return this.f36212b;
    }

    public ee h() {
        return this.c;
    }

    public ee j() {
        return this.f36211a;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(this.f36211a);
        jdVar.a(this.f36212b);
        ee eeVar = this.c;
        if (eeVar != null) {
            jdVar.a(eeVar);
        }
        return new yg5(jdVar);
    }

    public uwa(ee eeVar, ee eeVar2, ee eeVar3) {
        this.f36211a = eeVar;
        this.f36212b = eeVar2;
        this.c = eeVar3;
    }

    public uwa(te teVar) {
        this.f36211a = (ee) teVar.t(0);
        this.f36212b = (ee) teVar.t(1);
        if (teVar.size() > 2) {
            this.c = (ee) teVar.t(2);
        }
    }
}
