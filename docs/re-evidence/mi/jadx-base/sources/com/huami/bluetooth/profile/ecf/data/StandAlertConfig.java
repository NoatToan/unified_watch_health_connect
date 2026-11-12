package com.huami.bluetooth.profile.ecf.data;

import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import defpackage.c3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010\u0012\n\u0002\b\b\b\u0086\b\u0018\u0000 02\u00020\u0001:\u00011BM\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b.\u0010/J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003JO\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b%\u0010$R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b(\u0010$R\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b)\u0010$R\u0011\u0010-\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00062"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/StandAlertConfig;", "Ljava/io/Serializable;", "", "component1", "", "component2", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "component3", "component4", "component5", "component6", "component7", "enable", "interval", "startTime", "endTime", "enableDnd", "dndStartTime", "dndEndTime", "copy", "", "toString", "hashCode", "", "other", "equals", "Z", "getEnable", "()Z", "setEnable", "(Z)V", "I", "getInterval", "()I", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "getStartTime", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "getEndTime", "getEnableDnd", "setEnableDnd", "getDndStartTime", "getDndEndTime", "", "getBytes", "()[B", "bytes", "<init>", "(ZILcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;ZLcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class StandAlertConfig implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int FLAG_DND_ENABLE_INDEX = 1;
    private static final int FLAG_ENABLE_INDEX = 0;
    private static final long serialVersionUID = 1;

    @NotNull
    private final Time dndEndTime;

    @NotNull
    private final Time dndStartTime;
    private boolean enable;
    private boolean enableDnd;

    @NotNull
    private final Time endTime;
    private final int interval;

    @NotNull
    private final Time startTime;

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.ecf.data.StandAlertConfig$a, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/StandAlertConfig$a;", "", "Lcom/xiaomi/hm/health/bt/model/HMSedentaryConfig;", "Lcom/huami/bluetooth/profile/ecf/data/StandAlertConfig;", PluginDeviceInfo.FMODEL, "", "FLAG_DND_ENABLE_INDEX", "I", "FLAG_ENABLE_INDEX", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final StandAlertConfig a(@NotNull HMSedentaryConfig hMSedentaryConfig) {
            Intrinsics.checkNotNullParameter(hMSedentaryConfig, "<this>");
            return new StandAlertConfig(hMSedentaryConfig.isEnable(), hMSedentaryConfig.getInterval(), new Time(hMSedentaryConfig.getStartIndex() / 60, hMSedentaryConfig.getStartIndex() % 60), new Time(hMSedentaryConfig.getStopIndex() / 60, hMSedentaryConfig.getStartIndex() % 60), hMSedentaryConfig.isPeriodEnable(), new Time(hMSedentaryConfig.getDndStart() / 60, hMSedentaryConfig.getDndStart() % 60), new Time(hMSedentaryConfig.getDndStop() / 60, hMSedentaryConfig.getDndStop() % 60));
        }
    }

    public StandAlertConfig() {
        this(false, 0, null, null, false, null, null, 127, null);
    }

    public static /* synthetic */ StandAlertConfig copy$default(StandAlertConfig standAlertConfig, boolean z, int i, Time time, Time time2, boolean z2, Time time3, Time time4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = standAlertConfig.enable;
        }
        if ((i2 & 2) != 0) {
            i = standAlertConfig.interval;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            time = standAlertConfig.startTime;
        }
        Time time5 = time;
        if ((i2 & 8) != 0) {
            time2 = standAlertConfig.endTime;
        }
        Time time6 = time2;
        if ((i2 & 16) != 0) {
            z2 = standAlertConfig.enableDnd;
        }
        boolean z3 = z2;
        if ((i2 & 32) != 0) {
            time3 = standAlertConfig.dndStartTime;
        }
        Time time7 = time3;
        if ((i2 & 64) != 0) {
            time4 = standAlertConfig.dndEndTime;
        }
        return standAlertConfig.copy(z, i3, time5, time6, z3, time7, time4);
    }

    @JvmStatic
    @NotNull
    public static final StandAlertConfig toStandAlertConfig(@NotNull HMSedentaryConfig hMSedentaryConfig) {
        return INSTANCE.a(hMSedentaryConfig);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getInterval() {
        return this.interval;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Time getStartTime() {
        return this.startTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Time getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEnableDnd() {
        return this.enableDnd;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Time getDndStartTime() {
        return this.dndStartTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Time getDndEndTime() {
        return this.dndEndTime;
    }

    @NotNull
    public final StandAlertConfig copy(boolean enable, int interval, @NotNull Time startTime, @NotNull Time endTime, boolean enableDnd, @NotNull Time dndStartTime, @NotNull Time dndEndTime) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(dndStartTime, "dndStartTime");
        Intrinsics.checkNotNullParameter(dndEndTime, "dndEndTime");
        return new StandAlertConfig(enable, interval, startTime, endTime, enableDnd, dndStartTime, dndEndTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StandAlertConfig)) {
            return false;
        }
        StandAlertConfig standAlertConfig = (StandAlertConfig) other;
        return this.enable == standAlertConfig.enable && this.interval == standAlertConfig.interval && Intrinsics.areEqual(this.startTime, standAlertConfig.startTime) && Intrinsics.areEqual(this.endTime, standAlertConfig.endTime) && this.enableDnd == standAlertConfig.enableDnd && Intrinsics.areEqual(this.dndStartTime, standAlertConfig.dndStartTime) && Intrinsics.areEqual(this.dndEndTime, standAlertConfig.dndEndTime);
    }

    @NotNull
    public final byte[] getBytes() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(c3.b(this.enable) | (c3.b(this.enableDnd) << 1));
        byteArrayOutputStream.write(c3.a(this.interval, 2));
        byteArrayOutputStream.write(this.startTime.getHour());
        byteArrayOutputStream.write(this.startTime.getMinute());
        byteArrayOutputStream.write(this.endTime.getHour());
        byteArrayOutputStream.write(this.endTime.getMinute());
        byteArrayOutputStream.write(this.dndStartTime.getHour());
        byteArrayOutputStream.write(this.dndStartTime.getMinute());
        byteArrayOutputStream.write(this.dndEndTime.getHour());
        byteArrayOutputStream.write(this.dndEndTime.getMinute());
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "ByteArrayOutputStream().…          }.toByteArray()");
        return byteArray;
    }

    @NotNull
    public final Time getDndEndTime() {
        return this.dndEndTime;
    }

    @NotNull
    public final Time getDndStartTime() {
        return this.dndStartTime;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final boolean getEnableDnd() {
        return this.enableDnd;
    }

    @NotNull
    public final Time getEndTime() {
        return this.endTime;
    }

    public final int getInterval() {
        return this.interval;
    }

    @NotNull
    public final Time getStartTime() {
        return this.startTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((((((r0 * 31) + Integer.hashCode(this.interval)) * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode()) * 31;
        boolean z2 = this.enableDnd;
        return ((((iHashCode + (z2 ? 1 : z2)) * 31) + this.dndStartTime.hashCode()) * 31) + this.dndEndTime.hashCode();
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setEnableDnd(boolean z) {
        this.enableDnd = z;
    }

    @NotNull
    public String toString() {
        return "StandAlertConfig(enable=" + this.enable + ", interval=" + this.interval + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", enableDnd=" + this.enableDnd + ", dndStartTime=" + this.dndStartTime + ", dndEndTime=" + this.dndEndTime + ')';
    }

    public StandAlertConfig(boolean z, int i, @NotNull Time startTime, @NotNull Time endTime, boolean z2, @NotNull Time dndStartTime, @NotNull Time dndEndTime) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(dndStartTime, "dndStartTime");
        Intrinsics.checkNotNullParameter(dndEndTime, "dndEndTime");
        this.enable = z;
        this.interval = i;
        this.startTime = startTime;
        this.endTime = endTime;
        this.enableDnd = z2;
        this.dndStartTime = dndStartTime;
        this.dndEndTime = dndEndTime;
    }

    public /* synthetic */ StandAlertConfig(boolean z, int i, Time time, Time time2, boolean z2, Time time3, Time time4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 60 : i, (i2 & 4) != 0 ? new Time(8, 0) : time, (i2 & 8) != 0 ? new Time(21, 0) : time2, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? new Time(12, 0) : time3, (i2 & 64) != 0 ? new Time(14, 0) : time4);
    }
}
