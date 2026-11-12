package di;

import ch.qos.logback.core.CoreConstants;
import ci.n;
import d53.j;
import d53.k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p13.t0;
import p13.y;
import v.e0;
import w63.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldi/c;", "", "<init>", "()V", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f59688a = new c();

    private c() {
    }

    public static n a(String str, String str2) {
        w63.e eVar = new w63.e();
        h.f183361d.getClass();
        eVar.E(h.a.c(str2));
        Object objB = b(zh.a.a(new zh.d(eVar)));
        Map map = objB instanceof Map ? (Map) objB : null;
        if (map != null) {
            return new n(str, map, null, 4, null);
        }
        e0.n("error deserializing: ".concat(str2));
        return null;
    }

    public static Object b(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            ci.b.f27594b.getClass();
            k kVar = ci.b.f27595c;
            if (kVar.d(str)) {
                j jVarC = kVar.c(str);
                List<String> listA = jVarC != null ? jVarC.a() : null;
                if (listA != null && ((p13.a) listA).getF134973e() > 1) {
                    return new ci.b((String) ((j.a) listA).get(1));
                }
                vb.h.x(am.j.m("Not a cache reference: ", str, " Must be of the form: ApolloCacheReference{%s}"));
                return null;
            }
        } else {
            boolean z14 = obj instanceof Map;
            c cVar = f59688a;
            if (z14) {
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(t0.a(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    cVar.getClass();
                    linkedHashMap.put(key, b(value));
                }
                return linkedHashMap;
            }
            if (obj instanceof List) {
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(y.r(iterable, 10));
                for (Object obj2 : iterable) {
                    cVar.getClass();
                    arrayList.add(b(obj2));
                }
                return arrayList;
            }
        }
        return obj;
    }

    public static String c(n nVar) throws Throwable {
        zh.c cVar;
        nVar.getClass();
        Map<String, Object> map = nVar.f27617b;
        w63.e eVar = new w63.e();
        Throwable th3 = null;
        zh.c cVar2 = new zh.c(eVar, null, 2, null);
        try {
            cVar2.y();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                c cVar3 = f59688a;
                cVar2.v1(key);
                cVar3.getClass();
                d(cVar2, value);
            }
            cVar2.A();
            cVar = cVar2;
        } catch (Throwable th4) {
            th3 = th4;
            cVar = null;
        }
        try {
            cVar2.close();
        } catch (Throwable th5) {
            if (th3 == null) {
                th3 = th5;
            } else {
                o13.g.a(th3, th5);
            }
        }
        if (th3 != null) {
            throw th3;
        }
        cVar.getClass();
        return eVar.x();
    }

    public static void d(zh.g gVar, Object obj) {
        if (obj == null) {
            gVar.l4();
            return;
        }
        if (obj instanceof String) {
            gVar.n0((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            gVar.e1(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            gVar.R0(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            gVar.P0(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            gVar.S0(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof ci.b) {
            gVar.n0("ApolloCacheReference{" + ((ci.b) obj).f27597a + CoreConstants.CURLY_RIGHT);
            return;
        }
        if (obj instanceof List) {
            gVar.q();
            for (Object obj2 : (Iterable) obj) {
                f59688a.getClass();
                d(gVar, obj2);
            }
            gVar.g();
            return;
        }
        if (!(obj instanceof Map)) {
            androidx.core.view.j.A(obj, "Unsupported record value type: '");
            return;
        }
        gVar.y();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            d(gVar.v1((String) entry.getKey()), entry.getValue());
        }
        gVar.A();
    }
}
