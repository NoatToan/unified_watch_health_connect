package tt0;

import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yt0.i0;
import yz1.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lo13/p;", "Lyz1/u;", "Lcom/garmin/android/apps/connectmobile/badges/service/model/i;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.domain.dashboard.GetChallengesDataUseCase$getBadgeTranslations$1", f = "GetChallengesDataUseCase.kt", l = {196, 197, 198}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<r53.j<? super o13.p<? extends u, ? extends com.garmin.android.apps.connectmobile.badges.service.model.i>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f166406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f166407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f166408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f166408c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f166408c, dVar);
        hVar.f166407b = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super o13.p<? extends u, ? extends com.garmin.android.apps.connectmobile.badges.service.model.i>> jVar, t13.d<? super Unit> dVar) {
        return ((h) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r0.emit(r2, r7) == r1) goto L20;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f166407b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f166406a;
        if (i14 == 0) {
            r.b(obj);
            o13.p pVar = new o13.p(u.LOADING, null);
            this.f166407b = jVar;
            this.f166406a = 1;
            if (jVar.emit(pVar, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else if (i14 == 2) {
            r.b(obj);
            o13.p pVar2 = new o13.p(u.SUCCESS, (com.garmin.android.apps.connectmobile.badges.service.model.i) obj);
            this.f166407b = null;
            this.f166406a = 3;
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        i0 i0Var = this.f166408c.f166398b;
        this.f166407b = jVar;
        this.f166406a = 2;
        obj = i0Var.a(this);
        if (obj != aVar) {
            o13.p pVar3 = new o13.p(u.SUCCESS, (com.garmin.android.apps.connectmobile.badges.service.model.i) obj);
            this.f166407b = null;
            this.f166406a = 3;
        }
        return aVar;
    }
}
