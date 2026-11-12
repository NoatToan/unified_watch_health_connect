package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class nlb {
    public static int a(String str) {
        int iCharAt = -2128831035;
        for (int i = 0; i < str.length(); i++) {
            iCharAt = (iCharAt ^ str.charAt(i)) * 16777619;
        }
        int i2 = iCharAt + (iCharAt << 13);
        int i3 = (i2 >> 7) ^ i2;
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >> 17);
        return Math.abs(i5 + (i5 << 5));
    }
}
