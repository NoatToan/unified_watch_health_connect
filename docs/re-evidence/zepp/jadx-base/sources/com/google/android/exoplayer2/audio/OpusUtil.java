package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class OpusUtil {
    public static final int SAMPLE_RATE = 48000;
    private static final int a = 3840;
    private static final int b = 3;

    private OpusUtil() {
    }

    private static byte[] a(long value) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(value).array();
    }

    private static int b(byte[] header) {
        return (header[10] & 255) | ((header[11] & 255) << 8);
    }

    public static List<byte[]> buildInitializationData(byte[] header) {
        long jD = d(b(header));
        long jD2 = d(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(header);
        arrayList.add(a(jD));
        arrayList.add(a(jD2));
        return arrayList;
    }

    private static long c(long nanoseconds) {
        return (nanoseconds * 48000) / 1000000000;
    }

    private static long d(long sampleCount) {
        return (sampleCount * 1000000000) / 48000;
    }

    public static int getChannelCount(byte[] header) {
        return header[9] & 255;
    }

    public static int getPreSkipSamples(List<byte[]> initializationData) {
        return initializationData.size() == 3 ? (int) c(ByteBuffer.wrap(initializationData.get(1)).order(ByteOrder.nativeOrder()).getLong()) : b(initializationData.get(0));
    }

    public static int getSeekPreRollSamples(List<byte[]> initializationData) {
        return initializationData.size() == 3 ? (int) c(ByteBuffer.wrap(initializationData.get(2)).order(ByteOrder.nativeOrder()).getLong()) : a;
    }
}
