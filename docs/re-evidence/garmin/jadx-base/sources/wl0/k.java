package wl0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.truswing.GolfSwingAnalysisViewModel$deleteSwing$1", f = "GolfSwingAnalysisViewModel.kt", l = {35, 35}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<t0<v2<? extends Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t0 f185943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f185944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f185945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.golf.truswing.c f185946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f185947e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.garmin.android.apps.connectmobile.golf.truswing.c cVar, long j8, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f185946d = cVar;
        this.f185947e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f185946d, this.f185947e, dVar);
        kVar.f185945c = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(t0<v2<? extends Unit>> t0Var, t13.d<? super Unit> dVar) {
        return ((k) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0 t0Var = (t0) this.f185945c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f185944b;
        if (i14 != 0) {
            if (i14 == 1) {
                t0Var = this.f185943a;
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
        ql0.b bVar = this.f185946d.f35814a;
        String strValueOf = String.valueOf(this.f185947e);
        this.f185945c = null;
        this.f185943a = t0Var;
        this.f185944b = 1;
        bVar.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(bVar, new ql0.c(bVar, strValueOf, null), this);
        if (obj != aVar) {
        }
        return aVar;
        this.f185945c = null;
        this.f185943a = null;
        this.f185944b = 2;
    }
}
