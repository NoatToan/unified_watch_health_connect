package defpackage;

import android.text.TextUtils;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.i0;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class v7p {
    public static final Pattern d = Pattern.compile("\\s+");
    public static final ImmutableSet<String> e = ImmutableSet.of("auto", "none");
    public static final ImmutableSet<String> f = ImmutableSet.of("dot", "sesame", "circle");
    public static final ImmutableSet<String> g = ImmutableSet.of("filled", "open");
    public static final ImmutableSet<String> h = ImmutableSet.of("after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36599b;
    public final int c;

    public v7p(int i, int i2, int i3) {
        this.f36598a = i;
        this.f36599b = i2;
        this.c = i3;
    }

    public static v7p a(String str) {
        if (str == null) {
            return null;
        }
        String strE = fk1.e(str.trim());
        if (strE.isEmpty()) {
            return null;
        }
        return b(ImmutableSet.copyOf(TextUtils.split(strE, d)));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:68:0x0100  */
    /* JADX WARN: Code duplicated, block: B:69:0x0102  */
    /* JADX WARN: Code duplicated, block: B:71:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0107  */
    /* JADX WARN: Code duplicated, block: B:73:0x0109  */
    public static v7p b(ImmutableSet<String> immutableSet) {
        byte b2;
        int i;
        int i2;
        String str;
        int iHashCode;
        String str2 = (String) cpd.e(i0.c(h, immutableSet), "outside");
        int iHashCode2 = str2.hashCode();
        int i3 = 2;
        byte b3 = 0;
        int i4 = -1;
        if (iHashCode2 != -1392885889) {
            if (iHashCode2 != -1106037339) {
                if (iHashCode2 == 92734940 && str2.equals("after")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
            } else if (str2.equals("outside")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str2.equals("before")) {
            b2 = 2;
        } else {
            b2 = -1;
        }
        if (b2 != 0) {
            i = b2 != 1 ? 1 : -2;
        } else {
            i = 2;
        }
        i0.c cVarC = i0.c(e, immutableSet);
        if (!cVarC.isEmpty()) {
            String str3 = (String) cVarC.iterator().next();
            int iHashCode3 = str3.hashCode();
            if (iHashCode3 == 3005871) {
                str3.equals("auto");
            } else if (iHashCode3 == 3387192 && str3.equals("none")) {
                i4 = 0;
            }
            return new v7p(i4, 0, i);
        }
        i0.c cVarC2 = i0.c(g, immutableSet);
        i0.c cVarC3 = i0.c(f, immutableSet);
        if (cVarC2.isEmpty() && cVarC3.isEmpty()) {
            return new v7p(-1, 0, i);
        }
        String str4 = (String) cpd.e(cVarC2, "filled");
        int iHashCode4 = str4.hashCode();
        if (iHashCode4 != -1274499742) {
            if (iHashCode4 == 3417674 && str4.equals("open")) {
                i2 = 2;
            }
            str = (String) cpd.e(cVarC3, "circle");
            iHashCode = str.hashCode();
            if (iHashCode != -1360216880) {
                if (iHashCode != -905816648) {
                    if (iHashCode == 99657 || !str.equals("dot")) {
                        b3 = -1;
                    }
                } else if (str.equals("sesame")) {
                    b3 = 1;
                } else {
                    b3 = -1;
                }
            } else if (str.equals("circle")) {
                b3 = 2;
            } else {
                b3 = -1;
            }
            if (b3 != 0) {
                if (b3 != 1) {
                    i3 = 1;
                } else {
                    i3 = 3;
                }
            }
            return new v7p(i3, i2, i);
        }
        str4.equals("filled");
        i2 = 1;
        str = (String) cpd.e(cVarC3, "circle");
        iHashCode = str.hashCode();
        if (iHashCode != -1360216880) {
            if (iHashCode != -905816648) {
                if (iHashCode == 99657) {
                    b3 = -1;
                } else {
                    b3 = -1;
                }
            } else if (str.equals("sesame")) {
                b3 = 1;
            } else {
                b3 = -1;
            }
        } else if (str.equals("circle")) {
            b3 = 2;
        } else {
            b3 = -1;
        }
        if (b3 != 0) {
            if (b3 != 1) {
                i3 = 1;
            } else {
                i3 = 3;
            }
        }
        return new v7p(i3, i2, i);
    }
}
