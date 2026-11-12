package aq1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceWakefulService;
import com.garmin.android.apps.connectmobile.i2;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupRepo$triggerStartupTasks$2", f = "StartupRepo.kt", l = {36, 37, 74}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f12386c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, t13.d<? super i0> dVar) {
        super(2, dVar);
        this.f12386c = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i0 i0Var = new i0(this.f12386c, dVar);
        i0Var.f12385b = obj;
        return i0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0109  */
    /* JADX WARN: Code duplicated, block: B:31:0x0122  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013e, code lost:
    
        if (r1.k(r9, r17) == r2) goto L34;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jG;
        zb0.b bVarA;
        o53.b0 b0Var = (o53.b0) this.f12385b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12384a;
        Context context = this.f12386c;
        if (i14 == 0) {
            o13.r.b(obj);
            GarminDeviceWakefulService.g("StartupRepo", false);
            ed0.a aVar = ed0.a.f63825a;
            this.f12385b = b0Var;
            this.f12384a = 1;
            aVar.getClass();
            if (ed0.a.j("StartupRepo", this) != obj2) {
            }
            return obj2;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.l.g().getClass();
            gh2.i iVar = gh2.i.f77458c;
            jG = iVar.a().f77477b.g("weather_cache_expiration_minutes");
            com.garmin.android.apps.connectmobile.l.g().getClass();
            long jG2 = iVar.a().f77477b.g("weather_cache_min_distance_meters");
            com.garmin.android.apps.connectmobile.l.g().getClass();
            long jG3 = iVar.a().f77477b.g("weather_request_delay_on_error_minutes");
            com.garmin.android.apps.connectmobile.l.g().getClass();
            long jG4 = iVar.a().f77477b.g("weather_current_conditions_cache_expiration_minutes");
            ak0.t tVar = new ak0.t(15);
            Object objInvoke = tVar.invoke();
            StringBuilder sbK = ds.e0.k(jG, "WeatherService.initialize cacheTTLMinutes[", "], cacheMaxRangeMeters[");
            sbK.append(jG2);
            j20.x.j(jG3, "], failedCallBackoffMinutes[", "], currentConditionsCacheTTLMinutes[", sbK);
            sbK.append(jG4);
            sbK.append("], isMBTester[");
            sbK.append(objInvoke);
            sbK.append("]");
            String string = sbK.toString();
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "StartupRepo", string);
            if (jG != 0 || jG4 == 0) {
                cu2.h.g(30, 4000, 5, 30, cu2.g.f55757a);
            } else {
                cu2.h.g((int) jG, (int) jG2, (int) jG3, (int) jG4, tVar);
            }
            yx0.b.a(context);
            bVarA = zb0.b.a();
            bVarA.getClass();
            j22.b.f96736a.getClass();
            if (j22.b.b(context)) {
                bVarA.postDelayed(new za.j(2, bVarA, context), 2000L);
            }
            td2.a.b();
            com.garmin.android.apps.connectmobile.i iVar2 = com.garmin.android.apps.connectmobile.i.f36758a;
            this.f12385b = null;
            this.f12384a = 3;
            obj2 = obj2;
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        mz0.a.f121640a.getClass();
        nz0.b bVarA2 = mz0.a.a();
        bVarA2.f128379a.clear();
        bVarA2.f128380b.clear();
        com.garmin.android.apps.connectmobile.newsfeed.a.f39473a.getClass();
        com.garmin.android.apps.connectmobile.newsfeed.a.f39474b.f148604g = true;
        return Unit.INSTANCE;
        com.garmin.android.apps.connectmobile.u.a aVar3 = com.garmin.android.apps.connectmobile.u.f46488a;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f12385b = b0Var;
        this.f12384a = 2;
        aVar3.getClass();
        x53.c cVar = s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new com.garmin.android.apps.connectmobile.q(applicationContext, null), this);
        if (objE0 != obj2) {
            objE0 = Unit.INSTANCE;
        }
        if (objE0 != obj2) {
            com.garmin.android.apps.connectmobile.l.g().getClass();
            gh2.i iVar3 = gh2.i.f77458c;
            jG = iVar3.a().f77477b.g("weather_cache_expiration_minutes");
            com.garmin.android.apps.connectmobile.l.g().getClass();
            long jG5 = iVar3.a().f77477b.g("weather_cache_min_distance_meters");
            com.garmin.android.apps.connectmobile.l.g().getClass();
            long jG6 = iVar3.a().f77477b.g("weather_request_delay_on_error_minutes");
            com.garmin.android.apps.connectmobile.l.g().getClass();
            long jG7 = iVar3.a().f77477b.g("weather_current_conditions_cache_expiration_minutes");
            ak0.t tVar2 = new ak0.t(15);
            Object objInvoke2 = tVar2.invoke();
            StringBuilder sbK2 = ds.e0.k(jG, "WeatherService.initialize cacheTTLMinutes[", "], cacheMaxRangeMeters[");
            sbK2.append(jG5);
            j20.x.j(jG6, "], failedCallBackoffMinutes[", "], currentConditionsCacheTTLMinutes[", sbK2);
            sbK2.append(jG7);
            sbK2.append("], isMBTester[");
            sbK2.append(objInvoke2);
            sbK2.append("]");
            String string2 = sbK2.toString();
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var2, "StartupRepo", string2);
            if (jG != 0) {
                cu2.h.g(30, 4000, 5, 30, cu2.g.f55757a);
            } else {
                cu2.h.g(30, 4000, 5, 30, cu2.g.f55757a);
            }
            yx0.b.a(context);
            bVarA = zb0.b.a();
            bVarA.getClass();
            j22.b.f96736a.getClass();
            if (j22.b.b(context)) {
                bVarA.postDelayed(new za.j(2, bVarA, context), 2000L);
            }
            td2.a.b();
            com.garmin.android.apps.connectmobile.i iVar4 = com.garmin.android.apps.connectmobile.i.f36758a;
            this.f12385b = null;
            this.f12384a = 3;
            obj2 = obj2;
        }
        return obj2;
    }
}
