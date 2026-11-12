package d53;

import c62.m1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class w extends u {
    public static boolean A(CharSequence charSequence, char c14) {
        charSequence.getClass();
        return G(c14, 0, 2, charSequence) >= 0;
    }

    public static boolean C(CharSequence charSequence, String str) {
        charSequence.getClass();
        return charSequence instanceof String ? u.p((String) charSequence, str, false) : N(charSequence, false, charSequence.length() - str.length(), str, 0, str.length());
    }

    public static boolean D(String str, char c14) {
        str.getClass();
        return str.length() > 0 && b.d(str.charAt(str.length() - 1), c14, false);
    }

    public static int E(CharSequence charSequence, String str, int i14, boolean z14) {
        charSequence.getClass();
        str.getClass();
        return (z14 || !(charSequence instanceof String)) ? F(charSequence, str, i14, charSequence.length(), z14, false) : ((String) charSequence).indexOf(str, i14);
    }

    public static final int F(CharSequence charSequence, CharSequence charSequence2, int i14, int i15, boolean z14, boolean z15) {
        j23.j jVarL;
        int i16 = i14;
        int i17 = i15;
        if (z15) {
            charSequence.getClass();
            int length = charSequence.length() - 1;
            if (i16 > length) {
                i16 = length;
            }
            if (i17 < 0) {
                i17 = 0;
            }
            jVarL = j23.t.l(i16, i17);
        } else {
            if (i16 < 0) {
                i16 = 0;
            }
            int length2 = charSequence.length();
            if (i17 > length2) {
                i17 = length2;
            }
            jVarL = new j23.l(i16, i17);
        }
        int i18 = jVarL.f96798c;
        int i19 = jVarL.f96797b;
        int i24 = jVarL.f96796a;
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            if ((i18 <= 0 || i24 > i19) && (i18 >= 0 || i19 > i24)) {
                return -1;
            }
            int i25 = i24;
            while (!N(charSequence2, z14, 0, charSequence, i25, charSequence2.length())) {
                if (i25 == i19) {
                    return -1;
                }
                i25 += i18;
            }
            return i25;
        }
        if ((i18 <= 0 || i24 > i19) && (i18 >= 0 || i19 > i24)) {
            return -1;
        }
        int i26 = i24;
        while (true) {
            String str = (String) charSequence2;
            if (u.t(str, 0, (String) charSequence, i26, str.length(), z14)) {
                return i26;
            }
            if (i26 == i19) {
                return -1;
            }
            i26 += i18;
        }
    }

    public static int G(char c14, int i14, int i15, CharSequence charSequence) {
        if ((i15 & 2) != 0) {
            i14 = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? I(charSequence, new char[]{c14}, i14, false) : ((String) charSequence).indexOf(c14, i14);
    }

    public static /* synthetic */ int H(CharSequence charSequence, String str, int i14, boolean z14, int i15) {
        if ((i15 & 2) != 0) {
            i14 = 0;
        }
        if ((i15 & 4) != 0) {
            z14 = false;
        }
        return E(charSequence, str, i14, z14);
    }

    public static final int I(CharSequence charSequence, char[] cArr, int i14, boolean z14) {
        charSequence.getClass();
        if (!z14 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(p13.u.U(cArr), i14);
        }
        if (i14 < 0) {
            i14 = 0;
        }
        int length = charSequence.length() - 1;
        if (i14 > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i14);
            for (char c14 : cArr) {
                if (b.d(c14, cCharAt, z14)) {
                    return i14;
                }
            }
            if (i14 == length) {
                return -1;
            }
            i14++;
        }
    }

    public static boolean J(CharSequence charSequence) {
        charSequence.getClass();
        for (int i14 = 0; i14 < charSequence.length(); i14++) {
            if (!a.b(charSequence.charAt(i14))) {
                return false;
            }
        }
        return true;
    }

    public static int K(char c14, int i14, int i15, CharSequence charSequence) {
        if ((i15 & 2) != 0) {
            charSequence.getClass();
            i14 = charSequence.length() - 1;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c14, i14);
        }
        char[] cArr = {c14};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(p13.u.U(cArr), i14);
        }
        int length = charSequence.length() - 1;
        if (i14 > length) {
            i14 = length;
        }
        while (-1 < i14) {
            if (b.d(cArr[0], charSequence.charAt(i14), false)) {
                return i14;
            }
            i14--;
        }
        return -1;
    }

    public static int L(int i14, int i15, CharSequence charSequence, String str) {
        if ((i15 & 2) != 0) {
            charSequence.getClass();
            i14 = charSequence.length() - 1;
        }
        int i16 = i14;
        charSequence.getClass();
        str.getClass();
        return !(charSequence instanceof String) ? F(charSequence, str, i16, 0, false, true) : ((String) charSequence).lastIndexOf(str, i16);
    }

    public static String M(int i14, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i14 < 0) {
            vb.h.s(e0.f(i14, "Desired length ", " is less than zero."));
            return null;
        }
        if (i14 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb3 = new StringBuilder(i14);
            int length = i14 - str.length();
            int i15 = 1;
            if (1 <= length) {
                while (true) {
                    sb3.append('0');
                    if (i15 == length) {
                        break;
                    }
                    i15++;
                }
            }
            sb3.append((CharSequence) str);
            charSequenceSubSequence = sb3;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean N(CharSequence charSequence, boolean z14, int i14, CharSequence charSequence2, int i15, int i16) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i15 < 0 || i14 < 0 || i14 > charSequence.length() - i16 || i15 > charSequence2.length() - i16) {
            return false;
        }
        for (int i17 = 0; i17 < i16; i17++) {
            if (!b.d(charSequence.charAt(i14 + i17), charSequence2.charAt(i15 + i17), z14)) {
                return false;
            }
        }
        return true;
    }

    public static String O(String str, String str2) {
        str.getClass();
        str2.getClass();
        return Z(str2, str) ? str.substring(str2.length()) : str;
    }

    public static CharSequence P(int i14, int i15, String str) {
        str.getClass();
        if (i15 < i14) {
            org.apache.commons.lang3.e.v(am.j.g(i15, i14, "End index (", ") is less than start index (", ")."));
            return null;
        }
        if (i15 == i14) {
            return str.subSequence(0, str.length());
        }
        StringBuilder sb3 = new StringBuilder(str.length() - (i15 - i14));
        sb3.append((CharSequence) str, 0, i14);
        sb3.append((CharSequence) str, i15, str.length());
        return sb3;
    }

    public static CharSequence Q(String str, StringBuilder sb3) {
        return C(sb3, str) ? sb3.subSequence(0, sb3.length() - str.length()) : sb3.subSequence(0, sb3.length());
    }

    public static String R(String str, String str2) {
        str.getClass();
        return C(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static String S(String str, String str2, String str3) {
        str.getClass();
        return (str.length() >= str3.length() + str2.length() && Z(str2, str) && C(str, str3)) ? str.substring(str2.length(), str.length() - str3.length()) : str;
    }

    public static StringBuilder T(CharSequence charSequence, CharSequence charSequence2, int i14, int i15) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i15 < i14) {
            org.apache.commons.lang3.e.v(am.j.g(i15, i14, "End index (", ") is less than start index (", ")."));
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(charSequence, 0, i14);
        sb3.append(charSequence2);
        sb3.append(charSequence, i15, charSequence.length());
        return sb3;
    }

    public static final void U(int i14) {
        if (i14 >= 0) {
            return;
        }
        vb.h.x(am.j.h(i14, "Limit must be non-negative, but was "));
    }

    public static final List V(CharSequence charSequence, String str) {
        U(0);
        int iE = E(charSequence, str, 0, false);
        if (iE == -1) {
            return p13.w.c(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iE).toString());
            length = str.length() + iE;
            iE = E(charSequence, str, length, false);
        } while (iE != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List W(CharSequence charSequence, String[] strArr) {
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return V(charSequence, str);
            }
        }
        U(0);
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        c53.v vVar = new c53.v(new d(charSequence, 0, 0, new a31.b(listAsList, 8)));
        ArrayList arrayList = new ArrayList(p13.y.r(vVar, 10));
        Iterator it = vVar.f24585a.iterator();
        while (it.hasNext()) {
            arrayList.add(a0(charSequence, (j23.l) it.next()));
        }
        return arrayList;
    }

    public static List X(String str, char[] cArr) {
        str.getClass();
        if (cArr.length == 1) {
            return V(str, String.valueOf(cArr[0]));
        }
        U(0);
        c53.v vVar = new c53.v(new d(str, 0, 0, new m1(cArr, 25)));
        ArrayList arrayList = new ArrayList(p13.y.r(vVar, 10));
        Iterator it = vVar.f24585a.iterator();
        while (it.hasNext()) {
            arrayList.add(a0(str, (j23.l) it.next()));
        }
        return arrayList;
    }

    public static boolean Y(CharSequence charSequence, int i14, String str) {
        charSequence.getClass();
        str.getClass();
        return charSequence instanceof String ? u.x(i14, (String) charSequence, str, false) : N(charSequence, false, i14, str, 0, str.length());
    }

    public static boolean Z(CharSequence charSequence, String str) {
        str.getClass();
        charSequence.getClass();
        return charSequence instanceof String ? u.y(str, (String) charSequence, false) : N(str, false, 0, charSequence, 0, charSequence.length());
    }

    public static String a0(CharSequence charSequence, j23.l lVar) {
        charSequence.getClass();
        lVar.getClass();
        return charSequence.subSequence(lVar.f96796a, lVar.f96797b + 1).toString();
    }

    public static String b0(String str, j23.l lVar) {
        str.getClass();
        lVar.getClass();
        return str.substring(lVar.f96796a, lVar.f96797b + 1);
    }

    public static String c0(String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        int iH = H(str, str2, 0, false, 6);
        return iH == -1 ? str3 : str.substring(str2.length() + iH, str.length());
    }

    public static String d0(char c14, String str, String str2) {
        str.getClass();
        str2.getClass();
        int iK = K(c14, 0, 6, str);
        return iK == -1 ? str2 : str.substring(iK + 1, str.length());
    }

    public static String e0(String str, String str2) {
        str.getClass();
        str2.getClass();
        str.getClass();
        int iL = L(0, 6, str, str2);
        return iL == -1 ? str : str.substring(str2.length() + iL, str.length());
    }

    public static String f0(String str, char c14) {
        str.getClass();
        str.getClass();
        int iG = G(c14, 0, 6, str);
        return iG == -1 ? str : str.substring(0, iG);
    }

    public static String g0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iH = H(str, str2, 0, false, 6);
        return iH == -1 ? str : str.substring(0, iH);
    }

    public static String h0(String str, char c14) {
        str.getClass();
        str.getClass();
        int iK = K(c14, 0, 6, str);
        return iK == -1 ? str : str.substring(0, iK);
    }

    public static CharSequence i0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i14 = 0;
        boolean z14 = false;
        while (i14 <= length) {
            boolean zB = a.b(charSequence.charAt(!z14 ? i14 : length));
            if (z14) {
                if (!zB) {
                    break;
                }
                length--;
            } else if (zB) {
                i14++;
            } else {
                z14 = true;
            }
        }
        return charSequence.subSequence(i14, length + 1);
    }

    public static String j0(String str, char... cArr) {
        int length = str.length() - 1;
        int i14 = 0;
        boolean z14 = false;
        while (i14 <= length) {
            boolean zW = p13.u.w(cArr, str.charAt(!z14 ? i14 : length));
            if (z14) {
                if (!zW) {
                    break;
                }
                length--;
            } else if (zW) {
                i14++;
            } else {
                z14 = true;
            }
        }
        return str.subSequence(i14, length + 1).toString();
    }

    public static CharSequence k0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i14 = length - 1;
            if (!a.b(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i14 < 0) {
                return "";
            }
            length = i14;
        }
    }

    public static String l0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i14 = length - 1;
            if (!p13.u.w(cArr, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i14 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i14;
        }
        return charSequenceSubSequence.toString();
    }

    public static CharSequence m0(String str) {
        str.getClass();
        int length = str.length();
        for (int i14 = 0; i14 < length; i14++) {
            if (!a.b(str.charAt(i14))) {
                return str.subSequence(i14, str.length());
            }
        }
        return "";
    }

    public static boolean z(CharSequence charSequence, CharSequence charSequence2, boolean z14) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (H(charSequence, (String) charSequence2, 0, z14, 2) >= 0) {
                return true;
            }
        } else if (F(charSequence, charSequence2, 0, charSequence.length(), z14, false) >= 0) {
            return true;
        }
        return false;
    }
}
