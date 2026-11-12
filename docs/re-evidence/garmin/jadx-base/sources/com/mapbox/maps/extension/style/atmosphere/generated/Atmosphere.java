package com.mapbox.maps.extension.style.atmosphere.generated;

import am.j;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.StyleContract;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import e23.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b;\b\u0007\u0018\u0000 {2\u00020\u00012\u00020\u0002:\u0001{B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\f\u001a\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0012J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0006\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0015\u0010\tJ\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0007J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\tJ\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\rJ#\u0010\u0017\u001a\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0018\u0010\tJ\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\rJ#\u0010\u001c\u001a\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u001d\u0010\u001e\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\rJ#\u0010 \u001a\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b \u0010\u0012J\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u0014J\u0019\u0010!\u001a\u00020\u00002\b\b\u0001\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0007J\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\tJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\rJ#\u0010\"\u001a\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0012J\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\u0014J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\bH\u0017¢\u0006\u0004\b#\u0010\tJ\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0013H\u0017¢\u0006\u0004\b#\u0010\u0014J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0019H\u0016¢\u0006\u0004\b$\u0010\u001bJ\u0017\u0010%\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010\rJ#\u0010%\u001a\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b%\u0010\u0012J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010\u0014J\u001d\u0010&\u001a\u00020\u00002\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fJ\u0017\u0010'\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010\rJ#\u0010'\u001a\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b'\u0010\u0012J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0013H\u0016¢\u0006\u0004\b&\u0010\u0014J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001b\u0010.\u001a\u00020\u00102\n\u0010-\u001a\u0006\u0012\u0002\b\u00030,H\u0002¢\u0006\u0004\b.\u0010/J\u001b\u00101\u001a\u00020\u00102\n\u00100\u001a\u0006\u0012\u0002\b\u00030,H\u0002¢\u0006\u0004\b1\u0010/J\"\u00104\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u00102\u0018\u00012\u0006\u00103\u001a\u00020\bH\u0082\b¢\u0006\u0004\b4\u00105J-\u00104\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u001022\u0006\u00103\u001a\u00020\b2\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0002¢\u0006\u0004\b4\u00108J\u0019\u0010:\u001a\u0004\u0018\u00010\n2\u0006\u00109\u001a\u00020\bH\u0002¢\u0006\u0004\b:\u0010;R$\u0010)\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010+R8\u0010B\u001a&\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030,0@j\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030,`A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0013\u0010F\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u0010\u0006\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0013\u0010\f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0013\u0010M\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bO\u0010\u0004\u001a\u0004\bN\u0010HR\u001c\u0010R\u001a\u0004\u0018\u00010\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\bQ\u0010\u0004\u001a\u0004\bP\u0010LR\u0013\u0010T\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\bS\u0010ER\u0013\u0010\u0016\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bU\u0010HR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bV\u0010JR\u0013\u0010X\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bW\u0010LR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bZ\u0010\u0004\u001a\u0004\bY\u0010HR\u001c\u0010]\u001a\u0004\u0018\u00010\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b\\\u0010\u0004\u001a\u0004\b[\u0010LR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b`\u0010JR\u0013\u0010b\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\ba\u0010LR\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0013\u0010 \u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\be\u0010JR\u0013\u0010g\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bf\u0010LR\u0013\u0010i\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\bh\u0010ER\u0013\u0010!\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bj\u0010HR\u0013\u0010\"\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bk\u0010JR\u0013\u0010m\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bl\u0010LR\u001c\u0010#\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bo\u0010\u0004\u001a\u0004\bn\u0010HR\u001c\u0010r\u001a\u0004\u0018\u00010\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\bq\u0010\u0004\u001a\u0004\bp\u0010LR\u0013\u0010$\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bs\u0010_R\u0013\u0010%\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bt\u0010JR\u0013\u0010v\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bu\u0010LR\u0019\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bw\u0010dR\u0013\u0010'\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bx\u0010JR\u0013\u0010z\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\by\u0010L¨\u0006|"}, d2 = {"Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "Lcom/mapbox/maps/extension/style/atmosphere/generated/AtmosphereDslReceiver;", "Lcom/mapbox/maps/extension/style/StyleContract$StyleAtmosphereExtension;", "<init>", "()V", "", TtmlNode.ATTR_TTS_COLOR, "(I)Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "colorTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "colorUseTheme", "highColor", "highColorTransition", "highColorUseTheme", "", "horizonBlend", "(D)Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "horizonBlendTransition", "", "range", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "rangeTransition", "spaceColor", "spaceColorTransition", "spaceColorUseTheme", "starIntensity", "starIntensityTransition", "verticalRange", "verticalRangeTransition", "Lcom/mapbox/maps/MapboxStyleManager;", "delegate", "bindTo", "(Lcom/mapbox/maps/MapboxStyleManager;)V", "Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;", "property", "setProperty", "(Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;)V", "propertyValue", "updateProperty", "T", "propertyName", "getPropertyValue", "(Ljava/lang/String;)Ljava/lang/Object;", "Ljava/lang/Class;", "clazz", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "transitionName", "getTransitionProperty", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/types/StyleTransition;", "Lcom/mapbox/maps/MapboxStyleManager;", "getDelegate$extension_style_release", "()Lcom/mapbox/maps/MapboxStyleManager;", "setDelegate$extension_style_release", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "properties", "Ljava/util/HashMap;", "getColorAsColorInt", "()Ljava/lang/Integer;", "colorAsColorInt", "getColor", "()Ljava/lang/String;", "getColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getColorAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "colorAsExpression", "getColorUseTheme", "getColorUseTheme$annotations", "getColorUseThemeAsExpression", "getColorUseThemeAsExpression$annotations", "colorUseThemeAsExpression", "getHighColorAsColorInt", "highColorAsColorInt", "getHighColor", "getHighColorTransition", "getHighColorAsExpression", "highColorAsExpression", "getHighColorUseTheme", "getHighColorUseTheme$annotations", "getHighColorUseThemeAsExpression", "getHighColorUseThemeAsExpression$annotations", "highColorUseThemeAsExpression", "getHorizonBlend", "()Ljava/lang/Double;", "getHorizonBlendTransition", "getHorizonBlendAsExpression", "horizonBlendAsExpression", "getRange", "()Ljava/util/List;", "getRangeTransition", "getRangeAsExpression", "rangeAsExpression", "getSpaceColorAsColorInt", "spaceColorAsColorInt", "getSpaceColor", "getSpaceColorTransition", "getSpaceColorAsExpression", "spaceColorAsExpression", "getSpaceColorUseTheme", "getSpaceColorUseTheme$annotations", "getSpaceColorUseThemeAsExpression", "getSpaceColorUseThemeAsExpression$annotations", "spaceColorUseThemeAsExpression", "getStarIntensity", "getStarIntensityTransition", "getStarIntensityAsExpression", "starIntensityAsExpression", "getVerticalRange", "getVerticalRangeTransition", "getVerticalRangeAsExpression", "verticalRangeAsExpression", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Atmosphere implements AtmosphereDslReceiver, StyleContract.StyleAtmosphereExtension {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "Mbgl-Atmosphere";
    private MapboxStyleManager delegate;
    private final HashMap<String, PropertyValue<?>> properties = new HashMap<>();

    @MapboxExperimental
    public static /* synthetic */ void getColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getHighColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getHighColorUseThemeAsExpression$annotations() {
    }

    private final <T> T getPropertyValue(String propertyName, Class<T> clazz) {
        MapboxStyleManager mapboxStyleManager = this.delegate;
        if (mapboxStyleManager == null) {
            p.n(j.m("Get property ", propertyName, " failed: atmosphere is not added to style yet."));
            return null;
        }
        try {
            return (T) TypeUtilsKt.unwrap(mapboxStyleManager.getStyleAtmosphereProperty(propertyName), clazz);
        } catch (RuntimeException e4) {
            e4.getMessage();
            mapboxStyleManager.getStyleAtmosphereProperty(propertyName).toString();
            return null;
        }
    }

    @MapboxExperimental
    public static /* synthetic */ void getSpaceColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getSpaceColorUseThemeAsExpression$annotations() {
    }

    private final StyleTransition getTransitionProperty(String transitionName) {
        MapboxStyleManager mapboxStyleManager = this.delegate;
        if (mapboxStyleManager == null) {
            p.n(j.m("Get property ", transitionName, " failed: atmosphere is not added to style yet."));
            return null;
        }
        try {
            Object contents = mapboxStyleManager.getStyleAtmosphereProperty(transitionName).getValue().getContents();
            contents.getClass();
            HashMap map = (HashMap) contents;
            Value value = (Value) map.get("duration");
            Object contents2 = value != null ? value.getContents() : null;
            contents2.getClass();
            long jLongValue = ((Long) contents2).longValue();
            Value value2 = (Value) map.get("delay");
            Object contents3 = value2 != null ? value2.getContents() : null;
            contents3.getClass();
            return new StyleTransition.Builder().delay(((Long) contents3).longValue()).duration(jLongValue).build();
        } catch (RuntimeException e4) {
            e4.getMessage();
            mapboxStyleManager.getStyleAtmosphereProperty(transitionName).toString();
            return null;
        }
    }

    private final void setProperty(PropertyValue<?> property) {
        this.properties.put(property.getPropertyName(), property);
        updateProperty(property);
    }

    private final void updateProperty(PropertyValue<?> propertyValue) {
        String error;
        MapboxStyleManager mapboxStyleManager = this.delegate;
        Expected<String, None> styleAtmosphereProperty = mapboxStyleManager != null ? mapboxStyleManager.setStyleAtmosphereProperty(propertyValue.getPropertyName(), propertyValue.getValue()) : null;
        if (styleAtmosphereProperty == null || (error = styleAtmosphereProperty.getError()) == null) {
            return;
        }
        p.n("Set atmosphere property failed: ".concat(error));
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleAtmosphereExtension
    public void bindTo(MapboxStyleManager delegate) {
        delegate.getClass();
        this.delegate = delegate;
        HashMap map = new HashMap();
        for (Map.Entry<String, PropertyValue<?>> entry : this.properties.entrySet()) {
            map.put(entry.getKey(), entry.getValue().getValue());
        }
        String error = delegate.setStyleAtmosphere(new Value((HashMap<String, Value>) map)).getError();
        if (error == null) {
            return;
        }
        p.n("Set atmosphere failed: ".concat(error));
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere color(int color) {
        setProperty(new PropertyValue<>(TtmlNode.ATTR_TTS_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(color)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere colorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        colorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    @MapboxExperimental
    public Atmosphere colorUseTheme(String colorUseTheme) {
        colorUseTheme.getClass();
        setProperty(new PropertyValue<>("color-use-theme", colorUseTheme));
        return this;
    }

    public final String getColor() {
        Expression colorAsExpression = getColorAsExpression();
        if (colorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(colorAsExpression);
        }
        return null;
    }

    public final Integer getColorAsColorInt() {
        Expression colorAsExpression = getColorAsExpression();
        if (colorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(colorAsExpression);
        }
        return null;
    }

    public final Expression getColorAsExpression() {
        Expression expression = (Expression) getPropertyValue(TtmlNode.ATTR_TTS_COLOR, Expression.class);
        if (expression != null) {
            return expression;
        }
        return null;
    }

    public final StyleTransition getColorTransition() {
        return getTransitionProperty("color-transition");
    }

    public final String getColorUseTheme() {
        return (String) getPropertyValue("color-use-theme", String.class);
    }

    public final Expression getColorUseThemeAsExpression() {
        Expression expression = (Expression) getPropertyValue("color-use-theme", Expression.class);
        if (expression != null) {
            return expression;
        }
        String colorUseTheme = getColorUseTheme();
        if (colorUseTheme != null) {
            return Expression.INSTANCE.literal(colorUseTheme);
        }
        return null;
    }

    /* JADX INFO: renamed from: getDelegate$extension_style_release, reason: from getter */
    public final MapboxStyleManager getDelegate() {
        return this.delegate;
    }

    public final String getHighColor() {
        Expression highColorAsExpression = getHighColorAsExpression();
        if (highColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(highColorAsExpression);
        }
        return null;
    }

    public final Integer getHighColorAsColorInt() {
        Expression highColorAsExpression = getHighColorAsExpression();
        if (highColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(highColorAsExpression);
        }
        return null;
    }

    public final Expression getHighColorAsExpression() {
        Expression expression = (Expression) getPropertyValue("high-color", Expression.class);
        if (expression != null) {
            return expression;
        }
        return null;
    }

    public final StyleTransition getHighColorTransition() {
        return getTransitionProperty("high-color-transition");
    }

    public final String getHighColorUseTheme() {
        return (String) getPropertyValue("high-color-use-theme", String.class);
    }

    public final Expression getHighColorUseThemeAsExpression() {
        Expression expression = (Expression) getPropertyValue("high-color-use-theme", Expression.class);
        if (expression != null) {
            return expression;
        }
        String highColorUseTheme = getHighColorUseTheme();
        if (highColorUseTheme != null) {
            return Expression.INSTANCE.literal(highColorUseTheme);
        }
        return null;
    }

    public final Double getHorizonBlend() {
        return (Double) getPropertyValue("horizon-blend", Double.class);
    }

    public final Expression getHorizonBlendAsExpression() {
        Expression expression = (Expression) getPropertyValue("horizon-blend", Expression.class);
        if (expression != null) {
            return expression;
        }
        Double horizonBlend = getHorizonBlend();
        if (horizonBlend == null) {
            return null;
        }
        return Expression.INSTANCE.literal(horizonBlend.doubleValue());
    }

    public final StyleTransition getHorizonBlendTransition() {
        return getTransitionProperty("horizon-blend-transition");
    }

    public final List<Double> getRange() {
        return (List) getPropertyValue("range", List.class);
    }

    public final Expression getRangeAsExpression() {
        Expression expression = (Expression) getPropertyValue("range", Expression.class);
        if (expression != null) {
            return expression;
        }
        List<Double> range = getRange();
        if (range != null) {
            return Expression.INSTANCE.literal$extension_style_release(range);
        }
        return null;
    }

    public final StyleTransition getRangeTransition() {
        return getTransitionProperty("range-transition");
    }

    public final String getSpaceColor() {
        Expression spaceColorAsExpression = getSpaceColorAsExpression();
        if (spaceColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(spaceColorAsExpression);
        }
        return null;
    }

    public final Integer getSpaceColorAsColorInt() {
        Expression spaceColorAsExpression = getSpaceColorAsExpression();
        if (spaceColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(spaceColorAsExpression);
        }
        return null;
    }

    public final Expression getSpaceColorAsExpression() {
        Expression expression = (Expression) getPropertyValue("space-color", Expression.class);
        if (expression != null) {
            return expression;
        }
        return null;
    }

    public final StyleTransition getSpaceColorTransition() {
        return getTransitionProperty("space-color-transition");
    }

    public final String getSpaceColorUseTheme() {
        return (String) getPropertyValue("space-color-use-theme", String.class);
    }

    public final Expression getSpaceColorUseThemeAsExpression() {
        Expression expression = (Expression) getPropertyValue("space-color-use-theme", Expression.class);
        if (expression != null) {
            return expression;
        }
        String spaceColorUseTheme = getSpaceColorUseTheme();
        if (spaceColorUseTheme != null) {
            return Expression.INSTANCE.literal(spaceColorUseTheme);
        }
        return null;
    }

    public final Double getStarIntensity() {
        return (Double) getPropertyValue("star-intensity", Double.class);
    }

    public final Expression getStarIntensityAsExpression() {
        Expression expression = (Expression) getPropertyValue("star-intensity", Expression.class);
        if (expression != null) {
            return expression;
        }
        Double starIntensity = getStarIntensity();
        if (starIntensity == null) {
            return null;
        }
        return Expression.INSTANCE.literal(starIntensity.doubleValue());
    }

    public final StyleTransition getStarIntensityTransition() {
        return getTransitionProperty("star-intensity-transition");
    }

    public final List<Double> getVerticalRange() {
        return (List) getPropertyValue("vertical-range", List.class);
    }

    public final Expression getVerticalRangeAsExpression() {
        Expression expression = (Expression) getPropertyValue("vertical-range", Expression.class);
        if (expression != null) {
            return expression;
        }
        List<Double> verticalRange = getVerticalRange();
        if (verticalRange != null) {
            return Expression.INSTANCE.literal$extension_style_release(verticalRange);
        }
        return null;
    }

    public final StyleTransition getVerticalRangeTransition() {
        return getTransitionProperty("vertical-range-transition");
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere highColor(int highColor) {
        setProperty(new PropertyValue<>("high-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(highColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere highColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        highColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    @MapboxExperimental
    public Atmosphere highColorUseTheme(String highColorUseTheme) {
        highColorUseTheme.getClass();
        setProperty(new PropertyValue<>("high-color-use-theme", highColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere horizonBlend(double horizonBlend) {
        setProperty(new PropertyValue<>("horizon-blend", Double.valueOf(horizonBlend)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere horizonBlendTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        horizonBlendTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere range(List<Double> range) {
        range.getClass();
        setProperty(new PropertyValue<>("range", range));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere rangeTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rangeTransition(builder.build());
        return this;
    }

    public final void setDelegate$extension_style_release(MapboxStyleManager mapboxStyleManager) {
        this.delegate = mapboxStyleManager;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere spaceColor(int spaceColor) {
        setProperty(new PropertyValue<>("space-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(spaceColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere spaceColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        spaceColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    @MapboxExperimental
    public Atmosphere spaceColorUseTheme(String spaceColorUseTheme) {
        spaceColorUseTheme.getClass();
        setProperty(new PropertyValue<>("space-color-use-theme", spaceColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere starIntensity(double starIntensity) {
        setProperty(new PropertyValue<>("star-intensity", Double.valueOf(starIntensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere starIntensityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        starIntensityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere verticalRange(List<Double> verticalRange) {
        verticalRange.getClass();
        setProperty(new PropertyValue<>("vertical-range", verticalRange));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere verticalRangeTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        verticalRangeTransition(builder.build());
        return this;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere$Companion;", "", "()V", "TAG", "", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    @MapboxExperimental
    public Atmosphere colorUseTheme(Expression colorUseTheme) {
        setProperty(p.c("color-use-theme", colorUseTheme, colorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    @MapboxExperimental
    public Atmosphere highColorUseTheme(Expression highColorUseTheme) {
        setProperty(p.c("high-color-use-theme", highColorUseTheme, highColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere range(Expression range) {
        setProperty(p.c("range", range, range));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    @MapboxExperimental
    public Atmosphere spaceColorUseTheme(Expression spaceColorUseTheme) {
        setProperty(p.c("space-color-use-theme", spaceColorUseTheme, spaceColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere verticalRange(Expression verticalRange) {
        setProperty(p.c("vertical-range", verticalRange, verticalRange));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere horizonBlend(Expression horizonBlend) {
        setProperty(p.c("horizon-blend", horizonBlend, horizonBlend));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere starIntensity(Expression starIntensity) {
        setProperty(p.c("star-intensity", starIntensity, starIntensity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere color(String color) {
        color.getClass();
        setProperty(new PropertyValue<>(TtmlNode.ATTR_TTS_COLOR, color));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere highColor(String highColor) {
        highColor.getClass();
        setProperty(new PropertyValue<>("high-color", highColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere spaceColor(String spaceColor) {
        spaceColor.getClass();
        setProperty(new PropertyValue<>("space-color", spaceColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere color(Expression color) {
        setProperty(p.c(TtmlNode.ATTR_TTS_COLOR, color, color));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere highColor(Expression highColor) {
        setProperty(p.c("high-color", highColor, highColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere spaceColor(Expression spaceColor) {
        setProperty(p.c("space-color", spaceColor, spaceColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere colorTransition(StyleTransition options) {
        setProperty(p.b(options, "color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere highColorTransition(StyleTransition options) {
        setProperty(p.b(options, "high-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere horizonBlendTransition(StyleTransition options) {
        setProperty(p.b(options, "horizon-blend-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere rangeTransition(StyleTransition options) {
        setProperty(p.b(options, "range-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere spaceColorTransition(StyleTransition options) {
        setProperty(p.b(options, "space-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere starIntensityTransition(StyleTransition options) {
        setProperty(p.b(options, "star-intensity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.atmosphere.generated.AtmosphereDslReceiver
    public Atmosphere verticalRangeTransition(StyleTransition options) {
        setProperty(p.b(options, "vertical-range-transition", options));
        return this;
    }

    private final <T> T getPropertyValue(String propertyName) {
        s.l();
        throw null;
    }
}
