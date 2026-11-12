package bv0;

import android.content.Context;
import java.lang.annotation.Annotation;
import java.util.UUID;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21276a;

    public /* synthetic */ b(int i14) {
        this.f21276a = i14;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    @Override // e23.a
    public final Object invoke() {
        boolean z14;
        switch (this.f21276a) {
            case 0:
                return new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.PastSessionsPrivacy", a.r.INSTANCE, new Annotation[0]);
            case 1:
                return new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.ProfileAndPrivacy", a.s.INSTANCE, new Annotation[0]);
            case 2:
                return new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.Recipients", a.t.INSTANCE, new Annotation[0]);
            case 3:
                return new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.SavedSessionPrivacy", a.u.INSTANCE, new Annotation[0]);
            case 4:
                return new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.SessionName", a.x.INSTANCE, new Annotation[0]);
            case 5:
                return new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.SharingOptions", a.y.INSTANCE, new Annotation[0]);
            case 6:
                return new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.SharingOptionsSetup", a.z.INSTANCE, new Annotation[0]);
            case 7:
                return new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.StravaBeaconSetup", a.a0.INSTANCE, new Annotation[0]);
            case 8:
                rt1.l.f154545a.getClass();
                rt1.l.b("GarminCoachActivityFeedItemView");
                return Unit.INSTANCE;
            case 9:
                rt1.l.f154545a.getClass();
                rt1.l.a("GarminCoachEventCardView");
                return Unit.INSTANCE;
            case 10:
                int i14 = by0.a.f21686d;
                return (ey0.g0) Scope.get$default(xy2.b.v(), p005kotlin.jvm.internal.s0.f105811a.b(ey0.g0.class), (Qualifier) null, (e23.a) null, 6, (Object) null);
            case 11:
                int i15 = by0.a.f21686d;
                return (by0.g2) Scope.get$default(xy2.b.v(), p005kotlin.jvm.internal.s0.f105811a.b(by0.g2.class), (Qualifier) null, (e23.a) null, 6, (Object) null);
            case 12:
                int i16 = by0.a.f21686d;
                return (a22.i) Scope.get$default(xy2.b.v(), p005kotlin.jvm.internal.s0.f105811a.b(a22.i.class), (Qualifier) null, (e23.a) null, 6, (Object) null);
            case 13:
                bz0.o oVar = bz0.o.f22274a;
                return Boolean.valueOf(((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).c("gcm_oauth2_enabled"));
            case 14:
                bz0.o oVar2 = bz0.o.f22274a;
                if (!((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).c("gcm_oauth2_for_sync_enabled")) {
                    bz0.o.f22274a.getClass();
                    z14 = bz0.o.h().a();
                }
                return Boolean.valueOf(z14);
            case 15:
                return UUID.randomUUID().toString();
            case 16:
                return Unit.INSTANCE;
            case 17:
                c.o oVar3 = c.o.f22333a;
                return null;
            case 18:
                c.p pVar = c.p.f22335a;
                return null;
            case 19:
                c42.b.Companion c0350b = c42.b.INSTANCE;
                return new m63.e(new i63.e(p005kotlin.jvm.internal.s0.f105811a.b(sd2.f.class), new Annotation[0]));
            case 20:
                return p3.p0.n(Boolean.FALSE);
            case 21:
                return p3.p0.n(Boolean.FALSE);
            case 22:
                return new m63.f1("com.garmin.android.apps.connectmobile.vo2.reports.presentation.onboarding.VO2MaxOnboardingNavigation.InitialStateCheck", c42.n.b.INSTANCE, new Annotation[0]);
            case 23:
                return new m63.f1("com.garmin.android.apps.connectmobile.vo2.reports.presentation.onboarding.VO2MaxOnboardingNavigation.SelectDevice", c42.n.d.INSTANCE, new Annotation[0]);
            case 24:
                return Unit.INSTANCE;
            case 25:
                return Unit.INSTANCE;
            case 26:
                return p3.p0.n(Boolean.FALSE);
            case 27:
                return new pi0.e(((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c());
            case 28:
                return ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
            default:
                int i17 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                return ((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null)).getResources();
        }
    }
}
