package com.xiaomi.fitness.sport_eco;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.sport.view.RebootSportKt;
import com.xiaomi.fitness.sport_eco.scheme.LocalScheme;
import com.xiaomi.fitness.sport_eco_manager_export.SportRouterKt;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import defpackage.xfl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001a\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/SportComponent;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "init", "", "app", "Landroid/app/Application;", "registerActivityLifecycle", RebootSportKt.TAG, DailyRecordKey.sportType, "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "生态链运动")
@SourceDebugExtension({"SMAP\nSportComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportComponent.kt\ncom/xiaomi/fitness/sport_eco/SportComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n1#2:115\n*E\n"})
public final class SportComponent {

    @NotNull
    private final String TAG = "SportComponent";

    /* JADX INFO: Access modifiers changed from: private */
    public final void rebootSport(int sportType, Activity activity) {
        IEcoSportRemoteState sportEcoManagerExtKt = SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE);
        if (sportEcoManagerExtKt.hasOngoingSport() && sportEcoManagerExtKt.getSportLaunchType() == 0) {
            Logger.i(this.TAG, "rebootSport sportType : " + sportType);
            if (sportType == 3) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("LOCAL_DEVICE_LAUNCH", false);
                bundle.putInt("DEVICE_TYPE", 0);
                bundle.putBoolean("IS_SHOW_ANIMATION", false);
                bundle.putBoolean("IS_REBOOT_SPORT", true);
                bundle.putInt("KEY_SPORT_TYPE", 3);
                if (activity != null) {
                    SportRouterKt.startIndoorSportActivity$default(activity, null, bundle, 2, null);
                    return;
                }
                return;
            }
            if (sportType == 7) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("LOCAL_DEVICE_LAUNCH", false);
                bundle2.putInt("DEVICE_TYPE", 0);
                bundle2.putBoolean("IS_SHOW_ANIMATION", false);
                bundle2.putBoolean("IS_REBOOT_SPORT", true);
                bundle2.putInt("KEY_SPORT_TYPE", 7);
                if (activity != null) {
                    SportRouterKt.startIndoorRidingSportActivity$default(activity, null, bundle2, 2, null);
                    return;
                }
                return;
            }
            if (sportType != 14) {
                return;
            }
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("LOCAL_DEVICE_LAUNCH", false);
            bundle3.putInt("DEVICE_TYPE", 0);
            bundle3.putBoolean("IS_SHOW_ANIMATION", false);
            bundle3.putBoolean("IS_REBOOT_SPORT", true);
            bundle3.putInt("KEY_SPORT_TYPE", 14);
            if (activity != null) {
                SportRouterKt.startJumpSportingSportActivity$default(activity, null, bundle3, 2, null);
            }
        }
    }

    private final void registerActivityLifecycle(Application app) {
        app.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.xiaomi.fitness.sport_eco.SportComponent.registerActivityLifecycle.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (Intrinsics.areEqual(activity.getComponentName().getShortClassName(), AppManager.INSTANCE.getInstance().getMainActivity())) {
                    SportComponent.this.rebootSport(SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).getSportType(), activity);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }
        });
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @ComponentTask(notEarlierThan = 7, onMainThread = false)
    public final void init(@NotNull Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        System.setProperty("rx2.purge-period-seconds", "3600");
        FitnessLogUtils.d(this.TAG, "init");
        xfl.a().d(new LocalScheme());
        SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE);
        registerActivityLifecycle(app);
    }
}
