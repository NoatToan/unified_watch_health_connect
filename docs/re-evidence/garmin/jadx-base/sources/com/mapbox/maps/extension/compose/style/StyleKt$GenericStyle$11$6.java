package com.mapbox.maps.extension.compose.style;

import com.mapbox.maps.TransitionOptions;
import com.mapbox.maps.extension.compose.style.internal.MapStyleNode;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class StyleKt$GenericStyle$11$6 extends w implements p<MapStyleNode, TransitionOptions, Unit> {
    public static final StyleKt$GenericStyle$11$6 INSTANCE = new StyleKt$GenericStyle$11$6();

    public StyleKt$GenericStyle$11$6() {
        super(2);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(MapStyleNode mapStyleNode, TransitionOptions transitionOptions) {
        invoke2(mapStyleNode, transitionOptions);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapStyleNode mapStyleNode, TransitionOptions transitionOptions) {
        mapStyleNode.getClass();
        transitionOptions.getClass();
        mapStyleNode.updateStyleTransition$extension_compose_release(transitionOptions);
    }
}
