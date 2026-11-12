package c22;

import com.garmin.android.apps.connectmobile.activities.stats.timinggates.TimingGatesActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22983a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f22984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f22986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f22988f;

    public /* synthetic */ a(float f14, float f15, z3.e eVar, int i14, int i15) {
        this.f22984b = f14;
        this.f22986d = f15;
        this.f22988f = eVar;
        this.f22985c = i14;
        this.f22987e = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f22983a;
        Object obj3 = this.f22988f;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                lg.d.a(this.f22984b, this.f22986d, (z3.e) obj3, (p3.m) obj, p3.p0.t(this.f22985c | 1), this.f22987e);
                break;
            default:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                TimingGatesActivity.a aVar = TimingGatesActivity.f29952c;
                ((TimingGatesActivity) obj3).da(this.f22984b, this.f22986d, this.f22985c, mVar, p3.p0.t(this.f22987e | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(TimingGatesActivity timingGatesActivity, float f14, int i14, float f15, int i15) {
        this.f22988f = timingGatesActivity;
        this.f22984b = f14;
        this.f22985c = i14;
        this.f22986d = f15;
        this.f22987e = i15;
    }
}
