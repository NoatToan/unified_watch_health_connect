package ff0;

import c83.a0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/devices/model/s;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.data.EcgRepositoryImpl$getActivitySummary$4$devices$1", f = "EcgRepositoryImpl.kt", l = {94}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.l<t13.d<? super a0<com.garmin.android.apps.connectmobile.devices.model.s>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f71104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f71105c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v vVar, String str, t13.d<? super r> dVar) {
        super(1, dVar);
        this.f71104b = vVar;
        this.f71105c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new r(this.f71104b, this.f71105c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<com.garmin.android.apps.connectmobile.devices.model.s>> dVar) {
        return ((r) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f71103a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<a0<com.garmin.android.apps.connectmobile.devices.model.s>> i0VarI = this.f71104b.f71116c.i(this.f71105c);
        this.f71103a = 1;
        Object objAwait = i0VarI.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
