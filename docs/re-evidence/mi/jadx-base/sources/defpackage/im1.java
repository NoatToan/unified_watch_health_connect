package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class im1 extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fe f21285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gd f21286b;

    public im1(se seVar) {
        this.f21285a = (fe) seVar.t(0);
        this.f21286b = seVar.t(1);
    }

    public static im1 g(Object obj) {
        if (obj instanceof im1) {
            return (im1) obj;
        }
        if (obj != null) {
            return new im1(se.q(obj));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    public fe h() {
        return this.f21285a;
    }

    public gd i() {
        return this.f21286b;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(this.f21285a);
        idVar.a(this.f21286b);
        return new xg5(idVar);
    }
}
