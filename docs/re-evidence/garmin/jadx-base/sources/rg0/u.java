package rg0;

import androidx.lifecycle.h1;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity$observeViewModel$4", f = "AuthorizedViewersActivity.kt", l = {293}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthorizedViewersActivity f152623b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity$observeViewModel$4$1", f = "AuthorizedViewersActivity.kt", l = {294}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f152624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AuthorizedViewersActivity f152625b;

        /* JADX INFO: renamed from: rg0.u$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2879a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AuthorizedViewersActivity f152626a;

            public C2879a(AuthorizedViewersActivity authorizedViewersActivity) {
                this.f152626a = authorizedViewersActivity;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                AuthorizedViewersActivity authorizedViewersActivity = this.f152626a;
                if (zBooleanValue) {
                    AuthorizedViewersActivity.a aVar = AuthorizedViewersActivity.f34974m;
                    fw.m mVar = (fw.m) authorizedViewersActivity.ia().f35098n.getValue();
                    if ((mVar != null ? (List) mVar.f73770c : null) == null) {
                        authorizedViewersActivity.ga().setVisibility(8);
                    }
                    if (!authorizedViewersActivity.f37121d.f11021c) {
                        authorizedViewersActivity.showProgressOverlay();
                    }
                } else {
                    AuthorizedViewersActivity.a aVar2 = AuthorizedViewersActivity.f34974m;
                    authorizedViewersActivity.ga().setVisibility(0);
                    authorizedViewersActivity.hideProgressOverlay();
                    authorizedViewersActivity.ca();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AuthorizedViewersActivity authorizedViewersActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f152625b = authorizedViewersActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f152625b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f152624a;
            if (i14 == 0) {
                o13.r.b(obj);
                AuthorizedViewersActivity.a aVar2 = AuthorizedViewersActivity.f34974m;
                AuthorizedViewersActivity authorizedViewersActivity = this.f152625b;
                com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h.e eVar = authorizedViewersActivity.ia().f35103t;
                C2879a c2879a = new C2879a(authorizedViewersActivity);
                this.f152624a = 1;
                if (eVar.collect(c2879a, this) == aVar) {
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
    public u(AuthorizedViewersActivity authorizedViewersActivity, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f152623b = authorizedViewersActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f152623b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152622a;
        if (i14 == 0) {
            o13.r.b(obj);
            androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
            AuthorizedViewersActivity authorizedViewersActivity = this.f152623b;
            a aVar2 = new a(authorizedViewersActivity, null);
            this.f152622a = 1;
            if (h1.b(authorizedViewersActivity, bVar, aVar2, this) == aVar) {
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
