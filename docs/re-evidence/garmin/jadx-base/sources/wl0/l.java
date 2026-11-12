package wl0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lcom/garmin/android/apps/connectmobile/golf/truswing/model/k;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.truswing.GolfSwingAnalysisViewModel$getClubList$1", f = "GolfSwingAnalysisViewModel.kt", l = {24, 24}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<t0<v2<? extends List<com.garmin.android.apps.connectmobile.golf.truswing.model.k>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t0 f185948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f185949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f185950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.golf.truswing.c f185951d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.garmin.android.apps.connectmobile.golf.truswing.c cVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f185951d = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f185951d, dVar);
        lVar.f185950c = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(t0<v2<? extends List<com.garmin.android.apps.connectmobile.golf.truswing.model.k>>> t0Var, t13.d<? super Unit> dVar) {
        return ((l) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        t0 t0Var = (t0) this.f185950c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f185949b;
        if (i14 != 0) {
            if (i14 == 1) {
                t0Var = this.f185948a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        ql0.b bVar = this.f185951d.f35814a;
        this.f185950c = null;
        this.f185948a = t0Var;
        this.f185949b = 1;
        bVar.getClass();
        d80.c cVar = new d80.c(qd2.a.b.CLUB_LIST, 15);
        qc.c cVar2 = new qc.c(13);
        c83.d<String> dVarE = bVar.f145210a.e(false, false, false, true);
        x53.c cVar3 = s0.f129406a;
        obj = ge1.b.e0(x53.b.f189152a, new ql0.d(cVar, cVar2, bVar, dVarE, null), this);
        if (obj != aVar) {
        }
        return aVar;
        this.f185950c = null;
        this.f185948a = null;
        this.f185949b = 2;
    }
}
