package com.google.common.collect;

import defpackage.nag;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 {

    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f9178a;

        public void a(T t, int i) {
            try {
                this.f9178a.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        public void b(T t, Object obj) {
            try {
                this.f9178a.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        public b(Field field) {
            this.f9178a = field;
            field.setAccessible(true);
        }
    }

    public static <T> b<T> a(Class<T> cls, String str) {
        try {
            return new b<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public static <K, V> void b(Map<K, V> map, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        c(map, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void c(Map<K, V> map, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static <K, V> void d(nag<K, V> nagVar, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        e(nagVar, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void e(nag<K, V> nagVar, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collection = nagVar.get(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    public static <E> void f(u<E> uVar, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        g(uVar, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> void g(u<E> uVar, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            uVar.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    public static int h(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    public static <K, V> void i(Map<K, V> map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public static <K, V> void j(nag<K, V> nagVar, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(nagVar.asMap().size());
        for (Map.Entry<K, Collection<V>> entry : nagVar.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static <E> void k(u<E> uVar, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(uVar.entrySet().size());
        for (u.a<E> aVar : uVar.entrySet()) {
            objectOutputStream.writeObject(aVar.getElement());
            objectOutputStream.writeInt(aVar.getCount());
        }
    }
}
