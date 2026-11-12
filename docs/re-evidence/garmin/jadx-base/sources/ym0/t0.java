package ym0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$updateConnectionGroup$2", f = "GroupRepo.kt", l = {423}, m = "invokeSuspend", v = 2)
public final class t0 extends v13.i implements e23.l<t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.connections.groups.services.model.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f198052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f198053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f198054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f198055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.connections.groups.services.model.b f198056e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(a aVar, String str, String str2, com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar, t13.d<? super t0> dVar) {
        super(1, dVar);
        this.f198053b = aVar;
        this.f198054c = str;
        this.f198055d = str2;
        this.f198056e = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new t0(this.f198053b, this.f198054c, this.f198055d, this.f198056e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.connections.groups.services.model.b>> dVar) {
        return ((t0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f198052a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<com.garmin.android.apps.connectmobile.connections.groups.services.model.b>> i0VarP = this.f198053b.f197888b.p(this.f198054c, this.f198055d, this.f198056e);
        this.f198052a = 1;
        Object objAwait = i0VarP.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
