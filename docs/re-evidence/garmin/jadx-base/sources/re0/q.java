package re0;

import com.garmin.android.apps.connectmobile.v2;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lue0/f;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domainfamilyaccounts.api.ManagedAccountsRepositoryImpl$authorizeManageAccountView$2", f = "ManagedAccountsRepositoryImpl.kt", l = {94}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends ue0.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f152155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ue0.e f152156c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lue0/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.domainfamilyaccounts.api.ManagedAccountsRepositoryImpl$authorizeManageAccountView$2$1", f = "ManagedAccountsRepositoryImpl.kt", l = {101}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<ue0.f>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f152157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h0 f152158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ue0.e f152159c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h0 h0Var, ue0.e eVar, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f152158b = h0Var;
            this.f152159c = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f152158b, this.f152159c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<ue0.f>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f152157a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            n nVar = this.f152158b.f152135a;
            ue0.e eVar = this.f152159c;
            i0<c83.a0<ue0.f>> i0VarV = nVar.v(eVar.getResponseType(), eVar.getSubjectUserId(), eVar.getClientId(), eVar.getCodeChallenge(), eVar.getCodeChallengeMethod());
            this.f152157a = 1;
            Object objAwait = i0VarV.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(h0 h0Var, ue0.e eVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f152155b = h0Var;
        this.f152156c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f152155b, this.f152156c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends ue0.f>> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152154a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ue0.e eVar = this.f152156c;
        h0 h0Var = this.f152155b;
        a aVar2 = new a(h0Var, eVar, null);
        this.f152154a = 1;
        h0Var.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(h0Var, aVar2, this);
        return objJ == aVar ? aVar : objJ;
    }
}
