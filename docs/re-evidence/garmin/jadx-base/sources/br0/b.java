package br0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.y;
import tq0.d;
import tq0.f;
import tq0.k;
import tq0.l;
import tq0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lbr0/b;", "", "<init>", "()V", "a", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19573a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbr0/b$a;", "", "<init>", "()V", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static ArrayList a(d dVar, List list) {
            Object obj;
            String str;
            dVar.getClass();
            list.getClass();
            List<tq0.a> list2 = dVar.f166047a;
            List listN0 = h0.N0(list, new br0.a());
            ArrayList<f> arrayList = new ArrayList();
            for (Object obj2 : listN0) {
                if (((f) obj2).f166056b) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (f fVar : arrayList) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    tq0.a aVar = (tq0.a) next;
                    String str2 = fVar.f166057c;
                    if (str2 != null) {
                        m.f166103c.getClass();
                        for (Object obj3 : m.f166113m) {
                            if (s.g(((m) obj3).f166115b, str2)) {
                                obj = obj3;
                                break;
                            }
                        }
                        m mVar = (m) obj;
                        if (mVar == null || (str = mVar.f166114a) == null) {
                            str = m.NONE.f166114a;
                        }
                        if (str != null && str.equalsIgnoreCase(aVar.f166036a)) {
                            obj = next;
                            break;
                        }
                    }
                }
                tq0.a aVar2 = (tq0.a) obj;
                if (aVar2 != null) {
                    arrayList2.add(aVar2);
                }
            }
            if (!arrayList2.isEmpty()) {
                list2 = arrayList2;
            }
            k kVar = dVar.f166049c.get(0);
            ArrayList arrayList3 = new ArrayList(y.r(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new l((tq0.a) it3.next(), 0, kVar.f166096a, kVar.f166097b, 2, null));
            }
            return arrayList3;
        }

        private a() {
        }
    }
}
