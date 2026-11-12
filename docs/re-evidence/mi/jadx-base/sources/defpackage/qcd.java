package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public class qcd {
    public static byte[] a(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) ((i >>> 16) & 255), (byte) ((i >>> 8) & 255), (byte) (i & 255)};
    }
}
