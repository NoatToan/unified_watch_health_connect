package defpackage;

import android.os.Bundle;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseMvpPresenter;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.model.auth.CheckAuthModel;
import com.mibi.sdk.model.sms.VerifyRegetSmsCodeModel;
import com.mibi.sdk.task.RxCountDown;

/* JADX INFO: loaded from: classes5.dex */
public class mes extends BaseMvpPresenter<q9s> implements x2s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26086a;

    public class b implements CheckAuthModel.ICheckAuthCallback {
        public b() {
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onAccountFrozen() {
            MibiLog.d("VerifySMSCodePresenter", "onAccountFrozen");
            ((q9s) mes.this.getView()).l(ErrorCodes.ACCOUNT_FROZEN, "account frozen");
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onAuthCheckError(int i, String str, Throwable th) {
            MibiLog.d("VerifySMSCodePresenter", "onAuthCheckError", th);
            if (i == 7003) {
                ((q9s) mes.this.getView()).e(str, th);
            } else {
                ((q9s) mes.this.getView()).l(i, str);
            }
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onBindPhoneCheck(Bundle bundle) {
            MibiLog.d("VerifySMSCodePresenter", "onBindPhoneCheck");
            ((q9s) mes.this.getView()).a(bundle);
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onPasswordCheck() {
            MibiLog.d("VerifySMSCodePresenter", "onPasswordCheck");
            ((q9s) mes.this.getView()).d();
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onProcessExpired() {
            MibiLog.d("VerifySMSCodePresenter", "onProcessExpired");
            ((q9s) mes.this.getView()).l(ErrorCodes.PROCESS_EXPIRED, "process expired");
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onSMSCodeCheck(Bundle bundle) {
            MibiLog.d("VerifySMSCodePresenter", "onSMSCodeCheck");
            ((q9s) mes.this.getView()).l(ErrorCodes.NEED_SMS_CODE_CHECK, "need sms code check");
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onSuccess() {
            MibiLog.d("VerifySMSCodePresenter", "check auth success");
            ((q9s) mes.this.getView()).a();
        }
    }

    public class c implements RxCountDown.ICountDownListener {
        public c() {
        }

        @Override // com.mibi.sdk.task.RxCountDown.ICountDownListener
        public void onCompleted() {
            MibiLog.d("VerifySMSCodePresenter", "count down completed");
        }

        @Override // com.mibi.sdk.task.RxCountDown.ICountDownListener
        public void onError() {
            MibiLog.e("VerifySMSCodePresenter", "count down error");
        }

        @Override // com.mibi.sdk.task.RxCountDown.ICountDownListener
        public void onProgress(long j) {
            MibiLog.d("VerifySMSCodePresenter", "count down onProgress:" + j);
            ((q9s) mes.this.getView()).a(60 - ((int) j));
        }

        @Override // com.mibi.sdk.task.RxCountDown.ICountDownListener
        public void onStart() {
            MibiLog.d("VerifySMSCodePresenter", "count down start");
            VerifyRegetSmsCodeModel verifyRegetSmsCodeModel = new VerifyRegetSmsCodeModel(mes.this.getSession());
            Bundle bundle = new Bundle();
            bundle.putString(CommonConstants.KEY_PROCESS_ID, mes.this.f26086a);
            verifyRegetSmsCodeModel.request(bundle, null);
        }
    }

    public mes(Class<q9s> cls) {
        super(cls);
    }

    @Override // defpackage.x2s
    public void a() {
        RxCountDown.getTask().start(60, new c());
    }

    @Override // com.mibi.sdk.component.BaseMvpPresenter, com.mibi.sdk.mvp.Presenter
    public void onInit(Bundle bundle) {
        super.onInit(bundle);
        this.f26086a = getArguments().getString(CommonConstants.KEY_PROCESS_ID);
    }

    @Override // defpackage.x2s
    public void a(String str) {
        CheckAuthModel checkAuthModel = new CheckAuthModel(getSession());
        Bundle bundle = new Bundle();
        bundle.putString(CommonConstants.KEY_PROCESS_ID, this.f26086a);
        bundle.putString("smsCode", str);
        checkAuthModel.checkAuth(bundle, new b());
    }
}
