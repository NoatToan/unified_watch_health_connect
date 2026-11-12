package com.mapbox.maps.extension.localization;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.StyleObjectInfo;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.maps.extension.style.expressions.dsl.generated.ExpressionDslKt;
import d53.k;
import d53.w;
import i3.e5;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014\"\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014\"\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014\"\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014\"\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014\"\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Ljava/util/Locale;", "locale", "Lcom/mapbox/maps/MapboxStyleManager;", TtmlNode.TAG_STYLE, "", "", "layerIds", "", "setMapLanguage", "(Ljava/util/Locale;Lcom/mapbox/maps/MapboxStyleManager;Ljava/util/List;)V", "layerId", "convertedLocale", "", "filterSymbolLayers", "localizeTextFieldExpression", "(Lcom/mapbox/maps/MapboxStyleManager;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Z)V", "sourceId", "adaptLocaleToV8orV7IfNeeded", "(Lcom/mapbox/maps/MapboxStyleManager;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "TAG", "Ljava/lang/String;", "TYPE", "SOURCE", "SYMBOL", "URL", "VECTOR", "TEXT_FIELD", "STREET_V7", "STREET_V8", "Ld53/k;", "EXPRESSION_REGEX", "Ld53/k;", "EXPRESSION_ABBR_REGEX", "extension-localization_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class LocalizationKt {
    private static final String SOURCE = "source";
    private static final String STREET_V7 = "mapbox.mapbox-streets-v7";
    private static final String STREET_V8 = "mapbox.mapbox-streets-v8";
    private static final String SYMBOL = "symbol";
    private static final String TAG = "LocalizationPluginImpl";
    private static final String TEXT_FIELD = "text-field";
    private static final String TYPE = "type";
    private static final String URL = "url";
    private static final String VECTOR = "vector";
    private static final k EXPRESSION_REGEX = new k("\\[\"get\",\\s*\"(name_.{2,7})\"\\]");
    private static final k EXPRESSION_ABBR_REGEX = new k("\\[\"get\",\\s*\"abbr\"\\]");

    private static final String adaptLocaleToV8orV7IfNeeded(MapboxStyleManager mapboxStyleManager, String str, Locale locale) {
        Object contents = mapboxStyleManager.getStyleSourceProperty(str, "type").getValue().getContents();
        if (s.g(contents instanceof String ? (String) contents : null, VECTOR)) {
            Object contents2 = mapboxStyleManager.getStyleSourceProperty(str, "url").getValue().getContents();
            String str2 = contents2 instanceof String ? (String) contents2 : null;
            if (str2 != null) {
                if (w.z(str2, STREET_V8, false)) {
                    return SupportedLanguagesKt.getLanguageNameV8(locale);
                }
                if (w.z(str2, STREET_V7, false)) {
                    return SupportedLanguagesKt.getLanguageNameV7(locale);
                }
            }
        }
        return null;
    }

    private static final void localizeTextFieldExpression(MapboxStyleManager mapboxStyleManager, String str, Locale locale, String str2, boolean z14) {
        if (z14) {
            Object contents = mapboxStyleManager.getStyleLayerProperty(str, "type").getValue().getContents();
            if (!s.g(contents instanceof String ? (String) contents : null, SYMBOL)) {
                return;
            }
        }
        StylePropertyValue styleLayerProperty = mapboxStyleManager.getStyleLayerProperty(str, "text-field");
        if (styleLayerProperty.getKind() != StylePropertyValueKind.EXPRESSION) {
            return;
        }
        String json = styleLayerProperty.getValue().toJson();
        json.getClass();
        Object contents2 = mapboxStyleManager.getStyleLayerProperty(str, "source").getValue().getContents();
        String str3 = contents2 instanceof String ? (String) contents2 : null;
        if (str3 == null) {
            str3 = "";
        }
        String strAdaptLocaleToV8orV7IfNeeded = adaptLocaleToV8orV7IfNeeded(mapboxStyleManager, str3, locale);
        if (strAdaptLocaleToV8orV7IfNeeded != null) {
            str2 = strAdaptLocaleToV8orV7IfNeeded;
        }
        String json2 = ExpressionDslKt.get(str2).toJson();
        json2.getClass();
        String strF = EXPRESSION_ABBR_REGEX.f(EXPRESSION_REGEX.f(json, json2), json2);
        Expected<String, Value> expectedFromJson = Value.fromJson(strF);
        expectedFromJson.getClass();
        Value value = expectedFromJson.getValue();
        if (value == null || mapboxStyleManager.setStyleLayerProperty(str, "text-field", value) == null) {
            MapboxLogger.logE(TAG, e5.h(new StringBuilder("An error "), expectedFromJson.getError(), " occurred when converting ", strF, " to a Value!"));
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final void setMapLanguage(Locale locale, MapboxStyleManager mapboxStyleManager, List<String> list) {
        Unit unit;
        locale.getClass();
        mapboxStyleManager.getClass();
        String str = "name_" + locale.getLanguage();
        if (!SupportedLanguagesKt.isSupportedLanguage(str)) {
            MapboxLogger.logE(TAG, "Locale: " + locale + " is not supported.");
            return;
        }
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                localizeTextFieldExpression(mapboxStyleManager, (String) it.next(), locale, str, true);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            for (StyleObjectInfo styleObjectInfo : mapboxStyleManager.getStyleLayers()) {
                if (s.g(styleObjectInfo.getType(), SYMBOL)) {
                    String id3 = styleObjectInfo.getId();
                    id3.getClass();
                    localizeTextFieldExpression(mapboxStyleManager, id3, locale, str, false);
                }
            }
        }
    }
}
