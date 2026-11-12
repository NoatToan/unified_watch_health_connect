package androidx.health.connect.client.impl.platform.aggregate;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcm;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0086\u0002J\u0006\u0010\u0013\u001a\u00020\u0005J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Landroidx/health/connect/client/impl/platform/aggregate/AvgData;", "", "count", "", "total", "", "<init>", "(ID)V", "getCount", "()I", "setCount", "(I)V", "getTotal", "()D", "setTotal", "(D)V", "plusAssign", "", "value", "average", "component1", "component2", "copy", "equals", "", "other", WatchFaceConstant.HASHCODE, "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AvgData {
    private int count;
    private double total;

    public AvgData(int i, double d) {
        this.count = i;
        this.total = d;
    }

    public /* synthetic */ AvgData(int i, double d, int i2, zcm zcmVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0d : d);
    }

    public final int getCount() {
        return this.count;
    }

    public final double getTotal() {
        return this.total;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setTotal(double d) {
        this.total = d;
    }

    public final void plusAssign(double value) {
        this.count++;
        this.total += value;
    }

    public final double average() {
        return this.total / ((double) this.count);
    }

    public String toString() {
        return "AvgData(count=" + this.count + ", total=" + this.total + g4.l;
    }

    public int hashCode() {
        return (Integer.hashCode(this.count) * 31) + Double.hashCode(this.total);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvgData)) {
            return false;
        }
        AvgData avgData = (AvgData) other;
        return this.count == avgData.count && Double.compare(this.total, avgData.total) == 0;
    }

    public final AvgData copy(int count, double total) {
        return new AvgData(count, total);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public static /* synthetic */ AvgData copy$default(AvgData avgData, int i, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = avgData.count;
        }
        if ((i2 & 2) != 0) {
            d = avgData.total;
        }
        return avgData.copy(i, d);
    }

    public AvgData() {
        this(0, 0.0d, 3, null);
    }
}
