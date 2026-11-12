package com.mapbox.maps.extension.compose.style.imports;

import com.mapbox.maps.extension.compose.style.ImportConfigs;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class StyleImportsScope$StyleImport$4$3 extends w implements p<StyleImportNode, ImportConfigs, Unit> {
    final /* synthetic */ StyleImportState $styleImportState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleImportsScope$StyleImport$4$3(StyleImportState styleImportState) {
        super(2);
        this.$styleImportState = styleImportState;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(StyleImportNode styleImportNode, ImportConfigs importConfigs) {
        styleImportNode.getClass();
        styleImportNode.updateConfigs$extension_compose_release(this.$styleImportState.getImportConfigs());
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(StyleImportNode styleImportNode, ImportConfigs importConfigs) {
        invoke2(styleImportNode, importConfigs);
        return Unit.INSTANCE;
    }
}
