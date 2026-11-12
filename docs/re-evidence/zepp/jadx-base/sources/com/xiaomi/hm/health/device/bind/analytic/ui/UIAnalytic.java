package com.xiaomi.hm.health.device.bind.analytic.ui;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/bind/analytic/ui/UIAnalytic;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "analyticsDevicePageVisible", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class UIAnalytic {

    @NotNull
    public static final UIAnalytic INSTANCE = new UIAnalytic();

    private UIAnalytic() {
    }

    @JvmStatic
    public static final void analyticsDevicePageVisible(@Nullable HMDeviceSource source) {
        if (source == null || source == HMDeviceSource.VDEVICE) {
            return;
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.SUB_TAB_V).addExtra("tp", StatEvent.SUB_TAB_DEVICE_PAGE).addExtra("source", String.valueOf(source.getValue())));
    }
}
