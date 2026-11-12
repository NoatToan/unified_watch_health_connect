package defpackage;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.IOException;
import java.util.Hashtable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class vrc {
    public static void a(StringBuffer stringBuffer, s6j s6jVar, Hashtable hashtable) {
        if (!s6jVar.j()) {
            if (s6jVar.g() != null) {
                b(stringBuffer, s6jVar.g(), hashtable);
                return;
            }
            return;
        }
        jm1[] jm1VarArrI = s6jVar.i();
        boolean z = true;
        for (int i = 0; i != jm1VarArrI.length; i++) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append('+');
            }
            b(stringBuffer, jm1VarArrI[i], hashtable);
        }
    }

    public static void b(StringBuffer stringBuffer, jm1 jm1Var, Hashtable hashtable) {
        String strU = (String) hashtable.get(jm1Var.h());
        if (strU == null) {
            strU = jm1Var.h().u();
        }
        stringBuffer.append(strU);
        stringBuffer.append('=');
        stringBuffer.append(i(jm1Var.i()));
    }

    public static boolean c(jm1 jm1Var, jm1 jm1Var2) {
        if (jm1Var == jm1Var2) {
            return true;
        }
        return jm1Var != null && jm1Var2 != null && jm1Var.h().equals(jm1Var2.h()) && e(i(jm1Var.i())).equals(e(i(jm1Var2.i())));
    }

    public static String d(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    public static String e(String str) {
        String strF = olo.f(str);
        int i = 0;
        if (strF.length() > 0 && strF.charAt(0) == '#') {
            Object objF = f(strF);
            if (objF instanceof df) {
                strF = olo.f(((df) objF).getString());
            }
        }
        if (strF.length() > 1) {
            while (true) {
                int i2 = i + 1;
                if (i2 >= strF.length() || strF.charAt(i) != '\\' || strF.charAt(i2) != ' ') {
                    break;
                }
                i += 2;
            }
            int length = strF.length() - 1;
            while (true) {
                int i3 = length - 1;
                if (i3 <= 0 || strF.charAt(i3) != '\\' || strF.charAt(length) != ' ') {
                    break;
                }
                length -= 2;
            }
            if (i > 0 || length < strF.length() - 1) {
                strF = strF.substring(i, length + 1);
            }
        }
        return h(strF);
    }

    public static re f(String str) {
        try {
            return re.j(h7c.a(str.substring(1)));
        } catch (IOException e) {
            throw new IllegalStateException("unknown encoding in name: " + e);
        }
    }

    public static boolean g(s6j s6jVar, s6j s6jVar2) {
        if (!s6jVar.j()) {
            if (s6jVar2.j()) {
                return false;
            }
            return c(s6jVar.g(), s6jVar2.g());
        }
        if (!s6jVar2.j()) {
            return false;
        }
        jm1[] jm1VarArrI = s6jVar.i();
        jm1[] jm1VarArrI2 = s6jVar2.i();
        if (jm1VarArrI.length != jm1VarArrI2.length) {
            return false;
        }
        for (int i = 0; i != jm1VarArrI.length; i++) {
            if (!c(jm1VarArrI[i], jm1VarArrI2[i])) {
                return false;
            }
        }
        return true;
    }

    public static String h(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char cCharAt = str.charAt(0);
            stringBuffer.append(cCharAt);
            int i = 1;
            while (i < str.length()) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt != ' ' || cCharAt2 != ' ') {
                    stringBuffer.append(cCharAt2);
                }
                i++;
                cCharAt = cCharAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static String i(hd hdVar) {
        StringBuffer stringBuffer = new StringBuffer();
        if (!(hdVar instanceof df) || (hdVar instanceof mh5)) {
            try {
                stringBuffer.append(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + d(h7c.b(hdVar.toASN1Primitive().f(ASN1Encoding.DER))));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String string = ((df) hdVar).getString();
            if (string.length() > 0 && string.charAt(0) == '#') {
                string = "\\" + string;
            }
            stringBuffer.append(string);
        }
        int length = stringBuffer.length();
        int i = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 2 : 0;
        while (i != length) {
            if (stringBuffer.charAt(i) == ',' || stringBuffer.charAt(i) == '\"' || stringBuffer.charAt(i) == '\\' || stringBuffer.charAt(i) == '+' || stringBuffer.charAt(i) == '=' || stringBuffer.charAt(i) == '<' || stringBuffer.charAt(i) == '>' || stringBuffer.charAt(i) == ';') {
                stringBuffer.insert(i, "\\");
                i++;
                length++;
            }
            i++;
        }
        if (stringBuffer.length() > 0) {
            for (int i2 = 0; stringBuffer.length() > i2 && stringBuffer.charAt(i2) == ' '; i2 += 2) {
                stringBuffer.insert(i2, "\\");
            }
        }
        for (int length2 = stringBuffer.length() - 1; length2 >= 0 && stringBuffer.charAt(length2) == ' '; length2--) {
            stringBuffer.insert(length2, AbstractJsonLexerKt.STRING_ESC);
        }
        return stringBuffer.toString();
    }
}
