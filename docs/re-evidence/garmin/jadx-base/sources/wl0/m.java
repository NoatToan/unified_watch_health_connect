package wl0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/golf/truswing/model/SwingDTO;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.truswing.GolfSwingAnalysisViewModel$getSwingDetail$1", f = "GolfSwingAnalysisViewModel.kt", l = {33, 33}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<t0<v2<? extends SwingDTO>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t0 f185952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f185953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f185954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.golf.truswing.c f185955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f185956e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.garmin.android.apps.connectmobile.golf.truswing.c cVar, long j8, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f185955d = cVar;
        this.f185956e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f185955d, this.f185956e, dVar);
        mVar.f185954c = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(t0<v2<? extends SwingDTO>> t0Var, t13.d<? super Unit> dVar) {
        return ((m) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0 t0Var = (t0) this.f185954c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f185953b;
        if (i14 != 0) {
            if (i14 == 1) {
                t0Var = this.f185952a;
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
        ql0.b bVar = this.f185955d.f35814a;
        String strValueOf = String.valueOf(this.f185956e);
        this.f185954c = null;
        this.f185952a = t0Var;
        this.f185953b = 1;
        bVar.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(bVar, new ql0.e(bVar, strValueOf, null), this);
        if (obj != aVar) {
        }
        return aVar;
        this.f185954c = null;
        this.f185952a = null;
        this.f185953b = 2;
    }
}
