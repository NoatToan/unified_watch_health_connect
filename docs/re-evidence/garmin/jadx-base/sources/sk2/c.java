package sk2;

import al2.l;
import al2.m;
import al2.n;
import bl2.y;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import lk2.v;
import o13.p;
import o53.b0;
import o53.r;
import o53.s0;
import o53.z;
import ok2.a0;
import ok2.c0;
import ok2.g0;
import ok2.j;
import ok2.w;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.a1;
import p13.l0;
import p13.t0;
import pk2.e0;
import pk2.f0;
import pk2.x;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB'\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u0013\b\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\fB\t\b\u0016¢\u0006\u0004\b\t\u0010\r¨\u0006\u000f"}, d2 = {"Lsk2/c;", "Lpk2/f0;", "Lal2/m;", "Lsk2/b;", "cachedXmlAccessor", "Lo53/z;", "dispatcher", "Lsk2/a;", "legacyCachedXmlAccessor", "<init>", "(Lsk2/b;Lo53/z;Lsk2/a;)V", "(Lsk2/a;)V", "(Lsk2/b;)V", "()V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c implements f0, m {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f159932o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final v f159933p = new v(l0.f134950a, a1.b("GDXml"), null, 4, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final g0 f159934q = g0.USER_INITIATED_GENERAL;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Logger f159935r = LoggerFactory.getLogger("CFT#XmlReadAgent");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sk2.b f159936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f159937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sk2.a f159938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0 f159939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, e0> f159940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f159941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u53.d f159942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f159943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap<String, UUID> f159944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap<String, r<p<byte[], UUID>>> f159945k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap<String, List<m>> f159946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashSet<String> f159947m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a0 f159948n;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/p;", "", "Ljava/util/UUID;", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.core.agent.xml.DeviceXmlReadAgent$getCachedXml$1$1", f = "DeviceXmlReadAgent.kt", l = {151}, m = "invokeSuspend")
    public static final class b extends i implements e23.p<b0, t13.d<? super p<? extends byte[], ? extends UUID>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f159949a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ rs2.c f159951c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(rs2.c cVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f159951c = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new b(this.f159951c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super p<? extends byte[], ? extends UUID>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            c cVar = c.this;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f159949a;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    sk2.a aVar2 = cVar.f159938d;
                    rs2.c cVar2 = this.f159951c;
                    if (aVar2 != null) {
                        return aVar2.f(cVar2);
                    }
                    sk2.b bVar = cVar.f159936b;
                    this.f159949a = 1;
                    obj = bVar.a(cVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return (p) obj;
            } catch (Exception unused) {
                return new p(null, null);
            }
        }
    }

    public c(sk2.b bVar, z zVar, sk2.a aVar) {
        bVar.getClass();
        zVar.getClass();
        this.f159936b = bVar;
        this.f159937c = zVar;
        this.f159938d = aVar;
        e0 e0Var = e0.ALLOWED;
        this.f159939e = e0Var;
        this.f159940f = t0.b(new p("GDXml", e0Var));
        this.f159941g = f159933p;
        this.f159942h = zl.a.e("DeviceXmlReadAgent", zVar.plus(ge1.b.h()));
        this.f159943i = new Object();
        this.f159944j = new ConcurrentHashMap<>();
        this.f159945k = new HashMap<>();
        this.f159946l = new HashMap<>();
        this.f159947m = new LinkedHashSet<>();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x006e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:28:0x0068, B:32:0x006e, B:35:0x0078, B:38:0x0085), top: B:46:0x0068, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object F(c cVar, rs2.c cVar2, v13.c cVar3) {
        e eVar;
        p<byte[], UUID> pVarF;
        byte[] bArr;
        UUID uuid;
        if (cVar3 instanceof e) {
            eVar = (e) cVar3;
            int i14 = eVar.f159957e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f159957e = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(cVar, cVar3);
            }
        } else {
            eVar = new e(cVar, cVar3);
        }
        Object objA = eVar.f159955c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f159957e;
        try {
            if (i15 == 0) {
                o13.r.b(objA);
                if (!cVar.f159944j.containsKey(cVar2.getF92741e())) {
                    sk2.a aVar2 = cVar.f159938d;
                    if (aVar2 != null) {
                        pVarF = aVar2.f(cVar2);
                    } else {
                        sk2.b bVar = cVar.f159936b;
                        eVar.f159953a = cVar;
                        eVar.f159954b = cVar2;
                        eVar.f159957e = 1;
                        objA = bVar.a(cVar2, eVar);
                        if (objA == aVar) {
                            return aVar;
                        }
                    }
                    bArr = pVarF.f128594a;
                    uuid = pVarF.f128595b;
                    synchronized (cVar.f159943i) {
                        if (bArr != null) {
                            try {
                                if (bArr.length == 0) {
                                    if (uuid == null) {
                                        f159935r.debug("App cached xml bytes but not xml id. Xml will be read again");
                                    }
                                    cVar.f159944j.put(cVar2.getF92741e(), uuid);
                                    Unit unit = Unit.INSTANCE;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        f159935r.warn("Ignore cached empty xml bytes. Xml will be read again");
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cVar2 = eVar.f159954b;
            cVar = eVar.f159953a;
            o13.r.b(objA);
            pVarF = (p) objA;
            bArr = pVarF.f128594a;
            uuid = pVarF.f128595b;
            synchronized (cVar.f159943i) {
                if (bArr != null) {
                    if (bArr.length == 0) {
                        if (uuid == null) {
                            f159935r.debug("App cached xml bytes but not xml id. Xml will be read again");
                        }
                        cVar.f159944j.put(cVar2.getF92741e(), uuid);
                        Unit unit2 = Unit.INSTANCE;
                        return Unit.INSTANCE;
                    }
                }
                f159935r.warn("Ignore cached empty xml bytes. Xml will be read again");
                return Unit.INSTANCE;
            }
        } catch (Exception unused) {
        }
    }

    @Override // pk2.z
    public final String A() {
        return "DeviceXmlAgent";
    }

    @Override // al2.m
    public final void B(n nVar) {
        synchronized (this.f159943i) {
            try {
                List<m> list = this.f159946l.get(nVar.f3829a.getF92741e());
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ge1.b.T(this.f159942h, null, null, new d(new al2.h((m) it.next(), nVar, 1), null), 3);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // pk2.z
    public final Map<String, e0> D() {
        return this.f159940f;
    }

    public final p<byte[], UUID> E(rs2.c cVar) {
        p<byte[], UUID> pVar;
        cVar.getClass();
        synchronized (this.f159943i) {
            pVar = (p) ge1.b.W(this.f159937c, new b(cVar, null));
        }
        return pVar;
    }

    public final Object a(rs2.c cVar, c0 c0Var) {
        synchronized (this.f159943i) {
            r<p<byte[], UUID>> rVar = this.f159945k.get(cVar.getF92741e());
            if (rVar != null) {
                return rVar.await(c0Var);
            }
            p<byte[], UUID> pVarE = E(cVar);
            byte[] bArr = pVarE.f128594a;
            UUID uuid = pVarE.f128595b;
            if (bArr == null || uuid == null) {
                throw new CoreTransferException(ok2.e.f132645m, "Unable to find active transfer request", null, 4, null);
            }
            return new p(bArr, uuid);
        }
    }

    @Override // pk2.f0
    public final wk2.a b(rs2.c cVar, wk2.f fVar) {
        cVar.getClass();
        wk2.d.f185837a.getClass();
        return new wk2.a(cVar, fVar, null, 4, null);
    }

    @Override // pk2.z
    public final void c(a0 a0Var) {
        this.f159948n = a0Var;
    }

    @Override // pk2.z
    public final Object e(rs2.c cVar, j jVar) {
        boolean zRemove;
        synchronized (this.f159943i) {
            zRemove = this.f159947m.remove(cVar.getF92741e());
        }
        if (zRemove) {
            f159935r.info("GDXML change for " + cVar.getF92746j() + " may indicate SW update so check to confirm only latest are queued");
            a0 a0Var = this.f159948n;
            if (a0Var == null) {
                s.m("helper");
                throw null;
            }
            w wVarA = a0Var.a(cVar.getF92741e());
            if (wVarA != null) {
                wVarA.p();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // pk2.f0
    public final Object j(rs2.c cVar, g0 g0Var, pk2.g gVar) {
        return Unit.INSTANCE;
    }

    @Override // pk2.z
    /* JADX INFO: renamed from: k, reason: from getter */
    public final e0 getF153363d() {
        return this.f159939e;
    }

    @Override // pk2.f0
    public final boolean m(rs2.c cVar, wk2.f fVar) {
        boolean z14;
        cVar.getClass();
        fVar.getClass();
        if (!s.g(fVar.f185843b, "GDXml")) {
            return false;
        }
        synchronized (this.f159943i) {
            z14 = !s.g(fVar.f185842a, this.f159944j.get(cVar.getF92741e()));
        }
        return z14;
    }

    @Override // pk2.f0
    public final Object n(rs2.c cVar, wk2.n nVar, dz2.b bVar, y yVar) {
        UUID uuid = nVar.getF205152b().f185842a;
        byte[] bArrE = bVar.e((int) bVar.getF61810d());
        cVar.getClass();
        uuid.getClass();
        bArrE.getClass();
        synchronized (this.f159943i) {
            try {
                if (!s.g(this.f159944j.put(cVar.getF92741e(), uuid), uuid)) {
                    ge1.b.W(this.f159937c, new f(this, cVar, bArrE, uuid, null));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        x.f138495e.getClass();
        return x.a.e();
    }

    @Override // pk2.z
    public final x q(rs2.c cVar, wk2.f fVar, x xVar) {
        cVar.getClass();
        fVar.getClass();
        xVar.getClass();
        return null;
    }

    @Override // pk2.f0
    public final String r(rs2.c cVar) {
        cVar.getClass();
        return null;
    }

    @Override // pk2.z
    public final Set t(rs2.c cVar, wk2.f fVar) {
        fVar.getClass();
        cVar.getClass();
        return pk2.z.a.a(cVar, fVar);
    }

    @Override // al2.m
    public final void u(l lVar) {
        synchronized (this.f159943i) {
            try {
                boolean z14 = lVar.f3822d.f3817a;
                HashMap<String, List<m>> map = this.f159946l;
                rs2.c cVar = lVar.f3819a;
                List<m> listRemove = z14 ? map.remove(cVar.getF92741e()) : map.get(cVar.getF92741e());
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ge1.b.T(this.f159942h, null, null, new d(new al2.g((m) it.next(), lVar, 1), null), 3);
                    }
                }
                if (lVar.f3822d.f3817a) {
                    r<p<byte[], UUID>> rVarRemove = this.f159945k.remove(lVar.f3819a.getF92741e());
                    if (rVarRemove == null) {
                        return;
                    }
                    if (s.g(lVar.a(), Boolean.TRUE)) {
                        p<byte[], UUID> pVarE = E(lVar.f3819a);
                        byte[] bArr = pVarE.f128594a;
                        UUID uuid = pVarE.f128595b;
                        if (bArr != null) {
                            rVarRemove.p(new p<>(bArr, uuid));
                        } else {
                            this.f159944j.remove(lVar.f3819a.getF92741e());
                            rVarRemove.O(new CoreTransferException(ok2.e.f132645m, "Device XML not saved", null, 4, null));
                        }
                    } else {
                        CoreTransferException coreTransferException = lVar.f3826h;
                        if (coreTransferException == null) {
                            coreTransferException = s.g(lVar.a(), Boolean.FALSE) ? new CoreTransferException(ok2.e.f132646n, "Failed to read device XML", null, 4, null) : new CoreTransferException(ok2.e.f132645m, "Missing isSuccess for complete event", null, 4, null);
                        }
                        rVarRemove.O(coreTransferException);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // pk2.f0
    public final List<UUID> v(x xVar) {
        xVar.getClass();
        return getF159941g().f113303b;
    }

    @Override // pk2.f0
    public final Object w(rs2.c cVar, i iVar) {
        return F(this, cVar, iVar);
    }

    @Override // pk2.f0
    /* JADX INFO: renamed from: z, reason: from getter */
    public final v getF159941g() {
        return this.f159941g;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lsk2/c$a;", "", "<init>", "()V", "Lok2/g0;", "XML_TRANSFER_PRIORITY", "Lok2/g0;", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "LOGGER", "Lorg/slf4j/Logger;", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static boolean a(String str) {
            str.getClass();
            try {
                a0 a0VarA = a0.f132585h.a();
                w wVarA = a0VarA.a(str);
                if (wVarA == null || !wVarA.l()) {
                    return false;
                }
                List<f0> list = a0VarA.getConfiguration().f132627g;
                if (list != null && list.isEmpty()) {
                    return false;
                }
                for (f0 f0Var : list) {
                    if ((f0Var instanceof c) && !(((c) f0Var).f159936b instanceof g)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(sk2.b bVar, z zVar, sk2.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(bVar, zVar, (i14 & 4) != 0 ? null : aVar);
    }

    @o13.e
    public c(sk2.a aVar) {
        this(new g(), null, aVar, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(sk2.b bVar) {
        this(bVar, x53.b.f189152a, null, 4, null);
        bVar.getClass();
        x53.c cVar = s0.f129406a;
    }

    public c() {
        this(new g());
    }
}
