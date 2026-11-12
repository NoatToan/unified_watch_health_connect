package rg0;

import androidx.lifecycle.h1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewerDetailActivity;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewerDetailActivity$bindViewModel$3", f = "AuthorizedViewerDetailActivity.kt", l = {139}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthorizedViewerDetailActivity f152582b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewerDetailActivity$bindViewModel$3$1", f = "AuthorizedViewerDetailActivity.kt", l = {140}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f152583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AuthorizedViewerDetailActivity f152584b;

        /* JADX INFO: renamed from: rg0.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2871a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AuthorizedViewerDetailActivity f152585a;

            /* JADX INFO: renamed from: rg0.m$a$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C2872a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f152586a;

                static {
                    int[] iArr = new int[fw.p.values().length];
                    try {
                        iArr[fw.p.SUCCESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[fw.p.ERROR.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[fw.p.LOADING.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f152586a = iArr;
                }
            }

            public C2871a(AuthorizedViewerDetailActivity authorizedViewerDetailActivity) {
                this.f152585a = authorizedViewerDetailActivity;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                fw.m mVar = (fw.m) obj;
                fw.p pVar = mVar != null ? mVar.f73769b : null;
                int i14 = pVar == null ? -1 : C2872a.f152586a[pVar.ordinal()];
                if (i14 != -1) {
                    AuthorizedViewerDetailActivity authorizedViewerDetailActivity = this.f152585a;
                    if (i14 == 1) {
                        AuthorizedViewerDetailActivity.a aVar = AuthorizedViewerDetailActivity.f34963c;
                        authorizedViewerDetailActivity.da().f35040f.setValue(null);
                        ve0.a aVar2 = (ve0.a) mVar.f73770c;
                        if (aVar2 != null) {
                            aVar2.b(authorizedViewerDetailActivity);
                            return Unit.INSTANCE;
                        }
                        authorizedViewerDetailActivity.displayFailedMessage();
                    } else if (i14 == 2) {
                        if (mVar.f73771d instanceof fw.t) {
                            AuthorizedViewerDetailActivity.a aVar3 = AuthorizedViewerDetailActivity.f34963c;
                            authorizedViewerDetailActivity.getClass();
                            c22.f fVar = c22.f.f23050a;
                            String string = authorizedViewerDetailActivity.getString(R.string.lbl_ok);
                            string.getClass();
                            androidx.appcompat.app.e eVarC = c22.f.c(fVar, authorizedViewerDetailActivity, R.string.unable_to_view_account, R.string.account_cant_be_viewed_privileges, new o13.p(string, new r72.g((byte) 0, 21)), null, 112);
                            androidx.appcompat.app.e eVar = authorizedViewerDetailActivity.f34965b;
                            if (eVar != null) {
                                eVar.dismiss();
                            }
                            eVarC.show();
                            authorizedViewerDetailActivity.f34965b = eVarC;
                        } else {
                            AuthorizedViewerDetailActivity.a aVar4 = AuthorizedViewerDetailActivity.f34963c;
                            String string2 = authorizedViewerDetailActivity.getString(R.string.lbl_ok);
                            string2.getClass();
                            androidx.appcompat.app.e eVarC2 = c22.f.c(c22.f.f23050a, authorizedViewerDetailActivity, R.string.pregnancy_something_went_wrong, R.string.unable_to_grant_account_access, new o13.p(string2, new r72.g((byte) 0, 20)), null, 112);
                            androidx.appcompat.app.e eVar2 = authorizedViewerDetailActivity.f34965b;
                            if (eVar2 != null) {
                                eVar2.dismiss();
                            }
                            eVarC2.show();
                            authorizedViewerDetailActivity.f34965b = eVarC2;
                        }
                        authorizedViewerDetailActivity.da().f35040f.setValue(null);
                    } else if (i14 != 3) {
                        u0.r();
                        return null;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AuthorizedViewerDetailActivity authorizedViewerDetailActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f152584b = authorizedViewerDetailActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f152584b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to rg0.m$a for r5v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r5.f152583a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L14
                if (r1 == r3) goto L10
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r6)
                return r2
            L10:
                o13.r.b(r6)
                goto L35
            L14:
                o13.r.b(r6)
                com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewerDetailActivity$a r6 = com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewerDetailActivity.f34963c
                com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewerDetailActivity r6 = r5.f152584b
                com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d r1 = r6.da()
                r53.p2 r1 = r1.f35040f
                r53.b2 r1 = r53.s.d(r1)
                rg0.m$a$a r4 = new rg0.m$a$a
                r4.<init>(r6)
                r5.f152583a = r3
                r53.o2<T> r6 = r1.f150540a
                java.lang.Object r6 = r6.collect(r4, r5)
                if (r6 != r0) goto L35
                return r0
            L35:
                o2.c.f()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: rg0.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AuthorizedViewerDetailActivity authorizedViewerDetailActivity, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f152582b = authorizedViewerDetailActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f152582b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152581a;
        if (i14 == 0) {
            o13.r.b(obj);
            androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
            AuthorizedViewerDetailActivity authorizedViewerDetailActivity = this.f152582b;
            a aVar2 = new a(authorizedViewerDetailActivity, null);
            this.f152581a = 1;
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
