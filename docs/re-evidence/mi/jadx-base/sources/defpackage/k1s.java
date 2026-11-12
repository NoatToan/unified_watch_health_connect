package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.threeten.bp.zone.ZoneRulesException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k1s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList<k1s> f23346a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentMap<String, k1s> f23347b = new ConcurrentHashMap(512, 0.75f, 2);

    static {
        j1s.a();
    }

    public static Set<String> a() {
        return Collections.unmodifiableSet(f23347b.keySet());
    }

    public static k1s b(String str) {
        ConcurrentMap<String, k1s> concurrentMap = f23347b;
        k1s k1sVar = concurrentMap.get(str);
        if (k1sVar != null) {
            return k1sVar;
        }
        if (concurrentMap.isEmpty()) {
            throw new ZoneRulesException("No time-zone data files registered");
        }
        throw new ZoneRulesException("Unknown time-zone ID: " + str);
    }

    public static i1s c(String str, boolean z) {
        crd.i(str, "zoneId");
        return b(str).d(str, z);
    }

    public static void f(k1s k1sVar) {
        crd.i(k1sVar, "provider");
        g(k1sVar);
        f23346a.add(k1sVar);
    }

    public static void g(k1s k1sVar) {
        for (String str : k1sVar.e()) {
            crd.i(str, "zoneId");
            if (f23347b.putIfAbsent(str, k1sVar) != null) {
                throw new ZoneRulesException("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + k1sVar);
            }
        }
    }

    public abstract i1s d(String str, boolean z);

    public abstract Set<String> e();
}
