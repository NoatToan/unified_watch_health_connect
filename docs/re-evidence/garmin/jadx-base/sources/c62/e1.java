package c62;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lc62/e1;", "Lr52/b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/e;", "Lc62/t;", "<init>", "()V", "", "showBanner", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e1 implements r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.details.e, t> {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, t.class, "triggerWorkoutPaywall", "triggerWorkoutPaywall()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((t) this.receiver).d3();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0089  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r52.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(t tVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar, p3.m mVar, int i14) {
        int i15;
        boolean z14;
        tVar.getClass();
        eVar.getClass();
        p3.o0 o0VarE = mVar.E(-2066412071);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(tVar) : o0VarE.r(tVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 32 : 16;
        }
        boolean z15 = false;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean z16 = eVar.l().f24690a && eVar.l().f24691b == -1;
            boolean zH = o0VarE.h(z16);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zH) {
                if (tVar.V1()) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                objQ = hb.a.n(z14, o0VarE);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    if (tVar.V1() || !z16) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    objQ = hb.a.n(z14, o0VarE);
                }
            }
            p3.p1 p1Var = (p3.p1) objQ;
            boolean zB = o0VarE.B(p1Var);
            if ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(tVar))) {
                z15 = true;
            }
            boolean z17 = zB | z15;
            Object objQ2 = o0VarE.q();
            if (z17) {
                objQ2 = new bb0.d(24, tVar, p1Var);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new bb0.d(24, tVar, p1Var);
                    o0VarE.K(objQ2);
                }
            }
            r1.c0.e(((Boolean) p1Var.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(-1807562575, new aa2.f(15, tVar, (e23.a) objQ2), o0VarE), o0VarE, 196608, 30);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(this, tVar, eVar, i14, 18);
        }
    }
}
