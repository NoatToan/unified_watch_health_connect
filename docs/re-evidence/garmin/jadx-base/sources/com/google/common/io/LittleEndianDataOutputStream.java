package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class LittleEndianDataOutputStream extends FilterOutputStream implements DataOutput {
    public LittleEndianDataOutputStream(OutputStream outputStream) {
        super(new DataOutputStream((OutputStream) Preconditions.checkNotNull(outputStream)));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public void write(byte[] bArr, int i14, int i15) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i14, i15);
    }

    @Override // java.io.DataOutput
    public void writeBoolean(boolean z14) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBoolean(z14);
    }

    @Override // java.io.DataOutput
    public void writeByte(int i14) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeByte(i14);
    }

    @Override // java.io.DataOutput
    @Deprecated
    public void writeBytes(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBytes(str);
    }

    @Override // java.io.DataOutput
    public void writeChar(int i14) throws IOException {
        writeShort(i14);
    }

    @Override // java.io.DataOutput
    public void writeChars(String str) throws IOException {
        for (int i14 = 0; i14 < str.length(); i14++) {
            writeChar(str.charAt(i14));
        }
    }

    @Override // java.io.DataOutput
    public void writeDouble(double d14) throws IOException {
        writeLong(Double.doubleToLongBits(d14));
    }

    @Override // java.io.DataOutput
    public void writeFloat(float f14) throws IOException {
        writeInt(Float.floatToIntBits(f14));
    }

    @Override // java.io.DataOutput
    public void writeInt(int i14) throws IOException {
        ((FilterOutputStream) this).out.write(i14 & 255);
        ((FilterOutputStream) this).out.write((i14 >> 8) & 255);
        ((FilterOutputStream) this).out.write((i14 >> 16) & 255);
        ((FilterOutputStream) this).out.write((i14 >> 24) & 255);
    }

    @Override // java.io.DataOutput
    public void writeLong(long j8) throws IOException {
        byte[] byteArray = Longs.toByteArray(Long.reverseBytes(j8));
        write(byteArray, 0, byteArray.length);
    }

    @Override // java.io.DataOutput
    public void writeShort(int i14) throws IOException {
        ((FilterOutputStream) this).out.write(i14 & 255);
        ((FilterOutputStream) this).out.write((i14 >> 8) & 255);
    }

    @Override // java.io.DataOutput
    public void writeUTF(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeUTF(str);
    }
}
