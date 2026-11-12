package com.google.common.io;

import com.google.common.base.Preconditions;
import defpackage.apc;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class CharSink {
    public abstract Writer openStream() throws IOException;

    protected CharSink() {
    }

    public Writer openBufferedStream() throws IOException {
        Writer writerOpenStream = openStream();
        if (writerOpenStream instanceof BufferedWriter) {
            return (BufferedWriter) writerOpenStream;
        }
        return new BufferedWriter(writerOpenStream);
    }

    public void write(CharSequence charSequence) throws Throwable {
        Preconditions.checkNotNull(charSequence);
        Closer closerB = Closer.b();
        try {
            Writer writer = (Writer) closerB.b(openStream());
            writer.append(charSequence);
            writer.flush();
            closerB.close();
        } catch (Throwable th) {
            try {
                throw closerB.e(th);
            } catch (Throwable th2) {
                closerB.close();
                throw th2;
            }
        }
    }

    public void writeLines(Iterable<? extends CharSequence> iterable) throws Throwable {
        writeLines(iterable, System.getProperty("line.separator"));
    }

    public void writeLines(Iterable<? extends CharSequence> iterable, String str) throws Throwable {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(str);
        Closer closerB = Closer.b();
        try {
            Writer writer = (Writer) closerB.b(openBufferedStream());
            Iterator<? extends CharSequence> it = iterable.iterator();
            while (it.hasNext()) {
                writer.append(it.next()).append((CharSequence) str);
            }
            writer.flush();
            closerB.close();
        } catch (Throwable th) {
            try {
                throw closerB.e(th);
            } catch (Throwable th2) {
                closerB.close();
                throw th2;
            }
        }
    }

    public long writeFrom(Readable readable) throws Throwable {
        Preconditions.checkNotNull(readable);
        Closer closerB = Closer.b();
        try {
            Writer writer = (Writer) closerB.b(openStream());
            long jD = apc.d(readable, writer);
            writer.flush();
            closerB.close();
            return jD;
        } catch (Throwable th) {
            try {
                throw closerB.e(th);
            } catch (Throwable th2) {
                closerB.close();
                throw th2;
            }
        }
    }
}
