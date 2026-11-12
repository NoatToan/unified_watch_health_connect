package com.mapbox.maps.extension.compose.annotation.generated;

import ch.qos.logback.core.net.SyslogConstants;
import com.mapbox.geojson.Point;
import com.mapbox.maps.extension.compose.MapboxMapComposable;
import com.mapbox.maps.extension.compose.annotation.internal.generated.PolygonAnnotationNode;
import com.mapbox.maps.extension.compose.internal.MapApplier;
import com.mapbox.maps.plugin.annotation.AnnotationsUtils;
import com.mapbox.maps.plugin.annotation.generated.PolygonAnnotation;
import com.mapbox.maps.plugin.annotation.generated.PolygonAnnotationManager;
import com.mapbox.maps.plugin.annotation.generated.PolygonAnnotationManagerKt;
import com.mapbox.maps.plugin.annotation.generated.PolygonAnnotationOptions;
import e23.a;
import e23.l;
import e23.p;
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
@Metadata(d1 = {"\u0000&\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001aC\u0010\n\u001a\u00020\t2\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\n\u001a\u00020\t2\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\f\u001aS\u0010\n\u001a\u00020\t2\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00002\u0014\b\n\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0004\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000e\u001a=\u0010\n\u001a\u00020\t2\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00002\u0014\b\u0004\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"", "Lcom/mapbox/geojson/Point;", "points", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/annotation/generated/PolygonAnnotation;", "", "onClick", "Lcom/mapbox/maps/extension/compose/annotation/generated/PolygonAnnotationState;", "polygonAnnotationState", "", PolygonAnnotation.ID_KEY, "(Ljava/util/List;Le23/l;Lcom/mapbox/maps/extension/compose/annotation/generated/PolygonAnnotationState;Lp3/m;II)V", "(Ljava/util/List;Lcom/mapbox/maps/extension/compose/annotation/generated/PolygonAnnotationState;Lp3/m;II)V", "init", "(Ljava/util/List;Le23/l;Le23/l;Lp3/m;II)V", "(Ljava/util/List;Le23/l;Lp3/m;I)V", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class PolygonAnnotationKt {

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationKt$PolygonAnnotation$6, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass6 extends w implements a<PolygonAnnotationNode> {
        final /* synthetic */ p1<PolygonAnnotationManager> $annotationManager$delegate;
        final /* synthetic */ p1<PolygonAnnotationNode> $annotationNode$delegate;
        final /* synthetic */ b0 $coroutineScope;
        final /* synthetic */ MapApplier $mapApplier;
        final /* synthetic */ List<List<Point>> $points;
        final /* synthetic */ PolygonAnnotationState $polygonAnnotationState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(MapApplier mapApplier, List<? extends List<Point>> list, PolygonAnnotationState polygonAnnotationState, b0 b0Var, p1<PolygonAnnotationManager> p1Var, p1<PolygonAnnotationNode> p1Var2) {
            super(0);
            this.$mapApplier = mapApplier;
            this.$points = list;
            this.$polygonAnnotationState = polygonAnnotationState;
            this.$coroutineScope = b0Var;
            this.$annotationManager$delegate = p1Var;
            this.$annotationNode$delegate = p1Var2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // e23.a
        public final PolygonAnnotationNode invoke() {
            PolygonAnnotationManager polygonAnnotationManagerCreatePolygonAnnotationManager$default = PolygonAnnotationManagerKt.createPolygonAnnotationManager$default(AnnotationsUtils.getAnnotations(this.$mapApplier.getMapView()), null, 1, null);
            PolygonAnnotationKt.PolygonAnnotation$lambda$8(this.$annotationManager$delegate, polygonAnnotationManagerCreatePolygonAnnotationManager$default);
            PolygonAnnotationNode polygonAnnotationNode = new PolygonAnnotationNode(this.$mapApplier.getMapView().getMapboxMapDeprecated(), polygonAnnotationManagerCreatePolygonAnnotationManager$default, polygonAnnotationManagerCreatePolygonAnnotationManager$default.create(new PolygonAnnotationOptions().withPoints(this.$points).withDraggable(this.$polygonAnnotationState.getInteractionsState().isDraggable())), this.$coroutineScope);
            PolygonAnnotationKt.PolygonAnnotation$lambda$5(this.$annotationNode$delegate, polygonAnnotationNode);
            return polygonAnnotationNode;
        }
    }

    @MapboxMapComposable
    public static final void PolygonAnnotation(List<? extends List<Point>> list, PolygonAnnotationState polygonAnnotationState, m mVar, int i14, int i15) {
        PolygonAnnotationState polygonAnnotationState2;
        list.getClass();
        o0 o0VarE = mVar.E(1348237916);
        c<?> cVar = o0VarE.f135177b;
        int i16 = i15 & 2;
        m.a aVar = m.f135153a;
        if (i16 != 0) {
            Object objK = fb1.c.k(o0VarE, -492369756, aVar);
            if (objK == m.a.f135155b) {
                objK = new PolygonAnnotationState();
                o0VarE.K(objK);
            }
            o0VarE.g0(false);
            polygonAnnotationState2 = (PolygonAnnotationState) objK;
        } else {
            polygonAnnotationState2 = polygonAnnotationState;
        }
        x1 x1Var = n.f135158a;
        MapApplier mapApplier = cVar instanceof MapApplier ? (MapApplier) cVar : null;
        if (mapApplier == null) {
            h.z("Illegal use of PolygonAnnotation inside unsupported composable function");
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
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(mapApplier, list, polygonAnnotationState2, b0Var, p1Var2, p1Var);
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
        b4.d(PolygonAnnotationKt$PolygonAnnotation$7$1.INSTANCE, list, o0VarE);
        o0VarE.N(2274391, polygonAnnotationState2);
        PolygonAnnotationNode polygonAnnotationNodePolygonAnnotation$lambda$4 = PolygonAnnotation$lambda$4(p1Var);
        if (polygonAnnotationNodePolygonAnnotation$lambda$4 != null) {
            polygonAnnotationState2.UpdateProperties$extension_compose_release(polygonAnnotationNodePolygonAnnotation$lambda$4, o0VarE, (i14 & 112) | 8);
        }
        o0VarE.g0(false);
        o0VarE.g0(true);
        o0VarE.g0(false);
        o0VarE.N(-1830264264, o0VarE.G(o0VarE.G(polygonAnnotationState2.getInteractionsState(), PolygonAnnotation$lambda$7(p1Var2)), PolygonAnnotation$lambda$4(p1Var)));
        if (PolygonAnnotation$lambda$7(p1Var2) != null && PolygonAnnotation$lambda$4(p1Var) != null) {
            PolygonAnnotationNode polygonAnnotationNodePolygonAnnotation$lambda$5 = PolygonAnnotation$lambda$4(p1Var);
            PolygonAnnotation annotation = polygonAnnotationNodePolygonAnnotation$lambda$5 != null ? polygonAnnotationNodePolygonAnnotation$lambda$5.getAnnotation() : null;
            if (annotation != null) {
                annotation.setDraggable(polygonAnnotationState2.getInteractionsState().isDraggable());
            }
            PolygonAnnotationManager polygonAnnotationManagerPolygonAnnotation$lambda$7 = PolygonAnnotation$lambda$7(p1Var2);
            if (polygonAnnotationManagerPolygonAnnotation$lambda$7 != null) {
                polygonAnnotationState2.getInteractionsState().BindTo$extension_compose_release(polygonAnnotationManagerPolygonAnnotation$lambda$7, o0VarE, 8);
            }
        }
        o0VarE.g0(false);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass10(list, polygonAnnotationState2, i14, i15);
    }

    private static final PolygonAnnotationNode PolygonAnnotation$lambda$4(p1<PolygonAnnotationNode> p1Var) {
        return p1Var.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PolygonAnnotation$lambda$5(p1<PolygonAnnotationNode> p1Var, PolygonAnnotationNode polygonAnnotationNode) {
        p1Var.setValue(polygonAnnotationNode);
    }

    private static final PolygonAnnotationManager PolygonAnnotation$lambda$7(p1<PolygonAnnotationManager> p1Var) {
        return p1Var.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PolygonAnnotation$lambda$8(p1<PolygonAnnotationManager> p1Var, PolygonAnnotationManager polygonAnnotationManager) {
        p1Var.setValue(polygonAnnotationManager);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationKt$PolygonAnnotation$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<PolygonAnnotation, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public final Boolean invoke(PolygonAnnotation polygonAnnotation) {
            polygonAnnotation.getClass();
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationKt$PolygonAnnotation$11, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass11 extends w implements l<PolygonAnnotation, Boolean> {
        public static final AnonymousClass11 INSTANCE = new AnonymousClass11();

        public AnonymousClass11() {
            super(1);
        }

        @Override // e23.l
        public final Boolean invoke(PolygonAnnotation polygonAnnotation) {
            polygonAnnotation.getClass();
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationKt$PolygonAnnotation$10, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass10 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ List<List<Point>> $points;
        final /* synthetic */ PolygonAnnotationState $polygonAnnotationState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(List<? extends List<Point>> list, PolygonAnnotationState polygonAnnotationState, int i14, int i15) {
            super(2);
            this.$points = list;
            this.$polygonAnnotationState = polygonAnnotationState;
            this.$$changed = i14;
            this.$$default = i15;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationKt.PolygonAnnotation(this.$points, this.$polygonAnnotationState, mVar, this.$$changed | 1, this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationKt$PolygonAnnotation$4, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass4 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ l<PolygonAnnotation, Boolean> $onClick;
        final /* synthetic */ List<List<Point>> $points;
        final /* synthetic */ PolygonAnnotationState $polygonAnnotationState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(List<? extends List<Point>> list, l<? super PolygonAnnotation, Boolean> lVar, PolygonAnnotationState polygonAnnotationState, int i14, int i15) {
            super(2);
            this.$points = list;
            this.$onClick = lVar;
            this.$polygonAnnotationState = polygonAnnotationState;
            this.$$changed = i14;
            this.$$default = i15;
        }

        public final void invoke(m mVar, int i14) {
            PolygonAnnotationKt.PolygonAnnotation(this.$points, this.$onClick, this.$polygonAnnotationState, mVar, this.$$changed | 1, this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @e
    @MapboxMapComposable
    public static final void PolygonAnnotation(List<? extends List<Point>> list, l<? super PolygonAnnotation, Boolean> lVar, PolygonAnnotationState polygonAnnotationState, m mVar, int i14, int i15) {
        list.getClass();
        o0 o0VarE = mVar.E(-177689809);
        if ((i15 & 2) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        l<? super PolygonAnnotation, Boolean> lVar2 = lVar;
        if ((i15 & 4) != 0) {
            o0VarE.L(-492369756);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new PolygonAnnotationState();
                o0VarE.K(objQ);
            }
            o0VarE.g0(false);
            polygonAnnotationState = (PolygonAnnotationState) objQ;
        }
        PolygonAnnotationState polygonAnnotationState2 = polygonAnnotationState;
        x1 x1Var = n.f135158a;
        polygonAnnotationState2.getInteractionsState().onClicked(lVar2);
        PolygonAnnotation(list, polygonAnnotationState2, o0VarE, 8, 0);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass4(list, lVar2, polygonAnnotationState2, i14, i15);
    }

    @e
    @MapboxMapComposable
    public static final void PolygonAnnotation(List<? extends List<Point>> list, l<? super PolygonAnnotation, Boolean> lVar, l<? super PolygonAnnotationState, Unit> lVar2, m mVar, int i14, int i15) {
        list.getClass();
        lVar2.getClass();
        mVar.L(-221559528);
        if ((i15 & 2) != 0) {
            lVar = AnonymousClass11.INSTANCE;
        }
        l<? super PolygonAnnotation, Boolean> lVar3 = lVar;
        mVar.L(-492369756);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = new PolygonAnnotationState();
            mVar.K(objQ);
        }
        mVar.R();
        lVar2.invoke(objQ);
        PolygonAnnotation(list, lVar3, (PolygonAnnotationState) objQ, mVar, (i14 & 112) | 8, 0);
        mVar.R();
    }

    @MapboxMapComposable
    public static final void PolygonAnnotation(List<? extends List<Point>> list, l<? super PolygonAnnotationState, Unit> lVar, m mVar, int i14) {
        list.getClass();
        lVar.getClass();
        mVar.L(-841658165);
        mVar.L(-492369756);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = new PolygonAnnotationState();
            mVar.K(objQ);
        }
        mVar.R();
        lVar.invoke(objQ);
        PolygonAnnotation(list, (PolygonAnnotationState) objQ, mVar, 8, 0);
        mVar.R();
    }
}
