package re2;

import android.content.Context;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import te2.c2;
import te2.e2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$isMFATokenValid$2", f = "AuthenticationHelper.kt", l = {1794, 1792}, m = "invokeSuspend")
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e2 f152312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f152313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f152314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f152315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f152315d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f152315d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Context context;
        e2 e2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152314c;
        if (i14 == 0) {
            o13.r.b(obj);
            if (d53.w.J(this.f152315d)) {
                vb.h.s("mfaToken is blank");
                return null;
            }
            b bVar = b.f152215a;
            bVar.L();
            bVar.I("isMFATokenValid");
            e2 e2Var2 = new e2();
            Context contextB = bVar.b();
            this.f152312a = e2Var2;
            this.f152313b = contextB;
            this.f152314c = 1;
            Object objJ = b.j(this);
            if (objJ != aVar) {
                context = contextB;
                e2Var = e2Var2;
                obj = objJ;
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
        Context context2 = this.f152313b;
        e2 e2Var3 = this.f152312a;
        o13.r.b(obj);
        context = context2;
        e2Var = e2Var3;
        obj.getClass();
        ve2.d dVar = (ve2.d) obj;
        b.f152215a.getClass();
        ve2.l lVarM = b.m();
        this.f152312a = null;
        this.f152313b = null;
        this.f152314c = 2;
        e2Var.getClass();
        x53.c cVar = s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new c2(context, dVar, this.f152315d, lVarM, e2Var, null), this);
        return objE0 == aVar ? aVar : objE0;
    }
}
