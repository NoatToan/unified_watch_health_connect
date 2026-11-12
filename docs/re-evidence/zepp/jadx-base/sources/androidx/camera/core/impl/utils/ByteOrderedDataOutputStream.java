package androidx.camera.core.impl.utils;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
class ByteOrderedDataOutputStream extends FilterOutputStream {
    private ByteOrder mByteOrder;
    public final OutputStream mOutputStream;

    public ByteOrderedDataOutputStream(OutputStream out, ByteOrder byteOrder) {
        super(out);
        this.mOutputStream = out;
        this.mByteOrder = byteOrder;
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bytes) throws IOException {
        this.mOutputStream.write(bytes);
    }

    public void writeByte(int val) throws IOException {
        this.mOutputStream.write(val);
    }

    public void writeInt(int val) throws IOException {
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.mOutputStream.write((val >>> 0) & 255);
            this.mOutputStream.write((val >>> 8) & 255);
            this.mOutputStream.write((val >>> 16) & 255);
            this.mOutputStream.write((val >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.mOutputStream.write((val >>> 24) & 255);
            this.mOutputStream.write((val >>> 16) & 255);
            this.mOutputStream.write((val >>> 8) & 255);
            this.mOutputStream.write((val >>> 0) & 255);
        }
    }

    public void writeShort(short val) throws IOException {
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.mOutputStream.write((val >>> 0) & 255);
            this.mOutputStream.write((val >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.mOutputStream.write((val >>> 8) & 255);
            this.mOutputStream.write((val >>> 0) & 255);
        }
    }

    public void writeUnsignedInt(long val) throws IOException {
        writeInt((int) val);
    }

    public void writeUnsignedShort(int val) throws IOException {
        writeShort((short) val);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bytes, int offset, int length) throws IOException {
        this.mOutputStream.write(bytes, offset, length);
    }
}
