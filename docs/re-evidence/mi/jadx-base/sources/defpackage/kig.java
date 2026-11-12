package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes.dex */
public abstract class kig<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kig<Integer> f23884b = new c(false);
    public static final kig<Integer> c = new d(false);
    public static final kig<int[]> d = new e(true);
    public static final kig<Long> e = new f(false);
    public static final kig<long[]> f = new g(true);
    public static final kig<Float> g = new h(false);
    public static final kig<float[]> h = new i(true);
    public static final kig<Boolean> i = new j(false);
    public static final kig<boolean[]> j = new k(true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final kig<String> f23885k = new a(true);
    public static final kig<String[]> l = new b(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23886a;

    public class a extends kig<String> {
        public a(boolean z) {
            super(z);
        }

        @Override // defpackage.kig
        public String c() {
            return "string";
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public String b(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String k(String str) {
            return str;
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, String str2) {
            bundle.putString(str, str2);
        }
    }

    public class b extends kig<String[]> {
        public b(boolean z) {
            super(z);
        }

        @Override // defpackage.kig
        public String c() {
            return "string[]";
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public String[] b(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, String[] strArr) {
            bundle.putStringArray(str, strArr);
        }
    }

    public class c extends kig<Integer> {
        public c(boolean z) {
            super(z);
        }

        @Override // defpackage.kig
        public String c() {
            return "integer";
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer b(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer k(String str) {
            return str.startsWith("0x") ? Integer.valueOf(Integer.parseInt(str.substring(2), 16)) : Integer.valueOf(Integer.parseInt(str));
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    public class d extends kig<Integer> {
        public d(boolean z) {
            super(z);
        }

        @Override // defpackage.kig
        public String c() {
            return "reference";
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer b(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer k(String str) {
            return str.startsWith("0x") ? Integer.valueOf(Integer.parseInt(str.substring(2), 16)) : Integer.valueOf(Integer.parseInt(str));
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    public class e extends kig<int[]> {
        public e(boolean z) {
            super(z);
        }

        @Override // defpackage.kig
        public String c() {
            return "integer[]";
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public int[] b(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, int[] iArr) {
            bundle.putIntArray(str, iArr);
        }
    }

    public class f extends kig<Long> {
        public f(boolean z) {
            super(z);
        }

        @Override // defpackage.kig
        public String c() {
            return "long";
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Long b(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Long k(String str) {
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            return str.startsWith("0x") ? Long.valueOf(Long.parseLong(str.substring(2), 16)) : Long.valueOf(Long.parseLong(str));
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Long l) {
            bundle.putLong(str, l.longValue());
        }
    }

    public class g extends kig<long[]> {
        public g(boolean z) {
            super(z);
        }

        @Override // defpackage.kig
        public String c() {
            return "long[]";
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public long[] b(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public long[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, long[] jArr) {
            bundle.putLongArray(str, jArr);
        }
    }

    public class h extends kig<Float> {
        public h(boolean z) {
            super(z);
        }

        @Override // defpackage.kig
        public String c() {
            return "float";
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Float b(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float k(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Float f) {
            bundle.putFloat(str, f.floatValue());
        }
    }

    public class i extends kig<float[]> {
        public i(boolean z) {
            super(z);
        }

        @Override // defpackage.kig
        public String c() {
            return "float[]";
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public float[] b(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public float[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, float[] fArr) {
            bundle.putFloatArray(str, fArr);
        }
    }

    public class j extends kig<Boolean> {
        public j(boolean z) {
            super(z);
        }

        @Override // defpackage.kig
        public String c() {
            return "boolean";
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Boolean b(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean k(String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    public class k extends kig<boolean[]> {
        public k(boolean z) {
            super(z);
        }

        @Override // defpackage.kig
        public String c() {
            return "boolean[]";
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean[] b(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, boolean[] zArr) {
            bundle.putBooleanArray(str, zArr);
        }
    }

    public static final class l<D extends Enum> extends p<D> {
        public final Class<D> n;

        public l(Class<D> cls) {
            super(false, cls);
            if (cls.isEnum()) {
                this.n = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is not an Enum type.");
        }

        @Override // kig.p, defpackage.kig
        public String c() {
            return this.n.getName();
        }

        @Override // kig.p
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public D k(String str) {
            for (D d : this.n.getEnumConstants()) {
                if (d.name().equals(str)) {
                    return d;
                }
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.n.getName() + ".");
        }
    }

    public static final class m<D extends Parcelable> extends kig<D[]> {
        public final Class<D[]> m;

        public m(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
            try {
                this.m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // defpackage.kig
        public String c() {
            return this.m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || m.class != obj.getClass()) {
                return false;
            }
            return this.m.equals(((m) obj).m);
        }

        public int hashCode() {
            return this.m.hashCode();
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public D[] b(Bundle bundle, String str) {
            return (D[]) ((Parcelable[]) bundle.get(str));
        }

        @Override // defpackage.kig
        public D[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, D[] dArr) {
            this.m.cast(dArr);
            bundle.putParcelableArray(str, dArr);
        }
    }

    public static final class n<D> extends kig<D> {
        public final Class<D> m;

        public n(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
        }

        @Override // defpackage.kig
        public D b(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // defpackage.kig
        public String c() {
            return this.m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || n.class != obj.getClass()) {
                return false;
            }
            return this.m.equals(((n) obj).m);
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: h */
        public D k(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public int hashCode() {
            return this.m.hashCode();
        }

        @Override // defpackage.kig
        public void i(Bundle bundle, String str, D d) {
            this.m.cast(d);
            if (d == null || (d instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d);
            } else if (d instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d);
            }
        }
    }

    public static final class o<D extends Serializable> extends kig<D[]> {
        public final Class<D[]> m;

        public o(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            try {
                this.m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // defpackage.kig
        public String c() {
            return this.m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || o.class != obj.getClass()) {
                return false;
            }
            return this.m.equals(((o) obj).m);
        }

        public int hashCode() {
            return this.m.hashCode();
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public D[] b(Bundle bundle, String str) {
            return (D[]) ((Serializable[]) bundle.get(str));
        }

        @Override // defpackage.kig
        public D[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.kig
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, D[] dArr) {
            this.m.cast(dArr);
            bundle.putSerializable(str, dArr);
        }
    }

    public kig(boolean z) {
        this.f23886a = z;
    }

    public static kig<?> a(String str, String str2) {
        String strSubstring;
        kig<Integer> kigVar = f23884b;
        if (kigVar.c().equals(str)) {
            return kigVar;
        }
        kig kigVar2 = d;
        if (kigVar2.c().equals(str)) {
            return kigVar2;
        }
        kig<Long> kigVar3 = e;
        if (kigVar3.c().equals(str)) {
            return kigVar3;
        }
        kig kigVar4 = f;
        if (kigVar4.c().equals(str)) {
            return kigVar4;
        }
        kig<Boolean> kigVar5 = i;
        if (kigVar5.c().equals(str)) {
            return kigVar5;
        }
        kig kigVar6 = j;
        if (kigVar6.c().equals(str)) {
            return kigVar6;
        }
        kig<String> kigVar7 = f23885k;
        if (kigVar7.c().equals(str)) {
            return kigVar7;
        }
        kig kigVar8 = l;
        if (kigVar8.c().equals(str)) {
            return kigVar8;
        }
        kig<Float> kigVar9 = g;
        if (kigVar9.c().equals(str)) {
            return kigVar9;
        }
        kig kigVar10 = h;
        if (kigVar10.c().equals(str)) {
            return kigVar10;
        }
        kig<Integer> kigVar11 = c;
        if (kigVar11.c().equals(str)) {
            return kigVar11;
        }
        if (str == null || str.isEmpty()) {
            return kigVar7;
        }
        try {
            if (!str.startsWith(".") || str2 == null) {
                strSubstring = str;
            } else {
                strSubstring = str2 + str;
            }
            if (str.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                Class<?> cls = Class.forName(strSubstring);
                if (Parcelable.class.isAssignableFrom(cls)) {
                    return new m(cls);
                }
                if (Serializable.class.isAssignableFrom(cls)) {
                    return new o(cls);
                }
            } else {
                Class<?> cls2 = Class.forName(strSubstring);
                if (Parcelable.class.isAssignableFrom(cls2)) {
                    return new n(cls2);
                }
                if (Enum.class.isAssignableFrom(cls2)) {
                    return new l(cls2);
                }
                if (Serializable.class.isAssignableFrom(cls2)) {
                    return new p(cls2);
                }
            }
            throw new IllegalArgumentException(strSubstring + " is not Serializable or Parcelable.");
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static kig d(String str) {
        try {
            try {
                try {
                    try {
                        kig<Integer> kigVar = f23884b;
                        kigVar.k(str);
                        return kigVar;
                    } catch (IllegalArgumentException unused) {
                        kig<Boolean> kigVar2 = i;
                        kigVar2.k(str);
                        return kigVar2;
                    }
                } catch (IllegalArgumentException unused2) {
                    kig<Float> kigVar3 = g;
                    kigVar3.k(str);
                    return kigVar3;
                }
            } catch (IllegalArgumentException unused3) {
                kig<Long> kigVar4 = e;
                kigVar4.k(str);
                return kigVar4;
            }
        } catch (IllegalArgumentException unused4) {
            return f23885k;
        }
    }

    public static kig e(Object obj) {
        if (obj instanceof Integer) {
            return f23884b;
        }
        if (obj instanceof int[]) {
            return d;
        }
        if (obj instanceof Long) {
            return e;
        }
        if (obj instanceof long[]) {
            return f;
        }
        if (obj instanceof Float) {
            return g;
        }
        if (obj instanceof float[]) {
            return h;
        }
        if (obj instanceof Boolean) {
            return i;
        }
        if (obj instanceof boolean[]) {
            return j;
        }
        if ((obj instanceof String) || obj == null) {
            return f23885k;
        }
        if (obj instanceof String[]) {
            return l;
        }
        if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new m(obj.getClass().getComponentType());
        }
        if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new o(obj.getClass().getComponentType());
        }
        if (obj instanceof Parcelable) {
            return new n(obj.getClass());
        }
        if (obj instanceof Enum) {
            return new l(obj.getClass());
        }
        if (obj instanceof Serializable) {
            return new p(obj.getClass());
        }
        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
    }

    public abstract T b(Bundle bundle, String str);

    public abstract String c();

    public boolean f() {
        return this.f23886a;
    }

    public T g(Bundle bundle, String str, String str2) {
        T tK = k(str2);
        i(bundle, str, tK);
        return tK;
    }

    /* JADX INFO: renamed from: h */
    public abstract T k(String str);

    public abstract void i(Bundle bundle, String str, T t);

    public String toString() {
        return c();
    }

    public static class p<D extends Serializable> extends kig<D> {
        public final Class<D> m;

        public p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            if (!cls.isEnum()) {
                this.m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
        }

        @Override // defpackage.kig
        public String c() {
            return this.m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                return this.m.equals(((p) obj).m);
            }
            return false;
        }

        public int hashCode() {
            return this.m.hashCode();
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public D b(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // defpackage.kig
        public D k(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // defpackage.kig
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, D d) {
            this.m.cast(d);
            bundle.putSerializable(str, d);
        }

        public p(boolean z, Class<D> cls) {
            super(z);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }
    }
}
