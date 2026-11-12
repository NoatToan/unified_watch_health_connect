package av;

import com.google.mlkit.common.MlKitException;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/badges/service/model/m;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.service.retrofit.BadgesRepo$getEarnedBadges$2", f = "BadgesRepo.kt", l = {MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends com.garmin.android.apps.connectmobile.badges.service.model.m>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f13140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<Integer> f13141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<Integer> f13142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13144f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(g gVar, List<Integer> list, List<Integer> list2, int i14, int i15, t13.d<? super x> dVar) {
        super(1, dVar);
        this.f13140b = gVar;
        this.f13141c = list;
        this.f13142d = list2;
        this.f13143e = i14;
        this.f13144f = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new x(this.f13140b, this.f13141c, this.f13142d, this.f13143e, this.f13144f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends com.garmin.android.apps.connectmobile.badges.service.model.m>>> dVar) {
        return ((x) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13139a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<List<com.garmin.android.apps.connectmobile.badges.service.model.m>>> i0VarA = this.f13140b.f13084a.a(this.f13141c, this.f13142d, this.f13143e, this.f13144f);
        this.f13139a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
