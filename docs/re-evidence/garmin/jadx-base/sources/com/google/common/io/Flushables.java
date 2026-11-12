package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.Flushable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class Flushables {
    private static final Logger logger = Logger.getLogger(Flushables.class.getName());

    private Flushables() {
    }

    public static void flush(Flushable flushable, boolean z14) throws IOException {
        try {
            flushable.flush();
        } catch (IOException e4) {
            if (!z14) {
                throw e4;
            }
            logger.log(Level.WARNING, "IOException thrown while flushing Flushable.", (Throwable) e4);
        }
    }

    @Beta
    public static void flushQuietly(Flushable flushable) {
        try {
            flush(flushable, true);
        } catch (IOException e4) {
            logger.log(Level.SEVERE, "IOException should not have been thrown.", (Throwable) e4);
        }
    }
}
