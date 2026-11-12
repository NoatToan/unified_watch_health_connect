package so;

import am.b2;
import c83.a0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListDTO;
import e23.l;
import o13.r;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.activities.map.repository.ActivityMapRepositoryImpl$getActivities$2", f = "ActivityMapRepositoryImpl.kt", l = {18}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<d<? super a0<ActivityListDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DateTime f160427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f160428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f160429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f160430e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DateTime dateTime, DateTime dateTime2, int i14, int i15, d<? super b> dVar) {
        super(1, dVar);
        this.f160427b = dateTime;
        this.f160428c = dateTime2;
        this.f160429d = i14;
        this.f160430e = i15;
    }

    @Override // v13.a
    public final d<Unit> create(d<?> dVar) {
        return new b(this.f160427b, this.f160428c, this.f160429d, this.f160430e, dVar);
    }

    @Override // e23.l
    public final Object invoke(d<? super a0<ActivityListDTO>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160426a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        b2 b2Var = (b2) KoinJavaComponent.get$default(b2.class, null, null, 6, null);
        String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
        fz0.e eVarD = fz0.d.d(this.f160427b);
        fz0.e eVarD2 = fz0.d.d(this.f160428c);
        this.f160426a = 1;
        Object objV = b2Var.v(userDisplayName, eVarD, eVarD2, this.f160429d, this.f160430e, false, this);
        return objV == aVar ? aVar : objV;
    }
}
