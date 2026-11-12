package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class s4s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f33298a = "0123456789ABCDEF".toCharArray();

    public static String a(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder(i2 * 2);
        for (int i3 = 0; i3 < i2; i3++) {
            byte b2 = bArr[i + i3];
            char[] cArr = f33298a;
            sb.append(cArr[(b2 & 255) >> 4]);
            sb.append(cArr[b2 & 15]);
        }
        return sb.toString();
    }

    public static boolean b(Context context) {
        return o4s.f28738a;
    }
}
