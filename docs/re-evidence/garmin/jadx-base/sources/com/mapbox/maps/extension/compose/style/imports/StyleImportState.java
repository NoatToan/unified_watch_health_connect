package com.mapbox.maps.extension.compose.style.imports;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.compose.style.ImportConfigs;
import com.mapbox.maps.extension.compose.style.StyleColorTheme;
import p005kotlin.Metadata;
import p3.p0;
import p3.p1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B#\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nR/\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R1\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u0019\u0010\r\u0012\u0004\b\u001e\u0010\n\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/mapbox/maps/extension/compose/style/imports/StyleImportState;", "", "Lcom/mapbox/maps/extension/compose/style/ImportConfigs;", "initialImportConfigs", "Lcom/mapbox/maps/extension/compose/style/imports/StyleImportInteractionsState;", "initialStyleImportInteractionsState", "Lcom/mapbox/maps/extension/compose/style/StyleColorTheme;", "initialColorTheme", "<init>", "(Lcom/mapbox/maps/extension/compose/style/ImportConfigs;Lcom/mapbox/maps/extension/compose/style/imports/StyleImportInteractionsState;Lcom/mapbox/maps/extension/compose/style/StyleColorTheme;)V", "()V", "<set-?>", "importConfigs$delegate", "Lp3/p1;", "getImportConfigs", "()Lcom/mapbox/maps/extension/compose/style/ImportConfigs;", "setImportConfigs", "(Lcom/mapbox/maps/extension/compose/style/ImportConfigs;)V", "importConfigs", "interactionsState$delegate", "getInteractionsState", "()Lcom/mapbox/maps/extension/compose/style/imports/StyleImportInteractionsState;", "setInteractionsState", "(Lcom/mapbox/maps/extension/compose/style/imports/StyleImportInteractionsState;)V", "interactionsState", "styleColorTheme$delegate", "getStyleColorTheme", "()Lcom/mapbox/maps/extension/compose/style/StyleColorTheme;", "setStyleColorTheme", "(Lcom/mapbox/maps/extension/compose/style/StyleColorTheme;)V", "getStyleColorTheme$annotations", "styleColorTheme", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StyleImportState {

    /* JADX INFO: renamed from: importConfigs$delegate, reason: from kotlin metadata */
    private final p1 importConfigs;

    /* JADX INFO: renamed from: interactionsState$delegate, reason: from kotlin metadata */
    private final p1 interactionsState;

    /* JADX INFO: renamed from: styleColorTheme$delegate, reason: from kotlin metadata */
    private final p1 styleColorTheme;

    public StyleImportState(ImportConfigs importConfigs, StyleImportInteractionsState styleImportInteractionsState, StyleColorTheme styleColorTheme) {
        styleImportInteractionsState.getClass();
        styleColorTheme.getClass();
        this.importConfigs = p0.n(importConfigs);
        this.interactionsState = p0.n(styleImportInteractionsState);
        this.styleColorTheme = p0.n(styleColorTheme);
    }

    @MapboxExperimental
    public static /* synthetic */ void getStyleColorTheme$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImportConfigs getImportConfigs() {
        return (ImportConfigs) this.importConfigs.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final StyleImportInteractionsState getInteractionsState() {
        return (StyleImportInteractionsState) this.interactionsState.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final StyleColorTheme getStyleColorTheme() {
        return (StyleColorTheme) this.styleColorTheme.getF182175a();
    }

    public final void setImportConfigs(ImportConfigs importConfigs) {
        this.importConfigs.setValue(importConfigs);
    }

    public final void setInteractionsState(StyleImportInteractionsState styleImportInteractionsState) {
        styleImportInteractionsState.getClass();
        this.interactionsState.setValue(styleImportInteractionsState);
    }

    public final void setStyleColorTheme(StyleColorTheme styleColorTheme) {
        styleColorTheme.getClass();
        this.styleColorTheme.setValue(styleColorTheme);
    }

    public StyleImportState() {
        this(null, new StyleImportInteractionsState(), StyleColorTheme.STYLE_DEFAULT);
    }
}
