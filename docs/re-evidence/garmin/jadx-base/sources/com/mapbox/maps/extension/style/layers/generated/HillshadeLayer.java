package com.mapbox.maps.extension.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.HillshadeIlluminationAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import e23.l;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\bK\b\u0007\u0018\u0000 r2\u00020\u00012\u00020\u0002:\u0001rB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\tJ\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u0019\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016¢\u0006\u0004\b\u0019\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0003H\u0017¢\u0006\u0004\b \u0010\tJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000eH\u0017¢\u0006\u0004\b \u0010\u000fJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\u0012J\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u000fJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\"\u0010\u001aJ#\u0010\"\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016¢\u0006\u0004\b\"\u0010\u001fJ\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010\u0012J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u000fJ\u0017\u0010$\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b$\u0010\u001aJ#\u0010$\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016¢\u0006\u0004\b$\u0010\u001fJ\u0017\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010\tJ\u0017\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\u000fJ\u0019\u0010%\u001a\u00020\u00002\b\b\u0001\u0010%\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010\u0016J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b&\u0010\u001aJ#\u0010&\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016¢\u0006\u0004\b&\u0010\u001fJ\u0017\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0003H\u0017¢\u0006\u0004\b'\u0010\tJ\u0017\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u000eH\u0017¢\u0006\u0004\b'\u0010\u000fJ\u0017\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u000eH\u0016¢\u0006\u0004\b)\u0010\u000fJ\u0017\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0010H\u0016¢\u0006\u0004\b+\u0010\u0012J\u0017\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u000eH\u0016¢\u0006\u0004\b+\u0010\u000fJ\u0017\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010\tJ\u0017\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u000eH\u0016¢\u0006\u0004\b,\u0010\u000fJ\u0019\u0010,\u001a\u00020\u00002\b\b\u0001\u0010,\u001a\u00020\u0015H\u0016¢\u0006\u0004\b,\u0010\u0016J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b-\u0010\u001aJ#\u0010-\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016¢\u0006\u0004\b-\u0010\u001fJ\u0017\u0010.\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0003H\u0017¢\u0006\u0004\b.\u0010\tJ\u0017\u0010.\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u000eH\u0017¢\u0006\u0004\b.\u0010\u000fJ\u000f\u00101\u001a\u00020\u0003H\u0010¢\u0006\u0004\b/\u00100R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u00100R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b4\u00100R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b5\u00100R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00100R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0016\u0010;\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010=R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b?\u00100R\u0013\u0010A\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b@\u0010:R\u0013\u0010D\u001a\u0004\u0018\u00010\u00158G¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001c\u0010 \u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\bH\u0010I\u001a\u0004\bG\u00100R\u001c\u0010L\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\bK\u0010I\u001a\u0004\bJ\u0010:R\u0013\u0010!\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bM\u0010=R\u0013\u0010O\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bN\u0010:R\u0013\u0010\"\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bP\u0010FR\u0013\u0010#\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bQ\u0010=R\u0013\u0010S\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bR\u0010:R\u0013\u0010$\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bT\u0010FR\u0013\u0010%\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bU\u00100R\u0013\u0010W\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bV\u0010:R\u0013\u0010Y\u001a\u0004\u0018\u00010\u00158G¢\u0006\u0006\u001a\u0004\bX\u0010CR\u0013\u0010&\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bZ\u0010FR\u001c\u0010'\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\\\u0010I\u001a\u0004\b[\u00100R\u001c\u0010_\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b^\u0010I\u001a\u0004\b]\u0010:R\u0013\u0010)\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0013\u0010c\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bb\u0010:R\u0013\u0010+\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bd\u0010=R\u0013\u0010f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\be\u0010:R\u0013\u0010,\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bg\u00100R\u0013\u0010i\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bh\u0010:R\u0013\u0010k\u001a\u0004\u0018\u00010\u00158G¢\u0006\u0006\u001a\u0004\bj\u0010CR\u0013\u0010-\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bl\u0010FR\u001c\u0010.\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\bn\u0010I\u001a\u0004\bm\u00100R\u001c\u0010q\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\bp\u0010I\u001a\u0004\bo\u0010:¨\u0006s"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "", "layerId", "sourceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sourceLayer", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer;", "slot", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer;", "maxZoom", "hillshadeAccentColor", "", "(I)Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer;", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "hillshadeAccentColorTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer;", "hillshadeAccentColorUseTheme", "hillshadeEmissiveStrength", "hillshadeEmissiveStrengthTransition", "hillshadeExaggeration", "hillshadeExaggerationTransition", "hillshadeHighlightColor", "hillshadeHighlightColorTransition", "hillshadeHighlightColorUseTheme", "Lcom/mapbox/maps/extension/style/layers/properties/generated/HillshadeIlluminationAnchor;", "hillshadeIlluminationAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/HillshadeIlluminationAnchor;)Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer;", "hillshadeIlluminationDirection", "hillshadeShadowColor", "hillshadeShadowColorTransition", "hillshadeShadowColorUseTheme", "getType$extension_style_release", "()Ljava/lang/String;", "getType", "Ljava/lang/String;", "getLayerId", "getSourceId", "getSourceLayer", "getSlot", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibilityAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "visibilityAsExpression", "getMinZoom", "()Ljava/lang/Double;", "getMaxZoom", "getHillshadeAccentColor", "getHillshadeAccentColorAsExpression", "hillshadeAccentColorAsExpression", "getHillshadeAccentColorAsColorInt", "()Ljava/lang/Integer;", "hillshadeAccentColorAsColorInt", "getHillshadeAccentColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getHillshadeAccentColorUseTheme", "getHillshadeAccentColorUseTheme$annotations", "()V", "getHillshadeAccentColorUseThemeAsExpression", "getHillshadeAccentColorUseThemeAsExpression$annotations", "hillshadeAccentColorUseThemeAsExpression", "getHillshadeEmissiveStrength", "getHillshadeEmissiveStrengthAsExpression", "hillshadeEmissiveStrengthAsExpression", "getHillshadeEmissiveStrengthTransition", "getHillshadeExaggeration", "getHillshadeExaggerationAsExpression", "hillshadeExaggerationAsExpression", "getHillshadeExaggerationTransition", "getHillshadeHighlightColor", "getHillshadeHighlightColorAsExpression", "hillshadeHighlightColorAsExpression", "getHillshadeHighlightColorAsColorInt", "hillshadeHighlightColorAsColorInt", "getHillshadeHighlightColorTransition", "getHillshadeHighlightColorUseTheme", "getHillshadeHighlightColorUseTheme$annotations", "getHillshadeHighlightColorUseThemeAsExpression", "getHillshadeHighlightColorUseThemeAsExpression$annotations", "hillshadeHighlightColorUseThemeAsExpression", "getHillshadeIlluminationAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/HillshadeIlluminationAnchor;", "getHillshadeIlluminationAnchorAsExpression", "hillshadeIlluminationAnchorAsExpression", "getHillshadeIlluminationDirection", "getHillshadeIlluminationDirectionAsExpression", "hillshadeIlluminationDirectionAsExpression", "getHillshadeShadowColor", "getHillshadeShadowColorAsExpression", "hillshadeShadowColorAsExpression", "getHillshadeShadowColorAsColorInt", "hillshadeShadowColorAsColorInt", "getHillshadeShadowColorTransition", "getHillshadeShadowColorUseTheme", "getHillshadeShadowColorUseTheme$annotations", "getHillshadeShadowColorUseThemeAsExpression", "getHillshadeShadowColorUseThemeAsExpression$annotations", "hillshadeShadowColorUseThemeAsExpression", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class HillshadeLayer extends Layer implements HillshadeLayerDsl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String layerId;
    private final String sourceId;

    public HillshadeLayer(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.sourceId = str2;
        setInternalSourceId$extension_style_release(str2);
    }

    @MapboxExperimental
    public static /* synthetic */ void getHillshadeAccentColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getHillshadeAccentColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getHillshadeHighlightColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getHillshadeHighlightColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getHillshadeShadowColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getHillshadeShadowColorUseThemeAsExpression$annotations() {
    }

    public final String getHillshadeAccentColor() {
        Expression hillshadeAccentColorAsExpression = getHillshadeAccentColorAsExpression();
        if (hillshadeAccentColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(hillshadeAccentColorAsExpression);
        }
        return null;
    }

    public final Integer getHillshadeAccentColorAsColorInt() {
        Expression hillshadeAccentColorAsExpression = getHillshadeAccentColorAsExpression();
        if (hillshadeAccentColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(hillshadeAccentColorAsExpression);
        }
        return null;
    }

    public final Expression getHillshadeAccentColorAsExpression() {
        return (Expression) getPropertyValueWithType("hillshade-accent-color", Expression.class);
    }

    public final StyleTransition getHillshadeAccentColorTransition() {
        return (StyleTransition) getPropertyValueWithType("hillshade-accent-color-transition", StyleTransition.class);
    }

    public final String getHillshadeAccentColorUseTheme() {
        return (String) getPropertyValueWithType("hillshade-accent-color-use-theme", String.class);
    }

    public final Expression getHillshadeAccentColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("hillshade-accent-color-use-theme");
    }

    public final Double getHillshadeEmissiveStrength() {
        return (Double) getPropertyValueWithType("hillshade-emissive-strength", Double.class);
    }

    public final Expression getHillshadeEmissiveStrengthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("hillshade-emissive-strength");
    }

    public final StyleTransition getHillshadeEmissiveStrengthTransition() {
        return (StyleTransition) getPropertyValueWithType("hillshade-emissive-strength-transition", StyleTransition.class);
    }

    public final Double getHillshadeExaggeration() {
        return (Double) getPropertyValueWithType("hillshade-exaggeration", Double.class);
    }

    public final Expression getHillshadeExaggerationAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("hillshade-exaggeration");
    }

    public final StyleTransition getHillshadeExaggerationTransition() {
        return (StyleTransition) getPropertyValueWithType("hillshade-exaggeration-transition", StyleTransition.class);
    }

    public final String getHillshadeHighlightColor() {
        Expression hillshadeHighlightColorAsExpression = getHillshadeHighlightColorAsExpression();
        if (hillshadeHighlightColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(hillshadeHighlightColorAsExpression);
        }
        return null;
    }

    public final Integer getHillshadeHighlightColorAsColorInt() {
        Expression hillshadeHighlightColorAsExpression = getHillshadeHighlightColorAsExpression();
        if (hillshadeHighlightColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(hillshadeHighlightColorAsExpression);
        }
        return null;
    }

    public final Expression getHillshadeHighlightColorAsExpression() {
        return (Expression) getPropertyValueWithType("hillshade-highlight-color", Expression.class);
    }

    public final StyleTransition getHillshadeHighlightColorTransition() {
        return (StyleTransition) getPropertyValueWithType("hillshade-highlight-color-transition", StyleTransition.class);
    }

    public final String getHillshadeHighlightColorUseTheme() {
        return (String) getPropertyValueWithType("hillshade-highlight-color-use-theme", String.class);
    }

    public final Expression getHillshadeHighlightColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("hillshade-highlight-color-use-theme");
    }

    public final HillshadeIlluminationAnchor getHillshadeIlluminationAnchor() {
        String str = (String) getPropertyValueWithType("hillshade-illumination-anchor", String.class);
        if (str == null) {
            return null;
        }
        HillshadeIlluminationAnchor.Companion companion = HillshadeIlluminationAnchor.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getHillshadeIlluminationAnchorAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("hillshade-illumination-anchor", Expression.class);
        if (expression != null) {
            return expression;
        }
        HillshadeIlluminationAnchor hillshadeIlluminationAnchor = getHillshadeIlluminationAnchor();
        if (hillshadeIlluminationAnchor != null) {
            return Expression.INSTANCE.literal(hillshadeIlluminationAnchor.getValue());
        }
        return null;
    }

    public final Double getHillshadeIlluminationDirection() {
        return (Double) getPropertyValueWithType("hillshade-illumination-direction", Double.class);
    }

    public final Expression getHillshadeIlluminationDirectionAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("hillshade-illumination-direction");
    }

    public final String getHillshadeShadowColor() {
        Expression hillshadeShadowColorAsExpression = getHillshadeShadowColorAsExpression();
        if (hillshadeShadowColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(hillshadeShadowColorAsExpression);
        }
        return null;
    }

    public final Integer getHillshadeShadowColorAsColorInt() {
        Expression hillshadeShadowColorAsExpression = getHillshadeShadowColorAsExpression();
        if (hillshadeShadowColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(hillshadeShadowColorAsExpression);
        }
        return null;
    }

    public final Expression getHillshadeShadowColorAsExpression() {
        return (Expression) getPropertyValueWithType("hillshade-shadow-color", Expression.class);
    }

    public final StyleTransition getHillshadeShadowColorTransition() {
        return (StyleTransition) getPropertyValueWithType("hillshade-shadow-color-transition", StyleTransition.class);
    }

    public final String getHillshadeShadowColorUseTheme() {
        return (String) getPropertyValueWithType("hillshade-shadow-color-use-theme", String.class);
    }

    public final Expression getHillshadeShadowColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("hillshade-shadow-color-use-theme");
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public String getLayerId() {
        return this.layerId;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public Double getMaxZoom() {
        return (Double) getPropertyValueWithType("maxzoom", Double.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public Double getMinZoom() {
        return (Double) getPropertyValueWithType("minzoom", Double.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public String getSlot() {
        return (String) getPropertyValueWithType("slot", String.class);
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final String getSourceLayer() {
        return (String) getPropertyValueWithType("source-layer", String.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public String getType$extension_style_release() {
        return "hillshade";
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public Visibility getVisibility() {
        String str = (String) getPropertyValueWithType("visibility", String.class);
        if (str == null) {
            return null;
        }
        Visibility.Companion companion = Visibility.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public Expression getVisibilityAsExpression() {
        return (Expression) getPropertyValueWithType("visibility", Expression.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeAccentColor(int hillshadeAccentColor) {
        setProperty$extension_style_release(new PropertyValue<>("hillshade-accent-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(hillshadeAccentColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeAccentColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        hillshadeAccentColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @MapboxExperimental
    public HillshadeLayer hillshadeAccentColorUseTheme(String hillshadeAccentColorUseTheme) {
        hillshadeAccentColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-accent-color-use-theme", hillshadeAccentColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeEmissiveStrength(double hillshadeEmissiveStrength) {
        setProperty$extension_style_release(new PropertyValue<>("hillshade-emissive-strength", Double.valueOf(hillshadeEmissiveStrength)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeEmissiveStrengthTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        hillshadeEmissiveStrengthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeExaggeration(double hillshadeExaggeration) {
        setProperty$extension_style_release(new PropertyValue<>("hillshade-exaggeration", Double.valueOf(hillshadeExaggeration)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeExaggerationTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        hillshadeExaggerationTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeHighlightColor(int hillshadeHighlightColor) {
        setProperty$extension_style_release(new PropertyValue<>("hillshade-highlight-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(hillshadeHighlightColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeHighlightColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        hillshadeHighlightColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @MapboxExperimental
    public HillshadeLayer hillshadeHighlightColorUseTheme(String hillshadeHighlightColorUseTheme) {
        hillshadeHighlightColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-highlight-color-use-theme", hillshadeHighlightColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeIlluminationAnchor(HillshadeIlluminationAnchor hillshadeIlluminationAnchor) {
        hillshadeIlluminationAnchor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-illumination-anchor", hillshadeIlluminationAnchor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeIlluminationDirection(double hillshadeIlluminationDirection) {
        setProperty$extension_style_release(new PropertyValue<>("hillshade-illumination-direction", Double.valueOf(hillshadeIlluminationDirection)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeShadowColor(int hillshadeShadowColor) {
        setProperty$extension_style_release(new PropertyValue<>("hillshade-shadow-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(hillshadeShadowColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeShadowColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        hillshadeShadowColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @MapboxExperimental
    public HillshadeLayer hillshadeShadowColorUseTheme(String hillshadeShadowColorUseTheme) {
        hillshadeShadowColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-shadow-color-use-theme", hillshadeShadowColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public HillshadeLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public HillshadeLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public HillshadeLayer slot(String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer sourceLayer(String sourceLayer) {
        sourceLayer.getClass();
        setProperty$extension_style_release(new PropertyValue<>("source-layer", sourceLayer));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public HillshadeLayer visibility(Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0006R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u000eR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b \u0010\u0012R\u0013\u0010!\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u0013\u0010#\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b$\u0010\u000eR\u0013\u0010%\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b&\u0010\u0012R\u0013\u0010'\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0013\u0010)\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b*\u0010\nR\u0013\u0010+\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b,\u0010\u000eR\u0013\u0010-\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b.\u0010\u0012R\u001c\u0010/\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0002\u001a\u0004\b1\u0010\u0006R\u001c\u00102\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u000eR\u0013\u00105\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u00109\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b:\u0010\u000eR\u0013\u0010;\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b<\u0010\u001cR\u0013\u0010=\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b>\u0010\u000eR\u0013\u0010?\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b@\u0010\u0006R\u0013\u0010A\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\bB\u0010\nR\u0013\u0010C\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bD\u0010\u000eR\u0013\u0010E\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bF\u0010\u0012R\u001c\u0010G\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bH\u0010\u0002\u001a\u0004\bI\u0010\u0006R\u001c\u0010J\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\bK\u0010\u0002\u001a\u0004\bL\u0010\u000eR\u0013\u0010M\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bN\u0010\u001cR\u0013\u0010O\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bP\u0010\u001cR\u0013\u0010Q\u001a\u0004\u0018\u00010R8F¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer$Companion;", "", "()V", "defaultHillshadeAccentColor", "", "getDefaultHillshadeAccentColor", "()Ljava/lang/String;", "defaultHillshadeAccentColorAsColorInt", "", "getDefaultHillshadeAccentColorAsColorInt", "()Ljava/lang/Integer;", "defaultHillshadeAccentColorAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultHillshadeAccentColorAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultHillshadeAccentColorTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultHillshadeAccentColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultHillshadeAccentColorUseTheme", "getDefaultHillshadeAccentColorUseTheme$annotations", "getDefaultHillshadeAccentColorUseTheme", "defaultHillshadeAccentColorUseThemeAsExpression", "getDefaultHillshadeAccentColorUseThemeAsExpression$annotations", "getDefaultHillshadeAccentColorUseThemeAsExpression", "defaultHillshadeEmissiveStrength", "", "getDefaultHillshadeEmissiveStrength", "()Ljava/lang/Double;", "defaultHillshadeEmissiveStrengthAsExpression", "getDefaultHillshadeEmissiveStrengthAsExpression", "defaultHillshadeEmissiveStrengthTransition", "getDefaultHillshadeEmissiveStrengthTransition", "defaultHillshadeExaggeration", "getDefaultHillshadeExaggeration", "defaultHillshadeExaggerationAsExpression", "getDefaultHillshadeExaggerationAsExpression", "defaultHillshadeExaggerationTransition", "getDefaultHillshadeExaggerationTransition", "defaultHillshadeHighlightColor", "getDefaultHillshadeHighlightColor", "defaultHillshadeHighlightColorAsColorInt", "getDefaultHillshadeHighlightColorAsColorInt", "defaultHillshadeHighlightColorAsExpression", "getDefaultHillshadeHighlightColorAsExpression", "defaultHillshadeHighlightColorTransition", "getDefaultHillshadeHighlightColorTransition", "defaultHillshadeHighlightColorUseTheme", "getDefaultHillshadeHighlightColorUseTheme$annotations", "getDefaultHillshadeHighlightColorUseTheme", "defaultHillshadeHighlightColorUseThemeAsExpression", "getDefaultHillshadeHighlightColorUseThemeAsExpression$annotations", "getDefaultHillshadeHighlightColorUseThemeAsExpression", "defaultHillshadeIlluminationAnchor", "Lcom/mapbox/maps/extension/style/layers/properties/generated/HillshadeIlluminationAnchor;", "getDefaultHillshadeIlluminationAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/HillshadeIlluminationAnchor;", "defaultHillshadeIlluminationAnchorAsExpression", "getDefaultHillshadeIlluminationAnchorAsExpression", "defaultHillshadeIlluminationDirection", "getDefaultHillshadeIlluminationDirection", "defaultHillshadeIlluminationDirectionAsExpression", "getDefaultHillshadeIlluminationDirectionAsExpression", "defaultHillshadeShadowColor", "getDefaultHillshadeShadowColor", "defaultHillshadeShadowColorAsColorInt", "getDefaultHillshadeShadowColorAsColorInt", "defaultHillshadeShadowColorAsExpression", "getDefaultHillshadeShadowColorAsExpression", "defaultHillshadeShadowColorTransition", "getDefaultHillshadeShadowColorTransition", "defaultHillshadeShadowColorUseTheme", "getDefaultHillshadeShadowColorUseTheme$annotations", "getDefaultHillshadeShadowColorUseTheme", "defaultHillshadeShadowColorUseThemeAsExpression", "getDefaultHillshadeShadowColorUseThemeAsExpression$annotations", "getDefaultHillshadeShadowColorUseThemeAsExpression", "defaultMaxZoom", "getDefaultMaxZoom", "defaultMinZoom", "getDefaultMinZoom", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultHillshadeAccentColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultHillshadeAccentColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultHillshadeHighlightColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultHillshadeHighlightColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultHillshadeShadowColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultHillshadeShadowColorUseThemeAsExpression$annotations() {
        }

        public final String getDefaultHillshadeAccentColor() {
            Expression defaultHillshadeAccentColorAsExpression = getDefaultHillshadeAccentColorAsExpression();
            if (defaultHillshadeAccentColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultHillshadeAccentColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultHillshadeAccentColorAsColorInt() {
            Expression defaultHillshadeAccentColorAsExpression = getDefaultHillshadeAccentColorAsExpression();
            if (defaultHillshadeAccentColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultHillshadeAccentColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultHillshadeAccentColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-accent-color");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            return null;
        }

        public final StyleTransition getDefaultHillshadeAccentColorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-accent-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultHillshadeAccentColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-accent-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultHillshadeAccentColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-accent-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            String defaultHillshadeAccentColorUseTheme = getDefaultHillshadeAccentColorUseTheme();
            if (defaultHillshadeAccentColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultHillshadeAccentColorUseTheme);
            }
            return null;
        }

        public final Double getDefaultHillshadeEmissiveStrength() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-emissive-strength");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultHillshadeEmissiveStrengthAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-emissive-strength");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultHillshadeEmissiveStrength = getDefaultHillshadeEmissiveStrength();
            if (defaultHillshadeEmissiveStrength == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultHillshadeEmissiveStrength.doubleValue());
        }

        public final StyleTransition getDefaultHillshadeEmissiveStrengthTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-emissive-strength-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultHillshadeExaggeration() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-exaggeration");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultHillshadeExaggerationAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-exaggeration");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultHillshadeExaggeration = getDefaultHillshadeExaggeration();
            if (defaultHillshadeExaggeration == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultHillshadeExaggeration.doubleValue());
        }

        public final StyleTransition getDefaultHillshadeExaggerationTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-exaggeration-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultHillshadeHighlightColor() {
            Expression defaultHillshadeHighlightColorAsExpression = getDefaultHillshadeHighlightColorAsExpression();
            if (defaultHillshadeHighlightColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultHillshadeHighlightColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultHillshadeHighlightColorAsColorInt() {
            Expression defaultHillshadeHighlightColorAsExpression = getDefaultHillshadeHighlightColorAsExpression();
            if (defaultHillshadeHighlightColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultHillshadeHighlightColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultHillshadeHighlightColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-highlight-color");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            return null;
        }

        public final StyleTransition getDefaultHillshadeHighlightColorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-highlight-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultHillshadeHighlightColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-highlight-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultHillshadeHighlightColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-highlight-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            String defaultHillshadeHighlightColorUseTheme = getDefaultHillshadeHighlightColorUseTheme();
            if (defaultHillshadeHighlightColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultHillshadeHighlightColorUseTheme);
            }
            return null;
        }

        public final HillshadeIlluminationAnchor getDefaultHillshadeIlluminationAnchor() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-illumination-anchor");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            String str = (String) objUnwrap;
            if (str == null) {
                return null;
            }
            HillshadeIlluminationAnchor.Companion companion = HillshadeIlluminationAnchor.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultHillshadeIlluminationAnchorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-illumination-anchor");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            HillshadeIlluminationAnchor defaultHillshadeIlluminationAnchor = getDefaultHillshadeIlluminationAnchor();
            if (defaultHillshadeIlluminationAnchor != null) {
                return Expression.INSTANCE.literal(defaultHillshadeIlluminationAnchor.getValue());
            }
            return null;
        }

        public final Double getDefaultHillshadeIlluminationDirection() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-illumination-direction");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultHillshadeIlluminationDirectionAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-illumination-direction");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultHillshadeIlluminationDirection = getDefaultHillshadeIlluminationDirection();
            if (defaultHillshadeIlluminationDirection == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultHillshadeIlluminationDirection.doubleValue());
        }

        public final String getDefaultHillshadeShadowColor() {
            Expression defaultHillshadeShadowColorAsExpression = getDefaultHillshadeShadowColorAsExpression();
            if (defaultHillshadeShadowColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultHillshadeShadowColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultHillshadeShadowColorAsColorInt() {
            Expression defaultHillshadeShadowColorAsExpression = getDefaultHillshadeShadowColorAsExpression();
            if (defaultHillshadeShadowColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultHillshadeShadowColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultHillshadeShadowColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-shadow-color");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            return null;
        }

        public final StyleTransition getDefaultHillshadeShadowColorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-shadow-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultHillshadeShadowColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-shadow-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultHillshadeShadowColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-shadow-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            String defaultHillshadeShadowColorUseTheme = getDefaultHillshadeShadowColorUseTheme();
            if (defaultHillshadeShadowColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultHillshadeShadowColorUseTheme);
            }
            return null;
        }

        public final Double getDefaultMaxZoom() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "maxzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Double getDefaultMinZoom() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "minzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Visibility getDefaultVisibility() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "visibility");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            String str = (String) objUnwrap;
            if (str == null) {
                return null;
            }
            Visibility.Companion companion = Visibility.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        private Companion() {
        }
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @MapboxExperimental
    public HillshadeLayer hillshadeAccentColorUseTheme(Expression hillshadeAccentColorUseTheme) {
        hillshadeAccentColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-accent-color-use-theme", hillshadeAccentColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @MapboxExperimental
    public HillshadeLayer hillshadeHighlightColorUseTheme(Expression hillshadeHighlightColorUseTheme) {
        hillshadeHighlightColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-highlight-color-use-theme", hillshadeHighlightColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeIlluminationAnchor(Expression hillshadeIlluminationAnchor) {
        hillshadeIlluminationAnchor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-illumination-anchor", hillshadeIlluminationAnchor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @MapboxExperimental
    public HillshadeLayer hillshadeShadowColorUseTheme(Expression hillshadeShadowColorUseTheme) {
        hillshadeShadowColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-shadow-color-use-theme", hillshadeShadowColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeEmissiveStrength(Expression hillshadeEmissiveStrength) {
        hillshadeEmissiveStrength.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-emissive-strength", hillshadeEmissiveStrength));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeExaggeration(Expression hillshadeExaggeration) {
        hillshadeExaggeration.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-exaggeration", hillshadeExaggeration));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeIlluminationDirection(Expression hillshadeIlluminationDirection) {
        hillshadeIlluminationDirection.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-illumination-direction", hillshadeIlluminationDirection));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public HillshadeLayer visibility(Expression visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeAccentColor(Expression hillshadeAccentColor) {
        hillshadeAccentColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-accent-color", hillshadeAccentColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeHighlightColor(Expression hillshadeHighlightColor) {
        hillshadeHighlightColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-highlight-color", hillshadeHighlightColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeShadowColor(Expression hillshadeShadowColor) {
        hillshadeShadowColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-shadow-color", hillshadeShadowColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeAccentColor(String hillshadeAccentColor) {
        hillshadeAccentColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-accent-color", hillshadeAccentColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeAccentColorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-accent-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeEmissiveStrengthTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-emissive-strength-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeExaggerationTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-exaggeration-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeHighlightColor(String hillshadeHighlightColor) {
        hillshadeHighlightColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-highlight-color", hillshadeHighlightColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeHighlightColorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-highlight-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeShadowColor(String hillshadeShadowColor) {
        hillshadeShadowColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-shadow-color", hillshadeShadowColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    public HillshadeLayer hillshadeShadowColorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-shadow-color-transition", options));
        return this;
    }
}
