package com.huami.bluetooth.device.function;

import com.xiaomi.hm.health.bt.profile.base.Mtu;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/device/function/MtuObtain;", "", "Lcom/xiaomi/hm/health/bt/profile/base/Mtu;", "getMtu", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface MtuObtain {
    @Nullable
    Mtu getMtu();
}
