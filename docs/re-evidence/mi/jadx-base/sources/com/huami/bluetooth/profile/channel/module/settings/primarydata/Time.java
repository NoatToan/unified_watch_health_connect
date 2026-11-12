package com.huami.bluetooth.profile.channel.module.settings.primarydata;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001#B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b \u0010!J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IPrimaryData;", "Ljava/io/Serializable;", "Ljava/io/ByteArrayOutputStream;", "bos", "", "write", "", "checkValid", "", "component1", "component2", "hour", "minute", "copy", "", "toString", "hashCode", "", "other", "equals", "I", "getHour", "()I", "setHour", "(I)V", "getMinute", "setMinute", "containDesc", "Z", "getContainDesc", "()Z", "<init>", "(II)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class Time implements IPrimaryData, Serializable {
    private static final int HOUR_BOUND = 24;
    private static final int MINUTE_BOUND = 60;
    private static final long serialVersionUID = 1;
    private final boolean containDesc;
    private int hour;
    private int minute;

    public Time(int i, int i2) {
        this.hour = i;
        this.minute = i2;
    }

    public static /* synthetic */ Time copy$default(Time time, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = time.hour;
        }
        if ((i3 & 2) != 0) {
            i2 = time.minute;
        }
        return time.copy(i, i2);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public boolean checkValid() {
        int i;
        int i2 = this.hour;
        return i2 >= 0 && i2 < 25 && (i = this.minute) >= 0 && i < 61;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHour() {
        return this.hour;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinute() {
        return this.minute;
    }

    @NotNull
    public final Time copy(int hour, int minute) {
        return new Time(hour, minute);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Time)) {
            return false;
        }
        Time time = (Time) other;
        return this.hour == time.hour && this.minute == time.minute;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public boolean getContainDesc() {
        return this.containDesc;
    }

    public final int getHour() {
        return this.hour;
    }

    public final int getMinute() {
        return this.minute;
    }

    public int hashCode() {
        return (Integer.hashCode(this.hour) * 31) + Integer.hashCode(this.minute);
    }

    public final void setHour(int i) {
        this.hour = i;
    }

    public final void setMinute(int i) {
        this.minute = i;
    }

    @NotNull
    public String toString() {
        return "Time(hour=" + this.hour + ", minute=" + this.minute + ')';
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public void write(@NotNull ByteArrayOutputStream bos) {
        Intrinsics.checkNotNullParameter(bos, "bos");
        bos.write(48);
        bos.write(this.hour);
        bos.write(this.minute);
    }
}
