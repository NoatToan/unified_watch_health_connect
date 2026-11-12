package dm;

import am.x0;
import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldm/i0;", "Lew/a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i0 extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f60351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f60352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0 f60353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f60354m;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.biz.BaseActivitySummaryStatsOperation$getStrengthTrainingExerciseSet$1", f = "BaseActivitySummaryStatsOperation.kt", l = {111}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f60355a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f60357c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f60355a = obj;
            this.f60357c |= Integer.MIN_VALUE;
            return i0.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(o oVar, long j8, x0 x0Var, boolean z14) {
        super(oVar);
        this.f60351j = oVar;
        this.f60352k = j8;
        this.f60353l = x0Var;
        this.f60354m = z14;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f60357c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f60357c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objJ = aVar.f60355a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f60357c;
        if (i15 == 0) {
            o13.r.b(objJ);
            cw.s sVarA = cw.s.a.a(cw.s.f55945b);
            aVar.f60357c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(sVarA, new cw.t(sVarA, this.f60352k, null), aVar);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
            }
            lc.u0.r();
            return null;
        }
        com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
        o oVar = this.f60351j;
        aq.d dVar2 = (aq.d) oVar.f50097g.get(eVar);
        ExerciseSetsDTO exerciseSetsDTO = (ExerciseSetsDTO) ((v2.b) v2Var).f47386a;
        dVar2.f11880b = exerciseSetsDTO;
        if (exerciseSetsDTO != null) {
            x0 x0Var = this.f60353l;
            x0Var.getClass();
            oVar.b(new jw.j(x0Var, this.f60354m, oVar, new com.google.android.exoplayer2.analytics.q(11, oVar, x0Var)));
        }
        return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
    }
}
