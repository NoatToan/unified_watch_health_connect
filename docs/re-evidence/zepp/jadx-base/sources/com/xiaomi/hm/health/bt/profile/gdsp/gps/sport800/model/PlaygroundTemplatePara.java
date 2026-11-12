package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b5\u00106J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\t\u0010\n\u001a\u00020\u0005HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J_\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0019\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\u0010\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0012\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u0019\u0010\u0013\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010&R\u0019\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0015\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010\u001e\u001a\u0004\b4\u0010 ¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundTemplatePara;", "", "", "component1", "component2", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GPSPointCoorInt32;", "component3", "", "component4", "component5", "component6", "", "component7", "component8", "radius", "straightwayLength", "centerPoint", "boundPoints", "circleCenterPoint1", "circleCenterPoint2", "latitudeBound", "direction", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "F", "getRadius", "()F", "b", "getStraightwayLength", "c", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GPSPointCoorInt32;", "getCenterPoint", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GPSPointCoorInt32;", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getBoundPoints", "()Ljava/util/List;", "e", "getCircleCenterPoint1", "f", "getCircleCenterPoint2", "g", LogUtil.I, "getLatitudeBound", "()I", "h", "getDirection", "<init>", "(FFLcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GPSPointCoorInt32;Ljava/util/List;Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GPSPointCoorInt32;Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/GPSPointCoorInt32;IF)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PlaygroundTemplatePara {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final float radius;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float straightwayLength;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final GPSPointCoorInt32 centerPoint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<GPSPointCoorInt32> boundPoints;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final GPSPointCoorInt32 circleCenterPoint1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final GPSPointCoorInt32 circleCenterPoint2;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int latitudeBound;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final float direction;

    public PlaygroundTemplatePara(float f, float f2, @NotNull GPSPointCoorInt32 gPSPointCoorInt32, @NotNull List<GPSPointCoorInt32> list, @NotNull GPSPointCoorInt32 gPSPointCoorInt33, @NotNull GPSPointCoorInt32 gPSPointCoorInt34, int i, float f3) {
        this.radius = f;
        this.straightwayLength = f2;
        this.centerPoint = gPSPointCoorInt32;
        this.boundPoints = list;
        this.circleCenterPoint1 = gPSPointCoorInt33;
        this.circleCenterPoint2 = gPSPointCoorInt34;
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
        return Intrinsics.areEqual((Object) Float.valueOf(this.radius), (Object) Float.valueOf(playgroundTemplatePara.radius)) && Intrinsics.areEqual((Object) Float.valueOf(this.straightwayLength), (Object) Float.valueOf(playgroundTemplatePara.straightwayLength)) && Intrinsics.areEqual(this.centerPoint, playgroundTemplatePara.centerPoint) && Intrinsics.areEqual(this.boundPoints, playgroundTemplatePara.boundPoints) && Intrinsics.areEqual(this.circleCenterPoint1, playgroundTemplatePara.circleCenterPoint1) && Intrinsics.areEqual(this.circleCenterPoint2, playgroundTemplatePara.circleCenterPoint2) && this.latitudeBound == playgroundTemplatePara.latitudeBound && Intrinsics.areEqual((Object) Float.valueOf(this.direction), (Object) Float.valueOf(playgroundTemplatePara.direction));
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
        return (((((((((((((Float.floatToIntBits(this.radius) * 31) + Float.floatToIntBits(this.straightwayLength)) * 31) + this.centerPoint.hashCode()) * 31) + this.boundPoints.hashCode()) * 31) + this.circleCenterPoint1.hashCode()) * 31) + this.circleCenterPoint2.hashCode()) * 31) + this.latitudeBound) * 31) + Float.floatToIntBits(this.direction);
    }

    @NotNull
    public String toString() {
        return "PlaygroundTemplatePara(radius=" + this.radius + ", straightwayLength=" + this.straightwayLength + ", centerPoint=" + this.centerPoint + ", boundPoints=" + this.boundPoints + ", circleCenterPoint1=" + this.circleCenterPoint1 + ", circleCenterPoint2=" + this.circleCenterPoint2 + ", latitudeBound=" + this.latitudeBound + ", direction=" + this.direction + ')';
    }
}
