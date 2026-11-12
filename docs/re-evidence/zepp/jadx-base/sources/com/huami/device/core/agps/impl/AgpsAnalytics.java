package com.huami.device.core.agps.impl;

import com.huami.device.core.agps.AgpsUpgradeBuilder;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tR\u0019\u0010\u0018\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/huami/device/core/agps/impl/AgpsAnalytics;", "", "", "c", "b", "", "event", "Lcom/huami/mifit/analytics/builder/CountEventBuilder;", "a", "", "timeCost", "", "recordDownloadSuccessEvent", "reason", "recordDownloadFailEvent", "recordTransferSuccessEvent", "recordTransferFailureEvent", "recordUpgradeSuccessEvent", "recordRetryEvent", "recordUpgradeFailEvent", "Lcom/huami/device/core/agps/impl/AgpsAnalytics$DeviceProperty;", "Lcom/huami/device/core/agps/impl/AgpsAnalytics$DeviceProperty;", "getProvider", "()Lcom/huami/device/core/agps/impl/AgpsAnalytics$DeviceProperty;", "provider", "<init>", "(Lcom/huami/device/core/agps/impl/AgpsAnalytics$DeviceProperty;)V", "Companion", "DeviceProperty", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final class AgpsAnalytics {
    private static final String b = "FIRMWARE_DOWNLOAD_SUCCESS";
    private static final String c = "FIRMWARE_TRANSFER_SUCCESS";
    private static final String d = "FIRMWARE_UPGRADE_SUCCESS";
    private static final String e = "FIRMWARE_UPGRADE_FAIL_RETRY_C";
    private static final String f = "tp";
    private static final String g = "prefv";
    private static final String h = "battery";
    private static final String i = "source";
    private static final String j = "cost";
    private static final String k = "reason";
    private static final String l = "agps";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceProperty provider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/huami/device/core/agps/impl/AgpsAnalytics$DeviceProperty;", "", "", "getFv", "", "getBattery", "getSource", "", "isConnect", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
    public interface DeviceProperty {
        int getBattery();

        @Nullable
        String getFv();

        int getSource();

        boolean isConnect();
    }

    public AgpsAnalytics(@NotNull DeviceProperty deviceProperty) {
        this.provider = deviceProperty;
    }

    private final CountEventBuilder a(String event) {
        CountEventBuilder anonymous;
        CountEventBuilder countEventBuilder = new CountEventBuilder(event);
        if (c()) {
            countEventBuilder.setIdentified(true);
            anonymous = countEventBuilder.setAnonymous(false);
        } else {
            countEventBuilder.setIdentified(false);
            anonymous = countEventBuilder.setAnonymous(true);
        }
        CountEventBuilder countEventBuilderAddExtra = anonymous.setRealTimeRecord(b()).addExtra("source", String.valueOf(this.provider.getSource()));
        String fv = this.provider.getFv();
        if (fv == null) {
            fv = "";
        }
        return countEventBuilderAddExtra.addExtra("prefv", fv).addExtra("battery", String.valueOf(this.provider.getBattery())).addExtra("tp", l);
    }

    private final boolean b() {
        return true;
    }

    private final boolean c() {
        return AgpsUpgradeBuilder.INSTANCE.isUserIdentified$agps_impl_release();
    }

    @NotNull
    public final DeviceProperty getProvider() {
        return this.provider;
    }

    public final void recordDownloadFailEvent(long timeCost, @NotNull String reason) {
        Analytics.recordEvent(a(StatEvent.FIRMWARE_DOWNLOAD_FAIL).addExtra("cost", String.valueOf(timeCost)).addExtra("reason", reason));
    }

    public final void recordDownloadSuccessEvent(long timeCost) {
        Analytics.recordEvent(a("FIRMWARE_DOWNLOAD_SUCCESS").addExtra("cost", String.valueOf(timeCost)));
    }

    public final void recordRetryEvent(long timeCost) {
        CountEventBuilder countEventBuilderA = a("FIRMWARE_UPGRADE_FAIL_RETRY_C");
        countEventBuilderA.addExtra("cost", String.valueOf(timeCost));
        if (this.provider.isConnect()) {
            countEventBuilderA.addExtra("reason", "transferfail");
        } else {
            countEventBuilderA.addExtra("reason", HMFwOnlineAnalyticsKt.BLE_DISCONNECT);
        }
        Analytics.recordEvent(countEventBuilderA);
    }

    public final void recordTransferFailureEvent(long timeCost) {
        CountEventBuilder countEventBuilderA = a(StatEvent.FIRMWARE_TRANSFER_FAIL);
        countEventBuilderA.addExtra("cost", String.valueOf(timeCost));
        if (this.provider.isConnect()) {
            countEventBuilderA.addExtra("reason", "transferfail");
        } else {
            countEventBuilderA.addExtra("reason", HMFwOnlineAnalyticsKt.BLE_DISCONNECT);
        }
        Analytics.recordEvent(countEventBuilderA);
    }

    public final void recordTransferSuccessEvent(long timeCost) {
        Analytics.recordEvent(a("FIRMWARE_TRANSFER_SUCCESS").addExtra("cost", String.valueOf(timeCost)));
    }

    public final void recordUpgradeFailEvent(long timeCost) {
        Analytics.recordEvent(a(StatEvent.FIRMWARE_UPGRADE_FAIL).addExtra("cost", String.valueOf(timeCost)));
    }

    public final void recordUpgradeSuccessEvent(long timeCost) {
        Analytics.recordEvent(a("FIRMWARE_UPGRADE_SUCCESS").addExtra("cost", String.valueOf(timeCost)));
    }
}
