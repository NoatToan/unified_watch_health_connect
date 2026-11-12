package org.apache.commons.io.input;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class TeeReader extends ProxyReader {
    private final Writer branch;
    private final boolean closeBranch;

    public TeeReader(Reader reader, Writer writer, boolean z14) {
        super(reader);
        this.branch = writer;
        this.closeBranch = z14;
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
        } finally {
            if (this.closeBranch) {
                this.branch.close();
            }
        }
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) throws IOException {
        int iPosition = charBuffer.position();
        int i14 = super.read(charBuffer);
        if (i14 == -1) {
            return i14;
        }
        int iPosition2 = charBuffer.position();
        int iLimit = charBuffer.limit();
        try {
            charBuffer.position(iPosition).limit(iPosition2);
            this.branch.append((CharSequence) charBuffer);
            return i14;
        } finally {
            charBuffer.position(iPosition2).limit(iLimit);
        }
    }

    public TeeReader(Reader reader, Writer writer) {
        this(reader, writer, false);
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.Reader
    public int read(char[] cArr) throws IOException {
        int i14 = super.read(cArr);
        if (i14 != -1) {
            this.branch.write(cArr, 0, i14);
        }
        return i14;
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i14, int i15) throws IOException {
        int i16 = super.read(cArr, i14, i15);
        if (i16 != -1) {
            this.branch.write(cArr, i14, i16);
        }
        return i16;
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        int i14 = super.read();
        if (i14 != -1) {
            this.branch.write(i14);
        }
        return i14;
    }
}
