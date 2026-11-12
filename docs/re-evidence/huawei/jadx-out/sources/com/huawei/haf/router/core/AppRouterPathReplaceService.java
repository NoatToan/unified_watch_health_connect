package com.huawei.haf.router.core;

import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.router.facade.service.PathReplaceService;
import health.compact.a.LogConfig;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
final class AppRouterPathReplaceService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PathReplaceService f6043a = (PathReplaceService) AppRouterHelper.a(PathReplaceService.class);

    AppRouterPathReplaceService() {
    }

    String e(String str) {
        String strB = AppRouterHelper.d().b(str);
        if (TextUtils.isEmpty(strB)) {
            strB = a(str);
        }
        if (!str.equals(strB)) {
            LogUtil.b("HAF_PathReplace", "forString: ", str, " --> ", strB);
        }
        return strB;
    }

    Uri d(Uri uri) {
        Uri uriC = AppRouterHelper.d().c(uri);
        if (uriC == null) {
            uriC = e(uri);
        }
        if (uri != uriC && !uri.equals(uriC)) {
            if (LogConfig.b(1)) {
                LogUtil.c("HAF_PathReplace", "forUri: ", uri, " --> ", uriC);
                return uriC;
            }
            LogUtil.b("HAF_PathReplace", "forUri: ", uri.getPath(), " --> ", uriC.getPath());
        }
        return uriC;
    }

    private String a(String str) {
        PathReplaceService pathReplaceService = this.f6043a;
        return pathReplaceService != null ? pathReplaceService.forString(str) : str;
    }

    private Uri e(Uri uri) {
        PathReplaceService pathReplaceService = this.f6043a;
        return pathReplaceService != null ? pathReplaceService.forUri(uri) : uri;
    }
}
