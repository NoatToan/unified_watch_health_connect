package com.huawei.ui.device.activity.adddevice;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LayoutAnimationController;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.media3.common.C;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.google.android.gms.wearable.PutDataRequest;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DeviceDownloadSourceInfo;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack;
import com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwdevice.phoneprocess.mgr.notification.SensitivePermissionStatus;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.AdShowExtras;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.pluginmgr.hwwear.bean.DeviceFittingsBean;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.device.R;
import com.huawei.ui.device.adapter.ScanDeviceAdapter;
import com.huawei.ui.device.utlis.BluetoothPermisionUtils;
import com.huawei.ui.device.views.adddevice.RadarImageView;
import defpackage.cjk;
import defpackage.cmy;
import defpackage.coi;
import defpackage.cqp;
import defpackage.dmp;
import defpackage.dmz;
import defpackage.dxm;
import defpackage.dxx;
import defpackage.ecu;
import defpackage.edm;
import defpackage.edq;
import defpackage.eds;
import defpackage.edt;
import defpackage.edu;
import defpackage.eek;
import defpackage.eel;
import defpackage.emh;
import defpackage.enq;
import defpackage.eqr;
import defpackage.etn;
import defpackage.hcd;
import defpackage.ltd;
import defpackage.lvi;
import defpackage.maq;
import defpackage.njy;
import defpackage.piq;
import defpackage.pjc;
import defpackage.qqp;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.qtk;
import defpackage.qtv;
import defpackage.qtx;
import defpackage.rbe;
import defpackage.rcv;
import defpackage.rdp;
import defpackage.rdt;
import defpackage.rfl;
import defpackage.xjt;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CloudUtils;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class OneKeyScanActivity extends BaseActivity implements DownloadResultCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ScanDeviceAdapter f24144a;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private String ae;
    private rbe af;
    private rbe ah;
    private HealthButton aj;
    private LinearLayout al;
    private d am;
    private int ao;
    private rdp ap;
    private LinearLayout ar;
    private HealthButton at;
    private LinearLayout au;
    private RelativeLayout av;
    private HealthTextView aw;
    private HealthRecycleView ax;
    private RelativeLayout az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private NoTitleCustomAlertDialog f24145b;
    private int ba;
    private HealthTextView bb;
    private RadarImageView bc;
    private BtSwitchStateCallback bd;
    private HealthTextView be;
    private LinearLayout bf;
    private LinearLayout bg;
    private int bh;
    private HealthTextView bi;
    private HealthTextView bj;
    private HealthTextView bk;
    private CustomTitleBar bl;
    private HealthTextView bm;
    private qtx bp;
    private int br;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f24146c;
    private int d;
    private String e;
    private String f;
    private String g;
    private int h;
    private boolean i;
    private Context j;
    private String o;
    private String p;
    private HealthProgressBar q;
    private int r;
    private String s;
    private String t;
    private boolean z;
    private boolean w = false;
    private boolean y = false;
    private boolean ai = false;
    private int aq = 126;
    private PermissionsResultAction as = null;
    private List<String> bo = new ArrayList(16);
    private List<String> m = new ArrayList(16);
    private Map<rbe, Integer> ay = new HashMap(16);
    private List<eds> n = new ArrayList(16);
    private int k = 0;
    private int l = 0;
    private boolean ag = false;
    private boolean x = false;
    private boolean u = false;
    private boolean aa = true;
    private boolean v = false;
    private BroadcastReceiver ak = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                LogUtil.d("OneKeyScanActivity", "mPairBroadcastReceiver intent is null");
                return;
            }
            if ("com.huawei.health.action.PAIR_DEVICE_SUCCESS".equals(intent.getAction())) {
                LogUtil.a("OneKeyScanActivity", "pair device success");
                if (OneKeyScanActivity.this.isFinishing()) {
                    LogUtil.a("OneKeyScanActivity", "this activity is finish");
                    return;
                }
                if (!intent.getBooleanExtra(BasePairManagerJsApi.FROM_H5_KEY, false)) {
                    if (!OneKeyScanActivity.this.v) {
                        OneKeyScanActivity.this.finish();
                    }
                    if (!TextUtils.isEmpty(OneKeyScanActivity.this.ae) && (OneKeyScanActivity.this.ae.startsWith(PutDataRequest.WEAR_URI_SCHEME) || OneKeyScanActivity.this.ae.startsWith("SPORTS_GENIE"))) {
                        LogUtil.a("OneKeyScanActivity", "start connect device item onclick");
                        return;
                    } else {
                        OneKeyScanActivity.this.finish();
                        return;
                    }
                }
                OneKeyScanActivity.this.finish();
            }
        }
    };
    private BroadcastReceiver an = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.15
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                LogUtil.d("OneKeyScanActivity", "NetBroadcastReceiver intent is null");
                return;
            }
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused) {
                LogUtil.c("OneKeyScanActivity", "sleep Exception");
            }
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                if (CommonUtil.ab(OneKeyScanActivity.this.j)) {
                    if (OneKeyScanActivity.this.aa && !OneKeyScanActivity.this.ag) {
                        OneKeyScanActivity.this.bc.e();
                        OneKeyScanActivity.this.bi.setText(R.string.IDS_social_clearup_storage_scaning);
                        OneKeyScanActivity.this.bk.setText(R.string.IDS_device_mgr_device_scaning_title);
                        OneKeyScanActivity.this.bk.setTextColor(OneKeyScanActivity.this.getResources().getColor(R.color.textColorSecondary));
                        OneKeyScanActivity.this.bk.setTextSize(R.dimen.textSizeBody1);
                        OneKeyScanActivity.this.bm.setVisibility(8);
                    }
                    OneKeyScanActivity.this.j();
                    try {
                        if (OneKeyScanActivity.this.an != null) {
                            OneKeyScanActivity oneKeyScanActivity = OneKeyScanActivity.this;
                            oneKeyScanActivity.unregisterReceiver(oneKeyScanActivity.an);
                            OneKeyScanActivity.this.an = null;
                            return;
                        }
                        return;
                    } catch (IllegalArgumentException unused2) {
                        LogUtil.c("OneKeyScanActivity", "unregisterBroadcastReceiver is error");
                        return;
                    }
                }
                LogUtil.d("OneKeyScanActivity", "net work is error");
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
    }

    static /* synthetic */ int ap(OneKeyScanActivity oneKeyScanActivity) {
        int i = oneKeyScanActivity.ba;
        oneKeyScanActivity.ba = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(rbe rbeVar) {
        eds edsVarE;
        List<eds> deviceInfoByBluetooth = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceInfoByBluetooth(rbeVar.c());
        if (dmz.e()) {
            deviceInfoByBluetooth = a(deviceInfoByBluetooth, rbeVar.c(), this.bo);
        }
        if (njy.e(deviceInfoByBluetooth) && !enq.d().c() && !this.z) {
            LogUtil.d("OneKeyScanActivity", "infoBeans is empty");
            return;
        }
        if (!njy.e(this.bo)) {
            edsVarE = c(deviceInfoByBluetooth);
        } else if (this.z) {
            List<DeviceFittingsBean> listA = piq.e().a(this.s, rbeVar.c());
            if (njy.e(listA)) {
                LogUtil.d("OneKeyScanActivity", "fittingDeviceList is empty");
                return;
            }
            List<pjc> listC = piq.e().c(this.s);
            if (njy.e(listC)) {
                LogUtil.d("OneKeyScanActivity", "devicePluginInfoBeanList is empty");
                return;
            }
            edsVarE = e(listA.get(0), listC.get(0));
        } else {
            edsVarE = deviceInfoByBluetooth.get(0);
        }
        if (edsVarE == null) {
            LogUtil.d("OneKeyScanActivity", "infoBean is empty");
            return;
        }
        if (a(edsVarE, rbeVar) || "4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c".equals(edsVarE.aa().get(0))) {
            if (etn.j(edsVarE.aa().get(0))) {
                if (etn.b(emh.b().d(), edsVarE.aa().get(0))) {
                    return;
                }
            } else {
                qtx qtxVar = this.bp;
                if (qtxVar == null || qtxVar.c(edsVarE.aa().get(0), rbeVar.j())) {
                    boolean zC = dxx.c(rbeVar.j());
                    LogUtil.d("OneKeyScanActivity", "mUtil is null:", Boolean.valueOf(this.bp == null));
                    LogUtil.d("OneKeyScanActivity", "device is bonded, productId: ", edsVarE.aa().get(0), ", code: ", CommonUtil.n(rbeVar.j()), ", bluetooth valid: ", Boolean.valueOf(zC));
                    if (zC) {
                        return;
                    }
                }
            }
            if (njy.e(this.bo) && !etn.a(this.j)) {
                return;
            }
        }
        if (dxm.j() || !rbeVar.c().contains("HUAWEI Scale 3-")) {
            b(rbeVar, edsVarE);
        }
    }

    private eds e(DeviceFittingsBean deviceFittingsBean, pjc pjcVar) {
        eds edsVar = new eds();
        edsVar.a(deviceFittingsBean.getBluetoothMatch());
        edsVar.d(deviceFittingsBean.getBluetoothNameList());
        edsVar.c(deviceFittingsBean.getUuid());
        edsVar.a(new DeviceDownloadSourceInfo(null).cloneOldDeviceDownloadSourceInfo(deviceFittingsBean.getDeviceDownloadSourceInfo()));
        edsVar.f(pjcVar.n());
        edsVar.o(pjcVar.l());
        return edsVar;
    }

    private boolean a(eds edsVar, rbe rbeVar) {
        return qtx.b(edsVar.s(), edsVar.aa()) && (!this.ad || !rbeVar.j().equals(this.t));
    }

    private static List<eds> a(List<eds> list, String str, List<String> list2) {
        if (list == null) {
            list = new ArrayList<>(16);
        }
        if (!njy.e(list2) && !TextUtils.isEmpty(str)) {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "ecology_device_module", "ecology_device_bluetooth_name");
            if (!TextUtils.isEmpty(strE) && str.toUpperCase(Locale.ENGLISH).contains(strE.toUpperCase(Locale.ENGLISH))) {
                list.addAll(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceList());
            }
        }
        return list;
    }

    private eds c(List<eds> list) {
        for (eds edsVar : list) {
            if (edsVar != null && !njy.e(edsVar.aa())) {
                ArrayList arrayList = new ArrayList(edsVar.aa());
                arrayList.retainAll(this.bo);
                if (arrayList.size() != 0) {
                    return edsVar;
                }
            }
        }
        return null;
    }

    private void b(rbe rbeVar, eds edsVar) {
        if (this.ay.containsKey(rbeVar)) {
            LogUtil.a("OneKeyScanActivity", "scanDevice already has item: ", rbeVar.c());
            return;
        }
        rbeVar.b(edsVar.l());
        rbeVar.d(edsVar.s());
        if ("b81581e1-5c5a-4e30-b099-0a448ef56a24".equals(edsVar.aa().get(0)) && edsVar.ac() != null && edsVar.ac().get("b81581e1-5c5a-4e30-b099-0a448ef56a24") != null) {
            ArrayList arrayList = new ArrayList(16);
            arrayList.addAll(edsVar.ac().get("b81581e1-5c5a-4e30-b099-0a448ef56a24").g());
            rbeVar.a(arrayList);
        } else {
            rbeVar.a(edsVar.aa());
        }
        LogUtil.a("OneKeyScanActivity", "compareItem item getUuidList: ", rbeVar.l().toString());
        rbeVar.b(edsVar.w());
        rbeVar.e(e(edsVar.n()));
        rbeVar.d(edsVar.p());
        rbeVar.b(edsVar.k());
        rbeVar.a(edsVar.t());
        if (edsVar.m() != null && edsVar.m().size() > 0) {
            rbeVar.a(edsVar.m().get(0).e());
        } else {
            rbeVar.a(edsVar.t());
        }
        rbeVar.c(edsVar.x());
        this.ay.put(rbeVar, Integer.valueOf(rbeVar.n()));
        if (this.bp == null) {
            this.bp = new qtx();
        }
        ArrayList<rbe> arrayListD = this.bp.d(this.ay);
        this.f24144a.c(arrayListD);
        if (arrayListD.size() <= 2 || !this.ab) {
            return;
        }
        ah();
    }

    private void ah() {
        this.ab = false;
        z();
        b();
        d();
        ValueAnimator valueAnimatorAd = ad();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.bc, "translationX", 0.0f, c());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(350L);
        animatorSet.setInterpolator(new rfl(0.2f, 0.0f, 0.2f, 1.0f));
        animatorSet.play(valueAnimatorAd).with(objectAnimatorOfFloat);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.19
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                LogUtil.a("OneKeyScanActivity", "onAnimationStart");
                OneKeyScanActivity.this.be.setVisibility(8);
                OneKeyScanActivity.this.bj.setText(R.string.IDS_social_clearup_storage_scaning);
                OneKeyScanActivity.this.c(true);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                LogUtil.a("OneKeyScanActivity", "onAnimationEnd");
                OneKeyScanActivity.this.c(false);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                LogUtil.e("OneKeyScanActivity", "onAnimationCancel");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                LogUtil.e("OneKeyScanActivity", "onAnimationRepeat");
            }
        });
        animatorSet.start();
    }

    private int c() {
        int iA;
        if (this.br != 0) {
            if (LanguageUtil.ba(this.j)) {
                iA = (this.br / 2) - qqp.a(this.j, 24.0f);
            } else {
                iA = ((-this.br) / 2) + qqp.a(this.j, 24.0f);
            }
        } else if (LanguageUtil.ba(this.j)) {
            iA = qqp.a(this.j, 144.0f);
        } else {
            iA = 0 - qqp.a(this.j, 144.0f);
        }
        if (!(this.bc.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return iA;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.bc.getLayoutParams();
        marginLayoutParams.leftMargin += ((Integer) BaseActivity.getSafeRegionWidth().first).intValue();
        return iA + marginLayoutParams.leftMargin;
    }

    private void d() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(qqp.a(this.j, 115.0f), 0);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.20
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                OneKeyScanActivity.this.bg.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            }
        });
        valueAnimatorOfInt.setDuration(350L);
        valueAnimatorOfInt.setInterpolator(new rfl(0.2f, 0.0f, 0.2f, 1.0f));
        valueAnimatorOfInt.start();
    }

    private void b() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.bi, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.bk, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.bm, "alpha", 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(100L);
        animatorSet.setInterpolator(new rfl(0.2f, 0.0f, 0.2f, 1.0f));
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat3, objectAnimatorOfFloat2);
        animatorSet.start();
    }

    private void z() {
        if (qrs.ac()) {
            LogUtil.a("OneKeyScanActivity", "enter rightTextShow Utils.isThreeFoldFonts()");
            this.bj.setTextSize(1, 30.0f);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.bf, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setStartDelay(250L);
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat.setInterpolator(new rfl(0.2f, 0.0f, 0.2f, 1.0f));
        objectAnimatorOfFloat.start();
    }

    private ValueAnimator ad() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.aq, 24);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.18
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                OneKeyScanActivity.this.bc.b(iIntValue);
                float f = iIntValue * 2;
                OneKeyScanActivity.this.bc.getLayoutParams().height = qqp.a(OneKeyScanActivity.this.j, f);
                OneKeyScanActivity.this.bc.getLayoutParams().width = qqp.a(OneKeyScanActivity.this.j, f);
                OneKeyScanActivity.this.bc.requestLayout();
            }
        });
        return valueAnimatorOfInt;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReleaseLogUtil.d("R_OneKeyScanActivity", "onCreate to enter");
        cancelAdaptRingRegion();
        this.j = this;
        setContentView(R.layout.activity_scan_all);
        getWindow().setFlags(16777216, 16777216);
        clearBackgroundDrawable();
        u();
        t();
        overridePendingTransition(R.anim.activity_no_animation, R.anim.activity_no_animation);
    }

    private void i() {
        rdp.e(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.17
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == -1) {
                    rdp.a(OneKeyScanActivity.this.o, OneKeyScanActivity.this.j, OneKeyScanActivity.this.d);
                } else {
                    cqp.a(100112, OneKeyScanActivity.this.g, String.valueOf(608), String.valueOf(100001));
                    OneKeyScanActivity.this.ag();
                }
            }
        }, this.j);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (CommonUtil.at() || CommonUtil.bd()) {
            adapterView();
        }
    }

    private void s() {
        this.am = new d(this);
        this.bp = new qtx();
        this.ap = new rdp();
        if (getIntent() != null) {
            try {
                this.h = getIntent().getIntExtra("KEY_INTENT_COURSE_ENTRANCE", 0);
                this.f = getIntent().getStringExtra("KEY_INTENT_EQUIPMENT_TYPE");
                this.bh = getIntent().getIntExtra("SPORT_TYPE", 0);
                this.bo = getIntent().getStringArrayListExtra(BasePairManagerJsApi.UUID_LIST);
                this.ai = getIntent().getBooleanExtra("is_scan_to_pair_guide", false);
                this.ac = getIntent().getBooleanExtra("is_go_rope_jump", false);
                this.i = getIntent().getBooleanExtra("is_jump_to_device_detail", false);
                this.ad = getIntent().getBooleanExtra("is_invalidation", false);
                this.p = getIntent().getStringExtra("uniqueId");
                this.z = getIntent().getBooleanExtra("isJumpFromFittings", false);
                this.s = getIntent().getStringExtra("fittings_host_uuid");
                this.e = getIntent().getStringExtra("fittings_host_sn");
            } catch (ArrayIndexOutOfBoundsException unused) {
                LogUtil.c("OneKeyScanActivity", "ArrayIndexOutOfBoundsException get uuid list");
            }
        }
        ObserverManagerUtil.e("SKIP_PRODUCT_INTRODUCTION_FRAGMENT", Integer.valueOf(this.bh));
        ObserverManagerUtil.e("SKIP_START_EXERCISE_UI", Integer.valueOf(this.bh));
        if (this.ai) {
            this.f24146c.setVisibility(8);
            j();
        } else if (njy.e(this.bo)) {
            if (this.z) {
                this.f24146c.setVisibility(8);
            }
            j();
            this.am.sendEmptyMessageDelayed(104, 2000L);
        } else if (njy.e(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceList())) {
            LogUtil.a("OneKeyScanActivity", "initData download device source.");
            j();
            this.am.sendEmptyMessageDelayed(104, 2000L);
        } else {
            this.f24146c.setVisibility(8);
            this.w = true;
            this.x = false;
            this.u = false;
        }
        this.bp.d(AnalyticsValue.ONE_KEY_SCAN_ENTER.value());
    }

    private void t() {
        if (TextUtils.isEmpty(this.p)) {
            LogUtil.d("OneKeyScanActivity", "initInvalidationDeviceInfo mInvalidationUniqueId is null.");
            return;
        }
        MeasurableDevice measurableDeviceB = dmp.d().b(this.p, false);
        if (measurableDeviceB == null || TextUtils.isEmpty(measurableDeviceB.getAddress())) {
            LogUtil.d("OneKeyScanActivity", "initInvalidationDeviceInfo device or address is null.");
        } else if (dxm.y(measurableDeviceB.getProductId())) {
            this.t = dxm.f(measurableDeviceB.getSerialNumber());
        } else {
            this.t = measurableDeviceB.getAddress();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.a("OneKeyScanActivity", "downloadResource");
        ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).addDownloadIndexAllCallBack(this);
        ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexAll();
        this.y = true;
        this.al.setVisibility(8);
        this.ar.setVisibility(8);
    }

    private void ao() {
        LogUtil.a("OneKeyScanActivity", "updateData");
        try {
            this.n.clear();
            List<eds> listM = m();
            if (njy.e(listM)) {
                LogUtil.d("OneKeyScanActivity", "updateData,deviceSingleSeriesInfoBeans is empty");
                xjt.aj("deviceSingleSeriesInfoBeans is empty");
                this.am.sendEmptyMessage(3);
                return;
            }
            this.n.addAll(listM);
            if (!dxm.j()) {
                ArrayList arrayList = new ArrayList(16);
                for (eds edsVar : this.n) {
                    List<String> listAa = edsVar.aa();
                    if (listAa.contains("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4") || listAa.contains("b29df4e3-b1f7-4e40-960d-4cfb63ccca05")) {
                        LogUtil.a("OneKeyScanActivity", "hagrid device");
                    } else {
                        arrayList.add(edsVar);
                    }
                }
                this.n.clear();
                this.n.addAll(arrayList);
            }
            List<cmy> listE = e();
            LogUtil.a("OneKeyScanActivity", "start scan");
            d(ScanMode.BR_BLE, listE);
        } catch (ConcurrentModificationException unused) {
            LogUtil.c("OneKeyScanActivity", "updateData is exception");
            xjt.aj("deviceSingleSeriesInfoBeans is ConcurrentModificationException");
            ab();
        }
    }

    private List<cmy> e() {
        boolean zE = njy.e(this.bo);
        ArrayList arrayList = new ArrayList(16);
        for (eds edsVar : this.n) {
            if (zE) {
                if (edsVar.ab() != 2 || edsVar.j() != 2) {
                    if (njy.e(edsVar.aa()) || !PermissionDialogHelper.d(edsVar.aa().get(0))) {
                        b(arrayList, edsVar);
                    }
                }
            } else {
                arrayList.addAll(d(edsVar));
            }
        }
        return arrayList;
    }

    private List<eds> m() {
        ArrayList arrayList = new ArrayList();
        List<eds> deviceList = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceList();
        if (!njy.e(this.bo)) {
            for (eds edsVar : deviceList) {
                List<String> listAa = edsVar.aa();
                if (listAa != null && !listAa.isEmpty() && listAa.contains(this.bo.get(0))) {
                    arrayList.add(edsVar);
                }
            }
        } else if (eqr.a().b(this.h) || hcd.f36391c.containsKey(Integer.valueOf(this.bh))) {
            edm indexBean = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getIndexBean();
            if (indexBean == null) {
                LogUtil.a("OneKeyScanActivity", "indexAllBean is null");
                return arrayList;
            }
            List<edq> listE = indexBean.e();
            if (njy.e(listE)) {
                LogUtil.a("OneKeyScanActivity", "getDeviceKindBeans is empty");
                return arrayList;
            }
            LogUtil.a("OneKeyScanActivity", "getDeviceKindBeans size is " + listE.size());
            for (edq edqVar : listE) {
                if ((!TextUtils.isEmpty(this.f) && this.f.equals(edqVar.c())) || (hcd.f36391c.containsKey(Integer.valueOf(this.bh)) && ((HealthDevice.HealthDeviceKind) hcd.f36391c.get(Integer.valueOf(this.bh))).name().equals(edqVar.c()))) {
                    arrayList.addAll(edqVar.a());
                    break;
                }
            }
        } else {
            if (!this.z) {
                return deviceList;
            }
            arrayList.addAll(k());
            return arrayList;
        }
        return arrayList;
    }

    private List<eds> k() {
        ArrayList arrayList = new ArrayList(16);
        List<pjc> listC = piq.e().c(this.s);
        if (!njy.e(listC)) {
            pjc pjcVar = listC.get(0);
            List<DeviceFittingsBean> listE = pjcVar.e();
            if (!njy.e(listE)) {
                for (DeviceFittingsBean deviceFittingsBean : listE) {
                    if (deviceFittingsBean != null) {
                        arrayList.add(e(deviceFittingsBean, pjcVar));
                    }
                }
            }
        }
        return arrayList;
    }

    private void ab() {
        this.bc.a();
        this.bk.setText(R.string.IDS_scan_again);
        this.bk.setTextColor(getResources().getColor(R.color.colorAccent));
        this.bk.setTextSize(R.dimen.textSizeButton1);
        this.bm.setVisibility(0);
        this.bi.setText(R.string.IDS_scan_result);
        this.bj.setText(R.string.IDS_scan_result);
        this.be.setVisibility(0);
        ai();
        af();
    }

    private void ai() {
        if (this.bk.hasOnClickListeners()) {
            return;
        }
        this.bk.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.23
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("OneKeyScanActivity", "restart scan");
                if (OneKeyScanActivity.this.f()) {
                    OneKeyScanActivity.this.am();
                } else {
                    OneKeyScanActivity.this.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 102);
                }
            }
        });
    }

    private void af() {
        if (this.ab) {
            this.bb.setVisibility(4);
        } else {
            this.bb.setVisibility(0);
        }
        if (this.bb.hasOnClickListeners()) {
            return;
        }
        this.bb.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.21
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (OneKeyScanActivity.this.f()) {
                    OneKeyScanActivity.this.am();
                } else {
                    OneKeyScanActivity.this.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 102);
                }
            }
        });
    }

    private void b(List<cmy> list, eds edsVar) {
        if (CloudUtils.d()) {
            if (TextUtils.equals(edsVar.y(), "2") || TextUtils.equals(edsVar.y(), "3")) {
                list.addAll(d(edsVar));
                return;
            }
            return;
        }
        if (TextUtils.equals(edsVar.y(), "1") || TextUtils.equals(edsVar.y(), "3")) {
            list.addAll(d(edsVar));
        }
    }

    private void u() {
        LinearLayout linearLayout = (LinearLayout) qsp.a(this, R.id.content);
        View viewInflate = LayoutInflater.from(this.j).inflate(R.layout.activity_scan_all_content, (ViewGroup) null);
        if (qrs.ac()) {
            a(linearLayout, viewInflate);
        } else {
            e(linearLayout, viewInflate);
        }
        this.ab = true;
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.search_custom_title);
        this.bl = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        this.aj = (HealthButton) qsp.a(this, R.id.scan_left_button);
        HealthProgressBar healthProgressBar = (HealthProgressBar) qsp.a(this, R.id.download_progress);
        this.q = healthProgressBar;
        healthProgressBar.b(this, R.color.colorBackground, R.color.emui_accent);
        this.q.setProgress(0);
        this.at = (HealthButton) qsp.a(this, R.id.scan_right_button);
        this.al = (LinearLayout) qsp.a(this, R.id.device_error_bad_layout);
        this.ar = (LinearLayout) qsp.a(this, R.id.device_download_bad_layout);
        this.aw = (HealthTextView) qsp.a(this, R.id.resource_error);
        initView(viewInflate);
        ac();
        y();
        if (qrs.ac()) {
            this.at.setText("  " + this.at.getText().toString() + "  ");
        }
    }

    public void initView(View view) {
        HealthRecycleView healthRecycleView = (HealthRecycleView) qsp.a(view, R.id.scan_device_list);
        this.ax = healthRecycleView;
        healthRecycleView.setNestedScrollingEnabled(false);
        this.f24146c = (LinearLayout) qsp.a(this, R.id.bottom_layout);
    }

    private boolean c(Context context) {
        return LanguageUtil.o(context) || LanguageUtil.q(this.j);
    }

    private void e(LinearLayout linearLayout, View view) {
        linearLayout.addView(view);
    }

    private void a(LinearLayout linearLayout, View view) {
        HealthScrollView healthScrollView = new HealthScrollView(this.j);
        healthScrollView.setVerticalScrollBarEnabled(false);
        healthScrollView.setScrollViewIntercepts(true);
        healthScrollView.addView(view);
        linearLayout.addView(healthScrollView);
    }

    private void ac() {
        this.aj.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.25
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                OneKeyScanActivity.this.ae();
                OneKeyScanActivity.this.bp.d(AnalyticsValue.ONE_KEY_SCAN_MANUAL_ADD.value());
            }
        });
        this.as = new CustomPermissionAction(this) { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.5
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a("OneKeyScanActivity", "mQrCodeAction: onGranted");
                OneKeyScanActivity.this.o();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.a("OneKeyScanActivity", "mQrCodeAction: onDenied");
                OneKeyScanActivity.this.o();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                LogUtil.a("OneKeyScanActivity", "mQrCodeAction: onForeverDenied");
                OneKeyScanActivity.this.o();
            }
        };
        this.at.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                OneKeyScanActivity.this.bp.d(AnalyticsValue.ONE_KEY_SCAN_CLICK_SCAN.value());
                LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.1.1
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        if (i == 0) {
                            PermissionUtil.d(OneKeyScanActivity.this.j, PermissionUtil.PermissionType.CAMERA, OneKeyScanActivity.this.as);
                        }
                    }
                }, "");
            }
        });
        this.bl.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                OneKeyScanActivity.this.onBackPressed();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.j == null) {
            LogUtil.d("OneKeyScanActivity", "gotoScan: mContext is null");
            return;
        }
        this.v = false;
        try {
            Intent intent = new Intent();
            intent.setClassName(this.j, "com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity");
            this.j.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.c("OneKeyScanActivity", "ActivityNotFoundException e:", e.getMessage());
        }
        this.bp.c(this.ak);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        this.v = false;
        this.bp.c(this.ak);
        if (qrs.r()) {
            LogUtil.d("OneKeyScanActivity", "startDeviceList fast click");
            return;
        }
        Intent intent = new Intent();
        intent.setClass(this.j, AllDeviceListActivity.class);
        if (eqr.a().b(this.h)) {
            intent.putExtra("kind_id", this.f);
            intent.putExtra("KEY_INTENT_COURSE_ENTRANCE", this.h);
            intent.putExtra("KEY_INTENT_EQUIPMENT_TYPE", this.f);
        }
        if (hcd.f36391c.containsKey(Integer.valueOf(this.bh))) {
            intent.putExtra("SPORT_TYPE", this.bh);
        }
        intent.putExtra("progressbar", this.ao);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void am() {
        ReleaseLogUtil.d("R_OneKeyScanActivity", "enter startScan mIsScanning: ", Boolean.valueOf(this.ag));
        if (this.ag) {
            return;
        }
        if (this.am == null) {
            LogUtil.d("OneKeyScanActivity", "scanview is not init");
            return;
        }
        if (!BluetoothPermisionUtils.b(this)) {
            this.bc.a();
            this.bi.setText(R.string.IDS_scan_not_start);
            this.bm.setVisibility(8);
            this.aa = false;
            this.bp.d(this.j, this.am, this.bk);
            this.bp.e(this.j, this.am);
            LogUtil.a("OneKeyScanActivity", "startScan BluetoothPermission not granted");
            return;
        }
        if (!f()) {
            LogUtil.a("OneKeyScanActivity", "startScan bluetooth is not open");
            this.bc.a();
            this.bi.setText(R.string.IDS_scan_not_start);
            this.bm.setVisibility(8);
            this.aa = false;
            this.bp.b(this.j, this.bk);
            return;
        }
        if (Build.VERSION.SDK_INT <= 30 && !rdp.b()) {
            this.bc.a();
            this.bi.setText(R.string.IDS_scan_not_start);
            this.bm.setVisibility(8);
            this.aa = false;
            LogUtil.a("OneKeyScanActivity", "startScan GPS service not enable");
            this.bp.c(this.j, this.am, this.bk);
            this.ap.c((Activity) this);
            return;
        }
        if (!this.w) {
            this.aa = true;
            this.bc.e();
            this.bi.setText(R.string.IDS_social_clearup_storage_scaning);
            this.bm.setVisibility(8);
            this.bk.setText(R.string.IDS_device_mgr_device_scaning_title);
            this.bk.setTextColor(getResources().getColor(R.color.textColorSecondary));
            this.bk.setTextSize(R.dimen.textSizeBody1);
            if (this.y) {
                return;
            }
            if (this.u) {
                r();
                return;
            } else {
                if (this.x) {
                    h();
                    return;
                }
                return;
            }
        }
        this.aa = true;
        an();
    }

    private void h() {
        this.bi.setText(R.string.IDS_downlod_device_error);
        this.bm.setVisibility(8);
        this.bk.setText("");
        int i = this.r + 1;
        this.r = i;
        if (i < 2) {
            this.bc.a();
            q();
        } else {
            this.ar.setVisibility(8);
            this.al.setVisibility(8);
            this.q.setVisibility(8);
            g();
        }
    }

    private void g() {
        if (njy.e(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceList())) {
            q();
            this.bc.a();
        } else {
            an();
        }
    }

    private void an() {
        this.bc.e();
        LogUtil.a("OneKeyScanActivity", "enter startScan");
        this.bi.setText(R.string.IDS_social_clearup_storage_scaning);
        this.bk.setText(R.string.IDS_device_mgr_device_scaning_title);
        this.bk.setTextColor(getResources().getColor(R.color.textColorSecondary));
        this.bk.setTextSize(R.dimen.textSizeBody1);
        this.bm.setVisibility(8);
        if (!this.ab) {
            this.bb.setVisibility(4);
            this.bj.setText(R.string.IDS_social_clearup_storage_scaning);
            this.be.setVisibility(8);
        }
        this.f24144a.c((List<rbe>) null);
        if (!f()) {
            this.ag = true;
            this.am.sendEmptyMessageDelayed(3, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
        } else {
            ao();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    private void q() {
        this.ao = 0;
        this.ar.setVisibility(0);
        this.al.setVisibility(8);
        if (this.ar.hasOnClickListeners()) {
            return;
        }
        this.ar.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                OneKeyScanActivity.this.bc.e();
                OneKeyScanActivity.this.bi.setText(R.string.IDS_social_clearup_storage_scaning);
                OneKeyScanActivity.this.bk.setText(R.string.IDS_device_mgr_device_scaning_title);
                OneKeyScanActivity.this.bk.setTextColor(OneKeyScanActivity.this.getResources().getColor(R.color.textColorSecondary));
                OneKeyScanActivity.this.bk.setTextSize(R.dimen.textSizeBody1);
                OneKeyScanActivity.this.bm.setVisibility(8);
                OneKeyScanActivity.this.j();
            }
        });
    }

    private void r() {
        this.bc.a();
        this.bi.setText(R.string.IDS_downlod_device_error);
        this.bk.setText(R.string.IDS_network_check);
        this.bm.setVisibility(8);
        this.ao = 0;
        this.ar.setVisibility(8);
        this.al.setVisibility(0);
        if (this.al.hasOnClickListeners()) {
            return;
        }
        this.al.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                OneKeyScanActivity.this.bp.a(OneKeyScanActivity.this);
            }
        });
    }

    private void d(final ScanMode scanMode, final List<cmy> list) {
        this.ay.clear();
        this.ag = true;
        this.am.sendEmptyMessageDelayed(3, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.8
            @Override // java.lang.Runnable
            public void run() {
                OneKeyScanActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.8.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (enq.d().c()) {
                            OneKeyScanActivity.this.bp.a(OneKeyScanActivity.this.am, OneKeyScanActivity.this.bo, OneKeyScanActivity.this.n);
                        } else {
                            OneKeyScanActivity.this.bp.d(scanMode, list, OneKeyScanActivity.this.am);
                        }
                    }
                });
            }
        });
    }

    private void y() {
        LogUtil.a("OneKeyScanActivity", "enter initRecyclerView");
        this.ax.setLayoutManager(new LinearLayoutManager(this));
        if (this.ax.getItemAnimator() instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) this.ax.getItemAnimator()).setSupportsChangeAnimations(false);
        }
        if (qrs.ac()) {
            this.f24144a = new ScanDeviceAdapter(new BaseRecyclerAdapter.OnItemClickListener<rbe>() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.7
                @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onItemClicked(RecyclerHolder recyclerHolder, int i, rbe rbeVar) {
                    LogUtil.a("OneKeyScanActivity", "enter initRecyclerView isThreeFoldFonts and click position = ", Integer.valueOf(i));
                    OneKeyScanActivity.this.c(recyclerHolder, i, rbeVar);
                }
            }, true);
        } else {
            this.f24144a = new ScanDeviceAdapter(new BaseRecyclerAdapter.OnItemClickListener<rbe>() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.10
                @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onItemClicked(RecyclerHolder recyclerHolder, int i, final rbe rbeVar) {
                    LogUtil.a("OneKeyScanActivity", "enter initRecyclerView and click position = ", Integer.valueOf(i));
                    if (!rbeVar.i().startsWith("continuous_glucose")) {
                        OneKeyScanActivity.this.e(rbeVar);
                        OneKeyScanActivity.this.c(recyclerHolder, i, rbeVar);
                    } else {
                        List<DeviceInfo> listE = rdp.e(OldToNewMotionPath.SPORT_TYPE_TREAD_MACHINE);
                        if (njy.e(listE)) {
                            return;
                        }
                        rdp.d(listE.get(0), OneKeyScanActivity.this, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.10.4
                            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                            /* JADX INFO: renamed from: onResponse */
                            public void a(int i2, Object obj) {
                                if (i2 == 0) {
                                    OneKeyScanActivity oneKeyScanActivity = OneKeyScanActivity.this;
                                    rbe rbeVar2 = rbeVar;
                                    oneKeyScanActivity.c(rbeVar2, rbeVar2.c(), rbeVar.j());
                                }
                            }
                        });
                    }
                }
            });
        }
        this.f24144a.b(new BaseRecyclerAdapter.OnItemClickListener() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.6
            @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
            public void onItemClicked(RecyclerHolder recyclerHolder, int i, Object obj) {
                if (i == 0) {
                    OneKeyScanActivity.this.b(recyclerHolder);
                    return;
                }
                if (obj instanceof rbe) {
                    final rbe rbeVar = (rbe) obj;
                    LogUtil.a("OneKeyScanActivity", "mAdapter onItemClicked position: ", Integer.valueOf(i), " name: ", rbeVar.c());
                    if ("41bfc883-69f1-494e-8f6a-8e545202565c".equals(rbeVar.l().get(0))) {
                        if (LoginInit.getInstance(OneKeyScanActivity.this.j).isKidAccount()) {
                            OneKeyScanActivity.this.d(rbeVar.c());
                            return;
                        }
                        List<DeviceInfo> listE = rdp.e(OldToNewMotionPath.SPORT_TYPE_TREAD_MACHINE);
                        if (njy.e(listE)) {
                            OneKeyScanActivity.this.c(rbeVar, rbeVar.c(), rbeVar.j());
                            return;
                        } else {
                            rdp.d(listE.get(0), OneKeyScanActivity.this, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.6.2
                                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                                /* JADX INFO: renamed from: onResponse */
                                public void a(int i2, Object obj2) {
                                    if (i2 == 0) {
                                        OneKeyScanActivity oneKeyScanActivity = OneKeyScanActivity.this;
                                        rbe rbeVar2 = rbeVar;
                                        oneKeyScanActivity.c(rbeVar2, rbeVar2.c(), rbeVar.j());
                                    }
                                }
                            });
                            return;
                        }
                    }
                    OneKeyScanActivity.this.c(recyclerHolder, i, rbeVar);
                }
            }
        });
        this.ax.setAdapter(this.f24144a);
        this.ax.b(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(String.format(Locale.ENGLISH, getString(R.string.IDS_kid_oobe_pair_tips), str)).c(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("OneKeyScanActivity", "showKidAccountNotSupportPairDialog, click");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(rbe rbeVar, String str, String str2) {
        if (!njy.e(this.bo)) {
            c(str, str2);
            return;
        }
        List<String> listL = rbeVar.l();
        if (njy.e(listL)) {
            LogUtil.d("OneKeyScanActivity", "uuidList is empty");
            return;
        }
        List<pjc> listC = piq.e().c(listL.get(0));
        if (njy.e(listC)) {
            LogUtil.d("OneKeyScanActivity", "beans is empty");
            return;
        }
        pjc pjcVar = listC.get(0);
        String strK = pjcVar.k();
        LogUtil.a("OneKeyScanActivity", "pairGuide,:", strK);
        if (TextUtils.isEmpty(strK)) {
            LogUtil.d("OneKeyScanActivity", "pairGuid is empty");
            return;
        }
        Intent intent = new Intent(this, (Class<?>) PairingGuideActivity.class);
        this.bp.c(this.ak);
        List<String> listS = pjcVar.s();
        if (njy.e(listS)) {
            LogUtil.d("OneKeyScanActivity", "uuidList is empty");
            return;
        }
        if (listS instanceof ArrayList) {
            intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, (ArrayList) listS);
        }
        intent.putExtra("kind_id", pjcVar.n());
        intent.putExtra("pair_guide", strK);
        intent.putExtra("bluetooth_type", pjcVar.d());
        intent.putExtra("bluetooth_name", str);
        intent.putExtra("bluetooth_mac", str2);
        intent.putExtra(AdShowExtras.DOWNLOAD_SOURCE, pjcVar.g());
        startActivity(intent);
    }

    private void c(String str, String str2) {
        rdp.c(str, str2, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(RecyclerHolder recyclerHolder) {
        if (qrs.ac()) {
            this.bb = (HealthTextView) qsp.a(recyclerHolder.itemView, R.id.re_scan_small_text_with_large_font_scale);
            LogUtil.a("OneKeyScanActivity", "mSmallScanAgainText Utils.isThreeFoldFonts()");
            if (!c(this.j)) {
                ((HealthTextView) qsp.a(recyclerHolder.itemView, R.id.re_scan_small_french_text)).setVisibility(8);
            } else {
                ((HealthTextView) qsp.a(recyclerHolder.itemView, R.id.re_scan_small_text)).setVisibility(8);
            }
        } else {
            this.av = (RelativeLayout) qsp.a(recyclerHolder.itemView, R.id.scan_normal_layout);
            this.au = (LinearLayout) qsp.a(recyclerHolder.itemView, R.id.scan_french_layout);
            if (!c(this.j)) {
                this.av.setVisibility(8);
                this.au.setVisibility(0);
                this.bb = (HealthTextView) qsp.a(recyclerHolder.itemView, R.id.re_scan_small_french_text);
            } else {
                this.av.setVisibility(0);
                this.au.setVisibility(8);
                this.bb = (HealthTextView) qsp.a(recyclerHolder.itemView, R.id.re_scan_small_text);
            }
        }
        this.bc = (RadarImageView) qsp.a(recyclerHolder.itemView, R.id.scan_radar);
        RelativeLayout relativeLayout = (RelativeLayout) qsp.a(recyclerHolder.itemView, R.id.scan_layout);
        this.az = relativeLayout;
        relativeLayout.post(new Runnable() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.13
            @Override // java.lang.Runnable
            public void run() {
                OneKeyScanActivity oneKeyScanActivity = OneKeyScanActivity.this;
                oneKeyScanActivity.br = oneKeyScanActivity.az.getWidth();
            }
        });
        this.bg = (LinearLayout) qsp.a(recyclerHolder.itemView, R.id.scan_text_layout);
        HealthTextView healthTextView = (HealthTextView) qsp.a(recyclerHolder.itemView, R.id.scan_text_tip1);
        this.bi = healthTextView;
        healthTextView.setText(R.string.IDS_social_clearup_storage_scaning);
        HealthTextView healthTextView2 = (HealthTextView) qsp.a(recyclerHolder.itemView, R.id.scan_text_tip2);
        this.bk = healthTextView2;
        healthTextView2.setText(R.string.IDS_device_mgr_device_scaning_title);
        this.bm = (HealthTextView) qsp.a(recyclerHolder.itemView, R.id.no_device_found_text_tip);
        if (!c(this.j)) {
            this.be = (HealthTextView) qsp.a(recyclerHolder.itemView, R.id.no_device_found_small_french_text);
            this.bj = (HealthTextView) qsp.a(recyclerHolder.itemView, R.id.scan_small_french_text);
            this.bf = (LinearLayout) qsp.a(recyclerHolder.itemView, R.id.scan_layout_french_small);
        } else {
            this.be = (HealthTextView) qsp.a(recyclerHolder.itemView, R.id.no_device_found_small_text);
            this.bj = (HealthTextView) qsp.a(recyclerHolder.itemView, R.id.scan_small_text);
            this.bf = (LinearLayout) qsp.a(recyclerHolder.itemView, R.id.scan_layout_small);
        }
        p();
        s();
        am();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(rbe rbeVar) {
        edt edtVar;
        if (rbeVar.h() == null || (edtVar = rbeVar.h().get(rbeVar.l().get(0))) == null) {
            return;
        }
        LogUtil.a("OneKeyScanActivity", "deeplink uuid: ", edtVar.c());
        LogUtil.a("OneKeyScanActivity", "deeplink uri: ", edtVar.a());
        LogUtil.a("OneKeyScanActivity", "deeplink pair_format: ", edtVar.e());
    }

    private void c(int i, rbe rbeVar) {
        LogUtil.a("OneKeyScanActivity", "ScanDeviceAdapter mAdapter onItemClicked position: ", Integer.valueOf(i), " name: ", rbeVar.c());
        String strC = this.bp.c(rbeVar);
        if (CompileParameterUtil.c("IS_LUPIN_SUPPORT_PRIVACY", false) && "25c6df38-ca23-11e9-a32f-2a2ae2dbcce4".equals(strC)) {
            this.ah = rbeVar;
            boolean zC = SharedPreferenceManager.c(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
            if (etn.d(BaseApplication.getContext()) && !zC) {
                this.bp.d(this.j, rbeVar, strC);
                return;
            } else {
                a(rbeVar);
                return;
            }
        }
        a(rbeVar);
    }

    private void a(final rbe rbeVar) {
        this.af = rbeVar;
        HashMap map = new HashMap(16);
        map.put("device_name", rbeVar.c());
        map.put("bluetooth_name", rbeVar.m());
        this.bp.e(AnalyticsValue.ONE_KEY_SCAN_CLICK_CONNECT.value(), map);
        LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.12
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                List<String> listL;
                if (i == 0) {
                    if (OneKeyScanActivity.this.c(rbeVar)) {
                        OneKeyScanActivity.this.ah = rbeVar;
                        OneKeyScanActivity.this.bp.a(OneKeyScanActivity.this.ad);
                        OneKeyScanActivity.this.ae = rbeVar.i();
                        OneKeyScanActivity.this.bp.e(OneKeyScanActivity.this.h, OneKeyScanActivity.this.f);
                        qtx qtxVar = OneKeyScanActivity.this.bp;
                        Context context = OneKeyScanActivity.this.j;
                        rbe rbeVar2 = rbeVar;
                        qtxVar.e(context, rbeVar2, rbeVar2.l(), OneKeyScanActivity.this.ak, OneKeyScanActivity.this.ac);
                        return;
                    }
                    if (!qtx.b(rbeVar.i(), rbeVar.l())) {
                        OneKeyScanActivity.this.b(rbeVar);
                        return;
                    }
                    OneKeyScanActivity.this.ah = rbeVar;
                    OneKeyScanActivity.this.bp.a(OneKeyScanActivity.this.ad);
                    OneKeyScanActivity.this.ae = rbeVar.i();
                    OneKeyScanActivity.this.bp.e(OneKeyScanActivity.this.h, OneKeyScanActivity.this.f);
                    if (!OneKeyScanActivity.this.z) {
                        listL = OneKeyScanActivity.this.bo;
                    } else {
                        listL = rbeVar.l();
                        OneKeyScanActivity.this.bp.e(OneKeyScanActivity.this.z);
                        OneKeyScanActivity.this.bp.b(OneKeyScanActivity.this.e);
                    }
                    OneKeyScanActivity.this.bp.e(OneKeyScanActivity.this.j, rbeVar, listL, OneKeyScanActivity.this.ak, OneKeyScanActivity.this.ac);
                }
            }
        }, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(rbe rbeVar) {
        return "SMART_HEADPHONES".equals(rbeVar.i()) && rbeVar.l() != null && rbeVar.l().size() > 0 && "4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c".equals(rbeVar.l().get(0));
    }

    private void p() {
        if (qrs.ah(BaseApplication.getContext())) {
            LogUtil.a("OneKeyScanActivity", "initRadarSize is pad");
            this.bc.getLayoutParams().height = qqp.a(this.j, 272.0f);
            this.bc.getLayoutParams().width = qqp.a(this.j, 272.0f);
            this.bc.e();
            return;
        }
        if (qrs.m() - qrs.s(this.j) < qqp.a(this.j, 640.0f)) {
            LogUtil.a("OneKeyScanActivity", "initRadarSize low phone");
            this.bc.getLayoutParams().height = qqp.a(this.j, 212.0f);
            this.bc.getLayoutParams().width = qqp.a(this.j, 212.0f);
            this.aq = 106;
            this.bc.d(106);
            return;
        }
        LogUtil.a("OneKeyScanActivity", "initRadarSize normal phone");
        this.bc.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        if (z) {
            v();
        }
        this.f24144a.e(z);
    }

    private void v() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, qqp.a(this.j, -50.0f), 0.0f);
        translateAnimation.setDuration(350L);
        this.ax.setLayoutAnimation(new LayoutAnimationController(translateAnimation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(rbe rbeVar) {
        if (TextUtils.isEmpty(rbeVar.i())) {
            LogUtil.d("OneKeyScanActivity", "device kind id is empty");
            return;
        }
        if (!rbeVar.i().startsWith(PutDataRequest.WEAR_URI_SCHEME) && !rbeVar.i().startsWith("SPORTS_GENIE") && !rbeVar.i().startsWith("SMART_HEADPHONES")) {
            LogUtil.d("OneKeyScanActivity", "device not support");
            return;
        }
        this.v = true;
        this.ae = rbeVar.i();
        this.m.clear();
        this.k = rbeVar.a();
        this.l = rbeVar.b();
        this.m.addAll(rbeVar.l());
        this.g = rbeVar.c();
        this.o = rbeVar.j();
        this.d = rbeVar.e();
        ak();
    }

    private void ak() {
        if (isFinishing()) {
            LogUtil.a("OneKeyScanActivity", "this activity is finish");
            return;
        }
        if (!qrs.c(2000)) {
            if (maq.b().f()) {
                LogUtil.a("OneKeyScanActivity", "wear device OTA is in progress");
                this.bp.d(this.j);
                return;
            } else if (w()) {
                LogUtil.d("OneKeyScanActivity", "current device is follow device");
                n();
                return;
            } else {
                l();
                return;
            }
        }
        LogUtil.a("OneKeyScanActivity", "click too fast");
    }

    private void l() {
        LogUtil.a("OneKeyScanActivity", "enter handleDialogByConnectedDevice");
        List<DeviceInfo> listB = rcv.a(BaseApplication.getContext()).b();
        if (listB == null || listB.isEmpty()) {
            LogUtil.d("OneKeyScanActivity", "onClick connectedDeviceInfo is null");
            n();
        } else if (listB.size() == 1) {
            d(listB);
        } else if (listB.size() >= 2) {
            e(listB);
        } else {
            LogUtil.a("OneKeyScanActivity", "more devices");
        }
    }

    private void e(List<DeviceInfo> list) {
        if (x()) {
            for (DeviceInfo deviceInfo : list) {
                if (eel.d(deviceInfo.getProductType())) {
                    LogUtil.a("OneKeyScanActivity", "caseForTwoMoreConnectedDevices aw70 device");
                    this.bp.e(this.j, this.g, deviceInfo, this.am);
                    return;
                }
            }
            return;
        }
        for (DeviceInfo deviceInfo2 : list) {
            if (!eel.d(deviceInfo2.getProductType(), deviceInfo2.getAutoDetectSwitchStatus())) {
                LogUtil.a("OneKeyScanActivity", "onClick user has connect other device, and also wants to connect other device");
                this.bp.e(this.j, this.g, deviceInfo2, this.am);
                return;
            }
        }
    }

    private void d(List<DeviceInfo> list) {
        LogUtil.a("OneKeyScanActivity", "onClick has one connected device");
        DeviceInfo deviceInfo = list.get(0);
        if (deviceInfo == null) {
            LogUtil.d("OneKeyScanActivity", "onClick connected is null");
            return;
        }
        if (eel.d(deviceInfo.getProductType())) {
            d(deviceInfo);
            return;
        }
        if (x()) {
            LogUtil.a("OneKeyScanActivity", "onClick user has connect aw70, and also wants to connect aw70 device");
            n();
            return;
        }
        LogUtil.a("OneKeyScanActivity", "onClick user has connect other device, and also wants to connect other device");
        if ((this.k == 10 && deviceInfo.getDeviceIdentify().equalsIgnoreCase("AndroidWear")) || this.k == -3) {
            n();
        } else {
            this.bp.e(this.j, this.g, deviceInfo, this.am);
        }
    }

    private boolean x() {
        return this.k == 1;
    }

    private boolean w() {
        return this.l == 1;
    }

    private void d(DeviceInfo deviceInfo) {
        if (x()) {
            LogUtil.a("OneKeyScanActivity", "onClick user has connect aw70, and also wants to connect aw70 device");
            this.bp.e(this.j, this.g, deviceInfo, this.am);
        } else if (deviceInfo.getAutoDetectSwitchStatus() == 0) {
            LogUtil.a("OneKeyScanActivity", "onClick user has connect aw70 band mode, and also wants to connect other device");
            this.bp.e(this.j, this.g, deviceInfo, this.am);
        } else if (deviceInfo.getAutoDetectSwitchStatus() == 1) {
            LogUtil.a("OneKeyScanActivity", "onClick user has connect aw70 run mode, and also wants to connect other device");
            n();
        } else {
            LogUtil.a("OneKeyScanActivity", "onClick user has connect aw70 unknown mode, and also wants to connect other device");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final RecyclerHolder recyclerHolder, final int i, final rbe rbeVar) {
        LogUtil.a("OneKeyScanActivity", "enter initRecyclerView and click position = ", Integer.valueOf(i));
        if (BluetoothAdapter.getDefaultAdapter() == null) {
            LogUtil.c("OneKeyScanActivity", "checkBluetoothEnabled BluetoothAdapter or getActivity is null");
            return;
        }
        if (!f()) {
            NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.f24145b;
            if (noTitleCustomAlertDialog != null) {
                if (noTitleCustomAlertDialog.isShowing()) {
                    this.f24145b.dismiss();
                }
                this.f24145b = null;
            }
            String string = getResources().getString(R.string.IDS_app_name_health);
            String string2 = getResources().getString(R.string.IDS_device_bt_open_request_info);
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
            builder.a(String.format(Locale.ENGLISH, string2, string));
            builder.c(R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("OneKeyScanActivity", "checkBluetoothEnabled enable bluetooth");
                    OneKeyScanActivity.this.bd = new BtSwitchStateCallback() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.11.1
                        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
                        public void onBtSwitchStateCallback(int i2) {
                            LogUtil.a("OneKeyScanActivity", "btSwitchState:", Integer.valueOf(i2));
                            OneKeyScanActivity.this.d(i2, recyclerHolder, i, rbeVar);
                        }
                    };
                    BTDeviceMgrUtil.c().c(OneKeyScanActivity.this.bd);
                }
            });
            builder.a(R.string.IDS_device_bt_left_btn_info, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.16
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("OneKeyScanActivity", "checkBluetoothEnabled not to enable bluetooth");
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            this.f24145b = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCancelable(false);
            this.f24145b.show();
            return;
        }
        LogUtil.a("OneKeyScanActivity", "Bluetooth Enabled");
        a(rbeVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, RecyclerHolder recyclerHolder, int i2, rbe rbeVar) {
        if (i == 1) {
            LogUtil.a("OneKeyScanActivity", "checkBluetoothEnabled not to enable bluetooth");
            return;
        }
        if (i != 3) {
            LogUtil.d("OneKeyScanActivity", "Bluetooth unknown state.");
            return;
        }
        LogUtil.a("OneKeyScanActivity", "checkBluetoothEnabled enable bluetooth", 3);
        BTDeviceMgrUtil.c().e(this.bd);
        if (recyclerHolder == null || i2 == -1) {
            LogUtil.a("OneKeyScanActivity", "enable bluetooth checkLoginDownload and click position = ", Integer.valueOf(i2));
            a(rbeVar);
        } else {
            LogUtil.a("OneKeyScanActivity", "enable bluetooth onItemClickedAdapter and click position = ", Integer.valueOf(i2));
            c(i2, rbeVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        ReleaseLogUtil.d("R_OneKeyScanActivity", "gotoConnect deviceMac: ", CommonUtil.n(this.o), ", bluetoothType: ", Integer.valueOf(this.d));
        if (rdp.a(this.j, this.d) && this.af.i().startsWith(PutDataRequest.WEAR_URI_SCHEME)) {
            new HwGetDevicesParameter().setDeviceIdentify(this.o);
            if (!njy.e(ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, null, "OneKeyScanActivity"))) {
                SharedPreferenceManager.a(Integer.toString(1000), "wearable_unpair_reconnection", true);
                ArrayList arrayList = new ArrayList(16);
                arrayList.add(this.o);
                rcv.a(BaseApplication.getContext()).b((List<String>) arrayList, true);
            } else {
                coi.b().e(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.o));
            }
            rdp.d(this.o, this.j, this.d, new View.OnClickListener() { // from class: quc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f46867c.e(view);
                }
            });
            return;
        }
        ag();
    }

    public /* synthetic */ void e(View view) {
        ag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setDeviceUdid(this.g);
        deviceInfo.setUuid(this.o);
        if (!TextUtils.isEmpty(this.ae)) {
            deviceInfo.setDeviceModel(this.ae.toLowerCase(Locale.ENGLISH));
        }
        if (cjk.d().isSupportH5Pair(this.g)) {
            this.bp.c(this.ak);
        }
        this.bp.b(this.j, deviceInfo, this.m);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (qrs.ac() || qrs.v()) {
            LogUtil.a("OneKeyScanActivity", "Utils.isThreeFoldFonts:", Boolean.valueOf(qrs.ac()), "; isLargeFontScaleMode:", Boolean.valueOf(qrs.v()));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ReleaseLogUtil.d("R_OneKeyScanActivity", "onDestroy to enter");
        super.onDestroy();
        al();
        BTDeviceMgrUtil.c().e(this.bd);
        ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).onDownloadIndexAllDestroy();
        d dVar = this.am;
        if (dVar != null) {
            dVar.removeCallbacksAndMessages(null);
        }
        if (this.bp != null) {
            HashMap map = new HashMap(16);
            map.put("device_number", Integer.valueOf(this.ay.size()));
            this.bp.e(AnalyticsValue.ONE_KEY_SCAN_DEVICE_NUMBER.value(), map);
        }
        ltd.d();
        RadarImageView radarImageView = this.bc;
        if (radarImageView != null) {
            radarImageView.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aa() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            BroadcastManagerUtil.a(this, this.an, intentFilter);
        } catch (IllegalArgumentException unused) {
            LogUtil.c("OneKeyScanActivity", "handleDownloadNetError register receiver is error");
        }
    }

    private void aj() {
        try {
            if (this.an != null) {
                LogUtil.a("OneKeyScanActivity", "unregister mNetBroadcastReceiver");
                unregisterReceiver(this.an);
            }
        } catch (IllegalArgumentException unused) {
            LogUtil.c("OneKeyScanActivity", "unregisterNetBroadcast is error");
        }
    }

    private void ap() {
        try {
            if (this.ak != null) {
                LogUtil.a("OneKeyScanActivity", "mPairBroadcastReceiver mReceiver != null");
                LocalBroadcastManager.getInstance().unregisterReceiver(this.ak);
            }
        } catch (IllegalArgumentException unused) {
            LogUtil.c("OneKeyScanActivity", "unregisterPairBroadcast is error");
        }
    }

    private void al() {
        aj();
        ap();
    }

    @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack
    public void setDownloadStatus(int i, int i2) {
        d dVar = this.am;
        if (dVar == null) {
            LogUtil.d("OneKeyScanActivity", "mMyHandler is null");
            return;
        }
        if (i == 1) {
            dVar.sendEmptyMessage(100);
            LogUtil.a("OneKeyScanActivity", "setDownloadStatus , index_all download Success");
            return;
        }
        if (i == 0) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 102;
            messageObtain.obj = Integer.valueOf(i2);
            d dVar2 = this.am;
            if (dVar2 != null) {
                dVar2.sendMessage(messageObtain);
                return;
            }
            return;
        }
        if (i == -2) {
            dVar.sendEmptyMessage(103);
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 101;
        messageObtain2.obj = Integer.valueOf(i);
        this.am.sendMessage(messageObtain2);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("OneKeyScanActivity", "onActivityResult, requestCode: ", Integer.valueOf(i), "resultCode: ", Integer.valueOf(i2));
        if (i == 3) {
            am();
            return;
        }
        if (i == 2) {
            if (rdp.e((Context) this)) {
                LogUtil.a("OneKeyScanActivity", "onActivityResult permission start scan");
                am();
                return;
            } else {
                LogUtil.d("OneKeyScanActivity", "gps permission is not open");
                return;
            }
        }
        if (i == 1) {
            e(i2, intent);
        }
        if (i == 4 && i2 == 1) {
            finish();
        }
        if (i == 102 && f()) {
            am();
        }
        if (i == 1001 && i2 == 3) {
            if (intent == null) {
                LogUtil.d("OneKeyScanActivity", "data is null");
                return;
            }
            this.bp.a(this.j, this.ah, this.bo, intent, this.ak);
        }
        a(i, i2, intent);
    }

    protected void a(int i, int i2, Intent intent) {
        if (i == 608) {
            ReleaseLogUtil.d("R_OneKeyScanActivity", "SENSITIVE_PERMISSION_STATUS resultCode", Integer.valueOf(i2));
            cqp.a(100112, this.g, String.valueOf(i2), String.valueOf(100001));
            if (i2 == -1) {
                if (!TextUtils.isEmpty(this.o)) {
                    BluetoothAdapter.getDefaultAdapter();
                    if (BluetoothAdapter.checkBluetoothAddress(this.o)) {
                        SharedPreferenceManager.c("SENSITIVE_PERMISSION_STATUS", "SENSITIVE_PERMISSION_STATUS", SensitivePermissionStatus.RESTART.getValue());
                        rdp.d("OneKeyScanActivity", this.o, intent);
                        SharedPreferenceManager.a("HEARTBEAT_INFO", "companion_device_manager_flag", true);
                        ag();
                        return;
                    }
                }
                ReleaseLogUtil.d("R_OneKeyScanActivity", "startObservingDevicePresence mDeviceMac: " + this.o + ", is null or invalid.");
                return;
            }
            i();
        }
    }

    private void e(int i, Intent intent) {
        int iC;
        if (i != 2) {
            if (i == 3) {
                a();
                return;
            }
            return;
        }
        setResult(2);
        qtk.c();
        String str = this.g;
        if (str != null) {
            iC = lvi.c(str);
            LogUtil.a("OneKeyScanActivity", "mDeviceName is ", this.g, " deviceType is ", Integer.valueOf(iC));
        } else {
            iC = -1;
        }
        Map<String, Integer> mapC = qtv.c(i, false, iC, true);
        intent.putExtra("is_jump_to_device_detail", this.i);
        qtv.e(intent, this, mapC);
        a();
    }

    private void a() {
        if (isFinishing()) {
            return;
        }
        finish();
    }

    private List<cmy> d(eds edsVar) {
        ArrayList arrayList = new ArrayList(16);
        if (!njy.e(edsVar.d())) {
            for (String str : edsVar.d()) {
                cmy.a aVar = new cmy.a();
                int iA = this.bp.a(edsVar.e());
                if (iA != 0) {
                    aVar.b(iA);
                    aVar.a(str);
                    arrayList.add(aVar.c());
                }
            }
            if (edsVar.ac() != null && !njy.e(this.bo)) {
                LogUtil.a("OneKeyScanActivity", "bluetoothNameSecondDeal: ", this.bo.get(0));
                e(edsVar, arrayList);
            }
            if (dmz.e()) {
                etn.b(arrayList, this.bp.a(edsVar.e()));
            }
        }
        return arrayList;
    }

    private void e(eds edsVar, List<cmy> list) {
        edu eduVar = edsVar.ac().get(this.bo.get(0));
        if (eduVar == null) {
            return;
        }
        List<String> listA = eduVar.a();
        String strE = eduVar.e();
        if (listA == null || listA.size() <= 0) {
            return;
        }
        list.clear();
        for (String str : listA) {
            cmy.a aVar = new cmy.a();
            int iA = this.bp.a(strE);
            if (iA != 0) {
                aVar.b(iA);
                aVar.a(str);
                list.add(aVar.c());
            }
        }
    }

    private String e(String str) {
        File fileE;
        edm indexBean = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getIndexBean();
        if (indexBean == null) {
            return "";
        }
        String strB = indexBean.b();
        if (TextUtils.isEmpty(strB)) {
            return "";
        }
        String str2 = eek.c() + strB;
        File fileC = eek.c(str2);
        if (fileC == null || (fileE = eek.e(str2)) == null) {
            return "";
        }
        List<String> listE = eek.e(str, eek.b(fileC), eek.b(fileE));
        if (listE.size() > 0) {
            return listE.get(0);
        }
        LogUtil.d("OneKeyScanActivity", "getDeviceContext,value is empty");
        return "";
    }

    public static class d extends Handler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<OneKeyScanActivity> f24162c;

        d(OneKeyScanActivity oneKeyScanActivity) {
            this.f24162c = new WeakReference<>(oneKeyScanActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            OneKeyScanActivity oneKeyScanActivity = this.f24162c.get();
            if (oneKeyScanActivity == null) {
                LogUtil.c("OneKeyScanActivity", "handleMessage mActivity is null");
            }
            if (message != null) {
                super.handleMessage(message);
                ReleaseLogUtil.d("R_OneKeyScanActivity", "handleMessage msg.what :", Integer.valueOf(message.what));
                int i = message.what;
                if (i == 1) {
                    if (message.obj instanceof rbe) {
                        oneKeyScanActivity.d((rbe) message.obj);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    oneKeyScanActivity.ag = false;
                    return;
                }
                if (i == 3) {
                    c(oneKeyScanActivity);
                    return;
                }
                if (i == 4) {
                    oneKeyScanActivity.am();
                    return;
                }
                if (i == 5) {
                    oneKeyScanActivity.n();
                    return;
                }
                switch (i) {
                    case 100:
                        b(oneKeyScanActivity);
                        break;
                    case 101:
                        xjt.aj("download error");
                        a(message, oneKeyScanActivity);
                        break;
                    case 102:
                        c(message, oneKeyScanActivity);
                        break;
                    case 103:
                        d(oneKeyScanActivity);
                        break;
                    case 104:
                        a(oneKeyScanActivity);
                        break;
                    default:
                        LogUtil.d("OneKeyScanActivity", "handleMessage default");
                        break;
                }
            }
        }

        private void a(OneKeyScanActivity oneKeyScanActivity) {
            if (oneKeyScanActivity.y && oneKeyScanActivity.aa && new File(eek.e()).exists() && !oneKeyScanActivity.w) {
                oneKeyScanActivity.w = true;
                oneKeyScanActivity.am();
            }
        }

        private void b(OneKeyScanActivity oneKeyScanActivity) {
            oneKeyScanActivity.y = false;
            oneKeyScanActivity.q.setVisibility(8);
            oneKeyScanActivity.ar.setVisibility(8);
            oneKeyScanActivity.al.setVisibility(8);
            oneKeyScanActivity.ao = 100;
            oneKeyScanActivity.w = true;
            oneKeyScanActivity.u = false;
            oneKeyScanActivity.x = false;
            if (oneKeyScanActivity.bp != null) {
                HashMap map = new HashMap(16);
                map.put("download_result", "0");
                oneKeyScanActivity.bp.e(AnalyticsValue.ONE_KEY_SCAN_RESOURCE_DOWNLOAD_RESULT.value(), map);
            }
            if (oneKeyScanActivity.aa) {
                oneKeyScanActivity.am();
            }
        }

        private void c(Message message, OneKeyScanActivity oneKeyScanActivity) {
            if (message.obj instanceof Integer) {
                oneKeyScanActivity.y = true;
                oneKeyScanActivity.q.setVisibility(0);
                oneKeyScanActivity.al.setVisibility(8);
                oneKeyScanActivity.al.setVisibility(8);
                int iIntValue = ((Integer) message.obj).intValue();
                oneKeyScanActivity.q.setProgress(iIntValue);
                oneKeyScanActivity.ao = iIntValue;
            }
        }

        private void a(Message message, OneKeyScanActivity oneKeyScanActivity) {
            oneKeyScanActivity.y = false;
            oneKeyScanActivity.q.setVisibility(8);
            oneKeyScanActivity.x = true;
            oneKeyScanActivity.u = false;
            if (message.obj instanceof Integer) {
                int iIntValue = ((Integer) message.obj).intValue();
                oneKeyScanActivity.ao = 0;
                if (iIntValue == -3) {
                    oneKeyScanActivity.aw.setText(R.string.IDS_download_error_storage);
                } else {
                    oneKeyScanActivity.aw.setText(R.string.IDS_no_device_res);
                }
            }
            if (oneKeyScanActivity.bp != null) {
                HashMap map = new HashMap(16);
                map.put("download_result", "1");
                oneKeyScanActivity.bp.e(AnalyticsValue.ONE_KEY_SCAN_RESOURCE_DOWNLOAD_RESULT.value(), map);
                rdt.b(100099, "");
            }
            if (oneKeyScanActivity.aa) {
                oneKeyScanActivity.am();
            }
        }

        private void d(OneKeyScanActivity oneKeyScanActivity) {
            oneKeyScanActivity.y = false;
            oneKeyScanActivity.aa();
            oneKeyScanActivity.q.setVisibility(8);
            oneKeyScanActivity.x = false;
            oneKeyScanActivity.u = true;
            oneKeyScanActivity.ao = 0;
            if (oneKeyScanActivity.bp != null) {
                HashMap map = new HashMap(16);
                map.put("download_result", "2");
                oneKeyScanActivity.bp.e(AnalyticsValue.ONE_KEY_SCAN_RESOURCE_DOWNLOAD_RESULT.value(), map);
            }
            if (oneKeyScanActivity.aa) {
                oneKeyScanActivity.am();
            }
        }

        private void c(OneKeyScanActivity oneKeyScanActivity) {
            oneKeyScanActivity.bc.a();
            LogUtil.a("OneKeyScanActivity", "scan failed");
            oneKeyScanActivity.bk.setText(R.string.IDS_scan_again);
            oneKeyScanActivity.bk.setTextColor(oneKeyScanActivity.getResources().getColor(R.color.colorAccent));
            oneKeyScanActivity.bk.setTextSize(R.dimen.textSizeButton1);
            oneKeyScanActivity.bm.setVisibility(0);
            h(oneKeyScanActivity);
            e(oneKeyScanActivity);
            f(oneKeyScanActivity);
            oneKeyScanActivity.ag = false;
        }

        private void e(OneKeyScanActivity oneKeyScanActivity) {
            if (!oneKeyScanActivity.f24144a.e().isEmpty() && oneKeyScanActivity.f24144a.e().size() > 1) {
                oneKeyScanActivity.bi.setText(R.string.IDS_scan_result);
                oneKeyScanActivity.bj.setText(R.string.IDS_scan_result);
                oneKeyScanActivity.bm.setVisibility(0);
                oneKeyScanActivity.be.setVisibility(0);
                oneKeyScanActivity.ba = 0;
                return;
            }
            OneKeyScanActivity.ap(oneKeyScanActivity);
            oneKeyScanActivity.bi.setText(R.string.IDS_no_device_found);
            oneKeyScanActivity.bj.setText(R.string.IDS_no_device_found);
            oneKeyScanActivity.be.setVisibility(8);
            oneKeyScanActivity.bm.setVisibility(8);
            if (!njy.e(oneKeyScanActivity.bo) || oneKeyScanActivity.ba < 2) {
                return;
            }
            oneKeyScanActivity.bp.e(oneKeyScanActivity.j, oneKeyScanActivity.bk);
        }

        private void h(final OneKeyScanActivity oneKeyScanActivity) {
            if (oneKeyScanActivity.bk.hasOnClickListeners()) {
                return;
            }
            oneKeyScanActivity.bk.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.d.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("OneKeyScanActivity", "restart scan");
                    if (oneKeyScanActivity.f()) {
                        if (!njy.e(oneKeyScanActivity.bo)) {
                            oneKeyScanActivity.am();
                            return;
                        } else {
                            if (oneKeyScanActivity.ba < 2) {
                                oneKeyScanActivity.am();
                                return;
                            }
                            return;
                        }
                    }
                    oneKeyScanActivity.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 102);
                }
            });
        }

        private void f(final OneKeyScanActivity oneKeyScanActivity) {
            if (oneKeyScanActivity.ab) {
                oneKeyScanActivity.bb.setVisibility(4);
            } else {
                oneKeyScanActivity.bb.setVisibility(0);
            }
            if (oneKeyScanActivity.bb.hasOnClickListeners()) {
                return;
            }
            oneKeyScanActivity.bb.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.OneKeyScanActivity.d.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (oneKeyScanActivity.f()) {
                        oneKeyScanActivity.am();
                    } else {
                        oneKeyScanActivity.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 102);
                    }
                }
            });
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        LogUtil.a("OneKeyScanActivity", "cancel to select device");
        ObserverManagerUtil.e("DEVICE_ASSOCIATION", 152);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
