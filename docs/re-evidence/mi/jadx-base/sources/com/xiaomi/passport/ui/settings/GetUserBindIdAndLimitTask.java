package com.xiaomi.passport.ui.settings;

import android.content.Context;
import android.os.AsyncTask;
import com.xiaomi.accountsdk.account.exception.InvalidPhoneNumException;
import com.xiaomi.accountsdk.account.serverpassthrougherror.data.PassThroughErrorInfo;
import com.xiaomi.accountsdk.request.AccessDeniedException;
import com.xiaomi.accountsdk.request.AuthenticationFailureException;
import com.xiaomi.accountsdk.request.CipherException;
import com.xiaomi.accountsdk.request.InvalidResponseException;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.passport.data.XMPassportInfo;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class GetUserBindIdAndLimitTask extends AsyncTask<Void, Void, TaskResult> {
    private final String TAG = "GetUserBindIdAndLimitTask";
    private GetUserBindIdAndLimitCallBack mCallBack;
    private Context mContext;
    private String mInputPhone;

    public interface GetUserBindIdAndLimitCallBack {
        void onFail(int i);

        void onFail(PassThroughErrorInfo passThroughErrorInfo);

        void onSuccess(UserBindIdAndLimitResult userBindIdAndLimitResult);
    }

    public class TaskResult {
        public Integer errorType;
        public PassThroughErrorInfo serverError;
        public UserBindIdAndLimitResult userBindIdAndLimitResult;

        public TaskResult(Integer num, UserBindIdAndLimitResult userBindIdAndLimitResult, PassThroughErrorInfo passThroughErrorInfo) {
            this.errorType = num;
            this.serverError = passThroughErrorInfo;
            this.userBindIdAndLimitResult = userBindIdAndLimitResult;
        }
    }

    public static class UserBindIdAndLimitResult {
        private int times;
        private long ts;
        private String userId;

        public UserBindIdAndLimitResult(String str, long j, int i) {
            this.userId = str;
            this.ts = j;
            this.times = i;
        }

        public long getTime() {
            return this.ts;
        }

        public int getTimes() {
            return this.times;
        }

        public String getUserId() {
            return this.userId;
        }
    }

    public GetUserBindIdAndLimitTask(Context context, String str, GetUserBindIdAndLimitCallBack getUserBindIdAndLimitCallBack) {
        this.mContext = context != null ? context.getApplicationContext() : null;
        this.mInputPhone = str;
        this.mCallBack = getUserBindIdAndLimitCallBack;
    }

    @Override // android.os.AsyncTask
    public TaskResult doInBackground(Void... voidArr) {
        Context context;
        if (this.mCallBack == null || (context = this.mContext) == null) {
            AccountLogger.log("GetUserBindIdAndLimitTask", "null callback");
            return null;
        }
        XMPassportInfo xMPassportInfoBuild = XMPassportInfo.build(context, "passportapi");
        if (xMPassportInfoBuild == null) {
            AccountLogger.log("GetUserBindIdAndLimitTask", "null passportInfo");
            return new TaskResult(1, null, null);
        }
        int i = 5;
        for (int i2 = 0; i2 < 2; i2++) {
            i = 3;
            try {
                return new TaskResult(0, CloudHelper.getUserBindIdAndLimit(xMPassportInfoBuild, this.mInputPhone), null);
            } catch (InvalidPhoneNumException e) {
                AccountLogger.log("GetUserBindIdAndLimitTask", "InvalidPhoneNumException", e);
                i = 17;
            } catch (AccessDeniedException e2) {
                AccountLogger.log("GetUserBindIdAndLimitTask", "AccessDeniedException", e2);
                i = 4;
            } catch (AuthenticationFailureException e3) {
                AccountLogger.log("GetUserBindIdAndLimitTask", "AuthenticationFailureException", e3);
                xMPassportInfoBuild.refreshAuthToken(this.mContext);
                i = 1;
            } catch (CipherException e4) {
                AccountLogger.log("GetUserBindIdAndLimitTask", "CipherException", e4);
            } catch (InvalidResponseException e5) {
                AccountLogger.log("GetUserBindIdAndLimitTask", "InvalidResponseException", e5);
                PassThroughErrorInfo serverError = e5.getServerError();
                if (serverError != null) {
                    return new TaskResult(3, null, serverError);
                }
            } catch (IOException e6) {
                AccountLogger.log("GetUserBindIdAndLimitTask", "IOException", e6);
                i = 2;
            }
        }
        return new TaskResult(Integer.valueOf(i), null, null);
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(TaskResult taskResult) {
        AsyncTaskResult asyncTaskResult = new AsyncTaskResult(taskResult.errorType.intValue());
        if (!asyncTaskResult.hasException()) {
            this.mCallBack.onSuccess(taskResult.userBindIdAndLimitResult);
            return;
        }
        PassThroughErrorInfo passThroughErrorInfo = taskResult.serverError;
        if (passThroughErrorInfo != null) {
            this.mCallBack.onFail(passThroughErrorInfo);
        } else {
            this.mCallBack.onFail(asyncTaskResult.getExceptionReason());
        }
    }
}
