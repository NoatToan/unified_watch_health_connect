package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class x7l extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd f38788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t51 f38789b;

    public x7l(te teVar) {
        this.f38788a = wd.o(teVar.t(0));
        this.f38789b = t51.h(teVar.t(1));
    }

    public static final x7l g(Object obj) {
        if (obj instanceof x7l) {
            return (x7l) obj;
        }
        if (obj != null) {
            return new x7l(te.q(obj));
        }
        return null;
    }

    public t51 h() {
        return this.f38789b;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(this.f38788a);
        jdVar.a(this.f38789b);
        return new yg5(jdVar);
    }

    public x7l(t51 t51Var) {
        this.f38788a = new wd(0L);
        this.f38789b = t51Var;
    }
}
