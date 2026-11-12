package com.mapbox.maps.extension.compose.annotation.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.layers.properties.generated.CircleElevationReference;
import com.mapbox.maps.extension.style.layers.properties.generated.CirclePitchAlignment;
import com.mapbox.maps.extension.style.layers.properties.generated.CirclePitchScale;
import com.mapbox.maps.extension.style.layers.properties.generated.CircleTranslateAnchor;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotationManager;
import e23.p;
import java.util.List;
import o4.d0;
import o4.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\by\b\u0007\u0018\u00002\u00020\u0001BÎ\u0001\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fB\t\b\u0016¢\u0006\u0004\b\u001e\u0010 J\u0017\u0010&\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b'\u0010%J\u0017\u0010(\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b(\u0010%J\u0017\u0010)\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b)\u0010%J\u0017\u0010*\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b*\u0010%J\u0017\u0010+\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b+\u0010%J\u0017\u0010,\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b,\u0010%J\u0017\u0010-\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b-\u0010%J\u0017\u0010.\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b.\u0010%J\u0017\u0010/\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b/\u0010%J\u0017\u00100\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b0\u0010%J\u0017\u00101\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b1\u0010%J\u0017\u00102\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b2\u0010%J\u0017\u00103\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b3\u0010%J\u0017\u00104\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b4\u0010%J\u0017\u00105\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b5\u0010%J\u0017\u00106\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b6\u0010%J\u0017\u00107\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b7\u0010%J\u0017\u00108\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b8\u0010%R+\u0010@\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R5\u0010G\u001a\u0004\u0018\u00010\u00022\b\u00109\u001a\u0004\u0018\u00010\u00028F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bA\u0010;\u0012\u0004\bF\u0010 \u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER/\u0010M\u001a\u0004\u0018\u00010\u00042\b\u00109\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010;\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR/\u0010Q\u001a\u0004\u0018\u00010\u00042\b\u00109\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bN\u0010;\u001a\u0004\bO\u0010J\"\u0004\bP\u0010LR8\u0010W\u001a\u0004\u0018\u00010\u00072\b\u00109\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bR\u0010;\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR/\u0010[\u001a\u0004\u0018\u00010\u00042\b\u00109\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010;\u001a\u0004\bY\u0010J\"\u0004\bZ\u0010LR/\u0010_\u001a\u0004\u0018\u00010\u00042\b\u00109\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010;\u001a\u0004\b]\u0010J\"\u0004\b^\u0010LR/\u0010e\u001a\u0004\u0018\u00010\u000b2\b\u00109\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b`\u0010;\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR/\u0010k\u001a\u0004\u0018\u00010\r2\b\u00109\u001a\u0004\u0018\u00010\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bf\u0010;\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR/\u0010o\u001a\u0004\u0018\u00010\u00042\b\u00109\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bl\u0010;\u001a\u0004\bm\u0010J\"\u0004\bn\u0010LR8\u0010s\u001a\u0004\u0018\u00010\u00072\b\u00109\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bp\u0010;\u001a\u0004\bq\u0010T\"\u0004\br\u0010VR/\u0010w\u001a\u0004\u0018\u00010\u00042\b\u00109\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bt\u0010;\u001a\u0004\bu\u0010J\"\u0004\bv\u0010LR/\u0010{\u001a\u0004\u0018\u00010\u00042\b\u00109\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bx\u0010;\u001a\u0004\by\u0010J\"\u0004\bz\u0010LR=\u0010\u0081\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00132\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0013\n\u0004\b|\u0010;\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R5\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00152\b\u00109\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u0082\u0001\u0010;\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R3\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00042\b\u00109\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010;\u001a\u0005\b\u0089\u0001\u0010J\"\u0005\b\u008a\u0001\u0010LR3\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00042\b\u00109\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010;\u001a\u0005\b\u008d\u0001\u0010J\"\u0005\b\u008e\u0001\u0010LR<\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00192\b\u00109\u001a\u0004\u0018\u00010\u00198F@FX\u0087\u008e\u0002¢\u0006\u001e\n\u0005\b\u0090\u0001\u0010;\u0012\u0005\b\u0095\u0001\u0010 \u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R<\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00192\b\u00109\u001a\u0004\u0018\u00010\u00198F@FX\u0087\u008e\u0002¢\u0006\u001e\n\u0005\b\u0097\u0001\u0010;\u0012\u0005\b\u009a\u0001\u0010 \u001a\u0006\b\u0098\u0001\u0010\u0092\u0001\"\u0006\b\u0099\u0001\u0010\u0094\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009c\u0001"}, d2 = {"Lcom/mapbox/maps/extension/compose/annotation/generated/CircleAnnotationGroupState;", "", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleElevationReference;", "initialCircleElevationReference", "", "initialCircleSortKey", "initialCircleBlur", "Lo4/d0;", "initialCircleColor", "initialCircleEmissiveStrength", "initialCircleOpacity", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchAlignment;", "initialCirclePitchAlignment", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchScale;", "initialCirclePitchScale", "initialCircleRadius", "initialCircleStrokeColor", "initialCircleStrokeOpacity", "initialCircleStrokeWidth", "", "initialCircleTranslate", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleTranslateAnchor;", "initialCircleTranslateAnchor", "initialMaxZoom", "initialMinZoom", "", "initialCircleColorUseTheme", "initialCircleStrokeColorUseTheme", "Lcom/mapbox/maps/extension/compose/annotation/generated/CircleAnnotationGroupInteractionsState;", "initialCircleAnnotationGroupInteractionsState", "<init>", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleElevationReference;Ljava/lang/Double;Ljava/lang/Double;Lo4/d0;Ljava/lang/Double;Ljava/lang/Double;Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchAlignment;Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchScale;Ljava/lang/Double;Lo4/d0;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleTranslateAnchor;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/extension/compose/annotation/generated/CircleAnnotationGroupInteractionsState;)V", "()V", "Lcom/mapbox/maps/plugin/annotation/generated/CircleAnnotationManager;", "annotationManager", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/plugin/annotation/generated/CircleAnnotationManager;Lp3/m;I)V", "UpdateProperties", "UpdateCircleElevationReference", "UpdateCircleSortKey", "UpdateCircleBlur", "UpdateCircleColor", "UpdateCircleEmissiveStrength", "UpdateCircleOpacity", "UpdateCirclePitchAlignment", "UpdateCirclePitchScale", "UpdateCircleRadius", "UpdateCircleStrokeColor", "UpdateCircleStrokeOpacity", "UpdateCircleStrokeWidth", "UpdateCircleTranslate", "UpdateCircleTranslateAnchor", "UpdateMaxZoom", "UpdateMinZoom", "UpdateCircleColorUseTheme", "UpdateCircleStrokeColorUseTheme", "<set-?>", "interactionsState$delegate", "Lp3/p1;", "getInteractionsState", "()Lcom/mapbox/maps/extension/compose/annotation/generated/CircleAnnotationGroupInteractionsState;", "setInteractionsState", "(Lcom/mapbox/maps/extension/compose/annotation/generated/CircleAnnotationGroupInteractionsState;)V", "interactionsState", "circleElevationReference$delegate", "getCircleElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleElevationReference;", "setCircleElevationReference", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleElevationReference;)V", "getCircleElevationReference$annotations", "circleElevationReference", "circleSortKey$delegate", "getCircleSortKey", "()Ljava/lang/Double;", "setCircleSortKey", "(Ljava/lang/Double;)V", "circleSortKey", "circleBlur$delegate", "getCircleBlur", "setCircleBlur", "circleBlur", "circleColor$delegate", "getCircleColor-QN2ZGVo", "()Lo4/d0;", "setCircleColor-Y2TPw74", "(Lo4/d0;)V", "circleColor", "circleEmissiveStrength$delegate", "getCircleEmissiveStrength", "setCircleEmissiveStrength", "circleEmissiveStrength", "circleOpacity$delegate", "getCircleOpacity", "setCircleOpacity", "circleOpacity", "circlePitchAlignment$delegate", "getCirclePitchAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchAlignment;", "setCirclePitchAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchAlignment;)V", "circlePitchAlignment", "circlePitchScale$delegate", "getCirclePitchScale", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchScale;", "setCirclePitchScale", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchScale;)V", "circlePitchScale", "circleRadius$delegate", "getCircleRadius", "setCircleRadius", "circleRadius", "circleStrokeColor$delegate", "getCircleStrokeColor-QN2ZGVo", "setCircleStrokeColor-Y2TPw74", "circleStrokeColor", "circleStrokeOpacity$delegate", "getCircleStrokeOpacity", "setCircleStrokeOpacity", "circleStrokeOpacity", "circleStrokeWidth$delegate", "getCircleStrokeWidth", "setCircleStrokeWidth", "circleStrokeWidth", "circleTranslate$delegate", "getCircleTranslate", "()Ljava/util/List;", "setCircleTranslate", "(Ljava/util/List;)V", "circleTranslate", "circleTranslateAnchor$delegate", "getCircleTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleTranslateAnchor;", "setCircleTranslateAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleTranslateAnchor;)V", "circleTranslateAnchor", "maxZoom$delegate", "getMaxZoom", "setMaxZoom", "maxZoom", "minZoom$delegate", "getMinZoom", "setMinZoom", "minZoom", "circleColorUseTheme$delegate", "getCircleColorUseTheme", "()Ljava/lang/String;", "setCircleColorUseTheme", "(Ljava/lang/String;)V", "getCircleColorUseTheme$annotations", "circleColorUseTheme", "circleStrokeColorUseTheme$delegate", "getCircleStrokeColorUseTheme", "setCircleStrokeColorUseTheme", "getCircleStrokeColorUseTheme$annotations", "circleStrokeColorUseTheme", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CircleAnnotationGroupState {

    /* JADX INFO: renamed from: circleBlur$delegate, reason: from kotlin metadata */
    private final p1 circleBlur;

    /* JADX INFO: renamed from: circleColor$delegate, reason: from kotlin metadata */
    private final p1 circleColor;

    /* JADX INFO: renamed from: circleColorUseTheme$delegate, reason: from kotlin metadata */
    private final p1 circleColorUseTheme;

    /* JADX INFO: renamed from: circleElevationReference$delegate, reason: from kotlin metadata */
    private final p1 circleElevationReference;

    /* JADX INFO: renamed from: circleEmissiveStrength$delegate, reason: from kotlin metadata */
    private final p1 circleEmissiveStrength;

    /* JADX INFO: renamed from: circleOpacity$delegate, reason: from kotlin metadata */
    private final p1 circleOpacity;

    /* JADX INFO: renamed from: circlePitchAlignment$delegate, reason: from kotlin metadata */
    private final p1 circlePitchAlignment;

    /* JADX INFO: renamed from: circlePitchScale$delegate, reason: from kotlin metadata */
    private final p1 circlePitchScale;

    /* JADX INFO: renamed from: circleRadius$delegate, reason: from kotlin metadata */
    private final p1 circleRadius;

    /* JADX INFO: renamed from: circleSortKey$delegate, reason: from kotlin metadata */
    private final p1 circleSortKey;

    /* JADX INFO: renamed from: circleStrokeColor$delegate, reason: from kotlin metadata */
    private final p1 circleStrokeColor;

    /* JADX INFO: renamed from: circleStrokeColorUseTheme$delegate, reason: from kotlin metadata */
    private final p1 circleStrokeColorUseTheme;

    /* JADX INFO: renamed from: circleStrokeOpacity$delegate, reason: from kotlin metadata */
    private final p1 circleStrokeOpacity;

    /* JADX INFO: renamed from: circleStrokeWidth$delegate, reason: from kotlin metadata */
    private final p1 circleStrokeWidth;

    /* JADX INFO: renamed from: circleTranslate$delegate, reason: from kotlin metadata */
    private final p1 circleTranslate;

    /* JADX INFO: renamed from: circleTranslateAnchor$delegate, reason: from kotlin metadata */
    private final p1 circleTranslateAnchor;

    /* JADX INFO: renamed from: interactionsState$delegate, reason: from kotlin metadata */
    private final p1 interactionsState;

    /* JADX INFO: renamed from: maxZoom$delegate, reason: from kotlin metadata */
    private final p1 maxZoom;

    /* JADX INFO: renamed from: minZoom$delegate, reason: from kotlin metadata */
    private final p1 minZoom;

    private CircleAnnotationGroupState(CircleElevationReference circleElevationReference, Double d14, Double d15, d0 d0Var, Double d16, Double d17, CirclePitchAlignment circlePitchAlignment, CirclePitchScale circlePitchScale, Double d18, d0 d0Var2, Double d19, Double d24, List<Double> list, CircleTranslateAnchor circleTranslateAnchor, Double d25, Double d26, String str, String str2, CircleAnnotationGroupInteractionsState circleAnnotationGroupInteractionsState) {
        this.interactionsState = p0.n(circleAnnotationGroupInteractionsState);
        this.circleElevationReference = p0.n(circleElevationReference);
        this.circleSortKey = p0.n(d14);
        this.circleBlur = p0.n(d15);
        this.circleColor = p0.n(d0Var);
        this.circleEmissiveStrength = p0.n(d16);
        this.circleOpacity = p0.n(d17);
        this.circlePitchAlignment = p0.n(circlePitchAlignment);
        this.circlePitchScale = p0.n(circlePitchScale);
        this.circleRadius = p0.n(d18);
        this.circleStrokeColor = p0.n(d0Var2);
        this.circleStrokeOpacity = p0.n(d19);
        this.circleStrokeWidth = p0.n(d24);
        this.circleTranslate = p0.n(list);
        this.circleTranslateAnchor = p0.n(circleTranslateAnchor);
        this.maxZoom = p0.n(d25);
        this.minZoom = p0.n(d26);
        this.circleColorUseTheme = p0.n(str);
        this.circleStrokeColorUseTheme = p0.n(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleBlur(CircleAnnotationManager circleAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1848230736);
        x1 x1Var = n.f135158a;
        circleAnnotationManager.setCircleBlur(getCircleBlur());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass1(circleAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleColor(CircleAnnotationManager circleAnnotationManager, m mVar, int i14) {
        String strColorToRgbaString;
        o0 o0VarE = mVar.E(1284514046);
        x1 x1Var = n.f135158a;
        d0 d0VarM140getCircleColorQN2ZGVo = m140getCircleColorQN2ZGVo();
        if (d0VarM140getCircleColorQN2ZGVo != null) {
            strColorToRgbaString = ColorUtils.INSTANCE.colorToRgbaString(f0.j(d0VarM140getCircleColorQN2ZGVo.f128833a));
        } else {
            strColorToRgbaString = null;
        }
        circleAnnotationManager.setCircleColorString(strColorToRgbaString);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(circleAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleColorUseTheme(CircleAnnotationManager circleAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-841589088);
        x1 x1Var = n.f135158a;
        circleAnnotationManager.setCircleColorUseTheme(getCircleColorUseTheme());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39771(circleAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleElevationReference(CircleAnnotationManager circleAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1384512759);
        x1 x1Var = n.f135158a;
        circleAnnotationManager.setCircleElevationReference(getCircleElevationReference());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39781(circleAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleEmissiveStrength(CircleAnnotationManager circleAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-843482623);
        x1 x1Var = n.f135158a;
        circleAnnotationManager.setCircleEmissiveStrength(getCircleEmissiveStrength());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39791(circleAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleOpacity(CircleAnnotationManager circleAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-458835098);
        x1 x1Var = n.f135158a;
        circleAnnotationManager.setCircleOpacity(getCircleOpacity());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39801(circleAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCirclePitchAlignment(CircleAnnotationManager circleAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1231217676);
        x1 x1Var = n.f135158a;
        circleAnnotationManager.setCirclePitchAlignment(getCirclePitchAlignment());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39811(circleAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCirclePitchScale(CircleAnnotationManager circleAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-168708493);
        x1 x1Var = n.f135158a;
        circleAnnotationManager.setCirclePitchScale(getCirclePitchScale());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39821(circleAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleRadius(CircleAnnotationManager circleAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1283386213);
        x1 x1Var = n.f135158a;
        circleAnnotationManager.setCircleRadius(getCircleRadius());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39831(circleAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleSortKey(CircleAnnotationManager circleAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1221118524);
        x1 x1Var = n.f135158a;
        circleAnnotationManager.setCircleSortKey(getCircleSortKey());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39841(circleAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleStrokeColor(CircleAnnotationManager circleAnnotationManager, m mVar, int i14) {
        String strColorToRgbaString;
        o0 o0VarE = mVar.E(-145220890);
        x1 x1Var = n.f135158a;
        d0 d0VarM141getCircleStrokeColorQN2ZGVo = m141getCircleStrokeColorQN2ZGVo();
        if (d0VarM141getCircleStrokeColorQN2ZGVo != null) {
            strColorToRgbaString = ColorUtils.INSTANCE.colorToRgbaString(f0.j(d0VarM141getCircleStrokeColorQN2ZGVo.f128833a));
        } else {
            strColorToRgbaString = null;
        }
        circleAnnotationManager.setCircleStrokeColorString(strColorToRgbaString);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39852(circleAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleStrokeColorUseTheme(CircleAnnotationManager circleAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1348865912);
        x1 x1Var = n.f135158a;
        circleAnnotationManager.setCircleStrokeColorUseTheme(getCircleStrokeColorUseTheme());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39861(circleAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleStrokeOpacity(CircleAnnotationManager circleAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-44573874);
        x1 x1Var = n.f135158a;
        circleAnnotationManager.setCircleStrokeOpacity(getCircleStrokeOpacity());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39871(circleAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleStrokeWidth(CircleAnnotationManager circleAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-72726839);
        x1 x1Var = n.f135158a;
        circleAnnotationManager.setCircleStrokeWidth(getCircleStrokeWidth());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39881(circleAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleTranslate(CircleAnnotationManager circleAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-590364695);
        x1 x1Var = n.f135158a;
        circleAnnotationManager.setCircleTranslate(getCircleTranslate());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39891(circleAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleTranslateAnchor(CircleAnnotationManager circleAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1147040766);
        x1 x1Var = n.f135158a;
        circleAnnotationManager.setCircleTranslateAnchor(getCircleTranslateAnchor());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39901(circleAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateMaxZoom(CircleAnnotationManager circleAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-544262558);
        x1 x1Var = n.f135158a;
        circleAnnotationManager.setMaxZoom(getMaxZoom());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39911(circleAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateMinZoom(CircleAnnotationManager circleAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-987553968);
        x1 x1Var = n.f135158a;
        circleAnnotationManager.setMinZoom(getMinZoom());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39921(circleAnnotationManager, i14);
    }

    @MapboxExperimental
    public static /* synthetic */ void getCircleColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getCircleElevationReference$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getCircleStrokeColorUseTheme$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(CircleAnnotationManager circleAnnotationManager, m mVar, int i14) {
        circleAnnotationManager.getClass();
        o0 o0VarE = mVar.E(696675980);
        x1 x1Var = n.f135158a;
        int i15 = (i14 & 112) | 8;
        UpdateCircleElevationReference(circleAnnotationManager, o0VarE, i15);
        UpdateCircleSortKey(circleAnnotationManager, o0VarE, i15);
        UpdateCircleBlur(circleAnnotationManager, o0VarE, i15);
        UpdateCircleColor(circleAnnotationManager, o0VarE, i15);
        UpdateCircleEmissiveStrength(circleAnnotationManager, o0VarE, i15);
        UpdateCircleOpacity(circleAnnotationManager, o0VarE, i15);
        UpdateCirclePitchAlignment(circleAnnotationManager, o0VarE, i15);
        UpdateCirclePitchScale(circleAnnotationManager, o0VarE, i15);
        UpdateCircleRadius(circleAnnotationManager, o0VarE, i15);
        UpdateCircleStrokeColor(circleAnnotationManager, o0VarE, i15);
        UpdateCircleStrokeOpacity(circleAnnotationManager, o0VarE, i15);
        UpdateCircleStrokeWidth(circleAnnotationManager, o0VarE, i15);
        UpdateCircleTranslate(circleAnnotationManager, o0VarE, i15);
        UpdateCircleTranslateAnchor(circleAnnotationManager, o0VarE, i15);
        UpdateMaxZoom(circleAnnotationManager, o0VarE, i15);
        UpdateMinZoom(circleAnnotationManager, o0VarE, i15);
        UpdateCircleColorUseTheme(circleAnnotationManager, o0VarE, i15);
        UpdateCircleStrokeColorUseTheme(circleAnnotationManager, o0VarE, i15);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new CircleAnnotationGroupState$UpdateProperties$1(this, circleAnnotationManager, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getCircleBlur() {
        return (Double) this.circleBlur.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getCircleColor-QN2ZGVo, reason: not valid java name */
    public final d0 m140getCircleColorQN2ZGVo() {
        return (d0) this.circleColor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getCircleColorUseTheme() {
        return (String) this.circleColorUseTheme.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CircleElevationReference getCircleElevationReference() {
        return (CircleElevationReference) this.circleElevationReference.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getCircleEmissiveStrength() {
        return (Double) this.circleEmissiveStrength.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getCircleOpacity() {
        return (Double) this.circleOpacity.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CirclePitchAlignment getCirclePitchAlignment() {
        return (CirclePitchAlignment) this.circlePitchAlignment.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CirclePitchScale getCirclePitchScale() {
        return (CirclePitchScale) this.circlePitchScale.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getCircleRadius() {
        return (Double) this.circleRadius.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getCircleSortKey() {
        return (Double) this.circleSortKey.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getCircleStrokeColor-QN2ZGVo, reason: not valid java name */
    public final d0 m141getCircleStrokeColorQN2ZGVo() {
        return (d0) this.circleStrokeColor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getCircleStrokeColorUseTheme() {
        return (String) this.circleStrokeColorUseTheme.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getCircleStrokeOpacity() {
        return (Double) this.circleStrokeOpacity.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getCircleStrokeWidth() {
        return (Double) this.circleStrokeWidth.getF182175a();
    }

    public final List<Double> getCircleTranslate() {
        return (List) this.circleTranslate.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CircleTranslateAnchor getCircleTranslateAnchor() {
        return (CircleTranslateAnchor) this.circleTranslateAnchor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CircleAnnotationGroupInteractionsState getInteractionsState() {
        return (CircleAnnotationGroupInteractionsState) this.interactionsState.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getMaxZoom() {
        return (Double) this.maxZoom.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getMinZoom() {
        return (Double) this.minZoom.getF182175a();
    }

    public final void setCircleBlur(Double d14) {
        this.circleBlur.setValue(d14);
    }

    /* JADX INFO: renamed from: setCircleColor-Y2TPw74, reason: not valid java name */
    public final void m142setCircleColorY2TPw74(d0 d0Var) {
        this.circleColor.setValue(d0Var);
    }

    public final void setCircleColorUseTheme(String str) {
        this.circleColorUseTheme.setValue(str);
    }

    public final void setCircleElevationReference(CircleElevationReference circleElevationReference) {
        this.circleElevationReference.setValue(circleElevationReference);
    }

    public final void setCircleEmissiveStrength(Double d14) {
        this.circleEmissiveStrength.setValue(d14);
    }

    public final void setCircleOpacity(Double d14) {
        this.circleOpacity.setValue(d14);
    }

    public final void setCirclePitchAlignment(CirclePitchAlignment circlePitchAlignment) {
        this.circlePitchAlignment.setValue(circlePitchAlignment);
    }

    public final void setCirclePitchScale(CirclePitchScale circlePitchScale) {
        this.circlePitchScale.setValue(circlePitchScale);
    }

    public final void setCircleRadius(Double d14) {
        this.circleRadius.setValue(d14);
    }

    public final void setCircleSortKey(Double d14) {
        this.circleSortKey.setValue(d14);
    }

    /* JADX INFO: renamed from: setCircleStrokeColor-Y2TPw74, reason: not valid java name */
    public final void m143setCircleStrokeColorY2TPw74(d0 d0Var) {
        this.circleStrokeColor.setValue(d0Var);
    }

    public final void setCircleStrokeColorUseTheme(String str) {
        this.circleStrokeColorUseTheme.setValue(str);
    }

    public final void setCircleStrokeOpacity(Double d14) {
        this.circleStrokeOpacity.setValue(d14);
    }

    public final void setCircleStrokeWidth(Double d14) {
        this.circleStrokeWidth.setValue(d14);
    }

    public final void setCircleTranslate(List<Double> list) {
        this.circleTranslate.setValue(list);
    }

    public final void setCircleTranslateAnchor(CircleTranslateAnchor circleTranslateAnchor) {
        this.circleTranslateAnchor.setValue(circleTranslateAnchor);
    }

    public final void setInteractionsState(CircleAnnotationGroupInteractionsState circleAnnotationGroupInteractionsState) {
        circleAnnotationGroupInteractionsState.getClass();
        this.interactionsState.setValue(circleAnnotationGroupInteractionsState);
    }

    public final void setMaxZoom(Double d14) {
        this.maxZoom.setValue(d14);
    }

    public final void setMinZoom(Double d14) {
        this.minZoom.setValue(d14);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupState$UpdateCircleBlur$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CircleAnnotationManager circleAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = circleAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationGroupState.this.UpdateCircleBlur(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupState$UpdateCircleColor$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CircleAnnotationManager circleAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = circleAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationGroupState.this.UpdateCircleColor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupState$UpdateCircleColorUseTheme$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39771 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39771(CircleAnnotationManager circleAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = circleAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationGroupState.this.UpdateCircleColorUseTheme(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupState$UpdateCircleElevationReference$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39781 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39781(CircleAnnotationManager circleAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = circleAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationGroupState.this.UpdateCircleElevationReference(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupState$UpdateCircleEmissiveStrength$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39791 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39791(CircleAnnotationManager circleAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = circleAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationGroupState.this.UpdateCircleEmissiveStrength(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupState$UpdateCircleOpacity$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39801 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39801(CircleAnnotationManager circleAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = circleAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationGroupState.this.UpdateCircleOpacity(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupState$UpdateCirclePitchAlignment$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39811 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39811(CircleAnnotationManager circleAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = circleAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationGroupState.this.UpdateCirclePitchAlignment(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupState$UpdateCirclePitchScale$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39821 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39821(CircleAnnotationManager circleAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = circleAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationGroupState.this.UpdateCirclePitchScale(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupState$UpdateCircleRadius$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39831 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39831(CircleAnnotationManager circleAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = circleAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationGroupState.this.UpdateCircleRadius(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupState$UpdateCircleSortKey$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39841 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39841(CircleAnnotationManager circleAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = circleAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationGroupState.this.UpdateCircleSortKey(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupState$UpdateCircleStrokeColor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39852 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39852(CircleAnnotationManager circleAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = circleAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationGroupState.this.UpdateCircleStrokeColor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupState$UpdateCircleStrokeColorUseTheme$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39861 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39861(CircleAnnotationManager circleAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = circleAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationGroupState.this.UpdateCircleStrokeColorUseTheme(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupState$UpdateCircleStrokeOpacity$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39871 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39871(CircleAnnotationManager circleAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = circleAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationGroupState.this.UpdateCircleStrokeOpacity(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupState$UpdateCircleStrokeWidth$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39881 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39881(CircleAnnotationManager circleAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = circleAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationGroupState.this.UpdateCircleStrokeWidth(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupState$UpdateCircleTranslate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39891 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39891(CircleAnnotationManager circleAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = circleAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationGroupState.this.UpdateCircleTranslate(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupState$UpdateCircleTranslateAnchor$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39901 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39901(CircleAnnotationManager circleAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = circleAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationGroupState.this.UpdateCircleTranslateAnchor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupState$UpdateMaxZoom$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39911 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39911(CircleAnnotationManager circleAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = circleAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationGroupState.this.UpdateMaxZoom(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupState$UpdateMinZoom$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39921 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39921(CircleAnnotationManager circleAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = circleAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationGroupState.this.UpdateMinZoom(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    public CircleAnnotationGroupState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CircleAnnotationGroupInteractionsState());
    }
}
