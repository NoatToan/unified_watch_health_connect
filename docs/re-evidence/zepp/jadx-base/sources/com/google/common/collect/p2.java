package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtCompatible
final class p2 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b INVERTED_INSERTION_INDEX;
        public static final b NEXT_HIGHER;
        public static final b NEXT_LOWER;

        public static enum a extends b {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.collect.p2.b
            public int a(int i) {
                return i - 1;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.p2$b$b, reason: collision with other inner class name */
        public static enum C0199b extends b {
            public C0199b(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.collect.p2.b
            public int a(int i) {
                return i;
            }
        }

        public static enum c extends b {
            public c(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.collect.p2.b
            public int a(int i) {
                return ~i;
            }
        }

        static {
            a aVar = new a("NEXT_LOWER", 0);
            NEXT_LOWER = aVar;
            C0199b c0199b = new C0199b("NEXT_HIGHER", 1);
            NEXT_HIGHER = c0199b;
            c cVar = new c("INVERTED_INSERTION_INDEX", 2);
            INVERTED_INSERTION_INDEX = cVar;
            $VALUES = new b[]{aVar, c0199b, cVar};
        }

        private b(String str, int i) {
            super(str, i);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public abstract int a(int i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c ANY_PRESENT;
        public static final c FIRST_AFTER;
        public static final c FIRST_PRESENT;
        public static final c LAST_BEFORE;
        public static final c LAST_PRESENT;

        public static enum a extends c {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.collect.p2.c
            public <E> int a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return i;
            }
        }

        public static enum b extends c {
            public b(String str, int i) {
                super(str, i);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.p2.c
            public <E> int a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                int size = list.size() - 1;
                while (i < size) {
                    int i2 = ((i + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i2), e) > 0) {
                        size = i2 - 1;
                    } else {
                        i = i2;
                    }
                }
                return i;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.p2$c$c, reason: collision with other inner class name */
        public static enum C0200c extends c {
            public C0200c(String str, int i) {
                super(str, i);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.p2.c
            public <E> int a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                int i2 = 0;
                while (i2 < i) {
                    int i3 = (i2 + i) >>> 1;
                    if (comparator.compare(list.get(i3), e) < 0) {
                        i2 = i3 + 1;
                    } else {
                        i = i3;
                    }
                }
                return i2;
            }
        }

        public static enum d extends c {
            public d(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.collect.p2.c
            public <E> int a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return c.LAST_PRESENT.a(comparator, e, list, i) + 1;
            }
        }

        public static enum e extends c {
            public e(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.collect.p2.c
            public <E> int a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return c.FIRST_PRESENT.a(comparator, e, list, i) - 1;
            }
        }

        static {
            a aVar = new a("ANY_PRESENT", 0);
            ANY_PRESENT = aVar;
            b bVar = new b("LAST_PRESENT", 1);
            LAST_PRESENT = bVar;
            C0200c c0200c = new C0200c("FIRST_PRESENT", 2);
            FIRST_PRESENT = c0200c;
            d dVar = new d("FIRST_AFTER", 3);
            FIRST_AFTER = dVar;
            e eVar = new e("LAST_BEFORE", 4);
            LAST_BEFORE = eVar;
            $VALUES = new c[]{aVar, bVar, c0200c, dVar, eVar};
        }

        private c(String str, int i) {
            super(str, i);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public abstract <E> int a(Comparator<? super E> comparator, E e2, List<? extends E> list, int i);
    }

    private p2() {
    }

    public static <E, K extends Comparable> int a(List<E> list, Function<? super E, K> function, @NullableDecl K k, c cVar, b bVar) {
        return b(list, function, k, Ordering.natural(), cVar, bVar);
    }

    public static <E, K> int b(List<E> list, Function<? super E, K> function, @NullableDecl K k, Comparator<? super K> comparator, c cVar, b bVar) {
        return d(Lists.transform(list, function), k, comparator, cVar, bVar);
    }

    public static <E extends Comparable> int c(List<? extends E> list, E e, c cVar, b bVar) {
        Preconditions.checkNotNull(e);
        return d(list, e, Ordering.natural(), cVar, bVar);
    }

    public static <E> int d(List<? extends E> list, @NullableDecl E e, Comparator<? super E> comparator, c cVar, b bVar) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(cVar);
        Preconditions.checkNotNull(bVar);
        if (!(list instanceof RandomAccess)) {
            list = Lists.newArrayList(list);
        }
        int i = 0;
        int size = list.size() - 1;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int iCompare = comparator.compare(e, list.get(i2));
            if (iCompare < 0) {
                size = i2 - 1;
            } else {
                if (iCompare <= 0) {
                    return i + cVar.a(comparator, e, list.subList(i, size + 1), i2 - i);
                }
                i = i2 + 1;
            }
        }
        return bVar.a(i);
    }
}
