package vd0;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177337a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityListItemDTO f177338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f177339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f177340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f177341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f177342f;

    public /* synthetic */ o(ActivityListItemDTO activityListItemDTO, boolean z14, String str, String str2, String str3) {
        this.f177338b = activityListItemDTO;
        this.f177339c = z14;
        this.f177340d = str;
        this.f177341e = str2;
        this.f177342f = str3;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f177337a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    p.b(this.f177338b, this.f177339c, this.f177340d, this.f177341e, this.f177342f, mVar, 196608);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                p.b(this.f177338b, this.f177339c, this.f177340d, this.f177341e, this.f177342f, (p3.m) obj, p3.p0.t(196609));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ o(ActivityListItemDTO activityListItemDTO, boolean z14, String str, String str2, String str3, int i14) {
        this.f177338b = activityListItemDTO;
        this.f177339c = z14;
        this.f177340d = str;
        this.f177341e = str2;
        this.f177342f = str3;
    }
}
