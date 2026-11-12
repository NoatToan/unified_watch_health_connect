package com.huawei.profile.coordinator;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.profile.coordinator.bean.ErrorResponseBean;
import com.huawei.profile.utils.JsonUtils;
import com.huawei.profile.utils.logger.DsLog;

/* JADX INFO: loaded from: classes15.dex */
public class RequestBaseUtils {
    private static final int ACCESS_TOKEN_EXPIRED_CODE = 1004;
    private static final String TAG = "RequestBaseUtils";

    private RequestBaseUtils() {
    }

    public static boolean isExpired(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            DsLog.et(TAG, "error message is empty.", new Object[0]);
            return false;
        }
        try {
            ErrorResponseBean errorResponseBean = (ErrorResponseBean) new Gson().fromJson(JsonUtils.sanitize(str), ErrorResponseBean.class);
            if (errorResponseBean == null) {
                DsLog.et(TAG, "error is null, error message = " + str, new Object[0]);
                return false;
            }
            if (errorResponseBean.getErrorCode() == i) {
                DsLog.et(TAG, "is expired", new Object[0]);
                return true;
            }
            return false;
        } catch (JsonSyntaxException e) {
            DsLog.et(TAG, "Failed to parse cloud'e error response, error: " + e.getMessage(), new Object[0]);
        }
    }

    public static boolean isAccessTokenExpired(String str) {
        return isExpired(str, 1004);
    }
}
