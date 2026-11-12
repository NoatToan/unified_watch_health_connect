package com.mapbox.maps.extension.compose.annotation.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.compose.annotation.internal.generated.CircleAnnotationNode;
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotation;
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotationManager;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bA\b\u0007\u0018\u00002\u00020\u0001Bn\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0010\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0017\u0010 \u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b \u0010\u0017J\u0017\u0010!\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b!\u0010\u0017R+\u0010)\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R/\u0010/\u001a\u0004\u0018\u00010\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R8\u00105\u001a\u0004\u0018\u00010\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b0\u0010$\u001a\u0004\b1\u00102\"\u0004\b3\u00104R/\u00109\u001a\u0004\u0018\u00010\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010$\u001a\u0004\b7\u0010,\"\u0004\b8\u0010.R/\u0010=\u001a\u0004\u0018\u00010\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010$\u001a\u0004\b;\u0010,\"\u0004\b<\u0010.R8\u0010A\u001a\u0004\u0018\u00010\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b>\u0010$\u001a\u0004\b?\u00102\"\u0004\b@\u00104R/\u0010E\u001a\u0004\u0018\u00010\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010$\u001a\u0004\bC\u0010,\"\u0004\bD\u0010.R/\u0010I\u001a\u0004\u0018\u00010\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010$\u001a\u0004\bG\u0010,\"\u0004\bH\u0010.R5\u0010P\u001a\u0004\u0018\u00010\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u000b8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bJ\u0010$\u0012\u0004\bO\u0010\u0012\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR5\u0010U\u001a\u0004\u0018\u00010\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u000b8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bQ\u0010$\u0012\u0004\bT\u0010\u0012\u001a\u0004\bR\u0010L\"\u0004\bS\u0010N\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, d2 = {"Lcom/mapbox/maps/extension/compose/annotation/generated/CircleAnnotationState;", "", "", "initialCircleBlur", "Lo4/d0;", "initialCircleColor", "initialCircleOpacity", "initialCircleRadius", "initialCircleStrokeColor", "initialCircleStrokeOpacity", "initialCircleStrokeWidth", "", "initialCircleColorUseTheme", "initialCircleStrokeColorUseTheme", "Lcom/mapbox/maps/extension/compose/annotation/generated/CircleAnnotationInteractionsState;", "initialCircleAnnotationInteractionsState", "<init>", "(Ljava/lang/Double;Lo4/d0;Ljava/lang/Double;Ljava/lang/Double;Lo4/d0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/extension/compose/annotation/generated/CircleAnnotationInteractionsState;)V", "()V", "Lcom/mapbox/maps/extension/compose/annotation/internal/generated/CircleAnnotationNode;", "annotationNode", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/annotation/internal/generated/CircleAnnotationNode;Lp3/m;I)V", "UpdateProperties", "UpdateCircleBlur", "UpdateCircleColor", "UpdateCircleOpacity", "UpdateCircleRadius", "UpdateCircleStrokeColor", "UpdateCircleStrokeOpacity", "UpdateCircleStrokeWidth", "UpdateCircleColorUseTheme", "UpdateCircleStrokeColorUseTheme", "<set-?>", "interactionsState$delegate", "Lp3/p1;", "getInteractionsState", "()Lcom/mapbox/maps/extension/compose/annotation/generated/CircleAnnotationInteractionsState;", "setInteractionsState", "(Lcom/mapbox/maps/extension/compose/annotation/generated/CircleAnnotationInteractionsState;)V", "interactionsState", "circleBlur$delegate", "getCircleBlur", "()Ljava/lang/Double;", "setCircleBlur", "(Ljava/lang/Double;)V", "circleBlur", "circleColor$delegate", "getCircleColor-QN2ZGVo", "()Lo4/d0;", "setCircleColor-Y2TPw74", "(Lo4/d0;)V", "circleColor", "circleOpacity$delegate", "getCircleOpacity", "setCircleOpacity", "circleOpacity", "circleRadius$delegate", "getCircleRadius", "setCircleRadius", "circleRadius", "circleStrokeColor$delegate", "getCircleStrokeColor-QN2ZGVo", "setCircleStrokeColor-Y2TPw74", "circleStrokeColor", "circleStrokeOpacity$delegate", "getCircleStrokeOpacity", "setCircleStrokeOpacity", "circleStrokeOpacity", "circleStrokeWidth$delegate", "getCircleStrokeWidth", "setCircleStrokeWidth", "circleStrokeWidth", "circleColorUseTheme$delegate", "getCircleColorUseTheme", "()Ljava/lang/String;", "setCircleColorUseTheme", "(Ljava/lang/String;)V", "getCircleColorUseTheme$annotations", "circleColorUseTheme", "circleStrokeColorUseTheme$delegate", "getCircleStrokeColorUseTheme", "setCircleStrokeColorUseTheme", "getCircleStrokeColorUseTheme$annotations", "circleStrokeColorUseTheme", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CircleAnnotationState {

    /* JADX INFO: renamed from: circleBlur$delegate, reason: from kotlin metadata */
    private final p1 circleBlur;

    /* JADX INFO: renamed from: circleColor$delegate, reason: from kotlin metadata */
    private final p1 circleColor;

    /* JADX INFO: renamed from: circleColorUseTheme$delegate, reason: from kotlin metadata */
    private final p1 circleColorUseTheme;

    /* JADX INFO: renamed from: circleOpacity$delegate, reason: from kotlin metadata */
    private final p1 circleOpacity;

    /* JADX INFO: renamed from: circleRadius$delegate, reason: from kotlin metadata */
    private final p1 circleRadius;

    /* JADX INFO: renamed from: circleStrokeColor$delegate, reason: from kotlin metadata */
    private final p1 circleStrokeColor;

    /* JADX INFO: renamed from: circleStrokeColorUseTheme$delegate, reason: from kotlin metadata */
    private final p1 circleStrokeColorUseTheme;

    /* JADX INFO: renamed from: circleStrokeOpacity$delegate, reason: from kotlin metadata */
    private final p1 circleStrokeOpacity;

    /* JADX INFO: renamed from: circleStrokeWidth$delegate, reason: from kotlin metadata */
    private final p1 circleStrokeWidth;

    /* JADX INFO: renamed from: interactionsState$delegate, reason: from kotlin metadata */
    private final p1 interactionsState;

    private CircleAnnotationState(Double d14, d0 d0Var, Double d15, Double d16, d0 d0Var2, Double d17, Double d18, String str, String str2, CircleAnnotationInteractionsState circleAnnotationInteractionsState) {
        this.interactionsState = p0.n(circleAnnotationInteractionsState);
        this.circleBlur = p0.n(d14);
        this.circleColor = p0.n(d0Var);
        this.circleOpacity = p0.n(d15);
        this.circleRadius = p0.n(d16);
        this.circleStrokeColor = p0.n(d0Var2);
        this.circleStrokeOpacity = p0.n(d17);
        this.circleStrokeWidth = p0.n(d18);
        this.circleColorUseTheme = p0.n(str);
        this.circleStrokeColorUseTheme = p0.n(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleBlur(CircleAnnotationNode circleAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(886686391);
        x1 x1Var = n.f135158a;
        CircleAnnotationManager annotationManager = circleAnnotationNode.getAnnotationManager();
        CircleAnnotation annotation = circleAnnotationNode.getAnnotation();
        annotation.setCircleBlur(getCircleBlur());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(circleAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleColor(CircleAnnotationNode circleAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-543361111);
        x1 x1Var = n.f135158a;
        CircleAnnotationManager annotationManager = circleAnnotationNode.getAnnotationManager();
        CircleAnnotation annotation = circleAnnotationNode.getAnnotation();
        d0 d0VarM146getCircleColorQN2ZGVo = m146getCircleColorQN2ZGVo();
        annotation.setCircleColorInt(d0VarM146getCircleColorQN2ZGVo != null ? Integer.valueOf(f0.j(d0VarM146getCircleColorQN2ZGVo.f128833a)) : null);
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39932(circleAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleColorUseTheme(CircleAnnotationNode circleAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(999897799);
        x1 x1Var = n.f135158a;
        CircleAnnotationManager annotationManager = circleAnnotationNode.getAnnotationManager();
        CircleAnnotation annotation = circleAnnotationNode.getAnnotation();
        annotation.setCircleColorUseTheme(getCircleColorUseTheme());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39942(circleAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleOpacity(CircleAnnotationNode circleAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1372820545);
        x1 x1Var = n.f135158a;
        CircleAnnotationManager annotationManager = circleAnnotationNode.getAnnotationManager();
        CircleAnnotation annotation = circleAnnotationNode.getAnnotation();
        annotation.setCircleOpacity(getCircleOpacity());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39952(circleAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleRadius(CircleAnnotationNode circleAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(502753516);
        x1 x1Var = n.f135158a;
        CircleAnnotationManager annotationManager = circleAnnotationNode.getAnnotationManager();
        CircleAnnotation annotation = circleAnnotationNode.getAnnotation();
        annotation.setCircleRadius(getCircleRadius());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39962(circleAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleStrokeColor(CircleAnnotationNode circleAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(752682177);
        x1 x1Var = n.f135158a;
        CircleAnnotationManager annotationManager = circleAnnotationNode.getAnnotationManager();
        CircleAnnotation annotation = circleAnnotationNode.getAnnotation();
        d0 d0VarM147getCircleStrokeColorQN2ZGVo = m147getCircleStrokeColorQN2ZGVo();
        annotation.setCircleStrokeColorInt(d0VarM147getCircleStrokeColorQN2ZGVo != null ? Integer.valueOf(f0.j(d0VarM147getCircleStrokeColorQN2ZGVo.f128833a)) : null);
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39972(circleAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleStrokeColorUseTheme(CircleAnnotationNode circleAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1461276705);
        x1 x1Var = n.f135158a;
        CircleAnnotationManager annotationManager = circleAnnotationNode.getAnnotationManager();
        CircleAnnotation annotation = circleAnnotationNode.getAnnotation();
        annotation.setCircleStrokeColorUseTheme(getCircleStrokeColorUseTheme());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39982(circleAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleStrokeOpacity(CircleAnnotationNode circleAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(1329904473);
        x1 x1Var = n.f135158a;
        CircleAnnotationManager annotationManager = circleAnnotationNode.getAnnotationManager();
        CircleAnnotation annotation = circleAnnotationNode.getAnnotation();
        annotation.setCircleStrokeOpacity(getCircleStrokeOpacity());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39992(circleAnnotationNode, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCircleStrokeWidth(CircleAnnotationNode circleAnnotationNode, m mVar, int i14) {
        o0 o0VarE = mVar.E(656557054);
        x1 x1Var = n.f135158a;
        CircleAnnotationManager annotationManager = circleAnnotationNode.getAnnotationManager();
        CircleAnnotation annotation = circleAnnotationNode.getAnnotation();
        annotation.setCircleStrokeWidth(getCircleStrokeWidth());
        annotationManager.update(annotation);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C40002(circleAnnotationNode, i14);
    }

    @MapboxExperimental
    public static /* synthetic */ void getCircleColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getCircleStrokeColorUseTheme$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(CircleAnnotationNode circleAnnotationNode, m mVar, int i14) {
        circleAnnotationNode.getClass();
        o0 o0VarE = mVar.E(670153563);
        x1 x1Var = n.f135158a;
        int i15 = (i14 & 112) | 8;
        UpdateCircleBlur(circleAnnotationNode, o0VarE, i15);
        UpdateCircleColor(circleAnnotationNode, o0VarE, i15);
        UpdateCircleOpacity(circleAnnotationNode, o0VarE, i15);
        UpdateCircleRadius(circleAnnotationNode, o0VarE, i15);
        UpdateCircleStrokeColor(circleAnnotationNode, o0VarE, i15);
        UpdateCircleStrokeOpacity(circleAnnotationNode, o0VarE, i15);
        UpdateCircleStrokeWidth(circleAnnotationNode, o0VarE, i15);
        UpdateCircleColorUseTheme(circleAnnotationNode, o0VarE, i15);
        UpdateCircleStrokeColorUseTheme(circleAnnotationNode, o0VarE, i15);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new CircleAnnotationState$UpdateProperties$1(this, circleAnnotationNode, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getCircleBlur() {
        return (Double) this.circleBlur.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getCircleColor-QN2ZGVo, reason: not valid java name */
    public final d0 m146getCircleColorQN2ZGVo() {
        return (d0) this.circleColor.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getCircleColorUseTheme() {
        return (String) this.circleColorUseTheme.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getCircleOpacity() {
        return (Double) this.circleOpacity.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double getCircleRadius() {
        return (Double) this.circleRadius.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getCircleStrokeColor-QN2ZGVo, reason: not valid java name */
    public final d0 m147getCircleStrokeColorQN2ZGVo() {
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

    /* JADX WARN: Multi-variable type inference failed */
    public final CircleAnnotationInteractionsState getInteractionsState() {
        return (CircleAnnotationInteractionsState) this.interactionsState.getF182175a();
    }

    public final void setCircleBlur(Double d14) {
        this.circleBlur.setValue(d14);
    }

    /* JADX INFO: renamed from: setCircleColor-Y2TPw74, reason: not valid java name */
    public final void m148setCircleColorY2TPw74(d0 d0Var) {
        this.circleColor.setValue(d0Var);
    }

    public final void setCircleColorUseTheme(String str) {
        this.circleColorUseTheme.setValue(str);
    }

    public final void setCircleOpacity(Double d14) {
        this.circleOpacity.setValue(d14);
    }

    public final void setCircleRadius(Double d14) {
        this.circleRadius.setValue(d14);
    }

    /* JADX INFO: renamed from: setCircleStrokeColor-Y2TPw74, reason: not valid java name */
    public final void m149setCircleStrokeColorY2TPw74(d0 d0Var) {
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

    public final void setInteractionsState(CircleAnnotationInteractionsState circleAnnotationInteractionsState) {
        circleAnnotationInteractionsState.getClass();
        this.interactionsState.setValue(circleAnnotationInteractionsState);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationState$UpdateCircleBlur$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CircleAnnotationNode circleAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = circleAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationState.this.UpdateCircleBlur(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationState$UpdateCircleColor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39932 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39932(CircleAnnotationNode circleAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = circleAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationState.this.UpdateCircleColor(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationState$UpdateCircleColorUseTheme$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39942 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39942(CircleAnnotationNode circleAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = circleAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationState.this.UpdateCircleColorUseTheme(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationState$UpdateCircleOpacity$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39952 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39952(CircleAnnotationNode circleAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = circleAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationState.this.UpdateCircleOpacity(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationState$UpdateCircleRadius$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39962 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39962(CircleAnnotationNode circleAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = circleAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationState.this.UpdateCircleRadius(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationState$UpdateCircleStrokeColor$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39972 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39972(CircleAnnotationNode circleAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = circleAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationState.this.UpdateCircleStrokeColor(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationState$UpdateCircleStrokeColorUseTheme$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39982 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39982(CircleAnnotationNode circleAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = circleAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationState.this.UpdateCircleStrokeColorUseTheme(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationState$UpdateCircleStrokeOpacity$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39992 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39992(CircleAnnotationNode circleAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = circleAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationState.this.UpdateCircleStrokeOpacity(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationState$UpdateCircleStrokeWidth$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C40002 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CircleAnnotationNode $annotationNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40002(CircleAnnotationNode circleAnnotationNode, int i14) {
            super(2);
            this.$annotationNode = circleAnnotationNode;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationState.this.UpdateCircleStrokeWidth(this.$annotationNode, mVar, this.$$changed | 1);
        }
    }

    public CircleAnnotationState() {
        this(null, null, null, null, null, null, null, null, null, new CircleAnnotationInteractionsState());
    }
}
