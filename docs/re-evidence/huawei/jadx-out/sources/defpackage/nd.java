package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class nd {
    public static byte[] e(int i) {
        return new byte[]{(byte) ((i >> 24) % 256), (byte) ((i >> 16) % 256), (byte) ((i >> 8) % 256), (byte) (i % 256)};
    }
}
