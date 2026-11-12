package com.xiaomi.hm.health.device.setting.ui;

import androidx.p010navigation.NavController;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/TelephoneNavAction;", "Lkotlin/Function1;", "Landroidx/navigation/NavController;", "", "nav", "invoke", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TelephoneNavAction implements Function1<NavController, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NavController navController) {
        invoke2(navController);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(@NotNull NavController nav) {
        Feature miliFeature = HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature();
        if (miliFeature.hasSw(20) || miliFeature.hasSw(44)) {
            nav.navigate(R.id.action_to_btPhoneActivity);
        } else {
            nav.navigate(R.id.action_to_incomingCallAlertActivity);
            HMLog.e("NaviActions", "Device FW config error! 固件中未找到支持蓝牙电话协议!", new Object[0]);
        }
    }
}
