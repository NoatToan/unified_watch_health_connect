package pu;

import com.garmin.android.apps.connectmobile.k1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationViewModel$shouldCollectDob$2", f = "PostUserAuthenticationViewModel.kt", l = {129}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f141128b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(j0 j0Var, t13.d<? super l0> dVar) {
        super(2, dVar);
        this.f141128b = j0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l0(this.f141128b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((l0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141127a;
        j0 j0Var = this.f141128b;
        if (i14 == 0) {
            o13.r.b(obj);
            dq1.a aVar2 = j0Var.f141096c;
            this.f141127a = 1;
            obj = aVar2.a(this);
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i15 = j0.f141093h;
        j0Var.getClass();
        return Boolean.valueOf(k1.f37122a.r() && zBooleanValue);
    }
}
