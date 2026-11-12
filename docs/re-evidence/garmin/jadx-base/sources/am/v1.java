package am;

import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lam/v1;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v1 f4245a = new v1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f4246b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f4247c = new LinkedHashMap();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((u1) t7).f4233d), Integer.valueOf(((u1) t14).f4233d));
        }
    }

    private v1() {
    }

    public static void a(JsonObject jsonObject, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : jsonObject.keySet()) {
            JsonObject asJsonObject = jsonObject.get(str).getAsJsonObject();
            Set<String> setKeySet = asJsonObject.keySet();
            ArrayList arrayList = new ArrayList();
            for (String str2 : setKeySet) {
                JsonObject asJsonObject2 = asJsonObject.get(str2).getAsJsonObject();
                String asString = asJsonObject2.get("value").getAsString();
                int asInt = asJsonObject2.get("sortOrder").getAsInt();
                str.getClass();
                asString.getClass();
                str2.getClass();
                arrayList.add(new u1(str, asString, str2, asInt));
            }
            if (arrayList.size() > 1) {
                p13.c0.u(arrayList, new a());
            }
            linkedHashMap.put(str, arrayList);
        }
        map.putAll(new TreeMap(linkedHashMap));
    }

    public static Map b(String str) {
        if (p005kotlin.jvm.internal.s.g(str, x0.f4352y2.f4358a)) {
            return f4246b;
        }
        if (p005kotlin.jvm.internal.s.g(str, x0.f4356z2.f4358a)) {
            return f4247c;
        }
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        return k0Var;
    }

    public static final ps.u0 c(String str, String str2, String str3) {
        Object next;
        str.getClass();
        f4245a.getClass();
        List list = (List) b(str).get(str2);
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((u1) next).f4232c.equals(str3));
            u1 u1Var = (u1) next;
            if (u1Var != null) {
                return new ps.u0(str2, Integer.valueOf(u1Var.f4233d), u1Var.f4232c);
            }
        }
        return null;
    }

    public static final String d(String str, String str2) {
        String str3;
        Object next;
        f4245a.getClass();
        Iterator it = b(str).keySet().iterator();
        do {
            str3 = null;
            if (!it.hasNext()) {
                break;
            }
            List list = (List) b(str).get((String) it.next());
            if (list != null) {
                Iterator it3 = list.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!((u1) next).f4232c.equals(str2));
                u1 u1Var = (u1) next;
                if (u1Var != null) {
                    str3 = u1Var.f4231b;
                }
            }
        } while (str3 == null);
        return str3;
    }

    public static final String e(String str, ps.u0 u0Var) {
        Object next;
        str.getClass();
        if (u0Var != null) {
            f4245a.getClass();
            List list = (List) b(str).get(u0Var.getScale());
            if (list != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((u1) next).f4232c.equals(u0Var.getValueKey()));
                u1 u1Var = (u1) next;
                if (u1Var != null) {
                    return u1Var.f4231b;
                }
            }
        }
        return null;
    }

    public static final LinkedHashMap f(String str, String str2) {
        str.getClass();
        f4245a.getClass();
        List<u1> list = (List) b(str).get(str2);
        if (list == null) {
            return null;
        }
        int iA = p13.t0.a(p13.y.r(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (u1 u1Var : list) {
            o13.p pVar = new o13.p(u1Var.f4232c, u1Var.f4231b);
            linkedHashMap.put(pVar.f128594a, pVar.f128595b);
        }
        return linkedHashMap;
    }
}
