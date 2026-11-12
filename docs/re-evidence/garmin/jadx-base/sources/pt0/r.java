package pt0;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yt0.r0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.BadgeChallengesViewModel$badgeChallengeOptOut$1", f = "BadgeChallengesViewModel.kt", l = {83}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.l<t13.d<? super v2<? extends String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f140776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f140777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f140778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f140779d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar, String str, long j8, t13.d<? super r> dVar) {
        super(1, dVar);
        this.f140777b = pVar;
        this.f140778c = str;
        this.f140779d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new r(this.f140777b, this.f140778c, this.f140779d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends String>> dVar) {
        return ((r) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f140776a;
        p pVar = this.f140777b;
        if (i14 == 0) {
            o13.r.b(obj);
            r0 r0Var = pVar.f140755b;
            this.f140776a = 1;
            obj = r0Var.g(this.f140778c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            p.x4(pVar, this.f140779d);
            ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
            return new v2.b(this.f140778c, ((v2.b) v2Var).f47387b, null, null, 12, null);
        }
        if (v2Var instanceof v2.a) {
            v2.a aVar2 = (v2.a) v2Var;
            return new v2.a(aVar2.f47383a, aVar2.f47384b, aVar2.f47385c);
        }
        u0.r();
        return null;
    }
}
