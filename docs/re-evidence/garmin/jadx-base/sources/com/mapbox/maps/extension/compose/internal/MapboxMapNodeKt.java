package com.mapbox.maps.extension.compose.internal;

import com.mapbox.maps.plugin.gestures.OnMapClickListener;
import com.mapbox.maps.plugin.gestures.OnMapLongClickListener;
import e23.a;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.c;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/OnMapClickListener;", "onMapClickListener", "Lcom/mapbox/maps/plugin/gestures/OnMapLongClickListener;", "onMapLongClickListener", "", "MapboxMapComposeNode", "(Lcom/mapbox/maps/plugin/gestures/OnMapClickListener;Lcom/mapbox/maps/plugin/gestures/OnMapLongClickListener;Lp3/m;I)V", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MapboxMapNodeKt {

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.internal.MapboxMapNodeKt$MapboxMapComposeNode$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements a<MapboxMapNode> {
        final /* synthetic */ MapApplier $mapApplier;
        final /* synthetic */ OnMapClickListener $onMapClickListener;
        final /* synthetic */ OnMapLongClickListener $onMapLongClickListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MapApplier mapApplier, OnMapClickListener onMapClickListener, OnMapLongClickListener onMapLongClickListener) {
            super(0);
            this.$mapApplier = mapApplier;
            this.$onMapClickListener = onMapClickListener;
            this.$onMapLongClickListener = onMapLongClickListener;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // e23.a
        public final MapboxMapNode invoke() {
            return new MapboxMapNode(this.$mapApplier.getMapView(), this.$onMapClickListener, this.$onMapLongClickListener);
        }
    }

    public static final void MapboxMapComposeNode(OnMapClickListener onMapClickListener, OnMapLongClickListener onMapLongClickListener, m mVar, int i14) {
        o0 o0VarE = mVar.E(853176503);
        x1 x1Var = n.f135158a;
        c<?> cVar = o0VarE.f135177b;
        cVar.getClass();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1((MapApplier) cVar, onMapClickListener, onMapLongClickListener);
        o0VarE.L(1886828752);
        if (!(cVar instanceof MapApplier)) {
            p0.l();
            throw null;
        }
        o0VarE.H();
        if (o0VarE.T) {
            o0VarE.M(new MapboxMapNodeKt$MapboxMapComposeNode$$inlined$ComposeNode$1(anonymousClass1));
        } else {
            o0VarE.c();
        }
        b4.d(MapboxMapNodeKt$MapboxMapComposeNode$2$1.INSTANCE, onMapClickListener, o0VarE);
        b4.d(MapboxMapNodeKt$MapboxMapComposeNode$2$2.INSTANCE, onMapLongClickListener, o0VarE);
        o0VarE.g0(true);
        o0VarE.g0(false);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass3(onMapClickListener, onMapLongClickListener, i14);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.internal.MapboxMapNodeKt$MapboxMapComposeNode$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass3 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ OnMapClickListener $onMapClickListener;
        final /* synthetic */ OnMapLongClickListener $onMapLongClickListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(OnMapClickListener onMapClickListener, OnMapLongClickListener onMapLongClickListener, int i14) {
            super(2);
            this.$onMapClickListener = onMapClickListener;
            this.$onMapLongClickListener = onMapLongClickListener;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            MapboxMapNodeKt.MapboxMapComposeNode(this.$onMapClickListener, this.$onMapLongClickListener, mVar, this.$$changed | 1);
        }
    }
}
