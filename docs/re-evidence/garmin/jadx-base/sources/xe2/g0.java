package xe2;

import com.garmin.android.library.mobileauth.ui.DeleteAccountActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.DeleteAccountActivity$isChinaEnvironment$2", f = "DeleteAccountActivity.kt", l = {295, 295}, m = "invokeSuspend")
public final class g0 extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public re2.l0 f190480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f190481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountActivity f190482c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(DeleteAccountActivity deleteAccountActivity, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f190482c = deleteAccountActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g0(this.f190482c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((g0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        re2.l0 l0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190481b;
        if (i14 == 0) {
            o13.r.b(obj);
            l0Var = re2.l0.f152316a;
            this.f190480a = l0Var;
            this.f190481b = 1;
            obj = this.f190482c.L7(this);
            if (obj != aVar) {
            }
        }
        if (i14 != 1) {
            if (i14 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        l0Var = this.f190480a;
        o13.r.b(obj);
        this.f190480a = null;
        this.f190481b = 2;
        l0Var.getClass();
        x53.c cVar = o53.s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new re2.j0((ve2.d) obj, null), this);
        return objE0 == aVar ? aVar : objE0;
    }
}
