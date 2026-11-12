package com.mapbox.maps.extension.compose.annotation.generated;

import com.mapbox.maps.extension.compose.annotation.internal.generated.PolygonAnnotationManagerNode;
import com.mapbox.maps.plugin.annotation.generated.PolygonAnnotationOptions;
import e23.p;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class PolygonAnnotationGroupKt$PolygonAnnotationGroup$8$1 extends w implements p<PolygonAnnotationManagerNode, List<? extends PolygonAnnotationOptions>, Unit> {
    public static final PolygonAnnotationGroupKt$PolygonAnnotationGroup$8$1 INSTANCE = new PolygonAnnotationGroupKt$PolygonAnnotationGroup$8$1();

    public PolygonAnnotationGroupKt$PolygonAnnotationGroup$8$1() {
        super(2);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(PolygonAnnotationManagerNode polygonAnnotationManagerNode, List<? extends PolygonAnnotationOptions> list) {
        invoke2(polygonAnnotationManagerNode, (List<PolygonAnnotationOptions>) list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PolygonAnnotationManagerNode polygonAnnotationManagerNode, List<PolygonAnnotationOptions> list) {
        polygonAnnotationManagerNode.getClass();
        list.getClass();
        polygonAnnotationManagerNode.setAnnotationClusterItems(list);
    }
}
