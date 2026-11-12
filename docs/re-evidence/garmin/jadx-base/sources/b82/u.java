package b82;

import i3.uc;
import l72.c3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16818a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f16819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h4.r f16820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f16821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f16825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f16826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f16827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f16828k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f16829l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f16830m;

    public /* synthetic */ u(t0 t0Var, String str, h4.r rVar, String str2, e23.p pVar, String str3, Integer num, boolean z14, int i14, e23.l lVar, int i15, int i16) {
        this.f16825h = t0Var;
        this.f16826i = str;
        this.f16820c = rVar;
        this.f16827j = str2;
        this.f16829l = pVar;
        this.f16828k = str3;
        this.f16830m = num;
        this.f16821d = z14;
        this.f16822e = i14;
        this.f16819b = lVar;
        this.f16823f = i15;
        this.f16824g = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f16818a;
        int i15 = this.f16823f;
        Object obj3 = this.f16830m;
        Object obj4 = this.f16829l;
        Object obj5 = this.f16828k;
        Object obj6 = this.f16827j;
        Object obj7 = this.f16826i;
        Object obj8 = this.f16825h;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                t0 t0Var = t0.f16792a;
                int iT = p3.p0.t(i15 | 1);
                ((t0) obj8).h((String) obj7, this.f16820c, (String) obj6, (e23.p) obj4, (String) obj5, (Integer) obj3, this.f16821d, this.f16822e, this.f16819b, (p3.m) obj, iT, this.f16824g);
                break;
            default:
                ((Integer) obj2).getClass();
                c3 c3Var = c3.f110949a;
                int iT2 = p3.p0.t(i15 | 1);
                ((c3) obj8).b((j23.f) obj7, this.f16819b, this.f16820c, this.f16821d, (j23.f) obj6, this.f16822e, (uc) obj5, (b92.a) obj4, (e23.a) obj3, (p3.m) obj, iT2, this.f16824g);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ u(c3 c3Var, j23.f fVar, e23.l lVar, h4.r rVar, boolean z14, j23.f fVar2, int i14, uc ucVar, b92.a aVar, e23.a aVar2, int i15, int i16) {
        this.f16825h = c3Var;
        this.f16826i = fVar;
        this.f16819b = lVar;
        this.f16820c = rVar;
        this.f16821d = z14;
        this.f16827j = fVar2;
        this.f16822e = i14;
        this.f16828k = ucVar;
        this.f16829l = aVar;
        this.f16830m = aVar2;
        this.f16823f = i15;
        this.f16824g = i16;
    }
}
