package defpackage;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class i8o extends odm {
    public static final Pattern t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean o;
    public final j8o p;
    public Map<String, k8o> q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f20887r;
    public float s;

    public i8o(List<byte[]> list) {
        super("SsaDecoder");
        this.f20887r = -3.4028235E38f;
        this.s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.o = false;
            this.p = null;
            return;
        }
        this.o = true;
        String strE = wlq.E(list.get(0));
        rk1.a(strE.startsWith("Format:"));
        this.p = (j8o) rk1.e(j8o.a(strE));
        G(new okh(list.get(1)));
    }

    public static int B(long j, List<Long> list, List<List<h55>> list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (list.get(size).longValue() == j) {
                return size;
            }
            if (list.get(size).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList(list2.get(i - 1)));
        return i;
    }

    public static float C(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    public static h55 D(String str, k8o k8oVar, k8o.b bVar, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        h55.b bVarO = new h55.b().o(spannableString);
        if (k8oVar != null) {
            if (k8oVar.c != null) {
                spannableString.setSpan(new ForegroundColorSpan(k8oVar.c.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = k8oVar.d;
            if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                bVarO.q(f3 / f2, 1);
            }
            boolean z = k8oVar.e;
            if (z && k8oVar.f) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (k8oVar.f) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (k8oVar.g) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (k8oVar.h) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = bVar.f23607a;
        if (i == -1) {
            i = k8oVar != null ? k8oVar.f23604b : -1;
        }
        bVarO.p(M(i)).l(L(i)).i(K(i));
        PointF pointF = bVar.f23608b;
        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
            bVarO.k(C(bVarO.d()));
            bVarO.h(C(bVarO.c()), 0);
        } else {
            bVarO.k(pointF.x / f);
            bVarO.h(bVar.f23608b.y / f2, 0);
        }
        return bVarO.a();
    }

    public static Map<String, k8o> I(okh okhVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        k8o.a aVarA = null;
        while (true) {
            String strP = okhVar.p();
            if (strP == null || (okhVar.a() != 0 && okhVar.h() == 91)) {
                break;
            }
            if (strP.startsWith("Format:")) {
                aVarA = k8o.a.a(strP);
            } else if (strP.startsWith("Style:")) {
                if (aVarA == null) {
                    toe.h("SsaDecoder", strP.length() != 0 ? "Skipping 'Style:' line before 'Format:' line: ".concat(strP) : new String("Skipping 'Style:' line before 'Format:' line: "));
                } else {
                    k8o k8oVarB = k8o.b(strP, aVarA);
                    if (k8oVarB != null) {
                        linkedHashMap.put(k8oVarB.f23603a, k8oVarB);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static long J(String str) {
        Matcher matcher = t.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) wlq.j(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) wlq.j(matcher.group(2))) * 60000000) + (Long.parseLong((String) wlq.j(matcher.group(3))) * FolmeCore.NANOS_TO_MS) + (Long.parseLong((String) wlq.j(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    public static int K(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                StringBuilder sb = new StringBuilder(30);
                sb.append("Unknown alignment: ");
                sb.append(i);
                toe.h("SsaDecoder", sb.toString());
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    public static int L(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                StringBuilder sb = new StringBuilder(30);
                sb.append("Unknown alignment: ");
                sb.append(i);
                toe.h("SsaDecoder", sb.toString());
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    public static Layout.Alignment M(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                StringBuilder sb = new StringBuilder(30);
                sb.append("Unknown alignment: ");
                sb.append(i);
                toe.h("SsaDecoder", sb.toString());
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    public final void E(String str, j8o j8oVar, List<List<h55>> list, List<Long> list2) {
        int i;
        rk1.a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", j8oVar.e);
        if (strArrSplit.length != j8oVar.e) {
            toe.h("SsaDecoder", str.length() != 0 ? "Skipping dialogue line with fewer columns than format: ".concat(str) : new String("Skipping dialogue line with fewer columns than format: "));
            return;
        }
        long J = J(strArrSplit[j8oVar.f22533a]);
        if (J == -9223372036854775807L) {
            toe.h("SsaDecoder", str.length() != 0 ? "Skipping invalid timing: ".concat(str) : new String("Skipping invalid timing: "));
            return;
        }
        long J2 = J(strArrSplit[j8oVar.f22534b]);
        if (J2 == -9223372036854775807L) {
            toe.h("SsaDecoder", str.length() != 0 ? "Skipping invalid timing: ".concat(str) : new String("Skipping invalid timing: "));
            return;
        }
        Map<String, k8o> map = this.q;
        k8o k8oVar = (map == null || (i = j8oVar.c) == -1) ? null : map.get(strArrSplit[i].trim());
        String str2 = strArrSplit[j8oVar.d];
        h55 h55VarD = D(k8o.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), k8oVar, k8o.b.b(str2), this.f20887r, this.s);
        int iB = B(J2, list2, list);
        for (int iB2 = B(J, list2, list); iB2 < iB; iB2++) {
            list.get(iB2).add(h55VarD);
        }
    }

    public final void F(okh okhVar, List<List<h55>> list, List<Long> list2) {
        j8o j8oVarA = this.o ? this.p : null;
        while (true) {
            String strP = okhVar.p();
            if (strP == null) {
                return;
            }
            if (strP.startsWith("Format:")) {
                j8oVarA = j8o.a(strP);
            } else if (strP.startsWith("Dialogue:")) {
                if (j8oVarA == null) {
                    toe.h("SsaDecoder", strP.length() != 0 ? "Skipping dialogue line before complete format: ".concat(strP) : new String("Skipping dialogue line before complete format: "));
                } else {
                    E(strP, j8oVarA, list, list2);
                }
            }
        }
    }

    public final void G(okh okhVar) {
        while (true) {
            String strP = okhVar.p();
            if (strP == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strP)) {
                H(okhVar);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strP)) {
                this.q = I(okhVar);
            } else if ("[V4 Styles]".equalsIgnoreCase(strP)) {
                toe.f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strP)) {
                return;
            }
        }
    }

    public final void H(okh okhVar) {
        while (true) {
            String strP = okhVar.p();
            if (strP == null) {
                return;
            }
            if (okhVar.a() != 0 && okhVar.h() == 91) {
                return;
            }
            String[] strArrSplit = strP.split(":");
            if (strArrSplit.length == 2) {
                String strE = fk1.e(strArrSplit[0].trim());
                strE.hashCode();
                if (strE.equals("playresx")) {
                    this.f20887r = Float.parseFloat(strArrSplit[1].trim());
                } else if (strE.equals("playresy")) {
                    try {
                        this.s = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    @Override // defpackage.odm
    public soo z(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        okh okhVar = new okh(bArr, i);
        if (!this.o) {
            G(okhVar);
        }
        F(okhVar, arrayList, arrayList2);
        return new l8o(arrayList, arrayList2);
    }
}
