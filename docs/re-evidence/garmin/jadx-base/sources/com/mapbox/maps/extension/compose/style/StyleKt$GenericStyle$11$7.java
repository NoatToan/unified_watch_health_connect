package com.mapbox.maps.extension.compose.style;

import com.mapbox.maps.extension.compose.style.internal.MapStyleNode;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class StyleKt$GenericStyle$11$7 extends w implements p<MapStyleNode, StyleColorTheme, Unit> {
    public static final StyleKt$GenericStyle$11$7 INSTANCE = new StyleKt$GenericStyle$11$7();

    public StyleKt$GenericStyle$11$7() {
        super(2);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapStyleNode mapStyleNode, StyleColorTheme styleColorTheme) {
        mapStyleNode.getClass();
        styleColorTheme.getClass();
        mapStyleNode.updateStyleColorTheme$extension_compose_release(styleColorTheme.getColorTheme(), styleColorTheme.isStyleDefault$extension_compose_release());
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(MapStyleNode mapStyleNode, StyleColorTheme styleColorTheme) {
        invoke2(mapStyleNode, styleColorTheme);
        return Unit.INSTANCE;
    }
}
