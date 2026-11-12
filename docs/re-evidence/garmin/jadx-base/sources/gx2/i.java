package gx2;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.SaMDHelper$onUserSignedOut$1", f = "SaMDHelper.kt", l = {}, m = "invokeSuspend")
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
    public i(t13.d<? super i> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return new i(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        try {
            qx2.a.f148445a.h(kx2.a.ECG, false);
        } catch (Exception e4) {
            b.f80060a.getClass();
            b.d.b().error("onUserSignedOut", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
