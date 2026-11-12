package com.huami.account.ui.forget;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentTransaction;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.account.HMLoginErrorManager;
import com.huami.account.HMLoginManager;
import com.huami.account.HMProcessLoginDataManager;
import com.huami.account.bean.LoginResult;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.account.ui.R;
import com.huami.account.ui.common.BaseTitleOauthActivity;
import com.huami.account.ui.common.GlobalTitleStyleKt;
import com.huami.account.ui.forget.HMPhoneActivity;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.passport.entity.LoginToken;
import com.huami.util.net.NetUtil;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b9\u0010:J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\f\u001a\u00020\u0002H\u0014J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0016\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018J!\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010 \u001a\u00020\u0002J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\"\u0010%J\u0010\u0010'\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u0004R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/huami/account/ui/forget/HMPhoneActivity;", "Lcom/huami/account/ui/common/BaseTitleOauthActivity;", "", "initViews", "", "t", "v", "w", "onLoginSuccess", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "onLeftClicked", "Lcom/huami/account/ui/forget/HMPhoneFragment;", "fragment", "isAdd", "commitFragment", "Lcom/huami/passport/entity/LoginToken;", LoginViewOptions.EXTRA_LOGIN_TOKEN, "processLoginSuccess", "", "msg", "showLoginDialog", "", "resId", "message", "Lcom/huami/android/design/dialog/loading/LoadingDialog$OnAnimEndListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSuccessDialog$accountui_release", "(Ljava/lang/String;Lcom/huami/android/design/dialog/loading/LoadingDialog$OnAnimEndListener;)V", "setSuccessDialog", "hideLoadingDialog", "resID", "setFailedDialog$accountui_release", "(I)V", "setFailedDialog", "(Ljava/lang/String;)V", "showLoginErrorFragment", "onLoginFailed", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "getLoadingDialog", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "setLoadingDialog", "(Lcom/huami/android/design/dialog/loading/LoadingDialog;)V", "loadingDialog", "Lcom/huami/account/HMLoginErrorManager;", "B", "Lcom/huami/account/HMLoginErrorManager;", "manager", "C", "Z", "isShowSuccessDialog", LogUtil.D, "Lcom/huami/account/ui/forget/HMPhoneFragment;", "<init>", "()V", "Companion", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class HMPhoneActivity extends BaseTitleOauthActivity {

    @NotNull
    public static final String REQUEST_INITIAL_PHONE = "initial_phone";

    @NotNull
    public static final String REQUEST_PHONE_AREA_CODE = "area_code";
    public static final int REQUEST_PHONE_CODE = 112;

    @NotNull
    public static final String REQUEST_PHONE_COUNTRY_CODE = "contry_code";

    @NotNull
    public static final String REQUEST_PHONE_FORGET_PASSWORD = "forget_password";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDialog;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final HMLoginErrorManager manager = new HMLoginErrorManager();

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean isShowSuccessDialog;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    private HMPhoneFragment fragment;

    private final void initViews() {
        if (t()) {
            GlobalTitleStyleKt.setupAccountTitleStyle(this);
            commitFragment(HMForgetPasswordFragment.INSTANCE.newInstance(getIntent().getStringExtra("initial_phone")), false);
        }
    }

    public static /* synthetic */ void onLoginFailed$default(HMPhoneActivity hMPhoneActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        hMPhoneActivity.onLoginFailed(z);
    }

    private final void onLoginSuccess() {
        setResult(-1);
        if (!HMLoginManager.isExistingUser()) {
            hideLoadingDialog();
            finish();
        } else {
            LoadingDialog loadingDialog = this.loadingDialog;
            if (loadingDialog == null) {
                return;
            }
            loadingDialog.setSuccess(getString(R.string.account_ui_login_success), new LoadingDialog.OnAnimEndListener() { // from class: com.huami.account.ui.forget.HMPhoneActivity.onLoginSuccess.1
                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onAnimEnd(@NotNull LoadingDialog dialog) {
                }

                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onDismiss(@NotNull LoadingDialog dialog) {
                    HMPhoneActivity.this.finish();
                }
            });
        }
    }

    private final boolean t() {
        Intent intent = getIntent();
        if (intent == null) {
            return false;
        }
        return intent.getBooleanExtra(REQUEST_PHONE_FORGET_PASSWORD, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(HMPhoneActivity hMPhoneActivity, LoginToken loginToken, LoginResult loginResult) {
        if (hMPhoneActivity.isFinishing()) {
            return;
        }
        if (!loginResult.isSuccess()) {
            hMPhoneActivity.onLoginFailed(true);
        } else {
            HMLoginManager.verifyLoginSuccessHref(loginToken);
            hMPhoneActivity.onLoginSuccess();
        }
    }

    private final void v() {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    private final void w() {
        if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            this.manager.showLoginErrorFragment(this, new HMLoginErrorManager.Callback() { // from class: com.huami.account.ui.forget.HMPhoneActivity$showLoginErrorFragment$1
                @Override // com.huami.account.HMLoginErrorManager.Callback
                public void onFail() {
                    if (this.a.isFinishing()) {
                        return;
                    }
                    HMPhoneActivity hMPhoneActivity = this.a;
                    hMPhoneActivity.setFailedDialog$accountui_release(hMPhoneActivity.getString(R.string.account_ui_feedback_submit_failed));
                }

                @Override // com.huami.account.HMLoginErrorManager.Callback
                public void onStart() {
                    if (this.a.isFinishing()) {
                        return;
                    }
                    this.a.showLoginDialog(R.string.account_ui_submitting_feedback);
                }

                @Override // com.huami.account.HMLoginErrorManager.Callback
                public void onSuccess() {
                    if (this.a.isFinishing()) {
                        return;
                    }
                    HMPhoneActivity hMPhoneActivity = this.a;
                    hMPhoneActivity.setSuccessDialog$accountui_release(hMPhoneActivity.getString(R.string.account_ui_feedback_submit_success), null);
                }
            });
        }
    }

    public final void commitFragment(@NotNull HMPhoneFragment fragment, boolean isAdd) {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        if (isAdd) {
            fragmentTransactionBeginTransaction.add(R.id.hm_phone_fragment_container, fragment);
            fragmentTransactionBeginTransaction.addToBackStack(null);
        } else {
            fragmentTransactionBeginTransaction.replace(R.id.hm_phone_fragment_container, fragment);
        }
        fragmentTransactionBeginTransaction.commit();
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.s36), getString(fragment.getTitleRes()), !RainbowUtils.isDarkMode(this));
    }

    @Nullable
    public final LoadingDialog getLoadingDialog() {
        return this.loadingDialog;
    }

    public final void hideLoadingDialog() {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    @Override // com.huami.account.ui.common.BaseTitleOauthActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_ui_hm_phone_activity);
        initViews();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        v();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        HMPhoneFragment hMPhoneFragment = this.fragment;
        if (hMPhoneFragment != null) {
            hMPhoneFragment.hideSoftKeyBoard();
        }
        finish();
    }

    public final void onLoginFailed(boolean showLoginErrorFragment) {
        hideLoadingDialog();
        IconToast.showError(this, getString(R.string.account_ui_phone_login_failed));
        HMAccountKeeper.INSTANCE.keepLoginData(null, null, null);
        if (showLoginErrorFragment) {
            w();
        }
    }

    public final void processLoginSuccess(@NotNull final LoginToken loginToken) {
        HMProcessLoginDataManager.processLoginSuccess(new HMProcessLoginDataManager.LoginCallBack() { // from class: yb3
            @Override // com.huami.account.HMProcessLoginDataManager.LoginCallBack
            public final void onResult(LoginResult loginResult) {
                HMPhoneActivity.u(this.a, loginToken, loginResult);
            }
        });
    }

    public final void setFailedDialog$accountui_release(int resID) {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.setFailed(getResources().getString(resID));
    }

    public final void setLoadingDialog(@Nullable LoadingDialog loadingDialog) {
        this.loadingDialog = loadingDialog;
    }

    public final void setSuccessDialog$accountui_release(@NotNull String message, @Nullable LoadingDialog.OnAnimEndListener listener) {
        this.isShowSuccessDialog = true;
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.setSuccess(message, listener);
    }

    public final void showLoginDialog(@NotNull String msg) {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null) {
            this.loadingDialog = LoadingDialog.showDialog(this, msg);
        } else if (loadingDialog != null) {
            loadingDialog.setMessage(msg);
        }
        LoadingDialog loadingDialog2 = this.loadingDialog;
        if (loadingDialog2 != null) {
            loadingDialog2.setCancelable(false);
        }
        LoadingDialog loadingDialog3 = this.loadingDialog;
        if (loadingDialog3 == null) {
            return;
        }
        loadingDialog3.show();
    }

    public final void setFailedDialog$accountui_release(@NotNull String message) {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.setFailed(message);
    }

    public final void showLoginDialog(int resId) {
        showLoginDialog(getString(resId));
    }
}
