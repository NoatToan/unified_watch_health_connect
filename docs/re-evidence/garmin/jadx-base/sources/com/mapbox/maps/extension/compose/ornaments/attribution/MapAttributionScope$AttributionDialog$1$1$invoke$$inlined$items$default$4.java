package com.mapbox.maps.extension.compose.ornaments.attribution;

import c2.x2;
import com.mapbox.maps.plugin.attribution.Attribution;
import e2.d;
import e23.l;
import e23.r;
import g6.f;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p006l2.c0;
import p3.m;
import p3.n;
import p3.x1;
import s5.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Le2/d;", "", "it", "", "invoke", "(Le2/d;ILp3/m;I)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class MapAttributionScope$AttributionDialog$1$1$invoke$$inlined$items$default$4 extends w implements r<d, Integer, m, Integer, Unit> {
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ l $onAttributionClick$inlined;
    final /* synthetic */ MapAttributionScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapAttributionScope$AttributionDialog$1$1$invoke$$inlined$items$default$4(List list, MapAttributionScope mapAttributionScope, int i14, l lVar) {
        super(4);
        this.$items = list;
        this.this$0 = mapAttributionScope;
        this.$$dirty$inlined = i14;
        this.$onAttributionClick$inlined = lVar;
    }

    public final void invoke(d dVar, int i14, m mVar, int i15) {
        int i16;
        dVar.getClass();
        if ((i15 & 14) == 0) {
            i16 = (mVar.B(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 112) == 0) {
            i16 |= mVar.k(i14) ? 32 : 16;
        }
        if ((i16 & 731) == 146 && mVar.b()) {
            mVar.e();
            return;
        }
        x1 x1Var = n.f135158a;
        Attribution attribution = (Attribution) this.$items.get(i14);
        c annotatedString = this.this$0.toAnnotatedString(attribution, mVar, ((this.$$dirty$inlined >> 6) & 112) | 8);
        f.a aVar = f.f75994b;
        c0.a(annotatedString, x2.x(dVar.e(c2.l.z(h4.r.S, 24, 4)), null, 3), null, false, 0, 0, null, new MapAttributionScope$AttributionDialog$1$1$1$1(this.$onAttributionClick$inlined, attribution), mVar, 0, 124);
    }

    @Override // e23.r
    public /* bridge */ /* synthetic */ Unit invoke(d dVar, Integer num, m mVar, Integer num2) {
        invoke(dVar, num.intValue(), mVar, num2.intValue());
        return Unit.INSTANCE;
    }
}
