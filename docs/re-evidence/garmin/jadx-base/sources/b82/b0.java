package b82;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f16459c;

    public /* synthetic */ b0(int i14, String str, p3.p1 p1Var) {
        this.f16457a = i14;
        this.f16458b = str;
        this.f16459c = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f16457a;
        p3.p1 p1Var = this.f16459c;
        String str = this.f16458b;
        switch (i14) {
            case 0:
                t0 t0Var = t0.f16792a;
                ((p3.i0) obj).getClass();
                if (!p005kotlin.jvm.internal.s.g(str, ((x5.l0) p1Var.getF182175a()).f188878a.f157138b)) {
                    x5.l0 l0Var = (x5.l0) p1Var.getF182175a();
                    int length = str.length();
                    p1Var.setValue(x5.l0.a(l0Var, str, og.a.l(length, length), 4));
                }
                return new t0.e();
            case 1:
                ((p3.i0) obj).getClass();
                if (!str.equals(((x5.l0) p1Var.getF182175a()).f188878a.f157138b)) {
                    x5.l0 l0Var2 = (x5.l0) p1Var.getF182175a();
                    int length2 = str.length();
                    p1Var.setValue(x5.l0.a(l0Var2, str, og.a.l(length2, length2), 4));
                }
                return new dv0.q();
            case 2:
                p5.k0 k0Var = (p5.k0) obj;
                k0Var.getClass();
                p5.h0.n(k0Var, ((d52.e) p1Var.getF182175a()).g(str));
                return Unit.INSTANCE;
            case 3:
                ((p3.i0) obj).getClass();
                if (!p005kotlin.jvm.internal.s.g(str, ((x5.l0) p1Var.getF182175a()).f188878a.f157138b)) {
                    x5.l0 l0Var3 = (x5.l0) p1Var.getF182175a();
                    String str2 = str == null ? "" : str;
                    if (str == null) {
                        str = "";
                    }
                    int length3 = str.length();
                    p1Var.setValue(x5.l0.a(l0Var3, str2, og.a.l(length3, length3), 4));
                }
                return new lm0.e.b();
            case 4:
                y52.b bVar = (y52.b) obj;
                bVar.getClass();
                if (!p005kotlin.jvm.internal.s.g((String) p1Var.getF182175a(), str)) {
                    bVar.setText(str);
                    p1Var.setValue(str);
                }
                return Unit.INSTANCE;
            case 5:
                p5.k0 k0Var2 = (p5.k0) obj;
                k0Var2.getClass();
                p5.h0.n(k0Var2, ((pq1.d) p1Var.getF182175a()).g(str));
                return Unit.INSTANCE;
            default:
                ((p3.i0) obj).getClass();
                if (!str.equals(((x5.l0) p1Var.getF182175a()).f188878a.f157138b)) {
                    x5.l0 l0Var4 = (x5.l0) p1Var.getF182175a();
                    int length4 = str.length();
                    p1Var.setValue(x5.l0.a(l0Var4, str, og.a.l(length4, length4), 4));
                }
                return new y01.v();
        }
    }
}
