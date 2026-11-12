package z10;

import com.garmin.android.apps.connectmobile.consent.ProductImprovementConsentActivity;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.ProductImprovementConsentActivity$observeSuspendedChild$1", f = "ProductImprovementConsentActivity.kt", l = {171}, m = "invokeSuspend", v = 2)
public final class t2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProductImprovementConsentActivity f201256b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.consent.ProductImprovementConsentActivity$observeSuspendedChild$1$1", f = "ProductImprovementConsentActivity.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f201257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ProductImprovementConsentActivity f201258b;

        /* JADX INFO: renamed from: z10.t2$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3759a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ProductImprovementConsentActivity f201259a;

            public C3759a(ProductImprovementConsentActivity productImprovementConsentActivity) {
                this.f201259a = productImprovementConsentActivity;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                Boolean bool = (Boolean) obj;
                ProductImprovementConsentActivity productImprovementConsentActivity = this.f201259a;
                if (bool != null) {
                    productImprovementConsentActivity.hideProgressOverlay();
                }
                if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                    d1.n(productImprovementConsentActivity, new xg1.l(productImprovementConsentActivity, 17));
                } else if (p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                    ProductImprovementConsentActivity.a aVar = ProductImprovementConsentActivity.f32230h;
                    productImprovementConsentActivity.fa();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ProductImprovementConsentActivity productImprovementConsentActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f201258b = productImprovementConsentActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f201258b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to z10.t2$a for r5v1 'this'  t13.d
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
                int r1 = r5.f201257a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L14
                if (r1 == r3) goto L10
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r6)
                return r2
            L10:
                o13.r.b(r6)
                goto L39
            L14:
                o13.r.b(r6)
                com.garmin.android.apps.connectmobile.consent.ProductImprovementConsentActivity$a r6 = com.garmin.android.apps.connectmobile.consent.ProductImprovementConsentActivity.f32230h
                com.garmin.android.apps.connectmobile.consent.ProductImprovementConsentActivity r6 = r5.f201258b
                androidx.lifecycle.w1 r1 = r6.f32237g
                java.lang.Object r1 = r1.getValue()
                com.garmin.android.apps.connectmobile.consent.f r1 = (com.garmin.android.apps.connectmobile.consent.f) r1
                r53.p2 r1 = r1.f32285b
                r53.b2 r1 = r53.s.d(r1)
                z10.t2$a$a r4 = new z10.t2$a$a
                r4.<init>(r6)
                r5.f201257a = r3
                r53.o2<T> r6 = r1.f150540a
                java.lang.Object r6 = r6.collect(r4, r5)
                if (r6 != r0) goto L39
                return r0
            L39:
                o2.c.f()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: z10.t2.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(ProductImprovementConsentActivity productImprovementConsentActivity, t13.d<? super t2> dVar) {
        super(2, dVar);
        this.f201256b = productImprovementConsentActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t2(this.f201256b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201255a;
        if (i14 == 0) {
            o13.r.b(obj);
            androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
            ProductImprovementConsentActivity productImprovementConsentActivity = this.f201256b;
            a aVar2 = new a(productImprovementConsentActivity, null);
            this.f201255a = 1;
            if (androidx.lifecycle.h1.b(productImprovementConsentActivity, bVar, aVar2, this) == aVar) {
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
