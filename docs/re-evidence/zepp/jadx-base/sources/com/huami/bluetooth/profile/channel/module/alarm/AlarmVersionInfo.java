package com.huami.bluetooth.profile.channel.module.alarm;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J1\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006$"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/alarm/AlarmVersionInfo;", "", "", "isSupportTitle", "isSupportCalendarWorkday", "", "component1", "component2", "", "component3", "component4", "version", "maxCount", "titleStatus", "calendarWorkDayStatus", "copy", "", "toString", "", "hashCode", "other", "equals", "a", ExifInterface.LATITUDE_SOUTH, "getVersion", "()S", "b", "getMaxCount", "c", "B", "getTitleStatus", "()B", GoogleApiAvailabilityLight.a, "getCalendarWorkDayStatus", "<init>", "(SSBB)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AlarmVersionInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final short version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final short maxCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final byte titleStatus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final byte calendarWorkDayStatus;

    public AlarmVersionInfo(short s, short s2, byte b, byte b2) {
        this.version = s;
        this.maxCount = s2;
        this.titleStatus = b;
        this.calendarWorkDayStatus = b2;
    }

    public static /* synthetic */ AlarmVersionInfo copy$default(AlarmVersionInfo alarmVersionInfo, short s, short s2, byte b, byte b2, int i, Object obj) {
        if ((i & 1) != 0) {
            s = alarmVersionInfo.version;
        }
        if ((i & 2) != 0) {
            s2 = alarmVersionInfo.maxCount;
        }
        if ((i & 4) != 0) {
            b = alarmVersionInfo.titleStatus;
        }
        if ((i & 8) != 0) {
            b2 = alarmVersionInfo.calendarWorkDayStatus;
        }
        return alarmVersionInfo.copy(s, s2, b, b2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final short getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final short getMaxCount() {
        return this.maxCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte getTitleStatus() {
        return this.titleStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final byte getCalendarWorkDayStatus() {
        return this.calendarWorkDayStatus;
    }

    @NotNull
    public final AlarmVersionInfo copy(short version, short maxCount, byte titleStatus, byte calendarWorkDayStatus) {
        return new AlarmVersionInfo(version, maxCount, titleStatus, calendarWorkDayStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlarmVersionInfo)) {
            return false;
        }
        AlarmVersionInfo alarmVersionInfo = (AlarmVersionInfo) other;
        return this.version == alarmVersionInfo.version && this.maxCount == alarmVersionInfo.maxCount && this.titleStatus == alarmVersionInfo.titleStatus && this.calendarWorkDayStatus == alarmVersionInfo.calendarWorkDayStatus;
    }

    public final byte getCalendarWorkDayStatus() {
        return this.calendarWorkDayStatus;
    }

    public final short getMaxCount() {
        return this.maxCount;
    }

    public final byte getTitleStatus() {
        return this.titleStatus;
    }

    public final short getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((this.version * 31) + this.maxCount) * 31) + this.titleStatus) * 31) + this.calendarWorkDayStatus;
    }

    public final boolean isSupportCalendarWorkday() {
        return this.calendarWorkDayStatus > 0;
    }

    public final boolean isSupportTitle() {
        return this.titleStatus == 1;
    }

    @NotNull
    public String toString() {
        return "AlarmVersionInfo(version=" + ((int) this.version) + ", maxCount=" + ((int) this.maxCount) + ", titleStatus=" + ((int) this.titleStatus) + ", calendarWorkDayStatus=" + ((int) this.calendarWorkDayStatus) + ')';
    }
}
