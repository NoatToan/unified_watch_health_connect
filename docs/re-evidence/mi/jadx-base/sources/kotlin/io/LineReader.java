package kotlin.io;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
public final class LineReader {
    private static final int BUFFER_SIZE = 32;

    @NotNull
    public static final LineReader INSTANCE = new LineReader();

    @NotNull
    private static final ByteBuffer byteBuf;

    @NotNull
    private static final byte[] bytes;

    @NotNull
    private static final CharBuffer charBuf;

    @NotNull
    private static final char[] chars;
    private static CharsetDecoder decoder;
    private static boolean directEOL;

    @NotNull
    private static final StringBuilder sb;

    static {
        byte[] bArr = new byte[32];
        bytes = bArr;
        char[] cArr = new char[32];
        chars = cArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(...)");
        byteBuf = byteBufferWrap;
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr);
        Intrinsics.checkNotNullExpressionValue(charBufferWrap, "wrap(...)");
        charBuf = charBufferWrap;
        sb = new StringBuilder();
    }

    private LineReader() {
    }

    private final int compactBytes() {
        ByteBuffer byteBuffer = byteBuf;
        byteBuffer.compact();
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        return iPosition;
    }

    private final int decode(boolean z) throws CharacterCodingException {
        while (true) {
            CharsetDecoder charsetDecoder = decoder;
            if (charsetDecoder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("decoder");
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = byteBuf;
            CharBuffer charBuffer = charBuf;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z);
            Intrinsics.checkNotNullExpressionValue(coderResultDecode, "decode(...)");
            if (coderResultDecode.isError()) {
                resetAll();
                coderResultDecode.throwException();
            }
            int iPosition = charBuffer.position();
            if (!coderResultDecode.isOverflow()) {
                return iPosition;
            }
            StringBuilder sb2 = sb;
            char[] cArr = chars;
            int i = iPosition - 1;
            sb2.append(cArr, 0, i);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i]);
        }
    }

    private final int decodeEndOfInput(int i, int i2) throws CharacterCodingException {
        ByteBuffer byteBuffer = byteBuf;
        byteBuffer.limit(i);
        charBuf.position(i2);
        int iDecode = decode(true);
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return iDecode;
    }

    private final void resetAll() {
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuf.position(0);
        sb.setLength(0);
    }

    private final void trimStringBuilder() {
        StringBuilder sb2 = sb;
        sb2.setLength(32);
        sb2.trimToSize();
    }

    private final void updateCharset(Charset charset) {
        decoder = charset.newDecoder();
        ByteBuffer byteBuffer = byteBuf;
        byteBuffer.clear();
        CharBuffer charBuffer = charBuf;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        boolean z = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == '\n') {
            z = true;
        }
        directEOL = z;
        resetAll();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0001, B:6:0x0012, B:9:0x001c, B:13:0x002c, B:15:0x0037, B:21:0x0045, B:35:0x007a, B:37:0x0082, B:39:0x0086, B:41:0x008e, B:43:0x0092, B:45:0x009a, B:48:0x00a3, B:50:0x00b7, B:51:0x00ba, B:22:0x004a, B:25:0x0055, B:29:0x005c, B:31:0x006c, B:33:0x0074, B:54:0x00bf, B:11:0x0026), top: B:58:0x0001 }] */
    @Nullable
    public final synchronized String readLine(@NotNull InputStream inputStream, @NotNull Charset charset) {
        int iDecodeEndOfInput;
        try {
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            Intrinsics.checkNotNullParameter(charset, "charset");
            CharsetDecoder charsetDecoder = decoder;
            if (charsetDecoder == null) {
                updateCharset(charset);
            } else {
                if (charsetDecoder == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("decoder");
                    charsetDecoder = null;
                }
                if (!Intrinsics.areEqual(charsetDecoder.charset(), charset)) {
                    updateCharset(charset);
                }
            }
            int iCompactBytes = 0;
            int iDecode = 0;
            while (true) {
                int i = inputStream.read();
                if (i == -1) {
                    if (sb.length() != 0 || iCompactBytes != 0 || iDecode != 0) {
                        iDecodeEndOfInput = decodeEndOfInput(iCompactBytes, iDecode);
                        break;
                    }
                    return null;
                }
                int i2 = iCompactBytes + 1;
                bytes[iCompactBytes] = (byte) i;
                if (i == 10 || i2 == 32 || !directEOL) {
                    ByteBuffer byteBuffer = byteBuf;
                    byteBuffer.limit(i2);
                    charBuf.position(iDecode);
                    iDecode = decode(false);
                    if (iDecode > 0 && chars[iDecode - 1] == '\n') {
                        byteBuffer.position(0);
                        iDecodeEndOfInput = iDecode;
                        break;
                    }
                    iCompactBytes = compactBytes();
                } else {
                    iCompactBytes = i2;
                }
            }
            if (iDecodeEndOfInput > 0) {
                char[] cArr = chars;
                if (cArr[iDecodeEndOfInput - 1] == '\n') {
                    int i3 = iDecodeEndOfInput - 1;
                    iDecodeEndOfInput = (i3 <= 0 || cArr[iDecodeEndOfInput + (-2)] != '\r') ? i3 : iDecodeEndOfInput - 2;
                }
            }
            StringBuilder sb2 = sb;
            if (sb2.length() == 0) {
                return new String(chars, 0, iDecodeEndOfInput);
            }
            sb2.append(chars, 0, iDecodeEndOfInput);
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            if (sb2.length() > 32) {
                trimStringBuilder();
            }
            sb2.setLength(0);
            return string;
        } catch (Throwable th) {
            throw th;
        }
    }
}
