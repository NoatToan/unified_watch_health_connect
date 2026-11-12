package xm2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lxm2/g;", "", "<init>", "()V", "a", "b", "real-time-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f191527c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f191528d = new byte[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f191529e = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f191530f = LoggerFactory.getLogger("RT#RealTimeDataManager");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ConcurrentHashMap<h, CopyOnWriteArraySet<ym2.a>> f191531g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, b> f191532a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<h, byte[]> f191533b = new ConcurrentHashMap<>();

    public interface b {
        void b(h hVar);

        void c(h hVar, byte[] bArr);
    }

    private g() {
    }

    public static ArrayList c() {
        ArrayList list;
        synchronized (f191528d) {
            Enumeration<h> enumerationKeys = f191531g.keys();
            enumerationKeys.getClass();
            list = Collections.list(enumerationKeys);
            list.getClass();
        }
        return list;
    }

    public final void a(ym2.a aVar, h hVar, String str) {
        b bVar;
        aVar.getClass();
        hVar.getClass();
        str.getClass();
        CopyOnWriteArraySet<ym2.a> copyOnWriteArraySet = f191531g.get(hVar);
        Logger logger = f191530f;
        if (copyOnWriteArraySet == null) {
            logger.warn(hVar + " was not configured for this instance.");
            return;
        }
        if (!copyOnWriteArraySet.add(aVar)) {
            logger.warn("Adding already added listener");
        } else {
            if (copyOnWriteArraySet.size() != 1 || (bVar = this.f191532a.get(str)) == null) {
                return;
            }
            bVar.c(hVar, this.f191533b.get(hVar));
        }
    }

    public final void b(ym2.a aVar, h hVar, String str) {
        b bVar;
        aVar.getClass();
        hVar.getClass();
        str.getClass();
        CopyOnWriteArraySet<ym2.a> copyOnWriteArraySet = f191531g.get(hVar);
        if (copyOnWriteArraySet == null) {
            return;
        }
        if (!copyOnWriteArraySet.remove(aVar)) {
            f191530f.warn("Removing non-existent listener");
        } else {
            if (copyOnWriteArraySet.size() != 0 || (bVar = this.f191532a.get(str)) == null) {
                return;
            }
            bVar.b(hVar);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR&\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lxm2/g$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "LOGGER", "Lorg/slf4j/Logger;", "", "TAG_PREFIX", "Ljava/lang/String;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lxm2/h;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lym2/a;", "realTimeDataListeners", "Ljava/util/concurrent/ConcurrentHashMap;", "Lxm2/g;", "self", "Lxm2/g;", "", "selfLock", "[B", "real-time-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Collection collection) {
            collection.getClass();
            if (collection.isEmpty()) {
                vb.h.s("realTimeDataTypes is empty.");
                return;
            }
            synchronized (g.f191528d) {
                try {
                    g.f191531g.clear();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        g.f191531g.put((h) it.next(), new CopyOnWriteArraySet<>());
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public static g b() {
            g gVar;
            synchronized (g.f191528d) {
                gVar = g.f191529e;
            }
            return gVar;
        }

        private a() {
        }
    }
}
