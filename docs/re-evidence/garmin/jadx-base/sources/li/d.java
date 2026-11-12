package li;

import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.y0;
import p13.d0;
import p13.t0;
import vh.b0;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lli/d;", "", "<init>", "()V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f112566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f112567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f112568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f112569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f112570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f112571f;

    public d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f112566a = linkedHashMap;
        this.f112567b = linkedHashMap;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f112568c = linkedHashSet;
        this.f112569d = linkedHashSet;
        this.f112570e = true;
    }

    public static void a(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (map.containsKey(str) && y0.h(map.get(str))) {
                Object obj = map.get(str);
                obj.getClass();
                Map mapC = y0.c(obj);
                Map map3 = value instanceof Map ? (Map) value : null;
                if (map3 == null) {
                    l2.m("'", str, "' is an object in destination but not in map");
                    return;
                }
                a(mapC, map3);
            } else {
                map.put(str, value);
            }
        }
    }

    public final LinkedHashMap b(Map map) {
        Object obj;
        LinkedHashMap linkedHashMap = this.f112567b;
        boolean zIsEmpty = linkedHashMap.isEmpty();
        LinkedHashMap linkedHashMap2 = this.f112566a;
        if (zIsEmpty) {
            linkedHashMap2.putAll(map);
            return linkedHashMap;
        }
        Object obj2 = map.get("incremental");
        List<Map> list = obj2 instanceof List ? (List) obj2 : null;
        if (list == null) {
            this.f112571f = true;
        } else {
            this.f112571f = false;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map map2 : list) {
                Map map3 = (Map) map2.get("data");
                Object obj3 = map2.get("path");
                obj3.getClass();
                List list2 = (List) obj3;
                Object obj4 = linkedHashMap.get("data");
                obj4.getClass();
                Object obj5 = (Map) obj4;
                if (map3 != null) {
                    for (Object obj6 : list2) {
                        if (obj5 instanceof List) {
                            obj6.getClass();
                            obj = ((List) obj5).get(((Integer) obj6).intValue());
                        } else {
                            obj5.getClass();
                            obj = ((Map) obj5).get(obj6);
                        }
                        obj5 = obj;
                    }
                    obj5.getClass();
                    a(y0.c(obj5), map3);
                    this.f112568c.add(new b0(list2, (String) map2.get(Constants.ScionAnalytics.PARAM_LABEL)));
                }
                Object obj7 = map2.get("errors");
                List list3 = obj7 instanceof List ? (List) obj7 : null;
                if (list3 != null) {
                    d0.v(arrayList, list3);
                }
                Object obj8 = map2.get("extensions");
                Map map4 = obj8 instanceof Map ? (Map) obj8 : null;
                if (map4 != null) {
                    arrayList2.add(map4);
                }
            }
            if (arrayList.isEmpty()) {
                linkedHashMap2.remove("errors");
            } else {
                linkedHashMap2.put("errors", arrayList);
            }
            if (arrayList2.isEmpty()) {
                linkedHashMap2.remove("extensions");
            } else {
                linkedHashMap2.put("extensions", t0.b(new p("incremental", arrayList2)));
            }
        }
        Boolean bool = (Boolean) map.get("hasNext");
        this.f112570e = bool != null ? bool.booleanValue() : false;
        return linkedHashMap;
    }
}
