package i03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<? extends h73.r>, s> f86951a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f86952a = new HashMap(3);

        public final a a(Class cls, s sVar) {
            HashMap map = this.f86952a;
            s sVar2 = (s) map.get(cls);
            if (sVar2 == null) {
                map.put(cls, sVar);
                return this;
            }
            if (sVar2 instanceof b) {
                ((b) sVar2).f86953a.add(0, sVar);
                return this;
            }
            map.put(cls, new b(sVar, sVar2));
            return this;
        }

        public final a b(Class cls, s sVar) {
            this.f86952a.put(cls, sVar);
            return this;
        }
    }

    public static class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f86953a;

        public b(s sVar, s sVar2) {
            ArrayList arrayList = new ArrayList(3);
            this.f86953a = arrayList;
            arrayList.add(sVar);
            arrayList.add(sVar2);
        }

        @Override // i03.s
        public final Object a(g gVar, q qVar) {
            ArrayList arrayList = this.f86953a;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i14 = 0; i14 < size; i14++) {
                objArr[i14] = ((s) arrayList.get(i14)).a(gVar, qVar);
            }
            return objArr;
        }
    }

    public j(Map<Class<? extends h73.r>, s> map) {
        this.f86951a = map;
    }
}
