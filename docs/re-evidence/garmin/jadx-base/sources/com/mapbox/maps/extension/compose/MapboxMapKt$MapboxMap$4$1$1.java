package com.mapbox.maps.extension.compose;

import com.mapbox.maps.extension.compose.internal.MapboxMapNodeKt;
import com.mapbox.maps.plugin.gestures.OnMapClickListener;
import com.mapbox.maps.plugin.gestures.OnMapLongClickListener;
import e23.p;
import e23.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.n;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapboxMapKt$MapboxMap$4$1$1 extends w implements p<m, Integer, Unit> {
    final /* synthetic */ x3<q<MapboxMapScope, m, Integer, Unit>> $currentContent$delegate;
    final /* synthetic */ x3<OnMapClickListener> $currentOnMapClickListener$delegate;
    final /* synthetic */ x3<OnMapLongClickListener> $currentOnMapLongClickListener$delegate;
    final /* synthetic */ x3<p<m, Integer, Unit>> $currentStyle$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MapboxMapKt$MapboxMap$4$1$1(x3<? extends OnMapClickListener> x3Var, x3<? extends OnMapLongClickListener> x3Var2, x3<? extends p<? super m, ? super Integer, Unit>> x3Var3, x3<? extends q<? super MapboxMapScope, ? super m, ? super Integer, Unit>> x3Var4) {
        super(2);
        this.$currentOnMapClickListener$delegate = x3Var;
        this.$currentOnMapLongClickListener$delegate = x3Var2;
        this.$currentStyle$delegate = x3Var3;
        this.$currentContent$delegate = x3Var4;
    }

    public final void invoke(m mVar, int i14) {
        if ((i14 & 11) == 2 && mVar.b()) {
            mVar.e();
            return;
        }
        x1 x1Var = n.f135158a;
        MapboxMapNodeKt.MapboxMapComposeNode(MapboxMapKt.MapboxMap$lambda$4(this.$currentOnMapClickListener$delegate), MapboxMapKt.MapboxMap$lambda$5(this.$currentOnMapLongClickListener$delegate), mVar, 72);
        MapboxMapKt.MapboxMap$lambda$7(this.$currentStyle$delegate).invoke(mVar, 0);
        q qVarMapboxMap$lambda$6 = MapboxMapKt.MapboxMap$lambda$6(this.$currentContent$delegate);
        if (qVarMapboxMap$lambda$6 == null) {
            return;
        }
        qVarMapboxMap$lambda$6.invoke(MapboxMapScope.INSTANCE, mVar, 6);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
        invoke(mVar, num.intValue());
        return Unit.INSTANCE;
    }
}
