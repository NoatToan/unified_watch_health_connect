package com.huawei.sim.esim.view;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.multisimservice.model.MultiSimDeviceInfo;
import com.huawei.multisimservice.model.SimInfo;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.profile.profile.ProfileExtendConstants;
import com.huawei.sim.R;
import com.huawei.sim.esim.qrcode.QrCodeActivity;
import com.huawei.sim.multisim.MultiSimWebView;
import com.huawei.sim.multisim.activity.EsimOpenMethodActivity;
import com.huawei.sim.multisim.activity.EsimSelectCardActivity;
import com.huawei.sim.multisim.adapter.EsimFaqAdapter;
import com.huawei.sim.multisim.constants.BrandType;
import com.huawei.sim.multisim.constants.CarrierType;
import com.huawei.sim.multisim.constants.EsimType;
import com.huawei.sim.strategy.EsimCarrierStrategy;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listviewforscroll.ListViewForScroll;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.main.stories.me.adapter.AdapterWithBottomView;
import com.huawei.up.utils.ErrorCode;
import defpackage.cpl;
import defpackage.ecu;
import defpackage.eey;
import defpackage.lsg;
import defpackage.mgg;
import defpackage.njy;
import defpackage.npz;
import defpackage.obk;
import defpackage.obp;
import defpackage.obq;
import defpackage.ocg;
import defpackage.ocr;
import defpackage.pvh;
import defpackage.pwp;
import defpackage.pxd;
import defpackage.pxg;
import defpackage.pxh;
import defpackage.pxi;
import defpackage.pxj;
import defpackage.pxk;
import defpackage.pxl;
import defpackage.pxn;
import defpackage.pxp;
import defpackage.pxy;
import defpackage.qpx;
import defpackage.qqs;
import defpackage.qqv;
import defpackage.qre;
import defpackage.qrs;
import defpackage.xjt;
import health.compact.a.Base64;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class EsimManagerActivity extends BaseOpenSimCardActivity implements View.OnClickListener {
    private LinearLayout aa;
    private RelativeLayout ab;
    private EsimFaqAdapter ac;
    private LinearLayout ad;
    private ListViewForScroll ae;
    private int af;
    private ImageView ag;
    private int ai;
    private RelativeLayout aj;
    private HealthTextView ak;
    private ImageView al;
    private ocr am;
    private CommonDialog21 ao;
    private MultiSimDeviceInfo ap;
    private pwp aq;
    private View ar;
    private HealthButton at;
    private LinearLayout aw;
    private HealthButton ax;
    private HealthButton ay;
    private LinearLayout az;
    private String ba;
    private HealthButton bb;
    private HealthButton bc;
    private HealthTextView bd;
    private String be;
    private CustomTitleBar bf;
    private HealthTextView bg;
    private RelativeLayout bi;
    private HealthTextView bl;
    private HealthTextView bm;
    private NoTitleCustomAlertDialog k;
    private HealthButton p;
    private int q;
    private LinearLayout r;
    private LinearLayout s;
    private NoTitleCustomAlertDialog u;
    private ImageView v;
    private HealthTextView w;
    private Context x;
    private RelativeLayout y;
    private HealthTextView z;
    private String ah = "";
    private int t = 30;
    private boolean an = false;
    private boolean as = false;
    private int bh = 2;
    private int bj = 0;
    private boolean o = false;
    private boolean m = false;
    private boolean l = false;
    private int av = 1;
    private int n = 0;
    private Map<String, Object> bk = new HashMap();
    private Map<String, Object> bq = new HashMap();
    private EsimFaqAdapter.OnItemClickListener au = new EsimFaqAdapter.OnItemClickListener() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.1
        @Override // com.huawei.sim.multisim.adapter.EsimFaqAdapter.OnItemClickListener
        public void onClick(String str, String str2) {
            LogUtil.a("EsimManagerActivity", "mOnItemClickListener url = ", str2, ",title = ", str);
            pxi.b("FAQs");
            EsimManagerActivity.this.c(str, str2);
        }
    };

    static /* synthetic */ int s(EsimManagerActivity esimManagerActivity) {
        int i = esimManagerActivity.af;
        esimManagerActivity.af = i + 1;
        return i;
    }

    @Override // com.huawei.sim.esim.view.BaseOpenSimCardActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        MultiSimDeviceInfo multiSimDeviceInfo;
        List<SimInfo> simInfoList;
        super.onCreate(bundle);
        setContentView(R.layout.activity_esim_manager);
        Intent intent = getIntent();
        if (intent != null) {
            this.q = intent.getIntExtra("esim_card_type_key", 1);
            this.as = intent.getBooleanExtra("esim_is_open", false);
            this.ap = (MultiSimDeviceInfo) intent.getParcelableExtra("esiim_multi_sim_deviceinfo");
        }
        this.x = this;
        this.be = pxk.a((Context) this);
        this.f22979b = new a(this);
        ReleaseLogUtil.d("DEVMGR_EsimManagerActivity", "onCreate() mCardType = ", Integer.valueOf(this.q));
        this.l = true;
        npz.b().d(false);
        pxk.o(this.x);
        y();
        pvh.b(this).b(true);
        m();
        pxk.m(this.x);
        if (this.as && (multiSimDeviceInfo = this.ap) != null && !TextUtils.isEmpty(multiSimDeviceInfo.getEID()) && (simInfoList = this.ap.getSimInfoList()) != null && simInfoList.size() == 1) {
            ReleaseLogUtil.d("DEVMGR_EsimManagerActivity", "esim is already open");
            c(simInfoList.get(0));
            if (!Utils.o() && !e(simInfoList.get(0).getIMSI()) && !b(simInfoList.get(0).getIMSI())) {
                ah();
                return;
            }
        }
        if (pxk.b(this.q)) {
            pxk.d = "ShareNumber";
            an();
        } else if (pxk.c(this.q)) {
            pxk.d = "DiffNumber";
            l();
        } else {
            ReleaseLogUtil.a("DEVMGR_EsimManagerActivity", "unsupported esim card type:", Integer.valueOf(this.q));
        }
    }

    private boolean e(String str) {
        boolean z = pxk.h(str) && pxk.b(this.q);
        LogUtil.a("EsimManagerActivity", " isCuccMultiSim: ", Boolean.valueOf(z));
        return z;
    }

    private boolean b(String str) {
        boolean z = CommonUtil.bg() && pxk.d(str) && pxk.b(this.q);
        LogUtil.a("EsimManagerActivity", "isHuaweiCmcc: ", Boolean.valueOf(z));
        return z;
    }

    private boolean d(String str) {
        boolean z = !CommonUtil.bg() && pxk.h(str) && pxk.b(this.q);
        LogUtil.a("EsimManagerActivity", "isThirdCucc: ", Boolean.valueOf(z));
        return z;
    }

    private boolean c(String str) {
        boolean z = CommonUtil.bg() && pxk.h(str) && pxk.b(this.q);
        LogUtil.a("EsimManagerActivity", "isHuaweiCucc: ", Boolean.valueOf(z));
        return z;
    }

    private boolean a(String str) {
        return pxk.i(str) && pxk.b(this.q);
    }

    private void w() {
        LogUtil.a("EsimManagerActivity", "initSdk");
        this.am = new ocr();
        this.am.a(this.x, this.aq, new String(Base64.b("MENBM0RBMzQ5QUExQ0I2OA=="), StandardCharsets.UTF_8), new String(Base64.b("MDZFMUJDMjgwRDFDQ0RCMTFCQjczNEZGREU3QUIyNkYwMzc0QkZFNTY2NUU2MkU4MjZDQzA1N0MwN0IyN0Q2OA=="), StandardCharsets.UTF_8));
    }

    private void b(Map<String, Object> map) {
        d(map);
        ao();
        String strC = pxk.c(map);
        int iD = pxk.d(map);
        this.n = iD;
        int i = this.bh;
        LogUtil.a("EsimManagerActivity", "setAuthParam mTempAuthMethod = ", Integer.valueOf(i), "mSlotId = ", Integer.valueOf(iD), "eIm = ", cpl.e(this.ah), "im : ", cpl.e(strC));
        pwp pwpVar = new pwp(this.bh);
        this.aq = pwpVar;
        pwpVar.setImsi(strC);
        this.aq.setSlotId(this.n);
    }

    private boolean u() {
        return pxk.e(this.x).size() == 2;
    }

    private void m() {
        List<Map<String, Object>> listE = pxk.e(this.x);
        if (listE.isEmpty()) {
            LogUtil.a("EsimManagerActivity", "accountManageSimCard is empty.");
            return;
        }
        this.bk = listE.get(0);
        if (u()) {
            this.bq = listE.get(1);
        }
    }

    private void d(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            LogUtil.a("EsimManagerActivity", "simCardInfo is empty");
        } else if (pxk.c(map).contains(this.ah) || !Utils.o()) {
            a(map);
        }
    }

    private void ao() {
        if (this.f22978a == 5) {
            if (CommonUtil.bg() || pxk.g()) {
                return;
            }
            this.bh = 4;
            return;
        }
        if (pxk.d(this.j)) {
            this.bh = 3;
        } else {
            this.bh = this.f22978a;
        }
    }

    private void an() {
        String[] strArrD = pxk.d();
        if (!lsg.d(this.x, strArrD)) {
            LogUtil.j("EsimManagerActivity", "no permission, need to request");
            xjt.q("no permission, need to request.");
            lsg.a(this, strArrD, new PermissionsResultAction() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.12
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("EsimManagerActivity", "PermissionsResultAction onGranted");
                    EsimManagerActivity.this.l();
                }

                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    LogUtil.a("EsimManagerActivity", "PermissionsResultAction onDenied");
                    EsimManagerActivity.this.l();
                }
            });
        } else {
            LogUtil.a("EsimManagerActivity", "enter else have Permissions ");
            l();
        }
    }

    private void y() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.sim_manager_title_bar);
        this.bf = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        this.ab = (RelativeLayout) findViewById(R.id.rl_esim_error_info);
        this.z = (HealthTextView) findViewById(R.id.tv_esim_error_info);
        this.s = (LinearLayout) findViewById(R.id.managerContent);
        this.aj = (RelativeLayout) findViewById(R.id.rel_icon_parent);
        this.bi = (RelativeLayout) findViewById(R.id.multi_sim_waiting_content);
        this.ad = pxk.a((Activity) this);
        this.r = (LinearLayout) findViewById(R.id.btn_layout);
        this.aa = (LinearLayout) findViewById(R.id.esim_faq_layout);
        this.ag = (ImageView) findViewById(R.id.img_esim_open_icon);
        this.bd = (HealthTextView) findViewById(R.id.tv_esim_open_status);
        this.bg = (HealthTextView) findViewById(R.id.tv_esim_open_tips);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.tv_esim_user_guide);
        this.bl = healthTextView;
        healthTextView.setText(pxk.c(this.x.getString(R.string.IDS_esim_usage_guide)));
        this.bl.setOnClickListener(this);
        this.bl.setVisibility(8);
        this.aa.setVisibility(8);
        this.ax = (HealthButton) findViewById(R.id.btn_esim_enable);
        this.at = (HealthButton) findViewById(R.id.btn_esim_enable_now);
        this.ax.setOnClickListener(this);
        this.at.setOnClickListener(this);
        this.ax.setVisibility(8);
        this.at.setVisibility(8);
        this.p = (HealthButton) findViewById(R.id.btn_esim_account_manage);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.multi_sim_waiting_info);
        this.bm = healthTextView2;
        healthTextView2.setVisibility(4);
        this.bb = (HealthButton) findViewById(R.id.btn_esim_retry);
        this.aw = (LinearLayout) findViewById(R.id.open_failed_button_layout);
        this.bc = (HealthButton) findViewById(R.id.btn_esim_reactivate);
        this.bb.setOnClickListener(this);
        this.bc.setOnClickListener(this);
        this.bi.setVisibility(0);
        this.bi.bringToFront();
        this.ae = (ListViewForScroll) findViewById(R.id.esim_faq_listview);
        this.y = (RelativeLayout) findViewById(R.id.download_fail_layout);
        this.v = (ImageView) findViewById(R.id.download_fail_image);
        this.w = (HealthTextView) findViewById(R.id.download_fail_text);
        this.az = (LinearLayout) findViewById(R.id.setting_layout);
        HealthButton healthButton = (HealthButton) findViewById(R.id.setting_btn);
        this.ay = healthButton;
        healthButton.setOnClickListener(this);
        this.al = (ImageView) findViewById(R.id.iv_arrow);
        this.ak = (HealthTextView) findViewById(R.id.tv_go_setting);
        al();
        this.al.setOnClickListener(this);
        this.ak.setOnClickListener(this);
        HealthSubHeader healthSubHeader = (HealthSubHeader) findViewById(R.id.esim_faq_subheader_title);
        healthSubHeader.setSplitterVisibility(4);
        healthSubHeader.setSubHeaderBackgroundColor(this.x.getResources().getColor(R.color.colorSubBackground));
    }

    private void al() {
        if (qqs.e(this.x)) {
            this.ab.setBackground(getResources().getDrawable(R.drawable.bg_error_layout_dark_mode_background));
            this.ak.setTextColor(this.x.getResources().getColor(R.color.IDS_plugin_sim_dark_mode_text_color));
        } else {
            this.ab.setBackground(getResources().getDrawable(R.drawable.bg_error_layout_background));
            this.ak.setTextColor(this.x.getResources().getColor(R.color.textColorSecondary));
        }
    }

    private void ad() {
        ThreadPoolManager.c().a("EsimManagerActivity", new Runnable() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.20
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                LogUtil.a("EsimManagerActivity", "parse sim info xml file start");
                new pxd().a(new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.20.5
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) throws Throwable {
                        if (i == 0 && (obj instanceof List)) {
                            pxh.a((List<pxj>) obj);
                        }
                        EsimManagerActivity.this.ak();
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ak() throws Throwable {
        LogUtil.a("EsimManagerActivity", "parse esim open method xml file start");
        new pxg().e(new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.16
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0 && (obj instanceof List)) {
                    pxh.e((List) obj);
                }
                EsimManagerActivity.this.f22979b.sendMessage(EsimManagerActivity.this.f22979b.obtainMessage(10004));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        int iC = pxl.c(this.x);
        this.ai = iC;
        if (iC == 0 || x()) {
            af();
        } else {
            ah();
        }
    }

    private boolean x() {
        if (this.q != 2) {
            return false;
        }
        int i = this.ai;
        return i == 4 || i == 13 || i == 14 || i == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void af() {
        npz.b().e(new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.19
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("DEVMGR_EsimManagerActivity", "getLocalDeviceInfo onResponse errorCode :", Integer.valueOf(i));
                pxk.a(i, false);
                if (i == 1 && EsimManagerActivity.this.af < 5) {
                    EsimManagerActivity.s(EsimManagerActivity.this);
                    LogUtil.j("EsimManagerActivity", "power down, retry ");
                    EsimManagerActivity.this.f22979b.sendEmptyMessageDelayed(10003, 1000L);
                } else {
                    if (i != 0 || !(obj instanceof MultiSimDeviceInfo)) {
                        EsimManagerActivity.this.ai = 7;
                        LogUtil.j("EsimManagerActivity", "refreshDeviceStatus() mEsimStatus :", Integer.valueOf(EsimManagerActivity.this.ai));
                        xjt.q("getMultiSimDevicInfo fail errorCode." + i);
                        EsimManagerActivity.this.t();
                        return;
                    }
                    EsimManagerActivity.this.ap = (MultiSimDeviceInfo) obj;
                    LogUtil.a("EsimManagerActivity", "getLocalDeviceInfo mMultiSimDeviceInfo :", EsimManagerActivity.this.ap);
                    EsimManagerActivity.this.ab();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        MultiSimDeviceInfo multiSimDeviceInfo = this.ap;
        if (multiSimDeviceInfo != null && !TextUtils.isEmpty(multiSimDeviceInfo.getEID())) {
            List<SimInfo> simInfoList = this.ap.getSimInfoList();
            if (simInfoList == null || simInfoList.isEmpty()) {
                npz.b().c(this.ap);
                a(false);
                return;
            } else if (simInfoList.size() == 1) {
                npz.b().c(this.ap);
                c(simInfoList.get(0));
            } else {
                this.ai = 8;
                LogUtil.j("EsimManagerActivity", "There are multiple profile files");
                xjt.q("There are multiple profile files");
            }
        } else {
            int i = this.af;
            if (i < 5) {
                this.af = i + 1;
                LogUtil.a("EsimManagerActivity", "retry refreshDeviceStatus");
                this.f22979b.sendEmptyMessageDelayed(10003, 1000L);
                return;
            } else {
                this.ai = 7;
                LogUtil.j("EsimManagerActivity", "processDeviceInfo() mEsimStatus :", 7);
                xjt.q("getMultiSimDevicInfo fail");
            }
        }
        t();
    }

    private void e(Map<String, Object> map) {
        b(map);
        w();
        if ((pxk.d(this.ah) && !pxk.d(this.j)) || ((pxk.h(this.ah) && !pxk.h(this.j)) || (a(this.ah) && !a(this.j)))) {
            qpx.e(this.x, R.string.IDS_esim_lose_efficacy);
            return;
        }
        runOnUiThread(new Runnable() { // from class: pvi
            @Override // java.lang.Runnable
            public final void run() {
                this.f45901c.g();
            }
        });
        this.p.setEnabled(false);
        LogUtil.a("EsimManagerActivity", "startAuth");
        this.f22979b.sendEmptyMessageDelayed(100003, 10000L);
        this.am.d(this.x, this.aq, pxk.a(this.j, this.be), pxk.e(this.ap), this.f22979b.obtainMessage(100001));
    }

    public /* synthetic */ void g() {
        this.bi.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final boolean z) {
        npz.b().d(new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.21
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("DEVMGR_EsimManagerActivity", "getMultiSimBatteryThreshold onResponse errorCode :", Integer.valueOf(i));
                if (i == 0) {
                    if (!z) {
                        EsimManagerActivity.this.ai = 9;
                    } else {
                        EsimManagerActivity.this.f22979b.sendMessage(EsimManagerActivity.this.f22979b.obtainMessage(10008));
                        return;
                    }
                } else if (i == 129001) {
                    EsimManagerActivity.this.ai = 10;
                } else if (i == 129002) {
                    EsimManagerActivity.this.ai = 12;
                } else {
                    EsimManagerActivity.this.ai = 11;
                }
                if (obj instanceof Integer) {
                    int iIntValue = ((Integer) obj).intValue();
                    if (iIntValue <= 0 || iIntValue > 100) {
                        EsimManagerActivity.this.ai = 11;
                    } else {
                        EsimManagerActivity.this.t = iIntValue;
                    }
                } else {
                    LogUtil.j("EsimManagerActivity", "getMultiSimBatteryThreshold onResponse objectData is not Integer");
                }
                LogUtil.j("EsimManagerActivity", "refreshBatteryStatus() mEsimStatus :", Integer.valueOf(EsimManagerActivity.this.ai), ", mBatteryThreshold :", Integer.valueOf(EsimManagerActivity.this.t));
                if (!z) {
                    EsimManagerActivity.this.t();
                } else {
                    EsimManagerActivity.this.f22979b.sendMessage(EsimManagerActivity.this.f22979b.obtainMessage(10009));
                }
            }
        });
    }

    private void c(SimInfo simInfo) {
        String imsi = simInfo.getIMSI();
        this.ah = imsi;
        this.ba = pxk.c(this.x, imsi);
        this.ai = 100;
        runOnUiThread(new Runnable() { // from class: pvq
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d();
            }
        });
        ReleaseLogUtil.d("DEVMGR_EsimManagerActivity", "refreshHasBindStatus() mEsimStatus is:", Integer.valueOf(this.ai));
    }

    public /* synthetic */ void d() {
        this.bi.setVisibility(8);
        this.p.setEnabled(true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.tv_esim_user_guide) {
            c(this.x.getString(R.string.IDS_esim_usage_guide), pxk.c(this.x));
            return;
        }
        if (view.getId() == R.id.btn_esim_enable || view.getId() == R.id.btn_esim_reactivate || view.getId() == R.id.btn_esim_enable_now) {
            this.ar = view;
            this.ax.setEnabled(false);
            this.at.setEnabled(false);
            this.bi.setVisibility(0);
            int iC = pxl.c(this.x);
            this.ai = iC;
            if (iC == 0 || x()) {
                a(false);
                return;
            } else {
                ah();
                return;
            }
        }
        if (view.getId() == R.id.iv_arrow) {
            LogUtil.a("EsimManagerActivity", "enter onclick arrow mEsimStatus:", Integer.valueOf(this.ai));
            int i = this.ai;
            if (i == 2) {
                pxk.b((Activity) this.x, 10001);
                return;
            } else if (i == 3) {
                pxk.a((Activity) this.x, 10001);
                return;
            } else {
                LogUtil.a("EsimManagerActivity", "else branch");
                return;
            }
        }
        if (view.getId() == R.id.tv_go_setting) {
            LogUtil.a("EsimManagerActivity", "enter onclick stext mEsimStatus:", Integer.valueOf(this.ai));
            pxk.a((Activity) this.x, 10001);
            return;
        }
        if (view.getId() == R.id.setting_btn) {
            CommonUtil.t(this.x);
            return;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "share_preference_esim_accode", "KEY_ACCODE");
        LogUtil.a("EsimManagerActivity", "onClick acCode: ", strE);
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        this.bi.setVisibility(0);
        this.s.setVisibility(8);
        this.bm.setText(this.x.getResources().getString(R.string.IDS_plugin_download_fail));
        this.f22979b.sendEmptyMessageDelayed(10005, 120000L);
        g(strE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah() {
        ReleaseLogUtil.d("DEVMGR_EsimManagerActivity", "refreshViewStatus mEsimStatus :", Integer.valueOf(this.ai));
        if (this.ai == 0) {
            LogUtil.j("EsimManagerActivity", "Esim Status is default,so not refresh view");
            return;
        }
        this.bi.setVisibility(8);
        this.s.setVisibility(0);
        this.bm.setText(this.x.getResources().getString(R.string.IDS_plugin_multi_esim_loading));
        if (this.ai == 9 && this.ar != null) {
            this.ax.setEnabled(true);
            this.at.setEnabled(true);
            h(this.ar);
            return;
        }
        this.ab.setVisibility(0);
        this.ag.setVisibility(0);
        this.bd.setVisibility(0);
        this.bg.setVisibility(0);
        this.aw.setVisibility(8);
        int iB = qqv.b(this.x);
        ViewGroup.LayoutParams layoutParams = this.aj.getLayoutParams();
        layoutParams.height = iB / 3;
        this.aj.setLayoutParams(layoutParams);
        if (this.ai < 100) {
            ae();
        } else {
            z();
        }
        if (this.ai != 9 && this.ar != null) {
            qpx.e(this.x, this.z.getText().toString());
            this.ar = null;
        }
        if (this.l) {
            this.l = false;
            if (this.ai < 100) {
                pxi.d();
            } else {
                pxi.a();
            }
        }
    }

    private void h(View view) {
        if (view.getId() == R.id.btn_esim_enable || view.getId() == R.id.btn_esim_reactivate || view.getId() == R.id.btn_esim_enable_now) {
            pxi.a("activate");
            if (pxh.e()) {
                v();
            } else if (!Utils.o()) {
                aa();
            } else {
                PermissionUtil.d(this.x, PermissionUtil.PermissionType.CAMERA, new CustomPermissionAction(this.x) { // from class: com.huawei.sim.esim.view.EsimManagerActivity.24
                    @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                    public void onGranted() {
                        LogUtil.e("EsimManagerActivity", "qrCodeAction onGranted");
                        EsimManagerActivity.this.n();
                    }

                    @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                    public void onDenied(String str) {
                        LogUtil.e("EsimManagerActivity", "qrCodeAction onDenied");
                        EsimManagerActivity.this.n();
                    }

                    @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                    public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                        LogUtil.e("EsimManagerActivity", "qrCodeAction onForeverDenied");
                        EsimManagerActivity.this.n();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        pxk.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, true);
        try {
            pxi.e("activate_button", pxi.c(HiAnalyticsConstant.KeyAndValue.NUMBER_01));
            Intent intent = new Intent(this.x, (Class<?>) QrCodeActivity.class);
            intent.putExtra("esim_new_original_key", 1);
            this.x.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("EsimManagerActivity", "onGranted ActivityNotFoundException");
        }
    }

    private void v() {
        if (Utils.o() && this.q == 2) {
            pxi.e("activate_button", pxi.c(HiAnalyticsConstant.KeyAndValue.NUMBER_01));
            e(this.ap);
        } else {
            aa();
        }
    }

    private void ae() {
        this.r.setVisibility(0);
        if (this.q == 2) {
            this.ag.setImageDrawable(this.x.getResources().getDrawable(R.drawable.standalone_num_img));
            this.bd.setText(this.x.getResources().getString(R.string.IDS_active_standalone_number));
        } else {
            j(R.drawable.pic_esim_not_open);
            this.bd.setText(this.x.getResources().getString(R.string.IDS_open_tips_title));
        }
        if (!Utils.o()) {
            if (this.q == 2) {
                this.bg.setText(this.x.getResources().getString(R.string.IDS_standalone_number_tips_new));
            } else {
                this.bg.setText(this.x.getResources().getString(R.string.IDS_multi_sim_tips_final));
            }
        } else if (this.q == 2) {
            this.bg.setText(this.x.getResources().getString(R.string.IDS_standalone_number_tips_new) + this.x.getResources().getString(R.string.IDS_active_esim_tips_append));
        } else {
            this.bg.setText(this.x.getResources().getString(R.string.IDS_multi_sim_tips_new) + this.x.getResources().getString(R.string.IDS_active_esim_tips_append));
        }
        this.ax.setBackgroundResource(R.drawable.bg_button_pressed);
        this.ax.setEnabled(false);
        this.at.setBackgroundResource(R.drawable.bg_button_pressed);
        this.at.setEnabled(false);
        if (Utils.o()) {
            this.bl.setVisibility(0);
            this.ax.setVisibility(0);
            this.aa.setVisibility(8);
            this.at.setVisibility(8);
            if (pxh.e()) {
                this.ax.setText(this.x.getString(R.string.IDS_plugin_multi_esim_goto_active));
            } else {
                this.ax.setText(this.x.getString(R.string.IDS_plugin_multi_esim_open_by_code));
            }
        } else {
            this.bl.setVisibility(8);
            this.ax.setVisibility(8);
            this.aa.setVisibility(0);
            EsimFaqAdapter esimFaqAdapter = new EsimFaqAdapter(this.x, this.ah);
            this.ac = esimFaqAdapter;
            esimFaqAdapter.b(this.au);
            this.ae.setAdapter((ListAdapter) this.ac);
            this.at.setVisibility(0);
            this.at.setText(this.x.getString(R.string.IDS_plugin_multi_esim_goto_active));
        }
        ai();
    }

    private void j(int i) {
        Drawable drawable = getResources().getDrawable(R.drawable.pic_open_esim_bg);
        drawable.setAutoMirrored(true);
        this.ag.setImageDrawable(new LayerDrawable(new Drawable[]{drawable, getResources().getDrawable(i)}));
    }

    private void b(String[] strArr, SpannableStringBuilder spannableStringBuilder, SpannableString spannableString) {
        spannableStringBuilder.append((CharSequence) spannableString);
        if (strArr.length > 1) {
            spannableStringBuilder.append((CharSequence) strArr[strArr.length - 1]);
        }
        this.bg.setText(spannableStringBuilder);
        this.bg.setMovementMethod(LinkMovementMethod.getInstance());
        this.bg.setHighlightColor(ContextCompat.getColor(this, R.color.IDS_plugin_sim_transparent));
    }

    private void ai() {
        int i = this.ai;
        if (i == 9) {
            bc();
            this.ab.setVisibility(8);
            this.ax.setBackgroundResource(R.drawable.multi_esim_button_bg);
            this.ax.setEnabled(true);
            this.at.setBackgroundResource(R.drawable.multi_esim_button_bg);
            this.at.setEnabled(true);
            return;
        }
        if (i == 10) {
            this.z.setText(String.format(Locale.ENGLISH, this.x.getString(R.string.IDS_plugin_multi_esim_device_low_power), UnitUtil.e(this.t, 2, 0)));
            return;
        }
        if (x()) {
            this.ab.setVisibility(8);
            this.ax.setBackgroundResource(R.drawable.multi_esim_button_bg);
            this.ax.setEnabled(true);
            this.at.setBackgroundResource(R.drawable.multi_esim_button_bg);
            this.at.setEnabled(true);
            return;
        }
        this.z.setText(pxl.d(this.x, this.ai));
        this.p.setVisibility(8);
        int i2 = this.ai;
        if (i2 == 2) {
            this.al.setVisibility(0);
            this.ak.setVisibility(8);
        } else if (i2 == 3) {
            this.al.setVisibility(0);
            this.ak.setVisibility(0);
        } else {
            this.al.setVisibility(8);
            this.ak.setVisibility(8);
        }
    }

    private void au() {
        if (pxk.j()) {
            aw();
        }
    }

    private void z() {
        String string;
        if (this.q == 2) {
            this.ag.setImageDrawable(this.x.getResources().getDrawable(R.drawable.standalone_num_opened_img));
            au();
        } else if (e(this.ah) || a(this.ah)) {
            j(R.drawable.pic_esim_open_success);
            au();
        } else {
            j(R.drawable.pic_esim_open_success);
        }
        if (TextUtils.isEmpty(this.ba)) {
            if (this.q == 2) {
                string = this.x.getString(R.string.IDS_standalone_number_enabled);
            } else {
                string = this.x.getString(R.string.IDS_multi_sim_enabled);
            }
        } else if (this.q == 2) {
            string = String.format(Locale.ENGLISH, this.x.getString(R.string.IDS_standalone_number_enable_name), this.ba);
        } else {
            string = String.format(Locale.ENGLISH, this.x.getString(R.string.IDS_multi_sim_enable_name), this.ba);
        }
        this.bd.setText(string);
        this.at.setVisibility(8);
        if (!Utils.o() && !e(this.ah) && !b(this.ah)) {
            this.bg.setText(this.x.getString(R.string.IDS_esim_manager_active_tips));
            this.aa.setVisibility(0);
            EsimFaqAdapter esimFaqAdapter = new EsimFaqAdapter(this.x, this.ah);
            this.ac = esimFaqAdapter;
            esimFaqAdapter.b(this.au);
            this.ae.setAdapter((ListAdapter) this.ac);
            this.r.setVisibility(8);
        } else if (e(this.ah) || b(this.ah)) {
            this.aa.setVisibility(0);
            EsimFaqAdapter esimFaqAdapter2 = new EsimFaqAdapter(this.x, this.ah);
            this.ac = esimFaqAdapter2;
            esimFaqAdapter2.b(this.au);
            this.ae.setAdapter((ListAdapter) this.ac);
            this.r.setVisibility(8);
            this.m = false;
            if (pxk.j()) {
                r();
            }
            q();
        } else {
            r();
            q();
            this.aa.setVisibility(8);
        }
        this.aw.setVisibility(8);
        this.ab.setVisibility(8);
    }

    private void aw() {
        this.bf.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_more), qre.f(R.string.accessibility_more_item));
        this.bf.setRightButtonClickable(true);
        this.bf.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.25
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                pxi.b("more_control");
                EsimManagerActivity.this.ax();
            }
        });
        this.bf.setRightButtonVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ax() {
        new PopViewList(this.x, this.bf, new ArrayList(Collections.singletonList(getResources().getString(R.string.IDS_delete_watch_esim)))).b(new PopViewList.PopViewClickListener() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.23
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public void setOnClick(int i) {
                LogUtil.a("EsimManagerActivity", "enter showPopUpView");
                if (i == 0) {
                    if (!npz.b().k()) {
                        qpx.e(EsimManagerActivity.this.x, R.string.IDS_delete_esim_tip_disconnect_modify);
                        return;
                    }
                    LogUtil.a("EsimManagerActivity", "queryCarrierEsimState =", Integer.valueOf(EsimManagerActivity.this.bj));
                    pxi.d("delete_esim");
                    if (!pxk.b(EsimManagerActivity.this.ah, EsimManagerActivity.this.q)) {
                        EsimManagerActivity.this.ar();
                    } else {
                        LogUtil.a("EsimManagerActivity", " show dialog for esim logout ");
                        EsimManagerActivity.this.at();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ar() {
        LogUtil.a("EsimManagerActivity", "enter showDelSimDialog()");
        String string = this.x.getResources().getString(R.string.IDS_delete_esim_dialog_text);
        String string2 = this.x.getResources().getString(R.string.IDS_plugin_sim_esim_button_cannel);
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.x).a(R.string.IDS_delete_esim_dialog_title).a(string).a(string2, new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.j("EsimManagerActivity", "press negative button");
            }
        }).b(this.x.getResources().getString(R.string.IDS_plugin_multi_sim_continue), new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EsimManagerActivity.this.aj();
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void at() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.x);
        builder.a(this.x.getResources().getString(R.string.IDS_plugin_sim_esim_carrier_logout));
        builder.a(this.x.getResources().getString(R.string.IDS_plugin_sim_esim_logout_ok), new View.OnClickListener() { // from class: pvl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45902c.c(view);
            }
        }).d(this.x.getResources().getString(R.string.IDS_device_wear_home_skip_sync_account).toUpperCase(), new View.OnClickListener() { // from class: pvs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void c(View view) {
        LogUtil.a("EsimManagerActivity", "press positive button");
        this.o = true;
        this.m = false;
        ba();
    }

    public /* synthetic */ void a(View view) {
        LogUtil.a("EsimManagerActivity", "press negative button");
        aj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aj() {
        ap();
        LogUtil.a("EsimManagerActivity", "enter sendRemoveSimProfileCmd");
        npz.b().a(this.ap.getSimInfoList(), new IBaseResponseCallback() { // from class: pvr
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.e(i, obj);
            }
        });
    }

    public /* synthetic */ void e(int i, Object obj) {
        ReleaseLogUtil.d("DEVMGR_EsimManagerActivity", "sendRemoveSimProfileCmd onResponse errorCode : ", Integer.valueOf(i));
        Message messageObtainMessage = this.f22979b.obtainMessage(10010);
        messageObtainMessage.arg1 = i;
        this.f22979b.sendMessage(messageObtainMessage);
    }

    private void aq() {
        LogUtil.a("EsimManagerActivity", "enter showDelSimDialog()");
        String string = this.x.getResources().getString(R.string.IDS_delete_esim_tip_carrier_restrictions);
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.x).a(R.string.IDS_delete_esim_failed_toast).a(string).b(this.x.getResources().getString(R.string.IDS_plugin_multi_sim_known), new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.j("EsimManagerActivity", "showDelSimFailedDialog setPositiveButton");
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    private void ap() {
        if (isFinishing() || isDestroyed()) {
            LogUtil.j("EsimManagerActivity", "showDeleteEsimLoadingDialog is Destroyed");
            return;
        }
        LogUtil.a("EsimManagerActivity", "showDelLoadingDialog: mLoadDataDialog ");
        CommonDialog21 commonDialog21B = CommonDialog21.b(this);
        this.ao = commonDialog21B;
        commonDialog21B.b(getString(R.string.IDS_delete_esim_loading));
        this.ao.setCancelable(false);
        this.ao.c();
        this.ao.show();
    }

    private void r() {
        LogUtil.a("EsimManagerActivity", "initAccountManagementButton()");
        List<Map<String, Object>> listE = pxk.e(this.x);
        if (this.q == 2 || njy.e(listE)) {
            LogUtil.j("EsimManagerActivity", "mCardType is standalone or supportAccountManageSimCardList is empty");
            this.r.setVisibility(8);
            return;
        }
        this.r.setVisibility(0);
        this.ax.setVisibility(8);
        this.bl.setVisibility(8);
        this.p.setVisibility(0);
        this.p.setAllCaps(false);
        this.p.setText(pxk.c(this.x.getString(R.string.IDS_esim_account_management)));
        this.p.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("EsimManagerActivity", "eSIM account management button is clicked");
                EsimManagerActivity.this.p.setEnabled(false);
                EsimManagerActivity.this.bi.setVisibility(0);
                EsimManagerActivity.this.m = false;
                EsimManagerActivity esimManagerActivity = EsimManagerActivity.this;
                esimManagerActivity.ai = pxl.c(esimManagerActivity.x);
                if (EsimManagerActivity.this.ai == 0) {
                    EsimManagerActivity.this.a(true);
                } else {
                    EsimManagerActivity.this.ag();
                }
            }
        });
    }

    private void q() {
        String string = this.x.getString(R.string.IDS_plugin_multi_esim_open_have_active_tips);
        String string2 = getString(R.string.IDS_esim_usage_guide);
        String[] strArrSplit = String.format(Locale.ENGLISH, string, string2).split(string2);
        if (strArrSplit.length == 0) {
            LogUtil.j("EsimManagerActivity", "initBindTipsView() splits is empty");
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(strArrSplit[0]);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, R.color.textColorSecondary)), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        SpannableString spannableString2 = new SpannableString(string2);
        spannableString2.setSpan(new ClickableSpan() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.8
            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(EsimManagerActivity.this.getResources().getColor(R.color.IDS_plugin_sim_next_back_orange_color));
                textPaint.setUnderlineText(false);
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                pxi.b("FAQs");
                EsimManagerActivity esimManagerActivity = EsimManagerActivity.this;
                esimManagerActivity.c(esimManagerActivity.x.getString(R.string.IDS_esim_usage_guide), pxk.c(EsimManagerActivity.this.x));
            }
        }, 0, spannableString2.length(), 33);
        b(strArrSplit, spannableStringBuilder, spannableString2);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.ar != null) {
            this.ar = null;
        }
    }

    @Override // com.huawei.sim.esim.view.BaseOpenSimCardActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("EsimManagerActivity", "onDestroy");
        if (this.f22979b != null) {
            this.f22979b.removeCallbacksAndMessages(null);
        }
        pvh.b(this).b(false);
        ecu.d().cancelDownloadDeviceResources();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        this.f22979b.sendMessage(this.f22979b.obtainMessage(10002));
    }

    static class a extends Handler {
        private WeakReference<EsimManagerActivity> d;

        a(EsimManagerActivity esimManagerActivity) {
            this.d = new WeakReference<>(esimManagerActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("EsimManagerActivity", "EsimManagerActivityHandler handleMessageWhenReferenceNotNull msg is null");
            }
            super.handleMessage(message);
            WeakReference<EsimManagerActivity> weakReference = this.d;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.a("EsimManagerActivity", "mWeakActivity is null");
                return;
            }
            EsimManagerActivity esimManagerActivity = this.d.get();
            LogUtil.a("EsimManagerActivity", "mActivity :", esimManagerActivity, "handleMessageWhenReferenceNotNull msg = ", message);
            switch (message.what) {
                case 10001:
                    esimManagerActivity.d(message);
                    break;
                case 10002:
                    esimManagerActivity.ah();
                    break;
                case 10003:
                    esimManagerActivity.af();
                    break;
                case 10004:
                    esimManagerActivity.ac();
                    break;
                case 10005:
                    LogUtil.a("EsimManagerActivity", "redownload timeout");
                    pxi.c("false", "enabled_entry", String.valueOf(10005), pxi.d(esimManagerActivity.x, esimManagerActivity.j), "online_ES", pxi.d(esimManagerActivity.q));
                    esimManagerActivity.ac();
                    break;
                case 10006:
                    EsimManagerActivity.a(message, esimManagerActivity);
                    break;
                case 10007:
                    esimManagerActivity.s();
                    break;
                case 10008:
                    esimManagerActivity.av();
                    break;
                case 10009:
                    xjt.q("MSG_REFRESH_BATTERY_THRESHOLD_ERROR_VIEW");
                    esimManagerActivity.ag();
                    break;
                case 10010:
                    esimManagerActivity.e(message);
                    break;
                default:
                    EsimManagerActivity.c(message, esimManagerActivity);
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Message message, EsimManagerActivity esimManagerActivity) {
        switch (message.what) {
            case 100001:
                esimManagerActivity.am();
                esimManagerActivity.bi.setVisibility(8);
                esimManagerActivity.d(message.arg1);
                break;
            case ErrorCode.HWID_IS_STOPED /* 100002 */:
                esimManagerActivity.am();
                esimManagerActivity.bi.setVisibility(8);
                esimManagerActivity.p.setEnabled(true);
                esimManagerActivity.c(message);
                break;
            case 100003:
            case AdapterWithBottomView.TYPE_BOTTOM /* 100005 */:
                esimManagerActivity.am();
                esimManagerActivity.bi.setVisibility(8);
                esimManagerActivity.ad.setVisibility(8);
                esimManagerActivity.p.setEnabled(true);
                qpx.e(esimManagerActivity, esimManagerActivity.getResources().getString(R.string.IDS_oversea_es_load_fail));
                break;
            case 100004:
            case 100006:
            default:
                LogUtil.j("EsimManagerActivity", "handleMessageWhenReferenceNotNull default");
                break;
            case WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007 /* 100007 */:
                esimManagerActivity.bi.setVisibility(8);
                esimManagerActivity.b(message);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Message message, EsimManagerActivity esimManagerActivity) {
        if (message.arg1 == 0) {
            esimManagerActivity.f();
            npz.b().d(true);
            int i = message.arg1;
            pxi.c("true", "enabled_entry", String.valueOf(i), pxi.d(esimManagerActivity.x, esimManagerActivity.j), "online_ES", pxi.d(esimManagerActivity.q));
        } else {
            xjt.q("MSG_SIM_MSG_DOWNLOAD_PROFILE_COMPLETE not is SUCCESS");
            npz.b().d(false);
            int i2 = message.arg1;
            pxi.c("false", "enabled_entry", String.valueOf(i2), pxi.d(esimManagerActivity.x, esimManagerActivity.j), "online_ES", pxi.d(esimManagerActivity.q));
        }
        esimManagerActivity.ac();
    }

    private void b(Message message) {
        LogUtil.a("EsimManagerActivity", "handleOpenResult: ", Integer.valueOf(message.arg1));
        am();
        if (message.arg1 != 0) {
            this.ad.setVisibility(8);
            qpx.e(this.x, getResources().getString(R.string.IDS_oversea_es_load_fail));
        } else {
            this.m = true;
            npz.b().d(false);
        }
    }

    private void c(Message message) {
        if (message == null) {
            LogUtil.j("EsimManagerActivity", "message is null.");
            return;
        }
        if (b(this.ah)) {
            a(message);
            return;
        }
        LogUtil.a("EsimManagerActivity", "queryResult = ", Integer.valueOf(message.arg1), "isClickLogoutBtn : ", Boolean.valueOf(this.o), "isEnterAccountActivity : ", Boolean.valueOf(this.m), ",currentSlotId = ", Integer.valueOf(this.n));
        int i = message.arg1;
        this.bj = i;
        if ((i != 1200 && i != -1011) || this.m) {
            if (i == 1000) {
                h();
                return;
            } else {
                this.ad.setVisibility(8);
                return;
            }
        }
        if (e(this.ah)) {
            EsimCarrierStrategy esimCarrierStrategyA = pxn.e().a();
            if (esimCarrierStrategyA == null) {
                qpx.e(this.x, getResources().getString(R.string.IDS_oversea_es_load_fail));
                return;
            } else {
                esimCarrierStrategyA.deactivateEsim();
                return;
            }
        }
        c();
        this.m = true;
        npz.b().d(false);
    }

    private void h() {
        if (!pxk.j()) {
            this.ad.setVisibility(8);
            ReleaseLogUtil.d("DEVMGR_EsimManagerActivity", "device not support Delete");
            return;
        }
        ReleaseLogUtil.d("DEVMGR_EsimManagerActivity", "isClickLogoutBtn = ", Boolean.valueOf(this.o), "isEnterAccountActivity = ", Boolean.valueOf(this.m));
        if (pxk.h(this.ah)) {
            i();
            return;
        }
        if (u() && a(pxk.c(this.bk)) && a(pxk.c(this.bq)) && this.n == 0) {
            e(this.bq);
            return;
        }
        boolean z = this.o;
        if (!z && !this.m) {
            as();
        } else if (z && !this.m) {
            Context context = this.x;
            pxk.d(context, context.getString(R.string.IDS_plugin_sim_esim_button_delete), new View.OnClickListener() { // from class: pvp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.e(view);
                }
            });
        } else {
            as();
        }
    }

    public /* synthetic */ void e(View view) {
        LogUtil.a("EsimManagerActivity", "press Positive button");
        aj();
    }

    private void i() {
        if (d(this.ah)) {
            this.ad.setVisibility(8);
            pxk.b(this.x, this.x.getResources().getString(R.string.IDS_esim_third_query_fail_tip, npz.b().n()), new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.j("EsimManagerActivity", "showCuccEsimDeleteConfirmDialog confirm delete esim");
                    EsimManagerActivity.this.aj();
                }
            });
            return;
        }
        if (c(this.ah)) {
            if (this.n == 0 && e(pxk.b()) && e(pxk.c())) {
                EsimCarrierStrategy esimCarrierStrategyB = pxn.e().b(this.x, this.f22979b);
                if (esimCarrierStrategyB == null) {
                    qpx.e(this.x, getResources().getString(R.string.IDS_oversea_es_load_fail));
                    return;
                }
                this.n = 1;
                this.i = 1;
                this.j = pxk.c();
                pxp pxpVar = new pxp();
                pxpVar.i = this.i;
                pxpVar.h = this.j;
                pxpVar.m = new Runnable() { // from class: pvj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.b();
                    }
                };
                esimCarrierStrategyB.setRequest(pxpVar);
                esimCarrierStrategyB.authenticate();
                return;
            }
            pxk.b(this.x, this.x.getResources().getString(R.string.IDS_esim_huawei_query_fail_tip), new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.j("EsimManagerActivity", "showCuccEsimDeleteConfirmDialog confirm delete esim");
                    EsimManagerActivity.this.aj();
                }
            });
        }
    }

    public /* synthetic */ void b() {
        this.bi.setVisibility(0);
    }

    private void a(Message message) {
        ReleaseLogUtil.d("EsimManagerActivity", "dealMultiSimMsgQueryResult message:", message);
        if (message.obj instanceof obp) {
            a((obp) message.obj);
            return;
        }
        LogUtil.j("EsimManagerActivity", "message.obj not instanceof MultiSimAsyncResult");
        Context context = this.x;
        qpx.e(context, context.getResources().getString(R.string.IDS_plugin_network_unstable));
    }

    private void a(obp obpVar) {
        LogUtil.a("DEVMGR_EsimManagerActivity", "openOperationTypeResult result=", obpVar);
        if (obpVar == null) {
            LogUtil.j("EsimManagerActivity", "openOperationTypeResult result is null");
            Context context = this.x;
            qpx.e(context, context.getResources().getString(R.string.IDS_plugin_network_unstable));
            return;
        }
        ReleaseLogUtil.d("EsimManagerActivity", "openOperationTypeResult result action = ", Integer.valueOf(obpVar.d()), " result = ", Integer.valueOf(obpVar.a()), " reason = ", Integer.valueOf(obpVar.e()), "currentSlotId = ", Integer.valueOf(this.n));
        if (obpVar.a() == 0 || obpVar.e() == 1500 || obpVar.e() == 1501 || obpVar.e() == 1502) {
            d(obpVar);
        } else {
            Context context2 = this.x;
            qpx.e(context2, context2.getResources().getString(R.string.IDS_plugin_multi_sim_server_error));
        }
    }

    private void d(obp obpVar) {
        int iB = b(obpVar);
        ReleaseLogUtil.d("EsimManagerActivity", "bindStatus :", Integer.valueOf(iB), "mOperationType :", Integer.valueOf(this.av));
        if (iB == 1 && this.av == 1) {
            ocg ocgVarC = obpVar.c();
            if (ocgVarC != null) {
                d(ocgVarC.d(), ocgVarC.c(), "ES");
                return;
            }
            return;
        }
        if (iB == 0 && this.av == 1) {
            if (u() && b(pxk.c(this.bk)) && b(pxk.c(this.bq)) && this.n == 0) {
                e(this.bq);
                return;
            } else if (pxk.j()) {
                as();
                return;
            } else {
                Context context = this.x;
                qpx.e(context, context.getResources().getString(R.string.IDS_plugin_multi_sim_server_error));
                return;
            }
        }
        if (iB == 0 && this.av == 2) {
            if (u() && b(pxk.c(this.bk)) && b(pxk.c(this.bq)) && this.n == 0) {
                e(this.bq);
                return;
            } else {
                as();
                return;
            }
        }
        LogUtil.a("EsimManagerActivity", "openOperationTypeResult bindStatus or mOperationType invalid.");
    }

    private int b(obp obpVar) {
        if (obpVar == null) {
            LogUtil.j("EsimManagerActivity", "result is null.");
            return 2;
        }
        obk obkVarB = obpVar.b();
        if (obkVarB == null) {
            LogUtil.j("EsimManagerActivity", "serviceInfo is null.");
            return 2;
        }
        ArrayList<obq> arrayListB = obkVarB.b();
        int i = 0;
        if (arrayListB == null) {
            LogUtil.j("EsimManagerActivity", "getCurrentBindStatus pairedDeviceList is null");
            return 0;
        }
        for (obq obqVar : arrayListB) {
            if (obqVar.b().equals(this.ap.getEID())) {
                for (SimInfo simInfo : this.ap.getSimInfoList()) {
                    LogUtil.a("EsimManagerActivity", "getCurrentBindStatus sim iccid=", simInfo.getICCID());
                    if (obqVar.d().equals(simInfo.getICCID())) {
                        i = 1;
                        break;
                    }
                }
            }
        }
        return i;
    }

    private void d(String str, String str2, String str3) {
        LogUtil.a("EsimManagerActivity", "startMultiSimWebView type=", str3, " url=", str, " postData=", str2);
        if (str == null || "".equals(str)) {
            LogUtil.j("EsimManagerActivity", "startMultiSimWebView url null");
            return;
        }
        Intent intent = new Intent(this, (Class<?>) MultiSimWebView.class);
        intent.putExtra("url", str);
        intent.putExtra("post_data", str2);
        intent.putExtra("req_type", str3);
        intent.putExtra("is_logout", true);
        startActivityForResult(intent, 0);
    }

    private void as() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.x);
        builder.b(R.string.IDS_delete_esim_profile);
        builder.a(this.x.getString(R.string.IDS_plugin_sim_esim_button_delete), new View.OnClickListener() { // from class: pvn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45904a.d(view);
            }
        }).a(R.string.IDS_plugin_sim_esim_button_cannel, new View.OnClickListener() { // from class: pvk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(view);
            }
        });
        if (this.k == null) {
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            this.k = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCancelable(false);
        }
        if (this.k.isShowing()) {
            return;
        }
        this.k.show();
    }

    public /* synthetic */ void d(View view) {
        LogUtil.a("EsimManagerActivity", "delete");
        o();
        aj();
    }

    public /* synthetic */ void b(View view) {
        LogUtil.a("EsimManagerActivity", "cancel");
        o();
    }

    private void o() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.k;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.k = null;
        }
    }

    private void d(int i) {
        ReleaseLogUtil.d("DEVMGR_EsimManagerActivity", "queryMultiSimServiceStatus result:", Integer.valueOf(i));
        if (i == 1000) {
            EsimCarrierStrategy esimCarrierStrategyA = pxn.e().a();
            ReleaseLogUtil.d("DEVMGR_EsimManagerActivity", "esimCarrierStrategy : ", esimCarrierStrategyA);
            if (!pxk.h(this.j)) {
                this.f22979b.sendEmptyMessageDelayed(100003, 10000L);
                this.am.e(pxk.a(this.j, this.be), pxk.e(this.ap), this.f22979b.obtainMessage(ErrorCode.HWID_IS_STOPED));
                return;
            } else if (esimCarrierStrategyA == null) {
                qpx.e(this.x, getResources().getString(R.string.IDS_oversea_es_load_fail));
                return;
            } else {
                esimCarrierStrategyA.getEsimStatus();
                return;
            }
        }
        this.ad.setVisibility(8);
        a(i);
        this.m = false;
    }

    private void a(int i) {
        this.bi.setVisibility(8);
        this.p.setEnabled(true);
        if (i == -1006) {
            qpx.e(this.x, getString(R.string.IDS_account_management_default_card));
            return;
        }
        if (i == -1005) {
            qpx.e(this.x, getString(R.string.IDS_phone_version_low_tips1));
        } else if (i == 98) {
            qpx.e(this.x, getString(R.string.IDS_plugin_network_unstable));
        } else {
            LogUtil.a("EsimManagerActivity", "auth fail :", Integer.valueOf(i));
        }
    }

    private void am() {
        if (this.f22979b == null) {
            LogUtil.j("EsimManagerActivity", "mHandler is null");
            return;
        }
        this.f22979b.removeMessages(100003);
        this.f22979b.removeMessages(100001);
        this.f22979b.removeMessages(ErrorCode.HWID_IS_STOPED);
        this.f22979b.removeMessages(AdapterWithBottomView.TYPE_BOTTOM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        CommonDialog21 commonDialog21 = this.ao;
        if (commonDialog21 != null && commonDialog21.isShowing()) {
            LogUtil.a("EsimManagerActivity", "enter mLoadingDialog dismiss");
            this.ao.dismiss();
            this.ao = null;
        }
        if (message == null) {
            LogUtil.j("EsimManagerActivity", "processDeleteEsimResult msg is null");
            return;
        }
        int i = message.arg1;
        if (i == 0) {
            qpx.e(this.x, R.string.IDS_delete_esim_success_toast);
            finish();
            return;
        }
        if (i == 1) {
            xjt.q("DELETE_SIM_FAILED");
            qpx.e(this.x, R.string.IDS_delete_esim_failed_toast);
            return;
        }
        if (i != 127) {
            if (i == 223 || i == 276) {
                xjt.q("DELETE_SIM_CARRIER_RESTRICTIONS");
                aq();
                return;
            } else if (i != 100009) {
                LogUtil.j("EsimManagerActivity", "dealReportResult, default");
                return;
            }
        }
        xjt.q("DeleteEsimResult ERR_TIME_OUT or DELETE_SIM_SYSTEM_ERROR");
        qpx.e(this.x, R.string.IDS_delete_esim_fail_toast);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void av() {
        pxi.b("deregister-eSIM");
        this.m = false;
        this.bi.setVisibility(8);
        this.p.setEnabled(true);
        if (e(this.ah)) {
            ba();
            return;
        }
        if (a(this.ah)) {
            ay();
            return;
        }
        if (b(this.ah)) {
            this.av = 1;
            bb();
        } else {
            try {
                this.x.startActivity(new Intent(this.x, (Class<?>) EsimSelectCardActivity.class));
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("EsimManagerActivity", "startAccountManageProcess ActivityNotFoundException");
            }
        }
    }

    private void ay() {
        if ((u() && !a(pxk.c(this.bk)) && !a(pxk.c(this.bq))) || (!u() && !a(pxk.c(this.bk)))) {
            qpx.e(this.x, R.string.IDS_esim_lose_efficacy);
            return;
        }
        if (a(pxk.c(this.bk))) {
            e(this.bk);
        } else if (u() && !a(pxk.c(this.bk)) && a(pxk.c(this.bq))) {
            e(this.bq);
        }
    }

    private void bb() {
        if ((u() && !b(pxk.c(this.bk)) && !b(pxk.c(this.bq))) || (!u() && !b(pxk.c(this.bk)))) {
            qpx.e(this.x, R.string.IDS_esim_lose_efficacy);
            return;
        }
        if (b(pxk.c(this.bk))) {
            e(this.bk);
        } else if (u() && !b(pxk.c(this.bk)) && b(pxk.c(this.bq))) {
            e(this.bq);
        }
    }

    private void ba() {
        pxk.m(this.x);
        if (pxk.h(pxk.b())) {
            this.n = 0;
            this.i = 0;
            this.j = pxk.b();
        } else if (pxk.h(pxk.c())) {
            this.n = 1;
            this.i = 1;
            this.j = pxk.c();
        } else {
            pxk.b(this.x, this.x.getResources().getString(R.string.IDS_esim_huawei_query_fail_tip), new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.j("EsimManagerActivity", "showCuccEsimDeleteConfirmDialog confirm delete esim");
                    EsimManagerActivity.this.aj();
                }
            });
            return;
        }
        pxn.e().a(CarrierType.CUCC, EsimType.ONE_NUMBER_MULTISIM, CommonUtil.bg() ? BrandType.HUAWEI : BrandType.THIRD);
        EsimCarrierStrategy esimCarrierStrategyB = pxn.e().b(this.x, this.f22979b);
        if (esimCarrierStrategyB == null) {
            qpx.e(this.x, getResources().getString(R.string.IDS_oversea_es_load_fail));
            return;
        }
        pxp pxpVar = new pxp();
        pxpVar.i = this.i;
        pxpVar.h = this.j;
        pxpVar.m = new Runnable() { // from class: pvm
            @Override // java.lang.Runnable
            public final void run() {
                this.f45903b.j();
            }
        };
        esimCarrierStrategyB.setRequest(pxpVar);
        esimCarrierStrategyB.authenticate();
    }

    public /* synthetic */ void j() {
        this.bi.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        this.bi.setVisibility(8);
        this.ab.setVisibility(0);
        ai();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        LogUtil.a("EsimManagerActivity", "handleNetworkingDownloadResources network is connected, download resources again");
        this.y.setVisibility(8);
        this.bi.setVisibility(0);
        l();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        boolean zI = npz.b().i();
        LogUtil.a("EsimManagerActivity", "onResume isOperatorOpenSuccess is ", Boolean.valueOf(zI), "isClickLogoutBtn is ", Boolean.valueOf(this.o), "isEnterAccountActivity = ", Boolean.valueOf(this.m));
        if (zI) {
            this.ad.setVisibility(8);
            RelativeLayout relativeLayout = this.bi;
            if (relativeLayout == null) {
                return;
            }
            relativeLayout.setVisibility(0);
            boolean zD = eey.d(mgg.c("EsimManagerActivity"), 148);
            LogUtil.a("EsimManagerActivity", "onResume isSupportStandaloneNum = ", Boolean.valueOf(zD));
            if (!zD) {
                npz.b().d(false);
            }
            ac();
            m();
        }
        EsimCarrierStrategy esimCarrierStrategyB = pxn.e().b(this.x, this.f22979b);
        ReleaseLogUtil.d("DEVMGR_EsimManagerActivity", "strategy :", esimCarrierStrategyB);
        if (this.m && pxk.h(this.j) && esimCarrierStrategyB != null) {
            esimCarrierStrategyB.getEsimStatus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final String str, final String str2) {
        if (qrs.r()) {
            return;
        }
        LogUtil.a("EsimManagerActivity", "startWebView enter");
        ThreadPoolManager.c().a("EsimManagerActivity", new Runnable() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.10
            @Override // java.lang.Runnable
            public void run() {
                final String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainTipsResDbankcdnNew");
                if (TextUtils.isEmpty(url)) {
                    return;
                }
                EsimManagerActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.10.1
                    @Override // java.lang.Runnable
                    public void run() {
                        pxk.e(EsimManagerActivity.this.x, str, url + str2);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        if (this.f22979b == null || !this.f22979b.hasMessages(i)) {
            return;
        }
        this.f22979b.removeMessages(i);
    }

    private void f(String str) {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.x);
        builder.a(str);
        builder.a(this.x.getString(R.string.IDS_plugin_multi_sim_known), new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("EsimManagerActivity", "user choose cancel");
                if (EsimManagerActivity.this.u != null) {
                    EsimManagerActivity.this.u.dismiss();
                }
                Intent intent = new Intent(EsimManagerActivity.this.x, (Class<?>) MultiSimCardActivity.class);
                intent.putExtra("BatteryThreshold", EsimManagerActivity.this.t);
                intent.putExtra("esim_card_type_key", EsimManagerActivity.this.q);
                intent.putExtra("multi_sim_device_info", EsimManagerActivity.this.ap);
                intent.putExtra("esimIsReopening", true);
                EsimManagerActivity.this.startActivity(intent);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.u = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        if (this.u.isShowing()) {
            return;
        }
        this.u.show();
    }

    private void aa() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "share_preference_esim_accode", "KEY_ACCODE");
        LogUtil.a("EsimManagerActivity", "jumpToMultiSimCardActivity acCode: ", strE);
        if (!TextUtils.isEmpty(strE) && !Utils.o() && pxk.j(this.x) && this.q == 1) {
            f(getString(R.string.IDS_plugin_multi_esim_reactive_remind));
            return;
        }
        if (pxk.a()) {
            Intent intent = new Intent(this.x, (Class<?>) EsimOpenMethodActivity.class);
            intent.putExtra("esim_operator_key", this.h);
            intent.putExtra("esim_auth_method", this.f22978a);
            intent.putExtra("MultiSimSlotId", this.i);
            intent.putExtra("esim_default_url", this.f);
            intent.putExtra("esim_card_type_key", this.q);
            intent.putExtra("multi_sim_device_info", this.ap);
            intent.putExtra("BatteryThreshold", this.t);
            this.x.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent(this.x, (Class<?>) MultiSimCardActivity.class);
        intent2.putExtra("BatteryThreshold", this.t);
        intent2.putExtra("esim_card_type_key", this.q);
        intent2.putExtra("multi_sim_device_info", this.ap);
        startActivity(intent2);
    }

    private void f() {
        if (Utils.o()) {
            return;
        }
        pxk.b("", "0");
    }

    private void g(String str) {
        npz.b().d(str, new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.14
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("EsimManagerActivity", "openEsimWithoutConfirm first errorCode =", Integer.valueOf(i));
            }
        }, new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.13
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("EsimManagerActivity", "openEsimWithoutConfirm second errorCode =", Integer.valueOf(i));
                EsimManagerActivity.this.c(10005);
                Message messageObtainMessage = EsimManagerActivity.this.f22979b.obtainMessage(10006);
                messageObtainMessage.arg1 = i;
                if (i == 0) {
                    EsimManagerActivity.this.f22979b.sendMessageDelayed(messageObtainMessage, 5000L);
                } else {
                    EsimManagerActivity.this.f22979b.sendMessage(messageObtainMessage);
                }
            }
        });
    }

    private void bc() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "share_preference_esim_accode", "KEY_ACCODE");
        String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), "share_preference_esim_accode", "KEY_ACCODE_SAVE_TIME");
        String str = "";
        if (TextUtils.isEmpty(strE2)) {
            f();
        } else {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() - Long.parseLong(strE2);
                LogUtil.a("EsimManagerActivity", "updateViewWhenHaveAccode currentTime:", Long.valueOf(System.currentTimeMillis()), "updateViewWhenHaveAccode savedTime:", strE2, "updateViewWhenHaveAccode timeInterval:", Long.valueOf(jCurrentTimeMillis));
                if (jCurrentTimeMillis > Constants.ANALYSIS_EVENT_KEEP_TIME) {
                    f();
                    strE = "";
                }
                str = strE;
            } catch (NumberFormatException e) {
                LogUtil.e("EsimManagerActivity", "updateViewWhenHaveAccode NumberFormatException");
                xjt.q("updateViewWhenHaveAccode NumberFormatException" + e.getMessage());
                f();
            }
        }
        LogUtil.a("EsimManagerActivity", "updateViewWhenHaveAccode acCode: ", str);
        if (!TextUtils.isEmpty(str) && !Utils.o() && pxk.j(this.x) && this.q != 2) {
            j(R.drawable.pic_esim_open_failed);
            this.bd.setText(this.x.getResources().getString(R.string.IDS_plugin_esim_download_fail));
            this.bg.setText(this.x.getResources().getString(R.string.IDS_plugin_multi_esim_redownload_tip));
            this.aw.setVisibility(0);
            this.at.setVisibility(8);
            this.aa.setVisibility(8);
            this.r.setVisibility(8);
            this.bb.setBackgroundResource(R.drawable.multi_esim_button_bg);
            this.bb.setEnabled(true);
            this.bc.setBackgroundResource(R.drawable.multi_esim_button_bg);
            this.bc.setEnabled(true);
            return;
        }
        this.aw.setVisibility(8);
        this.r.setVisibility(0);
        this.bd.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        String str;
        CommonDialog21 commonDialog21 = this.ao;
        if (commonDialog21 != null && commonDialog21.isShowing()) {
            LogUtil.a("EsimManagerActivity", "enter mLoadingDialog dismiss");
            this.ao.dismiss();
            this.ao = null;
        }
        if (!(message.obj instanceof String)) {
            str = "";
        } else {
            str = (String) message.obj;
        }
        if (!this.an && "android.net.conn.CONNECTIVITY_CHANGE".equals(str) && pxl.b(this.x)) {
            this.f22979b.sendEmptyMessageDelayed(10007, ProfileExtendConstants.TIME_OUT);
        } else {
            ac();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        LogUtil.a("EsimManagerActivity", "downloadResources()");
        if (!pxl.b(this.x)) {
            LogUtil.j("EsimManagerActivity", "downloadResources network is not connected");
            d(this.x.getString(R.string.IDS_plugin_esim_no_network), R.drawable.esim_fail_network_img, true);
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        if (pxk.e() == 85) {
            arrayList.add("c7d28238-fec2-4985-b2a4-f29c96637ac4");
        } else {
            arrayList.add("69a968a4-5db8-4d1e-a390-762cb8039784");
        }
        ecu.d().downloadDeviceResources(arrayList, new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.11
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("EsimManagerActivity", "errorCode:", i + ", objData:", obj);
                if (i == 0) {
                    EsimManagerActivity.this.p();
                    return;
                }
                if (i != 20000 || !(obj instanceof Integer)) {
                    EsimManagerActivity.this.k();
                    return;
                }
                int iIntValue = ((Integer) obj).intValue();
                EsimManagerActivity.this.bm.setVisibility(0);
                EsimManagerActivity.this.b(iIntValue);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        String strE = UnitUtil.e(i, 2, 0);
        if (LanguageUtil.br(this.x) || LanguageUtil.x(this.x)) {
            strE = "\u200f" + strE;
        }
        this.bm.setText(String.format(Locale.ENGLISH, this.x.getString(R.string.IDS_updating_resources), strE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        this.an = true;
        this.bm.setVisibility(0);
        this.bm.setText(this.x.getResources().getString(R.string.IDS_plugin_multi_esim_loading));
        ad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        d(this.x.getString(R.string.IDS_resources_download_error), R.drawable.esim_fail_query_img, false);
        this.y.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.18
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("EsimManagerActivity", "handleDownloadFail download resources again");
                EsimManagerActivity.this.y.setVisibility(8);
                EsimManagerActivity.this.bi.setVisibility(0);
                EsimManagerActivity.this.l();
            }
        });
    }

    private void d(String str, int i, boolean z) {
        this.y.setVisibility(0);
        this.s.setVisibility(8);
        this.bi.setVisibility(8);
        if (z) {
            this.az.setVisibility(0);
        } else {
            this.az.setVisibility(8);
        }
        HealthTextView healthTextView = this.w;
        if (healthTextView != null) {
            healthTextView.setText(str);
            this.w.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.sim.esim.view.EsimManagerActivity.17
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    EsimManagerActivity.this.w.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    if (EsimManagerActivity.this.w.getLineCount() >= 2) {
                        EsimManagerActivity.this.w.setGravity(GravityCompat.START);
                    }
                }
            });
        }
        ImageView imageView = this.v;
        if (imageView != null) {
            Context context = this.x;
            pxk.b(context, imageView, qrs.d(context, 120.0f));
            Drawable drawable = getResources().getDrawable(i);
            drawable.setAutoMirrored(true);
            this.v.setImageDrawable(drawable);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("EsimManagerActivity", "onActivityResult requestCode:", Integer.valueOf(i));
        if (i == 10001) {
            ac();
            return;
        }
        if (i != 1099) {
            if (i == 0) {
                this.av = 2;
                bb();
                return;
            } else {
                this.ad.setVisibility(8);
                return;
            }
        }
        this.bi.setVisibility(8);
        if (intent == null || !intent.getBooleanExtra("cuccAgreementAgree", false)) {
            return;
        }
        EsimCarrierStrategy esimCarrierStrategyB = pxn.e().b(this.x, this.f22979b);
        if (esimCarrierStrategyB instanceof pxy) {
            this.ad.setVisibility(0);
            ((pxy) esimCarrierStrategyB).a(i, intent);
        }
    }

    @Override // com.huawei.sim.esim.view.BaseOpenSimCardActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
