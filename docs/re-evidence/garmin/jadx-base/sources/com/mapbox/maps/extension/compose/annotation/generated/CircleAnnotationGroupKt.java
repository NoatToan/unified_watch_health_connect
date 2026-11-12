package com.mapbox.maps.extension.compose.annotation.generated;

import ch.qos.logback.core.net.SyslogConstants;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.extension.compose.MapboxMapComposable;
import com.mapbox.maps.extension.compose.annotation.internal.generated.CircleAnnotationManagerNode;
import com.mapbox.maps.extension.compose.internal.MapApplier;
import com.mapbox.maps.plugin.annotation.AnnotationConfig;
import com.mapbox.maps.plugin.annotation.AnnotationsUtils;
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotation;
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotationManager;
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotationManagerKt;
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotationOptions;
import e23.a;
import e23.l;
import e23.p;
import java.util.Iterator;
import java.util.List;
import o13.e;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.c;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.z;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001aI\u0010\f\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\f\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000e\u001aY\u0010\f\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\n\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0014\b\u0004\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0010\u001aC\u0010\f\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0004\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"", "Lcom/mapbox/maps/plugin/annotation/generated/CircleAnnotationOptions;", "annotations", "Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;", "annotationConfig", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/annotation/generated/CircleAnnotation;", "", "onClick", "Lcom/mapbox/maps/extension/compose/annotation/generated/CircleAnnotationGroupState;", "circleAnnotationGroupState", "", "CircleAnnotationGroup", "(Ljava/util/List;Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;Le23/l;Lcom/mapbox/maps/extension/compose/annotation/generated/CircleAnnotationGroupState;Lp3/m;II)V", "(Ljava/util/List;Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;Lcom/mapbox/maps/extension/compose/annotation/generated/CircleAnnotationGroupState;Lp3/m;II)V", "init", "(Ljava/util/List;Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;Le23/l;Le23/l;Lp3/m;II)V", "(Ljava/util/List;Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;Le23/l;Lp3/m;II)V", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class CircleAnnotationGroupKt {

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupKt$CircleAnnotationGroup$7, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass7 extends w implements a<CircleAnnotationManagerNode> {
        final /* synthetic */ AnnotationConfig $annotationConfig;
        final /* synthetic */ p1<CircleAnnotationManager> $annotationManager$delegate;
        final /* synthetic */ p1<CircleAnnotationManagerNode> $annotationManagerNode$delegate;
        final /* synthetic */ b0 $coroutineScope;
        final /* synthetic */ MapApplier $mapApplier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(MapApplier mapApplier, AnnotationConfig annotationConfig, b0 b0Var, p1<CircleAnnotationManager> p1Var, p1<CircleAnnotationManagerNode> p1Var2) {
            super(0);
            this.$mapApplier = mapApplier;
            this.$annotationConfig = annotationConfig;
            this.$coroutineScope = b0Var;
            this.$annotationManager$delegate = p1Var;
            this.$annotationManagerNode$delegate = p1Var2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // e23.a
        public final CircleAnnotationManagerNode invoke() {
            MapboxMap mapboxMapDeprecated = this.$mapApplier.getMapView().getMapboxMapDeprecated();
            CircleAnnotationManager circleAnnotationManagerCreateCircleAnnotationManager = CircleAnnotationManagerKt.createCircleAnnotationManager(AnnotationsUtils.getAnnotations(this.$mapApplier.getMapView()), this.$annotationConfig);
            CircleAnnotationGroupKt.CircleAnnotationGroup$lambda$5(this.$annotationManager$delegate, circleAnnotationManagerCreateCircleAnnotationManager);
            CircleAnnotationManagerNode circleAnnotationManagerNode = new CircleAnnotationManagerNode(mapboxMapDeprecated, circleAnnotationManagerCreateCircleAnnotationManager, this.$coroutineScope);
            CircleAnnotationGroupKt.CircleAnnotationGroup$lambda$8(this.$annotationManagerNode$delegate, circleAnnotationManagerNode);
            return circleAnnotationManagerNode;
        }
    }

    @MapboxMapComposable
    public static final void CircleAnnotationGroup(List<CircleAnnotationOptions> list, AnnotationConfig annotationConfig, CircleAnnotationGroupState circleAnnotationGroupState, m mVar, int i14, int i15) {
        list.getClass();
        o0 o0VarE = mVar.E(1107804080);
        c<?> cVar = o0VarE.f135177b;
        AnnotationConfig annotationConfig2 = (i15 & 2) != 0 ? null : annotationConfig;
        int i16 = i15 & 4;
        m.a aVar = m.f135153a;
        CircleAnnotationGroupState circleAnnotationGroupState2 = circleAnnotationGroupState;
        if (i16 != 0) {
            Object objK = fb1.c.k(o0VarE, -492369756, aVar);
            if (objK == m.a.f135155b) {
                objK = new CircleAnnotationGroupState();
                o0VarE.K(objK);
            }
            o0VarE.g0(false);
            circleAnnotationGroupState2 = (CircleAnnotationGroupState) objK;
        }
        x1 x1Var = n.f135158a;
        MapApplier mapApplier = cVar instanceof MapApplier ? (MapApplier) cVar : null;
        if (mapApplier == null) {
            h.z("Illegal use of CircleAnnotationCluster inside unsupported composable function");
            return;
        }
        Object objK2 = fb1.c.k(o0VarE, -492369756, aVar);
        Object obj = m.a.f135155b;
        if (objK2 == obj) {
            objK2 = p0.n(null);
            o0VarE.K(objK2);
        }
        o0VarE.g0(false);
        p1 p1Var = (p1) objK2;
        o0VarE.L(-492369756);
        Object objQ = o0VarE.q();
        if (objQ == obj) {
            objQ = p0.n(null);
            o0VarE.K(objQ);
        }
        o0VarE.g0(false);
        p1 p1Var2 = (p1) objQ;
        if (circleAnnotationGroupState2.getInteractionsState().isDraggable()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((CircleAnnotationOptions) it.next()).withDraggable(true);
            }
        }
        o0VarE.L(773894976);
        o0VarE.L(-492369756);
        Object objQ2 = o0VarE.q();
        if (objQ2 == m.a.f135155b) {
            objQ2 = com.garmin.proto.generated.a.d(l0.j(t13.h.f161748a, o0VarE), o0VarE);
        }
        o0VarE.g0(false);
        b0 b0Var = ((z) objQ2).f135391a;
        o0VarE.g0(false);
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(mapApplier, annotationConfig2, b0Var, p1Var, p1Var2);
        o0VarE.L(-548224868);
        if (!(cVar instanceof MapApplier)) {
            p0.l();
            throw null;
        }
        o0VarE.H();
        if (o0VarE.T) {
            o0VarE.M(anonymousClass7);
        } else {
            o0VarE.c();
        }
        b4.c(CircleAnnotationGroupKt$CircleAnnotationGroup$8$1.INSTANCE, list, o0VarE);
        o0VarE.N(-1991833345, circleAnnotationGroupState2);
        CircleAnnotationManager circleAnnotationManagerCircleAnnotationGroup$lambda$4 = CircleAnnotationGroup$lambda$4(p1Var);
        if (circleAnnotationManagerCircleAnnotationGroup$lambda$4 != null) {
            circleAnnotationGroupState2.UpdateProperties$extension_compose_release(circleAnnotationManagerCircleAnnotationGroup$lambda$4, o0VarE, ((i14 >> 3) & 112) | 8);
        }
        o0VarE.g0(false);
        o0VarE.g0(true);
        o0VarE.g0(false);
        o0VarE.N(-1615799189, o0VarE.G(o0VarE.G(circleAnnotationGroupState2.getInteractionsState(), CircleAnnotationGroup$lambda$4(p1Var)), CircleAnnotationGroup$lambda$7(p1Var2)));
        if (CircleAnnotationGroup$lambda$4(p1Var) != null && CircleAnnotationGroup$lambda$7(p1Var2) != null) {
            CircleAnnotationManager circleAnnotationManagerCircleAnnotationGroup$lambda$5 = CircleAnnotationGroup$lambda$4(p1Var);
            if (circleAnnotationManagerCircleAnnotationGroup$lambda$5 != null) {
                circleAnnotationGroupState2.getInteractionsState().BindTo$extension_compose_release(circleAnnotationManagerCircleAnnotationGroup$lambda$5, o0VarE, 8);
            }
            CircleAnnotationManagerNode circleAnnotationManagerNodeCircleAnnotationGroup$lambda$7 = CircleAnnotationGroup$lambda$7(p1Var2);
            if (circleAnnotationManagerNodeCircleAnnotationGroup$lambda$7 != null) {
                Iterator<T> it3 = circleAnnotationManagerNodeCircleAnnotationGroup$lambda$7.getCurrentAnnotations$extension_compose_release().iterator();
                while (it3.hasNext()) {
                    ((CircleAnnotation) it3.next()).setDraggable(circleAnnotationGroupState2.getInteractionsState().isDraggable());
                }
            }
        }
        o0VarE.g0(false);
        x1 x1Var2 = n.f135158a;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass12(list, annotationConfig2, circleAnnotationGroupState2, i14, i15);
    }

    private static final CircleAnnotationManager CircleAnnotationGroup$lambda$4(p1<CircleAnnotationManager> p1Var) {
        return p1Var.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CircleAnnotationGroup$lambda$5(p1<CircleAnnotationManager> p1Var, CircleAnnotationManager circleAnnotationManager) {
        p1Var.setValue(circleAnnotationManager);
    }

    private static final CircleAnnotationManagerNode CircleAnnotationGroup$lambda$7(p1<CircleAnnotationManagerNode> p1Var) {
        return p1Var.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CircleAnnotationGroup$lambda$8(p1<CircleAnnotationManagerNode> p1Var, CircleAnnotationManagerNode circleAnnotationManagerNode) {
        p1Var.setValue(circleAnnotationManagerNode);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupKt$CircleAnnotationGroup$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<CircleAnnotation, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public final Boolean invoke(CircleAnnotation circleAnnotation) {
            circleAnnotation.getClass();
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupKt$CircleAnnotationGroup$13, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass13 extends w implements l<CircleAnnotation, Boolean> {
        public static final AnonymousClass13 INSTANCE = new AnonymousClass13();

        public AnonymousClass13() {
            super(1);
        }

        @Override // e23.l
        public final Boolean invoke(CircleAnnotation circleAnnotation) {
            circleAnnotation.getClass();
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupKt$CircleAnnotationGroup$12, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass12 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ AnnotationConfig $annotationConfig;
        final /* synthetic */ List<CircleAnnotationOptions> $annotations;
        final /* synthetic */ CircleAnnotationGroupState $circleAnnotationGroupState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(List<CircleAnnotationOptions> list, AnnotationConfig annotationConfig, CircleAnnotationGroupState circleAnnotationGroupState, int i14, int i15) {
            super(2);
            this.$annotations = list;
            this.$annotationConfig = annotationConfig;
            this.$circleAnnotationGroupState = circleAnnotationGroupState;
            this.$$changed = i14;
            this.$$default = i15;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationGroupKt.CircleAnnotationGroup(this.$annotations, this.$annotationConfig, this.$circleAnnotationGroupState, mVar, this.$$changed | 1, this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationGroupKt$CircleAnnotationGroup$4, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass4 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ AnnotationConfig $annotationConfig;
        final /* synthetic */ List<CircleAnnotationOptions> $annotations;
        final /* synthetic */ CircleAnnotationGroupState $circleAnnotationGroupState;
        final /* synthetic */ l<CircleAnnotation, Boolean> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(List<CircleAnnotationOptions> list, AnnotationConfig annotationConfig, l<? super CircleAnnotation, Boolean> lVar, CircleAnnotationGroupState circleAnnotationGroupState, int i14, int i15) {
            super(2);
            this.$annotations = list;
            this.$annotationConfig = annotationConfig;
            this.$onClick = lVar;
            this.$circleAnnotationGroupState = circleAnnotationGroupState;
            this.$$changed = i14;
            this.$$default = i15;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationGroupKt.CircleAnnotationGroup(this.$annotations, this.$annotationConfig, this.$onClick, this.$circleAnnotationGroupState, mVar, this.$$changed | 1, this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @e
    @MapboxMapComposable
    public static final void CircleAnnotationGroup(List<CircleAnnotationOptions> list, AnnotationConfig annotationConfig, l<? super CircleAnnotation, Boolean> lVar, CircleAnnotationGroupState circleAnnotationGroupState, m mVar, int i14, int i15) {
        list.getClass();
        o0 o0VarE = mVar.E(-1837079805);
        if ((i15 & 2) != 0) {
            annotationConfig = null;
        }
        AnnotationConfig annotationConfig2 = annotationConfig;
        if ((i15 & 4) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        l<? super CircleAnnotation, Boolean> lVar2 = lVar;
        if ((i15 & 8) != 0) {
            o0VarE.L(-492369756);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new CircleAnnotationGroupState();
                o0VarE.K(objQ);
            }
            o0VarE.g0(false);
            circleAnnotationGroupState = (CircleAnnotationGroupState) objQ;
        }
        CircleAnnotationGroupState circleAnnotationGroupState2 = circleAnnotationGroupState;
        x1 x1Var = n.f135158a;
        circleAnnotationGroupState2.getInteractionsState().onClicked(lVar2);
        Unit unit = Unit.INSTANCE;
        CircleAnnotationGroup(list, annotationConfig2, circleAnnotationGroupState2, o0VarE, 72, 0);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass4(list, annotationConfig2, lVar2, circleAnnotationGroupState2, i14, i15);
    }

    @e
    @MapboxMapComposable
    public static final void CircleAnnotationGroup(List<CircleAnnotationOptions> list, AnnotationConfig annotationConfig, l<? super CircleAnnotation, Boolean> lVar, l<? super CircleAnnotationGroupState, Unit> lVar2, m mVar, int i14, int i15) {
        list.getClass();
        lVar2.getClass();
        mVar.L(-1449430369);
        if ((i15 & 2) != 0) {
            annotationConfig = null;
        }
        AnnotationConfig annotationConfig2 = annotationConfig;
        if ((i15 & 4) != 0) {
            lVar = AnonymousClass13.INSTANCE;
        }
        l<? super CircleAnnotation, Boolean> lVar3 = lVar;
        mVar.L(-492369756);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = new CircleAnnotationGroupState();
            mVar.K(objQ);
        }
        mVar.R();
        lVar2.invoke(objQ);
        CircleAnnotationGroup(list, annotationConfig2, lVar3, (CircleAnnotationGroupState) objQ, mVar, (i14 & 896) | 72, 0);
        mVar.R();
    }

    @MapboxMapComposable
    public static final void CircleAnnotationGroup(List<CircleAnnotationOptions> list, AnnotationConfig annotationConfig, l<? super CircleAnnotationGroupState, Unit> lVar, m mVar, int i14, int i15) {
        list.getClass();
        lVar.getClass();
        mVar.L(-421064110);
        if ((i15 & 2) != 0) {
            annotationConfig = null;
        }
        AnnotationConfig annotationConfig2 = annotationConfig;
        mVar.L(-492369756);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = new CircleAnnotationGroupState();
            mVar.K(objQ);
        }
        mVar.R();
        lVar.invoke(objQ);
        CircleAnnotationGroup(list, annotationConfig2, (CircleAnnotationGroupState) objQ, mVar, 72, 0);
        mVar.R();
    }
}
