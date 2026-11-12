package com.mapbox.maps.extension.compose.annotation.generated;

import com.mapbox.geojson.Point;
import com.mapbox.maps.extension.compose.annotation.internal.generated.PointAnnotationNode;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class PointAnnotationKt$PointAnnotation$7$1 extends w implements p<PointAnnotationNode, Point, Unit> {
    public static final PointAnnotationKt$PointAnnotation$7$1 INSTANCE = new PointAnnotationKt$PointAnnotation$7$1();

    public PointAnnotationKt$PointAnnotation$7$1() {
        super(2);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PointAnnotationNode pointAnnotationNode, Point point) {
        pointAnnotationNode.getClass();
        point.getClass();
        pointAnnotationNode.getAnnotation().setPoint(point);
        pointAnnotationNode.getAnnotationManager().update(pointAnnotationNode.getAnnotation());
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(PointAnnotationNode pointAnnotationNode, Point point) {
        invoke2(pointAnnotationNode, point);
        return Unit.INSTANCE;
    }
}
