package com.xiaomi.fitness.sport.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.sport.utils.SportAccessUtils;
import com.xiaomi.fitness.sport.view.launch.LaunchSportActivity;
import com.xiaomi.fitness.sport.view.launch.LaunchSportModel;
import defpackage.clb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\"\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/sport/utils/SportAccessUtils;", "", "<init>", "()V", "launchSportImmediately", "", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", DailyRecordKey.sportType, "", "params", "Landroid/os/Bundle;", "router", "context", "Landroid/content/Context;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportAccessUtils {

    @NotNull
    public static final SportAccessUtils INSTANCE = new SportAccessUtils();

    private SportAccessUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSportImmediately$lambda$0(FragmentActivity fragmentActivity, int i, Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        INSTANCE.router(fragmentActivity, i, bundle);
        return Unit.INSTANCE;
    }

    private final void router(final Context context, final int sportType, final Bundle params) {
        final WearModeWrapper wearModeWrapper = new WearModeWrapper(0);
        SportBeanHelperExtKt.checkAllConnectedDevicesAndSetWearMode(wearModeWrapper, new Function0() { // from class: o9n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportAccessUtils.router$lambda$3(sportType, context, params, wearModeWrapper);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit router$lambda$3(int i, Context context, Bundle bundle, final WearModeWrapper wearModeWrapper) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(wearModeWrapper, "$wearModeWrapper");
        if (i == 6) {
            clb.a(context);
            if (new LaunchSportModel().isShowCtaDialog(context)) {
                return Unit.INSTANCE;
            }
            LaunchExtensionKt.startActivity(context, (Class<?>) LaunchSportActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: l9n
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportAccessUtils.router$lambda$3$lambda$1(wearModeWrapper, (Intent) obj);
                }
            });
        } else {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putInt("KEY_SPORT_TYPE", i);
            bundle2.putString("type", String.valueOf(i));
            bundle2.putInt("WEAR_MODE", wearModeWrapper.getWearMode());
            LaunchSportModel.launchSport$default(new LaunchSportModel(), (FragmentActivity) context, bundle2, null, new Function0() { // from class: m9n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit router$lambda$3$lambda$1(WearModeWrapper wearModeWrapper, Intent it) {
        Intrinsics.checkNotNullParameter(wearModeWrapper, "$wearModeWrapper");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtra("KEY_SPORT_TYPE", 6);
        it.putExtra("type", "6");
        it.putExtra("WEAR_MODE", wearModeWrapper.getWearMode());
        return Unit.INSTANCE;
    }

    public final void launchSportImmediately(@NotNull final FragmentActivity fragmentActivity, final int sportType, @Nullable final Bundle params) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        if (SportUtilsExtKt.perfectInfo(fragmentActivity)) {
            WearModeGuideExtKt.performOperationAndChooseNextOperationType(new RecursionDataModel(0, 0, null, sportType, new Function0() { // from class: n9n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SportAccessUtils.launchSportImmediately$lambda$0(fragmentActivity, sportType, params);
                }
            }, fragmentActivity, 2, null));
        }
    }
}
