package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: s, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0013"}, d2 = {"Ls;", "", "", PluginDeviceInfo.FDESC, PluginDeviceInfo.FMODEL, "", "toString", "", "hashCode", "other", "equals", "", "version", "maxCount", "", "titleStatus", "calendarWorkDayStatus", "<init>", "(SSBB)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class AlarmVersionInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final short version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final short maxCount;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final byte titleStatus;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final byte calendarWorkDayStatus;

    public AlarmVersionInfo(short s, short s2, byte b2, byte b3) {
        this.version = s;
        this.maxCount = s2;
        this.titleStatus = b2;
        this.calendarWorkDayStatus = b3;
    }

    public final boolean a() {
        return this.calendarWorkDayStatus > 0;
    }

    public final boolean b() {
        return this.titleStatus == 1;
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

    public int hashCode() {
        return (((((Short.hashCode(this.version) * 31) + Short.hashCode(this.maxCount)) * 31) + Byte.hashCode(this.titleStatus)) * 31) + Byte.hashCode(this.calendarWorkDayStatus);
    }

    @NotNull
    public String toString() {
        return "AlarmVersionInfo(version=" + ((int) this.version) + ", maxCount=" + ((int) this.maxCount) + ", titleStatus=" + ((int) this.titleStatus) + ", calendarWorkDayStatus=" + ((int) this.calendarWorkDayStatus) + ')';
    }
}
