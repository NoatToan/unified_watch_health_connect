package r2;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.q0;
import qw0.y;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.l<e23.l<? super o2.b, ? extends Boolean>, Unit> {
        public a(Object obj) {
            super(1, obj, n2.a.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(e23.l<? super o2.b, ? extends Boolean> lVar) {
            ((n2.a) this.receiver).f122354b.g(lVar);
            return Unit.INSTANCE;
        }
    }

    public static final o2.d a(h5.j jVar) {
        n2.a aVar = new n2.a();
        gl1.d.h0(jVar, e.f149435a, new ph1.d(24, new y(aVar, 4), new a(aVar)));
        q0 q0Var = new q0(0, 1, null);
        q0<o2.b> q0Var2 = aVar.f122353a;
        Object[] objArr = q0Var2.f134667a;
        int i14 = q0Var2.f134668b;
        boolean z14 = true;
        o2.b bVar = null;
        for (int i15 = 0; i15 < i14; i15++) {
            o2.b bVar2 = (o2.b) objArr[i15];
            if (!z14 || bVar2 != o2.g.f128635b) {
                o2.g gVar = o2.g.f128635b;
                if (bVar2 == gVar && bVar == gVar) {
                    z14 = false;
                } else {
                    if (bVar2 != gVar) {
                        q0<e23.l<o2.b, Boolean>> q0Var3 = aVar.f122354b;
                        Object[] objArr2 = q0Var3.f134667a;
                        int i16 = q0Var3.f134668b;
                        int i17 = 0;
                        while (true) {
                            if (i17 < i16) {
                                if (((Boolean) ((e23.l) objArr2[i17]).invoke(bVar2)).booleanValue()) {
                                    i17++;
                                } else {
                                    z14 = false;
                                }
                            }
                        }
                    }
                    q0Var.g(bVar2);
                    z14 = false;
                    bVar = bVar2;
                }
            }
        }
        if (((o2.b) (q0Var.d() ? null : q0Var.f134667a[q0Var.f134668b - 1])) == o2.g.f128635b) {
            q0Var.l(q0Var.f134668b - 1);
        }
        List list = q0Var.f134799c;
        List list2 = list;
        if (list == null) {
            q0.b<E> bVar3 = new q0.b<>(q0Var);
            q0Var.f134799c = bVar3;
            list2 = bVar3;
        }
        return new o2.d(list2);
    }
}
