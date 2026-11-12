package r70;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import l70.n0;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.UserFocusViewModel$fetchUserFocus$1", f = "UserFocusViewModel.kt", l = {212}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f151039b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(z zVar, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f151039b = zVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f151039b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        g3 g3VarA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151038a;
        z zVar = this.f151039b;
        if (i14 == 0) {
            o13.r.b(obj);
            n0 n0Var = zVar.f151117a;
            this.f151038a = 1;
            obj = n0Var.j3(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            j70.r.a aVar2 = j70.r.f97623f;
            String userFocus = ((j70.y) ((v2.b) v2Var).f47386a).getUserFocus();
            aVar2.getClass();
            j70.r rVarA = j70.r.a.a(userFocus);
            zVar.f151122f = rVarA;
            g3.f35298f.getClass();
            g3VarA = g3.a.d(rVarA);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            zVar.y4(true);
            g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
        }
        zVar.f151127k.k(null, g3VarA);
        return Unit.INSTANCE;
    }
}
