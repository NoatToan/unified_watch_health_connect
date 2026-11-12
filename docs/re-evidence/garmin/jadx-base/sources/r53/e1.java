package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, 215, 221}, m = "invokeSuspend")
public final class e1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f150569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k2 f150570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i<Object> f150571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y1<Object> f150572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f150573e;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<Integer, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ int f150574a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f150574a = ((Number) obj).intValue();
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(Integer num, t13.d<? super Boolean> dVar) {
            return ((a) create(Integer.valueOf(num.intValue()), dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return Boolean.valueOf(this.f150574a > 0);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/i2;", "it", "", "<anonymous>", "(Lr53/i2;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {223}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<i2, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f150575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f150576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i<Object> f150577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y1<Object> f150578d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f150579e;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f150580a;

            static {
                int[] iArr = new int[i2.values().length];
                try {
                    iArr[i2.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[i2.STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[i2.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f150580a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i<Object> iVar, y1<Object> y1Var, Object obj, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f150577c = iVar;
            this.f150578d = y1Var;
            this.f150579e = obj;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f150577c, this.f150578d, this.f150579e, dVar);
            bVar.f150576b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(i2 i2Var, t13.d<? super Unit> dVar) {
            return ((b) create(i2Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f150575a;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = a.f150580a[((i2) this.f150576b).ordinal()];
                y1<Object> y1Var = this.f150578d;
                if (i15 == 1) {
                    this.f150575a = 1;
                    if (this.f150577c.collect(y1Var, this) == aVar) {
                        return aVar;
                    }
                } else if (i15 != 2) {
                    if (i15 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    u53.x xVar = g2.f150633a;
                    Object obj2 = this.f150579e;
                    if (obj2 == xVar) {
                        y1Var.c();
                    } else {
                        y1Var.d(obj2);
                    }
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
    public e1(k2 k2Var, i<Object> iVar, y1<Object> y1Var, Object obj, t13.d<? super e1> dVar) {
        super(2, dVar);
        this.f150570b = k2Var;
        this.f150571c = iVar;
        this.f150572d = y1Var;
        this.f150573e = obj;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e1(this.f150570b, this.f150571c, this.f150572d, this.f150573e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to r53.e1 for r8v2 'this'  t13.d
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r8.f150569a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r53.i<java.lang.Object> r6 = r8.f150571c
            r53.y1<java.lang.Object> r7 = r8.f150572d
            if (r1 == 0) goto L26
            if (r1 == r5) goto L22
            if (r1 == r4) goto L1e
            if (r1 == r3) goto L22
            if (r1 != r2) goto L17
            goto L22
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r9)
            r9 = 0
            return r9
        L1e:
            o13.r.b(r9)
            goto L54
        L22:
            o13.r.b(r9)
            goto L79
        L26:
            o13.r.b(r9)
            r53.k2$a r9 = r53.k2.f150703a
            r9.getClass()
            r53.l2 r9 = r53.k2.a.f150705b
            r53.k2 r1 = r8.f150570b
            if (r1 != r9) goto L3d
            r8.f150569a = r5
            java.lang.Object r9 = r6.collect(r7, r8)
            if (r9 != r0) goto L79
            goto L78
        L3d:
            r53.m2 r9 = r53.k2.a.f150706c
            r5 = 0
            if (r1 != r9) goto L5d
            r53.o2 r9 = r7.f()
            r53.e1$a r1 = new r53.e1$a
            r1.<init>(r5)
            r8.f150569a = r4
            java.lang.Object r9 = r53.s.w(r9, r1, r8)
            if (r9 != r0) goto L54
            goto L78
        L54:
            r8.f150569a = r3
            java.lang.Object r9 = r6.collect(r7, r8)
            if (r9 != r0) goto L79
            goto L78
        L5d:
            r53.o2 r9 = r7.f()
            r53.i r9 = r1.a(r9)
            r53.i r9 = r53.s.s(r9)
            r53.e1$b r1 = new r53.e1$b
            java.lang.Object r3 = r8.f150573e
            r1.<init>(r6, r7, r3, r5)
            r8.f150569a = r2
            java.lang.Object r9 = r53.s.k(r9, r1, r8)
            if (r9 != r0) goto L79
        L78:
            return r0
        L79:
            kotlin.Unit r9 = p005kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r53.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
