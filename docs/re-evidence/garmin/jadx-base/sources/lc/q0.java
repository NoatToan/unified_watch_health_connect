package lc;

import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.gncs.NotificationConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.Serializable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006\u0007\b\t\n\u000b\fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Llc/q0;", "T", "", "", "isNullableAllowed", "<init>", "(Z)V", "b", JWKParameterNames.RSA_EXPONENT, "d", "g", "c", "f", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class q0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f111837b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f111838c = new n();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f111839d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f111840e = new l();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f111841f = new m();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f111842g = new q();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f111843h = new o();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p f111844i = new p();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j f111845j = new j();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f111846k = new h();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i f111847l = new i();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final lc.f f111848m = new lc.f();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final lc.d f111849n = new lc.d();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final lc.e f111850o = new lc.e();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c1 f111851p = new c1();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a1 f111852q = new a1();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b1 f111853r = new b1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f111854a;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"lc/q0$a", "Llc/q0;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends q0<Integer> {
        public a() {
            super(false);
        }

        @Override // lc.q0
        public final Integer a(Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            return Integer.valueOf(nd.b.d(bundle, str));
        }

        @Override // lc.q0
        public final String b() {
            return "reference";
        }

        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final Integer h(String str) {
            int i14;
            str.getClass();
            if (d53.u.y(str, "0x", false)) {
                String strSubstring = str.substring(2);
                d53.a.a(16);
                i14 = Integer.parseInt(strSubstring, 16);
            } else {
                i14 = Integer.parseInt(str);
            }
            return Integer.valueOf(i14);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, Integer num) {
            int iIntValue = num.intValue();
            str.getClass();
            bundle.putInt(str, iIntValue);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\f\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llc/q0$c;", "", "D", "Llc/q0$g;", "Ljava/lang/Class;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c<D extends Enum<?>> extends g<D> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Class<D> f111855t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Class<D> cls) {
            super(false, cls);
            cls.getClass();
            if (cls.isEnum()) {
                this.f111855t = cls;
            } else {
                kg.f.l(cls, " is not an Enum type.");
                throw null;
            }
        }

        @Override // lc.q0.g, lc.q0
        public final String b() {
            return this.f111855t.getName();
        }

        @Override // lc.q0.g
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final D h(String str) {
            D d14;
            str.getClass();
            Class<D> cls = this.f111855t;
            D[] enumConstants = cls.getEnumConstants();
            enumConstants.getClass();
            int length = enumConstants.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    d14 = null;
                    break;
                }
                d14 = enumConstants[i14];
                if (d53.u.q(d14.name(), str, true)) {
                    break;
                }
                i14++;
            }
            D d15 = d14;
            if (d15 != null) {
                return d15;
            }
            StringBuilder sbL = hb.a.l("Enum value ", str, " not found for type ");
            sbL.append(cls.getName());
            sbL.append('.');
            throw new IllegalArgumentException(sbL.toString());
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llc/q0$d;", "Landroid/os/Parcelable;", "D", "Llc/q0;", "", "Ljava/lang/Class;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d<D extends Parcelable> extends q0<D[]> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Class<D[]> f111856s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Class<D> cls) {
            super(true);
            cls.getClass();
            if (!Parcelable.class.isAssignableFrom(cls)) {
                kg.f.l(cls, " does not implement Parcelable.");
                throw null;
            }
            try {
                this.f111856s = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e4) {
                o2.c.p(e4);
                throw null;
            }
        }

        @Override // lc.q0
        public final Object a(Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            return (Parcelable[]) bundle.get(str);
        }

        @Override // lc.q0
        public final String b() {
            return this.f111856s.getName();
        }

        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            str.getClass();
            this.f111856s.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            return p005kotlin.jvm.internal.s.g(this.f111856s, ((d) obj).f111856s);
        }

        @Override // lc.q0
        public final boolean g(Object obj, Object obj2) {
            return p13.m.b((Parcelable[]) obj, (Parcelable[]) obj2);
        }

        public final int hashCode() {
            return this.f111856s.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llc/q0$e;", "D", "Llc/q0;", "Ljava/lang/Class;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e<D> extends q0<D> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Class<D> f111857s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Class<D> cls) {
            super(true);
            cls.getClass();
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f111857s = cls;
            } else {
                kg.f.l(cls, " does not implement Parcelable or Serializable.");
                throw null;
            }
        }

        @Override // lc.q0
        public final D a(Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            return (D) bundle.get(str);
        }

        @Override // lc.q0
        public final String b() {
            return this.f111857s.getName();
        }

        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final D h(String str) {
            str.getClass();
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, D d14) {
            str.getClass();
            this.f111857s.cast(d14);
            if (d14 == null || (d14 instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d14);
            } else if (d14 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d14);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !e.class.equals(obj.getClass())) {
                return false;
            }
            return p005kotlin.jvm.internal.s.g(this.f111857s, ((e) obj).f111857s);
        }

        public final int hashCode() {
            return this.f111857s.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llc/q0$f;", "Ljava/io/Serializable;", "D", "Llc/q0;", "", "Ljava/lang/Class;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f<D extends Serializable> extends q0<D[]> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Class<D[]> f111858s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Class<D> cls) {
            super(true);
            cls.getClass();
            if (!Serializable.class.isAssignableFrom(cls)) {
                kg.f.l(cls, " does not implement Serializable.");
                throw null;
            }
            try {
                this.f111858s = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e4) {
                o2.c.p(e4);
                throw null;
            }
        }

        @Override // lc.q0
        public final Object a(Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            return (Serializable[]) bundle.get(str);
        }

        @Override // lc.q0
        public final String b() {
            return this.f111858s.getName();
        }

        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
        @Override // lc.q0
        public final void e(Bundle bundle, String str, Object obj) {
            ?? r14 = (Serializable[]) obj;
            str.getClass();
            this.f111858s.cast(r14);
            bundle.putSerializable(str, r14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !f.class.equals(obj.getClass())) {
                return false;
            }
            return p005kotlin.jvm.internal.s.g(this.f111858s, ((f) obj).f111858s);
        }

        @Override // lc.q0
        public final boolean g(Object obj, Object obj2) {
            return p13.m.b((Serializable[]) obj, (Serializable[]) obj2);
        }

        public final int hashCode() {
            return this.f111858s.hashCode();
        }
    }

    public q0(boolean z14) {
        this.f111854a = z14;
    }

    public abstract T a(Bundle bundle, String str);

    public String b() {
        return "nav_type";
    }

    public Object c(Object obj, String str) {
        return h(str);
    }

    /* JADX INFO: renamed from: d */
    public abstract T h(String str);

    public abstract void e(Bundle bundle, String str, T t7);

    public String f(T t7) {
        return String.valueOf(t7);
    }

    public boolean g(T t7, T t14) {
        return p005kotlin.jvm.internal.s.g(t7, t14);
    }

    public final String toString() {
        return b();
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0007R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001e0\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0007R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0007¨\u0006!"}, d2 = {"Llc/q0$b;", "", "<init>", "()V", "Llc/q0;", "", "IntType", "Llc/q0;", "ReferenceType", "", "IntArrayType", "", "IntListType", "", "LongType", "", "LongArrayType", "LongListType", "", "FloatType", "", "FloatArrayType", "FloatListType", "", "BoolType", "", "BoolArrayType", "BoolListType", "", "StringType", "", "StringArrayType", "StringListType", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static q0 a(Class cls, boolean z14) {
            if (Parcelable.class.isAssignableFrom(cls)) {
                return z14 ? new d(cls) : new e(cls);
            }
            if (Enum.class.isAssignableFrom(cls) && !z14) {
                return new c(cls);
            }
            if (Serializable.class.isAssignableFrom(cls)) {
                return z14 ? new f(cls) : new g(cls);
            }
            return null;
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Llc/q0$g;", "Ljava/io/Serializable;", "D", "Llc/q0;", "Ljava/lang/Class;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/Class;)V", "", "nullableAllowed", "(ZLjava/lang/Class;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class g<D extends Serializable> extends q0<D> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Class<D> f111859s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Class<D> cls) {
            super(true);
            cls.getClass();
            if (!Serializable.class.isAssignableFrom(cls)) {
                kg.f.l(cls, " does not implement Serializable.");
                throw null;
            }
            if (cls.isEnum()) {
                kg.f.l(cls, " is an Enum. You should use EnumType instead.");
                throw null;
            }
            this.f111859s = cls;
        }

        @Override // lc.q0
        public final Object a(Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            return (Serializable) bundle.get(str);
        }

        @Override // lc.q0
        public String b() {
            return this.f111859s.getName();
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, Object obj) {
            Serializable serializable = (Serializable) obj;
            str.getClass();
            serializable.getClass();
            this.f111859s.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            return p005kotlin.jvm.internal.s.g(this.f111859s, ((g) obj).f111859s);
        }

        @Override // lc.q0
        public D h(String str) {
            str.getClass();
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final int hashCode() {
            return this.f111859s.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z14, Class<D> cls) {
            super(z14);
            cls.getClass();
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f111859s = cls;
            } else {
                kg.f.l(cls, " does not implement Serializable.");
                throw null;
            }
        }
    }
}
