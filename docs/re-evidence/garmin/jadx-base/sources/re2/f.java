package re2;

import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import te2.e2;
import te2.x1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lve2/k;", "<anonymous>", "(Lo53/b0;)Lve2/k;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$getMFATokenData$2", f = "AuthenticationHelper.kt", l = {1765}, m = "invokeSuspend")
public final class f extends v13.i implements e23.p<o53.b0, t13.d<? super ve2.k>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152287a;

    public f(t13.d<? super f> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super ve2.k> dVar) {
        return new f(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152287a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        new e2();
        this.f152287a = 1;
        x53.c cVar = s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new x1(true, true, null), this);
        return objE0 == aVar ? aVar : objE0;
    }
}
