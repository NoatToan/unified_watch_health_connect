package com.huawei.pluginsocialshare.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.view.ShareButtonView;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import defpackage.gxt;
import defpackage.pjm;
import defpackage.pnq;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes15.dex */
public class CustomPreviewActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthCardView f22421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f22422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f22423c = new c(this);
    private ImageView d;
    private LinearLayout e;
    private HealthSwitchButton f;
    private gxt g;
    private ShareButtonView i;

    class c extends BaseHandler<CustomPreviewActivity> {
        c(CustomPreviewActivity customPreviewActivity) {
            super(customPreviewActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(CustomPreviewActivity customPreviewActivity, Message message) {
            if (message.what == 1) {
                if (message.obj instanceof Bitmap) {
                    CustomPreviewActivity.this.d().setImageBitmap((Bitmap) message.obj);
                    CustomPreviewActivity.this.g.d((Bitmap) message.obj);
                    CustomPreviewActivity.this.i.setShareContent(CustomPreviewActivity.this.g);
                    return;
                }
                return;
            }
            LogUtil.j("CustomPreviewActivity", "msg unknown");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("CustomPreviewActivity", "onCreate");
        setContentView(R.layout.activity_custom_preview);
        h();
        c();
        e();
        g();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("CustomPreviewActivity", "onDestroy");
        BroadcastReceiver broadcastReceiver = this.f22422b;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
            this.f22422b = null;
        }
    }

    private void h() {
        this.d = (ImageView) findViewById(R.id.preview_img);
        this.e = (LinearLayout) findViewById(R.id.share_watermark_layout);
        HealthCardView healthCardView = (HealthCardView) findViewById(R.id.share_custom_preview_cardView);
        this.f22421a = healthCardView;
        pnq.a((View) healthCardView, (Context) this, true);
    }

    private void e() {
        pnq.e();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.huawei.pluginsocialshare.activity.CustomPreviewActivity.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent != null && "android.intent.action.LOCALE_CHANGED".equals(intent.getAction()) && (context instanceof Activity) && pnq.g()) {
                    ((Activity) context).finish();
                    LogUtil.j("CustomPreviewActivity", "onReceive ACTION_LOCALE_CHANGED finish");
                }
            }
        };
        this.f22422b = broadcastReceiver;
        registerReceiver(broadcastReceiver, intentFilter);
    }

    public ImageView d() {
        return this.d;
    }

    private void a() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: pjs
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b();
            }
        });
    }

    public /* synthetic */ void b() {
        Bitmap bitmapA = pnq.a(pnq.a(this.g), 6000);
        if (bitmapA == null || this.f22423c == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = bitmapA;
        this.f22423c.sendMessage(messageObtain);
    }

    private void c() {
        this.i = (ShareButtonView) findViewById(R.id.share_button_view);
        gxt gxtVarE = pjm.e();
        this.g = gxtVarE;
        this.i.setShareContent(gxtVarE);
        this.i.setPerViewImage(this.d);
        this.i.setLogLayout(this.e);
        if (this.g == null) {
            LogUtil.j("CustomPreviewActivity", "mShareContent is null");
            finish();
        } else {
            a();
            this.i.setMap(this.g.s());
        }
    }

    private void g() {
        if (CommonUtil.bu() || CommonUtil.ap()) {
            return;
        }
        ((RelativeLayout) findViewById(R.id.layout_share_userinfo)).setVisibility(0);
        ((HealthDivider) findViewById(R.id.userinfo_divder)).setVisibility(0);
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) findViewById(R.id.share_userinfo_switch);
        this.f = healthSwitchButton;
        healthSwitchButton.setChecked(pnq.j());
        this.f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.pluginsocialshare.activity.CustomPreviewActivity$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.e.c(compoundButton, z);
            }
        });
    }

    /* synthetic */ void c(CompoundButton compoundButton, boolean z) {
        if (z) {
            pnq.c(true);
        } else {
            pnq.b(this, R.string.IDS_share_close_info_title, R.string.IDS_share_info_content_next, new View.OnClickListener() { // from class: pjp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    pnq.c(false);
                }
            }, new View.OnClickListener() { // from class: pjr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f45519b.c(view);
                }
            });
        }
    }

    public /* synthetic */ void c(View view) {
        this.f.setChecked(true);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        LogUtil.a("CustomPreviewActivity", "onConfigurationChanged");
        if (pnq.c(this.e) == null) {
            LogUtil.j("CustomPreviewActivity", "onConfigurationChanged getWaterMarkBitmap is null");
            finish();
        } else {
            pnq.a((View) this.f22421a, (Context) this, true);
        }
    }
}
