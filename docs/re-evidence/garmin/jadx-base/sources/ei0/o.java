package ei0;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/userprofile/model/d;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.FollowRepoImpl$getBlockedUsersList$2", f = "FollowRepoImpl.kt", l = {PsExtractor.VIDEO_STREAM_MASK}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends com.garmin.android.apps.connectmobile.userprofile.model.d>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f64280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f64281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f64282d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e eVar, int i14, int i15, t13.d<? super o> dVar) {
        super(1, dVar);
        this.f64280b = eVar;
        this.f64281c = i14;
        this.f64282d = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o(this.f64280b, this.f64281c, this.f64282d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends com.garmin.android.apps.connectmobile.userprofile.model.d>>> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64279a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<com.garmin.android.apps.connectmobile.userprofile.model.d>>> i0VarC = this.f64280b.f64198b.c(this.f64281c, this.f64282d);
        this.f64279a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
