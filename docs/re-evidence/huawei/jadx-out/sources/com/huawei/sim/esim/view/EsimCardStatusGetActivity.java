package com.huawei.sim.esim.view;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.stories.me.adapter.AdapterWithBottomView;
import defpackage.mgg;
import defpackage.npz;
import defpackage.oeh;
import defpackage.pxi;
import defpackage.pxk;
import defpackage.qpx;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes15.dex */
public class EsimCardStatusGetActivity extends BaseOpenSimCardActivity implements View.OnClickListener {
    private HealthImageView k;
    private HealthButton l;
    private RelativeLayout m;
    private Context n;
    private LinearLayout o;
    private HealthTextView p;
    private HealthImageView q;
    private RelativeLayout r;
    private HealthTextView s;
    private HealthImageView t;
    private RelativeLayout u;
    private CustomTitleBar v;
    private HealthProgressBar w;
    private LinearLayout x;
    private HealthTextView y;

    @Override // com.huawei.sim.esim.view.BaseOpenSimCardActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_esim_card_status_get);
        this.n = this;
        this.f22979b = new d(this);
        LogUtil.a("EsimCardStatusGetActivity", "onCreate.");
        npz.b().t();
        b();
        f();
        d();
    }

    private void b() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.esim_title_bar);
        this.v = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        this.u = (RelativeLayout) findViewById(R.id.card_type_status_waiting_layout);
        this.w = (HealthProgressBar) findViewById(R.id.card_type_status_waiting_image);
        this.y = (HealthTextView) findViewById(R.id.card_type_status_waiting_text);
        this.p = (HealthTextView) findViewById(R.id.textView_recommend);
        this.m = (RelativeLayout) findViewById(R.id.card_type_status_fail_layout);
        this.k = (HealthImageView) findViewById(R.id.card_type_status_fail_image);
        this.s = (HealthTextView) findViewById(R.id.card_type_status_fail_text);
        this.l = (HealthButton) findViewById(R.id.card_type_status_retry_btn);
        this.t = (HealthImageView) findViewById(R.id.multi_sim_image);
        this.q = (HealthImageView) findViewById(R.id.standalone_num_image);
        this.o = (LinearLayout) findViewById(R.id.card_type_select_layout);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.multi_sim_layout);
        this.r = relativeLayout;
        relativeLayout.setOnClickListener(this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.standalone_num_layout);
        this.x = linearLayout;
        linearLayout.setOnClickListener(this);
        if (LanguageUtil.ba(this.n)) {
            Drawable drawable = getResources().getDrawable(R.drawable.bg_recommend_orange_right);
            this.t.setBackgroundResource(R.drawable.common_ui_arrow_left);
            this.q.setBackgroundResource(R.drawable.common_ui_arrow_left);
            this.p.setBackground(drawable);
            return;
        }
        Drawable drawable2 = getResources().getDrawable(R.drawable.bg_recommend_orange_left);
        this.t.setBackgroundResource(R.drawable.common_ui_arrow_right);
        this.q.setBackgroundResource(R.drawable.common_ui_arrow_right);
        this.p.setBackground(drawable2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i;
        if (view.getId() == R.id.multi_sim_layout) {
            pxi.a("one_number_multisim");
            i = 1;
        } else if (view.getId() == R.id.standalone_num_layout) {
            pxi.a("stand_alone");
            i = 2;
        } else {
            LogUtil.j("EsimCardStatusGetActivity", "onClick else branch.");
            return;
        }
        LogUtil.a("EsimCardStatusGetActivity", "onClick cardType = ", Integer.valueOf(i));
        DeviceInfo deviceInfoC = mgg.c("EsimCardStatusGetActivity");
        npz.b().c((IBaseResponseCallback) null);
        npz.b().a(deviceInfoC, i);
        try {
            Intent intent = new Intent();
            intent.setClass(this, EsimManagerActivity.class);
            intent.putExtra("esim_card_type_key", i);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("EsimCardStatusGetActivity", "onClick ActivityNotFoundException.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, boolean z) {
        this.m.setVisibility(0);
        this.u.setVisibility(8);
        this.o.setVisibility(8);
        HealthTextView healthTextView = this.s;
        if (healthTextView != null) {
            healthTextView.setText(str);
            this.s.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.sim.esim.view.EsimCardStatusGetActivity.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    EsimCardStatusGetActivity.this.s.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    if (EsimCardStatusGetActivity.this.s.getLineCount() >= 2) {
                        EsimCardStatusGetActivity.this.s.setGravity(GravityCompat.START);
                    }
                }
            });
        }
        HealthImageView healthImageView = this.k;
        if (healthImageView != null) {
            Context context = this.n;
            pxk.b(context, healthImageView, qrs.d(context, 120.0f));
            Drawable drawable = getResources().getDrawable(R.drawable.card_status_get_fail_img);
            drawable.setAutoMirrored(true);
            this.k.setImageDrawable(drawable);
        }
        if (z) {
            this.l.setText(R.string.IDS_plugin_sim_esim_button_retry);
            this.l.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimCardStatusGetActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("EsimCardStatusGetActivity", "initFailView click retry button.");
                    EsimCardStatusGetActivity.this.f();
                    EsimCardStatusGetActivity.this.d();
                }
            });
        } else {
            this.l.setText(R.string.IDS_plugin_multi_sim_known);
            this.l.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimCardStatusGetActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("EsimCardStatusGetActivity", "initFailView click known button.");
                    EsimCardStatusGetActivity.this.finish();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.m.setVisibility(8);
        this.u.setVisibility(0);
        this.o.setVisibility(8);
        HealthTextView healthTextView = this.y;
        if (healthTextView != null) {
            healthTextView.setText(this.n.getString(R.string.IDS_plugin_multi_esim_loading));
        }
        HealthProgressBar healthProgressBar = this.w;
        if (healthProgressBar != null) {
            Context context = this.n;
            pxk.b(context, healthProgressBar, qrs.d(context, 66.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (!npz.b().k()) {
            this.f22979b.sendEmptyMessage(33005);
            qpx.e(this.n, R.string.IDS_plugin_bt_fail);
        } else {
            npz.b().d(this.f22979b);
        }
    }

    static class d extends Handler {
        private WeakReference<EsimCardStatusGetActivity> d;

        d(EsimCardStatusGetActivity esimCardStatusGetActivity) {
            this.d = new WeakReference<>(esimCardStatusGetActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("EsimCardStatusGetActivity", "EsimCardStatusGetHandler handleMessageWhenReferenceNotNull msg is null");
                return;
            }
            super.handleMessage(message);
            WeakReference<EsimCardStatusGetActivity> weakReference = this.d;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.a("EsimCardStatusGetActivity", "mWeakActivity is null");
                return;
            }
            EsimCardStatusGetActivity esimCardStatusGetActivity = this.d.get();
            LogUtil.a("EsimCardStatusGetActivity", "mActivity :", esimCardStatusGetActivity, "message.what ", Integer.valueOf(message.what));
            int i = message.what;
            if (i != 100006) {
                switch (i) {
                    case 33002:
                        esimCardStatusGetActivity.g();
                        esimCardStatusGetActivity.d();
                        break;
                    case 33003:
                        esimCardStatusGetActivity.g();
                        esimCardStatusGetActivity.u.setVisibility(8);
                        esimCardStatusGetActivity.m.setVisibility(8);
                        esimCardStatusGetActivity.o.setVisibility(0);
                        break;
                    case 33004:
                        esimCardStatusGetActivity.g();
                        esimCardStatusGetActivity.i();
                        esimCardStatusGetActivity.finish();
                        break;
                    case 33005:
                        break;
                    case 33006:
                        esimCardStatusGetActivity.g();
                        esimCardStatusGetActivity.b(esimCardStatusGetActivity.n.getString(R.string.IDS_card_status_error_tips), false);
                        break;
                    default:
                        ReleaseLogUtil.e("DEVMGR_EsimCardStatusGetActivity", "unrecognized message:", Integer.valueOf(message.what));
                        break;
                }
                return;
            }
            esimCardStatusGetActivity.g();
            esimCardStatusGetActivity.b(esimCardStatusGetActivity.n.getString(R.string.IDS_plugin_device_info_fail), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LogUtil.a("EsimCardStatusGetActivity", "removeTimeOutMessage");
        if (this.f22979b == null) {
            LogUtil.j("EsimCardStatusGetActivity", "mHandler is null");
            return;
        }
        this.f22979b.removeMessages(100003);
        this.f22979b.removeMessages(100006);
        this.f22979b.removeMessages(AdapterWithBottomView.TYPE_BOTTOM);
        this.f22979b.hasMessages(100003);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        boolean zI = npz.b().i();
        LogUtil.a("EsimCardStatusGetActivity", "onResume isOperatorOpenSuccess = ", Boolean.valueOf(zI));
        if (zI) {
            npz.b().d(false);
            finish();
        }
    }

    @Override // com.huawei.sim.esim.view.BaseOpenSimCardActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("EsimCardStatusGetActivity", "onDestroy");
        if (this.f22979b != null) {
            this.f22979b.removeMessages(33002);
            this.f22979b.removeMessages(33003);
            this.f22979b.removeMessages(33004);
            this.f22979b.removeMessages(33005);
            this.f22979b.removeMessages(33006);
        }
        npz.b().q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        oeh oehVarH = npz.b().h();
        if (oehVarH == null) {
            ReleaseLogUtil.a("DEVMGR_EsimCardStatusGetActivity", "HwMultiSimMgr getDeviceEsimInfo is null");
            b(this.n.getString(R.string.IDS_plugin_device_info_fail), true);
            return;
        }
        try {
            Intent intent = new Intent(this.n, (Class<?>) EsimManagerActivity.class);
            intent.putExtra("esim_card_type_key", oehVarH.f44232a);
            intent.putExtra("esim_is_open", true);
            intent.putExtra("esiim_multi_sim_deviceinfo", oehVarH.d);
            this.n.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("EsimCardStatusGetActivity", "startEsimManagerActivity ActivityNotFoundException");
        }
    }

    @Override // com.huawei.sim.esim.view.BaseOpenSimCardActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
