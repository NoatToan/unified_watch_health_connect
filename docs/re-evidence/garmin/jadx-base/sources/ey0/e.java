package ey0;

import am.b2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.repository.MultiDayActivitiesRepository$getActivityList$2", f = "MultiDayActivitiesRepository.kt", l = {106}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.l<t13.d<? super c83.a0<ActivityListDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f67151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f67152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz0.e f67153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz0.e f67154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f67155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f67156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f67157h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g0 g0Var, String str, fz0.e eVar, fz0.e eVar2, int i14, int i15, boolean z14, t13.d<? super e> dVar) {
        super(1, dVar);
        this.f67151b = g0Var;
        this.f67152c = str;
        this.f67153d = eVar;
        this.f67154e = eVar2;
        this.f67155f = i14;
        this.f67156g = i15;
        this.f67157h = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e(this.f67151b, this.f67152c, this.f67153d, this.f67154e, this.f67155f, this.f67156g, this.f67157h, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ActivityListDTO>> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67150a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        b2 b2Var = (b2) this.f67151b.f67176c.getValue();
        this.f67150a = 1;
        Object objV = b2Var.v(this.f67152c, this.f67153d, this.f67154e, this.f67155f, this.f67156g, this.f67157h, this);
        return objV == aVar ? aVar : objV;
    }
}
