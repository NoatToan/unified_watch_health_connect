package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class trr extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd f34976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34977b;
    public final t51 c;

    public trr(int i, t51 t51Var) {
        this.f34976a = new wd(0L);
        this.f34977b = i;
        this.c = t51Var;
    }

    public static trr h(Object obj) {
        if (obj instanceof trr) {
            return (trr) obj;
        }
        if (obj != null) {
            return new trr(te.q(obj));
        }
        return null;
    }

    public int g() {
        return this.f34977b;
    }

    public t51 i() {
        return this.c;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(this.f34976a);
        jdVar.a(new wd(this.f34977b));
        jdVar.a(this.c);
        return new yg5(jdVar);
    }

    public trr(te teVar) {
        this.f34976a = wd.o(teVar.t(0));
        this.f34977b = wd.o(teVar.t(1)).r().intValue();
        this.c = t51.h(teVar.t(2));
    }
}
