package com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.h1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.io.Serializable;
import lc.u0;
import o13.r;
import o53.b0;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/AuthorizedUserConsentActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AuthorizedUserConsentActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f34946c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f34947a = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.a.class), new d(this), new rg0.e(this, 0), new e(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ve0.b f34948b = (ve0.b) KoinJavaComponent.get$default(ve0.b.class, null, null, 6, null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity$bindViewModel$1", f = "AuthorizedUserConsentActivity.kt", l = {83}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34949a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity$bindViewModel$1$1", f = "AuthorizedUserConsentActivity.kt", l = {84}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f34951a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthorizedUserConsentActivity f34952b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0592a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ AuthorizedUserConsentActivity f34953a;

                /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity$b$a$a$a, reason: collision with other inner class name */
                public static final /* synthetic */ class C0593a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f34954a;

                    static {
                        int[] iArr = new int[ue0.i.a.values().length];
                        try {
                            iArr[ue0.i.a.General.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[ue0.i.a.Unknown.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[ue0.i.a.MaximumDelegationsReached.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[ue0.i.a.MissingPrivileges.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        f34954a = iArr;
                    }
                }

                public C0592a(AuthorizedUserConsentActivity authorizedUserConsentActivity) {
                    this.f34953a = authorizedUserConsentActivity;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    ue0.i.a aVarA;
                    v2 v2Var = (v2) obj;
                    boolean z14 = v2Var instanceof v2.a;
                    AuthorizedUserConsentActivity authorizedUserConsentActivity = this.f34953a;
                    if (z14) {
                        a aVar = AuthorizedUserConsentActivity.f34946c;
                        authorizedUserConsentActivity.ea().f35019d.setValue(null);
                        authorizedUserConsentActivity.ea();
                        String str = ((v2.a) v2Var).f47385c;
                        if (str == null) {
                            str = "";
                        }
                        if (str.length() == 0) {
                            aVarA = ue0.i.a.Unknown;
                        } else {
                            try {
                                aVarA = ((ue0.i) GsonUtil.f47253b.fromJson(str, (Class) ue0.i.class)).a();
                            } catch (Throwable unused) {
                                aVarA = ue0.i.a.Unknown;
                            }
                        }
                        int i14 = C0593a.f34954a[aVarA.ordinal()];
                        if (i14 == 1 || i14 == 2) {
                            authorizedUserConsentActivity.displayFailedMessage();
                        } else if (i14 == 3) {
                            tg0.a.f164490a.getClass();
                            tg0.a.C3085a.b(authorizedUserConsentActivity).show();
                        } else {
                            if (i14 != 4) {
                                u0.r();
                                return null;
                            }
                            c22.f fVar = c22.f.f23050a;
                            String string = authorizedUserConsentActivity.getString(R.string.lbl_ok);
                            string.getClass();
                            c22.f.c(fVar, authorizedUserConsentActivity, R.string.unable_to_send_request, R.string.elevated_privileges_error_description, new o13.p(string, new r72.g((byte) 0, 18)), null, 112).show();
                        }
                    } else if (v2Var instanceof v2.b) {
                        Intent intentPutExtra = new Intent().putExtra("inviteResult", (Serializable) ((v2.b) v2Var).f47386a);
                        intentPutExtra.getClass();
                        authorizedUserConsentActivity.setResult(-1, intentPutExtra);
                        authorizedUserConsentActivity.finish();
                    } else if (v2Var != null) {
                        u0.r();
                        return null;
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AuthorizedUserConsentActivity authorizedUserConsentActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f34952b = authorizedUserConsentActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f34952b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity$b$a for r5v1 'this'  t13.d
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
                    int r1 = r5.f34951a
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
                    com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity$a r6 = com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity.f34946c
                    com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity r6 = r5.f34952b
                    com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.a r1 = r6.ea()
                    r53.p2 r1 = r1.f35019d
                    r53.b2 r1 = r53.s.d(r1)
                    com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity$b$a$a r4 = new com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity$b$a$a
                    r4.<init>(r6)
                    r5.f34951a = r3
                    r53.o2<T> r6 = r1.f150540a
                    java.lang.Object r6 = r6.collect(r4, r5)
                    if (r6 != r0) goto L35
                    return r0
                L35:
                    o2.c.f()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return AuthorizedUserConsentActivity.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f34949a;
            if (i14 == 0) {
                r.b(obj);
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                AuthorizedUserConsentActivity authorizedUserConsentActivity = AuthorizedUserConsentActivity.this;
                a aVar2 = new a(authorizedUserConsentActivity, null);
                this.f34949a = 1;
                if (h1.b(authorizedUserConsentActivity, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity$bindViewModel$2", f = "AuthorizedUserConsentActivity.kt", l = {119}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34955a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity$bindViewModel$2$1", f = "AuthorizedUserConsentActivity.kt", l = {120}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f34957a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthorizedUserConsentActivity f34958b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0594a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ AuthorizedUserConsentActivity f34959a;

                public C0594a(AuthorizedUserConsentActivity authorizedUserConsentActivity) {
                    this.f34959a = authorizedUserConsentActivity;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    AuthorizedUserConsentActivity authorizedUserConsentActivity = this.f34959a;
                    if (zBooleanValue) {
                        authorizedUserConsentActivity.showProgressOverlay();
                        return Unit.INSTANCE;
                    }
                    authorizedUserConsentActivity.hideProgressOverlay();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AuthorizedUserConsentActivity authorizedUserConsentActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f34958b = authorizedUserConsentActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f34958b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity$c$a for r5v1 'this'  t13.d
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
                    int r1 = r5.f34957a
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
                    com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity$a r6 = com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity.f34946c
                    com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity r6 = r5.f34958b
                    com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.a r1 = r6.ea()
                    r53.p2 r1 = r1.f35020e
                    r53.b2 r1 = r53.s.d(r1)
                    com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity$c$a$a r4 = new com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity$c$a$a
                    r4.<init>(r6)
                    r5.f34957a = r3
                    r53.o2<T> r6 = r1.f150540a
                    java.lang.Object r6 = r6.collect(r4, r5)
                    if (r6 != r0) goto L35
                    return r0
                L35:
                    o2.c.f()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedUserConsentActivity.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return AuthorizedUserConsentActivity.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f34955a;
            if (i14 == 0) {
                r.b(obj);
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                AuthorizedUserConsentActivity authorizedUserConsentActivity = AuthorizedUserConsentActivity.this;
                a aVar2 = new a(authorizedUserConsentActivity, null);
                this.f34955a = 1;
                if (h1.b(authorizedUserConsentActivity, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f34960a;

        public d(b.g gVar) {
            this.f34960a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f34960a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f34961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f34962b;

        public e(e23.a aVar, b.g gVar) {
            this.f34961a = aVar;
            this.f34962b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f34961a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f34962b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final void da() {
        ge1.b.T(f0.w(this), null, null, new b(null), 3);
        ge1.b.T(f0.w(this), null, null, new c(null), 3);
    }

    public final com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.a ea() {
        return (com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.a) this.f34947a.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        da();
        initComposeScreen(new z3.e(-1420696191, true, new r12.a(this, 12)));
        da();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/AuthorizedUserConsentActivity$a;", "", "<init>", "()V", "", "INVITEE_ID_KEY", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
