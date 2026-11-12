package rg0;

import androidx.lifecycle.h1;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity$observeViewModel$2", f = "AuthorizedViewersActivity.kt", l = {254}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthorizedViewersActivity f152611b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity$observeViewModel$2$1", f = "AuthorizedViewersActivity.kt", l = {255}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f152612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AuthorizedViewersActivity f152613b;

        /* JADX INFO: renamed from: rg0.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2875a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AuthorizedViewersActivity f152614a;

            /* JADX INFO: renamed from: rg0.s$a$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C2876a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f152615a;

                static {
                    int[] iArr = new int[fw.p.values().length];
                    try {
                        iArr[fw.p.LOADING.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[fw.p.ERROR.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[fw.p.SUCCESS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f152615a = iArr;
                }
            }

            public C2875a(AuthorizedViewersActivity authorizedViewersActivity) {
                this.f152614a = authorizedViewersActivity;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                fw.m mVar = (fw.m) obj;
                fw.p pVar = mVar != null ? mVar.f73769b : null;
                int i14 = pVar == null ? -1 : C2876a.f152615a[pVar.ordinal()];
                if (i14 != -1 && i14 != 1) {
                    AuthorizedViewersActivity authorizedViewersActivity = this.f152614a;
                    if (i14 == 2) {
                        AuthorizedViewersActivity.a aVar = AuthorizedViewersActivity.f34974m;
                        authorizedViewersActivity.ia().f35099o.setValue(null);
                        Integer num = (Integer) mVar.f73770c;
                        if (num != null && num.intValue() == 400) {
                            tg0.a.f164490a.getClass();
                            tg0.a.C3085a.a(authorizedViewersActivity).show();
                        } else {
                            authorizedViewersActivity.displayFailedMessage();
                        }
                    } else {
                        if (i14 != 3) {
                            u0.r();
                            return null;
                        }
                        AuthorizedViewersActivity.a aVar2 = AuthorizedViewersActivity.f34974m;
                        authorizedViewersActivity.ia().f35099o.setValue(null);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AuthorizedViewersActivity authorizedViewersActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f152613b = authorizedViewersActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f152613b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f152612a;
            if (i14 == 0) {
                o13.r.b(obj);
                AuthorizedViewersActivity.a aVar2 = AuthorizedViewersActivity.f34974m;
                AuthorizedViewersActivity authorizedViewersActivity = this.f152613b;
                p2 p2Var = authorizedViewersActivity.ia().f35100p;
                C2875a c2875a = new C2875a(authorizedViewersActivity);
                this.f152612a = 1;
                if (p2Var.collect(c2875a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            o2.c.f();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(AuthorizedViewersActivity authorizedViewersActivity, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f152611b = authorizedViewersActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f152611b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152610a;
        if (i14 == 0) {
            o13.r.b(obj);
            androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
            AuthorizedViewersActivity authorizedViewersActivity = this.f152611b;
            a aVar2 = new a(authorizedViewersActivity, null);
            this.f152610a = 1;
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
