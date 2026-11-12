package z10;

import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.BaseConsentActivity$observeViewModel$1", f = "BaseConsentActivity.kt", l = {302}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f200997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.consent.a f200998b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.consent.BaseConsentActivity$observeViewModel$1$1", f = "BaseConsentActivity.kt", l = {303}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f200999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.consent.a f201000b;

        /* JADX INFO: renamed from: z10.g$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3755a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.consent.a f201001a;

            /* JADX INFO: renamed from: z10.g$a$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C3756a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f201002a;

                static {
                    int[] iArr = new int[z0.values().length];
                    try {
                        iArr[z0.CONSENT_PARENTAL_REQUEST_IN_PROGRESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[z0.CONSENT_PARENTAL_REQUEST_ERROR.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[z0.CONSENT_PARENTAL_REQUEST_NEEDED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[z0.CONSENT_PARENTAL_ALREADY_REQUESTED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[z0.CONSENT_PARENTAL_REQUESTED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f201002a = iArr;
                }
            }

            public C3755a(com.garmin.android.apps.connectmobile.consent.a aVar) {
                this.f201001a = aVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                int i14 = C3756a.f201002a[((z0) obj).ordinal()];
                com.garmin.android.apps.connectmobile.consent.a aVar = this.f201001a;
                if (i14 == 1) {
                    aVar.showProgressOverlay();
                } else if (i14 == 2) {
                    aVar.hideProgressOverlay();
                    int i15 = com.garmin.android.apps.connectmobile.consent.a.f32246n;
                    aVar.displayFailedMessage();
                } else if (i14 == 3) {
                    aVar.hideProgressOverlay();
                    d1 d1Var = d1.f200951a;
                    b bVar = new b(aVar, 1);
                    d1Var.getClass();
                    d1.v(bVar, aVar);
                } else if (i14 == 4) {
                    aVar.hideProgressOverlay();
                    d1.m(d1.f200951a, aVar);
                } else if (i14 == 5) {
                    aVar.hideProgressOverlay();
                    r22.q0.b bVar2 = r22.q0.f149800b;
                    View viewFindViewById = aVar.findViewById(R.id.content_frame);
                    viewFindViewById.getClass();
                    String string = aVar.getString(R.string.msg_request_sent);
                    string.getClass();
                    r22.q0.b.c(bVar2, viewFindViewById, string, null, 4).show();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.apps.connectmobile.consent.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f201000b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f201000b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to z10.g$a for r5v1 'this'  t13.d
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
                int r1 = r5.f200999a
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
                int r6 = com.garmin.android.apps.connectmobile.consent.a.f32246n
                com.garmin.android.apps.connectmobile.consent.a r6 = r5.f201000b
                z10.j r1 = r6.pa()
                r53.p2 r1 = r1.f201061d
                r53.b2 r1 = r53.s.d(r1)
                z10.g$a$a r4 = new z10.g$a$a
                r4.<init>(r6)
                r5.f200999a = r3
                r53.o2<T> r6 = r1.f150540a
                java.lang.Object r6 = r6.collect(r4, r5)
                if (r6 != r0) goto L35
                return r0
            L35:
                o2.c.f()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: z10.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.garmin.android.apps.connectmobile.consent.a aVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f200998b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f200998b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f200997a;
        if (i14 == 0) {
            o13.r.b(obj);
            androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.CREATED;
            com.garmin.android.apps.connectmobile.consent.a aVar2 = this.f200998b;
            a aVar3 = new a(aVar2, null);
            this.f200997a = 1;
            if (androidx.lifecycle.h1.b(aVar2, bVar, aVar3, this) == aVar) {
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
