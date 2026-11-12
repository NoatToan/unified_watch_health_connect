package com.huami.device.core.sync.impl.sync.hub;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.AbsSensorHubDevice;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/device/core/sync/impl/sync/hub/HmSensorHubDevice;", "Lcom/xiaomi/hm/health/bt/device/AbsSensorHubDevice;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final class HmSensorHubDevice extends AbsSensorHubDevice {
    public HmSensorHubDevice(@NotNull Context context) {
        super(context);
    }
}
