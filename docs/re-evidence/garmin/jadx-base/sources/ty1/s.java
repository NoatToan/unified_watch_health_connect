package ty1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167225a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f167226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f167227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f167228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f167229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f167230f;

    public /* synthetic */ s(com.garmin.android.apps.connectmobile.traininginitiative.ui.d dVar, my1.a aVar, boolean z14, long j8, int i14) {
        this.f167229e = dVar;
        this.f167230f = aVar;
        this.f167227c = z14;
        this.f167226b = j8;
        this.f167228d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f167225a;
        int i15 = this.f167228d;
        Object obj3 = this.f167230f;
        Object obj4 = this.f167229e;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.d.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.d.f45888e;
                ((com.garmin.android.apps.connectmobile.traininginitiative.ui.d) obj4).u6((my1.a) obj3, this.f167227c, this.f167226b, mVar, p3.p0.t(i15 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                vc1.i.b((String) obj4, (String) obj3, this.f167226b, this.f167227c, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ s(String str, long j8, int i14, String str2, boolean z14) {
        this.f167229e = str;
        this.f167230f = str2;
        this.f167226b = j8;
        this.f167227c = z14;
        this.f167228d = i14;
    }
}
