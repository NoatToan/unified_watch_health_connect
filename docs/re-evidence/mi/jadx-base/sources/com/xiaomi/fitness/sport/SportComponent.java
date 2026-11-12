package com.xiaomi.fitness.sport;

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
import com.xiaomi.fitness.sport.scheme.LocalScheme;
import com.xiaomi.fitness.sport.scheme.SportLaunchPageIntentHandler;
import com.xiaomi.fitness.sport.view.RebootSportKt;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import com.xiaomi.fitness.sport_manager_export.SportRouterKt;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.ISportManagerPreference;
import defpackage.xfl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\tH\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001a\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0013\u001a\u00020\tH\u0007R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/sport/SportComponent;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "init", "", "app", "Landroid/app/Application;", "registerHandler", "registerActivityLifecycle", RebootSportKt.TAG, DailyRecordKey.sportType, "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "addStartSportShortcut", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "运动")
@SourceDebugExtension({"SMAP\nSportComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportComponent.kt\ncom/xiaomi/fitness/sport/SportComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,197:1\n1#2:198\n*E\n"})
public final class SportComponent {

    @NotNull
    private final String TAG = "SportComponent";

    /* JADX INFO: Access modifiers changed from: private */
    public final void rebootSport(int sportType, Activity activity) {
        ISportRemoteState sportManagerExtKt = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE);
        if (sportManagerExtKt.hasOngoingSport() && sportManagerExtKt.getSportLaunchType() == 0) {
            Logger.i(this.TAG, "rebootSport sportType : " + sportType);
            if (sportType != 1 && sportType != 2) {
                if (sportType == 3) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("LOCAL_DEVICE_LAUNCH", false);
                    bundle.putInt("DEVICE_TYPE", 0);
                    bundle.putBoolean("IS_SHOW_ANIMATION", false);
                    bundle.putBoolean("IS_REBOOT_SPORT", true);
                    bundle.putInt("WEAR_MODE", SportManagerExtKt.getInstance(ISportManagerPreference.INSTANCE).getLaunchSportWearMode());
                    bundle.putInt("KEY_SPORT_TYPE", 3);
                    if (activity != null) {
                        SportRouterKt.startIndoorSportActivity$default(activity, null, bundle, 2, null);
                        return;
                    }
                    return;
                }
                if (sportType != 6) {
                    return;
                }
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("KEY_SPORT_TYPE", sportType);
            bundle2.putBoolean("IS_REBOOT_SPORT", true);
            bundle2.putInt("WEAR_MODE", SportManagerExtKt.getInstance(ISportManagerPreference.INSTANCE).getLaunchSportWearMode());
            if (activity != null) {
                SportRouterKt.startCommonSportActivity$default(activity, null, bundle2, 2, null);
            }
        }
    }

    private final void registerActivityLifecycle(Application app) {
        app.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.xiaomi.fitness.sport.SportComponent.registerActivityLifecycle.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (Intrinsics.areEqual(activity.getComponentName().getShortClassName(), AppManager.INSTANCE.getInstance().getMainActivity())) {
                    SportComponent.this.rebootSport(SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).getSportType(), activity);
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

    @ComponentTask(notLaterThan = 4, onMainThread = false)
    public final void addStartSportShortcut() {
        SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).addLaunchSportShortcut();
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
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE);
        registerActivityLifecycle(app);
    }

    @ComponentTask(notEarlierThan = 3, onMainThread = false)
    public final void registerHandler() {
        xfl.a().d(new LocalScheme());
        xfl.a().d(new SportLaunchPageIntentHandler());
    }
}
