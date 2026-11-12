package com.mapbox.maps.extension.compose.annotation.generated;

import com.mapbox.geojson.Point;
import com.mapbox.maps.extension.compose.annotation.internal.generated.CircleAnnotationNode;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class CircleAnnotationKt$CircleAnnotation$7$1 extends w implements p<CircleAnnotationNode, Point, Unit> {
    public static final CircleAnnotationKt$CircleAnnotation$7$1 INSTANCE = new CircleAnnotationKt$CircleAnnotation$7$1();

    public CircleAnnotationKt$CircleAnnotation$7$1() {
        super(2);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CircleAnnotationNode circleAnnotationNode, Point point) {
        circleAnnotationNode.getClass();
        point.getClass();
        circleAnnotationNode.getAnnotation().setPoint(point);
        circleAnnotationNode.getAnnotationManager().update(circleAnnotationNode.getAnnotation());
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(CircleAnnotationNode circleAnnotationNode, Point point) {
        invoke2(circleAnnotationNode, point);
        return Unit.INSTANCE;
    }
}
