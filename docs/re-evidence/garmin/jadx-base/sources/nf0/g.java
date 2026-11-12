package nf0;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.t0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Landroid/content/Intent;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.GHSAccountViewModel$getMFAFlowIntent$1", f = "GHSAccountViewModel.kt", l = {102, 102}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<t0<Intent>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t0 f125794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f125795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f125796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f125797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f125798e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, Activity activity, t13.d<? super g> dVar2) {
        super(2, dVar2);
        this.f125797d = dVar;
        this.f125798e = activity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f125797d, this.f125798e, dVar);
        gVar.f125796c = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(t0<Intent> t0Var, t13.d<? super Unit> dVar) {
        return ((g) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0 t0Var = (t0) this.f125796c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125795b;
        if (i14 != 0) {
            if (i14 == 1) {
                t0Var = this.f125794a;
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
        ff0.i iVar = this.f125797d.f125784a;
        this.f125796c = null;
        this.f125794a = t0Var;
        this.f125795b = 1;
        obj = iVar.l(this.f125798e, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f125796c = null;
        this.f125794a = null;
        this.f125795b = 2;
    }
}
