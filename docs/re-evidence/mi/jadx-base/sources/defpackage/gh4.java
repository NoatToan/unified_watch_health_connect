package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
public class gh4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList<Object> f18975a = new a();

    public class a extends ArrayList<Object> {
        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            throw new UnsupportedOperationException("ContainerUtil : Unsupported add operation on const empty list");
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<?> collection) {
            throw new UnsupportedOperationException("ContainerUtil : Unsupported addAll operation on const empty list");
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public void add(int i, Object obj) {
            throw new UnsupportedOperationException("ContainerUtil : Unsupported add by index operation on const empty list");
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public boolean addAll(int i, Collection<?> collection) {
            throw new UnsupportedOperationException("ContainerUtil : Unsupported addAll operation on const empty list");
        }
    }

    public static <T> int a(Collection<T> collection) {
        if (b(collection)) {
            return collection.size();
        }
        return 0;
    }

    public static <T> boolean b(Collection<T> collection) {
        return (collection == null || collection.isEmpty()) ? false : true;
    }

    public static boolean c(String str) {
        return str == null || str.length() == 0;
    }

    public static <T> boolean d(Collection<T> collection) {
        return !b(collection);
    }
}
