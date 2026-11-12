package w11;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusSummaryActivity;
import java.lang.annotation.Annotation;
import lc.u0;
import m12.t;
import m63.b0;
import m63.f1;
import m63.m0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.p0;
import w61.x;
import wt1.u;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181196a;

    public /* synthetic */ b(int i14) {
        this.f181196a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f181196a) {
            case 0:
                return p0.n(Boolean.FALSE);
            case 1:
                w12.a.b bVar = w12.a.Companion;
                t[] tVarArrValues = t.values();
                tVarArrValues.getClass();
                return new b0("com.garmin.android.apps.connectmobile.userprofile.domain.ProfilePrivacyItemType", tVarArrValues);
            case 2:
                w12.a.b bVar2 = w12.a.Companion;
                PrivacyType[] privacyTypeArrValues = PrivacyType.values();
                privacyTypeArrValues.getClass();
                return new b0("com.garmin.android.apps.connectmobile.activities.PrivacyType", privacyTypeArrValues);
            case 3:
                w12.a.b bVar3 = w12.a.Companion;
                PrivacyType[] privacyTypeArrValues2 = PrivacyType.values();
                privacyTypeArrValues2.getClass();
                return new m63.e(new b0("com.garmin.android.apps.connectmobile.activities.PrivacyType", privacyTypeArrValues2));
            case 4:
                w12.a.b bVar4 = w12.a.Companion;
                return new m63.e(m0.f116981a);
            case 5:
                w12.d.Companion aVar = w12.d.INSTANCE;
                t0 t0Var = s0.f105811a;
                return new i63.g("com.garmin.android.apps.connectmobile.userprofile.presentation.profile.privacy.ProfilePrivacyRoute", t0Var.b(w12.d.class), new k23.d[]{t0Var.b(w12.d.b.class), t0Var.b(w12.d.c.class)}, new i63.c[]{new f1("com.garmin.android.apps.connectmobile.userprofile.presentation.profile.privacy.ProfilePrivacyRoute.ProfilePrivacy", w12.d.b.INSTANCE, new Annotation[0]), w12.d.c.a.f181270a}, new Annotation[0]);
            case 6:
                return new f1("com.garmin.android.apps.connectmobile.userprofile.presentation.profile.privacy.ProfilePrivacyRoute.ProfilePrivacy", w12.d.b.INSTANCE, new Annotation[0]);
            case 7:
                u4.d dVar = w21.m.f181559a;
                return Float.valueOf(0.25f);
            case 8:
                return new f1("com.garmin.android.apps.connectmobile.vo2.reports.presentation.VO2MaxReportsNavigation.Reports", w32.d.INSTANCE, new Annotation[0]);
            case 9:
                return u0.g(d60.b.f57806c);
            case 10:
                return new f1("com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivitiesNavigation.PendingActivities", com.garmin.android.apps.connectmobile.pending.activities.presentation.a.C0723a.INSTANCE, new Annotation[0]);
            case 11:
                return Unit.INSTANCE;
            case 12:
                return p0.n(Boolean.FALSE);
            case 13:
                return p0.n(Boolean.FALSE);
            case 14:
                return Unit.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                return Unit.INSTANCE;
            case 17:
                return Unit.INSTANCE;
            case 18:
                return Unit.INSTANCE;
            case 19:
                return Unit.INSTANCE;
            case 20:
                return Unit.INSTANCE;
            case 21:
                return Unit.INSTANCE;
            case 22:
                return Unit.INSTANCE;
            case 23:
                return Unit.INSTANCE;
            case 24:
                return Unit.INSTANCE;
            case 25:
                TrainingStatusSummaryActivity.a aVar2 = TrainingStatusSummaryActivity.f40068w;
                f12.l.f68084a.getClass();
                f12.l.a.a().N2(false);
                return Unit.INSTANCE;
            case 26:
                TrainingStatusSummaryActivity.a aVar3 = TrainingStatusSummaryActivity.f40068w;
                return Unit.INSTANCE;
            case 27:
                int i14 = x.O0;
                return new y0();
            case 28:
                int i15 = x.O0;
                return (u) KoinJavaComponent.get$default(u.class, null, null, 6, null);
            default:
                return Unit.INSTANCE;
        }
    }
}
