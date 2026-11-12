package cn.hutool.core.lang;

import cn.hutool.core.collection.ArrayIter;
import defpackage.hhe;
import defpackage.qj1;
import defpackage.s14;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* JADX INFO: loaded from: classes.dex */
public class Tuple extends s14<Tuple> implements Iterable<Object>, Serializable {
    private static final long serialVersionUID = -7689304393482182157L;
    private boolean cacheHash;
    private int hashCode;
    private final Object[] members;

    public Tuple(Object... objArr) {
        this.members = objArr;
    }

    public boolean contains(Object obj) {
        return qj1.o(this.members, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.deepEquals(this.members, ((Tuple) obj).members);
        }
        return false;
    }

    public <T> T get(int i) {
        return (T) this.members[i];
    }

    public Object[] getMembers() {
        return this.members;
    }

    public int hashCode() {
        int i;
        if (this.cacheHash && (i = this.hashCode) != 0) {
            return i;
        }
        int iDeepHashCode = 31 + Arrays.deepHashCode(this.members);
        if (this.cacheHash) {
            this.hashCode = iDeepHashCode;
        }
        return iDeepHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return new ArrayIter(this.members);
    }

    public final Stream<Object> parallelStream() {
        return StreamSupport.stream(spliterator(), true);
    }

    public Tuple setCacheHash(boolean z) {
        this.cacheHash = z;
        return this;
    }

    public int size() {
        return this.members.length;
    }

    @Override // java.lang.Iterable
    public final Spliterator<Object> spliterator() {
        return Spliterators.spliterator(this.members, 16);
    }

    public final Stream<Object> stream() {
        return Arrays.stream(this.members);
    }

    public final Tuple sub(int i, int i2) {
        return new Tuple(qj1.O(this.members, i, i2));
    }

    public final List<Object> toList() {
        return hhe.k(this.members);
    }

    public String toString() {
        return Arrays.toString(this.members);
    }
}
