package com.huawei.sim.esim.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.multisimservice.model.MultiSimDeviceInfo;
import com.huawei.sim.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.npz;
import defpackage.pxl;
import defpackage.qpx;
import defpackage.qqv;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class EsimStandaloneNumGuideActivity extends BaseOpenSimCardActivity implements View.OnClickListener {
    private int k = 30;
    private Context l;
    private HealthTextView m;
    private HealthTextView n;
    private LinearLayout o;
    private HealthTextView p;
    private HealthTextView q;
    private HealthImageView r;
    private MultiSimDeviceInfo s;
    private RelativeLayout t;
    private LinearLayout u;
    private RelativeLayout v;
    private CustomTitleBar w;
    private HealthTextView x;
    private HealthButton y;

    @Override // com.huawei.sim.esim.view.BaseOpenSimCardActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.l = this;
        this.f22979b = new b(this);
        setContentView(R.layout.activity_esim_standalone_num_guide);
        Intent intent = getIntent();
        if (intent != null) {
            this.k = intent.getIntExtra("BatteryThreshold", this.k);
            this.s = (MultiSimDeviceInfo) intent.getParcelableExtra("multi_sim_device_info");
        }
        b();
    }

    private void b() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.standalone_num_title_bar);
        this.w = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        this.v = (RelativeLayout) findViewById(R.id.standalone_num_waiting_content);
        HealthButton healthButton = (HealthButton) findViewById(R.id.btn_qrcode);
        this.y = healthButton;
        healthButton.setOnClickListener(this);
        this.m = (HealthTextView) findViewById(R.id.tv_standalone_num_guide1);
        this.p = (HealthTextView) findViewById(R.id.tv_standalone_num_guide2);
        this.q = (HealthTextView) findViewById(R.id.tv_standalone_num_eid_and_emie);
        this.x = (HealthTextView) findViewById(R.id.tv_standalone_num_tips);
        h();
        this.o = (LinearLayout) findViewById(R.id.ll_error_tips);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_set_net_layout);
        this.u = linearLayout;
        linearLayout.setOnClickListener(this);
        this.n = (HealthTextView) findViewById(R.id.tv_error_tips);
        this.v.setVisibility(8);
        this.t = (RelativeLayout) findViewById(R.id.rl_standalone_num_icon);
        int iB = qqv.b(this.l);
        ViewGroup.LayoutParams layoutParams = this.t.getLayoutParams();
        layoutParams.height = iB / 3;
        this.t.setLayoutParams(layoutParams);
        HealthImageView healthImageView = (HealthImageView) findViewById(R.id.iv_standalone_num);
        this.r = healthImageView;
        healthImageView.setImageDrawable(this.l.getResources().getDrawable(R.drawable.standalone_num_img));
        j();
    }

    private void h() {
        String strE = UnitUtil.e(1.0d, 1, 0);
        String strE2 = UnitUtil.e(2.0d, 1, 0);
        this.x.setText(String.format(Locale.ENGLISH, this.l.getString(R.string.IDS_select_sim_card_tips_oversea), strE, strE2, UnitUtil.e(3.0d, 1, 0), UnitUtil.e(4.0d, 1, 0)));
        this.m.setText(String.format(Locale.ENGLISH, this.l.getString(R.string.IDS_standalone_number_guides1_oversea), strE));
        this.p.setText(String.format(Locale.ENGLISH, this.l.getString(R.string.IDS_standalone_number_guides3_oversea_new), strE2));
        if (this.s != null) {
            this.q.setText(String.format(Locale.ENGLISH, this.l.getString(R.string.IDS_standalone_number_eid_and_emei), this.s.getEID(), this.s.getDeviceIMEI()));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.btn_qrcode) {
            if (!npz.b().k()) {
                qpx.e(this.l, R.string.IDS_plugin_bt_fail);
                return;
            } else {
                this.v.setVisibility(0);
                d();
                return;
            }
        }
        if (view.getId() == R.id.ll_set_net_layout) {
            CommonUtil.t(this.l);
        } else {
            LogUtil.d("EsimStandaloneNumGuideActivity", "onClick else branch");
        }
    }

    private void d() {
        npz.b().d(new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.EsimStandaloneNumGuideActivity.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("EsimStandaloneNumGuideActivity", "getBatteryStatus onResponse errorCode :", Integer.valueOf(i));
                EsimStandaloneNumGuideActivity.this.f22979b.sendMessage(EsimStandaloneNumGuideActivity.this.f22979b.obtainMessage(10002));
                Message messageObtainMessage = EsimStandaloneNumGuideActivity.this.f22979b.obtainMessage();
                if (i == 0) {
                    messageObtainMessage.what = 10003;
                } else if (i == 129001) {
                    messageObtainMessage.what = 10004;
                } else {
                    messageObtainMessage.what = 10005;
                }
                EsimStandaloneNumGuideActivity.this.f22979b.sendMessage(messageObtainMessage);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        qpx.e(this.l, String.format(Locale.ENGLISH, this.l.getString(R.string.IDS_plugin_multi_esim_device_low_power), UnitUtil.e(i, 2, 0)));
    }

    @Override // com.huawei.sim.esim.view.BaseOpenSimCardActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f22979b != null) {
            this.f22979b.removeMessages(10002);
            this.f22979b.removeMessages(10003);
            this.f22979b.removeMessages(10004);
            this.f22979b.removeMessages(10005);
        }
    }

    static class b extends BaseHandler<EsimStandaloneNumGuideActivity> {
        b(EsimStandaloneNumGuideActivity esimStandaloneNumGuideActivity) {
            super(esimStandaloneNumGuideActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(EsimStandaloneNumGuideActivity esimStandaloneNumGuideActivity, Message message) {
            if (message == null) {
                LogUtil.j("EsimStandaloneNumGuideActivity", "handleMessageWhenReferenceNotNull msg is null");
            }
            LogUtil.a("EsimStandaloneNumGuideActivity", "handleMessageWhenReferenceNotNull message = ", message);
            switch (message.what) {
                case 10001:
                    esimStandaloneNumGuideActivity.j();
                    break;
                case 10002:
                    esimStandaloneNumGuideActivity.v.setVisibility(8);
                    break;
                case 10003:
                    esimStandaloneNumGuideActivity.a();
                    break;
                case 10004:
                    esimStandaloneNumGuideActivity.c(esimStandaloneNumGuideActivity.k);
                    xjt.q("MSG_BATTERY_DATA_ERROR");
                    break;
                case 10005:
                    esimStandaloneNumGuideActivity.g();
                    xjt.q("MSG_BATTERY_DATA_FAIL");
                    break;
                default:
                    LogUtil.j("EsimStandaloneNumGuideActivity", "handleMessageWhenReferenceNotNull default");
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (!pxl.b(this.l)) {
            this.y.setEnabled(false);
            this.y.setBackgroundResource(R.drawable.bg_button_pressed);
            this.o.setVisibility(0);
            this.n.setText(this.l.getResources().getString(R.string.IDS_plugin_esim_no_network));
            this.u.setVisibility(0);
            return;
        }
        if (!pxl.c() || !pxl.a(this.l)) {
            this.y.setEnabled(false);
            this.y.setBackgroundResource(R.drawable.bg_button_pressed);
            this.o.setVisibility(0);
            this.n.setText(this.l.getResources().getString(R.string.IDS_plugin_bt_fail));
            this.u.setVisibility(8);
            return;
        }
        this.y.setEnabled(true);
        this.y.setBackgroundResource(R.drawable.multi_esim_button_bg);
        this.o.setVisibility(8);
        this.u.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Context context = this.l;
        qpx.e(context, context.getResources().getString(R.string.IDS_plugin_multi_esim_battery_threshold_fail));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        boolean zI = npz.b().i();
        LogUtil.a("EsimStandaloneNumGuideActivity", "onResume isOperatorOpenSuccess = ", Boolean.valueOf(zI));
        if (zI) {
            finish();
        }
    }

    @Override // com.huawei.sim.esim.view.BaseOpenSimCardActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
