package ok2;

import android.content.Context;
import com.garmin.sync.UploadConfigurationLoader;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\u001f\b\u0000\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lok2/a0;", "Lok2/v;", "Lkotlin/Function1;", "Lok2/a;", "factory", "<init>", "(Le23/l;)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 implements v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f132585h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f132586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final zy2.f f132587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f132588k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static a0 f132589l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f132590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u53.d f132591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f132592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public il2.h f132593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<String, g> f132594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final al2.f f132595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<al2.e> f132596g;

    static {
        Logger logger = LoggerFactory.getLogger("CFT#TransferHelper");
        logger.getClass();
        f132586i = logger;
        f132587j = new zy2.f();
        f132588k = new Object();
    }

    public a0(e23.l<? super a0, ? extends ok2.a> lVar) {
        lVar.getClass();
        this.f132590a = o13.m.b(new oe.j(5, lVar, this));
        x53.c cVar = s0.f129406a;
        this.f132591b = zl.a.e("TransferHelper", x53.b.f189152a.plus(ge1.b.h()));
        this.f132592c = new Object();
        this.f132594e = new HashMap<>();
        this.f132595f = new al2.f(null, 1, null);
        this.f132596g = new AtomicReference<>(null);
    }

    public static final synchronized a0 f() {
        return f132585h.a();
    }

    @Override // ok2.v
    public final w a(String str) {
        w wVar;
        str.getClass();
        synchronized (this.f132592c) {
            try {
                g gVarD = d(str);
                if (gVarD == null || (wVar = gVarD.f132691j) == null) {
                    il2.h hVar = this.f132593d;
                    wVar = hVar != null ? (w) new il2.i(hVar).invoke(str) : null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return wVar;
    }

    public final void b(al2.e eVar) {
        eVar.getClass();
        al2.f fVar = this.f132595f;
        fVar.getClass();
        fVar.f3794b.add(eVar);
    }

    public final g c(rs2.c cVar) {
        g gVar;
        cVar.getClass();
        synchronized (this.f132592c) {
            try {
                gVar = this.f132594e.get(cVar.getF92741e());
                if (gVar == null) {
                    if (g().f132584b == null) {
                        throw new IllegalAccessException("Attempted to create TransferManager without initialize call");
                    }
                    if (!cl2.c.m(cVar)) {
                        throw new IllegalArgumentException("Attempted to create TransferManager for non-transfer capable device");
                    }
                    g gVar2 = new g(cVar, g(), this.f132595f, getConfiguration().n().c());
                    this.f132594e.put(cVar.getF92741e(), gVar2);
                    pk2.b bVar = gVar2.f132696o;
                    bVar.getClass();
                    bVar.o(new pk2.k(bVar, null));
                    gVar = gVar2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return gVar;
    }

    public final g d(String str) {
        g gVar;
        str.getClass();
        synchronized (this.f132592c) {
            gVar = this.f132594e.get(str);
        }
        return gVar;
    }

    public final List e() {
        List listB1;
        synchronized (this.f132592c) {
            Collection<g> collectionValues = this.f132594e.values();
            collectionValues.getClass();
            listB1 = p13.h0.b1(collectionValues);
        }
        return listB1;
    }

    public final ok2.a g() {
        return (ok2.a) this.f132590a.getValue();
    }

    @Override // ok2.v
    public final d getConfiguration() {
        return g().getConfiguration();
    }

    public final void h(String str) {
        g gVarRemove;
        rs2.c cVar;
        str.getClass();
        synchronized (this.f132592c) {
            gVarRemove = this.f132594e.remove(str);
            Unit unit = Unit.INSTANCE;
        }
        g gVar = gVarRemove;
        if (gVar != null) {
            gVar.x("Device " + str + " removed");
        }
        il2.h hVar = this.f132593d;
        if (hVar != null) {
            il2.g gVar2 = hVar.f94059a;
            Object obj = gVar2.f94054b;
            il2.e eVar = hVar.f94060b;
            synchronized (obj) {
                il2.a aVarRemove = gVar2.f94055c.remove(str);
                if (aVarRemove != null && (cVar = aVarRemove.f94007a) != null) {
                    long f172494b = cVar.getF92746j();
                    UploadConfigurationLoader.b bVar = UploadConfigurationLoader.f52783g;
                    Context contextM = eVar.m();
                    Long lValueOf = Long.valueOf(f172494b);
                    bVar.getClass();
                    UploadConfigurationLoader.b.a(contextM, lValueOf);
                }
            }
        }
    }

    public final void i() {
        Context context;
        HashSet hashSet = new HashSet();
        synchronized (this.f132592c) {
            hashSet.addAll(this.f132594e.values());
            this.f132594e.clear();
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((g) it.next()).x("User signed out");
        }
        yr1.n nVar = g().f132584b;
        if (nVar == null || (context = nVar.f132622b) == null) {
            f132586i.warn("config or context unavailable");
        } else {
            UploadConfigurationLoader.f52783g.getClass();
            UploadConfigurationLoader.b.a(context, null);
        }
    }

    public final void j(al2.e eVar) {
        eVar.getClass();
        al2.f fVar = this.f132595f;
        fVar.getClass();
        fVar.f3794b.remove(eVar);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lok2/a0$a;", "", "<init>", "()V", "", "LOG_PREFIX", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "selfLock", "Ljava/lang/Object;", "Lok2/a0;", "self", "Lok2/a0;", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final synchronized a0 a() {
            a0 a0Var;
            synchronized (a0.f132588k) {
                try {
                    if (a0.f132589l == null) {
                        a0.f132589l = new a0(null, 1, 0 == true ? 1 : 0);
                    }
                    a0Var = a0.f132589l;
                    a0Var.getClass();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return a0Var;
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ a0(e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new oe2.g(9) : lVar);
    }
}
