package com.mapbox.maps.extension.compose;

import com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope;
import e23.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: renamed from: com.mapbox.maps.extension.compose.ComposableSingletons$MapboxMapKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mapbox/maps/extension/compose/ornaments/compass/MapCompassScope;", "", "invoke", "(Lcom/mapbox/maps/extension/compose/ornaments/compass/MapCompassScope;Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class ComposableSingletons$MapboxMapKt$lambda1$1 extends w implements q<MapCompassScope, m, Integer, Unit> {
    public static final ComposableSingletons$MapboxMapKt$lambda1$1 INSTANCE = new ComposableSingletons$MapboxMapKt$lambda1$1();

    public ComposableSingletons$MapboxMapKt$lambda1$1() {
        super(3);
    }

    public final void invoke(MapCompassScope mapCompassScope, m mVar, int i14) {
        mapCompassScope.getClass();
        if ((i14 & 14) == 0) {
            i14 |= mVar.B(mapCompassScope) ? 4 : 2;
        }
        if ((i14 & 91) == 18 && mVar.b()) {
            mVar.e();
        } else {
            x1 x1Var = n.f135158a;
            mapCompassScope.Compass(null, null, null, false, false, null, mVar, (i14 << 18) & 3670016, 63);
        }
    }

    @Override // e23.q
    public /* bridge */ /* synthetic */ Unit invoke(MapCompassScope mapCompassScope, m mVar, Integer num) {
        invoke(mapCompassScope, mVar, num.intValue());
        return Unit.INSTANCE;
    }
}
