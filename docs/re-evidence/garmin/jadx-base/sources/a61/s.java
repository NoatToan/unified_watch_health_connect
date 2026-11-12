package a61;

import am.x0;
import am.y0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListDTO;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.StrengthStatsRepo$getActivities$2", f = "StrengthStatsRepo.kt", l = {50}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.l<t13.d<? super c83.a0<ActivityListDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f1669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f1670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f1671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1673f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, DateTime dateTime, DateTime dateTime2, int i14, int i15, t13.d<? super s> dVar) {
        super(1, dVar);
        this.f1669b = rVar;
        this.f1670c = dateTime;
        this.f1671d = dateTime2;
        this.f1672e = i14;
        this.f1673f = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new s(this.f1669b, this.f1670c, this.f1671d, this.f1672e, this.f1673f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ActivityListDTO>> dVar) {
        return ((s) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f1668a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        b bVar = this.f1669b.f1666h;
        String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
        int iG = ((y0) KoinJavaComponent.get$default(y0.class, null, null, 6, null)).g(x0.f4309n1);
        fz0.e eVarD = fz0.d.d(this.f1670c);
        fz0.e eVarD2 = fz0.d.d(this.f1671d);
        this.f1668a = 1;
        Object objB = bVar.b(userDisplayName, iG, eVarD, eVarD2, this.f1672e, this.f1673f, this);
        return objB == aVar ? aVar : objB;
    }
}
