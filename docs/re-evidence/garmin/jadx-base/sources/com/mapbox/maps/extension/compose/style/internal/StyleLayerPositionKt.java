package com.mapbox.maps.extension.compose.style.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.extension.compose.internal.MapApplier;
import com.mapbox.maps.extension.compose.style.MapboxStyleComposable;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.c;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0015\b\u0002\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/mapbox/maps/LayerPosition;", "layerPosition", "Lkotlin/Function0;", "", "Lcom/mapbox/maps/extension/compose/MapboxMapComposable;", FirebaseAnalytics.Param.CONTENT, "StyleLayerPosition", "(Lcom/mapbox/maps/LayerPosition;Le23/p;Lp3/m;II)V", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class StyleLayerPositionKt {
    @MapboxStyleComposable
    public static final void StyleLayerPosition(LayerPosition layerPosition, p<? super m, ? super Integer, Unit> pVar, m mVar, int i14, int i15) {
        layerPosition.getClass();
        o0 o0VarE = mVar.E(1402746538);
        c<?> cVar = o0VarE.f135177b;
        Unit unit = null;
        if ((i15 & 2) != 0) {
            pVar = null;
        }
        x1 x1Var = n.f135158a;
        if ((cVar instanceof MapApplier ? (MapApplier) cVar : null) != null) {
            StyleLayerPositionKt$StyleLayerPosition$1$1 styleLayerPositionKt$StyleLayerPosition$1$1 = new StyleLayerPositionKt$StyleLayerPosition$1$1(layerPosition);
            o0VarE.L(-548224868);
            if (!(cVar instanceof MapApplier)) {
                p0.l();
                throw null;
            }
            o0VarE.H();
            if (o0VarE.T) {
                o0VarE.M(styleLayerPositionKt$StyleLayerPosition$1$1);
            } else {
                o0VarE.c();
            }
            if (pVar != null) {
                pVar.invoke(o0VarE, Integer.valueOf((i14 >> 3) & 14));
            }
            o0VarE.g0(true);
            o0VarE.g0(false);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            h.z("Illegal use of StyleLayerPosition composable outside of MapboxMapComposable");
            return;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(layerPosition, pVar, i14, i15);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.internal.StyleLayerPositionKt$StyleLayerPosition$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p<m, Integer, Unit> $content;
        final /* synthetic */ LayerPosition $layerPosition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(LayerPosition layerPosition, p<? super m, ? super Integer, Unit> pVar, int i14, int i15) {
            super(2);
            this.$layerPosition = layerPosition;
            this.$content = pVar;
            this.$$changed = i14;
            this.$$default = i15;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            StyleLayerPositionKt.StyleLayerPosition(this.$layerPosition, this.$content, mVar, this.$$changed | 1, this.$$default);
        }
    }
}
