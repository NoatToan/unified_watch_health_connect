package defpackage;

import android.text.TextUtils;
import com.huawei.operation.utils.Constants;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes3.dex */
public class npj {
    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String scheme = new URI(str.trim().replaceAll(" ", Constants.PERCENT_20).replaceAll("\\^", "%5E")).getScheme();
            return scheme == null ? "" : scheme;
        } catch (URISyntaxException unused) {
            nox.b("UriUtils", "URISyntaxException", true);
            return "";
        }
    }
}
