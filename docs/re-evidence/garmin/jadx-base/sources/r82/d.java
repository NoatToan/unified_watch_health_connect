package r82;

import p005kotlin.Unit;
import p3.n1;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151223a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f151224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f151225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f151226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f151227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1 f151228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n1 f151229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f151230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f151231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f151232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f151233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f151234l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f151235m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n1 f151236n;

    public /* synthetic */ d(n1 n1Var, e23.l lVar, p1 p1Var, p1 p1Var2, p1 p1Var3, int i14, int i15, int i16, int i17, n1 n1Var2, int i18, int i19, n1 n1Var3) {
        this.f151224b = n1Var;
        this.f151225c = lVar;
        this.f151226d = p1Var;
        this.f151227e = p1Var2;
        this.f151228f = p1Var3;
        this.f151230h = i14;
        this.f151231i = i15;
        this.f151232j = i16;
        this.f151233k = i17;
        this.f151229g = n1Var2;
        this.f151234l = i18;
        this.f151235m = i19;
        this.f151236n = n1Var3;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f151223a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i14) {
            case 0:
                n1 n1Var = this.f151224b;
                n1Var.t(iIntValue);
                g.k(n1Var, this.f151225c, this.f151226d, this.f151227e, this.f151228f, this.f151230h, this.f151231i, this.f151232j, this.f151233k, this.f151229g, this.f151234l, this.f151235m, this.f151236n);
                break;
            case 1:
                n1 n1Var2 = this.f151224b;
                n1Var2.t(iIntValue);
                g.k(this.f151229g, this.f151225c, this.f151226d, this.f151227e, this.f151228f, this.f151230h, this.f151231i, this.f151232j, this.f151233k, n1Var2, this.f151234l, this.f151235m, this.f151236n);
                break;
            default:
                n1 n1Var3 = this.f151224b;
                n1Var3.t(iIntValue);
                g.k(this.f151229g, this.f151225c, this.f151226d, this.f151227e, this.f151228f, this.f151230h, this.f151231i, this.f151232j, this.f151233k, this.f151236n, this.f151234l, this.f151235m, n1Var3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(n1 n1Var, e23.l lVar, p1 p1Var, p1 p1Var2, p1 p1Var3, n1 n1Var2, int i14, int i15, int i16, int i17, int i18, int i19, n1 n1Var3) {
        this.f151224b = n1Var;
        this.f151225c = lVar;
        this.f151226d = p1Var;
        this.f151227e = p1Var2;
        this.f151228f = p1Var3;
        this.f151229g = n1Var2;
        this.f151230h = i14;
        this.f151231i = i15;
        this.f151232j = i16;
        this.f151233k = i17;
        this.f151234l = i18;
        this.f151235m = i19;
        this.f151236n = n1Var3;
    }

    public /* synthetic */ d(n1 n1Var, e23.l lVar, p1 p1Var, p1 p1Var2, p1 p1Var3, n1 n1Var2, int i14, int i15, int i16, int i17, n1 n1Var3, int i18, int i19) {
        this.f151224b = n1Var;
        this.f151225c = lVar;
        this.f151226d = p1Var;
        this.f151227e = p1Var2;
        this.f151228f = p1Var3;
        this.f151229g = n1Var2;
        this.f151230h = i14;
        this.f151231i = i15;
        this.f151232j = i16;
        this.f151233k = i17;
        this.f151236n = n1Var3;
        this.f151234l = i18;
        this.f151235m = i19;
    }
}
