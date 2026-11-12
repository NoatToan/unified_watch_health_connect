package oa2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import ma2.l;
import ml2.q;
import o13.e;
import p005kotlin.Metadata;
import p13.l0;
import p13.u;
import xm2.g;
import xm2.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loa2/c;", "", "<init>", "()V", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f131087a = 0;

    static {
        new c();
    }

    private c() {
    }

    @e
    public static final void a(da2.e eVar) {
        eVar.getClass();
        try {
            Collection collection = eVar.f58890a;
            if (collection == null) {
                collection = l0.f134950a;
            }
            if (!collection.isEmpty()) {
                Set set = eVar.f58890a;
                if (set == null) {
                    set = l0.f134950a;
                }
                EnumSet enumSetB = l.b();
                enumSetB.getClass();
                if (set.containsAll(enumSetB)) {
                    g.a aVar = g.f191527c;
                    Set setM0 = u.m0(h.values());
                    aVar.getClass();
                    g.a.a(setM0);
                    return;
                }
            }
            g.f191527c.getClass();
            g.a.b().getClass();
            if (g.c().isEmpty()) {
                Iterable iterable = eVar.f58890a;
                if (iterable == null) {
                    iterable = l0.f134950a;
                }
                h[] hVarArrValues = h.values();
                ArrayList arrayList = new ArrayList();
                for (h hVar : hVarArrValues) {
                    Iterable iterable2 = iterable;
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it = iterable2.iterator();
                        while (it.hasNext()) {
                            q qVar = ((l) it.next()).f117699b;
                            if (qVar != null && qVar.f119440a == hVar.f191549a) {
                                arrayList.add(hVar);
                                break;
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                g.f191527c.getClass();
                g.a.a(arrayList);
            }
        } catch (Throwable unused) {
        }
    }
}
