package defpackage;

import java.util.Arrays;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wp, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u000f"}, d2 = {"Lwp;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "rawData", "Ljava/util/Calendar;", "timeStam", "<init>", "([BLjava/util/Calendar;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class RawData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final byte[] rawData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final Calendar timeStam;

    public RawData(@NotNull byte[] rawData, @NotNull Calendar timeStam) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        Intrinsics.checkNotNullParameter(timeStam, "timeStam");
        this.rawData = rawData;
        this.timeStam = timeStam;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawData)) {
            return false;
        }
        RawData rawData = (RawData) other;
        return Intrinsics.areEqual(this.rawData, rawData.rawData) && Intrinsics.areEqual(this.timeStam, rawData.timeStam);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.rawData) * 31) + this.timeStam.hashCode();
    }

    @NotNull
    public String toString() {
        return "RawData(rawData=" + Arrays.toString(this.rawData) + ", timeStam=" + this.timeStam + ')';
    }
}
