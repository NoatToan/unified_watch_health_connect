package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedWriter;
import java.io.Writer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public abstract class CharSink {
    public Writer openBufferedStream() {
        Writer writerOpenStream = openStream();
        return writerOpenStream instanceof BufferedWriter ? (BufferedWriter) writerOpenStream : new BufferedWriter(writerOpenStream);
    }

    public abstract Writer openStream();

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public void write(CharSequence charSequence) throws X {
        Preconditions.checkNotNull(charSequence);
        Closer closerCreate = Closer.create();
        try {
            Writer writer = (Writer) closerCreate.register(openStream());
            writer.append(charSequence);
            writer.flush();
            closerCreate.close();
        } catch (Throwable th3) {
            try {
                throw closerCreate.rethrow(th3);
            } catch (Throwable th4) {
                closerCreate.close();
                throw th4;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @CanIgnoreReturnValue
    public long writeFrom(Readable readable) throws X {
        Preconditions.checkNotNull(readable);
        Closer closerCreate = Closer.create();
        try {
            Writer writer = (Writer) closerCreate.register(openStream());
            long jCopy = CharStreams.copy(readable, writer);
            writer.flush();
            closerCreate.close();
            return jCopy;
        } catch (Throwable th3) {
            try {
                throw closerCreate.rethrow(th3);
            } catch (Throwable th4) {
                closerCreate.close();
                throw th4;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public void writeLines(Iterable<? extends CharSequence> iterable, String str) throws X {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(str);
        Closer closerCreate = Closer.create();
        try {
            Writer writer = (Writer) closerCreate.register(openBufferedStream());
            Iterator<? extends CharSequence> it = iterable.iterator();
            while (it.hasNext()) {
                writer.append(it.next()).append((CharSequence) str);
            }
            writer.flush();
            closerCreate.close();
        } catch (Throwable th3) {
            try {
                throw closerCreate.rethrow(th3);
            } catch (Throwable th4) {
                closerCreate.close();
                throw th4;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public void writeLines(Iterable<? extends CharSequence> iterable) throws X {
        writeLines(iterable, System.getProperty("line.separator"));
    }
}
