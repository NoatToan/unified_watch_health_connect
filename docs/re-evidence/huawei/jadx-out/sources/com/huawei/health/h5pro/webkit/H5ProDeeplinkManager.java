package com.huawei.health.h5pro.webkit;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes.dex */
public class H5ProDeeplinkManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f7025b = new Object();
    private static H5ProDeeplinkInterceptor d;

    public interface H5ProDeeplinkInterceptor {
        boolean jumpFromDeeplink(Context context, String str, String str2);
    }

    private H5ProDeeplinkManager() {
    }

    public static void setDeeplinkInterceptor(H5ProDeeplinkInterceptor h5ProDeeplinkInterceptor) {
        synchronized (f7025b) {
            d = h5ProDeeplinkInterceptor;
        }
    }

    public static void jumpFromDeeplink(Context context, String str) {
        jumpFromDeeplink(context, str, "");
    }

    public static void jumpFromDeeplink(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.w("H5PRO_H5ProDeeplinkManager", "jumpFromDeeplink: deeplink is empty");
            return;
        }
        if (context == null) {
            LogUtil.w("H5PRO_H5ProDeeplinkManager", "jumpFromDeeplink: context is null");
            return;
        }
        synchronized (f7025b) {
            H5ProDeeplinkInterceptor h5ProDeeplinkInterceptor = d;
            if (h5ProDeeplinkInterceptor == null || !h5ProDeeplinkInterceptor.jumpFromDeeplink(context, str, str2)) {
                try {
                    Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
                    if (!TextUtils.isEmpty(str2)) {
                        intent.setPackage(str2);
                    }
                    intent.setFlags(268435456);
                    context.startActivity(intent);
                } catch (ActivityNotFoundException | IllegalArgumentException e) {
                    LogUtil.e("H5PRO_H5ProDeeplinkManager", "jumpFromDeeplink: exception -> " + e.getMessage());
                }
            }
        }
    }
}
