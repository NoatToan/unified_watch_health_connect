package db0;

import e23.l;
import p005kotlin.Unit;
import p3.n1;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58962a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f58963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.c f58964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f58965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f58966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1 f58967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f58968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f58969h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58970i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f58971j;

    public /* synthetic */ b(n1 n1Var, i53.c cVar, l lVar, p1 p1Var, int i14, int i15, int i16, int i17, n1 n1Var2) {
        this.f58963b = n1Var;
        this.f58964c = cVar;
        this.f58965d = lVar;
        this.f58966e = p1Var;
        this.f58968g = i14;
        this.f58969h = i15;
        this.f58970i = i16;
        this.f58971j = i17;
        this.f58967f = n1Var2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f58962a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i14) {
            case 0:
                n1 n1Var = this.f58963b;
                n1Var.t(iIntValue);
                c.c(n1Var, this.f58964c, this.f58965d, this.f58966e, this.f58968g, this.f58969h, this.f58970i, this.f58971j, this.f58967f);
                break;
            default:
                n1 n1Var2 = this.f58963b;
                n1Var2.t(iIntValue);
                c.c(this.f58967f, this.f58964c, this.f58965d, this.f58966e, this.f58968g, this.f58969h, this.f58970i, this.f58971j, n1Var2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(n1 n1Var, i53.c cVar, l lVar, p1 p1Var, n1 n1Var2, int i14, int i15, int i16, int i17) {
        this.f58963b = n1Var;
        this.f58964c = cVar;
        this.f58965d = lVar;
        this.f58966e = p1Var;
        this.f58967f = n1Var2;
        this.f58968g = i14;
        this.f58969h = i15;
        this.f58970i = i16;
        this.f58971j = i17;
    }
}
