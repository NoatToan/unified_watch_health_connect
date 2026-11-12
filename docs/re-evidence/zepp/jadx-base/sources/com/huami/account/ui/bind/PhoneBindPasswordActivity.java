package com.huami.account.ui.bind;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.account.event.EventPhoneBinding;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.service.model.Area;
import com.huami.account.ui.R;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.account.ui.bind.PhoneBindPasswordActivity;
import com.huami.account.ui.common.BaseTitleOauthActivity;
import com.huami.account.ui.common.GlobalTitleStyleKt;
import com.huami.account.utils.ResponseConstant;
import com.huami.account.utils.UtilsKt;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.passport.AccountManager;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.entity.BindResult;
import com.huami.passport.entity.LoginInfo;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b*\u0010+J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\u0012\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0014\u001a\u00020\u0005H\u0016R%\u0010\u001a\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R%\u0010\u001e\u001a\n \u0016*\u0004\u0018\u00010\u001b0\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u001c\u0010\u001dR%\u0010!\u001a\n \u0016*\u0004\u0018\u00010\u001b0\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u001dR%\u0010&\u001a\n \u0016*\u0004\u0018\u00010\"0\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010(¨\u0006-"}, d2 = {"Lcom/huami/account/ui/bind/PhoneBindPasswordActivity;", "Lcom/huami/account/ui/common/BaseTitleOauthActivity;", "", "B", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", "initViews", "v", "", "F", "phone", "access", "u", "", "msg", "E", "hideProgressDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onLeftClicked", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", "x", "()Landroid/widget/TextView;", "confirmBtn", "Landroid/widget/EditText;", "y", "()Landroid/widget/EditText;", "inputPasswordText", "C", "z", "inputPasswordTextAgain", "Lcom/huami/passport/AccountManager;", LogUtil.D, "w", "()Lcom/huami/passport/AccountManager;", "accountManager", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "<init>", "()V", "Companion", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class PhoneBindPasswordActivity extends BaseTitleOauthActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EXTRA_PHONE = "phone";

    @NotNull
    public static final String EXTRA_SMS_CODE = "smsCode";

    @NotNull
    public static final String TAG = "PhoneBindPasswordActivity";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy confirmBtn = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputPasswordText = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputPasswordTextAgain = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final Lazy accountManager = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007R\u0016\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/account/ui/bind/PhoneBindPasswordActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "phone", PhoneBindPasswordActivity.EXTRA_SMS_CODE, "Landroid/content/Intent;", "getIntent", "EXTRA_PHONE", "Ljava/lang/String;", "EXTRA_SMS_CODE", "TAG", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Intent getIntent(@NotNull Context context, @NotNull String phone, @NotNull String smsCode) {
            Intent intent = new Intent(context, (Class<?>) PhoneBindPasswordActivity.class);
            intent.putExtra(PhoneBindPasswordActivity.EXTRA_SMS_CODE, smsCode);
            intent.putExtra("phone", phone);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/passport/AccountManager;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<AccountManager> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountManager invoke() {
            return AccountManager.getDefault(PhoneBindPasswordActivity.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<TextView> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) PhoneBindPasswordActivity.this.findViewById(R.id.confirm_btn);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<EditText> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText invoke() {
            return (EditText) PhoneBindPasswordActivity.this.findViewById(R.id.input_password_text);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<EditText> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText invoke() {
            return (EditText) PhoneBindPasswordActivity.this.findViewById(R.id.input_password_text_again);
        }
    }

    private final String A() {
        return getIntent().getStringExtra("phone");
    }

    private final String B() {
        return getIntent().getStringExtra(EXTRA_SMS_CODE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(PhoneBindPasswordActivity phoneBindPasswordActivity, View view) {
        if (!NetUtil.isNetworkConnected(phoneBindPasswordActivity)) {
            IconToast.showError(phoneBindPasswordActivity, R.string.account_ui_no_network_connection);
        } else if (phoneBindPasswordActivity.F()) {
            phoneBindPasswordActivity.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(EditText editText, PhoneBindPasswordActivity phoneBindPasswordActivity) {
        editText.requestFocus();
        Object systemService = phoneBindPasswordActivity.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.showSoftInput(editText, 2);
    }

    private final void E(int msg) {
        if (isFinishing()) {
            return;
        }
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            this.mLoadingDialog = LoadingDialog.showDialog(this, getString(msg));
        } else if (loadingDialog != null) {
            loadingDialog.setMessage(getString(msg));
        }
        LoadingDialog loadingDialog2 = this.mLoadingDialog;
        if (loadingDialog2 != null) {
            loadingDialog2.setCancelable(false);
        }
        LoadingDialog loadingDialog3 = this.mLoadingDialog;
        if (loadingDialog3 == null) {
            return;
        }
        loadingDialog3.show();
    }

    private final boolean F() {
        if (y().length() < 8 || z().length() < 8) {
            IconToast.showError(this, R.string.account_ui_account_pwd_length_error);
            return false;
        }
        if (!UtilsKt.validPassword(y().getText().toString())) {
            IconToast.showError(this, R.string.account_ui_login_email_password_format_error);
            return false;
        }
        if (Intrinsics.areEqual(y().getText().toString(), z().getText().toString())) {
            return true;
        }
        IconToast.showError(this, R.string.account_ui_mili_setting_off_wist_lock_password_not_match);
        return false;
    }

    @JvmStatic
    @NotNull
    public static final Intent getIntent(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        return INSTANCE.getIntent(context, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideProgressDialog() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog != null && loadingDialog.isShowing()) {
            loadingDialog.dismiss();
        }
    }

    private final void initViews() {
        x().setOnClickListener(new View.OnClickListener() { // from class: ew5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneBindPasswordActivity.C(this.a, view);
            }
        });
        final EditText editTextY = y();
        editTextY.postDelayed(new Runnable() { // from class: fw5
            @Override // java.lang.Runnable
            public final void run() {
                PhoneBindPasswordActivity.D(editTextY, this);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(final String phone, String access) {
        w().bindAccount(this, "huami_phone", access, SelectAreaHelper.getAreaBySave().getValue(), new IAccount.Callback<BindResult, ErrorCode>() { // from class: com.huami.account.ui.bind.PhoneBindPasswordActivity$bindPhone$1
            @Override // com.huami.passport.IAccount.Callback
            public void onError(@NotNull ErrorCode errorCode) {
                HMLog.i(PhoneBindPasswordActivity.TAG, errorCode.toString(), new Object[0]);
                this.a.hideProgressDialog();
                PhoneBindPasswordActivity phoneBindPasswordActivity = this.a;
                IconToast.showError(phoneBindPasswordActivity, phoneBindPasswordActivity.getString(R.string.account_ui_account_bind_failed));
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(@NotNull BindResult result) {
                LoadingDialog loadingDialog = this.a.mLoadingDialog;
                if (loadingDialog == null) {
                    return;
                }
                String string = this.a.getString(R.string.account_ui_account_bind_success);
                final String str = phone;
                final PhoneBindPasswordActivity phoneBindPasswordActivity = this.a;
                loadingDialog.setSuccess(string, 500, new LoadingDialog.OnAnimEndListener() { // from class: com.huami.account.ui.bind.PhoneBindPasswordActivity$bindPhone$1$onSuccess$1
                    @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                    public void onAnimEnd(@NotNull LoadingDialog dialog) {
                    }

                    @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                    public void onDismiss(@NotNull LoadingDialog dialog) {
                        HMAccountKeeper.INSTANCE.saveAlreadyBindPhone(true);
                        EventBus.getDefault().post(new EventPhoneBinding(str));
                        phoneBindPasswordActivity.setResult(-1);
                        phoneBindPasswordActivity.finish();
                    }
                });
            }
        });
    }

    private final void v() {
        String strB;
        final String strA = A();
        if (strA == null || (strB = B()) == null) {
            return;
        }
        E(R.string.account_ui_account_binding);
        Area areaBySave = SelectAreaHelper.getAreaBySave();
        if (SelectAreaHelper.isUnknown(areaBySave)) {
            areaBySave = SelectAreaHelper.getAreaByCountryCode("CN");
        }
        w().registrations("", strA, y().getText().toString(), strB, areaBySave.getValue(), new IAccount.Callback<LoginInfo, ErrorCode>() { // from class: com.huami.account.ui.bind.PhoneBindPasswordActivity$bindPhoneNumber$1
            @Override // com.huami.passport.IAccount.Callback
            public void onError(@Nullable ErrorCode errorCode) {
                HMLog.i(PhoneBindPasswordActivity.TAG, String.valueOf(errorCode), new Object[0]);
                this.a.hideProgressDialog();
                if (Intrinsics.areEqual(ResponseConstant.ERROR_400_4, errorCode == null ? null : errorCode.getErrorCode())) {
                    PhoneBindPasswordActivity phoneBindPasswordActivity = this.a;
                    IconToast.showError(phoneBindPasswordActivity, phoneBindPasswordActivity.getString(R.string.account_ui_account_verify_code_wrong));
                } else {
                    PhoneBindPasswordActivity phoneBindPasswordActivity2 = this.a;
                    IconToast.showError(phoneBindPasswordActivity2, phoneBindPasswordActivity2.getString(R.string.account_ui_account_bind_failed));
                }
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(@Nullable LoginInfo loginInfo) {
                if (loginInfo != null && loginInfo.getAccess() != null) {
                    this.a.u(strA, loginInfo.getAccess());
                    return;
                }
                HMLog.i(PhoneBindPasswordActivity.TAG, "loginInfo or access is null", new Object[0]);
                this.a.hideProgressDialog();
                PhoneBindPasswordActivity phoneBindPasswordActivity = this.a;
                IconToast.showError(phoneBindPasswordActivity, phoneBindPasswordActivity.getString(R.string.account_ui_account_bind_failed));
            }
        });
    }

    private final AccountManager w() {
        return (AccountManager) this.accountManager.getValue();
    }

    private final TextView x() {
        return (TextView) this.confirmBtn.getValue();
    }

    private final EditText y() {
        return (EditText) this.inputPasswordText.getValue();
    }

    private final EditText z() {
        return (EditText) this.inputPasswordTextAgain.getValue();
    }

    @Override // com.huami.account.ui.common.BaseTitleOauthActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_ui_activity_bind_phone_password);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.s36), getString(R.string.account_ui_register_phone_set_password_title), !RainbowUtils.isDarkMode(this));
        GlobalTitleStyleKt.setupAccountTitleStyle(this);
        initViews();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        setResult(0);
        finish();
    }
}
