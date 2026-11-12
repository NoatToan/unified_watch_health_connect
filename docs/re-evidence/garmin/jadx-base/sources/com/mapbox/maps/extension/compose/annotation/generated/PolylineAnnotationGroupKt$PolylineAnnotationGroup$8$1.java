package com.mapbox.maps.extension.compose.annotation.generated;

import com.mapbox.maps.extension.compose.annotation.internal.generated.PolylineAnnotationManagerNode;
import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotationOptions;
import e23.p;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class PolylineAnnotationGroupKt$PolylineAnnotationGroup$8$1 extends w implements p<PolylineAnnotationManagerNode, List<? extends PolylineAnnotationOptions>, Unit> {
    public static final PolylineAnnotationGroupKt$PolylineAnnotationGroup$8$1 INSTANCE = new PolylineAnnotationGroupKt$PolylineAnnotationGroup$8$1();

    public PolylineAnnotationGroupKt$PolylineAnnotationGroup$8$1() {
        super(2);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(PolylineAnnotationManagerNode polylineAnnotationManagerNode, List<? extends PolylineAnnotationOptions> list) {
        invoke2(polylineAnnotationManagerNode, (List<PolylineAnnotationOptions>) list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PolylineAnnotationManagerNode polylineAnnotationManagerNode, List<PolylineAnnotationOptions> list) {
        polylineAnnotationManagerNode.getClass();
        list.getClass();
        polylineAnnotationManagerNode.setAnnotationClusterItems(list);
    }
}
