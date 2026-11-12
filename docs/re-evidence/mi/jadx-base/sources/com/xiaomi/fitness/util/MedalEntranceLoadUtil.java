package com.xiaomi.fitness.util;

import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.medal.export.data.MedalEntrance;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.util.MedalEntranceLoadUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/util/MedalEntranceLoadUtil;", "", "<init>", "()V", "TAG", "", "getMedalEntranceData", "", "onPageCallback", "Lcom/xiaomi/fitness/util/OnPageCallback;", "Lcom/xiaomi/fitness/medal/export/data/MedalEntrance;", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MedalEntranceLoadUtil {

    @NotNull
    public static final MedalEntranceLoadUtil INSTANCE = new MedalEntranceLoadUtil();

    @NotNull
    private static final String TAG = "MedalEntranceLoadUtil";

    private MedalEntranceLoadUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMedalEntranceData$lambda$0(OnPageCallback onPageCallback, MedalEntrance medalEntrance) {
        Intrinsics.checkNotNullParameter(onPageCallback, "$onPageCallback");
        Logger.d(TAG, "getMedalEntranceV4 medalEntrance=" + medalEntrance);
        onPageCallback.showSuccess(medalEntrance);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMedalEntranceData$lambda$1(OnPageCallback onPageCallback, ApiException it) {
        Intrinsics.checkNotNullParameter(onPageCallback, "$onPageCallback");
        Intrinsics.checkNotNullParameter(it, "it");
        onPageCallback.showLoadError(it);
        return Unit.INSTANCE;
    }

    public final void getMedalEntranceData(@NotNull final OnPageCallback<MedalEntrance> onPageCallback) {
        Intrinsics.checkNotNullParameter(onPageCallback, "onPageCallback");
        if (!NetworkUtils.isNetworkConnected(ApplicationExtKt.getApplication())) {
            onPageCallback.showNetworkNotConnected();
            return;
        }
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            onPageCallback.showNotLoggedIn();
            return;
        }
        if (!RegionPreference.INSTANCE.getSyncWeb()) {
            onPageCallback.showWebSyncServiceDisabled();
        } else if (AppUtil.INSTANCE.isPlayChannel() || !Intrinsics.areEqual("cn", RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion())) {
            onPageCallback.showPlayChannel();
        } else {
            onPageCallback.showLoading();
            MedalManagerExtKt.getInstance(MedalManager.INSTANCE).getMedalEntranceV4(new Function1() { // from class: adf
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MedalEntranceLoadUtil.getMedalEntranceData$lambda$0(onPageCallback, (MedalEntrance) obj);
                }
            }, new Function1() { // from class: bdf
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MedalEntranceLoadUtil.getMedalEntranceData$lambda$1(onPageCallback, (ApiException) obj);
                }
            });
        }
    }
}
