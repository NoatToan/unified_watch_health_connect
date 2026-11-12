package com.huawei.sim.multisim.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import com.huawei.sim.esim.view.BaseOpenSimCardActivity;
import com.huawei.sim.esim.view.adapter.MultiSimAdapter;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listviewforscroll.ListViewForScroll;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.npz;
import defpackage.pxk;
import defpackage.pxl;
import defpackage.qpx;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class EsimSelectCardActivity extends BaseOpenSimCardActivity implements View.OnClickListener {
    private HealthButton k;
    private int l;
    private Context m;
    private MultiSimAdapter o;
    private HealthTextView p;
    private LinearLayout r;
    private HealthTextView s;
    private LinearLayout t;
    private RelativeLayout v;
    private List<Map<String, Object>> w;
    private CustomTitleBar x;
    private int n = 30;
    private MultiSimAdapter.OnRadioButtonClickListener q = new MultiSimAdapter.OnRadioButtonClickListener() { // from class: com.huawei.sim.multisim.activity.EsimSelectCardActivity.1
        @Override // com.huawei.sim.esim.view.adapter.MultiSimAdapter.OnRadioButtonClickListener
        public void onClick(int i) {
            if (EsimSelectCardActivity.this.l != i) {
                EsimSelectCardActivity.this.t.setVisibility(8);
            }
            EsimSelectCardActivity.this.l = i;
            LogUtil.a("EsimSelectCardActivity", "mSelectCardAdapterListener mCardIndex = ", Integer.valueOf(EsimSelectCardActivity.this.l));
        }
    };

    @Override // com.huawei.sim.esim.view.BaseOpenSimCardActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.m = this;
        this.f22979b = new e(this);
        setContentView(R.layout.activity_esim_select_card);
        d();
    }

    private void d() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.select_card_title_bar);
        this.x = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        this.v = (RelativeLayout) findViewById(R.id.select_card_waiting_content);
        this.k = (HealthButton) findViewById(R.id.esim_confirm_btn);
        this.p = (HealthTextView) findViewById(R.id.select_card_tips_tv);
        this.t = (LinearLayout) findViewById(R.id.select_card_error_tips_ll);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.select_card_set_net_ll);
        this.r = linearLayout;
        linearLayout.setOnClickListener(this);
        this.s = (HealthTextView) findViewById(R.id.select_card_error_tips_tv);
        h();
        this.v.setVisibility(8);
        this.k.setOnClickListener(this);
        ListViewForScroll listViewForScroll = (ListViewForScroll) findViewById(R.id.select_card_listview);
        this.w = pxk.e(this.m);
        MultiSimAdapter multiSimAdapter = new MultiSimAdapter(this.m, this.w);
        this.o = multiSimAdapter;
        multiSimAdapter.e(this.q);
        listViewForScroll.setAdapter((ListAdapter) this.o);
        HealthSubHeader healthSubHeader = (HealthSubHeader) findViewById(R.id.select_card_subheader_title);
        TextView textView = (TextView) healthSubHeader.findViewById(R.id.hwsubheader_title_left);
        if (textView != null) {
            textView.setAllCaps(false);
        }
        healthSubHeader.setSplitterVisibility(4);
        healthSubHeader.setSubHeaderBackgroundColor(this.m.getResources().getColor(R.color.colorSubBackground));
    }

    private void h() {
        this.p.setText(String.format(Locale.getDefault(), this.m.getString(R.string.IDS_account_management_select_card_tips), 1, 2, 3, 4, 5));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.esim_confirm_btn) {
            this.v.setVisibility(0);
            b();
        } else if (view.getId() == R.id.select_card_set_net_ll) {
            CommonUtil.t(this.m);
        } else {
            LogUtil.d("EsimSelectCardActivity", "onClick else branch");
        }
    }

    private void b() {
        npz.b().d(new IBaseResponseCallback() { // from class: com.huawei.sim.multisim.activity.EsimSelectCardActivity.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("EsimSelectCardActivity", "getBatteryThresholdStatus onResponse errorCode :", Integer.valueOf(i));
                Message messageObtainMessage = EsimSelectCardActivity.this.f22979b.obtainMessage();
                if (i == 0) {
                    messageObtainMessage.what = 10002;
                } else if (i == 129001) {
                    messageObtainMessage.what = 10003;
                } else {
                    messageObtainMessage.what = 10004;
                }
                if (obj instanceof Integer) {
                    int iIntValue = ((Integer) obj).intValue();
                    if (iIntValue > 0 && iIntValue <= 100) {
                        EsimSelectCardActivity.this.n = iIntValue;
                    }
                } else {
                    LogUtil.j("EsimSelectCardActivity", "getBatteryThresholdStatus onResponse objectData is not Integer");
                }
                EsimSelectCardActivity.this.f22979b.sendMessage(messageObtainMessage);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.o.e(this.q);
        this.v.setVisibility(8);
        qpx.e(this.m, String.format(Locale.ENGLISH, this.m.getString(R.string.IDS_plugin_multi_esim_device_low_power), UnitUtil.e(this.n, 2, 0)));
    }

    static class e extends BaseHandler<EsimSelectCardActivity> {
        e(EsimSelectCardActivity esimSelectCardActivity) {
            super(esimSelectCardActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(EsimSelectCardActivity esimSelectCardActivity, Message message) {
            if (message != null) {
                switch (message.what) {
                    case 10001:
                        esimSelectCardActivity.j();
                        break;
                    case 10002:
                        esimSelectCardActivity.g();
                        break;
                    case 10003:
                        esimSelectCardActivity.f();
                        break;
                    case 10004:
                        esimSelectCardActivity.i();
                        xjt.q("MSG_BATTERY_THRESHOLD_STATUS_FAIL");
                        break;
                    default:
                        LogUtil.j("EsimSelectCardActivity", "handleMessageWhenReferenceNotNull default");
                        break;
                }
            }
            LogUtil.j("EsimSelectCardActivity", "handleMessageWhenReferenceNotNull msg is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (!pxl.b(this.m)) {
            this.o.e(null);
            this.k.setEnabled(false);
            this.t.setVisibility(0);
            this.s.setText(this.m.getResources().getString(R.string.IDS_plugin_esim_no_network));
            this.r.setVisibility(0);
            return;
        }
        if (!pxl.c() || !pxl.a(this.m)) {
            this.o.e(null);
            this.k.setEnabled(false);
            this.t.setVisibility(0);
            this.s.setText(this.m.getResources().getString(R.string.IDS_plugin_bt_fail));
            this.r.setVisibility(8);
            return;
        }
        this.o.e(this.q);
        this.k.setEnabled(true);
        this.t.setVisibility(8);
        this.r.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        List<Map<String, Object>> list = this.w;
        if (list == null || list.isEmpty()) {
            LogUtil.j("EsimSelectCardActivity", "startEsimAccountManagePage not support esim account management");
            return;
        }
        this.o.e(this.q);
        this.v.setVisibility(8);
        int iA = this.o.a();
        this.l = iA;
        this.i = iA;
        a(this.w.get(this.l));
        if (pxl.d(this.h, this.f22978a)) {
            this.t.setVisibility(0);
            this.s.setText(this.m.getResources().getString(R.string.IDS_multi_sim_auth_fail));
        } else {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.o.e(this.q);
        this.v.setVisibility(8);
        Context context = this.m;
        qpx.e(context, context.getResources().getString(R.string.IDS_plugin_multi_esim_battery_threshold_fail));
    }

    @Override // com.huawei.sim.esim.view.BaseOpenSimCardActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f22979b != null) {
            this.f22979b.removeMessages(10002);
            this.f22979b.removeMessages(10003);
            this.f22979b.removeMessages(10004);
        }
    }

    @Override // com.huawei.sim.esim.view.BaseOpenSimCardActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
