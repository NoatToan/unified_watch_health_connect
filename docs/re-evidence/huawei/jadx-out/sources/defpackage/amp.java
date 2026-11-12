package defpackage;

import com.google.common.collect.AbstractMapBasedMultiset;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class amp<E> extends AbstractMapBasedMultiset<E> {
    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@CheckForNull Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedMultisetBridge
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public static <E> amp<E> e() {
        return b(3);
    }

    public static <E> amp<E> b(int i) {
        return new amp<>(i);
    }

    amp(int i) {
        super(i);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultiset
    public amt<E> newBackingMap(int i) {
        return new amy(i);
    }
}
