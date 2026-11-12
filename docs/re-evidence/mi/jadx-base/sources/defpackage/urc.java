package defpackage;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Encoding;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.IOException;
import java.util.Hashtable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class urc {
    public static void a(StringBuffer stringBuffer, r6j r6jVar, Hashtable hashtable) {
        if (!r6jVar.j()) {
            if (r6jVar.g() != null) {
                b(stringBuffer, r6jVar.g(), hashtable);
                return;
            }
            return;
        }
        im1[] im1VarArrI = r6jVar.i();
        boolean z = true;
        for (int i = 0; i != im1VarArrI.length; i++) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append('+');
            }
            b(stringBuffer, im1VarArrI[i], hashtable);
        }
    }

    public static void b(StringBuffer stringBuffer, im1 im1Var, Hashtable hashtable) {
        String str = (String) hashtable.get(im1Var.h());
        if (str != null) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append(im1Var.h().u());
        }
        stringBuffer.append('=');
        stringBuffer.append(i(im1Var.i()));
    }

    public static boolean c(im1 im1Var, im1 im1Var2) {
        if (im1Var == im1Var2) {
            return true;
        }
        return im1Var != null && im1Var2 != null && im1Var.h().equals(im1Var2.h()) && e(i(im1Var.i())).equals(e(i(im1Var2.i())));
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
        String strF = plo.f(str);
        int i = 0;
        if (strF.length() > 0 && strF.charAt(0) == '#') {
            Object objF = f(strF);
            if (objF instanceof cf) {
                strF = plo.f(((cf) objF).getString());
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

    public static pe f(String str) {
        try {
            return pe.j(i7c.a(str.substring(1)));
        } catch (IOException e) {
            throw new IllegalStateException("unknown encoding in name: " + e);
        }
    }

    public static boolean g(r6j r6jVar, r6j r6jVar2) {
        if (!r6jVar.j()) {
            if (r6jVar2.j()) {
                return false;
            }
            return c(r6jVar.g(), r6jVar2.g());
        }
        if (!r6jVar2.j()) {
            return false;
        }
        im1[] im1VarArrI = r6jVar.i();
        im1[] im1VarArrI2 = r6jVar2.i();
        if (im1VarArrI.length != im1VarArrI2.length) {
            return false;
        }
        for (int i = 0; i != im1VarArrI.length; i++) {
            if (!c(im1VarArrI[i], im1VarArrI2[i])) {
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

    public static String i(gd gdVar) {
        StringBuffer stringBuffer = new StringBuffer();
        if (!(gdVar instanceof cf) || (gdVar instanceof lh5)) {
            try {
                stringBuffer.append(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + d(i7c.b(gdVar.toASN1Primitive().f(ASN1Encoding.DER))));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String string = ((cf) gdVar).getString();
            if (string.length() <= 0 || string.charAt(0) != '#') {
                stringBuffer.append(string);
            } else {
                stringBuffer.append("\\" + string);
            }
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
