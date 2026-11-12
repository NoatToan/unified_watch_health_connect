package hz0;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedRepo$fetchActivityPost$2", f = "NewsFeedRepo.kt", l = {48}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.l<t13.d<? super c83.a0<ActivityListItemDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f86465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f86466c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, long j8, t13.d<? super o> dVar) {
        super(1, dVar);
        this.f86465b = mVar;
        this.f86466c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o(this.f86465b, this.f86466c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ActivityListItemDTO>> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86464a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<ActivityListItemDTO>> i0VarC = this.f86465b.f86459a.c(String.valueOf(this.f86466c), p13.x.k("PREMIUM_FRIEND", "FRAMED_THUMBNAIL"));
        this.f86464a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
