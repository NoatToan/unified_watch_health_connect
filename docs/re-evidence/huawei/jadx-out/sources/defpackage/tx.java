package defpackage;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/braintreepayments/api/HttpResponseTiming;", "", "startTime", "", "endTime", "(JJ)V", "getEndTime", "()J", "setEndTime", "(J)V", "getStartTime", "setStartTime", "component1", "component2", "copy", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "toString", "", "SharedUtils_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class tx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f49748b;
    private long d;

    public tx(long j, long j2) {
        this.d = j;
        this.f49748b = j2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getF49748b() {
        return this.f49748b;
    }

    public String toString() {
        return "HttpResponseTiming(startTime=" + this.d + ", endTime=" + this.f49748b + g4.l;
    }

    public int hashCode() {
        return (Long.hashCode(this.d) * 31) + Long.hashCode(this.f49748b);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof tx)) {
            return false;
        }
        tx txVar = (tx) other;
        return this.d == txVar.d && this.f49748b == txVar.f49748b;
    }
}
