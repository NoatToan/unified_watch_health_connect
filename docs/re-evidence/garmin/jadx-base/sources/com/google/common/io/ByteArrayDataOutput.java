package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.DataOutput;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public interface ByteArrayDataOutput extends DataOutput {
    byte[] toByteArray();

    @Override // java.io.DataOutput
    void write(int i14);

    @Override // java.io.DataOutput
    void write(byte[] bArr);

    @Override // java.io.DataOutput
    void write(byte[] bArr, int i14, int i15);

    @Override // java.io.DataOutput
    void writeBoolean(boolean z14);

    @Override // java.io.DataOutput
    void writeByte(int i14);

    @Override // java.io.DataOutput
    @Deprecated
    void writeBytes(String str);

    @Override // java.io.DataOutput
    void writeChar(int i14);

    @Override // java.io.DataOutput
    void writeChars(String str);

    @Override // java.io.DataOutput
    void writeDouble(double d14);

    @Override // java.io.DataOutput
    void writeFloat(float f14);

    @Override // java.io.DataOutput
    void writeInt(int i14);

    @Override // java.io.DataOutput
    void writeLong(long j8);

    @Override // java.io.DataOutput
    void writeShort(int i14);

    @Override // java.io.DataOutput
    void writeUTF(String str);
}
