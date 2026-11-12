package androidx.health.connect.client.records;

import androidx.health.connect.client.units.Length;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcm;
import defpackage.zcp;
import java.time.Instant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Landroidx/health/connect/client/records/ExerciseLap;", "", "startTime", "Ljava/time/Instant;", "endTime", "length", "Landroidx/health/connect/client/units/Length;", "<init>", "(Ljava/time/Instant;Ljava/time/Instant;Landroidx/health/connect/client/units/Length;)V", "getStartTime", "()Ljava/time/Instant;", "getEndTime", "getLength", "()Landroidx/health/connect/client/units/Length;", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExerciseLap {
    private final Instant endTime;
    private final Length length;
    private final Instant startTime;

    public ExerciseLap(Instant instant, Instant instant2, Length length) {
        zcp.c(instant, "");
        zcp.c(instant2, "");
        this.startTime = instant;
        this.endTime = instant2;
        this.length = length;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.".toString());
        }
        if (length != null) {
            double meters = length.getMeters();
            if (0.0d > meters || meters > 1000000.0d) {
                throw new IllegalArgumentException("length valid range: 0-1000000.".toString());
            }
        }
    }

    public /* synthetic */ ExerciseLap(Instant instant, Instant instant2, Length length, int i, zcm zcmVar) {
        this(instant, instant2, (i & 4) != 0 ? null : length);
    }

    public final Instant getStartTime() {
        return this.startTime;
    }

    public final Instant getEndTime() {
        return this.endTime;
    }

    public final Length getLength() {
        return this.length;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseLap)) {
            return false;
        }
        ExerciseLap exerciseLap = (ExerciseLap) other;
        return zcp.b(this.startTime, exerciseLap.startTime) && zcp.b(this.endTime, exerciseLap.endTime) && zcp.b(this.length, exerciseLap.length);
    }

    public int hashCode() {
        int iHashCode = this.startTime.hashCode();
        int iHashCode2 = this.endTime.hashCode();
        Length length = this.length;
        return (((iHashCode * 31) + iHashCode2) * 31) + (length != null ? length.hashCode() : 0);
    }

    public String toString() {
        return "ExerciseLap(startTime=" + this.startTime + ", endTime=" + this.endTime + ", length=" + this.length + g4.l;
    }
}
