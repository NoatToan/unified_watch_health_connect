package av;

import com.garmin.android.apps.connectmobile.badges.service.model.SimpleBadgeDTO;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/badges/service/model/SimpleBadgeDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.service.retrofit.BadgesRepo$fetchEarnedBadgesByActivityDetail$2", f = "BadgesRepo.kt", l = {58}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends SimpleBadgeDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f13102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f13104d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, String str, String str2, t13.d<? super l> dVar) {
        super(1, dVar);
        this.f13102b = gVar;
        this.f13103c = str;
        this.f13104d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l(this.f13102b, this.f13103c, this.f13104d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends SimpleBadgeDTO>>> dVar) {
        return ((l) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13101a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<List<SimpleBadgeDTO>>> i0VarK = this.f13102b.f13084a.k(this.f13103c, this.f13104d);
        this.f13101a = 1;
        Object objAwait = i0VarK.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
