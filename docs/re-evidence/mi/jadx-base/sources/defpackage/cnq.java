package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class cnq extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wf5 f5584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vd f5585b;

    public cnq(se seVar) {
        if (seVar.size() == 2) {
            this.f5584a = wf5.v(seVar.t(0));
            this.f5585b = vd.o(seVar.t(1));
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + seVar.size());
        }
    }

    public static cnq g(Object obj) {
        if (obj instanceof cnq) {
            return (cnq) obj;
        }
        if (obj != null) {
            return new cnq(se.q(obj));
        }
        return null;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        idVar.a(this.f5584a);
        idVar.a(this.f5585b);
        return new xg5(idVar);
    }
}
