package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k8 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f88678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mc f88679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f88680d;

    public /* synthetic */ k8(e23.a aVar, o53.b0 b0Var, mc mcVar) {
        this.f88677a = 2;
        this.f88680d = aVar;
        this.f88678b = b0Var;
        this.f88679c = mcVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f88677a) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                mc mcVar = this.f88679c;
                ge1.b.T(this.f88678b, null, null, new v8(mcVar, fFloatValue, null), 3).J(new h21.n(mcVar, this.f88680d, 2));
                break;
            case 1:
                ((mc) obj).getClass();
                ge1.b.T(this.f88678b, null, null, new sd0.c.a(this.f88679c, this.f88680d, null), 3);
                break;
            default:
                l72.i3 i3Var = (l72.i3) obj;
                i3Var.getClass();
                String str = i3Var.f111063a;
                if (p005kotlin.jvm.internal.s.g(str, "HELP")) {
                    this.f88680d.invoke();
                } else if (p005kotlin.jvm.internal.s.g(str, "EDIT_SLEEP_TIMES")) {
                    ge1.b.T(this.f88678b, null, null, new sm1.r.a(this.f88679c, null), 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ k8(o53.b0 b0Var, mc mcVar, e23.a aVar, int i14) {
        this.f88677a = i14;
        this.f88678b = b0Var;
        this.f88679c = mcVar;
        this.f88680d = aVar;
    }
}
