package defpackage;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class ane<E> extends ImmutableSet<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ane<Object> f595b;
    private static final Object[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final transient Object[] f596a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f597c;
    private final transient int d;
    private final transient int h;
    private final transient int j;

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayStart() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableSet
    public boolean isHashCodeFast() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    static {
        Object[] objArr = new Object[0];
        e = objArr;
        f595b = new ane<>(objArr, 0, objArr, 0, 0);
    }

    public ane(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f596a = objArr;
        this.d = i;
        this.f597c = objArr2;
        this.h = i2;
        this.j = i3;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.f597c;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iC = aly.c(obj);
        while (true) {
            int i = iC & this.h;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iC = i + 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.j;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return asList().iterator();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] internalArray() {
        return this.f596a;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayEnd() {
        return this.j;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        System.arraycopy(this.f596a, 0, objArr, i, this.j);
        return i + this.j;
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(this.f596a, this.j);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.d;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
