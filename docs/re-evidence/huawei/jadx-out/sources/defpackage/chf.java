package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class chf {
    public static String b() {
        Locale locale = BaseApplication.getContext().getResources().getConfiguration().locale;
        if (locale == null) {
            LogUtil.j("Track_MultiLanguageMap", "acquireLanguagePostFix(), locale == null");
            return null;
        }
        return pjn.b(locale);
    }

    public static String a() {
        String strA = a(b());
        if (strA != null) {
            return strA;
        }
        LogUtil.j("Track_MultiLanguageMap", "acquireLanguagePostFix get null");
        return ProfileRequestConstants.X_LANGUAGE_VALUE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    private static String a(String str) {
        if (str == null) {
            return null;
        }
        str.hashCode();
        switch (str) {
            case "b+my+Qaag":
                return "my-ZG";
            case "az":
                return "az-AZ";
            case "eu":
                return "eu-ES";
            case "gl":
                return "gl-ES";
            case "ka":
                return "ka-GE";
            case "kk":
                return "kk-KZ";
            case "km":
                return "km-KH";
            case "lo":
                return "lo-LA";
            case "my":
                return "my-MM";
            case "pt":
                return "pt-PT";
            case "si":
                return "si-LK";
            case "uz":
                return "uz-UZ";
            default:
                return str;
        }
    }
}
