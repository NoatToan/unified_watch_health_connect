package com.xiaomi.passport.ui.settings;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.xiaomi.account.passportsdk.account_sso.R;
import com.xiaomi.accountsdk.account.XMPassport;
import com.xiaomi.accountsdk.account.data.Gender;
import com.xiaomi.accountsdk.account.data.XiaomiUserProfile;
import com.xiaomi.accountsdk.account.exception.InvalidParameterException;
import com.xiaomi.accountsdk.account.serverpassthrougherror.data.PassThroughErrorInfo;
import com.xiaomi.accountsdk.request.AccessDeniedException;
import com.xiaomi.accountsdk.request.AuthenticationFailureException;
import com.xiaomi.accountsdk.request.CipherException;
import com.xiaomi.accountsdk.request.InvalidResponseException;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.passport.data.XMPassportInfo;
import com.xiaomi.passport.ui.utils.AccountToast;
import com.xiaomi.passport.ui.view.PassportDialog;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public class UploadMiUserProfileTask extends AsyncTask<Void, Void, UploadMiUserProfileTaskResult> {
    private static final String TAG = "UploadMiUserProfileTask";
    private WeakReference<Activity> activityWeakReference;
    private Gender gender;
    private IUploadUserProfile uploadUserProfile;
    private String userName;

    public interface IUploadUserProfile {
        void onFinishUploading(String str, Gender gender);
    }

    public class UploadMiUserProfileTaskResult {
        private Integer exceptionType;
        public PassThroughErrorInfo serverError;

        private UploadMiUserProfileTaskResult(PassThroughErrorInfo passThroughErrorInfo, Integer num) {
            this.serverError = passThroughErrorInfo;
            this.exceptionType = num;
        }
    }

    public UploadMiUserProfileTask(Activity activity, String str, Gender gender, IUploadUserProfile iUploadUserProfile) {
        this.userName = str;
        this.gender = gender;
        this.uploadUserProfile = iUploadUserProfile;
        this.activityWeakReference = new WeakReference<>(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.AsyncTask
    public UploadMiUserProfileTaskResult doInBackground(Void... voidArr) {
        Activity activity = this.activityWeakReference.get();
        int i = 5;
        int i2 = 5;
        PassThroughErrorInfo passThroughErrorInfo = null;
        if (activity == null) {
            AccountLogger.log(TAG, "context is null");
            return new UploadMiUserProfileTaskResult(passThroughErrorInfo, i2);
        }
        Context applicationContext = activity.getApplicationContext();
        XMPassportInfo xMPassportInfoBuild = XMPassportInfo.build(applicationContext, "passportapi");
        if (xMPassportInfoBuild == null) {
            AccountLogger.log(TAG, "null passportInfo");
            return new UploadMiUserProfileTaskResult(null == true ? 1 : 0, i2);
        }
        int i3 = 0;
        int i4 = 0;
        while (i4 < 2) {
            i = 3;
            try {
                XMPassport.uploadXiaomiUserProfile(xMPassportInfoBuild, new XiaomiUserProfile(xMPassportInfoBuild.getUserId(), this.userName, null, this.gender));
            } catch (InvalidParameterException e) {
                AccountLogger.log(TAG, "UploadUserInfoTask error", e);
                i3 = 16;
            } catch (AccessDeniedException e2) {
                AccountLogger.log(TAG, "UploadUserInfoTask error", e2);
                i3 = 4;
            } catch (AuthenticationFailureException e3) {
                AccountLogger.log(TAG, "UploadUserInfoTask error", e3);
                xMPassportInfoBuild.refreshAuthToken(applicationContext);
                i4++;
                i = 1;
            } catch (CipherException e4) {
                AccountLogger.log(TAG, "UploadUserInfoTask error", e4);
                i3 = i;
            } catch (InvalidResponseException e5) {
                AccountLogger.log(TAG, "UploadUserInfoTask error", e5);
                PassThroughErrorInfo serverError = e5.getServerError();
                if (serverError != null) {
                    return new UploadMiUserProfileTaskResult(serverError, 3);
                }
                i3 = i;
            } catch (IOException e6) {
                AccountLogger.log(TAG, "UploadUserInfoTask error", e6);
                i3 = 2;
            }
            return new UploadMiUserProfileTaskResult(null == true ? 1 : 0, Integer.valueOf(i3));
        }
        i3 = i;
        return new UploadMiUserProfileTaskResult(null == true ? 1 : 0, Integer.valueOf(i3));
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(UploadMiUserProfileTaskResult uploadMiUserProfileTaskResult) {
        super.onPostExecute(uploadMiUserProfileTaskResult);
        AsyncTaskResult asyncTaskResult = new AsyncTaskResult(uploadMiUserProfileTaskResult.exceptionType.intValue());
        if (!asyncTaskResult.hasException()) {
            this.uploadUserProfile.onFinishUploading(this.userName, this.gender);
            return;
        }
        int exceptionReason = (uploadMiUserProfileTaskResult.exceptionType.intValue() != 16 || TextUtils.isEmpty(this.userName)) ? asyncTaskResult.getExceptionReason() : R.string.passport_account_error_user_name;
        Activity activity = this.activityWeakReference.get();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        PassThroughErrorInfo passThroughErrorInfo = uploadMiUserProfileTaskResult.serverError;
        if (passThroughErrorInfo == null) {
            AccountToast.showToastMessage(activity, exceptionReason, 0);
            return;
        }
        PassportDialog passportDialogCreate = PassportDialog.create(activity, passThroughErrorInfo);
        if (passportDialogCreate != null) {
            passportDialogCreate.show();
        }
    }
}
