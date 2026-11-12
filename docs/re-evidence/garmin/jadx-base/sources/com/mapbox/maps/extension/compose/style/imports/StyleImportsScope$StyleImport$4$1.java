package com.mapbox.maps.extension.compose.style.imports;

import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class StyleImportsScope$StyleImport$4$1 extends w implements p<StyleImportNode, String, Unit> {
    public static final StyleImportsScope$StyleImport$4$1 INSTANCE = new StyleImportsScope$StyleImport$4$1();

    public StyleImportsScope$StyleImport$4$1() {
        super(2);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(StyleImportNode styleImportNode, String str) {
        invoke2(styleImportNode, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(StyleImportNode styleImportNode, String str) {
        styleImportNode.getClass();
        str.getClass();
        styleImportNode.updateImportId$extension_compose_release(str);
    }
}
