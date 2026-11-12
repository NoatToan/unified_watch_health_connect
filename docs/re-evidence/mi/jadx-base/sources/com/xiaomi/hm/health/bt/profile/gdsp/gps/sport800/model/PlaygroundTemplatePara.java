package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J_\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\fHÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundTemplatePara;", "", "radius", "", "straightwayLength", "centerPoint", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GPSPointCoorInt32;", "boundPoints", "", "circleCenterPoint1", "circleCenterPoint2", "latitudeBound", "", "direction", "(FFLcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GPSPointCoorInt32;Ljava/util/List;Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GPSPointCoorInt32;Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GPSPointCoorInt32;IF)V", "getBoundPoints", "()Ljava/util/List;", "getCenterPoint", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GPSPointCoorInt32;", "getCircleCenterPoint1", "getCircleCenterPoint2", "getDirection", "()F", "getLatitudeBound", "()I", "getRadius", "getStraightwayLength", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class PlaygroundTemplatePara {

    @NotNull
    private final List<GPSPointCoorInt32> boundPoints;

    @NotNull
    private final GPSPointCoorInt32 centerPoint;

    @NotNull
    private final GPSPointCoorInt32 circleCenterPoint1;

    @NotNull
    private final GPSPointCoorInt32 circleCenterPoint2;
    private final float direction;
    private final int latitudeBound;
    private final float radius;
    private final float straightwayLength;

    public PlaygroundTemplatePara(float f, float f2, @NotNull GPSPointCoorInt32 centerPoint, @NotNull List<GPSPointCoorInt32> boundPoints, @NotNull GPSPointCoorInt32 circleCenterPoint1, @NotNull GPSPointCoorInt32 circleCenterPoint2, int i, float f3) {
        Intrinsics.checkNotNullParameter(centerPoint, "centerPoint");
        Intrinsics.checkNotNullParameter(boundPoints, "boundPoints");
        Intrinsics.checkNotNullParameter(circleCenterPoint1, "circleCenterPoint1");
        Intrinsics.checkNotNullParameter(circleCenterPoint2, "circleCenterPoint2");
        this.radius = f;
        this.straightwayLength = f2;
        this.centerPoint = centerPoint;
        this.boundPoints = boundPoints;
        this.circleCenterPoint1 = circleCenterPoint1;
        this.circleCenterPoint2 = circleCenterPoint2;
        this.latitudeBound = i;
        this.direction = f3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getStraightwayLength() {
        return this.straightwayLength;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GPSPointCoorInt32 getCenterPoint() {
        return this.centerPoint;
    }

    @NotNull
    public final List<GPSPointCoorInt32> component4() {
        return this.boundPoints;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GPSPointCoorInt32 getCircleCenterPoint1() {
        return this.circleCenterPoint1;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final GPSPointCoorInt32 getCircleCenterPoint2() {
        return this.circleCenterPoint2;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getLatitudeBound() {
        return this.latitudeBound;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getDirection() {
        return this.direction;
    }

    @NotNull
    public final PlaygroundTemplatePara copy(float radius, float straightwayLength, @NotNull GPSPointCoorInt32 centerPoint, @NotNull List<GPSPointCoorInt32> boundPoints, @NotNull GPSPointCoorInt32 circleCenterPoint1, @NotNull GPSPointCoorInt32 circleCenterPoint2, int latitudeBound, float direction) {
        Intrinsics.checkNotNullParameter(centerPoint, "centerPoint");
        Intrinsics.checkNotNullParameter(boundPoints, "boundPoints");
        Intrinsics.checkNotNullParameter(circleCenterPoint1, "circleCenterPoint1");
        Intrinsics.checkNotNullParameter(circleCenterPoint2, "circleCenterPoint2");
        return new PlaygroundTemplatePara(radius, straightwayLength, centerPoint, boundPoints, circleCenterPoint1, circleCenterPoint2, latitudeBound, direction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaygroundTemplatePara)) {
            return false;
        }
        PlaygroundTemplatePara playgroundTemplatePara = (PlaygroundTemplatePara) other;
        return Float.compare(this.radius, playgroundTemplatePara.radius) == 0 && Float.compare(this.straightwayLength, playgroundTemplatePara.straightwayLength) == 0 && Intrinsics.areEqual(this.centerPoint, playgroundTemplatePara.centerPoint) && Intrinsics.areEqual(this.boundPoints, playgroundTemplatePara.boundPoints) && Intrinsics.areEqual(this.circleCenterPoint1, playgroundTemplatePara.circleCenterPoint1) && Intrinsics.areEqual(this.circleCenterPoint2, playgroundTemplatePara.circleCenterPoint2) && this.latitudeBound == playgroundTemplatePara.latitudeBound && Float.compare(this.direction, playgroundTemplatePara.direction) == 0;
    }

    @NotNull
    public final List<GPSPointCoorInt32> getBoundPoints() {
        return this.boundPoints;
    }

    @NotNull
    public final GPSPointCoorInt32 getCenterPoint() {
        return this.centerPoint;
    }

    @NotNull
    public final GPSPointCoorInt32 getCircleCenterPoint1() {
        return this.circleCenterPoint1;
    }

    @NotNull
    public final GPSPointCoorInt32 getCircleCenterPoint2() {
        return this.circleCenterPoint2;
    }

    public final float getDirection() {
        return this.direction;
    }

    public final int getLatitudeBound() {
        return this.latitudeBound;
    }

    public final float getRadius() {
        return this.radius;
    }

    public final float getStraightwayLength() {
        return this.straightwayLength;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.radius) * 31) + Float.hashCode(this.straightwayLength)) * 31) + this.centerPoint.hashCode()) * 31) + this.boundPoints.hashCode()) * 31) + this.circleCenterPoint1.hashCode()) * 31) + this.circleCenterPoint2.hashCode()) * 31) + Integer.hashCode(this.latitudeBound)) * 31) + Float.hashCode(this.direction);
    }

    @NotNull
    public String toString() {
        return "PlaygroundTemplatePara(radius=" + this.radius + ", straightwayLength=" + this.straightwayLength + ", centerPoint=" + this.centerPoint + ", boundPoints=" + this.boundPoints + ", circleCenterPoint1=" + this.circleCenterPoint1 + ", circleCenterPoint2=" + this.circleCenterPoint2 + ", latitudeBound=" + this.latitudeBound + ", direction=" + this.direction + ')';
    }
}
