package com.mapbox.maps.extension.compose.annotation.generated;

import ch.qos.logback.core.net.SyslogConstants;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.extension.compose.MapboxMapComposable;
import com.mapbox.maps.extension.compose.annotation.internal.generated.PolylineAnnotationManagerNode;
import com.mapbox.maps.extension.compose.internal.MapApplier;
import com.mapbox.maps.plugin.annotation.AnnotationConfig;
import com.mapbox.maps.plugin.annotation.AnnotationsUtils;
import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotation;
import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotationManager;
import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotationManagerKt;
import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotationOptions;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001aI\u0010\f\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\f\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000e\u001aY\u0010\f\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\n\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0014\b\u0004\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0010\u001aC\u0010\f\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0004\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"", "Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotationOptions;", "annotations", "Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;", "annotationConfig", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotation;", "", "onClick", "Lcom/mapbox/maps/extension/compose/annotation/generated/PolylineAnnotationGroupState;", "polylineAnnotationGroupState", "", "PolylineAnnotationGroup", "(Ljava/util/List;Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;Le23/l;Lcom/mapbox/maps/extension/compose/annotation/generated/PolylineAnnotationGroupState;Lp3/m;II)V", "(Ljava/util/List;Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;Lcom/mapbox/maps/extension/compose/annotation/generated/PolylineAnnotationGroupState;Lp3/m;II)V", "init", "(Ljava/util/List;Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;Le23/l;Le23/l;Lp3/m;II)V", "(Ljava/util/List;Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;Le23/l;Lp3/m;II)V", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class PolylineAnnotationGroupKt {

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupKt$PolylineAnnotationGroup$7, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass7 extends w implements a<PolylineAnnotationManagerNode> {
        final /* synthetic */ AnnotationConfig $annotationConfig;
        final /* synthetic */ p1<PolylineAnnotationManager> $annotationManager$delegate;
        final /* synthetic */ p1<PolylineAnnotationManagerNode> $annotationManagerNode$delegate;
        final /* synthetic */ b0 $coroutineScope;
        final /* synthetic */ MapApplier $mapApplier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(MapApplier mapApplier, AnnotationConfig annotationConfig, b0 b0Var, p1<PolylineAnnotationManager> p1Var, p1<PolylineAnnotationManagerNode> p1Var2) {
            super(0);
            this.$mapApplier = mapApplier;
            this.$annotationConfig = annotationConfig;
            this.$coroutineScope = b0Var;
            this.$annotationManager$delegate = p1Var;
            this.$annotationManagerNode$delegate = p1Var2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // e23.a
        public final PolylineAnnotationManagerNode invoke() {
            MapboxMap mapboxMapDeprecated = this.$mapApplier.getMapView().getMapboxMapDeprecated();
            PolylineAnnotationManager polylineAnnotationManagerCreatePolylineAnnotationManager = PolylineAnnotationManagerKt.createPolylineAnnotationManager(AnnotationsUtils.getAnnotations(this.$mapApplier.getMapView()), this.$annotationConfig);
            PolylineAnnotationGroupKt.PolylineAnnotationGroup$lambda$5(this.$annotationManager$delegate, polylineAnnotationManagerCreatePolylineAnnotationManager);
            PolylineAnnotationManagerNode polylineAnnotationManagerNode = new PolylineAnnotationManagerNode(mapboxMapDeprecated, polylineAnnotationManagerCreatePolylineAnnotationManager, this.$coroutineScope);
            PolylineAnnotationGroupKt.PolylineAnnotationGroup$lambda$8(this.$annotationManagerNode$delegate, polylineAnnotationManagerNode);
            return polylineAnnotationManagerNode;
        }
    }

    @MapboxMapComposable
    public static final void PolylineAnnotationGroup(List<PolylineAnnotationOptions> list, AnnotationConfig annotationConfig, PolylineAnnotationGroupState polylineAnnotationGroupState, m mVar, int i14, int i15) {
        list.getClass();
        o0 o0VarE = mVar.E(1989643264);
        c<?> cVar = o0VarE.f135177b;
        AnnotationConfig annotationConfig2 = (i15 & 2) != 0 ? null : annotationConfig;
        int i16 = i15 & 4;
        m.a aVar = m.f135153a;
        PolylineAnnotationGroupState polylineAnnotationGroupState2 = polylineAnnotationGroupState;
        if (i16 != 0) {
            Object objK = fb1.c.k(o0VarE, -492369756, aVar);
            if (objK == m.a.f135155b) {
                objK = new PolylineAnnotationGroupState();
                o0VarE.K(objK);
            }
            o0VarE.g0(false);
            polylineAnnotationGroupState2 = (PolylineAnnotationGroupState) objK;
        }
        x1 x1Var = n.f135158a;
        MapApplier mapApplier = cVar instanceof MapApplier ? (MapApplier) cVar : null;
        if (mapApplier == null) {
            h.z("Illegal use of PolylineAnnotationCluster inside unsupported composable function");
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
        if (polylineAnnotationGroupState2.getInteractionsState().isDraggable()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((PolylineAnnotationOptions) it.next()).withDraggable(true);
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
        b4.c(PolylineAnnotationGroupKt$PolylineAnnotationGroup$8$1.INSTANCE, list, o0VarE);
        o0VarE.N(1769999057, polylineAnnotationGroupState2);
        PolylineAnnotationManager polylineAnnotationManagerPolylineAnnotationGroup$lambda$4 = PolylineAnnotationGroup$lambda$4(p1Var);
        if (polylineAnnotationManagerPolylineAnnotationGroup$lambda$4 != null) {
            polylineAnnotationGroupState2.UpdateProperties$extension_compose_release(polylineAnnotationManagerPolylineAnnotationGroup$lambda$4, o0VarE, ((i14 >> 3) & 112) | 8);
        }
        o0VarE.g0(false);
        o0VarE.g0(true);
        o0VarE.g0(false);
        o0VarE.N(-137591231, o0VarE.G(o0VarE.G(polylineAnnotationGroupState2.getInteractionsState(), PolylineAnnotationGroup$lambda$4(p1Var)), PolylineAnnotationGroup$lambda$7(p1Var2)));
        if (PolylineAnnotationGroup$lambda$4(p1Var) != null && PolylineAnnotationGroup$lambda$7(p1Var2) != null) {
            PolylineAnnotationManager polylineAnnotationManagerPolylineAnnotationGroup$lambda$5 = PolylineAnnotationGroup$lambda$4(p1Var);
            if (polylineAnnotationManagerPolylineAnnotationGroup$lambda$5 != null) {
                polylineAnnotationGroupState2.getInteractionsState().BindTo$extension_compose_release(polylineAnnotationManagerPolylineAnnotationGroup$lambda$5, o0VarE, 8);
            }
            PolylineAnnotationManagerNode polylineAnnotationManagerNodePolylineAnnotationGroup$lambda$7 = PolylineAnnotationGroup$lambda$7(p1Var2);
            if (polylineAnnotationManagerNodePolylineAnnotationGroup$lambda$7 != null) {
                Iterator<T> it3 = polylineAnnotationManagerNodePolylineAnnotationGroup$lambda$7.getCurrentAnnotations$extension_compose_release().iterator();
                while (it3.hasNext()) {
                    ((PolylineAnnotation) it3.next()).setDraggable(polylineAnnotationGroupState2.getInteractionsState().isDraggable());
                }
            }
        }
        o0VarE.g0(false);
        x1 x1Var2 = n.f135158a;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass12(list, annotationConfig2, polylineAnnotationGroupState2, i14, i15);
    }

    private static final PolylineAnnotationManager PolylineAnnotationGroup$lambda$4(p1<PolylineAnnotationManager> p1Var) {
        return p1Var.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PolylineAnnotationGroup$lambda$5(p1<PolylineAnnotationManager> p1Var, PolylineAnnotationManager polylineAnnotationManager) {
        p1Var.setValue(polylineAnnotationManager);
    }

    private static final PolylineAnnotationManagerNode PolylineAnnotationGroup$lambda$7(p1<PolylineAnnotationManagerNode> p1Var) {
        return p1Var.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PolylineAnnotationGroup$lambda$8(p1<PolylineAnnotationManagerNode> p1Var, PolylineAnnotationManagerNode polylineAnnotationManagerNode) {
        p1Var.setValue(polylineAnnotationManagerNode);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupKt$PolylineAnnotationGroup$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<PolylineAnnotation, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public final Boolean invoke(PolylineAnnotation polylineAnnotation) {
            polylineAnnotation.getClass();
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupKt$PolylineAnnotationGroup$13, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass13 extends w implements l<PolylineAnnotation, Boolean> {
        public static final AnonymousClass13 INSTANCE = new AnonymousClass13();

        public AnonymousClass13() {
            super(1);
        }

        @Override // e23.l
        public final Boolean invoke(PolylineAnnotation polylineAnnotation) {
            polylineAnnotation.getClass();
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupKt$PolylineAnnotationGroup$12, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass12 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ AnnotationConfig $annotationConfig;
        final /* synthetic */ List<PolylineAnnotationOptions> $annotations;
        final /* synthetic */ PolylineAnnotationGroupState $polylineAnnotationGroupState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(List<PolylineAnnotationOptions> list, AnnotationConfig annotationConfig, PolylineAnnotationGroupState polylineAnnotationGroupState, int i14, int i15) {
            super(2);
            this.$annotations = list;
            this.$annotationConfig = annotationConfig;
            this.$polylineAnnotationGroupState = polylineAnnotationGroupState;
            this.$$changed = i14;
            this.$$default = i15;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupKt.PolylineAnnotationGroup(this.$annotations, this.$annotationConfig, this.$polylineAnnotationGroupState, mVar, this.$$changed | 1, this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupKt$PolylineAnnotationGroup$4, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass4 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ AnnotationConfig $annotationConfig;
        final /* synthetic */ List<PolylineAnnotationOptions> $annotations;
        final /* synthetic */ l<PolylineAnnotation, Boolean> $onClick;
        final /* synthetic */ PolylineAnnotationGroupState $polylineAnnotationGroupState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(List<PolylineAnnotationOptions> list, AnnotationConfig annotationConfig, l<? super PolylineAnnotation, Boolean> lVar, PolylineAnnotationGroupState polylineAnnotationGroupState, int i14, int i15) {
            super(2);
            this.$annotations = list;
            this.$annotationConfig = annotationConfig;
            this.$onClick = lVar;
            this.$polylineAnnotationGroupState = polylineAnnotationGroupState;
            this.$$changed = i14;
            this.$$default = i15;
        }

        public final void invoke(m mVar, int i14) {
            PolylineAnnotationGroupKt.PolylineAnnotationGroup(this.$annotations, this.$annotationConfig, this.$onClick, this.$polylineAnnotationGroupState, mVar, this.$$changed | 1, this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @e
    @MapboxMapComposable
    public static final void PolylineAnnotationGroup(List<PolylineAnnotationOptions> list, AnnotationConfig annotationConfig, l<? super PolylineAnnotation, Boolean> lVar, PolylineAnnotationGroupState polylineAnnotationGroupState, m mVar, int i14, int i15) {
        list.getClass();
        o0 o0VarE = mVar.E(827343315);
        if ((i15 & 2) != 0) {
            annotationConfig = null;
        }
        AnnotationConfig annotationConfig2 = annotationConfig;
        if ((i15 & 4) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        l<? super PolylineAnnotation, Boolean> lVar2 = lVar;
        if ((i15 & 8) != 0) {
            o0VarE.L(-492369756);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new PolylineAnnotationGroupState();
                o0VarE.K(objQ);
            }
            o0VarE.g0(false);
            polylineAnnotationGroupState = (PolylineAnnotationGroupState) objQ;
        }
        PolylineAnnotationGroupState polylineAnnotationGroupState2 = polylineAnnotationGroupState;
        x1 x1Var = n.f135158a;
        polylineAnnotationGroupState2.getInteractionsState().onClicked(lVar2);
        Unit unit = Unit.INSTANCE;
        PolylineAnnotationGroup(list, annotationConfig2, polylineAnnotationGroupState2, o0VarE, 72, 0);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass4(list, annotationConfig2, lVar2, polylineAnnotationGroupState2, i14, i15);
    }

    @e
    @MapboxMapComposable
    public static final void PolylineAnnotationGroup(List<PolylineAnnotationOptions> list, AnnotationConfig annotationConfig, l<? super PolylineAnnotation, Boolean> lVar, l<? super PolylineAnnotationGroupState, Unit> lVar2, m mVar, int i14, int i15) {
        list.getClass();
        lVar2.getClass();
        mVar.L(-1563034081);
        if ((i15 & 2) != 0) {
            annotationConfig = null;
        }
        AnnotationConfig annotationConfig2 = annotationConfig;
        if ((i15 & 4) != 0) {
            lVar = AnonymousClass13.INSTANCE;
        }
        l<? super PolylineAnnotation, Boolean> lVar3 = lVar;
        mVar.L(-492369756);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = new PolylineAnnotationGroupState();
            mVar.K(objQ);
        }
        mVar.R();
        lVar2.invoke(objQ);
        PolylineAnnotationGroup(list, annotationConfig2, lVar3, (PolylineAnnotationGroupState) objQ, mVar, (i14 & 896) | 72, 0);
        mVar.R();
    }

    @MapboxMapComposable
    public static final void PolylineAnnotationGroup(List<PolylineAnnotationOptions> list, AnnotationConfig annotationConfig, l<? super PolylineAnnotationGroupState, Unit> lVar, m mVar, int i14, int i15) {
        list.getClass();
        lVar.getClass();
        mVar.L(-1984696046);
        if ((i15 & 2) != 0) {
            annotationConfig = null;
        }
        AnnotationConfig annotationConfig2 = annotationConfig;
        mVar.L(-492369756);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = new PolylineAnnotationGroupState();
            mVar.K(objQ);
        }
        mVar.R();
        lVar.invoke(objQ);
        PolylineAnnotationGroup(list, annotationConfig2, (PolylineAnnotationGroupState) objQ, mVar, 72, 0);
        mVar.R();
    }
}
