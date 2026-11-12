package com.mibi.sdk.model.auth;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.exception.ServerErrorCodeException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.Model;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;
import defpackage.n4h;

/* JADX INFO: loaded from: classes5.dex */
public class CheckAuthModel extends Model<Void> {
    private static final String TAG = "CheckAuthModel";
    private ICheckAuthCallback mCallback;
    private String mProcessId;

    public class CheckAuthTaskListener extends RxBaseErrorHandleTaskListener<RxCheckAuthTask.Result> {
        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            if (i == 1985) {
                MibiLog.d(CheckAuthModel.TAG, "need check password");
                CheckAuthModel.this.mCallback.onPasswordCheck();
                return;
            }
            if (i == 1993) {
                MibiLog.d(CheckAuthModel.TAG, "account frozen");
                CheckAuthModel.this.mCallback.onAccountFrozen();
                return;
            }
            if (i == 8000) {
                MibiLog.d(CheckAuthModel.TAG, "process expired");
                CheckAuthModel.this.mCallback.onProcessExpired();
                return;
            }
            if (i == 7001) {
                MibiLog.d(CheckAuthModel.TAG, "need verify sms");
                String str2 = ((RxCheckAuthTask.Result) ((ServerErrorCodeException) th).getResult()).mPhoneNum;
                Bundle bundle = new Bundle();
                bundle.putString(CommonConstants.KEY_PROCESS_ID, CheckAuthModel.this.mProcessId);
                bundle.putString(CommonConstants.KEY_PHONE_NUM, str2);
                bundle.putInt("payment_error", 7001);
                CheckAuthModel.this.mCallback.onSMSCodeCheck(bundle);
                return;
            }
            if (i != 7002) {
                MibiLog.d(CheckAuthModel.TAG, "check auth server error", th);
                CheckAuthModel.this.mCallback.onAuthCheckError(i, str, th);
                return;
            }
            MibiLog.d(CheckAuthModel.TAG, "need bind phone");
            String str3 = ((RxCheckAuthTask.Result) ((ServerErrorCodeException) th).getResult()).mBindPhoneUrl;
            Bundle bundle2 = new Bundle();
            bundle2.putString(CommonConstants.KEY_PROCESS_ID, CheckAuthModel.this.mProcessId);
            bundle2.putString("bindPhoneUrl", str3);
            bundle2.putInt("payment_error", CommonConstants.Mgc.NEED_BIND_PHONE);
            CheckAuthModel.this.mCallback.onBindPhoneCheck(bundle2);
        }

        private CheckAuthTaskListener(Context context) {
            super(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleSuccess(RxCheckAuthTask.Result result) {
            MibiLog.d(CheckAuthModel.TAG, "handleSuccess");
            CheckAuthModel.this.mCallback.onSuccess();
        }
    }

    public interface ICheckAuthCallback {
        void onAccountFrozen();

        void onAuthCheckError(int i, String str, Throwable th);

        void onBindPhoneCheck(Bundle bundle);

        void onPasswordCheck();

        void onProcessExpired();

        void onSMSCodeCheck(Bundle bundle);

        void onSuccess();
    }

    public CheckAuthModel(Session session) {
        super(session);
    }

    public void checkAuth(Bundle bundle, ICheckAuthCallback iCheckAuthCallback) {
        super.request(bundle, null);
        this.mCallback = iCheckAuthCallback;
        this.mProcessId = bundle.getString(CommonConstants.KEY_PROCESS_ID);
        String string = bundle.getString("fullAuth");
        String string2 = bundle.getString("smsCode");
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, this.mProcessId);
        if (!TextUtils.isEmpty(string)) {
            sortedParameter.add("fullAuth", string);
        }
        if (!TextUtils.isEmpty(string2)) {
            sortedParameter.add("smsCode", string2);
        }
        RxCheckAuthTask rxCheckAuthTask = new RxCheckAuthTask(getContext(), getSession());
        rxCheckAuthTask.setParams(sortedParameter);
        n4h.a(rxCheckAuthTask).c(new CheckAuthTaskListener(getContext()));
    }

    @Override // com.mibi.sdk.model.Model, com.mibi.sdk.model.IBaseModel
    public void request(Bundle bundle, IBaseModel.IResultCallback<Void> iResultCallback) {
        throw new IllegalStateException("should not use this method");
    }
}
