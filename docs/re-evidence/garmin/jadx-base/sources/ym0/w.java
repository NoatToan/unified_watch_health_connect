package ym0;

import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengePlayerDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupChallengePlayerDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$getGroupChallengePlayers$2", f = "GroupRepo.kt", l = {438}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends GroupChallengePlayerDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f198076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f198077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f198078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f198079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f198080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a aVar, String str, int i14, int i15, t13.d<? super w> dVar) {
        super(1, dVar);
        this.f198077b = aVar;
        this.f198078c = str;
        this.f198079d = i14;
        this.f198080e = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new w(this.f198077b, this.f198078c, this.f198079d, this.f198080e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends GroupChallengePlayerDTO>>> dVar) {
        return ((w) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f198076a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<GroupChallengePlayerDTO>>> i0VarS = this.f198077b.f197888b.s(this.f198078c, this.f198079d, this.f198080e);
        this.f198076a = 1;
        Object objAwait = i0VarS.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
