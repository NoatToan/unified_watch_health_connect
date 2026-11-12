package com.mapbox.maps.extension.compose.annotation.generated;

import com.mapbox.maps.extension.compose.annotation.internal.generated.CircleAnnotationManagerNode;
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotationOptions;
import e23.p;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class CircleAnnotationGroupKt$CircleAnnotationGroup$8$1 extends w implements p<CircleAnnotationManagerNode, List<? extends CircleAnnotationOptions>, Unit> {
    public static final CircleAnnotationGroupKt$CircleAnnotationGroup$8$1 INSTANCE = new CircleAnnotationGroupKt$CircleAnnotationGroup$8$1();

    public CircleAnnotationGroupKt$CircleAnnotationGroup$8$1() {
        super(2);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(CircleAnnotationManagerNode circleAnnotationManagerNode, List<? extends CircleAnnotationOptions> list) {
        invoke2(circleAnnotationManagerNode, (List<CircleAnnotationOptions>) list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CircleAnnotationManagerNode circleAnnotationManagerNode, List<CircleAnnotationOptions> list) {
        circleAnnotationManagerNode.getClass();
        list.getClass();
        circleAnnotationManagerNode.setAnnotationClusterItems(list);
    }
}
