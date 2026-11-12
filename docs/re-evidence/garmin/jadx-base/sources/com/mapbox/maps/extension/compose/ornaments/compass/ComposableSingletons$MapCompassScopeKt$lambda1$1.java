package com.mapbox.maps.extension.compose.ornaments.compass;

import com.mapbox.maps.extension.compose.R;
import e23.p;
import n5.c;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.n;
import p3.x1;
import u1.y0;

/* JADX INFO: renamed from: com.mapbox.maps.extension.compose.ornaments.compass.ComposableSingletons$MapCompassScopeKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class ComposableSingletons$MapCompassScopeKt$lambda1$1 extends w implements p<m, Integer, Unit> {
    public static final ComposableSingletons$MapCompassScopeKt$lambda1$1 INSTANCE = new ComposableSingletons$MapCompassScopeKt$lambda1$1();

    public ComposableSingletons$MapCompassScopeKt$lambda1$1() {
        super(2);
    }

    public final void invoke(m mVar, int i14) {
        if ((i14 & 11) == 2 && mVar.b()) {
            mVar.e();
        } else {
            x1 x1Var = n.f135158a;
            y0.a(c.a(R.drawable.mapbox_compass_icon, mVar, 0), "Mapbox Compass", null, null, null, 0.0f, null, mVar, 56, 124);
        }
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
        invoke(mVar, num.intValue());
        return Unit.INSTANCE;
    }
}
