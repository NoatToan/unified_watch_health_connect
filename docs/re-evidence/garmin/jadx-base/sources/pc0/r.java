package pc0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/devices/model/l;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.repo.DevicesRepo$getDeviceInfo$2", f = "DevicesRepo.kt", l = {139}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.l<t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.devices.model.l>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f137283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f137284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f137285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f137286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f137287e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(j jVar, long j8, String str, String str2, t13.d<? super r> dVar) {
        super(1, dVar);
        this.f137284b = jVar;
        this.f137285c = j8;
        this.f137286d = str;
        this.f137287e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new r(this.f137284b, this.f137285c, this.f137286d, this.f137287e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.devices.model.l>> dVar) {
        return ((r) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137283a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<com.garmin.android.apps.connectmobile.devices.model.l>> i0VarL = this.f137284b.f137224a.l(this.f137285c, this.f137286d, this.f137287e);
        this.f137283a = 1;
        Object objAwait = i0VarL.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
