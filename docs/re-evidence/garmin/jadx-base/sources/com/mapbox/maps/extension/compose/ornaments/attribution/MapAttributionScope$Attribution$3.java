package com.mapbox.maps.extension.compose.ornaments.attribution;

import e23.a;
import e23.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapAttributionScope$Attribution$3 extends w implements t<a<? extends Unit>, a<? extends Unit>, a<? extends Unit>, Boolean, m, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ MapAttributionScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapAttributionScope$Attribution$3(MapAttributionScope mapAttributionScope, int i14) {
        super(6);
        this.this$0 = mapAttributionScope;
        this.$$dirty = i14;
    }

    public final void invoke(a<Unit> aVar, a<Unit> aVar2, a<Unit> aVar3, boolean z14, m mVar, int i14) {
        int i15;
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        if ((i14 & 14) == 0) {
            i15 = (mVar.B(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 112) == 0) {
            i15 |= mVar.B(aVar2) ? 32 : 16;
        }
        if ((i14 & 896) == 0) {
            i15 |= mVar.B(aVar3) ? 256 : 128;
        }
        if ((i14 & 7168) == 0) {
            i15 |= mVar.h(z14) ? 2048 : 1024;
        }
        if ((46811 & i15) == 9362 && mVar.b()) {
            mVar.e();
        } else {
            x1 x1Var = n.f135158a;
            this.this$0.GeofencingConsentDialog(aVar, aVar2, aVar3, z14, mVar, (i15 & 8190) | ((this.$$dirty >> 6) & 57344));
        }
    }

    @Override // e23.t
    public /* bridge */ /* synthetic */ Unit invoke(a<? extends Unit> aVar, a<? extends Unit> aVar2, a<? extends Unit> aVar3, Boolean bool, m mVar, Integer num) {
        invoke((a<Unit>) aVar, (a<Unit>) aVar2, (a<Unit>) aVar3, bool.booleanValue(), mVar, num.intValue());
        return Unit.INSTANCE;
    }
}
