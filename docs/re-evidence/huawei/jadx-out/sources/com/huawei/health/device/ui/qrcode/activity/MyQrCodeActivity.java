package com.huawei.health.device.ui.qrcode.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetVerifyCodeForMainUserRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Constants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.up.api.UpApi;
import com.huawei.up.model.UserInfomation;
import defpackage.dxm;
import defpackage.eby;
import defpackage.ecf;
import defpackage.gsk;
import defpackage.gsm;
import defpackage.gxt;
import defpackage.lmf;
import defpackage.lon;
import defpackage.lqo;
import defpackage.lsy;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MyQrCodeActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f6424a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f6426c;
    private HealthTextView d;
    private c e;
    private LinearLayout g;
    private HealthTextView h;
    private HealthTextView i;
    private LinearLayout j;
    private ImageView k;
    private HealthTextView l;
    private HealthProgressBar m;
    private Bitmap n;
    private View o;
    private ImageView p;
    private LinearLayout q;
    private HealthButton r;
    private String s;
    private View t;
    private CustomTitleBar v;
    private LinearLayout w;
    private HealthTextView x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6425b = "";
    private String f = "";

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        setContentView(R.layout.activity_my_qrcode);
        this.f6426c = this;
        this.e = new c(this);
        Intent intent = getIntent();
        if (intent != null) {
            this.f6425b = intent.getStringExtra("deviceId");
            this.f = intent.getStringExtra("productId");
        }
        a();
        b();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.a("MyQrCodeActivity", "MyQrCodeActivity on resume");
        try {
            super.onResume();
        } catch (Exception unused) {
            LogUtil.e("MyQrCodeActivity", "MyQrCodeActivity exception");
        }
    }

    static class c extends StaticHandler<MyQrCodeActivity> {
        c(MyQrCodeActivity myQrCodeActivity) {
            super(myQrCodeActivity);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessage(MyQrCodeActivity myQrCodeActivity, Message message) {
            if (myQrCodeActivity == null || myQrCodeActivity.isFinishing() || myQrCodeActivity.isDestroyed()) {
                LogUtil.j("MyQrCodeActivity", "MyQrCodeActivity is Destroyed.");
                return;
            }
            LogUtil.a("MyQrCodeActivity", "MyHandler what:", Integer.valueOf(message.what));
            switch (message.what) {
                case 2000001:
                    if (myQrCodeActivity.e.hasMessages(3000004)) {
                        myQrCodeActivity.e.removeMessages(3000004);
                    }
                    myQrCodeActivity.e.sendEmptyMessageDelayed(3000004, 1800000L);
                    myQrCodeActivity.d();
                    break;
                case 2000002:
                    if (myQrCodeActivity.e.hasMessages(3000004)) {
                        myQrCodeActivity.e.removeMessages(3000004);
                    }
                    myQrCodeActivity.e();
                    break;
                case 2000003:
                    qpx.e(myQrCodeActivity.f6426c, R.string.IDS_qrcode_refresh_fail);
                    myQrCodeActivity.b(false);
                    myQrCodeActivity.d(false);
                    break;
                case 3000004:
                    if (myQrCodeActivity.e.hasMessages(3000004)) {
                        myQrCodeActivity.e.removeMessages(3000004);
                    }
                    myQrCodeActivity.c();
                    myQrCodeActivity.e.sendEmptyMessageDelayed(3000004, 1800000L);
                    break;
                case 3000005:
                    qpx.e(myQrCodeActivity.f6426c, String.format(Locale.ENGLISH, myQrCodeActivity.f6426c.getString(R.string.IDS_device_wifi_qrcode_refresh_too_much), 30));
                    myQrCodeActivity.b(false);
                    myQrCodeActivity.d(false);
                    break;
                default:
                    LogUtil.j("MyQrCodeActivity", "MyHandler what is other");
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        if (CommonUtil.ab(this.f6426c.getApplicationContext())) {
            LogUtil.a("MyQrCodeActivity", "netWork is ok");
            this.e.sendEmptyMessage(2000001);
            return true;
        }
        LogUtil.j("MyQrCodeActivity", "netWork is False");
        this.e.sendEmptyMessage(2000002);
        return false;
    }

    private void b() throws Throwable {
        c();
        this.e.sendEmptyMessageDelayed(3000004, 1800000L);
        this.v.setRightButtonOnClickListener(new View.OnClickListener() { // from class: dwu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(view);
            }
        });
        String strG = ecf.g(this.f6425b);
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        if (dxm.ag(strG)) {
            this.j.setVisibility(8);
            this.i.setVisibility(8);
        }
        if ("e835d102-af95-48a6-ae13-2983bc06f5c0".equals(strG)) {
            this.j.setVisibility(0);
            this.i.setVisibility(0);
        }
    }

    public /* synthetic */ void c(View view) {
        if (this.t.getVisibility() != 0 || this.m.getVisibility() == 0) {
            return;
        }
        g();
        HashMap map = new HashMap(1);
        map.put("click", "1");
        lmf.d().c(this.f6426c, AnalyticsValue.HEALTH_PLUGIN_DEVICE_WIFI_DEVICE_MULTIACCOUNT_SHARE_2060032.value(), map, 0);
    }

    private void a() {
        this.t = findViewById(R.id.show_my_qr);
        this.f6424a = (HealthTextView) findViewById(R.id.textView_default);
        this.m = (HealthProgressBar) findViewById(R.id.show_my_qr_progressbar);
        this.o = findViewById(R.id.show_my_qr_iv_layout);
        this.k = (ImageView) findViewById(R.id.show_my_qr_iv);
        this.x = (HealthTextView) findViewById(R.id.show_my_qr_how_to_scan_text);
        this.j = (LinearLayout) findViewById(R.id.qrcode_scanning_find_qrcode_ios_phone_layout);
        this.v = (CustomTitleBar) findViewById(R.id.my_qrcode_title_layout);
        this.w = (LinearLayout) findViewById(R.id.device_share_qr_preview);
        this.p = (ImageView) findViewById(R.id.device_share_qr_img);
        this.l = (HealthTextView) findViewById(R.id.device_share_qr_tips);
        this.v.setRightButtonVisibility(0);
        this.v.setRightButtonDrawable(this.f6426c.getResources().getDrawable(R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
        this.v.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: dwv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32464c.d(view);
            }
        });
        this.q = (LinearLayout) findViewById(R.id.qrcode_scanning_qrcode_tips_layout);
        this.k.setOnClickListener(this);
        HealthButton healthButton = (HealthButton) findViewById(R.id.hw_refresh_qr_code_btn);
        this.r = healthButton;
        healthButton.setOnClickListener(this);
        this.d = (HealthTextView) findViewById(R.id.qrcode_scanning_find_qrcode_android_tips);
        this.i = (HealthTextView) findViewById(R.id.qrcode_scanning_find_qrcode_ios_tips);
        this.h = (HealthTextView) findViewById(R.id.qrcode_scanning_find_qrcode_harmony_tips);
        this.g = (LinearLayout) findViewById(R.id.qrcode_scanning_find_qrcode_harmony_phone_layout);
        String string = this.f6426c.getString(R.string.IDS_device_qrcode_show_tips);
        this.d.setText(string);
        this.i.setText(string);
        a(string);
    }

    public /* synthetic */ void d(View view) {
        LogUtil.a("MyQrCodeActivity", "mTitleBar leftButton onClick");
        setResult(10);
        finish();
    }

    private void a(String str) {
        String strD = lon.c().d("scale_share_harmony_tips");
        LogUtil.d("MyQrCodeActivity", "setHarmonyTips switchHarmony = ", strD);
        if ("on".equalsIgnoreCase(strD) && !CommonUtil.bd()) {
            this.g.setVisibility(0);
            this.h.setVisibility(0);
            this.h.setText(str);
        } else {
            this.g.setVisibility(8);
            this.h.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.r) {
            c();
        } else if (view == this.k) {
            c();
        } else {
            LogUtil.a("MyQrCodeActivity", "View is others");
        }
    }

    public void b(final boolean z) {
        if (this.k == null) {
            LogUtil.j("MyQrCodeActivity", "mQrCodeImage is null");
            return;
        }
        if (this.f6424a == null) {
            LogUtil.j("MyQrCodeActivity", "mDefaultText is null");
        } else if (this.v == null) {
            LogUtil.j("MyQrCodeActivity", "mTitleBar is null");
        } else {
            runOnUiThread(new Runnable() { // from class: dwy
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c(z);
                }
            });
        }
    }

    public /* synthetic */ void c(boolean z) {
        if (z) {
            this.x.setVisibility(0);
            this.f6424a.setVisibility(8);
            this.k.setPadding(0, 0, 0, 0);
            this.v.setRightButtonVisibility(0);
            this.q.setVisibility(0);
            return;
        }
        this.x.setVisibility(4);
        this.q.setVisibility(4);
        this.k.setImageResource(R.drawable.img_loadfailed);
        this.k.setPadding(qrs.d(this.f6426c, 16.0f), qrs.d(this.f6426c, 16.0f), qrs.d(this.f6426c, 16.0f), qrs.d(this.f6426c, 16.0f));
        this.f6424a.setVisibility(0);
        this.v.setRightButtonVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final boolean z) {
        runOnUiThread(new Runnable() { // from class: dwz
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(z);
            }
        });
    }

    public /* synthetic */ void a(boolean z) {
        if (z) {
            this.k.setVisibility(8);
            this.o.setBackground(null);
            this.m.setVisibility(0);
        } else {
            this.k.setVisibility(0);
            this.o.setBackgroundResource(R.color.hw_device_background_color_white);
            this.m.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        a(this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        qpx.e(this.f6426c, R.string.IDS_qrcode_refresh_no_network_fail);
        b(false);
    }

    private void a(final ImageView imageView) {
        b(true);
        d(true);
        lsy.a(new Runnable() { // from class: dww
            @Override // java.lang.Runnable
            public final void run() {
                this.f32465b.e(imageView);
            }
        });
    }

    public /* synthetic */ void e(ImageView imageView) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        LogUtil.d("MyQrCodeActivity", "userId:", accountInfo);
        if (accountInfo == null) {
            LogUtil.j("MyQrCodeActivity", "get userid or accountName is null");
            this.e.sendEmptyMessage(2000003);
            return;
        }
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        if (userInfo == null) {
            LogUtil.j("MyQrCodeActivity", "get userInfo is null");
            this.e.sendEmptyMessage(2000003);
            return;
        }
        String name = userInfo.getName();
        if (TextUtils.isEmpty(name)) {
            LogUtil.j("MyQrCodeActivity", "get userInfo.getName() is null");
            name = new UpApi(this.f6426c).getLegalAccountName();
        }
        if (TextUtils.isEmpty(name)) {
            LogUtil.j("MyQrCodeActivity", "get getLegalAccountName is null");
            name = LoginInit.getInstance(this.f6426c).getAccountInfo(1002);
        }
        if (TextUtils.isEmpty(name)) {
            LogUtil.j("MyQrCodeActivity", "get LoginInit.getUserName is null");
            return;
        }
        String str = this.f6425b;
        if (str == null) {
            LogUtil.j("MyQrCodeActivity", "get mDeviceId is null");
            this.e.sendEmptyMessage(2000003);
        } else {
            a(accountInfo, name, str, imageView);
        }
    }

    private void a(final String str, final String str2, final String str3, final ImageView imageView) {
        lqo.b(this.f6426c).e(new ICloudOperationResult() { // from class: dxd
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str4, boolean z) throws Throwable {
                this.f32478c.e(str, str2, str3, imageView, (WifiDeviceGetVerifyCodeForMainUserRsp) obj, str4, z);
            }
        });
    }

    public /* synthetic */ void e(String str, String str2, String str3, final ImageView imageView, WifiDeviceGetVerifyCodeForMainUserRsp wifiDeviceGetVerifyCodeForMainUserRsp, String str4, boolean z) throws Throwable {
        int iIntValue;
        String resultDesc;
        if (!z) {
            if (wifiDeviceGetVerifyCodeForMainUserRsp == null) {
                iIntValue = Constants.CODE_UNKNOWN_ERROR;
                resultDesc = "unknown error";
            } else {
                iIntValue = wifiDeviceGetVerifyCodeForMainUserRsp.getResultCode().intValue();
                resultDesc = wifiDeviceGetVerifyCodeForMainUserRsp.getResultDesc();
            }
            if (iIntValue == 112000080) {
                LogUtil.j("MyQrCodeActivity", "refresh too much error.");
                this.e.sendEmptyMessage(3000005);
            } else {
                this.e.sendEmptyMessage(2000003);
            }
            LogUtil.a("MyQrCodeActivity", "getVerifyCode error: ", Integer.valueOf(iIntValue), ", resultDesc: ", resultDesc);
            return;
        }
        if (wifiDeviceGetVerifyCodeForMainUserRsp == null) {
            LogUtil.j("MyQrCodeActivity", "rsp is null.");
            this.e.sendEmptyMessage(2000003);
            return;
        }
        String verifyCode = wifiDeviceGetVerifyCodeForMainUserRsp.getVerifyCode();
        if (TextUtils.isEmpty(verifyCode)) {
            this.e.sendEmptyMessage(2000003);
            return;
        }
        final Bitmap bitmapD = d(str, str2, str3, verifyCode);
        if (bitmapD == null) {
            LogUtil.j("MyQrCodeActivity", "create QRcode error");
            this.e.sendEmptyMessage(2000003);
        } else {
            this.n = bitmapD;
            runOnUiThread(new Runnable() { // from class: dwx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32467b.c(imageView, bitmapD);
                }
            });
        }
    }

    public /* synthetic */ void c(ImageView imageView, Bitmap bitmap) {
        LogUtil.a("MyQrCodeActivity", "setImageBitmap qrCodeBmp");
        d(false);
        imageView.setImageBitmap(bitmap);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Bitmap bitmap = this.n;
        if (bitmap != null) {
            bitmap.recycle();
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("MyQrCodeActivity", "onBackPressed");
        setResult(10);
        super.onBackPressed();
    }

    private Bitmap d(String str, String str2, String str3, String str4) throws Throwable {
        String strB;
        HashMap map = new HashMap(16);
        map.put("mainHuid", str);
        map.put("nickName", str2);
        map.put("devId", str3);
        map.put("verifyCode", str4);
        eby ebyVarD = ecf.d(str3);
        if (ebyVarD != null) {
            map.put("proId", ebyVarD.a().h());
            if (dxm.u(this.f)) {
                map.put("snNumber", ebyVarD.a().l());
                map.put("UUID", ebyVarD.getProductId());
                map.put("name", ebyVarD.getDeviceName());
                map.put("identify", ebyVarD.a().g());
            }
        }
        try {
            String string = new JSONObject(map).toString();
            LogUtil.d("MyQrCodeActivity", "content:", string);
            String strEncodeToString = Base64.encodeToString(string.getBytes("utf-8"), 0);
            if (CompileParameterUtil.c("SUPPORT_WIFI_QR_URL_TEST", false)) {
                strB = CompileParameterUtil.b("WIFI_QRCODE_URL_PRE_TEST", "");
            } else {
                strB = GRSManager.c(BaseApplication.getContext()).getUrl("domainUrlCloudHuawei") + "/1Lfn1eswP6?a=";
            }
            String str5 = strB + "s&c=" + strEncodeToString + "&name=" + str2;
            this.s = str5;
            LogUtil.d("MyQrCodeActivity", "qrcodeUrl:", str5);
            gsm.c.b bVar = new gsm.c.b();
            bVar.b(qrs.d((Context) this, 220.0f), qrs.d((Context) this, 220.0f));
            try {
                return gsm.b(this.s, bVar.d());
            } catch (gsk e) {
                LogUtil.e("MyQrCodeActivity", "setGroupQrCode() generateMap meet exception ", e.getMessage());
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            LogUtil.e("MyQrCodeActivity", "encode QrCode UnsupportedEncodingException:", e2.getMessage());
            return null;
        }
    }

    private void g() {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.f6426c.getResources(), R.drawable.ic_body_fat_scale_share);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#ffffff"));
        canvas.drawRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), paint);
        canvas.drawBitmap(bitmapDecodeResource, 0.0f, 0.0f, paint);
        LogUtil.d("MyQrCodeActivity", "shareMyQrCode shareUrl is::", this.s);
        if (TextUtils.isEmpty(this.s)) {
            LogUtil.j("MyQrCodeActivity", "shareMyQrCode shareUrl is empty.");
        } else {
            d(this.n, false);
        }
    }

    private void d(Bitmap bitmap, final boolean z) {
        this.l.setText(String.format(Locale.ENGLISH, getString(R.string.IDS_device_share_qr_content), 1, 2, 3));
        if (LanguageUtil.i(this.f6426c) || LanguageUtil.ao(this.f6426c) || LanguageUtil.bi(this.f6426c)) {
            this.l.setAutoTextSize(14.0f);
            this.l.setLineSpacing(0.0f, 1.0f);
        }
        this.w.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.huawei.health.device.ui.qrcode.activity.MyQrCodeActivity.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                MyQrCodeActivity.this.w.removeOnLayoutChangeListener(this);
                MyQrCodeActivity myQrCodeActivity = MyQrCodeActivity.this;
                myQrCodeActivity.b(myQrCodeActivity.b(myQrCodeActivity.w), z);
            }
        });
        this.p.setImageBitmap(bitmap);
        this.w.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Bitmap bitmap, boolean z) {
        gxt gxtVar = new gxt(1);
        gxtVar.e(this.f6426c.getResources().getString(R.string.IDS_device_wifi_share_bodyfat_scale));
        gxtVar.d(bitmap);
        gxtVar.e(z);
        ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(gxtVar, this.f6426c);
        this.w.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap b(View view) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
