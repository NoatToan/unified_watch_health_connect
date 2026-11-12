package md;

import androidx.room.b0;
import androidx.room.t0;
import androidx.room.u0;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2", f = "DBUtil.android.kt", l = {260}, m = "invokeSuspend")
public final class e extends v13.i implements e23.l<t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f117818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f117819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<Object>, Object> f117820c;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Landroidx/room/u0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60, TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<u0, t13.d<Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u0.a f117821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f117822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f117823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f117824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f117825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b0 f117826f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e23.l f117827g;

        /* JADX INFO: renamed from: md.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Landroidx/room/t0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {60}, m = "invokeSuspend")
        public static final class C2239a extends v13.i implements e23.p<t0<Object>, t13.d<Object>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f117828a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f117829b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e23.l f117830c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2239a(t13.d dVar, e23.l lVar) {
                super(2, dVar);
                this.f117830c = lVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C2239a c2239a = new C2239a(dVar, this.f117830c);
                c2239a.f117829b = obj;
                return c2239a;
            }

            @Override // e23.p
            public final Object invoke(t0<Object> t0Var, t13.d<Object> dVar) {
                return ((C2239a) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f117828a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                this.f117828a = 1;
                Object objInvoke = this.f117830c.invoke(this);
                return objInvoke == aVar ? aVar : objInvoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z14, boolean z15, b0 b0Var, t13.d dVar, e23.l lVar) {
            super(2, dVar);
            this.f117824d = z14;
            this.f117825e = z15;
            this.f117826f = b0Var;
            this.f117827g = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f117824d, this.f117825e, this.f117826f, dVar, this.f117827g);
            aVar.f117823c = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(u0 u0Var, t13.d<Object> dVar) {
            return ((a) create(u0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[DONT_INVERT, PHI: r1 r12
          0x00a1: PHI (r1v10 androidx.room.u0) = (r1v7 androidx.room.u0), (r1v16 androidx.room.u0) binds: [B:35:0x009e, B:14:0x002d] A[DONT_GENERATE, DONT_INLINE]
          0x00a1: PHI (r12v14 java.lang.Object) = (r12v12 java.lang.Object), (r12v0 java.lang.Object) binds: [B:35:0x009e, B:14:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:46:0x00c6 A[RETURN] */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
        
            if (r12.d(r11) == r0) goto L49;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u0.a aVar;
            u0 u0Var;
            u0.a aVar2;
            u0 u0Var2;
            Boolean boolD;
            Object obj2;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f117822b;
            e23.l lVar = this.f117827g;
            b0 b0Var = this.f117826f;
            boolean z14 = this.f117825e;
            if (i14 == 0) {
                r.b(obj);
                u0 u0Var3 = (u0) this.f117823c;
                if (this.f117824d) {
                    aVar = z14 ? u0.a.DEFERRED : u0.a.IMMEDIATE;
                    if (z14) {
                        u0.a aVar4 = aVar;
                        u0Var = u0Var3;
                        aVar2 = aVar4;
                        C2239a c2239a = new C2239a(null, lVar);
                        this.f117823c = u0Var;
                        this.f117821a = null;
                        this.f117822b = 3;
                        obj = u0Var.b(aVar2, c2239a, this);
                        if (obj != aVar3) {
                            if (!z14) {
                                return obj;
                            }
                            this.f117823c = obj;
                            this.f117822b = 4;
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
                        this.f117823c = u0Var3;
                        this.f117821a = aVar;
                        this.f117822b = 1;
                        Boolean boolD2 = u0Var3.d(this);
                        if (boolD2 != aVar3) {
                            u0Var2 = u0Var3;
                            obj = boolD2;
                        }
                    }
                } else {
                    this.f117822b = 5;
                    Object objInvoke = lVar.invoke(this);
                    if (objInvoke != aVar3) {
                        return objInvoke;
                    }
                }
                return aVar3;
            }
            if (i14 == 1) {
                aVar = this.f117821a;
                u0Var2 = (u0) this.f117823c;
                r.b(obj);
            } else {
                if (i14 == 2) {
                    aVar = this.f117821a;
                    u0Var2 = (u0) this.f117823c;
                    r.b(obj);
                    aVar2 = aVar;
                    u0Var = u0Var2;
                    C2239a c2239a2 = new C2239a(null, lVar);
                    this.f117823c = u0Var;
                    this.f117821a = null;
                    this.f117822b = 3;
                    obj = u0Var.b(aVar2, c2239a2, this);
                    if (obj != aVar3) {
                        if (!z14) {
                            return obj;
                        }
                        this.f117823c = obj;
                        this.f117822b = 4;
                        boolD = u0Var.d(this);
                        if (boolD != aVar3) {
                            obj2 = obj;
                            obj = boolD;
                        }
                    }
                    return aVar3;
                }
                if (i14 == 3) {
                    u0Var = (u0) this.f117823c;
                    r.b(obj);
                    if (!z14) {
                        return obj;
                    }
                    this.f117823c = obj;
                    this.f117822b = 4;
                    boolD = u0Var.d(this);
                    if (boolD != aVar3) {
                        obj2 = obj;
                        obj = boolD;
                    }
                    return aVar3;
                }
                if (i14 != 4) {
                    if (i14 == 5) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.f117823c;
                r.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                androidx.room.m invalidationTracker2 = b0Var.getInvalidationTracker();
                invalidationTracker2.f10883e.e(invalidationTracker2.f10887i, invalidationTracker2.f10888j);
            }
            return obj2;
            if (!((Boolean) obj).booleanValue()) {
                androidx.room.m invalidationTracker3 = b0Var.getInvalidationTracker();
                this.f117823c = u0Var2;
                this.f117821a = aVar;
                this.f117822b = 2;
            }
            aVar2 = aVar;
            u0Var = u0Var2;
            C2239a c2239a3 = new C2239a(null, lVar);
            this.f117823c = u0Var;
            this.f117821a = null;
            this.f117822b = 3;
            obj = u0Var.b(aVar2, c2239a3, this);
            if (obj != aVar3) {
                if (!z14) {
                    return obj;
                }
                this.f117823c = obj;
                this.f117822b = 4;
                boolD = u0Var.d(this);
                if (boolD != aVar3) {
                    obj2 = obj;
                    obj = boolD;
                    if (!((Boolean) obj).booleanValue()) {
                        androidx.room.m invalidationTracker4 = b0Var.getInvalidationTracker();
                        invalidationTracker4.f10883e.e(invalidationTracker4.f10887i, invalidationTracker4.f10888j);
                    }
                    return obj2;
                }
            }
            return aVar3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(b0 b0Var, e23.l<? super t13.d<Object>, ? extends Object> lVar, t13.d<? super e> dVar) {
        super(1, dVar);
        this.f117819b = b0Var;
        this.f117820c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e(this.f117819b, this.f117820c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<Object> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f117818a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        b0 b0Var = this.f117819b;
        a aVar2 = new a(true, false, b0Var, null, this.f117820c);
        this.f117818a = 1;
        Object objUseConnection = b0Var.useConnection(false, aVar2, this);
        return objUseConnection == aVar ? aVar : objUseConnection;
    }
}
