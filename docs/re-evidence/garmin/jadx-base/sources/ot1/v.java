package ot1;

import androidx.room.a0;
import i3.fe;
import lc.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lot1/v;", "Lot1/a;", "<init>", "()V", "Lpt1/o;", "detailsScreenState", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v extends ot1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f133840a = new v();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, b.u.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((b.u) this.receiver).d();
            return Unit.INSTANCE;
        }
    }

    private v() {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ot1.a
    public final void a(lc.v vVar, m0 m0Var, fe feVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarQ = a0.q(vVar, m0Var, mVar, 1241138593);
        if ((i14 & 48) == 0) {
            i15 = i14 | (o0VarQ.r(m0Var) ? 32 : 16);
        } else {
            i15 = i14;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            qt1.a aVarG0 = gl1.d.g0(o0VarQ);
            pt1.p pVar = ((pt1.o) s9.c.c(gl1.d.f0(m0Var, o0VarQ).A, o0VarQ).getF182175a()).f140912j;
            if (pVar == null) {
                o0VarQ.C(-613187031);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(-613187030);
                com.garmin.android.library.mapsdkadapter.i.d dVar = pVar.f140951w;
                String str = pVar.f140931c.f140953a;
                pt1.s sVar = pVar.f140935g;
                b.u uVar = (b.u) o0VarQ.A(g02.d.f74342a);
                boolean zR = o0VarQ.r(uVar);
                Object objQ = o0VarQ.q();
                p3.m.a aVar = p3.m.f135153a;
                if (zR) {
                    objQ = new a(uVar);
                    o0VarQ.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a(uVar);
                        o0VarQ.K(objQ);
                    }
                }
                et1.r.a(dVar, str, sVar, (e23.a) ((k23.g) objQ), o0VarQ, 0);
                boolean zR2 = o0VarQ.r(m0Var) | o0VarQ.B(pVar) | o0VarQ.r(aVarG0);
                Object objQ2 = o0VarQ.q();
                if (zR2) {
                    objQ2 = new nw0.p(m0Var, 11, pVar, aVarG0);
                    o0VarQ.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new nw0.p(m0Var, 11, pVar, aVarG0);
                        o0VarQ.K(objQ2);
                    }
                }
                c.w.a(0, 1, (e23.a) objQ2, o0VarQ, false);
                o0VarQ.g0(false);
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, vVar, m0Var, feVar, i14, 4);
        }
    }
}
