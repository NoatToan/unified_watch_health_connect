package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public class Joiner {
    private final String separator;

    private Joiner(String str) {
        this.separator = (String) Preconditions.checkNotNull(str);
    }

    private static Iterable<Object> iterable(final Object obj, final Object obj2, final Object[] objArr) {
        Preconditions.checkNotNull(objArr);
        return new AbstractList<Object>() { // from class: com.google.common.base.Joiner.3
            @Override // java.util.AbstractList, java.util.List
            public Object get(int i14) {
                if (i14 != 0) {
                    return i14 != 1 ? objArr[i14 - 2] : obj2;
                }
                return obj;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return objArr.length + 2;
            }
        };
    }

    public static Joiner on(char c14) {
        return new Joiner(String.valueOf(c14));
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a14, Iterator<? extends Object> it) throws IOException {
        Preconditions.checkNotNull(a14);
        if (it.hasNext()) {
            a14.append(toString(it.next()));
            while (it.hasNext()) {
                a14.append(this.separator);
                a14.append(toString(it.next()));
            }
        }
        return a14;
    }

    public final String join(Iterator<? extends Object> it) {
        return appendTo(new StringBuilder(), it).toString();
    }

    public Joiner skipNulls() {
        return new Joiner(this) { // from class: com.google.common.base.Joiner.2
            @Override // com.google.common.base.Joiner
            public <A extends Appendable> A appendTo(A a14, Iterator<? extends Object> it) throws IOException {
                Preconditions.checkNotNull(a14, "appendable");
                Preconditions.checkNotNull(it, "parts");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        a14.append(Joiner.this.toString(next));
                        break;
                    }
                }
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (next2 != null) {
                        a14.append(Joiner.this.separator);
                        a14.append(Joiner.this.toString(next2));
                    }
                }
                return a14;
            }

            @Override // com.google.common.base.Joiner
            public Joiner useForNull(String str) {
                throw new UnsupportedOperationException("already specified skipNulls");
            }

            @Override // com.google.common.base.Joiner
            public MapJoiner withKeyValueSeparator(String str) {
                throw new UnsupportedOperationException("can't use .skipNulls() with maps");
            }
        };
    }

    public CharSequence toString(Object obj) {
        java.util.Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public Joiner useForNull(final String str) {
        Preconditions.checkNotNull(str);
        return new Joiner(this, this) { // from class: com.google.common.base.Joiner.1
            final /* synthetic */ Joiner this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.base.Joiner
            public Joiner skipNulls() {
                throw new UnsupportedOperationException("already specified useForNull");
            }

            @Override // com.google.common.base.Joiner
            public CharSequence toString(Object obj) {
                return obj == null ? str : this.this$0.toString(obj);
            }

            @Override // com.google.common.base.Joiner
            public Joiner useForNull(String str2) {
                throw new UnsupportedOperationException("already specified useForNull");
            }
        };
    }

    public MapJoiner withKeyValueSeparator(char c14) {
        return withKeyValueSeparator(String.valueOf(c14));
    }

    public MapJoiner withKeyValueSeparator(String str) {
        return new MapJoiner(str);
    }

    public static Joiner on(String str) {
        return new Joiner(str);
    }

    public static final class MapJoiner {
        private final Joiner joiner;
        private final String keyValueSeparator;

        private MapJoiner(Joiner joiner, String str) {
            this.joiner = joiner;
            this.keyValueSeparator = (String) Preconditions.checkNotNull(str);
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a14, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
            Preconditions.checkNotNull(a14);
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                a14.append(this.joiner.toString(next.getKey()));
                a14.append(this.keyValueSeparator);
                a14.append(this.joiner.toString(next.getValue()));
                while (it.hasNext()) {
                    a14.append(this.joiner.separator);
                    Map.Entry<?, ?> next2 = it.next();
                    a14.append(this.joiner.toString(next2.getKey()));
                    a14.append(this.keyValueSeparator);
                    a14.append(this.joiner.toString(next2.getValue()));
                }
            }
            return a14;
        }

        public String join(Iterator<? extends Map.Entry<?, ?>> it) {
            return appendTo(new StringBuilder(), it).toString();
        }

        public MapJoiner useForNull(String str) {
            return new MapJoiner(this.joiner.useForNull(str), this.keyValueSeparator);
        }

        public String join(Iterable<? extends Map.Entry<?, ?>> iterable) {
            return join(iterable.iterator());
        }

        public String join(Map<?, ?> map) {
            return join(map.entrySet());
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb3, Map<?, ?> map) {
            return appendTo(sb3, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a14, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return (A) appendTo(a14, iterable.iterator());
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a14, Map<?, ?> map) {
            return (A) appendTo(a14, map.entrySet());
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb3, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return appendTo(sb3, iterable.iterator());
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb3, Iterator<? extends Map.Entry<?, ?>> it) {
            try {
                appendTo(sb3, it);
                return sb3;
            } catch (IOException e4) {
                h.q(e4);
                return null;
            }
        }
    }

    private Joiner(Joiner joiner) {
        this.separator = joiner.separator;
    }

    public final String join(Iterable<? extends Object> iterable) {
        return join(iterable.iterator());
    }

    public final String join(Object[] objArr) {
        return join(Arrays.asList(objArr));
    }

    public final String join(Object obj, Object obj2, Object... objArr) {
        return join(iterable(obj, obj2, objArr));
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a14, Iterable<? extends Object> iterable) {
        return (A) appendTo(a14, iterable.iterator());
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a14, Object[] objArr) {
        return (A) appendTo(a14, Arrays.asList(objArr));
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a14, Object obj, Object obj2, Object... objArr) {
        return (A) appendTo(a14, iterable(obj, obj2, objArr));
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb3, Iterable<? extends Object> iterable) {
        return appendTo(sb3, iterable.iterator());
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb3, Iterator<? extends Object> it) {
        try {
            appendTo(sb3, it);
            return sb3;
        } catch (IOException e4) {
            h.q(e4);
            return null;
        }
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb3, Object[] objArr) {
        return appendTo(sb3, (Iterable<? extends Object>) Arrays.asList(objArr));
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb3, Object obj, Object obj2, Object... objArr) {
        return appendTo(sb3, iterable(obj, obj2, objArr));
    }
}
