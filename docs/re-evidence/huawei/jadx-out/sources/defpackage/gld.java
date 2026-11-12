package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.Locale;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes29.dex */
public class gld {
    public static String d() {
        Locale locale = BaseApplication.getContext().getResources().getConfiguration().locale;
        if (locale == null) {
            LogUtil.j("Track_MultiLanguageMap", "acquireLanguagePostFix(), locale == null");
            return null;
        }
        return pjn.b(locale);
    }

    public static String b() {
        String strD = d();
        if (strD == null || "zh-CN".equals(strD)) {
            return "";
        }
        return "_" + strD.replace(Marker.ANY_NON_NULL_MARKER, "_").replace(Constants.LINK, "_");
    }

    public static String d(String str) {
        if (str == null || "zh-CN".equals(str)) {
            return "";
        }
        return "_" + str.replace(Marker.ANY_NON_NULL_MARKER, "_").replace(Constants.LINK, "_");
    }
}
