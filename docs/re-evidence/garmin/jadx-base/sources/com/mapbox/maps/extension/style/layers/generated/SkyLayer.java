package com.mapbox.maps.extension.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.SkyType;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import e23.l;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bE\b\u0007\u0018\u0000 o2\u00020\u00012\u00020\u0002:\u0001oB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u000bJ\u0019\u0010\u0013\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0013\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0016\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u000bJ\u0019\u0010\u0017\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0018\u0010\u000bJ\u001d\u0010\u001a\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0011J\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u000bJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u000bJ\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\tH\u0017¢\u0006\u0004\b\u001e\u0010\u000bJ\u001d\u0010\u001f\u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019H\u0016¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u000bJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u0011J\u0017\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u000bJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\u0011J\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u000bJ\u0017\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J#\u0010$\u001a\u00020\u00002\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&H\u0016¢\u0006\u0004\b$\u0010*J\u0017\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010\u000bJ\u000f\u00100\u001a\u00020\u0003H\u0010¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b2\u0010/R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0016\u00109\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00105R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010;R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b=\u0010/R\u0013\u0010?\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b>\u00105R\u0013\u0010B\u001a\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\bD\u0010E\u001a\u0004\bC\u0010/R\u001c\u0010H\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\bG\u0010E\u001a\u0004\bF\u00105R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bI\u0010/R\u0013\u0010K\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bJ\u00105R\u0013\u0010M\u001a\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001a\u0004\bL\u0010AR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\bO\u0010E\u001a\u0004\bN\u0010/R\u001c\u0010R\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\bQ\u0010E\u001a\u0004\bP\u00105R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0013\u0010V\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bU\u00105R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bW\u0010;R\u0013\u0010Y\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bX\u00105R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bZ\u00105R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\\\u0010E\u001a\u0004\b[\u0010/R\u001c\u0010_\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b^\u0010E\u001a\u0004\b]\u00105R\u0019\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b`\u0010TR\u0013\u0010b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\ba\u00105R\u0013\u0010 \u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bc\u0010;R\u0013\u0010e\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bd\u00105R\u0013\u0010!\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bf\u0010;R\u0013\u0010h\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bg\u00105R\u0013\u0010$\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0013\u0010,\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0013\u0010n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bm\u00105¨\u0006p"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/SkyLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "", "layerId", "<init>", "(Ljava/lang/String;)V", "slot", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "maxZoom", "skyAtmosphereColor", "", "(I)Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "skyAtmosphereColorUseTheme", "skyAtmosphereHaloColor", "skyAtmosphereHaloColorUseTheme", "", "skyAtmosphereSun", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "skyAtmosphereSunIntensity", "skyGradient", "skyGradientUseTheme", "skyGradientCenter", "skyGradientRadius", "skyOpacity", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "skyOpacityTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/SkyType;", "skyType", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/SkyType;)Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "getType$extension_style_release", "()Ljava/lang/String;", "getType", "Ljava/lang/String;", "getLayerId", "getSlot", "getFilter", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibilityAsExpression", "visibilityAsExpression", "getMinZoom", "()Ljava/lang/Double;", "getMaxZoom", "getSkyAtmosphereColor", "getSkyAtmosphereColorAsExpression", "skyAtmosphereColorAsExpression", "getSkyAtmosphereColorAsColorInt", "()Ljava/lang/Integer;", "skyAtmosphereColorAsColorInt", "getSkyAtmosphereColorUseTheme", "getSkyAtmosphereColorUseTheme$annotations", "()V", "getSkyAtmosphereColorUseThemeAsExpression", "getSkyAtmosphereColorUseThemeAsExpression$annotations", "skyAtmosphereColorUseThemeAsExpression", "getSkyAtmosphereHaloColor", "getSkyAtmosphereHaloColorAsExpression", "skyAtmosphereHaloColorAsExpression", "getSkyAtmosphereHaloColorAsColorInt", "skyAtmosphereHaloColorAsColorInt", "getSkyAtmosphereHaloColorUseTheme", "getSkyAtmosphereHaloColorUseTheme$annotations", "getSkyAtmosphereHaloColorUseThemeAsExpression", "getSkyAtmosphereHaloColorUseThemeAsExpression$annotations", "skyAtmosphereHaloColorUseThemeAsExpression", "getSkyAtmosphereSun", "()Ljava/util/List;", "getSkyAtmosphereSunAsExpression", "skyAtmosphereSunAsExpression", "getSkyAtmosphereSunIntensity", "getSkyAtmosphereSunIntensityAsExpression", "skyAtmosphereSunIntensityAsExpression", "getSkyGradient", "getSkyGradientUseTheme", "getSkyGradientUseTheme$annotations", "getSkyGradientUseThemeAsExpression", "getSkyGradientUseThemeAsExpression$annotations", "skyGradientUseThemeAsExpression", "getSkyGradientCenter", "getSkyGradientCenterAsExpression", "skyGradientCenterAsExpression", "getSkyGradientRadius", "getSkyGradientRadiusAsExpression", "skyGradientRadiusAsExpression", "getSkyOpacity", "getSkyOpacityAsExpression", "skyOpacityAsExpression", "getSkyOpacityTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getSkyType", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/SkyType;", "getSkyTypeAsExpression", "skyTypeAsExpression", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SkyLayer extends Layer implements SkyLayerDsl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String layerId;

    public SkyLayer(String str) {
        str.getClass();
        this.layerId = str;
    }

    @MapboxExperimental
    public static /* synthetic */ void getSkyAtmosphereColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getSkyAtmosphereColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getSkyAtmosphereHaloColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getSkyAtmosphereHaloColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getSkyGradientUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getSkyGradientUseThemeAsExpression$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer filter(Expression filter) {
        filter.getClass();
        setProperty$extension_style_release(new PropertyValue<>("filter", filter));
        return this;
    }

    public final Expression getFilter() {
        return (Expression) getPropertyValueWithType("filter", Expression.class);
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

    public final String getSkyAtmosphereColor() {
        Expression skyAtmosphereColorAsExpression = getSkyAtmosphereColorAsExpression();
        if (skyAtmosphereColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(skyAtmosphereColorAsExpression);
        }
        return null;
    }

    public final Integer getSkyAtmosphereColorAsColorInt() {
        Expression skyAtmosphereColorAsExpression = getSkyAtmosphereColorAsExpression();
        if (skyAtmosphereColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(skyAtmosphereColorAsExpression);
        }
        return null;
    }

    public final Expression getSkyAtmosphereColorAsExpression() {
        return (Expression) getPropertyValueWithType("sky-atmosphere-color", Expression.class);
    }

    public final String getSkyAtmosphereColorUseTheme() {
        return (String) getPropertyValueWithType("sky-atmosphere-color-use-theme", String.class);
    }

    public final Expression getSkyAtmosphereColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("sky-atmosphere-color-use-theme");
    }

    public final String getSkyAtmosphereHaloColor() {
        Expression skyAtmosphereHaloColorAsExpression = getSkyAtmosphereHaloColorAsExpression();
        if (skyAtmosphereHaloColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(skyAtmosphereHaloColorAsExpression);
        }
        return null;
    }

    public final Integer getSkyAtmosphereHaloColorAsColorInt() {
        Expression skyAtmosphereHaloColorAsExpression = getSkyAtmosphereHaloColorAsExpression();
        if (skyAtmosphereHaloColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(skyAtmosphereHaloColorAsExpression);
        }
        return null;
    }

    public final Expression getSkyAtmosphereHaloColorAsExpression() {
        return (Expression) getPropertyValueWithType("sky-atmosphere-halo-color", Expression.class);
    }

    public final String getSkyAtmosphereHaloColorUseTheme() {
        return (String) getPropertyValueWithType("sky-atmosphere-halo-color-use-theme", String.class);
    }

    public final Expression getSkyAtmosphereHaloColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("sky-atmosphere-halo-color-use-theme");
    }

    public final List<Double> getSkyAtmosphereSun() {
        return (List) getPropertyValueWithType("sky-atmosphere-sun", List.class);
    }

    public final Expression getSkyAtmosphereSunAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("sky-atmosphere-sun");
    }

    public final Double getSkyAtmosphereSunIntensity() {
        return (Double) getPropertyValueWithType("sky-atmosphere-sun-intensity", Double.class);
    }

    public final Expression getSkyAtmosphereSunIntensityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("sky-atmosphere-sun-intensity");
    }

    public final Expression getSkyGradient() {
        return (Expression) getPropertyValueWithType("sky-gradient", Expression.class);
    }

    public final List<Double> getSkyGradientCenter() {
        return (List) getPropertyValueWithType("sky-gradient-center", List.class);
    }

    public final Expression getSkyGradientCenterAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("sky-gradient-center");
    }

    public final Double getSkyGradientRadius() {
        return (Double) getPropertyValueWithType("sky-gradient-radius", Double.class);
    }

    public final Expression getSkyGradientRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("sky-gradient-radius");
    }

    public final String getSkyGradientUseTheme() {
        return (String) getPropertyValueWithType("sky-gradient-use-theme", String.class);
    }

    public final Expression getSkyGradientUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("sky-gradient-use-theme");
    }

    public final Double getSkyOpacity() {
        return (Double) getPropertyValueWithType("sky-opacity", Double.class);
    }

    public final Expression getSkyOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("sky-opacity");
    }

    public final StyleTransition getSkyOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("sky-opacity-transition", StyleTransition.class);
    }

    public final SkyType getSkyType() {
        String str = (String) getPropertyValueWithType("sky-type", String.class);
        if (str == null) {
            return null;
        }
        SkyType.Companion companion = SkyType.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getSkyTypeAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("sky-type", Expression.class);
        if (expression != null) {
            return expression;
        }
        SkyType skyType = getSkyType();
        if (skyType != null) {
            return Expression.INSTANCE.literal(skyType.getValue());
        }
        return null;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public String getSlot() {
        return (String) getPropertyValueWithType("slot", String.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public String getType$extension_style_release() {
        return "sky";
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

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public SkyLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public SkyLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyAtmosphereColor(int skyAtmosphereColor) {
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(skyAtmosphereColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @MapboxExperimental
    public SkyLayer skyAtmosphereColorUseTheme(String skyAtmosphereColorUseTheme) {
        skyAtmosphereColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-color-use-theme", skyAtmosphereColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyAtmosphereHaloColor(int skyAtmosphereHaloColor) {
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-halo-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(skyAtmosphereHaloColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @MapboxExperimental
    public SkyLayer skyAtmosphereHaloColorUseTheme(String skyAtmosphereHaloColorUseTheme) {
        skyAtmosphereHaloColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-halo-color-use-theme", skyAtmosphereHaloColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyAtmosphereSun(List<Double> skyAtmosphereSun) {
        skyAtmosphereSun.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-sun", skyAtmosphereSun));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyAtmosphereSunIntensity(double skyAtmosphereSunIntensity) {
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-sun-intensity", Double.valueOf(skyAtmosphereSunIntensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyGradient(Expression skyGradient) {
        skyGradient.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-gradient", skyGradient));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyGradientCenter(List<Double> skyGradientCenter) {
        skyGradientCenter.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-gradient-center", skyGradientCenter));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyGradientRadius(double skyGradientRadius) {
        setProperty$extension_style_release(new PropertyValue<>("sky-gradient-radius", Double.valueOf(skyGradientRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @MapboxExperimental
    public SkyLayer skyGradientUseTheme(String skyGradientUseTheme) {
        skyGradientUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-gradient-use-theme", skyGradientUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyOpacity(double skyOpacity) {
        setProperty$extension_style_release(new PropertyValue<>("sky-opacity", Double.valueOf(skyOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyOpacityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        skyOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyType(SkyType skyType) {
        skyType.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-type", skyType));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public SkyLayer slot(String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public SkyLayer visibility(Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\fR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u000e8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b \u0010\u0014R\u001c\u0010!\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\fR\u001c\u0010$\u001a\u0004\u0018\u00010\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010\u0014R\u0019\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b,\u0010\u0014R\u0013\u0010-\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b.\u0010\u0006R\u0013\u0010/\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b0\u0010\u0014R\u0013\u00101\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b2\u0010\u0014R\u0019\u00103\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b4\u0010*R\u0013\u00105\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b6\u0010\u0014R\u0013\u00107\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b8\u0010\u0006R\u0013\u00109\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b:\u0010\u0014R\u001c\u0010;\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b<\u0010\u0002\u001a\u0004\b=\u0010\fR\u001c\u0010>\u001a\u0004\u0018\u00010\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0002\u001a\u0004\b@\u0010\u0014R\u0013\u0010A\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bB\u0010\u0006R\u0013\u0010C\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\bD\u0010\u0014R\u0013\u0010E\u001a\u0004\u0018\u00010F8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0013\u0010I\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0013\u0010M\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\bN\u0010\u0014R\u0013\u0010O\u001a\u0004\u0018\u00010P8F¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006S"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer$Companion;", "", "()V", "defaultMaxZoom", "", "getDefaultMaxZoom", "()Ljava/lang/Double;", "defaultMinZoom", "getDefaultMinZoom", "defaultSkyAtmosphereColor", "", "getDefaultSkyAtmosphereColor", "()Ljava/lang/String;", "defaultSkyAtmosphereColorAsColorInt", "", "getDefaultSkyAtmosphereColorAsColorInt", "()Ljava/lang/Integer;", "defaultSkyAtmosphereColorAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultSkyAtmosphereColorAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultSkyAtmosphereColorUseTheme", "getDefaultSkyAtmosphereColorUseTheme$annotations", "getDefaultSkyAtmosphereColorUseTheme", "defaultSkyAtmosphereColorUseThemeAsExpression", "getDefaultSkyAtmosphereColorUseThemeAsExpression$annotations", "getDefaultSkyAtmosphereColorUseThemeAsExpression", "defaultSkyAtmosphereHaloColor", "getDefaultSkyAtmosphereHaloColor", "defaultSkyAtmosphereHaloColorAsColorInt", "getDefaultSkyAtmosphereHaloColorAsColorInt", "defaultSkyAtmosphereHaloColorAsExpression", "getDefaultSkyAtmosphereHaloColorAsExpression", "defaultSkyAtmosphereHaloColorUseTheme", "getDefaultSkyAtmosphereHaloColorUseTheme$annotations", "getDefaultSkyAtmosphereHaloColorUseTheme", "defaultSkyAtmosphereHaloColorUseThemeAsExpression", "getDefaultSkyAtmosphereHaloColorUseThemeAsExpression$annotations", "getDefaultSkyAtmosphereHaloColorUseThemeAsExpression", "defaultSkyAtmosphereSun", "", "getDefaultSkyAtmosphereSun", "()Ljava/util/List;", "defaultSkyAtmosphereSunAsExpression", "getDefaultSkyAtmosphereSunAsExpression", "defaultSkyAtmosphereSunIntensity", "getDefaultSkyAtmosphereSunIntensity", "defaultSkyAtmosphereSunIntensityAsExpression", "getDefaultSkyAtmosphereSunIntensityAsExpression", "defaultSkyGradient", "getDefaultSkyGradient", "defaultSkyGradientCenter", "getDefaultSkyGradientCenter", "defaultSkyGradientCenterAsExpression", "getDefaultSkyGradientCenterAsExpression", "defaultSkyGradientRadius", "getDefaultSkyGradientRadius", "defaultSkyGradientRadiusAsExpression", "getDefaultSkyGradientRadiusAsExpression", "defaultSkyGradientUseTheme", "getDefaultSkyGradientUseTheme$annotations", "getDefaultSkyGradientUseTheme", "defaultSkyGradientUseThemeAsExpression", "getDefaultSkyGradientUseThemeAsExpression$annotations", "getDefaultSkyGradientUseThemeAsExpression", "defaultSkyOpacity", "getDefaultSkyOpacity", "defaultSkyOpacityAsExpression", "getDefaultSkyOpacityAsExpression", "defaultSkyOpacityTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultSkyOpacityTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultSkyType", "Lcom/mapbox/maps/extension/style/layers/properties/generated/SkyType;", "getDefaultSkyType", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/SkyType;", "defaultSkyTypeAsExpression", "getDefaultSkyTypeAsExpression", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultSkyAtmosphereColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultSkyAtmosphereColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultSkyAtmosphereHaloColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultSkyAtmosphereHaloColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultSkyGradientUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultSkyGradientUseThemeAsExpression$annotations() {
        }

        public final Double getDefaultMaxZoom() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "maxzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "minzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final String getDefaultSkyAtmosphereColor() {
            Expression defaultSkyAtmosphereColorAsExpression = getDefaultSkyAtmosphereColorAsExpression();
            if (defaultSkyAtmosphereColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultSkyAtmosphereColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultSkyAtmosphereColorAsColorInt() {
            Expression defaultSkyAtmosphereColorAsExpression = getDefaultSkyAtmosphereColorAsExpression();
            if (defaultSkyAtmosphereColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultSkyAtmosphereColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultSkyAtmosphereColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-color");
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

        public final String getDefaultSkyAtmosphereColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultSkyAtmosphereColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-color-use-theme");
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
            String defaultSkyAtmosphereColorUseTheme = getDefaultSkyAtmosphereColorUseTheme();
            if (defaultSkyAtmosphereColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultSkyAtmosphereColorUseTheme);
            }
            return null;
        }

        public final String getDefaultSkyAtmosphereHaloColor() {
            Expression defaultSkyAtmosphereHaloColorAsExpression = getDefaultSkyAtmosphereHaloColorAsExpression();
            if (defaultSkyAtmosphereHaloColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultSkyAtmosphereHaloColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultSkyAtmosphereHaloColorAsColorInt() {
            Expression defaultSkyAtmosphereHaloColorAsExpression = getDefaultSkyAtmosphereHaloColorAsExpression();
            if (defaultSkyAtmosphereHaloColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultSkyAtmosphereHaloColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultSkyAtmosphereHaloColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-halo-color");
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

        public final String getDefaultSkyAtmosphereHaloColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-halo-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultSkyAtmosphereHaloColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-halo-color-use-theme");
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
            String defaultSkyAtmosphereHaloColorUseTheme = getDefaultSkyAtmosphereHaloColorUseTheme();
            if (defaultSkyAtmosphereHaloColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultSkyAtmosphereHaloColorUseTheme);
            }
            return null;
        }

        public final List<Double> getDefaultSkyAtmosphereSun() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-sun");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (List) objUnwrap;
        }

        public final Expression getDefaultSkyAtmosphereSunAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-sun");
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
            List<Double> defaultSkyAtmosphereSun = getDefaultSkyAtmosphereSun();
            if (defaultSkyAtmosphereSun != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultSkyAtmosphereSun);
            }
            return null;
        }

        public final Double getDefaultSkyAtmosphereSunIntensity() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-sun-intensity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultSkyAtmosphereSunIntensityAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-sun-intensity");
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
            Double defaultSkyAtmosphereSunIntensity = getDefaultSkyAtmosphereSunIntensity();
            if (defaultSkyAtmosphereSunIntensity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultSkyAtmosphereSunIntensity.doubleValue());
        }

        public final Expression getDefaultSkyGradient() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-gradient");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Expression) objUnwrap;
        }

        public final List<Double> getDefaultSkyGradientCenter() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-gradient-center");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (List) objUnwrap;
        }

        public final Expression getDefaultSkyGradientCenterAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-gradient-center");
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
            List<Double> defaultSkyGradientCenter = getDefaultSkyGradientCenter();
            if (defaultSkyGradientCenter != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultSkyGradientCenter);
            }
            return null;
        }

        public final Double getDefaultSkyGradientRadius() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-gradient-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultSkyGradientRadiusAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-gradient-radius");
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
            Double defaultSkyGradientRadius = getDefaultSkyGradientRadius();
            if (defaultSkyGradientRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultSkyGradientRadius.doubleValue());
        }

        public final String getDefaultSkyGradientUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-gradient-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultSkyGradientUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-gradient-use-theme");
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
            String defaultSkyGradientUseTheme = getDefaultSkyGradientUseTheme();
            if (defaultSkyGradientUseTheme != null) {
                return Expression.INSTANCE.literal(defaultSkyGradientUseTheme);
            }
            return null;
        }

        public final Double getDefaultSkyOpacity() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultSkyOpacityAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-opacity");
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
            Double defaultSkyOpacity = getDefaultSkyOpacity();
            if (defaultSkyOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultSkyOpacity.doubleValue());
        }

        public final StyleTransition getDefaultSkyOpacityTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final SkyType getDefaultSkyType() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-type");
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
            SkyType.Companion companion = SkyType.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultSkyTypeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-type");
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
            SkyType defaultSkyType = getDefaultSkyType();
            if (defaultSkyType != null) {
                return Expression.INSTANCE.literal(defaultSkyType.getValue());
            }
            return null;
        }

        public final Visibility getDefaultVisibility() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "visibility");
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

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @MapboxExperimental
    public SkyLayer skyAtmosphereColorUseTheme(Expression skyAtmosphereColorUseTheme) {
        skyAtmosphereColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-color-use-theme", skyAtmosphereColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @MapboxExperimental
    public SkyLayer skyAtmosphereHaloColorUseTheme(Expression skyAtmosphereHaloColorUseTheme) {
        skyAtmosphereHaloColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-halo-color-use-theme", skyAtmosphereHaloColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyAtmosphereSun(Expression skyAtmosphereSun) {
        skyAtmosphereSun.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-sun", skyAtmosphereSun));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyGradientCenter(Expression skyGradientCenter) {
        skyGradientCenter.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-gradient-center", skyGradientCenter));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @MapboxExperimental
    public SkyLayer skyGradientUseTheme(Expression skyGradientUseTheme) {
        skyGradientUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-gradient-use-theme", skyGradientUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyType(Expression skyType) {
        skyType.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-type", skyType));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyAtmosphereSunIntensity(Expression skyAtmosphereSunIntensity) {
        skyAtmosphereSunIntensity.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-sun-intensity", skyAtmosphereSunIntensity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyGradientRadius(Expression skyGradientRadius) {
        skyGradientRadius.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-gradient-radius", skyGradientRadius));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyOpacity(Expression skyOpacity) {
        skyOpacity.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-opacity", skyOpacity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public SkyLayer visibility(Expression visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyAtmosphereColor(Expression skyAtmosphereColor) {
        skyAtmosphereColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-color", skyAtmosphereColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyAtmosphereHaloColor(Expression skyAtmosphereHaloColor) {
        skyAtmosphereHaloColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-halo-color", skyAtmosphereHaloColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyAtmosphereColor(String skyAtmosphereColor) {
        skyAtmosphereColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-color", skyAtmosphereColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyAtmosphereHaloColor(String skyAtmosphereHaloColor) {
        skyAtmosphereHaloColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-halo-color", skyAtmosphereHaloColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    public SkyLayer skyOpacityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-opacity-transition", options));
        return this;
    }
}
