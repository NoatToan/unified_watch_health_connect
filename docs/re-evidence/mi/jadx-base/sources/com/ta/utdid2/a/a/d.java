package com.ta.utdid2.a.a;

/* JADX INFO: loaded from: classes6.dex */
public class d {
    public static byte[] getBytes(int i) {
        return new byte[]{(byte) ((i >> 24) % 256), (byte) ((i >> 16) % 256), (byte) ((i >> 8) % 256), (byte) (i % 256)};
    }
}
