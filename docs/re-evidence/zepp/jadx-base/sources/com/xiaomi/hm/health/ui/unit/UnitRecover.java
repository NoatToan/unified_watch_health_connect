package com.xiaomi.hm.health.ui.unit;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.syncable.DeviceDataRecover;
import com.huami.tools.log.HMLog;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/ui/unit/UnitRecover;", "Lcom/huami/bluetooth/profile/channel/module/syncable/DeviceDataRecover;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "", "recover", "", "a", LogUtil.I, "getTemperatureUnit", "()I", "temperatureUnit", "b", "Z", TdmillHmFragment.ARG_IS_METRIC, "()Z", "<init>", "(IZ)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class UnitRecover implements DeviceDataRecover {

    @NotNull
    private static final String c = "UnitRecover";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int temperatureUnit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isMetric;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "recover tempUnit: " + UnitRecover.this.getTemperatureUnit() + ", ret: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "recover distance unit: " + UnitRecover.this.getIsMetric() + ", ret: " + this.b;
        }
    }

    public UnitRecover(int i, boolean z) {
        this.temperatureUnit = i;
        this.isMetric = z;
    }

    public final int getTemperatureUnit() {
        return this.temperatureUnit;
    }

    /* JADX INFO: renamed from: isMetric, reason: from getter */
    public final boolean getIsMetric() {
        return this.isMetric;
    }

    @Override // com.huami.bluetooth.profile.channel.module.syncable.DeviceDataRecover
    public boolean recover(@NotNull HMMiLiProDevice device) {
        boolean tempUnitSync = device.setTempUnitSync((byte) this.temperatureUnit);
        HMLog.info(c, new a(tempUnitSync));
        boolean distanceUnitSync = device.setDistanceUnitSync(this.isMetric);
        HMLog.info(c, new b(distanceUnitSync));
        return tempUnitSync && distanceUnitSync;
    }
}
