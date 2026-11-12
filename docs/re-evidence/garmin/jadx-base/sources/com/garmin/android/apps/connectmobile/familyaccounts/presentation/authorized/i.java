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
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersViewModel$createIncomingInvites$items$1$1", f = "AuthorizedViewersViewModel.kt", l = {369}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super f>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f35128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ue0.d f35129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h.c f35130d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, ue0.d dVar, h.c cVar, t13.d<? super i> dVar2) {
        super(2, dVar2);
        this.f35128b = hVar;
        this.f35129c = dVar;
        this.f35130d = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f35128b, this.f35129c, this.f35130d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super f> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f35127a;
        ue0.d dVar = this.f35129c;
        if (i14 == 0) {
            r.b(obj);
            Long userId = dVar.getUserId();
            this.f35127a = 1;
            obj = this.f35128b.F4(userId, this);
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
            return new f.C0601f(h0VarL, location != null ? location : "", u0.a.EnumC1362a.Child);
        }
        if (dVar.getStatus() == ue0.c.PENDING) {
            h0 h0VarL2 = og2.k.l(dVar, lVar);
            String location2 = dVar.getLocation();
            return new f.d(h0VarL2, location2 != null ? location2 : "", p13.h0.R(this.f35130d.f35108c, dVar));
        }
        h0 h0VarL3 = og2.k.l(dVar, lVar);
        String location3 = dVar.getLocation();
        return new f.a(h0VarL3, location3 != null ? location3 : "", u0.a.EnumC1362a.ReceivedInvite);
    }
}
