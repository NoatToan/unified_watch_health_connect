package com.huawei.health.device.ui.measure.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.health.pluginhealthzone.FamilyHealthZoneApi;
import com.huawei.health.pluginhealthzone.UserInfoCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.AuthorizeSubUserInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetAuthorizeSubUserReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetAuthorizeSubUserRsp;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceShareByMainUserReq;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.edittext.HealthIconTextLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.up.api.UpApi;
import defpackage.eaj;
import defpackage.ecf;
import defpackage.gqd;
import defpackage.lqo;
import defpackage.qpx;
import defpackage.qrs;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class WifiDeviceAccountAddUserActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthIconTextLayout f6346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f6347b;
    private Context d;
    private HealthButton e;
    private CommonDialog21 g;
    private LinearLayout i;
    private LinearLayout j;
    private ImageView k;
    private HealthTextView l;
    private HealthTextView m;
    private HealthTextView n;
    private eaj o;
    private a q;
    private CustomTitleBar s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6348c = "";
    private boolean f = true;
    private int t = 0;
    private ViewTreeObserver.OnGlobalLayoutListener h = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: dua
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            this.f32378a.b();
        }
    };

    static class a extends StaticHandler<WifiDeviceAccountAddUserActivity> {
        a(WifiDeviceAccountAddUserActivity wifiDeviceAccountAddUserActivity) {
            super(wifiDeviceAccountAddUserActivity);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessage(WifiDeviceAccountAddUserActivity wifiDeviceAccountAddUserActivity, Message message) {
            if (wifiDeviceAccountAddUserActivity == null || wifiDeviceAccountAddUserActivity.isDestroyed() || wifiDeviceAccountAddUserActivity.isFinishing()) {
                LogUtil.j("WifiDeviceAccountAddUserActivity", "UiHandler activity is dead");
                return;
            }
            if (message == null) {
                LogUtil.j("WifiDeviceAccountAddUserActivity", "UiHandler msg is null");
            } else if (message.what == 1) {
                wifiDeviceAccountAddUserActivity.c();
                wifiDeviceAccountAddUserActivity.h();
            } else {
                LogUtil.j("WifiDeviceAccountAddUserActivity", "UiHandler what is other");
            }
        }
    }

    public /* synthetic */ void b() {
        Rect rect = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int i = this.t;
        if (i == 0) {
            this.t = iHeight;
            return;
        }
        if (i != iHeight) {
            int i2 = i - iHeight;
            this.t = iHeight;
            this.f6347b.setVisibility(0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(1, i2);
            layoutParams.height = i2;
            this.f6347b.setLayoutParams(layoutParams);
            if (i2 <= 0) {
                this.n.setVisibility(0);
            } else {
                this.n.setVisibility(8);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_device_account_adduser);
        getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.h);
        this.d = this;
        Intent intent = getIntent();
        if (intent != null) {
            this.f6348c = intent.getStringExtra("deviceId");
        }
        this.q = new a(this);
        d();
        e();
    }

    private void d() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.my_qrcode_title_layout);
        this.s = customTitleBar;
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: dtw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(view);
            }
        });
        HealthIconTextLayout healthIconTextLayout = (HealthIconTextLayout) findViewById(R.id.hw_device_adduser_edit_layout);
        this.f6346a = healthIconTextLayout;
        healthIconTextLayout.getEditText().setSingleLine();
        this.f6346a.getImageView().setVisibility(8);
        this.f6346a.setOnIconClickListener(new View.OnClickListener() { // from class: dtz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32376c.c(view);
            }
        });
        this.k = (ImageView) findViewById(R.id.hw_share_sub_head);
        this.l = (HealthTextView) findViewById(R.id.hw_share_sub_nickname);
        this.m = (HealthTextView) findViewById(R.id.hw_share_sub_id);
        this.e = (HealthButton) findViewById(R.id.hw_device_share_button);
        this.i = (LinearLayout) findViewById(R.id.hw_share_search);
        this.j = (LinearLayout) findViewById(R.id.hw_share_result);
        this.n = (HealthTextView) findViewById(R.id.hw_device_adduser_title);
        this.f6347b = findViewById(R.id.hw_device_bottom_view_gap);
        this.e.setOnClickListener(this);
    }

    public /* synthetic */ void d(View view) {
        LogUtil.a("WifiDeviceAccountAddUserActivity", "mTitleBar leftButton onClick");
        finish();
    }

    public /* synthetic */ void c(View view) {
        this.f6346a.getEditText().setText("");
    }

    private void e() {
        this.f6346a.getEditText().addTextChangedListener(new TextWatcher() { // from class: com.huawei.health.device.ui.measure.activity.WifiDeviceAccountAddUserActivity.5
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int length = charSequence.length();
                LogUtil.a("WifiDeviceAccountAddUserActivity", "onTextChanged start:", Integer.valueOf(i), ",content length:", Integer.valueOf(length));
                if (length > 1) {
                    WifiDeviceAccountAddUserActivity.this.e.setEnabled(true);
                    WifiDeviceAccountAddUserActivity.this.f6346a.getImageView().setVisibility(0);
                } else {
                    WifiDeviceAccountAddUserActivity.this.f6346a.getImageView().setVisibility(8);
                    WifiDeviceAccountAddUserActivity.this.e.setEnabled(false);
                }
            }
        });
        this.f6346a.getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: duf
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.e.e(view, z);
            }
        });
    }

    public /* synthetic */ void e(View view, boolean z) {
        if (z) {
            this.n.setVisibility(8);
        } else {
            this.n.setVisibility(0);
        }
    }

    private void e(String str) {
        if (isFinishing() || isDestroyed()) {
            LogUtil.j("WifiDeviceAccountAddUserActivity", "showLoadDataDialog error: activity is finishing");
            return;
        }
        if (this.g == null) {
            new CommonDialog21(this, R.style.app_update_dialogActivity);
            this.g = CommonDialog21.b(this);
        }
        this.g.setCancelable(false);
        this.g.b(str);
        this.g.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        CommonDialog21 commonDialog21 = this.g;
        boolean z = commonDialog21 != null && commonDialog21.isShowing();
        if (isFinishing() || !z) {
            return;
        }
        this.g.dismiss();
        this.g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        qpx.e(this.d, R.string.IDS_device_share_fail);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.hw_device_share_button) {
            if (qrs.c(1500)) {
                LogUtil.j("WifiDeviceAccountAddUserActivity", "click too fast return.");
                return;
            }
            LogUtil.a("WifiDeviceAccountAddUserActivity", "Click the invite button.", " mIsHideResult: ", Boolean.valueOf(this.f));
            if (this.f) {
                c(this.f6346a.getEditText().getText().toString());
                return;
            }
            WifiDeviceGetAuthorizeSubUserReq wifiDeviceGetAuthorizeSubUserReq = new WifiDeviceGetAuthorizeSubUserReq();
            wifiDeviceGetAuthorizeSubUserReq.setDevId(this.f6348c);
            lqo.b(this.d).b(wifiDeviceGetAuthorizeSubUserReq, new ICloudOperationResult() { // from class: dty
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str, boolean z) {
                    this.d.a((WifiDeviceGetAuthorizeSubUserRsp) obj, str, z);
                }
            });
            return;
        }
        LogUtil.a("WifiDeviceAccountAddUserActivity", "onClick is nothing");
    }

    public /* synthetic */ void a(WifiDeviceGetAuthorizeSubUserRsp wifiDeviceGetAuthorizeSubUserRsp, String str, boolean z) {
        if (z) {
            List<AuthorizeSubUserInfo> authorizeSubUserList = wifiDeviceGetAuthorizeSubUserRsp.getAuthorizeSubUserList();
            LogUtil.a("WifiDeviceAccountAddUserActivity", "subUserList size: ", Integer.valueOf(authorizeSubUserList.size()));
            if (authorizeSubUserList == null) {
                LogUtil.j("WifiDeviceAccountAddUserActivity", "subUserList is null.");
            }
            if (authorizeSubUserList != null && authorizeSubUserList.size() == 9) {
                qpx.b(this.d, R.string.IDS_device_wifi_my_qrcode_add_member_exceeding_limit);
            } else {
                j();
            }
        }
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            qpx.e(this.d, R.string.IDS_device_share_account_fail);
            return;
        }
        e(getResources().getString(R.string.IDS_getting_file));
        if (this.q == null) {
            this.q = new a(this);
        }
        this.q.removeMessages(1);
        this.q.sendEmptyMessageDelayed(1, 5000L);
        ((FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class)).requestFindUserInfo(0, str, new UserInfoCallback<gqd.c>() { // from class: com.huawei.health.device.ui.measure.activity.WifiDeviceAccountAddUserActivity.3
            @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void infoCallback(gqd.c cVar) {
                WifiDeviceAccountAddUserActivity.this.q.removeMessages(1);
                WifiDeviceAccountAddUserActivity.this.c();
                if (cVar == null) {
                    qpx.a(WifiDeviceAccountAddUserActivity.this.d, R.string.IDS_device_share_user_fail);
                } else {
                    LogUtil.a("WifiDeviceAccountAddUserActivity", "getUserHuid searchHmsUserData userId:", Long.valueOf(cVar.a()));
                    WifiDeviceAccountAddUserActivity.this.a(cVar);
                }
            }

            @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
            public void errorCallback(int i) {
                LogUtil.j("WifiDeviceAccountAddUserActivity", "getUserHuid service errorCode: ", Integer.valueOf(i));
                WifiDeviceAccountAddUserActivity.this.q.removeMessages(1);
                WifiDeviceAccountAddUserActivity.this.c();
                if (i == 3009 || i == 3010) {
                    qpx.a(WifiDeviceAccountAddUserActivity.this.d, R.string.IDS_device_share_user_fail);
                    return;
                }
                if (i == 6006) {
                    qpx.a(WifiDeviceAccountAddUserActivity.this.d, R.string.IDS_device_share_fail);
                    return;
                }
                if (i == 6005) {
                    LogUtil.j("WifiDeviceAccountAddUserActivity", "HMS Core is not installed.");
                    qpx.a(WifiDeviceAccountAddUserActivity.this.d, R.string.IDS_device_share_fail);
                } else if (i != 1000) {
                    qpx.a(WifiDeviceAccountAddUserActivity.this.d, R.string.IDS_device_share_fail);
                } else {
                    LogUtil.j("WifiDeviceAccountAddUserActivity", "HMS Core is not login again.");
                    qpx.a(BaseApplication.getContext(), R.string.IDS_vmall_hms_core_installed_alert);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final gqd.c cVar) {
        LogUtil.j("WifiDeviceAccountAddUserActivity", "getManagerInfo is starting。。。");
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.j("WifiDeviceAccountAddUserActivity", "getManagerInfo userId is null");
            return;
        }
        if (accountInfo.equals(String.valueOf(cVar.a()))) {
            qpx.e(this.d, R.string.IDS_device_share_self);
            c();
            return;
        }
        if (cVar == null) {
            qpx.e(this.d, R.string.IDS_device_hagrid_loading_info_failed_prompt);
            LogUtil.a("WifiDeviceAccountAddUserActivity", "getManagerInfo info is null");
            c();
            return;
        }
        LogUtil.a("WifiDeviceAccountAddUserActivity", "getManagerInfo info is not null");
        LogUtil.d("WifiDeviceAccountAddUserActivity", "getManagerInfo info : ", cVar.toString());
        this.f = false;
        eaj eajVar = new eaj();
        this.o = eajVar;
        eajVar.c(String.valueOf(cVar.a()));
        LogUtil.a("WifiDeviceAccountAddUserActivity", "userDataResult user id: ", String.valueOf(cVar.a()));
        runOnUiThread(new Runnable() { // from class: dtu
            @Override // java.lang.Runnable
            public final void run() {
                this.f32372b.c(cVar);
            }
        });
        c();
    }

    public /* synthetic */ void c(gqd.c cVar) {
        this.i.setVisibility(8);
        this.j.setVisibility(0);
        qrs.c(this.k, cVar.c(), cVar.a());
        String strD = cVar.d();
        String strHandleAccount = new UpApi(this.d).handleAccount(this.f6346a.getEditText().getText().toString());
        HealthTextView healthTextView = this.l;
        if (TextUtils.isEmpty(strD)) {
            strD = strHandleAccount;
        }
        healthTextView.setText(strD);
        this.o.b(this.l.getText().toString());
        this.m.setText(strHandleAccount);
        this.e.setText(R.string.IDS_device_share_invite);
        this.s.setTitleText(getString(R.string.IDS_device_share_user_detail));
    }

    private boolean a() {
        LogUtil.a("WifiDeviceAccountAddUserActivity", "checkCurrentUserIsSubUser mDeviceId starting");
        if (ecf.a(this.f6348c) == null) {
            LogUtil.j("WifiDeviceAccountAddUserActivity", "checkCurrentUserIsSubUser this device have no subUser");
            return false;
        }
        ArrayList<eaj> arrayListE = ecf.a(this.f6348c).e();
        if (arrayListE != null && arrayListE.size() > 0) {
            ArrayList arrayList = new ArrayList(arrayListE.size());
            for (eaj eajVar : arrayListE) {
                LogUtil.j("WifiDeviceAccountAddUserActivity", "checkCurrentUserIsSubUser subUser.getNickName() = ", eajVar.c());
                arrayList.add(eajVar.a());
            }
            if (arrayList.contains(this.o.a())) {
                LogUtil.j("WifiDeviceAccountAddUserActivity", "checkCurrentUserIsSubUser have auth user > ", Integer.valueOf(R.string.IDS_device_hygride_auth_user));
                return true;
            }
        }
        return false;
    }

    private void j() {
        LogUtil.j("WifiDeviceAccountAddUserActivity", "shareToSubUser starting");
        WifiDeviceShareByMainUserReq wifiDeviceShareByMainUserReq = new WifiDeviceShareByMainUserReq();
        if (a()) {
            LogUtil.j("WifiDeviceAccountAddUserActivity", "shareToSubUser is wifi subUser");
            qpx.e(this.d, R.string.IDS_device_hygride_auth_user);
            return;
        }
        wifiDeviceShareByMainUserReq.setDevId(this.f6348c);
        wifiDeviceShareByMainUserReq.setSubHuid(this.o.a());
        String legalAccountName = new UpApi(this.d).getLegalAccountName();
        if (TextUtils.isEmpty(legalAccountName)) {
            legalAccountName = this.o.c();
        }
        wifiDeviceShareByMainUserReq.setNickname(legalAccountName);
        wifiDeviceShareByMainUserReq.setExpireTime(3600);
        lqo.b(this).a(wifiDeviceShareByMainUserReq, new ICloudOperationResult() { // from class: dub
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f32379a.e((CloudCommonReponse) obj, str, z);
            }
        });
    }

    public /* synthetic */ void e(final CloudCommonReponse cloudCommonReponse, String str, final boolean z) {
        runOnUiThread(new Runnable() { // from class: duc
            @Override // java.lang.Runnable
            public final void run() {
                this.f32382c.e(z, cloudCommonReponse);
            }
        });
    }

    public /* synthetic */ void e(boolean z, CloudCommonReponse cloudCommonReponse) {
        if (z) {
            Toast.makeText(getApplicationContext(), R.string.IDS_device_share_wait, 1).show();
            finish();
            return;
        }
        LogUtil.j("WifiDeviceAccountAddUserActivity", "shareToSubUser fail");
        if (cloudCommonReponse != null && cloudCommonReponse.getResultCode().intValue() == 112000090) {
            Toast.makeText(getApplicationContext(), R.string.IDS_device_share_repet, 1).show();
        } else if (cloudCommonReponse != null && cloudCommonReponse.getResultCode().intValue() == 112000020) {
            Toast.makeText(getApplicationContext(), R.string.IDS_device_hygride_auth_user, 1).show();
        } else {
            Toast.makeText(getApplicationContext(), R.string.IDS_device_share_fail, 1).show();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CommonDialog21 commonDialog21 = this.g;
        if (commonDialog21 == null || !commonDialog21.isShowing()) {
            return;
        }
        this.g.dismiss();
        this.g = null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("WifiDeviceAccountAddUserActivity", "onBackPressed");
        super.onBackPressed();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
