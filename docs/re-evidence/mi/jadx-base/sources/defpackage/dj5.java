package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class dj5 extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15585b;
    public int c;
    public int d;

    public dj5(te teVar) {
        this.f15584a = wd.o(teVar.t(0)).q().intValue();
        if (teVar.t(1) instanceof wd) {
            this.f15585b = ((wd) teVar.t(1)).q().intValue();
        } else {
            if (!(teVar.t(1) instanceof te)) {
                throw new IllegalArgumentException("object parse error");
            }
            te teVarQ = te.q(teVar.t(1));
            this.f15585b = wd.o(teVarQ.t(0)).q().intValue();
            this.c = wd.o(teVarQ.t(1)).q().intValue();
            this.d = wd.o(teVarQ.t(2)).q().intValue();
        }
    }

    public static dj5 g(Object obj) {
        if (obj instanceof dj5) {
            return (dj5) obj;
        }
        if (obj != null) {
            return new dj5(te.q(obj));
        }
        return null;
    }

    public int h() {
        return this.f15585b;
    }

    public int i() {
        return this.c;
    }

    public int j() {
        return this.d;
    }

    public int k() {
        return this.f15584a;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(new wd(this.f15584a));
        if (this.c == 0) {
            jdVar.a(new wd(this.f15585b));
        } else {
            jd jdVar2 = new jd();
            jdVar2.a(new wd(this.f15585b));
            jdVar2.a(new wd(this.c));
            jdVar2.a(new wd(this.d));
            jdVar.a(new yg5(jdVar2));
        }
        return new yg5(jdVar);
    }
}
