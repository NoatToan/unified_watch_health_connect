package com.mapbox.maps.extension.compose.annotation.generated;

import com.mapbox.geojson.Point;
import com.mapbox.maps.extension.compose.annotation.internal.generated.PolylineAnnotationNode;
import e23.p;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class PolylineAnnotationKt$PolylineAnnotation$7$1 extends w implements p<PolylineAnnotationNode, List<? extends Point>, Unit> {
    public static final PolylineAnnotationKt$PolylineAnnotation$7$1 INSTANCE = new PolylineAnnotationKt$PolylineAnnotation$7$1();

    public PolylineAnnotationKt$PolylineAnnotation$7$1() {
        super(2);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PolylineAnnotationNode polylineAnnotationNode, List<Point> list) {
        polylineAnnotationNode.getClass();
        list.getClass();
        polylineAnnotationNode.getAnnotation().setPoints(list);
        polylineAnnotationNode.getAnnotationManager().update(polylineAnnotationNode.getAnnotation());
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(PolylineAnnotationNode polylineAnnotationNode, List<? extends Point> list) {
        invoke2(polylineAnnotationNode, (List<Point>) list);
        return Unit.INSTANCE;
    }
}
