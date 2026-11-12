package zh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB/\b\u0007\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lzh/h;", "Lzh/f;", "", "", "", "root", "", "pathRoot", "<init>", "(Ljava/util/Map;Ljava/util/List;)V", "a", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class h implements f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f204756j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f204757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Object> f204758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f.a f204759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f204760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object[] f204761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, Object>[] f204762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Iterator<?>[] f204763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f204764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f204765i;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f204766a;

        static {
            int[] iArr = new int[f.a.values().length];
            try {
                iArr[f.a.END_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.a.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.a.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.a.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.a.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f204766a = iArr;
        }
    }

    public h(Map<String, ? extends Object> map, List<? extends Object> list) {
        map.getClass();
        list.getClass();
        this.f204757a = map;
        this.f204758b = list;
        this.f204761e = new Object[256];
        this.f204762f = new Map[256];
        this.f204763g = new Iterator[256];
        this.f204764h = new int[256];
        this.f204759c = f.a.BEGIN_OBJECT;
        this.f204760d = map;
    }

    public static f.a c(Object obj) {
        if (obj == null) {
            return f.a.NULL;
        }
        if (obj instanceof List) {
            return f.a.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return f.a.BEGIN_OBJECT;
        }
        if (obj instanceof Integer) {
            return f.a.NUMBER;
        }
        if (obj instanceof Long) {
            return f.a.LONG;
        }
        if (!(obj instanceof Double) && !(obj instanceof e)) {
            if (obj instanceof String) {
                return f.a.STRING;
            }
            return obj instanceof Boolean ? f.a.BOOLEAN : f.a.ANY;
        }
        return f.a.NUMBER;
    }

    @Override // zh.f
    public final f A() {
        int i14 = this.f204765i - 1;
        this.f204765i = i14;
        this.f204763g[i14] = null;
        this.f204761e[i14] = null;
        this.f204762f[i14] = null;
        a();
        return this;
    }

    @Override // zh.f
    public final int S1(List<String> list) {
        list.getClass();
        while (hasNext()) {
            String strNextName = nextName();
            int i14 = this.f204765i - 1;
            int[] iArr = this.f204764h;
            int iIndexOf = iArr[i14];
            if (iIndexOf >= list.size() || !s.g(list.get(iIndexOf), strNextName)) {
                iIndexOf = list.indexOf(strNextName);
                if (iIndexOf != -1) {
                    iArr[this.f204765i - 1] = iIndexOf + 1;
                }
            } else {
                int i15 = this.f204765i - 1;
                iArr[i15] = iArr[i15] + 1;
            }
            if (iIndexOf != -1) {
                return iIndexOf;
            }
            a();
        }
        return -1;
    }

    public final void a() {
        int i14 = this.f204765i;
        if (i14 == 0) {
            this.f204759c = f.a.END_DOCUMENT;
            return;
        }
        Iterator<?> it = this.f204763g[i14 - 1];
        it.getClass();
        int i15 = this.f204765i - 1;
        Object[] objArr = this.f204761e;
        Object obj = objArr[i15];
        if (obj instanceof Integer) {
            obj.getClass();
            objArr[i15] = wr.g.m(1, (Integer) obj);
        }
        if (!it.hasNext()) {
            this.f204759c = objArr[this.f204765i - 1] instanceof Integer ? f.a.END_ARRAY : f.a.END_OBJECT;
            return;
        }
        Object next = it.next();
        this.f204760d = next;
        this.f204759c = next instanceof Map.Entry ? f.a.NAME : c(next);
    }

    @Override // zh.f
    public final e a3() {
        e eVar;
        int i14 = b.f204766a[this.f204759c.ordinal()];
        if (i14 != 3 && i14 != 4 && i14 != 5) {
            StringBuilder sb3 = new StringBuilder("Expected a Number but was ");
            sb3.append(this.f204759c);
            l2.o(sb3, e());
            return null;
        }
        Object obj = this.f204760d;
        if (obj instanceof Integer ? true : obj instanceof Long ? true : obj instanceof Double) {
            eVar = new e(obj.toString());
        } else if (obj instanceof String) {
            eVar = new e((String) obj);
        } else {
            if (!(obj instanceof e)) {
                l2.m("Expected JsonNumber but got ", obj, " instead");
                return null;
            }
            eVar = (e) obj;
        }
        a();
        return eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final String e() {
        return h0.k0(getPath(), ".", null, null, null, 62);
    }

    @Override // zh.f
    public final f g() {
        if (this.f204759c != f.a.END_ARRAY) {
            StringBuilder sb3 = new StringBuilder("Expected END_ARRAY but was ");
            sb3.append(this.f204759c);
            l2.o(sb3, e());
            return null;
        }
        int i14 = this.f204765i - 1;
        this.f204765i = i14;
        this.f204763g[i14] = null;
        this.f204761e[i14] = null;
        a();
        return this;
    }

    @Override // zh.f
    public final ArrayList getPath() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f204758b);
        int i14 = this.f204765i;
        for (int i15 = 0; i15 < i14; i15++) {
            Object obj = this.f204761e[i15];
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // zh.f
    public final boolean hasNext() {
        int i14 = b.f204766a[this.f204759c.ordinal()];
        return (i14 == 1 || i14 == 2) ? false : true;
    }

    @Override // zh.f
    public final boolean nextBoolean() {
        if (this.f204759c == f.a.BOOLEAN) {
            Object obj = this.f204760d;
            obj.getClass();
            a();
            return ((Boolean) obj).booleanValue();
        }
        StringBuilder sb3 = new StringBuilder("Expected BOOLEAN but was ");
        sb3.append(this.f204759c);
        l2.o(sb3, e());
        return false;
    }

    @Override // zh.f
    public final double nextDouble() {
        double dDoubleValue;
        int i14 = b.f204766a[this.f204759c.ordinal()];
        if (i14 != 3 && i14 != 4 && i14 != 5) {
            StringBuilder sb3 = new StringBuilder("Expected a Double but was ");
            sb3.append(this.f204759c);
            l2.o(sb3, e());
            return 0.0d;
        }
        Object obj = this.f204760d;
        if (obj instanceof Integer) {
            dDoubleValue = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            long jLongValue = ((Number) obj).longValue();
            double d14 = jLongValue;
            if (((long) d14) != jLongValue) {
                throw new IllegalStateException((jLongValue + " cannot be converted to Double").toString());
            }
            dDoubleValue = d14;
        } else if (obj instanceof Double) {
            dDoubleValue = ((Number) obj).doubleValue();
        } else if (obj instanceof String) {
            dDoubleValue = Double.parseDouble((String) obj);
        } else {
            if (!(obj instanceof e)) {
                l2.m("Expected a Double but got ", obj, " instead");
                return 0.0d;
            }
            dDoubleValue = Double.parseDouble(((e) obj).f204742a);
        }
        a();
        return dDoubleValue;
    }

    @Override // zh.f
    public final int nextInt() {
        int iIntValue;
        int i14;
        int i15 = b.f204766a[this.f204759c.ordinal()];
        if (i15 != 3 && i15 != 4 && i15 != 5) {
            StringBuilder sb3 = new StringBuilder("Expected an Int but was ");
            sb3.append(this.f204759c);
            l2.o(sb3, e());
            return 0;
        }
        Object obj = this.f204760d;
        if (obj instanceof Integer) {
            iIntValue = ((Number) obj).intValue();
        } else {
            if (obj instanceof Long) {
                long jLongValue = ((Number) obj).longValue();
                i14 = (int) jLongValue;
                if (i14 != jLongValue) {
                    throw new IllegalStateException((jLongValue + " cannot be converted to Int").toString());
                }
            } else if (obj instanceof Double) {
                double dDoubleValue = ((Number) obj).doubleValue();
                i14 = (int) dDoubleValue;
                if (i14 != dDoubleValue) {
                    throw new IllegalStateException((dDoubleValue + " cannot be converted to Int").toString());
                }
            } else if (obj instanceof String) {
                iIntValue = Integer.parseInt((String) obj);
            } else {
                if (!(obj instanceof e)) {
                    l2.m("Expected an Int but got ", obj, " instead");
                    return 0;
                }
                iIntValue = Integer.parseInt(((e) obj).f204742a);
            }
            iIntValue = i14;
        }
        a();
        return iIntValue;
    }

    @Override // zh.f
    public final long nextLong() {
        long jLongValue;
        int i14 = b.f204766a[this.f204759c.ordinal()];
        if (i14 != 3 && i14 != 4 && i14 != 5) {
            StringBuilder sb3 = new StringBuilder("Expected a Long but was ");
            sb3.append(this.f204759c);
            l2.o(sb3, e());
            return 0L;
        }
        Object obj = this.f204760d;
        if (obj instanceof Integer) {
            jLongValue = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            jLongValue = ((Number) obj).longValue();
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Number) obj).doubleValue();
            long j8 = (long) dDoubleValue;
            if (j8 != dDoubleValue) {
                throw new IllegalStateException((dDoubleValue + " cannot be converted to Long").toString());
            }
            jLongValue = j8;
        } else if (obj instanceof String) {
            jLongValue = Long.parseLong((String) obj);
        } else {
            if (!(obj instanceof e)) {
                l2.m("Expected Int but got ", obj, " instead");
                return 0L;
            }
            jLongValue = Long.parseLong(((e) obj).f204742a);
        }
        a();
        return jLongValue;
    }

    @Override // zh.f
    public final String nextName() {
        if (this.f204759c != f.a.NAME) {
            StringBuilder sb3 = new StringBuilder("Expected NAME but was ");
            sb3.append(this.f204759c);
            l2.o(sb3, e());
            return null;
        }
        Object obj = this.f204760d;
        obj.getClass();
        Map.Entry entry = (Map.Entry) obj;
        this.f204761e[this.f204765i - 1] = entry.getKey();
        this.f204760d = entry.getValue();
        this.f204759c = c(entry.getValue());
        return (String) entry.getKey();
    }

    @Override // zh.f
    public final void nextNull() {
        if (this.f204759c == f.a.NULL) {
            a();
            return;
        }
        StringBuilder sb3 = new StringBuilder("Expected NULL but was ");
        sb3.append(this.f204759c);
        l2.o(sb3, e());
    }

    @Override // zh.f
    public final String nextString() {
        int i14 = b.f204766a[this.f204759c.ordinal()];
        if (i14 != 3 && i14 != 4 && i14 != 5) {
            StringBuilder sb3 = new StringBuilder("Expected a String but was ");
            sb3.append(this.f204759c);
            l2.o(sb3, e());
            return null;
        }
        Object obj = this.f204760d;
        obj.getClass();
        String string = obj.toString();
        a();
        return string;
    }

    @Override // zh.f
    /* JADX INFO: renamed from: peek, reason: from getter */
    public final f.a getF204759c() {
        return this.f204759c;
    }

    @Override // zh.f
    public final f q() {
        if (this.f204759c != f.a.BEGIN_ARRAY) {
            StringBuilder sb3 = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb3.append(this.f204759c);
            l2.o(sb3, e());
            return null;
        }
        Object obj = this.f204760d;
        obj.getClass();
        List list = (List) obj;
        int i14 = this.f204765i;
        if (i14 >= 256) {
            vb.h.z("Nesting too deep");
            return null;
        }
        this.f204765i = i14 + 1;
        this.f204761e[i14] = -1;
        this.f204763g[this.f204765i - 1] = list.iterator();
        a();
        return this;
    }

    @Override // zh.f
    public final void rewind() {
        int i14 = this.f204765i;
        Map<String, Object> map = this.f204762f[i14 - 1];
        this.f204761e[i14 - 1] = null;
        map.getClass();
        this.f204763g[i14 - 1] = map.entrySet().iterator();
        this.f204764h[this.f204765i - 1] = 0;
        a();
    }

    @Override // zh.f
    public final void skipValue() {
        a();
    }

    @Override // zh.f
    public final f y() {
        if (this.f204759c != f.a.BEGIN_OBJECT) {
            StringBuilder sb3 = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb3.append(this.f204759c);
            l2.o(sb3, e());
            return null;
        }
        int i14 = this.f204765i;
        if (i14 >= 256) {
            vb.h.z("Nesting too deep");
            return null;
        }
        this.f204765i = i14 + 1;
        Object obj = this.f204760d;
        obj.getClass();
        this.f204762f[i14] = (Map) obj;
        rewind();
        return this;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzh/h$a;", "", "<init>", "()V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Map<String, ? extends Object> map) {
        this(map, null, 2, null);
        map.getClass();
    }

    public h(Map map, List list, int i14, j jVar) {
        this(map, (i14 & 2) != 0 ? j0.f134944a : list);
    }
}
