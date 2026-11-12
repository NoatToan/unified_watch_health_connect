package com.mapbox.maps.extension.compose.annotation.generated;

import com.mapbox.geojson.Point;
import com.mapbox.maps.extension.compose.annotation.internal.generated.PolygonAnnotationNode;
import e23.p;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class PolygonAnnotationKt$PolygonAnnotation$7$1 extends w implements p<PolygonAnnotationNode, List<? extends List<? extends Point>>, Unit> {
    public static final PolygonAnnotationKt$PolygonAnnotation$7$1 INSTANCE = new PolygonAnnotationKt$PolygonAnnotation$7$1();

    public PolygonAnnotationKt$PolygonAnnotation$7$1() {
        super(2);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PolygonAnnotationNode polygonAnnotationNode, List<? extends List<Point>> list) {
        polygonAnnotationNode.getClass();
        list.getClass();
        polygonAnnotationNode.getAnnotation().setPoints(list);
        polygonAnnotationNode.getAnnotationManager().update(polygonAnnotationNode.getAnnotation());
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(PolygonAnnotationNode polygonAnnotationNode, List<? extends List<? extends Point>> list) {
        invoke2(polygonAnnotationNode, (List<? extends List<Point>>) list);
        return Unit.INSTANCE;
    }
}
