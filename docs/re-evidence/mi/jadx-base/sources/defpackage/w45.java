package defpackage;

import android.text.TextUtils;
import com.xiaomi.onetrack.util.z;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class w45 {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okh f37601a = new okh();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f37602b = new StringBuilder();

    public static boolean b(okh okhVar) {
        int iE = okhVar.e();
        int iF = okhVar.f();
        byte[] bArrD = okhVar.d();
        if (iE + 2 > iF) {
            return false;
        }
        int i = iE + 1;
        if (bArrD[iE] != 47) {
            return false;
        }
        int i2 = iE + 2;
        if (bArrD[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iF) {
                okhVar.Q(iF - okhVar.e());
                return true;
            }
            if (((char) bArrD[i2]) == '*' && ((char) bArrD[i3]) == '/') {
                i2 += 2;
                iF = i2;
            } else {
                i2 = i3;
            }
        }
    }

    public static boolean c(okh okhVar) {
        char cJ = j(okhVar, okhVar.e());
        if (cJ != '\t' && cJ != '\n' && cJ != '\f' && cJ != '\r' && cJ != ' ') {
            return false;
        }
        okhVar.Q(1);
        return true;
    }

    public static String e(okh okhVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int iE = okhVar.e();
        int iF = okhVar.f();
        while (iE < iF && !z) {
            char c2 = (char) okhVar.d()[iE];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                iE++;
                sb.append(c2);
            }
        }
        okhVar.Q(iE - okhVar.e());
        return sb.toString();
    }

    public static String f(okh okhVar, StringBuilder sb) {
        m(okhVar);
        if (okhVar.a() == 0) {
            return null;
        }
        String strE = e(okhVar, sb);
        if (!"".equals(strE)) {
            return strE;
        }
        char cD = (char) okhVar.D();
        StringBuilder sb2 = new StringBuilder(1);
        sb2.append(cD);
        return sb2.toString();
    }

    public static String g(okh okhVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int iE = okhVar.e();
            String strF = f(okhVar, sb);
            if (strF == null) {
                return null;
            }
            if ("}".equals(strF) || ";".equals(strF)) {
                okhVar.P(iE);
                z = true;
            } else {
                sb2.append(strF);
            }
        }
        return sb2.toString();
    }

    public static String h(okh okhVar, StringBuilder sb) {
        m(okhVar);
        if (okhVar.a() < 5 || !"::cue".equals(okhVar.A(5))) {
            return null;
        }
        int iE = okhVar.e();
        String strF = f(okhVar, sb);
        if (strF == null) {
            return null;
        }
        if ("{".equals(strF)) {
            okhVar.P(iE);
            return "";
        }
        String strK = "(".equals(strF) ? k(okhVar) : null;
        if (")".equals(f(okhVar, sb))) {
            return strK;
        }
        return null;
    }

    public static void i(okh okhVar, ncr ncrVar, StringBuilder sb) {
        m(okhVar);
        String strE = e(okhVar, sb);
        if (!"".equals(strE) && ":".equals(f(okhVar, sb))) {
            m(okhVar);
            String strG = g(okhVar, sb);
            if (strG == null || "".equals(strG)) {
                return;
            }
            int iE = okhVar.e();
            String strF = f(okhVar, sb);
            if (!";".equals(strF)) {
                if (!"}".equals(strF)) {
                    return;
                } else {
                    okhVar.P(iE);
                }
            }
            if ("color".equals(strE)) {
                ncrVar.q(t44.b(strG));
                return;
            }
            if ("background-color".equals(strE)) {
                ncrVar.n(t44.b(strG));
                return;
            }
            boolean z = true;
            if ("ruby-position".equals(strE)) {
                if ("over".equals(strG)) {
                    ncrVar.t(1);
                    return;
                } else {
                    if ("under".equals(strG)) {
                        ncrVar.t(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strE)) {
                if (!"all".equals(strG) && !strG.startsWith("digits")) {
                    z = false;
                }
                ncrVar.p(z);
                return;
            }
            if ("text-decoration".equals(strE)) {
                if ("underline".equals(strG)) {
                    ncrVar.y(true);
                }
            } else {
                if ("font-family".equals(strE)) {
                    ncrVar.r(strG);
                    return;
                }
                if ("font-weight".equals(strE)) {
                    if ("bold".equals(strG)) {
                        ncrVar.o(true);
                    }
                } else if ("font-style".equals(strE) && "italic".equals(strG)) {
                    ncrVar.s(true);
                }
            }
        }
    }

    public static char j(okh okhVar, int i) {
        return (char) okhVar.d()[i];
    }

    public static String k(okh okhVar) {
        int iE = okhVar.e();
        int iF = okhVar.f();
        boolean z = false;
        while (iE < iF && !z) {
            int i = iE + 1;
            z = ((char) okhVar.d()[iE]) == ')';
            iE = i;
        }
        return okhVar.A((iE - 1) - okhVar.e()).trim();
    }

    public static void l(okh okhVar) {
        while (!TextUtils.isEmpty(okhVar.p())) {
        }
    }

    public static void m(okh okhVar) {
        while (true) {
            for (boolean z = true; okhVar.a() > 0 && z; z = false) {
                if (!c(okhVar) && !b(okhVar)) {
                }
            }
            return;
        }
    }

    public final void a(ncr ncrVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                ncrVar.x((String) rk1.e(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrM0 = wlq.M0(str, z.f14007a);
        String str2 = strArrM0[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            ncrVar.w(str2.substring(0, iIndexOf2));
            ncrVar.v(str2.substring(iIndexOf2 + 1));
        } else {
            ncrVar.w(str2);
        }
        if (strArrM0.length > 1) {
            ncrVar.u((String[]) wlq.B0(strArrM0, 1, strArrM0.length));
        }
    }

    public List<ncr> d(okh okhVar) {
        this.f37602b.setLength(0);
        int iE = okhVar.e();
        l(okhVar);
        this.f37601a.N(okhVar.d(), okhVar.e());
        this.f37601a.P(iE);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strH = h(this.f37601a, this.f37602b);
            if (strH == null || !"{".equals(f(this.f37601a, this.f37602b))) {
                return arrayList;
            }
            ncr ncrVar = new ncr();
            a(ncrVar, strH);
            String str = null;
            boolean z = false;
            while (!z) {
                int iE2 = this.f37601a.e();
                String strF = f(this.f37601a, this.f37602b);
                boolean z2 = strF == null || "}".equals(strF);
                if (!z2) {
                    this.f37601a.P(iE2);
                    i(this.f37601a, ncrVar, this.f37602b);
                }
                str = strF;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(ncrVar);
            }
        }
    }
}
