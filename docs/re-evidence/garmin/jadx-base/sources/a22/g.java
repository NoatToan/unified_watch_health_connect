package a22;

import c83.a0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListDTO;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.repo.UserProfileActivitiesRepo$getRecentActivitySummaryWithSocialInfo$2", f = "UserProfileActivitiesRepo.kt", l = {15}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.l<t13.d<? super a0<ActivityListDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f535e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, String str, int i14, int i15, t13.d<? super g> dVar) {
        super(1, dVar);
        this.f532b = hVar;
        this.f533c = str;
        this.f534d = i14;
        this.f535e = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g(this.f532b, this.f533c, this.f534d, this.f535e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<ActivityListDTO>> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f531a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<ActivityListDTO>> i0VarA = this.f532b.f536a.a(this.f533c, this.f534d, this.f535e);
        this.f531a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
