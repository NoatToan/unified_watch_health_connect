package kotlin.io.encoding;

import java.io.IOException;
import java.io.InputStream;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalEncodingApi
final class DecodeInputStream extends InputStream {

    @NotNull
    private final Base64 base64;

    @NotNull
    private final byte[] byteBuffer;
    private int byteBufferEndIndex;
    private int byteBufferStartIndex;

    @NotNull
    private final InputStream input;
    private boolean isClosed;
    private boolean isEOF;

    @NotNull
    private final byte[] singleByteBuffer;

    @NotNull
    private final byte[] symbolBuffer;

    public DecodeInputStream(@NotNull InputStream input, @NotNull Base64 base64) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.input = input;
        this.base64 = base64;
        this.singleByteBuffer = new byte[1];
        this.symbolBuffer = new byte[1024];
        this.byteBuffer = new byte[1024];
    }

    private final void copyByteBufferInto(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.byteBuffer;
        int i3 = this.byteBufferStartIndex;
        ArraysKt___ArraysJvmKt.copyInto(bArr2, bArr, i, i3, i3 + i2);
        this.byteBufferStartIndex += i2;
        resetByteBufferIfEmpty();
    }

    private final int decodeSymbolBufferInto(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.byteBufferEndIndex;
        this.byteBufferEndIndex = i4 + this.base64.decodeIntoByteArray(this.symbolBuffer, this.byteBuffer, i4, 0, i3);
        int iMin = Math.min(getByteBufferLength(), i2 - i);
        copyByteBufferInto(bArr, i, iMin);
        shiftByteBufferToStartIfNeeded();
        return iMin;
    }

    private final int getByteBufferLength() {
        return this.byteBufferEndIndex - this.byteBufferStartIndex;
    }

    private final int handlePaddingSymbol(int i) throws IOException {
        this.symbolBuffer[i] = Base64.padSymbol;
        if ((i & 3) != 2) {
            return i + 1;
        }
        int nextSymbol = readNextSymbol();
        if (nextSymbol >= 0) {
            this.symbolBuffer[i + 1] = (byte) nextSymbol;
        }
        return i + 2;
    }

    private final int readNextSymbol() throws IOException {
        int i;
        if (!this.base64.isMimeScheme$kotlin_stdlib()) {
            return this.input.read();
        }
        do {
            i = this.input.read();
            if (i == -1) {
                break;
            }
        } while (!Base64Kt.isInMimeAlphabet(i));
        return i;
    }

    private final void resetByteBufferIfEmpty() {
        if (this.byteBufferStartIndex == this.byteBufferEndIndex) {
            this.byteBufferStartIndex = 0;
            this.byteBufferEndIndex = 0;
        }
    }

    private final void shiftByteBufferToStartIfNeeded() {
        byte[] bArr = this.byteBuffer;
        int length = bArr.length;
        int i = this.byteBufferEndIndex;
        if ((this.symbolBuffer.length / 4) * 3 > length - i) {
            ArraysKt___ArraysJvmKt.copyInto(bArr, bArr, 0, this.byteBufferStartIndex, i);
            this.byteBufferEndIndex -= this.byteBufferStartIndex;
            this.byteBufferStartIndex = 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.input.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = this.byteBufferStartIndex;
        if (i < this.byteBufferEndIndex) {
            int i2 = this.byteBuffer[i] & 255;
            this.byteBufferStartIndex = i + 1;
            resetByteBufferIfEmpty();
            return i2;
        }
        int i3 = read(this.singleByteBuffer, 0, 1);
        if (i3 == -1) {
            return -1;
        }
        if (i3 == 1) {
            return this.singleByteBuffer[0] & 255;
        }
        throw new IllegalStateException("Unreachable".toString());
    }

    @Override // java.io.InputStream
    public int read(@NotNull byte[] destination, int i, int i2) throws IOException {
        int i3;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (i >= 0 && i2 >= 0 && (i3 = i + i2) <= destination.length) {
            if (!this.isClosed) {
                if (this.isEOF) {
                    return -1;
                }
                if (i2 == 0) {
                    return 0;
                }
                if (getByteBufferLength() >= i2) {
                    copyByteBufferInto(destination, i, i2);
                    return i2;
                }
                int byteBufferLength = (((i2 - getByteBufferLength()) + 2) / 3) * 4;
                int iDecodeSymbolBufferInto = i;
                while (true) {
                    z = this.isEOF;
                    if (z || byteBufferLength <= 0) {
                        break;
                    }
                    int iMin = Math.min(this.symbolBuffer.length, byteBufferLength);
                    int iHandlePaddingSymbol = 0;
                    while (true) {
                        z2 = this.isEOF;
                        if (z2 || iHandlePaddingSymbol >= iMin) {
                            break;
                        }
                        int nextSymbol = readNextSymbol();
                        if (nextSymbol == -1) {
                            this.isEOF = true;
                        } else if (nextSymbol != 61) {
                            this.symbolBuffer[iHandlePaddingSymbol] = (byte) nextSymbol;
                            iHandlePaddingSymbol++;
                        } else {
                            iHandlePaddingSymbol = handlePaddingSymbol(iHandlePaddingSymbol);
                            this.isEOF = true;
                        }
                    }
                    if (!z2 && iHandlePaddingSymbol != iMin) {
                        throw new IllegalStateException("Check failed.");
                    }
                    byteBufferLength -= iHandlePaddingSymbol;
                    iDecodeSymbolBufferInto += decodeSymbolBufferInto(destination, iDecodeSymbolBufferInto, i3, iHandlePaddingSymbol);
                }
                if (iDecodeSymbolBufferInto == i && z) {
                    return -1;
                }
                return iDecodeSymbolBufferInto - i;
            }
            throw new IOException("The input stream is closed.");
        }
        throw new IndexOutOfBoundsException("offset: " + i + ", length: " + i2 + ", buffer size: " + destination.length);
    }
}
