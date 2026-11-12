package com.mapbox.maps.extension.compose.annotation.generated;

import ch.qos.logback.core.net.SyslogConstants;
import com.mapbox.geojson.Point;
import com.mapbox.maps.extension.compose.MapboxMapComposable;
import com.mapbox.maps.extension.compose.annotation.internal.generated.CircleAnnotationNode;
import com.mapbox.maps.extension.compose.internal.MapApplier;
import com.mapbox.maps.plugin.annotation.AnnotationsUtils;
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotation;
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotationManager;
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotationManagerKt;
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotationOptions;
import e23.a;
import e23.l;
import e23.p;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u000b\u001aG\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\n\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\r\u001a1\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Lcom/mapbox/geojson/Point;", "point", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/annotation/generated/CircleAnnotation;", "", "onClick", "Lcom/mapbox/maps/extension/compose/annotation/generated/CircleAnnotationState;", "circleAnnotationState", "", CircleAnnotation.ID_KEY, "(Lcom/mapbox/geojson/Point;Le23/l;Lcom/mapbox/maps/extension/compose/annotation/generated/CircleAnnotationState;Lp3/m;II)V", "(Lcom/mapbox/geojson/Point;Lcom/mapbox/maps/extension/compose/annotation/generated/CircleAnnotationState;Lp3/m;II)V", "init", "(Lcom/mapbox/geojson/Point;Le23/l;Le23/l;Lp3/m;II)V", "(Lcom/mapbox/geojson/Point;Le23/l;Lp3/m;I)V", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class CircleAnnotationKt {

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationKt$CircleAnnotation$6, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass6 extends w implements a<CircleAnnotationNode> {
        final /* synthetic */ p1<CircleAnnotationManager> $annotationManager$delegate;
        final /* synthetic */ p1<CircleAnnotationNode> $annotationNode$delegate;
        final /* synthetic */ CircleAnnotationState $circleAnnotationState;
        final /* synthetic */ b0 $coroutineScope;
        final /* synthetic */ MapApplier $mapApplier;
        final /* synthetic */ Point $point;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(MapApplier mapApplier, Point point, CircleAnnotationState circleAnnotationState, b0 b0Var, p1<CircleAnnotationManager> p1Var, p1<CircleAnnotationNode> p1Var2) {
            super(0);
            this.$mapApplier = mapApplier;
            this.$point = point;
            this.$circleAnnotationState = circleAnnotationState;
            this.$coroutineScope = b0Var;
            this.$annotationManager$delegate = p1Var;
            this.$annotationNode$delegate = p1Var2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // e23.a
        public final CircleAnnotationNode invoke() {
            CircleAnnotationManager circleAnnotationManagerCreateCircleAnnotationManager$default = CircleAnnotationManagerKt.createCircleAnnotationManager$default(AnnotationsUtils.getAnnotations(this.$mapApplier.getMapView()), null, 1, null);
            CircleAnnotationKt.CircleAnnotation$lambda$8(this.$annotationManager$delegate, circleAnnotationManagerCreateCircleAnnotationManager$default);
            CircleAnnotationNode circleAnnotationNode = new CircleAnnotationNode(this.$mapApplier.getMapView().getMapboxMapDeprecated(), circleAnnotationManagerCreateCircleAnnotationManager$default, circleAnnotationManagerCreateCircleAnnotationManager$default.create(new CircleAnnotationOptions().withPoint(this.$point).withDraggable(this.$circleAnnotationState.getInteractionsState().isDraggable())), this.$coroutineScope);
            CircleAnnotationKt.CircleAnnotation$lambda$5(this.$annotationNode$delegate, circleAnnotationNode);
            return circleAnnotationNode;
        }
    }

    @MapboxMapComposable
    public static final void CircleAnnotation(Point point, CircleAnnotationState circleAnnotationState, m mVar, int i14, int i15) {
        CircleAnnotationState circleAnnotationState2;
        point.getClass();
        o0 o0VarE = mVar.E(-1325377288);
        c<?> cVar = o0VarE.f135177b;
        int i16 = i15 & 2;
        m.a aVar = m.f135153a;
        if (i16 != 0) {
            Object objK = fb1.c.k(o0VarE, -492369756, aVar);
            if (objK == m.a.f135155b) {
                objK = new CircleAnnotationState();
                o0VarE.K(objK);
            }
            o0VarE.g0(false);
            circleAnnotationState2 = (CircleAnnotationState) objK;
        } else {
            circleAnnotationState2 = circleAnnotationState;
        }
        x1 x1Var = n.f135158a;
        MapApplier mapApplier = cVar instanceof MapApplier ? (MapApplier) cVar : null;
        if (mapApplier == null) {
            h.z("Illegal use of CircleAnnotation inside unsupported composable function");
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
        o0VarE.L(773894976);
        o0VarE.L(-492369756);
        Object objQ2 = o0VarE.q();
        if (objQ2 == obj) {
            objQ2 = com.garmin.proto.generated.a.d(l0.j(t13.h.f161748a, o0VarE), o0VarE);
        }
        o0VarE.g0(false);
        b0 b0Var = ((z) objQ2).f135391a;
        o0VarE.g0(false);
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(mapApplier, point, circleAnnotationState2, b0Var, p1Var2, p1Var);
        o0VarE.L(-548224868);
        if (!(cVar instanceof MapApplier)) {
            p0.l();
            throw null;
        }
        o0VarE.H();
        if (o0VarE.T) {
            o0VarE.M(anonymousClass6);
        } else {
            o0VarE.c();
        }
        b4.d(CircleAnnotationKt$CircleAnnotation$7$1.INSTANCE, point, o0VarE);
        o0VarE.N(44966503, circleAnnotationState2);
        CircleAnnotationNode circleAnnotationNodeCircleAnnotation$lambda$4 = CircleAnnotation$lambda$4(p1Var);
        if (circleAnnotationNodeCircleAnnotation$lambda$4 != null) {
            circleAnnotationState2.UpdateProperties$extension_compose_release(circleAnnotationNodeCircleAnnotation$lambda$4, o0VarE, (i14 & 112) | 8);
        }
        o0VarE.g0(false);
        o0VarE.g0(true);
        o0VarE.g0(false);
        o0VarE.N(-555985594, o0VarE.G(o0VarE.G(circleAnnotationState2.getInteractionsState(), CircleAnnotation$lambda$7(p1Var2)), CircleAnnotation$lambda$4(p1Var)));
        if (CircleAnnotation$lambda$7(p1Var2) != null && CircleAnnotation$lambda$4(p1Var) != null) {
            CircleAnnotationNode circleAnnotationNodeCircleAnnotation$lambda$5 = CircleAnnotation$lambda$4(p1Var);
            CircleAnnotation annotation = circleAnnotationNodeCircleAnnotation$lambda$5 != null ? circleAnnotationNodeCircleAnnotation$lambda$5.getAnnotation() : null;
            if (annotation != null) {
                annotation.setDraggable(circleAnnotationState2.getInteractionsState().isDraggable());
            }
            CircleAnnotationManager circleAnnotationManagerCircleAnnotation$lambda$7 = CircleAnnotation$lambda$7(p1Var2);
            if (circleAnnotationManagerCircleAnnotation$lambda$7 != null) {
                circleAnnotationState2.getInteractionsState().BindTo$extension_compose_release(circleAnnotationManagerCircleAnnotation$lambda$7, o0VarE, 8);
            }
        }
        o0VarE.g0(false);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass10(point, circleAnnotationState2, i14, i15);
    }

    private static final CircleAnnotationNode CircleAnnotation$lambda$4(p1<CircleAnnotationNode> p1Var) {
        return p1Var.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CircleAnnotation$lambda$5(p1<CircleAnnotationNode> p1Var, CircleAnnotationNode circleAnnotationNode) {
        p1Var.setValue(circleAnnotationNode);
    }

    private static final CircleAnnotationManager CircleAnnotation$lambda$7(p1<CircleAnnotationManager> p1Var) {
        return p1Var.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CircleAnnotation$lambda$8(p1<CircleAnnotationManager> p1Var, CircleAnnotationManager circleAnnotationManager) {
        p1Var.setValue(circleAnnotationManager);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationKt$CircleAnnotation$1, reason: invalid class name */
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

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationKt$CircleAnnotation$11, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass11 extends w implements l<CircleAnnotation, Boolean> {
        public static final AnonymousClass11 INSTANCE = new AnonymousClass11();

        public AnonymousClass11() {
            super(1);
        }

        @Override // e23.l
        public final Boolean invoke(CircleAnnotation circleAnnotation) {
            circleAnnotation.getClass();
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationKt$CircleAnnotation$10, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass10 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CircleAnnotationState $circleAnnotationState;
        final /* synthetic */ Point $point;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(Point point, CircleAnnotationState circleAnnotationState, int i14, int i15) {
            super(2);
            this.$point = point;
            this.$circleAnnotationState = circleAnnotationState;
            this.$$changed = i14;
            this.$$default = i15;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationKt.CircleAnnotation(this.$point, this.$circleAnnotationState, mVar, this.$$changed | 1, this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationKt$CircleAnnotation$4, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass4 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CircleAnnotationState $circleAnnotationState;
        final /* synthetic */ l<CircleAnnotation, Boolean> $onClick;
        final /* synthetic */ Point $point;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Point point, l<? super CircleAnnotation, Boolean> lVar, CircleAnnotationState circleAnnotationState, int i14, int i15) {
            super(2);
            this.$point = point;
            this.$onClick = lVar;
            this.$circleAnnotationState = circleAnnotationState;
            this.$$changed = i14;
            this.$$default = i15;
        }

        public final void invoke(m mVar, int i14) {
            CircleAnnotationKt.CircleAnnotation(this.$point, this.$onClick, this.$circleAnnotationState, mVar, this.$$changed | 1, this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @e
    @MapboxMapComposable
    public static final void CircleAnnotation(Point point, l<? super CircleAnnotation, Boolean> lVar, CircleAnnotationState circleAnnotationState, m mVar, int i14, int i15) {
        point.getClass();
        o0 o0VarE = mVar.E(408190731);
        if ((i15 & 2) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        l<? super CircleAnnotation, Boolean> lVar2 = lVar;
        if ((i15 & 4) != 0) {
            o0VarE.L(-492369756);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new CircleAnnotationState();
                o0VarE.K(objQ);
            }
            o0VarE.g0(false);
            circleAnnotationState = (CircleAnnotationState) objQ;
        }
        CircleAnnotationState circleAnnotationState2 = circleAnnotationState;
        x1 x1Var = n.f135158a;
        circleAnnotationState2.getInteractionsState().onClicked(lVar2);
        CircleAnnotation(point, circleAnnotationState2, o0VarE, 8, 0);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass4(point, lVar2, circleAnnotationState2, i14, i15);
    }

    @e
    @MapboxMapComposable
    public static final void CircleAnnotation(Point point, l<? super CircleAnnotation, Boolean> lVar, l<? super CircleAnnotationState, Unit> lVar2, m mVar, int i14, int i15) {
        point.getClass();
        lVar2.getClass();
        mVar.L(-1512511420);
        if ((i15 & 2) != 0) {
            lVar = AnonymousClass11.INSTANCE;
        }
        l<? super CircleAnnotation, Boolean> lVar3 = lVar;
        mVar.L(-492369756);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = new CircleAnnotationState();
            mVar.K(objQ);
        }
        mVar.R();
        lVar2.invoke(objQ);
        CircleAnnotation(point, lVar3, (CircleAnnotationState) objQ, mVar, (i14 & 112) | 8, 0);
        mVar.R();
    }

    @MapboxMapComposable
    public static final void CircleAnnotation(Point point, l<? super CircleAnnotationState, Unit> lVar, m mVar, int i14) {
        point.getClass();
        lVar.getClass();
        mVar.L(192052657);
        mVar.L(-492369756);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = new CircleAnnotationState();
            mVar.K(objQ);
        }
        mVar.R();
        lVar.invoke(objQ);
        CircleAnnotation(point, (CircleAnnotationState) objQ, mVar, 8, 0);
        mVar.R();
    }
}
