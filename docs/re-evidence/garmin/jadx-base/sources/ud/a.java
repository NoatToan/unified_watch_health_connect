package ud;

import o13.o;

/* JADX INFO: loaded from: classes.dex */
public interface a extends AutoCloseable {
    default boolean D() {
        throw new o(this + " does not implement inTransaction().");
    }

    c M0(String str);
}
