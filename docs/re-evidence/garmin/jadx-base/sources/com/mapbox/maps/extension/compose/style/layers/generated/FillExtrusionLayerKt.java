package com.mapbox.maps.extension.compose.style.layers.generated;

import com.garmin.proto.generated.a;
import com.mapbox.maps.extension.compose.MapboxMapComposable;
import com.mapbox.maps.extension.compose.internal.MapApplier;
import com.mapbox.maps.extension.compose.style.IdGenerator;
import com.mapbox.maps.extension.compose.style.layers.internal.LayerNode;
import com.mapbox.maps.extension.compose.style.sources.SourceState;
import com.mapbox.maps.p;
import e23.l;
import i3.e5;
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
import p3.p2;
import p3.x1;
import p3.z;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0004\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\tH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/sources/SourceState;", "sourceState", "", "layerId", "Lcom/mapbox/maps/extension/compose/style/layers/generated/FillExtrusionLayerState;", "fillExtrusionLayerState", "", "FillExtrusionLayer", "(Lcom/mapbox/maps/extension/compose/style/sources/SourceState;Ljava/lang/String;Lcom/mapbox/maps/extension/compose/style/layers/generated/FillExtrusionLayerState;Lp3/m;II)V", "Lkotlin/Function1;", "init", "(Lcom/mapbox/maps/extension/compose/style/sources/SourceState;Ljava/lang/String;Le23/l;Lp3/m;II)V", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class FillExtrusionLayerKt {
    @MapboxMapComposable
    public static final void FillExtrusionLayer(SourceState sourceState, String str, FillExtrusionLayerState fillExtrusionLayerState, m mVar, int i14, int i15) {
        String str2;
        sourceState.getClass();
        o0 o0VarE = mVar.E(-387806793);
        c<?> cVar = o0VarE.f135177b;
        int i16 = i15 & 2;
        m.a aVar = m.f135153a;
        if (i16 != 0) {
            Object objK = fb1.c.k(o0VarE, -492369756, aVar);
            if (objK == m.a.f135155b) {
                objK = IdGenerator.INSTANCE.generateRandomLayerId("fill-extrusion");
                o0VarE.K(objK);
            }
            o0VarE.g0(false);
            str = (String) objK;
        }
        String str3 = str;
        FillExtrusionLayerState fillExtrusionLayerState2 = fillExtrusionLayerState;
        if ((i15 & 4) != 0) {
            Object objK2 = fb1.c.k(o0VarE, -492369756, aVar);
            if (objK2 == m.a.f135155b) {
                objK2 = new FillExtrusionLayerState();
                o0VarE.K(objK2);
            }
            o0VarE.g0(false);
            fillExtrusionLayerState2 = (FillExtrusionLayerState) objK2;
        }
        x1 x1Var = n.f135158a;
        MapApplier mapApplier = cVar instanceof MapApplier ? (MapApplier) cVar : null;
        if (mapApplier == null) {
            h.z("Illegal use of FillExtrusionLayer inside unsupported composable function");
            return;
        }
        Object objG = p.g(o0VarE, 773894976, -492369756, aVar);
        Object obj = m.a.f135155b;
        if (objG == obj) {
            objG = a.d(l0.j(t13.h.f161748a, o0VarE), o0VarE);
        }
        o0VarE.g0(false);
        b0 b0Var = ((z) objG).f135391a;
        o0VarE.g0(false);
        o0VarE.L(-492369756);
        Object objQ = o0VarE.q();
        if (objQ == obj) {
            str2 = str3;
            Object layerNode = new LayerNode(mapApplier.getMapView().getMapboxMapDeprecated(), "fill-extrusion", str2, sourceState, b0Var);
            o0VarE.K(layerNode);
            objQ = layerNode;
        } else {
            str2 = str3;
        }
        o0VarE.g0(false);
        LayerNode layerNode2 = (LayerNode) objQ;
        o0VarE.L(1157296644);
        boolean zB = o0VarE.B(layerNode2);
        Object objQ2 = o0VarE.q();
        if (zB || objQ2 == obj) {
            objQ2 = new FillExtrusionLayerKt$FillExtrusionLayer$3$1(layerNode2);
            o0VarE.K(objQ2);
        }
        o0VarE.g0(false);
        e23.a aVar2 = (e23.a) objQ2;
        o0VarE.L(-548224868);
        if (!(cVar instanceof MapApplier)) {
            p0.l();
            throw null;
        }
        o0VarE.H();
        if (o0VarE.T) {
            o0VarE.M(aVar2);
        } else {
            o0VarE.c();
        }
        b4.d(new FillExtrusionLayerKt$FillExtrusionLayer$4$1(sourceState), sourceState, o0VarE);
        b4.d(new FillExtrusionLayerKt$FillExtrusionLayer$4$2(str2), str2, o0VarE);
        o0VarE.N(-1394903627, fillExtrusionLayerState2);
        fillExtrusionLayerState2.UpdateProperties$extension_compose_release(layerNode2, o0VarE, ((i14 >> 3) & 112) | 6);
        e5.u(o0VarE, false, true, false);
        sourceState.UpdateProperties$extension_compose_release(o0VarE, 8);
        o0VarE.N(614176410, fillExtrusionLayerState2.getInteractionsState());
        fillExtrusionLayerState2.getInteractionsState().BindTo$extension_compose_release(mapApplier.getMapView().getMapboxMapDeprecated(), str2, o0VarE, 8 | (i14 & 112));
        o0VarE.g0(false);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass6(sourceState, str2, fillExtrusionLayerState2, i14, i15);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.layers.generated.FillExtrusionLayerKt$FillExtrusionLayer$6, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass6 extends w implements e23.p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ FillExtrusionLayerState $fillExtrusionLayerState;
        final /* synthetic */ String $layerId;
        final /* synthetic */ SourceState $sourceState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(SourceState sourceState, String str, FillExtrusionLayerState fillExtrusionLayerState, int i14, int i15) {
            super(2);
            this.$sourceState = sourceState;
            this.$layerId = str;
            this.$fillExtrusionLayerState = fillExtrusionLayerState;
            this.$$changed = i14;
            this.$$default = i15;
        }

        public final void invoke(m mVar, int i14) {
            FillExtrusionLayerKt.FillExtrusionLayer(this.$sourceState, this.$layerId, this.$fillExtrusionLayerState, mVar, this.$$changed | 1, this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @MapboxMapComposable
    public static final void FillExtrusionLayer(SourceState sourceState, String str, l<? super FillExtrusionLayerState, Unit> lVar, m mVar, int i14, int i15) {
        sourceState.getClass();
        lVar.getClass();
        mVar.L(1912876212);
        int i16 = i15 & 2;
        m.a aVar = m.f135153a;
        if (i16 != 0) {
            Object objF = p.f(mVar, -492369756, aVar);
            if (objF == m.a.f135155b) {
                objF = IdGenerator.INSTANCE.generateRandomLayerId("fill-extrusion");
                mVar.K(objF);
            }
            mVar.R();
            str = (String) objF;
        }
        String str2 = str;
        Object objF2 = p.f(mVar, -492369756, aVar);
        if (objF2 == m.a.f135155b) {
            objF2 = new FillExtrusionLayerState();
            mVar.K(objF2);
        }
        mVar.R();
        lVar.invoke(objF2);
        FillExtrusionLayer(sourceState, str2, (FillExtrusionLayerState) objF2, mVar, (i14 & 112) | 8, 0);
        mVar.R();
    }
}
