package com.mapbox.maps.extension.compose.style.standard;

import com.mapbox.maps.extension.compose.style.BooleanValue;
import com.mapbox.maps.extension.compose.style.StringValue;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p3.p0;
import p3.p1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b'\u0018\u0000 -2\u00020\u0001:\u0001-BE\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR+\u0010\u0014\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0018\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R+\u0010\u001c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R+\u0010 \u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R+\u0010&\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u000f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010,\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u000f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/mapbox/maps/extension/compose/style/standard/BaseStyleConfigurationState;", "", "Lcom/mapbox/maps/extension/compose/style/BooleanValue;", "initialShowPlaceLabels", "initialShowRoadLabels", "initialShowPointOfInterestLabels", "initialShowTransitLabels", "Lcom/mapbox/maps/extension/compose/style/standard/LightPresetValue;", "initialLightPreset", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "initialFont", "<init>", "(Lcom/mapbox/maps/extension/compose/style/BooleanValue;Lcom/mapbox/maps/extension/compose/style/BooleanValue;Lcom/mapbox/maps/extension/compose/style/BooleanValue;Lcom/mapbox/maps/extension/compose/style/BooleanValue;Lcom/mapbox/maps/extension/compose/style/standard/LightPresetValue;Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "<set-?>", "showPlaceLabels$delegate", "Lp3/p1;", "getShowPlaceLabels", "()Lcom/mapbox/maps/extension/compose/style/BooleanValue;", "setShowPlaceLabels", "(Lcom/mapbox/maps/extension/compose/style/BooleanValue;)V", BaseStyleConfigurationState.CONFIG_SHOW_PLACE_LABELS, "showRoadLabels$delegate", "getShowRoadLabels", "setShowRoadLabels", BaseStyleConfigurationState.CONFIG_SHOW_ROAD_LABELS, "showPointOfInterestLabels$delegate", "getShowPointOfInterestLabels", "setShowPointOfInterestLabels", BaseStyleConfigurationState.CONFIG_SHOW_POINT_OF_INTEREST_LABELS, "showTransitLabels$delegate", "getShowTransitLabels", "setShowTransitLabels", BaseStyleConfigurationState.CONFIG_SHOW_TRANSIT_LABELS, "lightPreset$delegate", "getLightPreset", "()Lcom/mapbox/maps/extension/compose/style/standard/LightPresetValue;", "setLightPreset", "(Lcom/mapbox/maps/extension/compose/style/standard/LightPresetValue;)V", BaseStyleConfigurationState.CONFIG_LIGHT_PRESET, "font$delegate", "getFont", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setFont", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", BaseStyleConfigurationState.CONFIG_FONT, "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BaseStyleConfigurationState {
    public static final String CONFIG_FONT = "font";
    public static final String CONFIG_LIGHT_PRESET = "lightPreset";
    public static final String CONFIG_SHOW_PLACE_LABELS = "showPlaceLabels";
    public static final String CONFIG_SHOW_POINT_OF_INTEREST_LABELS = "showPointOfInterestLabels";
    public static final String CONFIG_SHOW_ROAD_LABELS = "showRoadLabels";
    public static final String CONFIG_SHOW_TRANSIT_LABELS = "showTransitLabels";

    /* JADX INFO: renamed from: font$delegate, reason: from kotlin metadata */
    private final p1 font;

    /* JADX INFO: renamed from: lightPreset$delegate, reason: from kotlin metadata */
    private final p1 lightPreset;

    /* JADX INFO: renamed from: showPlaceLabels$delegate, reason: from kotlin metadata */
    private final p1 showPlaceLabels;

    /* JADX INFO: renamed from: showPointOfInterestLabels$delegate, reason: from kotlin metadata */
    private final p1 showPointOfInterestLabels;

    /* JADX INFO: renamed from: showRoadLabels$delegate, reason: from kotlin metadata */
    private final p1 showRoadLabels;

    /* JADX INFO: renamed from: showTransitLabels$delegate, reason: from kotlin metadata */
    private final p1 showTransitLabels;

    public BaseStyleConfigurationState(BooleanValue booleanValue, BooleanValue booleanValue2, BooleanValue booleanValue3, BooleanValue booleanValue4, LightPresetValue lightPresetValue, StringValue stringValue) {
        booleanValue.getClass();
        booleanValue2.getClass();
        booleanValue3.getClass();
        booleanValue4.getClass();
        lightPresetValue.getClass();
        stringValue.getClass();
        this.showPlaceLabels = p0.n(booleanValue);
        this.showRoadLabels = p0.n(booleanValue2);
        this.showPointOfInterestLabels = p0.n(booleanValue3);
        this.showTransitLabels = p0.n(booleanValue4);
        this.lightPreset = p0.n(lightPresetValue);
        this.font = p0.n(stringValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final StringValue getFont() {
        return (StringValue) this.font.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LightPresetValue getLightPreset() {
        return (LightPresetValue) this.lightPreset.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BooleanValue getShowPlaceLabels() {
        return (BooleanValue) this.showPlaceLabels.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BooleanValue getShowPointOfInterestLabels() {
        return (BooleanValue) this.showPointOfInterestLabels.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BooleanValue getShowRoadLabels() {
        return (BooleanValue) this.showRoadLabels.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BooleanValue getShowTransitLabels() {
        return (BooleanValue) this.showTransitLabels.getF182175a();
    }

    public final void setFont(StringValue stringValue) {
        stringValue.getClass();
        this.font.setValue(stringValue);
    }

    public final void setLightPreset(LightPresetValue lightPresetValue) {
        lightPresetValue.getClass();
        this.lightPreset.setValue(lightPresetValue);
    }

    public final void setShowPlaceLabels(BooleanValue booleanValue) {
        booleanValue.getClass();
        this.showPlaceLabels.setValue(booleanValue);
    }

    public final void setShowPointOfInterestLabels(BooleanValue booleanValue) {
        booleanValue.getClass();
        this.showPointOfInterestLabels.setValue(booleanValue);
    }

    public final void setShowRoadLabels(BooleanValue booleanValue) {
        booleanValue.getClass();
        this.showRoadLabels.setValue(booleanValue);
    }

    public final void setShowTransitLabels(BooleanValue booleanValue) {
        booleanValue.getClass();
        this.showTransitLabels.setValue(booleanValue);
    }

    public BaseStyleConfigurationState() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ BaseStyleConfigurationState(BooleanValue booleanValue, BooleanValue booleanValue2, BooleanValue booleanValue3, BooleanValue booleanValue4, LightPresetValue lightPresetValue, StringValue stringValue, int i14, j jVar) {
        this((i14 & 1) != 0 ? BooleanValue.INITIAL : booleanValue, (i14 & 2) != 0 ? BooleanValue.INITIAL : booleanValue2, (i14 & 4) != 0 ? BooleanValue.INITIAL : booleanValue3, (i14 & 8) != 0 ? BooleanValue.INITIAL : booleanValue4, (i14 & 16) != 0 ? LightPresetValue.INITIAL : lightPresetValue, (i14 & 32) != 0 ? StringValue.INITIAL : stringValue);
    }
}
