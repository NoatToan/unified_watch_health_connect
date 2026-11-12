package ym0;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$getGroupActivityFeedItem$2", f = "GroupRepo.kt", l = {53}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.l<t13.d<? super c83.a0<ActivityListItemDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f198042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f198043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f198044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f198045d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a aVar, String str, String str2, t13.d<? super s> dVar) {
        super(1, dVar);
        this.f198043b = aVar;
        this.f198044c = str;
        this.f198045d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new s(this.f198043b, this.f198044c, this.f198045d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ActivityListItemDTO>> dVar) {
        return ((s) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f198042a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<ActivityListItemDTO>> i0VarB = this.f198043b.f197888b.b(this.f198044c, this.f198045d);
        this.f198042a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
