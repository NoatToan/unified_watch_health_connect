package defpackage;

import android.webkit.MimeTypeMap;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes.dex */
public class yxf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f40665a = "application/octet-stream";

    public static String a(String str) {
        if (str != null) {
            return str.equals(f40665a) ? TSMAuthContants.PARAM_CARD_BIN : MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        }
        return "";
    }

    public static String b(String str, String str2) {
        String strA = a(str2);
        if (strA.isEmpty() || str.endsWith(".ext")) {
            return str;
        }
        String str3 = str + "." + strA;
        return str3.endsWith(".") ? mlo.d(str3, ".") : str3;
    }
}
