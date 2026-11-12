package d62;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import w52.u0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ld62/c;", "Lr52/b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/e;", "Lc62/t;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.details.e, c62.t> {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, c62.t.class, "openDeviceTroubleshooting", "openDeviceTroubleshooting()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((c62.t) this.receiver).o0();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public b(Object obj) {
            super(0, obj, c62.t.class, "dismissDeviceDisconnectedDialog", "dismissDeviceDisconnectedDialog()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((c62.t) this.receiver).p1();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    @Override // r52.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(c62.t tVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar, p3.m mVar, int i14) {
        int i15;
        tVar.getClass();
        eVar.getClass();
        o0 o0VarE = mVar.E(1994746531);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(tVar) : o0VarE.r(tVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 32 : 16;
        }
        boolean z14 = true;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            com.garmin.android.apps.connectmobile.workouts.presentation.details.b f48585i = eVar.getF48585i();
            if (f48585i instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.b.C0945b) {
                o0VarE.C(326586915);
                String str = ((com.garmin.android.apps.connectmobile.workouts.presentation.details.b.C0945b) f48585i).f48510a;
                if (str == null) {
                    str = "";
                }
                int i16 = i15 & 14;
                boolean z15 = i16 == 4 || ((i15 & 8) != 0 && o0VarE.r(tVar));
                Object objQ = o0VarE.q();
                p3.m.a aVar = p3.m.f135153a;
                if (z15) {
                    objQ = new a(tVar);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a(tVar);
                        o0VarE.K(objQ);
                    }
                }
                e23.a aVar2 = (e23.a) ((k23.g) objQ);
                if (i16 != 4 && ((i15 & 8) == 0 || !o0VarE.r(tVar))) {
                    z14 = false;
                }
                Object objQ2 = o0VarE.q();
                if (z14) {
                    objQ2 = new b(tVar);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new b(tVar);
                        o0VarE.K(objQ2);
                    }
                }
                u0.b(str, aVar2, (e23.a) ((k23.g) objQ2), o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(326829087);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(this, tVar, eVar, i14, 12);
        }
    }
}
