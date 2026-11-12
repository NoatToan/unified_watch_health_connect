package fz1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74045a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f74046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f74047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f74048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f74049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f74050f;

    public /* synthetic */ m(com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar, boolean z14, boolean z15, int i14, int i15, int i16) {
        this.f74050f = eVar;
        this.f74046b = z14;
        this.f74047c = z15;
        this.f74048d = i14;
        this.f74049e = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f74045a;
        Object obj3 = this.f74050f;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e.f46024o;
                ((com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e) obj3).v6(this.f74046b, this.f74047c, this.f74048d, this.f74049e, mVar, p0.t(1));
                break;
            default:
                ((Integer) obj2).getClass();
                zs1.c.a((h4.r) obj3, this.f74046b, this.f74047c, (p3.m) obj, p0.t(this.f74048d | 1), this.f74049e);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m(h4.r rVar, boolean z14, boolean z15, int i14, int i15) {
        this.f74050f = rVar;
        this.f74046b = z14;
        this.f74047c = z15;
        this.f74048d = i14;
        this.f74049e = i15;
    }
}
