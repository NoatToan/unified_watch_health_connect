package uc2;

import d53.w;
import ds.e0;
import java.net.URL;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentMap;
import o13.m;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p13.u;
import u1.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luc2/a;", "", "<init>", "()V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f169996a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TreeSet<Integer> f169997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f169998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f169999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f170000e;

    static {
        TreeSet<Integer> treeSet = new TreeSet<>();
        u.c0(new Integer[]{1, 30, 60, 300, 600}, treeSet);
        f169997b = treeSet;
        f169998c = m.b(new p1(12));
        f169999d = m.b(new p1(13));
        f170000e = m.b(new p1(14));
    }

    private a() {
    }

    public static Logger a() {
        Object value = f169999d.getValue();
        value.getClass();
        return (Logger) value;
    }

    public static int b(Integer num) {
        TreeSet<Integer> treeSet = f169997b;
        if (num == null) {
            Integer numFirst = treeSet.first();
            numFirst.getClass();
            return numFirst.intValue();
        }
        Integer numHigher = treeSet.higher(num);
        if (numHigher != null) {
            return numHigher.intValue();
        }
        Integer numLast = treeSet.last();
        numLast.getClass();
        return numLast.intValue();
    }

    public static c c(URL url) {
        Object next;
        String host = url.getHost();
        w13.c cVar = c.f170008e;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        loop0: while (true) {
            if (!bVarN.hasNext()) {
                next = null;
                break;
            }
            next = bVarN.next();
            List<String> list = ((c) next).f170009a;
            if (list == null || !list.isEmpty()) {
                for (String str : list) {
                    host.getClass();
                    if (w.z(host, str, true)) {
                        break loop0;
                    }
                }
            }
        }
        c cVar2 = (c) next;
        if (cVar2 != null) {
            return cVar2;
        }
        f169996a.getClass();
        e0.u("getRateLimitGroup: no mapping found for host [", host, "]", a());
        return null;
    }

    public static b d(sc2.a aVar) {
        aVar.getClass();
        b bVar = (b) ((ConcurrentMap) f169998c.getValue()).get(aVar.f158480a);
        if (bVar == null) {
            return null;
        }
        if (nd2.c.c().getTimeInMillis() <= bVar.f170004d) {
            return bVar;
        }
        f169996a.getClass();
        a().debug("isEnabled: no, " + bVar.f170003c + " seconds has passed for " + aVar.name());
        return null;
    }
}
