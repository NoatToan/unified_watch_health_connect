package gt1;

import p005kotlin.Unit;
import p3.p0;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78940a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f78942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f78943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f78944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f78945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f78946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f78947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f78948i;

    public /* synthetic */ b(com.garmin.android.apps.connectmobile.traininginitiative.ui.v vVar, int i14, String str, boolean z14, boolean z15, e23.a aVar, int i15, int i16) {
        this.f78947h = vVar;
        this.f78941b = i14;
        this.f78942c = str;
        this.f78943d = z14;
        this.f78944e = z15;
        this.f78948i = aVar;
        this.f78945f = i15;
        this.f78946g = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f78940a;
        int i15 = this.f78945f;
        Object obj3 = this.f78948i;
        Object obj4 = this.f78947h;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(i15 | 1);
                boolean z14 = this.f78943d;
                d.a((h4.r) obj4, z14, (p1) obj3, this.f78942c, this.f78941b, this.f78944e, (p3.m) obj, iT, this.f78946g);
                break;
            default:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.v.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.v.f46300e;
                int iT2 = p0.t(i15 | 1);
                ((com.garmin.android.apps.connectmobile.traininginitiative.ui.v) obj4).C6(this.f78941b, this.f78942c, this.f78943d, this.f78944e, (e23.a) obj3, mVar, iT2, this.f78946g);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(h4.r rVar, boolean z14, p1 p1Var, String str, int i14, boolean z15, int i15, int i16) {
        this.f78947h = rVar;
        this.f78943d = z14;
        this.f78948i = p1Var;
        this.f78942c = str;
        this.f78941b = i14;
        this.f78944e = z15;
        this.f78945f = i15;
        this.f78946g = i16;
    }
}
