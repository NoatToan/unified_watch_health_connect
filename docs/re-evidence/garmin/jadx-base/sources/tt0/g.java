package tt0;

import c80.q;
import com.google.mlkit.common.MlKitException;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zd0.j1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.domain.dashboard.GetChallengesDataUseCase$checkPremiumAccess$1", f = "GetChallengesDataUseCase.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<r53.j<? super Boolean>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f166403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f166404b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.domain.dashboard.GetChallengesDataUseCase$checkPremiumAccess$1$hasGCPlusSocialFeature$1", f = "GetChallengesDataUseCase.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f166405a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f166405a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
            q qVar = q.SOCIAL;
            this.f166405a = 1;
            Object objL = j1Var.l(qVar, this);
            return objL == aVar ? aVar : objL;
        }
    }

    public g(t13.d<? super g> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(dVar);
        gVar.f166404b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super Boolean> jVar, t13.d<? super Unit> dVar) {
        return ((g) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        r53.j jVar = (r53.j) this.f166404b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f166403a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        x53.c cVar = s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        a aVar2 = new a(null);
        this.f166404b = jVar;
        this.f166403a = 1;
        obj = ge1.b.e0(bVar, aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        this.f166404b = null;
        this.f166403a = 2;
    }
}
