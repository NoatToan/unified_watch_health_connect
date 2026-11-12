package sf;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import d53.u;
import d53.w;
import java.io.IOException;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import w63.a0;
import w63.b0;
import w63.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0011BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lsf/i;", "Lnf/j;", "", "url", "Lwf/m;", "options", "Lo13/l;", "Lsf/h;", "networkClient", "Lmf/a;", "diskCache", "Lsf/b;", "cacheStrategy", "Lsf/d;", "connectivityChecker", "<init>", "(Ljava/lang/String;Lwf/m;Lo13/l;Lo13/l;Lo13/l;Lsf/d;)V", "a", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements nf.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf.m f158768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.l<h> f158769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.l<mf.a> f158770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.l<sf.b> f158771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sf.d f158772f;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @v13.e(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {61, 74, 102}, m = RemoteConfigComponent.FETCH_FILE_NAME)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r0 f158777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public r0 f158778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f158779c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f158781e;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f158779c = obj;
            this.f158781e |= Integer.MIN_VALUE;
            return i.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsf/p;", "response", "Lnf/o;", "<anonymous>", "(Lsf/p;)Lnf/o;"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "coil3.network.NetworkFetcher$fetch$2", f = "NetworkFetcher.kt", l = {104}, m = "invokeSuspend")
    public static final class c extends v13.i implements e23.p<p, t13.d<? super nf.o>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f158782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f158783b;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = i.this.new c(dVar);
            cVar.f158783b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(p pVar, t13.d<? super nf.o> dVar) {
            return ((c) create(pVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            p pVar = (p) this.f158783b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f158782a;
            i iVar = i.this;
            if (i14 == 0) {
                o13.r.b(obj);
                q qVar = pVar.f158818e;
                if (qVar == null) {
                    vb.h.z("body == null");
                    return null;
                }
                this.f158783b = pVar;
                this.f158782a = 1;
                obj = i.b(iVar, qVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return new nf.o((lf.o) obj, i.f(iVar.f158767a, pVar.f158817d.a()), lf.e.NETWORK);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsf/p;", "response", "Lnf/o;", "<anonymous>", "(Lsf/p;)Lnf/o;"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "coil3.network.NetworkFetcher$fetch$fetchResult$1", f = "NetworkFetcher.kt", l = {76, 87}, m = "invokeSuspend")
    public static final class d extends v13.i implements e23.p<p, t13.d<? super nf.o>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r0 f158785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f158786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f158787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r0<mf.a.c> f158788d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i f158789e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ r0<p> f158790f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ n f158791g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(r0<mf.a.c> r0Var, i iVar, r0<p> r0Var2, n nVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f158788d = r0Var;
            this.f158789e = iVar;
            this.f158790f = r0Var2;
            this.f158791g = nVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = new d(this.f158788d, this.f158789e, this.f158790f, this.f158791g, dVar);
            dVar2.f158787c = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(p pVar, t13.d<? super nf.o> dVar) {
            return ((d) create(pVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
        
            if (r13 == r0) goto L27;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v11, types: [T, sf.p] */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            d dVar;
            r0<mf.a.c> r0Var;
            T t7;
            Object objA;
            m mVar;
            Object obj2;
            p pVar = (p) this.f158787c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f158786b;
            String strA = null;
            r0<p> r0Var2 = this.f158790f;
            r0<mf.a.c> r0Var3 = this.f158788d;
            i iVar = this.f158789e;
            if (i14 == 0) {
                o13.r.b(obj);
                mf.a.c cVar = r0Var3.f105810a;
                p pVar2 = r0Var2.f105810a;
                this.f158787c = pVar;
                this.f158785a = r0Var3;
                this.f158786b = 1;
                dVar = this;
                Object objC = i.c(this.f158789e, cVar, pVar2, this.f158791g, pVar, dVar);
                if (objC != aVar) {
                    r0Var = r0Var3;
                    t7 = objC;
                }
                obj2 = objA;
                return aVar;
            }
            if (i14 == 1) {
                r0Var = this.f158785a;
                o13.r.b(obj);
                dVar = this;
                t7 = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                obj2 = obj;
            }
            obj2 = objA;
            w63.e eVar = (w63.e) obj2;
            if (eVar.f183349b > 0) {
                return new nf.o(new lf.r(eVar, iVar.e(), null), i.f(iVar.f158767a, pVar.f158817d.a()), lf.e.NETWORK);
            }
            return null;
            r0Var.f105810a = t7;
            mf.a.c cVar2 = r0Var3.f105810a;
            if (cVar2 != null) {
                r0Var2.f105810a = iVar.i(cVar2);
                mf.a.c cVar3 = r0Var3.f105810a;
                cVar3.getClass();
                lf.n nVarH = iVar.h(cVar3);
                String str = iVar.f158767a;
                p pVar3 = r0Var2.f105810a;
                if (pVar3 != null && (mVar = pVar3.f158817d) != null) {
                    strA = mVar.a();
                }
                return new nf.o(nVarH, i.f(str, strA), lf.e.NETWORK);
            }
            q qVar = pVar.f158818e;
            if (qVar == null) {
                vb.h.z("body == null");
                return null;
            }
            dVar.f158787c = pVar;
            dVar.f158785a = null;
            dVar.f158786b = 2;
            objA = tf.e.a(qVar, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(String str, wf.m mVar, o13.l<? extends h> lVar, o13.l<? extends mf.a> lVar2, o13.l<? extends sf.b> lVar3, sf.d dVar) {
        this.f158767a = str;
        this.f158768b = mVar;
        this.f158769c = lVar;
        this.f158770d = lVar2;
        this.f158771e = lVar3;
        this.f158772f = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(i iVar, q qVar, v13.c cVar) {
        k kVar;
        w63.e eVar;
        iVar.getClass();
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f158798d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f158798d = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(iVar, cVar);
            }
        } else {
            kVar = new k(iVar, cVar);
        }
        Object obj = kVar.f158796b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f158798d;
        if (i15 == 0) {
            o13.r.b(obj);
            w63.e eVar2 = new w63.e();
            kVar.f158795a = eVar2;
            kVar.f158798d = 1;
            if (qVar.D1(eVar2) == aVar) {
                return aVar;
            }
            eVar = eVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = kVar.f158795a;
            o13.r.b(obj);
        }
        return new lf.r(eVar, iVar.e(), null);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code duplicated, block: B:87:0x010d  */
    public static final Object c(i iVar, mf.a.c cVar, p pVar, n nVar, p pVar2, v13.c cVar2) throws Exception {
        l lVar;
        mf.d.b bVarA;
        mf.a.b bVar;
        p pVar3;
        p pVar4;
        Throwable th3;
        q qVar;
        q qVar2;
        iVar.getClass();
        wf.m mVar = iVar.f158768b;
        if (cVar2 instanceof l) {
            lVar = (l) cVar2;
            int i14 = lVar.f158805g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f158805g = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(iVar, cVar2);
            }
        } else {
            lVar = new l(iVar, cVar2);
        }
        Object objB = lVar.f158803e;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f158805g;
        if (i15 == 0) {
            o13.r.b(objB);
            if (mVar.f185003h.f184898b) {
                sf.b value = iVar.f158771e.getValue();
                lVar.f158799a = cVar;
                lVar.f158800b = pVar2;
                lVar.f158805g = 1;
                objB = value.b(pVar, pVar2);
                if (objB == obj) {
                    return obj;
                }
            } else if (cVar != null) {
                try {
                    vb.h.p(cVar);
                    return null;
                } catch (RuntimeException e4) {
                    throw e4;
                } catch (Exception unused) {
                }
            }
            return null;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = lVar.f158802d;
            pVar3 = lVar.f158801c;
            pVar4 = lVar.f158800b;
            try {
                o13.r.b(objB);
                return bVar.a();
            } catch (Exception e14) {
                e = e14;
                try {
                    bVar.abort();
                } catch (Exception unused2) {
                }
                qVar = pVar4.f158818e;
                if (qVar != null) {
                    try {
                        vb.h.p(qVar);
                    } catch (RuntimeException e15) {
                        throw e15;
                    } catch (Exception unused3) {
                    }
                }
                qVar2 = pVar3.f158818e;
                if (qVar2 == null) {
                    throw e;
                }
                try {
                    vb.h.p(qVar2);
                    throw e;
                } catch (RuntimeException e16) {
                    throw e16;
                } catch (Exception unused4) {
                    throw e;
                }
            }
        }
        pVar2 = lVar.f158800b;
        cVar = lVar.f158799a;
        o13.r.b(objB);
        p pVar5 = ((sf.b.c) objB).f158760a;
        if (pVar5 != null) {
            if (cVar != null) {
                bVarA = cVar.T3();
            } else {
                mf.a value2 = iVar.f158770d.getValue();
                if (value2 != null) {
                    String str = mVar.f185000e;
                    if (str == null) {
                        str = iVar.f158767a;
                    }
                    bVarA = value2.a(str);
                } else {
                    bVarA = null;
                }
            }
            if (bVarA != null) {
                try {
                    try {
                        a0 a0VarC = w5.r.c(iVar.e().v(bVarA.f118287a.b(0), false));
                        try {
                            sf.a.f158755a.getClass();
                            sf.a.b(pVar5, a0VarC);
                            Unit unit = Unit.INSTANCE;
                            try {
                                a0VarC.close();
                                th3 = null;
                            } catch (Throwable th4) {
                                th3 = th4;
                            }
                        } catch (Throwable th5) {
                            try {
                                a0VarC.close();
                            } catch (Throwable th6) {
                                o13.g.a(th5, th6);
                            }
                            th3 = th5;
                        }
                        if (th3 != null) {
                            throw th3;
                        }
                        q qVar3 = pVar5.f158818e;
                        if (qVar3 != null) {
                            w63.l lVarE = iVar.e();
                            y yVarB = bVarA.f118287a.b(1);
                            lVar.f158799a = null;
                            lVar.f158800b = pVar2;
                            lVar.f158801c = pVar5;
                            lVar.f158802d = bVarA;
                            lVar.f158805g = 2;
                            if (qVar3.z2(lVarE, yVarB) == obj) {
                                return obj;
                            }
                        }
                        bVar = bVarA;
                        pVar3 = pVar5;
                        pVar4 = pVar2;
                        return bVar.a();
                    } catch (Exception e17) {
                        e = e17;
                        bVar = bVarA;
                        pVar3 = pVar5;
                        pVar4 = pVar2;
                        bVar.abort();
                        qVar = pVar4.f158818e;
                        if (qVar != null) {
                            vb.h.p(qVar);
                        }
                        qVar2 = pVar3.f158818e;
                        if (qVar2 == null) {
                            throw e;
                        }
                        vb.h.p(qVar2);
                        throw e;
                    }
                } catch (Exception e18) {
                    e = e18;
                    bVar = bVarA;
                    pVar3 = pVar5;
                    pVar4 = pVar2;
                    bVar.abort();
                    qVar = pVar4.f158818e;
                    if (qVar != null) {
                        vb.h.p(qVar);
                    }
                    qVar2 = pVar3.f158818e;
                    if (qVar2 == null) {
                        throw e;
                    }
                    vb.h.p(qVar2);
                    throw e;
                }
            }
        }
        return null;
    }

    public static String f(String str, String str2) {
        if (str2 == null || u.y(str2, "text/plain", false)) {
            dg.n.f59492a.getClass();
            String strB = dg.n.b(str);
            if (strB != null) {
                return strB;
            }
        }
        if (str2 != null) {
            return w.f0(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x011c A[Catch: Exception -> 0x003d, TryCatch #2 {Exception -> 0x003d, blocks: (B:15:0x0038, B:74:0x014e, B:22:0x004d, B:69:0x0134, B:71:0x0138, B:54:0x00ed, B:56:0x00f3, B:61:0x0115, B:66:0x0121, B:65:0x011c, B:39:0x0085, B:41:0x008e, B:48:0x00c1, B:50:0x00cd, B:44:0x00a3, B:46:0x00ad), top: B:86:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0133  */
    /* JADX WARN: Code duplicated, block: B:69:0x0134 A[Catch: Exception -> 0x003d, PHI: r0 r1
      0x0134: PHI (r0v28 java.lang.Object) = (r0v20 java.lang.Object), (r0v1 java.lang.Object) binds: [B:67:0x0131, B:22:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r1v10 kotlin.jvm.internal.r0) = (r1v8 kotlin.jvm.internal.r0), (r1v16 kotlin.jvm.internal.r0) binds: [B:67:0x0131, B:22:0x004d] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Exception -> 0x003d, blocks: (B:15:0x0038, B:74:0x014e, B:22:0x004d, B:69:0x0134, B:71:0x0138, B:54:0x00ed, B:56:0x00f3, B:61:0x0115, B:66:0x0121, B:65:0x011c, B:39:0x0085, B:41:0x008e, B:48:0x00c1, B:50:0x00cd, B:44:0x00a3, B:46:0x00ad), top: B:86:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0138 A[Catch: Exception -> 0x003d, TryCatch #2 {Exception -> 0x003d, blocks: (B:15:0x0038, B:74:0x014e, B:22:0x004d, B:69:0x0134, B:71:0x0138, B:54:0x00ed, B:56:0x00f3, B:61:0x0115, B:66:0x0121, B:65:0x011c, B:39:0x0085, B:41:0x008e, B:48:0x00c1, B:50:0x00cd, B:44:0x00a3, B:46:0x00ad), top: B:86:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014b, code lost:
    
        if (r0 == r7) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v10, types: [T, sf.p] */
    @Override // nf.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(t13.d<? super nf.i> dVar) throws Exception {
        b bVar;
        r0 r0VarS;
        T tB;
        r0 r0Var;
        sf.b.C2996b c2996b;
        r0 r0Var2;
        mf.a value;
        n nVarG;
        nf.o oVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f158781e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f158781e = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        b bVar2 = bVar;
        Object objD = bVar2.f158779c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r0 r0Var3 = bVar2.f158781e;
        String str = this.f158767a;
        try {
            if (r0Var3 != 0) {
                if (r0Var3 == 1) {
                    r0 r0Var4 = bVar2.f158778b;
                    r0 r0Var5 = bVar2.f158777a;
                    try {
                        o13.r.b(objD);
                        r0Var2 = r0Var4;
                        r0VarS = r0Var5;
                    } catch (Exception e4) {
                        e = e4;
                        r0Var3 = r0Var5;
                        mf.a.c cVar = (mf.a.c) r0Var3.f105810a;
                        if (cVar != null) {
                            try {
                                vb.h.p(cVar);
                            } catch (RuntimeException e14) {
                                throw e14;
                            } catch (Exception unused) {
                            }
                        }
                        throw e;
                    }
                } else if (r0Var3 == 2) {
                    r0VarS = bVar2.f158777a;
                    o13.r.b(objD);
                    oVar = (nf.o) objD;
                    if (oVar != null) {
                        return oVar;
                    }
                    n nVarG2 = g();
                    c cVar2 = new c(null);
                    bVar2.f158777a = r0VarS;
                    bVar2.f158778b = null;
                    bVar2.f158781e = 3;
                    objD = d(nVarG2, cVar2, bVar2);
                } else {
                    if (r0Var3 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r0 r0Var6 = bVar2.f158777a;
                    o13.r.b(objD);
                }
                return (nf.o) objD;
            }
            r0VarS = wr.g.s(objD);
            wf.m mVar = this.f158768b;
            if (!mVar.f185003h.f184897a || (value = this.f158770d.getValue()) == null) {
                tB = 0;
            } else {
                String str2 = mVar.f185000e;
                if (str2 == null) {
                    str2 = str;
                }
                tB = value.b(str2);
            }
            r0VarS.f105810a = tB;
            r0 r0Var7 = new r0();
            if (r0VarS.f105810a != 0) {
                Long l14 = e().n(((mf.a.c) r0VarS.f105810a).getMetadata()).f183382d;
                if (l14 != null && l14.longValue() == 0) {
                    return new nf.o(h((mf.a.c) r0VarS.f105810a), f(str, null), lf.e.DISK);
                }
                ?? I = i((mf.a.c) r0VarS.f105810a);
                r0Var7.f105810a = I;
                if (I != 0) {
                    sf.b value2 = this.f158771e.getValue();
                    p pVar = (p) r0Var7.f105810a;
                    g();
                    bVar2.f158777a = r0VarS;
                    bVar2.f158778b = r0Var7;
                    bVar2.f158781e = 1;
                    sf.b.C2996b c2996bA = value2.a(pVar);
                    if (c2996bA != aVar) {
                        r0Var2 = r0Var7;
                        objD = c2996bA;
                    }
                }
                return aVar;
            }
            r0Var = r0Var7;
            c2996b = null;
            if (c2996b != null || (nVarG = c2996b.f158758a) == null) {
                nVarG = g();
            }
            n nVar = nVarG;
            d dVar2 = new d(r0VarS, this, r0Var, nVar, null);
            bVar2.f158777a = r0VarS;
            bVar2.f158778b = null;
            bVar2.f158781e = 2;
            objD = d(nVar, dVar2, bVar2);
            if (objD == aVar) {
                oVar = (nf.o) objD;
                if (oVar != null) {
                    return oVar;
                }
                n nVarG3 = g();
                c cVar3 = new c(null);
                bVar2.f158777a = r0VarS;
                bVar2.f158778b = null;
                bVar2.f158781e = 3;
                objD = d(nVarG3, cVar3, bVar2);
            }
            return aVar;
            c2996b = (sf.b.C2996b) objD;
            if (c2996b.f158759b != null) {
                return new nf.o(h((mf.a.c) r0VarS.f105810a), f(str, c2996b.f158759b.f158817d.a()), lf.e.DISK);
            }
            r0Var = r0Var2;
            if (c2996b != null) {
                nVarG = g();
            } else {
                nVarG = g();
            }
            n nVar2 = nVarG;
            d dVar3 = new d(r0VarS, this, r0Var, nVar2, null);
            bVar2.f158777a = r0VarS;
            bVar2.f158778b = null;
            bVar2.f158781e = 2;
            objD = d(nVar2, dVar3, bVar2);
            if (objD == aVar) {
                oVar = (nf.o) objD;
                if (oVar != null) {
                    return oVar;
                }
                n nVarG4 = g();
                c cVar4 = new c(null);
                bVar2.f158777a = r0VarS;
                bVar2.f158778b = null;
                bVar2.f158781e = 3;
                objD = d(nVarG4, cVar4, bVar2);
            }
            return aVar;
        } catch (Exception e15) {
            e = e15;
        }
    }

    public final Object d(n nVar, e23.p pVar, b bVar) {
        if (this.f158768b.f185004i.f184897a && s.g(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
        return this.f158769c.getValue().a(nVar, new j(pVar, null), bVar);
    }

    public final w63.l e() {
        w63.l fileSystem;
        mf.a value = this.f158770d.getValue();
        return (value == null || (fileSystem = value.getF118285a()) == null) ? this.f158768b.f185001f : fileSystem;
    }

    public final n g() {
        hf.f.c<m> cVar = g.f158765b;
        wf.m mVar = this.f158768b;
        m mVar2 = (m) hf.g.b(mVar, cVar);
        mVar2.getClass();
        m.a aVar = new m.a(mVar2);
        wf.c cVar2 = mVar.f185003h;
        boolean z14 = cVar2.f184897a;
        boolean z15 = mVar.f185004i.f184897a && this.f158772f.a();
        if (!z15 && z14) {
            aVar.c("only-if-cached, max-stale=2147483647");
        } else if (!z15 || z14) {
            if (!z15 && !z14) {
                aVar.c("no-cache, only-if-cached");
            }
        } else if (cVar2.f184898b) {
            aVar.c("no-cache");
        } else {
            aVar.c("no-cache, no-store");
        }
        return new n(this.f158767a, (String) hf.g.b(mVar, g.f158764a), aVar.b(), (o) hf.g.b(mVar, g.f158766c), mVar.f185005j);
    }

    public final lf.n h(mf.a.c cVar) {
        y data = cVar.getData();
        w63.l lVarE = e();
        String str = this.f158768b.f185000e;
        if (str == null) {
            str = this.f158767a;
        }
        return lf.p.a(data, lVarE, str, cVar, 16);
    }

    public final p i(mf.a.c cVar) throws Throwable {
        Throwable th3;
        p pVarA;
        try {
            b0 b0VarD = w5.r.d(e().w(cVar.getMetadata()));
            try {
                sf.a.f158755a.getClass();
                pVarA = sf.a.a(b0VarD);
                try {
                    b0VarD.close();
                    th3 = null;
                } catch (Throwable th4) {
                    th3 = th4;
                }
            } catch (Throwable th5) {
                try {
                    b0VarD.close();
                } catch (Throwable th6) {
                    o13.g.a(th5, th6);
                }
                th3 = th5;
                pVarA = null;
            }
            if (th3 == null) {
                return pVarA;
            }
            throw th3;
        } catch (IOException unused) {
            return null;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsf/i$a;", "Lnf/j$a;", "Lhf/y;", "Lkotlin/Function0;", "Lsf/h;", "networkClient", "Lsf/b;", "cacheStrategy", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "Lsf/d;", "connectivityChecker", "<init>", "(Le23/a;Le23/a;Le23/l;)V", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements nf.j.a<hf.y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f158773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t f158774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final tf.b<Context, sf.d> f158775c;

        /* JADX INFO: renamed from: sf.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C2997a extends p005kotlin.jvm.internal.q implements e23.l<Context, sf.d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2997a f158776a = new C2997a();

            public C2997a() {
                super(1, f.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
            }

            @Override // e23.l
            public final sf.d invoke(Context context) {
                Context applicationContext = context.getApplicationContext();
                ConnectivityManager connectivityManager = (ConnectivityManager) a7.b.getSystemService(applicationContext, ConnectivityManager.class);
                if (connectivityManager == null || a7.b.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                    return sf.d.f158761a;
                }
                try {
                    return new e(connectivityManager);
                } catch (Exception unused) {
                    return sf.d.f158761a;
                }
            }
        }

        public a(e23.a<? extends h> aVar, e23.a<? extends sf.b> aVar2, e23.l<? super Context, ? extends sf.d> lVar) {
            this.f158773a = o13.m.b(aVar);
            this.f158774b = o13.m.b(aVar2);
            this.f158775c = new tf.b<>(lVar);
        }

        @Override // nf.j.a
        public final nf.j a(hf.y yVar, wf.m mVar, hf.j jVar) {
            hf.y yVar2 = yVar;
            if (!s.g(yVar2.f83620c, "http") && !s.g(yVar2.f83620c, "https")) {
                return null;
            }
            String str = yVar2.f83618a;
            t tVar = this.f158773a;
            t tVarB = o13.m.b(new ro0.g(jVar, 20));
            t tVar2 = this.f158774b;
            tf.b<Context, sf.d> bVar = this.f158775c;
            Context context = mVar.f184996a;
            Object obj = bVar.f164422b;
            tf.c cVar = tf.c.f164423a;
            if (obj == cVar) {
                synchronized (bVar) {
                    obj = bVar.f164422b;
                    if (obj == cVar) {
                        e23.l<? super Context, ? extends sf.d> lVar = bVar.f164421a;
                        lVar.getClass();
                        sf.d dVarInvoke = lVar.invoke(context);
                        bVar.f164422b = dVarInvoke;
                        bVar.f164421a = null;
                        obj = dVarInvoke;
                    }
                }
            }
            return new i(str, mVar, tVar, tVarB, tVar2, (sf.d) obj);
        }

        public /* synthetic */ a(e23.a aVar, e23.a aVar2, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(aVar, (i14 & 2) != 0 ? new sd.o(1) : aVar2, (i14 & 4) != 0 ? C2997a.f158776a : lVar);
        }
    }
}
