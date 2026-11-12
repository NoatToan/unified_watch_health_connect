package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
public final class Predicates {

    public static class b<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends Predicate<? super T>> a;

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl T t) {
            for (int i = 0; i < this.a.size(); i++) {
                if (!this.a.get(i).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.e(SearchCriteria.AND, this.a);
        }

        private b(List<? extends Predicate<? super T>> list) {
            this.a = list;
        }
    }

    public static class c<A, B> implements Predicate<A>, Serializable {
        private static final long serialVersionUID = 0;
        public final Predicate<B> a;
        public final Function<A, ? extends B> b;

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl A a) {
            return this.a.apply(this.b.apply(a));
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b.equals(cVar.b) && this.a.equals(cVar.a);
        }

        public int hashCode() {
            return this.b.hashCode() ^ this.a.hashCode();
        }

        public String toString() {
            return this.a + "(" + this.b + ")";
        }

        private c(Predicate<B> predicate, Function<A, ? extends B> function) {
            this.a = (Predicate) Preconditions.checkNotNull(predicate);
            this.b = (Function) Preconditions.checkNotNull(function);
        }
    }

    @GwtIncompatible
    public static class d extends e {
        private static final long serialVersionUID = 0;

        public d(String str) {
            super(com.google.common.base.j.a(str));
        }

        @Override // com.google.common.base.Predicates.e
        public String toString() {
            return "Predicates.containsPattern(" + this.a.f() + ")";
        }
    }

    @GwtIncompatible
    public static class e implements Predicate<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;
        public final com.google.common.base.d a;

        public e(com.google.common.base.d dVar) {
            this.a = (com.google.common.base.d) Preconditions.checkNotNull(dVar);
        }

        @Override // com.google.common.base.Predicate
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(CharSequence charSequence) {
            return this.a.e(charSequence).b();
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Objects.equal(this.a.f(), eVar.a.f()) && this.a.b() == eVar.a.b();
        }

        public int hashCode() {
            return Objects.hashCode(this.a.f(), Integer.valueOf(this.a.b()));
        }

        public String toString() {
            return "Predicates.contains(" + MoreObjects.toStringHelper(this.a).add("pattern", this.a.f()).add("pattern.flags", this.a.b()).toString() + ")";
        }
    }

    public static class f<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Collection<?> a;

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl T t) {
            try {
                return this.a.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof f) {
                return this.a.equals(((f) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Predicates.in(" + this.a + ")";
        }

        private f(Collection<?> collection) {
            this.a = (Collection) Preconditions.checkNotNull(collection);
        }
    }

    @GwtIncompatible
    public static class g implements Predicate<Object>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> a;

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl Object obj) {
            return this.a.isInstance(obj);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Predicates.instanceOf(" + this.a.getName() + ")";
        }

        private g(Class<?> cls) {
            this.a = (Class) Preconditions.checkNotNull(cls);
        }
    }

    public static class h<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final T a;

        @Override // com.google.common.base.Predicate
        public boolean apply(T t) {
            return this.a.equals(t);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof h) {
                return this.a.equals(((h) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Predicates.equalTo(" + this.a + ")";
        }

        private h(T t) {
            this.a = t;
        }
    }

    public static class i<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Predicate<T> a;

        public i(Predicate<T> predicate) {
            this.a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl T t) {
            return !this.a.apply(t);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof i) {
                return this.a.equals(((i) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.a.hashCode();
        }

        public String toString() {
            return "Predicates.not(" + this.a + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class j implements Predicate<Object> {
        private static final /* synthetic */ j[] $VALUES;
        public static final j ALWAYS_FALSE;
        public static final j ALWAYS_TRUE;
        public static final j IS_NULL;
        public static final j NOT_NULL;

        public static enum a extends j {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        }

        public static enum b extends j {
            public b(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        }

        public static enum c extends j {
            public c(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        }

        public static enum d extends j {
            public d(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        }

        static {
            a aVar = new a("ALWAYS_TRUE", 0);
            ALWAYS_TRUE = aVar;
            b bVar = new b("ALWAYS_FALSE", 1);
            ALWAYS_FALSE = bVar;
            c cVar = new c("IS_NULL", 2);
            IS_NULL = cVar;
            d dVar = new d("NOT_NULL", 3);
            NOT_NULL = dVar;
            $VALUES = new j[]{aVar, bVar, cVar, dVar};
        }

        private j(String str, int i) {
            super(str, i);
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) $VALUES.clone();
        }

        public <T> Predicate<T> a() {
            return this;
        }
    }

    public static class k<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends Predicate<? super T>> a;

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl T t) {
            for (int i = 0; i < this.a.size(); i++) {
                if (this.a.get(i).apply(t)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof k) {
                return this.a.equals(((k) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + 87855567;
        }

        public String toString() {
            return Predicates.e(SearchCriteria.OR, this.a);
        }

        private k(List<? extends Predicate<? super T>> list) {
            this.a = list;
        }
    }

    @GwtIncompatible
    public static class l implements Predicate<Class<?>>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> a;

        @Override // com.google.common.base.Predicate
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            return (obj instanceof l) && this.a == ((l) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Predicates.subtypeOf(" + this.a.getName() + ")";
        }

        private l(Class<?> cls) {
            this.a = (Class) Preconditions.checkNotNull(cls);
        }
    }

    private Predicates() {
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> alwaysFalse() {
        return j.ALWAYS_FALSE.a();
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> alwaysTrue() {
        return j.ALWAYS_TRUE.a();
    }

    public static <T> Predicate<T> and(Iterable<? extends Predicate<? super T>> iterable) {
        return new b(c(iterable));
    }

    private static <T> List<Predicate<? super T>> b(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return Arrays.asList(predicate, predicate2);
    }

    public static <T> List<T> c(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(Preconditions.checkNotNull(it2.next()));
        }
        return arrayList;
    }

    public static <A, B> Predicate<A> compose(Predicate<B> predicate, Function<A, ? extends B> function) {
        return new c(predicate, function);
    }

    @GwtIncompatible("java.util.regex.Pattern")
    public static Predicate<CharSequence> contains(Pattern pattern) {
        return new e(new com.google.common.base.g(pattern));
    }

    @GwtIncompatible
    public static Predicate<CharSequence> containsPattern(String str) {
        return new d(str);
    }

    private static <T> List<T> d(T... tArr) {
        return c(Arrays.asList(tArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object obj : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> Predicate<T> equalTo(@NullableDecl T t) {
        return t == null ? isNull() : new h(t);
    }

    public static <T> Predicate<T> in(Collection<? extends T> collection) {
        return new f(collection);
    }

    @GwtIncompatible
    public static Predicate<Object> instanceOf(Class<?> cls) {
        return new g(cls);
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> isNull() {
        return j.IS_NULL.a();
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
        return new i(predicate);
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> notNull() {
        return j.NOT_NULL.a();
    }

    public static <T> Predicate<T> or(Iterable<? extends Predicate<? super T>> iterable) {
        return new k(c(iterable));
    }

    @Beta
    @GwtIncompatible
    public static Predicate<Class<?>> subtypeOf(Class<?> cls) {
        return new l(cls);
    }

    @SafeVarargs
    public static <T> Predicate<T> and(Predicate<? super T>... predicateArr) {
        return new b(d(predicateArr));
    }

    @SafeVarargs
    public static <T> Predicate<T> or(Predicate<? super T>... predicateArr) {
        return new k(d(predicateArr));
    }

    public static <T> Predicate<T> and(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new b(b((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    public static <T> Predicate<T> or(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new k(b((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }
}
