package ps2;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.classic.Logger;
import com.garmin.garminpay.util.EnumTypeAdapterFactory;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import p005kotlin.Metadata;
import p005kotlin.UninitializedPropertyAccessException;
import p005kotlin.Unit;
import p13.d0;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lps2/w;", "Lhs2/e;", "Lps2/t;", "<init>", "()V", "a", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
public final class w implements hs2.e, t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f140538a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f140539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static x f140540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f140541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f140542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap<Long, hs2.e.a> f140543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final CopyOnWriteArraySet<is2.b> f140544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final CopyOnWriteArraySet f140545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Handler f140546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f140547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static long f140548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static zi2.a f140549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f140550m;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps2/w$a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        REMOVED_GC_DEVICE,
        FACTORY_RESET,
        SIGN_OUT
    }

    static {
        int i14 = gt2.c.f79010a;
        f140539b = gt2.b.f79005a.i("PAY#CORE#UserWallet");
        f140541d = new HashMap();
        f140542e = new HashMap();
        f140543f = new HashMap<>();
        f140544g = new CopyOnWriteArraySet<>();
        f140545h = new CopyOnWriteArraySet();
        f140546i = new Handler(Looper.getMainLooper());
        f140547j = -1;
        f140548k = -1L;
    }

    private w() {
    }

    public static void e() {
        HashSet hashSet = new HashSet();
        HashMap map = f140542e;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.add(((ms2.g) it.next()).destroy());
        }
        try {
            int i14 = w03.b.f181178a;
            new z03.l(hashSet).k(l13.a.f108327b).e();
        } catch (Exception e4) {
            f140539b.error("failed to destroy providers", (Throwable) e4);
        }
        map.clear();
    }

    public static void f(long j8, a aVar) {
        aVar.getClass();
        n nVar = (n) f140541d.remove(Long.valueOf(j8));
        x xVar = f140540c;
        if (xVar == null) {
            p005kotlin.jvm.internal.s.m("cache");
            throw null;
        }
        xVar.d(j8);
        if (nVar != null) {
            nVar.f(aVar);
            Iterator it = f140545h.iterator();
            while (it.hasNext()) {
                f140546i.post(new v((u) it.next(), j8));
            }
        }
    }

    public static HashSet g(Collection collection, boolean z14) {
        f140539b.debug("getNfcCapabilities");
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d0.v(hashSet, ((hs2.a) it.next()).getNfcInfo().b());
        }
        if (z14) {
            hashSet.add(pl2.c.f138556c);
            hashSet.add(pl2.c.f138569p);
        }
        return hashSet;
    }

    public static HashSet h(Collection collection, boolean z14) {
        f140539b.debug("getSupportedProviderTypes");
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d0.v(hashSet, ((hs2.a) it.next()).i());
        }
        is2.b bVar = is2.b.FITPAY;
        if (!hashSet.contains(bVar) && z14) {
            hashSet.add(bVar);
        }
        return hashSet;
    }

    public static n i(long j8) {
        return (n) f140541d.get(Long.valueOf(j8));
    }

    public static List j(is2.b bVar) {
        bVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : f140541d.entrySet()) {
            if (((n) entry.getValue()).f140498a.i().contains(bVar)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return h0.b1(linkedHashMap.values());
    }

    public static boolean k(Set set, Set set2) {
        ms2.g gVarD;
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            is2.b bVar = (is2.b) it.next();
            HashMap map = f140542e;
            if (map.get(bVar) == null) {
                ms2.i.f120498a.getClass();
                bVar.getClass();
                set2.getClass();
                ConcurrentHashMap<is2.b, ms2.h> concurrentHashMap = ms2.i.f120499b;
                ms2.h hVar = concurrentHashMap.get(bVar);
                if (hVar == null ? false : hVar.b(set2)) {
                    ms2.h hVar2 = concurrentHashMap.get(bVar);
                    hVar2.getClass();
                    gVarD = hVar2.d(set2);
                    if (gVarD.getF133320a() != bVar) {
                        vb.h.s("IServiceProviderCreator created provider with unexpected type");
                        return false;
                    }
                } else {
                    gVarD = null;
                }
                if (gVarD != null) {
                    map.put(bVar, gVarD);
                    hashSet.add(gVarD);
                }
            }
        }
        HashSet hashSet2 = new HashSet();
        try {
            CopyOnWriteArraySet<is2.b> copyOnWriteArraySet = f140544g;
            ArrayList arrayList = new ArrayList(y.r(hashSet, 10));
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                arrayList.add(((ms2.g) it3.next()).getF133320a());
            }
            copyOnWriteArraySet.removeAll(arrayList);
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                d dVar = new d((ms2.g) it4.next(), 9);
                int i14 = w03.b.f181178a;
                hashSet2.add(new z03.h(dVar));
            }
            int i15 = w03.b.f181178a;
            new z03.l(hashSet2).k(l13.a.f108327b).e();
        } catch (Exception e4) {
            f140539b.error("unexpected error initializing providers", (Throwable) e4);
        }
        return !hashSet.isEmpty();
    }

    public static void l() {
        HashMap map = f140541d;
        try {
            f140548k = -1L;
            ls2.b.f114790a.c();
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((n) it.next()).f(a.SIGN_OUT);
            }
            map.clear();
            x xVar = f140540c;
            if (xVar == null) {
                p005kotlin.jvm.internal.s.m("cache");
                throw null;
            }
            xVar.a();
            e();
        } catch (UninitializedPropertyAccessException unused) {
            f140539b.warn("signOut called before initialize");
        }
    }

    @Override // ps2.t
    public final ms2.g a(is2.b bVar) {
        bVar.getClass();
        return (ms2.g) f140542e.get(bVar);
    }

    @Override // hs2.e
    public final void b(hs2.a aVar, jn2.m mVar) {
        Handler handler = f140546i;
        CopyOnWriteArraySet copyOnWriteArraySet = f140545h;
        HashMap map = f140541d;
        Logger logger = f140539b;
        x xVar = f140540c;
        if (xVar == null) {
            p005kotlin.jvm.internal.s.m("cache");
            throw null;
        }
        p pVar = xVar.f140559d;
        pVar.getClass();
        synchronized (pVar.f140535c) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) pVar.f140534b.getValue()).edit();
            String json = new GsonBuilder().registerTypeAdapterFactory(new EnumTypeAdapterFactory()).create().toJson(aVar);
            p.f140532d.debug("Saving:" + json);
            editorEdit.putString(String.valueOf(aVar.getUnitId()), json);
            editorEdit.apply();
            Unit unit = Unit.INSTANCE;
        }
        f140543f.remove(Long.valueOf(aVar.getUnitId()));
        n nVar = (n) map.get(Long.valueOf(aVar.getUnitId()));
        if (nVar == null) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                handler.post(new v((u) it.next(), aVar, 1));
            }
        }
        if (k(aVar.i(), aVar.getNfcInfo().b())) {
            logger.debug("deviceAvailable: initialized new service providers");
        }
        if (nVar != null) {
            logger.debug("deviceAvailable: existing device " + aVar.getUnitId());
            hs2.d dVar = nVar.f140499b;
            if (dVar != null) {
                dVar.v(aVar.getMacAddress());
            }
        } else {
            if (aVar.getNfcInfo().b().isEmpty()) {
                return;
            }
            logger.debug("deviceAvailable: new device " + aVar.getUnitId());
            long j8 = f140548k;
            zi2.a aVar2 = f140549l;
            if (aVar2 == null) {
                p005kotlin.jvm.internal.s.m("environment");
                throw null;
            }
            n nVar2 = new n(aVar, mVar, j8, aVar2, null, null, 48, null);
            map.put(Long.valueOf(aVar.getUnitId()), nVar2);
            Iterator it3 = copyOnWriteArraySet.iterator();
            while (it3.hasNext()) {
                handler.post(new v((u) it3.next(), nVar2, 2));
            }
            nVar = nVar2;
        }
        nVar.r(hs2.b.CONNECTING, aVar);
    }

    @Override // hs2.e
    public final void c(long j8) {
        f140539b.debug("deviceDisconnected: " + j8);
        n nVar = (n) f140541d.get(Long.valueOf(j8));
        if (nVar != null) {
            nVar.r(hs2.b.DISCONNECTED, null);
        }
    }

    @Override // hs2.e
    public final void d(long j8, hs2.e.a aVar) {
        aVar.getClass();
        f140543f.put(Long.valueOf(j8), aVar);
        Iterator it = f140545h.iterator();
        while (it.hasNext()) {
            f140546i.post(new l0.e((u) it.next(), j8, aVar));
        }
    }
}
