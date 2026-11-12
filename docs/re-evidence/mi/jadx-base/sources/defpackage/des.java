package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseMvpPresenter;
import com.mibi.sdk.model.auth.CheckAuthModel;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;
import com.mibi.sdk.task.handler.AccountChangedExceptionHandler;
import com.mibi.sdk.task.handler.ExceptionDispatcher;

/* JADX INFO: loaded from: classes5.dex */
public class des extends BaseMvpPresenter<p9s> implements w2s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15460a;

    public class a extends AccountChangedExceptionHandler {
        public a(Context context) {
            super(context);
        }

        @Override // com.mibi.sdk.task.handler.AccountChangedExceptionHandler, com.mibi.sdk.task.handler.ExceptionDispatcher.ExceptionHandler
        public boolean handle(Throwable th, Bundle bundle, ExceptionDispatcher exceptionDispatcher) {
            super.handle(th, bundle, exceptionDispatcher);
            ((p9s) des.this.getView()).a(bundle.getInt(CommonConstants.KEY_ERR_CODE), bundle.getString("errDesc"));
            return true;
        }
    }

    public class b implements CheckAuthModel.ICheckAuthCallback {
        public b() {
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onAccountFrozen() {
            MibiLog.d("CheckPasswordPresenter", "onAccountFrozen");
            ((p9s) des.this.getView()).e();
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onAuthCheckError(int i, String str, Throwable th) {
            MibiLog.d("CheckPasswordPresenter", "onAuthCheckError", th);
            ((p9s) des.this.getView()).e(str, th);
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onBindPhoneCheck(Bundle bundle) {
            MibiLog.d("CheckPasswordPresenter", "onBindPhoneCheck");
            ((p9s) des.this.getView()).a(bundle);
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onPasswordCheck() {
            MibiLog.d("CheckPasswordPresenter", "onPasswordCheck");
            ((p9s) des.this.getView()).c();
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onProcessExpired() {
            MibiLog.d("CheckPasswordPresenter", "onProcessExpired");
            ((p9s) des.this.getView()).b();
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onSMSCodeCheck(Bundle bundle) {
            MibiLog.d("CheckPasswordPresenter", "onSMSCodeCheck");
            ((p9s) des.this.getView()).a(bundle);
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onSuccess() {
            MibiLog.d("CheckPasswordPresenter", "check auth success");
            ((p9s) des.this.getView()).a();
        }

        public /* synthetic */ b(des desVar, a aVar) {
            this();
        }
    }

    public class c extends RxBaseErrorHandleTaskListener<v2s.a> {
        public /* synthetic */ c(des desVar, Context context, a aVar) {
            this(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(v2s.a aVar) {
            MibiLog.d("CheckPasswordPresenter", "start login success");
            super.handleSuccess(aVar);
            if (aVar.f36424b != 0) {
                MibiLog.d("CheckPasswordPresenter", "result is not success,because check password error from account sdk");
                ((p9s) des.this.getView()).c();
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(CommonConstants.KEY_PROCESS_ID, des.this.f15460a);
            if (!TextUtils.isEmpty(aVar.f36423a)) {
                bundle.putString("fullAuth", aVar.f36423a);
            }
            new CheckAuthModel(des.this.getSession()).checkAuth(bundle, new b(des.this, null));
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            MibiLog.d("CheckPasswordPresenter", "start login error:" + i);
            ((p9s) des.this.getView()).e(str, null);
        }

        public c(Context context) {
            super(context);
        }
    }

    public des(Class<p9s> cls) {
        super(cls);
    }

    @Override // defpackage.w2s
    public void a(Activity activity, String str, String str2) {
        MibiLog.d("CheckPasswordPresenter", "start login");
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, this.f15460a);
        sortedParameter.add(CommonConstants.KEY_USER_NAME, str);
        sortedParameter.add("password", str2);
        v2s v2sVar = new v2s(activity);
        v2sVar.b(sortedParameter);
        c cVar = new c(this, getContext(), null);
        cVar.getDispatcher().register(new a(getContext()));
        n4h.a(v2sVar).c(cVar);
    }

    @Override // com.mibi.sdk.component.BaseMvpPresenter, com.mibi.sdk.mvp.Presenter
    public void onInit(Bundle bundle) {
        super.onInit(bundle);
        String string = getArguments().getString(CommonConstants.KEY_PROCESS_ID);
        this.f15460a = string;
        if (TextUtils.isEmpty(string)) {
            MibiLog.d("CheckPasswordPresenter", "process id is null");
        }
    }
}
