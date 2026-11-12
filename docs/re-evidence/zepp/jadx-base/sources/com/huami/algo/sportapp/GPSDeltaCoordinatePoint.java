package com.huami.algo.sportapp;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.nfc.web.Constant;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/algo/sportapp/GPSDeltaCoordinatePoint;", "", "", "component1", "component2", "", "component3", Constant.KEY_LATITUDE, Constant.KEY_LONGITUDE, "timestamp", "copy", "", "toString", "hashCode", "other", "", "equals", LogUtil.I, "getLatitude", "()I", "getLongitude", "J", "getTimestamp", "()J", "<init>", "(IIJ)V", "sportapp_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GPSDeltaCoordinatePoint {
    private final int latitude;
    private final int longitude;
    private final long timestamp;

    public GPSDeltaCoordinatePoint(int i, int i2, long j) {
        this.latitude = i;
        this.longitude = i2;
        this.timestamp = j;
    }

    public static /* synthetic */ GPSDeltaCoordinatePoint copy$default(GPSDeltaCoordinatePoint gPSDeltaCoordinatePoint, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = gPSDeltaCoordinatePoint.latitude;
        }
        if ((i3 & 2) != 0) {
            i2 = gPSDeltaCoordinatePoint.longitude;
        }
        if ((i3 & 4) != 0) {
            j = gPSDeltaCoordinatePoint.timestamp;
        }
        return gPSDeltaCoordinatePoint.copy(i, i2, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final GPSDeltaCoordinatePoint copy(int latitude, int longitude, long timestamp) {
        return new GPSDeltaCoordinatePoint(latitude, longitude, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GPSDeltaCoordinatePoint)) {
            return false;
        }
        GPSDeltaCoordinatePoint gPSDeltaCoordinatePoint = (GPSDeltaCoordinatePoint) other;
        return this.latitude == gPSDeltaCoordinatePoint.latitude && this.longitude == gPSDeltaCoordinatePoint.longitude && this.timestamp == gPSDeltaCoordinatePoint.timestamp;
    }

    public final int getLatitude() {
        return this.latitude;
    }

    public final int getLongitude() {
        return this.longitude;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((this.latitude * 31) + this.longitude) * 31) + b.a(this.timestamp);
    }

    @NotNull
    public String toString() {
        return "GPSDeltaCoordinatePoint(latitude=" + this.latitude + ", longitude=" + this.longitude + ", timestamp=" + this.timestamp + ")";
    }

    public /* synthetic */ GPSDeltaCoordinatePoint(int i, int i2, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? 0L : j);
    }
}
