package com.huami.account.ui;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.huami.account.AccountExternalsKt;
import com.huami.account.HMLoginManager;
import com.huami.account.XiaomiTokenMananger;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.account.api.model.AccountInfo;
import com.huami.account.bean.AuthDeviceSource;
import com.huami.account.bean.DeviceSource;
import com.huami.account.ui.AccountBindActivity;
import com.huami.account.ui.bind.PhoneBindActivity;
import com.huami.account.ui.common.DebugUi;
import com.huami.account.ui.common.GlobalTitleStyleKt;
import com.huami.account.ui.common.LoadingDialogHelper;
import com.huami.account.utils.AppChannel;
import com.huami.account.utils.AppChannelKt;
import com.huami.account.utils.UtilsKt;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.webapi.HMRestfulCodeUtil;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.passport.AccountManager;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.entity.BindAccount;
import com.huami.passport.entity.BindResult;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.acra.ACRAConstants;

/* JADX INFO: loaded from: classes4.dex */
public class AccountBindActivity extends BaseTitleActivity {
    public static final String ACCOUNT_INFO = "account_info";
    private static final String I = "AccountBindActivity";
    private static final int J = 1000;
    private ListTile A;
    private ListTile B;
    private ListTile C;
    private ListTile D;
    private TextView E;
    private AccountManager F;
    private LoadingDialogHelper G;
    private final List<String> H = Arrays.asList("google", "facebook", "line");
    private AccountInfo x;
    private ListTile y;
    private ListTile z;

    public class a implements IAccount.Callback<String, ErrorCode> {
        public final /* synthetic */ String a;

        /* JADX INFO: renamed from: com.huami.account.ui.AccountBindActivity$a$a, reason: collision with other inner class name */
        public class C0266a implements LoadingDialog.OnAnimEndListener {
            public C0266a() {
            }

            @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
            public void onAnimEnd(LoadingDialog loadingDialog) {
            }

            @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
            public void onDismiss(LoadingDialog loadingDialog) {
                if ("xiaomi".equals(a.this.a)) {
                    XiaomiTokenMananger.clearXiaomiToken();
                }
                AccountBindActivity.this.finish();
            }
        }

        public a(String str) {
            this.a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(ErrorCode errorCode) {
            return "unbind:" + errorCode;
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onError(final ErrorCode errorCode) {
            AccountBindActivity.this.G.hideDialog();
            AccountBindActivity.this.P(R.string.account_ui_account_unbind_failed);
            HMLog.info(AccountBindActivity.I, new Function0() { // from class: com.huami.account.ui.a
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return AccountBindActivity.a.b(errorCode);
                }
            });
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            AccountBindActivity.this.G.setSuccess(AccountBindActivity.this.getString(R.string.account_ui_account_unbind_success), 500L, new C0266a());
        }
    }

    public class b implements IAccount.Callback<BindResult, ErrorCode> {
        public final /* synthetic */ String a;

        public class a implements LoadingDialog.OnAnimEndListener {
            public a() {
            }

            @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
            public void onAnimEnd(LoadingDialog loadingDialog) {
            }

            @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
            public void onDismiss(LoadingDialog loadingDialog) {
                AccountBindActivity.this.finish();
            }
        }

        public b(String str) {
            this.a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(ErrorCode errorCode) {
            return "bind error:" + errorCode.toString();
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onError(final ErrorCode errorCode) {
            HMLog.info(AccountBindActivity.I, new Function0() { // from class: com.huami.account.ui.b
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return AccountBindActivity.b.b(errorCode);
                }
            });
            String errorCode2 = errorCode.getErrorCode();
            if (ErrorCode.UNINSTALL_TPAPP_ERROR.equals(errorCode2) && AccountBindActivity.this.O(this.a)) {
                return;
            }
            if ("0111".equals(errorCode2)) {
                AccountBindActivity.this.P(R.string.account_ui_account_bind_third_id_already_bind);
                AccountBindActivity.this.M("AccountExists");
            } else if ("0112".equals(errorCode.getErrorCode())) {
                AccountBindActivity.this.P(R.string.account_ui_account_bind_not_support);
            } else if (ErrorCode.USER_CANCEL_ERROR.equals(errorCode.getErrorCode())) {
                AccountBindActivity.this.P(R.string.account_ui_account_bind_failed);
            } else {
                AccountBindActivity.this.P(R.string.account_ui_account_bind_failed);
                AccountBindActivity.this.M("OtherError");
            }
            Analytics.recordEvent(new CountEventBuilder("Setting_AccountError").setValue("OtherError"));
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BindResult bindResult) {
            BindAccount data;
            AccountBindActivity.this.G.showLoadingDialog(AccountBindActivity.this.getString(R.string.account_ui_account_binding));
            AccountBindActivity.this.G.setSuccess(AccountBindActivity.this.getString(R.string.account_ui_account_bind_success), 500L, new a());
            if ("xiaomi".equals(this.a) && bindResult != null && (data = bindResult.getData()) != null) {
                XiaomiTokenMananger.saveXiaomiToken(data.getRefreshToken(), data.getAccessToken(), data.getThirdId(), data.getExpiresIn());
            }
            AccountExternalsKt.getAccountDelegate().updateSpeechMiotToken();
        }
    }

    public static class c extends AsyncTask<Void, Void, Boolean> {
        private final WeakReference<AccountBindActivity> a;
        private final AuthDeviceSource b;
        private final String c;

        public class a extends IHMSimpleHttpResponseHandler {
            public final /* synthetic */ AtomicBoolean a;

            public a(AtomicBoolean atomicBoolean) {
                this.a = atomicBoolean;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String d(int i) {
                return "addAuthKey onCancel:" + i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String e(HMHttpResponseData hMHttpResponseData) {
                StringBuilder sb = new StringBuilder();
                sb.append("addAuthKey onFailure:");
                sb.append(hMHttpResponseData == null ? null : Integer.valueOf(hMHttpResponseData.getStatusCode()));
                return sb.toString();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String f(HMHttpResponseData hMHttpResponseData) {
                StringBuilder sb = new StringBuilder();
                sb.append("addAuthKey onSuccess:");
                sb.append((hMHttpResponseData == null || hMHttpResponseData.getResponseBody() == null) ? "null" : new String(hMHttpResponseData.getResponseBody()));
                return sb.toString();
            }

            @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(final int i) {
                this.a.set(false);
                HMLog.info(AccountBindActivity.I, new Function0() { // from class: com.huami.account.ui.d
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return AccountBindActivity.c.a.d(i);
                    }
                });
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(final HMHttpResponseData hMHttpResponseData) {
                this.a.set(hMHttpResponseData != null && HMRestfulCodeUtil.isConflict(hMHttpResponseData.getStatusCode()));
                HMLog.info(AccountBindActivity.I, new Function0() { // from class: com.huami.account.ui.e
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return AccountBindActivity.c.a.e(hMHttpResponseData);
                    }
                });
            }

            @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
            public void onSuccess(WebResponse webResponse, final HMHttpResponseData hMHttpResponseData) {
                this.a.set(true);
                HMLog.info(AccountBindActivity.I, new Function0() { // from class: com.huami.account.ui.f
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return AccountBindActivity.c.a.f(hMHttpResponseData);
                    }
                });
            }
        }

        public c(AccountBindActivity accountBindActivity, AuthDeviceSource authDeviceSource, String str) {
            this.a = new WeakReference<>(accountBindActivity);
            this.b = authDeviceSource;
            this.c = str;
        }

        private boolean b() {
            HMLog.info(AccountBindActivity.I, new Function0() { // from class: com.huami.account.ui.c
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return AccountBindActivity.c.d();
                }
            });
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            HMAccountWebAPI.addAuthKey(this.b, new a(atomicBoolean));
            return atomicBoolean.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d() {
            return "addAuthKey";
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            boolean zB = b();
            if (zB) {
                AccountExternalsKt.getAccountDelegate().updateDeviceAuthKey(this.b.getValue(), HMLoginManager.getThirdId());
            }
            return Boolean.valueOf(zB);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            AccountBindActivity accountBindActivity = this.a.get();
            if (accountBindActivity == null || accountBindActivity.isFinishing()) {
                return;
            }
            if (bool.booleanValue()) {
                accountBindActivity.z(this.c);
            } else {
                accountBindActivity.G.hideDialog();
                accountBindActivity.P(R.string.account_ui_account_bind_failed);
            }
        }
    }

    private void A(String str, String str2) {
        this.G.showLoadingDialog(getString(R.string.account_ui_account_unbinding));
        this.F.unbindAccount(str, str2, new a(str));
    }

    private void B(int i) {
        Intent intent = new Intent(this, (Class<?>) PhoneBindActivity.class);
        intent.putExtra(PhoneBindActivity.EXTRA_BIND_TYPE, i);
        if (i == 1) {
            startActivityForResult(intent, 1000);
        } else {
            startActivity(intent);
        }
    }

    private void C() {
        this.y = (ListTile) findViewById(R.id.account_bind_mi);
        this.z = (ListTile) findViewById(R.id.account_bind_wechat);
        this.A = (ListTile) findViewById(R.id.account_bind_phone);
        this.B = (ListTile) findViewById(R.id.account_bind_google);
        this.C = (ListTile) findViewById(R.id.account_bind_facebook);
        this.D = (ListTile) findViewById(R.id.account_bind_line);
        this.E = (TextView) findViewById(R.id.tv_destroy_account);
    }

    private void D(final ListTile listTile, final String str) {
        if (str.equals("huami_phone") && !HMLoginManager.isInChina()) {
            listTile.setVisibility(8);
            return;
        }
        if (this.H.contains(str) && HMLoginManager.isInChina()) {
            listTile.setVisibility(8);
            return;
        }
        if (!this.x.isBind(str)) {
            listTile.setTips(R.string.account_ui_account_bind);
            listTile.setTrailingIvVisible(true);
            listTile.setOnClickListener(new View.OnClickListener() { // from class: y2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.F(listTile, str, view);
                }
            });
        } else {
            if ("huami_phone".equals(str)) {
                listTile.setTrailingIvVisible(true);
                listTile.setTips(R.string.account_ui_account_change_bind_phone);
                listTile.setOnClickListener(new View.OnClickListener() { // from class: x2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.G(listTile, view);
                    }
                });
                listTile.setOnLongClickListener(new View.OnLongClickListener() { // from class: a3
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return this.a.I(str, view);
                    }
                });
                return;
            }
            if (this.x.isUniqueProvider(str)) {
                listTile.setTrailingIvVisible(false);
                return;
            }
            listTile.setTrailingIvVisible(true);
            listTile.setTips(R.string.account_ui_account_unbind);
            listTile.setOnClickListener(new View.OnClickListener() { // from class: z2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.J(listTile, str, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String E() {
        return "bind";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(ListTile listTile, String str, View view) {
        UtilsKt.conflictClick(listTile, new long[0]);
        y(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(ListTile listTile, View view) {
        UtilsKt.conflictClick(listTile, new long[0]);
        B(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit H(String str) {
        A(str, this.x.getIdByProvider(str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean I(final String str, View view) {
        DebugUi.debugEntrance(this, "解绑手机号？（仅调试）", new Function0() { // from class: b3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return this.a.H(str);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(ListTile listTile, String str, View view) {
        UtilsKt.conflictClick(listTile, new long[0]);
        Q(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(View view) {
        AccountExternalsKt.getAccountDelegate().goAccountMifit(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(String str, String str2, DialogInterface dialogInterface, int i) {
        A(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(String str) {
        Analytics.recordEvent(new CountEventBuilder("Setting_AccountError").setValue(str));
    }

    private void N() {
        D(this.A, "huami_phone");
        D(this.y, "xiaomi");
        D(this.z, "wechat");
        D(this.B, "google");
        D(this.C, "facebook");
        D(this.D, "line");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean O(String str) {
        if ("google".equals(str)) {
            IconToast.showError(this, getString(R.string.account_ui_no_google_play_services_title));
            return true;
        }
        if (!"wechat".equals(str)) {
            return false;
        }
        IconToast.showError(this, getString(R.string.account_ui_wechat_uninstall));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(int i) {
        CustomToast.makeText(this, i, 0).show();
    }

    private void Q(final String str) {
        int i;
        if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            IconToast.showError(this, getString(R.string.account_ui_no_network_connection));
            return;
        }
        final String idByProvider = this.x.getIdByProvider(str);
        str.hashCode();
        switch (str) {
            case "google":
                i = R.string.account_ui_account_unbind_google_notifi;
                break;
            case "wechat":
                i = R.string.account_ui_account_unbind_wechat_notifi;
                break;
            case "xiaomi":
                i = R.string.account_ui_account_unbind_mi_notifi;
                break;
            case "line":
                i = R.string.account_ui_account_unbind_line_notifi;
                break;
            case "facebook":
                i = R.string.account_ui_account_unbind_facebook_notifi;
                break;
            default:
                return;
        }
        new AlertDialogFragment.Builder(this).setTitle(R.string.account_ui_account_unbind_check).setCancelable(true).setParagraph(i).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: v2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.L(str, idByProvider, dialogInterface, i2);
            }
        }).setNegativeButton(R.string.account_ui_cancel, (DialogInterface.OnClickListener) null).show(getSupportFragmentManager());
    }

    @SuppressLint({"ResourceAsColor"})
    private void initView() {
        N();
        this.E.setOnClickListener(new View.OnClickListener() { // from class: w2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.K(view);
            }
        });
        if (AppChannelKt.getAppChannel(this) == AppChannel.MiFit) {
            this.y.setLeadingTint(getResources().getColor(R.color.account_ui_orange100));
            this.z.setLeadingTint(getResources().getColor(R.color.account_ui_normal_color));
        }
    }

    private void y(String str) {
        if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            IconToast.showError(this, getString(R.string.account_ui_no_network_connection));
            M("ErrorByNet");
            return;
        }
        AuthDeviceSource invalidAuthKeyDeviceSource = AccountExternalsKt.getAccountDelegate().getInvalidAuthKeyDeviceSource();
        boolean zIsUseXiaomiLogin = HMLoginManager.isUseXiaomiLogin();
        if (!Objects.equals(invalidAuthKeyDeviceSource, DeviceSource.INSTANCE.getVirtualDevice()) && zIsUseXiaomiLogin) {
            new c(this, invalidAuthKeyDeviceSource, str).execute(new Void[0]);
        } else {
            HMLog.info(I, new Function0() { // from class: c3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return AccountBindActivity.E();
                }
            });
            z(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(String str) {
        String country = Locale.getDefault().getCountry();
        if (TextUtils.equals(str, "huami_phone")) {
            B(1);
        } else {
            this.F.bindAccount(this, str, country, new b(str));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        AccountManager.getDefault(this).onActivityResult(i, i2, intent);
        if (i == 1000 && i2 == -1) {
            this.x.setAccountId("huami_phone", ACRAConstants.NOT_AVAILABLE);
            N();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App);
        super.onCreate(bundle);
        setContentView(R.layout.account_ui_activity_account_bind);
        this.G = new LoadingDialogHelper(this);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, GlobalTitleStyleKt.getTitleBgColor(this), getString(R.string.account_ui_account_and_security_title), !RainbowUtils.isDarkMode(this));
        GlobalTitleStyleKt.setupAccountTitleStyle(this);
        GlobalTitleStyleKt.setRightTitleGone(this);
        this.x = (AccountInfo) getIntent().getSerializableExtra(ACCOUNT_INFO);
        this.F = AccountManager.getDefault(getApplicationContext());
        C();
        initView();
        Analytics.recordEvent(new CountEventBuilder("Setting_AccountViewNum"));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.G.hideDialog();
        super.onDestroy();
    }
}
