package com.mibi.sdk.component;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.PermissionUtils;
import com.mibi.sdk.common.account.AccountUtils;
import com.mibi.sdk.common.account.LoginHelper;
import com.mibi.sdk.common.account.loader.AccountLoader;
import com.mibi.sdk.common.utils.MibiLog;

/* JADX INFO: loaded from: classes5.dex */
public class BaseEntryHandler {
    private static final int REQUEST_CODE_PERMISSIONS = 1000001;
    private static final int REQUEST_CODE_SHOW_LICENSE = 1000000;
    private static final String SAVE_KEY_IS_REQUEST_LOGIN = "is_request_login";
    private static final String TAG = "BaseEntryHandler";
    private EntryResultCallback mEntryCallback;
    private Activity mHostActivity;
    private boolean mIsRequestingLogin = false;
    private boolean mIsNoAccount = false;

    public BaseEntryHandler(EntryResultCallback entryResultCallback, Activity activity) {
        this.mEntryCallback = entryResultCallback;
        this.mHostActivity = activity;
    }

    public EntryResultCallback getEntryCallback() {
        return this.mEntryCallback;
    }

    public void handleActivityResult(int i, int i2, Intent intent) {
        if (i == 1000000) {
            if (i2 == -1) {
                requestPermissions(PermissionUtils.BASIC_PERMISSIONS);
            } else {
                this.mEntryCallback.onEntryFailed(2, "user canceled");
            }
        }
    }

    public void onPermissionDenied() {
        MibiLog.d(TAG, "user not granted permissions");
        this.mEntryCallback.onEntryFailed(2, "user not granted permissions");
    }

    public void onPermissionGranted() {
        MibiLog.d(TAG, "user granted permissions");
        this.mIsRequestingLogin = true;
        LoginHelper.login(this.mHostActivity, this.mIsNoAccount, new LoginHelper.LoginWithResult() { // from class: com.mibi.sdk.component.BaseEntryHandler.1
            @Override // com.mibi.sdk.common.account.LoginHelper.LoginWithResult
            public void onLoginFailed(int i, String str) {
                MibiLog.d(BaseEntryHandler.TAG, "login failed error:" + i + "message:" + str);
                BaseEntryHandler.this.mEntryCallback.onEntryFailed(i, str);
            }

            @Override // com.mibi.sdk.common.account.LoginHelper.LoginWithResult
            public void onLoginSuccess(AccountLoader accountLoader) {
                MibiLog.d(BaseEntryHandler.TAG, "login success");
                BaseEntryHandler.this.mIsRequestingLogin = false;
                BaseEntryHandler.this.mEntryCallback.onEntrySuccess(accountLoader);
            }
        });
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (CommonConstants.DEBUG) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                MibiLog.d(TAG, "permission result: " + strArr[i2] + " " + iArr[i2]);
            }
        }
        if (PermissionUtils.isAllGranted(iArr)) {
            onPermissionGranted();
        } else {
            onPermissionDenied();
        }
    }

    @SuppressLint({"NewApi"})
    public void requestPermissions(String... strArr) {
        String[] ungrantedPermissions = PermissionUtils.getUngrantedPermissions(this.mHostActivity, strArr);
        if (ungrantedPermissions != null) {
            this.mHostActivity.requestPermissions(ungrantedPermissions, REQUEST_CODE_PERMISSIONS);
        } else {
            onPermissionGranted();
        }
    }

    public void saveState(Bundle bundle) {
        bundle.putBoolean(SAVE_KEY_IS_REQUEST_LOGIN, this.mIsRequestingLogin);
    }

    public void startEntryProcess(Bundle bundle, boolean z) {
        this.mIsNoAccount = z;
        if (bundle == null) {
            requestPermissions(PermissionUtils.BASIC_PERMISSIONS);
            return;
        }
        boolean z2 = bundle.getBoolean(SAVE_KEY_IS_REQUEST_LOGIN, false);
        this.mIsRequestingLogin = z2;
        if (z2) {
            AccountLoader currentAccountLoader = AccountUtils.getCurrentAccountLoader();
            if (currentAccountLoader == null) {
                this.mEntryCallback.onEntryFailed(4, "login failed");
                return;
            }
            MibiLog.d(TAG, "login success");
            this.mEntryCallback.onEntrySuccess(currentAccountLoader);
            this.mIsRequestingLogin = false;
        }
    }
}
