package com.huawei.hms.support.hwid.service;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.hwid.bean.CheckPasswordByUserIdReq;
import com.huawei.hms.support.hwid.common.cloudservice.CloudRequestHandler;
import com.huawei.hms.support.hwid.common.e.c;
import com.huawei.hms.support.hwid.common.e.e;
import com.huawei.hms.support.hwid.result.d;
import com.huawei.hwid.core.helper.handler.ErrorStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f16651a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f16652b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<Integer> f16653c = new ArrayList(Arrays.asList(1, 5, 7, 8));

    public static void a(final Context context, final CheckPasswordByUserIdReq checkPasswordByUserIdReq, final CloudRequestHandler cloudRequestHandler) {
        if (checkPasswordByUserIdReq == null || context == null || cloudRequestHandler == null) {
            e.b("CloudAccountImpl", "checkPasswordByUserId: request parameter is null");
            return;
        }
        f16652b = checkPasswordByUserIdReq.getPackageName();
        if (!a(checkPasswordByUserIdReq.getUserId(), checkPasswordByUserIdReq.getPassword(), checkPasswordByUserIdReq.getPackageName(), checkPasswordByUserIdReq.getDeviceId(), checkPasswordByUserIdReq.getDeviceType(), context, checkPasswordByUserIdReq.getSiteId())) {
            e.a("CloudAccountImpl", "the params is invalid.");
            cloudRequestHandler.onError(new ErrorStatus(2003, "the params is invalid."));
            return;
        }
        if (com.huawei.hms.support.hwid.common.e.b.a(checkPasswordByUserIdReq.getAccountType())) {
            cloudRequestHandler.onError(new ErrorStatus(2026, "third account is not allowed to verify password"));
            e.a("CloudAccountImpl", "third account is not allowed to verify password");
            return;
        }
        if (!com.huawei.hms.support.hwid.common.e.b.a(context)) {
            cloudRequestHandler.onError(new ErrorStatus(2005, "Network is Unavailable"));
            e.b("CloudAccountImpl", "Network Unavailable");
            return;
        }
        if (!com.huawei.hms.support.hwid.common.e.b.f(context)) {
            e.a("CloudAccountImpl", "checkIsUseHuaweiAccount false can not use hwid");
            cloudRequestHandler.onError(new ErrorStatus(2033, "checkIsUseHuaweiAccount false can not use hwid"));
            return;
        }
        if (context.getPackageManager().checkPermission("com.huawei.android.permission.ANTITHEFT", checkPasswordByUserIdReq.getPackageName()) != 0) {
            cloudRequestHandler.onError(new ErrorStatus(27, "permission is deny"));
            e.a("CloudAccountImpl", "permission is deny");
            return;
        }
        int length = com.huawei.hms.support.hwid.common.d.a.a(context).a(String.valueOf(checkPasswordByUserIdReq.getSiteId()), "").length();
        Map<String, ?> mapA = com.huawei.hms.support.hwid.common.d.a.a(context).a();
        if (mapA == null || mapA.size() == 0 || length >= 40) {
            e.a("CloudAccountImpl", "sp is unuseable");
            c.a().a(context, f16651a, checkPasswordByUserIdReq.getPackageName(), new com.huawei.hms.support.hwid.result.c<com.huawei.hms.support.hwid.result.a>() { // from class: com.huawei.hms.support.hwid.service.a.1
                @Override // com.huawei.hms.support.hwid.result.c
                public void a(com.huawei.hms.support.hwid.result.a aVar) {
                    d dVarA = aVar.a();
                    if (dVarA.a() == 0) {
                        a.c(context, checkPasswordByUserIdReq, cloudRequestHandler);
                    } else {
                        cloudRequestHandler.onError(new ErrorStatus(dVarA.a(), dVarA.b()));
                    }
                }
            });
        } else {
            e.a("CloudAccountImpl", "sp is useable");
            c(context, checkPasswordByUserIdReq, cloudRequestHandler);
            c.a().a(context, f16651a, checkPasswordByUserIdReq.getPackageName());
        }
    }

    private static boolean a(String str, String str2, String str3, String str4, String str5, Context context, int i) {
        if (!f16653c.contains(Integer.valueOf(i))) {
            e.a("CloudAccountImpl", "the siteId is invalid");
            return false;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            e.a("CloudAccountImpl", "userId or password is empty");
            return false;
        }
        if (TextUtils.isEmpty(str3) || !str3.equals(context.getPackageName())) {
            e.a("CloudAccountImpl", "appId is empty or not equals");
            return false;
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
            return true;
        }
        e.a("CloudAccountImpl", "deviceId or deviceType is empty");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, CheckPasswordByUserIdReq checkPasswordByUserIdReq, CloudRequestHandler cloudRequestHandler) {
        String strA = com.huawei.hms.support.hwid.common.d.a.a(context).a(String.valueOf(checkPasswordByUserIdReq.getSiteId()), "");
        String strA2 = com.huawei.hms.support.hwid.common.d.a.a(context).a("public-key", "");
        e.a("CloudAccountImpl", "verifyPasswordRequest: siteDomainName = " + strA, false);
        e.a("CloudAccountImpl", "verifyPasswordRequest: publicKey = " + strA2, false);
        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strA2)) {
            cloudRequestHandler.onError(new ErrorStatus(14, "siteDomainName or publicKey is null"));
            e.a("CloudAccountImpl", "siteDomainName or publicKey is null");
        } else {
            com.huawei.hms.support.hwid.common.e.d.a().a(context, checkPasswordByUserIdReq, strA, strA2, f16651a, cloudRequestHandler);
        }
    }
}
