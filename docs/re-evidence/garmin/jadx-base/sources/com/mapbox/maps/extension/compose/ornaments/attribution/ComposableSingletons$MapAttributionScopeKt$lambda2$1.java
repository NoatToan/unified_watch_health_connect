package com.mapbox.maps.extension.compose.ornaments.attribution;

import a3.s1;
import com.mapbox.maps.extension.compose.R;
import e23.p;
import gl1.y;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: renamed from: com.mapbox.maps.extension.compose.ornaments.attribution.ComposableSingletons$MapAttributionScopeKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class ComposableSingletons$MapAttributionScopeKt$lambda2$1 extends w implements p<m, Integer, Unit> {
    public static final ComposableSingletons$MapAttributionScopeKt$lambda2$1 INSTANCE = new ComposableSingletons$MapAttributionScopeKt$lambda2$1();

    public ComposableSingletons$MapAttributionScopeKt$lambda2$1() {
        super(2);
    }

    public final void invoke(m mVar, int i14) {
        if ((i14 & 11) == 2 && mVar.b()) {
            mVar.e();
            return;
        }
        x1 x1Var = n.f135158a;
        String strQ = y.Q(mVar, R.string.mapbox_attributionsDialogTitle);
        long jB = f0.B(20);
        w5.f0.f182097b.getClass();
        s1.c(strQ, null, 0L, jB, w5.f0.f182105j, 0L, 0L, 0, false, 0, null, null, mVar, 199680, 65494);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
        invoke(mVar, num.intValue());
        return Unit.INSTANCE;
    }
}
