package sa1;

import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.BiometricsRepo$saveCyclingAbilityForPowerZones$2", f = "BiometricsRepo.kt", l = {19}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.l<t13.d<? super c83.a0<PowerZonesDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f158265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f158266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f158267c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, t13.d<? super e> dVar) {
        super(1, dVar);
        this.f158266b = cVar;
        this.f158267c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e(this.f158266b, this.f158267c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<PowerZonesDTO>> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f158265a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<PowerZonesDTO>> i0VarA = this.f158266b.f158262a.a(this.f158267c);
        this.f158265a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
