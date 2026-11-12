package com.xiaomi.hm.health.heartrate;

import android.content.Context;
import com.chenenyu.router.Router;
import com.huami.heartrate.HelperKt;
import com.huami.heartrate.koin.HeartRateScopeKt;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.dataflow.HealthData;
import com.xiaomi.hm.health.atrialfibrillation.AtrialFunctionTools;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.di.koin.module.AccountModuleKt;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000\u001a\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "launchHeartRate", "applicationContext", "", "showAfb", "", "userId", "refreshHeartRateScope", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class HeartRateHelperKt {
    public static final void launchHeartRate(@NotNull Context context) {
        Router.build(RouterHelper.HEART_RATE_PATH).with(HelperKt.parseIntentParams(HMPersonInfo.getInstance().getUserInfo().getUserid(), AccountModuleKt.getAccountService().getRegisterDate() / 1000, HMPersonInfo.getInstance().getUserInfo().getAge())).go(context);
    }

    public static final void refreshHeartRateScope(@NotNull String str) {
        HeartRateScopeKt.closeHrScopeByUserId(str);
    }

    public static final boolean showAfb(@NotNull Context context) {
        return HMDeviceConfig.hasBoundClassicWatch() ? HealthData.isAtrialFibrillation(context) : AtrialFunctionTools.INSTANCE.shouldShowAfb();
    }
}
