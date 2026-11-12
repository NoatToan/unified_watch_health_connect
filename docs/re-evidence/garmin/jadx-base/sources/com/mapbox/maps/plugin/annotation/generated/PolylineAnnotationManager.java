package com.mapbox.maps.plugin.annotation.generated;

import com.google.gson.JsonElement;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.LineString;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.generated.LineLayer;
import com.mapbox.maps.extension.style.layers.properties.generated.LineCap;
import com.mapbox.maps.extension.style.layers.properties.generated.LineElevationReference;
import com.mapbox.maps.extension.style.layers.properties.generated.LineJoin;
import com.mapbox.maps.extension.style.layers.properties.generated.LineTranslateAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.LineWidthUnit;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtils;
import com.mapbox.maps.plugin.annotation.AnnotationConfig;
import com.mapbox.maps.plugin.annotation.AnnotationManagerImpl;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 »\u000122\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0001:\u0002»\u0001B\u0019\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0017\u0010³\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030D2\b\u0010´\u0001\u001a\u00030µ\u0001J\u0016\u0010³\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030D2\u0007\u0010¶\u0001\u001a\u00020\"J\t\u0010·\u0001\u001a\u00020\"H\u0016J\u0013\u0010¸\u0001\u001a\u00030¹\u00012\u0007\u0010º\u0001\u001a\u00020\"H\u0014R(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u001c8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R.\u0010(\u001a\u0004\u0018\u00010\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\"8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b)\u0010*\u001a\u0004\b+\u0010%\"\u0004\b,\u0010'R(\u0010-\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR(\u00101\u001a\u0004\u0018\u0001002\b\u0010\u000f\u001a\u0004\u0018\u0001008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u00106\u001a\u0004\u0018\u00010\u001c2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u001c8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010\u001f\"\u0004\b8\u0010!R(\u00109\u001a\u0004\u0018\u00010\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010%\"\u0004\b;\u0010'R.\u0010<\u001a\u0004\u0018\u00010\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\"8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b=\u0010*\u001a\u0004\b>\u0010%\"\u0004\b?\u0010'R.\u0010@\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bA\u0010*\u001a\u0004\bB\u0010\u0019\"\u0004\bC\u0010\u001bR4\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010D2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010D8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR(\u0010J\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010\u0019\"\u0004\bL\u0010\u001bR.\u0010N\u001a\u0004\u0018\u00010M2\b\u0010\u000f\u001a\u0004\u0018\u00010M8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bO\u0010*\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR(\u0010T\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010\u0019\"\u0004\bV\u0010\u001bR(\u0010W\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010\u0019\"\u0004\bY\u0010\u001bR.\u0010Z\u001a\u0004\u0018\u00010\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\"8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b[\u0010*\u001a\u0004\b\\\u0010%\"\u0004\b]\u0010'R(\u0010_\u001a\u0004\u0018\u00010^2\b\u0010\u000f\u001a\u0004\u0018\u00010^8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR(\u0010d\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010\u0019\"\u0004\bf\u0010\u001bR(\u0010g\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010\u0019\"\u0004\bi\u0010\u001bR(\u0010j\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010\u0019\"\u0004\bl\u0010\u001bR(\u0010m\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010\u0019\"\u0004\bo\u0010\u001bR(\u0010p\u001a\u0004\u0018\u00010\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u0010%\"\u0004\br\u0010'R(\u0010s\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010\u0019\"\u0004\bu\u0010\u001bR(\u0010v\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bw\u0010\u0019\"\u0004\bx\u0010\u001bR(\u0010y\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010\u0019\"\u0004\b{\u0010\u001bR4\u0010|\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010D2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010D8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b}\u0010G\"\u0004\b~\u0010IR-\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u007f8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R2\u0010\u0085\u0001\u001a\u0004\u0018\u00010\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\"8F@FX\u0087\u000e¢\u0006\u0015\u0012\u0005\b\u0086\u0001\u0010*\u001a\u0005\b\u0087\u0001\u0010%\"\u0005\b\u0088\u0001\u0010'R4\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001c2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u001c8G@FX\u0087\u000e¢\u0006\u0015\u0012\u0005\b\u008a\u0001\u0010*\u001a\u0005\b\u008b\u0001\u0010\u001f\"\u0005\b\u008c\u0001\u0010!R2\u0010\u008d\u0001\u001a\u0004\u0018\u00010\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\"8F@FX\u0087\u000e¢\u0006\u0015\u0012\u0005\b\u008e\u0001\u0010*\u001a\u0005\b\u008f\u0001\u0010%\"\u0005\b\u0090\u0001\u0010'R2\u0010\u0091\u0001\u001a\u0004\u0018\u00010\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\"8F@FX\u0087\u000e¢\u0006\u0015\u0012\u0005\b\u0092\u0001\u0010*\u001a\u0005\b\u0093\u0001\u0010%\"\u0005\b\u0094\u0001\u0010'R>\u0010\u0095\u0001\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010D2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010D8F@FX\u0087\u000e¢\u0006\u0015\u0012\u0005\b\u0096\u0001\u0010*\u001a\u0005\b\u0097\u0001\u0010G\"\u0005\b\u0098\u0001\u0010IR7\u0010\u0099\u0001\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010D2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010D8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009a\u0001\u0010G\"\u0005\b\u009b\u0001\u0010IR+\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009d\u0001\u0010\u0019\"\u0005\b\u009e\u0001\u0010\u001bR6\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u00012\t\u0010\u000f\u001a\u0005\u0018\u00010\u009f\u00018F@FX\u0087\u000e¢\u0006\u0017\u0012\u0005\b¡\u0001\u0010*\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R2\u0010¦\u0001\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168F@FX\u0087\u000e¢\u0006\u0015\u0012\u0005\b§\u0001\u0010*\u001a\u0005\b¨\u0001\u0010\u0019\"\u0005\b©\u0001\u0010\u001bR+\u0010ª\u0001\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b«\u0001\u0010\u0019\"\u0005\b¬\u0001\u0010\u001bR+\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b®\u0001\u0010\u0019\"\u0005\b¯\u0001\u0010\u001bR+\u0010°\u0001\u001a\u0004\u0018\u00010\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\"8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b±\u0001\u0010%\"\u0005\b²\u0001\u0010'¨\u0006¼\u0001"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotationManager;", "Lcom/mapbox/maps/plugin/annotation/AnnotationManagerImpl;", "Lcom/mapbox/geojson/LineString;", "Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotation;", "Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotationOptions;", "Lcom/mapbox/maps/plugin/annotation/generated/OnPolylineAnnotationDragListener;", "Lcom/mapbox/maps/plugin/annotation/generated/OnPolylineAnnotationClickListener;", "Lcom/mapbox/maps/plugin/annotation/generated/OnPolylineAnnotationLongClickListener;", "Lcom/mapbox/maps/plugin/annotation/generated/OnPolylineAnnotationInteractionListener;", "Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "delegateProvider", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "annotationConfig", "Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;", "(Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;)V", "value", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "layerFilter", "getLayerFilter", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "setLayerFilter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "", "lineBlur", "getLineBlur", "()Ljava/lang/Double;", "setLineBlur", "(Ljava/lang/Double;)V", "", "lineBorderColorInt", "getLineBorderColorInt", "()Ljava/lang/Integer;", "setLineBorderColorInt", "(Ljava/lang/Integer;)V", "", "lineBorderColorString", "getLineBorderColorString", "()Ljava/lang/String;", "setLineBorderColorString", "(Ljava/lang/String;)V", "lineBorderColorUseTheme", "getLineBorderColorUseTheme$annotations", "()V", "getLineBorderColorUseTheme", "setLineBorderColorUseTheme", "lineBorderWidth", "getLineBorderWidth", "setLineBorderWidth", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineCap;", "lineCap", "getLineCap", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineCap;", "setLineCap", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineCap;)V", "lineColorInt", "getLineColorInt", "setLineColorInt", "lineColorString", "getLineColorString", "setLineColorString", "lineColorUseTheme", "getLineColorUseTheme$annotations", "getLineColorUseTheme", "setLineColorUseTheme", "lineCrossSlope", "getLineCrossSlope$annotations", "getLineCrossSlope", "setLineCrossSlope", "", "lineDasharray", "getLineDasharray", "()Ljava/util/List;", "setLineDasharray", "(Ljava/util/List;)V", "lineDepthOcclusionFactor", "getLineDepthOcclusionFactor", "setLineDepthOcclusionFactor", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference;", "lineElevationReference", "getLineElevationReference$annotations", "getLineElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference;", "setLineElevationReference", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference;)V", "lineEmissiveStrength", "getLineEmissiveStrength", "setLineEmissiveStrength", "lineGapWidth", "getLineGapWidth", "setLineGapWidth", "lineGradientUseTheme", "getLineGradientUseTheme$annotations", "getLineGradientUseTheme", "setLineGradientUseTheme", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "lineJoin", "getLineJoin", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "setLineJoin", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;)V", "lineMiterLimit", "getLineMiterLimit", "setLineMiterLimit", "lineOcclusionOpacity", "getLineOcclusionOpacity", "setLineOcclusionOpacity", "lineOffset", "getLineOffset", "setLineOffset", "lineOpacity", "getLineOpacity", "setLineOpacity", "linePattern", "getLinePattern", "setLinePattern", "linePatternCrossFade", "getLinePatternCrossFade", "setLinePatternCrossFade", "lineRoundLimit", "getLineRoundLimit", "setLineRoundLimit", "lineSortKey", "getLineSortKey", "setLineSortKey", "lineTranslate", "getLineTranslate", "setLineTranslate", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineTranslateAnchor;", "lineTranslateAnchor", "getLineTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineTranslateAnchor;", "setLineTranslateAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineTranslateAnchor;)V", "lineTrimColor", "getLineTrimColor$annotations", "getLineTrimColor", "setLineTrimColor", "lineTrimColorInt", "getLineTrimColorInt$annotations", "getLineTrimColorInt", "setLineTrimColorInt", "lineTrimColorString", "getLineTrimColorString$annotations", "getLineTrimColorString", "setLineTrimColorString", "lineTrimColorUseTheme", "getLineTrimColorUseTheme$annotations", "getLineTrimColorUseTheme", "setLineTrimColorUseTheme", "lineTrimFadeRange", "getLineTrimFadeRange$annotations", "getLineTrimFadeRange", "setLineTrimFadeRange", "lineTrimOffset", "getLineTrimOffset", "setLineTrimOffset", "lineWidth", "getLineWidth", "setLineWidth", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineWidthUnit;", "lineWidthUnit", "getLineWidthUnit$annotations", "getLineWidthUnit", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineWidthUnit;", "setLineWidthUnit", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineWidthUnit;)V", "lineZOffset", "getLineZOffset$annotations", "getLineZOffset", "setLineZOffset", "maxZoom", "getMaxZoom", "setMaxZoom", "minZoom", "getMinZoom", "setMinZoom", "slot", "getSlot", "setSlot", "create", "featureCollection", "Lcom/mapbox/geojson/FeatureCollection;", "json", "getAnnotationIdKey", "setDataDrivenPropertyIsUsed", "", "property", "Companion", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PolylineAnnotationManager extends AnnotationManagerImpl<LineString, PolylineAnnotation, PolylineAnnotationOptions, OnPolylineAnnotationDragListener, OnPolylineAnnotationClickListener, OnPolylineAnnotationLongClickListener, OnPolylineAnnotationInteractionListener, LineLayer> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static AtomicLong ID_GENERATOR = new AtomicLong(0);

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.annotation.generated.PolylineAnnotationManager$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends q implements p<String, String, LineLayer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2, LineLayer.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // e23.p
        public final LineLayer invoke(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new LineLayer(str, str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolylineAnnotationManager(MapDelegateProvider mapDelegateProvider, AnnotationConfig annotationConfig) {
        super(mapDelegateProvider, annotationConfig, ID_GENERATOR.incrementAndGet(), "polylineAnnotation", AnonymousClass1.INSTANCE);
        mapDelegateProvider.getClass();
        Map<String, Boolean> dataDrivenPropertyUsageMap = getDataDrivenPropertyUsageMap();
        Boolean bool = Boolean.FALSE;
        dataDrivenPropertyUsageMap.put(PolylineAnnotationOptions.PROPERTY_LINE_JOIN, bool);
        getDataDrivenPropertyUsageMap().put(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY, bool);
        getDataDrivenPropertyUsageMap().put(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET, bool);
        getDataDrivenPropertyUsageMap().put(PolylineAnnotationOptions.PROPERTY_LINE_BLUR, bool);
        getDataDrivenPropertyUsageMap().put(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR, bool);
        getDataDrivenPropertyUsageMap().put(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH, bool);
        getDataDrivenPropertyUsageMap().put(PolylineAnnotationOptions.PROPERTY_LINE_COLOR, bool);
        getDataDrivenPropertyUsageMap().put(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH, bool);
        getDataDrivenPropertyUsageMap().put(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET, bool);
        getDataDrivenPropertyUsageMap().put(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY, bool);
        getDataDrivenPropertyUsageMap().put(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN, bool);
        getDataDrivenPropertyUsageMap().put(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH, bool);
        getDataDrivenPropertyUsageMap().put(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME, bool);
        getDataDrivenPropertyUsageMap().put(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME, bool);
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineBorderColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineCrossSlope$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineElevationReference$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineGradientUseTheme$annotations() {
    }

    @e
    @MapboxExperimental
    public static /* synthetic */ void getLineTrimColor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimColorInt$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimColorString$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineTrimFadeRange$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineWidthUnit$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineZOffset$annotations() {
    }

    public final List<PolylineAnnotation> create(FeatureCollection featureCollection) {
        featureCollection.getClass();
        List<Feature> listFeatures = featureCollection.features();
        if (listFeatures == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (Feature feature : listFeatures) {
            PolylineAnnotationOptions.Companion companion = PolylineAnnotationOptions.INSTANCE;
            feature.getClass();
            PolylineAnnotationOptions polylineAnnotationOptionsFromFeature = companion.fromFeature(feature);
            if (polylineAnnotationOptionsFromFeature != null) {
                arrayList.add(polylineAnnotationOptionsFromFeature);
            }
        }
        return create(arrayList);
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManagerImpl
    public String getAnnotationIdKey() {
        return PolylineAnnotation.ID_KEY;
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManagerImpl
    public Expression getLayerFilter() {
        return getLayer$plugin_annotation_release().getFilter();
    }

    public final Double getLineBlur() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolylineAnnotationOptions.PROPERTY_LINE_BLUR);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final Integer getLineBorderColorInt() {
        Integer numE;
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
        if (jsonElement == null || (numE = com.mapbox.maps.p.e(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(numE.intValue());
    }

    public final String getLineBorderColorString() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final String getLineBorderColorUseTheme() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final Double getLineBorderWidth() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final LineCap getLineCap() {
        return getLayer$plugin_annotation_release().getLineCap();
    }

    public final Integer getLineColorInt() {
        Integer numE;
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
        if (jsonElement == null || (numE = com.mapbox.maps.p.e(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(numE.intValue());
    }

    public final String getLineColorString() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final String getLineColorUseTheme() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final Double getLineCrossSlope() {
        return getLayer$plugin_annotation_release().getLineCrossSlope();
    }

    public final List<Double> getLineDasharray() {
        return getLayer$plugin_annotation_release().getLineDasharray();
    }

    public final Double getLineDepthOcclusionFactor() {
        return getLayer$plugin_annotation_release().getLineDepthOcclusionFactor();
    }

    public final LineElevationReference getLineElevationReference() {
        return getLayer$plugin_annotation_release().getLineElevationReference();
    }

    public final Double getLineEmissiveStrength() {
        return getLayer$plugin_annotation_release().getLineEmissiveStrength();
    }

    public final Double getLineGapWidth() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final String getLineGradientUseTheme() {
        return getLayer$plugin_annotation_release().getLineGradientUseTheme();
    }

    public final LineJoin getLineJoin() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolylineAnnotationOptions.PROPERTY_LINE_JOIN);
        if (jsonElement == null) {
            return null;
        }
        LineJoin.Companion companion = LineJoin.INSTANCE;
        String asString = jsonElement.getAsString();
        asString.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = asString.toUpperCase(locale);
        upperCase.getClass();
        return companion.valueOf(upperCase);
    }

    public final Double getLineMiterLimit() {
        return getLayer$plugin_annotation_release().getLineMiterLimit();
    }

    public final Double getLineOcclusionOpacity() {
        return getLayer$plugin_annotation_release().getLineOcclusionOpacity();
    }

    public final Double getLineOffset() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final Double getLineOpacity() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final String getLinePattern() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final Double getLinePatternCrossFade() {
        return getLayer$plugin_annotation_release().getLinePatternCrossFade();
    }

    public final Double getLineRoundLimit() {
        return getLayer$plugin_annotation_release().getLineRoundLimit();
    }

    public final Double getLineSortKey() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final List<Double> getLineTranslate() {
        return getLayer$plugin_annotation_release().getLineTranslate();
    }

    public final LineTranslateAnchor getLineTranslateAnchor() {
        return getLayer$plugin_annotation_release().getLineTranslateAnchor();
    }

    public final String getLineTrimColor() {
        return getLineTrimColorString();
    }

    public final Integer getLineTrimColorInt() {
        Integer numRgbaToColor;
        String lineTrimColor = getLayer$plugin_annotation_release().getLineTrimColor();
        if (lineTrimColor == null || (numRgbaToColor = ColorUtils.INSTANCE.rgbaToColor(lineTrimColor)) == null) {
            return null;
        }
        return Integer.valueOf(numRgbaToColor.intValue());
    }

    public final String getLineTrimColorString() {
        return getLayer$plugin_annotation_release().getLineTrimColor();
    }

    public final String getLineTrimColorUseTheme() {
        return getLayer$plugin_annotation_release().getLineTrimColorUseTheme();
    }

    public final List<Double> getLineTrimFadeRange() {
        return getLayer$plugin_annotation_release().getLineTrimFadeRange();
    }

    public final List<Double> getLineTrimOffset() {
        return getLayer$plugin_annotation_release().getLineTrimOffset();
    }

    public final Double getLineWidth() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final LineWidthUnit getLineWidthUnit() {
        return getLayer$plugin_annotation_release().getLineWidthUnit();
    }

    public final Double getLineZOffset() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final Double getMaxZoom() {
        return getLayer$plugin_annotation_release().getMaxZoom();
    }

    public final Double getMinZoom() {
        return getLayer$plugin_annotation_release().getMinZoom();
    }

    public final String getSlot() {
        return getLayer$plugin_annotation_release().getSlot();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.mapbox.maps.plugin.annotation.AnnotationManagerImpl
    public void setDataDrivenPropertyIsUsed(String property) {
        property.getClass();
        switch (property.hashCode()) {
            case -2043443136:
                if (property.equals(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME)) {
                    LineLayer layer$plugin_annotation_release = getLayer$plugin_annotation_release();
                    Expression.Companion companion = Expression.INSTANCE;
                    layer$plugin_annotation_release.lineColorUseTheme(companion.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME));
                    getDragLayer$plugin_annotation_release().lineColorUseTheme(companion.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME));
                    break;
                }
                break;
            case -1842775392:
                if (property.equals(PolylineAnnotationOptions.PROPERTY_LINE_BLUR)) {
                    LineLayer layer$plugin_annotation_release2 = getLayer$plugin_annotation_release();
                    Expression.Companion companion2 = Expression.INSTANCE;
                    layer$plugin_annotation_release2.lineBlur(companion2.get(PolylineAnnotationOptions.PROPERTY_LINE_BLUR));
                    getDragLayer$plugin_annotation_release().lineBlur(companion2.get(PolylineAnnotationOptions.PROPERTY_LINE_BLUR));
                    break;
                }
                break;
            case -1842534557:
                if (property.equals(PolylineAnnotationOptions.PROPERTY_LINE_JOIN)) {
                    LineLayer layer$plugin_annotation_release3 = getLayer$plugin_annotation_release();
                    Expression.Companion companion3 = Expression.INSTANCE;
                    layer$plugin_annotation_release3.lineJoin(companion3.get(PolylineAnnotationOptions.PROPERTY_LINE_JOIN));
                    getDragLayer$plugin_annotation_release().lineJoin(companion3.get(PolylineAnnotationOptions.PROPERTY_LINE_JOIN));
                    break;
                }
                break;
            case -1788506263:
                if (property.equals(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY)) {
                    LineLayer layer$plugin_annotation_release4 = getLayer$plugin_annotation_release();
                    Expression.Companion companion4 = Expression.INSTANCE;
                    layer$plugin_annotation_release4.lineSortKey(companion4.get(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY));
                    getDragLayer$plugin_annotation_release().lineSortKey(companion4.get(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY));
                    break;
                }
                break;
            case -1763440266:
                if (property.equals(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH)) {
                    LineLayer layer$plugin_annotation_release5 = getLayer$plugin_annotation_release();
                    Expression.Companion companion5 = Expression.INSTANCE;
                    layer$plugin_annotation_release5.lineGapWidth(companion5.get(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH));
                    getDragLayer$plugin_annotation_release().lineGapWidth(companion5.get(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH));
                    break;
                }
                break;
            case -1290458038:
                if (property.equals(PolylineAnnotationOptions.PROPERTY_LINE_COLOR)) {
                    LineLayer layer$plugin_annotation_release6 = getLayer$plugin_annotation_release();
                    Expression.Companion companion6 = Expression.INSTANCE;
                    layer$plugin_annotation_release6.lineColor(companion6.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR));
                    getDragLayer$plugin_annotation_release().lineColor(companion6.get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR));
                    break;
                }
                break;
            case -1272173907:
                if (property.equals(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH)) {
                    LineLayer layer$plugin_annotation_release7 = getLayer$plugin_annotation_release();
                    Expression.Companion companion7 = Expression.INSTANCE;
                    layer$plugin_annotation_release7.lineWidth(companion7.get(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH));
                    getDragLayer$plugin_annotation_release().lineWidth(companion7.get(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH));
                    break;
                }
                break;
            case -1101375694:
                if (property.equals(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY)) {
                    LineLayer layer$plugin_annotation_release8 = getLayer$plugin_annotation_release();
                    Expression.Companion companion8 = Expression.INSTANCE;
                    layer$plugin_annotation_release8.lineOpacity(companion8.get(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY));
                    getDragLayer$plugin_annotation_release().lineOpacity(companion8.get(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY));
                    break;
                }
                break;
            case -1016547585:
                if (property.equals(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET)) {
                    LineLayer layer$plugin_annotation_release9 = getLayer$plugin_annotation_release();
                    Expression.Companion companion9 = Expression.INSTANCE;
                    layer$plugin_annotation_release9.lineZOffset(companion9.get(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET));
                    getDragLayer$plugin_annotation_release().lineZOffset(companion9.get(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET));
                    break;
                }
                break;
            case -1014430580:
                if (property.equals(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET)) {
                    LineLayer layer$plugin_annotation_release10 = getLayer$plugin_annotation_release();
                    Expression.Companion companion10 = Expression.INSTANCE;
                    layer$plugin_annotation_release10.lineOffset(companion10.get(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET));
                    getDragLayer$plugin_annotation_release().lineOffset(companion10.get(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET));
                    break;
                }
                break;
            case -625259849:
                if (property.equals(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN)) {
                    LineLayer layer$plugin_annotation_release11 = getLayer$plugin_annotation_release();
                    Expression.Companion companion11 = Expression.INSTANCE;
                    layer$plugin_annotation_release11.linePattern(companion11.get(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN));
                    getDragLayer$plugin_annotation_release().linePattern(companion11.get(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN));
                    break;
                }
                break;
            case 1136060347:
                if (property.equals(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR)) {
                    LineLayer layer$plugin_annotation_release12 = getLayer$plugin_annotation_release();
                    Expression.Companion companion12 = Expression.INSTANCE;
                    layer$plugin_annotation_release12.lineBorderColor(companion12.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR));
                    getDragLayer$plugin_annotation_release().lineBorderColor(companion12.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR));
                    break;
                }
                break;
            case 1154344478:
                if (property.equals(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH)) {
                    LineLayer layer$plugin_annotation_release13 = getLayer$plugin_annotation_release();
                    Expression.Companion companion13 = Expression.INSTANCE;
                    layer$plugin_annotation_release13.lineBorderWidth(companion13.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH));
                    getDragLayer$plugin_annotation_release().lineBorderWidth(companion13.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH));
                    break;
                }
                break;
            case 1226467953:
                if (property.equals(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME)) {
                    LineLayer layer$plugin_annotation_release14 = getLayer$plugin_annotation_release();
                    Expression.Companion companion14 = Expression.INSTANCE;
                    layer$plugin_annotation_release14.lineBorderColorUseTheme(companion14.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME));
                    getDragLayer$plugin_annotation_release().lineBorderColorUseTheme(companion14.get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME));
                    break;
                }
                break;
        }
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManagerImpl
    public void setLayerFilter(Expression expression) {
        if (expression != null) {
            getLayer$plugin_annotation_release().filter(expression);
            getDragLayer$plugin_annotation_release().filter(expression);
        }
    }

    public final void setLineBlur(Double d14) {
        if (d14 != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_BLUR, d14);
            enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_BLUR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolylineAnnotationOptions.PROPERTY_LINE_BLUR);
        }
        update(getAnnotations());
    }

    public final void setLineBorderColorInt(Integer num) {
        if (num != null) {
            com.mapbox.maps.p.l(num, ColorUtils.INSTANCE, getDataDrivenPropertyDefaultValues(), PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
            enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
        }
        update(getAnnotations());
    }

    public final void setLineBorderColorString(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR, str);
            enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
        }
        update(getAnnotations());
    }

    public final void setLineBorderColorUseTheme(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME, str);
            enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME);
        }
        update(getAnnotations());
    }

    public final void setLineBorderWidth(Double d14) {
        if (d14 != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH, d14);
            enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH);
        }
        update(getAnnotations());
    }

    public final void setLineCap(LineCap lineCap) {
        setLayerProperty(lineCap != null ? TypeUtils.INSTANCE.wrapToValue(lineCap) : com.mapbox.maps.p.a("line", "line-cap"), "line-cap");
    }

    public final void setLineColorInt(Integer num) {
        if (num != null) {
            com.mapbox.maps.p.l(num, ColorUtils.INSTANCE, getDataDrivenPropertyDefaultValues(), PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
            enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
        }
        update(getAnnotations());
    }

    public final void setLineColorString(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_COLOR, str);
            enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
        }
        update(getAnnotations());
    }

    public final void setLineColorUseTheme(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME, str);
            enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME);
        }
        update(getAnnotations());
    }

    public final void setLineCrossSlope(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("line", "line-cross-slope"), "line-cross-slope");
    }

    public final void setLineDasharray(List<Double> list) {
        setLayerProperty(list != null ? TypeUtils.INSTANCE.wrapToValue(list) : com.mapbox.maps.p.a("line", "line-dasharray"), "line-dasharray");
    }

    public final void setLineDepthOcclusionFactor(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("line", "line-depth-occlusion-factor"), "line-depth-occlusion-factor");
    }

    public final void setLineElevationReference(LineElevationReference lineElevationReference) {
        setLayerProperty(lineElevationReference != null ? TypeUtils.INSTANCE.wrapToValue(lineElevationReference) : com.mapbox.maps.p.a("line", "line-elevation-reference"), "line-elevation-reference");
    }

    public final void setLineEmissiveStrength(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("line", "line-emissive-strength"), "line-emissive-strength");
    }

    public final void setLineGapWidth(Double d14) {
        if (d14 != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH, d14);
            enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH);
        }
        update(getAnnotations());
    }

    public final void setLineGradientUseTheme(String str) {
        setLayerProperty(str != null ? TypeUtils.INSTANCE.wrapToValue(str) : com.mapbox.maps.p.a("line", "line-gradient-use-theme"), "line-gradient-use-theme");
    }

    public final void setLineJoin(LineJoin lineJoin) {
        if (lineJoin != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_JOIN, lineJoin.getValue());
            enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_JOIN);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolylineAnnotationOptions.PROPERTY_LINE_JOIN);
        }
        update(getAnnotations());
    }

    public final void setLineMiterLimit(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("line", "line-miter-limit"), "line-miter-limit");
    }

    public final void setLineOcclusionOpacity(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("line", "line-occlusion-opacity"), "line-occlusion-opacity");
    }

    public final void setLineOffset(Double d14) {
        if (d14 != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET, d14);
            enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET);
        }
        update(getAnnotations());
    }

    public final void setLineOpacity(Double d14) {
        if (d14 != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY, d14);
            enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY);
        }
        update(getAnnotations());
    }

    public final void setLinePattern(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN, str);
            enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN);
        }
        update(getAnnotations());
    }

    public final void setLinePatternCrossFade(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("line", "line-pattern-cross-fade"), "line-pattern-cross-fade");
    }

    public final void setLineRoundLimit(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("line", "line-round-limit"), "line-round-limit");
    }

    public final void setLineSortKey(Double d14) {
        if (d14 != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY, d14);
            enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY);
        }
        update(getAnnotations());
    }

    public final void setLineTranslate(List<Double> list) {
        setLayerProperty(list != null ? TypeUtils.INSTANCE.wrapToValue(list) : com.mapbox.maps.p.a("line", "line-translate"), "line-translate");
    }

    public final void setLineTranslateAnchor(LineTranslateAnchor lineTranslateAnchor) {
        setLayerProperty(lineTranslateAnchor != null ? TypeUtils.INSTANCE.wrapToValue(lineTranslateAnchor) : com.mapbox.maps.p.a("line", "line-translate-anchor"), "line-translate-anchor");
    }

    public final void setLineTrimColor(String str) {
        setLineTrimColorString(str);
    }

    public final void setLineTrimColorInt(Integer num) {
        setLayerProperty(num != null ? TypeUtils.INSTANCE.wrapToValue(ColorUtils.INSTANCE.colorToRgbaString(num.intValue())) : com.mapbox.maps.p.a("line", "line-trim-color"), "line-trim-color");
    }

    public final void setLineTrimColorString(String str) {
        setLayerProperty(str != null ? TypeUtils.INSTANCE.wrapToValue(str) : com.mapbox.maps.p.a("line", "line-trim-color"), "line-trim-color");
    }

    public final void setLineTrimColorUseTheme(String str) {
        setLayerProperty(str != null ? TypeUtils.INSTANCE.wrapToValue(str) : com.mapbox.maps.p.a("line", "line-trim-color-use-theme"), "line-trim-color-use-theme");
    }

    public final void setLineTrimFadeRange(List<Double> list) {
        setLayerProperty(list != null ? TypeUtils.INSTANCE.wrapToValue(list) : com.mapbox.maps.p.a("line", "line-trim-fade-range"), "line-trim-fade-range");
    }

    public final void setLineTrimOffset(List<Double> list) {
        setLayerProperty(list != null ? TypeUtils.INSTANCE.wrapToValue(list) : com.mapbox.maps.p.a("line", "line-trim-offset"), "line-trim-offset");
    }

    public final void setLineWidth(Double d14) {
        if (d14 != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH, d14);
            enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH);
        }
        update(getAnnotations());
    }

    public final void setLineWidthUnit(LineWidthUnit lineWidthUnit) {
        setLayerProperty(lineWidthUnit != null ? TypeUtils.INSTANCE.wrapToValue(lineWidthUnit) : com.mapbox.maps.p.a("line", "line-width-unit"), "line-width-unit");
    }

    public final void setLineZOffset(Double d14) {
        if (d14 != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET, d14);
            enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET);
        }
        update(getAnnotations());
    }

    public final void setMaxZoom(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("line", "maxzoom"), "maxzoom");
    }

    public final void setMinZoom(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("line", "minzoom"), "minzoom");
    }

    public final void setSlot(String str) {
        setLayerProperty(str != null ? TypeUtils.INSTANCE.wrapToValue(str) : com.mapbox.maps.p.a("line", "slot"), "slot");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotationManager$Companion;", "", "()V", "ID_GENERATOR", "Ljava/util/concurrent/atomic/AtomicLong;", "getID_GENERATOR", "()Ljava/util/concurrent/atomic/AtomicLong;", "setID_GENERATOR", "(Ljava/util/concurrent/atomic/AtomicLong;)V", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final AtomicLong getID_GENERATOR() {
            return PolylineAnnotationManager.ID_GENERATOR;
        }

        public final void setID_GENERATOR(AtomicLong atomicLong) {
            atomicLong.getClass();
            PolylineAnnotationManager.ID_GENERATOR = atomicLong;
        }

        private Companion() {
        }
    }

    public final List<PolylineAnnotation> create(String json) {
        json.getClass();
        FeatureCollection featureCollectionFromJson = FeatureCollection.fromJson(json);
        featureCollectionFromJson.getClass();
        return create(featureCollectionFromJson);
    }

    public /* synthetic */ PolylineAnnotationManager(MapDelegateProvider mapDelegateProvider, AnnotationConfig annotationConfig, int i14, j jVar) {
        this(mapDelegateProvider, (i14 & 2) != 0 ? null : annotationConfig);
    }
}
