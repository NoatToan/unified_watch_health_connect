package com.xiaomi.hm.health.di.koin.module.device.settings;

import androidx.fragment.app.FragmentManager;
import com.huami.phone_call.sms.DeviceStatus;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/module/device/settings/PhoneCallReplyDeviceStatus;", "Lcom/huami/phone_call/sms/DeviceStatus;", "", "containerId", "Landroidx/fragment/app/FragmentManager;", "fm", "Lkotlin/Function1;", "", "", "onEnableChanged", "initStatusFragment", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PhoneCallReplyDeviceStatus implements DeviceStatus {
    @Override // com.huami.phone_call.sms.DeviceStatus
    public void initStatusFragment(int containerId, @NotNull FragmentManager fm, @NotNull final Function1<? super Boolean, Unit> onEnableChanged) {
        BTStatusFragment.newInstance(containerId, fm).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.di.koin.module.device.settings.PhoneCallReplyDeviceStatus.initStatusFragment.1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                onEnableChanged.invoke(Boolean.valueOf(enable));
            }
        });
    }
}
