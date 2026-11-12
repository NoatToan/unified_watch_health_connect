package org.apache.commons.io.function;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes46.dex */
final class UncheckedIOIterator<E> implements Iterator<E> {
    private final IOIterator<E> delegate;

    UncheckedIOIterator(IOIterator<E> iOIterator) {
        this.delegate = (IOIterator) Objects.requireNonNull(iOIterator, "delegate");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        final IOIterator<E> iOIterator = this.delegate;
        Objects.requireNonNull(iOIterator);
        return ((Boolean) Uncheck.get(new IOSupplier() { // from class: org.apache.commons.io.function.UncheckedIOIterator$$ExternalSyntheticLambda2
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                return Boolean.valueOf(iOIterator.hasNext());
            }
        })).booleanValue();
    }

    @Override // java.util.Iterator
    public E next() {
        final IOIterator<E> iOIterator = this.delegate;
        Objects.requireNonNull(iOIterator);
        return (E) Uncheck.get(new IOSupplier() { // from class: org.apache.commons.io.function.UncheckedIOIterator$$ExternalSyntheticLambda0
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                return iOIterator.next();
            }
        });
    }

    @Override // java.util.Iterator
    public void remove() {
        final IOIterator<E> iOIterator = this.delegate;
        Objects.requireNonNull(iOIterator);
        Uncheck.run(new IORunnable() { // from class: org.apache.commons.io.function.UncheckedIOIterator$$ExternalSyntheticLambda1
            @Override // org.apache.commons.io.function.IORunnable
            public final void run() throws IOException {
                iOIterator.remove();
            }
        });
    }
}
