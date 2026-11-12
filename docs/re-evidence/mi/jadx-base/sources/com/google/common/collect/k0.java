package com.google.common.collect;

import defpackage.c6i;
import defpackage.dua;
import defpackage.ich;
import defpackage.xhe;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public final class k0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9194a = new a("NEXT_LOWER", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f9195b = new C0235b("NEXT_HIGHER", 1);
        public static final b c = new c("INVERTED_INSERTION_INDEX", 2);
        public static final /* synthetic */ b[] d = a();

        public final enum a extends b {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.collect.k0.b
            public int b(int i) {
                return i - 1;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.k0$b$b, reason: collision with other inner class name */
        public final enum C0235b extends b {
            public C0235b(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.collect.k0.b
            public int b(int i) {
                return i;
            }
        }

        public final enum c extends b {
            public c(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.collect.k0.b
            public int b(int i) {
                return ~i;
            }
        }

        public b(String str, int i) {
            super(str, i);
        }

        public static /* synthetic */ b[] a() {
            return new b[]{f9194a, f9195b, c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }

        public abstract int b(int i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f9196a = new a("ANY_PRESENT", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f9197b = new b("LAST_PRESENT", 1);
        public static final c c = new C0236c("FIRST_PRESENT", 2);
        public static final c d = new d("FIRST_AFTER", 3);
        public static final c e = new e("LAST_BEFORE", 4);
        public static final /* synthetic */ c[] f = a();

        public final enum a extends c {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.collect.k0.c
            public <E> int b(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return i;
            }
        }

        public final enum b extends c {
            public b(String str, int i) {
                super(str, i);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.k0.c
            public <E> int b(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
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

        /* JADX INFO: renamed from: com.google.common.collect.k0$c$c, reason: collision with other inner class name */
        public final enum C0236c extends c {
            public C0236c(String str, int i) {
                super(str, i);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.k0.c
            public <E> int b(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
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

        public final enum d extends c {
            public d(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.collect.k0.c
            public <E> int b(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return c.f9197b.b(comparator, e, list, i) + 1;
            }
        }

        public final enum e extends c {
            public e(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.collect.k0.c
            public <E> int b(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return c.c.b(comparator, e, list, i) - 1;
            }
        }

        public c(String str, int i) {
            super(str, i);
        }

        public static /* synthetic */ c[] a() {
            return new c[]{f9196a, f9197b, c, d, e};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f.clone();
        }

        public abstract <E> int b(Comparator<? super E> comparator, E e2, List<? extends E> list, int i);
    }

    public static <E, K extends Comparable> int a(List<E> list, dua<? super E, K> duaVar, K k2, c cVar, b bVar) {
        c6i.o(k2);
        return b(list, duaVar, k2, ich.e(), cVar, bVar);
    }

    public static <E, K> int b(List<E> list, dua<? super E, K> duaVar, K k2, Comparator<? super K> comparator, c cVar, b bVar) {
        return c(xhe.l(list, duaVar), k2, comparator, cVar, bVar);
    }

    public static <E> int c(List<? extends E> list, E e, Comparator<? super E> comparator, c cVar, b bVar) {
        c6i.o(comparator);
        c6i.o(list);
        c6i.o(cVar);
        c6i.o(bVar);
        if (!(list instanceof RandomAccess)) {
            list = xhe.h(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int iCompare = comparator.compare(e, list.get(i2));
            if (iCompare < 0) {
                size = i2 - 1;
            } else {
                if (iCompare <= 0) {
                    return i + cVar.b(comparator, e, list.subList(i, size + 1), i2 - i);
                }
                i = i2 + 1;
            }
        }
        return bVar.b(i);
    }
}
