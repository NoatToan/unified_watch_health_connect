package wn1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.InviteSocialRepository$declineInviteForDevice$2", f = "InviteSocialRepository.kt", l = {31}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.smartscale.model.b f186338b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.garmin.android.apps.connectmobile.smartscale.model.b bVar, t13.d<? super w> dVar) {
        super(1, dVar);
        this.f186338b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new w(this.f186338b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((w) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186337a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        s sVarA = t.a.a(t.f186332a);
        com.garmin.android.apps.connectmobile.smartscale.model.b bVar = this.f186338b;
        Long deviceInviteID = bVar.getDeviceInviteID();
        long jLongValue = deviceInviteID != null ? deviceInviteID.longValue() : 0L;
        this.f186337a = 1;
        Object objF = sVarA.f(bVar, jLongValue, this);
        return objF == aVar ? aVar : objF;
    }
}
