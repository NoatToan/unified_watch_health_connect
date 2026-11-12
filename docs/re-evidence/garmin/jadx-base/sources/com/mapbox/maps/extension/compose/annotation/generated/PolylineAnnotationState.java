package com.mapbox.maps.extension.compose.annotation.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.compose.annotation.internal.generated.PolylineAnnotationNode;
import com.mapbox.maps.extension.style.layers.properties.generated.LineJoin;
import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotation;
import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotationManager;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bX\b\u0007\u0018\u00002\u00020\u0001B\u0096\u0001\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016B\t\b\u0016¢\u0006\u0004\b\u0015\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b \u0010\u001cJ\u0017\u0010!\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0017\u0010#\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0017\u0010$\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0017\u0010&\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b&\u0010\u001cJ\u0017\u0010'\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b'\u0010\u001cJ\u0017\u0010(\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b(\u0010\u001cJ\u0017\u0010)\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b)\u0010\u001cJ\u0017\u0010*\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b*\u0010\u001cR+\u00102\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R/\u00108\u001a\u0004\u0018\u00010\u00022\b\u0010+\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u00105\"\u0004\b6\u00107R5\u0010?\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010\u00048F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b9\u0010-\u0012\u0004\b>\u0010\u0017\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R/\u0010C\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010-\u001a\u0004\bA\u0010;\"\u0004\bB\u0010=R8\u0010I\u001a\u0004\u0018\u00010\u00072\b\u0010+\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bD\u0010-\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR/\u0010M\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010-\u001a\u0004\bK\u0010;\"\u0004\bL\u0010=R8\u0010Q\u001a\u0004\u0018\u00010\u00072\b\u0010+\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bN\u0010-\u001a\u0004\bO\u0010F\"\u0004\bP\u0010HR/\u0010U\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010-\u001a\u0004\bS\u0010;\"\u0004\bT\u0010=R/\u0010Y\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bV\u0010-\u001a\u0004\bW\u0010;\"\u0004\bX\u0010=R/\u0010]\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010-\u001a\u0004\b[\u0010;\"\u0004\b\\\u0010=R/\u0010c\u001a\u0004\u0018\u00010\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010-\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR/\u0010g\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bd\u0010-\u001a\u0004\be\u0010;\"\u0004\bf\u0010=R5\u0010l\u001a\u0004\u0018\u00010\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u000e8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bh\u0010-\u0012\u0004\bk\u0010\u0017\u001a\u0004\bi\u0010`\"\u0004\bj\u0010bR5\u0010q\u001a\u0004\u0018\u00010\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u000e8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bm\u0010-\u0012\u0004\bp\u0010\u0017\u001a\u0004\bn\u0010`\"\u0004\bo\u0010b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006r"}, d2 = {"Lcom/mapbox/maps/extension/compose/annotation/generated/PolylineAnnotationState;", "", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "initialLineJoin", "", "initialLineZOffset", "initialLineBlur", "Lo4/d0;", "initialLineBorderColor", "initialLineBorderWidth", "initialLineColor", "initialLineGapWidth", "initialLineOffset", "initialLineOpacity", "", "initialLinePattern", "initialLineWidth", "initialLineBorderColorUseTheme", "initialLineColorUseTheme", "Lcom/mapbox/maps/extension/compose/annotation/generated/PolylineAnnotationInteractionsState;", "initialPolylineAnnotationInteractionsState", "<init>", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;Ljava/lang/Double;Ljava/lang/Double;Lo4/d0;Ljava/lang/Double;Lo4/d0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/extension/compose/annotation/generated/PolylineAnnotationInteractionsState;)V", "()V", "Lcom/mapbox/maps/extension/compose/annotation/internal/generated/PolylineAnnotationNode;", "annotationNode", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/annotation/internal/generated/PolylineAnnotationNode;Lp3/m;I)V", "UpdateProperties", "UpdateLineJoin", "UpdateLineZOffset", "UpdateLineBlur", "UpdateLineBorderColor", "UpdateLineBorderWidth", "UpdateLineColor", "UpdateLineGapWidth", "UpdateLineOffset", "UpdateLineOpacity", "UpdateLinePattern", "UpdateLineWidth", "UpdateLineBorderColorUseTheme", "UpdateLineColorUseTheme", "<set-?>", "interactionsState$delegate", "Lp3/p1;", "getInteractionsState", "()Lcom/mapbox/maps/extension/compose/annotation/generated/PolylineAnnotationInteractionsState;", "setInteractionsState", "(Lcom/mapbox/maps/extension/compose/annotation/generated/PolylineAnnotationInteractionsState;)V", "interactionsState", "lineJoin$delegate", "getLineJoin", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "setLineJoin", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;)V", "lineJoin", "lineZOffset$delegate", "getLineZOffset", "()Ljava/lang/Double;", "setLineZOffset", "(Ljava/lang/Double;)V", "getLineZOffset$annotations", "lineZOffset", "lineBlur$delegate", "getLineBlur", "setLineBlur", "lineBlur", "lineBorderColor$delegate", "getLineBorderColor-QN2ZGVo", "()Lo4/d0;", "setLineBorderColor-Y2TPw74", "(Lo4/d0;)V", "lineBorderColor", "lineBorderWidth$delegate", "getLineBorderWidth", "setLineBorderWidth", "lineBorderWidth", "lineColor$delegate", "getLineColor-QN2ZGVo", "setLineColor-Y2TPw74", "lineColor", "lineGapWidth$delegate", "getLineGapWidth", "setLineGapWidth", "lineGapWidth", "lineOffset$delegate", "getLineOffset", "setLineOffset", "lineOffset", "lineOpacity$delegate", "getLineOpacity", "setLineOpacity", "lineOpacity", "linePattern$delegate", "getLinePattern", "()Ljava/lang/String;", "setLinePattern", "(Ljava/lang/String;)V", "linePattern", "lineWidth$delegate", "getLineWidth", "setLineWidth", "lineWidth", "lineBorderColorUseTheme$delegate", "getLineBorderColorUseTheme", "setLineBorderColorUseTheme", "getLineBorderColorUseTheme$annotations", "lineBorderColorUseTheme", "lineColorUseTheme$delegate", "getLineColorUseTheme", "setLineColorUseTheme", "getLineColorUseTheme$annotations", "lineColorUseTheme", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PolylineAnnotationState {

    /* JADX INFO: renamed from: interactionsState$delegate, reason: from kotlin metadata */
    private final p1 interactionsState;

    /* JADX INFO: renamed from: lineBlur$delegate, reason: from kotlin metadata */
    private final p1 lineBlur;

    /* JADX INFO: renamed from: lineBorderColor$delegate, reason: from kotlin metadata */
    private final p1 lineBorderColor;

    /* JADX INFO: renamed from: lineBorderColorUseTheme$delegate, reason: from kotlin metadata */
    private final p1 lineBorderColorUseTheme;

    /* JADX INFO: renamed from: lineBorderWidth$delegate, reason: from kotlin metadata */
    private final p1 lineBorderWidth;

    /* JADX INFO: renamed from: lineColor$delegate, reason: from kotlin metadata */
    private final p1 lineColor;

    /* JADX INFO: renamed from: lineColorUseTheme$delegate, reason: from kotlin metadata */
    private final p1 lineColorUseTheme;

    /* JADX INFO: renamed from: lineGapWidth$delegate, reason: from kotlin metadata */
    private final p1 lineGapWidth;

    /* JADX INFO: renamed from: lineJoin$delegate, reason: from kotlin metadata */
    private final p1 lineJoin;

    /* JADX INFO: renamed from: lineOffset$delegate, reason: from kotlin metadata */
    private final p1 lineOffset;

    /* JADX INFO: renamed from: lineOpacity$delegate, reason: from kotlin metadata */
    private final p1 lineOpacity;

    /* JADX INFO: renamed from: linePattern$delegate, reason: from kotlin metadata */
    private final p1 linePattern;

    /* JADX INFO: renamed from: lineWidth$delegate, reason: from kotlin metadata */
    private final p1 lineWidth;

    /* JADX INFO: renamed from: lineZOffset$delegate, reason: from kotlin metadata */
    private final p1 lineZOffset;

    private PolylineAnnotationState(LineJoin lineJoin, Double d14, Double d15, d0 d0Var, Double d16, d0 d0Var2, Double d17, Double d18, Double d19, String str, Double d24, String str2, String str3, PolylineAnnotationInteractionsState polylineAnnotationInteractionsState) {
        this.interactionsState = p0.n(polylineAnnotationInteractionsState);
        this.lineJoin = p0.n(lineJoin);
        this.lineZOffset = p0.n(d14);
        this.lineBlur = p0.n(d15);
        this.lineBorderColor = p0.n(d0Var);
        this.lineBorderWidth = p0.n(d16);
        this.lineColor = p0.n(d0Var2);
        this.lineGapWidth = p0.n(d17);
        this.lineOffset = p0.n(d18);
        this.lineOpacity = p0.n(d19);
        this.linePattern = p0.n(str);
        this.lineWidth = p0.n(d24);
        this.lineBorderColorUseTheme = p0.n(str2);
        this.lineColorUseTheme = p0.n(str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineBlur(PolylineAnnotationNode polylineAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-171709021);
        x1 x1Var = n.f135158a;
        PolylineAnnotationManager annotationManager = polylineAnnotationNode.getAnnotationManager();
        PolylineAnnotation annotation = polylineAnnotationNode.getAnnotation();
        annotation.setLineBlur(getLineBlur());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(polylineAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineBorderColor(PolylineAnnotationNode polylineAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-2050435479);
        x1 x1Var = n.f135158a;
        PolylineAnnotationManager annotationManager = polylineAnnotationNode.getAnnotationManager();
        PolylineAnnotation annotation = polylineAnnotationNode.getAnnotation();
        d0 d0VarM203getLineBorderColorQN2ZGVo = m203getLineBorderColorQN2ZGVo();
        annotation.setLineBorderColorInt(d0VarM203getLineBorderColorQN2ZGVo != null ? Integer.valueOf(f0.j(d0VarM203getLineBorderColorQN2ZGVo.f128833a)) : null);
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41692(polylineAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineBorderColorUseTheme(PolylineAnnotationNode polylineAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1607607545);
        x1 x1Var = n.f135158a;
        PolylineAnnotationManager annotationManager = polylineAnnotationNode.getAnnotationManager();
        PolylineAnnotation annotation = polylineAnnotationNode.getAnnotation();
        annotation.setLineBorderColorUseTheme(getLineBorderColorUseTheme());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41702(polylineAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineBorderWidth(PolylineAnnotationNode polylineAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1002370022);
        x1 x1Var = n.f135158a;
        PolylineAnnotationManager annotationManager = polylineAnnotationNode.getAnnotationManager();
        PolylineAnnotation annotation = polylineAnnotationNode.getAnnotation();
        annotation.setLineBorderWidth(getLineBorderWidth());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41712(polylineAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineColor(PolylineAnnotationNode polylineAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1375207773);
        x1 x1Var = n.f135158a;
        PolylineAnnotationManager annotationManager = polylineAnnotationNode.getAnnotationManager();
        PolylineAnnotation annotation = polylineAnnotationNode.getAnnotation();
        d0 d0VarM204getLineColorQN2ZGVo = m204getLineColorQN2ZGVo();
        annotation.setLineColorInt(d0VarM204getLineColorQN2ZGVo != null ? Integer.valueOf(f0.j(d0VarM204getLineColorQN2ZGVo.f128833a)) : null);
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41722(polylineAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineColorUseTheme(PolylineAnnotationNode polylineAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1489818107);
        x1 x1Var = n.f135158a;
        PolylineAnnotationManager annotationManager = polylineAnnotationNode.getAnnotationManager();
        PolylineAnnotation annotation = polylineAnnotationNode.getAnnotation();
        annotation.setLineColorUseTheme(getLineColorUseTheme());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41732(polylineAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineGapWidth(PolylineAnnotationNode polylineAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(847522458);
        x1 x1Var = n.f135158a;
        PolylineAnnotationManager annotationManager = polylineAnnotationNode.getAnnotationManager();
        PolylineAnnotation annotation = polylineAnnotationNode.getAnnotation();
        annotation.setLineGapWidth(getLineGapWidth());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41742(polylineAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineJoin(PolylineAnnotationNode polylineAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1194190656);
        x1 x1Var = n.f135158a;
        PolylineAnnotationManager annotationManager = polylineAnnotationNode.getAnnotationManager();
        PolylineAnnotation annotation = polylineAnnotationNode.getAnnotation();
        annotation.setLineJoin(getLineJoin());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41752(polylineAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineOffset(PolylineAnnotationNode polylineAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(709997495);
        x1 x1Var = n.f135158a;
        PolylineAnnotationManager annotationManager = polylineAnnotationNode.getAnnotationManager();
        PolylineAnnotation annotation = polylineAnnotationNode.getAnnotation();
        annotation.setLineOffset(getLineOffset());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41762(polylineAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineOpacity(PolylineAnnotationNode polylineAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1198678773);
        x1 x1Var = n.f135158a;
        PolylineAnnotationManager annotationManager = polylineAnnotationNode.getAnnotationManager();
        PolylineAnnotation annotation = polylineAnnotationNode.getAnnotation();
        annotation.setLineOpacity(getLineOpacity());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41772(polylineAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLinePattern(PolylineAnnotationNode polylineAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1346147472);
        x1 x1Var = n.f135158a;
        PolylineAnnotationManager annotationManager = polylineAnnotationNode.getAnnotationManager();
        PolylineAnnotation annotation = polylineAnnotationNode.getAnnotation();
        annotation.setLinePattern(getLinePattern());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41782(polylineAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineWidth(PolylineAnnotationNode polylineAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(133045978);
        x1 x1Var = n.f135158a;
        PolylineAnnotationManager annotationManager = polylineAnnotationNode.getAnnotationManager();
        PolylineAnnotation annotation = polylineAnnotationNode.getAnnotation();
        annotation.setLineWidth(getLineWidth());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41792(polylineAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateLineZOffset(PolylineAnnotationNode polylineAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1275255149);
        x1 x1Var = n.f135158a;
        PolylineAnnotationManager annotationManager = polylineAnnotationNode.getAnnotationManager();
        PolylineAnnotation annotation = polylineAnnotationNode.getAnnotation();
        annotation.setLineZOffset(getLineZOffset());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41802(polylineAnnotationNode, i14);
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineBorderColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getLineZOffset$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(PolylineAnnotationNode polylineAnnotationNode, m mVar, int i14) {
        polylineAnnotationNode.getClass();
        o0 o0VarE = mVar.E(852823979);
        x1 x1Var = n.f135158a;
        int i15 = (i14 & 112) | 8;
        UpdateLineJoin(polylineAnnotationNode, o0VarE, i15);
        UpdateLineZOffset(polylineAnnotationNode, o0VarE, i15);
        UpdateLineBlur(polylineAnnotationNode, o0VarE, i15);
        UpdateLineBorderColor(polylineAnnotationNode, o0VarE, i15);
        UpdateLineBorderWidth(polylineAnnotationNode, o0VarE, i15);
        UpdateLineColor(polylineAnnotationNode, o0VarE, i15);
        UpdateLineGapWidth(polylineAnnotationNode, o0VarE, i15);
        UpdateLineOffset(polylineAnnotationNode, o0VarE, i15);
        UpdateLineOpacity(polylineAnnotationNode, o0VarE, i15);
        UpdateLinePattern(polylineAnnotationNode, o0VarE, i15);
        UpdateLineWidth(polylineAnnotationNode, o0VarE, i15);
        UpdateLineBorderColorUseTheme(polylineAnnotationNode, o0VarE, i15);
        UpdateLineColorUseTheme(polylineAnnotationNode, o0VarE, i15);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new PolylineAnnotationState$UpdateProperties$1(this, polylineAnnotationNode, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PolylineAnnotationInteractionsState getInteractionsState() {
        return (PolylineAnnotationInteractionsState) this.interactionsState.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineBlur() {
        return (Double) this.lineBlur.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getLineBorderColor-QN2ZGVo, reason: not valid java name */
    public final d0 m203getLineBorderColorQN2ZGVo() {
        return (d0) this.lineBorderColor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getLineBorderColorUseTheme() {
        return (String) this.lineBorderColorUseTheme.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineBorderWidth() {
        return (Double) this.lineBorderWidth.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getLineColor-QN2ZGVo, reason: not valid java name */
    public final d0 m204getLineColorQN2ZGVo() {
        return (d0) this.lineColor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getLineColorUseTheme() {
        return (String) this.lineColorUseTheme.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineGapWidth() {
        return (Double) this.lineGapWidth.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LineJoin getLineJoin() {
        return (LineJoin) this.lineJoin.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineOffset() {
        return (Double) this.lineOffset.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineOpacity() {
        return (Double) this.lineOpacity.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getLinePattern() {
        return (String) this.linePattern.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineWidth() {
        return (Double) this.lineWidth.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getLineZOffset() {
        return (Double) this.lineZOffset.getF182175a();
    }

    public final void setInteractionsState(PolylineAnnotationInteractionsState polylineAnnotationInteractionsState) {
        polylineAnnotationInteractionsState.getClass();
        this.interactionsState.setValue(polylineAnnotationInteractionsState);
    }

    public final void setLineBlur(Double d14) {
        this.lineBlur.setValue(d14);
    }

    /* JADX INFO: renamed from: setLineBorderColor-Y2TPw74, reason: not valid java name */
    public final void m205setLineBorderColorY2TPw74(d0 d0Var) {
        this.lineBorderColor.setValue(d0Var);
    }

    public final void setLineBorderColorUseTheme(String str) {
        this.lineBorderColorUseTheme.setValue(str);
    }

    public final void setLineBorderWidth(Double d14) {
        this.lineBorderWidth.setValue(d14);
    }

    /* JADX INFO: renamed from: setLineColor-Y2TPw74, reason: not valid java name */
    public final void m206setLineColorY2TPw74(d0 d0Var) {
        this.lineColor.setValue(d0Var);
    }

    public final void setLineColorUseTheme(String str) {
        this.lineColorUseTheme.setValue(str);
    }

    public final void setLineGapWidth(Double d14) {
        this.lineGapWidth.setValue(d14);
    }

    public final void setLineJoin(LineJoin lineJoin) {
        this.lineJoin.setValue(lineJoin);
    }

    public final void setLineOffset(Double d14) {
        this.lineOffset.setValue(d14);
    }

    public final void setLineOpacity(Double d14) {
        this.lineOpacity.setValue(d14);
    }

    public final void setLinePattern(String str) {
        this.linePattern.setValue(str);
    }

    public final void setLineWidth(Double d14) {
        this.lineWidth.setValue(d14);
    }

    public final void setLineZOffset(Double d14) {
        this.lineZOffset.setValue(d14);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationState$UpdateLineBlur$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PolylineAnnotationNode polylineAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polylineAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationState.this.UpdateLineBlur(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationState$UpdateLineBorderColor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41692 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41692(PolylineAnnotationNode polylineAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polylineAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationState.this.UpdateLineBorderColor(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationState$UpdateLineBorderColorUseTheme$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41702 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41702(PolylineAnnotationNode polylineAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polylineAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationState.this.UpdateLineBorderColorUseTheme(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationState$UpdateLineBorderWidth$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41712 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41712(PolylineAnnotationNode polylineAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polylineAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationState.this.UpdateLineBorderWidth(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationState$UpdateLineColor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41722 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41722(PolylineAnnotationNode polylineAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polylineAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationState.this.UpdateLineColor(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationState$UpdateLineColorUseTheme$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41732 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41732(PolylineAnnotationNode polylineAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polylineAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationState.this.UpdateLineColorUseTheme(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationState$UpdateLineGapWidth$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41742 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41742(PolylineAnnotationNode polylineAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polylineAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationState.this.UpdateLineGapWidth(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationState$UpdateLineJoin$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41752 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41752(PolylineAnnotationNode polylineAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polylineAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationState.this.UpdateLineJoin(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationState$UpdateLineOffset$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41762 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41762(PolylineAnnotationNode polylineAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polylineAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationState.this.UpdateLineOffset(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationState$UpdateLineOpacity$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41772 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41772(PolylineAnnotationNode polylineAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polylineAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationState.this.UpdateLineOpacity(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationState$UpdateLinePattern$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41782 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41782(PolylineAnnotationNode polylineAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polylineAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationState.this.UpdateLinePattern(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationState$UpdateLineWidth$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41792 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41792(PolylineAnnotationNode polylineAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polylineAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationState.this.UpdateLineWidth(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationState$UpdateLineZOffset$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41802 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PolylineAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41802(PolylineAnnotationNode polylineAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = polylineAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationState.this.UpdateLineZOffset(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    public PolylineAnnotationState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, new PolylineAnnotationInteractionsState());
    }
}
