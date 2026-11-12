package ug2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.main.MainViewKt$MainView$6$1", f = "MainView.kt", l = {300}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f170792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f170793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mg2.g f170794c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ mg2.g f170795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0 f170796b;

        /* JADX INFO: renamed from: ug2.i0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.livesessionview.ui.main.MainViewKt$MainView$6$1$1", f = "MainView.kt", l = {302}, m = "emit", v = 2)
        public static final class C3184a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public r0 f170797a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f170798b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a<T> f170799c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f170800d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3184a(a<? super T> aVar, t13.d<? super C3184a> dVar) {
                super(dVar);
                this.f170799c = aVar;
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f170798b = obj;
                this.f170800d |= Integer.MIN_VALUE;
                return this.f170799c.emit(null, this);
            }
        }

        public a(mg2.g gVar, r0 r0Var) {
            this.f170795a = gVar;
            this.f170796b = r0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(f fVar, t13.d<? super Unit> dVar) {
            C3184a c3184a;
            r0 r0Var;
            if (dVar instanceof C3184a) {
                c3184a = (C3184a) dVar;
                int i14 = c3184a.f170800d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3184a.f170800d = i14 - Integer.MIN_VALUE;
                } else {
                    c3184a = new C3184a(this, dVar);
                }
            } else {
                c3184a = new C3184a(this, dVar);
            }
            Object obj = c3184a.f170798b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3184a.f170800d;
            if (i15 == 0) {
                o13.r.b(obj);
                if (fVar != null) {
                    r0 r0Var2 = this.f170796b;
                    c3184a.f170797a = r0Var2;
                    c3184a.f170800d = 1;
                    if (this.f170795a.a(fVar, c3184a) == aVar) {
                        return aVar;
                    }
                    r0Var = r0Var2;
                }
                return Unit.INSTANCE;
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var = c3184a.f170797a;
            o13.r.b(obj);
            r0Var.f170942t.d(null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(r0 r0Var, mg2.g gVar, t13.d<? super i0> dVar) {
        super(2, dVar);
        this.f170793b = r0Var;
        this.f170794c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i0(this.f170793b, this.f170794c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to ug2.i0 for r5v1 'this'  t13.d
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
            int r1 = r5.f170792a
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 == r2) goto L10
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r6)
        Le:
            r6 = 0
            return r6
        L10:
            o13.r.b(r6)
            goto L31
        L14:
            o13.r.b(r6)
            ug2.r0 r6 = r5.f170793b
            r53.e2 r1 = r6.f170942t
            r53.a2 r1 = r53.s.c(r1)
            ug2.i0$a r3 = new ug2.i0$a
            mg2.g r4 = r5.f170794c
            r3.<init>(r4, r6)
            r5.f170792a = r2
            r53.d2<T> r6 = r1.f150526a
            java.lang.Object r6 = r6.collect(r3, r5)
            if (r6 != r0) goto L31
            return r0
        L31:
            o2.c.f()
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: ug2.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
