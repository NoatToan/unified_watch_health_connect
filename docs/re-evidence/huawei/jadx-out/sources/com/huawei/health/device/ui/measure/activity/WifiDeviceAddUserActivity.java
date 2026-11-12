package com.huawei.health.device.ui.measure.activity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.ui.qrcode.activity.MyQrCodeActivity;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetVerifyCodeForMainUserRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Constants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.up.api.UpApi;
import com.huawei.up.model.UserInfomation;
import defpackage.dxm;
import defpackage.eby;
import defpackage.ecf;
import defpackage.gxt;
import defpackage.lqo;
import defpackage.lsj;
import defpackage.lsy;
import defpackage.prf;
import defpackage.qpx;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class WifiDeviceAddUserActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f6350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f6351b;
    private LinearLayout d;
    private Context e;
    private ImageView f;
    private CustomTitleBar g;
    private ImageView h;
    private String i;
    private ImageView m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6352c = "";
    private String j = "";

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_device_adduser);
        this.e = this;
        Intent intent = getIntent();
        if (intent != null) {
            this.f6352c = intent.getStringExtra("deviceId");
            this.j = intent.getStringExtra("productId");
        }
        j();
        a();
    }

    private boolean a() {
        Context context = this.e;
        if (context != null && CommonUtil.ab(context)) {
            LogUtil.a("WifiDeviceAddUserActivity", "netWork is ok");
            return true;
        }
        qpx.e(this.e, R.string.IDS_network_connect_error);
        LogUtil.j("WifiDeviceAddUserActivity", "netWork is error");
        return false;
    }

    private void j() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.my_qrcode_title_layout);
        this.g = customTitleBar;
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: duh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32385a.a(view);
            }
        });
        this.d = (LinearLayout) findViewById(R.id.hw_device_share_qr);
        this.f6351b = (LinearLayout) findViewById(R.id.hw_device_share_account);
        this.f6350a = (LinearLayout) findViewById(R.id.hw_device_share_wechat);
        this.h = (ImageView) findViewById(R.id.hw_device_adduser_qrtint);
        this.f = (ImageView) findViewById(R.id.hw_device_adduser_hwtint);
        this.m = (ImageView) findViewById(R.id.hw_device_adduser_wechattint);
        this.d.setOnClickListener(this);
        this.f6351b.setOnClickListener(this);
        this.f6350a.setOnClickListener(this);
        if (!Utils.o() && (dxm.u(this.j) || dxm.v(this.j))) {
            this.f6351b.setVisibility(0);
        }
        a(this.h);
        a(this.f);
        a(this.m);
        c();
    }

    public /* synthetic */ void a(View view) {
        setResult(10);
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!CommonUtil.ab(this.e)) {
            qpx.e(this.e, R.string.IDS_network_connect_error);
            return;
        }
        if (view == this.d) {
            h();
            return;
        }
        if (view == this.f6351b) {
            boolean zD = d();
            LogUtil.a("WifiDeviceAddUserActivity", "click mAddUserAccount and check isInstallHMSCore is ", Boolean.valueOf(zD));
            if (!CommonUtil.as() && !zD) {
                prf.a(this.e);
                return;
            } else {
                g();
                return;
            }
        }
        if (view == this.f6350a) {
            e();
        } else {
            LogUtil.j("WifiDeviceAddUserActivity", "click error");
        }
    }

    private void a(ImageView imageView) {
        if (LanguageUtil.ba(this)) {
            imageView.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            imageView.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
        }
    }

    private void e() {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.e.getResources(), R.drawable.ic_body_fat_scale_share);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R.color.hw_device_background_color_white));
        canvas.drawRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), paint);
        canvas.drawBitmap(bitmapDecodeResource, 0.0f, 0.0f, paint);
        LogUtil.d("WifiDeviceAddUserActivity", "shareMyQrCode shareUrl is::", this.i);
        if (TextUtils.isEmpty(this.i)) {
            LogUtil.j("WifiDeviceAddUserActivity", "shareMyQrCode shareUrl is empty.");
        } else {
            b(bitmapCreateBitmap, this.i, false);
        }
    }

    private void b(Bitmap bitmap, String str, boolean z) {
        gxt gxtVar = new gxt(2);
        gxtVar.e(this.e.getResources().getString(R.string.IDS_device_wifi_share_bodyfat_scale));
        gxtVar.b("");
        gxtVar.d(bitmap);
        gxtVar.f(str);
        gxtVar.e(z);
        ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(gxtVar, this.e);
    }

    private void h() {
        Intent intent = new Intent(this.e, (Class<?>) MyQrCodeActivity.class);
        intent.putExtra("deviceId", this.f6352c);
        intent.putExtra("productId", this.j);
        startActivityForResult(intent, 100);
    }

    private void g() {
        Intent intent = new Intent(this.e, (Class<?>) WifiDeviceAccountAddUserActivity.class);
        intent.putExtra("deviceId", this.f6352c);
        intent.putExtra("productId", this.j);
        startActivity(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("WifiDeviceAddUserActivity", "onBackPressed");
        setResult(10);
        super.onBackPressed();
    }

    private void c() {
        lsy.a(new Runnable() { // from class: com.huawei.health.device.ui.measure.activity.WifiDeviceAddUserActivity.1
            @Override // java.lang.Runnable
            public void run() {
                String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
                if (accountInfo == null) {
                    LogUtil.j("WifiDeviceAddUserActivity", "get userid or accountName is null");
                    return;
                }
                UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
                if (userInfo == null) {
                    LogUtil.j("WifiDeviceAddUserActivity", "get userInfo is null");
                    return;
                }
                String name = userInfo.getName();
                if (TextUtils.isEmpty(name)) {
                    LogUtil.j("WifiDeviceAddUserActivity", "get userInfo.getName() is null");
                    name = new UpApi(WifiDeviceAddUserActivity.this.e).getLegalAccountName();
                }
                if (TextUtils.isEmpty(name)) {
                    LogUtil.j("WifiDeviceAddUserActivity", "get UpApi.getLegalAccountName is null");
                    name = LoginInit.getInstance(WifiDeviceAddUserActivity.this.e).getAccountInfo(1002);
                }
                if (!TextUtils.isEmpty(name)) {
                    if (TextUtils.isEmpty(WifiDeviceAddUserActivity.this.f6352c)) {
                        LogUtil.j("WifiDeviceAddUserActivity", "get mDeviceId is null");
                        return;
                    } else {
                        WifiDeviceAddUserActivity wifiDeviceAddUserActivity = WifiDeviceAddUserActivity.this;
                        wifiDeviceAddUserActivity.b(accountInfo, name, wifiDeviceAddUserActivity.f6352c);
                        return;
                    }
                }
                LogUtil.j("WifiDeviceAddUserActivity", "get LoginInit.getUserName is null");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final String str, final String str2, final String str3) {
        lqo.b(this.e).e(new ICloudOperationResult<WifiDeviceGetVerifyCodeForMainUserRsp>() { // from class: com.huawei.health.device.ui.measure.activity.WifiDeviceAddUserActivity.5
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void operationResult(WifiDeviceGetVerifyCodeForMainUserRsp wifiDeviceGetVerifyCodeForMainUserRsp, String str4, boolean z) throws Throwable {
                int iIntValue;
                String resultDesc;
                if (z) {
                    LogUtil.a("WifiDeviceAddUserActivity", "getVerifyCode success.");
                    if (wifiDeviceGetVerifyCodeForMainUserRsp == null) {
                        LogUtil.a("WifiDeviceAddUserActivity", "verifyCodeForMainUserRsp is null.");
                        return;
                    }
                    String verifyCode = wifiDeviceGetVerifyCodeForMainUserRsp.getVerifyCode();
                    if (!TextUtils.isEmpty(verifyCode)) {
                        WifiDeviceAddUserActivity.this.a(str, str2, str3, verifyCode);
                        return;
                    } else {
                        LogUtil.j("WifiDeviceAddUserActivity", "verifyCode is null.");
                        return;
                    }
                }
                if (wifiDeviceGetVerifyCodeForMainUserRsp == null) {
                    iIntValue = Constants.CODE_UNKNOWN_ERROR;
                    resultDesc = "unknown error";
                } else {
                    iIntValue = wifiDeviceGetVerifyCodeForMainUserRsp.getResultCode().intValue();
                    resultDesc = wifiDeviceGetVerifyCodeForMainUserRsp.getResultDesc();
                }
                LogUtil.a("WifiDeviceAddUserActivity", "getVerifyCode error: ", Integer.valueOf(iIntValue), ", resultDesc: ", resultDesc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4) throws Throwable {
        String strB;
        HashMap map = new HashMap(16);
        map.put("mainHuid", str);
        map.put("nickName", str2);
        map.put("devId", str3);
        map.put("verifyCode", str4);
        eby ebyVarD = ecf.d(str3);
        if (ebyVarD != null) {
            map.put("proId", ebyVarD.a().h());
        }
        try {
            String string = new JSONObject(map).toString();
            LogUtil.d("WifiDeviceAddUserActivity", "content:", string);
            String strReplaceAll = Base64.encodeToString(string.getBytes("utf-8"), 0).replaceAll("\r|\n", "");
            if (CompileParameterUtil.c("SUPPORT_WIFI_QR_URL_TEST", false)) {
                strB = CompileParameterUtil.b("WIFI_QRCODE_URL_PRE_TEST", "");
            } else {
                strB = GRSManager.c(BaseApplication.getContext()).getUrl("domainUrlCloudHuawei") + "/1Lfn1eswP6?a=";
            }
            String str5 = strB + "s&c=" + strReplaceAll + "&name=" + str2;
            this.i = str5;
            LogUtil.d("WifiDeviceAddUserActivity", "qrcodeUrl:", str5);
            return this.i;
        } catch (UnsupportedEncodingException e) {
            LogUtil.j("WifiDeviceAddUserActivity", "encode QrCode UnsupportedEncodingException:", e.getMessage());
            return "";
        }
    }

    private boolean d() {
        LogUtil.a("WifiDeviceAddUserActivity", "Enter checkIsInstallHuaweiAccount");
        if (CommonUtil.ca()) {
            LogUtil.a("WifiDeviceAddUserActivity", "StoreDemo no check hms");
            return true;
        }
        PackageManager packageManager = this.e.getPackageManager();
        try {
            String hMSPackageName = HMSPackageManager.getInstance(this.e).getHMSPackageName();
            LogUtil.a("WifiDeviceAddUserActivity", "checkIsInstallHuaweiAccount packageName: ", hMSPackageName);
            boolean z = packageManager.getApplicationInfo(hMSPackageName, 128) != null;
            LogUtil.a("WifiDeviceAddUserActivity", "checkIsInstallHuaweiAccount: ", Boolean.valueOf(z));
            return z;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("WifiDeviceAddUserActivity", "checkIsInstallHuaweiAccount NameNotFoundException false");
            return b();
        }
    }

    private boolean b() {
        LogUtil.a("WifiDeviceAddUserActivity", "Enter checkIsInstallAGLiteApp");
        if (CommonUtil.ca()) {
            LogUtil.a("WifiDeviceAddUserActivity", "checkIsInstallAGLiteApp no check hms");
            return true;
        }
        String hMSPackageNameForMultiService = HMSPackageManager.getInstance(this.e).getHMSPackageNameForMultiService();
        LogUtil.a("WifiDeviceAddUserActivity", "checkIsInstallAGLiteApp packageName: ", hMSPackageNameForMultiService);
        boolean zC = lsj.c(this.e, hMSPackageNameForMultiService);
        LogUtil.a("WifiDeviceAddUserActivity", "checkIsInstallAGLiteApp result: ", Boolean.valueOf(zC));
        return zC;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
