package rg0;

import androidx.lifecycle.h1;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewerDetailActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewerDetailActivity$bindViewModel$1", f = "AuthorizedViewerDetailActivity.kt", l = {105}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthorizedViewerDetailActivity f152575b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewerDetailActivity$bindViewModel$1$1", f = "AuthorizedViewerDetailActivity.kt", l = {106}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f152576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AuthorizedViewerDetailActivity f152577b;

        /* JADX INFO: renamed from: rg0.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2870a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AuthorizedViewerDetailActivity f152578a;

            public C2870a(AuthorizedViewerDetailActivity authorizedViewerDetailActivity) {
                this.f152578a = authorizedViewerDetailActivity;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                AuthorizedViewerDetailActivity authorizedViewerDetailActivity = this.f152578a;
                if (zBooleanValue) {
                    authorizedViewerDetailActivity.showProgressOverlay();
                    return Unit.INSTANCE;
                }
                authorizedViewerDetailActivity.hideProgressOverlay();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AuthorizedViewerDetailActivity authorizedViewerDetailActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f152577b = authorizedViewerDetailActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f152577b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f152576a;
            if (i14 == 0) {
                o13.r.b(obj);
                AuthorizedViewerDetailActivity.a aVar2 = AuthorizedViewerDetailActivity.f34963c;
                AuthorizedViewerDetailActivity authorizedViewerDetailActivity = this.f152577b;
                com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.e eVar = authorizedViewerDetailActivity.da().f35042h;
                C2870a c2870a = new C2870a(authorizedViewerDetailActivity);
                this.f152576a = 1;
                if (eVar.collect(c2870a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AuthorizedViewerDetailActivity authorizedViewerDetailActivity, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f152575b = authorizedViewerDetailActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f152575b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152574a;
        if (i14 == 0) {
            o13.r.b(obj);
            androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
            AuthorizedViewerDetailActivity authorizedViewerDetailActivity = this.f152575b;
            a aVar2 = new a(authorizedViewerDetailActivity, null);
            this.f152574a = 1;
            if (h1.b(authorizedViewerDetailActivity, bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
