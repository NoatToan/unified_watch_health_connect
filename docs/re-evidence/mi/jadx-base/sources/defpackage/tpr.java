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
public class tpr extends be {
    public static final fe A;
    public static final fe B;
    public static final fe C;
    public static final fe D;
    public static final fe E;
    public static final fe F;
    public static final fe G;
    public static final fe H;
    public static final fe I;
    public static final fe J;
    public static final fe K;
    public static final fe L;
    public static final fe M;
    public static final fe N;
    public static final fe O;
    public static boolean P;
    public static final Hashtable Q;
    public static final Hashtable R;
    public static final Hashtable S;
    public static final Hashtable T;
    public static final Hashtable U;
    public static final Hashtable V;
    public static final Boolean W;
    public static final Boolean X;
    public static final fe g;
    public static final fe h;
    public static final fe i;
    public static final fe j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final fe f34919k;
    public static final fe l;
    public static final fe m;
    public static final fe n;
    public static final fe o;
    public static final fe p;
    public static final fe q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final fe f34920r;
    public static final fe s;
    public static final fe t;
    public static final fe u;
    public static final fe v;
    public static final fe w;
    public static final fe x;
    public static final fe y;
    public static final fe z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Vector f34921a = new Vector();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Vector f34922b = new Vector();
    public Vector c = new Vector();
    public se d;
    public boolean e;
    public int f;

    static {
        fe feVar = new fe("2.5.4.6");
        g = feVar;
        fe feVar2 = new fe("2.5.4.10");
        h = feVar2;
        fe feVar3 = new fe("2.5.4.11");
        i = feVar3;
        fe feVar4 = new fe("2.5.4.12");
        j = feVar4;
        fe feVar5 = new fe("2.5.4.3");
        f34919k = feVar5;
        fe feVar6 = new fe("2.5.4.5");
        l = feVar6;
        fe feVar7 = new fe("2.5.4.9");
        m = feVar7;
        n = feVar6;
        fe feVar8 = new fe("2.5.4.7");
        o = feVar8;
        fe feVar9 = new fe("2.5.4.8");
        p = feVar9;
        fe feVar10 = new fe("2.5.4.4");
        q = feVar10;
        fe feVar11 = new fe("2.5.4.42");
        f34920r = feVar11;
        fe feVar12 = new fe("2.5.4.43");
        s = feVar12;
        fe feVar13 = new fe("2.5.4.44");
        t = feVar13;
        fe feVar14 = new fe("2.5.4.45");
        u = feVar14;
        fe feVar15 = new fe("2.5.4.15");
        v = feVar15;
        fe feVar16 = new fe("2.5.4.17");
        w = feVar16;
        fe feVar17 = new fe("2.5.4.46");
        x = feVar17;
        fe feVar18 = new fe("2.5.4.65");
        y = feVar18;
        fe feVar19 = new fe("1.3.6.1.5.5.7.9.1");
        z = feVar19;
        fe feVar20 = new fe("1.3.6.1.5.5.7.9.2");
        A = feVar20;
        fe feVar21 = new fe("1.3.6.1.5.5.7.9.3");
        B = feVar21;
        fe feVar22 = new fe("1.3.6.1.5.5.7.9.4");
        C = feVar22;
        fe feVar23 = new fe("1.3.6.1.5.5.7.9.5");
        D = feVar23;
        fe feVar24 = new fe("1.3.36.8.3.14");
        E = feVar24;
        fe feVar25 = new fe("2.5.4.16");
        F = feVar25;
        G = new fe("2.5.4.54");
        fe feVar26 = vpr.g;
        H = feVar26;
        fe feVar27 = vpr.h;
        I = feVar27;
        fe feVar28 = igh.v4;
        J = feVar28;
        fe feVar29 = igh.w4;
        K = feVar29;
        fe feVar30 = igh.D4;
        L = feVar30;
        M = feVar28;
        fe feVar31 = new fe("0.9.2342.19200300.100.1.25");
        N = feVar31;
        fe feVar32 = new fe("0.9.2342.19200300.100.1.1");
        O = feVar32;
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
        hashtable.put(feVar, "C");
        hashtable.put(feVar2, "O");
        hashtable.put(feVar4, "T");
        hashtable.put(feVar3, "OU");
        hashtable.put(feVar5, ServerConstants.NEW_CN_COUNTRY_CODE);
        hashtable.put(feVar8, "L");
        hashtable.put(feVar9, "ST");
        hashtable.put(feVar6, "SERIALNUMBER");
        hashtable.put(feVar28, "E");
        hashtable.put(feVar31, "DC");
        hashtable.put(feVar32, "UID");
        hashtable.put(feVar7, "STREET");
        hashtable.put(feVar10, "SURNAME");
        hashtable.put(feVar11, "GIVENNAME");
        hashtable.put(feVar12, "INITIALS");
        hashtable.put(feVar13, "GENERATION");
        hashtable.put(feVar30, "unstructuredAddress");
        hashtable.put(feVar29, "unstructuredName");
        hashtable.put(feVar14, "UniqueIdentifier");
        hashtable.put(feVar17, "DN");
        hashtable.put(feVar18, "Pseudonym");
        hashtable.put(feVar25, "PostalAddress");
        hashtable.put(feVar24, "NameAtBirth");
        hashtable.put(feVar22, "CountryOfCitizenship");
        hashtable.put(feVar23, "CountryOfResidence");
        hashtable.put(feVar21, "Gender");
        hashtable.put(feVar20, "PlaceOfBirth");
        hashtable.put(feVar19, "DateOfBirth");
        hashtable.put(feVar16, "PostalCode");
        hashtable.put(feVar15, "BusinessCategory");
        hashtable.put(feVar26, "TelephoneNumber");
        hashtable.put(feVar27, "Name");
        hashtable2.put(feVar, "C");
        hashtable2.put(feVar2, "O");
        hashtable2.put(feVar3, "OU");
        hashtable2.put(feVar5, ServerConstants.NEW_CN_COUNTRY_CODE);
        hashtable2.put(feVar8, "L");
        hashtable2.put(feVar9, "ST");
        hashtable2.put(feVar7, "STREET");
        hashtable2.put(feVar31, "DC");
        hashtable2.put(feVar32, "UID");
        hashtable3.put(feVar, "C");
        hashtable3.put(feVar2, "O");
        hashtable3.put(feVar3, "OU");
        hashtable3.put(feVar5, ServerConstants.NEW_CN_COUNTRY_CODE);
        hashtable3.put(feVar8, "L");
        hashtable3.put(feVar9, "ST");
        hashtable3.put(feVar7, "STREET");
        hashtable4.put(PluginDeviceInfo.FICONON, feVar);
        hashtable4.put(DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, feVar2);
        hashtable4.put(DeviceTagInterface.CUSTOM_TAG_TYPE, feVar4);
        hashtable4.put("ou", feVar3);
        hashtable4.put("cn", feVar5);
        hashtable4.put(e.f13808a, feVar8);
        hashtable4.put("st", feVar9);
        hashtable4.put("sn", feVar6);
        hashtable4.put("serialnumber", feVar6);
        hashtable4.put("street", feVar7);
        hashtable4.put("emailaddress", feVar28);
        hashtable4.put("dc", feVar31);
        hashtable4.put(PluginDeviceInfo.FICONOFFLINE, feVar28);
        hashtable4.put("uid", feVar32);
        hashtable4.put("surname", feVar10);
        hashtable4.put("givenname", feVar11);
        hashtable4.put("initials", feVar12);
        hashtable4.put("generation", feVar13);
        hashtable4.put("unstructuredaddress", feVar30);
        hashtable4.put("unstructuredname", feVar29);
        hashtable4.put("uniqueidentifier", feVar14);
        hashtable4.put("dn", feVar17);
        hashtable4.put("pseudonym", feVar18);
        hashtable4.put("postaladdress", feVar25);
        hashtable4.put("nameofbirth", feVar24);
        hashtable4.put("countryofcitizenship", feVar22);
        hashtable4.put("countryofresidence", feVar23);
        hashtable4.put("gender", feVar21);
        hashtable4.put("placeofbirth", feVar20);
        hashtable4.put("dateofbirth", feVar19);
        hashtable4.put("postalcode", feVar16);
        hashtable4.put("businesscategory", feVar15);
        hashtable4.put("telephonenumber", feVar26);
        hashtable4.put("name", feVar27);
    }

    public tpr() {
    }

    public static tpr l(Object obj) {
        if (obj == null || (obj instanceof tpr)) {
            return (tpr) obj;
        }
        return obj instanceof lpr ? new tpr(se.q(((lpr) obj).toASN1Primitive())) : new tpr(se.q(obj));
    }

    @Override // defpackage.be
    public boolean equals(Object obj) {
        int i2;
        int i3;
        int i4;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tpr) && !(obj instanceof se)) {
            return false;
        }
        if (toASN1Primitive().equals(((gd) obj).toASN1Primitive())) {
            return true;
        }
        try {
            tpr tprVarL = l(obj);
            int size = this.f34921a.size();
            if (size != tprVarL.f34921a.size()) {
                return false;
            }
            boolean[] zArr = new boolean[size];
            if (this.f34921a.elementAt(0).equals(tprVarL.f34921a.elementAt(0))) {
                i4 = 1;
                i3 = size;
                i2 = 0;
            } else {
                i2 = size - 1;
                i3 = -1;
                i4 = -1;
            }
            while (i2 != i3) {
                fe feVar = (fe) this.f34921a.elementAt(i2);
                String str = (String) this.f34922b.elementAt(i2);
                for (int i5 = 0; i5 < size; i5++) {
                    if (!zArr[i5] && feVar.equals((fe) tprVarL.f34921a.elementAt(i5)) && k(str, (String) tprVarL.f34922b.elementAt(i5))) {
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

    public final void g(StringBuffer stringBuffer, Hashtable hashtable, fe feVar, String str) {
        String str2 = (String) hashtable.get(feVar);
        if (str2 != null) {
            stringBuffer.append(str2);
        } else {
            stringBuffer.append(feVar.u());
        }
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

    @Override // defpackage.be
    public int hashCode() {
        if (this.e) {
            return this.f;
        }
        this.e = true;
        for (int i2 = 0; i2 != this.f34921a.size(); i2++) {
            String strM = m(i((String) this.f34922b.elementAt(i2)));
            int iHashCode = this.f ^ this.f34921a.elementAt(i2).hashCode();
            this.f = iHashCode;
            this.f = strM.hashCode() ^ iHashCode;
        }
        return this.f;
    }

    public final String i(String str) {
        String strF = plo.f(str.trim());
        if (strF.length() <= 0 || strF.charAt(0) != '#') {
            return strF;
        }
        Object objJ = j(strF);
        return objJ instanceof cf ? plo.f(((cf) objJ).getString().trim()) : strF;
    }

    public final pe j(String str) {
        try {
            return pe.j(i7c.a(str.substring(1)));
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
        for (int i2 = 0; i2 < this.f34921a.size(); i2++) {
            if (((Boolean) this.c.elementAt(i2)).booleanValue()) {
                stringBuffer2.append('+');
                g(stringBuffer2, hashtable, (fe) this.f34921a.elementAt(i2), (String) this.f34922b.elementAt(i2));
            } else {
                stringBuffer2 = new StringBuffer();
                g(stringBuffer2, hashtable, (fe) this.f34921a.elementAt(i2), (String) this.f34922b.elementAt(i2));
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

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        if (this.d == null) {
            id idVar = new id();
            id idVar2 = new id();
            if (this.f34921a.size() != 0) {
                new id().a((fe) this.f34921a.elementAt(0));
                throw null;
            }
            idVar.a(new bh5(idVar2));
            this.d = new xg5(idVar);
        }
        return this.d;
    }

    public String toString() {
        return o(P, Q);
    }

    public tpr(se seVar) {
        this.d = seVar;
        Enumeration enumerationU = seVar.u();
        while (enumerationU.hasMoreElements()) {
            we weVarR = we.r(((gd) enumerationU.nextElement()).toASN1Primitive());
            int i2 = 0;
            while (i2 < weVarR.size()) {
                se seVarQ = se.q(weVarR.u(i2).toASN1Primitive());
                if (seVarQ.size() == 2) {
                    this.f34921a.addElement(fe.w(seVarQ.t(0)));
                    gd gdVarT = seVarQ.t(1);
                    if ((gdVarT instanceof cf) && !(gdVarT instanceof lh5)) {
                        String string = ((cf) gdVarT).getString();
                        if (string.length() > 0 && string.charAt(0) == '#') {
                            this.f34922b.addElement("\\" + string);
                        } else {
                            this.f34922b.addElement(string);
                        }
                    } else {
                        try {
                            this.f34922b.addElement(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + h(i7c.b(gdVarT.toASN1Primitive().f(ASN1Encoding.DER))));
                        } catch (IOException unused) {
                            throw new IllegalArgumentException("cannot encode value");
                        }
                    }
                    this.c.addElement(i2 != 0 ? W : X);
                    i2++;
                } else {
                    throw new IllegalArgumentException("badly sized pair");
                }
            }
        }
    }
}
