package re0;

import com.garmin.android.apps.connectmobile.v2;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lue0/k;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domainfamilyaccounts.api.ManagedAccountsRepositoryImpl$getViewableAccounts$2", f = "ManagedAccountsRepositoryImpl.kt", l = {52}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends ue0.k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f152185b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lue0/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.domainfamilyaccounts.api.ManagedAccountsRepositoryImpl$getViewableAccounts$2$1", f = "ManagedAccountsRepositoryImpl.kt", l = {53}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<ue0.k>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f152186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h0 f152187b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h0 h0Var, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f152187b = h0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f152187b, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<ue0.k>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f152186a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            i0<c83.a0<ue0.k>> i0VarU = this.f152187b.f152135a.u();
            this.f152186a = 1;
            Object objAwait = i0VarU.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(h0 h0Var, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f152185b = h0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f152185b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends ue0.k>> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152184a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        h0 h0Var = this.f152185b;
        a aVar2 = new a(h0Var, null);
        this.f152184a = 1;
        h0Var.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(h0Var, aVar2, this);
        return objJ == aVar ? aVar : objJ;
    }
}
