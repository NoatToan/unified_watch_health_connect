package md;

import androidx.room.t0;
import androidx.room.u0;
import jd.w;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1", f = "DBUtil.android.kt", l = {72}, m = "invokeSuspend")
public final class b extends v13.i implements e23.p<b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f117791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t13.g f117792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.room.b0 f117793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f117794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f117795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l<ud.a, Object> f117796f;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1", f = "DBUtil.android.kt", l = {260}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<b0, t13.d<Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f117797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.room.b0 f117798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f117799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f117800d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.l<ud.a, Object> f117801e;

        /* JADX INFO: renamed from: md.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Landroidx/room/u0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60}, m = "invokeSuspend")
        public static final class C2237a extends v13.i implements e23.p<u0, t13.d<Object>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public u0.a f117802a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f117803b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f117804c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ boolean f117805d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f117806e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ androidx.room.b0 f117807f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ e23.l f117808g;

            /* JADX INFO: renamed from: md.b$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Landroidx/room/t0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
            @v13.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
            public static final class C2238a extends v13.i implements e23.p<t0<Object>, t13.d<Object>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f117809a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e23.l f117810b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2238a(t13.d dVar, e23.l lVar) {
                    super(2, dVar);
                    this.f117810b = lVar;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    C2238a c2238a = new C2238a(dVar, this.f117810b);
                    c2238a.f117809a = obj;
                    return c2238a;
                }

                @Override // e23.p
                public final Object invoke(t0<Object> t0Var, t13.d<Object> dVar) {
                    return ((C2238a) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    r.b(obj);
                    t0 t0Var = (t0) this.f117809a;
                    t0Var.getClass();
                    return this.f117810b.invoke(((w) t0Var).getF98235b());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2237a(boolean z14, boolean z15, androidx.room.b0 b0Var, t13.d dVar, e23.l lVar) {
                super(2, dVar);
                this.f117805d = z14;
                this.f117806e = z15;
                this.f117807f = b0Var;
                this.f117808g = lVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C2237a c2237a = new C2237a(this.f117805d, this.f117806e, this.f117807f, dVar, this.f117808g);
                c2237a.f117804c = obj;
                return c2237a;
            }

            @Override // e23.p
            public final Object invoke(u0 u0Var, t13.d<Object> dVar) {
                return ((C2237a) create(u0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:36:0x009d A[DONT_INVERT, PHI: r1 r11
              0x009d: PHI (r1v11 androidx.room.u0) = (r1v8 androidx.room.u0), (r1v17 androidx.room.u0) binds: [B:34:0x009a, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]
              0x009d: PHI (r11v17 java.lang.Object) = (r11v15 java.lang.Object), (r11v0 java.lang.Object) binds: [B:34:0x009a, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:37:0x009f  */
            /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
            /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
            /* JADX WARN: Code duplicated, block: B:45:0x00c2 A[RETURN] */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u0.a aVar;
                u0 u0Var;
                u0.a aVar2;
                u0 u0Var2;
                u0 u0Var3;
                Boolean boolD;
                Object obj2;
                u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f117803b;
                e23.l lVar = this.f117808g;
                androidx.room.b0 b0Var = this.f117807f;
                boolean z14 = this.f117806e;
                if (i14 == 0) {
                    r.b(obj);
                    u0 u0Var4 = (u0) this.f117804c;
                    if (!this.f117805d) {
                        u0Var4.getClass();
                        return lVar.invoke(((w) u0Var4).getF98235b());
                    }
                    aVar = z14 ? u0.a.DEFERRED : u0.a.IMMEDIATE;
                    if (z14) {
                        u0.a aVar4 = aVar;
                        u0Var = u0Var4;
                        aVar2 = aVar4;
                        C2238a c2238a = new C2238a(null, lVar);
                        this.f117804c = u0Var;
                        this.f117802a = null;
                        this.f117803b = 3;
                        obj = u0Var.b(aVar2, c2238a, this);
                        if (obj != aVar3) {
                            if (z14) {
                                return obj;
                            }
                            this.f117804c = obj;
                            this.f117803b = 4;
                            boolD = u0Var.d(this);
                            if (boolD != aVar3) {
                                obj2 = obj;
                                obj = boolD;
                                if (!((Boolean) obj).booleanValue()) {
                                    androidx.room.m invalidationTracker = b0Var.getInvalidationTracker();
                                    invalidationTracker.f10883e.e(invalidationTracker.f10887i, invalidationTracker.f10888j);
                                }
                                return obj2;
                            }
                        }
                    } else {
                        this.f117804c = u0Var4;
                        this.f117802a = aVar;
                        this.f117803b = 1;
                        Boolean boolD2 = u0Var4.d(this);
                        if (boolD2 != aVar3) {
                            u0Var2 = u0Var4;
                            obj = boolD2;
                        }
                    }
                    return aVar3;
                }
                if (i14 == 1) {
                    aVar = this.f117802a;
                    u0Var2 = (u0) this.f117804c;
                    r.b(obj);
                } else {
                    if (i14 == 2) {
                        aVar = this.f117802a;
                        u0Var3 = (u0) this.f117804c;
                        r.b(obj);
                        aVar2 = aVar;
                        u0Var = u0Var3;
                        C2238a c2238a2 = new C2238a(null, lVar);
                        this.f117804c = u0Var;
                        this.f117802a = null;
                        this.f117803b = 3;
                        obj = u0Var.b(aVar2, c2238a2, this);
                        if (obj != aVar3) {
                            if (z14) {
                                return obj;
                            }
                            this.f117804c = obj;
                            this.f117803b = 4;
                            boolD = u0Var.d(this);
                            if (boolD != aVar3) {
                                obj2 = obj;
                                obj = boolD;
                            }
                        }
                        return aVar3;
                    }
                    if (i14 == 3) {
                        u0Var = (u0) this.f117804c;
                        r.b(obj);
                        if (z14) {
                            return obj;
                        }
                        this.f117804c = obj;
                        this.f117803b = 4;
                        boolD = u0Var.d(this);
                        if (boolD != aVar3) {
                            obj2 = obj;
                            obj = boolD;
                        }
                        return aVar3;
                    }
                    if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.f117804c;
                    r.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    androidx.room.m invalidationTracker2 = b0Var.getInvalidationTracker();
                    invalidationTracker2.f10883e.e(invalidationTracker2.f10887i, invalidationTracker2.f10888j);
                }
                return obj2;
                if (((Boolean) obj).booleanValue()) {
                    aVar2 = aVar;
                    u0Var = u0Var2;
                    C2238a c2238a3 = new C2238a(null, lVar);
                    this.f117804c = u0Var;
                    this.f117802a = null;
                    this.f117803b = 3;
                    obj = u0Var.b(aVar2, c2238a3, this);
                    if (obj != aVar3) {
                        if (z14) {
                            return obj;
                        }
                        this.f117804c = obj;
                        this.f117803b = 4;
                        boolD = u0Var.d(this);
                        if (boolD != aVar3) {
                            obj2 = obj;
                            obj = boolD;
                            if (!((Boolean) obj).booleanValue()) {
                                androidx.room.m invalidationTracker3 = b0Var.getInvalidationTracker();
                                invalidationTracker3.f10883e.e(invalidationTracker3.f10887i, invalidationTracker3.f10888j);
                            }
                            return obj2;
                        }
                    }
                } else {
                    androidx.room.m invalidationTracker4 = b0Var.getInvalidationTracker();
                    this.f117804c = u0Var2;
                    this.f117802a = aVar;
                    this.f117803b = 2;
                    if (invalidationTracker4.d(this) != aVar3) {
                        u0Var3 = u0Var2;
                        aVar2 = aVar;
                        u0Var = u0Var3;
                        C2238a c2238a4 = new C2238a(null, lVar);
                        this.f117804c = u0Var;
                        this.f117802a = null;
                        this.f117803b = 3;
                        obj = u0Var.b(aVar2, c2238a4, this);
                        if (obj != aVar3) {
                            if (z14) {
                                return obj;
                            }
                            this.f117804c = obj;
                            this.f117803b = 4;
                            boolD = u0Var.d(this);
                            if (boolD != aVar3) {
                                obj2 = obj;
                                obj = boolD;
                                if (!((Boolean) obj).booleanValue()) {
                                    androidx.room.m invalidationTracker5 = b0Var.getInvalidationTracker();
                                    invalidationTracker5.f10883e.e(invalidationTracker5.f10887i, invalidationTracker5.f10888j);
                                }
                                return obj2;
                            }
                        }
                    }
                }
                return aVar3;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(androidx.room.b0 b0Var, boolean z14, boolean z15, e23.l<? super ud.a, Object> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f117798b = b0Var;
            this.f117799c = z14;
            this.f117800d = z15;
            this.f117801e = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f117798b, this.f117799c, this.f117800d, this.f117801e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<Object> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f117797a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            androidx.room.b0 b0Var = this.f117798b;
            boolean z14 = !(b0Var.inCompatibilityMode() && b0Var.inTransaction()) && this.f117799c;
            boolean z15 = this.f117800d;
            androidx.room.b0 b0Var2 = this.f117798b;
            C2237a c2237a = new C2237a(z14, z15, b0Var2, null, this.f117801e);
            this.f117797a = 1;
            Object objUseConnection = b0Var2.useConnection(z15, c2237a, this);
            return objUseConnection == aVar ? aVar : objUseConnection;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(t13.g gVar, androidx.room.b0 b0Var, boolean z14, boolean z15, e23.l<? super ud.a, Object> lVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f117792b = gVar;
        this.f117793c = b0Var;
        this.f117794d = z14;
        this.f117795e = z15;
        this.f117796f = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f117792b, this.f117793c, this.f117794d, this.f117795e, this.f117796f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<Object> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f117791a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        a aVar2 = new a(this.f117793c, this.f117794d, this.f117795e, this.f117796f, null);
        this.f117791a = 1;
        Object objE0 = ge1.b.e0(this.f117792b, aVar2, this);
        return objE0 == aVar ? aVar : objE0;
    }
}
