package com.mapbox.maps.extension.compose.annotation.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.compose.annotation.internal.generated.PolygonAnnotationNode;
import com.mapbox.maps.plugin.annotation.generated.PolygonAnnotation;
import com.mapbox.maps.plugin.annotation.generated.PolygonAnnotationManager;
import e23.p;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bX\b\u0007\u0018\u00002\u00020\u0001B\u008c\u0001\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015B\t\b\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b \u0010\u001bJ\u0017\u0010!\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0017\u0010\"\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0017\u0010$\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0017\u0010%\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b%\u0010\u001bJ\u0017\u0010&\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b&\u0010\u001bJ\u0017\u0010'\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b'\u0010\u001bJ\u0017\u0010(\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b(\u0010\u001bR+\u00100\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R5\u00107\u001a\u0004\u0018\u00010\u00022\b\u0010)\u001a\u0004\u0018\u00010\u00028F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b1\u0010+\u0012\u0004\b6\u0010\u0016\u001a\u0004\b2\u00103\"\u0004\b4\u00105R>\u0010>\u001a\u0004\u0018\u00010\u00042\b\u0010)\u001a\u0004\u0018\u00010\u00048F@FX\u0087\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0018\n\u0004\b8\u0010+\u0012\u0004\b=\u0010\u0016\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R8\u0010B\u001a\u0004\u0018\u00010\u00042\b\u0010)\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b?\u0010+\u001a\u0004\b@\u0010:\"\u0004\bA\u0010<R/\u0010H\u001a\u0004\u0018\u00010\u00072\b\u0010)\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010+\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR8\u0010L\u001a\u0004\u0018\u00010\u00042\b\u0010)\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bI\u0010+\u001a\u0004\bJ\u0010:\"\u0004\bK\u0010<R/\u0010R\u001a\u0004\u0018\u00010\n2\b\u0010)\u001a\u0004\u0018\u00010\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010+\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR>\u0010W\u001a\u0004\u0018\u00010\u00042\b\u0010)\u001a\u0004\u0018\u00010\u00048F@FX\u0087\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0018\n\u0004\bS\u0010+\u0012\u0004\bV\u0010\u0016\u001a\u0004\bT\u0010:\"\u0004\bU\u0010<R5\u0010\\\u001a\u0004\u0018\u00010\u00072\b\u0010)\u001a\u0004\u0018\u00010\u00078F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bX\u0010+\u0012\u0004\b[\u0010\u0016\u001a\u0004\bY\u0010E\"\u0004\bZ\u0010GR5\u0010a\u001a\u0004\u0018\u00010\n2\b\u0010)\u001a\u0004\u0018\u00010\n8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b]\u0010+\u0012\u0004\b`\u0010\u0016\u001a\u0004\b^\u0010O\"\u0004\b_\u0010QR5\u0010f\u001a\u0004\u0018\u00010\n2\b\u0010)\u001a\u0004\u0018\u00010\n8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bb\u0010+\u0012\u0004\be\u0010\u0016\u001a\u0004\bc\u0010O\"\u0004\bd\u0010QR5\u0010k\u001a\u0004\u0018\u00010\n2\b\u0010)\u001a\u0004\u0018\u00010\n8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bg\u0010+\u0012\u0004\bj\u0010\u0016\u001a\u0004\bh\u0010O\"\u0004\bi\u0010QR5\u0010p\u001a\u0004\u0018\u00010\n2\b\u0010)\u001a\u0004\u0018\u00010\n8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bl\u0010+\u0012\u0004\bo\u0010\u0016\u001a\u0004\bm\u0010O\"\u0004\bn\u0010Q\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006q"}, d2 = {"Lcom/mapbox/maps/extension/compose/annotation/generated/PolygonAnnotationState;", "", "", "initialFillConstructBridgeGuardRail", "Lo4/d0;", "initialFillBridgeGuardRailColor", "initialFillColor", "", "initialFillOpacity", "initialFillOutlineColor", "", "initialFillPattern", "initialFillTunnelStructureColor", "initialFillZOffset", "initialFillBridgeGuardRailColorUseTheme", "initialFillColorUseTheme", "initialFillOutlineColorUseTheme", "initialFillTunnelStructureColorUseTheme", "Lcom/mapbox/maps/extension/compose/annotation/generated/PolygonAnnotationInteractionsState;", "initialPolygonAnnotationInteractionsState", "<init>", "(Ljava/lang/Boolean;Lo4/d0;Lo4/d0;Ljava/lang/Double;Lo4/d0;Ljava/lang/String;Lo4/d0;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/extension/compose/annotation/generated/PolygonAnnotationInteractionsState;)V", "()V", "Lcom/mapbox/maps/extension/compose/annotation/internal/generated/PolygonAnnotationNode;", "annotationNode", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/annotation/internal/generated/PolygonAnnotationNode;Lp3/m;I)V", "UpdateProperties", "UpdateFillConstructBridgeGuardRail", "UpdateFillBridgeGuardRailColor", "UpdateFillColor", "UpdateFillOpacity", "UpdateFillOutlineColor", "UpdateFillPattern", "UpdateFillTunnelStructureColor", "UpdateFillZOffset", "UpdateFillBridgeGuardRailColorUseTheme", "UpdateFillColorUseTheme", "UpdateFillOutlineColorUseTheme", "UpdateFillTunnelStructureColorUseTheme", "<set-?>", "interactionsState$delegate", "Lp3/p1;", "getInteractionsState", "()Lcom/mapbox/maps/extension/compose/annotation/generated/PolygonAnnotationInteractionsState;", "setInteractionsState", "(Lcom/mapbox/maps/extension/compose/annotation/generated/PolygonAnnotationInteractionsState;)V", "interactionsState", "fillConstructBridgeGuardRail$delegate", "getFillConstructBridgeGuardRail", "()Ljava/lang/Boolean;", "setFillConstructBridgeGuardRail", "(Ljava/lang/Boolean;)V", "getFillConstructBridgeGuardRail$annotations", "fillConstructBridgeGuardRail", "fillBridgeGuardRailColor$delegate", "getFillBridgeGuardRailColor-QN2ZGVo", "()Lo4/d0;", "setFillBridgeGuardRailColor-Y2TPw74", "(Lo4/d0;)V", "getFillBridgeGuardRailColor-QN2ZGVo$annotations", "fillBridgeGuardRailColor", "fillColor$delegate", "getFillColor-QN2ZGVo", "setFillColor-Y2TPw74", "fillColor", "fillOpacity$delegate", "getFillOpacity", "()Ljava/lang/Double;", "setFillOpacity", "(Ljava/lang/Double;)V", "fillOpacity", "fillOutlineColor$delegate", "getFillOutlineColor-QN2ZGVo", "setFillOutlineColor-Y2TPw74", "fillOutlineColor", "fillPattern$delegate", "getFillPattern", "()Ljava/lang/String;", "setFillPattern", "(Ljava/lang/String;)V", "fillPattern", "fillTunnelStructureColor$delegate", "getFillTunnelStructureColor-QN2ZGVo", "setFillTunnelStructureColor-Y2TPw74", "getFillTunnelStructureColor-QN2ZGVo$annotations", "fillTunnelStructureColor", "fillZOffset$delegate", "getFillZOffset", "setFillZOffset", "getFillZOffset$annotations", "fillZOffset", "fillBridgeGuardRailColorUseTheme$delegate", "getFillBridgeGuardRailColorUseTheme", "setFillBridgeGuardRailColorUseTheme", "getFillBridgeGuardRailColorUseTheme$annotations", "fillBridgeGuardRailColorUseTheme", "fillColorUseTheme$delegate", "getFillColorUseTheme", "setFillColorUseTheme", "getFillColorUseTheme$annotations", "fillColorUseTheme", "fillOutlineColorUseTheme$delegate", "getFillOutlineColorUseTheme", "setFillOutlineColorUseTheme", "getFillOutlineColorUseTheme$annotations", "fillOutlineColorUseTheme", "fillTunnelStructureColorUseTheme$delegate", "getFillTunnelStructureColorUseTheme", "setFillTunnelStructureColorUseTheme", "getFillTunnelStructureColorUseTheme$annotations", "fillTunnelStructureColorUseTheme", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PolygonAnnotationState {

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

    /* JADX INFO: renamed from: fillOpacity$delegate, reason: from kotlin metadata */
    private final p1 fillOpacity;

    /* JADX INFO: renamed from: fillOutlineColor$delegate, reason: from kotlin metadata */
    private final p1 fillOutlineColor;

    /* JADX INFO: renamed from: fillOutlineColorUseTheme$delegate, reason: from kotlin metadata */
    private final p1 fillOutlineColorUseTheme;

    /* JADX INFO: renamed from: fillPattern$delegate, reason: from kotlin metadata */
    private final p1 fillPattern;

    /* JADX INFO: renamed from: fillTunnelStructureColor$delegate, reason: from kotlin metadata */
    private final p1 fillTunnelStructureColor;

    /* JADX INFO: renamed from: fillTunnelStructureColorUseTheme$delegate, reason: from kotlin metadata */
    private final p1 fillTunnelStructureColorUseTheme;

    /* JADX INFO: renamed from: fillZOffset$delegate, reason: from kotlin metadata */
    private final p1 fillZOffset;

    /* JADX INFO: renamed from: interactionsState$delegate, reason: from kotlin metadata */
    private final p1 interactionsState;

    private PolygonAnnotationState(Boolean bool, d0 d0Var, d0 d0Var2, Double d14, d0 d0Var3, String str, d0 d0Var4, Double d15, String str2, String str3, String str4, String str5, PolygonAnnotationInteractionsState polygonAnnotationInteractionsState) {
        this.interactionsState = p0.n(polygonAnnotationInteractionsState);
        this.fillConstructBridgeGuardRail = p0.n(bool);
        this.fillBridgeGuardRailColor = p0.n(d0Var);
        this.fillColor = p0.n(d0Var2);
        this.fillOpacity = p0.n(d14);
        this.fillOutlineColor = p0.n(d0Var3);
        this.fillPattern = p0.n(str);
        this.fillTunnelStructureColor = p0.n(d0Var4);
        this.fillZOffset = p0.n(d15);
        this.fillBridgeGuardRailColorUseTheme = p0.n(str2);
        this.fillColorUseTheme = p0.n(str3);
        this.fillOutlineColorUseTheme = p0.n(str4);
        this.fillTunnelStructureColorUseTheme = p0.n(str5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillBridgeGuardRailColor(PolygonAnnotationNode polygonAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-928835538);
        x1 x1Var = n.f135158a;
        PolygonAnnotationManager annotationManager = polygonAnnotationNode.getAnnotationManager();
        PolygonAnnotation annotation = polygonAnnotationNode.getAnnotation();
        d0 d0VarM186getFillBridgeGuardRailColorQN2ZGVo = m186getFillBridgeGuardRailColorQN2ZGVo();
        annotation.setFillBridgeGuardRailColorInt(d0VarM186getFillBridgeGuardRailColorQN2ZGVo != null ? Integer.valueOf(f0.j(d0VarM186getFillBridgeGuardRailColorQN2ZGVo.f128833a)) : null);
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(polygonAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillBridgeGuardRailColorUseTheme(PolygonAnnotationNode polygonAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(922072400);
        x1 x1Var = n.f135158a;
        PolygonAnnotationManager annotationManager = polygonAnnotationNode.getAnnotationManager();
        PolygonAnnotation annotation = polygonAnnotationNode.getAnnotation();
        annotation.setFillBridgeGuardRailColorUseTheme(getFillBridgeGuardRailColorUseTheme());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41262(polygonAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillColor(PolygonAnnotationNode polygonAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-235012568);
        x1 x1Var = n.f135158a;
        PolygonAnnotationManager annotationManager = polygonAnnotationNode.getAnnotationManager();
        PolygonAnnotation annotation = polygonAnnotationNode.getAnnotation();
        d0 d0VarM187getFillColorQN2ZGVo = m187getFillColorQN2ZGVo();
        annotation.setFillColorInt(d0VarM187getFillColorQN2ZGVo != null ? Integer.valueOf(f0.j(d0VarM187getFillColorQN2ZGVo.f128833a)) : null);
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41272(polygonAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillColorUseTheme(PolygonAnnotationNode polygonAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1752170826);
        x1 x1Var = n.f135158a;
        PolygonAnnotationManager annotationManager = polygonAnnotationNode.getAnnotationManager();
        PolygonAnnotation annotation = polygonAnnotationNode.getAnnotation();
        annotation.setFillColorUseTheme(getFillColorUseTheme());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41282(polygonAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillConstructBridgeGuardRail(PolygonAnnotationNode polygonAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1718648432);
        x1 x1Var = n.f135158a;
        PolygonAnnotationManager annotationManager = polygonAnnotationNode.getAnnotationManager();
        PolygonAnnotation annotation = polygonAnnotationNode.getAnnotation();
        annotation.setFillConstructBridgeGuardRail(getFillConstructBridgeGuardRail());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41292(polygonAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillOpacity(PolygonAnnotationNode polygonAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1343184048);
        x1 x1Var = n.f135158a;
        PolygonAnnotationManager annotationManager = polygonAnnotationNode.getAnnotationManager();
        PolygonAnnotation annotation = polygonAnnotationNode.getAnnotation();
        annotation.setFillOpacity(getFillOpacity());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41302(polygonAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillOutlineColor(PolygonAnnotationNode polygonAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1563533754);
        x1 x1Var = n.f135158a;
        PolygonAnnotationManager annotationManager = polygonAnnotationNode.getAnnotationManager();
        PolygonAnnotation annotation = polygonAnnotationNode.getAnnotation();
        d0 d0VarM188getFillOutlineColorQN2ZGVo = m188getFillOutlineColorQN2ZGVo();
        annotation.setFillOutlineColorInt(d0VarM188getFillOutlineColorQN2ZGVo != null ? Integer.valueOf(f0.j(d0VarM188getFillOutlineColorQN2ZGVo.f128833a)) : null);
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41312(polygonAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillOutlineColorUseTheme(PolygonAnnotationNode polygonAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(307753692);
        x1 x1Var = n.f135158a;
        PolygonAnnotationManager annotationManager = polygonAnnotationNode.getAnnotationManager();
        PolygonAnnotation annotation = polygonAnnotationNode.getAnnotation();
        annotation.setFillOutlineColorUseTheme(getFillOutlineColorUseTheme());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41322(polygonAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillPattern(PolygonAnnotationNode polygonAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(2136362901);
        x1 x1Var = n.f135158a;
        PolygonAnnotationManager annotationManager = polygonAnnotationNode.getAnnotationManager();
        PolygonAnnotation annotation = polygonAnnotationNode.getAnnotation();
        annotation.setFillPattern(getFillPattern());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41332(polygonAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillTunnelStructureColor(PolygonAnnotationNode polygonAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1327194097);
        x1 x1Var = n.f135158a;
        PolygonAnnotationManager annotationManager = polygonAnnotationNode.getAnnotationManager();
        PolygonAnnotation annotation = polygonAnnotationNode.getAnnotation();
        d0 d0VarM189getFillTunnelStructureColorQN2ZGVo = m189getFillTunnelStructureColorQN2ZGVo();
        annotation.setFillTunnelStructureColorInt(d0VarM189getFillTunnelStructureColorQN2ZGVo != null ? Integer.valueOf(f0.j(d0VarM189getFillTunnelStructureColorQN2ZGVo.f128833a)) : null);
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41342(polygonAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillTunnelStructureColorUseTheme(PolygonAnnotationNode polygonAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1336440301);
        x1 x1Var = n.f135158a;
        PolygonAnnotationManager annotationManager = polygonAnnotationNode.getAnnotationManager();
        PolygonAnnotation annotation = polygonAnnotationNode.getAnnotation();
        annotation.setFillTunnelStructureColorUseTheme(getFillTunnelStructureColorUseTheme());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41352(polygonAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateFillZOffset(PolygonAnnotationNode polygonAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1791997042);
        x1 x1Var = n.f135158a;
        PolygonAnnotationManager annotationManager = polygonAnnotationNode.getAnnotationManager();
        PolygonAnnotation annotation = polygonAnnotationNode.getAnnotation();
        annotation.setFillZOffset(getFillZOffset());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41362(polygonAnnotationNode, i14);
    }

    @MapboxExperimental
    /* JADX INFO: renamed from: getFillBridgeGuardRailColor-QN2ZGVo$annotations, reason: not valid java name */
    public static /* synthetic */ void m184getFillBridgeGuardRailColorQN2ZGVo$annotations() {
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
    public static /* synthetic */ void getFillOutlineColorUseTheme$annotations() {
    }

    @MapboxExperimental
    /* JADX INFO: renamed from: getFillTunnelStructureColor-QN2ZGVo$annotations, reason: not valid java name */
    public static /* synthetic */ void m185getFillTunnelStructureColorQN2ZGVo$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillTunnelStructureColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillZOffset$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(PolygonAnnotationNode polygonAnnotationNode, m mVar, int i14) {
        polygonAnnotationNode.getClass();
        o0 o0VarE = mVar.E(1826908425);
        x1 x1Var = n.f135158a;
        int i15 = (i14 & 112) | 8;
        UpdateFillConstructBridgeGuardRail(polygonAnnotationNode, o0VarE, i15);
        UpdateFillBridgeGuardRailColor(polygonAnnotationNode, o0VarE, i15);
        UpdateFillColor(polygonAnnotationNode, o0VarE, i15);
        UpdateFillOpacity(polygonAnnotationNode, o0VarE, i15);
        UpdateFillOutlineColor(polygonAnnotationNode, o0VarE, i15);
        UpdateFillPattern(polygonAnnotationNode, o0VarE, i15);
        UpdateFillTunnelStructureColor(polygonAnnotationNode, o0VarE, i15);
        UpdateFillZOffset(polygonAnnotationNode, o0VarE, i15);
        UpdateFillBridgeGuardRailColorUseTheme(polygonAnnotationNode, o0VarE, i15);
        UpdateFillColorUseTheme(polygonAnnotationNode, o0VarE, i15);
        UpdateFillOutlineColorUseTheme(polygonAnnotationNode, o0VarE, i15);
        UpdateFillTunnelStructureColorUseTheme(polygonAnnotationNode, o0VarE, i15);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new PolygonAnnotationState$UpdateProperties$1(this, polygonAnnotationNode, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getFillBridgeGuardRailColor-QN2ZGVo, reason: not valid java name */
    public final d0 m186getFillBridgeGuardRailColorQN2ZGVo() {
        return (d0) this.fillBridgeGuardRailColor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getFillBridgeGuardRailColorUseTheme() {
        return (String) this.fillBridgeGuardRailColorUseTheme.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getFillColor-QN2ZGVo, reason: not valid java name */
    public final d0 m187getFillColorQN2ZGVo() {
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
    public final Double getFillOpacity() {
        return (Double) this.fillOpacity.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getFillOutlineColor-QN2ZGVo, reason: not valid java name */
    public final d0 m188getFillOutlineColorQN2ZGVo() {
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
    /* JADX INFO: renamed from: getFillTunnelStructureColor-QN2ZGVo, reason: not valid java name */
    public final d0 m189getFillTunnelStructureColorQN2ZGVo() {
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
    public final PolygonAnnotationInteractionsState getInteractionsState() {
        return (PolygonAnnotationInteractionsState) this.interactionsState.getF182175a();
    }

    /* JADX INFO: renamed from: setFillBridgeGuardRailColor-Y2TPw74, reason: not valid java name */
    public final void m190setFillBridgeGuardRailColorY2TPw74(d0 d0Var) {
        this.fillBridgeGuardRailColor.setValue(d0Var);
    }

    public final void setFillBridgeGuardRailColorUseTheme(String str) {
        this.fillBridgeGuardRailColorUseTheme.setValue(str);
    }

    /* JADX INFO: renamed from: setFillColor-Y2TPw74, reason: not valid java name */
    public final void m191setFillColorY2TPw74(d0 d0Var) {
        this.fillColor.setValue(d0Var);
    }

    public final void setFillColorUseTheme(String str) {
        this.fillColorUseTheme.setValue(str);
    }

    public final void setFillConstructBridgeGuardRail(Boolean bool) {
        this.fillConstructBridgeGuardRail.setValue(bool);
    }

    public final void setFillOpacity(Double d14) {
        this.fillOpacity.setValue(d14);
    }

    /* JADX INFO: renamed from: setFillOutlineColor-Y2TPw74, reason: not valid java name */
    public final void m192setFillOutlineColorY2TPw74(d0 d0Var) {
        this.fillOutlineColor.setValue(d0Var);
    }

    public final void setFillOutlineColorUseTheme(String str) {
        this.fillOutlineColorUseTheme.setValue(str);
    }

    public final void setFillPattern(String str) {
        this.fillPattern.setValue(str);
    }

    /* JADX INFO: renamed from: setFillTunnelStructureColor-Y2TPw74, reason: not valid java name */
    public final void m193setFillTunnelStructureColorY2TPw74(d0 d0Var) {
        this.fillTunnelStructureColor.setValue(d0Var);
    }

    public final void setFillTunnelStructureColorUseTheme(String str) {
        this.fillTunnelStructureColorUseTheme.setValue(str);
    }

    public final void setFillZOffset(Double d14) {
        this.fillZOffset.setValue(d14);
    }

    public final void setInteractionsState(PolygonAnnotationInteractionsState polygonAnnotationInteractionsState) {
        polygonAnnotationInteractionsState.getClass();
        this.interactionsState.setValue(polygonAnnotationInteractionsState);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationState$UpdateFillBridgeGuardRailColor$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PolygonAnnotationNode polygonAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polygonAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationState.this.UpdateFillBridgeGuardRailColor(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationState$UpdateFillBridgeGuardRailColorUseTheme$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41262 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41262(PolygonAnnotationNode polygonAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polygonAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationState.this.UpdateFillBridgeGuardRailColorUseTheme(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationState$UpdateFillColor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41272 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41272(PolygonAnnotationNode polygonAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polygonAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationState.this.UpdateFillColor(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationState$UpdateFillColorUseTheme$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41282 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41282(PolygonAnnotationNode polygonAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polygonAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationState.this.UpdateFillColorUseTheme(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationState$UpdateFillConstructBridgeGuardRail$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41292 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41292(PolygonAnnotationNode polygonAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polygonAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationState.this.UpdateFillConstructBridgeGuardRail(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationState$UpdateFillOpacity$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41302 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41302(PolygonAnnotationNode polygonAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polygonAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationState.this.UpdateFillOpacity(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationState$UpdateFillOutlineColor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41312 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41312(PolygonAnnotationNode polygonAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polygonAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationState.this.UpdateFillOutlineColor(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationState$UpdateFillOutlineColorUseTheme$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41322 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41322(PolygonAnnotationNode polygonAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polygonAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationState.this.UpdateFillOutlineColorUseTheme(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationState$UpdateFillPattern$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41332 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41332(PolygonAnnotationNode polygonAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polygonAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationState.this.UpdateFillPattern(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationState$UpdateFillTunnelStructureColor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41342 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41342(PolygonAnnotationNode polygonAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polygonAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationState.this.UpdateFillTunnelStructureColor(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationState$UpdateFillTunnelStructureColorUseTheme$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41352 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41352(PolygonAnnotationNode polygonAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polygonAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationState.this.UpdateFillTunnelStructureColorUseTheme(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationState$UpdateFillZOffset$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41362 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolygonAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41362(PolygonAnnotationNode polygonAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polygonAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationState.this.UpdateFillZOffset(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    public PolygonAnnotationState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, new PolygonAnnotationInteractionsState());
    }
}
