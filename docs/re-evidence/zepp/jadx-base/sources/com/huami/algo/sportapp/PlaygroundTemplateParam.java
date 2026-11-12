package com.huami.algo.sportapp;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00020\u0005`\b\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b.\u0010/J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00020\u0005`\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003Ji\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00052\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00020\u0005`\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001a\u001a\u00020\fHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\u0011\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010$R)\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00020\u0005`\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0013\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b(\u0010$R\u0019\u0010\u0014\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b)\u0010$R\u0019\u0010\u0015\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b-\u0010 ¨\u00060"}, d2 = {"Lcom/huami/algo/sportapp/PlaygroundTemplateParam;", "", "", "component1", "component2", "Lcom/huami/algo/sportapp/GPSDeltaCoordinatePoint;", "component3", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "component4", "component5", "component6", "", "component7", "component8", "radius", "straightwayLength", "centerCoordinatePoint", "boundCoordinatePoints", "circleCenterPoint1", "circleCenterPoint2", "latitudeBound", "direction", "copy", "", "toString", "hashCode", "other", "", "equals", "F", "getRadius", "()F", "getStraightwayLength", "Lcom/huami/algo/sportapp/GPSDeltaCoordinatePoint;", "getCenterCoordinatePoint", "()Lcom/huami/algo/sportapp/GPSDeltaCoordinatePoint;", "Ljava/util/ArrayList;", "getBoundCoordinatePoints", "()Ljava/util/ArrayList;", "getCircleCenterPoint1", "getCircleCenterPoint2", LogUtil.I, "getLatitudeBound", "()I", "getDirection", "<init>", "(FFLcom/huami/algo/sportapp/GPSDeltaCoordinatePoint;Ljava/util/ArrayList;Lcom/huami/algo/sportapp/GPSDeltaCoordinatePoint;Lcom/huami/algo/sportapp/GPSDeltaCoordinatePoint;IF)V", "sportapp_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PlaygroundTemplateParam {

    @NotNull
    private final ArrayList<GPSDeltaCoordinatePoint> boundCoordinatePoints;

    @NotNull
    private final GPSDeltaCoordinatePoint centerCoordinatePoint;

    @NotNull
    private final GPSDeltaCoordinatePoint circleCenterPoint1;

    @NotNull
    private final GPSDeltaCoordinatePoint circleCenterPoint2;
    private final float direction;
    private final int latitudeBound;
    private final float radius;
    private final float straightwayLength;

    public PlaygroundTemplateParam(float f, float f2, @NotNull GPSDeltaCoordinatePoint gPSDeltaCoordinatePoint, @NotNull ArrayList<GPSDeltaCoordinatePoint> arrayList, @NotNull GPSDeltaCoordinatePoint gPSDeltaCoordinatePoint2, @NotNull GPSDeltaCoordinatePoint gPSDeltaCoordinatePoint3, int i, float f3) {
        this.radius = f;
        this.straightwayLength = f2;
        this.centerCoordinatePoint = gPSDeltaCoordinatePoint;
        this.boundCoordinatePoints = arrayList;
        this.circleCenterPoint1 = gPSDeltaCoordinatePoint2;
        this.circleCenterPoint2 = gPSDeltaCoordinatePoint3;
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
    public final GPSDeltaCoordinatePoint getCenterCoordinatePoint() {
        return this.centerCoordinatePoint;
    }

    @NotNull
    public final ArrayList<GPSDeltaCoordinatePoint> component4() {
        return this.boundCoordinatePoints;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GPSDeltaCoordinatePoint getCircleCenterPoint1() {
        return this.circleCenterPoint1;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final GPSDeltaCoordinatePoint getCircleCenterPoint2() {
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
    public final PlaygroundTemplateParam copy(float radius, float straightwayLength, @NotNull GPSDeltaCoordinatePoint centerCoordinatePoint, @NotNull ArrayList<GPSDeltaCoordinatePoint> boundCoordinatePoints, @NotNull GPSDeltaCoordinatePoint circleCenterPoint1, @NotNull GPSDeltaCoordinatePoint circleCenterPoint2, int latitudeBound, float direction) {
        return new PlaygroundTemplateParam(radius, straightwayLength, centerCoordinatePoint, boundCoordinatePoints, circleCenterPoint1, circleCenterPoint2, latitudeBound, direction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaygroundTemplateParam)) {
            return false;
        }
        PlaygroundTemplateParam playgroundTemplateParam = (PlaygroundTemplateParam) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.radius), (Object) Float.valueOf(playgroundTemplateParam.radius)) && Intrinsics.areEqual((Object) Float.valueOf(this.straightwayLength), (Object) Float.valueOf(playgroundTemplateParam.straightwayLength)) && Intrinsics.areEqual(this.centerCoordinatePoint, playgroundTemplateParam.centerCoordinatePoint) && Intrinsics.areEqual(this.boundCoordinatePoints, playgroundTemplateParam.boundCoordinatePoints) && Intrinsics.areEqual(this.circleCenterPoint1, playgroundTemplateParam.circleCenterPoint1) && Intrinsics.areEqual(this.circleCenterPoint2, playgroundTemplateParam.circleCenterPoint2) && this.latitudeBound == playgroundTemplateParam.latitudeBound && Intrinsics.areEqual((Object) Float.valueOf(this.direction), (Object) Float.valueOf(playgroundTemplateParam.direction));
    }

    @NotNull
    public final ArrayList<GPSDeltaCoordinatePoint> getBoundCoordinatePoints() {
        return this.boundCoordinatePoints;
    }

    @NotNull
    public final GPSDeltaCoordinatePoint getCenterCoordinatePoint() {
        return this.centerCoordinatePoint;
    }

    @NotNull
    public final GPSDeltaCoordinatePoint getCircleCenterPoint1() {
        return this.circleCenterPoint1;
    }

    @NotNull
    public final GPSDeltaCoordinatePoint getCircleCenterPoint2() {
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
        return (((((((((((((Float.floatToIntBits(this.radius) * 31) + Float.floatToIntBits(this.straightwayLength)) * 31) + this.centerCoordinatePoint.hashCode()) * 31) + this.boundCoordinatePoints.hashCode()) * 31) + this.circleCenterPoint1.hashCode()) * 31) + this.circleCenterPoint2.hashCode()) * 31) + this.latitudeBound) * 31) + Float.floatToIntBits(this.direction);
    }

    @NotNull
    public String toString() {
        return "PlaygroundTemplateParam(radius=" + this.radius + ", straightwayLength=" + this.straightwayLength + ", centerCoordinatePoint=" + this.centerCoordinatePoint + ", boundCoordinatePoints=" + this.boundCoordinatePoints + ", circleCenterPoint1=" + this.circleCenterPoint1 + ", circleCenterPoint2=" + this.circleCenterPoint2 + ", latitudeBound=" + this.latitudeBound + ", direction=" + this.direction + ")";
    }
}
