package com.huawei.health.h5pro.webkit.trustlist;

import android.text.TextUtils;
import com.huawei.health.h5pro.utils.EnvironmentHelper;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.health.h5pro.webkit.WebKitUtil;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class H5ProTrustListChecker {
    private static b d;

    private H5ProTrustListChecker() {
    }

    public static void setTrustListChecker(TrustListChecker trustListChecker) {
        LogUtil.i("H5PRO_H5ProTrustListChecker", "setTrustListChecker");
        d = new b(trustListChecker);
    }

    public static boolean isTrusted(H5ProInstance h5ProInstance) {
        if (h5ProInstance == null) {
            LogUtil.w("H5PRO_H5ProTrustListChecker", "isTrusted: h5ProInstance is null");
            return false;
        }
        return isTrusted(h5ProInstance.getAppInfo(), h5ProInstance.getUrl());
    }

    public static boolean isTrusted(H5ProAppInfo h5ProAppInfo, String str) {
        b bVar = d;
        if (bVar == null) {
            LogUtil.w("H5PRO_H5ProTrustListChecker", "isTrusted: sTrustListCheckerProxy is null");
            return false;
        }
        return bVar.isTrusted(h5ProAppInfo, str);
    }

    public static boolean isTrustedToLoad(String str) {
        b bVar = d;
        if (bVar == null) {
            LogUtil.w("H5PRO_H5ProTrustListChecker", "isTrustedToLoad: sTrustListCheckerProxy is null");
            return false;
        }
        return bVar.isTrustedToLoad(str);
    }

    public static boolean isRequestProxyNeeded(String str) {
        b bVar = d;
        if (bVar == null) {
            LogUtil.w("H5PRO_H5ProTrustListChecker", "isRequestProxyNeeded: sTrustListCheckerProxy is null");
            return false;
        }
        return bVar.isRequestProxyNeeded(str);
    }

    public static boolean isWeChatPayUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.w("H5PRO_H5ProTrustListChecker", "isWeChatPayUrl#isWeChatPayUrl: sTrustListCheckerProxy is null");
            return false;
        }
        b bVar = d;
        if (bVar == null) {
            LogUtil.w("H5PRO_H5ProTrustListChecker", "isWeChatPayUrl: sTrustListCheckerProxy is null");
            return false;
        }
        return bVar.isWeChatPayUrl(str);
    }

    public static boolean disableHttpLoad(String str) {
        if (EnvironmentHelper.getInstance().getBuildType() == EnvironmentHelper.BuildType.RELEASE || EnvironmentHelper.getInstance().getBuildType() == EnvironmentHelper.BuildType.BETA) {
            return WebKitUtil.isHttpUrl(str);
        }
        return false;
    }

    /* JADX INFO: loaded from: classes7.dex */
    static class b implements TrustListChecker {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Pattern f7052b = Pattern.compile("javascript|&#|%26%23|%24|%60|(\\.{2}/)|[$()<>'`]");
        private final TrustListChecker d;

        b(TrustListChecker trustListChecker) {
            this.d = trustListChecker;
        }

        @Override // com.huawei.health.h5pro.webkit.trustlist.TrustListChecker
        public boolean isTrusted(H5ProAppInfo h5ProAppInfo, String str) {
            if (this.d == null) {
                LogUtil.w("H5PRO_H5ProTrustListChecker", "TrustListCheckerProxy#isTrusted: Checker not implemented");
                return false;
            }
            if (h5ProAppInfo == null || TextUtils.isEmpty(str)) {
                LogUtil.w("H5PRO_H5ProTrustListChecker", "TrustListCheckerProxy#isTrusted: h5ProAppInfo or url is null");
                return false;
            }
            if (d(str)) {
                LogUtil.w("H5PRO_H5ProTrustListChecker", "TrustListCheckerProxy#isTrusted: url cannot contain Xss");
                return false;
            }
            if (H5ProTrustListChecker.disableHttpLoad(str)) {
                LogUtil.w("H5PRO_H5ProTrustListChecker", "TrustListCheckerProxy#isTrusted: disableHttpLoad");
                return false;
            }
            return this.d.isTrusted(h5ProAppInfo, str);
        }

        @Override // com.huawei.health.h5pro.webkit.trustlist.TrustListChecker
        public boolean isTrustedToLoad(String str) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.w("H5PRO_H5ProTrustListChecker", "TrustListCheckerProxy#isTrustedToLoad: url is null");
                return false;
            }
            if (d(str)) {
                LogUtil.w("H5PRO_H5ProTrustListChecker", "TrustListCheckerProxy#isTrustedToLoad: url cannot contain Xss");
                return false;
            }
            if (H5ProTrustListChecker.disableHttpLoad(str)) {
                LogUtil.w("H5PRO_H5ProTrustListChecker", "TrustListCheckerProxy#isTrustedToLoad: disableHttpLoad");
                return false;
            }
            return this.d.isTrustedToLoad(str);
        }

        private boolean d(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return f7052b.matcher(str.toLowerCase(Locale.ENGLISH)).find();
        }

        @Override // com.huawei.health.h5pro.webkit.trustlist.TrustListChecker
        public boolean isRequestProxyNeeded(String str) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.w("H5PRO_H5ProTrustListChecker", "TrustListCheckerProxy#isRequestProxyNeeded: url is null");
                return false;
            }
            return this.d.isRequestProxyNeeded(str);
        }

        @Override // com.huawei.health.h5pro.webkit.trustlist.TrustListChecker
        public boolean isWeChatPayUrl(String str) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.w("H5PRO_H5ProTrustListChecker", "TrustListCheckerProxy#isWeChatPayUrl: url is null");
                return false;
            }
            return this.d.isWeChatPayUrl(str);
        }
    }
}
