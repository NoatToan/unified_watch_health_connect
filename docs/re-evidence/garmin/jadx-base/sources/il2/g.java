package il2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import o53.s0;
import ok2.a0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pk2.b0;
import pk2.c0;
import pk2.f0;
import yr1.n;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lil2/g;", "", "<init>", "()V", "a", "file-transfer-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f94050g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f94051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static g f94052i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u53.d f94053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f94054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap<String, il2.a> f94055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f94056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jl2.c f94057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f94058f;

    static {
        Logger logger = LoggerFactory.getLogger("CFT#SyncInitializerShim");
        logger.getClass();
        f94051h = logger;
    }

    public g() {
        x53.c cVar = s0.f129406a;
        this.f94053a = zl.a.e("SyncInitializerShim", x53.b.f189152a.plus(ge1.b.h()));
        this.f94054b = new Object();
        this.f94055c = new ConcurrentHashMap<>();
    }

    public static final il2.a a(g gVar, rs2.c cVar) {
        synchronized (gVar.f94054b) {
            il2.a aVar = gVar.f94055c.get(cVar.getF92741e());
            if (aVar != null) {
                return aVar;
            }
            il2.a aVar2 = new il2.a(cVar, gVar.f94056d, null, null, 12, null);
            gVar.f94055c.put(cVar.getF92741e(), aVar2);
            return aVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(g gVar, n nVar, List list, yr1.i iVar) {
        yb2.c cVar = new yb2.c();
        dl2.a aVar = new dl2.a(nVar, 4);
        nVar.getClass();
        list.getClass();
        hy2.d dVar = nVar.f60322o;
        dVar.getClass();
        Object[] objArr = 0;
        cc2.g gVar2 = new cc2.g(((my2.a) dVar).f121526a, null, 2, 0 == true ? 1 : 0);
        a0 a0VarA = a0.f132585h.a();
        synchronized (a0VarA.f132592c) {
            try {
                int i14 = 1;
                if (a0VarA.g().f132584b != null) {
                    a0.f132586i.warn("Re-initializing CoreTransferHelper. Updated config ignored");
                } else {
                    a0VarA.g().f132584b = nVar;
                    Iterator<T> it = nVar.f132627g.iterator();
                    while (it.hasNext()) {
                        try {
                            ((f0) it.next()).c(a0VarA);
                        } catch (Exception unused) {
                        }
                    }
                    for (c0 c0Var : nVar.f132621a) {
                        try {
                            c0Var.c(a0VarA);
                        } catch (Exception unused2) {
                        }
                        c0Var.l(new b0(c0Var, new nw0.f(a0VarA, 16)));
                    }
                    uk2.a aVar2 = new uk2.a(false, i14, objArr == true ? 1 : 0);
                    AtomicReference<al2.e> atomicReference = a0VarA.f132596g;
                    while (true) {
                        if (!atomicReference.compareAndSet(null, aVar2)) {
                            if (atomicReference.get() != null) {
                                a0.f132586i.warn("Analytics have already been configured");
                                break;
                            }
                        } else {
                            a0VarA.b(aVar2);
                            break;
                        }
                    }
                    ge1.b.T(a0VarA.f132591b, null, null, new ok2.b0(a0VarA, null), 3);
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    rs2.c cVar2 = (rs2.c) it3.next();
                    if (cl2.c.m(cVar2)) {
                        a0VarA.c(cVar2);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        dl2.b bVarA = hl2.b.a(a0.f132585h.a());
        if (!(bVarA.f60322o instanceof my2.a)) {
            vb.h.s("ConnectTransferConfiguration must supply SyncingRetrofitServerDelegate");
            return;
        }
        if (iVar instanceof ec2.d) {
            vb.h.s("legacySyncConfig should not implement SyncDataQueryCallback. Non-legacy values provided by CoreTransferConfiguration");
            return;
        }
        e eVar = new e(bVarA, iVar);
        synchronized (gVar.f94054b) {
            if (gVar.f94058f) {
                f94051h.warn("SyncInitializerShim was already initialized");
                return;
            }
            gVar.c(eVar, list, gVar2, cVar);
            gVar.f94058f = true;
            ge1.b.T(gVar.f94053a, null, null, new j(eVar, aVar, null), 3);
        }
    }

    public final void c(e eVar, Collection collection, cc2.g gVar, xb2.a aVar) {
        collection.getClass();
        synchronized (this.f94054b) {
            try {
                ec2.c cVar = eVar.f94040b;
                ec2.b bVar = cVar instanceof ec2.b ? (ec2.b) cVar : null;
                gc2.a aVar2 = bVar != null ? bVar.f63791a : null;
                ec2.b bVar2 = cVar instanceof ec2.b ? (ec2.b) cVar : null;
                ec2.e.d(eVar, gVar, aVar, aVar2, bVar2 != null ? bVar2.f63792b : null);
                this.f94056d = eVar;
                ge1.b.T(this.f94053a, null, null, new k(collection, this, null), 3);
                a0 a0VarA = a0.f132585h.a();
                h hVar = new h(this, eVar);
                synchronized (a0VarA.f132592c) {
                    a0VarA.f132593d = hVar;
                    hVar.a(a0VarA.f132595f);
                    Unit unit = Unit.INSTANCE;
                }
                this.f94058f = true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lil2/g$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "Lil2/g;", "self", "Lil2/g;", "file-transfer-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final synchronized g a() {
            g gVar;
            try {
                if (g.f94052i == null) {
                    g.f94052i = new g();
                }
                gVar = g.f94052i;
                gVar.getClass();
            } catch (Throwable th3) {
                throw th3;
            }
            return gVar;
        }

        private a() {
        }
    }
}
