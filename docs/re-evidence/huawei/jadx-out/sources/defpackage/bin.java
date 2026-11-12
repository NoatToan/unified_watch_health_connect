package defpackage;

import android.text.TextUtils;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import java.util.Locale;

/* JADX INFO: loaded from: classes23.dex */
public class bin {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f1130b = -1;

    public static boolean e() {
        if (f1130b == -1) {
            f1130b = (MLAsrConstants.LAN_ZH.equals(bio.a("ro.product.locale.language")) && "CN".equals(bio.a("ro.product.locale.region"))) ? 0 : 1;
        }
        return f1130b == 1;
    }

    public static String c() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        String script = locale.getScript();
        if (TextUtils.isEmpty(script) && TextUtils.isEmpty(variant)) {
            return language + "_" + country;
        }
        return language + "_" + script + "_" + country + "_" + variant;
    }
}
