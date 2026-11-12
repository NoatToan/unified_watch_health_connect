package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class sno extends odm {
    public static final Pattern q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f33822r = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder o;
    public final ArrayList<String> p;

    public sno() {
        super("SubripDecoder");
        this.o = new StringBuilder();
        this.p = new ArrayList<>();
    }

    public static float C(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    public static long D(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) rk1.e(matcher.group(i + 2))) * 60000) + (Long.parseLong((String) rk1.e(matcher.group(i + 3))) * 1000);
        String strGroup2 = matcher.group(i + 4);
        if (strGroup2 != null) {
            j += Long.parseLong(strGroup2);
        }
        return j * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    public final h55 B(Spanned spanned, String str) {
        byte b2;
        byte b3;
        h55.b bVarO = new h55.b().o(spanned);
        if (str == null) {
            return bVarO.a();
        }
        switch (str) {
            case "{\an1}":
                b2 = 0;
                break;
            case "{\an2}":
                b2 = 6;
                break;
            case "{\an3}":
                b2 = 3;
                break;
            case "{\an4}":
                b2 = 1;
                break;
            case "{\an5}":
                b2 = 7;
                break;
            case "{\an6}":
                b2 = 4;
                break;
            case "{\an7}":
                b2 = 2;
                break;
            case "{\an8}":
                b2 = 8;
                break;
            case "{\an9}":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0 || b2 == 1 || b2 == 2) {
            bVarO.l(0);
        } else if (b2 == 3 || b2 == 4 || b2 == 5) {
            bVarO.l(2);
        } else {
            bVarO.l(1);
        }
        switch (str) {
            case "{\an1}":
                b3 = 0;
                break;
            case "{\an2}":
                b3 = 1;
                break;
            case "{\an3}":
                b3 = 2;
                break;
            case "{\an4}":
                b3 = 6;
                break;
            case "{\an5}":
                b3 = 7;
                break;
            case "{\an6}":
                b3 = 8;
                break;
            case "{\an7}":
                b3 = 3;
                break;
            case "{\an8}":
                b3 = 4;
                break;
            case "{\an9}":
                b3 = 5;
                break;
            default:
                b3 = -1;
                break;
        }
        if (b3 == 0 || b3 == 1 || b3 == 2) {
            bVarO.i(2);
        } else if (b3 == 3 || b3 == 4 || b3 == 5) {
            bVarO.i(0);
        } else {
            bVarO.i(1);
        }
        return bVarO.k(C(bVarO.d())).h(C(bVarO.c()), 0).a();
    }

    public final String E(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = f33822r.matcher(strTrim);
        int i = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i += length;
        }
        return sb.toString();
    }

    @Override // defpackage.odm
    public soo z(byte[] bArr, int i, boolean z) {
        String str;
        ArrayList arrayList = new ArrayList();
        rre rreVar = new rre();
        okh okhVar = new okh(bArr, i);
        while (true) {
            String strP = okhVar.p();
            int i2 = 0;
            if (strP == null) {
                break;
            }
            if (strP.length() != 0) {
                try {
                    Integer.parseInt(strP);
                    String strP2 = okhVar.p();
                    if (strP2 == null) {
                        toe.h("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = q.matcher(strP2);
                    if (matcher.matches()) {
                        rreVar.a(D(matcher, 1));
                        rreVar.a(D(matcher, 6));
                        this.o.setLength(0);
                        this.p.clear();
                        for (String strP3 = okhVar.p(); !TextUtils.isEmpty(strP3); strP3 = okhVar.p()) {
                            if (this.o.length() > 0) {
                                this.o.append("<br>");
                            }
                            this.o.append(E(strP3, this.p));
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.o.toString());
                        while (true) {
                            if (i2 >= this.p.size()) {
                                str = null;
                                break;
                            }
                            str = this.p.get(i2);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(B(spannedFromHtml, str));
                        arrayList.add(h55.f19700r);
                    } else {
                        toe.h("SubripDecoder", strP2.length() != 0 ? "Skipping invalid timing: ".concat(strP2) : new String("Skipping invalid timing: "));
                    }
                } catch (NumberFormatException unused) {
                    toe.h("SubripDecoder", strP.length() != 0 ? "Skipping invalid index: ".concat(strP) : new String("Skipping invalid index: "));
                }
            }
        }
        return new tno((h55[]) arrayList.toArray(new h55[0]), rreVar.d());
    }
}
