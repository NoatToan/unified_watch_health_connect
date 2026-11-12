package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class Closer implements Closeable {
    private static final Suppressor SUPPRESSING_SUPPRESSOR = new a();
    private final Deque<Closeable> stack = new ArrayDeque(4);

    @VisibleForTesting
    final Suppressor suppressor;
    private Throwable thrown;

    @VisibleForTesting
    public interface Suppressor {
        void suppress(Closeable closeable, Throwable th3, Throwable th4);
    }

    @VisibleForTesting
    public Closer(Suppressor suppressor) {
        this.suppressor = (Suppressor) Preconditions.checkNotNull(suppressor);
    }

    public static Closer create() {
        return new Closer(SUPPRESSING_SUPPRESSOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Closeable closeable, Throwable th3, Throwable th4) {
        if (th3 == th4) {
            return;
        }
        try {
            th3.addSuppressed(th4);
        } catch (Throwable unused) {
            Closeables.logger.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, th4);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws X {
        Throwable th3 = this.thrown;
        while (!this.stack.isEmpty()) {
            Closeable closeableRemoveFirst = this.stack.removeFirst();
            try {
                closeableRemoveFirst.close();
            } catch (Throwable th4) {
                if (th3 == null) {
                    th3 = th4;
                } else {
                    this.suppressor.suppress(closeableRemoveFirst, th3, th4);
                }
            }
        }
        if (this.thrown != null || th3 == null) {
            return;
        }
        Throwables.throwIfInstanceOf(th3, IOException.class);
        Throwables.throwIfUnchecked(th3);
        h.q(th3);
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public <C extends Closeable> C register(@ParametricNullness C c14) {
        if (c14 != null) {
            this.stack.addFirst(c14);
        }
        return c14;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public <X1 extends Exception, X2 extends Exception> RuntimeException rethrow(Throwable th3, Class<X1> cls, Class<X2> cls2) throws X {
        Preconditions.checkNotNull(th3);
        this.thrown = th3;
        Throwables.throwIfInstanceOf(th3, IOException.class);
        Throwables.throwIfInstanceOf(th3, cls);
        Throwables.throwIfInstanceOf(th3, cls2);
        Throwables.throwIfUnchecked(th3);
        throw new RuntimeException(th3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public <X extends Exception> RuntimeException rethrow(Throwable th3, Class<X> cls) throws X {
        Preconditions.checkNotNull(th3);
        this.thrown = th3;
        Throwables.throwIfInstanceOf(th3, IOException.class);
        Throwables.throwIfInstanceOf(th3, cls);
        Throwables.throwIfUnchecked(th3);
        throw new RuntimeException(th3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public RuntimeException rethrow(Throwable th3) throws X {
        Preconditions.checkNotNull(th3);
        this.thrown = th3;
        Throwables.throwIfInstanceOf(th3, IOException.class);
        Throwables.throwIfUnchecked(th3);
        throw new RuntimeException(th3);
    }
}
