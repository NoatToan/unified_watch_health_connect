package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p9 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89287a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f5.v1 f89288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f89289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f89290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f5.v1 f89291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f89292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f89293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f5.v1 f89294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f89295i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f89296j;

    public /* synthetic */ p9(f5.v1 v1Var, int i14, int i15, f5.v1 v1Var2, int i16, int i17, f5.v1 v1Var3, int i18, int i19) {
        this.f89288b = v1Var;
        this.f89289c = i14;
        this.f89290d = i15;
        this.f89291e = v1Var2;
        this.f89292f = i16;
        this.f89293g = i17;
        this.f89294h = v1Var3;
        this.f89295i = i18;
        this.f89296j = i19;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        f5.v1.a aVar = (f5.v1.a) obj;
        switch (this.f89287a) {
            case 0:
                f5.v1 v1Var = this.f89288b;
                if (v1Var != null) {
                    f5.v1.a.B(aVar, v1Var, (this.f89295i - v1Var.f69144a) / 2, (this.f89296j - v1Var.f69145b) / 2);
                }
                f5.v1.a.B(aVar, this.f89291e, this.f89289c, this.f89290d);
                f5.v1.a.B(aVar, this.f89294h, this.f89292f, this.f89293g);
                break;
            default:
                f5.v1.a.B(aVar, this.f89288b, this.f89289c, this.f89290d);
                f5.v1.a.B(aVar, this.f89291e, this.f89292f, this.f89293g);
                f5.v1.a.B(aVar, this.f89294h, this.f89295i, this.f89296j);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ p9(f5.v1 v1Var, f5.v1 v1Var2, int i14, int i15, f5.v1 v1Var3, int i16, int i17, int i18, int i19) {
        this.f89288b = v1Var;
        this.f89291e = v1Var2;
        this.f89289c = i14;
        this.f89290d = i15;
        this.f89294h = v1Var3;
        this.f89292f = i16;
        this.f89293g = i17;
        this.f89295i = i18;
        this.f89296j = i19;
    }
}
