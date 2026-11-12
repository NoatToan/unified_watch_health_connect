package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nx, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lnx;", "", "", "toString", "", "hashCode", "other", "", "equals", "timestamp", "I", PluginDeviceInfo.FMODEL, "()I", "Ljava/util/TimeZone;", "timezone", "Ljava/util/TimeZone;", PluginDeviceInfo.FDESC, "()Ljava/util/TimeZone;", "<init>", "(ILjava/util/TimeZone;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class WriteDataHistory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final TimeZone timezone;

    public WriteDataHistory(int i, @NotNull TimeZone timezone) {
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        this.timestamp = i;
        this.timezone = timezone;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final TimeZone getTimezone() {
        return this.timezone;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WriteDataHistory)) {
            return false;
        }
        WriteDataHistory writeDataHistory = (WriteDataHistory) other;
        return this.timestamp == writeDataHistory.timestamp && Intrinsics.areEqual(this.timezone, writeDataHistory.timezone);
    }

    public int hashCode() {
        return (Integer.hashCode(this.timestamp) * 31) + this.timezone.hashCode();
    }

    @NotNull
    public String toString() {
        return "WriteDataHistory(timestamp=" + this.timestamp + ", timezone=" + this.timezone + ')';
    }
}
