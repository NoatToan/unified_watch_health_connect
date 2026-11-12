package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class b17 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3673b;
    public final String c;

    public b17(int i, int i2, String str) {
        this.f3672a = i;
        this.f3673b = i2;
        this.c = str;
    }

    public static b17 a(okh okhVar) {
        String str;
        okhVar.Q(2);
        int iD = okhVar.D();
        int i = iD >> 1;
        int iD2 = ((okhVar.D() >> 3) & 31) | ((iD & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        String str2 = iD2 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str.length() + 24 + str2.length());
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(str2);
        sb.append(iD2);
        return new b17(i, iD2, sb.toString());
    }
}
