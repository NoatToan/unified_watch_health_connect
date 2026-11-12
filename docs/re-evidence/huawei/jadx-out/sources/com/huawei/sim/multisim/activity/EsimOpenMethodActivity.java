package com.huawei.sim.multisim.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.multisimservice.model.MultiSimDeviceInfo;
import com.huawei.sim.R;
import com.huawei.sim.esim.view.BaseOpenSimCardActivity;
import com.huawei.sim.esim.view.MultiSimCardActivity;
import com.huawei.sim.multisim.adapter.EsimOpenMethodAdapter;
import com.huawei.sim.multisim.constants.BrandType;
import com.huawei.sim.multisim.constants.CarrierType;
import com.huawei.sim.multisim.constants.EsimType;
import com.huawei.sim.strategy.EsimCarrierStrategy;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.stories.me.adapter.AdapterWithBottomView;
import com.huawei.up.utils.ErrorCode;
import defpackage.lsg;
import defpackage.nio;
import defpackage.npz;
import defpackage.pxh;
import defpackage.pxi;
import defpackage.pxk;
import defpackage.pxl;
import defpackage.pxn;
import defpackage.pxp;
import defpackage.pxy;
import defpackage.qpx;
import defpackage.qqs;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class EsimOpenMethodActivity extends BaseOpenSimCardActivity implements View.OnClickListener {
    private static final String[] n = {"android.permission.CAMERA"};
    private NoTitleCustomAlertDialog aa;
    private LinearLayout ab;
    private String ad;
    private CustomTitleBar af;
    private RelativeLayout ag;
    private HealthTextView ah;
    private ImageView ai;
    private String k;
    private int m;
    private Context o;
    private HealthTextView p;
    private HealthButton q;
    private EsimOpenMethodAdapter r;
    private RelativeLayout s;
    private LinearLayout t;
    private HealthTextView u;
    private ImageView v;
    private MultiSimDeviceInfo w;
    private String x;
    private ArrayList<String> ac = new ArrayList<>(16);
    private String z = "";
    private int l = 30;
    private EsimOpenMethodAdapter.OnRadioButtonClickListener y = new EsimOpenMethodAdapter.OnRadioButtonClickListener() { // from class: com.huawei.sim.multisim.activity.EsimOpenMethodActivity.3
        @Override // com.huawei.sim.multisim.adapter.EsimOpenMethodAdapter.OnRadioButtonClickListener
        public void onClick(int i, String str) {
            if (!EsimOpenMethodActivity.this.z.equals(str)) {
                EsimOpenMethodActivity.this.s.setVisibility(8);
            }
            EsimOpenMethodActivity.this.z = str;
            ReleaseLogUtil.d("DEVMGR_EsimOpenMethodActivity", "mListener mOpenMethod = ", EsimOpenMethodActivity.this.z);
            EsimOpenMethodActivity.this.q.setEnabled(true);
            EsimOpenMethodActivity.this.q.setBackgroundResource(R.drawable.multi_esim_button_bg);
        }
    };

    @Override // com.huawei.sim.esim.view.BaseOpenSimCardActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = this;
        this.f22979b = new a(this);
        setContentView(R.layout.activity_esim_open_method);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.h = intent.getStringExtra("esim_operator_key");
                this.f22978a = intent.getIntExtra("esim_auth_method", 0);
                LogUtil.a("EsimOpenMethodActivity", "mAuthMethod = ", Integer.valueOf(this.f22978a));
                this.x = intent.getStringExtra("simImsi");
                this.i = intent.getIntExtra("MultiSimSlotId", 0);
                this.ac = intent.getStringArrayListExtra("openMethodList");
                this.f = intent.getStringExtra("esim_default_url");
                this.m = intent.getIntExtra("esim_card_type_key", 1);
                this.ad = intent.getStringExtra("esim_operator_name_key");
                this.w = (MultiSimDeviceInfo) intent.getParcelableExtra("multi_sim_device_info");
                this.l = intent.getIntExtra("BatteryThreshold", this.l);
            } catch (ArrayIndexOutOfBoundsException e) {
                LogUtil.e("EsimOpenMethodActivity", "onCreate ArrayIndexOutOfBoundsException");
                xjt.q("onCreate ArrayIndexOutOfBoundsException : " + e.getMessage());
            }
        }
        ReleaseLogUtil.d("DEVMGR_EsimOpenMethodActivity", "mCardType : ", Integer.valueOf(this.m));
        pxi.b();
        if (pxk.a()) {
            ArrayList<String> arrayList = new ArrayList<>(16);
            this.ac = arrayList;
            arrayList.add(HiAnalyticsConstant.KeyAndValue.NUMBER_01);
            if ((e(pxk.b(this.o)) && pxk.b(this.m)) || pxk.c(this.m)) {
                this.ac.add("04");
            }
        }
        ArrayList<String> arrayList2 = this.ac;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.z = this.ac.get(0);
        }
        l();
    }

    private void l() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.esim_open_method_title_bar);
        this.af = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        this.s = (RelativeLayout) findViewById(R.id.ll_error_tips);
        this.ah = (HealthTextView) findViewById(R.id.textview_tips);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_set_net_layout);
        this.ab = linearLayout;
        linearLayout.setOnClickListener(this);
        this.p = (HealthTextView) findViewById(R.id.tv_error_tips);
        this.q = (HealthButton) findViewById(R.id.btn_esim_continue);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.opem_method_waiting_content);
        this.ag = relativeLayout;
        relativeLayout.setVisibility(8);
        this.v = (ImageView) findViewById(R.id.iv_error_arrow);
        this.u = (HealthTextView) findViewById(R.id.tv_error_go_setting);
        this.ai = (ImageView) findViewById(R.id.tv_set_content_icon);
        this.q.setOnClickListener(this);
        this.t = pxk.a((Activity) this);
        if (qqs.e(this.o)) {
            this.s.setBackgroundResource(R.drawable.bg_error_layout_dark_mode_background);
            this.u.setTextColor(ContextCompat.getColor(this.o, R.color.IDS_plugin_sim_dark_mode_text_color));
        } else {
            this.s.setBackgroundResource(R.drawable.bg_error_layout_background);
            this.u.setTextColor(ContextCompat.getColor(this.o, R.color.textColorSecondary));
        }
        this.u.setOnClickListener(this);
        this.v.setOnClickListener(this);
        EsimOpenMethodAdapter esimOpenMethodAdapter = new EsimOpenMethodAdapter(this.o, this.ac, this.x);
        this.r = esimOpenMethodAdapter;
        esimOpenMethodAdapter.c(this.y);
        this.r.d(this.m);
        ((ListView) findViewById(R.id.esim_open_method_listview)).setAdapter((ListAdapter) this.r);
        if (Utils.o()) {
            this.ah.setVisibility(8);
            return;
        }
        if (TextUtils.isEmpty(this.ad)) {
            this.ah.setText(this.o.getString(R.string.IDS_plugin_multi_esim_business_tips));
            return;
        }
        this.ah.setVisibility(0);
        this.ah.setText(String.format(Locale.getDefault(), this.o.getString(R.string.IDS_plugin_multi_esim_business_hall_tips), this.ad, pxk.a(this.o, this.ad)));
    }

    private boolean e(List<Map<String, Object>> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("EsimOpenMethodActivity", "sim cards is none");
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> arrayListA = pxk.a(pxh.a(list.get(i)));
            for (int i2 = 0; i2 < arrayListA.size(); i2++) {
                String str = arrayListA.get(i2);
                if (!TextUtils.isEmpty(str) && !str.equals(HiAnalyticsConstant.KeyAndValue.NUMBER_01)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.btn_esim_continue) {
            if (this.m == 2) {
                i();
                return;
            } else {
                h();
                return;
            }
        }
        if (view.getId() == R.id.ll_set_net_layout) {
            pxk.b((Activity) this.o, 10001);
            return;
        }
        if (view.getId() == R.id.iv_error_arrow) {
            if (!pxl.b(this.o)) {
                pxk.b((Activity) this.o, 10001);
                return;
            } else if (!n() || !o()) {
                pxk.a((Activity) this.o, 10001);
                return;
            } else {
                LogUtil.a("EsimOpenMethodActivity", "else branch");
                return;
            }
        }
        if (view.getId() == R.id.tv_error_go_setting) {
            pxk.a((Activity) this.o, 10001);
        } else {
            LogUtil.d("EsimOpenMethodActivity", "onClick else branch");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    private void f() {
        byte b2;
        if (TextUtils.isEmpty(this.x)) {
            LogUtil.j("EsimOpenMethodActivity", "choiceContentProvider mImsi is null");
            return;
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), "share_preference_esim_accode", "imsi", nio.e(this.x), null);
        pxk.e(this.z, true);
        String str = this.z;
        str.hashCode();
        switch (str) {
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
            if (pxk.a(this.x)) {
                Context context = this.o;
                qpx.e(context, context.getResources().getString(R.string.IDS_competition_not_support));
                return;
            } else {
                a(this.x, this.m);
                return;
            }
        }
        if (b2 == 2) {
            c(this.z, this.x, false);
            return;
        }
        if (b2 == 3) {
            y();
            return;
        }
        if (b2 == 4) {
            LogUtil.a("EsimOpenMethodActivity", "choiceContentProvider H5 branch");
            this.s.setVisibility(0);
            this.p.setText(this.o.getResources().getString(R.string.IDS_open_method_no_support_tips));
        } else if (b2 == 5) {
            e();
            LogUtil.a("EsimOpenMethodActivity", "choiceContentProvider download branch");
        } else {
            LogUtil.j("EsimOpenMethodActivity", "choiceContentProvider else branch");
            xjt.q("choiceContentProvider else branch");
            this.s.setVisibility(0);
            this.p.setText(this.o.getResources().getString(R.string.IDS_open_method_no_support_tips));
        }
    }

    private void y() {
        LogUtil.a("EsimOpenMethodActivity", "choiceContentProvider TS.43 ESs branch");
        if (pxl.d(this.h, this.f22978a)) {
            this.s.setVisibility(0);
            this.p.setText(this.o.getResources().getString(R.string.IDS_open_method_auth_fail));
            this.q.setEnabled(false);
            this.q.setBackgroundResource(R.drawable.bg_button_pressed);
            return;
        }
        if (!pxk.h(this.x)) {
            c(this.z, this.x, false);
        } else {
            k();
        }
    }

    private void w() {
        pxn.e().a(CarrierType.CUCC, EsimType.ONE_NUMBER_MULTISIM, CommonUtil.bg() ? BrandType.HUAWEI : BrandType.THIRD);
        EsimCarrierStrategy esimCarrierStrategyB = pxn.e().b(this.o, this.f22979b);
        pxp pxpVar = new pxp();
        pxpVar.i = this.i;
        pxpVar.h = this.x;
        pxpVar.m = new Runnable() { // from class: pwu
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b();
            }
        };
        esimCarrierStrategyB.setRequest(pxpVar);
        esimCarrierStrategyB.authenticate();
    }

    public /* synthetic */ void b() {
        a(true);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        boolean zI = npz.b().i();
        LogUtil.a("EsimOpenMethodActivity", "onResume isOperatorOpenSuccess = ", Boolean.valueOf(zI));
        if (zI) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (z) {
            this.ag.setVisibility(0);
            this.r.c(null);
            this.q.setEnabled(false);
            this.q.setBackgroundResource(R.drawable.bg_button_pressed);
            return;
        }
        this.ag.setVisibility(8);
        this.r.c(this.y);
        this.q.setEnabled(true);
        this.q.setBackgroundResource(R.drawable.multi_esim_button_bg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        ReleaseLogUtil.d("DEVMGR_EsimOpenMethodActivity", "query esim result = " + i);
        t();
        if (i == 1000) {
            pxn.e().a().getEsimStatus();
            return;
        }
        if (i == 98) {
            a(false);
            this.t.setVisibility(8);
            Context context = this.o;
            qpx.e(context, context.getResources().getString(R.string.IDS_plugin_network_unstable));
            return;
        }
        a(false);
        this.t.setVisibility(8);
        Context context2 = this.o;
        qpx.e(context2, context2.getResources().getString(R.string.IDS_oversea_es_load_fail));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        ReleaseLogUtil.d("DEVMGR_EsimOpenMethodActivity", "query result message:", Integer.valueOf(message.arg1), "mCardType = ", Integer.valueOf(this.m));
        if (pxk.c(this.m)) {
            d(message);
        } else if (pxk.b(this.m)) {
            e(message);
        } else {
            ReleaseLogUtil.d("DEVMGR_EsimOpenMethodActivity", "mCardType is invalid.");
        }
    }

    private void e(Message message) {
        ReleaseLogUtil.d("DEVMGR_EsimOpenMethodActivity", "handleQueryResultMultiSim enter.");
        if (message.arg1 == 1200) {
            this.t.setVisibility(8);
            if (message.getData() != null) {
                this.k = message.getData().getString("ActivationCode");
            }
            LogUtil.a("EsimOpenMethodActivity", "acCode = ", this.k);
            p();
            return;
        }
        if (message.arg1 == -1011) {
            this.t.setVisibility(8);
            q();
        } else if (message.arg1 == 1000) {
            g();
        } else {
            qpx.e(this.o, getResources().getString(R.string.IDS_oversea_es_load_fail));
        }
    }

    private void d(Message message) {
        ReleaseLogUtil.d("DEVMGR_EsimOpenMethodActivity", "handleQueryResultStandaloneNum enter.");
        if (message.arg1 == 1200) {
            if (message.getData() != null) {
                this.k = message.getData().getString("ActivationCode");
            }
            LogUtil.a("EsimOpenMethodActivity", "handleQueryResultStandaloneNum acCode = ", this.k);
            pxk.a(this.o, this.k, this.m, this.x);
            this.t.setVisibility(8);
            return;
        }
        if (message.arg1 == -1011) {
            pxk.b(this.o, new View.OnClickListener() { // from class: pxb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ReleaseLogUtil.d("DEVMGR_EsimOpenMethodActivity", "press positive button.");
                }
            });
        } else if (message.arg1 == 1000) {
            g();
        } else {
            qpx.e(this.o, getResources().getString(R.string.IDS_oversea_es_load_fail));
            this.t.setVisibility(8);
        }
    }

    private void g() {
        if (pxk.h(this.x)) {
            pxn.e().a().activateEsim();
        } else {
            c(this.z, this.x, false);
        }
    }

    private void k() {
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.o).a(R.string.IDS_plugin_multi_sim_note).b(R.string.IDS_plugin_multi_esim_note_content).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: pwy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.j("EsimOpenMethodActivity", "press negative button");
            }
        }).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: pwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(view);
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public /* synthetic */ void c(View view) {
        w();
    }

    private void p() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.o);
        builder.b(R.string.IDS_opend_down_esim);
        builder.a(this.o.getString(R.string.IDS_go_down_esim), new View.OnClickListener() { // from class: pwt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        }).d(this.o.getString(R.string.IDS_plugin_multi_sim_open_fail_general_blue_link).toUpperCase(), new View.OnClickListener() { // from class: pws
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45918b.b(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.aa = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        if (this.aa.isShowing()) {
            return;
        }
        this.aa.show();
    }

    public /* synthetic */ void e(View view) {
        ReleaseLogUtil.d("DEVMGR_EsimOpenMethodActivity", "download");
        j();
        pxi.b("enabled_entry", pxi.d(this.o, this.x), pxi.c(this.z), pxi.d(this.m));
        pxk.a(this.o, this.k, this.m, this.x);
    }

    public /* synthetic */ void b(View view) {
        LogUtil.a("EsimOpenMethodActivity", " learn more");
        j();
        try {
            Intent intent = new Intent(this.o, (Class<?>) EsimAccountManageActivity.class);
            intent.putExtra("esim_auth_method", this.f22978a);
            intent.putExtra("simImsi", this.x);
            intent.putExtra("MultiSimSlotId", this.i);
            this.o.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("EsimOpenMethodActivity", "startEsimAccountManageActivity ActivityNotFoundException");
        }
    }

    private void q() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.o);
        builder.b(R.string.ids_oversea_es_query_opened);
        builder.a(this.o.getString(R.string.IDS_plugin_sim_esim_logout_ok), new View.OnClickListener() { // from class: pwz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45921c.g(view);
            }
        }).a(R.string.IDS_plugin_multi_sim_known, new View.OnClickListener() { // from class: pxa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.i(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.aa = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        if (this.aa.isShowing()) {
            return;
        }
        this.aa.show();
    }

    public /* synthetic */ void g(View view) {
        j();
        pxn.e().a().deactivateEsim();
    }

    public /* synthetic */ void i(View view) {
        j();
    }

    private void j() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.aa;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.aa = null;
        }
    }

    static class a extends Handler {
        private WeakReference<EsimOpenMethodActivity> d;

        a(EsimOpenMethodActivity esimOpenMethodActivity) {
            this.d = new WeakReference<>(esimOpenMethodActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("EsimOpenMethodActivity", "EsimOpenMethodHandler handleMessageWhenReferenceNotNull msg is null");
                return;
            }
            super.handleMessage(message);
            WeakReference<EsimOpenMethodActivity> weakReference = this.d;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.a("EsimOpenMethodActivity", "mWeakActivity is null");
                return;
            }
            EsimOpenMethodActivity esimOpenMethodActivity = this.d.get();
            ReleaseLogUtil.d("DEVMGR_EsimOpenMethodActivity", "mActivity :", esimOpenMethodActivity, "message ", message);
            int i = message.what;
            if (i == 10001) {
                esimOpenMethodActivity.m();
                return;
            }
            if (i == 100005) {
                esimOpenMethodActivity.t();
                esimOpenMethodActivity.t.setVisibility(8);
                qpx.e(esimOpenMethodActivity, esimOpenMethodActivity.getResources().getString(R.string.IDS_oversea_es_load_fail));
                return;
            }
            if (i != 100007) {
                switch (i) {
                    case 100001:
                        esimOpenMethodActivity.t();
                        esimOpenMethodActivity.a(false);
                        esimOpenMethodActivity.a(message.arg1);
                        break;
                    case ErrorCode.HWID_IS_STOPED /* 100002 */:
                        esimOpenMethodActivity.t();
                        esimOpenMethodActivity.a(false);
                        esimOpenMethodActivity.b(message);
                        break;
                    case 100003:
                        esimOpenMethodActivity.t();
                        esimOpenMethodActivity.s();
                        esimOpenMethodActivity.a(false);
                        esimOpenMethodActivity.t.setVisibility(8);
                        qpx.e(esimOpenMethodActivity, esimOpenMethodActivity.getResources().getString(R.string.IDS_oversea_es_load_fail));
                        break;
                    default:
                        LogUtil.j("EsimOpenMethodActivity", "handleMessageWhenReferenceNotNull default");
                        break;
                }
                return;
            }
            esimOpenMethodActivity.t();
            esimOpenMethodActivity.a(false);
            esimOpenMethodActivity.c(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        LogUtil.a("EsimOpenMethodActivity", "handleOpenResult: ", Integer.valueOf(message.arg1));
        t();
        if (message.arg1 != 0) {
            this.t.setVisibility(8);
            qpx.e(this.o, getResources().getString(R.string.IDS_oversea_es_load_fail));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a("EsimOpenMethodActivity", "Enter onActivityResult(): requestCode= ", Integer.valueOf(i), " resultCode=", Integer.valueOf(i2));
        if (i2 == 1 && intent != null) {
            this.t.setVisibility(8);
            String stringExtra = intent.getStringExtra("ActivationCode");
            this.k = stringExtra;
            LogUtil.a("EsimOpenMethodActivity", "onActivityResult esimActivatedAccode = ", stringExtra);
            pxi.b("unabled_entry", pxi.d(this.o, this.x), pxi.c(this.z), pxi.d(this.m));
            pxk.a(this.o, this.k, this.m, this.x);
        } else if (i == 1099) {
            a(false);
            if (intent != null && intent.getBooleanExtra("cuccAgreementAgree", false)) {
                EsimCarrierStrategy esimCarrierStrategyA = pxn.e().a();
                if (esimCarrierStrategyA instanceof pxy) {
                    this.t.setVisibility(0);
                    this.t.bringToFront();
                    ((pxy) esimCarrierStrategyA).a(i, intent);
                }
            }
        } else if (i == 10001) {
            m();
        } else {
            this.t.setVisibility(8);
            Context context = this.o;
            qpx.e(context, context.getString(R.string.IDS_oversea_es_query_fail));
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        LogUtil.a("EsimOpenMethodActivity", "removeAuthQueryMessage");
        if (this.f22979b == null) {
            LogUtil.j("EsimOpenMethodActivity", "mHandler is null");
            return;
        }
        this.f22979b.removeMessages(100001);
        this.f22979b.removeMessages(ErrorCode.HWID_IS_STOPED);
        this.f22979b.removeMessages(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        LogUtil.a("EsimOpenMethodActivity", "removeTimeOutMessage");
        if (this.f22979b == null) {
            LogUtil.j("EsimOpenMethodActivity", "mHandler is null.");
        } else {
            this.f22979b.removeMessages(100003);
            this.f22979b.removeMessages(AdapterWithBottomView.TYPE_BOTTOM);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (!pxl.b(this.o)) {
            this.r.c(null);
            this.q.setEnabled(false);
            this.q.setBackgroundResource(R.drawable.bg_button_pressed);
            this.s.setVisibility(0);
            this.p.setText(this.o.getResources().getString(R.string.IDS_plugin_esim_no_network));
            this.v.setVisibility(8);
            this.u.setVisibility(8);
            this.ab.setVisibility(0);
        } else if (!pxl.c() || !pxl.a(this.o)) {
            this.r.c(null);
            this.q.setEnabled(false);
            this.q.setBackgroundResource(R.drawable.bg_button_pressed);
            this.s.setVisibility(0);
            this.p.setText(this.o.getResources().getString(R.string.IDS_plugin_bt_fail));
            this.ab.setVisibility(8);
            this.v.setVisibility(8);
            this.u.setVisibility(8);
        } else if (!n()) {
            this.r.c(null);
            this.q.setEnabled(false);
            this.q.setBackgroundResource(R.drawable.bg_button_pressed);
            this.s.setVisibility(0);
            this.p.setText(this.o.getResources().getString(R.string.IDS_plugin_multi_esim_no_permisson_new));
            this.ab.setVisibility(8);
            this.v.setVisibility(0);
            this.u.setVisibility(0);
        } else if (!o() && pxk.c(this.m)) {
            this.r.c(null);
            this.q.setEnabled(false);
            this.q.setBackgroundResource(R.drawable.bg_button_pressed);
            this.s.setVisibility(0);
            this.p.setText(this.o.getResources().getString(R.string.IDS_hw_permission_guide_camera));
            this.ab.setVisibility(8);
            this.v.setVisibility(0);
            this.u.setVisibility(0);
        } else {
            this.r.c(this.y);
            this.q.setEnabled(true);
            this.q.setBackgroundResource(R.drawable.multi_esim_button_bg);
            this.s.setVisibility(8);
            this.ab.setVisibility(8);
            this.v.setVisibility(8);
            this.u.setVisibility(8);
        }
        this.t.setVisibility(8);
    }

    private void h() {
        if (pxk.a()) {
            if (this.z.equals(HiAnalyticsConstant.KeyAndValue.NUMBER_01)) {
                pxi.e("activate_button", pxi.c(this.z));
                a();
                return;
            }
            LogUtil.a("EsimOpenMethodActivity", "choiceOneNumCardType: new device MultiSimCardActivity");
            Intent intent = new Intent(this.o, (Class<?>) MultiSimCardActivity.class);
            intent.putExtra("BatteryThreshold", this.l);
            intent.putExtra("esim_card_type_key", this.m);
            intent.putExtra("multi_sim_device_info", this.w);
            intent.putExtra("openMethod", this.z);
            startActivity(intent);
            return;
        }
        LogUtil.a("EsimOpenMethodActivity", "choiceOneNumCardType: old device choiceMultiSimNumCartType");
        pxi.e("activate_button", pxi.c(this.z));
        f();
    }

    private void i() {
        if (this.z.equals(HiAnalyticsConstant.KeyAndValue.NUMBER_01)) {
            pxi.e("activate_button", pxi.c(this.z));
            e(this.w);
            return;
        }
        if (this.z.equals("07")) {
            pxi.e("activate_button", pxi.c(this.z));
            a(this.x, this.m);
            LogUtil.a("EsimOpenMethodActivity", "choiceStandaloneNumCardType ESIM_OPEN_METHOD_STANDALONE_NUM_HAND_HALL");
        } else {
            if (this.z.equals("04")) {
                u();
                return;
            }
            LogUtil.j("EsimOpenMethodActivity", "choiceStandaloneNumCardType else branch");
            xjt.q("choiceStandaloneNumCardType else branch");
            this.s.setVisibility(0);
            this.p.setText(this.o.getResources().getString(R.string.IDS_open_method_no_support_tips));
        }
    }

    private boolean n() {
        return lsg.d(this.o, pxk.d());
    }

    private boolean o() {
        return lsg.d(this.o, n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (!o()) {
            LogUtil.j("EsimOpenMethodActivity", "no camera permission, need to request");
            lsg.a(this, new String[]{"android.permission.CAMERA"}, new PermissionsResultAction() { // from class: com.huawei.sim.multisim.activity.EsimOpenMethodActivity.2
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("EsimOpenMethodActivity", "standaloneQuestCameraPermission onGranted");
                    EsimOpenMethodActivity.this.v();
                }

                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    LogUtil.a("EsimOpenMethodActivity", "standaloneQuestCameraPermission onDenied");
                    EsimOpenMethodActivity.this.m();
                }

                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                    LogUtil.a("EsimOpenMethodActivity", "standaloneQuestCameraPermission onForeverDenied");
                    EsimOpenMethodActivity.this.m();
                }
            });
        } else {
            LogUtil.a("EsimOpenMethodActivity", "enter else have Permissions ");
            v();
        }
    }

    private void u() {
        if (!n()) {
            LogUtil.j("EsimOpenMethodActivity", "no phone permission, need to request");
            lsg.a(this, pxk.d(), new PermissionsResultAction() { // from class: com.huawei.sim.multisim.activity.EsimOpenMethodActivity.4
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("EsimOpenMethodActivity", "standaloneQuestPhonePermission onGranted");
                    EsimOpenMethodActivity.this.x();
                }

                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    LogUtil.a("EsimOpenMethodActivity", "standaloneQuestPhonePermission onDenied");
                    EsimOpenMethodActivity.this.m();
                }

                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                    LogUtil.a("EsimOpenMethodActivity", "standaloneQuestPhonePermission onForeverDenied");
                    EsimOpenMethodActivity.this.m();
                }
            });
        } else {
            LogUtil.a("EsimOpenMethodActivity", "enter else have Permissions");
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (pxk.a()) {
            LogUtil.a("EsimOpenMethodActivity", "choiceOneNumCardType: new device MultiSimCardActivity");
            Intent intent = new Intent(this.o, (Class<?>) MultiSimCardActivity.class);
            intent.putExtra("BatteryThreshold", this.l);
            intent.putExtra("esim_card_type_key", this.m);
            intent.putExtra("multi_sim_device_info", this.w);
            intent.putExtra("openMethod", this.z);
            startActivity(intent);
            return;
        }
        pxi.e("activate_button", pxi.c(this.z));
        r();
    }

    private void r() {
        List<Map<String, Object>> listB = pxk.b(this.o);
        if (listB == null || listB.isEmpty()) {
            ReleaseLogUtil.e("DEVMGR_EsimOpenMethodActivity", "sim cards is none");
            Context context = this.o;
            qpx.e(context, context.getResources().getString(R.string.IDS_plugin_multi_esim_error_no_sim));
        } else {
            Map<String, Object> mapA = pxk.a(this.o, listB);
            this.x = (String) mapA.get("imsi");
            a(mapA);
            w();
        }
    }

    @Override // com.huawei.sim.esim.view.BaseOpenSimCardActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d();
        if (this.f22979b != null) {
            this.f22979b.removeCallbacksAndMessages(null);
        }
    }

    public void d() {
        LogUtil.a("EsimOpenMethodActivity", "finishSdk");
    }

    @Override // com.huawei.sim.esim.view.BaseOpenSimCardActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
