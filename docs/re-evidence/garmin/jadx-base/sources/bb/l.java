package bb;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17214a;

    private l(int i14, int i15, String str) {
        this.f17214a = str;
    }

    public static l a(fa.r rVar) {
        String str;
        rVar.H(2);
        int iU = rVar.u();
        int i14 = iU >> 1;
        int iU2 = ((rVar.u() >> 3) & 31) | ((iU & 1) << 5);
        if (i14 == 4 || i14 == 5 || i14 == 7) {
            str = "dvhe";
        } else if (i14 == 8) {
            str = "hev1";
        } else {
            if (i14 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(".0");
        sb3.append(i14);
        return new l(i14, iU2, j20.x.e(sb3, iU2, iU2 >= 10 ? "." : ".0"));
    }
}
