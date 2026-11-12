package com.mapbox.maps.extension.compose.style.standard;

import com.mapbox.maps.extension.compose.style.BooleanValue;
import p005kotlin.Metadata;
import p3.p0;
import p3.p1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tR+\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0017\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u001b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/standard/StandardStyleConfigurationState;", "Lcom/mapbox/maps/extension/compose/style/standard/BaseStyleConfigurationState;", "Lcom/mapbox/maps/extension/compose/style/standard/ThemeValue;", "initialTheme", "Lcom/mapbox/maps/extension/compose/style/BooleanValue;", "initialShow3dObjects", "initialShowLandmarkIcons", "<init>", "(Lcom/mapbox/maps/extension/compose/style/standard/ThemeValue;Lcom/mapbox/maps/extension/compose/style/BooleanValue;Lcom/mapbox/maps/extension/compose/style/BooleanValue;)V", "()V", "<set-?>", "theme$delegate", "Lp3/p1;", "getTheme", "()Lcom/mapbox/maps/extension/compose/style/standard/ThemeValue;", "setTheme", "(Lcom/mapbox/maps/extension/compose/style/standard/ThemeValue;)V", StandardStyleConfigurationState.CONFIG_THEME, "show3dObjects$delegate", "getShow3dObjects", "()Lcom/mapbox/maps/extension/compose/style/BooleanValue;", "setShow3dObjects", "(Lcom/mapbox/maps/extension/compose/style/BooleanValue;)V", StandardStyleConfigurationState.CONFIG_SHOW_3D_OBJECTS, "showLandmarkIcons$delegate", "getShowLandmarkIcons", "setShowLandmarkIcons", StandardStyleConfigurationState.CONFIG_SHOW_LANDMARK_ICON, "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StandardStyleConfigurationState extends BaseStyleConfigurationState {
    public static final String CONFIG_SHOW_3D_OBJECTS = "show3dObjects";
    public static final String CONFIG_SHOW_LANDMARK_ICON = "showLandmarkIcons";
    public static final String CONFIG_THEME = "theme";

    /* JADX INFO: renamed from: show3dObjects$delegate, reason: from kotlin metadata */
    private final p1 show3dObjects;

    /* JADX INFO: renamed from: showLandmarkIcons$delegate, reason: from kotlin metadata */
    private final p1 showLandmarkIcons;

    /* JADX INFO: renamed from: theme$delegate, reason: from kotlin metadata */
    private final p1 theme;

    private StandardStyleConfigurationState(ThemeValue themeValue, BooleanValue booleanValue, BooleanValue booleanValue2) {
        super(null, null, null, null, null, null, 63, null);
        this.theme = p0.n(themeValue);
        this.show3dObjects = p0.n(booleanValue);
        this.showLandmarkIcons = p0.n(booleanValue2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BooleanValue getShow3dObjects() {
        return (BooleanValue) this.show3dObjects.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BooleanValue getShowLandmarkIcons() {
        return (BooleanValue) this.showLandmarkIcons.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ThemeValue getTheme() {
        return (ThemeValue) this.theme.getF182175a();
    }

    public final void setShow3dObjects(BooleanValue booleanValue) {
        booleanValue.getClass();
        this.show3dObjects.setValue(booleanValue);
    }

    public final void setShowLandmarkIcons(BooleanValue booleanValue) {
        booleanValue.getClass();
        this.showLandmarkIcons.setValue(booleanValue);
    }

    public final void setTheme(ThemeValue themeValue) {
        themeValue.getClass();
        this.theme.setValue(themeValue);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StandardStyleConfigurationState() {
        ThemeValue themeValue = ThemeValue.INITIAL;
        BooleanValue booleanValue = BooleanValue.INITIAL;
        this(themeValue, booleanValue, booleanValue);
    }
}
