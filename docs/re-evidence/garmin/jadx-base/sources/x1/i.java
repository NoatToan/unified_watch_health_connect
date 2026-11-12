package x1;

import e23.p;
import e23.q;
import e23.v;
import f4.s;
import h4.r;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BO\b\u0000\u0012D\u0010\u000b\u001a@\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\n\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lx1/i;", "", "Lkotlin/Function6;", "Lh4/r;", "", "", "Lx1/e;", "Lkotlin/Function1;", "Lo4/d0;", "", "Lkotlin/Function0;", "itemUi", "<init>", "(Le23/v;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v<r, String, Boolean, e, q<? super d0, ? super m, ? super Integer, Unit>, e23.a<Unit>, m, Integer, Unit> f188346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s<q<e, m, Integer, Unit>> f188347b = new s<>();

    /* JADX WARN: Multi-variable type inference failed */
    public i(v<? super r, ? super String, ? super Boolean, ? super e, ? super q<? super d0, ? super m, ? super Integer, Unit>, ? super e23.a<Unit>, ? super m, ? super Integer, Unit> vVar) {
        this.f188346a = vVar;
    }

    public static void b(i iVar, p pVar, z3.e eVar, e23.a aVar, int i14) {
        r.a aVar2 = r.S;
        if ((i14 & 8) != 0) {
            eVar = null;
        }
        iVar.f188347b.add(new z3.e(-1789283891, true, new ku1.l(pVar, iVar, aVar2, eVar, aVar, 29)));
    }

    public final void a(e eVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-798501095);
        int i15 = (o0VarE.B(eVar) ? 4 : 2) | i14 | (o0VarE.B(this) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            s<q<e, m, Integer, Unit>> sVar = this.f188347b;
            int size = sVar.size();
            for (int i16 = 0; i16 < size; i16++) {
                sVar.get(i16).invoke(eVar, o0VarE, Integer.valueOf(i15 & 14));
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wb1.i(this, eVar, i14, 17);
        }
    }
}
