package jd;

import androidx.room.u0;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import u53.a0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Ljd/e;", "Ljd/c;", "Lud/b;", "driver", "", "fileName", "", "preparedStatementCacheSize", "<init>", "(Lud/b;Ljava/lang/String;I)V", "maxNumOfReaders", "maxNumOfWriters", "(Lud/b;Ljava/lang/String;III)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements jd.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f98192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f98193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jd.b f98194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal<r> f98195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f98196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f98197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f98198g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "androidx.room.coroutines.ConnectionPoolImpl", f = "ConnectionPoolImpl.kt", l = {131, TsExtractor.TS_STREAM_TYPE_E_AC3, 154, 159}, m = "useConnection")
    public static final class a<R> extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f98199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f98200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f98201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public r0 f98202d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public t13.g f98203e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public r0 f98204f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public jd.b f98205g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f98206h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f98208j;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f98206h = obj;
            this.f98208j |= Integer.MIN_VALUE;
            return e.this.V1(false, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", f = "ConnectionPoolImpl.kt", l = {132}, m = "invokeSuspend")
    public static final class b<R> extends v13.i implements e23.p<b0, t13.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f98209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.p<u0, t13.d<? super R>, Object> f98210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f98211c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.p<? super u0, ? super t13.d<? super R>, ? extends Object> pVar, r rVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f98210b = pVar;
            this.f98211c = rVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f98210b, this.f98211c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, Object obj) {
            return ((b) create(b0Var, (t13.d) obj)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f98209a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f98209a = 1;
                Object objInvoke = this.f98210b.invoke(this.f98211c, this);
                return objInvoke == aVar ? aVar : objInvoke;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", f = "ConnectionPoolImpl.kt", l = {159}, m = "invokeSuspend")
    public static final class c<R> extends v13.i implements e23.p<b0, t13.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f98212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.p<u0, t13.d<? super R>, Object> f98213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r0<r> f98214c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(e23.p<? super u0, ? super t13.d<? super R>, ? extends Object> pVar, r0<r> r0Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f98213b = pVar;
            this.f98214c = r0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f98213b, this.f98214c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, Object obj) {
            return ((c) create(b0Var, (t13.d) obj)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f98212a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            r rVar = this.f98214c.f105810a;
            this.f98212a = 1;
            Object objInvoke = this.f98213b.invoke(rVar, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    public e(final ud.b bVar, final String str, int i14, int i15, int i16) {
        bVar.getClass();
        str.getClass();
        this.f98194c = new jd.b();
        this.f98195d = new ThreadLocal<>();
        e53.c.a aVar = e53.c.f63094b;
        this.f98197f = e53.e.e(30, e53.f.SECONDS);
        this.f98198g = 2;
        if (i14 <= 0) {
            vb.h.s("Maximum number of readers must be greater than 0");
            throw null;
        }
        if (i15 <= 0) {
            vb.h.s("Maximum number of writers must be greater than 0");
            throw null;
        }
        final int i17 = 0;
        this.f98192a = new q(i14, new e23.a() { // from class: jd.d
            @Override // e23.a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        ud.a aVarA = bVar.a(str);
                        oe2.f.o(aVarA, "PRAGMA query_only = 1");
                        return aVarA;
                    case 1:
                        return bVar.a(str);
                    default:
                        return bVar.a(str);
                }
            }
        }, i16);
        final int i18 = 1;
        this.f98193b = new q(i15, new e23.a() { // from class: jd.d
            @Override // e23.a
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        ud.a aVarA = bVar.a(str);
                        oe2.f.o(aVarA, "PRAGMA query_only = 1");
                        return aVarA;
                    case 1:
                        return bVar.a(str);
                    default:
                        return bVar.a(str);
                }
            }
        }, i16);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0139  */
    /* JADX WARN: Code duplicated, block: B:71:0x0145 A[Catch: all -> 0x019f, TRY_LEAVE, TryCatch #4 {all -> 0x019f, blocks: (B:64:0x011e, B:69:0x013a, B:71:0x0145, B:86:0x01a3, B:87:0x01aa), top: B:115:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0177  */
    /* JADX WARN: Code duplicated, block: B:77:0x017f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0183  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0190  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a3 A[Catch: all -> 0x019f, TRY_ENTER, TryCatch #4 {all -> 0x019f, blocks: (B:64:0x011e, B:69:0x013a, B:71:0x0145, B:86:0x01a3, B:87:0x01aa), top: B:115:0x011e }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, jd.r] */
    @Override // jd.c
    public final <R> Object V1(boolean z14, e23.p<? super u0, ? super t13.d<? super R>, ? extends Object> pVar, t13.d<? super R> dVar) throws Throwable {
        a aVar;
        r0 r0Var;
        Throwable th3;
        q qVar;
        e23.p<? super u0, ? super t13.d<? super R>, ? extends Object> pVar2;
        t13.g gVar;
        jd.b bVar;
        q qVar2;
        r0 r0Var2;
        boolean z15;
        T t7;
        r0 r0Var3;
        r rVar;
        boolean z16 = z14;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f98208j;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f98208j = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objE0 = aVar.f98206h;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f98208j;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(objE0);
                return objE0;
            }
            if (i15 == 2) {
                o13.r.b(objE0);
                return objE0;
            }
            if (i15 == 3) {
                z16 = aVar.f98199a;
                bVar = aVar.f98205g;
                r0 r0Var4 = aVar.f98204f;
                gVar = aVar.f98203e;
                r0 r0Var5 = aVar.f98202d;
                qVar2 = (q) aVar.f98201c;
                pVar2 = (e23.p) aVar.f98200b;
                try {
                    o13.r.b(objE0);
                    r0Var2 = r0Var4;
                    r0Var = r0Var5;
                    try {
                        f fVar = (f) objE0;
                        fVar.getClass();
                        gVar.getClass();
                        fVar.f98217c = gVar;
                        fVar.f98218d = new Throwable();
                        if (this.f98192a == this.f98193b && z16) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        r0Var2.f105810a = new r(bVar, fVar, z15);
                        t7 = r0Var.f105810a;
                        if (t7 != 0) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        r rVar2 = (r) t7;
                        jd.a aVar3 = new jd.a(this.f98194c, rVar2);
                        ThreadLocal<r> threadLocal = this.f98195d;
                        threadLocal.getClass();
                        t13.g gVarD = t13.g.a.C3052a.d(new a0(rVar2, threadLocal), aVar3);
                        c cVar = new c(pVar2, r0Var, null);
                        aVar.f98200b = qVar2;
                        aVar.f98201c = r0Var;
                        aVar.f98202d = null;
                        aVar.f98203e = null;
                        aVar.f98204f = null;
                        aVar.f98205g = null;
                        aVar.f98208j = 4;
                        objE0 = ge1.b.e0(gVarD, cVar, aVar);
                        if (objE0 != aVar2) {
                            r0Var3 = r0Var;
                            qVar = qVar2;
                        }
                        return aVar2;
                    } catch (Throwable th4) {
                        th3 = th4;
                        qVar = qVar2;
                        throw th3;
                    }
                } catch (Throwable th5) {
                    th3 = th5;
                    r0Var = r0Var5;
                    qVar = qVar2;
                    throw th3;
                }
            }
            if (i15 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var3 = (r0) aVar.f98201c;
            qVar = (q) aVar.f98200b;
            try {
                o13.r.b(objE0);
            } catch (Throwable th6) {
                r0Var = r0Var3;
                th3 = th6;
            }
            rVar = (r) r0Var3.f105810a;
            if (rVar != null) {
                if (!rVar.f98291e) {
                    rVar.f98291e = true;
                    if (rVar.f98288b.f98215a.D()) {
                        oe2.f.o(rVar.f98288b, "ROLLBACK TRANSACTION");
                    }
                }
                f fVar2 = rVar.f98288b;
                fVar2.f98217c = null;
                fVar2.f98218d = null;
                qVar.e(fVar2);
            }
            return objE0;
        }
        o13.r.b(objE0);
        if (this.f98196e) {
            oe2.f.a0(21, "Connection pool is closed");
            throw null;
        }
        r rVar3 = this.f98195d.get();
        if (rVar3 == null) {
            jd.a aVar4 = (jd.a) aVar.getF157466b().get(this.f98194c);
            rVar3 = aVar4 != null ? aVar4.f98187b : null;
        }
        if (rVar3 == null) {
            q qVar3 = z16 ? this.f98192a : this.f98193b;
            r0Var = new r0();
            try {
                t13.g f157466b = aVar.getF157466b();
                jd.b bVar2 = this.f98194c;
                long j8 = this.f98197f;
                b50.o oVar = new b50.o(this, z16, 3);
                aVar.f98200b = pVar;
                aVar.f98201c = qVar3;
                aVar.f98202d = r0Var;
                aVar.f98203e = f157466b;
                aVar.f98204f = r0Var;
                aVar.f98205g = bVar2;
                aVar.f98199a = z16;
                aVar.f98208j = 3;
                Object objB = qVar3.b(j8, oVar, aVar);
                if (objB != aVar2) {
                    pVar2 = pVar;
                    gVar = f157466b;
                    bVar = bVar2;
                    qVar2 = qVar3;
                    objE0 = objB;
                    r0Var2 = r0Var;
                    f fVar3 = (f) objE0;
                    fVar3.getClass();
                    gVar.getClass();
                    fVar3.f98217c = gVar;
                    fVar3.f98218d = new Throwable();
                    if (this.f98192a == this.f98193b) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    r0Var2.f105810a = new r(bVar, fVar3, z15);
                    t7 = r0Var.f105810a;
                    if (t7 != 0) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    r rVar4 = (r) t7;
                    jd.a aVar5 = new jd.a(this.f98194c, rVar4);
                    ThreadLocal<r> threadLocal2 = this.f98195d;
                    threadLocal2.getClass();
                    t13.g gVarD2 = t13.g.a.C3052a.d(new a0(rVar4, threadLocal2), aVar5);
                    c cVar2 = new c(pVar2, r0Var, null);
                    aVar.f98200b = qVar2;
                    aVar.f98201c = r0Var;
                    aVar.f98202d = null;
                    aVar.f98203e = null;
                    aVar.f98204f = null;
                    aVar.f98205g = null;
                    aVar.f98208j = 4;
                    objE0 = ge1.b.e0(gVarD2, cVar2, aVar);
                    if (objE0 != aVar2) {
                        r0Var3 = r0Var;
                        qVar = qVar2;
                        rVar = (r) r0Var3.f105810a;
                        if (rVar != null) {
                            if (!rVar.f98291e) {
                                rVar.f98291e = true;
                                if (rVar.f98288b.f98215a.D()) {
                                    oe2.f.o(rVar.f98288b, "ROLLBACK TRANSACTION");
                                }
                            }
                            f fVar4 = rVar.f98288b;
                            fVar4.f98217c = null;
                            fVar4.f98218d = null;
                            qVar.e(fVar4);
                        }
                        return objE0;
                    }
                }
            } catch (Throwable th7) {
                th3 = th7;
                qVar = qVar3;
            }
        } else {
            if (!z16 && rVar3.f98289c) {
                oe2.f.a0(1, "Cannot upgrade connection from reader to writer");
                throw null;
            }
            if (aVar.getF157466b().get(this.f98194c) == null) {
                jd.a aVar6 = new jd.a(this.f98194c, rVar3);
                ThreadLocal<r> threadLocal3 = this.f98195d;
                threadLocal3.getClass();
                t13.g gVarD3 = t13.g.a.C3052a.d(new a0(rVar3, threadLocal3), aVar6);
                b bVar3 = new b(pVar, rVar3, null);
                aVar.f98208j = 1;
                Object objE1 = ge1.b.e0(gVarD3, bVar3, aVar);
                if (objE1 != aVar2) {
                    return objE1;
                }
            } else {
                aVar.f98208j = 2;
                Object objInvoke = pVar.invoke(rVar3, aVar);
                if (objInvoke != aVar2) {
                    return objInvoke;
                }
            }
        }
        return aVar2;
        try {
            throw th3;
        } catch (Throwable th8) {
            try {
                r rVar5 = (r) r0Var.f105810a;
                if (rVar5 == null) {
                    throw th8;
                }
                if (!rVar5.f98291e) {
                    rVar5.f98291e = true;
                    if (rVar5.f98288b.f98215a.D()) {
                        oe2.f.o(rVar5.f98288b, "ROLLBACK TRANSACTION");
                    }
                }
                f fVar5 = rVar5.f98288b;
                fVar5.f98217c = null;
                fVar5.f98218d = null;
                qVar.e(fVar5);
                throw th8;
            } catch (Throwable th9) {
                o13.g.a(th3, th9);
                throw th8;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f98196e) {
            return;
        }
        this.f98196e = true;
        this.f98192a.c();
        this.f98193b.c();
    }

    public e(final ud.b bVar, final String str, int i14) {
        bVar.getClass();
        str.getClass();
        this.f98194c = new jd.b();
        this.f98195d = new ThreadLocal<>();
        e53.c.a aVar = e53.c.f63094b;
        this.f98197f = e53.e.e(30, e53.f.SECONDS);
        final int i15 = 2;
        this.f98198g = 2;
        q qVar = new q(1, new e23.a() { // from class: jd.d
            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        ud.a aVarA = bVar.a(str);
                        oe2.f.o(aVarA, "PRAGMA query_only = 1");
                        return aVarA;
                    case 1:
                        return bVar.a(str);
                    default:
                        return bVar.a(str);
                }
            }
        }, i14);
        this.f98192a = qVar;
        this.f98193b = qVar;
    }
}
