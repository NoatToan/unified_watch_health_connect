package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.LinkedList;
import java.util.Queue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
public final class LineReader {
    private final Readable a;

    @NullableDecl
    private final Reader b;
    private final CharBuffer c;
    private final char[] d;
    private final Queue<String> e;
    private final c f;

    public class a extends c {
        public a() {
        }

        @Override // com.google.common.io.c
        public void d(String str, String str2) {
            LineReader.this.e.add(str);
        }
    }

    public LineReader(Readable readable) {
        CharBuffer charBufferC = CharStreams.c();
        this.c = charBufferC;
        this.d = charBufferC.array();
        this.e = new LinkedList();
        this.f = new a();
        this.a = (Readable) Preconditions.checkNotNull(readable);
        this.b = readable instanceof Reader ? (Reader) readable : null;
    }

    @CanIgnoreReturnValue
    public String readLine() throws IOException {
        int i;
        while (this.e.peek() == null) {
            this.c.clear();
            Reader reader = this.b;
            if (reader != null) {
                char[] cArr = this.d;
                i = reader.read(cArr, 0, cArr.length);
            } else {
                i = this.a.read(this.c);
            }
            if (i == -1) {
                this.f.b();
                break;
            }
            this.f.a(this.d, 0, i);
        }
        return this.e.poll();
    }
}
