package yt0;

import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.AdHocChallengesRepository$saveAdHocChallengeName$2", f = "AdHocChallengesRepository.kt", l = {68}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f199560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdHocChallengeDTO f199561c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(a aVar, AdHocChallengeDTO adHocChallengeDTO, t13.d<? super o> dVar) {
        super(1, dVar);
        this.f199560b = aVar;
        this.f199561c = adHocChallengeDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o(this.f199560b, this.f199561c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199559a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        lt0.a aVar2 = this.f199560b.f199413a;
        AdHocChallengeDTO adHocChallengeDTO = this.f199561c;
        String str = adHocChallengeDTO.f37993g;
        if (str == null) {
            str = "";
        }
        o53.i0<c83.a0<Unit>> i0VarO = aVar2.o(str, adHocChallengeDTO);
        this.f199559a = 1;
        Object objAwait = i0VarO.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
