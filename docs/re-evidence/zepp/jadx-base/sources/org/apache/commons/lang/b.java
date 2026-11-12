package org.apache.commons.lang;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.UserDataStore;
import com.huami.nfc.applet.ConstantKt;
import com.huami.watch.ota.UpdateUtils;
import com.xmlywind.sdk.common.mta.PointType;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes23.dex */
class b {
    private static final String[][] b;
    private static final String[][] c;
    public static final String[][] d;
    public static final String[][] e;
    public static final b f;
    public static final b g;
    public static final b h;
    private final c a;

    /* JADX INFO: renamed from: org.apache.commons.lang.b$b, reason: collision with other inner class name */
    public static class C1195b extends a {
        public C1195b() {
        }

        private int d(int i) {
            int i2 = this.b - 1;
            int i3 = 0;
            while (i3 <= i2) {
                int i4 = (i3 + i2) >>> 1;
                int i5 = this.d[i4];
                if (i5 < i) {
                    i3 = i4 + 1;
                } else {
                    if (i5 <= i) {
                        return i4;
                    }
                    i2 = i4 - 1;
                }
            }
            return -(i3 + 1);
        }

        @Override // org.apache.commons.lang.b.a, org.apache.commons.lang.b.c
        public void add(String str, int i) {
            c(this.b + 1);
            int iD = d(i);
            if (iD > 0) {
                return;
            }
            int i2 = -(iD + 1);
            int[] iArr = this.d;
            int i3 = i2 + 1;
            System.arraycopy(iArr, i2, iArr, i3, this.b - i2);
            this.d[i2] = i;
            String[] strArr = this.c;
            System.arraycopy(strArr, i2, strArr, i3, this.b - i2);
            this.c[i2] = str;
            this.b++;
        }

        @Override // org.apache.commons.lang.b.a, org.apache.commons.lang.b.c
        public String b(int i) {
            int iD = d(i);
            if (iD < 0) {
                return null;
            }
            return this.c[iD];
        }

        public C1195b(int i) {
            super(i);
        }
    }

    public interface c {
        int a(String str);

        void add(String str, int i);

        String b(int i);
    }

    public static class d extends f {
        public d() {
            super(new HashMap(), new HashMap());
        }
    }

    public static class e extends g {
        private static final int d = 256;
        private String[] c;

        private void c() {
            this.c = new String[256];
            for (int i = 0; i < 256; i++) {
                this.c[i] = super.b(i);
            }
        }

        private String[] d() {
            if (this.c == null) {
                c();
            }
            return this.c;
        }

        @Override // org.apache.commons.lang.b.g, org.apache.commons.lang.b.c
        public String b(int i) {
            return i < 256 ? d()[i] : super.b(i);
        }
    }

    public static abstract class f implements c {
        public final Map a;
        public final Map b;

        public f(Map map, Map map2) {
            this.a = map;
            this.b = map2;
        }

        @Override // org.apache.commons.lang.b.c
        public int a(String str) {
            Object obj = this.a.get(str);
            if (obj == null) {
                return -1;
            }
            return ((Integer) obj).intValue();
        }

        @Override // org.apache.commons.lang.b.c
        public void add(String str, int i) {
            this.a.put(str, new Integer(i));
            this.b.put(new Integer(i), str);
        }

        @Override // org.apache.commons.lang.b.c
        public String b(int i) {
            return (String) this.b.get(new Integer(i));
        }
    }

    public static class g implements c {
        private final Map a = new HashMap();
        private final org.apache.commons.lang.c b = new org.apache.commons.lang.c();

        @Override // org.apache.commons.lang.b.c
        public int a(String str) {
            Object obj = this.a.get(str);
            if (obj == null) {
                return -1;
            }
            return ((Integer) obj).intValue();
        }

        @Override // org.apache.commons.lang.b.c
        public void add(String str, int i) {
            this.a.put(str, new Integer(i));
            this.b.g(i, str);
        }

        @Override // org.apache.commons.lang.b.c
        public String b(int i) {
            return (String) this.b.e(i);
        }
    }

    public static class h extends f {
        public h() {
            super(new TreeMap(), new TreeMap());
        }
    }

    static {
        String[][] strArr = {new String[]{"quot", "34"}, new String[]{"amp", "38"}, new String[]{"lt", PointType.WIND_COMMON}, new String[]{"gt", "62"}};
        b = strArr;
        String[][] strArr2 = {new String[]{"apos", "39"}};
        c = strArr2;
        String[][] strArr3 = {new String[]{"nbsp", "160"}, new String[]{"iexcl", "161"}, new String[]{"cent", "162"}, new String[]{"pound", "163"}, new String[]{"curren", "164"}, new String[]{"yen", "165"}, new String[]{"brvbar", "166"}, new String[]{"sect", "167"}, new String[]{"uml", "168"}, new String[]{"copy", "169"}, new String[]{"ordf", "170"}, new String[]{"laquo", "171"}, new String[]{"not", "172"}, new String[]{"shy", "173"}, new String[]{"reg", "174"}, new String[]{"macr", "175"}, new String[]{"deg", "176"}, new String[]{"plusmn", "177"}, new String[]{"sup2", "178"}, new String[]{"sup3", "179"}, new String[]{"acute", "180"}, new String[]{"micro", "181"}, new String[]{"para", "182"}, new String[]{"middot", "183"}, new String[]{"cedil", "184"}, new String[]{"sup1", "185"}, new String[]{"ordm", "186"}, new String[]{"raquo", "187"}, new String[]{"frac14", "188"}, new String[]{"frac12", "189"}, new String[]{"frac34", "190"}, new String[]{"iquest", "191"}, new String[]{"Agrave", "192"}, new String[]{"Aacute", "193"}, new String[]{"Acirc", "194"}, new String[]{"Atilde", "195"}, new String[]{"Auml", "196"}, new String[]{"Aring", "197"}, new String[]{"AElig", "198"}, new String[]{"Ccedil", "199"}, new String[]{"Egrave", "200"}, new String[]{"Eacute", "201"}, new String[]{"Ecirc", "202"}, new String[]{"Euml", "203"}, new String[]{"Igrave", "204"}, new String[]{"Iacute", "205"}, new String[]{"Icirc", "206"}, new String[]{"Iuml", "207"}, new String[]{"ETH", "208"}, new String[]{"Ntilde", "209"}, new String[]{"Ograve", "210"}, new String[]{"Oacute", "211"}, new String[]{"Ocirc", "212"}, new String[]{"Otilde", "213"}, new String[]{"Ouml", "214"}, new String[]{"times", "215"}, new String[]{"Oslash", "216"}, new String[]{"Ugrave", "217"}, new String[]{"Uacute", "218"}, new String[]{"Ucirc", "219"}, new String[]{"Uuml", "220"}, new String[]{"Yacute", "221"}, new String[]{"THORN", "222"}, new String[]{"szlig", "223"}, new String[]{"agrave", "224"}, new String[]{"aacute", "225"}, new String[]{"acirc", "226"}, new String[]{"atilde", "227"}, new String[]{"auml", "228"}, new String[]{"aring", "229"}, new String[]{"aelig", "230"}, new String[]{"ccedil", "231"}, new String[]{"egrave", "232"}, new String[]{"eacute", "233"}, new String[]{"ecirc", "234"}, new String[]{"euml", "235"}, new String[]{"igrave", "236"}, new String[]{"iacute", "237"}, new String[]{"icirc", "238"}, new String[]{"iuml", "239"}, new String[]{"eth", "240"}, new String[]{"ntilde", "241"}, new String[]{"ograve", "242"}, new String[]{"oacute", "243"}, new String[]{"ocirc", "244"}, new String[]{"otilde", "245"}, new String[]{"ouml", "246"}, new String[]{"divide", "247"}, new String[]{"oslash", "248"}, new String[]{"ugrave", "249"}, new String[]{"uacute", "250"}, new String[]{"ucirc", "251"}, new String[]{"uuml", "252"}, new String[]{"yacute", "253"}, new String[]{"thorn", "254"}, new String[]{"yuml", "255"}};
        d = strArr3;
        e = new String[][]{new String[]{"fnof", PointType.SIGMOB_CRASH}, new String[]{"Alpha", "913"}, new String[]{"Beta", "914"}, new String[]{ExifInterface.TAG_GAMMA, "915"}, new String[]{"Delta", "916"}, new String[]{"Epsilon", "917"}, new String[]{"Zeta", "918"}, new String[]{"Eta", "919"}, new String[]{"Theta", "920"}, new String[]{"Iota", "921"}, new String[]{"Kappa", "922"}, new String[]{"Lambda", "923"}, new String[]{"Mu", "924"}, new String[]{"Nu", "925"}, new String[]{"Xi", "926"}, new String[]{"Omicron", "927"}, new String[]{"Pi", "928"}, new String[]{"Rho", "929"}, new String[]{"Sigma", "931"}, new String[]{"Tau", "932"}, new String[]{"Upsilon", "933"}, new String[]{"Phi", "934"}, new String[]{"Chi", "935"}, new String[]{"Psi", "936"}, new String[]{"Omega", "937"}, new String[]{"alpha", "945"}, new String[]{"beta", "946"}, new String[]{"gamma", "947"}, new String[]{"delta", "948"}, new String[]{"epsilon", "949"}, new String[]{"zeta", "950"}, new String[]{"eta", "951"}, new String[]{"theta", "952"}, new String[]{"iota", "953"}, new String[]{"kappa", "954"}, new String[]{"lambda", "955"}, new String[]{"mu", "956"}, new String[]{"nu", "957"}, new String[]{"xi", "958"}, new String[]{"omicron", "959"}, new String[]{"pi", "960"}, new String[]{"rho", "961"}, new String[]{"sigmaf", "962"}, new String[]{"sigma", "963"}, new String[]{"tau", "964"}, new String[]{"upsilon", "965"}, new String[]{"phi", "966"}, new String[]{"chi", "967"}, new String[]{"psi", "968"}, new String[]{"omega", "969"}, new String[]{"thetasym", "977"}, new String[]{"upsih", "978"}, new String[]{"piv", "982"}, new String[]{"bull", "8226"}, new String[]{"hellip", "8230"}, new String[]{"prime", "8242"}, new String[]{"Prime", "8243"}, new String[]{"oline", "8254"}, new String[]{"frasl", "8260"}, new String[]{"weierp", "8472"}, new String[]{"image", "8465"}, new String[]{"real", "8476"}, new String[]{"trade", "8482"}, new String[]{"alefsym", "8501"}, new String[]{"larr", "8592"}, new String[]{"uarr", "8593"}, new String[]{"rarr", "8594"}, new String[]{"darr", "8595"}, new String[]{"harr", "8596"}, new String[]{"crarr", "8629"}, new String[]{"lArr", "8656"}, new String[]{"uArr", "8657"}, new String[]{"rArr", "8658"}, new String[]{"dArr", "8659"}, new String[]{"hArr", "8660"}, new String[]{"forall", "8704"}, new String[]{"part", "8706"}, new String[]{UpdateUtils.CONFIG_WATCH_ZIP_EXIST, "8707"}, new String[]{"empty", "8709"}, new String[]{"nabla", "8711"}, new String[]{"isin", "8712"}, new String[]{"notin", "8713"}, new String[]{"ni", "8715"}, new String[]{"prod", "8719"}, new String[]{"sum", "8721"}, new String[]{"minus", "8722"}, new String[]{"lowast", "8727"}, new String[]{"radic", "8730"}, new String[]{"prop", "8733"}, new String[]{"infin", "8734"}, new String[]{"ang", "8736"}, new String[]{SearchCriteria.AND, "8743"}, new String[]{SearchCriteria.OR, "8744"}, new String[]{"cap", "8745"}, new String[]{"cup", "8746"}, new String[]{"int", "8747"}, new String[]{"there4", "8756"}, new String[]{"sim", "8764"}, new String[]{"cong", "8773"}, new String[]{"asymp", "8776"}, new String[]{"ne", "8800"}, new String[]{"equiv", "8801"}, new String[]{"le", "8804"}, new String[]{UserDataStore.GENDER, "8805"}, new String[]{"sub", "8834"}, new String[]{"sup", "8835"}, new String[]{"sube", "8838"}, new String[]{"supe", "8839"}, new String[]{"oplus", "8853"}, new String[]{"otimes", "8855"}, new String[]{"perp", "8869"}, new String[]{"sdot", "8901"}, new String[]{"lceil", "8968"}, new String[]{"rceil", "8969"}, new String[]{"lfloor", "8970"}, new String[]{"rfloor", "8971"}, new String[]{"lang", ConstantKt.APP_CODE_HE_BEI}, new String[]{"rang", ConstantKt.APP_CODE_GUNAG_XI}, new String[]{"loz", "9674"}, new String[]{"spades", "9824"}, new String[]{"clubs", "9827"}, new String[]{"hearts", "9829"}, new String[]{"diams", "9830"}, new String[]{"OElig", "338"}, new String[]{"oelig", "339"}, new String[]{"Scaron", "352"}, new String[]{"scaron", "353"}, new String[]{"Yuml", "376"}, new String[]{"circ", "710"}, new String[]{"tilde", "732"}, new String[]{"ensp", "8194"}, new String[]{"emsp", "8195"}, new String[]{"thinsp", "8201"}, new String[]{"zwnj", "8204"}, new String[]{"zwj", "8205"}, new String[]{"lrm", "8206"}, new String[]{"rlm", "8207"}, new String[]{"ndash", "8211"}, new String[]{"mdash", "8212"}, new String[]{"lsquo", "8216"}, new String[]{"rsquo", "8217"}, new String[]{"sbquo", "8218"}, new String[]{"ldquo", "8220"}, new String[]{"rdquo", "8221"}, new String[]{"bdquo", "8222"}, new String[]{"dagger", "8224"}, new String[]{"Dagger", "8225"}, new String[]{"permil", "8240"}, new String[]{"lsaquo", "8249"}, new String[]{"rsaquo", "8250"}, new String[]{"euro", "8364"}};
        b bVar = new b();
        bVar.a(strArr);
        bVar.a(strArr2);
        f = bVar;
        b bVar2 = new b();
        bVar2.a(strArr);
        bVar2.a(strArr3);
        g = bVar2;
        b bVar3 = new b();
        i(bVar3);
        h = bVar3;
    }

    public b() {
        this.a = new e();
    }

    private StringWriter c(String str) {
        return new StringWriter((int) (((double) str.length()) + (((double) str.length()) * 0.1d)));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    private void d(Writer writer, String str, int i) throws IOException {
        int iF;
        writer.write(str, 0, i);
        int length = str.length();
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '&') {
                int i2 = i + 1;
                int iIndexOf = str.indexOf(59, i2);
                if (iIndexOf == -1) {
                    writer.write(cCharAt);
                } else {
                    int iIndexOf2 = str.indexOf(38, i2);
                    if (iIndexOf2 == -1 || iIndexOf2 >= iIndexOf) {
                        String strSubstring = str.substring(i2, iIndexOf);
                        int length2 = strSubstring.length();
                        if (length2 <= 0) {
                            iF = -1;
                        } else if (strSubstring.charAt(0) != '#') {
                            iF = f(strSubstring);
                        } else if (length2 <= 1) {
                            iF = -1;
                        } else {
                            char cCharAt2 = strSubstring.charAt(1);
                            if (cCharAt2 == 'X' || cCharAt2 == 'x') {
                                iF = Integer.parseInt(strSubstring.substring(2), 16);
                            } else {
                                try {
                                    iF = Integer.parseInt(strSubstring.substring(1), 10);
                                } catch (NumberFormatException unused) {
                                }
                            }
                            if (iF > 65535) {
                                iF = -1;
                            }
                        }
                        if (iF == -1) {
                            writer.write(38);
                            writer.write(strSubstring);
                            writer.write(59);
                        } else {
                            writer.write(iF);
                        }
                        i = iIndexOf;
                    } else {
                        writer.write(cCharAt);
                    }
                }
            } else {
                writer.write(cCharAt);
            }
            i++;
        }
    }

    public static void i(b bVar) {
        bVar.a(b);
        bVar.a(d);
        bVar.a(e);
    }

    public void a(String[][] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            b(strArr[i][0], Integer.parseInt(strArr[i][1]));
        }
    }

    public void b(String str, int i) {
        this.a.add(str, i);
    }

    public String e(int i) {
        return this.a.b(i);
    }

    public int f(String str) {
        return this.a.a(str);
    }

    public String g(String str) {
        StringWriter stringWriterC = c(str);
        try {
            h(stringWriterC, str);
            return stringWriterC.toString();
        } catch (IOException e2) {
            throw new UnhandledException(e2);
        }
    }

    public void h(Writer writer, String str) throws IOException {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            String strE = e(cCharAt);
            if (strE != null) {
                writer.write(38);
                writer.write(strE);
                writer.write(59);
            } else if (cCharAt > 127) {
                writer.write("&#");
                writer.write(Integer.toString(cCharAt, 10));
                writer.write(59);
            } else {
                writer.write(cCharAt);
            }
        }
    }

    public String j(String str) {
        int iIndexOf = str.indexOf(38);
        if (iIndexOf < 0) {
            return str;
        }
        StringWriter stringWriterC = c(str);
        try {
            d(stringWriterC, str, iIndexOf);
            return stringWriterC.toString();
        } catch (IOException e2) {
            throw new UnhandledException(e2);
        }
    }

    public void k(Writer writer, String str) throws IOException {
        int iIndexOf = str.indexOf(38);
        if (iIndexOf < 0) {
            writer.write(str);
        } else {
            d(writer, str, iIndexOf);
        }
    }

    public b(c cVar) {
        this.a = cVar;
    }

    public static class a implements c {
        public final int a;
        public int b;
        public String[] c;
        public int[] d;

        public a() {
            this.b = 0;
            this.a = 100;
            this.c = new String[100];
            this.d = new int[100];
        }

        @Override // org.apache.commons.lang.b.c
        public int a(String str) {
            for (int i = 0; i < this.b; i++) {
                if (this.c[i].equals(str)) {
                    return this.d[i];
                }
            }
            return -1;
        }

        @Override // org.apache.commons.lang.b.c
        public void add(String str, int i) {
            c(this.b + 1);
            String[] strArr = this.c;
            int i2 = this.b;
            strArr[i2] = str;
            this.d[i2] = i;
            this.b = i2 + 1;
        }

        @Override // org.apache.commons.lang.b.c
        public String b(int i) {
            for (int i2 = 0; i2 < this.b; i2++) {
                if (this.d[i2] == i) {
                    return this.c[i2];
                }
            }
            return null;
        }

        public void c(int i) {
            if (i > this.c.length) {
                int iMax = Math.max(i, this.b + this.a);
                String[] strArr = new String[iMax];
                System.arraycopy(this.c, 0, strArr, 0, this.b);
                this.c = strArr;
                int[] iArr = new int[iMax];
                System.arraycopy(this.d, 0, iArr, 0, this.b);
                this.d = iArr;
            }
        }

        public a(int i) {
            this.b = 0;
            this.a = i;
            this.c = new String[i];
            this.d = new int[i];
        }
    }
}
