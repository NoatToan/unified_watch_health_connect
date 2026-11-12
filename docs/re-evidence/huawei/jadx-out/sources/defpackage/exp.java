package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.webkit.trustlist.H5ProTrustListChecker;
import com.huawei.operation.utils.Constants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
class exp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f33644a = false;
    private Pattern e;

    exp() {
    }

    private void c(Context context) {
        if (this.e == null) {
            this.e = Pattern.compile("^(/data/)((data)|(user/[0-9]))/" + context.getPackageName() + "/files/((achievemedalpng)|(achievemedal))/");
        }
    }

    private String d(String str) {
        return TextUtils.isEmpty(str) ? str : GeneralUtil.getFileSafePath(str.replace(Constants.ANNUAL_MEDAL_PATH_PREFIX_COMMON, "").replace(Constants.ANNUAL_MEDAL_PATH_PREFIX, ""));
    }

    boolean b(H5ProAppInfo h5ProAppInfo, String str, String str2, Context context) {
        if (TextUtils.isEmpty(str2) || (!str2.startsWith(Constants.ANNUAL_MEDAL_PATH_PREFIX_COMMON) && !str2.startsWith(Constants.ANNUAL_MEDAL_PATH_PREFIX))) {
            this.f33644a = false;
            return false;
        }
        if (!H5ProTrustListChecker.isTrusted(h5ProAppInfo, str)) {
            this.f33644a = false;
            return false;
        }
        c(context);
        boolean zFind = this.e.matcher(d(str2)).find();
        this.f33644a = zFind;
        return zFind;
    }

    WebResourceResponse e(String str) {
        if (!this.f33644a) {
            return null;
        }
        try {
            String strD = d(str);
            if (!GeneralUtil.isSafePath(strD)) {
                LogUtil.w("H5PRO_AnnualReportAdaptation", "getAnnualMedalResourceResponse: invalid path");
                return null;
            }
            return new WebResourceResponse("image/png", StandardCharsets.UTF_8.name(), new FileInputStream(strD));
        } catch (FileNotFoundException e) {
            LogUtil.w("H5PRO_AnnualReportAdaptation", "getAnnualMedalResourceResponse: " + e.getMessage());
        }
    }
}
