package defpackage;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class yud {
    public static final zud<tpd> c = new j();
    public static final zud<tpd> d = new k();
    public static final zud<mpd> e = new l();
    public static final zud<lpd> f = new m();
    public static final zud<Iterable<? extends Object>> g = new n();
    public static final zud<Enum<?>> h = new o();
    public static final zud<Map<String, ? extends Object>> i = new p();
    public static final zud<Object> j = new yh2();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final zud<Object> f40565k = new xh2();
    public static final zud<Object> l = new uj1();
    public static final zud<Object> m = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap<Class<?>, zud<?>> f40566a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkedList<s> f40567b = new LinkedList<>();

    public class a implements zud<Double> {
        public a() {
        }

        @Override // defpackage.zud
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Double d, Appendable appendable, vpd vpdVar) throws IOException {
            if (d.isInfinite()) {
                appendable.append(AbstractJsonLexerKt.NULL);
            } else {
                appendable.append(d.toString());
            }
        }
    }

    public class b implements zud<Date> {
        public b() {
        }

        @Override // defpackage.zud
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, Appendable appendable, vpd vpdVar) throws IOException {
            appendable.append('\"');
            ypd.c(date.toString(), appendable, vpdVar);
            appendable.append('\"');
        }
    }

    public class c implements zud<Float> {
        public c() {
        }

        @Override // defpackage.zud
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Float f, Appendable appendable, vpd vpdVar) throws IOException {
            if (f.isInfinite()) {
                appendable.append(AbstractJsonLexerKt.NULL);
            } else {
                appendable.append(f.toString());
            }
        }
    }

    public class d implements zud<int[]> {
        public d() {
        }

        @Override // defpackage.zud
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(int[] iArr, Appendable appendable, vpd vpdVar) throws IOException {
            vpdVar.c(appendable);
            boolean z = false;
            for (int i : iArr) {
                if (z) {
                    vpdVar.m(appendable);
                } else {
                    z = true;
                }
                appendable.append(Integer.toString(i));
            }
            vpdVar.d(appendable);
        }
    }

    public class e implements zud<short[]> {
        public e() {
        }

        @Override // defpackage.zud
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(short[] sArr, Appendable appendable, vpd vpdVar) throws IOException {
            vpdVar.c(appendable);
            boolean z = false;
            for (short s : sArr) {
                if (z) {
                    vpdVar.m(appendable);
                } else {
                    z = true;
                }
                appendable.append(Short.toString(s));
            }
            vpdVar.d(appendable);
        }
    }

    public class f implements zud<long[]> {
        public f() {
        }

        @Override // defpackage.zud
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(long[] jArr, Appendable appendable, vpd vpdVar) throws IOException {
            vpdVar.c(appendable);
            boolean z = false;
            for (long j : jArr) {
                if (z) {
                    vpdVar.m(appendable);
                } else {
                    z = true;
                }
                appendable.append(Long.toString(j));
            }
            vpdVar.d(appendable);
        }
    }

    public class g implements zud<float[]> {
        public g() {
        }

        @Override // defpackage.zud
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(float[] fArr, Appendable appendable, vpd vpdVar) throws IOException {
            vpdVar.c(appendable);
            boolean z = false;
            for (float f : fArr) {
                if (z) {
                    vpdVar.m(appendable);
                } else {
                    z = true;
                }
                appendable.append(Float.toString(f));
            }
            vpdVar.d(appendable);
        }
    }

    public class h implements zud<double[]> {
        public h() {
        }

        @Override // defpackage.zud
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(double[] dArr, Appendable appendable, vpd vpdVar) throws IOException {
            vpdVar.c(appendable);
            boolean z = false;
            for (double d : dArr) {
                if (z) {
                    vpdVar.m(appendable);
                } else {
                    z = true;
                }
                appendable.append(Double.toString(d));
            }
            vpdVar.d(appendable);
        }
    }

    public class i implements zud<boolean[]> {
        public i() {
        }

        @Override // defpackage.zud
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(boolean[] zArr, Appendable appendable, vpd vpdVar) throws IOException {
            vpdVar.c(appendable);
            boolean z = false;
            for (boolean z2 : zArr) {
                if (z) {
                    vpdVar.m(appendable);
                } else {
                    z = true;
                }
                appendable.append(Boolean.toString(z2));
            }
            vpdVar.d(appendable);
        }
    }

    public class j implements zud<tpd> {
        @Override // defpackage.zud
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public <E extends tpd> void a(E e, Appendable appendable, vpd vpdVar) throws IOException {
            e.writeJSONString(appendable);
        }
    }

    public class k implements zud<tpd> {
        @Override // defpackage.zud
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public <E extends tpd> void a(E e, Appendable appendable, vpd vpdVar) throws IOException {
            e.writeJSONString(appendable, vpdVar);
        }
    }

    public class l implements zud<mpd> {
        @Override // defpackage.zud
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public <E extends mpd> void a(E e, Appendable appendable, vpd vpdVar) throws IOException {
            appendable.append(e.toJSONString(vpdVar));
        }
    }

    public class m implements zud<lpd> {
        @Override // defpackage.zud
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public <E extends lpd> void a(E e, Appendable appendable, vpd vpdVar) throws IOException {
            appendable.append(e.toJSONString());
        }
    }

    public class n implements zud<Iterable<? extends Object>> {
        @Override // defpackage.zud
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public <E extends Iterable<? extends Object>> void a(E e, Appendable appendable, vpd vpdVar) throws IOException {
            vpdVar.c(appendable);
            boolean z = true;
            for (Object obj : e) {
                if (z) {
                    vpdVar.e(appendable);
                    z = false;
                } else {
                    vpdVar.a(appendable);
                }
                if (obj == null) {
                    appendable.append(AbstractJsonLexerKt.NULL);
                } else {
                    ypd.d(obj, appendable, vpdVar);
                }
                vpdVar.b(appendable);
            }
            vpdVar.d(appendable);
        }
    }

    public class o implements zud<Enum<?>> {
        @Override // defpackage.zud
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public <E extends Enum<?>> void a(E e, Appendable appendable, vpd vpdVar) throws IOException {
            vpdVar.p(appendable, e.name());
        }
    }

    public class p implements zud<Map<String, ? extends Object>> {
        @Override // defpackage.zud
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public <E extends Map<String, ? extends Object>> void a(E e, Appendable appendable, vpd vpdVar) throws IOException {
            vpdVar.n(appendable);
            boolean z = true;
            for (Map.Entry entry : e.entrySet()) {
                Object value = entry.getValue();
                if (value != null || !vpdVar.g()) {
                    if (z) {
                        vpdVar.l(appendable);
                        z = false;
                    } else {
                        vpdVar.m(appendable);
                    }
                    yud.g(entry.getKey().toString(), value, appendable, vpdVar);
                }
            }
            vpdVar.o(appendable);
        }
    }

    public class q implements zud<Object> {
        @Override // defpackage.zud
        public void a(Object obj, Appendable appendable, vpd vpdVar) throws IOException {
            appendable.append(obj.toString());
        }
    }

    public class r implements zud<String> {
        public r() {
        }

        @Override // defpackage.zud
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(String str, Appendable appendable, vpd vpdVar) throws IOException {
            vpdVar.p(appendable, str);
        }
    }

    public static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Class<?> f40578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public zud<?> f40579b;

        public s(Class<?> cls, zud<?> zudVar) {
            this.f40578a = cls;
            this.f40579b = zudVar;
        }
    }

    public yud() {
        c();
    }

    public static void g(String str, Object obj, Appendable appendable, vpd vpdVar) throws IOException {
        if (str == null) {
            appendable.append(AbstractJsonLexerKt.NULL);
        } else if (vpdVar.h(str)) {
            appendable.append('\"');
            ypd.c(str, appendable, vpdVar);
            appendable.append('\"');
        } else {
            appendable.append(str);
        }
        vpdVar.k(appendable);
        if (obj instanceof String) {
            vpdVar.p(appendable, (String) obj);
        } else {
            ypd.d(obj, appendable, vpdVar);
        }
        vpdVar.j(appendable);
    }

    public zud a(Class cls) {
        return this.f40566a.get(cls);
    }

    public zud b(Class<?> cls) {
        for (s sVar : this.f40567b) {
            if (sVar.f40578a.isAssignableFrom(cls)) {
                return sVar.f40579b;
            }
        }
        return null;
    }

    public void c() {
        d(new r(), String.class);
        d(new a(), Double.class);
        d(new b(), Date.class);
        d(new c(), Float.class);
        zud<?> zudVar = m;
        d(zudVar, Integer.class, Long.class, Byte.class, Short.class, BigInteger.class, BigDecimal.class);
        d(zudVar, Boolean.class);
        d(new d(), int[].class);
        d(new e(), short[].class);
        d(new f(), long[].class);
        d(new g(), float[].class);
        d(new h(), double[].class);
        d(new i(), boolean[].class);
        e(tpd.class, d);
        e(spd.class, c);
        e(mpd.class, e);
        e(lpd.class, f);
        e(Map.class, i);
        e(Iterable.class, g);
        e(Enum.class, h);
        e(Number.class, zudVar);
    }

    public <T> void d(zud<T> zudVar, Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            this.f40566a.put(cls, zudVar);
        }
    }

    public void e(Class<?> cls, zud<?> zudVar) {
        f(cls, zudVar);
    }

    public void f(Class<?> cls, zud<?> zudVar) {
        this.f40567b.addLast(new s(cls, zudVar));
    }
}
