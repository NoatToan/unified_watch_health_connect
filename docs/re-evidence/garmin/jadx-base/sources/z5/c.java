package z5;

import ch.qos.logback.core.CoreConstants;
import d53.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.i;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u001d\b\u0016\u0012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\n\"\u00020\u0002¢\u0006\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lz5/c;", "", "Lz5/b;", "", "localeList", "<init>", "(Ljava/util/List;)V", "", "languageTags", "(Ljava/lang/String;)V", "", "locales", "([Lz5/b;)V", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements Collection<b>, f23.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f202441c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f202442d = new c(j0.f134944a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f202443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f202444b;

    public c(String str) {
        List listW = w.W(str, new String[]{","});
        ArrayList arrayList = new ArrayList(listW.size());
        int size = listW.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(w.i0((String) listW.get(i14)).toString());
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i15 = 0; i15 < size2; i15++) {
            arrayList2.add(new b((String) arrayList.get(i15)));
        }
        this(arrayList2);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f202443a.contains((b) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.f202443a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return s.g(this.f202443a, ((c) obj).f202443a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f202443a.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f202443a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<b> iterator() {
        return this.f202443a.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super b> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f202444b;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return i.c(this);
    }

    public final String toString() {
        return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f202443a, new StringBuilder("LocaleList(localeList="));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz5/c$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) i.d(this, tArr);
    }

    public c(List<b> list) {
        this.f202443a = list;
        this.f202444b = list.size();
    }

    public c(b... bVarArr) {
        this((List<b>) u.i0(bVarArr));
    }
}
