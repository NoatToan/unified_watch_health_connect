package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class upr extends de {
    public static final ee A;
    public static final ee B;
    public static final ee C;
    public static final ee D;
    public static final ee E;
    public static final ee F;
    public static final ee G;
    public static final ee H;
    public static final ee I;
    public static final ee J;
    public static final ee K;
    public static final ee L;
    public static final ee M;
    public static final ee N;
    public static final ee O;
    public static boolean P;
    public static final Hashtable Q;
    public static final Hashtable R;
    public static final Hashtable S;
    public static final Hashtable T;
    public static final Hashtable U;
    public static final Hashtable V;
    public static final Boolean W;
    public static final Boolean X;
    public static final ee g;
    public static final ee h;
    public static final ee i;
    public static final ee j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ee f36008k;
    public static final ee l;
    public static final ee m;
    public static final ee n;
    public static final ee o;
    public static final ee p;
    public static final ee q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ee f36009r;
    public static final ee s;
    public static final ee t;
    public static final ee u;
    public static final ee v;
    public static final ee w;
    public static final ee x;
    public static final ee y;
    public static final ee z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Vector f36010a = new Vector();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Vector f36011b = new Vector();
    public Vector c = new Vector();
    public te d;
    public boolean e;
    public int f;

    static {
        ee eeVar = new ee("2.5.4.6");
        g = eeVar;
        ee eeVar2 = new ee("2.5.4.10");
        h = eeVar2;
        ee eeVar3 = new ee("2.5.4.11");
        i = eeVar3;
        ee eeVar4 = new ee("2.5.4.12");
        j = eeVar4;
        ee eeVar5 = new ee("2.5.4.3");
        f36008k = eeVar5;
        ee eeVar6 = new ee("2.5.4.5");
        l = eeVar6;
        ee eeVar7 = new ee("2.5.4.9");
        m = eeVar7;
        n = eeVar6;
        ee eeVar8 = new ee("2.5.4.7");
        o = eeVar8;
        ee eeVar9 = new ee("2.5.4.8");
        p = eeVar9;
        ee eeVar10 = new ee("2.5.4.4");
        q = eeVar10;
        ee eeVar11 = new ee("2.5.4.42");
        f36009r = eeVar11;
        ee eeVar12 = new ee("2.5.4.43");
        s = eeVar12;
        ee eeVar13 = new ee("2.5.4.44");
        t = eeVar13;
        ee eeVar14 = new ee("2.5.4.45");
        u = eeVar14;
        ee eeVar15 = new ee("2.5.4.15");
        v = eeVar15;
        ee eeVar16 = new ee("2.5.4.17");
        w = eeVar16;
        ee eeVar17 = new ee("2.5.4.46");
        x = eeVar17;
        ee eeVar18 = new ee("2.5.4.65");
        y = eeVar18;
        ee eeVar19 = new ee("1.3.6.1.5.5.7.9.1");
        z = eeVar19;
        ee eeVar20 = new ee("1.3.6.1.5.5.7.9.2");
        A = eeVar20;
        ee eeVar21 = new ee("1.3.6.1.5.5.7.9.3");
        B = eeVar21;
        ee eeVar22 = new ee("1.3.6.1.5.5.7.9.4");
        C = eeVar22;
        ee eeVar23 = new ee("1.3.6.1.5.5.7.9.5");
        D = eeVar23;
        ee eeVar24 = new ee("1.3.36.8.3.14");
        E = eeVar24;
        ee eeVar25 = new ee("2.5.4.16");
        F = eeVar25;
        G = new ee("2.5.4.54");
        ee eeVar26 = wpr.g;
        H = eeVar26;
        ee eeVar27 = wpr.h;
        I = eeVar27;
        ee eeVar28 = jgh.l7;
        J = eeVar28;
        ee eeVar29 = jgh.m7;
        K = eeVar29;
        ee eeVar30 = jgh.t7;
        L = eeVar30;
        M = eeVar28;
        ee eeVar31 = new ee("0.9.2342.19200300.100.1.25");
        N = eeVar31;
        ee eeVar32 = new ee("0.9.2342.19200300.100.1.1");
        O = eeVar32;
        P = false;
        Hashtable hashtable = new Hashtable();
        Q = hashtable;
        Hashtable hashtable2 = new Hashtable();
        R = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        S = hashtable3;
        Hashtable hashtable4 = new Hashtable();
        T = hashtable4;
        U = hashtable;
        V = hashtable4;
        W = new Boolean(true);
        X = new Boolean(false);
        hashtable.put(eeVar, "C");
        hashtable.put(eeVar2, "O");
        hashtable.put(eeVar4, "T");
        hashtable.put(eeVar3, "OU");
        hashtable.put(eeVar5, ServerConstants.NEW_CN_COUNTRY_CODE);
        hashtable.put(eeVar8, "L");
        hashtable.put(eeVar9, "ST");
        hashtable.put(eeVar6, "SERIALNUMBER");
        hashtable.put(eeVar28, "E");
        hashtable.put(eeVar31, "DC");
        hashtable.put(eeVar32, "UID");
        hashtable.put(eeVar7, "STREET");
        hashtable.put(eeVar10, "SURNAME");
        hashtable.put(eeVar11, "GIVENNAME");
        hashtable.put(eeVar12, "INITIALS");
        hashtable.put(eeVar13, "GENERATION");
        hashtable.put(eeVar30, "unstructuredAddress");
        hashtable.put(eeVar29, "unstructuredName");
        hashtable.put(eeVar14, "UniqueIdentifier");
        hashtable.put(eeVar17, "DN");
        hashtable.put(eeVar18, "Pseudonym");
        hashtable.put(eeVar25, "PostalAddress");
        hashtable.put(eeVar24, "NameAtBirth");
        hashtable.put(eeVar22, "CountryOfCitizenship");
        hashtable.put(eeVar23, "CountryOfResidence");
        hashtable.put(eeVar21, "Gender");
        hashtable.put(eeVar20, "PlaceOfBirth");
        hashtable.put(eeVar19, "DateOfBirth");
        hashtable.put(eeVar16, "PostalCode");
        hashtable.put(eeVar15, "BusinessCategory");
        hashtable.put(eeVar26, "TelephoneNumber");
        hashtable.put(eeVar27, "Name");
        hashtable2.put(eeVar, "C");
        hashtable2.put(eeVar2, "O");
        hashtable2.put(eeVar3, "OU");
        hashtable2.put(eeVar5, ServerConstants.NEW_CN_COUNTRY_CODE);
        hashtable2.put(eeVar8, "L");
        hashtable2.put(eeVar9, "ST");
        hashtable2.put(eeVar7, "STREET");
        hashtable2.put(eeVar31, "DC");
        hashtable2.put(eeVar32, "UID");
        hashtable3.put(eeVar, "C");
        hashtable3.put(eeVar2, "O");
        hashtable3.put(eeVar3, "OU");
        hashtable3.put(eeVar5, ServerConstants.NEW_CN_COUNTRY_CODE);
        hashtable3.put(eeVar8, "L");
        hashtable3.put(eeVar9, "ST");
        hashtable3.put(eeVar7, "STREET");
        hashtable4.put(PluginDeviceInfo.FICONON, eeVar);
        hashtable4.put(DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, eeVar2);
        hashtable4.put(DeviceTagInterface.CUSTOM_TAG_TYPE, eeVar4);
        hashtable4.put("ou", eeVar3);
        hashtable4.put("cn", eeVar5);
        hashtable4.put(e.f13808a, eeVar8);
        hashtable4.put("st", eeVar9);
        hashtable4.put("sn", eeVar6);
        hashtable4.put("serialnumber", eeVar6);
        hashtable4.put("street", eeVar7);
        hashtable4.put("emailaddress", eeVar28);
        hashtable4.put("dc", eeVar31);
        hashtable4.put(PluginDeviceInfo.FICONOFFLINE, eeVar28);
        hashtable4.put("uid", eeVar32);
        hashtable4.put("surname", eeVar10);
        hashtable4.put("givenname", eeVar11);
        hashtable4.put("initials", eeVar12);
        hashtable4.put("generation", eeVar13);
        hashtable4.put("unstructuredaddress", eeVar30);
        hashtable4.put("unstructuredname", eeVar29);
        hashtable4.put("uniqueidentifier", eeVar14);
        hashtable4.put("dn", eeVar17);
        hashtable4.put("pseudonym", eeVar18);
        hashtable4.put("postaladdress", eeVar25);
        hashtable4.put("nameofbirth", eeVar24);
        hashtable4.put("countryofcitizenship", eeVar22);
        hashtable4.put("countryofresidence", eeVar23);
        hashtable4.put("gender", eeVar21);
        hashtable4.put("placeofbirth", eeVar20);
        hashtable4.put("dateofbirth", eeVar19);
        hashtable4.put("postalcode", eeVar16);
        hashtable4.put("businesscategory", eeVar15);
        hashtable4.put("telephonenumber", eeVar26);
        hashtable4.put("name", eeVar27);
    }

    public upr() {
    }

    public static upr l(Object obj) {
        if (obj == null || (obj instanceof upr)) {
            return (upr) obj;
        }
        return obj instanceof mpr ? new upr(te.q(((mpr) obj).toASN1Primitive())) : new upr(te.q(obj));
    }

    @Override // defpackage.de
    public boolean equals(Object obj) {
        int i2;
        int i3;
        int i4;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof upr) && !(obj instanceof te)) {
            return false;
        }
        if (toASN1Primitive().equals(((hd) obj).toASN1Primitive())) {
            return true;
        }
        try {
            upr uprVarL = l(obj);
            int size = this.f36010a.size();
            if (size != uprVarL.f36010a.size()) {
                return false;
            }
            boolean[] zArr = new boolean[size];
            if (this.f36010a.elementAt(0).equals(uprVarL.f36010a.elementAt(0))) {
                i4 = 1;
                i3 = size;
                i2 = 0;
            } else {
                i2 = size - 1;
                i3 = -1;
                i4 = -1;
            }
            while (i2 != i3) {
                ee eeVar = (ee) this.f36010a.elementAt(i2);
                String str = (String) this.f36011b.elementAt(i2);
                for (int i5 = 0; i5 < size; i5++) {
                    if (!zArr[i5] && eeVar.equals((ee) uprVarL.f36010a.elementAt(i5)) && k(str, (String) uprVarL.f36011b.elementAt(i5))) {
                        zArr[i5] = true;
                        i2 += i4;
                    }
                }
                return false;
            }
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public final void g(StringBuffer stringBuffer, Hashtable hashtable, ee eeVar, String str) {
        String strU = (String) hashtable.get(eeVar);
        if (strU == null) {
            strU = eeVar.u();
        }
        stringBuffer.append(strU);
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (length < length2 && stringBuffer.charAt(length) == ' ') {
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 <= length || stringBuffer.charAt(length2) != ' ') {
                break;
            } else {
                stringBuffer.insert(length2, AbstractJsonLexerKt.STRING_ESC);
            }
        }
        while (length <= length2) {
            char cCharAt = stringBuffer.charAt(length);
            if (cCharAt != '\"' && cCharAt != '\\' && cCharAt != '+' && cCharAt != ',') {
                switch (cCharAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        length++;
                        break;
                }
            }
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
    }

    public final String h(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 != length; i2++) {
            cArr[i2] = (char) (bArr[i2] & 255);
        }
        return new String(cArr);
    }

    @Override // defpackage.de
    public int hashCode() {
        if (this.e) {
            return this.f;
        }
        this.e = true;
        for (int i2 = 0; i2 != this.f36010a.size(); i2++) {
            String strM = m(i((String) this.f36011b.elementAt(i2)));
            int iHashCode = this.f ^ this.f36010a.elementAt(i2).hashCode();
            this.f = iHashCode;
            this.f = strM.hashCode() ^ iHashCode;
        }
        return this.f;
    }

    public final String i(String str) {
        String strF = olo.f(str.trim());
        if (strF.length() <= 0 || strF.charAt(0) != '#') {
            return strF;
        }
        Object objJ = j(strF);
        return objJ instanceof df ? olo.f(((df) objJ).getString().trim()) : strF;
    }

    public final re j(String str) {
        try {
            return re.j(h7c.a(str.substring(1)));
        } catch (IOException e) {
            throw new IllegalStateException("unknown encoding in name: " + e);
        }
    }

    public final boolean k(String str, String str2) {
        String strI = i(str);
        String strI2 = i(str2);
        return strI.equals(strI2) || m(strI).equals(m(strI2));
    }

    public final String m(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char cCharAt = str.charAt(0);
            stringBuffer.append(cCharAt);
            int i2 = 1;
            while (i2 < str.length()) {
                char cCharAt2 = str.charAt(i2);
                if (cCharAt != ' ' || cCharAt2 != ' ') {
                    stringBuffer.append(cCharAt2);
                }
                i2++;
                cCharAt = cCharAt2;
            }
        }
        return stringBuffer.toString();
    }

    public String o(boolean z2, Hashtable hashtable) {
        StringBuffer stringBuffer = new StringBuffer();
        Vector vector = new Vector();
        StringBuffer stringBuffer2 = null;
        for (int i2 = 0; i2 < this.f36010a.size(); i2++) {
            if (((Boolean) this.c.elementAt(i2)).booleanValue()) {
                stringBuffer2.append('+');
                g(stringBuffer2, hashtable, (ee) this.f36010a.elementAt(i2), (String) this.f36011b.elementAt(i2));
            } else {
                stringBuffer2 = new StringBuffer();
                g(stringBuffer2, hashtable, (ee) this.f36010a.elementAt(i2), (String) this.f36011b.elementAt(i2));
                vector.addElement(stringBuffer2);
            }
        }
        boolean z3 = true;
        if (z2) {
            for (int size = vector.size() - 1; size >= 0; size--) {
                if (z3) {
                    z3 = false;
                } else {
                    stringBuffer.append(',');
                }
                stringBuffer.append(vector.elementAt(size).toString());
            }
        } else {
            for (int i3 = 0; i3 < vector.size(); i3++) {
                if (z3) {
                    z3 = false;
                } else {
                    stringBuffer.append(',');
                }
                stringBuffer.append(vector.elementAt(i3).toString());
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        if (this.d == null) {
            jd jdVar = new jd();
            jd jdVar2 = new jd();
            if (this.f36010a.size() != 0) {
                new jd().a((ee) this.f36010a.elementAt(0));
                throw null;
            }
            jdVar.a(new ch5(jdVar2));
            this.d = new yg5(jdVar);
        }
        return this.d;
    }

    public String toString() {
        return o(P, Q);
    }

    public upr(te teVar) {
        Vector vector;
        this.d = teVar;
        Enumeration enumerationU = teVar.u();
        while (enumerationU.hasMoreElements()) {
            xe xeVarR = xe.r(((hd) enumerationU.nextElement()).toASN1Primitive());
            int i2 = 0;
            while (i2 < xeVarR.size()) {
                te teVarQ = te.q(xeVarR.u(i2).toASN1Primitive());
                if (teVarQ.size() != 2) {
                    throw new IllegalArgumentException("badly sized pair");
                }
                this.f36010a.addElement(ee.w(teVarQ.t(0)));
                hd hdVarT = teVarQ.t(1);
                if (!(hdVarT instanceof df) || (hdVarT instanceof mh5)) {
                    try {
                        this.f36011b.addElement(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + h(h7c.b(hdVarT.toASN1Primitive().f(ASN1Encoding.DER))));
                    } catch (IOException unused) {
                        throw new IllegalArgumentException("cannot encode value");
                    }
                } else {
                    String string = ((df) hdVarT).getString();
                    if (string.length() <= 0 || string.charAt(0) != '#') {
                        vector = this.f36011b;
                    } else {
                        vector = this.f36011b;
                        string = "\\" + string;
                    }
                    vector.addElement(string);
                }
                this.c.addElement(i2 != 0 ? W : X);
                i2++;
            }
        }
    }
}
