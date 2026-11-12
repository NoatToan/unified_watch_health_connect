package com.mapbox.maps.extension.compose.annotation.generated;

import com.mapbox.maps.extension.compose.annotation.internal.generated.PointAnnotationManagerNode;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationOptions;
import e23.p;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class PointAnnotationGroupKt$PointAnnotationGroup$8$1 extends w implements p<PointAnnotationManagerNode, List<? extends PointAnnotationOptions>, Unit> {
    public static final PointAnnotationGroupKt$PointAnnotationGroup$8$1 INSTANCE = new PointAnnotationGroupKt$PointAnnotationGroup$8$1();

    public PointAnnotationGroupKt$PointAnnotationGroup$8$1() {
        super(2);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(PointAnnotationManagerNode pointAnnotationManagerNode, List<? extends PointAnnotationOptions> list) {
        invoke2(pointAnnotationManagerNode, (List<PointAnnotationOptions>) list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PointAnnotationManagerNode pointAnnotationManagerNode, List<PointAnnotationOptions> list) {
        pointAnnotationManagerNode.getClass();
        list.getClass();
        pointAnnotationManagerNode.setAnnotationClusterItems(list);
    }
}
