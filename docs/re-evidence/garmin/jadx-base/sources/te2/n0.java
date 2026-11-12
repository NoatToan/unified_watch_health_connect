package te2;

import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ltc2/c;", "<anonymous>", "(Lo53/b0;)Ltc2/c;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.CustomerAgeManager$getCachedAgeStatusResponse$2", f = "CustomerAgeManager.kt", l = {66}, m = "invokeSuspend")
public final class n0 extends v13.i implements e23.p<o53.b0, t13.d<? super tc2.c>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f164195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f164196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f164197c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(k0 k0Var, t13.d<? super n0> dVar) {
        super(2, dVar);
        this.f164197c = k0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n0 n0Var = new n0(this.f164197c, dVar);
        n0Var.f164196b = obj;
        return n0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super tc2.c> dVar) {
        return ((n0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164195a;
        if (i14 == 0) {
            o13.r.b(obj);
            k0 k0Var = this.f164197c;
            String strB = k0.b(k0Var);
            if (strB != null) {
                rc2.r.f151943h.getClass();
                return rc2.r.a.a(strB);
            }
            ((Logger) k0Var.f164138a.getValue()).warn("getCachedAgeStatusResponse: no cached age status response found, calling endpoint...");
            this.f164195a = 1;
            obj = k0Var.c(this);
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
        return (tc2.c) obj;
    }
}
