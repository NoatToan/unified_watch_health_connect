package org.apache.commons.io;

import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class EndianUtils {
    private static int read(InputStream inputStream) throws IOException {
        int i14 = inputStream.read();
        if (-1 != i14) {
            return i14;
        }
        throw new EOFException("Unexpected EOF reached");
    }

    public static double readSwappedDouble(byte[] bArr, int i14) {
        return Double.longBitsToDouble(readSwappedLong(bArr, i14));
    }

    public static float readSwappedFloat(byte[] bArr, int i14) {
        return Float.intBitsToFloat(readSwappedInteger(bArr, i14));
    }

    public static int readSwappedInteger(InputStream inputStream) throws IOException {
        return (read(inputStream) & 255) + ((read(inputStream) & 255) << 8) + ((read(inputStream) & 255) << 16) + ((read(inputStream) & 255) << 24);
    }

    public static long readSwappedLong(byte[] bArr, int i14) {
        return (((long) readSwappedInteger(bArr, i14 + 4)) << 32) + (((long) readSwappedInteger(bArr, i14)) & 4294967295L);
    }

    public static short readSwappedShort(InputStream inputStream) {
        return (short) ((read(inputStream) & 255) + ((read(inputStream) & 255) << 8));
    }

    public static long readSwappedUnsignedInteger(InputStream inputStream) throws IOException {
        return (((long) (read(inputStream) & 255)) << 24) + (((long) ((read(inputStream) & 255) + ((read(inputStream) & 255) << 8) + ((read(inputStream) & 255) << 16))) & 4294967295L);
    }

    public static int readSwappedUnsignedShort(InputStream inputStream) throws IOException {
        return (read(inputStream) & 255) + ((read(inputStream) & 255) << 8);
    }

    public static double swapDouble(double d14) {
        return Double.longBitsToDouble(swapLong(Double.doubleToLongBits(d14)));
    }

    public static float swapFloat(float f14) {
        return Float.intBitsToFloat(swapInteger(Float.floatToIntBits(f14)));
    }

    public static int swapInteger(int i14) {
        return ((i14 & 255) << 24) + (((i14 >> 8) & 255) << 16) + (((i14 >> 16) & 255) << 8) + ((i14 >> 24) & 255);
    }

    public static long swapLong(long j8) {
        return ((j8 & 255) << 56) + (((j8 >> 8) & 255) << 48) + (((j8 >> 16) & 255) << 40) + (((j8 >> 24) & 255) << 32) + (((j8 >> 32) & 255) << 24) + (((j8 >> 40) & 255) << 16) + (((j8 >> 48) & 255) << 8) + ((j8 >> 56) & 255);
    }

    public static short swapShort(short s8) {
        return (short) (((s8 & 255) << 8) + ((s8 >> 8) & 255));
    }

    public static void writeSwappedDouble(byte[] bArr, int i14, double d14) {
        writeSwappedLong(bArr, i14, Double.doubleToLongBits(d14));
    }

    public static void writeSwappedFloat(byte[] bArr, int i14, float f14) {
        writeSwappedInteger(bArr, i14, Float.floatToIntBits(f14));
    }

    public static void writeSwappedInteger(byte[] bArr, int i14, int i15) {
        bArr[i14] = (byte) (i15 & 255);
        bArr[i14 + 1] = (byte) ((i15 >> 8) & 255);
        bArr[i14 + 2] = (byte) ((i15 >> 16) & 255);
        bArr[i14 + 3] = (byte) ((i15 >> 24) & 255);
    }

    public static void writeSwappedLong(byte[] bArr, int i14, long j8) {
        bArr[i14] = (byte) (j8 & 255);
        bArr[i14 + 1] = (byte) ((j8 >> 8) & 255);
        bArr[i14 + 2] = (byte) ((j8 >> 16) & 255);
        bArr[i14 + 3] = (byte) ((j8 >> 24) & 255);
        bArr[i14 + 4] = (byte) ((j8 >> 32) & 255);
        bArr[i14 + 5] = (byte) ((j8 >> 40) & 255);
        bArr[i14 + 6] = (byte) ((j8 >> 48) & 255);
        bArr[i14 + 7] = (byte) ((j8 >> 56) & 255);
    }

    public static void writeSwappedShort(byte[] bArr, int i14, short s8) {
        bArr[i14] = (byte) (s8 & 255);
        bArr[i14 + 1] = (byte) ((s8 >> 8) & 255);
    }

    public static void writeSwappedDouble(OutputStream outputStream, double d14) throws IOException {
        writeSwappedLong(outputStream, Double.doubleToLongBits(d14));
    }

    public static void writeSwappedFloat(OutputStream outputStream, float f14) throws IOException {
        writeSwappedInteger(outputStream, Float.floatToIntBits(f14));
    }

    public static double readSwappedDouble(InputStream inputStream) {
        return Double.longBitsToDouble(readSwappedLong(inputStream));
    }

    public static float readSwappedFloat(InputStream inputStream) {
        return Float.intBitsToFloat(readSwappedInteger(inputStream));
    }

    public static void writeSwappedShort(OutputStream outputStream, short s8) throws IOException {
        outputStream.write((byte) (s8 & 255));
        outputStream.write((byte) ((s8 >> 8) & 255));
    }

    public static int readSwappedUnsignedShort(byte[] bArr, int i14) {
        return (bArr[i14] & UnsignedBytes.MAX_VALUE) + ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8);
    }

    public static short readSwappedShort(byte[] bArr, int i14) {
        return (short) ((bArr[i14] & UnsignedBytes.MAX_VALUE) + ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8));
    }

    public static long readSwappedLong(InputStream inputStream) {
        byte[] bArr = new byte[8];
        for (int i14 = 0; i14 < 8; i14++) {
            bArr[i14] = (byte) read(inputStream);
        }
        return readSwappedLong(bArr, 0);
    }

    public static void writeSwappedInteger(OutputStream outputStream, int i14) throws IOException {
        outputStream.write((byte) (i14 & 255));
        outputStream.write((byte) ((i14 >> 8) & 255));
        outputStream.write((byte) ((i14 >> 16) & 255));
        outputStream.write((byte) ((i14 >> 24) & 255));
    }

    public static int readSwappedInteger(byte[] bArr, int i14) {
        return (bArr[i14] & UnsignedBytes.MAX_VALUE) + ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8) + ((bArr[i14 + 2] & UnsignedBytes.MAX_VALUE) << 16) + ((bArr[i14 + 3] & UnsignedBytes.MAX_VALUE) << 24);
    }

    public static long readSwappedUnsignedInteger(byte[] bArr, int i14) {
        return (((long) (bArr[i14 + 3] & UnsignedBytes.MAX_VALUE)) << 24) + (((long) ((bArr[i14] & UnsignedBytes.MAX_VALUE) + ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8) + ((bArr[i14 + 2] & UnsignedBytes.MAX_VALUE) << 16))) & 4294967295L);
    }

    public static void writeSwappedLong(OutputStream outputStream, long j8) throws IOException {
        outputStream.write((byte) (j8 & 255));
        outputStream.write((byte) ((j8 >> 8) & 255));
        outputStream.write((byte) ((j8 >> 16) & 255));
        outputStream.write((byte) ((j8 >> 24) & 255));
        outputStream.write((byte) ((j8 >> 32) & 255));
        outputStream.write((byte) ((j8 >> 40) & 255));
        outputStream.write((byte) ((j8 >> 48) & 255));
        outputStream.write((byte) ((j8 >> 56) & 255));
    }
}
