package com.mapbox.maps.extension.compose.annotation.generated;

import ch.qos.logback.core.net.SyslogConstants;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.extension.compose.MapboxMapComposable;
import com.mapbox.maps.extension.compose.annotation.internal.generated.PointAnnotationManagerNode;
import com.mapbox.maps.extension.compose.internal.MapApplier;
import com.mapbox.maps.plugin.annotation.AnnotationConfig;
import com.mapbox.maps.plugin.annotation.AnnotationsUtils;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotation;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationManager;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationManagerKt;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationOptions;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001aI\u0010\f\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\f\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000e\u001aY\u0010\f\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\n\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0014\b\u0004\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0010\u001aC\u0010\f\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0004\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"", "Lcom/mapbox/maps/plugin/annotation/generated/PointAnnotationOptions;", "annotations", "Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;", "annotationConfig", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/annotation/generated/PointAnnotation;", "", "onClick", "Lcom/mapbox/maps/extension/compose/annotation/generated/PointAnnotationGroupState;", "pointAnnotationGroupState", "", "PointAnnotationGroup", "(Ljava/util/List;Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;Le23/l;Lcom/mapbox/maps/extension/compose/annotation/generated/PointAnnotationGroupState;Lp3/m;II)V", "(Ljava/util/List;Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;Lcom/mapbox/maps/extension/compose/annotation/generated/PointAnnotationGroupState;Lp3/m;II)V", "init", "(Ljava/util/List;Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;Le23/l;Le23/l;Lp3/m;II)V", "(Ljava/util/List;Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;Le23/l;Lp3/m;II)V", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class PointAnnotationGroupKt {

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupKt$PointAnnotationGroup$7, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass7 extends w implements a<PointAnnotationManagerNode> {
        final /* synthetic */ AnnotationConfig $annotationConfig;
        final /* synthetic */ p1<PointAnnotationManager> $annotationManager$delegate;
        final /* synthetic */ p1<PointAnnotationManagerNode> $annotationManagerNode$delegate;
        final /* synthetic */ b0 $coroutineScope;
        final /* synthetic */ MapApplier $mapApplier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(MapApplier mapApplier, AnnotationConfig annotationConfig, b0 b0Var, p1<PointAnnotationManager> p1Var, p1<PointAnnotationManagerNode> p1Var2) {
            super(0);
            this.$mapApplier = mapApplier;
            this.$annotationConfig = annotationConfig;
            this.$coroutineScope = b0Var;
            this.$annotationManager$delegate = p1Var;
            this.$annotationManagerNode$delegate = p1Var2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // e23.a
        public final PointAnnotationManagerNode invoke() {
            MapboxMap mapboxMapDeprecated = this.$mapApplier.getMapView().getMapboxMapDeprecated();
            PointAnnotationManager pointAnnotationManagerCreatePointAnnotationManager = PointAnnotationManagerKt.createPointAnnotationManager(AnnotationsUtils.getAnnotations(this.$mapApplier.getMapView()), this.$annotationConfig);
            PointAnnotationGroupKt.PointAnnotationGroup$lambda$5(this.$annotationManager$delegate, pointAnnotationManagerCreatePointAnnotationManager);
            PointAnnotationManagerNode pointAnnotationManagerNode = new PointAnnotationManagerNode(mapboxMapDeprecated, pointAnnotationManagerCreatePointAnnotationManager, this.$coroutineScope);
            PointAnnotationGroupKt.PointAnnotationGroup$lambda$8(this.$annotationManagerNode$delegate, pointAnnotationManagerNode);
            return pointAnnotationManagerNode;
        }
    }

    @MapboxMapComposable
    public static final void PointAnnotationGroup(List<PointAnnotationOptions> list, AnnotationConfig annotationConfig, PointAnnotationGroupState pointAnnotationGroupState, m mVar, int i14, int i15) {
        list.getClass();
        o0 o0VarE = mVar.E(246307176);
        c<?> cVar = o0VarE.f135177b;
        AnnotationConfig annotationConfig2 = (i15 & 2) != 0 ? null : annotationConfig;
        int i16 = i15 & 4;
        m.a aVar = m.f135153a;
        PointAnnotationGroupState pointAnnotationGroupState2 = pointAnnotationGroupState;
        if (i16 != 0) {
            Object objK = fb1.c.k(o0VarE, -492369756, aVar);
            if (objK == m.a.f135155b) {
                objK = new PointAnnotationGroupState();
                o0VarE.K(objK);
            }
            o0VarE.g0(false);
            pointAnnotationGroupState2 = (PointAnnotationGroupState) objK;
        }
        x1 x1Var = n.f135158a;
        MapApplier mapApplier = cVar instanceof MapApplier ? (MapApplier) cVar : null;
        if (mapApplier == null) {
            h.z("Illegal use of PointAnnotationCluster inside unsupported composable function");
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
        if (pointAnnotationGroupState2.getInteractionsState().isDraggable()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((PointAnnotationOptions) it.next()).withDraggable(true);
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
        b4.c(PointAnnotationGroupKt$PointAnnotationGroup$8$1.INSTANCE, list, o0VarE);
        o0VarE.N(1160515122, pointAnnotationGroupState2);
        PointAnnotationManager pointAnnotationManagerPointAnnotationGroup$lambda$4 = PointAnnotationGroup$lambda$4(p1Var);
        if (pointAnnotationManagerPointAnnotationGroup$lambda$4 != null) {
            pointAnnotationGroupState2.UpdateProperties$extension_compose_release(pointAnnotationManagerPointAnnotationGroup$lambda$4, o0VarE, ((i14 >> 3) & 112) | 8);
        }
        o0VarE.g0(false);
        o0VarE.g0(true);
        o0VarE.g0(false);
        o0VarE.N(-1979197540, o0VarE.G(o0VarE.G(pointAnnotationGroupState2.getInteractionsState(), PointAnnotationGroup$lambda$4(p1Var)), PointAnnotationGroup$lambda$7(p1Var2)));
        if (PointAnnotationGroup$lambda$4(p1Var) != null && PointAnnotationGroup$lambda$7(p1Var2) != null) {
            PointAnnotationManager pointAnnotationManagerPointAnnotationGroup$lambda$5 = PointAnnotationGroup$lambda$4(p1Var);
            if (pointAnnotationManagerPointAnnotationGroup$lambda$5 != null) {
                pointAnnotationGroupState2.getInteractionsState().BindTo$extension_compose_release(pointAnnotationManagerPointAnnotationGroup$lambda$5, o0VarE, 8);
            }
            PointAnnotationManagerNode pointAnnotationManagerNodePointAnnotationGroup$lambda$7 = PointAnnotationGroup$lambda$7(p1Var2);
            if (pointAnnotationManagerNodePointAnnotationGroup$lambda$7 != null) {
                Iterator<T> it3 = pointAnnotationManagerNodePointAnnotationGroup$lambda$7.getCurrentAnnotations$extension_compose_release().iterator();
                while (it3.hasNext()) {
                    ((PointAnnotation) it3.next()).setDraggable(pointAnnotationGroupState2.getInteractionsState().isDraggable());
                }
            }
        }
        o0VarE.g0(false);
        x1 x1Var2 = n.f135158a;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass12(list, annotationConfig2, pointAnnotationGroupState2, i14, i15);
    }

    private static final PointAnnotationManager PointAnnotationGroup$lambda$4(p1<PointAnnotationManager> p1Var) {
        return p1Var.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PointAnnotationGroup$lambda$5(p1<PointAnnotationManager> p1Var, PointAnnotationManager pointAnnotationManager) {
        p1Var.setValue(pointAnnotationManager);
    }

    private static final PointAnnotationManagerNode PointAnnotationGroup$lambda$7(p1<PointAnnotationManagerNode> p1Var) {
        return p1Var.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PointAnnotationGroup$lambda$8(p1<PointAnnotationManagerNode> p1Var, PointAnnotationManagerNode pointAnnotationManagerNode) {
        p1Var.setValue(pointAnnotationManagerNode);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupKt$PointAnnotationGroup$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<PointAnnotation, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public final Boolean invoke(PointAnnotation pointAnnotation) {
            pointAnnotation.getClass();
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupKt$PointAnnotationGroup$13, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass13 extends w implements l<PointAnnotation, Boolean> {
        public static final AnonymousClass13 INSTANCE = new AnonymousClass13();

        public AnonymousClass13() {
            super(1);
        }

        @Override // e23.l
        public final Boolean invoke(PointAnnotation pointAnnotation) {
            pointAnnotation.getClass();
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupKt$PointAnnotationGroup$12, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass12 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ AnnotationConfig $annotationConfig;
        final /* synthetic */ List<PointAnnotationOptions> $annotations;
        final /* synthetic */ PointAnnotationGroupState $pointAnnotationGroupState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(List<PointAnnotationOptions> list, AnnotationConfig annotationConfig, PointAnnotationGroupState pointAnnotationGroupState, int i14, int i15) {
            super(2);
            this.$annotations = list;
            this.$annotationConfig = annotationConfig;
            this.$pointAnnotationGroupState = pointAnnotationGroupState;
            this.$$changed = i14;
            this.$$default = i15;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupKt.PointAnnotationGroup(this.$annotations, this.$annotationConfig, this.$pointAnnotationGroupState, mVar, this.$$changed | 1, this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupKt$PointAnnotationGroup$4, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass4 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ AnnotationConfig $annotationConfig;
        final /* synthetic */ List<PointAnnotationOptions> $annotations;
        final /* synthetic */ l<PointAnnotation, Boolean> $onClick;
        final /* synthetic */ PointAnnotationGroupState $pointAnnotationGroupState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(List<PointAnnotationOptions> list, AnnotationConfig annotationConfig, l<? super PointAnnotation, Boolean> lVar, PointAnnotationGroupState pointAnnotationGroupState, int i14, int i15) {
            super(2);
            this.$annotations = list;
            this.$annotationConfig = annotationConfig;
            this.$onClick = lVar;
            this.$pointAnnotationGroupState = pointAnnotationGroupState;
            this.$$changed = i14;
            this.$$default = i15;
        }

        public final void invoke(m mVar, int i14) {
            PointAnnotationGroupKt.PointAnnotationGroup(this.$annotations, this.$annotationConfig, this.$onClick, this.$pointAnnotationGroupState, mVar, this.$$changed | 1, this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @e
    @MapboxMapComposable
    public static final void PointAnnotationGroup(List<PointAnnotationOptions> list, AnnotationConfig annotationConfig, l<? super PointAnnotation, Boolean> lVar, PointAnnotationGroupState pointAnnotationGroupState, m mVar, int i14, int i15) {
        list.getClass();
        o0 o0VarE = mVar.E(-845989765);
        if ((i15 & 2) != 0) {
            annotationConfig = null;
        }
        AnnotationConfig annotationConfig2 = annotationConfig;
        if ((i15 & 4) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        l<? super PointAnnotation, Boolean> lVar2 = lVar;
        if ((i15 & 8) != 0) {
            o0VarE.L(-492369756);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new PointAnnotationGroupState();
                o0VarE.K(objQ);
            }
            o0VarE.g0(false);
            pointAnnotationGroupState = (PointAnnotationGroupState) objQ;
        }
        PointAnnotationGroupState pointAnnotationGroupState2 = pointAnnotationGroupState;
        x1 x1Var = n.f135158a;
        pointAnnotationGroupState2.getInteractionsState().onClicked(lVar2);
        Unit unit = Unit.INSTANCE;
        PointAnnotationGroup(list, annotationConfig2, pointAnnotationGroupState2, o0VarE, 72, 0);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass4(list, annotationConfig2, lVar2, pointAnnotationGroupState2, i14, i15);
    }

    @e
    @MapboxMapComposable
    public static final void PointAnnotationGroup(List<PointAnnotationOptions> list, AnnotationConfig annotationConfig, l<? super PointAnnotation, Boolean> lVar, l<? super PointAnnotationGroupState, Unit> lVar2, m mVar, int i14, int i15) {
        list.getClass();
        lVar2.getClass();
        mVar.L(1733011891);
        if ((i15 & 2) != 0) {
            annotationConfig = null;
        }
        AnnotationConfig annotationConfig2 = annotationConfig;
        if ((i15 & 4) != 0) {
            lVar = AnonymousClass13.INSTANCE;
        }
        l<? super PointAnnotation, Boolean> lVar3 = lVar;
        mVar.L(-492369756);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = new PointAnnotationGroupState();
            mVar.K(objQ);
        }
        mVar.R();
        lVar2.invoke(objQ);
        PointAnnotationGroup(list, annotationConfig2, lVar3, (PointAnnotationGroupState) objQ, mVar, (i14 & 896) | 72, 0);
        mVar.R();
    }

    @MapboxMapComposable
    public static final void PointAnnotationGroup(List<PointAnnotationOptions> list, AnnotationConfig annotationConfig, l<? super PointAnnotationGroupState, Unit> lVar, m mVar, int i14, int i15) {
        list.getClass();
        lVar.getClass();
        mVar.L(-476560224);
        if ((i15 & 2) != 0) {
            annotationConfig = null;
        }
        AnnotationConfig annotationConfig2 = annotationConfig;
        mVar.L(-492369756);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = new PointAnnotationGroupState();
            mVar.K(objQ);
        }
        mVar.R();
        lVar.invoke(objQ);
        PointAnnotationGroup(list, annotationConfig2, (PointAnnotationGroupState) objQ, mVar, 72, 0);
        mVar.R();
    }
}
