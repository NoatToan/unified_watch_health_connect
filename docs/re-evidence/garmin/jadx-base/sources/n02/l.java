package n02;

import p005kotlin.Unit;
import p3.n1;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122194a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f122195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f122196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f122197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f122198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1 f122199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f122200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f122201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f122203j;

    public /* synthetic */ l(n1 n1Var, e23.l lVar, p1 p1Var, p1 p1Var2, int i14, int i15, int i16, int i17, n1 n1Var2) {
        this.f122195b = n1Var;
        this.f122196c = lVar;
        this.f122197d = p1Var;
        this.f122198e = p1Var2;
        this.f122200g = i14;
        this.f122201h = i15;
        this.f122202i = i16;
        this.f122203j = i17;
        this.f122199f = n1Var2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f122194a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i14) {
            case 0:
                n1 n1Var = this.f122195b;
                n1Var.t(iIntValue);
                m.d(n1Var, this.f122196c, this.f122197d, this.f122198e, this.f122200g, this.f122201h, this.f122202i, this.f122203j, this.f122199f);
                break;
            default:
                n1 n1Var2 = this.f122195b;
                n1Var2.t(iIntValue);
                m.d(this.f122199f, this.f122196c, this.f122197d, this.f122198e, this.f122200g, this.f122201h, this.f122202i, this.f122203j, n1Var2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ l(n1 n1Var, e23.l lVar, p1 p1Var, p1 p1Var2, n1 n1Var2, int i14, int i15, int i16, int i17) {
        this.f122195b = n1Var;
        this.f122196c = lVar;
        this.f122197d = p1Var;
        this.f122198e = p1Var2;
        this.f122199f = n1Var2;
        this.f122200g = i14;
        this.f122201h = i15;
        this.f122202i = i16;
        this.f122203j = i17;
    }
}
