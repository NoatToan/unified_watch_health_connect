package com.xiaomi.fitness.sport.view;

import android.content.Intent;
import android.os.Bundle;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.sport.view.RebootSportKt;
import com.xiaomi.fitness.sport.view.sporting.CommonSportActivity;
import com.xiaomi.fitness.sport.view.sporting.IndoorRunningActivity;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0006\u0010\u0006\u001a\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"TAG", "", RebootSportKt.TAG, "", DailyRecordKey.sportType, "", "isAppSupportLaunchSport", "", "sport_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RebootSportKt {

    @NotNull
    public static final String TAG = "rebootSport";

    public static final boolean isAppSupportLaunchSport() {
        int sportType = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).getSportType();
        FitnessLogUtils.i(TAG, "onGoingSoprt is :" + sportType);
        return sportType == 1 || sportType == 2 || sportType == 3 || sportType == 6;
    }

    public static final void rebootSport(int i) {
        ISportRemoteState sportManagerExtKt = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE);
        if (isAppSupportLaunchSport() && sportManagerExtKt.hasOngoingSport() && sportManagerExtKt.getSportLaunchType() == 0) {
            if (i != 3) {
                final Bundle bundle = new Bundle();
                bundle.putInt("KEY_SPORT_TYPE", i);
                bundle.putBoolean("IS_REBOOT_SPORT", true);
                FitnessLogUtils.i(TAG, "sportType : " + i);
                LaunchExtensionKt.startActivity(ApplicationExtKt.getApplication(), (Class<?>) CommonSportActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: ehj
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return RebootSportKt.rebootSport$lambda$1(bundle, (Intent) obj);
                    }
                });
                return;
            }
            final Bundle bundle2 = new Bundle();
            bundle2.putBoolean("LOCAL_DEVICE_LAUNCH", false);
            bundle2.putInt("DEVICE_TYPE", 0);
            bundle2.putBoolean("IS_SHOW_ANIMATION", false);
            bundle2.putBoolean("IS_REBOOT_SPORT", true);
            bundle2.putInt("KEY_SPORT_TYPE", 3);
            FitnessLogUtils.i(TAG, "sportType : " + i);
            LaunchExtensionKt.startActivity(ApplicationExtKt.getApplication(), (Class<?>) IndoorRunningActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: dhj
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RebootSportKt.rebootSport$lambda$0(bundle2, (Intent) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rebootSport$lambda$0(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        it.setFlags(268435456);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rebootSport$lambda$1(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        it.setFlags(268435456);
        return Unit.INSTANCE;
    }
}
