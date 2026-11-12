package com.xiaomi.hm.health.nfc;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/nfc/XpDeviceStatusStringProvider;", "Lcom/xiaomi/hm/health/nfc/WalletDeviceStatusStringProvider;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "getUnboundTextForFunction", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class XpDeviceStatusStringProvider extends WalletDeviceStatusStringProvider {
    @Override // com.xiaomi.hm.health.nfc.WalletDeviceStatusStringProvider, com.huami.components.devicestatus.DeviceStatusStringProvider
    @NotNull
    public String getUnboundTextForFunction(@NotNull Context context) {
        return isWatch() ? context.getString(R.string.car_s_watch_bound) : context.getString(R.string.car_s_not_bound);
    }
}
