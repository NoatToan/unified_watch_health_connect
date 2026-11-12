package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
public class Joiner {
    private final String a;

    public static final class MapJoiner {
        private final Joiner a;
        private final String b;

        public /* synthetic */ MapJoiner(Joiner joiner, String str, a aVar) {
            this(joiner, str);
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a, Map<?, ?> map) throws IOException {
            return (A) appendTo(a, map.entrySet());
        }

        public String join(Map<?, ?> map) {
            return join(map.entrySet());
        }

        public MapJoiner useForNull(String str) {
            return new MapJoiner(this.a.useForNull(str), this.b);
        }

        private MapJoiner(Joiner joiner, String str) {
            this.a = joiner;
            this.b = (String) Preconditions.checkNotNull(str);
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb, Map<?, ?> map) {
            return appendTo(sb, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        @Beta
        public String join(Iterable<? extends Map.Entry<?, ?>> iterable) {
            return join(iterable.iterator());
        }

        @CanIgnoreReturnValue
        @Beta
        public <A extends Appendable> A appendTo(A a, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
            return (A) appendTo(a, iterable.iterator());
        }

        @Beta
        public String join(Iterator<? extends Map.Entry<?, ?>> it2) {
            return appendTo(new StringBuilder(), it2).toString();
        }

        @CanIgnoreReturnValue
        @Beta
        public <A extends Appendable> A appendTo(A a, Iterator<? extends Map.Entry<?, ?>> it2) throws IOException {
            Preconditions.checkNotNull(a);
            if (it2.hasNext()) {
                Map.Entry<?, ?> next = it2.next();
                a.append(this.a.c(next.getKey()));
                a.append(this.b);
                a.append(this.a.c(next.getValue()));
                while (it2.hasNext()) {
                    a.append(this.a.a);
                    Map.Entry<?, ?> next2 = it2.next();
                    a.append(this.a.c(next2.getKey()));
                    a.append(this.b);
                    a.append(this.a.c(next2.getValue()));
                }
            }
            return a;
        }

        @CanIgnoreReturnValue
        @Beta
        public StringBuilder appendTo(StringBuilder sb, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return appendTo(sb, iterable.iterator());
        }

        @CanIgnoreReturnValue
        @Beta
        public StringBuilder appendTo(StringBuilder sb, Iterator<? extends Map.Entry<?, ?>> it2) {
            try {
                appendTo(sb, it2);
                return sb;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    public class a extends Joiner {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Joiner joiner, String str) {
            super(joiner, null);
            this.b = str;
        }

        @Override // com.google.common.base.Joiner
        public CharSequence c(@NullableDecl Object obj) {
            return obj == null ? this.b : Joiner.this.c(obj);
        }

        @Override // com.google.common.base.Joiner
        public Joiner skipNulls() {
            throw new UnsupportedOperationException("already specified useForNull");
        }

        @Override // com.google.common.base.Joiner
        public Joiner useForNull(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    public class b extends Joiner {
        public b(Joiner joiner) {
            super(joiner, null);
        }

        @Override // com.google.common.base.Joiner
        public <A extends Appendable> A appendTo(A a, Iterator<?> it2) throws IOException {
            Preconditions.checkNotNull(a, "appendable");
            Preconditions.checkNotNull(it2, "parts");
            while (it2.hasNext()) {
                Object next = it2.next();
                if (next != null) {
                    a.append(Joiner.this.c(next));
                    break;
                }
            }
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (next2 != null) {
                    a.append(Joiner.this.a);
                    a.append(Joiner.this.c(next2));
                }
            }
            return a;
        }

        @Override // com.google.common.base.Joiner
        public Joiner useForNull(String str) {
            throw new UnsupportedOperationException("already specified skipNulls");
        }

        @Override // com.google.common.base.Joiner
        public MapJoiner withKeyValueSeparator(String str) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
        }
    }

    public static class c extends AbstractList<Object> {
        public final /* synthetic */ Object[] a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ Object c;

        public c(Object[] objArr, Object obj, Object obj2) {
            this.a = objArr;
            this.b = obj;
            this.c = obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i) {
            if (i != 0) {
                return i != 1 ? this.a[i - 2] : this.c;
            }
            return this.b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.a.length + 2;
        }
    }

    public /* synthetic */ Joiner(Joiner joiner, a aVar) {
        this(joiner);
    }

    private static Iterable<Object> b(Object obj, Object obj2, Object[] objArr) {
        Preconditions.checkNotNull(objArr);
        return new c(objArr, obj, obj2);
    }

    public static Joiner on(String str) {
        return new Joiner(str);
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a2, Iterable<?> iterable) throws IOException {
        return (A) appendTo(a2, iterable.iterator());
    }

    public CharSequence c(Object obj) {
        Preconditions.checkNotNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final String join(Iterable<?> iterable) {
        return join(iterable.iterator());
    }

    public Joiner skipNulls() {
        return new b(this);
    }

    public Joiner useForNull(String str) {
        Preconditions.checkNotNull(str);
        return new a(this, str);
    }

    public MapJoiner withKeyValueSeparator(char c2) {
        return withKeyValueSeparator(String.valueOf(c2));
    }

    private Joiner(String str) {
        this.a = (String) Preconditions.checkNotNull(str);
    }

    public static Joiner on(char c2) {
        return new Joiner(String.valueOf(c2));
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a2, Iterator<?> it2) throws IOException {
        Preconditions.checkNotNull(a2);
        if (it2.hasNext()) {
            a2.append(c(it2.next()));
            while (it2.hasNext()) {
                a2.append(this.a);
                a2.append(c(it2.next()));
            }
        }
        return a2;
    }

    public final String join(Iterator<?> it2) {
        return appendTo(new StringBuilder(), it2).toString();
    }

    public MapJoiner withKeyValueSeparator(String str) {
        return new MapJoiner(this, str, null);
    }

    public final String join(Object[] objArr) {
        return join(Arrays.asList(objArr));
    }

    private Joiner(Joiner joiner) {
        this.a = joiner.a;
    }

    public final String join(@NullableDecl Object obj, @NullableDecl Object obj2, Object... objArr) {
        return join(b(obj, obj2, objArr));
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a2, Object[] objArr) throws IOException {
        return (A) appendTo(a2, Arrays.asList(objArr));
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a2, @NullableDecl Object obj, @NullableDecl Object obj2, Object... objArr) throws IOException {
        return (A) appendTo(a2, b(obj, obj2, objArr));
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, Iterable<?> iterable) {
        return appendTo(sb, iterable.iterator());
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, Iterator<?> it2) {
        try {
            appendTo(sb, it2);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, Object[] objArr) {
        return appendTo(sb, (Iterable<?>) Arrays.asList(objArr));
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, @NullableDecl Object obj, @NullableDecl Object obj2, Object... objArr) {
        return appendTo(sb, b(obj, obj2, objArr));
    }
}
