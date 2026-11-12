package zh;

import androidx.room.a0;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import j23.k;
import j23.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import lc.u0;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.c1;
import p13.h0;
import p13.p0;
import p13.x;
import p13.y;
import vh.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzh/i;", "Lzh/g;", "<init>", "()V", "a", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f204767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f204768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f204769c = new ArrayList();

    public static Object a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj2 != null) {
            if (obj instanceof List) {
                if (!(obj2 instanceof List)) {
                    u0.u("Cannot merge ", obj, " with ", obj2);
                    return null;
                }
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() != list2.size()) {
                    u0.u("Cannot merge ", obj, " with ", obj2);
                    return null;
                }
                l lVarI = x.i((Collection) obj);
                ArrayList arrayList = new ArrayList(y.r(lVarI, 10));
                Iterator<Integer> it = lVarI.iterator();
                while (((k) it).f96801c) {
                    int iNextInt = ((p0) it).nextInt();
                    arrayList.add(a(list.get(iNextInt), list2.get(iNextInt)));
                }
                return arrayList;
            }
            if (obj instanceof Map) {
                if (!(obj2 instanceof Map)) {
                    u0.u("Cannot merge ", obj, " with ", obj2);
                    return null;
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                LinkedHashSet<String> linkedHashSetH = c1.h(map.keySet(), map2.keySet());
                ArrayList arrayList2 = new ArrayList(y.r(linkedHashSetH, 10));
                for (String str : linkedHashSetH) {
                    arrayList2.add(new p(str, a(map.get(str), map2.get(str))));
                }
                return p13.u0.l(arrayList2);
            }
            if (!obj.equals(obj2)) {
                throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
            }
        }
        return obj;
    }

    @Override // zh.g
    public final g A() {
        ArrayList arrayList = this.f204769c;
        a aVar = (a) arrayList.remove(arrayList.size() - 1);
        if (aVar instanceof a.b) {
            e(((a.b) aVar).f204771a);
            return this;
        }
        vb.h.z("Check failed.");
        return null;
    }

    @Override // zh.g
    public final g P0(long j8) {
        e(Long.valueOf(j8));
        return this;
    }

    @Override // zh.g
    public final g R0(int i14) {
        e(Integer.valueOf(i14));
        return this;
    }

    @Override // zh.g
    public final g S0(double d14) {
        e(Double.valueOf(d14));
        return this;
    }

    @Override // zh.g
    public final g U1(e eVar) {
        eVar.getClass();
        e(eVar);
        return this;
    }

    public final Object c() {
        if (this.f204768b) {
            return this.f204767a;
        }
        vb.h.z("Check failed.");
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void e(Object obj) {
        a aVar = (a) h0.n0(this.f204769c);
        if (!(aVar instanceof a.b)) {
            if (aVar instanceof a.C3819a) {
                ((a.C3819a) aVar).f204770a.add(obj);
                return;
            } else {
                this.f204767a = obj;
                this.f204768b = true;
                return;
            }
        }
        a.b bVar = (a.b) aVar;
        Map<String, Object> map = bVar.f204771a;
        String str = bVar.f204772b;
        if (str == null) {
            vb.h.z("Check failed.");
            return;
        }
        if (map.containsKey(str)) {
            map.put(str, a(map.get(str), obj));
        } else {
            map.put(str, obj);
        }
        bVar.f204772b = null;
    }

    @Override // zh.g
    public final g e1(boolean z14) {
        e(Boolean.valueOf(z14));
        return this;
    }

    @Override // zh.g
    public final g g() {
        ArrayList arrayList = this.f204769c;
        a aVar = (a) arrayList.remove(arrayList.size() - 1);
        if (aVar instanceof a.C3819a) {
            e(((a.C3819a) aVar).f204770a);
            return this;
        }
        vb.h.z("Check failed.");
        return null;
    }

    @Override // zh.g
    public final String getPath() {
        String strValueOf;
        ArrayList<a> arrayList = this.f204769c;
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        for (a aVar : arrayList) {
            if (aVar instanceof a.C3819a) {
                strValueOf = String.valueOf(((a.C3819a) aVar).f204770a.size());
            } else {
                if (!(aVar instanceof a.b)) {
                    u0.r();
                    return null;
                }
                strValueOf = ((a.b) aVar).f204772b;
                if (strValueOf == null) {
                    strValueOf = CallerData.NA;
                }
            }
            arrayList2.add(strValueOf);
        }
        return h0.k0(arrayList2, ".", null, null, null, 62);
    }

    @Override // zh.g
    public final g k0(v0 v0Var) {
        v0Var.getClass();
        e(null);
        return this;
    }

    @Override // zh.g
    public final g l4() {
        e(null);
        return this;
    }

    @Override // zh.g
    public final g n0(String str) {
        str.getClass();
        e(str);
        return this;
    }

    @Override // zh.g
    public final g q() {
        this.f204769c.add(new a.C3819a(new ArrayList()));
        return this;
    }

    @Override // zh.g
    public final g v1(String str) {
        str.getClass();
        a aVar = (a) h0.m0(this.f204769c);
        if (!(aVar instanceof a.b)) {
            vb.h.z("Check failed.");
            return null;
        }
        a.b bVar = (a.b) aVar;
        if (bVar.f204772b == null) {
            bVar.f204772b = str;
            return this;
        }
        vb.h.z("Check failed.");
        return null;
    }

    @Override // zh.g
    public final g y() {
        this.f204769c.add(new a.b(new LinkedHashMap(), null));
        return this;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lzh/i$a;", "", "<init>", "()V", "a", "b", "Lzh/i$a$a;", "Lzh/i$a$b;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: zh.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzh/i$a$a;", "Lzh/i$a;", "", "", "list", "<init>", "(Ljava/util/List;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class C3819a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<Object> f204770a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3819a(List<Object> list) {
                super(null);
                list.getClass();
                this.f204770a = list;
            }

            public final String toString() {
                return "List (" + this.f204770a.size() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzh/i$a$b;", "Lzh/i$a;", "", "", "", "map", "name", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Map<String, Object> f204771a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f204772b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Map<String, Object> map, String str) {
                super(null);
                map.getClass();
                this.f204771a = map;
                this.f204772b = str;
            }

            public final String toString() {
                return a0.m(new StringBuilder("Map ("), this.f204772b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
