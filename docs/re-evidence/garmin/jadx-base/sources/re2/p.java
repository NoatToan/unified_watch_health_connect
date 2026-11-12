package re2;

import android.content.Context;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import te2.j2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$onDeleteGarminAccountScheduled$1", f = "AuthenticationHelper.kt", l = {}, m = "invokeSuspend")
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {
    public p(t13.d<? super p> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return new p(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        b.f152216b.debug("onDeleteGarminAccountScheduled: deleting sys acct...");
        try {
            j2 j2Var = j2.f164115a;
            Context contextB = b.f152215a.b();
            j2Var.getClass();
            j2.j(contextB);
        } catch (Throwable th3) {
            b.f152216b.error("onDeleteGarminAccountScheduled: deleting sys acct", th3);
        }
        return Unit.INSTANCE;
    }
}
