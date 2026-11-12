package com.mapbox.maps.extension.compose.annotation.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.layers.properties.generated.FillElevationReference;
import com.mapbox.maps.extension.style.layers.properties.generated.FillTranslateAnchor;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.plugin.annotation.generated.PolygonAnnotationManager;
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
@Metadata(d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0003\b\u008c\u0001\b\u0007\u0018\u00002\u00020\u0001Bì\u0001\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001eø\u0001\u0000¢\u0006\u0004\b \u0010!B\t\b\u0016¢\u0006\u0004\b \u0010\"J\u0017\u0010(\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b)\u0010'J\u0017\u0010*\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b*\u0010'J\u0017\u0010+\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b+\u0010'J\u0017\u0010,\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b,\u0010'J\u0017\u0010-\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b-\u0010'J\u0017\u0010.\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b.\u0010'J\u0017\u0010/\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b/\u0010'J\u0017\u00100\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b0\u0010'J\u0017\u00101\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b1\u0010'J\u0017\u00102\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b2\u0010'J\u0017\u00103\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b3\u0010'J\u0017\u00104\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b4\u0010'J\u0017\u00105\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b5\u0010'J\u0017\u00106\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b6\u0010'J\u0017\u00107\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b7\u0010'J\u0017\u00108\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b8\u0010'J\u0017\u00109\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b9\u0010'J\u0017\u0010:\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b:\u0010'J\u0017\u0010;\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b;\u0010'J\u0017\u0010<\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b<\u0010'J\u0017\u0010=\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b=\u0010'R+\u0010E\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR5\u0010L\u001a\u0004\u0018\u00010\u00022\b\u0010>\u001a\u0004\u0018\u00010\u00028F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bF\u0010@\u0012\u0004\bK\u0010\"\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR5\u0010S\u001a\u0004\u0018\u00010\u00042\b\u0010>\u001a\u0004\u0018\u00010\u00048F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bM\u0010@\u0012\u0004\bR\u0010\"\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR/\u0010Y\u001a\u0004\u0018\u00010\u00062\b\u0010>\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010@\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR/\u0010]\u001a\u0004\u0018\u00010\u00022\b\u0010>\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010@\u001a\u0004\b[\u0010H\"\u0004\b\\\u0010JR>\u0010d\u001a\u0004\u0018\u00010\t2\b\u0010>\u001a\u0004\u0018\u00010\t8F@FX\u0087\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0018\n\u0004\b^\u0010@\u0012\u0004\bc\u0010\"\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR8\u0010h\u001a\u0004\u0018\u00010\t2\b\u0010>\u001a\u0004\u0018\u00010\t8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\be\u0010@\u001a\u0004\bf\u0010`\"\u0004\bg\u0010bR/\u0010l\u001a\u0004\u0018\u00010\u00062\b\u0010>\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bi\u0010@\u001a\u0004\bj\u0010V\"\u0004\bk\u0010XR/\u0010p\u001a\u0004\u0018\u00010\u00062\b\u0010>\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bm\u0010@\u001a\u0004\bn\u0010V\"\u0004\bo\u0010XR8\u0010t\u001a\u0004\u0018\u00010\t2\b\u0010>\u001a\u0004\u0018\u00010\t8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bq\u0010@\u001a\u0004\br\u0010`\"\u0004\bs\u0010bR/\u0010z\u001a\u0004\u0018\u00010\u000f2\b\u0010>\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bu\u0010@\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR/\u0010~\u001a\u0004\u0018\u00010\u00062\b\u0010>\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b{\u0010@\u001a\u0004\b|\u0010V\"\u0004\b}\u0010XR@\u0010\u0084\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00122\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0004\b\u007f\u0010@\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R5\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00142\b\u0010>\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u0085\u0001\u0010@\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001RC\u0010\u008f\u0001\u001a\u0004\u0018\u00010\t2\b\u0010>\u001a\u0004\u0018\u00010\t8F@FX\u0087\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u001c\n\u0005\b\u008b\u0001\u0010@\u0012\u0005\b\u008e\u0001\u0010\"\u001a\u0005\b\u008c\u0001\u0010`\"\u0005\b\u008d\u0001\u0010bR:\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010>\u001a\u0004\u0018\u00010\u00068F@FX\u0087\u008e\u0002¢\u0006\u001c\n\u0005\b\u0090\u0001\u0010@\u0012\u0005\b\u0093\u0001\u0010\"\u001a\u0005\b\u0091\u0001\u0010V\"\u0005\b\u0092\u0001\u0010XR3\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010>\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010@\u001a\u0005\b\u0096\u0001\u0010V\"\u0005\b\u0097\u0001\u0010XR3\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010>\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010@\u001a\u0005\b\u009a\u0001\u0010V\"\u0005\b\u009b\u0001\u0010XR:\u0010¡\u0001\u001a\u0004\u0018\u00010\u000f2\b\u0010>\u001a\u0004\u0018\u00010\u000f8F@FX\u0087\u008e\u0002¢\u0006\u001c\n\u0005\b\u009d\u0001\u0010@\u0012\u0005\b \u0001\u0010\"\u001a\u0005\b\u009e\u0001\u0010w\"\u0005\b\u009f\u0001\u0010yR:\u0010¦\u0001\u001a\u0004\u0018\u00010\u000f2\b\u0010>\u001a\u0004\u0018\u00010\u000f8F@FX\u0087\u008e\u0002¢\u0006\u001c\n\u0005\b¢\u0001\u0010@\u0012\u0005\b¥\u0001\u0010\"\u001a\u0005\b£\u0001\u0010w\"\u0005\b¤\u0001\u0010yR:\u0010«\u0001\u001a\u0004\u0018\u00010\u000f2\b\u0010>\u001a\u0004\u0018\u00010\u000f8F@FX\u0087\u008e\u0002¢\u0006\u001c\n\u0005\b§\u0001\u0010@\u0012\u0005\bª\u0001\u0010\"\u001a\u0005\b¨\u0001\u0010w\"\u0005\b©\u0001\u0010yR:\u0010°\u0001\u001a\u0004\u0018\u00010\u000f2\b\u0010>\u001a\u0004\u0018\u00010\u000f8F@FX\u0087\u008e\u0002¢\u0006\u001c\n\u0005\b¬\u0001\u0010@\u0012\u0005\b¯\u0001\u0010\"\u001a\u0005\b\u00ad\u0001\u0010w\"\u0005\b®\u0001\u0010y\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006±\u0001"}, d2 = {"Lcom/mapbox/maps/extension/compose/annotation/generated/PolygonAnnotationGroupState;", "", "", "initialFillConstructBridgeGuardRail", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillElevationReference;", "initialFillElevationReference", "", "initialFillSortKey", "initialFillAntialias", "Lo4/d0;", "initialFillBridgeGuardRailColor", "initialFillColor", "initialFillEmissiveStrength", "initialFillOpacity", "initialFillOutlineColor", "", "initialFillPattern", "initialFillPatternCrossFade", "", "initialFillTranslate", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillTranslateAnchor;", "initialFillTranslateAnchor", "initialFillTunnelStructureColor", "initialFillZOffset", "initialMaxZoom", "initialMinZoom", "initialFillBridgeGuardRailColorUseTheme", "initialFillColorUseTheme", "initialFillOutlineColorUseTheme", "initialFillTunnelStructureColorUseTheme", "Lcom/mapbox/maps/extension/compose/annotation/generated/PolygonAnnotationGroupInteractionsState;", "initialPolygonAnnotationGroupInteractionsState", "<init>", "(Ljava/lang/Boolean;Lcom/mapbox/maps/extension/style/layers/properties/generated/FillElevationReference;Ljava/lang/Double;Ljava/lang/Boolean;Lo4/d0;Lo4/d0;Ljava/lang/Double;Ljava/lang/Double;Lo4/d0;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/mapbox/maps/extension/style/layers/properties/generated/FillTranslateAnchor;Lo4/d0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/extension/compose/annotation/generated/PolygonAnnotationGroupInteractionsState;)V", "()V", "Lcom/mapbox/maps/plugin/annotation/generated/PolygonAnnotationManager;", "annotationManager", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/plugin/annotation/generated/PolygonAnnotationManager;Lp3/m;I)V", "UpdateProperties", "UpdateFillConstructBridgeGuardRail", "UpdateFillElevationReference", "UpdateFillSortKey", "UpdateFillAntialias", "UpdateFillBridgeGuardRailColor", "UpdateFillColor", "UpdateFillEmissiveStrength", "UpdateFillOpacity", "UpdateFillOutlineColor", "UpdateFillPattern", "UpdateFillPatternCrossFade", "UpdateFillTranslate", "UpdateFillTranslateAnchor", "UpdateFillTunnelStructureColor", "UpdateFillZOffset", "UpdateMaxZoom", "UpdateMinZoom", "UpdateFillBridgeGuardRailColorUseTheme", "UpdateFillColorUseTheme", "UpdateFillOutlineColorUseTheme", "UpdateFillTunnelStructureColorUseTheme", "<set-?>", "interactionsState$delegate", "Lp3/p1;", "getInteractionsState", "()Lcom/mapbox/maps/extension/compose/annotation/generated/PolygonAnnotationGroupInteractionsState;", "setInteractionsState", "(Lcom/mapbox/maps/extension/compose/annotation/generated/PolygonAnnotationGroupInteractionsState;)V", "interactionsState", "fillConstructBridgeGuardRail$delegate", "getFillConstructBridgeGuardRail", "()Ljava/lang/Boolean;", "setFillConstructBridgeGuardRail", "(Ljava/lang/Boolean;)V", "getFillConstructBridgeGuardRail$annotations", "fillConstructBridgeGuardRail", "fillElevationReference$delegate", "getFillElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillElevationReference;", "setFillElevationReference", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/FillElevationReference;)V", "getFillElevationReference$annotations", "fillElevationReference", "fillSortKey$delegate", "getFillSortKey", "()Ljava/lang/Double;", "setFillSortKey", "(Ljava/lang/Double;)V", "fillSortKey", "fillAntialias$delegate", "getFillAntialias", "setFillAntialias", "fillAntialias", "fillBridgeGuardRailColor$delegate", "getFillBridgeGuardRailColor-QN2ZGVo", "()Lo4/d0;", "setFillBridgeGuardRailColor-Y2TPw74", "(Lo4/d0;)V", "getFillBridgeGuardRailColor-QN2ZGVo$annotations", "fillBridgeGuardRailColor", "fillColor$delegate", "getFillColor-QN2ZGVo", "setFillColor-Y2TPw74", "fillColor", "fillEmissiveStrength$delegate", "getFillEmissiveStrength", "setFillEmissiveStrength", "fillEmissiveStrength", "fillOpacity$delegate", "getFillOpacity", "setFillOpacity", "fillOpacity", "fillOutlineColor$delegate", "getFillOutlineColor-QN2ZGVo", "setFillOutlineColor-Y2TPw74", "fillOutlineColor", "fillPattern$delegate", "getFillPattern", "()Ljava/lang/String;", "setFillPattern", "(Ljava/lang/String;)V", "fillPattern", "fillPatternCrossFade$delegate", "getFillPatternCrossFade", "setFillPatternCrossFade", "fillPatternCrossFade", "fillTranslate$delegate", "getFillTranslate", "()Ljava/util/List;", "setFillTranslate", "(Ljava/util/List;)V", "fillTranslate", "fillTranslateAnchor$delegate", "getFillTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillTranslateAnchor;", "setFillTranslateAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/FillTranslateAnchor;)V", "fillTranslateAnchor", "fillTunnelStructureColor$delegate", "getFillTunnelStructureColor-QN2ZGVo", "setFillTunnelStructureColor-Y2TPw74", "getFillTunnelStructureColor-QN2ZGVo$annotations", "fillTunnelStructureColor", "fillZOffset$delegate", "getFillZOffset", "setFillZOffset", "getFillZOffset$annotations", "fillZOffset", "maxZoom$delegate", "getMaxZoom", "setMaxZoom", "maxZoom", "minZoom$delegate", "getMinZoom", "setMinZoom", "minZoom", "fillBridgeGuardRailColorUseTheme$delegate", "getFillBridgeGuardRailColorUseTheme", "setFillBridgeGuardRailColorUseTheme", "getFillBridgeGuardRailColorUseTheme$annotations", "fillBridgeGuardRailColorUseTheme", "fillColorUseTheme$delegate", "getFillColorUseTheme", "setFillColorUseTheme", "getFillColorUseTheme$annotations", "fillColorUseTheme", "fillOutlineColorUseTheme$delegate", "getFillOutlineColorUseTheme", "setFillOutlineColorUseTheme", "getFillOutlineColorUseTheme$annotations", "fillOutlineColorUseTheme", "fillTunnelStructureColorUseTheme$delegate", "getFillTunnelStructureColorUseTheme", "setFillTunnelStructureColorUseTheme", "getFillTunnelStructureColorUseTheme$annotations", "fillTunnelStructureColorUseTheme", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PolygonAnnotationGroupState {

    /* JADX INFO: renamed from: fillAntialias$delegate, reason: from kotlin metadata */
    private final p1 fillAntialias;

    /* JADX INFO: renamed from: fillBridgeGuardRailColor$delegate, reason: from kotlin metadata */
    private final p1 fillBridgeGuardRailColor;

    /* JADX INFO: renamed from: fillBridgeGuardRailColorUseTheme$delegate, reason: from kotlin metadata */
    private final p1 fillBridgeGuardRailColorUseTheme;

    /* JADX INFO: renamed from: fillColor$delegate, reason: from kotlin metadata */
    private final p1 fillColor;

    /* JADX INFO: renamed from: fillColorUseTheme$delegate, reason: from kotlin metadata */
    private final p1 fillColorUseTheme;

    /* JADX INFO: renamed from: fillConstructBridgeGuardRail$delegate, reason: from kotlin metadata */
    private final p1 fillConstructBridgeGuardRail;

    /* JADX INFO: renamed from: fillElevationReference$delegate, reason: from kotlin metadata */
    private final p1 fillElevationReference;

    /* JADX INFO: renamed from: fillEmissiveStrength$delegate, reason: from kotlin metadata */
    private final p1 fillEmissiveStrength;

    /* JADX INFO: renamed from: fillOpacity$delegate, reason: from kotlin metadata */
    private final p1 fillOpacity;

    /* JADX INFO: renamed from: fillOutlineColor$delegate, reason: from kotlin metadata */
    private final p1 fillOutlineColor;

    /* JADX INFO: renamed from: fillOutlineColorUseTheme$delegate, reason: from kotlin metadata */
    private final p1 fillOutlineColorUseTheme;

    /* JADX INFO: renamed from: fillPattern$delegate, reason: from kotlin metadata */
    private final p1 fillPattern;

    /* JADX INFO: renamed from: fillPatternCrossFade$delegate, reason: from kotlin metadata */
    private final p1 fillPatternCrossFade;

    /* JADX INFO: renamed from: fillSortKey$delegate, reason: from kotlin metadata */
    private final p1 fillSortKey;

    /* JADX INFO: renamed from: fillTranslate$delegate, reason: from kotlin metadata */
    private final p1 fillTranslate;

    /* JADX INFO: renamed from: fillTranslateAnchor$delegate, reason: from kotlin metadata */
    private final p1 fillTranslateAnchor;

    /* JADX INFO: renamed from: fillTunnelStructureColor$delegate, reason: from kotlin metadata */
    private final p1 fillTunnelStructureColor;

    /* JADX INFO: renamed from: fillTunnelStructureColorUseTheme$delegate, reason: from kotlin metadata */
    private final p1 fillTunnelStructureColorUseTheme;

    /* JADX INFO: renamed from: fillZOffset$delegate, reason: from kotlin metadata */
    private final p1 fillZOffset;

    /* JADX INFO: renamed from: interactionsState$delegate, reason: from kotlin metadata */
    private final p1 interactionsState;

    /* JADX INFO: renamed from: maxZoom$delegate, reason: from kotlin metadata */
    private final p1 maxZoom;

    /* JADX INFO: renamed from: minZoom$delegate, reason: from kotlin metadata */
    private final p1 minZoom;

    private PolygonAnnotationGroupState(Boolean bool, FillElevationReference fillElevationReference, Double d14, Boolean bool2, d0 d0Var, d0 d0Var2, Double d15, Double d16, d0 d0Var3, String str, Double d17, List<Double> list, FillTranslateAnchor fillTranslateAnchor, d0 d0Var4, Double d18, Double d19, Double d24, String str2, String str3, String str4, String str5, PolygonAnnotationGroupInteractionsState polygonAnnotationGroupInteractionsState) {
        this.interactionsState = p0.n(polygonAnnotationGroupInteractionsState);
        this.fillConstructBridgeGuardRail = p0.n(bool);
        this.fillElevationReference = p0.n(fillElevationReference);
        this.fillSortKey = p0.n(d14);
        this.fillAntialias = p0.n(bool2);
        this.fillBridgeGuardRailColor = p0.n(d0Var);
        this.fillColor = p0.n(d0Var2);
        this.fillEmissiveStrength = p0.n(d15);
        this.fillOpacity = p0.n(d16);
        this.fillOutlineColor = p0.n(d0Var3);
        this.fillPattern = p0.n(str);
        this.fillPatternCrossFade = p0.n(d17);
        this.fillTranslate = p0.n(list);
        this.fillTranslateAnchor = p0.n(fillTranslateAnchor);
        this.fillTunnelStructureColor = p0.n(d0Var4);
        this.fillZOffset = p0.n(d18);
        this.maxZoom = p0.n(d19);
        this.minZoom = p0.n(d24);
        this.fillBridgeGuardRailColorUseTheme = p0.n(str2);
        this.fillColorUseTheme = p0.n(str3);
        this.fillOutlineColorUseTheme = p0.n(str4);
        this.fillTunnelStructureColorUseTheme = p0.n(str5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillAntialias(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-612847358);
        x1 x1Var = n.f135158a;
        polygonAnnotationManager.setFillAntialias(getFillAntialias());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass1(polygonAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillBridgeGuardRailColor(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        String strColorToRgbaString;
        o0 o0VarE = mVar.E(1408456679);
        x1 x1Var = n.f135158a;
        d0 d0VarM172getFillBridgeGuardRailColorQN2ZGVo = m172getFillBridgeGuardRailColorQN2ZGVo();
        if (d0VarM172getFillBridgeGuardRailColorQN2ZGVo != null) {
            strColorToRgbaString = ColorUtils.INSTANCE.colorToRgbaString(f0.j(d0VarM172getFillBridgeGuardRailColorQN2ZGVo.f128833a));
        } else {
            strColorToRgbaString = null;
        }
        polygonAnnotationManager.setFillBridgeGuardRailColorString(strColorToRgbaString);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(polygonAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillBridgeGuardRailColorUseTheme(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1056743941);
        x1 x1Var = n.f135158a;
        polygonAnnotationManager.setFillBridgeGuardRailColorUseTheme(getFillBridgeGuardRailColorUseTheme());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41071(polygonAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillColor(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        String strColorToRgbaString;
        o0 o0VarE = mVar.E(-1530169299);
        x1 x1Var = n.f135158a;
        d0 d0VarM173getFillColorQN2ZGVo = m173getFillColorQN2ZGVo();
        if (d0VarM173getFillColorQN2ZGVo != null) {
            strColorToRgbaString = ColorUtils.INSTANCE.colorToRgbaString(f0.j(d0VarM173getFillColorQN2ZGVo.f128833a));
        } else {
            strColorToRgbaString = null;
        }
        polygonAnnotationManager.setFillColorString(strColorToRgbaString);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41082(polygonAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillColorUseTheme(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1349196875);
        x1 x1Var = n.f135158a;
        polygonAnnotationManager.setFillColorUseTheme(getFillColorUseTheme());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41091(polygonAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillConstructBridgeGuardRail(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-456545051);
        x1 x1Var = n.f135158a;
        polygonAnnotationManager.setFillConstructBridgeGuardRail(getFillConstructBridgeGuardRail());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41101(polygonAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillElevationReference(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-87185778);
        x1 x1Var = n.f135158a;
        polygonAnnotationManager.setFillElevationReference(getFillElevationReference());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41111(polygonAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillEmissiveStrength(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-283759484);
        x1 x1Var = n.f135158a;
        polygonAnnotationManager.setFillEmissiveStrength(getFillEmissiveStrength());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41121(polygonAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillOpacity(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-575376379);
        x1 x1Var = n.f135158a;
        polygonAnnotationManager.setFillOpacity(getFillOpacity());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41131(polygonAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillOutlineColor(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        String strColorToRgbaString;
        o0 o0VarE = mVar.E(1280684507);
        x1 x1Var = n.f135158a;
        d0 d0VarM174getFillOutlineColorQN2ZGVo = m174getFillOutlineColorQN2ZGVo();
        if (d0VarM174getFillOutlineColorQN2ZGVo != null) {
            strColorToRgbaString = ColorUtils.INSTANCE.colorToRgbaString(f0.j(d0VarM174getFillOutlineColorQN2ZGVo.f128833a));
        } else {
            strColorToRgbaString = null;
        }
        polygonAnnotationManager.setFillOutlineColorString(strColorToRgbaString);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41142(polygonAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillOutlineColorUseTheme(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-785397767);
        x1 x1Var = n.f135158a;
        polygonAnnotationManager.setFillOutlineColorUseTheme(getFillOutlineColorUseTheme());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41151(polygonAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillPattern(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-559046688);
        x1 x1Var = n.f135158a;
        polygonAnnotationManager.setFillPattern(getFillPattern());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41161(polygonAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillPatternCrossFade(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(766994576);
        x1 x1Var = n.f135158a;
        polygonAnnotationManager.setFillPatternCrossFade(getFillPatternCrossFade());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41171(polygonAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillSortKey(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1964043631);
        x1 x1Var = n.f135158a;
        polygonAnnotationManager.setFillSortKey(getFillSortKey());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41181(polygonAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillTranslate(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1407173662);
        x1 x1Var = n.f135158a;
        polygonAnnotationManager.setFillTranslate(getFillTranslate());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41191(polygonAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillTranslateAnchor(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1581576557);
        x1 x1Var = n.f135158a;
        polygonAnnotationManager.setFillTranslateAnchor(getFillTranslateAnchor());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41201(polygonAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillTunnelStructureColor(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        String strColorToRgbaString;
        o0 o0VarE = mVar.E(-1621687036);
        x1 x1Var = n.f135158a;
        d0 d0VarM175getFillTunnelStructureColorQN2ZGVo = m175getFillTunnelStructureColorQN2ZGVo();
        if (d0VarM175getFillTunnelStructureColorQN2ZGVo != null) {
            strColorToRgbaString = ColorUtils.INSTANCE.colorToRgbaString(f0.j(d0VarM175getFillTunnelStructureColorQN2ZGVo.f128833a));
        } else {
            strColorToRgbaString = null;
        }
        polygonAnnotationManager.setFillTunnelStructureColorString(strColorToRgbaString);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41212(polygonAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillTunnelStructureColorUseTheme(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-2111577566);
        x1 x1Var = n.f135158a;
        polygonAnnotationManager.setFillTunnelStructureColorUseTheme(getFillTunnelStructureColorUseTheme());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41221(polygonAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillZOffset(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1089615325);
        x1 x1Var = n.f135158a;
        polygonAnnotationManager.setFillZOffset(getFillZOffset());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41231(polygonAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateMaxZoom(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(1893638998);
        x1 x1Var = n.f135158a;
        polygonAnnotationManager.setMaxZoom(getMaxZoom());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41241(polygonAnnotationManager, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateMinZoom(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1471288408);
        x1 x1Var = n.f135158a;
        polygonAnnotationManager.setMinZoom(getMinZoom());
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41251(polygonAnnotationManager, i14);
    }

    @MapboxExperimental
    /* JADX INFO: renamed from: getFillBridgeGuardRailColor-QN2ZGVo$annotations, reason: not valid java name */
    public static /* synthetic */ void m170getFillBridgeGuardRailColorQN2ZGVo$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillBridgeGuardRailColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillConstructBridgeGuardRail$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillElevationReference$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillOutlineColorUseTheme$annotations() {
    }

    @MapboxExperimental
    /* JADX INFO: renamed from: getFillTunnelStructureColor-QN2ZGVo$annotations, reason: not valid java name */
    public static /* synthetic */ void m171getFillTunnelStructureColorQN2ZGVo$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillTunnelStructureColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillZOffset$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(PolygonAnnotationManager polygonAnnotationManager, m mVar, int i14) {
        polygonAnnotationManager.getClass();
        o0 o0VarE = mVar.E(-384859412);
        x1 x1Var = n.f135158a;
        int i15 = (i14 & 112) | 8;
        UpdateFillConstructBridgeGuardRail(polygonAnnotationManager, o0VarE, i15);
        UpdateFillElevationReference(polygonAnnotationManager, o0VarE, i15);
        UpdateFillSortKey(polygonAnnotationManager, o0VarE, i15);
        UpdateFillAntialias(polygonAnnotationManager, o0VarE, i15);
        UpdateFillBridgeGuardRailColor(polygonAnnotationManager, o0VarE, i15);
        UpdateFillColor(polygonAnnotationManager, o0VarE, i15);
        UpdateFillEmissiveStrength(polygonAnnotationManager, o0VarE, i15);
        UpdateFillOpacity(polygonAnnotationManager, o0VarE, i15);
        UpdateFillOutlineColor(polygonAnnotationManager, o0VarE, i15);
        UpdateFillPattern(polygonAnnotationManager, o0VarE, i15);
        UpdateFillPatternCrossFade(polygonAnnotationManager, o0VarE, i15);
        UpdateFillTranslate(polygonAnnotationManager, o0VarE, i15);
        UpdateFillTranslateAnchor(polygonAnnotationManager, o0VarE, i15);
        UpdateFillTunnelStructureColor(polygonAnnotationManager, o0VarE, i15);
        UpdateFillZOffset(polygonAnnotationManager, o0VarE, i15);
        UpdateMaxZoom(polygonAnnotationManager, o0VarE, i15);
        UpdateMinZoom(polygonAnnotationManager, o0VarE, i15);
        UpdateFillBridgeGuardRailColorUseTheme(polygonAnnotationManager, o0VarE, i15);
        UpdateFillColorUseTheme(polygonAnnotationManager, o0VarE, i15);
        UpdateFillOutlineColorUseTheme(polygonAnnotationManager, o0VarE, i15);
        UpdateFillTunnelStructureColorUseTheme(polygonAnnotationManager, o0VarE, i15);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new PolygonAnnotationGroupState$UpdateProperties$1(this, polygonAnnotationManager, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Boolean getFillAntialias() {
        return (Boolean) this.fillAntialias.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getFillBridgeGuardRailColor-QN2ZGVo, reason: not valid java name */
    public final d0 m172getFillBridgeGuardRailColorQN2ZGVo() {
        return (d0) this.fillBridgeGuardRailColor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getFillBridgeGuardRailColorUseTheme() {
        return (String) this.fillBridgeGuardRailColorUseTheme.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getFillColor-QN2ZGVo, reason: not valid java name */
    public final d0 m173getFillColorQN2ZGVo() {
        return (d0) this.fillColor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getFillColorUseTheme() {
        return (String) this.fillColorUseTheme.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Boolean getFillConstructBridgeGuardRail() {
        return (Boolean) this.fillConstructBridgeGuardRail.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FillElevationReference getFillElevationReference() {
        return (FillElevationReference) this.fillElevationReference.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getFillEmissiveStrength() {
        return (Double) this.fillEmissiveStrength.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getFillOpacity() {
        return (Double) this.fillOpacity.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getFillOutlineColor-QN2ZGVo, reason: not valid java name */
    public final d0 m174getFillOutlineColorQN2ZGVo() {
        return (d0) this.fillOutlineColor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getFillOutlineColorUseTheme() {
        return (String) this.fillOutlineColorUseTheme.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getFillPattern() {
        return (String) this.fillPattern.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getFillPatternCrossFade() {
        return (Double) this.fillPatternCrossFade.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getFillSortKey() {
        return (Double) this.fillSortKey.getF182175a();
    }

    public final List<Double> getFillTranslate() {
        return (List) this.fillTranslate.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FillTranslateAnchor getFillTranslateAnchor() {
        return (FillTranslateAnchor) this.fillTranslateAnchor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getFillTunnelStructureColor-QN2ZGVo, reason: not valid java name */
    public final d0 m175getFillTunnelStructureColorQN2ZGVo() {
        return (d0) this.fillTunnelStructureColor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getFillTunnelStructureColorUseTheme() {
        return (String) this.fillTunnelStructureColorUseTheme.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getFillZOffset() {
        return (Double) this.fillZOffset.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PolygonAnnotationGroupInteractionsState getInteractionsState() {
        return (PolygonAnnotationGroupInteractionsState) this.interactionsState.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getMaxZoom() {
        return (Double) this.maxZoom.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getMinZoom() {
        return (Double) this.minZoom.getF182175a();
    }

    public final void setFillAntialias(Boolean bool) {
        this.fillAntialias.setValue(bool);
    }

    /* JADX INFO: renamed from: setFillBridgeGuardRailColor-Y2TPw74, reason: not valid java name */
    public final void m176setFillBridgeGuardRailColorY2TPw74(d0 d0Var) {
        this.fillBridgeGuardRailColor.setValue(d0Var);
    }

    public final void setFillBridgeGuardRailColorUseTheme(String str) {
        this.fillBridgeGuardRailColorUseTheme.setValue(str);
    }

    /* JADX INFO: renamed from: setFillColor-Y2TPw74, reason: not valid java name */
    public final void m177setFillColorY2TPw74(d0 d0Var) {
        this.fillColor.setValue(d0Var);
    }

    public final void setFillColorUseTheme(String str) {
        this.fillColorUseTheme.setValue(str);
    }

    public final void setFillConstructBridgeGuardRail(Boolean bool) {
        this.fillConstructBridgeGuardRail.setValue(bool);
    }

    public final void setFillElevationReference(FillElevationReference fillElevationReference) {
        this.fillElevationReference.setValue(fillElevationReference);
    }

    public final void setFillEmissiveStrength(Double d14) {
        this.fillEmissiveStrength.setValue(d14);
    }

    public final void setFillOpacity(Double d14) {
        this.fillOpacity.setValue(d14);
    }

    /* JADX INFO: renamed from: setFillOutlineColor-Y2TPw74, reason: not valid java name */
    public final void m178setFillOutlineColorY2TPw74(d0 d0Var) {
        this.fillOutlineColor.setValue(d0Var);
    }

    public final void setFillOutlineColorUseTheme(String str) {
        this.fillOutlineColorUseTheme.setValue(str);
    }

    public final void setFillPattern(String str) {
        this.fillPattern.setValue(str);
    }

    public final void setFillPatternCrossFade(Double d14) {
        this.fillPatternCrossFade.setValue(d14);
    }

    public final void setFillSortKey(Double d14) {
        this.fillSortKey.setValue(d14);
    }

    public final void setFillTranslate(List<Double> list) {
        this.fillTranslate.setValue(list);
    }

    public final void setFillTranslateAnchor(FillTranslateAnchor fillTranslateAnchor) {
        this.fillTranslateAnchor.setValue(fillTranslateAnchor);
    }

    /* JADX INFO: renamed from: setFillTunnelStructureColor-Y2TPw74, reason: not valid java name */
    public final void m179setFillTunnelStructureColorY2TPw74(d0 d0Var) {
        this.fillTunnelStructureColor.setValue(d0Var);
    }

    public final void setFillTunnelStructureColorUseTheme(String str) {
        this.fillTunnelStructureColorUseTheme.setValue(str);
    }

    public final void setFillZOffset(Double d14) {
        this.fillZOffset.setValue(d14);
    }

    public final void setInteractionsState(PolygonAnnotationGroupInteractionsState polygonAnnotationGroupInteractionsState) {
        polygonAnnotationGroupInteractionsState.getClass();
        this.interactionsState.setValue(polygonAnnotationGroupInteractionsState);
    }

    public final void setMaxZoom(Double d14) {
        this.maxZoom.setValue(d14);
    }

    public final void setMinZoom(Double d14) {
        this.minZoom.setValue(d14);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateFillAntialias$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateFillAntialias(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateFillBridgeGuardRailColor$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateFillBridgeGuardRailColor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateFillBridgeGuardRailColorUseTheme$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41071 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41071(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateFillBridgeGuardRailColorUseTheme(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateFillColor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41082 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41082(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateFillColor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateFillColorUseTheme$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41091 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41091(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateFillColorUseTheme(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateFillConstructBridgeGuardRail$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41101 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41101(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateFillConstructBridgeGuardRail(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateFillElevationReference$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41111 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41111(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateFillElevationReference(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateFillEmissiveStrength$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41121 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41121(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateFillEmissiveStrength(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateFillOpacity$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41131 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41131(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateFillOpacity(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateFillOutlineColor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41142 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41142(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateFillOutlineColor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateFillOutlineColorUseTheme$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41151 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41151(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateFillOutlineColorUseTheme(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateFillPattern$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41161 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41161(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateFillPattern(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateFillPatternCrossFade$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41171 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41171(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateFillPatternCrossFade(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateFillSortKey$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41181 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41181(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateFillSortKey(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateFillTranslate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41191 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41191(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateFillTranslate(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateFillTranslateAnchor$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41201 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41201(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateFillTranslateAnchor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateFillTunnelStructureColor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41212 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41212(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateFillTunnelStructureColor(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateFillTunnelStructureColorUseTheme$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41221 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41221(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateFillTunnelStructureColorUseTheme(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateFillZOffset$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41231 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41231(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateFillZOffset(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateMaxZoom$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41241 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41241(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateMaxZoom(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupState$UpdateMinZoom$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41251 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationManager $annotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41251(PolygonAnnotationManager polygonAnnotationManager, int i14) {
            super(2);
            this.$annotationManager = polygonAnnotationManager;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationGroupState.this.UpdateMinZoom(this.$annotationManager, mVar, this.$$changed | 1);
        }
    }

    public PolygonAnnotationGroupState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PolygonAnnotationGroupInteractionsState());
    }
}
