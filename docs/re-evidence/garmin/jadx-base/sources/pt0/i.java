package pt0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lmo1/d;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.AutoChallengeLeaderboardViewModel$getConversation$1", f = "AutoChallengeLeaderboardViewModel.kt", l = {54, 64}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<t0<v2<? extends mo1.d>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f140696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f140697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f140698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f140699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f140700e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lmo1/d;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.viewmodel.AutoChallengeLeaderboardViewModel$getConversation$1$conversationResult$1", f = "AutoChallengeLeaderboardViewModel.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends mo1.d>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f140701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f140702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f140703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f140704d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, String str, String str2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f140702b = gVar;
            this.f140703c = str;
            this.f140704d = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f140702b, this.f140703c, this.f140704d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends mo1.d>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f140701a;
            if (i14 == 0) {
                o13.r.b(obj);
                fo1.f fVar = this.f140702b.f140674a;
                this.f140701a = 1;
                obj = fVar.a(this.f140703c, this.f140704d, this);
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
                v2.b bVar = (v2.b) v2Var;
                mo1.d dVar = (mo1.d) bVar.f47386a;
                if (dVar.getUuid() == null) {
                    dVar = null;
                }
                return new v2.b(dVar, bVar.f47387b, null, null, 12, null);
            }
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar2 = (v2.a) v2Var;
            return new v2.a(aVar2.f47383a, aVar2.f47384b, aVar2.f47385c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, String str, String str2, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f140698c = gVar;
        this.f140699d = str;
        this.f140700e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f140698c, this.f140699d, this.f140700e, dVar);
        iVar.f140697b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(t0<v2<? extends mo1.d>> t0Var, t13.d<? super Unit> dVar) {
        return ((i) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r0.emit((com.garmin.android.apps.connectmobile.v2) r10, r9) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        t0 t0Var = (t0) this.f140697b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f140696a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        x53.c cVar = s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        a aVar2 = new a(this.f140698c, this.f140699d, this.f140700e, null);
        this.f140697b = t0Var;
        this.f140696a = 1;
        obj = ge1.b.e0(bVar, aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f140697b = null;
        this.f140696a = 2;
    }
}
