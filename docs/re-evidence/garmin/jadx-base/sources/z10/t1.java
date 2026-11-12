package z10;

import android.app.Activity;
import com.garmin.android.apps.connectmobile.consent.CoachConsentActivity;
import com.garmin.android.apps.connectmobile.consent.ConsentActivity;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import com.garmin.android.apps.connectmobile.consent.ProductImprovementConsentActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f.c f201252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f201253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hl.a f201254d;

    public /* synthetic */ t1(hl.a aVar, f.c cVar, Activity activity) {
        this.f201251a = 4;
        this.f201254d = aVar;
        this.f201252b = cVar;
        this.f201253c = activity;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f201251a) {
            case 0:
                this.f201252b.a(DataStorageConsentActivity.a.a(DataStorageConsentActivity.f32194t, this.f201253c, this.f201254d, 16), null);
                break;
            case 1:
                this.f201252b.a(CoachConsentActivity.a.a(CoachConsentActivity.f32153p, this.f201253c, this.f201254d, 4), null);
                break;
            case 2:
                this.f201252b.a(ConsentActivity.a.b(ConsentActivity.f32155r, this.f201253c, q92.x.DI_CONNECT_INSIGHTS, false, this.f201254d, 8), null);
                break;
            case 3:
                this.f201252b.a(ConsentActivity.a.b(ConsentActivity.f32155r, this.f201253c, q92.x.DI_CONNECT_LIVETRACK, false, this.f201254d, 8), null);
                break;
            case 4:
                hl.a aVar = this.f201254d;
                boolean z14 = aVar instanceof hl.a.b;
                f.c cVar = this.f201252b;
                Activity activity = this.f201253c;
                if (z14) {
                    cVar.a(ProductImprovementConsentActivity.a.a(ProductImprovementConsentActivity.f32230h, activity, aVar, 4), null);
                } else if (d1.f()) {
                    d1.o(activity, new xk1.v(12));
                } else {
                    cVar.a(ProductImprovementConsentActivity.a.a(ProductImprovementConsentActivity.f32230h, activity, null, 6), null);
                }
                break;
            default:
                this.f201252b.a(ConsentActivity.a.b(ConsentActivity.f32155r, this.f201253c, q92.x.DI_CONNECT_AUTO_ACTIVITY_DETECTION, false, this.f201254d, 8), null);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ t1(f.c cVar, Activity activity, hl.a aVar, int i14) {
        this.f201251a = i14;
        this.f201252b = cVar;
        this.f201253c = activity;
        this.f201254d = aVar;
    }
}
