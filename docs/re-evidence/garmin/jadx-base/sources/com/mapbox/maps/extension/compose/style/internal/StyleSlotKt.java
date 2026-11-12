package com.mapbox.maps.extension.compose.style.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0015\b\u0002\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "name", "Lkotlin/Function0;", "", "Lcom/mapbox/maps/extension/compose/MapboxMapComposable;", FirebaseAnalytics.Param.CONTENT, "StyleSlot", "(Ljava/lang/String;Le23/p;Lp3/m;II)V", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class StyleSlotKt {
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    @MapboxStyleComposable
    public static final void StyleSlot(String str, p<? super m, ? super Integer, Unit> pVar, m mVar, int i14, int i15) {
        int i16;
        str.getClass();
        o0 o0VarE = mVar.E(609848635);
        c<?> cVar = o0VarE.f135177b;
        if ((i15 & 1) != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 14) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i17 = i15 & 2;
        if (i17 != 0) {
            i16 |= 48;
        } else if ((i14 & 112) == 0) {
            i16 |= o0VarE.B(pVar) ? 32 : 16;
        }
        if ((i16 & 91) == 18 && o0VarE.b()) {
            o0VarE.e();
        } else {
            Unit unit = null;
            if (i17 != 0) {
                pVar = null;
            }
            x1 x1Var = n.f135158a;
            if ((cVar instanceof MapApplier ? (MapApplier) cVar : null) != null) {
                o0VarE.L(1157296644);
                boolean zB = o0VarE.B(str);
                Object objQ = o0VarE.q();
                if (zB) {
                    objQ = new StyleSlotKt$StyleSlot$1$1$1(str);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new StyleSlotKt$StyleSlot$1$1$1(str);
                        o0VarE.K(objQ);
                    }
                }
                o0VarE.g0(false);
                e23.a aVar = (e23.a) objQ;
                o0VarE.L(-548224868);
                if (!(cVar instanceof MapApplier)) {
                    p0.l();
                    throw null;
                }
                o0VarE.H();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                if (pVar != null) {
                    pVar.invoke(o0VarE, Integer.valueOf((i16 >> 3) & 14));
                }
                o0VarE.g0(true);
                o0VarE.g0(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                h.z("Illegal use of StyleSlot composable outside of MapboxMapComposable");
                return;
            }
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(str, pVar, i14, i15);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.internal.StyleSlotKt$StyleSlot$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p<m, Integer, Unit> $content;
        final /* synthetic */ String $name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, p<? super m, ? super Integer, Unit> pVar, int i14, int i15) {
            super(2);
            this.$name = str;
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
            StyleSlotKt.StyleSlot(this.$name, this.$content, mVar, this.$$changed | 1, this.$$default);
        }
    }
}
