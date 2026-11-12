package o63;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonException;
import mt0.s1;
import p13.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k.a<Map<String, Integer>> f129873a = new k.a<>();

    static {
        new k.a();
    }

    public static final void a(LinkedHashMap linkedHashMap, k63.e eVar, String str, int i14) {
        String str2 = p005kotlin.jvm.internal.s.g(eVar.getF103234b(), k63.l.b.f103252a) ? "enum value" : "property";
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i14));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + eVar.d(i14) + " is already one of the names for " + str2 + ' ' + eVar.d(((Number) u0.c(str, linkedHashMap)).intValue()) + " in " + eVar);
    }

    public static final int b(k63.e eVar, n63.b bVar, String str) {
        Object objInvoke;
        eVar.getClass();
        bVar.getClass();
        k kVar = bVar.f123895c;
        str.getClass();
        n63.g gVar = bVar.f123893a;
        boolean z14 = gVar.f123931m;
        k.a<Map<String, Integer>> aVar = f129873a;
        if (z14 && p005kotlin.jvm.internal.s.g(eVar.getF103234b(), k63.l.b.f103252a)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            s1 s1Var = new s1(22, eVar, bVar);
            kVar.getClass();
            aVar.getClass();
            ConcurrentHashMap concurrentHashMap = kVar.f129868a;
            Map map = (Map) concurrentHashMap.get(eVar);
            Object obj = map != null ? map.get(aVar) : null;
            objInvoke = obj != null ? obj : null;
            if (objInvoke == null) {
                objInvoke = s1Var.invoke();
                Object concurrentHashMap2 = concurrentHashMap.get(eVar);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(eVar, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(aVar, objInvoke);
            }
            Integer num = (Integer) ((Map) objInvoke).get(lowerCase);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        e(eVar, bVar);
        int iG = eVar.g(str);
        if (iG != -3 || !gVar.f123930l) {
            return iG;
        }
        s1 s1Var2 = new s1(22, eVar, bVar);
        kVar.getClass();
        aVar.getClass();
        ConcurrentHashMap concurrentHashMap3 = kVar.f129868a;
        Map map2 = (Map) concurrentHashMap3.get(eVar);
        Object obj2 = map2 != null ? map2.get(aVar) : null;
        objInvoke = obj2 != null ? obj2 : null;
        if (objInvoke == null) {
            objInvoke = s1Var2.invoke();
            Object concurrentHashMap4 = concurrentHashMap3.get(eVar);
            if (concurrentHashMap4 == null) {
                concurrentHashMap4 = new ConcurrentHashMap(2);
                concurrentHashMap3.put(eVar, concurrentHashMap4);
            }
            ((Map) concurrentHashMap4).put(aVar, objInvoke);
        }
        Integer num2 = (Integer) ((Map) objInvoke).get(str);
        if (num2 != null) {
            return num2.intValue();
        }
        return -3;
    }

    public static final int c(k63.e eVar, n63.b bVar, String str, String str2) {
        eVar.getClass();
        bVar.getClass();
        str.getClass();
        int iB = b(eVar, bVar, str);
        if (iB != -3) {
            return iB;
        }
        throw new SerializationException(eVar.getF103221c() + " does not contain element with name '" + str + CoreConstants.SINGLE_QUOTE_CHAR + str2);
    }

    public static final boolean d(k63.e eVar, n63.b bVar) {
        eVar.getClass();
        bVar.getClass();
        if (bVar.f123893a.f123920b) {
            return true;
        }
        List<Annotation> annotations = eVar.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator<T> it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof n63.n) {
                return true;
            }
        }
        return false;
    }

    public static final void e(k63.e eVar, n63.b bVar) {
        eVar.getClass();
        bVar.getClass();
        if (p005kotlin.jvm.internal.s.g(eVar.getF103234b(), k63.m.a.f103253a)) {
            bVar.f123893a.getClass();
        }
    }
}
