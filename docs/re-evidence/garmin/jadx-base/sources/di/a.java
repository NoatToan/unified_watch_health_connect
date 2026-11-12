package di;

import ch.qos.logback.core.joran.action.Action;
import ci.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.t0;
import p13.x;
import p13.y;
import vh.e0;
import vh.q;
import vh.r;
import vh.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0012\u0013BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Ldi/a;", "", "Lci/m;", "cache", "", "rootKey", "Lvh/e0$b;", "variables", "Lci/e;", "cacheResolver", "Lci/a;", "cacheHeaders", "", "Lvh/w;", "rootSelections", "rootTypename", "<init>", "(Lci/m;Ljava/lang/String;Lvh/e0$b;Lci/e;Lci/a;Ljava/util/List;Ljava/lang/String;)V", "a", "b", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f59674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f59675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0.b f59676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ci.e f59677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ci.a f59678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<w> f59679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f59680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f59681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f59682i;

    /* JADX INFO: renamed from: di.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldi/a$a;", "", "<init>", "()V", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class C1275a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f59683a = new ArrayList();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ldi/a$b;", "", "", Action.KEY_ATTRIBUTE, "", "path", "Lvh/w;", "selections", "parentType", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f59684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<Object> f59685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<w> f59686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f59687d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, List<? extends Object> list, List<? extends w> list2, String str2) {
            str.getClass();
            list.getClass();
            list2.getClass();
            str2.getClass();
            this.f59684a = str;
            this.f59685b = list;
            this.f59686c = list2;
            this.f59687d = str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(m mVar, String str, e0.b bVar, ci.e eVar, ci.a aVar, List<? extends w> list, String str2) {
        mVar.getClass();
        str.getClass();
        bVar.getClass();
        eVar.getClass();
        aVar.getClass();
        list.getClass();
        str2.getClass();
        this.f59674a = mVar;
        this.f59675b = str;
        this.f59676c = bVar;
        this.f59677d = eVar;
        this.f59678e = aVar;
        this.f59679f = list;
        this.f59680g = str2;
        this.f59681h = new LinkedHashMap();
        this.f59682i = new ArrayList();
    }

    public static void a(List list, String str, String str2, C1275a c1275a) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar instanceof q) {
                c1275a.f59683a.add(wVar);
            } else if (wVar instanceof r) {
                r rVar = (r) wVar;
                if (h0.R(rVar.f178383b, str2) || s.g(rVar.f178382a, str)) {
                    a(rVar.f178385d, str, str2, c1275a);
                }
            }
        }
    }

    public final void b(Object obj, ArrayList arrayList, List list, String str) {
        if (obj instanceof ci.b) {
            this.f59682i.add(new b(((ci.b) obj).f27597a, arrayList, list, str));
            return;
        }
        if (obj instanceof List) {
            int i14 = 0;
            for (Object obj2 : (Iterable) obj) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                b(obj2, h0.D0(arrayList, Integer.valueOf(i14)), list, str);
                i14 = i15;
            }
        }
    }

    public final Object c(Object obj, List<? extends Object> list) {
        if (obj instanceof ci.b) {
            return c(this.f59681h.get(list), list);
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(y.r(iterable, 10));
            int i14 = 0;
            for (Object obj2 : iterable) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                arrayList.add(c(obj2, h0.D0(list, Integer.valueOf(i14))));
                i14 = i15;
            }
            return arrayList;
        }
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(t0.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object key2 = entry.getKey();
            key2.getClass();
            linkedHashMap.put(key, c(value, h0.D0(list, (String) key2)));
        }
        return linkedHashMap;
    }
}
