package com.huawei.indoorequip.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.nfc.NdefMessage;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.basesport.controls.ControlButtonLayout;
import com.huawei.health.device.datatype.IntermitentJumpData;
import com.huawei.health.distributedservice.api.DistributedApi;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.model.SportDetailChartDataType;
import com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportTypeInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.datastruct.SupportDataRange;
import com.huawei.indoorequip.magnet.RealTimeDynamicChartView;
import com.huawei.indoorequip.subscriptionmodel.UiUnsubscribeDataCallback;
import com.huawei.indoorequip.ui.CircleProgressButtonForIndoorEquip;
import com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.det;
import defpackage.era;
import defpackage.erj;
import defpackage.gzv;
import defpackage.hae;
import defpackage.izw;
import defpackage.jaq;
import defpackage.jry;
import defpackage.njy;
import defpackage.nwa;
import defpackage.nwb;
import defpackage.nwd;
import defpackage.nyh;
import defpackage.nyl;
import defpackage.nzc;
import defpackage.nzg;
import defpackage.nzh;
import defpackage.nzi;
import defpackage.nzj;
import defpackage.nzk;
import defpackage.nzn;
import defpackage.nzq;
import defpackage.nzu;
import defpackage.nzv;
import defpackage.nzw;
import defpackage.nzx;
import defpackage.qqz;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class IndoorEquipLandDisplayActivity extends BaseActivityOfIndoorEquip implements View.OnClickListener, UiUnsubscribeDataCallback {
    private int ay;
    private int az;
    private int ba;
    private ImageView bb;
    private ImageView bc;
    private HealthTextView bd;
    private HealthTextView be;
    private ControlButtonLayout bf;
    private RelativeLayout bg;
    private HealthTextView bh;
    private nzk bi;
    private RelativeLayout bj;
    private HealthTextView bk;
    private ImageView bl;
    private HealthTextView bm;
    private boolean bp;
    private LinearLayout bs;
    private int bv;
    private HealthProgressBar bx;
    private int by;
    private ImageView bz;
    private ImageView ca;
    private int cb;
    private ViewStub cc;
    private ViewStub cd;
    private ViewStub ce;
    private ImageView cf;
    private nzg cg;
    private HealthTextView ch;
    private HealthTextView ci;
    private HealthTextView cj;
    private jaq ck;
    private HealthTextView cl;
    private HealthTextView cm;
    private HealthTextView cn;
    private HealthTextView co;
    private HealthTextView cp;
    private HealthTextView cq;
    private int cr;
    private ImageView ct;
    private int cu;
    private HealthTextView cv;
    private long bt = 0;
    private Map<SportDetailChartDataType, BaseRealTimeDynamicChartViewModel> av = new HashMap();
    private boolean bq = false;
    private boolean bu = true;
    private volatile boolean br = false;
    private boolean bo = true;
    private boolean bw = false;
    private boolean bn = false;

    @Override // com.huawei.indoorequip.subscriptionmodel.UiUnsubscribeDataCallback
    public void onResult(Object obj, int i) {
        LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "unregister ui data listener result", Integer.valueOf(i));
    }

    private void ah() {
        this.ai = new Handler(new Handler.Callback() { // from class: nxc
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.e.b(message);
            }
        });
    }

    public /* synthetic */ boolean b(Message message) {
        c(message.what);
        d(message.what);
        b(message.what);
        int i = message.what;
        if (i == 908) {
            LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "in handleMessage, case is FINISH_ACT");
            this.x = true;
            finish();
            return false;
        }
        switch (i) {
            case 1014:
                if (message.obj instanceof HashMap) {
                    LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "MSG_UPDATE_UI", message.obj);
                    HashMap map = (HashMap) message.obj;
                    if (this.as == 283) {
                        d(map);
                        break;
                    } else if (this.bi != null) {
                        a(map);
                        this.bi.d(map);
                        e(map, UnitUtil.f());
                        i(map);
                        break;
                    }
                }
                break;
            case 1015:
                r();
                break;
            case 1016:
                e(((Integer) message.obj).intValue());
                break;
            case 1017:
                LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "MSG_UPDATE_HEART_VIEW heart rate band connect");
                this.o = true;
                r();
                u();
                break;
        }
        return false;
    }

    public void e(int i) {
        HealthProgressBar healthProgressBar = this.bx;
        if (healthProgressBar != null) {
            healthProgressBar.setProgress(i);
        }
        nzg nzgVar = this.cg;
        if (nzgVar != null) {
            nzgVar.d(i);
        }
        if (this.au != null) {
            this.au.d(i);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        super.initViewTahiti();
        r();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "onCreate");
        aw();
        ah();
        this.h = this;
        this.q = new nwb(this, this.ai, false);
        this.k = (DistributedApi) Services.d("DistributedService", DistributedApi.class);
        if (this.k != null) {
            this.k.init(this.h);
            this.k.detectLastWirelessDevice();
        } else {
            LogUtil.e("Track_IDEQ_IndoorEquipLandDisplayActivity", "can not get DistributedApi.");
        }
        this.d = new nwd(null, null, this);
        this.d.c(this.h);
        this.d.e(this.ai);
        clearBackgroundDrawable();
        y();
        Intent intent = getIntent();
        if (intent != null) {
            this.u = getIntent().getBooleanExtra("ExitApp", false);
            this.z = intent.getBooleanExtra("key_is_keep_connect", false);
            a(intent);
        }
        LogUtil.d("Track_IDEQ_IndoorEquipLandDisplayActivity", "acquireDataFromIntent ExitApp ", Boolean.valueOf(this.u));
        if (this.ax != null) {
            this.aq = this.ax.getSportStatus();
        }
        ar();
        r();
    }

    private void a(Intent intent) {
        SportLaunchParams sportLaunchParams = (SportLaunchParams) intent.getParcelableExtra("bundle_key_sport_launch_paras");
        if (sportLaunchParams != null) {
            sportLaunchParams.setLaunchActivity(IndoorEquipLandDisplayActivity.class.getName());
            this.as = sportLaunchParams.getSportType();
            this.ap = sportLaunchParams.getSportTarget();
            this.ao = sportLaunchParams.getTargetValue();
            this.bp = ((Boolean) sportLaunchParams.getExtra("musicPlayConfirm", Boolean.class, false)).booleanValue();
            this.ar = (SupportDataRange) sportLaunchParams.getExtra("supportDataRange", SupportDataRange.class);
            this.p = nwa.n();
            this.p.d(true);
            if (this.as != 0) {
                this.p.e(this.as);
            } else {
                this.as = this.p.p();
            }
            d(sportLaunchParams);
            a(sportLaunchParams, this.ai, this.as);
            this.o = this.o ? true : ((Boolean) sportLaunchParams.getExtra("has_heart_rate_device_connect", Boolean.class, false)).booleanValue();
            LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "setSportLaunchParams: mHasHeartRateDevice=", Boolean.valueOf(this.o));
        }
    }

    private void d(SportLaunchParams sportLaunchParams) {
        if (this.as == 283) {
            this.ak = (String) sportLaunchParams.getExtra("productId", String.class);
            if (this.ap == 8) {
                this.s = (IntermitentJumpData) sportLaunchParams.getExtra("type_intermittent_jump_mode_data", IntermitentJumpData.class, new IntermitentJumpData());
            }
        }
    }

    private void aw() {
        this.ck = new jaq(this.h, new StorageParams(), Integer.toString(20002));
    }

    @Override // com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip
    protected void r() {
        boolean zAf = qrs.af(getApplicationContext());
        LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "initView: isTahitiModel=", Boolean.valueOf(zAf));
        if (zAf) {
            setContentView(R.layout.ie_data_show_landscape_aw70_tahiti);
        } else {
            setContentView(R.layout.ie_data_show_landscape_aw70);
        }
        Window window = getWindow();
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-8193));
        window.addFlags(134217728);
        window.setStatusBarColor(getColor(R.color.hw_show_black_0alpha));
        window.setNavigationBarColor(getColor(R.color.hw_show_black_0alpha));
        ak();
        q();
        a("onCreate");
        ac();
        this.bn = true;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        getWindow().addFlags(128);
        a(BaseDialog.LIFE_CYCLE_ON_RESUME);
        s();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "IndoorEquipLandDisplayActivity, onPause");
        super.onPause();
        if (this.ac && this.af != null) {
            LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "NFC DisableForegroundDispatch");
            this.af.disableForegroundDispatch(this);
        }
        a(BaseDialog.LIFE_CYCLE_ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Parcelable[] parcelableArrayExtra;
        super.onNewIntent(intent);
        LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "enter onNewIntent");
        if (intent != null) {
            if (this.d != null && intent.getBooleanExtra("show tips key", false)) {
                this.d.c(this);
                this.d.c();
            }
            if ("android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction())) {
                LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "onNewIntent, action is equal to ACTION_NDEF_DISCOVERED");
                String str = null;
                try {
                    parcelableArrayExtra = intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES");
                } catch (ArrayIndexOutOfBoundsException unused) {
                    LogUtil.e("Track_IDEQ_IndoorEquipLandDisplayActivity", "onNewIntent ArrayIndexOutOfBoundsException when intent getParcelableArrayExtra.");
                    parcelableArrayExtra = null;
                }
                if (parcelableArrayExtra == null || parcelableArrayExtra.length == 0) {
                    return;
                }
                Parcelable parcelable = parcelableArrayExtra[0];
                NdefMessage ndefMessage = parcelable instanceof NdefMessage ? (NdefMessage) parcelable : null;
                if (ndefMessage != null) {
                    try {
                        if (njy.c(ndefMessage.getRecords(), 0) && ndefMessage.getRecords()[0] != null) {
                            str = new String(ndefMessage.getRecords()[0].getPayload(), "UTF-8");
                        }
                    } catch (UnsupportedEncodingException unused2) {
                        LogUtil.e("Track_IDEQ_IndoorEquipLandDisplayActivity", "onNewIntent, UnsupportedEncodingException");
                    }
                }
                c(str);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "onDestroy");
        if (!this.x && LoginInit.getInstance(this).getIsLogined()) {
            ag();
            if (this.k != null) {
                this.k.setIsInit(false);
            }
        } else {
            LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "normal onDestroy");
            if (this.au != null && !this.bw) {
                this.au.a();
            }
            if (this.k != null && this.v) {
                this.k.destroyWirelessProjection();
                LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "exit the treadmill exercise, you need to disconnect the Projection.");
            }
        }
        a("onDestroy");
        this.p.d(false);
        d();
    }

    private void a(String str) {
        if (this.ax != null) {
            nzc.b(getApplicationContext(), str, this.ax.l());
        }
    }

    private void ag() {
        LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "unnormal onDestroy");
        ThreadPoolManager.c().execute(new Runnable() { // from class: nxa
            @Override // java.lang.Runnable
            public final void run() {
                this.f43875b.ai();
            }
        });
    }

    public /* synthetic */ void ai() {
        SystemClock.sleep(2000L);
        SportLaunchParams sportLaunchParamsE = det.e();
        LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "sportLaunchParams == null", Boolean.valueOf(sportLaunchParamsE == null));
        if (sportLaunchParamsE != null) {
            sportLaunchParamsE.addExtra("musicPlayConfirm", Boolean.valueOf(this.bp));
            if (this.bq) {
                sportLaunchParamsE.addExtra("is_has_aw70", true);
            }
            sportLaunchParamsE.addExtra("has_heart_rate_device_connect", Boolean.valueOf(this.o));
            LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "onDestroy, mHasHeartRateDevice = ", Boolean.valueOf(this.o));
            Intent intent = new Intent();
            sportLaunchParamsE.setRestart(true);
            if (!TextUtils.isEmpty(this.aj)) {
                sportLaunchParamsE.addExtra("sportMode", this.aj);
            }
            if (this.ar != null) {
                sportLaunchParamsE.addExtra("supportDataRange", this.ar);
            }
            intent.addFlags(268435456);
            intent.putExtra("bundle_key_sport_launch_paras", sportLaunchParamsE);
            intent.putExtra("ExitApp", this.u);
            intent.setClass(getApplication(), IndoorEquipDisplayActivity.class);
            getApplication().startActivity(intent);
        }
    }

    private void ak() {
        nzk nzkVar = new nzk(getWindow().getDecorView().getRootView(), this.o, this.ax, this);
        this.bi = nzkVar;
        nzkVar.e(this.ar);
        this.bb = (ImageView) findViewById(R.id.background_layout);
        aj();
        this.f17769b = (HealthProgressBar) findViewById(R.id.hw_recycler_loading_hpb);
        this.i = (ImageView) findViewById(R.id.ie_bt_icon);
        this.bc = (ImageView) findViewById(R.id.ie_bolt_icon);
        this.i.setImageDrawable(nzc.b(this.h, nyh.a(this.as, true)));
        if (this.ax != null && this.ax.p()) {
            this.bc.setVisibility(0);
            this.bc.setImageResource(nzc.a(this.ax.o()));
        }
        this.am = (ImageView) findViewById(R.id.runway);
        this.al = (ImageView) findViewById(R.id.runwayBack);
        if (this.o) {
            if (this.ce != null) {
                RelativeLayout relativeLayout = this.bj;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                }
                ViewGroup.LayoutParams layoutParams = this.ce.getLayoutParams();
                layoutParams.width = -2;
                this.ce.setLayoutParams(layoutParams);
                ao();
            }
        } else {
            az();
        }
        this.bz = (ImageView) findViewById(R.id.ie_music_icon);
        ay();
        av();
        if (this.as == 283) {
            at();
            aq();
        }
        if (this.ax != null) {
            this.ax.w();
        }
    }

    private void aq() {
        this.am.setVisibility(8);
        this.al.setVisibility(8);
        this.bb.setVisibility(8);
    }

    private void az() {
        RelativeLayout relativeLayout = this.bj;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
            this.bb.setVisibility(0);
        }
        if (this.bh == null || this.bd == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, qrs.d((Context) this, 18.0f), 0, 0);
        layoutParams.addRule(3, R.id.distance_value);
        layoutParams.addRule(14);
        this.bd.setLayoutParams(layoutParams);
        bg();
        this.bh.setTextSize(1, 64.0f);
        this.bd.setTextSize(1, 14.0f);
    }

    private void bg() {
        if (qrs.af(getApplicationContext()) && (this.bg.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.bg.getLayoutParams();
            layoutParams.setMargins(0, qrs.d((Context) this, 20.0f), 0, 0);
            layoutParams.addRule(13);
            this.bg.setLayoutParams(layoutParams);
        }
    }

    private void ay() {
        this.cf = (ImageView) findViewById(R.id.horizontal_screen);
        this.bz.setImageDrawable(nzc.b(this.h, R.drawable.ic_rope_music));
        this.cf.setImageDrawable(nzc.b(this.h, R.drawable.ic_rope_horizontalscreen));
        if (this.as == 283) {
            this.cf.setVisibility(8);
            ImageView imageView = (ImageView) findViewById(R.id.ie_rope_screen_icon);
            this.cf = imageView;
            imageView.setVisibility(0);
        }
    }

    private void av() {
        this.ca = (ImageView) findViewById(R.id.ie_miracast_icon);
        if (Utils.c() == 1 && CommonUtil.bg() && CommonUtil.bb()) {
            this.ca.setVisibility(0);
            this.ca.setOnClickListener(this);
        } else {
            this.ca.setVisibility(4);
        }
        this.e = (CircleProgressButtonForIndoorEquip) findViewById(R.id.ie_track_main_page_btn_stop);
        p();
        this.ct = (ImageView) findViewById(R.id.ie_voice_icon);
        if (this.as == 283) {
            this.ca.setVisibility(8);
            this.ct.setVisibility(8);
            ImageView imageView = (ImageView) findViewById(R.id.ie_rope_voice_icon);
            this.ct = imageView;
            imageView.setVisibility(0);
            this.e.setVisibility(8);
        }
        if (nzc.b(this.as)) {
            LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "mVoiceIcon hide");
            this.ct.setVisibility(4);
        } else {
            LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "isRealChineseMainLand");
            this.ct.setOnClickListener(this);
            boolean zA = jaq.a();
            this.bu = zA;
            if (zA) {
                LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "mIsVoiceEnable is:", Boolean.valueOf(zA));
                this.ct.setImageDrawable(getResources().getDrawable(R.drawable.ic_rope_volume));
            } else {
                this.ct.setImageDrawable(getResources().getDrawable(R.drawable.ic_rope_volume_mute));
            }
        }
        al();
        this.cf.setOnClickListener(this);
        bb();
    }

    private void bb() {
        if (nyl.b(this.as)) {
            this.bz.setVisibility(4);
            return;
        }
        this.bz.setVisibility(0);
        int i = R.drawable.ic_rope_music;
        if (LanguageUtil.ba(this.h)) {
            BitmapDrawable bitmapDrawableE = qqz.e(this.h, i);
            if (bitmapDrawableE != null) {
                this.bz.setImageDrawable(bitmapDrawableE);
            }
        } else {
            this.bz.setImageDrawable(getResources().getDrawable(i));
        }
        this.bz.setOnClickListener(this);
    }

    private void aj() {
        if (this.as == 283) {
            return;
        }
        if (this.ax != null && this.ax.b()) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.view_stub_target_mode_with_progress);
            this.cd = viewStub;
            nzg nzgVar = new nzg(viewStub.inflate(), this.ax);
            this.cg = nzgVar;
            nzgVar.a(this.o);
            if (qrs.af(getApplicationContext())) {
                return;
            }
            this.bb.setVisibility(0);
            return;
        }
        ViewStub viewStub2 = (ViewStub) findViewById(R.id.view_stub_heartrate_distance);
        this.ce = viewStub2;
        viewStub2.setVisibility(0);
        this.bh = (HealthTextView) findViewById(R.id.distance_value);
        this.bd = (HealthTextView) findViewById(R.id.distance_unit);
        this.bg = (RelativeLayout) findViewById(R.id.distance_value_layout);
        this.bj = (RelativeLayout) findViewById(R.id.heartrate_layout);
        this.bl = (ImageView) findViewById(R.id.heartrate_image);
        if (this.o) {
            this.bk = (HealthTextView) findViewById(R.id.heartrate_type);
            this.be = (HealthTextView) findViewById(R.id.heartrate_value);
            this.bm = (HealthTextView) findViewById(R.id.heartrate_unit);
            bc();
        }
    }

    private void at() {
        findViewById(R.id.rope_background_layout).setVisibility(0);
        findViewById(R.id.control_button_linearlayout).setVisibility(0);
        this.bf = (ControlButtonLayout) findViewById(R.id.control_button);
        an();
        ViewStub viewStub = (ViewStub) findViewById(R.id.view_stub_rope_second_skipping_rope);
        this.cc = viewStub;
        viewStub.setVisibility(0);
        this.ch = (HealthTextView) findViewById(R.id.tv_rope_left_name);
        this.cl = (HealthTextView) findViewById(R.id.tv_rope_left_value);
        this.cj = (HealthTextView) findViewById(R.id.tv_rope_mid_top_target_type);
        this.co = (HealthTextView) findViewById(R.id.tv_rope_mid_top_target_value);
        this.cn = (HealthTextView) findViewById(R.id.tv_rope_mid_top_target_value_unit);
        this.cm = (HealthTextView) findViewById(R.id.tv_rope_mid_value);
        this.cq = (HealthTextView) findViewById(R.id.tv_rope_mid_bottom_target_value);
        this.bx = (HealthProgressBar) findViewById(R.id.progressbar_rope_mid_target);
        this.cp = (HealthTextView) findViewById(R.id.tv_rope_right_name);
        this.cv = (HealthTextView) findViewById(R.id.tv_rope_right_value);
        this.ci = (HealthTextView) findViewById(R.id.tv_rope_mid_round);
        this.bs = (LinearLayout) findViewById(R.id.ll_rope_mid_target);
        ax();
    }

    private void ax() {
        int i = this.ap;
        if (i == 0) {
            au();
            return;
        }
        if (i != 5) {
            if (i != 6 && i != 7) {
                if (i == 8) {
                    as();
                    return;
                } else if (i != 10 && i != 11) {
                    return;
                }
            }
            am();
            return;
        }
        ap();
    }

    private void am() {
        this.bx.setVisibility(8);
        this.cq.setVisibility(8);
        this.co.setVisibility(8);
        this.ch.setText(this.h.getResources().getString(R.string.IDS_hw_motiontrack_segment_use_time));
        this.cj.setText(this.h.getResources().getString(R.string.IDS_indoor_skipper_jump_num));
        this.cp.setText(this.h.getResources().getString(R.string.IDS_track_total_calories_kcal));
    }

    private void au() {
        this.ch.setText(this.h.getResources().getString(R.string.IDS_indoor_skipper_jump_num));
        this.cj.setText(this.h.getResources().getString(R.string.IDS_hw_motiontrack_segment_use_time));
        this.cq.setText(this.h.getResources().getString(R.string.IDS_indoor_skipper_rope_time, UnitUtil.b((int) this.ao)));
        this.cp.setText(this.h.getResources().getString(R.string.IDS_track_total_calories_kcal));
    }

    private void ap() {
        this.ch.setText(this.h.getResources().getString(R.string.IDS_hw_motiontrack_segment_use_time));
        this.cj.setText(this.h.getResources().getString(R.string.IDS_indoor_skipper_jump_num));
        this.cq.setText(this.h.getResources().getString(R.string.IDS_indoor_skipper_rope_time, this.h.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, (int) this.ao, Integer.valueOf((int) this.ao))));
        this.cp.setText(this.h.getResources().getString(R.string.IDS_track_total_calories_kcal));
    }

    private void as() {
        this.cj.setVisibility(8);
        this.ci.setVisibility(0);
        this.ch.setText(this.h.getResources().getString(R.string.IDS_indoor_skipper_jump_round_num));
        this.cp.setText(this.h.getResources().getString(R.string.IDS_track_total_calories_kcal));
        if (this.s.getIntermittentJumpMode() == 1) {
            this.cq.setText(this.h.getResources().getString(R.string.IDS_indoor_skipper_rope_time, UnitUtil.b((int) this.ao)));
            this.co.setText(this.h.getString(R.string.IDS_indoor_skipper_jump_round_time));
        } else {
            this.cq.setText(this.h.getResources().getString(R.string.IDS_indoor_skipper_rope_time, this.h.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, (int) this.ao, Integer.valueOf((int) this.ao))));
            this.co.setText(this.h.getString(R.string.IDS_indoor_skipper_jump_round_num));
        }
        this.ci.setText(this.h.getString(R.string.IDS_guide_page_num, UnitUtil.e(1.0d, 1, 0), UnitUtil.e(this.s.getIntermittentJumpGroups(), 1, 0)));
    }

    private void an() {
        RelativeLayout relativeLayout = (RelativeLayout) this.bf.findViewById(R.id.layout_StopOrResume);
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = 0;
            relativeLayout.setLayoutParams(layoutParams2);
        }
        this.bf.setClickCallback(new IBaseResponseCallback() { // from class: nxe
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f43883c.a(i, obj);
            }
        });
        if (!era.b(this.as, this.ap)) {
            this.bf.setHidePauseAndStopButton();
        }
        if (this.aq == 2) {
            this.bf.e();
        }
    }

    public /* synthetic */ void a(int i, Object obj) {
        if (this.ax == null) {
            LogUtil.j("Track_IDEQ_IndoorEquipLandDisplayActivity", "mViewModel == null ", Integer.valueOf(i));
            return;
        }
        LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "mControlButtonLayout click code= ", Integer.valueOf(i));
        if (i == 101) {
            this.ax.onPauseSport();
            return;
        }
        if (i == 100) {
            this.ax.onResumeSport();
        } else if (i == 102) {
            this.ax.b(true);
        } else {
            LogUtil.j("Track_IDEQ_IndoorEquipLandDisplayActivity", "error code ", Integer.valueOf(i));
        }
    }

    @Override // com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip, com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        super.onResumeSport();
        ControlButtonLayout controlButtonLayout = this.bf;
        if (controlButtonLayout != null) {
            controlButtonLayout.foldBtnStopAndPlay();
        }
    }

    @Override // com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip, com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        super.onPauseSport();
        if (this.bf != null) {
            runOnUiThread(new Runnable() { // from class: nwy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43874a.ae();
                }
            });
        }
    }

    public /* synthetic */ void ae() {
        this.bf.showBtnStopAndPlay();
    }

    private void bc() {
        boolean z = true;
        boolean z2 = LanguageUtil.aq(this.h) || LanguageUtil.ap(this.h) || LanguageUtil.g(this.h) || LanguageUtil.ax(this.h);
        if (!LanguageUtil.v(this.h) && !LanguageUtil.bn(this.h) && !LanguageUtil.bh(this.h) && !LanguageUtil.aj(this.h)) {
            z = false;
        }
        boolean zC = LanguageUtil.c(this.h);
        if (z2) {
            this.bk.setTextSize(9.0f);
            this.bm.setTextSize(6.0f);
        }
        if (z) {
            this.bk.setTextSize(6.0f);
            this.bm.setTextSize(6.0f);
        }
        if (zC) {
            this.bk.setTextSize(6.0f);
            this.bm.setTextSize(4.0f);
        }
    }

    private void al() {
        SportDetailChartDataType[] sportDetailChartDataTypeArrE;
        BaseRealTimeDynamicChartViewModel baseRealTimeDynamicChartViewModelK;
        if (this.ax == null || (sportDetailChartDataTypeArrE = nyh.e(this.as, this.ax.p(), this.ax.q(), this.ax.s())) == null || sportDetailChartDataTypeArrE.length == 0) {
            return;
        }
        int length = 200 / sportDetailChartDataTypeArrE.length;
        if (nzc.b(this)) {
            length -= 6;
        }
        for (SportDetailChartDataType sportDetailChartDataType : sportDetailChartDataTypeArrE) {
            switch (AnonymousClass5.f17792b[sportDetailChartDataType.ordinal()]) {
                case 1:
                    baseRealTimeDynamicChartViewModelK = k(length);
                    break;
                case 2:
                    baseRealTimeDynamicChartViewModelK = f(length);
                    break;
                case 3:
                    baseRealTimeDynamicChartViewModelK = g(length);
                    break;
                case 4:
                    baseRealTimeDynamicChartViewModelK = j(length);
                    break;
                case 5:
                    baseRealTimeDynamicChartViewModelK = l(length);
                    break;
                case 6:
                    baseRealTimeDynamicChartViewModelK = h(length);
                    break;
                case 7:
                    baseRealTimeDynamicChartViewModelK = a(length);
                    break;
                case 8:
                    baseRealTimeDynamicChartViewModelK = n(length);
                    break;
                case 9:
                    baseRealTimeDynamicChartViewModelK = o(length);
                    break;
                default:
                    baseRealTimeDynamicChartViewModelK = null;
                    break;
            }
            if (baseRealTimeDynamicChartViewModelK != null) {
                baseRealTimeDynamicChartViewModelK.updateConfiguration(this.h);
                this.av.put(sportDetailChartDataType, baseRealTimeDynamicChartViewModelK);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.indoorequip.activity.IndoorEquipLandDisplayActivity$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f17792b;

        static {
            int[] iArr = new int[SportDetailChartDataType.values().length];
            f17792b = iArr;
            try {
                iArr[SportDetailChartDataType.STEP_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17792b[SportDetailChartDataType.GROUND_CONTACT_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17792b[SportDetailChartDataType.GROUND_IMPACT_ACCELERATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17792b[SportDetailChartDataType.ACTIVE_PEAK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17792b[SportDetailChartDataType.REALTIME_PACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17792b[SportDetailChartDataType.PADDLE_FREQUENCY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17792b[SportDetailChartDataType.CADENCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17792b[SportDetailChartDataType.POWER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17792b[SportDetailChartDataType.SPEED_RATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private BaseRealTimeDynamicChartViewModel g(int i) {
        findViewById(R.id.divide_ground_impact_magnet).setVisibility(0);
        RealTimeDynamicChartView realTimeDynamicChartView = (RealTimeDynamicChartView) findViewById(R.id.ground_impact_magnet);
        realTimeDynamicChartView.setVisibility(0);
        b(realTimeDynamicChartView, i);
        b(realTimeDynamicChartView);
        nzi nziVar = new nzi(realTimeDynamicChartView);
        if (nziVar.getTitleTextLength() > 4) {
            nziVar.setSmallTextSize();
        }
        nziVar.setDefaultOrdinateY();
        return nziVar;
    }

    private BaseRealTimeDynamicChartViewModel j(int i) {
        findViewById(R.id.divide_ground_shock_peak).setVisibility(0);
        RealTimeDynamicChartView realTimeDynamicChartView = (RealTimeDynamicChartView) findViewById(R.id.ground_shock_peak);
        realTimeDynamicChartView.setVisibility(0);
        b(realTimeDynamicChartView, i);
        b(realTimeDynamicChartView);
        nzn nznVar = new nzn(realTimeDynamicChartView);
        if (nznVar.getTitleTextLength() > 4) {
            nznVar.setSmallTextSize();
        }
        nznVar.setDefaultOrdinateY();
        return nznVar;
    }

    private BaseRealTimeDynamicChartViewModel f(int i) {
        findViewById(R.id.divide_touchdown_magnet).setVisibility(0);
        RealTimeDynamicChartView realTimeDynamicChartView = (RealTimeDynamicChartView) findViewById(R.id.touchdown_magnet);
        realTimeDynamicChartView.setVisibility(0);
        b(realTimeDynamicChartView, i);
        b(realTimeDynamicChartView);
        nzh nzhVar = new nzh(realTimeDynamicChartView);
        if (nzhVar.getTitleTextLength() > 4) {
            nzhVar.setSmallTextSize();
        }
        nzhVar.setDefaultOrdinateY();
        this.bq = true;
        return nzhVar;
    }

    private BaseRealTimeDynamicChartViewModel k(int i) {
        findViewById(R.id.divide_step_rate_chart).setVisibility(0);
        RealTimeDynamicChartView realTimeDynamicChartView = (RealTimeDynamicChartView) findViewById(R.id.step_rate_chart);
        realTimeDynamicChartView.setVisibility(0);
        b(realTimeDynamicChartView, i);
        b(realTimeDynamicChartView);
        nzw nzwVar = new nzw(realTimeDynamicChartView);
        if (nzwVar.getTitleTextLength() > 4) {
            nzwVar.setSmallTextSize();
        }
        nzwVar.setDefaultOrdinateY();
        return nzwVar;
    }

    private BaseRealTimeDynamicChartViewModel a(int i) {
        findViewById(R.id.divide_cadence_chart).setVisibility(0);
        RealTimeDynamicChartView realTimeDynamicChartView = (RealTimeDynamicChartView) findViewById(R.id.cadence_chart);
        realTimeDynamicChartView.setVisibility(0);
        b(realTimeDynamicChartView, i);
        b(realTimeDynamicChartView);
        nzj nzjVar = new nzj(realTimeDynamicChartView);
        if (this.as == 273) {
            nzjVar.setOrdinateY(0, 120);
            return nzjVar;
        }
        nzjVar.setDefaultOrdinateY();
        return nzjVar;
    }

    private BaseRealTimeDynamicChartViewModel h(int i) {
        findViewById(R.id.divide_paddle_freq_magnet).setVisibility(0);
        RealTimeDynamicChartView realTimeDynamicChartView = (RealTimeDynamicChartView) findViewById(R.id.paddle_freq_magnet);
        realTimeDynamicChartView.setVisibility(0);
        b(realTimeDynamicChartView, i);
        b(realTimeDynamicChartView);
        nzq nzqVar = new nzq(realTimeDynamicChartView, this.aj);
        nzqVar.setDefaultOrdinateY();
        return nzqVar;
    }

    private BaseRealTimeDynamicChartViewModel l(int i) {
        findViewById(R.id.divide_rt_pace_chart).setVisibility(0);
        RealTimeDynamicChartView realTimeDynamicChartView = (RealTimeDynamicChartView) findViewById(R.id.rt_pace_chart);
        realTimeDynamicChartView.setVisibility(0);
        b(realTimeDynamicChartView, i);
        b(realTimeDynamicChartView);
        nzu nzuVar = new nzu(realTimeDynamicChartView);
        nzuVar.setDefaultOrdinateY();
        return nzuVar;
    }

    private BaseRealTimeDynamicChartViewModel o(int i) {
        findViewById(R.id.divide_speed_rate_chart).setVisibility(0);
        RealTimeDynamicChartView realTimeDynamicChartView = (RealTimeDynamicChartView) findViewById(R.id.speed_rate_chart);
        realTimeDynamicChartView.setVisibility(0);
        b(realTimeDynamicChartView, i);
        b(realTimeDynamicChartView);
        nzv nzvVar = new nzv(realTimeDynamicChartView);
        nzvVar.setDefaultOrdinateY();
        return nzvVar;
    }

    private BaseRealTimeDynamicChartViewModel n(int i) {
        findViewById(R.id.divide_power_chart).setVisibility(0);
        RealTimeDynamicChartView realTimeDynamicChartView = (RealTimeDynamicChartView) findViewById(R.id.power_chart);
        realTimeDynamicChartView.setVisibility(0);
        b(realTimeDynamicChartView, i);
        b(realTimeDynamicChartView);
        nzx nzxVar = new nzx(realTimeDynamicChartView);
        nzxVar.setDefaultOrdinateY();
        return nzxVar;
    }

    private void b(RealTimeDynamicChartView realTimeDynamicChartView) {
        if (realTimeDynamicChartView == null) {
            return;
        }
        HealthTextView healthTextView = (HealthTextView) realTimeDynamicChartView.findViewById(R.id.title);
        HealthTextView healthTextView2 = (HealthTextView) realTimeDynamicChartView.findViewById(R.id.value);
        if (qrs.af(getApplicationContext())) {
            healthTextView.setTextSize(0, getResources().getDimension(R.dimen.health_common_16dp));
            healthTextView2.setTextSize(0, getResources().getDimension(R.dimen.textSizeHeadline6));
        } else {
            healthTextView.setTextSize(0, getResources().getDimension(R.dimen.health_common_12dp));
            healthTextView2.setTextSize(0, getResources().getDimension(R.dimen.textSizeHeadline8));
        }
    }

    private void b(RealTimeDynamicChartView realTimeDynamicChartView, int i) {
        if (realTimeDynamicChartView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) realTimeDynamicChartView.getLayoutParams();
            layoutParams.height = qrs.d(this.h, i);
            realTimeDynamicChartView.setLayoutParams(layoutParams);
        }
    }

    private void ar() {
        this.p = nwa.n();
        this.q.b(true);
        this.ae = false;
        this.ah = false;
        this.ac = getPackageManager().hasSystemFeature("android.hardware.nfc");
        LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "this phone supports Nfc? ", Boolean.valueOf(this.ac));
    }

    @Override // com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip
    protected void a(Map<Integer, Object> map) {
        if (!this.bn) {
            LogUtil.e("Track_IDEQ_IndoorEquipLandDisplayActivity", "View is not init.");
            return;
        }
        if (map == null) {
            LogUtil.e("Track_IDEQ_IndoorEquipLandDisplayActivity", "updateUi, indoorEquipDataStructForShow = null");
            return;
        }
        if (this.au != null) {
            this.au.b(map);
        }
        if (this.as == 274) {
            f17768a = ((Float) map.get(26)).floatValue();
        } else {
            Object obj = map.get(3);
            if (obj instanceof Integer) {
                f17768a = ((Integer) obj).intValue() / 100.0f;
            } else {
                LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "updateUi, UiDataType.SPEED is not integer, object = ", obj);
            }
        }
        nzg nzgVar = this.cg;
        if (nzgVar != null) {
            nzgVar.e(map);
        }
    }

    private void i(Map<Integer, Object> map) {
        for (Map.Entry<SportDetailChartDataType, BaseRealTimeDynamicChartViewModel> entry : this.av.entrySet()) {
            SportDetailChartDataType key = entry.getKey();
            BaseRealTimeDynamicChartViewModel value = entry.getValue();
            if (value != null) {
                switch (AnonymousClass5.f17792b[key.ordinal()]) {
                    case 1:
                        value.pushNewData(((Integer) b(map, 4, 0)).intValue(), f17768a);
                        break;
                    case 2:
                    case 3:
                    case 4:
                        d(map, key, value);
                        break;
                    case 5:
                        value.pushNewData(((Integer) b(map, 14, 0)).intValue());
                        break;
                    case 6:
                        value.pushNewData(((Float) b(map, 26, Float.valueOf(0.0f))).floatValue());
                        break;
                    case 7:
                        value.pushNewData(((Integer) b(map, 31, 0)).intValue());
                        break;
                    case 8:
                        value.pushNewData(((Integer) b(map, 7, 0)).intValue());
                        break;
                    case 9:
                        value.pushNewData(((Integer) b(map, 3, 0)).intValue() / 100.0f);
                        break;
                }
            }
        }
    }

    private Object b(Map<Integer, Object> map, int i, Object obj) {
        return (!map.containsKey(Integer.valueOf(i)) || map.get(Integer.valueOf(i)) == null) ? obj : map.get(Integer.valueOf(i));
    }

    private void d(Map<Integer, Object> map, SportDetailChartDataType sportDetailChartDataType, BaseRealTimeDynamicChartViewModel baseRealTimeDynamicChartViewModel) {
        gzv gzvVar = (gzv) map.get(20002);
        if (gzvVar != null && this.r && this.bq) {
            b(gzvVar, sportDetailChartDataType);
        } else if (gzvVar == null && this.bq) {
            baseRealTimeDynamicChartViewModel.pushNewData(0, 0.0f);
        } else {
            LogUtil.e("Track_IDEQ_IndoorEquipLandDisplayActivity", "updateUi, hasRunPostureDevice = ", Boolean.valueOf(this.r));
        }
    }

    private void e(Map<Integer, Object> map, boolean z) {
        String string;
        if (this.ax == null || !this.ax.b()) {
            int iE = e(map, 1);
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            float f = iE / 1000.0f;
            if (z) {
                f *= 0.621371f;
            }
            HealthTextView healthTextView = this.bh;
            if (healthTextView != null) {
                healthTextView.setText(decimalFormat.format(f));
                HealthTextView healthTextView2 = this.bd;
                if (z) {
                    string = getResources().getQuantityString(R.plurals.ie_motiontrack_show_sport_unit_mile, iE, "");
                } else {
                    string = getString(R.string.ie_motiontrack_show_sport_unit_km);
                }
                healthTextView2.setText(string);
            }
            if (this.aj.equals("291")) {
                b(map);
            }
            if (!this.o || this.be == null) {
                return;
            }
            int iE2 = e(map, 20004);
            if (iE2 <= 0 || iE2 > 220) {
                this.be.setText(getString(R.string.ie_motiontrack_detail_heartrate_default));
                this.bm.setText(nzc.d(0, this.h));
            } else {
                this.be.setText(nzc.b(iE2, 1, 0));
                this.bm.setText(nzc.d(iE2, this.h));
            }
            m(iE2);
        }
    }

    private void d(Map<Integer, Object> map) {
        String strE = UnitUtil.e(e(map, 40001), 1, 0);
        String strE2 = UnitUtil.e(e(map, 6), 1, 0);
        int i = this.ap;
        if (i != 0) {
            if (i != 5 && i != 6 && i != 7) {
                if (i == 8) {
                    c(map);
                    this.bx.setProgress(e(map, 10003));
                    return;
                } else if (i != 10 && i != 11) {
                    return;
                }
            }
            this.cl.setText(UnitUtil.e(e(map, 2)));
            this.cm.setText(strE);
            this.cv.setText(strE2);
            return;
        }
        this.cl.setText(strE);
        this.cm.setText(UnitUtil.b(e(map, 2)));
        this.cv.setText(strE2);
    }

    private void c(Map<Integer, Object> map) {
        String string;
        String string2;
        String strB;
        boolean zE = e(map);
        this.bs.setVisibility(zE ? 0 : 8);
        this.ci.setText(this.h.getString(R.string.IDS_guide_page_num, UnitUtil.e(e(map, 40011), 1, 0), UnitUtil.e(this.s.getIntermittentJumpGroups(), 1, 0)));
        this.cv.setText(UnitUtil.e(e(map, zE ? 40057 : 40058), 1, 0));
        String strE = UnitUtil.e(e(map, 40016), 1, 0);
        String strB2 = UnitUtil.b(e(map, 40052));
        if (this.s.getIntermittentJumpMode() == 1) {
            HealthTextView healthTextView = this.ch;
            if (zE) {
                string2 = this.h.getResources().getString(R.string.IDS_indoor_skipper_jump_round_num);
            } else {
                string2 = this.h.getResources().getString(R.string.ids_indoor_skipper_jump_accumulated_count);
            }
            healthTextView.setText(string2);
            String strE2 = UnitUtil.e(e(map, 40013), 1, 0);
            HealthTextView healthTextView2 = this.cl;
            if (!zE) {
                strE = strE2;
            }
            healthTextView2.setText(strE);
            String strB3 = UnitUtil.b(e(map, 40051));
            HealthTextView healthTextView3 = this.cm;
            if (zE) {
                strB2 = strB3;
            }
            healthTextView3.setText(strB2);
            if (zE) {
                strB = UnitUtil.b(this.s.getIntermittentJumpExerciseTime());
            } else {
                strB = UnitUtil.b(this.s.getIntermittentJumpBreakTime());
            }
            this.cq.setText(this.h.getResources().getString(zE ? R.string.IDS_indoor_skipper_rope_time : R.string.IDS_indoor_skipper_rope_sport_rested, strB));
            return;
        }
        HealthTextView healthTextView4 = this.ch;
        if (zE) {
            string = this.h.getResources().getString(R.string.IDS_hw_motiontrack_segment_use_time);
        } else {
            string = this.h.getResources().getString(R.string.ids_indoor_skipper_jump_accumulated_duration);
        }
        healthTextView4.setText(string);
        String strE3 = UnitUtil.e(e(map, 40051));
        String strE4 = UnitUtil.e(e(map, 40014));
        HealthTextView healthTextView5 = this.cl;
        if (!zE) {
            strE3 = strE4;
        }
        healthTextView5.setText(strE3);
        HealthTextView healthTextView6 = this.cm;
        if (!zE) {
            strE = strB2;
        }
        healthTextView6.setText(strE);
        int intermittentJumpExerciseNum = this.s.getIntermittentJumpExerciseNum();
        String quantityString = this.h.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, intermittentJumpExerciseNum, Integer.valueOf(intermittentJumpExerciseNum));
        if (!zE) {
            quantityString = UnitUtil.b(this.s.getIntermittentJumpBreakTime());
        }
        this.cq.setText(this.h.getResources().getString(zE ? R.string.IDS_indoor_skipper_rope_time : R.string.IDS_indoor_skipper_rope_sport_rested, quantityString));
    }

    private boolean e(Map<Integer, Object> map) {
        if (this.as != 283 || this.ap != 8) {
            return true;
        }
        boolean zB = b(map, 40015);
        LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "mIsIntermittentJumpMotion is =", Boolean.valueOf(zB));
        return zB;
    }

    private void b(Map<Integer, Object> map) {
        if (this.bh == null || this.h == null) {
            return;
        }
        this.bh.setText(UnitUtil.e(e(map, 38), 1, 0));
        this.bd.setText(this.h.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_sport_data_time, e(map, 38)));
    }

    private int e(Map<Integer, Object> map, int i) {
        if (map.get(Integer.valueOf(i)) == null) {
            return 0;
        }
        return ((Integer) map.get(Integer.valueOf(i))).intValue();
    }

    private boolean b(Map<Integer, Object> map, int i) {
        if (map.get(Integer.valueOf(i)) == null) {
            return false;
        }
        Object obj = map.get(Integer.valueOf(i));
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    private void b(gzv gzvVar, SportDetailChartDataType sportDetailChartDataType) {
        int iA = gzvVar.a();
        if (sportDetailChartDataType == SportDetailChartDataType.GROUND_CONTACT_TIME) {
            this.av.get(sportDetailChartDataType).pushNewData(iA, f17768a);
        }
        float fO = gzvVar.o();
        if (sportDetailChartDataType == SportDetailChartDataType.ACTIVE_PEAK) {
            this.av.get(sportDetailChartDataType).pushNewData(fO, f17768a);
        }
        int iD = gzvVar.d();
        if (sportDetailChartDataType == SportDetailChartDataType.GROUND_IMPACT_ACCELERATION) {
            this.av.get(sportDetailChartDataType).pushNewData(iD, f17768a);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.ie_voice_icon || id == R.id.ie_rope_voice_icon) {
            nzc.e(getApplicationContext(), "VoiceBtn");
            boolean zA = jaq.a();
            this.bu = !zA;
            if (!zA) {
                this.ct.setImageDrawable(getResources().getDrawable(R.drawable.ic_rope_volume));
            } else {
                this.ct.setImageDrawable(getResources().getDrawable(R.drawable.ic_rope_volume_mute));
            }
            jaq.d(this.bu);
            return;
        }
        if (id == R.id.ie_music_icon) {
            nzc.e(this.h, "MusicBtn");
            if (af()) {
                LogUtil.j("Track_IDEQ_IndoorEquipLandDisplayActivity", "onClick() too fast");
                return;
            }
            if (nzc.d(this.as)) {
                erj.b(this.h, this.as);
                SportMusicController.c().d(this.ck.d(this.as) == null ? 1 : 2, this.as, true);
                return;
            } else {
                if (CommonUtil.bg() && CommonUtil.w(izw.p)) {
                    Intent intent = new Intent("android.intent.action.MUSIC_PLAYER");
                    intent.setFlags(268435456);
                    intent.setPackage(izw.p);
                    startActivity(intent);
                    return;
                }
                LogUtil.j("Track_IDEQ_IndoorEquipLandDisplayActivity", "Don't play music.");
                return;
            }
        }
        if (id == R.id.ie_miracast_icon) {
            nzc.e(getApplicationContext(), "ProjectionBtn");
            if (this.k != null) {
                this.k.startWirelessProjection();
                return;
            }
            return;
        }
        if (id == R.id.horizontal_screen || id == R.id.ie_rope_screen_icon) {
            ba();
        } else {
            LogUtil.d("Track_IDEQ_IndoorEquipLandDisplayActivity", "onClick");
        }
    }

    public boolean af() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.bt < 1000) {
            LogUtil.j("Track_IDEQ_IndoorEquipLandDisplayActivity", "onClick ", "click too fast");
            this.bt = jCurrentTimeMillis;
            return true;
        }
        this.bt = jCurrentTimeMillis;
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        if (z) {
            ba();
        }
    }

    private void ba() {
        this.v = false;
        SportLaunchParams sportLaunchParams = new SportLaunchParams();
        sportLaunchParams.addExtra("is_has_aw70", Boolean.valueOf(this.r));
        sportLaunchParams.addExtra("has_heart_rate_device_connect", Boolean.valueOf(this.o));
        LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "switchToHorizontalScreen: mHasHeartRateDevice = ", Boolean.valueOf(this.o));
        sportLaunchParams.setSportType(this.as);
        sportLaunchParams.setSportTarget(this.ap);
        sportLaunchParams.setTargetValue(this.ao);
        if (this.as == 283) {
            sportLaunchParams.addExtra("productId", this.ak);
            if (this.ap == 8) {
                sportLaunchParams.addExtra("type_intermittent_jump_mode_data", this.s);
            }
        }
        if (!TextUtils.isEmpty(this.aj)) {
            sportLaunchParams.addExtra("sportMode", this.aj);
        }
        sportLaunchParams.addExtra("musicPlayConfirm", Boolean.valueOf(this.bp));
        sportLaunchParams.addExtra("KEY_IS_SWITCH_TO_HORIZONTAL_SCREEN", true);
        if (this.ax != null) {
            sportLaunchParams.addExtra("key_progress", Integer.valueOf(this.ax.n()));
        }
        Intent intent = new Intent(this, (Class<?>) IndoorEquipDisplayActivity.class);
        intent.putExtra("ExitApp", this.u);
        intent.putExtra("key_is_keep_connect", this.z);
        if (this.ar != null) {
            sportLaunchParams.addExtra("supportDataRange", this.ar);
        }
        intent.putExtra("bundle_key_sport_launch_paras", sportLaunchParams);
        this.bw = true;
        if (this.k != null) {
            this.k.setIsCanPreSearch(false);
        }
        b(false);
        startActivity(intent);
        nzc.e(getApplicationContext(), "verticalScreenBtn");
        this.x = true;
        finish();
    }

    private void ao() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.indoorequip.activity.IndoorEquipLandDisplayActivity.1
            @Override // java.lang.Runnable
            public void run() {
                HwSportTypeInfo hwSportTypeInfoB = jry.a(BaseApplication.getContext()).b(IndoorEquipLandDisplayActivity.this.ax.getSportType());
                int heartPostureType = hwSportTypeInfoB == null ? 1 : hwSportTypeInfoB.getHeartPostureType();
                IndoorEquipLandDisplayActivity.this.i(heartPostureType);
                LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "heartPostureType: ", Integer.valueOf(heartPostureType));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int i) {
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            LogUtil.j("Track_IDEQ_IndoorEquipLandDisplayActivity", "userProfileMgrApi is null.");
            return;
        }
        HeartZoneConf heartZoneConfA = hae.a(i, userProfileMgrApi.getLocalUserInfo().getAgeOrDefaultValue());
        LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "======initData====ClassifyMethod: ", Integer.valueOf(this.ay), "mSportType:", Integer.valueOf(this.as));
        this.ay = heartZoneConfA.getClassifyMethod();
        this.bo = heartZoneConfA.isWarningEnble();
        this.cu = heartZoneConfA.getWarningLimitHR();
        this.by = heartZoneConfA.getMaxThreshold();
        int i2 = this.ay;
        if (i2 == 0) {
            this.bv = heartZoneConfA.getAnaerobicThreshold();
            this.az = heartZoneConfA.getAerobicThreshold();
            this.ba = heartZoneConfA.getFatBurnThreshold();
            this.cb = heartZoneConfA.getWarmUpThreshold();
            this.cr = heartZoneConfA.getFitnessThreshold();
        } else if (i2 == 1) {
            this.bv = heartZoneConfA.getAnaerobicAdvanceThreshold();
            this.az = heartZoneConfA.getAnaerobicBaseThreshold();
            this.ba = heartZoneConfA.getLacticAcidThreshold();
            this.cb = heartZoneConfA.getAerobicAdvanceThreshold();
            this.cr = heartZoneConfA.getAerobicBaseThreshold();
        } else if (i2 == 3) {
            LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "mClassifyMethod == 3");
            this.bv = heartZoneConfA.getLthrAnaerobicInterval();
            this.az = heartZoneConfA.getLthrLactateThreshold();
            this.ba = heartZoneConfA.getLthrAerobicHighZone();
            this.cb = heartZoneConfA.getLthrAerobicLowZone();
            this.cr = heartZoneConfA.getLthrRecoveryInterval();
        } else {
            LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "mClassifyMethod other");
        }
        this.br = true;
        LogUtil.a("Track_IDEQ_IndoorEquipLandDisplayActivity", "======initData====ClassifyMethod: ", Integer.valueOf(this.ay), "mIsMaxAlarm:", Boolean.valueOf(this.bo), " mUpLimit", Integer.valueOf(this.cu), " mMaxLimitHeartRate", Integer.valueOf(this.by), " mLimit", Integer.valueOf(this.bv), " mAnaerobic", Integer.valueOf(this.az), " mAerobic", Integer.valueOf(this.ba), " mReduceFat", Integer.valueOf(this.cb), " mWarmUp", Integer.valueOf(this.cr));
    }

    private void e(String str, String str2, String str3) {
        int i = this.ay;
        if (i == 0) {
            this.bk.setText(str);
            return;
        }
        if (i == 1) {
            this.bk.setText(str2);
        } else if (i == 3) {
            this.bk.setText(str3);
        } else {
            LogUtil.e("Track_IDEQ_IndoorEquipLandDisplayActivity", "error mClassifyMethod= ", Integer.valueOf(i));
        }
    }

    private void m(int i) {
        if (!this.br) {
            this.bl.setImageDrawable(getResources().getDrawable(R.drawable.heartrate1));
            this.bk.setText("");
            this.be.setTextColor(-1);
            return;
        }
        int i2 = this.bv;
        if (i >= i2 && i < 255) {
            this.bl.setImageDrawable(getResources().getDrawable(R.drawable.heartrate6));
            this.be.setTextColor(-58880);
            e(getString(R.string.IDS_motiontrack_detail_fm_heart_limit), getString(R.string.IDS_rate_zone_hrr_anaerobicAdvance_threshold), getString(R.string.IDS_lactate_subHeader_top7));
            return;
        }
        int i3 = this.az;
        if (i >= i3 && i < i2) {
            this.bl.setImageDrawable(getResources().getDrawable(R.drawable.heartrate5));
            this.be.setTextColor(-1282048);
            e(getString(R.string.IDS_motiontrack_detail_fm_heart_wynl), getString(R.string.IDS_rate_zone_hrr_anaerobicBase_threshold), getString(R.string.IDS_rate_zone_hrr_lacticAcid_threshold));
            return;
        }
        int i4 = this.ba;
        if (i >= i4 && i < i3) {
            this.bl.setImageDrawable(getResources().getDrawable(R.drawable.heartrate4));
            this.be.setTextColor(-602087);
            e(getString(R.string.IDS_motiontrack_detail_fm_heart_yynl), getString(R.string.IDS_rate_zone_hrr_lacticAcid_threshold), getString(R.string.IDS_rate_zone_hrr_aerobicAdvance_threshold));
            return;
        }
        int i5 = this.cb;
        if (i >= i5 && i < i4) {
            this.bl.setImageDrawable(getResources().getDrawable(R.drawable.heartrate3));
            this.be.setTextColor(-16722343);
            e(getString(R.string.IDS_motiontrack_detail_fm_heart_burn), getString(R.string.IDS_rate_zone_hrr_aerobicAdvance_threshold), getString(R.string.IDS_rate_zone_hrr_aerobicBase_threshold));
        } else if (i >= this.cr && i < i5) {
            this.bl.setImageDrawable(getResources().getDrawable(R.drawable.heartrate2));
            this.be.setTextColor(-11100428);
            e(getString(R.string.IDS_motiontrack_detail_fm_heart_hot), getString(R.string.IDS_rate_zone_hrr_aerobicBase_threshold), getString(R.string.IDS_lactate_subHeader_top8));
        } else {
            this.bl.setImageDrawable(getResources().getDrawable(R.drawable.heartrate1));
            this.bk.setText("");
            this.be.setTextColor(-1);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void setTahitiModelOrientation() {
        setRequestedOrientation(0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void setDefaultOrientation() {
        setRequestedOrientation(0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
