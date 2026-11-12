package ws1;

import com.garmin.android.apps.connectmobile.trails.presentation.UserTrailReviewsActivity;
import e23.p;
import g02.d;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.v;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserTrailReviewsActivity f186953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f186954c;

    public /* synthetic */ c(UserTrailReviewsActivity userTrailReviewsActivity, long j8, int i14) {
        this.f186952a = i14;
        this.f186953b = userTrailReviewsActivity;
        this.f186954c = j8;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f186952a;
        long j8 = this.f186954c;
        UserTrailReviewsActivity userTrailReviewsActivity = this.f186953b;
        int i15 = 1;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                int i16 = UserTrailReviewsActivity.f45087a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(-1528865218, new c(userTrailReviewsActivity, j8, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                int i17 = UserTrailReviewsActivity.f45087a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    v.a(d.f74342a.c(userTrailReviewsActivity.getOnBackPressedDispatcher()), f.c(-2096385666, new d70.n(j8, 3), mVar), mVar, 56);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
