package com.xiaomi.fitness.sleep.disklrucache;

import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.statistics.StatConstants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sleep/disklrucache/StrictLineReader;", "Ljava/io/Closeable;", "in", "Ljava/io/InputStream;", "capacity", "", "charset", "Ljava/nio/charset/Charset;", "<init>", "(Ljava/io/InputStream;ILjava/nio/charset/Charset;)V", "(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V", "buf", "", "pos", StatConstants.PARAM_END, Constants.EXTRA_CLOSE_TAI, "", "readLine", "", "hasUnterminatedLine", "", "fillBuf", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStrictLineReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrictLineReader.kt\ncom/xiaomi/fitness/sleep/disklrucache/StrictLineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n1#2:174\n*E\n"})
public final class StrictLineReader implements Closeable {
    private static final byte CR = 13;
    private static final byte LF = 10;

    @Nullable
    private byte[] buf;

    @NotNull
    private final Charset charset;
    private int end;

    @NotNull
    private final InputStream in;
    private int pos;

    public StrictLineReader(@Nullable InputStream inputStream, int i, @Nullable Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0".toString());
        }
        if (!Intrinsics.areEqual(charset, Util.INSTANCE.getUS_ASCII())) {
            throw new IllegalArgumentException("Unsupported encoding".toString());
        }
        this.in = inputStream;
        this.charset = charset;
        this.buf = new byte[i];
    }

    private final void fillBuf() throws IOException {
        InputStream inputStream = this.in;
        byte[] bArr = this.buf;
        Intrinsics.checkNotNull(bArr);
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.pos = 0;
        this.end = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.in) {
            try {
                if (this.buf != null) {
                    this.buf = null;
                    this.in.close();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean hasUnterminatedLine() {
        return this.end == -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    @NotNull
    public final String readLine() throws IOException {
        int i;
        int i2;
        synchronized (this.in) {
            try {
                if (this.buf == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.pos >= this.end) {
                    fillBuf();
                }
                int i3 = this.end;
                for (int i4 = this.pos; i4 < i3; i4++) {
                    byte[] bArr = this.buf;
                    Intrinsics.checkNotNull(bArr);
                    if (bArr[i4] == 10) {
                        if (i4 != this.pos) {
                            byte[] bArr2 = this.buf;
                            Intrinsics.checkNotNull(bArr2);
                            i2 = i4 - 1;
                            if (bArr2[i2] != 13) {
                                i2 = i4;
                            }
                        } else {
                            i2 = i4;
                        }
                        byte[] bArr3 = this.buf;
                        Intrinsics.checkNotNull(bArr3);
                        int i5 = this.pos;
                        String str = new String(bArr3, i5, i2 - i5, this.charset.name());
                        this.pos = i4 + 1;
                        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
                        return str;
                    }
                }
                final int i6 = (this.end - this.pos) + 80;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i6) { // from class: com.xiaomi.fitness.sleep.disklrucache.StrictLineReader$readLine$1$out$1
                    @Override // java.io.ByteArrayOutputStream
                    public String toString() {
                        int i7 = ((ByteArrayOutputStream) this).count;
                        if (i7 > 0 && ((ByteArrayOutputStream) this).buf[i7 - 1] == 13) {
                            i7--;
                        }
                        try {
                            return new String(((ByteArrayOutputStream) this).buf, 0, i7, this.this$0.charset);
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1: while (true) {
                    byte[] bArr4 = this.buf;
                    int i7 = this.pos;
                    byteArrayOutputStream.write(bArr4, i7, this.end - i7);
                    this.end = -1;
                    fillBuf();
                    i = this.pos;
                    int i8 = this.end;
                    while (i < i8) {
                        byte[] bArr5 = this.buf;
                        Intrinsics.checkNotNull(bArr5);
                        if (bArr5[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                int i9 = this.pos;
                if (i != i9) {
                    byteArrayOutputStream.write(this.buf, i9, i - i9);
                }
                this.pos = i + 1;
                String string = byteArrayOutputStream.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public StrictLineReader(@Nullable InputStream inputStream, @Nullable Charset charset) {
        this(inputStream, 8192, charset);
    }
}
