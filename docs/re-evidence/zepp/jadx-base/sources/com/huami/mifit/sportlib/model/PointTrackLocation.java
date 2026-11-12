package com.huami.mifit.sportlib.model;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import defpackage.dz;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/mifit/sportlib/model/PointTrackLocation;", "", "", "component1", "", "component2", "component3", "time", "pointLatitude", "pointLongitude", "copy", "", "toString", "", "hashCode", "other", "", "equals", "J", "getTime", "()J", LogUtil.D, "getPointLatitude", "()D", "getPointLongitude", "<init>", "(JDD)V", "sportlib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PointTrackLocation {
    private final double pointLatitude;
    private final double pointLongitude;
    private final long time;

    public PointTrackLocation(long j, double d, double d2) {
        this.time = j;
        this.pointLatitude = d;
        this.pointLongitude = d2;
    }

    public static /* synthetic */ PointTrackLocation copy$default(PointTrackLocation pointTrackLocation, long j, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = pointTrackLocation.time;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            d = pointTrackLocation.pointLatitude;
        }
        double d3 = d;
        if ((i & 4) != 0) {
            d2 = pointTrackLocation.pointLongitude;
        }
        return pointTrackLocation.copy(j2, d3, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getPointLatitude() {
        return this.pointLatitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getPointLongitude() {
        return this.pointLongitude;
    }

    @NotNull
    public final PointTrackLocation copy(long time, double pointLatitude, double pointLongitude) {
        return new PointTrackLocation(time, pointLatitude, pointLongitude);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointTrackLocation)) {
            return false;
        }
        PointTrackLocation pointTrackLocation = (PointTrackLocation) other;
        return this.time == pointTrackLocation.time && Intrinsics.areEqual((Object) Double.valueOf(this.pointLatitude), (Object) Double.valueOf(pointTrackLocation.pointLatitude)) && Intrinsics.areEqual((Object) Double.valueOf(this.pointLongitude), (Object) Double.valueOf(pointTrackLocation.pointLongitude));
    }

    public final double getPointLatitude() {
        return this.pointLatitude;
    }

    public final double getPointLongitude() {
        return this.pointLongitude;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((b.a(this.time) * 31) + dz.a(this.pointLatitude)) * 31) + dz.a(this.pointLongitude);
    }

    @NotNull
    public String toString() {
        return "PointTrackLocation(time=" + this.time + ", pointLatitude=" + this.pointLatitude + ", pointLongitude=" + this.pointLongitude + ")";
    }
}
