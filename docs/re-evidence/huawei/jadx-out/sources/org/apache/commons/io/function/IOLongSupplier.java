package org.apache.commons.io.function;

import java.io.IOException;
import java.util.function.LongSupplier;

/* JADX INFO: loaded from: classes46.dex */
@FunctionalInterface
public interface IOLongSupplier {
    long getAsLong() throws IOException;

    default LongSupplier asSupplier() {
        return new LongSupplier() { // from class: org.apache.commons.io.function.IOLongSupplier$$ExternalSyntheticLambda0
            @Override // java.util.function.LongSupplier
            public final long getAsLong() {
                return Uncheck.getAsLong(this.f$0);
            }
        };
    }
}
