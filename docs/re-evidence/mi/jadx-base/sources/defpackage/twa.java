package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class twa extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fe f35128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fe f35129b;
    public fe c;

    public twa(fe feVar, fe feVar2) {
        this.f35128a = feVar;
        this.f35129b = feVar2;
        this.c = null;
    }

    public static twa i(Object obj) {
        if (obj instanceof twa) {
            return (twa) obj;
        }
        if (obj != null) {
            return new twa(se.q(obj));
        }
        return null;
    }

    public fe g() {
        return this.f35129b;
    }

    public fe h() {
        return this.c;
    }

    public fe j() {
        return this.f35128a;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(this.f35128a);
        idVar.a(this.f35129b);
        fe feVar = this.c;
        if (feVar != null) {
            idVar.a(feVar);
        }
        return new xg5(idVar);
    }

    public twa(fe feVar, fe feVar2, fe feVar3) {
        this.f35128a = feVar;
        this.f35129b = feVar2;
        this.c = feVar3;
    }

    public twa(se seVar) {
        this.f35128a = (fe) seVar.t(0);
        this.f35129b = (fe) seVar.t(1);
        if (seVar.size() > 2) {
            this.c = (fe) seVar.t(2);
        }
    }
}
