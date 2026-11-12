package com.mapbox.maps.extension.compose.style.layers.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.compose.style.ColorValue;
import com.mapbox.maps.extension.compose.style.DoubleValue;
import com.mapbox.maps.extension.compose.style.LongValue;
import com.mapbox.maps.extension.compose.style.PropertyTypesKt;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.Transition;
import com.mapbox.maps.extension.compose.style.layers.ImageValue;
import com.mapbox.maps.extension.compose.style.layers.internal.LayerNode;
import e23.p;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bT\b\u0007\u0018\u00002\u00020\u0001Bi\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017B\t\b\u0016¢\u0006\u0004\b\u0016\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\"\u0010!\u0012\u0004\b#\u0010\u0018R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010!R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010!R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010!R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b*\u0010!\u0012\u0004\b+\u0010\u0018R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010!R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00130\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010!R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010!R+\u00106\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b0\u00101\"\u0004\b2\u00103*\u0004\b4\u00105R1\u0010=\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00048F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\b;\u0010\u0018\u001a\u0004\b7\u00108\"\u0004\b9\u0010:*\u0004\b<\u00105R+\u0010C\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A*\u0004\bB\u00105R+\u0010I\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G*\u0004\bH\u00105R+\u0010M\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bJ\u0010?\"\u0004\bK\u0010A*\u0004\bL\u00105R+\u0010Q\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bN\u0010E\"\u0004\bO\u0010G*\u0004\bP\u00105R+\u0010U\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bR\u0010?\"\u0004\bS\u0010A*\u0004\bT\u00105R+\u0010[\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bV\u0010W\"\u0004\bX\u0010Y*\u0004\bZ\u00105R1\u0010b\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000f8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\b`\u0010\u0018\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_*\u0004\ba\u00105R+\u0010h\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bc\u0010d\"\u0004\be\u0010f*\u0004\bg\u00105R+\u0010n\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bi\u0010j\"\u0004\bk\u0010l*\u0004\bm\u00105R+\u0010r\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bo\u0010j\"\u0004\bp\u0010l*\u0004\bq\u00105¨\u0006s"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/layers/generated/BackgroundLayerState;", "", "Lcom/mapbox/maps/extension/compose/style/ColorValue;", "initialBackgroundColor", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "initialBackgroundColorUseTheme", "Lcom/mapbox/maps/extension/compose/style/Transition;", "initialBackgroundColorTransition", "Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "initialBackgroundEmissiveStrength", "initialBackgroundEmissiveStrengthTransition", "initialBackgroundOpacity", "initialBackgroundOpacityTransition", "Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;", "initialBackgroundPattern", "Lcom/mapbox/maps/extension/compose/style/layers/generated/BackgroundPitchAlignmentValue;", "initialBackgroundPitchAlignment", "Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "initialVisibility", "Lcom/mapbox/maps/extension/compose/style/LongValue;", "initialMinZoom", "initialMaxZoom", "<init>", "(Lcom/mapbox/maps/extension/compose/style/ColorValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/DoubleValue;Lcom/mapbox/maps/extension/compose/style/Transition;Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;Lcom/mapbox/maps/extension/compose/style/layers/generated/BackgroundPitchAlignmentValue;Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/LongValue;)V", "()V", "Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;", "layerNode", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;Lp3/m;I)V", "UpdateProperties", "Lp3/p1;", "backgroundColorState", "Lp3/p1;", "backgroundColorUseThemeState", "getBackgroundColorUseThemeState$annotations", "backgroundColorTransitionState", "backgroundEmissiveStrengthState", "backgroundEmissiveStrengthTransitionState", "backgroundOpacityState", "backgroundOpacityTransitionState", "backgroundPatternState", "backgroundPitchAlignmentState", "getBackgroundPitchAlignmentState$annotations", "visibilityState", "minZoomState", "maxZoomState", "<set-?>", "getBackgroundColor", "()Lcom/mapbox/maps/extension/compose/style/ColorValue;", "setBackgroundColor", "(Lcom/mapbox/maps/extension/compose/style/ColorValue;)V", "getBackgroundColor$delegate", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/BackgroundLayerState;)Ljava/lang/Object;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "getBackgroundColorUseTheme", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setBackgroundColorUseTheme", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "getBackgroundColorUseTheme$annotations", "getBackgroundColorUseTheme$delegate", "backgroundColorUseTheme", "getBackgroundColorTransition", "()Lcom/mapbox/maps/extension/compose/style/Transition;", "setBackgroundColorTransition", "(Lcom/mapbox/maps/extension/compose/style/Transition;)V", "getBackgroundColorTransition$delegate", "backgroundColorTransition", "getBackgroundEmissiveStrength", "()Lcom/mapbox/maps/extension/compose/style/DoubleValue;", "setBackgroundEmissiveStrength", "(Lcom/mapbox/maps/extension/compose/style/DoubleValue;)V", "getBackgroundEmissiveStrength$delegate", "backgroundEmissiveStrength", "getBackgroundEmissiveStrengthTransition", "setBackgroundEmissiveStrengthTransition", "getBackgroundEmissiveStrengthTransition$delegate", "backgroundEmissiveStrengthTransition", "getBackgroundOpacity", "setBackgroundOpacity", "getBackgroundOpacity$delegate", "backgroundOpacity", "getBackgroundOpacityTransition", "setBackgroundOpacityTransition", "getBackgroundOpacityTransition$delegate", "backgroundOpacityTransition", "getBackgroundPattern", "()Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;", "setBackgroundPattern", "(Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;)V", "getBackgroundPattern$delegate", "backgroundPattern", "getBackgroundPitchAlignment", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/BackgroundPitchAlignmentValue;", "setBackgroundPitchAlignment", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/BackgroundPitchAlignmentValue;)V", "getBackgroundPitchAlignment$annotations", "getBackgroundPitchAlignment$delegate", "backgroundPitchAlignment", "getVisibility", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "setVisibility", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;)V", "getVisibility$delegate", "visibility", "getMinZoom", "()Lcom/mapbox/maps/extension/compose/style/LongValue;", "setMinZoom", "(Lcom/mapbox/maps/extension/compose/style/LongValue;)V", "getMinZoom$delegate", "minZoom", "getMaxZoom", "setMaxZoom", "getMaxZoom$delegate", "maxZoom", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BackgroundLayerState {
    private final p1<ColorValue> backgroundColorState;
    private final p1<Transition> backgroundColorTransitionState;
    private final p1<StringValue> backgroundColorUseThemeState;
    private final p1<DoubleValue> backgroundEmissiveStrengthState;
    private final p1<Transition> backgroundEmissiveStrengthTransitionState;
    private final p1<DoubleValue> backgroundOpacityState;
    private final p1<Transition> backgroundOpacityTransitionState;
    private final p1<ImageValue> backgroundPatternState;
    private final p1<BackgroundPitchAlignmentValue> backgroundPitchAlignmentState;
    private final p1<LongValue> maxZoomState;
    private final p1<LongValue> minZoomState;
    private final p1<VisibilityValue> visibilityState;

    private BackgroundLayerState(ColorValue colorValue, StringValue stringValue, Transition transition, DoubleValue doubleValue, Transition transition2, DoubleValue doubleValue2, Transition transition3, ImageValue imageValue, BackgroundPitchAlignmentValue backgroundPitchAlignmentValue, VisibilityValue visibilityValue, LongValue longValue, LongValue longValue2) {
        this.backgroundColorState = p0.n(colorValue);
        this.backgroundColorUseThemeState = p0.n(stringValue);
        this.backgroundColorTransitionState = p0.n(transition);
        this.backgroundEmissiveStrengthState = p0.n(doubleValue);
        this.backgroundEmissiveStrengthTransitionState = p0.n(transition2);
        this.backgroundOpacityState = p0.n(doubleValue2);
        this.backgroundOpacityTransitionState = p0.n(transition3);
        this.backgroundPatternState = p0.n(imageValue);
        this.backgroundPitchAlignmentState = p0.n(backgroundPitchAlignmentValue);
        this.visibilityState = p0.n(visibilityValue);
        this.minZoomState = p0.n(longValue);
        this.maxZoomState = p0.n(longValue2);
    }

    @MapboxExperimental
    public static /* synthetic */ void getBackgroundColorUseTheme$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getBackgroundColorUseThemeState$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getBackgroundPitchAlignment$annotations() {
    }

    @MapboxExperimental
    private static /* synthetic */ void getBackgroundPitchAlignmentState$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(LayerNode layerNode, m mVar, int i14) {
        int i15;
        layerNode.getClass();
        o0 o0VarE = mVar.E(-31042655);
        if ((i14 & 14) == 0) {
            i15 = (o0VarE.B(layerNode) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 112) == 0) {
            i15 |= o0VarE.B(this) ? 32 : 16;
        }
        if ((i15 & 91) == 18 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = n.f135158a;
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.backgroundColorState, "background-color", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.backgroundColorUseThemeState, "background-color-use-theme", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.backgroundColorTransitionState, "background-color-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.backgroundEmissiveStrengthState, "background-emissive-strength", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.backgroundEmissiveStrengthTransitionState, "background-emissive-strength-transition", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.backgroundOpacityState, "background-opacity", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.backgroundOpacityTransitionState, "background-opacity-transition", o0VarE, 384);
            PropertyTypesKt.AddImageWhenNotInitial(layerNode, this.backgroundPatternState, "background-pattern", o0VarE, (i15 & 14) | 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.backgroundPitchAlignmentState, "background-pitch-alignment", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.visibilityState, "visibility", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.minZoomState, "minzoom", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.maxZoomState, "maxzoom", o0VarE, 384);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new BackgroundLayerState$UpdateProperties$1(this, layerNode, i14);
    }

    public final ColorValue getBackgroundColor() {
        return this.backgroundColorState.getF182175a();
    }

    public final Transition getBackgroundColorTransition() {
        return this.backgroundColorTransitionState.getF182175a();
    }

    public final StringValue getBackgroundColorUseTheme() {
        return this.backgroundColorUseThemeState.getF182175a();
    }

    public final DoubleValue getBackgroundEmissiveStrength() {
        return this.backgroundEmissiveStrengthState.getF182175a();
    }

    public final Transition getBackgroundEmissiveStrengthTransition() {
        return this.backgroundEmissiveStrengthTransitionState.getF182175a();
    }

    public final DoubleValue getBackgroundOpacity() {
        return this.backgroundOpacityState.getF182175a();
    }

    public final Transition getBackgroundOpacityTransition() {
        return this.backgroundOpacityTransitionState.getF182175a();
    }

    public final ImageValue getBackgroundPattern() {
        return this.backgroundPatternState.getF182175a();
    }

    public final BackgroundPitchAlignmentValue getBackgroundPitchAlignment() {
        return this.backgroundPitchAlignmentState.getF182175a();
    }

    public final LongValue getMaxZoom() {
        return this.maxZoomState.getF182175a();
    }

    public final LongValue getMinZoom() {
        return this.minZoomState.getF182175a();
    }

    public final VisibilityValue getVisibility() {
        return this.visibilityState.getF182175a();
    }

    public final void setBackgroundColor(ColorValue colorValue) {
        colorValue.getClass();
        this.backgroundColorState.setValue(colorValue);
    }

    public final void setBackgroundColorTransition(Transition transition) {
        transition.getClass();
        this.backgroundColorTransitionState.setValue(transition);
    }

    public final void setBackgroundColorUseTheme(StringValue stringValue) {
        stringValue.getClass();
        this.backgroundColorUseThemeState.setValue(stringValue);
    }

    public final void setBackgroundEmissiveStrength(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.backgroundEmissiveStrengthState.setValue(doubleValue);
    }

    public final void setBackgroundEmissiveStrengthTransition(Transition transition) {
        transition.getClass();
        this.backgroundEmissiveStrengthTransitionState.setValue(transition);
    }

    public final void setBackgroundOpacity(DoubleValue doubleValue) {
        doubleValue.getClass();
        this.backgroundOpacityState.setValue(doubleValue);
    }

    public final void setBackgroundOpacityTransition(Transition transition) {
        transition.getClass();
        this.backgroundOpacityTransitionState.setValue(transition);
    }

    public final void setBackgroundPattern(ImageValue imageValue) {
        imageValue.getClass();
        this.backgroundPatternState.setValue(imageValue);
    }

    public final void setBackgroundPitchAlignment(BackgroundPitchAlignmentValue backgroundPitchAlignmentValue) {
        backgroundPitchAlignmentValue.getClass();
        this.backgroundPitchAlignmentState.setValue(backgroundPitchAlignmentValue);
    }

    public final void setMaxZoom(LongValue longValue) {
        longValue.getClass();
        this.maxZoomState.setValue(longValue);
    }

    public final void setMinZoom(LongValue longValue) {
        longValue.getClass();
        this.minZoomState.setValue(longValue);
    }

    public final void setVisibility(VisibilityValue visibilityValue) {
        visibilityValue.getClass();
        this.visibilityState.setValue(visibilityValue);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BackgroundLayerState() {
        ColorValue colorValue = ColorValue.INITIAL;
        StringValue stringValue = StringValue.INITIAL;
        Transition transition = Transition.INITIAL;
        DoubleValue doubleValue = DoubleValue.INITIAL;
        ImageValue imageValue = ImageValue.INITIAL;
        BackgroundPitchAlignmentValue backgroundPitchAlignmentValue = BackgroundPitchAlignmentValue.INITIAL;
        VisibilityValue visibilityValue = VisibilityValue.INITIAL;
        LongValue longValue = LongValue.INITIAL;
        this(colorValue, stringValue, transition, doubleValue, transition, doubleValue, transition, imageValue, backgroundPitchAlignmentValue, visibilityValue, longValue, longValue);
    }
}
