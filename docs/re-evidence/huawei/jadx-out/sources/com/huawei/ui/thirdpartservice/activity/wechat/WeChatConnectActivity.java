package com.huawei.ui.thirdpartservice.activity.wechat;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.main.api.WeChatApi;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.thirdpartservice.R;
import defpackage.gsk;
import defpackage.gsm;
import defpackage.lsy;
import defpackage.qrs;
import defpackage.xaa;
import defpackage.xab;
import health.compact.a.KeyValDbManager;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class WeChatConnectActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f29130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f29131c;
    private HealthTextView d;
    private HealthTextView e;
    private ImageView g;
    private HealthProgressBar h;
    private HealthTextView j;
    private HealthTextView k;
    private HealthButton m;
    private WeChatApi o;
    private xab i = null;
    private long f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29129a = false;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_wechat_health_connect);
        this.o = (WeChatApi) Services.b("Main", WeChatApi.class);
        this.f29131c = new b(this);
        c();
        d(false);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f29129a) {
            lsy.a(new Runnable() { // from class: wyc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52592b.e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        if (this.o.isUserBind(BaseApplication.getContext())) {
            this.f29131c.sendEmptyMessage(3);
        }
    }

    private void c() {
        this.g = (ImageView) findViewById(R.id.qrCode_img);
        this.j = (HealthTextView) findViewById(R.id.qrCode_valid_time);
        this.e = (HealthTextView) findViewById(R.id.weChat_qrCode_guide_note1);
        this.d = (HealthTextView) findViewById(R.id.weChat_qrCode_guide_note2);
        this.f29130b = (HealthTextView) findViewById(R.id.weChat_qrCode_guide_note3);
        this.m = (HealthButton) findViewById(R.id.weChat_qrCode_save);
        this.k = (HealthTextView) findViewById(R.id.weChat_faq);
        this.h = (HealthProgressBar) findViewById(R.id.show_my_qr_progressbar);
        this.e.setText(String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_thirdparty_wechat_guide), UnitUtil.e(1.0d, 1, 0), qrs.f(BaseApplication.getContext())));
        this.d.setText(String.format(Locale.ENGLISH, getString(R.string.IDS_thirdparty_wechat_content), 2));
        this.f29130b.setText(String.format(Locale.ENGLISH, getString(R.string.IDS_thirdparty_wechat_qrcode_guide_content3), 3));
        this.m.setOnClickListener(this);
        this.k.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(xab xabVar) {
        Bitmap bitmapB;
        if (xabVar == null) {
            LogUtil.j("WeChatConnectActivity", "fillQrCodeData() qrCodeData is null.");
            return;
        }
        if (this.g == null) {
            LogUtil.j("WeChatConnectActivity", "fillQrCodeData() mQrCodeImg is null.");
            return;
        }
        gsm.c.b bVar = new gsm.c.b();
        bVar.b(this.g.getWidth(), this.g.getHeight());
        try {
            bitmapB = gsm.b(xabVar.a(), bVar.d());
        } catch (gsk unused) {
            LogUtil.e("WeChatConnectActivity", "fillQrCodeData() generateMap meet exception ");
            bitmapB = null;
        }
        if (bitmapB == null) {
            LogUtil.j("WeChatConnectActivity", "fillQrCodeData() qrBitmap is null.");
        } else {
            this.g.setImageBitmap(bitmapB);
            a(xabVar, this.j);
        }
    }

    private void a(xab xabVar, HealthTextView healthTextView) {
        healthTextView.setText(String.format(Locale.ENGLISH, getString(R.string.IDS_thirdparty_wechat_qrcode_warning), Integer.valueOf(xabVar.c()), UnitUtil.d("HH:mm", xabVar.e())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final boolean z) {
        new xaa().e(new IBaseResponseCallback() { // from class: wya
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f52590b.b(z, i, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(boolean z, int i, Object obj) {
        if (i != 0 || !(obj instanceof xab)) {
            if (i == 2) {
                this.f29131c.sendEmptyMessage(4);
                return;
            } else {
                LogUtil.e("WeChatConnectActivity", ParamConstants.CallbackMethod.ON_FAIL);
                return;
            }
        }
        this.i = (xab) obj;
        if (z) {
            this.f29131c.sendEmptyMessage(2);
        } else {
            this.f29131c.sendEmptyMessage(1);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.j("WeChatConnectActivity", "onClick view is null");
            return;
        }
        if (System.currentTimeMillis() - this.f < 500) {
            LogUtil.j("WeChatConnectActivity", "onClick The interval is too short ");
            return;
        }
        int id = view.getId();
        if (id == R.id.weChat_qrCode_save) {
            if (this.i == null) {
                LogUtil.j("WeChatConnectActivity", "mQrCodeData is null");
                return;
            }
            PermissionUtil.d(this, PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES, new CustomPermissionAction(this) { // from class: com.huawei.ui.thirdpartservice.activity.wechat.WeChatConnectActivity.2
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    WeChatConnectActivity.this.d(true);
                }
            });
        } else if (id != R.id.weChat_faq) {
            LogUtil.j("WeChatConnectActivity", "onClick view id mismatch");
        } else {
            this.o.jumpWechatHelp(this);
        }
        this.f = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).saveToLocalGallery(getApplicationContext(), d(d()));
    }

    private View d() {
        View viewInflate = View.inflate(this, R.layout.wechat_save_layout, null);
        ((ImageView) viewInflate.findViewById(R.id.save_qrCode_img)).setImageDrawable(this.g.getDrawable());
        a(this.i, (HealthTextView) viewInflate.findViewById(R.id.save_qrCode_valid_time));
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.save_weChat_qrCode_guide_note1);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.save_weChat_qrCode_guide_note2);
        HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.save_weChat_qrCode_guide_note3);
        healthTextView.setText(String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_thirdparty_wechat_guide), UnitUtil.e(1.0d, 1, 0), qrs.f(BaseApplication.getContext())));
        healthTextView2.setText(String.format(Locale.ENGLISH, getString(R.string.IDS_thirdparty_wechat_content), 2));
        healthTextView3.setText(String.format(Locale.ENGLISH, getString(R.string.IDS_thirdparty_wechat_qrcode_guide_content3), 3));
        return viewInflate;
    }

    private Bitmap d(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = null;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            view.draw(canvas);
            canvas.restore();
            return bitmapCreateBitmap;
        } catch (IllegalArgumentException | IllegalStateException | OutOfMemoryError unused) {
            LogUtil.e("WeChatConnectActivity", "createBitmap failed!");
            return bitmapCreateBitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI");
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.addFlags(268435456);
        intent.setComponent(componentName);
        try {
            qrs.c(intent, "com.tencent.mm", this, getString(R.string.IDS_wechat_pay));
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("WeChatConnectActivity", "shareMomentMultiImage err: ActivityNotFoundException");
        }
    }

    static class b extends BaseHandler<WeChatConnectActivity> {
        b(WeChatConnectActivity weChatConnectActivity) {
            super(weChatConnectActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(WeChatConnectActivity weChatConnectActivity, Message message) {
            LogUtil.d("WeChatConnectActivity", "handleMessage msg is ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1) {
                weChatConnectActivity.a(weChatConnectActivity.i);
                weChatConnectActivity.h.setVisibility(8);
                return;
            }
            if (i == 2) {
                weChatConnectActivity.a(weChatConnectActivity.i);
                weChatConnectActivity.a();
                weChatConnectActivity.b();
                weChatConnectActivity.f29129a = true;
                return;
            }
            if (i == 3) {
                KeyValDbManager.d(BaseApplication.getContext()).c("third_part_service_we_chat_status", "true", null);
                weChatConnectActivity.startActivity(new Intent(weChatConnectActivity, (Class<?>) WeChatHealthActivity.class));
                weChatConnectActivity.finish();
            } else if (i != 4) {
                LogUtil.j("WeChatConnectActivity", "handle message mismatch");
            } else {
                weChatConnectActivity.o.showDeviceAlreadyBinded(weChatConnectActivity);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
