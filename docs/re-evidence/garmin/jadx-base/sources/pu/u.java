package pu;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/m;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/userprofile/model/m;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationCaller$execute$fetchSocialProfile$1", f = "PostUserAuthenticationCaller.kt", l = {73}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super com.garmin.android.apps.connectmobile.userprofile.model.m>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f141168b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(n nVar, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f141168b = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f141168b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super com.garmin.android.apps.connectmobile.userprofile.model.m> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141167a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        this.f141167a = 1;
        int i15 = n.f141134l;
        Object objH = this.f141168b.h(0, this);
        return objH == aVar ? aVar : objH;
    }
}
