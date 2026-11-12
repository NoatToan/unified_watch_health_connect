package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class wem<E> extends ImmutableSet<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient E f37903a;

    public wem(E e) {
        this.f37903a = (E) c6i.o(e);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        return ImmutableList.of((Object) this.f37903a);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f37903a.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        objArr[i] = this.f37903a;
        return i + 1;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f37903a.hashCode();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String string = this.f37903a.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(string);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public uaq<E> iterator() {
        return epd.t(this.f37903a);
    }
}
