package com.mapbox.maps.extension.compose;

import com.mapbox.maps.extension.compose.ornaments.scalebar.MapScaleBarScope;
import e23.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: renamed from: com.mapbox.maps.extension.compose.ComposableSingletons$MapboxMapKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mapbox/maps/extension/compose/ornaments/scalebar/MapScaleBarScope;", "", "invoke", "(Lcom/mapbox/maps/extension/compose/ornaments/scalebar/MapScaleBarScope;Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class ComposableSingletons$MapboxMapKt$lambda2$1 extends w implements q<MapScaleBarScope, m, Integer, Unit> {
    public static final ComposableSingletons$MapboxMapKt$lambda2$1 INSTANCE = new ComposableSingletons$MapboxMapKt$lambda2$1();

    public ComposableSingletons$MapboxMapKt$lambda2$1() {
        super(3);
    }

    public final void invoke(MapScaleBarScope mapScaleBarScope, m mVar, int i14) {
        m mVar2;
        int i15;
        mapScaleBarScope.getClass();
        if ((i14 & 14) == 0) {
            mVar2 = mVar;
            i15 = i14 | (mVar2.B(mapScaleBarScope) ? 4 : 2);
        } else {
            mVar2 = mVar;
            i15 = i14;
        }
        if ((i15 & 91) == 18 && mVar2.b()) {
            mVar2.e();
        } else {
            x1 x1Var = n.f135158a;
            mapScaleBarScope.m214ScaleBarvLKV3eY(null, null, null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, 0.0f, 0L, false, 0L, false, 0.0f, false, mVar2, 0, (i15 << 18) & 3670016, 65535);
        }
    }

    @Override // e23.q
    public /* bridge */ /* synthetic */ Unit invoke(MapScaleBarScope mapScaleBarScope, m mVar, Integer num) {
        invoke(mapScaleBarScope, mVar, num.intValue());
        return Unit.INSTANCE;
    }
}
