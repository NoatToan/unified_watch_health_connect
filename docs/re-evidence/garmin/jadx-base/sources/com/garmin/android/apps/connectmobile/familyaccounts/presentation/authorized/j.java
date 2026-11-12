package com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized;

import e23.p;
import ei0.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rg0.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersViewModel$createViewersOfThisAccount$items$1$1", f = "AuthorizedViewersViewModel.kt", l = {340}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super f>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f35132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ue0.d f35133c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, ue0.d dVar, t13.d<? super j> dVar2) {
        super(2, dVar2);
        this.f35132b = hVar;
        this.f35133c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f35132b, this.f35133c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super f> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f35131a;
        ue0.d dVar = this.f35133c;
        if (i14 == 0) {
            r.b(obj);
            Long userId = dVar.getUserId();
            this.f35131a = 1;
            obj = this.f35132b.F4(userId, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) obj;
        if (dVar instanceof ue0.l) {
            h0 h0VarL = og2.k.l(dVar, lVar);
            String location = ((ue0.l) dVar).getLocation();
            return new f.C0601f(h0VarL, location != null ? location : "", u0.a.EnumC1362a.AdminGuardian);
        }
        if (dVar.getStatus() == ue0.c.PENDING) {
            return new f.h(og2.k.l(dVar, lVar));
        }
        h0 h0VarL2 = og2.k.l(dVar, lVar);
        String location2 = dVar.getLocation();
        return new f.a(h0VarL2, location2 != null ? location2 : "", u0.a.EnumC1362a.IssuedInvite);
    }
}
