package com.sensetime.senseid.sdk.liveness.silent.common;

import android.text.TextUtils;
import com.sensetime.senseid.sdk.liveness.silent.common.network.AbstractHttpUtils;
import com.sensetime.senseid.sdk.liveness.silent.common.network.HttpResult;
import com.sensetime.senseid.sdk.liveness.silent.common.type.AbstractContentType;
import com.sensetime.senseid.sdk.liveness.silent.common.type.ResultCode;

/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractFinanceLibrary {
    public String mApiKey = null;
    public String mApiSecret = null;

    public abstract void changeLibraryStatus(int i);

    public ResultCode checkLicense(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return ResultCode.STID_E_LICENSE_FILE_NOT_FOUND;
        }
        if (getLibraryState() != 0) {
            return ResultCode.STID_E_CALL_API_IN_WRONG_STATE;
        }
        int iInitLicense = initLicense(str, str2);
        if (iInitLicense == 0 || iInitLicense == -2067857409) {
            changeLibraryStatus(1);
            return ResultCode.OK;
        }
        if (iInitLicense == -24) {
            return ResultCode.STID_E_LICENSE_PLATFORM_NOT_SUPPORTED;
        }
        if (iInitLicense == -23) {
            return ResultCode.STID_E_LICENSE_VERSION_MISMATCH;
        }
        if (iInitLicense == -15) {
            return ResultCode.STID_E_LICENSE_EXPIRE;
        }
        if (iInitLicense == -14) {
            return ResultCode.STID_E_LICENSE_BUNDLE_ID_INVALID;
        }
        if (iInitLicense != -9) {
            return iInitLicense != -7 ? ResultCode.STID_E_LICENSE_INVALID : ResultCode.STID_E_LICENSE_FILE_NOT_FOUND;
        }
        return ResultCode.STID_E_MODEL_EXPIRE;
    }

    public ResultCode createHandle(String str) {
        if (TextUtils.isEmpty(str)) {
            return ResultCode.STID_E_MODEL_FILE_NOT_FOUND;
        }
        if (getLibraryState() != 1) {
            return ResultCode.STID_E_CALL_API_IN_WRONG_STATE;
        }
        int iCreateHandleMethod = createHandleMethod(str);
        if (iCreateHandleMethod == 0) {
            changeLibraryStatus(2);
            return ResultCode.OK;
        }
        changeLibraryStatus(0);
        if (iCreateHandleMethod == -2067857410) {
            return ResultCode.STID_E_CAPABILITY_NOT_SUPPORTED;
        }
        return iCreateHandleMethod == -7 ? ResultCode.STID_E_MODEL_FILE_NOT_FOUND : ResultCode.STID_E_MODEL_INVALID;
    }

    public abstract int createHandleMethod(String str);

    public abstract AbstractHttpUtils getHttpUtils();

    public abstract int getLibraryState();

    public abstract int initLicense(String str, String str2);

    public abstract void notifyNetworkBegin();

    public abstract void onNetworkFinished(HttpResult httpResult, AbstractContentType abstractContentType);

    public abstract void releaseReferences();
}
