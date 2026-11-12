package kotlin.sequences;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
final class a<T, K> extends AbstractIterator<T> {

    @NotNull
    private final Iterator<T> c;

    @NotNull
    private final Function1<T, K> d;

    @NotNull
    private final HashSet<K> e = new HashSet<>();

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull Iterator<? extends T> it2, @NotNull Function1<? super T, ? extends K> function1) {
        this.c = it2;
        this.d = function1;
    }

    @Override // kotlin.collections.AbstractIterator
    public void computeNext() {
        while (this.c.hasNext()) {
            T next = this.c.next();
            if (this.e.add(this.d.invoke(next))) {
                setNext(next);
                return;
            }
        }
        done();
    }
}
