package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class yz9 {
    public static int a(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static int b(int i, int i2) {
        int i3 = i2 - (i % i2);
        if (i3 == i2) {
            return 0;
        }
        return i3;
    }
}
