package com.huami.bluetooth.profile.ecf.data;

import com.huami.assistant.ocr.camera.CameraActivity;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.watch.companion.mediac.Command;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u0013\u0010#\u001a\u00020 8F@\u0006¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010'\u001a\u00020$8F@\u0006¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/NowTimeConfig;", "", "", "component1", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "component2", "component3", "enable", "start", Command.STOP, "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "getEnable", "()Z", "setEnable", "(Z)V", "b", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "getStart", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "setStart", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;)V", "c", "getStop", "setStop", "", "getBytes", "()[B", HTTP.CONTENT_RANGE_BYTES, "Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;", "getGeneral", "()Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;", CameraActivity.CONTENT_TYPE_GENERAL, "<init>", "(ZLcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NowTimeConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private boolean enable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private Time start;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private Time stop;

    public NowTimeConfig() {
        this(false, null, null, 7, null);
    }

    public NowTimeConfig(boolean z, @NotNull Time time, @NotNull Time time2) {
        this.enable = z;
        this.start = time;
        this.stop = time2;
    }

    public static /* synthetic */ NowTimeConfig copy$default(NowTimeConfig nowTimeConfig, boolean z, Time time, Time time2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nowTimeConfig.enable;
        }
        if ((i & 2) != 0) {
            time = nowTimeConfig.start;
        }
        if ((i & 4) != 0) {
            time2 = nowTimeConfig.stop;
        }
        return nowTimeConfig.copy(z, time, time2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Time getStart() {
        return this.start;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Time getStop() {
        return this.stop;
    }

    @NotNull
    public final NowTimeConfig copy(boolean enable, @NotNull Time start, @NotNull Time stop) {
        return new NowTimeConfig(enable, start, stop);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NowTimeConfig)) {
            return false;
        }
        NowTimeConfig nowTimeConfig = (NowTimeConfig) other;
        return this.enable == nowTimeConfig.enable && Intrinsics.areEqual(this.start, nowTimeConfig.start) && Intrinsics.areEqual(this.stop, nowTimeConfig.stop);
    }

    @NotNull
    public final byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(ByteUtilsKt.toInt(getEnable()));
        if (getEnable()) {
            byteArrayOutputStream.write(getStart().getHour());
            byteArrayOutputStream.write(getStart().getMinute());
            byteArrayOutputStream.write(getStop().getHour());
            byteArrayOutputStream.write(getStop().getMinute());
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final General getGeneral() {
        General general = new General();
        general.setHourlyAnnounceSwitch(Boolean.valueOf(getEnable()));
        general.setHourlyAnnounceStartTime(getStart());
        general.setHourlyAnnounceStopTime(getStop());
        return general;
    }

    @NotNull
    public final Time getStart() {
        return this.start;
    }

    @NotNull
    public final Time getStop() {
        return this.stop;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + this.start.hashCode()) * 31) + this.stop.hashCode();
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setStart(@NotNull Time time) {
        this.start = time;
    }

    public final void setStop(@NotNull Time time) {
        this.stop = time;
    }

    @NotNull
    public String toString() {
        return "NowTimeConfig(enable=" + this.enable + ", start=" + this.start + ", stop=" + this.stop + ')';
    }

    public /* synthetic */ NowTimeConfig(boolean z, Time time, Time time2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new Time(8, 0) : time, (i & 4) != 0 ? new Time(21, 0) : time2);
    }
}
