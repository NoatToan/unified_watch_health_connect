package com.mapbox.maps.extension.compose.style.imports;

import com.mapbox.maps.extension.compose.style.StyleColorTheme;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class StyleImportsScope$StyleImport$4$4 extends w implements p<StyleImportNode, StyleColorTheme, Unit> {
    public static final StyleImportsScope$StyleImport$4$4 INSTANCE = new StyleImportsScope$StyleImport$4$4();

    public StyleImportsScope$StyleImport$4$4() {
        super(2);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(StyleImportNode styleImportNode, StyleColorTheme styleColorTheme) {
        invoke2(styleImportNode, styleColorTheme);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(StyleImportNode styleImportNode, StyleColorTheme styleColorTheme) {
        styleImportNode.getClass();
        styleColorTheme.getClass();
        styleImportNode.updateColorTheme$extension_compose_release(styleColorTheme);
    }
}
