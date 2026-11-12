package com.huawei.sim.esim.view;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.ads.dynamic.a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.multisimservice.model.MultiSimDeviceInfo;
import com.huawei.sim.R;
import com.huawei.sim.esim.view.adapter.MultiSimAdapter;
import com.huawei.sim.multisim.activity.EsimAccountManageActivity;
import com.huawei.sim.multisim.activity.EsimOpenMethodActivity;
import com.huawei.sim.multisim.constants.BrandType;
import com.huawei.sim.multisim.constants.CarrierType;
import com.huawei.sim.multisim.constants.EsimType;
import com.huawei.sim.strategy.EsimCarrierStrategy;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listviewforscroll.ListViewForScroll;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.stories.me.adapter.AdapterWithBottomView;
import com.huawei.up.utils.ErrorCode;
import defpackage.nio;
import defpackage.npz;
import defpackage.oco;
import defpackage.pxe;
import defpackage.pxh;
import defpackage.pxi;
import defpackage.pxk;
import defpackage.pxl;
import defpackage.pxn;
import defpackage.pxp;
import defpackage.pxy;
import defpackage.qpx;
import defpackage.qqs;
import defpackage.qrs;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class MultiSimCardActivity extends BaseOpenSimCardActivity implements View.OnClickListener {
    private int aa;
    private MultiSimAdapter ab;
    private LinearLayout ac;
    private HealthButton ad;
    private MultiSimDeviceInfo ae;
    private String af;
    private FrameLayout ag;
    private LinearLayout ah;
    private NoTitleCustomAlertDialog ai;
    private HealthTextView aj;
    private CustomTitleBar ak;
    private List<Map<String, Object>> al;
    private HealthTextView am;
    private String aq;
    private RelativeLayout as;
    private String m;
    private FrameLayout n;
    private LinearLayout p;
    private ImageView q;
    private ImageView r;
    private int s;
    private Context t;
    private ImageView u;
    private HealthTextView v;
    private LinearLayout w;
    private LinearLayout x;
    private LinearLayout y;
    private String[] an = {BaseApplication.getContext().getString(R.string.IDS_plugin_multi_esim_provider_cucc), BaseApplication.getContext().getString(R.string.IDS_plugin_multi_esim_cmcc_not_support), BaseApplication.getContext().getString(R.string.IDS_plugin_multi_esim_ctcc_not_support)};
    private int o = 30;
    private boolean k = false;
    private String l = "";
    private MultiSimAdapter.OnRadioButtonClickListener z = new MultiSimAdapter.OnRadioButtonClickListener() { // from class: com.huawei.sim.esim.view.MultiSimCardActivity.4
        @Override // com.huawei.sim.esim.view.adapter.MultiSimAdapter.OnRadioButtonClickListener
        public void onClick(int i) {
            if (MultiSimCardActivity.this.aa != i) {
                MultiSimCardActivity.this.ac.setVisibility(8);
            }
            MultiSimCardActivity.this.aa = i;
            LogUtil.a("MultiSimCardActivity", "Mulit Sim Index is:", Integer.valueOf(MultiSimCardActivity.this.aa));
            MultiSimCardActivity.this.t();
            MultiSimCardActivity.this.ad.setEnabled(true);
            MultiSimCardActivity.this.ad.setBackgroundResource(R.drawable.multi_esim_button_bg);
        }
    };

    @Override // com.huawei.sim.esim.view.BaseOpenSimCardActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t = this;
        this.f22979b = new b(this);
        setContentView(R.layout.activity_multi_sim_card);
        Intent intent = getIntent();
        if (intent != null) {
            this.o = intent.getIntExtra("BatteryThreshold", this.o);
            this.s = intent.getIntExtra("esim_card_type_key", 1);
            this.ae = (MultiSimDeviceInfo) intent.getParcelableExtra("multi_sim_device_info");
            this.af = intent.getStringExtra("openMethod");
            this.k = intent.getBooleanExtra("esimIsReopening", false);
        }
        int i = this.s;
        ReleaseLogUtil.d("DEVMGR_MultiSimCardActivity", "onCreate mCardType = ", Integer.valueOf(i), "mOpenMethod:", this.af);
        pxi.c();
        k();
    }

    private void k() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.multi_sim_title_bar);
        this.ak = customTitleBar;
        if (this.s == 2) {
            customTitleBar.setTitleText(getString(R.string.IDS_active_standalone_number));
        }
        this.ak.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        this.as = (RelativeLayout) findViewById(R.id.multi_sim_waiting_content);
        this.ad = (HealthButton) findViewById(R.id.btn_esim_confirm);
        this.am = (HealthTextView) findViewById(R.id.tv_multisim_tips);
        this.ac = (LinearLayout) findViewById(R.id.ll_error_tips);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_set_net_layout);
        this.ah = linearLayout;
        linearLayout.setOnClickListener(this);
        this.v = (HealthTextView) findViewById(R.id.tv_error_tips);
        u();
        this.as.setVisibility(8);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.tv_esim_user_guide);
        this.aj = healthTextView;
        healthTextView.setText(pxk.c(this.t.getString(R.string.IDS_esim_usage_guide)));
        this.ag = (FrameLayout) findViewById(R.id.multi_sim_card_list_layout);
        o();
        this.aj.setOnClickListener(this);
        this.ad.setOnClickListener(this);
        this.y = pxk.a((Activity) this);
        ListViewForScroll listViewForScroll = (ListViewForScroll) findViewById(R.id.multi_sim_listview);
        this.al = pxk.b(this.t);
        if (this.s == 2) {
            this.ab = new MultiSimAdapter(this.t, this.an);
        } else {
            MultiSimAdapter multiSimAdapter = new MultiSimAdapter(this.t, this.al);
            this.ab = multiSimAdapter;
            multiSimAdapter.d(this.af);
        }
        this.ab.e(this.z);
        listViewForScroll.setAdapter((ListAdapter) this.ab);
        HealthSubHeader healthSubHeader = (HealthSubHeader) findViewById(R.id.multi_esim_subheader_title);
        TextView textView = (TextView) healthSubHeader.findViewById(R.id.hwsubheader_title_left);
        if (textView != null) {
            if (this.s == 2) {
                textView.setText(R.string.IDS_select_esim_operator);
            }
            textView.setAllCaps(false);
        }
        healthSubHeader.setSplitterVisibility(4);
        healthSubHeader.setSubHeaderBackgroundColor(this.t.getResources().getColor(R.color.colorSubBackground));
        v();
        t();
    }

    private void v() {
        if (this.s == 2) {
            this.n.setVisibility(8);
            this.ag.setVisibility(0);
        } else {
            this.n.setVisibility(8);
            this.ag.setVisibility(0);
        }
        if (qqs.e(this.t)) {
            this.ac.setBackgroundResource(R.drawable.bg_error_layout_dark_mode_background);
        } else {
            this.ac.setBackgroundResource(R.drawable.bg_error_layout_background);
        }
        if (this.s == 2 || pxk.a() || pxk.e(this.al)) {
            return;
        }
        this.ad.setEnabled(false);
        this.ad.setBackgroundResource(R.drawable.bg_button_pressed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public void t() {
        String[] strArr;
        int length;
        int i;
        List<Map<String, Object>> list = this.al;
        if (list != null) {
            int size = list.size();
            int i2 = this.aa;
            if (size > i2) {
                this.l = pxi.e(this.al.get(i2));
            } else {
                strArr = this.an;
                if (strArr != null) {
                    length = strArr.length;
                    i = this.aa;
                    if (length > i) {
                        this.l = pxi.a(this.t, strArr[i]);
                    }
                }
            }
        } else {
            strArr = this.an;
            if (strArr != null) {
                length = strArr.length;
                i = this.aa;
                if (length > i) {
                    this.l = pxi.a(this.t, strArr[i]);
                }
            }
        }
        LogUtil.a("MultiSimCardActivity", "selectCarrierName : ", this.l);
    }

    private void o() {
        this.n = (FrameLayout) findViewById(R.id.android_verson_below_seven_layout);
        this.r = (ImageView) findViewById(R.id.cmcc_arrow);
        this.u = (ImageView) findViewById(R.id.cucc_arrow);
        this.q = (ImageView) findViewById(R.id.ctcc_arrow);
        if (LanguageUtil.ba(this.t)) {
            this.r.setBackground(this.t.getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.u.setBackground(this.t.getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.q.setBackground(this.t.getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            this.r.setBackground(this.t.getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.u.setBackground(this.t.getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.q.setBackground(this.t.getResources().getDrawable(R.drawable.common_ui_arrow_right));
        }
        this.p = (LinearLayout) findViewById(R.id.cmcc_layout);
        this.x = (LinearLayout) findViewById(R.id.cucc_layout);
        this.w = (LinearLayout) findViewById(R.id.ctcc_layout);
        this.p.setOnClickListener(this);
        this.x.setOnClickListener(this);
        this.w.setOnClickListener(this);
        HealthSubHeader healthSubHeader = (HealthSubHeader) findViewById(R.id.select_carrier_subheader);
        TextView textView = (TextView) healthSubHeader.findViewById(R.id.hwsubheader_title_left);
        if (textView != null) {
            textView.setAllCaps(false);
        }
        healthSubHeader.setSubHeaderBackgroundColor(this.t.getResources().getColor(R.color.colorSubBackground));
    }

    private void u() {
        String str;
        String strE = UnitUtil.e(1.0d, 1, 0);
        String strE2 = UnitUtil.e(2.0d, 1, 0);
        String strE3 = UnitUtil.e(3.0d, 1, 0);
        String strE4 = UnitUtil.e(4.0d, 1, 0);
        if (!Utils.o()) {
            if (pxk.b(this.s)) {
                String strE5 = UnitUtil.e(5.0d, 1, 0);
                str = String.format(Locale.ENGLISH, this.t.getString(R.string.IDS_select_multisim_card_tips_new), strE, strE2, UnitUtil.e(20.0d, 1, 0), strE3, strE4, strE5);
            } else {
                str = String.format(Locale.ENGLISH, this.t.getString(R.string.IDS_select_standalone_card_tips_new), strE, UnitUtil.e(5.0d, 1, 0), strE2, strE3, strE4);
            }
        } else {
            str = String.format(Locale.ENGLISH, this.t.getString(R.string.IDS_select_sim_card_tips_oversea), strE, strE2, strE3, strE4);
        }
        this.am.setText(str);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.btn_esim_confirm) {
            if (!npz.b().k()) {
                qpx.e(this.t, R.string.IDS_plugin_bt_fail);
                return;
            }
            pxi.c("activate_button", this.l);
            this.as.setVisibility(0);
            j();
            return;
        }
        if (view.getId() == R.id.tv_esim_user_guide) {
            pxi.c("user_guide", "");
            a(this.t.getString(R.string.IDS_esim_usage_guide), pxk.c(this.t));
            return;
        }
        if (view.getId() == R.id.cmcc_layout) {
            a("46000000", this.s);
            return;
        }
        if (view.getId() == R.id.cucc_layout) {
            a("46001000", this.s);
            return;
        }
        if (view.getId() == R.id.ctcc_layout) {
            a("46003000", this.s);
        } else if (view.getId() == R.id.ll_set_net_layout) {
            CommonUtil.t(this.t);
        } else {
            LogUtil.d("MultiSimCardActivity", "onClick else branch");
        }
    }

    private void j() {
        npz.b().d(new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.MultiSimCardActivity.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("MultiSimCardActivity", "getMultiSimBatteryThreshold onResponse errorCode :", Integer.valueOf(i));
                MultiSimCardActivity.this.f22979b.sendMessage(MultiSimCardActivity.this.f22979b.obtainMessage(10003));
                Message messageObtainMessage = MultiSimCardActivity.this.f22979b.obtainMessage();
                if (i == 0) {
                    messageObtainMessage.what = 10004;
                } else if (i == 129001) {
                    messageObtainMessage.what = 10005;
                    xjt.q("MSG_BATTERY_DATA_ERROR");
                } else {
                    messageObtainMessage.what = 10006;
                    xjt.q("MSG_BATTERY_DATA_FAIL");
                }
                MultiSimCardActivity.this.f22979b.sendMessage(messageObtainMessage);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        qpx.e(this.t, String.format(Locale.ENGLISH, this.t.getString(R.string.IDS_plugin_multi_esim_device_low_power), UnitUtil.e(i, 2, 0)));
    }

    @Override // com.huawei.sim.esim.view.BaseOpenSimCardActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("MultiSimCardActivity", "onDestroy");
        if (this.f22979b != null) {
            this.f22979b.removeCallbacksAndMessages(null);
        }
    }

    static class b extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<MultiSimCardActivity> f23065b;

        b(MultiSimCardActivity multiSimCardActivity) {
            this.f23065b = new WeakReference<>(multiSimCardActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("MultiSimCardActivity", "ConfirmActivityHandler handleMessageWhenReferenceNotNull msg is null");
                return;
            }
            super.handleMessage(message);
            WeakReference<MultiSimCardActivity> weakReference = this.f23065b;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.a("MultiSimCardActivity", "mWeakActivity is null");
                return;
            }
            MultiSimCardActivity multiSimCardActivity = this.f23065b.get();
            ReleaseLogUtil.d("DEVMGR_MultiSimCardActivity", "handleMessageWhenReferenceNotNull msg is ", message);
            int i = message.what;
            if (i == 10001) {
                multiSimCardActivity.r();
                return;
            }
            if (i == 100005) {
                multiSimCardActivity.s();
                multiSimCardActivity.y.setVisibility(8);
                multiSimCardActivity.as.setVisibility(8);
                qpx.e(multiSimCardActivity, multiSimCardActivity.getResources().getString(R.string.IDS_oversea_es_load_fail));
                return;
            }
            if (i != 100007) {
                switch (i) {
                    case 10003:
                        multiSimCardActivity.l();
                        break;
                    case 10004:
                        if (multiSimCardActivity.s == 2) {
                            multiSimCardActivity.g();
                        } else {
                            multiSimCardActivity.h();
                        }
                        break;
                    case 10005:
                        multiSimCardActivity.c(multiSimCardActivity.o);
                        break;
                    case 10006:
                        multiSimCardActivity.w();
                        break;
                    default:
                        switch (i) {
                            case 100001:
                                multiSimCardActivity.s();
                                multiSimCardActivity.as.setVisibility(8);
                                multiSimCardActivity.a(message.arg1);
                                break;
                            case ErrorCode.HWID_IS_STOPED /* 100002 */:
                                multiSimCardActivity.s();
                                multiSimCardActivity.as.setVisibility(8);
                                multiSimCardActivity.b(message);
                                break;
                            case 100003:
                                multiSimCardActivity.s();
                                multiSimCardActivity.p();
                                multiSimCardActivity.y.setVisibility(8);
                                multiSimCardActivity.as.setVisibility(8);
                                qpx.e(multiSimCardActivity, multiSimCardActivity.getResources().getString(R.string.IDS_oversea_es_load_fail));
                                break;
                            default:
                                LogUtil.j("MultiSimCardActivity", "handleMessageWhenReferenceNotNull default");
                                break;
                        }
                        break;
                }
                return;
            }
            multiSimCardActivity.s();
            multiSimCardActivity.as.setVisibility(8);
            multiSimCardActivity.e(message);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a("MultiSimCardActivity", "Enter onActivityResult(): requestCode= ", Integer.valueOf(i), " resultCode=", Integer.valueOf(i2));
        if (i2 == 1 && intent != null) {
            String stringExtra = intent.getStringExtra("ActivationCode");
            this.m = stringExtra;
            LogUtil.a("MultiSimCardActivity", "onActivityResult esimActivatedAccode = ", stringExtra);
            pxi.b("unabled_entry", this.l, pxi.c(this.af), pxi.d(this.s));
            pxk.a(this.t, this.m, this.s, this.aq);
        } else if (i == 1099) {
            this.as.setVisibility(8);
            if (intent != null && intent.getBooleanExtra("cuccAgreementAgree", false)) {
                EsimCarrierStrategy esimCarrierStrategyA = pxn.e().a();
                if (esimCarrierStrategyA instanceof pxy) {
                    this.y.setVisibility(0);
                    ((pxy) esimCarrierStrategyA).a(i, intent);
                }
            }
        } else {
            this.y.setVisibility(8);
            Context context = this.t;
            qpx.e(context, context.getString(R.string.IDS_oversea_es_query_fail));
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        LogUtil.a("MultiSimCardActivity", "handleOpenResult: ", Integer.valueOf(message.arg1));
        if (message.arg1 != 0) {
            this.y.setVisibility(8);
            qpx.e(this.t, getResources().getString(R.string.IDS_oversea_es_load_fail));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        ReleaseLogUtil.d("DEVMGR_MultiSimCardActivity", "query result message:", Integer.valueOf(message.arg1), "mCardType = ", Integer.valueOf(this.s));
        if (pxk.c(this.s)) {
            c(message);
        } else if (pxk.b(this.s)) {
            a(message);
        } else {
            ReleaseLogUtil.d("DEVMGR_MultiSimCardActivity", "mCardType is invalid.");
        }
    }

    private void c(Message message) {
        if (message.arg1 == 1200) {
            if (message.getData() != null) {
                this.m = message.getData().getString("ActivationCode");
            }
            LogUtil.a("MultiSimCardActivity", "handleQueryResultStandaloneNum acCode = ", this.m);
            pxk.a(this.t, this.m, this.s, this.aq);
            this.y.setVisibility(8);
            return;
        }
        if (message.arg1 == -1011) {
            pxk.b(this.t, new View.OnClickListener() { // from class: pvt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ReleaseLogUtil.d("DEVMGR_MultiSimCardActivity", "press positive button.");
                }
            });
        } else if (message.arg1 == 1000) {
            f();
        } else {
            qpx.e(this.t, getResources().getString(R.string.IDS_oversea_es_load_fail));
        }
    }

    private void a(Message message) {
        if (message.arg1 == 1200) {
            this.y.setVisibility(8);
            if (message.getData() != null) {
                this.m = message.getData().getString("ActivationCode");
            }
            LogUtil.a("MultiSimCardActivity", "acCode = ", this.m);
            x();
            return;
        }
        if (message.arg1 == -1011) {
            this.y.setVisibility(8);
            z();
        } else if (message.arg1 == 1000) {
            f();
        } else {
            this.y.setVisibility(8);
            qpx.e(this.t, getResources().getString(R.string.IDS_oversea_es_load_fail));
        }
    }

    private void f() {
        if (pxk.h(this.j)) {
            pxn.e().a().activateEsim();
        } else {
            c(this.af, this.aq, false);
        }
    }

    private void n() {
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.t).a(R.string.IDS_plugin_multi_sim_note).b(R.string.IDS_plugin_multi_esim_note_content).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: pwa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.j("MultiSimCardActivity", "press negative button");
            }
        }).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: pwb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45908a.a(view);
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public /* synthetic */ void a(View view) {
        ad();
    }

    private void x() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.t);
        builder.b(R.string.IDS_opend_down_esim);
        builder.a(this.t.getString(R.string.IDS_go_down_esim), new View.OnClickListener() { // from class: pvo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(view);
            }
        }).d(this.t.getString(R.string.IDS_plugin_multi_sim_open_fail_general_blue_link).toUpperCase(), new View.OnClickListener() { // from class: pvu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.ai = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        if (this.ai.isShowing()) {
            return;
        }
        this.ai.show();
    }

    public /* synthetic */ void d(View view) {
        ReleaseLogUtil.d("DEVMGR_MultiSimCardActivity", "download");
        b();
        pxi.b("enabled_entry", this.l, pxi.c(this.af), pxi.d(this.s));
        pxk.a(this.t, this.m, this.s, this.aq);
    }

    public /* synthetic */ void b(View view) {
        LogUtil.a("MultiSimCardActivity", "learn more selectImsi =", this.aq);
        b();
        try {
            Intent intent = new Intent(this.t, (Class<?>) EsimAccountManageActivity.class);
            intent.putExtra("esim_auth_method", this.f22978a);
            intent.putExtra("simImsi", this.aq);
            intent.putExtra("MultiSimSlotId", this.i);
            this.t.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("MultiSimCardActivity", "startEsimAccountManageActivity ActivityNotFoundException");
        }
    }

    private void z() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.t);
        builder.b(R.string.ids_oversea_es_query_opened);
        builder.a(this.t.getString(R.string.IDS_plugin_sim_esim_logout_ok), new View.OnClickListener() { // from class: pvv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45905a.g(view);
            }
        }).a(R.string.IDS_plugin_multi_sim_known, new View.OnClickListener() { // from class: pvx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.i(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.ai = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        if (this.ai.isShowing()) {
            return;
        }
        this.ai.show();
    }

    public /* synthetic */ void g(View view) {
        b();
        try {
            Intent intent = new Intent(this.t, (Class<?>) EsimAccountManageActivity.class);
            intent.putExtra("esim_auth_method", this.f22978a);
            intent.putExtra("simImsi", this.aq);
            intent.putExtra("MultiSimSlotId", this.i);
            this.t.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("MultiSimCardActivity", "startEsimAccountManageActivity ActivityNotFoundException");
        }
    }

    public /* synthetic */ void i(View view) {
        b();
    }

    private void b() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.ai;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.ai = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        LogUtil.a("MultiSimCardActivity", "removeTimeOutMessage");
        if (this.f22979b == null) {
            LogUtil.j("MultiSimCardActivity", "mHandler is null");
        } else {
            this.f22979b.removeMessages(100003);
            this.f22979b.removeMessages(AdapterWithBottomView.TYPE_BOTTOM);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        LogUtil.a("MultiSimCardActivity", "removeAuthQueryMessage");
        if (this.f22979b == null) {
            LogUtil.j("MultiSimCardActivity", "mHandler is null");
        } else {
            this.f22979b.removeMessages(100001);
            this.f22979b.removeMessages(ErrorCode.HWID_IS_STOPED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (!pxl.b(this.t)) {
            this.ab.e(null);
            this.ad.setEnabled(false);
            this.ad.setBackgroundResource(R.drawable.bg_button_pressed);
            this.ac.setVisibility(0);
            this.v.setText(this.t.getResources().getString(R.string.IDS_plugin_esim_no_network));
            this.ah.setVisibility(0);
        } else if (!pxl.c() || !pxl.a(this.t)) {
            this.ab.e(null);
            this.ad.setEnabled(false);
            this.ad.setBackgroundResource(R.drawable.bg_button_pressed);
            this.ac.setVisibility(0);
            this.v.setText(this.t.getResources().getString(R.string.IDS_plugin_bt_fail));
            this.ah.setVisibility(8);
        } else {
            this.ab.e(this.z);
            this.ad.setEnabled(true);
            this.ad.setBackgroundResource(R.drawable.multi_esim_button_bg);
            this.ac.setVisibility(8);
            this.ah.setVisibility(8);
        }
        this.y.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.ab.e(this.z);
        this.as.setVisibility(8);
        this.y.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        String str;
        ReleaseLogUtil.d("DEVMGR_MultiSimCardActivity", "enterMultiSimOpenMethod enter");
        List<Map<String, Object>> list = this.al;
        if (list == null || list.isEmpty()) {
            LogUtil.j("MultiSimCardActivity", "sim cards is none");
            Context context = this.t;
            qpx.e(context, context.getResources().getString(R.string.IDS_plugin_multi_esim_error_no_sim));
            return;
        }
        int iA = this.ab.a();
        this.aa = iA;
        Object obj = this.al.get(iA).get("imsi");
        if (!(obj instanceof String)) {
            str = "";
        } else {
            str = (String) obj;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("MultiSimCardActivity", "sim provider is null");
            xjt.q("sim provider is null");
            return;
        }
        this.aq = str;
        y();
        a(this.al.get(this.aa));
        if (pxh.e()) {
            e(str);
            return;
        }
        if (!Utils.o()) {
            if ((CommonUtil.bg() || pxk.g()) && pxk.d(str)) {
                pxk.e("03", true);
                c(this.af, str, true);
                return;
            } else if (!pxk.f(str)) {
                qpx.e(this.t, getResources().getString(R.string.IDS_plugin_multi_esim_open_simcard_error));
                xjt.q("Your SIM card doesn't support multi-device services");
                return;
            } else {
                pxk.e(a.t, true);
                a(str, this.s);
                return;
            }
        }
        LogUtil.e("MultiSimCardActivity", "Oversea only support scan code activation");
    }

    private void y() {
        this.i = this.aa;
        Map<String, Object> map = this.al.get(this.aa);
        if (map == null || !map.containsKey("slotId")) {
            return;
        }
        Object obj = this.al.get(this.aa).get("slotId");
        if (obj instanceof Integer) {
            this.i = ((Integer) obj).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        Context context = this.t;
        qpx.e(context, context.getResources().getString(R.string.IDS_plugin_multi_esim_battery_threshold_fail));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        boolean zI = npz.b().i();
        LogUtil.a("MultiSimCardActivity", "onResume isOperatorOpenSuccess = ", Boolean.valueOf(zI));
        if (zI) {
            finish();
        }
    }

    private void b(String str, ArrayList<String> arrayList) {
        ReleaseLogUtil.d("DEVMGR_MultiSimCardActivity", "handleNewDeviceMethod() isReopening ：", Boolean.valueOf(this.k));
        ArrayList<String> arrayList2 = new ArrayList<>();
        if (this.k) {
            c(arrayList);
            c(arrayList, str);
        } else {
            if (TextUtils.isEmpty(this.af)) {
                LogUtil.a("MultiSimCardActivity", "mOpenMethod is empty.");
                return;
            }
            if (this.af.equals(HiAnalyticsConstant.KeyAndValue.NUMBER_01)) {
                arrayList2.add(HiAnalyticsConstant.KeyAndValue.NUMBER_01);
                arrayList = arrayList2;
            } else {
                c(arrayList);
            }
            c(arrayList, str);
        }
    }

    private void c(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() <= 0 || !arrayList.contains(HiAnalyticsConstant.KeyAndValue.NUMBER_01)) {
            return;
        }
        arrayList.remove(HiAnalyticsConstant.KeyAndValue.NUMBER_01);
    }

    private void e(String str) {
        LogUtil.a("MultiSimCardActivity", "enterOpenMethodProcess enter");
        int i = this.aa;
        if (i < 0 || i >= this.al.size()) {
            LogUtil.j("MultiSimCardActivity", "mMulitSimIndex is out of range");
            return;
        }
        pxe pxeVarA = pxh.a(this.al.get(this.aa));
        if (pxeVarA == null) {
            LogUtil.j("MultiSimCardActivity", "esimOpenMethod is null");
            xjt.q("esimOpenMethod is null");
            return;
        }
        if (pxk.a(str) && !TextUtils.isEmpty(this.af) && !this.af.equals(HiAnalyticsConstant.KeyAndValue.NUMBER_01)) {
            Context context = this.t;
            qpx.e(context, context.getResources().getString(R.string.IDS_competition_not_support));
            return;
        }
        e(pxeVarA, str);
        this.f = pxeVarA.c();
        if (pxk.h(str) && CommonUtil.bg()) {
            this.f22978a = 2;
        } else if (pxk.h(str) && !CommonUtil.bg()) {
            this.f22978a = 1;
        } else {
            this.f22978a = pxeVarA.b();
        }
        this.h = pxeVarA.a();
        ArrayList<String> arrayListA = pxk.a(pxeVarA);
        b(arrayListA, str);
        if (arrayListA.isEmpty()) {
            LogUtil.j("MultiSimCardActivity", "openMethodList is empty.");
            xjt.q("openMethodList is empty.");
            return;
        }
        if (pxk.a()) {
            b(str, arrayListA);
            return;
        }
        if (arrayListA.size() >= 2) {
            if (arrayListA.contains("04") && TextUtils.isEmpty(oco.c(BaseApplication.getContext(), "ODSA_ESURL", this.i, ""))) {
                m();
                xjt.q("isSupport is Empty");
                return;
            } else {
                d(str, arrayListA);
                return;
            }
        }
        if (arrayListA.size() == 1) {
            c(arrayListA, str);
        } else {
            LogUtil.j("MultiSimCardActivity", "enterOpenMethodProcess else branch");
        }
    }

    private void d(String str, ArrayList<String> arrayList) {
        try {
            Intent intent = new Intent(this.t, (Class<?>) EsimOpenMethodActivity.class);
            intent.putExtra("esim_operator_key", this.h);
            intent.putExtra("esim_auth_method", this.f22978a);
            intent.putExtra("simImsi", str);
            intent.putExtra("MultiSimSlotId", this.i);
            intent.putExtra("esim_default_url", this.f);
            intent.putExtra("esim_operator_name_key", pxk.c(this.t, str));
            intent.putExtra("multi_sim_device_info", this.ae);
            intent.putStringArrayListExtra("openMethodList", arrayList);
            this.t.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("MultiSimCardActivity", "enterOpenMethodProcess ActivityNotFoundException");
        }
    }

    private void e(pxe pxeVar, String str) {
        if (pxk.d(str)) {
            if (CommonUtil.bg() || pxk.g()) {
                pxeVar.a("03");
            } else {
                pxeVar.a(a.t);
            }
        }
    }

    private void b(ArrayList<String> arrayList, String str) {
        boolean zH = pxk.h(str);
        boolean z = Build.VERSION.SDK_INT >= 28;
        LogUtil.a("MultiSimCardActivity", "is Cucc:", Boolean.valueOf(zH), ", SDK ver:", Integer.valueOf(Build.VERSION.SDK_INT));
        if (zH && z) {
            for (int i = 0; i < arrayList.size(); i++) {
                String str2 = arrayList.get(i);
                if (!TextUtils.isEmpty(str2) && str2.equals(a.t)) {
                    arrayList.set(i, "04");
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    private void c(ArrayList<String> arrayList, String str) {
        byte b2;
        if (arrayList == null || arrayList.isEmpty()) {
            LogUtil.a("MultiSimCardActivity", "openMethodList is empty. ");
            return;
        }
        String str2 = arrayList.get(0);
        ReleaseLogUtil.d("DEVMGR_MultiSimCardActivity", "openMethod : ", str2);
        pxk.e(str2, true);
        SharedPreferenceManager.e(BaseApplication.getContext(), "share_preference_esim_accode", "imsi", nio.e(str), null);
        this.af = str2;
        pxi.e("activate_button", pxi.c(str2));
        str2.hashCode();
        switch (str2) {
            case "01":
                b2 = 0;
                break;
            case "02":
                b2 = 1;
                break;
            case "03":
                b2 = 2;
                break;
            case "04":
                b2 = 3;
                break;
            case "05":
                b2 = 4;
                break;
            case "06":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            a();
            return;
        }
        if (b2 == 1) {
            a(str, this.s);
            return;
        }
        if (b2 == 2) {
            c(str2, str, true);
            return;
        }
        if (b2 == 3) {
            ac();
            return;
        }
        if (b2 == 4) {
            LogUtil.a("MultiSimCardActivity", "handleOneOpenMethod H5 branch");
            this.ac.setVisibility(0);
            this.v.setText(this.t.getResources().getString(R.string.IDS_multi_sim_no_support_tips));
        } else {
            if (b2 != 5) {
                LogUtil.j("MultiSimCardActivity", "handleOneOpenMethod else branch");
                this.ac.setVisibility(0);
                this.v.setText(this.t.getResources().getString(R.string.IDS_multi_sim_no_support_tips));
                xjt.q("handleOneOpenMethod else branch");
                return;
            }
            e();
        }
    }

    private void ac() {
        LogUtil.a("MultiSimCardActivity", "choiceContentProvider TS.43 ESs branch");
        if (pxl.d(this.h, this.f22978a)) {
            this.ac.setVisibility(0);
            this.v.setText(this.t.getResources().getString(R.string.IDS_open_method_auth_fail));
            this.ad.setEnabled(false);
            this.ad.setBackgroundResource(R.drawable.bg_button_pressed);
            return;
        }
        if (TextUtils.isEmpty(oco.c(BaseApplication.getContext(), "ODSA_ESURL", this.i, "")) && !pxk.c(this.s)) {
            m();
        } else if (!pxk.h(this.j) && !pxk.c(this.s)) {
            c(this.af, this.j, true);
        } else {
            n();
        }
    }

    private void ad() {
        if (pxk.b(this.s)) {
            pxn.e().a(CarrierType.CUCC, EsimType.ONE_NUMBER_MULTISIM, CommonUtil.bg() ? BrandType.HUAWEI : BrandType.THIRD);
        } else if (pxk.c(this.s)) {
            pxn.e().a(CarrierType.CUCC, EsimType.STAND_ALONE_NUMBER, CommonUtil.bg() ? BrandType.HUAWEI : BrandType.THIRD);
        } else {
            LogUtil.a("MultiSimCardActivity", "mCardType is invalid");
            return;
        }
        EsimCarrierStrategy esimCarrierStrategyB = pxn.e().b(this.t, this.f22979b);
        pxp pxpVar = new pxp();
        pxpVar.i = this.i;
        pxpVar.h = this.j;
        pxpVar.m = new Runnable() { // from class: pvw
            @Override // java.lang.Runnable
            public final void run() {
                this.f45906b.d();
            }
        };
        esimCarrierStrategyB.setRequest(pxpVar);
        esimCarrierStrategyB.authenticate();
    }

    public /* synthetic */ void d() {
        this.as.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        ReleaseLogUtil.d("DEVMGR_MultiSimCardActivity", "query esim result = " + i);
        s();
        if (i == 1000) {
            pxn.e().a().getEsimStatus();
            return;
        }
        if (i == 98) {
            this.as.setVisibility(8);
            this.y.setVisibility(8);
            Context context = this.t;
            qpx.e(context, context.getResources().getString(R.string.IDS_plugin_network_unstable));
            return;
        }
        this.as.setVisibility(8);
        this.y.setVisibility(8);
        Context context2 = this.t;
        qpx.e(context2, context2.getResources().getString(R.string.IDS_oversea_es_load_fail));
    }

    private void m() {
        ReleaseLogUtil.d("DEVMGR_MultiSimCardActivity", "sdk return param isSupport is false");
        this.ac.setVisibility(0);
        this.v.setText(this.t.getResources().getString(R.string.IDS_multi_sim_no_support_tips));
    }

    private void a(final String str, final String str2) {
        if (qrs.r()) {
            return;
        }
        LogUtil.a("MultiSimCardActivity", "startWebView is enter");
        ThreadPoolManager.c().a("MultiSimCardActivity", new Runnable() { // from class: com.huawei.sim.esim.view.MultiSimCardActivity.5
            @Override // java.lang.Runnable
            public void run() {
                final String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainTipsResDbankcdnNew");
                if (TextUtils.isEmpty(url)) {
                    return;
                }
                MultiSimCardActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.sim.esim.view.MultiSimCardActivity.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        pxk.e(MultiSimCardActivity.this.t, str, url + str2);
                    }
                });
            }
        });
    }

    private void q() {
        List<Map<String, Object>> list = this.al;
        if (list == null || list.isEmpty()) {
            ReleaseLogUtil.e("DEVMGR_MultiSimCardActivity", "sim cards is none");
        } else {
            a(pxk.a(this.t, this.al));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        List<Map<String, Object>> list;
        ReleaseLogUtil.d("DEVMGR_MultiSimCardActivity", "enterStandaloneNumOpenMethod enter");
        int iA = this.ab.a();
        this.aa = iA;
        if (iA >= 0) {
            String[] strArr = this.an;
            if (iA < strArr.length) {
                String str = strArr[iA];
                String strI = i();
                if (TextUtils.isEmpty(strI)) {
                    LogUtil.j("MultiSimCardActivity", "enterStandaloneNumOpenMethod imsi is empty");
                    xjt.q("enterStandaloneNumOpenMethod imsi is empty");
                    return;
                }
                ArrayList<String> arrayListB = pxk.b(this.t, str);
                if (arrayListB == null || arrayListB.size() == 0) {
                    LogUtil.j("MultiSimCardActivity", "enterStandaloneNumOpenMethod openMethodList is empty.");
                    xjt.q("enterStandaloneNumOpenMethod openMethodList is empty.");
                    return;
                }
                if (pxk.a() && !TextUtils.isEmpty(this.af) && !this.af.equals(HiAnalyticsConstant.KeyAndValue.NUMBER_01) && ((list = this.al) == null || list.isEmpty())) {
                    LogUtil.j("MultiSimCardActivity", "enterStandaloneNumOpenMethod sim cards is none");
                    Context context = this.t;
                    qpx.e(context, context.getResources().getString(R.string.IDS_plugin_multi_esim_error_no_sim));
                    return;
                }
                q();
                if (pxk.a()) {
                    b(strI, arrayListB);
                    return;
                }
                if (arrayListB.size() >= 2) {
                    try {
                        Intent intent = new Intent(this.t, (Class<?>) EsimOpenMethodActivity.class);
                        intent.putExtra("esim_card_type_key", this.s);
                        intent.putExtra("esim_operator_name_key", str);
                        intent.putStringArrayListExtra("openMethodList", arrayListB);
                        intent.putExtra("simImsi", strI);
                        intent.putExtra("multi_sim_device_info", this.ae);
                        this.t.startActivity(intent);
                        return;
                    } catch (ActivityNotFoundException unused) {
                        LogUtil.e("MultiSimCardActivity", "enterStandaloneNumOpenMethod ActivityNotFoundException");
                        return;
                    }
                }
                if (arrayListB.size() != 1) {
                    LogUtil.j("MultiSimCardActivity", "enterStandaloneNumOpenMethod else branch");
                    return;
                } else {
                    d(arrayListB, strI);
                    return;
                }
            }
        }
        LogUtil.j("MultiSimCardActivity", "enterStandaloneNumOpenMethod mMulitSimIndex is out of range.");
    }

    private String i() {
        int i = this.aa;
        if (i == 0) {
            return "46001";
        }
        if (i == 1) {
            return "46000";
        }
        if (i == 2) {
            return "46003";
        }
        return "";
    }

    private void d(ArrayList<String> arrayList, String str) {
        String str2 = arrayList.get(0);
        pxi.e("activate_button", pxi.c(str2));
        if (str2.equals(HiAnalyticsConstant.KeyAndValue.NUMBER_01)) {
            e(this.ae);
            return;
        }
        if (str2.equals("07")) {
            LogUtil.a("MultiSimCardActivity", "handleStandaloneNumOpenMethod hand hall method");
            a(str, this.s);
        } else {
            LogUtil.j("MultiSimCardActivity", "handleStandaloneNumOpenMethod else branch");
            xjt.q("handleStandaloneNumOpenMethod else branch");
            this.ac.setVisibility(0);
            this.v.setText(this.t.getResources().getString(R.string.IDS_multi_sim_no_support_tips));
        }
    }

    @Override // com.huawei.sim.esim.view.BaseOpenSimCardActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
