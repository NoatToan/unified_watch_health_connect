package t30;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ClimbDTO f162166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f162167c;

    public /* synthetic */ e(ClimbDTO climbDTO, int i14, int i15) {
        this.f162165a = i15;
        this.f162166b = climbDTO;
        this.f162167c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f162165a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                i.d(this.f162166b, mVar, p0.t(this.f162167c | 1));
                break;
            default:
                i.e(this.f162166b, mVar, p0.t(this.f162167c | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
