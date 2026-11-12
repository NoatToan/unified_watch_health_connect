package kotlin.io;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class LineReader {
    private static final int a = 32;
    private static CharsetDecoder b;
    private static boolean c;

    @NotNull
    private static final byte[] d;

    @NotNull
    private static final char[] e;

    @NotNull
    private static final ByteBuffer f;

    @NotNull
    private static final CharBuffer g;

    @NotNull
    public static final LineReader INSTANCE = new LineReader();

    @NotNull
    private static final StringBuilder h = new StringBuilder();

    static {
        byte[] bArr = new byte[32];
        d = bArr;
        char[] cArr = new char[32];
        e = cArr;
        f = ByteBuffer.wrap(bArr);
        g = CharBuffer.wrap(cArr);
    }

    private LineReader() {
    }

    private final int a() {
        ByteBuffer byteBuffer = f;
        byteBuffer.compact();
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        return iPosition;
    }

    private final int b(boolean z) throws CharacterCodingException {
        while (true) {
            CharsetDecoder charsetDecoder = b;
            if (charsetDecoder == null) {
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = f;
            CharBuffer charBuffer = g;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z);
            if (coderResultDecode.isError()) {
                d();
                coderResultDecode.throwException();
            }
            int iPosition = charBuffer.position();
            if (!coderResultDecode.isOverflow()) {
                return iPosition;
            }
            StringBuilder sb = h;
            char[] cArr = e;
            int i = iPosition - 1;
            sb.append(cArr, 0, i);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i]);
        }
    }

    private final int c(int i, int i2) throws CharacterCodingException {
        ByteBuffer byteBuffer = f;
        byteBuffer.limit(i);
        g.position(i2);
        int iB = b(true);
        CharsetDecoder charsetDecoder = b;
        if (charsetDecoder == null) {
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return iB;
    }

    private final void d() {
        CharsetDecoder charsetDecoder = b;
        if (charsetDecoder == null) {
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        f.position(0);
        h.setLength(0);
    }

    private final void e() {
        StringBuilder sb = h;
        sb.setLength(32);
        sb.trimToSize();
    }

    private final void f(Charset charset) {
        b = charset.newDecoder();
        ByteBuffer byteBuffer = f;
        byteBuffer.clear();
        CharBuffer charBuffer = g;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = b;
        if (charsetDecoder == null) {
            charsetDecoder = null;
        }
        boolean z = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == '\n') {
            z = true;
        }
        c = z;
        d();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013 A[Catch: all -> 0x00b5, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0009, B:11:0x0019, B:13:0x0025, B:22:0x0038, B:36:0x006d, B:38:0x0075, B:40:0x0079, B:42:0x0081, B:43:0x0083, B:48:0x008f, B:51:0x0098, B:53:0x00a7, B:54:0x00aa, B:23:0x003d, B:26:0x0048, B:30:0x004f, B:32:0x005f, B:34:0x0067, B:57:0x00af, B:9:0x0013), top: B:62:0x0001 }] */
    @Nullable
    public final synchronized String readLine(@NotNull InputStream inputStream, @NotNull Charset charset) {
        boolean z;
        int iC;
        CharsetDecoder charsetDecoder = b;
        if (charsetDecoder == null) {
            f(charset);
        } else {
            if (charsetDecoder == null) {
                charsetDecoder = null;
            }
            if (!Intrinsics.areEqual(charsetDecoder.charset(), charset)) {
                f(charset);
            }
        }
        int iA = 0;
        int iB = 0;
        while (true) {
            int i = inputStream.read();
            z = true;
            if (i == -1) {
                if (!(h.length() == 0) || iA != 0 || iB != 0) {
                    iC = c(iA, iB);
                    break;
                }
                return null;
            }
            int i2 = iA + 1;
            d[iA] = (byte) i;
            if (i == 10 || i2 == 32 || !c) {
                ByteBuffer byteBuffer = f;
                byteBuffer.limit(i2);
                g.position(iB);
                iB = b(false);
                if (iB > 0 && e[iB - 1] == '\n') {
                    byteBuffer.position(0);
                    iC = iB;
                    break;
                }
                iA = a();
            } else {
                iA = i2;
            }
        }
        if (iC > 0) {
            char[] cArr = e;
            if (cArr[iC - 1] == '\n' && (iC = iC - 1) > 0 && cArr[iC - 1] == '\r') {
                iC--;
            }
        }
        StringBuilder sb = h;
        if (sb.length() != 0) {
            z = false;
        }
        if (z) {
            return new String(e, 0, iC);
        }
        sb.append(e, 0, iC);
        String string = sb.toString();
        if (sb.length() > 32) {
            e();
        }
        sb.setLength(0);
        return string;
    }
}
