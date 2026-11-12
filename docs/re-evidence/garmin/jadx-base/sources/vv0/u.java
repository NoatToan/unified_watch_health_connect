package vv0;

import com.garmin.android.apps.connectmobile.navigation.more.MoreNavigationRoute;
import com.garmin.android.apps.connectmobile.navigation.more.MoreNavigationRoute$BaseFeatureScreen$$serializer;
import com.garmin.android.apps.connectmobile.navigation.more.TestSearchActivity;
import com.garmin.realtimesettings.app.initialization.RTSInitializationWorker;
import java.lang.annotation.Annotation;
import m63.f1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180483a;

    public /* synthetic */ u(int i14) {
        this.f180483a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f180483a) {
            case 0:
                return new f1("com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingOnboardingNavigation.FinishSetup", v.INSTANCE, new Annotation[0]);
            case 1:
                return new f1("com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingOnboardingNavigation.Genesis", w.INSTANCE, new Annotation[0]);
            case 2:
                return new f1("com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingOnboardingNavigation.OnboardingWizard", x.INSTANCE, new Annotation[0]);
            case 3:
                return new f1("com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingOnboardingNavigation.SelectBehaviours", y.INSTANCE, new Annotation[0]);
            case 4:
                return new f1("com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingOnboardingNavigation.TermsAndConditions", z.INSTANCE, new Annotation[0]);
            case 5:
                return new f1("com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingSettingsNavigation.AutoLogBehaviors", e0.INSTANCE, new Annotation[0]);
            case 6:
                return new f1("com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingSettingsNavigation.EditBehaviors", f0.INSTANCE, new Annotation[0]);
            case 7:
                return new f1("com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingSettingsNavigation.Settings", g0.INSTANCE, new Annotation[0]);
            case 8:
                return new f1("com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingSettingsNavigation.SettingsBehaviors", h0.INSTANCE, new Annotation[0]);
            case 9:
                RTSInitializationWorker.a aVar = RTSInitializationWorker.f52563g;
                int i14 = gt2.c.f79010a;
                return gt2.b.f79005a.h("RTSInitializationWorker");
            case 10:
                RTSInitializationWorker.b bVar = RTSInitializationWorker.b.f52565a;
                return new ue.x.a((Class<? extends androidx.work.d>) RTSInitializationWorker.class);
            case 11:
                return Unit.INSTANCE;
            case 12:
                MoreNavigationRoute.Companion companion = MoreNavigationRoute.Companion;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                return new i63.g("com.garmin.android.apps.connectmobile.navigation.more.MoreNavigationRoute", t0Var.b(MoreNavigationRoute.class), new k23.d[]{t0Var.b(MoreNavigationRoute.BaseFeatureScreen.class), t0Var.b(MoreNavigationRoute.MoreScreen.class), t0Var.b(MoreNavigationRoute.SettingsScreen.class)}, new i63.c[]{MoreNavigationRoute$BaseFeatureScreen$$serializer.f39386a, new f1("com.garmin.android.apps.connectmobile.navigation.more.MoreNavigationRoute.MoreScreen", MoreNavigationRoute.MoreScreen.INSTANCE, new Annotation[0]), new f1("com.garmin.android.apps.connectmobile.navigation.more.MoreNavigationRoute.SettingsScreen", MoreNavigationRoute.SettingsScreen.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 13:
                return new f1("com.garmin.android.apps.connectmobile.navigation.more.MoreNavigationRoute.MoreScreen", MoreNavigationRoute.MoreScreen.INSTANCE, new Annotation[0]);
            case 14:
                return new f1("com.garmin.android.apps.connectmobile.navigation.more.MoreNavigationRoute.SettingsScreen", MoreNavigationRoute.SettingsScreen.INSTANCE, new Annotation[0]);
            case 15:
                int i15 = TestSearchActivity.f39390b;
                return (vy0.r) KoinJavaComponent.get$default(vy0.r.class, null, null, 6, null);
            case 16:
                return new vy2.h();
            case 17:
                return new vy2.m.a();
            case 18:
                return new vy2.q.a();
            case 19:
                return b13.e.f14433a;
            case 20:
                return Unit.INSTANCE;
            case 21:
                return Unit.INSTANCE;
            case 22:
                return null;
            case 23:
                throw new IllegalStateException("ReorderableLazyListState must be used inside ReorderableLazyList");
            case 24:
                w02.c0.c.b bVar2 = w02.c0.c.f181073e;
                return Float.valueOf(0.0f);
            case 25:
                g5.i<w1.a> iVar = w1.b.f181179a;
                return null;
            case 26:
                return p3.p0.n(Boolean.FALSE);
            case 27:
                return p3.p0.n(Boolean.FALSE);
            case 28:
                return p3.p0.n(Boolean.FALSE);
            default:
                return p3.p0.n(Boolean.FALSE);
        }
    }
}
