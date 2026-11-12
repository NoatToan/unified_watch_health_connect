package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class di5 extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wf5 f15546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vd f15547b;

    public di5(se seVar) {
        if (seVar.size() == 2) {
            this.f15546a = wf5.v(seVar.t(0));
            this.f15547b = vd.o(seVar.t(1));
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + seVar.size());
        }
    }

    public static di5 g(Object obj) {
        if (obj instanceof di5) {
            return (di5) obj;
        }
        if (obj != null) {
            return new di5(se.q(obj));
        }
        return null;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(this.f15546a);
        idVar.a(this.f15547b);
        return new xg5(idVar);
    }
}
