package zk2;

import com.garmin.device.filetransfer.core.util.CoreTransferException;
import d53.u;
import ds.e0;
import e23.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o13.p;
import ok2.g0;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.a1;
import p13.h0;
import pk2.x;
import pk2.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lzk2/d;", "", "Lzk2/d$b;", "config", "", "logDebug", "<init>", "(Lzk2/d$b;Z)V", "a", "b", "c", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f205126e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f205127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f205128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<UUID, k> f205129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<al2.j> f205130d;

    public interface b {
        zy2.e a();

        long b();

        void c(wk2.f fVar, x xVar);

        int d(wk2.f fVar);

        Set<String> e(wk2.f fVar);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzk2/d$c;", "", "", "sentSize", "totalSize", "", "pendingUploads", "<init>", "(JJI)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f205131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f205132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f205133c;

        public c(long j8, long j14, int i14) {
            this.f205131a = j8;
            this.f205132b = j14;
            this.f205133c = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f205131a == cVar.f205131a && this.f205132b == cVar.f205132b && this.f205133c == cVar.f205133c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f205133c) + q6.f.e(Long.hashCode(this.f205131a) * 31, 31, this.f205132b);
        }

        public final String toString() {
            StringBuilder sbK = e0.k(this.f205131a, "ProgressInfo(sentSize=", ", totalSize=");
            sbK.append(this.f205132b);
            sbK.append(", pendingUploads=");
            sbK.append(this.f205133c);
            sbK.append(")");
            return sbK.toString();
        }
    }

    /* JADX INFO: renamed from: zk2.d$d, reason: collision with other inner class name */
    public /* synthetic */ class C3831d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f205134a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.FILE_TYPE_BLOCKING_FAILURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f205134a = iArr;
        }
    }

    static {
        new a(null);
        Logger logger = LoggerFactory.getLogger("CFT#CoreTransferQueue");
        logger.getClass();
        f205126e = logger;
    }

    public d(b bVar, boolean z14) {
        bVar.getClass();
        this.f205127a = bVar;
        this.f205128b = z14;
        this.f205129c = Collections.synchronizedMap(new LinkedHashMap());
        this.f205130d = new ArrayList<>();
    }

    public static k n(d dVar, UUID uuid) {
        k kVar;
        Map<UUID, k> map = dVar.f205129c;
        map.getClass();
        synchronized (map) {
            if (uuid == null) {
                try {
                    long jMillis = dVar.f205127a.a().millis();
                    Collection<k> collectionValues = dVar.f205129c.values();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : collectionValues) {
                        k kVar2 = (k) obj;
                        if (kVar2.f205160j != null) {
                            if (dVar.i(kVar2, jMillis) || q(kVar2)) {
                                arrayList.add(obj);
                            }
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((k) it.next()).j();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            Collection<k> collectionValues2 = dVar.f205129c.values();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : collectionValues2) {
                k kVar3 = (k) obj2;
                wk2.h hVar = kVar3.f205152b.f185844c;
                if (q(kVar3)) {
                    arrayList2.add(obj2);
                }
            }
            kVar = (k) h0.d0(h0.N0(arrayList2, new f(new i(new h(new g(new e(), uuid))))));
            if (kVar != null && kVar.f205152b.f185844c == wk2.h.DEVICE_TO_PHONE) {
                kVar.f205164n = dVar.l(kVar);
            }
        }
        return kVar;
    }

    public static boolean q(k kVar) {
        x xVar = kVar.f205158h;
        if (xVar != null) {
            return kVar.f205160j == null && xVar.f138498c == ok2.e.f132639g;
        }
        return true;
    }

    public final void a(Collection<? extends wk2.i> collection) {
        collection.getClass();
        for (wk2.i iVar : collection) {
            iVar.getClass();
            c(iVar, false);
        }
    }

    public final void b(wk2.i iVar, Long l14) {
        Map<UUID, k> map = this.f205129c;
        map.getClass();
        synchronized (map) {
            try {
                if (this.f205128b) {
                    f205126e.debug("blockItems(" + iVar.getId() + ", " + iVar.getDataType() + ")");
                }
                CoreTransferException coreTransferException = new CoreTransferException(ok2.e.f132641i, "Skipped with previous failed file", null, 4, null);
                for (k kVar : this.f205129c.values()) {
                    if (kVar.f205158h == null && kVar.f205152b.f185844c == iVar.getF205152b().f185844c && k(kVar, iVar)) {
                        f205126e.info("Skip " + kVar.f205152b + " because failed associated " + iVar.getF205152b());
                        kVar.f205158h = new x(y.FILE_TYPE_BLOCKING_FAILURE, coreTransferException);
                        kVar.f205160j = l14;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean c(wk2.i iVar, boolean z14) {
        Object obj;
        if (!(iVar instanceof k)) {
            vb.h.s("Only TransferItemImpl can be queued");
            return false;
        }
        Map<UUID, k> map = this.f205129c;
        map.getClass();
        synchronized (map) {
            try {
                k kVar = this.f205129c.get(((k) iVar).f205152b.f185842a);
                if (this.f205128b) {
                    f205126e.debug("add(" + ((k) iVar).f205152b.f185842a + "), hasExisting=" + (kVar != null));
                }
                if (kVar != null) {
                    try {
                        kVar.l((k) iVar);
                    } catch (Exception e4) {
                        f205126e.warn("Failed to reconcile item " + e4.getMessage() + StringUtils.SPACE + iVar);
                    }
                    return false;
                }
                Map<UUID, k> map2 = this.f205129c;
                map2.getClass();
                map2.put(((k) iVar).f205152b.f185842a, iVar);
                Iterator<T> it = this.f205129c.values().iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    k kVar2 = (k) next;
                    x xVar = kVar2.f205158h;
                    if ((xVar != null ? xVar.f138496a : null) == y.FILE_TYPE_BLOCKING_FAILURE && k(iVar, kVar2)) {
                        obj = next;
                        break;
                    }
                }
                k kVar3 = (k) obj;
                if (kVar3 != null) {
                    b(iVar, kVar3.f205160j);
                }
                return z14 ? p((k) iVar) : false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final p<Integer, List<al2.j>> d() {
        p<Integer, List<al2.j>> pVar;
        ok2.e eVar;
        Map<UUID, k> map = this.f205129c;
        map.getClass();
        synchronized (map) {
            try {
                if (this.f205128b) {
                    f205126e.debug("finishPendingItems()");
                }
                ArrayList arrayList = new ArrayList();
                long jMillis = this.f205127a.a().millis();
                HashSet hashSet = new HashSet();
                Map<UUID, k> map2 = this.f205129c;
                map2.getClass();
                Iterator<Map.Entry<UUID, k>> it = map2.entrySet().iterator();
                int i14 = 0;
                while (it.hasNext()) {
                    k value = it.next().getValue();
                    x xVar = value.f205158h;
                    if (xVar != null) {
                        if (value.f205160j == null) {
                            i14++;
                            if (xVar.f138496a != y.SUCCESS) {
                                al2.j.a aVar = al2.j.f3803d;
                                wk2.f fVar = value.f205152b;
                                aVar.getClass();
                                arrayList.add(al2.j.a.a(fVar, xVar));
                            }
                        }
                        if (!xVar.f138496a.f138508a) {
                            hashSet.add(value.f205152b.f185842a);
                        } else if (value.f205161k >= this.f205127a.d(value.f205152b)) {
                            hashSet.add(value.f205152b.f185842a);
                            this.f205127a.c(value.f205152b, xVar);
                        } else {
                            ok2.e eVar2 = xVar.f138498c;
                            if (eVar2 != null && eVar2.a()) {
                                value.j();
                            } else if (value.f205160j == null && ((eVar = xVar.f138498c) == null || !eVar.a())) {
                                value.f205160j = Long.valueOf(jMillis);
                                if (xVar.a()) {
                                    value.f205161k++;
                                } else if (xVar.f138498c == ok2.e.f132648p) {
                                    value.f205161k = 0;
                                }
                                if (xVar.b()) {
                                    value.j();
                                }
                            } else if (i(value, jMillis)) {
                                value.j();
                            }
                        }
                    }
                }
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    o((UUID) it3.next());
                }
                arrayList.addAll(this.f205130d);
                this.f205130d.clear();
                pVar = new p<>(Integer.valueOf(i14), arrayList);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return pVar;
    }

    public final wk2.i e(UUID uuid) {
        k kVar;
        uuid.getClass();
        Map<UUID, k> map = this.f205129c;
        map.getClass();
        synchronized (map) {
            kVar = this.f205129c.get(uuid);
        }
        return kVar;
    }

    public final Collection<UUID> f(wk2.h hVar) {
        Set setKeySet;
        hVar.getClass();
        Map<UUID, k> map = this.f205129c;
        map.getClass();
        synchronized (map) {
            try {
                Map<UUID, k> map2 = this.f205129c;
                map2.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<UUID, k> entry : map2.entrySet()) {
                    if (entry.getValue().f205152b.f185844c == hVar) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                setKeySet = linkedHashMap.keySet();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return setKeySet;
    }

    public final c g(Collection collection) {
        int i14;
        long jD;
        long j8;
        long totalSize;
        Map<UUID, k> map = this.f205129c;
        map.getClass();
        synchronized (map) {
            try {
                Collection<k> collectionValues = this.f205129c.values();
                ArrayList<k> arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    if (collection.contains(((k) obj).f205155e)) {
                        arrayList.add(obj);
                    }
                }
                i14 = 0;
                jD = 0;
                j8 = 0;
                for (k kVar : arrayList) {
                    if (kVar.getTotalSize() > 0) {
                        jD += Math.min(kVar.d(), kVar.getTotalSize());
                        totalSize = kVar.getTotalSize();
                    } else {
                        jD += kVar.d();
                        totalSize = 100000;
                    }
                    j8 += totalSize;
                    if (kVar.f205158h == null && kVar.f205152b.f185844c == wk2.h.DEVICE_TO_PHONE) {
                        i14++;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return new c(jD, j8, i14);
    }

    public final boolean h(int i14, UUID uuid, boolean z14) {
        boolean z15;
        Map<UUID, k> map = this.f205129c;
        map.getClass();
        synchronized (map) {
            try {
                long jMillis = this.f205127a.a().millis();
                Collection<k> collectionValues = this.f205129c.values();
                z15 = false;
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    for (k kVar : collectionValues) {
                        if (!s.g(uuid, kVar.f205152b.f185842a) && kVar.f205155e.a() >= i14) {
                            if (!z14 || !q(kVar)) {
                                if (z14) {
                                    continue;
                                } else if (i(kVar, jMillis) || q(kVar)) {
                                }
                            }
                            z15 = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z15;
    }

    public final boolean i(k kVar, long j8) {
        Long l14 = kVar.f205160j;
        if (l14 != null) {
            return this.f205127a.b() + l14.longValue() <= j8;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[LOOP:1: B:19:0x0046->B:32:?, LOOP_END, SYNTHETIC] */
    public final boolean j(wk2.f fVar, Collection<String> collection) {
        Set<String> setE;
        Iterator<T> it;
        fVar.getClass();
        if (collection != null) {
            Collection<String> collection2 = collection;
            if (collection2.isEmpty()) {
                setE = this.f205127a.e(fVar);
                if (!(setE instanceof Collection) && setE.isEmpty()) {
                    return false;
                }
                it = setE.iterator();
                while (it.hasNext()) {
                    if (collection.contains((String) it.next())) {
                    }
                }
                return false;
            }
            Iterator<T> it3 = collection2.iterator();
            while (it3.hasNext()) {
                if (u.q((String) it3.next(), fVar.f185843b, true)) {
                }
            }
            setE = this.f205127a.e(fVar);
            if (!(setE instanceof Collection)) {
            }
            it = setE.iterator();
            while (it.hasNext()) {
                if (collection.contains((String) it.next())) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean k(wk2.i iVar, wk2.i iVar2) {
        Set<String> setE = this.f205127a.e(iVar2.getF205152b());
        if (setE.isEmpty()) {
            setE = a1.b(iVar2.getDataType());
        }
        return j(iVar.getF205152b(), setE);
    }

    public final boolean l(k kVar) {
        Map<UUID, k> map = this.f205129c;
        map.getClass();
        synchronized (map) {
            try {
                Set<String> setE = this.f205127a.e(kVar.f205152b);
                boolean z14 = false;
                if (setE.isEmpty()) {
                    return false;
                }
                Collection<k> collectionValues = this.f205129c.values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    z14 = true;
                } else {
                    for (k kVar2 : collectionValues) {
                        if (!s.g(kVar2.f205152b.f185842a, kVar.f205152b.f185842a) && kVar2.f205155e == kVar.f205155e) {
                            wk2.f fVar = kVar2.f205152b;
                            if (fVar.f185844c != kVar.f205152b.f185844c || !setE.contains(fVar.f185843b) || !q(kVar2)) {
                            }
                        }
                    }
                    z14 = true;
                }
                return z14;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void m(wk2.h hVar, Collection<String> collection) {
        hVar.getClass();
        Map<UUID, k> map = this.f205129c;
        map.getClass();
        synchronized (map) {
            try {
                Map<UUID, k> map2 = this.f205129c;
                map2.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<UUID, k> entry : map2.entrySet()) {
                    k value = entry.getValue();
                    wk2.f fVar = value.f205152b;
                    if (fVar.f185844c == hVar && j(fVar, collection) && value.f205160j != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    k kVar = (k) ((Map.Entry) it.next()).getValue();
                    Long l14 = kVar.f205160j;
                    kVar.f205160j = Long.valueOf((l14 != null ? l14.longValue() : 0L) - this.f205127a.b());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final k o(UUID uuid) {
        k kVarRemove;
        uuid.getClass();
        Map<UUID, k> map = this.f205129c;
        map.getClass();
        synchronized (map) {
            kVarRemove = this.f205129c.remove(uuid);
            if (this.f205128b) {
                f205126e.debug("remove(" + uuid + "), didExist=" + (kVarRemove != null));
            }
            if (kVarRemove != null) {
                try {
                    wk2.e eVar = kVarRemove.f205153c;
                    if (eVar != null) {
                        eVar.close();
                    }
                } catch (Exception unused) {
                }
                try {
                    wk2.d dVar = kVarRemove.f205154d;
                    if (dVar != null) {
                        dVar.close();
                    }
                } catch (Exception unused2) {
                }
            }
            x xVar = kVarRemove != null ? kVarRemove.f205158h : null;
            if ((xVar != null ? xVar.f138498c : null) == ok2.e.E) {
                ArrayList<al2.j> arrayList = this.f205130d;
                al2.j.a aVar = al2.j.f3803d;
                wk2.f fVar = kVarRemove.f205152b;
                aVar.getClass();
                arrayList.add(al2.j.a.a(fVar, xVar));
            }
        }
        return kVarRemove;
    }

    public final boolean p(k kVar) {
        Object obj;
        Integer num;
        Integer num2 = kVar.f205152b.f185848g;
        if (num2 == null) {
            return false;
        }
        int iIntValue = num2.intValue();
        Collection<k> collectionValues = this.f205129c.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collectionValues) {
            k kVar2 = (k) obj2;
            if (!s.g(kVar2.f205152b.f185842a, kVar.f205152b.f185842a) && kVar2.f205162l == kVar.f205162l && (num = kVar2.f205152b.f185848g) != null && num.intValue() > iIntValue) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long j8 = ((k) next).f205157g;
                do {
                    Object next2 = it.next();
                    long j14 = ((k) next2).f205157g;
                    if (j8 > j14) {
                        next = next2;
                        j8 = j14;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        k kVar3 = (k) obj;
        if (kVar3 == null) {
            return false;
        }
        long j15 = kVar3.f205157g;
        if (j15 > kVar.f205157g) {
            return false;
        }
        kVar.f205157g = j15 - 1;
        f205126e.warn("Reordered " + kVar.f205152b + " ahead of " + kVar3.f205152b + " with later creationId");
        return true;
    }

    public final void r(UUID uuid, x xVar) {
        if (uuid == null) {
            return;
        }
        Map<UUID, k> map = this.f205129c;
        map.getClass();
        synchronized (map) {
            try {
                k kVar = this.f205129c.get(uuid);
                if (kVar != null) {
                    kVar.k(xVar);
                    if (C3831d.f205134a[xVar.f138496a.ordinal()] == 1) {
                        b(kVar, null);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final ArrayList s(l lVar, l lVar2) {
        ArrayList<k> arrayList;
        Map<UUID, k> map = this.f205129c;
        map.getClass();
        synchronized (map) {
            try {
                long jMillis = this.f205127a.a().millis();
                Collection<k> collectionValues = this.f205129c.values();
                arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    k kVar = (k) obj;
                    kVar.getClass();
                    if ((i(kVar, jMillis) || q(kVar)) && ((Boolean) lVar.invoke(kVar)).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                for (k kVar2 : arrayList) {
                    kVar2.getClass();
                    g0 g0Var = (g0) lVar2.invoke(kVar2);
                    g0Var.getClass();
                    kVar2.f205155e = g0Var;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzk2/d$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "DEFAULT_FILE_SIZE", "J", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ d(b bVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? false : z14);
    }
}
