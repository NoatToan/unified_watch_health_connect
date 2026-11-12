package d62;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import l72.c1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ld62/a;", "Lr52/b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/e;", "Lc62/t;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.details.e, c62.t> {

    /* JADX INFO: renamed from: d62.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class C1236a extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public C1236a(Object obj) {
            super(0, obj, c62.t.class, "dismissActivityInProgressDialog", "dismissActivityInProgressDialog()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((c62.t) this.receiver).A3();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public b(Object obj) {
            super(0, obj, c62.t.class, "openActivityRecording", "openActivityRecording()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((c62.t) this.receiver).s2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dd  */
    @Override // r52.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(c62.t tVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar, p3.m mVar, int i14) {
        int i15;
        tVar.getClass();
        eVar.getClass();
        o0 o0VarE = mVar.E(-1160296381);
        if ((i14 & 6) == 0) {
            i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(tVar) : o0VarE.r(tVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 32 : 16;
        }
        boolean z14 = true;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            com.garmin.android.apps.connectmobile.workouts.presentation.details.a f48584h = eVar.getF48584h();
            if (f48584h instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.a.b) {
                o0VarE.C(-492489327);
                c1 c1Var = c1.f110940a;
                String strQ = y.Q(o0VarE, R.string.lbl_activity_in_progress);
                String str = ((com.garmin.android.apps.connectmobile.workouts.presentation.details.a.b) f48584h).f48508a;
                if (str == null) {
                    str = "";
                }
                String strP = y.P(R.string.msg_activity_in_progress_on_device, new Object[]{str}, o0VarE);
                String strQ2 = y.Q(o0VarE, R.string.lbl_close);
                String strQ3 = y.Q(o0VarE, R.string.lbl_view_current_activity);
                int i16 = i15 & 14;
                boolean z15 = i16 == 4 || ((i15 & 8) != 0 && o0VarE.r(tVar));
                Object objQ = o0VarE.q();
                p3.m.a aVar = p3.m.f135153a;
                if (z15) {
                    objQ = new C1236a(tVar);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new C1236a(tVar);
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
                c1Var.b(false, strQ, strP, strQ2, strQ3, null, false, aVar2, (e23.a) ((k23.g) objQ2), null, null, o0VarE, 6, 0, 26520);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-491953089);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(this, tVar, eVar, i14, 11);
        }
    }
}
