package com.huawei.health.device.ui.measure.activity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import com.google.gson.Gson;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.device.ui.measure.adapter.WifiDeviceShareAdapter;
import com.huawei.health.device.ui.measure.adapter.WifiDeviceShareMemberInfoAdapter;
import com.huawei.health.device.ui.measure.view.NoScrollListView;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetSubUserAuthMsgReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetSubUserAuthMsgRsp;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceShareMemberInfoBySubUserReq;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.up.api.UpApi;
import com.huawei.up.model.UserInfomation;
import defpackage.dnj;
import defpackage.dwf;
import defpackage.dxm;
import defpackage.dyg;
import defpackage.eaj;
import defpackage.eal;
import defpackage.ean;
import defpackage.eas;
import defpackage.ecf;
import defpackage.ecj;
import defpackage.ecl;
import defpackage.lmf;
import defpackage.lqo;
import defpackage.njy;
import defpackage.qlo;
import defpackage.qpx;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class WifiDeviceShareActivity extends BaseActivity implements View.OnClickListener {
    private CustomTextAlertDialog aa;
    private CustomTitleBar ab;
    private String ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSubHeader f6367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f6368c;
    private WifiDeviceShareAdapter d;
    private Context e;
    private d f;
    private ImageView h;
    private a i;
    private WifiDeviceShareMemberInfoAdapter k;
    private HealthTextView l;
    private ImageView m;
    private CommonDialog21 n;
    private HealthTextView o;
    private RelativeLayout p;
    private CustomTextAlertDialog q;
    private NoTitleCustomAlertDialog s;
    private HealthTextView u;
    private NoScrollListView x;
    private LinearLayout y;
    private List<eaj> v = new ArrayList(16);
    private List<dwf.c> w = new ArrayList(16);
    private String j = "";
    private String r = "";
    private String t = "-1";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6366a = false;
    private boolean g = false;

    static class d extends StaticHandler<WifiDeviceShareActivity> {
        d(WifiDeviceShareActivity wifiDeviceShareActivity) {
            super(wifiDeviceShareActivity);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessage(WifiDeviceShareActivity wifiDeviceShareActivity, Message message) throws Throwable {
            if (wifiDeviceShareActivity == null) {
                dyg.a(false, "WifiDeviceShareActivity", "activity is null");
            }
            if (wifiDeviceShareActivity.isDestroyed() || wifiDeviceShareActivity.isFinishing()) {
                LogUtil.e("WifiDeviceShareActivity", "activity is Destroyed/Finishing");
                return;
            }
            if (message == null) {
                dyg.a(false, "WifiDeviceShareActivity", "msg is null");
                return;
            }
            dyg.a(false, "WifiDeviceShareActivity", "MyHandler what:", Integer.valueOf(message.what));
            switch (message.what) {
                case 1001:
                    wifiDeviceShareActivity.i();
                    wifiDeviceShareActivity.l();
                    break;
                case 1002:
                    wifiDeviceShareActivity.i();
                    wifiDeviceShareActivity.c();
                    break;
                case 1003:
                    wifiDeviceShareActivity.c(wifiDeviceShareActivity.e.getResources().getString(R.string.IDS_getting_file));
                    break;
                case 1004:
                    wifiDeviceShareActivity.i();
                    wifiDeviceShareActivity.h();
                    break;
                case 1005:
                    wifiDeviceShareActivity.c(message.arg1);
                    break;
                default:
                    dyg.d(false, "MyHandler what is other", new Object[0]);
                    break;
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dyg.a(false, "WifiDeviceShareActivity", "onCreate");
        setContentView(R.layout.wifi_device_share_layout);
        this.e = this;
        this.f = new d(this);
        a aVar = new a(this);
        this.i = aVar;
        EventBus.b(aVar, 2, "sub_user_unauthorize_notification", "multi_user_auto_cancle_dialog");
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.hasExtra("deviceId")) {
                this.j = intent.getStringExtra("deviceId");
            }
            if (intent.hasExtra(ArkUIXConstants.FROM_TYPE) && "push".equals(intent.getStringExtra(ArkUIXConstants.FROM_TYPE))) {
                this.r = ecf.g(this.j);
            }
            if (intent.hasExtra("productId")) {
                this.r = intent.getStringExtra("productId");
            }
            if (TextUtils.isEmpty(this.r) && !TextUtils.isEmpty(this.j)) {
                this.r = ecf.g(this.j);
            }
            this.g = intent.getBooleanExtra("isSubUser", false);
        }
        o();
        j();
        g();
        h();
    }

    private void o() {
        this.m = (ImageView) findViewById(R.id.share_member_header_img);
        this.o = (HealthTextView) findViewById(R.id.share_member_header_title_tv);
        this.l = (HealthTextView) findViewById(R.id.share_member_sub_title_tv);
        this.x = (NoScrollListView) findViewById(R.id.wifi_device_share_member_view);
        this.h = (ImageView) findViewById(R.id.device_share_tint);
        if (!this.g) {
            WifiDeviceShareAdapter wifiDeviceShareAdapter = new WifiDeviceShareAdapter(this.e, this.v);
            this.d = wifiDeviceShareAdapter;
            this.x.setAdapter((ListAdapter) wifiDeviceShareAdapter);
        } else {
            WifiDeviceShareMemberInfoAdapter wifiDeviceShareMemberInfoAdapter = new WifiDeviceShareMemberInfoAdapter(this.e, this.j, this.w);
            this.k = wifiDeviceShareMemberInfoAdapter;
            this.x.setAdapter((ListAdapter) wifiDeviceShareMemberInfoAdapter);
        }
        this.f6368c = (HealthTextView) findViewById(R.id.wifi_device_share_add_member_tv);
        this.ab = (CustomTitleBar) findViewById(R.id.wifi_device_share_title);
        this.y = (LinearLayout) findViewById(R.id.authorize_request_list_entrance);
        this.f6367b = (HealthSubHeader) findViewById(R.id.authorized_users_header);
        if (dxm.y(this.r)) {
            this.f6368c.setVisibility(0);
            if (!this.g) {
                this.f6367b.setVisibility(0);
                this.y.setVisibility(0);
            } else {
                this.f6368c.setText(R.string.IDS_device_share_exit_device);
            }
        }
        this.ab.setTitleText(getString(R.string.IDS_device_wifi_scale_sub_user_menu));
        this.p = (RelativeLayout) findViewById(R.id.red_point_layout);
        this.u = (HealthTextView) findViewById(R.id.red_dot_msg_num);
        if (LanguageUtil.ba(this)) {
            this.h.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            this.h.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
        }
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        if (i > 0) {
            this.p.setVisibility(0);
            this.u.setText(UnitUtil.e(i, 1, 0));
            return;
        }
        this.p.setVisibility(4);
    }

    private void n() {
        WifiDeviceGetSubUserAuthMsgReq wifiDeviceGetSubUserAuthMsgReq = new WifiDeviceGetSubUserAuthMsgReq();
        wifiDeviceGetSubUserAuthMsgReq.setDevId(this.j);
        lqo.b(this.e).b(wifiDeviceGetSubUserAuthMsgReq, new ICloudOperationResult() { // from class: duu
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.d.e((CloudCommonReponse) obj, str, z);
            }
        });
    }

    public /* synthetic */ void e(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        LogUtil.a("WifiDeviceShareActivity", "wifiDeviceGetSubUserAuthMsg request result: ", Boolean.valueOf(z));
        if (z && !TextUtils.isEmpty(str)) {
            WifiDeviceGetSubUserAuthMsgRsp wifiDeviceGetSubUserAuthMsgRsp = (WifiDeviceGetSubUserAuthMsgRsp) new Gson().fromJson(str, WifiDeviceGetSubUserAuthMsgRsp.class);
            if (wifiDeviceGetSubUserAuthMsgRsp == null) {
                LogUtil.j("WifiDeviceShareActivity", "wifiDeviceGetSubUserAuthMsg return fail: authMsgRsp is null");
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 1005;
            messageObtain.arg1 = ecl.a(wifiDeviceGetSubUserAuthMsgRsp.getAuthMsgs());
            this.f.sendMessage(messageObtain);
            return;
        }
        LogUtil.a("WifiDeviceShareActivity", "wifiDeviceGetSubUserAuthMsg request result is not success or text is Empty");
        d();
        String string = getResources().getString(R.string.IDS_device_hagrid_loading_info_failed_prompt);
        qpx.e(this.e, string.substring(0, string.length() - 1));
    }

    private void j() {
        this.x.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.health.device.ui.measure.activity.WifiDeviceShareActivity$$ExternalSyntheticLambda8
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                this.f6369b.a(adapterView, view, i, j);
            }
        });
        this.f6368c.setOnClickListener(this);
        this.y.setOnClickListener(this);
    }

    /* synthetic */ void a(AdapterView adapterView, View view, int i, long j) {
        eaj eajVar;
        dyg.a(false, "WifiDeviceShareActivity", "select wifi position = " + i);
        if (!this.g) {
            if (njy.e(this.v, i)) {
                dyg.a(false, "WifiDeviceShareActivity", "mShareMemberList data is exception");
                return;
            }
            eajVar = this.v.get(i);
        } else {
            if (njy.e(this.w, i)) {
                dyg.a(false, "WifiDeviceShareActivity", "mSubUserShareMemberList data is exception");
                return;
            }
            eajVar = new eaj();
            dwf.c cVar = this.w.get(i);
            eajVar.b(cVar.d());
            eajVar.d(cVar.b());
            eajVar.c(cVar.e());
        }
        Intent intent = new Intent(this.e, (Class<?>) WifiDeviceShareAccountActivity.class);
        intent.putExtra("share_sub_user_info", eajVar);
        intent.putExtra("deviceId", this.j);
        intent.putExtra("isSubUser", this.g);
        startActivityForResult(intent, 100);
    }

    private void g() {
        UserInfomation userInfo;
        dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
        String str = "";
        if (mainUser != null) {
            ecj.e(mainUser.b(), this.m, qlo.b(this.e.getResources(), new qlo.e(null, mainUser.i(), true)));
            String accountName = new UpApi(this.e).getAccountName();
            String strH = mainUser.h();
            if (TextUtils.isEmpty(strH) && !TextUtils.isEmpty(accountName)) {
                strH = accountName;
            }
            if (TextUtils.isEmpty(strH) && (userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo()) != null && !TextUtils.isEmpty(userInfo.getName())) {
                strH = userInfo.getName();
            }
            str = strH != null ? strH : "";
            this.ad = str;
            this.o.setText(String.format(Locale.ENGLISH, this.e.getResources().getString(R.string.IDS_hwh_home_create_group_me), str));
            str = accountName;
        }
        if (!this.g) {
            this.l.setText(this.e.getResources().getString(R.string.IDS_device_wifi_share_account_administrator));
        } else {
            this.l.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.v.clear();
        this.w.clear();
        l();
        d dVar = this.f;
        if (dVar != null) {
            dVar.sendEmptyMessageDelayed(1003, 500L);
        }
        if (!this.g) {
            e();
        } else {
            a();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        dyg.a(false, "WifiDeviceShareActivity", "resultCode = " + i2);
        if (i != 100) {
            dyg.a(false, "WifiDeviceShareActivity", "onActivityResult nothing...");
            return;
        }
        if (i2 == 12) {
            this.f6366a = true;
            h();
        } else if (i2 == 11) {
            h();
        } else if (i2 == 10) {
            h();
        } else {
            dyg.a(false, "WifiDeviceShareActivity", "requestCode onActivityResult nothing...");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        h();
        n();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("WifiDeviceShareActivity", "onDestroy");
        super.onDestroy();
        EventBus.a(this.i, "sub_user_unauthorize_notification", "multi_user_auto_cancle_dialog");
        d dVar = this.f;
        if (dVar != null) {
            dVar.removeCallbacksAndMessages(null);
        }
        CommonDialog21 commonDialog21 = this.n;
        if (commonDialog21 == null || !commonDialog21.isShowing()) {
            return;
        }
        this.n.dismiss();
        this.n = null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.a("WifiDeviceShareActivity", "onClick view is null");
            return;
        }
        int id = view.getId();
        if (id == R.id.wifi_device_share_add_member_tv) {
            if (!this.g) {
                q();
                p();
                return;
            } else {
                t();
                return;
            }
        }
        if (id != R.id.authorize_request_list_entrance) {
            LogUtil.j("WifiDeviceShareActivity", "onClick unknown view ", Integer.valueOf(id));
            return;
        }
        Intent intent = new Intent(this.e, (Class<?>) WifiDeviceAuthRequestListActivity.class);
        intent.putExtra("dev_id", this.j);
        try {
            this.e.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("WifiDeviceShareActivity", "onClick startActivity ActivityNotFoundException occur.");
        }
    }

    private void q() {
        int i;
        if (!CommonUtil.ab(this.e)) {
            qpx.e(this.e, R.string.IDS_network_connect_error);
            return;
        }
        if (k()) {
            r();
            return;
        }
        if (dxm.u(this.r) || "b29df4e3-b1f7-4e40-960d-4cfb63ccca05".equals(this.r)) {
            i = 10;
        } else if (dxm.ah(this.r)) {
            i = 5;
        } else {
            dyg.d(false, "WifiDeviceShareActivity", "shareWifiScaleToFriend default");
            i = 4;
        }
        if (this.v.size() >= i) {
            s();
        } else if (!dxm.ag(this.r) && !m()) {
            w();
        } else {
            b();
        }
    }

    private void r() {
        dyg.a(false, "WifiDeviceShareActivity", "showSupportMultiMemberDialog");
        CustomTextAlertDialog customTextAlertDialog = this.q;
        if (customTextAlertDialog == null || !customTextAlertDialog.isShowing()) {
            String string = this.e.getResources().getString(R.string.IDS_device_wifi_user_permission_dialog_title);
            String string2 = this.e.getResources().getString(R.string.IDS_device_wifi_share_account_outh_content);
            String string3 = this.e.getResources().getString(R.string.IDS_settings_button_cancal);
            String string4 = this.e.getResources().getString(R.string.IDS_user_permission_ok);
            CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.e);
            builder.e(string).a(string2).b(string4, new View.OnClickListener() { // from class: dur
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32393c.d(view);
                }
            }).a(string3, new View.OnClickListener() { // from class: duv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32396a.b(view);
                }
            });
            CustomTextAlertDialog customTextAlertDialogB = builder.b();
            this.q = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
            this.q.show();
        }
    }

    public /* synthetic */ void d(View view) {
        dyg.a(false, "WifiDeviceShareActivity", "button click setPositiveButton");
        SharedPreferenceManager.e(this.e, "wifi_weight_device", "health_is_wifi_add_member_first_" + this.j, "true", null);
        q();
        this.q = null;
    }

    public /* synthetic */ void b(View view) {
        dyg.a(false, "WifiDeviceShareActivity", "button click setNegativeButton");
        this.q = null;
    }

    private void t() {
        LogUtil.a("WifiDeviceShareActivity", "showSubUserExitDeviceDialog");
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.s;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            LogUtil.j("WifiDeviceShareActivity", "showSubUserExitDeviceDialog mMemberNumLimitDialog isShowing");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.e);
        builder.b(R.string.IDS_device_share_exit);
        builder.c(R.string.IDS_contact_confirm_ios_btn, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.activity.WifiDeviceShareActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EventBus.a(new EventBus.d("event_bus_sub_user_exit_device"));
                WifiDeviceShareActivity.this.finish();
            }
        });
        builder.a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: dun
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.s = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.s.show();
    }

    public /* synthetic */ void c(View view) {
        this.s.dismiss();
    }

    private void s() {
        dyg.a(false, "WifiDeviceShareActivity", "showMemberNumLimitDialog");
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.s;
        if (noTitleCustomAlertDialog == null || !noTitleCustomAlertDialog.isShowing()) {
            String string = this.e.getResources().getString(R.string.IDS_device_wifi_share_account_limit_content);
            String string2 = this.e.getResources().getString(R.string.IDS_device_measureactivity_result_confirm);
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.e);
            builder.a(string).a(string2, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.activity.WifiDeviceShareActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    WifiDeviceShareActivity.this.s = null;
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            this.s = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCancelable(false);
            this.s.show();
        }
    }

    private void w() {
        dyg.a(false, "WifiDeviceShareActivity", "showSupportMultiMemberDialog");
        CustomTextAlertDialog customTextAlertDialog = this.aa;
        if (customTextAlertDialog == null || !customTextAlertDialog.isShowing()) {
            String string = this.e.getResources().getString(R.string.IDS_device_wear_home_device_ota_upgrade);
            String string2 = this.e.getResources().getString(R.string.IDS_device_wifi_share_account_version_update);
            String string3 = this.e.getResources().getString(R.string.IDS_settings_button_cancal);
            String string4 = this.e.getResources().getString(R.string.IDS_device_manager_update_health);
            CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.e);
            builder.e(string).a(string2).b(string4, new View.OnClickListener() { // from class: dus
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32394c.e(view);
                }
            }).a(string3, new View.OnClickListener() { // from class: duw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32397b.a(view);
                }
            });
            CustomTextAlertDialog customTextAlertDialogB = builder.b();
            this.aa = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
            this.aa.show();
        }
    }

    public /* synthetic */ void e(View view) {
        dyg.a(false, "WifiDeviceShareActivity", "button click setPositiveButton");
        f();
        this.aa = null;
    }

    public /* synthetic */ void a(View view) {
        dyg.a(false, "WifiDeviceShareActivity", "button click setNegativeButton");
        this.aa = null;
    }

    private void a() {
        WifiDeviceShareMemberInfoBySubUserReq wifiDeviceShareMemberInfoBySubUserReq = new WifiDeviceShareMemberInfoBySubUserReq();
        wifiDeviceShareMemberInfoBySubUserReq.setDevId(this.j);
        lqo.b(this).c(wifiDeviceShareMemberInfoBySubUserReq, new ICloudOperationResult() { // from class: dut
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f32395a.b((CloudCommonReponse) obj, str, z);
            }
        });
    }

    public /* synthetic */ void b(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        if (this.f == null) {
            LogUtil.j("WifiDeviceShareActivity", "getAuthorizeSubUserFromCloud mHandler is null");
            return;
        }
        if (z) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("members");
                this.w.clear();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    dwf.c cVar = new dwf.c();
                    cVar.e(jSONObject.getString("huid"));
                    cVar.c(jSONObject.getInt("mainUserFlag"));
                    cVar.a(jSONObject.getString("userAccount"));
                    this.w.add(cVar);
                }
            } catch (JSONException unused) {
                LogUtil.a("WifiDeviceShareActivity", "AuthorizeSubUser members is JSONException");
            }
            this.f.sendEmptyMessage(1001);
            return;
        }
        LogUtil.j("WifiDeviceShareActivity", "getMemberInfoBySubUser fail");
        this.f.sendEmptyMessage(1002);
    }

    private void e() {
        ean.a(this.j, new CommBaseCallbackInterface() { // from class: dvb
            @Override // com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface
            public final void onResult(int i, String str, Object obj) {
                this.e.e(i, str, obj);
            }
        });
    }

    public /* synthetic */ void e(int i, String str, Object obj) {
        List<eaj> list;
        d dVar = this.f;
        if (dVar == null) {
            dyg.d(false, "WifiDeviceShareActivity", "getAuthorizeSubUserFromCloud mHandler is null");
            return;
        }
        if (i == 0 && (obj instanceof eal)) {
            ArrayList<eaj> arrayListE = ((eal) obj).e();
            if (arrayListE != null && (list = this.v) != null) {
                list.clear();
                this.v.addAll(arrayListE);
            }
            this.f.sendEmptyMessage(1001);
            return;
        }
        dVar.sendEmptyMessage(1002);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() throws Throwable {
        this.v.clear();
        eal ealVarA = ecf.a(this.j);
        if (ealVarA != null && ealVarA.e() != null) {
            this.v.addAll(ealVarA.e());
        }
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        WifiDeviceShareAdapter wifiDeviceShareAdapter = this.d;
        if (wifiDeviceShareAdapter != null) {
            wifiDeviceShareAdapter.notifyDataSetChanged();
        }
        WifiDeviceShareMemberInfoAdapter wifiDeviceShareMemberInfoAdapter = this.k;
        if (wifiDeviceShareMemberInfoAdapter != null) {
            wifiDeviceShareMemberInfoAdapter.notifyDataSetChanged();
        }
    }

    private void b() {
        dyg.a(false, "WifiDeviceShareActivity", "goDeviceSharePage");
        Intent intent = new Intent(this.e, (Class<?>) WifiDeviceAddUserActivity.class);
        intent.putExtra("deviceId", this.j);
        intent.putExtra("productId", this.r);
        intent.putExtra(HwPayConstant.KEY_USER_NAME, this.ad);
        startActivity(intent);
    }

    private void f() {
        dyg.a(false, "WifiDeviceShareActivity", "goOtaUpdatePage");
        eas.b().c(this.j, false);
        Intent intent = new Intent(this.e, (Class<?>) DeviceMainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("view", "WifiVersionDetails");
        bundle.putString("productId", this.r);
        intent.putExtras(bundle);
        try {
            this.e.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("WifiDeviceShareActivity", "goOtaUpdatePage startActivity ActivityNotFoundException.");
        }
    }

    private boolean m() {
        String strE = SharedPreferenceManager.e(this.e, "wifi_weight_device", "support_multi_account_" + this.j);
        this.t = strE;
        return !TextUtils.isEmpty(strE) && "1".equals(this.t);
    }

    private void p() {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(this.e, AnalyticsValue.HEALTH_PLUGIN_DEVICE_WIFI_DEVICE_MULTIACCOUNT_SHARE_2060032.value(), map, 0);
    }

    private boolean k() {
        String strE = SharedPreferenceManager.e(this.e, "wifi_weight_device", "health_is_wifi_add_member_first_" + this.j);
        return "false".equals(strE) || "".equals(strE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (isFinishing() || isDestroyed()) {
            LogUtil.j("WifiDeviceShareActivity", "showLoadDataDialog error: activity is finishing");
            return;
        }
        if (this.n == null) {
            new CommonDialog21(this, R.style.app_update_dialogActivity);
            this.n = CommonDialog21.b(this);
        }
        this.n.setCancelable(false);
        this.n.b(str);
        this.n.c();
    }

    private void d() {
        CommonDialog21 commonDialog21 = this.n;
        boolean z = commonDialog21 != null && commonDialog21.isShowing();
        if (isFinishing() || !z) {
            return;
        }
        this.n.dismiss();
        this.n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f.removeMessages(1003);
        d();
        if (this.f6366a) {
            this.f6366a = false;
            Context context = this.e;
            qpx.e(context, context.getResources().getString(R.string.IDS_device_wifi_share_remove_success));
        }
    }

    static class a implements EventBus.ICallback {
        private WeakReference<WifiDeviceShareActivity> d;

        a(WifiDeviceShareActivity wifiDeviceShareActivity) {
            this.d = new WeakReference<>(wifiDeviceShareActivity);
        }

        @Override // com.huawei.health.device.util.EventBus.ICallback
        public void onEvent(EventBus.d dVar) {
            WeakReference<WifiDeviceShareActivity> weakReference = this.d;
            if (weakReference == null) {
                dyg.a(false, "WifiDeviceShareActivity", "mActivity is null");
                return;
            }
            WifiDeviceShareActivity wifiDeviceShareActivity = weakReference.get();
            if (wifiDeviceShareActivity == null) {
                dyg.a(false, "WifiDeviceShareActivity", "activity is null");
                return;
            }
            if (dVar == null) {
                dyg.a(false, "WifiDeviceShareActivity", "event is null");
                return;
            }
            String strE = dVar.e();
            dyg.a(false, "WifiDeviceShareActivity", "onEvent == ", strE);
            if ("sub_user_unauthorize_notification".equals(strE) || "multi_user_auto_cancle_dialog".equals(dVar.e())) {
                wifiDeviceShareActivity.f.sendEmptyMessage(1004);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
