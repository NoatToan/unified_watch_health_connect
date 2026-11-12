package com.huami.bluetooth.profile.ecf.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0086\b\u0018\u0000 72\u00020\u0001:\u00017BM\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b5\u00106J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003JO\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000e\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010\u001d\"\u0004\b,\u0010\u001fR\u0019\u0010\u0011\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010'R\u0019\u0010\u0012\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'R\u0013\u00104\u001a\u0002018F@\u0006¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00068"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/StandAlertConfig;", "Ljava/io/Serializable;", "", "component1", "", "component2", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "component3", "component4", "component5", "component6", "component7", "enable", "interval", "startTime", "endTime", "enableDnd", "dndStartTime", "dndEndTime", "copy", "", "toString", "hashCode", "", "other", "equals", "a", "Z", "getEnable", "()Z", "setEnable", "(Z)V", "b", LogUtil.I, "getInterval", "()I", "c", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "getStartTime", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", GoogleApiAvailabilityLight.a, "getEndTime", "e", "getEnableDnd", "setEnableDnd", "f", "getDndStartTime", "g", "getDndEndTime", "", "getBytes", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(ZILcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;ZLcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StandAlertConfig implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int h = 0;
    private static final int i = 1;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private boolean enable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int interval;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final Time startTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final Time endTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private boolean enableDnd;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final Time dndStartTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final Time dndEndTime;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/StandAlertConfig$Companion;", "", "Lcom/xiaomi/hm/health/bt/model/HMSedentaryConfig;", "Lcom/huami/bluetooth/profile/ecf/data/StandAlertConfig;", "toStandAlertConfig", "", "FLAG_DND_ENABLE_INDEX", LogUtil.I, "FLAG_ENABLE_INDEX", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final StandAlertConfig toStandAlertConfig(@NotNull HMSedentaryConfig hMSedentaryConfig) {
            return new StandAlertConfig(hMSedentaryConfig.isEnable(), hMSedentaryConfig.getInterval(), new Time(hMSedentaryConfig.getStartIndex() / 60, hMSedentaryConfig.getStartIndex() % 60), new Time(hMSedentaryConfig.getStopIndex() / 60, hMSedentaryConfig.getStartIndex() % 60), hMSedentaryConfig.isPeriodEnable(), new Time(hMSedentaryConfig.getDndStart() / 60, hMSedentaryConfig.getDndStart() % 60), new Time(hMSedentaryConfig.getDndStop() / 60, hMSedentaryConfig.getDndStop() % 60));
        }
    }

    public StandAlertConfig() {
        this(false, 0, null, null, false, null, null, 127, null);
    }

    public StandAlertConfig(boolean z, int i2, @NotNull Time time, @NotNull Time time2, boolean z2, @NotNull Time time3, @NotNull Time time4) {
        this.enable = z;
        this.interval = i2;
        this.startTime = time;
        this.endTime = time2;
        this.enableDnd = z2;
        this.dndStartTime = time3;
        this.dndEndTime = time4;
    }

    public static /* synthetic */ StandAlertConfig copy$default(StandAlertConfig standAlertConfig, boolean z, int i2, Time time, Time time2, boolean z2, Time time3, Time time4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = standAlertConfig.enable;
        }
        if ((i3 & 2) != 0) {
            i2 = standAlertConfig.interval;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            time = standAlertConfig.startTime;
        }
        Time time5 = time;
        if ((i3 & 8) != 0) {
            time2 = standAlertConfig.endTime;
        }
        Time time6 = time2;
        if ((i3 & 16) != 0) {
            z2 = standAlertConfig.enableDnd;
        }
        boolean z3 = z2;
        if ((i3 & 32) != 0) {
            time3 = standAlertConfig.dndStartTime;
        }
        Time time7 = time3;
        if ((i3 & 64) != 0) {
            time4 = standAlertConfig.dndEndTime;
        }
        return standAlertConfig.copy(z, i4, time5, time6, z3, time7, time4);
    }

    @JvmStatic
    @NotNull
    public static final StandAlertConfig toStandAlertConfig(@NotNull HMSedentaryConfig hMSedentaryConfig) {
        return INSTANCE.toStandAlertConfig(hMSedentaryConfig);
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
    public final byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write((ByteUtilsKt.toInt(getEnable()) << 0) | (ByteUtilsKt.toInt(getEnableDnd()) << 1));
        byteArrayOutputStream.write(ByteUtilsKt.toByteArray(getInterval(), 2));
        byteArrayOutputStream.write(getStartTime().getHour());
        byteArrayOutputStream.write(getStartTime().getMinute());
        byteArrayOutputStream.write(getEndTime().getHour());
        byteArrayOutputStream.write(getEndTime().getMinute());
        byteArrayOutputStream.write(getDndStartTime().getHour());
        byteArrayOutputStream.write(getDndStartTime().getMinute());
        byteArrayOutputStream.write(getDndEndTime().getHour());
        byteArrayOutputStream.write(getDndEndTime().getMinute());
        return byteArrayOutputStream.toByteArray();
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
        int iHashCode = ((((((r0 * 31) + this.interval) * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode()) * 31;
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

    public /* synthetic */ StandAlertConfig(boolean z, int i2, Time time, Time time2, boolean z2, Time time3, Time time4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 60 : i2, (i3 & 4) != 0 ? new Time(8, 0) : time, (i3 & 8) != 0 ? new Time(21, 0) : time2, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? new Time(12, 0) : time3, (i3 & 64) != 0 ? new Time(14, 0) : time4);
    }
}
