package defpackage;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class ann {
    public static int e(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    public static <K, V> void c(Map<K, V> map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void e(Map<K, V> map, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static <E> void b(Multiset<E> multiset, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(multiset.entrySet().size());
        for (Multiset.Entry<E> entry : multiset.entrySet()) {
            objectOutputStream.writeObject(entry.getElement());
            objectOutputStream.writeInt(entry.getCount());
        }
    }

    public static <E> void d(Multiset<E> multiset, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        a(multiset, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> void a(Multiset<E> multiset, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            multiset.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    static <K, V> void e(Multimap<K, V> multimap, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(multimap.asMap().size());
        for (Map.Entry<K, Collection<V>> entry : multimap.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> void d(Multimap<K, V> multimap, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collection = multimap.get(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    public static <T> a<T> a(Class<T> cls, String str) {
        try {
            return new a<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public static final class a<T> {
        private final Field d;

        private a(Field field) {
            this.d = field;
            field.setAccessible(true);
        }

        public void d(T t, Object obj) {
            try {
                this.d.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        void c(T t, int i) {
            try {
                this.d.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }
}
