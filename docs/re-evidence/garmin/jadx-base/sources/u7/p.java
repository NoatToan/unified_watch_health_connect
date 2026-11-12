package u7;

import androidx.datastore.core.CorruptionException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lu7/e;", "<anonymous>", "()Lu7/e;"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {437, 458, 546, 468}, m = "invokeSuspend")
public final class p extends v13.i implements e23.l<t13.d<? super e<Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f169271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f169272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f169273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f169274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f169275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f169276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f169277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m<Object> f169278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m<Object>.b f169279i;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"u7/p$a", "Lu7/s0;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements s0<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z53.a f169280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.m0 f169281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<Object> f169282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m<Object> f169283d;

        public a(z53.a aVar, p005kotlin.jvm.internal.m0 m0Var, p005kotlin.jvm.internal.r0<Object> r0Var, m<Object> mVar) {
            this.f169280a = aVar;
            this.f169281b = m0Var;
            this.f169282c = r0Var;
            this.f169283d = mVar;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00b3 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:36:0x00ab, B:38:0x00b3), top: B:54:0x004f }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // u7.s0
        public final Object a(i iVar, v13.c cVar) throws Throwable {
            o oVar;
            z53.a aVar;
            m<Object> mVar;
            p005kotlin.jvm.internal.m0 m0Var;
            p005kotlin.jvm.internal.r0<Object> r0Var;
            e23.p pVar;
            z53.a aVar2;
            z53.a aVar3;
            m<Object> mVar2;
            T t7;
            p005kotlin.jvm.internal.r0<Object> r0Var2;
            if (cVar instanceof o) {
                oVar = (o) cVar;
                int i14 = oVar.f169259h;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    oVar.f169259h = i14 - Integer.MIN_VALUE;
                } else {
                    oVar = new o(this, cVar);
                }
            } else {
                oVar = new o(this, cVar);
            }
            Object obj = oVar.f169257f;
            u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
            int i15 = oVar.f169259h;
            try {
                if (i15 == 0) {
                    o13.r.b(obj);
                    oVar.f169252a = iVar;
                    aVar = this.f169280a;
                    oVar.f169253b = aVar;
                    p005kotlin.jvm.internal.m0 m0Var2 = this.f169281b;
                    oVar.f169254c = m0Var2;
                    p005kotlin.jvm.internal.r0<Object> r0Var3 = this.f169282c;
                    oVar.f169255d = r0Var3;
                    mVar = this.f169283d;
                    oVar.f169256e = mVar;
                    oVar.f169259h = 1;
                    if (aVar.c(oVar) != aVar4) {
                        m0Var = m0Var2;
                        r0Var = r0Var3;
                        pVar = iVar;
                    }
                    return aVar4;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj2 = oVar.f169254c;
                        r0Var2 = (p005kotlin.jvm.internal.r0) oVar.f169253b;
                        aVar2 = (z53.a) oVar.f169252a;
                        try {
                            o13.r.b(obj);
                            t7 = obj2;
                            r0Var2.f105810a = t7;
                            r0Var = r0Var2;
                            Object obj3 = r0Var.f105810a;
                            aVar2.e(null);
                            return obj3;
                        } catch (Throwable th3) {
                            th = th3;
                            aVar2.e(null);
                            throw th;
                        }
                    }
                    mVar2 = (m) oVar.f169254c;
                    r0Var = (p005kotlin.jvm.internal.r0) oVar.f169253b;
                    aVar3 = (z53.a) oVar.f169252a;
                    try {
                        o13.r.b(obj);
                        if (!p005kotlin.jvm.internal.s.g(obj, r0Var.f105810a)) {
                            oVar.f169252a = aVar3;
                            oVar.f169253b = r0Var;
                            oVar.f169254c = obj;
                            oVar.f169259h = 3;
                            if (mVar2.j(obj, false, oVar) != aVar4) {
                                t7 = obj;
                                r0Var2 = r0Var;
                                aVar2 = aVar3;
                                r0Var2.f105810a = t7;
                                r0Var = r0Var2;
                            }
                            return aVar4;
                        }
                        aVar2 = aVar3;
                        Object obj4 = r0Var.f105810a;
                        aVar2.e(null);
                        return obj4;
                    } catch (Throwable th4) {
                        th = th4;
                        aVar2 = aVar3;
                        aVar2.e(null);
                        throw th;
                    }
                }
                m<Object> mVar3 = oVar.f169256e;
                r0Var = oVar.f169255d;
                m0Var = (p005kotlin.jvm.internal.m0) oVar.f169254c;
                z53.a aVar5 = (z53.a) oVar.f169253b;
                e23.p pVar2 = (e23.p) oVar.f169252a;
                o13.r.b(obj);
                mVar = mVar3;
                pVar = pVar2;
                aVar = aVar5;
                if (m0Var.f105804a) {
                    throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                }
                Object obj5 = r0Var.f105810a;
                oVar.f169252a = aVar;
                oVar.f169253b = r0Var;
                oVar.f169254c = mVar;
                oVar.f169255d = null;
                oVar.f169256e = null;
                oVar.f169259h = 2;
                Object objInvoke = pVar.invoke(obj5, oVar);
                if (objInvoke != aVar4) {
                    aVar3 = aVar;
                    obj = objInvoke;
                    mVar2 = mVar;
                    if (!p005kotlin.jvm.internal.s.g(obj, r0Var.f105810a)) {
                        oVar.f169252a = aVar3;
                        oVar.f169253b = r0Var;
                        oVar.f169254c = obj;
                        oVar.f169259h = 3;
                        if (mVar2.j(obj, false, oVar) != aVar4) {
                            t7 = obj;
                            r0Var2 = r0Var;
                            aVar2 = aVar3;
                            r0Var2.f105810a = t7;
                            r0Var = r0Var2;
                        }
                    } else {
                        aVar2 = aVar3;
                    }
                    Object obj6 = r0Var.f105810a;
                    aVar2.e(null);
                    return obj6;
                }
                return aVar4;
            } catch (Throwable th5) {
                th = th5;
                aVar2 = aVar;
                aVar2.e(null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m<Object> mVar, m<Object>.b bVar, t13.d<? super p> dVar) {
        super(1, dVar);
        this.f169278h = mVar;
        this.f169279i = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new p(this.f169278h, this.f169279i, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super e<Object>> dVar) {
        return ((p) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:21:0x009c->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws CorruptionException {
        z53.a aVarA;
        p005kotlin.jvm.internal.m0 m0Var;
        p005kotlin.jvm.internal.r0 r0Var;
        p005kotlin.jvm.internal.r0 r0Var2;
        z53.a aVar;
        Iterator it;
        z53.a aVar2;
        p005kotlin.jvm.internal.m0 m0Var2;
        p005kotlin.jvm.internal.r0 r0Var3;
        a aVar3;
        p005kotlin.jvm.internal.r0 r0Var4;
        p005kotlin.jvm.internal.m0 m0Var3;
        e23.p pVar;
        Object obj2;
        int iHashCode;
        Object objE;
        int i14;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f169277g;
        m<Object>.b bVar = this.f169279i;
        m<Object> mVar = this.f169278h;
        if (i15 == 0) {
            o13.r.b(obj);
            aVarA = z53.c.a();
            m0Var = new p005kotlin.jvm.internal.m0();
            r0Var = new p005kotlin.jvm.internal.r0();
            this.f169271a = aVarA;
            this.f169272b = m0Var;
            this.f169273c = r0Var;
            this.f169274d = r0Var;
            this.f169277g = 1;
            obj = m.f(mVar, true, this);
            if (obj != aVar4) {
                r0Var2 = r0Var;
            }
            return aVar4;
        }
        if (i15 == 1) {
            r0Var = (p005kotlin.jvm.internal.r0) this.f169274d;
            r0Var2 = (p005kotlin.jvm.internal.r0) this.f169273c;
            m0Var = (p005kotlin.jvm.internal.m0) this.f169272b;
            aVarA = (z53.a) this.f169271a;
            o13.r.b(obj);
        } else {
            if (i15 == 2) {
                it = this.f169275e;
                aVar3 = (a) this.f169274d;
                r0Var3 = (p005kotlin.jvm.internal.r0) this.f169273c;
                m0Var2 = (p005kotlin.jvm.internal.m0) this.f169272b;
                aVar2 = (z53.a) this.f169271a;
                o13.r.b(obj);
                while (it.hasNext()) {
                    pVar = (e23.p) it.next();
                    this.f169271a = aVar2;
                    this.f169272b = m0Var2;
                    this.f169273c = r0Var3;
                    this.f169274d = aVar3;
                    this.f169275e = it;
                    this.f169277g = 2;
                    if (pVar.invoke(aVar3, this) == aVar4) {
                        return aVar4;
                    }
                }
                r0Var2 = r0Var3;
                m0Var = m0Var2;
                aVar = aVar2;
                bVar.f169200c = null;
                this.f169271a = m0Var;
                this.f169272b = r0Var2;
                this.f169273c = aVar;
                this.f169274d = null;
                this.f169275e = null;
                this.f169277g = 3;
                if (aVar.c(this) != aVar4) {
                    r0Var4 = r0Var2;
                    m0Var3 = m0Var;
                    m0Var3.f105804a = true;
                    Unit unit = Unit.INSTANCE;
                    aVar.e(null);
                    obj2 = r0Var4.f105810a;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    int i16 = m.f169187m;
                    t0 t0VarG = mVar.g();
                    this.f169271a = obj2;
                    this.f169272b = null;
                    this.f169273c = null;
                    this.f169276f = iHashCode;
                    this.f169277g = 4;
                    objE = t0VarG.e(this);
                    if (objE != aVar4) {
                        i14 = iHashCode;
                        obj = objE;
                    }
                }
                return aVar4;
            }
            if (i15 == 3) {
                aVar = (z53.a) this.f169273c;
                r0Var4 = (p005kotlin.jvm.internal.r0) this.f169272b;
                m0Var3 = (p005kotlin.jvm.internal.m0) this.f169271a;
                o13.r.b(obj);
                try {
                    m0Var3.f105804a = true;
                    Unit unit2 = Unit.INSTANCE;
                    aVar.e(null);
                    obj2 = r0Var4.f105810a;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    int i17 = m.f169187m;
                    t0 t0VarG2 = mVar.g();
                    this.f169271a = obj2;
                    this.f169272b = null;
                    this.f169273c = null;
                    this.f169276f = iHashCode;
                    this.f169277g = 4;
                    objE = t0VarG2.e(this);
                    if (objE != aVar4) {
                        i14 = iHashCode;
                        obj = objE;
                    }
                    return aVar4;
                } catch (Throwable th3) {
                    aVar.e(null);
                    throw th3;
                }
            }
            if (i15 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = this.f169276f;
            obj2 = this.f169271a;
            o13.r.b(obj);
        }
        return new e(obj2, i14, ((Number) obj).intValue());
        r0Var.f105810a = ((e) obj).f169112b;
        a aVar5 = new a(aVarA, m0Var, r0Var2, mVar);
        List<? extends e23.p<? super s0<Object>, ? super t13.d<? super Unit>, ? extends Object>> list = bVar.f169200c;
        if (list != null) {
            it = list.iterator();
            aVar2 = aVarA;
            m0Var2 = m0Var;
            r0Var3 = r0Var2;
            aVar3 = aVar5;
            while (it.hasNext()) {
                pVar = (e23.p) it.next();
                this.f169271a = aVar2;
                this.f169272b = m0Var2;
                this.f169273c = r0Var3;
                this.f169274d = aVar3;
                this.f169275e = it;
                this.f169277g = 2;
                if (pVar.invoke(aVar3, this) == aVar4) {
                    return aVar4;
                }
            }
            r0Var2 = r0Var3;
            m0Var = m0Var2;
            aVar = aVar2;
        } else {
            aVar = aVarA;
        }
        bVar.f169200c = null;
        this.f169271a = m0Var;
        this.f169272b = r0Var2;
        this.f169273c = aVar;
        this.f169274d = null;
        this.f169275e = null;
        this.f169277g = 3;
        if (aVar.c(this) != aVar4) {
            r0Var4 = r0Var2;
            m0Var3 = m0Var;
            m0Var3.f105804a = true;
            Unit unit3 = Unit.INSTANCE;
            aVar.e(null);
            obj2 = r0Var4.f105810a;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            int i18 = m.f169187m;
            t0 t0VarG3 = mVar.g();
            this.f169271a = obj2;
            this.f169272b = null;
            this.f169273c = null;
            this.f169276f = iHashCode;
            this.f169277g = 4;
            objE = t0VarG3.e(this);
            if (objE != aVar4) {
                i14 = iHashCode;
                obj = objE;
                return new e(obj2, i14, ((Number) obj).intValue());
            }
        }
        return aVar4;
    }
}
