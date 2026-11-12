package c62;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc62/h1;", "Lr52/b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/e;", "Lc62/t;", "Lw52/v0;", "Ll52/i$a;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "stepNode", "<init>", "(Ll52/i$a;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h1 implements r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.details.e, t>, w52.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f24752a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f24753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.j0 f24754b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
            super(0, kotlin.jvm.internal.s.a.class, "notifyStepItemSelected", "Item$notifyStepItemSelected(Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/WorkoutDetailsActions;Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutStepDTO;)V", 0);
            this.f24753a = tVar;
            this.f24754b = j0Var;
        }

        @Override // e23.a
        public final Unit invoke() {
            String strG;
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = this.f24754b;
            String str = j0Var.H0;
            if (str != null && (strG = j0Var.g()) != null) {
                this.f24753a.i3(str, strG);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.q<String, String, e23.a<? extends Unit>, Unit> {
        public b(Object obj) {
            super(3, obj, t.class, "downloadAudioNote", "downloadAudioNote(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", 0);
        }

        @Override // e23.q
        public final Unit invoke(String str, String str2, e23.a<? extends Unit> aVar) {
            String str3 = str;
            String str4 = str2;
            e23.a<? extends Unit> aVar2 = aVar;
            str3.getClass();
            str4.getClass();
            aVar2.getClass();
            ((t) this.receiver).t(aVar2, str3, str4);
            return Unit.INSTANCE;
        }
    }

    public h1(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar) {
        aVar.getClass();
        this.f24752a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    @Override // r52.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(t tVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar, p3.m mVar, int i14) {
        int i15;
        tVar.getClass();
        eVar.getClass();
        p3.o0 o0VarE = mVar.E(-384524835);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(tVar) : o0VarE.r(tVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 256 : 128;
        }
        boolean z14 = false;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar = this.f24752a;
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData();
            int i16 = i15 & 14;
            boolean zR = (i16 == 4 || ((i15 & 8) != 0 && o0VarE.r(tVar))) | o0VarE.r(j0Var);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new a(tVar, j0Var);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(tVar, j0Var);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) ((k23.g) objQ);
            if (i16 == 4 || ((i15 & 8) != 0 && o0VarE.r(tVar))) {
                z14 = true;
            }
            Object objQ2 = o0VarE.q();
            if (z14) {
                objQ2 = new b(tVar);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new b(tVar);
                    o0VarE.K(objQ2);
                }
            }
            i1.a(this, aVar, eVar, aVar3, (e23.q) ((k23.g) objQ2), o0VarE, ((i15 >> 6) & 14) | ((i15 << 3) & 896));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(this, tVar, eVar, i14, 21);
        }
    }
}
