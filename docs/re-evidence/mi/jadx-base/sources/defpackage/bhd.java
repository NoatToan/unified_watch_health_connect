package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class bhd {
    public static int a(int... iArr) {
        b6i.b(iArr.length > 0);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }
}
