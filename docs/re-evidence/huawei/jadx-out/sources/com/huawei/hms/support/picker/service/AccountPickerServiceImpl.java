package com.huawei.hms.support.picker.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.a.a.b.b;
import com.huawei.hms.a.a.d.a;
import com.huawei.hms.a.a.d.c;
import com.huawei.hms.a.a.d.d;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.constant.AuthInternalPickerConstant;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonPickerConstant;
import com.huawei.hms.support.api.entity.hwid.AccountPickerSignInRequest;
import com.huawei.hms.support.api.entity.hwid.AccountPickerSignOutReq;
import com.huawei.hms.support.picker.common.AccountPickerUtil;
import com.huawei.hms.support.picker.request.AccountPickerParams;
import defpackage.nmr;
import defpackage.noj;
import defpackage.nox;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class AccountPickerServiceImpl extends HuaweiApi<AccountPickerParams> implements AccountPickerService {
    private static final Api<AccountPickerParams> HUAWEI_ID_AUTH_API = new Api<>(HuaweiApiAvailability.HMS_API_NAME_ID);
    protected static final String TAG = "[HUAWEIIDSDK]AccountPickerServiceImpl";
    private AccountPickerParams accountPickerParams;
    private int mKitSdkVersion;
    private int mPickerType;
    private String transId;

    @Override // com.huawei.hms.common.HuaweiApi
    public int getApiLevel() {
        return 9;
    }

    public AccountPickerServiceImpl(Activity activity, AccountPickerParams accountPickerParams, int i) {
        super(activity, HUAWEI_ID_AUTH_API, accountPickerParams, (AbstractClientBuilder) new b(), i);
        this.transId = null;
        this.mPickerType = Integer.MIN_VALUE;
        this.accountPickerParams = accountPickerParams;
        this.mKitSdkVersion = i;
    }

    public AccountPickerServiceImpl(Context context, AccountPickerParams accountPickerParams, int i) {
        super(context, HUAWEI_ID_AUTH_API, accountPickerParams, new b(), i);
        this.transId = null;
        this.mPickerType = Integer.MIN_VALUE;
        this.mKitSdkVersion = i;
        this.accountPickerParams = accountPickerParams;
    }

    public AccountPickerServiceImpl(Activity activity, AccountPickerParams accountPickerParams, int i, int i2) {
        super(activity, HUAWEI_ID_AUTH_API, accountPickerParams, (AbstractClientBuilder) new b(), i);
        this.transId = null;
        this.accountPickerParams = accountPickerParams;
        this.mKitSdkVersion = i;
        this.mPickerType = i2;
    }

    public AccountPickerServiceImpl(Context context, AccountPickerParams accountPickerParams, int i, int i2) {
        super(context, HUAWEI_ID_AUTH_API, accountPickerParams, new b(), i);
        this.transId = null;
        this.accountPickerParams = accountPickerParams;
        this.mKitSdkVersion = i;
        this.mPickerType = i2;
    }

    @Override // com.huawei.hms.support.picker.service.AccountPickerService
    public Intent signIn() {
        boolean z = true;
        nox.b(TAG, "accountPicker signIn", true);
        if (this.mPickerType == Integer.MIN_VALUE) {
            nox.b(TAG, "pickerType is null", true);
            this.transId = noj.b();
            z = false;
        } else {
            nox.b(TAG, "pickerType is " + this.mPickerType, true);
            this.transId = noj.b();
        }
        return AccountPickerUtil.getSignInIntent(getContext(), this.accountPickerParams, getSubAppID(), this.transId, this.mPickerType, z);
    }

    @Override // com.huawei.hms.support.picker.service.AccountPickerService
    public Intent signInByMcp() {
        boolean z = true;
        nox.b(TAG, "picker signInByMcp.", true);
        Context context = getContext();
        if (this.mPickerType == Integer.MIN_VALUE) {
            nox.b(TAG, "pickerType is null", true);
            this.transId = noj.b();
            z = false;
        } else {
            nox.b(TAG, "pickerType is " + this.mPickerType, true);
            this.transId = noj.b();
        }
        return AccountPickerUtil.getSignInByMcpIntent(context, this.accountPickerParams, getSubAppID(), this.transId, this.mPickerType, z);
    }

    @Override // com.huawei.hms.support.picker.service.AccountPickerService
    public Task<Void> signOut() {
        nox.b(TAG, "signOut", true);
        AccountPickerUtil.clearSignInAccountCache();
        AccountPickerSignOutReq accountPickerSignOutReq = new AccountPickerSignOutReq();
        Context context = getContext();
        this.transId = noj.b();
        int iIsHuaweiMobileServicesAvailable = new AvailableAdapter(AuthInternalPickerConstant.HMS_APK_VERSION_MIN).isHuaweiMobileServicesAvailable(context);
        nox.b(TAG, "signOut isHuaweiMobileServicesAvailableCode:" + iIsHuaweiMobileServicesAvailable, true);
        c cVar = new c(context, this.transId);
        nox.b(TAG, "check HMS service begin.", true);
        try {
            if (iIsHuaweiMobileServicesAvailable == 1 || iIsHuaweiMobileServicesAvailable == 21 || iIsHuaweiMobileServicesAvailable == 3) {
                nox.b(TAG, "it has not HMS service.", true);
                AccountLiteSdkServiceImpl.h5SignOut(context, cVar);
                return cVar.a().getTask();
            }
            if (iIsHuaweiMobileServicesAvailable == 0 || iIsHuaweiMobileServicesAvailable == 2) {
                AccountLiteSdkServiceImpl.h5SignOut(context, cVar);
                return doWrite(new d("hwid.signout", accountPickerSignOutReq.toJson(), this.transId));
            }
            return signOutFailure(2015, AuthInternalPickerConstant.UNKOWN_ERROR, this.transId);
        } catch (nmr e) {
            nox.a(TAG, "ParmaInvalidException:" + e.getClass().getSimpleName(), true);
            return signOutFailure(2003, AuthInternalPickerConstant.PARAM_ERROR, this.transId);
        }
    }

    private Task<Void> signOutFailure(int i, String str, String str2) {
        nox.b(TAG, "signOutFailure start. statusCode is " + i, true);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setException(new ApiException(new Status(i, str)));
        return taskCompletionSource.getTask();
    }

    @Override // com.huawei.hms.support.picker.service.AccountPickerService
    public Task<Void> cancelAuthorization(String str) {
        try {
            nox.b(TAG, "cancelAuthorization", true);
            if (TextUtils.isEmpty(str)) {
                nox.a(TAG, "input accessToken is null", true);
                return cancelAuthorizationFailure(2003, AuthInternalPickerConstant.PARAM_ERROR, this.transId);
            }
            AccountPickerSignInRequest accountPickerSignInRequest = new AccountPickerSignInRequest();
            JSONObject jSONObject = new JSONObject(this.accountPickerParams.getSignInParams());
            jSONObject.put("accessToken", str);
            this.accountPickerParams.setSignInParams(jSONObject.toString());
            String strOptString = jSONObject.optString(CommonPickerConstant.RequestParams.KEY_GRS_APP_NAME);
            accountPickerSignInRequest.setAccountPickerParams(getOption());
            String json = accountPickerSignInRequest.toJson();
            Context context = getContext();
            this.transId = noj.b();
            AvailableAdapter availableAdapter = new AvailableAdapter(AuthInternalPickerConstant.HMS_APK_VERSION_MIN);
            nox.b(TAG, "check HMS service begin.", true);
            int iIsHuaweiMobileServicesAvailable = availableAdapter.isHuaweiMobileServicesAvailable(context);
            nox.b(TAG, "cancelAuthorization isHuaweiMobileServicesAvailableCode:" + iIsHuaweiMobileServicesAvailable, true);
            if (iIsHuaweiMobileServicesAvailable != 1 && iIsHuaweiMobileServicesAvailable != 21 && iIsHuaweiMobileServicesAvailable != 3) {
                if (iIsHuaweiMobileServicesAvailable != 0 && iIsHuaweiMobileServicesAvailable != 2) {
                    return cancelAuthorizationFailure(2015, AuthInternalPickerConstant.UNKOWN_ERROR, this.transId);
                }
                nox.b(TAG, "it has HMS service.", true);
                return doWrite(new a("hwid.revokeAccess", json, this.transId));
            }
            nox.b(TAG, "it has not HMS service.", true);
            com.huawei.hms.a.a.d.b bVar = new com.huawei.hms.a.a.d.b(context, this.transId);
            AccountLiteSdkServiceImpl.revoke(context, strOptString, str, bVar);
            return bVar.a().getTask();
        } catch (nmr e) {
            nox.a(TAG, "ParmaInvalidException:" + e.getClass().getSimpleName(), true);
            return cancelAuthorizationFailure(2015, e.getMessage(), this.transId);
        } catch (JSONException e2) {
            nox.a(TAG, "JSONException:" + e2.getClass().getSimpleName(), true);
            return cancelAuthorizationFailure(2015, e2.getMessage(), this.transId);
        }
    }

    private Task<Void> cancelAuthorizationFailure(int i, String str, String str2) {
        nox.b(TAG, "cancelAuthorizationFailure start. statusCode is " + i, true);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setException(new ApiException(new Status(i, str)));
        return taskCompletionSource.getTask();
    }
}
