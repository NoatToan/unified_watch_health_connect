package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetMainUserAuth;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceSubuserAuthorize;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import com.huawei.up.api.UpApi;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class rod {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile rod f47518c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomAlertDialog f47519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f47520b;
    private long f;
    private EventBus.ICallback g = new EventBus.ICallback() { // from class: rod.3
        @Override // com.huawei.health.device.util.EventBus.ICallback
        public void onEvent(EventBus.d dVar) {
            if (dVar == null) {
                LogUtil.j("WifiDeviceUserGetManage", "event is null");
                return;
            }
            if ("device_main_share_to_sub_user".equals(dVar.e())) {
                dya.b("device_main_share_to_sub_user");
                String string = dVar.b().getString("pushContent");
                LogUtil.d("WifiDeviceUserGetManage", "EVEBUS_WIFI_DEVICE_SHARE_TO_SUB_USER pushContent=", string);
                if (!TextUtils.isEmpty(string)) {
                    try {
                        String string2 = new JSONObject(string).getString("prodId");
                        rod.this.m = dxm.t(string2);
                        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "productIdForConfigWifi", rod.this.m, null);
                    } catch (JSONException unused) {
                        LogUtil.e("WifiDeviceUserGetManage", "EVEBUS_WIFI_DEVICE_SHARE_TO_SUB_USER JSONException");
                    }
                }
                rod.this.d();
            }
        }
    };
    private boolean h;
    private String i;
    private boolean j;
    private String k;
    private NoTitleCustomAlertDialog l;
    private String m;
    private UserProfileMgrApi n;
    private String o;
    private static final String[] e = {"device_main_share_to_sub_user"};
    private static final Object d = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        lqo.b(BaseApplication.getContext()).b(new WifiDeviceGetMainUserAuth(), new ICloudOperationResult<CloudCommonReponse>() { // from class: rod.2
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void operationResult(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
                if (!z || TextUtils.isEmpty(str)) {
                    LogUtil.j("WifiDeviceUserGetManage", "getMainUserShareDevice, isSuccess is false or text is null");
                    return;
                }
                try {
                    JSONArray jSONArray = new JSONObject(str).getJSONArray("authMsgs");
                    if (jSONArray != null && jSONArray.length() > 0) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            if (jSONObject.getInt("status") == 101) {
                                rod.this.f = jSONObject.getLong("mainHuid");
                                rod.this.i = jSONObject.getString("devId");
                                rod.this.c(jSONObject);
                                rod.this.e(jSONObject.getString("nickname"));
                                return;
                            }
                        }
                        return;
                    }
                    LogUtil.j("WifiDeviceUserGetManage", "getMainUserShareDevice, jsonArray is null or jsonArray size<=0");
                } catch (JSONException e2) {
                    LogUtil.e("WifiDeviceUserGetManage", "getMainUserShareDevice, JSONException", e2.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("prodId");
        this.k = strOptString;
        LogUtil.a("WifiDeviceUserGetManage", "mProdId: ", strOptString);
        if (!TextUtils.isEmpty(this.k)) {
            String str = dxm.g.get(this.k);
            this.m = str;
            LogUtil.a("WifiDeviceUserGetManage", "getMainUserShareDevice-mProduct: ", str);
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "productIdForConfigWifi", this.m, null);
            return;
        }
        LogUtil.j("WifiDeviceUserGetManage", "mProdId is an empty string.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        String string = this.f47520b.getResources().getString(R.string.IDS_device_herm_name);
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "productIdForConfigWifi");
        this.m = strE;
        if ("b29df4e3-b1f7-4e40-960d-4cfb63ccca05".equals(strE)) {
            string = this.f47520b.getResources().getString(R.string.IDS_device_hag2021_name);
            LogUtil.a("WifiDeviceUserGetManage", "showShareDeviceCard mProductId scalesName = ", string);
        }
        LogUtil.a("WifiDeviceUserGetManage", "showShareDeviceCard mProductId scalesName = ", string);
        Locale locale = Locale.ENGLISH;
        String string2 = this.f47520b.getResources().getString(R.string.IDS_device_share_subuser_authorize_2);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.o = String.format(locale, string2, str, string);
        this.f47520b.runOnUiThread(new Runnable() { // from class: rod.5
            @Override // java.lang.Runnable
            public void run() {
                rod rodVar = rod.this;
                rodVar.d(rodVar.f47520b, rod.this.o);
            }
        });
    }

    private String c() {
        UserInfomation userInfo = this.n.getUserInfo();
        if (userInfo != null && !TextUtils.isEmpty(userInfo.getName())) {
            return userInfo.getName();
        }
        String accountInfo = LoginInit.getInstance(this.f47520b).getAccountInfo(1002);
        if (!TextUtils.isEmpty(accountInfo)) {
            return accountInfo;
        }
        String legalAccountName = new UpApi(this.f47520b).getLegalAccountName();
        return !TextUtils.isEmpty(legalAccountName) ? legalAccountName : MultiUsersManager.INSTANCE.getCurrentUser().h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final boolean z) {
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "productIdForConfigWifi", null, null);
        WifiDeviceSubuserAuthorize wifiDeviceSubuserAuthorize = new WifiDeviceSubuserAuthorize();
        wifiDeviceSubuserAuthorize.setDevId(this.i);
        wifiDeviceSubuserAuthorize.setMainHuid(String.valueOf(this.f));
        wifiDeviceSubuserAuthorize.setNickname(c());
        wifiDeviceSubuserAuthorize.setIntent(z ? 1 : 2);
        ReleaseLogUtil.d("WifiDeviceUserGetManage", "acceptMainUserShareDevice isAgree ", Boolean.valueOf(z));
        lqo.b(this.f47520b).c(wifiDeviceSubuserAuthorize, new ICloudOperationResult<CloudCommonReponse>() { // from class: rod.4
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void operationResult(CloudCommonReponse cloudCommonReponse, String str, boolean z2) {
                if (!z2) {
                    if (cloudCommonReponse == null || 112000010 != cloudCommonReponse.getResultCode().intValue()) {
                        qpx.b(rod.this.f47520b, com.huawei.ui.homehealth.R.string.IDS_music_management_operation_failed);
                        rod.this.d();
                        return;
                    } else {
                        LogUtil.a("WifiDeviceUserGetManage", "acceptMainUserShareDevice", cloudCommonReponse.getResultCode());
                        qpx.b(rod.this.f47520b, com.huawei.ui.homehealth.R.string.IDS_device_wifi_my_qrcode_add_member_exceeding_limit);
                    }
                }
                rod.this.a(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (!z) {
            LogUtil.j("WifiDeviceUserGetManage", "acceptMainUserShareDevice, hide share card");
            return;
        }
        boolean zIsResourcesAvailable = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(this.m);
        String str = this.m;
        if (str != null && zIsResourcesAvailable && dxm.ad(str) && !dzu.e(this.m, "HDK_WEIGHT")) {
            LogUtil.a("WifiDeviceUserGetManage", "updateResourceFile: isPluginAvaiable is true and mProductId = ", CommonUtil.n(this.m));
            Activity activity = this.f47520b;
            dzu.e(activity, activity);
        } else {
            ean.b(this.i, false);
            new rvd().d(this.f47520b, this.m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        CustomAlertDialog customAlertDialog = this.f47519a;
        if (customAlertDialog != null && customAlertDialog.isShowing()) {
            LogUtil.j("WifiDeviceUserGetManage", "mAuthDialog isShowing");
            return;
        }
        View viewInflate = View.inflate(this.f47520b, com.huawei.plugindevice.R.layout.dialog_user_auth_message, null);
        c(viewInflate);
        d(viewInflate);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.f47520b);
        builder.d(com.huawei.plugindevice.R.string.IDS_device_wifi_user_permission_dialog_title);
        builder.a(viewInflate);
        builder.c().setAllCaps(true);
        builder.d(com.huawei.plugindevice.R.string.IDS_user_permission_ok, new DialogInterface.OnClickListener() { // from class: rob
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.e.d(dialogInterface, i);
            }
        });
        builder.a(com.huawei.plugindevice.R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: roc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f47517c.c(dialogInterface, i);
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        this.f47519a = customAlertDialogB;
        customAlertDialogB.setCancelable(false);
        this.f47519a.show();
    }

    /* synthetic */ void d(DialogInterface dialogInterface, int i) {
        if (!this.h) {
            ioi.d().e(7, true, "DeviceFragment", null);
        }
        if (!this.j) {
            ioi.d().e(2, true, "DeviceFragment", null);
        }
        b(true);
    }

    /* synthetic */ void c(DialogInterface dialogInterface, int i) {
        LogUtil.j("WifiDeviceUserGetManage", "onClick view");
        b(false);
    }

    private void d(final View view) {
        if (view == null) {
            LogUtil.j("WifiDeviceUserGetManage", "onDialogSizeChanged, dialogView is null");
        } else {
            view.post(new Runnable() { // from class: rod.1
                @Override // java.lang.Runnable
                public void run() {
                    int measuredHeight = view.getMeasuredHeight();
                    int iB = (int) (qqv.b(rod.this.f47520b) * 0.8f);
                    if (measuredHeight > iB) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        layoutParams.height = iB;
                        view.setLayoutParams(layoutParams);
                        view.requestLayout();
                    }
                }
            });
        }
    }

    private void c(View view) {
        String string = this.f47520b.getResources().getString(com.huawei.ui.homehealth.R.string.IDS_device_haige_user_permission_message, "");
        boolean z = f() || g();
        HealthTextView healthTextView = (HealthTextView) view.findViewById(com.huawei.ui.homehealth.R.id.dialog_text_alert_message);
        if (z) {
            StringBuffer stringBuffer = new StringBuffer(16);
            if (f() && g()) {
                stringBuffer.append(System.lineSeparator()).append(this.f47520b.getResources().getString(com.huawei.ui.homehealth.R.string.IDS_device_haige_user_permission_message_health_item));
                stringBuffer.append(System.lineSeparator()).append(this.f47520b.getResources().getString(com.huawei.ui.homehealth.R.string.IDS_device_wifi_user_permission_dialog_personal_infomation_message));
            } else if (f()) {
                stringBuffer.append(System.lineSeparator()).append(this.f47520b.getResources().getString(com.huawei.ui.homehealth.R.string.IDS_device_haige_user_permission_message_health_item));
            } else if (g()) {
                stringBuffer.append(System.lineSeparator()).append(this.f47520b.getResources().getString(com.huawei.ui.homehealth.R.string.IDS_device_wifi_user_permission_dialog_personal_infomation_message));
            } else {
                LogUtil.j("WifiDeviceUserGetManage", "get HealthData And Personal Info fail");
            }
            SpannableString spannableString = new SpannableString(this.f47520b.getResources().getString(com.huawei.ui.homehealth.R.string.IDS_device_wifi_user_permission_dialog_message, this.f47520b.getResources().getString(com.huawei.ui.homehealth.R.string.IDS_device_wifi_user_permission_dialog_params_message_new, stringBuffer)));
            qri.a(spannableString, stringBuffer.toString(), new AbsoluteSizeSpan(13, true));
            healthTextView.setText(spannableString);
            return;
        }
        healthTextView.setText(string);
    }

    private boolean f() {
        return a() && Utils.h();
    }

    private boolean g() {
        return b() && Utils.h();
    }

    private boolean a() {
        if ("true".equals(ioi.d().c(7))) {
            this.h = true;
        } else {
            this.h = false;
        }
        return !this.h;
    }

    private boolean b() {
        if ("true".equals(ioi.d().c(2))) {
            this.j = true;
        } else {
            this.j = false;
        }
        return !this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Activity activity, String str) {
        LogUtil.a("WifiDeviceUserGetManage", "showSingleRequestDlg");
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.l;
        if (noTitleCustomAlertDialog != null) {
            if (noTitleCustomAlertDialog.isShowing()) {
                this.l.dismiss();
            }
            this.l = null;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
        builder.a(str).a(R.string.IDS_hw_device_wifi_subuser_request_authorize_reject, new View.OnClickListener() { // from class: rod.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("WifiDeviceUserGetManage", "dealMultiRequest: clicked cancel");
                rod.this.b(false);
            }
        }).c(R.string.IDS_hw_device_wifi_subuser_request_authorize_agree, new View.OnClickListener() { // from class: rod.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("WifiDeviceUserGetManage", "dealMultiRequest: clicked ok");
                rod.this.j();
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.l = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.l.show();
    }

    public void b(Activity activity) {
        LogUtil.a("WifiDeviceUserGetManage", "checkMainUserShare");
        if (this.f47520b == null) {
            this.f47520b = activity;
        }
        ThreadPoolManager.c().a("WifiDeviceUserGetManage", new Runnable() { // from class: roa
            @Override // java.lang.Runnable
            public final void run() {
                this.f47516b.d();
            }
        });
    }

    public void e(Activity activity) {
        this.f47520b = activity;
        this.n = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        dya.b(this.g, 0, e);
        i();
    }

    private void i() {
        final EventBus.d dVarD = dya.d("device_main_share_to_sub_user");
        if (dVarD == null) {
            return;
        }
        lsy.a(new Runnable() { // from class: rnz
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b(dVarD);
            }
        });
    }

    /* synthetic */ void b(EventBus.d dVar) {
        this.g.onEvent(dVar);
    }

    public void d(Activity activity) {
        dya.c(this.g, e);
    }

    public static rod e() {
        if (f47518c == null) {
            synchronized (d) {
                if (f47518c == null) {
                    f47518c = new rod();
                }
            }
        }
        return f47518c;
    }
}
