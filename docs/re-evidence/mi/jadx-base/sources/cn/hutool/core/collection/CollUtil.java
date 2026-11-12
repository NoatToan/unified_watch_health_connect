package cn.hutool.core.collection;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.convert.ConverterRegistry;
import cn.hutool.core.exceptions.UtilException;
import defpackage.apd;
import defpackage.b8f;
import defpackage.bbk;
import defpackage.hhe;
import defpackage.i04;
import defpackage.i5q;
import defpackage.qj1;
import defpackage.t94;
import defpackage.tt3;
import defpackage.yj4;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class CollUtil {

    @FunctionalInterface
    public interface Consumer<T> extends Serializable {
        void accept(T t, int i);
    }

    @FunctionalInterface
    public interface KVConsumer<K, V> extends Serializable {
        void accept(K k2, V v, int i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Collection<T> b(Collection<T> collection, Object obj, Type type) {
        Iterator<String> it;
        Iterator<String> arrayIter;
        if (collection != 0 && obj != null) {
            if (i5q.r(type)) {
                type = Object.class;
            }
            if (obj instanceof Iterator) {
                it = (Iterator) obj;
            } else if (obj instanceof Iterable) {
                it = ((Iterable) obj).iterator();
            } else {
                if (obj instanceof Enumeration) {
                    arrayIter = new EnumerationIter<>((Enumeration) obj);
                } else if (qj1.B(obj)) {
                    arrayIter = new ArrayIter<>(obj);
                } else {
                    it = obj instanceof CharSequence ? tt3.d0(tt3.w0((CharSequence) obj, AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST), ',').iterator() : p(obj).iterator();
                }
                it = arrayIter;
            }
            ConverterRegistry converterRegistry = ConverterRegistry.getInstance();
            while (it.hasNext()) {
                collection.add(converterRegistry.convert(type, it.next()));
            }
        }
        return collection;
    }

    public static boolean c(Collection<?> collection, Object obj) {
        return j(collection) && collection.contains(obj);
    }

    public static <T> Collection<T> d(Class<?> cls) {
        if (cls.isAssignableFrom(AbstractCollection.class)) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new LinkedHashSet();
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new TreeSet(new Comparator() { // from class: v34
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return CollUtil.l(obj, obj2);
                }
            });
        }
        if (cls.isAssignableFrom(EnumSet.class)) {
            return EnumSet.noneOf(i04.n(cls));
        }
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(LinkedList.class)) {
            return new LinkedList();
        }
        try {
            return (Collection) bbk.t(cls, new Object[0]);
        } catch (Exception e) {
            Class<? super Object> superclass = cls.getSuperclass();
            if (superclass == null || cls == superclass) {
                throw new UtilException(e);
            }
            return d(superclass);
        }
    }

    public static <T> T e(Collection<T> collection, int i) {
        int size;
        if (collection == null || (size = collection.size()) == 0) {
            return null;
        }
        if (i < 0) {
            i += size;
        }
        if (i < size && i >= 0) {
            if (collection instanceof List) {
                return (T) ((List) collection).get(i);
            }
            int i2 = 0;
            for (T t : collection) {
                if (i2 > i) {
                    break;
                }
                if (i2 == i) {
                    return t;
                }
                i2++;
            }
        }
        return null;
    }

    public static <T> List<T> f(Collection<T> collection, int... iArr) {
        int size = collection.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (collection instanceof List) {
            List list = (List) collection;
            int length = iArr.length;
            while (i < length) {
                int i2 = iArr[i];
                if (i2 < 0) {
                    i2 += size;
                }
                arrayList.add(list.get(i2));
                i++;
            }
        } else {
            Object[] array = collection.toArray();
            int length2 = iArr.length;
            while (i < length2) {
                int i3 = iArr[i];
                if (i3 < 0) {
                    i3 += size;
                }
                arrayList.add(array[i3]);
                i++;
            }
        }
        return arrayList;
    }

    public static <T> int[] g(Collection<T> collection, b8f<T> b8fVar) {
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            int i = 0;
            for (T t : collection) {
                if (b8fVar == null || b8fVar.a(t)) {
                    arrayList.add(Integer.valueOf(i));
                }
                i++;
            }
        }
        return (int[]) yj4.a(int[].class, arrayList);
    }

    public static boolean h(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean i(Iterable<?> iterable) {
        return apd.a(iterable);
    }

    public static boolean j(Collection<?> collection) {
        return !h(collection);
    }

    public static <T> String k(Iterable<T> iterable, CharSequence charSequence) {
        if (iterable == null) {
            return null;
        }
        return apd.c(iterable.iterator(), charSequence);
    }

    public static /* synthetic */ int l(Object obj, Object obj2) {
        return obj instanceof Comparable ? ((Comparable) obj).compareTo(obj2) : t94.a(obj.toString(), obj2.toString());
    }

    public static <T, R> List<R> m(Iterable<T> iterable, Function<? super T, ? extends R> function, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (iterable == null) {
            return arrayList;
        }
        for (T t : iterable) {
            if (t != null || !z) {
                R rApply = function.apply(t);
                if (rApply != null || !z) {
                    arrayList.add(rApply);
                }
            }
        }
        return arrayList;
    }

    public static <T> ArrayList<T> n(Collection<T> collection) {
        return hhe.i(collection);
    }

    public static <T> ArrayList<T> o(Iterator<T> it) {
        return hhe.j(it);
    }

    @SafeVarargs
    public static <T> ArrayList<T> p(T... tArr) {
        return hhe.k(tArr);
    }

    @SafeVarargs
    public static <T> HashSet<T> q(T... tArr) {
        return r(false, tArr);
    }

    @SafeVarargs
    public static <T> HashSet<T> r(boolean z, T... tArr) {
        if (tArr == null) {
            return z ? new LinkedHashSet() : new HashSet<>();
        }
        int iMax = Math.max(((int) (tArr.length / 0.75f)) + 1, 16);
        HashSet<T> linkedHashSet = z ? new LinkedHashSet<>(iMax) : new HashSet<>(iMax);
        Collections.addAll(linkedHashSet, tArr);
        return linkedHashSet;
    }

    public static <T> List<T> s(List<T> list, int i, T t) {
        return hhe.g(list, i, t);
    }

    public static <T> List<T> t(Collection<T> collection, int i, int i2, int i3) {
        return (collection == null || collection.isEmpty()) ? hhe.a() : u(new ArrayList(collection), i, i2, i3);
    }

    public static <T> List<T> u(List<T> list, int i, int i2, int i3) {
        return hhe.h(list, i, i2, i3);
    }

    @SafeVarargs
    public static <T> ArrayList<T> v(T... tArr) {
        return hhe.k(tArr);
    }
}
