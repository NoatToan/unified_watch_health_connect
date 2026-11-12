package ek2;

import dk2.h;
import fk2.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import o13.p;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import u53.o;
import zy2.k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lek2/b;", "", "Lcz2/a;", "clock", "<init>", "(Lcz2/a;)V", "a", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f64513i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cz2.a f64514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f64515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dk2.a f64516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f64517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Timer f64518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<d> f64519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap<String, h> f64520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashSet<String> f64521h;

    static {
        new a(null);
        f64513i = zy2.c.f207527a.a("DISC#CriteriaFilterer");
    }

    public b(cz2.a aVar) {
        aVar.getClass();
        this.f64514a = aVar;
        this.f64515b = new Object();
        this.f64519f = new ArrayList<>();
        this.f64520g = new ConcurrentHashMap<>();
        this.f64521h = new HashSet<>();
    }

    public final void a(long j8) {
        synchronized (this.f64515b) {
            try {
                f64513i.trace("checkForNewRules " + j8);
                ConcurrentHashMap<String, h> concurrentHashMap = this.f64520g;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, h> entry : concurrentHashMap.entrySet()) {
                    if (!this.f64521h.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((h) ((Map.Entry) it.next()).getValue());
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                ArrayList<d> arrayList2 = this.f64519f;
                if (arrayList2 == null || !arrayList2.isEmpty()) {
                    for (d dVar : arrayList2) {
                        dVar.getClass();
                        if ((dVar.a() <= j8) && dVar.a() > j8 - ((long) 5)) {
                            dk2.d.f60235m.getClass();
                            for (h hVar : h0.N0(arrayList, dk2.d.f60236n)) {
                                p<d, fk2.c> pVarD = d(hVar, j8);
                                d dVar2 = pVarD.f128594a;
                                if (pVarD.f128595b == fk2.c.ACCEPT) {
                                    e(hVar, "checkForNewRules", dVar2);
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                            return;
                        }
                    }
                }
                f64513i.trace("checkForNewRules: No new rules detected, skipping check");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final long b() {
        synchronized (this.f64515b) {
            if (this.f64517d <= 0) {
                return 0L;
            }
            return (this.f64514a.millis() / ((long) 1000)) - this.f64517d;
        }
    }

    public final boolean c() {
        boolean z14;
        synchronized (this.f64515b) {
            z14 = this.f64516c != null;
        }
        return z14;
    }

    public final p<d, fk2.c> d(h hVar, long j8) {
        fk2.c cVarInvoke;
        synchronized (this.f64515b) {
            for (d dVar : this.f64519f) {
                dVar.getClass();
                if ((dVar.a() <= j8) && (cVarInvoke = dVar.b().invoke(hVar)) != fk2.c.NOT_MATCH) {
                    return new p<>(dVar, cVarInvoke);
                }
            }
            return new p<>(null, fk2.c.NOT_MATCH);
        }
    }

    public final void e(h hVar, String str, d dVar) {
        dk2.a aVar;
        synchronized (this.f64515b) {
            try {
                f64513i.info(str + ": match " + hVar.getF60237a() + StringUtils.SPACE + hVar.getF60238b() + " by rule [" + (dVar != null ? dVar.c() : null) + "]");
                aVar = this.f64521h.add(hVar.getF60238b()) ? this.f64516c : null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (aVar != null && aVar.f60218f.get() && aVar.f60213a.c()) {
            u53.d dVar2 = aVar.f60217e;
            x53.c cVar = s0.f129406a;
            ge1.b.T(dVar2, o.f168762a, null, new dk2.b(aVar, hVar, null), 2);
        }
    }

    public final void f(h hVar, long j8) {
        hVar.getClass();
        synchronized (this.f64515b) {
            if (!c()) {
                f64513i.trace("processFoundDevice: " + hVar.getF60237a() + StringUtils.SPACE + hVar.getF60238b() + " called before start() or after stop()");
                return;
            }
            p<d, fk2.c> pVarD = d(hVar, j8);
            d dVar = pVarD.f128594a;
            fk2.c cVar = pVarD.f128595b;
            if (cVar == fk2.c.REJECT) {
                f64513i.trace("processFoundDevice: " + hVar.getF60237a() + StringUtils.SPACE + hVar.getF60238b() + " ignoring based on [" + (dVar != null ? dVar.c() : null) + "] rule");
                return;
            }
            h hVarPut = this.f64520g.put(hVar.getF60238b(), hVar);
            if ((hVarPut != null ? dh.b.n(hVarPut) : null) != null && dh.b.n(hVar) == null && (hVar instanceof dk2.d)) {
                ((dk2.d) hVar).f60247k = dh.b.n(hVarPut);
            }
            dk2.d dVar2 = hVarPut instanceof dk2.d ? (dk2.d) hVarPut : null;
            Boolean boolValueOf = dVar2 != null ? Boolean.valueOf(dVar2.f()) : null;
            dk2.d dVar3 = hVar instanceof dk2.d ? (dk2.d) hVar : null;
            Boolean boolValueOf2 = dVar3 != null ? Boolean.valueOf(dVar3.f()) : null;
            if (!s.g(boolValueOf, boolValueOf2) && s.g(boolValueOf2, Boolean.TRUE)) {
                f64513i.trace("processFoundDevice: " + ((dk2.d) hVar).f60237a + StringUtils.SPACE + ((dk2.d) hVar).f60244h + StringUtils.SPACE + ((dk2.d) hVar).f60238b + " readyToPair status changed from " + boolValueOf + " to " + boolValueOf2 + ", notifying app.");
                this.f64521h.remove(((dk2.d) hVar).f60238b);
                e(hVar, "processFoundDevice", dVar);
                return;
            }
            if (hVarPut == null || !this.f64521h.contains(hVar.getF60238b())) {
                if (hVarPut == null) {
                    k kVar = f64513i;
                    String f60237a = hVar.getF60237a();
                    Long f60244h = hVar.getF60244h();
                    String f60238b = hVar.getF60238b();
                    boolean z14 = false;
                    try {
                        if (hVar.getF60240d().getBondState() == 12) {
                            z14 = true;
                        }
                    } catch (NullPointerException unused) {
                    }
                    kVar.debug("processFoundDevice: found " + f60237a + StringUtils.SPACE + f60244h + StringUtils.SPACE + f60238b + " bonded:" + z14 + StringUtils.SPACE + hVar.getF60245i());
                }
                if (cVar == fk2.c.ACCEPT) {
                    e(hVar, "processFoundDevice", dVar);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lek2/b$a;", "", "<init>", "()V", "Lzy2/k;", "LOGGER", "Lzy2/k;", "", "TIMER_INTERVAL_SECONDS", "I", "", "TIMER_INTERVAL_MILLISECONDS", "J", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
