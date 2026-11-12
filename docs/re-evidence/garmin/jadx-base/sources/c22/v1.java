package c22;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23290a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f23293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f23294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f23295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f23296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f23297h;

    public /* synthetic */ v1(long j8, String str, String str2, boolean z14, h4.r rVar, int i14, int i15) {
        this.f23293d = j8;
        this.f23291b = str;
        this.f23292c = str2;
        this.f23294e = z14;
        this.f23297h = rVar;
        this.f23295f = i14;
        this.f23296g = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f23290a;
        int i15 = this.f23295f;
        Object obj3 = this.f23297h;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                w1.a(this.f23293d, this.f23291b, this.f23292c, this.f23294e, (h4.r) obj3, (p3.m) obj, p3.p0.t(i15 | 1), this.f23296g);
                break;
            default:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                ((com.garmin.android.apps.connectmobile.performance.stats.improvement.c) obj3).m(p3.p0.t(i15 | 1), this.f23296g, this.f23293d, this.f23291b, this.f23292c, mVar, this.f23294e);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ v1(com.garmin.android.apps.connectmobile.performance.stats.improvement.c cVar, String str, String str2, long j8, boolean z14, int i14, int i15) {
        this.f23297h = cVar;
        this.f23291b = str;
        this.f23292c = str2;
        this.f23293d = j8;
        this.f23294e = z14;
        this.f23295f = i14;
        this.f23296g = i15;
    }
}
