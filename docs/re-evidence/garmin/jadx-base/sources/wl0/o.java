package wl0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/golf/truswing/model/m;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.truswing.GolfSwingAnalysisViewModel$getSwingSessionsForUser$1", f = "GolfSwingAnalysisViewModel.kt", l = {22, 22}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<t0<v2<? extends com.garmin.android.apps.connectmobile.golf.truswing.model.m>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t0 f185962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f185963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f185964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.golf.truswing.c f185965d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.garmin.android.apps.connectmobile.golf.truswing.c cVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f185965d = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f185965d, dVar);
        oVar.f185964c = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(t0<v2<? extends com.garmin.android.apps.connectmobile.golf.truswing.model.m>> t0Var, t13.d<? super Unit> dVar) {
        return ((o) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        t0 t0Var = (t0) this.f185964c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f185963b;
        if (i14 != 0) {
            if (i14 == 1) {
                t0Var = this.f185962a;
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
        ql0.b bVar = this.f185965d.f35814a;
        this.f185964c = null;
        this.f185962a = t0Var;
        this.f185963b = 1;
        bVar.getClass();
        d80.c cVar = new d80.c(qd2.a.b.GOLF_SWING_LIST, PsExtractor.VIDEO_STREAM_MASK);
        qc.c cVar2 = new qc.c(12);
        c83.d<String> dVarD = bVar.f145210a.d(false, 1, Integer.MAX_VALUE);
        x53.c cVar3 = s0.f129406a;
        obj = ge1.b.e0(x53.b.f189152a, new ql0.d(cVar, cVar2, bVar, dVarD, null), this);
        if (obj != aVar) {
        }
        return aVar;
        this.f185964c = null;
        this.f185962a = null;
        this.f185963b = 2;
    }
}
