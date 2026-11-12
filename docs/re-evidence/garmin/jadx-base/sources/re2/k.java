package re2;

import android.content.Context;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r1.q2;
import te2.a2;
import te2.e2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$isMFAGloballyEnabled$2", f = "AuthenticationHelper.kt", l = {1830}, m = "invokeSuspend")
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ve2.d f152311b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ve2.d dVar, t13.d<? super k> dVar2) {
        super(2, dVar2);
        this.f152311b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f152311b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152310a;
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
            bVar.I("isMFAGloballyEnabled");
        }
        e2 e2Var = new e2();
        Context contextB = bVar.b();
        ve2.l lVarM = b.m();
        this.f152310a = 1;
        ve2.d dVar = this.f152311b;
        dd2.a aVar2 = dVar.f177695f;
        if (aVar2 == null) {
            q2.u("'GarminAccount.credentials' is null");
            return null;
        }
        if (aVar2.f59204a == null && aVar2.f59205b == null && aVar2.f59206c == null) {
            q2.u("all 'GarminAccount.credentials' attributes are null");
            return null;
        }
        x53.c cVar = s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new a2(e2Var, aVar2, contextB, dVar, lVarM, null), this);
        return objE0 == aVar ? aVar : objE0;
    }
}
