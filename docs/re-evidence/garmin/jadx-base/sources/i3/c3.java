package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c3 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87704a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f87705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f87706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f87707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f87708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f87709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f87710g;

    public /* synthetic */ c3(e23.a aVar, long j8, f9 f9Var, s1.b bVar, z3.e eVar, int i14) {
        this.f87707d = aVar;
        this.f87705b = j8;
        this.f87708e = f9Var;
        this.f87709f = bVar;
        this.f87710g = eVar;
        this.f87706c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f87704a;
        int i15 = this.f87706c;
        Object obj3 = this.f87710g;
        Object obj4 = this.f87709f;
        Object obj5 = this.f87708e;
        Object obj6 = this.f87707d;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                d3 d3Var = d3.f87817a;
                int iT = p3.p0.t(199681);
                ((d3) obj6).a((Long) obj5, this.f87706c, (l3) obj4, (h4.r) obj3, this.f87705b, (p3.m) obj, iT);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p3.p0.t(i15 | 1);
                i9.a((e23.a) obj6, this.f87705b, (f9) obj5, (s1.b) obj4, (z3.e) obj3, (p3.m) obj, iT2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iT3 = p3.p0.t(i15 | 1);
                l72.g2.a((z3.e) obj6, this.f87705b, (l72.d2) obj5, (h4.r) obj3, (String) obj4, (p3.m) obj, iT3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iT4 = p3.p0.t(i15 | 1);
                mh1.h.b((mh1.w) obj6, (com.garmin.android.apps.connectmobile.userprofile.model.g) obj5, this.f87705b, (String) obj4, (e23.a) obj3, (p3.m) obj, iT4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT5 = p3.p0.t(3121);
                oy0.f.c((String) obj6, (s5.x0) obj5, (String) obj4, this.f87705b, this.f87706c, (e23.l) obj3, (p3.m) obj, iT5);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c3(d3 d3Var, Long l14, int i14, l3 l3Var, h4.r rVar, long j8, int i15) {
        this.f87707d = d3Var;
        this.f87708e = l14;
        this.f87706c = i14;
        this.f87709f = l3Var;
        this.f87710g = rVar;
        this.f87705b = j8;
    }

    public /* synthetic */ c3(String str, s5.x0 x0Var, String str2, long j8, int i14, e23.l lVar, int i15) {
        this.f87707d = str;
        this.f87708e = x0Var;
        this.f87709f = str2;
        this.f87705b = j8;
        this.f87706c = i14;
        this.f87710g = lVar;
    }

    public /* synthetic */ c3(mh1.w wVar, com.garmin.android.apps.connectmobile.userprofile.model.g gVar, long j8, String str, e23.a aVar, int i14) {
        this.f87707d = wVar;
        this.f87708e = gVar;
        this.f87705b = j8;
        this.f87709f = str;
        this.f87710g = aVar;
        this.f87706c = i14;
    }

    public /* synthetic */ c3(z3.e eVar, long j8, l72.d2 d2Var, h4.r rVar, String str, int i14) {
        this.f87707d = eVar;
        this.f87705b = j8;
        this.f87708e = d2Var;
        this.f87710g = rVar;
        this.f87709f = str;
        this.f87706c = i14;
    }
}
