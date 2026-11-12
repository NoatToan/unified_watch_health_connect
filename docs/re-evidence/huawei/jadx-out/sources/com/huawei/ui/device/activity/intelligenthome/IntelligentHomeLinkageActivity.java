package com.huawei.ui.device.activity.intelligenthome;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.callback.FitnessCloudCallBack;
import com.huawei.datatype.SmartAlarmInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.intelligent.StartDeviceLinkageResponse;
import com.huawei.hwcloudmodel.model.intelligent.StopDeviceLinkageResponse;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.alarm.AlarmActivity;
import com.huawei.ui.device.activity.intelligenthome.IntelligentHomeLinkageActivity;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import defpackage.eej;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.lsy;
import defpackage.lvv;
import defpackage.lxe;
import defpackage.mgg;
import defpackage.mhs;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.rdc;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class IntelligentHomeLinkageActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f24403a = new Object();
    private static String e = "7:00";
    private String aa;
    private List<ImageView> ab;
    private String ac;
    private LinearLayout ae;
    private RelativeLayout af;
    private String ah;
    private CustomTitleBar ai;
    private RelativeLayout aj;
    private ImageView al;
    private boolean am;
    private CommonDialog21 ao;
    private ImageView ap;
    private String aq;
    private ImageView ar;
    private HealthTextView as;
    private LinearLayout at;
    private CustomTextAlertDialog au;
    private ImageView av;
    private LinearLayout aw;
    private CustomTextAlertDialog ay;
    private String az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private rdc f24404b;
    private int ba;
    private HealthTextView bb;
    private int bc;
    private int bd;
    private int be;
    private List<SmartAlarmInfo> bf;
    private SmartAlarmInfo bg;
    private RelativeLayout bh;
    private HealthTextView bi;
    private HealthTextView bj;
    private HealthSwitchButton bk;
    private int bl;
    private int bm;
    private RelativeLayout bo;
    private HealthTextView bp;
    private RelativeLayout bq;
    private HealthTextView br;
    private HealthViewPager bs;
    private LinearLayout bt;
    private HealthTextView bu;
    private String bv;
    private RelativeLayout bx;
    private HealthDivider bz;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NoTitleCustomAlertDialog f24405c;
    private HealthTextView ca;
    private String d;
    private Context g;
    private DeviceInfo h;
    private String i;
    private CustomTextAlertDialog j;
    private DeviceSettingsInteractors k;
    private HealthScrollView m;
    private HealthTextView n;
    private HealthTextView o;
    private ImageView p;
    private String q;
    private HealthDotsPageIndicator r;
    private lxe s;
    private NoTitleCustomAlertDialog t;
    private HealthTextView u;
    private lvv v;
    private String w;
    private RelativeLayout y;
    private mhs z;
    private HealthTextView cb = null;
    private int[] ad = {R.mipmap.ic_core_sleep_img, R.mipmap.pic_qingchen};
    private int[] bw = {R.string.IDS_device_to_intelligent_home_linkage_after_sleep, R.string.IDS_device_to_intelligent_home_linkage_after_wake_up};
    private String[] bn = null;
    private Handler x = new c(this);
    private boolean ak = false;
    private String l = "";
    private boolean an = false;
    private String f = "";
    private HealthViewPager.OnPageChangeListener ax = new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.ui.device.activity.intelligenthome.IntelligentHomeLinkageActivity.1
        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            LogUtil.a("IntelligentHomeLinkageActivity", "ProductIntroductionFragment onPageSelected() position = ", Integer.valueOf(i));
            IntelligentHomeLinkageActivity.this.b(i);
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            LogUtil.a("IntelligentHomeLinkageActivity", "ProductIntroductionFragment onPageScrolled() position = ", Integer.valueOf(i), " positionOffset = ", Float.valueOf(f), " positionOffsetPixels = ", Integer.valueOf(i2));
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            LogUtil.a("IntelligentHomeLinkageActivity", "ProductIntroductionFragment onPageScrollStateChanged() state = ", Integer.valueOf(i));
        }
    };
    private CompoundButton.OnCheckedChangeListener ag = new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.intelligenthome.IntelligentHomeLinkageActivity.3
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            LogUtil.a("03", 1, "IntelligentHomeLinkageActivity", "INTELLIGENT_HOME_LINKAGE is onCheckedChanged isChecked = ", Boolean.valueOf(z));
            Intent intent = new Intent();
            if (z) {
                DeviceSettingsInteractors unused = IntelligentHomeLinkageActivity.this.k;
                intent.putExtra("status", "1");
            } else {
                DeviceSettingsInteractors unused2 = IntelligentHomeLinkageActivity.this.k;
                intent.putExtra("status", "0");
            }
            IntelligentHomeLinkageActivity.this.setResult(-1, intent);
            IntelligentHomeLinkageActivity.this.a(AnalyticsValue.SETTING_1090014.value(), true, true, z);
        }
    };

    private void g() {
        lsy.a(new Runnable() { // from class: com.huawei.ui.device.activity.intelligenthome.IntelligentHomeLinkageActivity.2
            @Override // java.lang.Runnable
            public void run() {
                IntelligentHomeLinkageActivity.this.d = GRSManager.c(BaseApplication.getContext()).getUrl("domainResourcephsVmall");
                IntelligentHomeLinkageActivity.this.i = GRSManager.c(BaseApplication.getContext()).getUrl("domainSmarthomeHicloud");
            }
        });
    }

    class c extends Handler {
        WeakReference<IntelligentHomeLinkageActivity> d;

        c(IntelligentHomeLinkageActivity intelligentHomeLinkageActivity) {
            this.d = new WeakReference<>(intelligentHomeLinkageActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (this.d.get() == null) {
                return;
            }
            LogUtil.a("IntelligentHomeLinkageActivity", "Enter handleMessage():", Integer.valueOf(message.what));
            switch (message.what) {
                case 1:
                    IntelligentHomeLinkageActivity.this.bm = ((Integer) message.obj).intValue();
                    LogUtil.a("IntelligentHomeLinkageActivity", "Enter handleMessage() mSmartEnable :", Integer.valueOf(IntelligentHomeLinkageActivity.this.bm));
                    IntelligentHomeLinkageActivity.this.ac();
                    break;
                case 2:
                    IntelligentHomeLinkageActivity.this.ak = ((Boolean) message.obj).booleanValue();
                    LogUtil.a("IntelligentHomeLinkageActivity", "Enter handleMessage() mIsSwitchChecked :", Boolean.valueOf(IntelligentHomeLinkageActivity.this.ak));
                    IntelligentHomeLinkageActivity.this.r();
                    IntelligentHomeLinkageActivity.this.ac();
                    IntelligentHomeLinkageActivity.this.bk.setChecked(IntelligentHomeLinkageActivity.this.ak);
                    IntelligentHomeLinkageActivity.this.bk.setOnCheckedChangeListener(IntelligentHomeLinkageActivity.this.ag);
                    break;
                case 3:
                    IntelligentHomeLinkageActivity.this.e(message);
                    break;
                case 4:
                    IntelligentHomeLinkageActivity.this.a(message);
                    break;
                case 5:
                    if (IntelligentHomeLinkageActivity.this.ao != null) {
                        IntelligentHomeLinkageActivity.this.ao.dismiss();
                        IntelligentHomeLinkageActivity.this.ao = null;
                    }
                    IntelligentHomeLinkageActivity.this.c(message);
                    break;
                case 6:
                    LogUtil.a("IntelligentHomeLinkageActivity", "msg is INTELLIGENT_HOME_TIME_OUT");
                    if (IntelligentHomeLinkageActivity.this.x != null) {
                        IntelligentHomeLinkageActivity.this.x.removeMessages(6);
                    }
                    if (IntelligentHomeLinkageActivity.this.ao != null) {
                        IntelligentHomeLinkageActivity.this.ao.dismiss();
                        IntelligentHomeLinkageActivity.this.ao = null;
                    }
                    qpx.e(IntelligentHomeLinkageActivity.this.g, IntelligentHomeLinkageActivity.this.g.getString(R.string.IDS_connect_error));
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        Handler handler = this.x;
        if (handler != null) {
            handler.removeMessages(6);
        }
        CommonDialog21 commonDialog21 = this.ao;
        if (commonDialog21 != null) {
            commonDialog21.dismiss();
            this.ao = null;
        }
        StartDeviceLinkageResponse startDeviceLinkageResponse = message.obj instanceof StartDeviceLinkageResponse ? (StartDeviceLinkageResponse) message.obj : null;
        if (startDeviceLinkageResponse != null) {
            if (startDeviceLinkageResponse.getResultCode().intValue() == 0) {
                this.ak = !this.am;
                StringBuffer stringBuffer = new StringBuffer(16);
                stringBuffer.append(startDeviceLinkageResponse.getDevId()).append(Constants.PARAM_SERVER_SPLIT).append(startDeviceLinkageResponse.getExpiresIn()).append(Constants.PARAM_SERVER_SPLIT).append(startDeviceLinkageResponse.getDevice_prodId()).append(Constants.PARAM_SERVER_SPLIT).append(this.ak).append("&&false");
                if (this.h != null) {
                    this.z.setSwitchSetting("intelligent_home_linkage", stringBuffer.toString(), this.h.getDeviceIdentify(), null);
                }
                this.bk.setChecked(!this.am);
                LogUtil.a("IntelligentHomeLinkageActivity", "startDeviceLinkage is success startDeviceLinkageRsq ", startDeviceLinkageResponse);
            } else {
                LogUtil.a("IntelligentHomeLinkageActivity", "startDeviceLinkage is fail startDeviceLinkageRsq resultCode ", startDeviceLinkageResponse.getResultCode(), "resultDesc ", startDeviceLinkageResponse.getResultDesc());
                Context context = this.g;
                qpx.e(context, context.getString(R.string.IDS_hwh_home_group_server_exception));
            }
        } else {
            Context context2 = this.g;
            qpx.e(context2, context2.getString(R.string.IDS_connect_error));
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        CommonDialog21 commonDialog21 = this.ao;
        if (commonDialog21 != null) {
            commonDialog21.dismiss();
            this.ao = null;
        }
        StopDeviceLinkageResponse stopDeviceLinkageResponse = message.obj instanceof StopDeviceLinkageResponse ? (StopDeviceLinkageResponse) message.obj : null;
        if (stopDeviceLinkageResponse == null) {
            LogUtil.a("IntelligentHomeLinkageActivity", "stopDeviceLinkage is fail");
            Context context = this.g;
            qpx.e(context, context.getString(R.string.IDS_connect_error));
        } else if (stopDeviceLinkageResponse.getResultCode().intValue() == 0) {
            boolean z = !this.am;
            this.ak = z;
            this.bk.setChecked(z);
            DeviceInfo deviceInfo = this.h;
            if (deviceInfo != null) {
                this.z.setSwitchSetting("intelligent_home_linkage", null, deviceInfo.getDeviceIdentify(), null);
            }
            LogUtil.a("IntelligentHomeLinkageActivity", "stopDeviceLinkage is success stopDeviceLinkageRsq ", stopDeviceLinkageResponse);
        } else {
            LogUtil.a("IntelligentHomeLinkageActivity", "stopDeviceLinkage is fail stopDeviceLinkageRsq resultCode ", stopDeviceLinkageResponse.getResultCode(), " resultDesc ", stopDeviceLinkageResponse.getResultDesc());
            Context context2 = this.g;
            qpx.e(context2, context2.getString(R.string.IDS_hwh_home_group_server_exception));
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        LogUtil.a("IntelligentHomeLinkageActivity", "startDeviceLinkage is devId ", this.l, " proId ", this.az);
        LogUtil.a("IntelligentHomeLinkageActivity", "startDeviceLinkage is msg.agr1 ", Integer.valueOf(message.arg1));
        StartDeviceLinkageResponse startDeviceLinkageResponse = (StartDeviceLinkageResponse) message.obj;
        int i = message.arg1;
        if (startDeviceLinkageResponse != null) {
            if (startDeviceLinkageResponse.getResultCode().intValue() == 0) {
                b(i, startDeviceLinkageResponse.getDevId(), startDeviceLinkageResponse.getDevice_prodId(), String.valueOf(startDeviceLinkageResponse.getExpiresIn()));
                LogUtil.a("IntelligentHomeLinkageActivity", "startDeviceLinkage is success startDeviceLinkageRsq ", startDeviceLinkageResponse);
                return;
            } else {
                if (!TextUtils.isEmpty(this.l)) {
                    b(i, this.l, this.az, this.q);
                }
                LogUtil.a("IntelligentHomeLinkageActivity", "startDeviceLinkage is fail startDeviceLinkageRsq resultCode ", startDeviceLinkageResponse.getResultCode(), "resultDesc ", startDeviceLinkageResponse.getResultDesc());
                return;
            }
        }
        if (TextUtils.isEmpty(this.l)) {
            return;
        }
        b(i, this.l, this.az, this.q);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g = this;
        setContentView(R.layout.activity_intelligent_home_linkage);
        this.v = lvv.c(this.g);
        this.z = mhs.a();
        this.k = DeviceSettingsInteractors.e(this.g);
        this.f24404b = rdc.b(null);
        Intent intent = getIntent();
        if (intent != null) {
            this.f = intent.getStringExtra("device_id");
        }
        if (eej.a(this.f) != null) {
            boolean zIsSupportChangeAlarm = eej.a(this.f).isSupportChangeAlarm();
            this.an = zIsSupportChangeAlarm;
            LogUtil.a("IntelligentHomeLinkageActivity", "mIsSupportChangeAlarm ", Boolean.valueOf(zIsSupportChangeAlarm));
        }
        this.s = lxe.a(BaseApplication.getContext());
        g();
        j();
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        if (this.bc == 1) {
            this.cb.setVisibility(0);
            this.cb.setText(this.f24404b.d(this.bd));
            String strB = rdc.b(this.g, (this.be * 100) + this.bl);
            e = strB;
            this.bj.setText(strB);
            if (this.ak) {
                this.bx.setClickable(true);
                this.bx.setAlpha(1.0f);
                return;
            } else {
                this.bx.setClickable(false);
                this.bx.setAlpha(0.5f);
                return;
            }
        }
        this.bj.setText(getString(R.string.IDS_status_disabled));
        this.cb.setVisibility(8);
        this.bx.setClickable(false);
        this.bx.setAlpha(0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.ak) {
            this.y.setClickable(true);
            this.y.setAlpha(1.0f);
            this.bh.setClickable(true);
            this.bh.setAlpha(1.0f);
            if (this.bm == 1) {
                this.bx.setClickable(true);
                this.bx.setAlpha(1.0f);
                return;
            } else {
                this.bx.setClickable(false);
                this.bx.setAlpha(0.5f);
                return;
            }
        }
        this.y.setClickable(false);
        this.y.setAlpha(0.5f);
        this.bh.setClickable(false);
        this.bh.setAlpha(0.5f);
        this.bx.setClickable(false);
        this.bx.setAlpha(0.5f);
    }

    private void j() {
        this.aa = getString(R.string.IDS_device_intelligent_home);
        this.ah = getString(R.string.IDS_hwh_Smart_life_linkage);
        this.ac = String.format(Locale.ENGLISH, getString(R.string.IDS_device_to_intelligent_home_linkage_under), this.aa);
        this.aq = String.format(Locale.ENGLISH, getString(R.string.IDS_device_to_intelligent_home_linkage_market_downloads), this.aa);
        this.w = String.format(Locale.ENGLISH, getString(R.string.IDS_device_to_intelligent_home_linkage_monitoring_after_sleep_new), this.ah, getString(R.string.IDS_device_to_intelligent_home_linkage_go_sleeping), 20);
        String str = String.format(Locale.ENGLISH, getString(R.string.IDS_device_to_intelligent_home_linkage_morning_after_wake_up_new), this.ah, getString(R.string.IDS_settings_smart_alarm_clock));
        this.bv = str;
        this.bn = new String[]{this.w, str};
    }

    private void l() {
        HealthScrollView healthScrollView = (HealthScrollView) qsp.a(this, R.id.sv_device_setting);
        this.m = healthScrollView;
        healthScrollView.setScrollViewVerticalDirectionEvent(true);
        this.m.setLayerType(2, null);
        this.aj = (RelativeLayout) qsp.a(this, R.id.rl_intelligent_home_linkage_unintall);
        this.br = (HealthTextView) qsp.a(this, R.id.switch_intelligent_home_title);
        this.bp = (HealthTextView) qsp.a(this, R.id.switch_intelligent_home_describe);
        this.af = (RelativeLayout) qsp.a(this, R.id.rl_intelligent_home_linkage_unintent);
        this.bq = (RelativeLayout) qsp.a(this, R.id.rl_switch_intelligent_home);
        this.bi = (HealthTextView) qsp.a(this, R.id.tv_switch_intelligent_button);
        this.bo = (RelativeLayout) qsp.a(this, R.id.rl_switch_intfelligent_button);
        this.ca = (HealthTextView) qsp.a(this, R.id.tv_wake_up);
        this.at = (LinearLayout) qsp.a(this, R.id.ll_unintent);
        this.as = (HealthTextView) qsp.a(this, R.id.tv_market_downloads);
        this.p = (ImageView) qsp.a(this, R.id.img_download);
        this.br.setText(this.ah);
        this.bp.setText(this.ac);
        this.as.setText(this.aq);
        this.bu = (HealthTextView) qsp.a(this, R.id.tv_to_intelligent_home);
        this.aw = (LinearLayout) qsp.a(this, R.id.ll_not_downloaded);
        i();
    }

    private void i() {
        this.ae = (LinearLayout) qsp.a(this, R.id.device_intelligent_home_layout);
        this.bs = (HealthViewPager) qsp.a(this, R.id.device_intelligent_home_linkage_img);
        LinearLayout linearLayout = (LinearLayout) qsp.a(this, R.id.device_intelligent_home_linkage_img_layout);
        this.bt = linearLayout;
        qrs.b(linearLayout, 2);
        this.r = (HealthDotsPageIndicator) qsp.a(this, R.id.indicator);
        this.bk = (HealthSwitchButton) qsp.a(this, R.id.switch_intelligent_button);
        this.n = (HealthTextView) qsp.a(this, R.id.device_intelligent_after_sleep);
        this.o = (HealthTextView) qsp.a(this, R.id.device_intelligent_monitoring_after_sleep);
        this.ai = (CustomTitleBar) qsp.a(this, R.id.intelligent_home_title_bar);
        this.u = (HealthTextView) qsp.a(this, R.id.tv_go_sleeping_minutes);
        this.bj = (HealthTextView) qsp.a(this, R.id.tv_smart_alarm);
        this.bh = (RelativeLayout) qsp.a(this, R.id.rl_smart_alarm);
        this.y = (RelativeLayout) qsp.a(this, R.id.rl_go_sleeping);
        this.bx = (RelativeLayout) qsp.a(this, R.id.rl_wake_up);
        this.cb = (HealthTextView) qsp.a(this, R.id.smart_alarm_day);
        this.al = (ImageView) qsp.a(this, R.id.iv_go_sleep);
        this.ap = (ImageView) qsp.a(this, R.id.iv_smart_alarm);
        this.ar = (ImageView) qsp.a(this, R.id.iv_wake_up);
        this.av = (ImageView) qsp.a(this, R.id.iv_unintent);
        this.bb = (HealthTextView) qsp.a(this, R.id.tv_to_intelligent_home_outsleep);
        this.bz = (HealthDivider) qsp.a(this, R.id.wake_up_divider);
        t();
        p();
        m();
    }

    private void m() {
        this.u.setText(String.format(Locale.ENGLISH, getString(R.string.IDS_device_to_intelligent_home_linkage_go_sleeping_minutes), 20));
        this.ca.setText(String.format(Locale.ENGLISH, getString(R.string.IDS_device_to_intelligent_home_linkage_reminder_enabled), getString(R.string.IDS_settings_smart_alarm_clock)));
        this.ai.setTitleText(this.ah);
        if (Utils.o()) {
            this.bu.setVisibility(8);
        } else {
            this.bu.setVisibility(0);
        }
        r();
        b();
        d();
        f();
        h();
    }

    private void t() {
        if (!k()) {
            this.bb.setVisibility(8);
            this.bh.setVisibility(8);
            this.bx.setVisibility(8);
            this.ai.setRightButtonVisibility(8);
            this.bz.setVisibility(8);
            this.bw = new int[]{R.string.IDS_device_to_intelligent_home_linkage_after_sleep};
            this.bn = new String[]{this.w};
            this.ad = new int[]{R.mipmap.ic_core_sleep_img};
            return;
        }
        LogUtil.a("IntelligentHomeLinkageActivity", "setNotSupportAlarmCapabilityView is support alarm.");
    }

    private void p() {
        if (LanguageUtil.ba(this.g)) {
            this.al.setImageResource(R.drawable.common_ui_arrow_left);
            this.ap.setImageResource(R.drawable.common_ui_arrow_left);
            this.ar.setImageResource(R.drawable.common_ui_arrow_left);
            this.av.setImageResource(R.drawable.common_ui_arrow_left);
            this.p.setImageResource(R.drawable.common_ui_arrow_left);
            return;
        }
        this.al.setImageResource(R.drawable.common_ui_arrow_right);
        this.ap.setImageResource(R.drawable.common_ui_arrow_right);
        this.ar.setImageResource(R.drawable.common_ui_arrow_right);
        this.av.setImageResource(R.drawable.common_ui_arrow_right);
        this.p.setImageResource(R.drawable.common_ui_arrow_right);
    }

    private void d() {
        if (this.an) {
            synchronized (f24403a) {
                List<SmartAlarmInfo> list = this.bf;
                if (list == null || list.size() == 0) {
                    SmartAlarmInfo smartAlarmInfo = new SmartAlarmInfo();
                    ArrayList arrayList = new ArrayList(16);
                    this.bf = arrayList;
                    arrayList.add(smartAlarmInfo);
                }
                if (this.bf.size() != 0) {
                    this.bg = this.bf.get(0);
                    y();
                } else {
                    LogUtil.j("IntelligentHomeLinkageActivity", "getSmartAlarm mSmartAlarmLists is empty");
                }
            }
            s();
            return;
        }
        q();
    }

    private void s() {
        final WeakReference weakReference = new WeakReference(this);
        this.k.c(this.f, new IBaseResponseCallback() { // from class: qwc
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                IntelligentHomeLinkageActivity.e(weakReference, i, obj);
            }
        });
    }

    public static /* synthetic */ void e(WeakReference weakReference, int i, Object obj) {
        IntelligentHomeLinkageActivity intelligentHomeLinkageActivity = (IntelligentHomeLinkageActivity) weakReference.get();
        if (intelligentHomeLinkageActivity != null) {
            intelligentHomeLinkageActivity.d(i, obj);
        }
    }

    private void d(int i, Object obj) {
        LogUtil.a("IntelligentHomeLinkageActivity", "proceessSupportChange errorCode = ", Integer.valueOf(i));
        synchronized (f24403a) {
            List<SmartAlarmInfo> listA = this.k.a(obj);
            this.bf = listA;
            this.k.b(listA);
            List<SmartAlarmInfo> list = this.bf;
            if (list == null || list.size() == 0) {
                SmartAlarmInfo smartAlarmInfo = new SmartAlarmInfo();
                ArrayList arrayList = new ArrayList(16);
                this.bf = arrayList;
                arrayList.add(smartAlarmInfo);
            }
            LogUtil.a("IntelligentHomeLinkageActivity", "proceessSupportChange mSmartAlarmLists size = ", Integer.valueOf(this.bf.size()));
            if (this.bf.size() != 0) {
                this.bg = this.bf.get(0);
                y();
            } else {
                LogUtil.j("IntelligentHomeLinkageActivity", "proceessSupportChange mSmartAlarmInfo is empty");
            }
        }
    }

    private void q() {
        this.v.a(new IBaseResponseCallback() { // from class: qwd
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.e(i, obj);
            }
        });
    }

    public /* synthetic */ void e(int i, Object obj) {
        synchronized (f24403a) {
            if (obj instanceof List) {
                this.bf = (List) obj;
            }
            List<SmartAlarmInfo> list = this.bf;
            if (list == null || list.size() == 0) {
                SmartAlarmInfo smartAlarmInfo = new SmartAlarmInfo();
                ArrayList arrayList = new ArrayList(16);
                this.bf = arrayList;
                arrayList.add(smartAlarmInfo);
            }
            LogUtil.a("IntelligentHomeLinkageActivity", "processUnSupportChange mSmartAlarmLists size = ", Integer.valueOf(this.bf.size()));
            if (this.bf.size() != 0) {
                this.bg = this.bf.get(0);
                y();
            } else {
                LogUtil.j("IntelligentHomeLinkageActivity", "processUnSupportChange mSmartAlarmLists is empty");
            }
        }
    }

    private void y() {
        this.bc = this.bg.getSmartAlarmEnable();
        this.be = this.bg.getSmartAlarmStartTimeHour();
        this.bl = this.bg.getSmartAlarmStartTimeMins();
        this.bd = this.bg.getSmartAlarmRepeat();
        this.ba = this.bg.getSmartAlarmAheadTime();
        if (this.bd == 0 && this.bc == 1) {
            this.bc = c(this.bg);
        }
        int i = this.be;
        int i2 = this.bl;
        LogUtil.a("IntelligentHomeLinkageActivity", "mSmartAlarmEnable =", Integer.valueOf(this.bc), "smartAlarmStartTime = ", Integer.valueOf((i * 100) + i2), "mSmartAlarmRepeat =", Integer.valueOf(this.bd), "mSmartAlarmAheadTime =", Integer.valueOf(this.ba));
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = Integer.valueOf(this.bc);
        this.x.sendMessage(messageObtain);
    }

    private int c(SmartAlarmInfo smartAlarmInfo) {
        int smartAlarmEnable = smartAlarmInfo.getSmartAlarmEnable();
        String strE = SharedPreferenceManager.e(this.g, String.valueOf(10022), "ONCE_SMART_ALARM_INFO");
        LogUtil.a("IntelligentHomeLinkageActivity", " onceSmartAlarmIsOver json = ", strE);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("IntelligentHomeLinkageActivity", " onceSmartAlarmIsOver json is null");
            return smartAlarmEnable;
        }
        List list = (List) new Gson().fromJson(strE, new TypeToken<List<SmartAlarmInfo>>() { // from class: com.huawei.ui.device.activity.intelligenthome.IntelligentHomeLinkageActivity.4
        }.getType());
        if (list == null || list.size() == 0) {
            LogUtil.j("IntelligentHomeLinkageActivity", " onceSmartAlarmIsOver smartAlarmInfoList is null or list is empty");
            return smartAlarmEnable;
        }
        for (int i = 0; i < list.size(); i++) {
            SmartAlarmInfo smartAlarmInfo2 = (SmartAlarmInfo) list.get(i);
            if (smartAlarmInfo2.getSmartAlarmIndex() == smartAlarmInfo.getSmartAlarmIndex()) {
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                LogUtil.a("IntelligentHomeLinkageActivity", "onceSmartAlarmIsOver currentTime ", Long.valueOf(jCurrentTimeMillis));
                if (jCurrentTimeMillis >= smartAlarmInfo2.getSmartAlarmTime()) {
                    smartAlarmEnable = 0;
                }
            }
        }
        LogUtil.a("IntelligentHomeLinkageActivity", "onceSmartAlarmIsOver reset = ", Integer.valueOf(smartAlarmEnable));
        return smartAlarmEnable;
    }

    private void b() {
        DeviceInfo deviceInfoC = mgg.c("IntelligentHomeLinkageActivity");
        this.h = deviceInfoC;
        if (deviceInfoC != null) {
            this.z.getSwitchSetting("intelligent_home_linkage", deviceInfoC.getDeviceIdentify(), new IBaseResponseCallback() { // from class: qvv
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.d.b(i, obj);
                }
            });
        }
    }

    public /* synthetic */ void b(int i, Object obj) {
        boolean zC = c(i, obj);
        LogUtil.a("IntelligentHomeLinkageActivity", "getLinkageStatus isEnableStatus = ", Boolean.valueOf(zC));
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = Boolean.valueOf(zC);
        this.x.sendMessage(messageObtain);
    }

    private boolean c(int i, Object obj) {
        if (i != 0 || obj == null) {
            LogUtil.j("IntelligentHomeLinkageActivity", "isEnableStatus errorCode is not success or objectData is null");
            return false;
        }
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            LogUtil.j("IntelligentHomeLinkageActivity", "isEnableStatus info is null");
            return false;
        }
        if (str.contains(Constants.PARAM_SERVER_SPLIT)) {
            String[] strArrSplit = str.split(Constants.PARAM_SERVER_SPLIT);
            LogUtil.a("IntelligentHomeLinkageActivity", "isEnableStatus length = ", Integer.valueOf(strArrSplit.length));
            if (strArrSplit.length == 5) {
                return Boolean.parseBoolean(strArrSplit[3]);
            }
        }
        return false;
    }

    private void f() {
        this.ai.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: qwl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46921c.c(view);
            }
        });
        Drawable drawable = getResources().getDrawable(R.mipmap.ic_notice_black);
        if (drawable != null) {
            this.ai.setRightButtonDrawable(drawable, qre.f(R.string.accessibility_explain));
        }
        this.ai.setRightButtonOnClickListener(new View.OnClickListener() { // from class: qwi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46920c.a(view);
            }
        });
        this.at.setOnClickListener(new View.OnClickListener() { // from class: qwh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        });
        this.bi.setOnClickListener(new View.OnClickListener() { // from class: qvo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46912c.b(view);
            }
        });
        this.bo.setOnClickListener(new View.OnClickListener() { // from class: qvn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.j(view);
            }
        });
        o();
        e();
        ag();
    }

    public /* synthetic */ void c(View view) {
        c();
    }

    public /* synthetic */ void a(View view) {
        if (TextUtils.isEmpty(this.d)) {
            LogUtil.j("IntelligentHomeLinkageActivity", "mIntelligentHomeTitleBar Click mBaseResourceUrl is empty");
            return;
        }
        String str = this.d + "/Sleep/EMUI8.0/C001B001/zh-CN/index.html";
        Intent intent = new Intent(this.g, (Class<?>) WebViewActivity.class);
        intent.putExtra("url", str);
        intent.putExtra(com.huawei.operation.utils.Constants.JUMP_MODE_KEY, 0);
        startActivity(intent);
    }

    public /* synthetic */ void e(View view) {
        CommonUtil.t(this.g);
    }

    public /* synthetic */ void b(View view) {
        ad();
    }

    public /* synthetic */ void j(View view) {
        ad();
    }

    private void ad() {
        synchronized (this) {
            boolean zIsChecked = this.bk.isChecked();
            LogUtil.a("IntelligentHomeLinkageActivity", "switch button isChecked = ", Boolean.valueOf(zIsChecked));
            this.am = zIsChecked;
            if (!zIsChecked) {
                ab();
            } else {
                w();
            }
        }
    }

    private void e() {
        this.y.setOnClickListener(new View.OnClickListener() { // from class: qwf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46919b.d(view);
            }
        });
    }

    public /* synthetic */ void d(View view) {
        if (!CommonUtil.d(this.g, "com.huawei.smarthome")) {
            x();
        } else if (e(this.g, "com.huawei.smarthome") >= 1900072000) {
            e(0);
            a(AnalyticsValue.SETTING_1090016.value(), true, false, false);
        } else {
            v();
        }
    }

    private void ag() {
        this.bh.setOnClickListener(new View.OnClickListener() { // from class: qvj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.q(view);
            }
        });
        this.bx.setOnClickListener(new View.OnClickListener() { // from class: qvq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.r(view);
            }
        });
    }

    public /* synthetic */ void q(View view) {
        try {
            Intent intent = new Intent();
            intent.setClass(this.g, AlarmActivity.class);
            intent.putExtra("device_id", this.f);
            this.g.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("IntelligentHomeLinkageActivity", "wakeUpClick e:", ExceptionUtils.c(e2));
        }
    }

    public /* synthetic */ void r(View view) {
        if (!CommonUtil.d(this.g, "com.huawei.smarthome")) {
            x();
            return;
        }
        if (e(this.g, "com.huawei.smarthome") >= 1900072000) {
            e(1);
            StorageParams storageParams = new StorageParams();
            SharedPreferenceManager.e(this.g, "intell_wake_up", "once_intell_wake_up" + this.h.getDeviceIdentify(), "go_wake_up", storageParams);
            a(AnalyticsValue.SETTING_1090017.value(), true, false, false);
            return;
        }
        v();
    }

    private boolean k() {
        if (eej.a(this.f) == null) {
            return false;
        }
        boolean zIsSmartAlarm = eej.a(this.f).isSmartAlarm();
        LogUtil.a("IntelligentHomeLinkageActivity", "isSupportAlarmCapability isSmartAlarm = ", Boolean.valueOf(zIsSmartAlarm));
        return zIsSmartAlarm;
    }

    private void c() {
        if (this.ak && this.bm == 1) {
            if (this.h != null) {
                String strE = SharedPreferenceManager.e(this.g, "intell_wake_up", "once_intell_wake_up" + this.h.getDeviceIdentify());
                LogUtil.a("IntelligentHomeLinkageActivity", "setLeftButtonOnClickListener result = ", strE);
                if (!"go_wake_up".equals(strE) && k()) {
                    u();
                    return;
                } else {
                    finish();
                    return;
                }
            }
            finish();
            return;
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("IntelligentHomeLinkageActivity", "onBackPressed");
        c();
    }

    private void u() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.g).a(String.format(Locale.ENGLISH, this.g.getString(R.string.IDS_device_to_intelligent_home_linkage_alarm_wake_up), this.g.getString(R.string.IDS_device_to_intelligent_home_linkage_wake_up), this.aa)).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: qvu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.f(view);
            }
        }).c(R.string.IDS_fitness_core_sleep_sleep_record_notice_go_to_set, new View.OnClickListener() { // from class: qvy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.g(view);
            }
        }).c();
        this.f24405c = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.f24405c.show();
    }

    public /* synthetic */ void f(View view) {
        LogUtil.a("IntelligentHomeLinkageActivity", "showDownloadNewAppDialog cancel click");
        this.f24405c.dismiss();
        this.f24405c = null;
        finish();
    }

    public /* synthetic */ void g(View view) {
        LogUtil.a("IntelligentHomeLinkageActivity", "showDownloadNewAppDialog ok click");
        this.f24405c.dismiss();
        this.f24405c = null;
        if (!CommonUtil.d(this.g, "com.huawei.smarthome")) {
            x();
            return;
        }
        if (e(this.g, "com.huawei.smarthome") >= 1900072000) {
            e(1);
            StorageParams storageParams = new StorageParams();
            SharedPreferenceManager.e(this.g, "intell_wake_up", "once_intell_wake_up" + this.h.getDeviceIdentify(), "go_wake_up", storageParams);
            a(AnalyticsValue.SETTING_1090017.value(), true, false, false);
            return;
        }
        v();
    }

    private void e(int i) {
        e(this.g.getString(R.string.IDS_getting_file));
        Message messageObtainMessage = this.x.obtainMessage();
        messageObtainMessage.what = 6;
        this.x.sendMessageDelayed(messageObtainMessage, 30000L);
        if (this.h != null) {
            a(i);
        }
    }

    private void a(final int i) {
        this.s.b(new FitnessCloudCallBack() { // from class: qvi
            @Override // com.huawei.callback.FitnessCloudCallBack
            public final void onResponce(Object obj) {
                this.f46901b.a(i, obj);
            }
        });
    }

    public /* synthetic */ void a(int i, Object obj) {
        Message messageObtain = Message.obtain();
        messageObtain.obj = obj;
        messageObtain.arg1 = i;
        messageObtain.what = 5;
        this.x.sendMessage(messageObtain);
    }

    private void b(int i, String str, String str2, String str3) {
        String str4;
        Handler handler = this.x;
        if (handler != null) {
            handler.removeMessages(6);
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(str).append(Constants.PARAM_SERVER_SPLIT).append(str3).append(Constants.PARAM_SERVER_SPLIT).append(str2).append(Constants.PARAM_SERVER_SPLIT).append(this.ak).append("&&true");
        this.z.setSwitchSetting("intelligent_home_linkage", stringBuffer.toString(), this.h.getDeviceIdentify(), null);
        LogUtil.a("IntelligentHomeLinkageActivity", "go to sleep intelligent home");
        String accountInfo = LoginInit.getInstance(this.g).getAccountInfo(1011);
        LogUtil.a("IntelligentHomeLinkageActivity", " goIntelligentHome huid = ", accountInfo);
        if (i == 0) {
            str4 = "gotosleep";
        } else {
            str4 = "wakeup";
        }
        CommonDialog21 commonDialog21 = this.ao;
        if (commonDialog21 != null) {
            commonDialog21.dismiss();
            this.ao = null;
        }
        String str5 = "hilink://smarthome.huawei.com?type=iftttrule&action=hwsmartwear&para=userId&userId=" + accountInfo + "&para=devId&devId=" + str + "&para=prodId&prodId=" + str2 + "&para=condId&condId=" + str4;
        LogUtil.a("IntelligentHomeLinkageActivity", " goToSleepIntelligentHome sction ", str5);
        d(str5);
    }

    private void x() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.g).a(this.aq).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: qwa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46917a.l(view);
            }
        }).c(R.string.IDS_settings_jawbone_download, new View.OnClickListener() { // from class: qvz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.o(view);
            }
        }).c();
        this.t = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.t.show();
    }

    public /* synthetic */ void l(View view) {
        LogUtil.a("IntelligentHomeLinkageActivity", "showDownloadIntelligentDialog cancel click");
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.t;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.t = null;
        }
    }

    public /* synthetic */ void o(View view) {
        LogUtil.a("IntelligentHomeLinkageActivity", "showDownloadIntelligentDialog ok click");
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.t;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.t = null;
        }
        e(false);
    }

    private int e(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    private void v() {
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.g).a(R.string.IDS_hwh_open_service_pop_up_notification_note).a(String.format(Locale.ENGLISH, this.g.getString(R.string.IDS_device_to_intelligent_home_linkage_update_retry), this.aa)).a(R.string.IDS_device_to_intelligent_home_linkage_go_to_download, new View.OnClickListener() { // from class: qvs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46914a.k(view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: qvt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.m(view);
            }
        }).b();
        this.au = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.au.show();
    }

    public /* synthetic */ void k(View view) {
        LogUtil.a("IntelligentHomeLinkageActivity", "showDownloadNewAppDialog ok click");
        this.au.dismiss();
        this.au = null;
        e(true);
    }

    public /* synthetic */ void m(View view) {
        LogUtil.a("IntelligentHomeLinkageActivity", "showDownloadNewAppDialog cancel click");
        this.au.dismiss();
        this.au = null;
    }

    private void ab() {
        String str = String.format(Locale.ENGLISH, this.g.getString(R.string.IDS_device_to_intelligent_home_linkage_open_after), this.g.getString(R.string.IDS_device_intelligent_home));
        if (!k()) {
            str = String.format(Locale.ENGLISH, this.g.getString(R.string.IDS_home_linkage_open_after), this.g.getString(R.string.IDS_device_intelligent_home));
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.g).e(String.format(Locale.ENGLISH, this.g.getString(R.string.IDS_device_to_intelligent_home_linkage_open), this.ah)).a(str).a(R.string.IDS_common_enable_button, new View.OnClickListener() { // from class: qvp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.s(view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: qvr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46913b.p(view);
            }
        }).b();
        this.ay = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.ay.show();
    }

    public /* synthetic */ void s(View view) {
        LogUtil.a("IntelligentHomeLinkageActivity", "showOpenIntelligentHomeDialog ok click");
        CustomTextAlertDialog customTextAlertDialog = this.ay;
        if (customTextAlertDialog != null) {
            customTextAlertDialog.dismiss();
            this.ay = null;
            e(this.g.getString(R.string.IDS_device_to_intelligent_home_linkage_is_opening));
            Message messageObtainMessage = this.x.obtainMessage();
            messageObtainMessage.what = 6;
            this.x.sendMessageDelayed(messageObtainMessage, 30000L);
            z();
        }
    }

    public /* synthetic */ void p(View view) {
        LogUtil.a("IntelligentHomeLinkageActivity", "showOpenIntelligentHomeDialog cancel click");
        CustomTextAlertDialog customTextAlertDialog = this.ay;
        if (customTextAlertDialog != null) {
            customTextAlertDialog.dismiss();
            this.ay = null;
        }
    }

    private void z() {
        this.s.b(new FitnessCloudCallBack() { // from class: qvw
            @Override // com.huawei.callback.FitnessCloudCallBack
            public final void onResponce(Object obj) {
                this.f46915c.e(obj);
            }
        });
    }

    public /* synthetic */ void e(Object obj) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        messageObtain.obj = obj;
        this.x.sendMessage(messageObtain);
    }

    private void w() {
        String str = String.format(Locale.ENGLISH, this.g.getString(R.string.IDS_device_to_intelligent_home_linkage_close_after), this.g.getString(R.string.IDS_device_intelligent_home));
        if (!k()) {
            str = String.format(Locale.ENGLISH, this.g.getString(R.string.IDS_home_linkage_close_after), this.g.getString(R.string.IDS_device_intelligent_home));
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.g).e(String.format(Locale.ENGLISH, this.g.getString(R.string.IDS_device_to_intelligent_home_linkage_close), this.ah)).a(str).a(R.string.IDS_settings_close, new View.OnClickListener() { // from class: qvx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46916a.i(view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: qwe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46918b.n(view);
            }
        }).b();
        this.j = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.j.show();
    }

    public /* synthetic */ void i(View view) {
        LogUtil.a("IntelligentHomeLinkageActivity", "showCloseIntelligentHomeDialog ok click");
        CustomTextAlertDialog customTextAlertDialog = this.j;
        if (customTextAlertDialog != null) {
            customTextAlertDialog.dismiss();
            this.j = null;
            e(this.g.getString(R.string.IDS_device_to_intelligent_home_linkage_is_closing));
            aa();
        }
    }

    public /* synthetic */ void n(View view) {
        LogUtil.a("IntelligentHomeLinkageActivity", "showCloseIntelligentHomeDialog cancel click");
        CustomTextAlertDialog customTextAlertDialog = this.j;
        if (customTextAlertDialog != null) {
            customTextAlertDialog.dismiss();
            this.j = null;
        }
    }

    private void aa() {
        this.s.c(new FitnessCloudCallBack() { // from class: qwg
            @Override // com.huawei.callback.FitnessCloudCallBack
            public final void onResponce(Object obj) {
                this.e.a(obj);
            }
        });
    }

    public /* synthetic */ void a(Object obj) {
        Message messageObtain = Message.obtain();
        messageObtain.obj = obj;
        messageObtain.what = 4;
        this.x.sendMessage(messageObtain);
    }

    private void e(String str) {
        LogUtil.a("IntelligentHomeLinkageActivity", "showLoadingDialog()");
        if (isFinishing()) {
            return;
        }
        CommonDialog21 commonDialog21 = this.ao;
        if (commonDialog21 == null) {
            new CommonDialog21(this.g, R.style.app_update_dialogActivity);
            CommonDialog21 commonDialog21B = CommonDialog21.b(this.g);
            this.ao = commonDialog21B;
            commonDialog21B.b(str);
            this.ao.setCancelable(false);
            this.ao.c();
            LogUtil.a("IntelligentHomeLinkageActivity", "mLoadingUserInformationDialog.show()");
            return;
        }
        commonDialog21.b(str);
        this.ao.c();
        LogUtil.a("IntelligentHomeLinkageActivity", "mLoadingUserInformationDialog.show()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        n();
        d();
        if (CommonUtil.ab(this)) {
            if (!CommonUtil.d(this, "com.huawei.smarthome")) {
                this.aj.setVisibility(0);
            } else {
                this.aj.setVisibility(8);
            }
            this.af.setVisibility(8);
            this.bq.setAlpha(1.0f);
            this.bq.setClickable(true);
            this.bi.setClickable(true);
            this.bo.setClickable(true);
            r();
            return;
        }
        this.aj.setVisibility(8);
        this.af.setVisibility(0);
        this.bq.setAlpha(0.5f);
        this.y.setAlpha(0.5f);
        this.bq.setClickable(false);
        this.y.setClickable(false);
        this.bi.setClickable(false);
        this.bo.setClickable(false);
        this.bh.setClickable(false);
        this.bh.setAlpha(0.5f);
        this.bx.setClickable(false);
        this.bx.setAlpha(0.5f);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.x;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void h() {
        this.ab = new ArrayList(16);
        e(this.ad);
    }

    private void e(int[] iArr) {
        for (int i : iArr) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(i);
            this.ab.add(imageView);
        }
    }

    private void o() {
        if (CommonUtil.bd()) {
            LogUtil.a("IntelligentHomeLinkageActivity", "initToIntelligentHome isHonor");
            this.bu.setText(String.format(Locale.ENGLISH, getString(R.string.IDS_intelligent_home_linkage_details_honor), this.aa));
            return;
        }
        Locale locale = Locale.ENGLISH;
        String string = getString(R.string.IDS_device_to_intelligent_home_linkage_details_and_purchase);
        String str = this.aa;
        String str2 = String.format(locale, string, str, str);
        int[] iArr = new int[1];
        try {
            if (str2.lastIndexOf(this.aa) != -1) {
                iArr[0] = str2.lastIndexOf(this.aa);
            }
        } catch (IndexOutOfBoundsException e2) {
            LogUtil.a("IntelligentHomeLinkageActivity", e2.getMessage());
        }
        SpannableString spannableString = new SpannableString(str2);
        ClickableSpan clickableSpan = new ClickableSpan() { // from class: com.huawei.ui.device.activity.intelligenthome.IntelligentHomeLinkageActivity.5
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                IntelligentHomeLinkageActivity.this.a();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(Color.parseColor(com.huawei.operation.utils.Constants.CHOOSE_TEXT_COLOR));
                textPaint.setUnderlineText(false);
            }
        };
        int i = iArr[0];
        spannableString.setSpan(clickableSpan, i, this.aa.length() + i, 33);
        this.bu.setText(spannableString);
        this.bu.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (!CommonUtil.d(this.g, "com.huawei.smarthome")) {
            x();
            return;
        }
        if (e(this.g, "com.huawei.smarthome") >= 1900072000) {
            try {
                Intent intent = new Intent();
                intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                Uri uri = Uri.parse("hilink://smarthome.huawei.com?type=vmall&action=hwsmartwear");
                LogUtil.a("IntelligentHomeLinkageActivity", "contentAUri:", uri);
                intent.setData(uri);
                b(intent, this.aa);
            } catch (ActivityNotFoundException e2) {
                LogUtil.e("IntelligentHomeLinkageActivity", "checkSmartHomeStatus e:", ExceptionUtils.c(e2));
            }
            a(AnalyticsValue.SETTING_1090015.value(), true, false, false);
            return;
        }
        v();
    }

    private void d(String str) {
        Intent intent = new Intent();
        intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setData(Uri.parse(str));
        intent.setFlags(268468224);
        b(intent, this.aa);
    }

    private void n() {
        this.aw.setOnClickListener(new View.OnClickListener() { // from class: qwb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.h(view);
            }
        });
        this.bs.setAdapter(new HealthPagerAdapter() { // from class: com.huawei.ui.device.activity.intelligenthome.IntelligentHomeLinkageActivity.10
            @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
            public boolean isViewFromObject(View view, Object obj) {
                return view == obj;
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
            public int getCount() {
                return IntelligentHomeLinkageActivity.this.ab.size();
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
            public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
                if (i < 0 || i >= IntelligentHomeLinkageActivity.this.ab.size()) {
                    return;
                }
                viewGroup.removeView((View) IntelligentHomeLinkageActivity.this.ab.get(i));
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
            public Object instantiateItem(ViewGroup viewGroup, int i) {
                if (i < 0 || i >= IntelligentHomeLinkageActivity.this.ab.size()) {
                    return null;
                }
                viewGroup.addView((View) IntelligentHomeLinkageActivity.this.ab.get(i));
                return IntelligentHomeLinkageActivity.this.ab.get(i);
            }
        });
        if (LanguageUtil.ba(this.g)) {
            int size = this.ab.size() - 1;
            this.bs.setCurrentItem(size);
            b(size);
        } else {
            this.bs.setCurrentItem(0);
            b(0);
        }
        HealthDotsPageIndicator healthDotsPageIndicator = this.r;
        if (healthDotsPageIndicator != null) {
            healthDotsPageIndicator.setRtlEnable(false);
            this.r.setViewPager(this.bs);
        }
        this.bs.setOnPageChangeListener(this.ax);
    }

    public /* synthetic */ void h(View view) {
        e(false);
    }

    private void e(boolean z) {
        if (!CommonUtil.d(this.g, "com.huawei.appmarket")) {
            LogUtil.a("IntelligentHomeLinkageActivity", "is not install appmarket enter");
            try {
                if (TextUtils.isEmpty(this.i)) {
                    LogUtil.j("IntelligentHomeLinkageActivity", "downLoadIntelligentHome mBaseSmartHomeUrl is empty");
                    return;
                }
                String str = this.i + "/d/?v2";
                Intent intent = new Intent();
                intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                intent.setData(Uri.parse(str));
                b(intent, getString(R.string.IDS_browser_app_name));
            } catch (ActivityNotFoundException e2) {
                LogUtil.e("IntelligentHomeLinkageActivity", "downLoadIntelligentHome intent app market e:", ExceptionUtils.c(e2));
            }
        } else {
            LogUtil.a("IntelligentHomeLinkageActivity", "is install appmarket enter");
            try {
                Intent intent2 = new Intent("com.huawei.appmarket.intent.action.AppDetail");
                intent2.setPackage("com.huawei.appmarket");
                intent2.addFlags(268468224);
                intent2.putExtra("APP_PACKAGENAME", "com.huawei.smarthome");
                if (z) {
                    qrs.c(intent2, "com.huawei.appmarket", this, getString(R.string.IDS_device_fragment_application_market));
                } else {
                    startActivity(intent2);
                }
            } catch (ActivityNotFoundException e3) {
                LogUtil.e("IntelligentHomeLinkageActivity", "downLoadIntelligentHome intent browser e:", ExceptionUtils.c(e3));
            }
        }
        a(AnalyticsValue.SETTING_1090020.value(), false, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(qre.f(R.string.accessibility_multiple_page_views));
        HealthTextView healthTextView = this.n;
        if (healthTextView != null) {
            int[] iArr = this.bw;
            if (i < iArr.length) {
                healthTextView.setText(iArr[i]);
                stringBuffer.append(qre.f(this.bw[i]));
            }
        }
        HealthTextView healthTextView2 = this.o;
        if (healthTextView2 != null) {
            String[] strArr = this.bn;
            if (i < strArr.length) {
                healthTextView2.setText(strArr[i]);
                stringBuffer.append(this.bn[i]);
            }
        }
        if (lrd.d()) {
            lrd.b(this.ae, stringBuffer);
        }
    }

    private void b(Intent intent, String str) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = getPackageManager();
        if (packageManager == null || (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536)) == null) {
            return;
        }
        ComponentName componentName = new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name);
        intent.setComponent(componentName);
        qrs.c(intent, componentName.getPackageName(), this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z, boolean z2, boolean z3) {
        HashMap map = new HashMap(16);
        String str2 = "1";
        if (z) {
            map.put("click", "1");
        }
        if (z2) {
            if (!z3) {
                str2 = "0";
            }
            map.put("status", str2);
        }
        lmf.d().c(BaseApplication.getContext(), str, map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
