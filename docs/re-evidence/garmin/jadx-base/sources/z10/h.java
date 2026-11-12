package z10;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.BaseConsentActivity$observeViewModel$2", f = "BaseConsentActivity.kt", l = {339}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.consent.a f201019b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.consent.BaseConsentActivity$observeViewModel$2$1", f = "BaseConsentActivity.kt", l = {340}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f201020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.consent.a f201021b;

        /* JADX INFO: renamed from: z10.h$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3757a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.consent.a f201022a;

            public C3757a(com.garmin.android.apps.connectmobile.consent.a aVar) {
                this.f201022a = aVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                c1 c1Var = (c1) obj;
                boolean z14 = c1Var.f200930a;
                com.garmin.android.apps.connectmobile.consent.a aVar = this.f201022a;
                if (z14) {
                    aVar.showProgressOverlay();
                } else {
                    aVar.hideProgressOverlay();
                }
                Boolean bool = c1Var.f200931b;
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    int i14 = com.garmin.android.apps.connectmobile.consent.a.f32246n;
                    aVar.ra(zBooleanValue);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.apps.connectmobile.consent.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f201021b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f201021b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to z10.h$a for r5v1 'this'  t13.d
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
                int r1 = r5.f201020a
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
                com.garmin.android.apps.connectmobile.consent.a r6 = r5.f201021b
                z10.j r1 = r6.pa()
                r53.p2 r1 = r1.f201060c
                r53.b2 r1 = r53.s.d(r1)
                z10.h$a$a r4 = new z10.h$a$a
                r4.<init>(r6)
                r5.f201020a = r3
                r53.o2<T> r6 = r1.f150540a
                java.lang.Object r6 = r6.collect(r4, r5)
                if (r6 != r0) goto L35
                return r0
            L35:
                o2.c.f()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: z10.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.garmin.android.apps.connectmobile.consent.a aVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f201019b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f201019b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201018a;
        if (i14 == 0) {
            o13.r.b(obj);
            androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.CREATED;
            com.garmin.android.apps.connectmobile.consent.a aVar2 = this.f201019b;
            a aVar3 = new a(aVar2, null);
            this.f201018a = 1;
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
