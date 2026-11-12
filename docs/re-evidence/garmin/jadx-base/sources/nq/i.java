package nq;

import androidx.lifecycle.y0;
import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import o13.r;
import o53.b0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.rounds.edit.RoundsViewModel$saveRounds$1", f = "RoundsViewModel.kt", l = {98}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f126900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0<fw.m<com.garmin.android.apps.connectmobile.activities.newmodel.f>> f126901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f126902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.newmodel.f f126903e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(y0<fw.m<com.garmin.android.apps.connectmobile.activities.newmodel.f>> y0Var, k kVar, com.garmin.android.apps.connectmobile.activities.newmodel.f fVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f126901c = y0Var;
        this.f126902d = kVar;
        this.f126903e = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f126901c, this.f126902d, this.f126903e, dVar);
        iVar.f126900b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f126900b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126899a;
        com.garmin.android.apps.connectmobile.activities.newmodel.f fVar = this.f126903e;
        k kVar = this.f126902d;
        y0<fw.m<com.garmin.android.apps.connectmobile.activities.newmodel.f>> y0Var = this.f126901c;
        try {
            if (i14 == 0) {
                r.b(obj);
                y0Var.j(fw.m.a.f(fw.m.f73767e, null, null, 3));
                i0<a0<Unit>> i0VarA = ((g) kVar.f126919d.getValue()).a(kVar.f126916a, fVar);
                this.f126900b = b0Var;
                this.f126899a = 1;
                obj = i0VarA.await(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            if (((a0) obj).f25745a.isSuccessful()) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "RoundsViewModel", "saveRounds%Success");
                k.x4(kVar, fVar, y0Var);
            } else {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var2, "RoundsViewModel", "saveRounds%Exception fetching data");
                y0Var.j(fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5));
            }
        } catch (Throwable th3) {
            String strN = fb1.c.n("saveRounds%Exception fetching data: ", th3.getMessage());
            i2.a aVar4 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var3, "RoundsViewModel", strN);
            fw.m.f73767e.getClass();
            y0Var.j(fw.m.a.a(null, th3));
        }
        return Unit.INSTANCE;
    }
}
