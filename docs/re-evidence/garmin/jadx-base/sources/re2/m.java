package re2;

import android.content.Context;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import te2.d2;
import te2.e2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$isPermanentMFAEnabled$2", f = "AuthenticationHelper.kt", l = {1851}, m = "invokeSuspend")
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ve2.d f152319b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ve2.d dVar, t13.d<? super m> dVar2) {
        super(2, dVar2);
        this.f152319b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f152319b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152318a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        b bVar = b.f152215a;
        bVar.L();
        if (b.u()) {
            bVar.I("isPermanentMFAEnabled");
        }
        dd2.a aVar2 = this.f152319b.f177695f;
        aVar2.getClass();
        if (aVar2.f59205b == null) {
            vb.h.z("isPermanentMFAEnabled: account.credentials.oAuth2ITData is null");
            return null;
        }
        e2 e2Var = new e2();
        Context contextB = bVar.b();
        ve2.l lVarM = b.m();
        this.f152318a = 1;
        x53.c cVar = s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new d2(this.f152319b, contextB, lVarM, e2Var, null), this);
        return objE0 == aVar ? aVar : objE0;
    }
}
