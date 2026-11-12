package org.threeten.bp.zone;

import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.threeten.bp.jdk8.Jdk8Methods;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ZoneRulesProvider {
    private static final CopyOnWriteArrayList<ZoneRulesProvider> a = new CopyOnWriteArrayList<>();
    private static final ConcurrentMap<String, ZoneRulesProvider> b = new ConcurrentHashMap(512, 0.75f, 2);

    static {
        ZoneRulesInitializer.a();
    }

    private static ZoneRulesProvider a(String str) {
        ConcurrentMap<String, ZoneRulesProvider> concurrentMap = b;
        ZoneRulesProvider zoneRulesProvider = concurrentMap.get(str);
        if (zoneRulesProvider != null) {
            return zoneRulesProvider;
        }
        if (concurrentMap.isEmpty()) {
            throw new ZoneRulesException("No time-zone data files registered");
        }
        throw new ZoneRulesException("Unknown time-zone ID: " + str);
    }

    private static void b(ZoneRulesProvider zoneRulesProvider) {
        for (String str : zoneRulesProvider.provideZoneIds()) {
            Jdk8Methods.requireNonNull(str, "zoneId");
            if (b.putIfAbsent(str, zoneRulesProvider) != null) {
                throw new ZoneRulesException("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + zoneRulesProvider);
            }
        }
    }

    public static Set<String> getAvailableZoneIds() {
        return Collections.unmodifiableSet(b.keySet());
    }

    public static ZoneRules getRules(String str, boolean z) {
        Jdk8Methods.requireNonNull(str, "zoneId");
        return a(str).provideRules(str, z);
    }

    public static NavigableMap<String, ZoneRules> getVersions(String str) {
        Jdk8Methods.requireNonNull(str, "zoneId");
        return a(str).provideVersions(str);
    }

    public static boolean refresh() {
        Iterator<ZoneRulesProvider> it2 = a.iterator();
        boolean zProvideRefresh = false;
        while (it2.hasNext()) {
            zProvideRefresh |= it2.next().provideRefresh();
        }
        return zProvideRefresh;
    }

    public static void registerProvider(ZoneRulesProvider zoneRulesProvider) {
        Jdk8Methods.requireNonNull(zoneRulesProvider, "provider");
        b(zoneRulesProvider);
        a.add(zoneRulesProvider);
    }

    public boolean provideRefresh() {
        return false;
    }

    public abstract ZoneRules provideRules(String str, boolean z);

    public abstract NavigableMap<String, ZoneRules> provideVersions(String str);

    public abstract Set<String> provideZoneIds();
}
