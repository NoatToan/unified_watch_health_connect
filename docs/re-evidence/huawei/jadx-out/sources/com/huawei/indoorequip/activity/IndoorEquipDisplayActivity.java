package com.huawei.indoorequip.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.basesport.controls.ControlButtonLayout;
import com.huawei.health.basesport.sportui.OnEndCountdownListener;
import com.huawei.health.device.base.AbstractFitnessClient;
import com.huawei.health.device.datatype.IntermitentJumpData;
import com.huawei.health.distributedservice.api.DistributedApi;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController;
import com.huawei.healthcloud.plugintrack.ui.viewholder.CountdownDialog;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.datastruct.SupportDataRange;
import com.huawei.indoorequip.ui.CircleProgressButtonForIndoorEquip;
import com.huawei.indoorequip.ui.DataFirstPageFragment;
import com.huawei.indoorequip.ui.DataSecondPageFragment;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.columnlayout.HealthColumnRelativeLayout;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.det;
import defpackage.elh;
import defpackage.elo;
import defpackage.era;
import defpackage.jaa;
import defpackage.jaq;
import defpackage.lql;
import defpackage.njy;
import defpackage.nwa;
import defpackage.nwb;
import defpackage.nwd;
import defpackage.nyi;
import defpackage.nyk;
import defpackage.nyl;
import defpackage.nzc;
import defpackage.qqv;
import defpackage.qqz;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.StorageParams;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class IndoorEquipDisplayActivity extends BaseActivityOfIndoorEquip implements View.OnClickListener {
    private nyk av;
    private RelativeLayout ay;
    private nyi az;
    private ControlButtonLayout ba;
    private LinearLayout bc;
    private LinearLayout be;
    private DataFirstPageFragment bf;
    private int bh;
    private List<Fragment> bn;
    private ImageView bo;
    private b bp;
    private DataSecondPageFragment bs;
    private SportLaunchParams bt;
    private HealthViewPager bu;
    private ImageView bw;
    private long bv = 0;
    private String bl = e(Locale.getDefault());
    private boolean bk = false;
    private boolean bm = false;
    private final int bd = 2;
    private final int br = 0;
    private final int bq = 1;
    private boolean bj = true;
    private boolean bi = false;
    private int bg = 0;
    private CountdownDialog bb = null;

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void setDefaultOrientation() {
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void setTahitiModelOrientation() {
    }

    private void aj() {
        this.ai = new Handler(new Handler.Callback() { // from class: com.huawei.indoorequip.activity.IndoorEquipDisplayActivity.3
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                IndoorEquipDisplayActivity.this.c(message.what);
                IndoorEquipDisplayActivity.this.b(message.what);
                IndoorEquipDisplayActivity.this.d(message.what);
                int i = message.what;
                if (i != 908) {
                    switch (i) {
                        case 1014:
                            if (IndoorEquipDisplayActivity.this.bf != null && (message.obj instanceof HashMap)) {
                                LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "MSG_UPDATE_UI", message.obj);
                                HashMap map = (HashMap) message.obj;
                                IndoorEquipDisplayActivity.this.a(map);
                                IndoorEquipDisplayActivity.this.bf.b(map);
                                if (IndoorEquipDisplayActivity.this.bs != null) {
                                    IndoorEquipDisplayActivity.this.bs.b(map);
                                } else {
                                    LogUtil.e("Track_IDEQ_IndoorEquipDisplayActivity", "mSecondPageFragment = null");
                                }
                                break;
                            }
                            break;
                        case 1015:
                            IndoorEquipDisplayActivity.this.r();
                            break;
                        case 1016:
                            int iIntValue = ((Integer) message.obj).intValue();
                            IndoorEquipDisplayActivity.this.bf.d(iIntValue);
                            if (IndoorEquipDisplayActivity.this.au != null) {
                                IndoorEquipDisplayActivity.this.au.d(iIntValue);
                            }
                            break;
                        case 1017:
                            LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "MSG_UPDATE_HEART_VIEW heart rate band connect");
                            IndoorEquipDisplayActivity.this.o = true;
                            if (IndoorEquipDisplayActivity.this.bf != null) {
                                IndoorEquipDisplayActivity.this.bf.i();
                            }
                            IndoorEquipDisplayActivity.this.u();
                            break;
                    }
                    return false;
                }
                LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "in handleMessage, case is FINISH_ACT");
                IndoorEquipDisplayActivity.this.x = true;
                IndoorEquipDisplayActivity.this.finish();
                return false;
            }
        });
    }

    @Override // com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip, com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        super.onResumeSport();
        ControlButtonLayout controlButtonLayout = this.ba;
        if (controlButtonLayout != null) {
            controlButtonLayout.foldBtnStopAndPlay();
        }
    }

    @Override // com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip, com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        super.onPauseSport();
        if (this.ba != null) {
            runOnUiThread(new Runnable() { // from class: nxb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43876a.ae();
                }
            });
        }
    }

    public /* synthetic */ void ae() {
        this.ba.showBtnStopAndPlay();
    }

    @Override // com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip
    protected void r() {
        LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "initView");
        as();
        q();
        nzc.a(getApplicationContext(), "onCreate");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.bv;
        long j2 = jElapsedRealtime - j;
        if (j > 0 && j2 > 0 && j2 < 1000) {
            LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "initView and will do interceptNfcMessageAndDisplayProjection");
            s();
        } else {
            LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "initView and will NOT do interceptNfcMessageAndDisplayProjection");
        }
        ar();
        if (nyl.e(this.as)) {
            LogUtil.e("Track_IDEQ_IndoorEquipDisplayActivity", "rope jumping reject display");
        } else {
            ac();
        }
    }

    private void an() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.count_down_view);
        this.ay = relativeLayout;
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.indoorequip.activity.IndoorEquipDisplayActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.j("Track_IDEQ_IndoorEquipDisplayActivity", " the countdown view can't click");
            }
        });
        CountdownDialog countdownDialog = new CountdownDialog(this.h, getWindow().getDecorView().getRootView());
        this.bb = countdownDialog;
        countdownDialog.addEndCountdown(new OnEndCountdownListener() { // from class: com.huawei.indoorequip.activity.IndoorEquipDisplayActivity.5
            @Override // com.huawei.health.basesport.sportui.OnEndCountdownListener
            public void endCountdown() {
                IndoorEquipDisplayActivity.this.ay.setVisibility(8);
                IndoorEquipDisplayActivity.this.be();
                if (IndoorEquipDisplayActivity.this.bf != null) {
                    IndoorEquipDisplayActivity.this.bf.a();
                }
            }
        });
        this.bb.setTimeStart(5);
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemClock.sleep(2000L);
            SportLaunchParams sportLaunchParamsE = det.e();
            LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "sportLaunchParams == null", Boolean.valueOf(sportLaunchParamsE == null));
            if (sportLaunchParamsE != null) {
                if (IndoorEquipDisplayActivity.this.as == 283) {
                    sportLaunchParamsE.addExtra("productId", IndoorEquipDisplayActivity.this.ak);
                }
                sportLaunchParamsE.addExtra("is_course", Boolean.valueOf(IndoorEquipDisplayActivity.this.w));
                sportLaunchParamsE.addExtra("musicPlayConfirm", Boolean.valueOf(IndoorEquipDisplayActivity.this.bm));
                if (IndoorEquipDisplayActivity.this.bs != null) {
                    sportLaunchParamsE.addExtra("is_has_aw70", true);
                }
                sportLaunchParamsE.addExtra("has_heart_rate_device_connect", Boolean.valueOf(IndoorEquipDisplayActivity.this.o));
                if (IndoorEquipDisplayActivity.this.ax != null && IndoorEquipDisplayActivity.this.ax.d() != null) {
                    sportLaunchParamsE.addExtra(MatterDataContans.KEY_MAC_ADDRESS, IndoorEquipDisplayActivity.this.ax.d().getBtMac());
                    sportLaunchParamsE.addExtra("deviceName", IndoorEquipDisplayActivity.this.ax.d().getBtName());
                }
                Intent intent = new Intent();
                sportLaunchParamsE.setRestart(true);
                if (IndoorEquipDisplayActivity.this.ar != null) {
                    sportLaunchParamsE.addExtra("supportDataRange", IndoorEquipDisplayActivity.this.ar);
                }
                intent.putExtra("bundle_key_sport_launch_paras", sportLaunchParamsE);
                intent.addFlags(268435456);
                intent.setClass(IndoorEquipDisplayActivity.this.getApplication(), IndoorEquipDisplayActivity.class);
                IndoorEquipDisplayActivity.this.getApplication().startActivity(intent);
            }
        }
    }

    private void a(boolean z) {
        SharedPreferences.Editor editorEdit;
        LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "editKillBySelf ", Boolean.valueOf(z));
        Context context = this.h;
        Context context2 = this.h;
        SharedPreferences sharedPreferences = context.getSharedPreferences("IndoorEquipServiceRunning", 0);
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        editorEdit.putBoolean("isKillBySelf", z);
        editorEdit.apply();
    }

    @Override // com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip
    protected void c() {
        DataSecondPageFragment dataSecondPageFragment;
        super.c();
        this.bf.e();
        if (!au() || (dataSecondPageFragment = this.bs) == null) {
            return;
        }
        dataSecondPageFragment.a();
    }

    @Override // com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip
    protected void h() {
        DataSecondPageFragment dataSecondPageFragment;
        super.h();
        DataFirstPageFragment dataFirstPageFragment = this.bf;
        if (dataFirstPageFragment != null) {
            dataFirstPageFragment.c();
        }
        if (!au() || (dataSecondPageFragment = this.bs) == null) {
            return;
        }
        dataSecondPageFragment.d();
    }

    @Override // com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip
    protected void i() {
        DataSecondPageFragment dataSecondPageFragment;
        super.i();
        DataFirstPageFragment dataFirstPageFragment = this.bf;
        if (dataFirstPageFragment != null) {
            dataFirstPageFragment.c();
        }
        if (!au() || (dataSecondPageFragment = this.bs) == null) {
            return;
        }
        dataSecondPageFragment.d();
    }

    @Override // com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip
    protected void j() {
        DataSecondPageFragment dataSecondPageFragment;
        super.j();
        DataFirstPageFragment dataFirstPageFragment = this.bf;
        if (dataFirstPageFragment != null) {
            dataFirstPageFragment.b();
        }
        if (!au() || (dataSecondPageFragment = this.bs) == null) {
            return;
        }
        dataSecondPageFragment.e();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.voice_image) {
            nzc.e(getApplicationContext(), "VoiceBtn");
            this.bj = !jaq.a();
            bg();
            jaq.d(this.bj);
            return;
        }
        if (id == R.id.horizontal_screen) {
            LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "mCurrentOrientation = ", Integer.valueOf(this.bh), " hasRunPostureDevice = ", Boolean.valueOf(this.r));
            this.v = false;
            bh();
            return;
        }
        LogUtil.e("Track_IDEQ_IndoorEquipDisplayActivity", "onClick viewId is not used.");
    }

    private void bh() {
        nzc.e(getApplicationContext(), "horizontalScreenBtn");
        SportLaunchParams sportLaunchParams = new SportLaunchParams();
        sportLaunchParams.setSportType(this.as);
        sportLaunchParams.addExtra("musicPlayConfirm", Boolean.valueOf(this.bm));
        sportLaunchParams.addExtra("KEY_IS_SWITCH_TO_HORIZONTAL_SCREEN", true);
        sportLaunchParams.addExtra("has_heart_rate_device_connect", Boolean.valueOf(this.o));
        LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "startLandActivity mHasHeartRateDevice =  ", Boolean.valueOf(this.o));
        if (!TextUtils.isEmpty(this.aj)) {
            sportLaunchParams.addExtra("sportMode", this.aj);
        }
        sportLaunchParams.setSportTarget(this.ap);
        sportLaunchParams.setTargetValue(this.ao);
        sportLaunchParams.addExtra("productId", this.ak);
        if (this.ax != null) {
            sportLaunchParams.addExtra("key_progress", Integer.valueOf(this.ax.n()));
        }
        if (this.as == 283 && this.ap == 8) {
            sportLaunchParams.addExtra("type_intermittent_jump_mode_data", this.s);
        }
        b(false);
        Intent intent = new Intent(this, (Class<?>) IndoorEquipLandDisplayActivity.class);
        if (this.ar != null) {
            sportLaunchParams.addExtra("supportDataRange", this.ar);
        }
        intent.putExtra("bundle_key_sport_launch_paras", sportLaunchParams);
        intent.putExtra("ExitApp", this.u);
        intent.putExtra("key_is_keep_connect", this.z);
        this.bk = true;
        startActivity(intent);
        this.x = true;
        finish();
    }

    public static boolean a(Context context, int i) {
        return CommonUtil.bh() && jaa.c(context) && new jaq(context, new StorageParams(), Integer.toString(20002)).h(i) == 1 && nzc.d(i);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "onSaveInstanceState");
        if (bundle == null) {
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle.remove("android:support:fragments");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "onDestroy");
        if (!this.x && LoginInit.getInstance(this).getIsLogined()) {
            LogUtil.j("Track_IDEQ_IndoorEquipDisplayActivity", "unnormal onDestroy");
            List<Fragment> list = this.bn;
            if (list != null) {
                list.clear();
            }
            this.bp = new b();
            ThreadPoolManager.c().execute(this.bp);
            if (this.k != null) {
                this.k.setIsInit(false);
            }
        } else {
            LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "normal onDestroy");
            this.aa = false;
            if (this.au != null && !this.bk && !this.bi) {
                this.au.a();
            }
            if (this.k != null && this.v) {
                this.k.destroyWirelessProjection();
            }
            a(false);
        }
        nzc.a(getApplicationContext(), "onDestroy");
        this.p = nwa.n();
        this.p.c(false);
        d();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        super.initViewTahiti();
        a(true);
        r();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "onConfigurationChanged");
        super.onConfigurationChanged(configuration);
        boolean zAx = ax();
        this.bi = zAx;
        LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "isLanguageChanged = ", Boolean.valueOf(zAx));
        if (this.bi) {
            bb();
        } else if (qrs.ah(this.h.getApplicationContext())) {
            a(true);
            r();
        } else {
            LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "onConfigurationChanged is not pad");
        }
    }

    private void bb() {
        Intent intent = new Intent();
        SportLaunchParams sportLaunchParams = new SportLaunchParams();
        sportLaunchParams.setSportType(this.as);
        intent.putExtra("bundle_key_sport_launch_paras", sportLaunchParams);
        intent.setClass(this, IndoorEquipDisplayActivity.class);
        this.x = true;
        finish();
        startActivity(intent);
    }

    private boolean ax() {
        String strE = e(Locale.getDefault());
        if (strE.equals(this.bl)) {
            return false;
        }
        this.bl = strE;
        return true;
    }

    private String e(Locale locale) {
        if (locale == null) {
            return "";
        }
        return locale.getLanguage() + Constants.LINK + locale.getCountry();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "will do onResume and do interceptNfcMessageAndDisplayProjection later");
        getWindow().addFlags(128);
        nzc.a(getApplicationContext(), BaseDialog.LIFE_CYCLE_ON_RESUME);
        s();
        this.bv = SystemClock.elapsedRealtime();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Parcelable[] parcelableArrayExtra;
        super.onNewIntent(intent);
        LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "onNewIntent");
        if (intent != null) {
            if (this.d != null && intent.getBooleanExtra("show tips key", false)) {
                this.d.c(this);
                this.d.c();
            }
            if ("android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction())) {
                LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "onNewIntent, action is ACTION_NDEF_DISCOVERED");
                String str = null;
                try {
                    parcelableArrayExtra = intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES");
                } catch (ArrayIndexOutOfBoundsException unused) {
                    LogUtil.e("Track_IDEQ_IndoorEquipDisplayActivity", "onNewIntent ArrayIndexOutOfBoundsException");
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
                        LogUtil.e("Track_IDEQ_IndoorEquipDisplayActivity", "onNewIntent, UnsupportedEncodingException");
                    }
                }
                c(str);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "IndoorEquipDisplayActivity, onPause");
        super.onPause();
        this.bv = 0L;
        if (this.ac && this.af != null) {
            LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "NFC DisableForegroundDispatch");
            this.af.disableForegroundDispatch(this);
        }
        nzc.a(getApplicationContext(), BaseDialog.LIFE_CYCLE_ON_PAUSE);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "onCreate");
        this.h = this;
        aj();
        cancelMarginAdaptation();
        this.q = new nwb(this, this.ai, false);
        this.k = (DistributedApi) Services.d("DistributedService", DistributedApi.class);
        if (this.k != null) {
            this.k.init(this.h);
            this.k.detectLastWirelessDevice();
        } else {
            LogUtil.e("Track_IDEQ_IndoorEquipDisplayActivity", "can not get DistributedApi.");
        }
        this.d = new nwd(null, this, null);
        this.d.c(this.h);
        this.d.e(this.ai);
        ak();
        clearBackgroundDrawable();
        setContentView(R.layout.display_activity_layout);
        y();
        ap();
        r();
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1024);
        getWindow().addFlags(134217728);
        getWindow().addFlags(128);
    }

    private void ak() {
        Intent intent = getIntent();
        if (intent != null) {
            this.u = intent.getBooleanExtra("ExitApp", false);
            LogUtil.d("Track_IDEQ_IndoorEquipDisplayActivity", "acquireDataFromIntent ExitApp ", Boolean.valueOf(this.u));
            this.z = intent.getBooleanExtra("key_is_keep_connect", false);
            SportLaunchParams sportLaunchParams = (SportLaunchParams) intent.getParcelableExtra("bundle_key_sport_launch_paras");
            this.bt = sportLaunchParams;
            if (sportLaunchParams != null) {
                this.as = sportLaunchParams.getSportType();
                this.bt.setLaunchActivity(IndoorEquipDisplayActivity.class.getName());
                this.bm = ((Boolean) this.bt.getExtra("musicPlayConfirm", Boolean.class, false)).booleanValue();
                this.ar = (SupportDataRange) this.bt.getExtra("supportDataRange", SupportDataRange.class);
                this.ap = this.bt.getSportTarget();
                this.ao = this.bt.getTargetValue();
                if (this.as == 283) {
                    this.ak = (String) this.bt.getExtra("productId", String.class);
                    ao();
                    ba();
                }
                this.p = nwa.n();
                this.p.c(true);
                if (this.as == 283) {
                    this.p.e(AbstractFitnessClient.ACTION_GATT_STATE_CONNECTED);
                }
                if (this.as != 0) {
                    this.p.e(this.as);
                } else {
                    this.as = this.p.p();
                }
                a(this.bt, this.ai, this.as);
                this.o = this.o ? true : ((Boolean) this.bt.getExtra("has_heart_rate_device_connect", Boolean.class, false)).booleanValue();
                LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "acquireDataFromIntent: mHasHeartRateDevice = ", Boolean.valueOf(this.o));
                this.ax.d((String) this.bt.getExtra(MatterDataContans.KEY_MAC_ADDRESS, String.class), (String) this.bt.getExtra("deviceName", String.class));
                this.aq = this.ax.getSportStatus();
            }
        }
    }

    private void ao() {
        if (this.ap == 8) {
            this.s = (IntermitentJumpData) this.bt.getExtra("type_intermittent_jump_mode_data", IntermitentJumpData.class, new IntermitentJumpData());
        }
    }

    private void ap() {
        this.bh = getResources().getConfiguration().orientation;
        this.p = nwa.n();
        this.q.b(true);
        this.ae = false;
        this.ah = false;
        this.ac = getPackageManager().hasSystemFeature("android.hardware.nfc");
        LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "this phone supports Nfc? ", Boolean.valueOf(this.ac));
    }

    private void ar() {
        Context context = this.h;
        Context context2 = this.h;
        SharedPreferences sharedPreferences = context.getSharedPreferences("IndoorEquipServiceRunning", 0);
        if (sharedPreferences != null) {
            this.aa = sharedPreferences.getBoolean("isKillBySelf", false);
        }
        if (!this.aa && av()) {
            this.ay.setVisibility(0);
            this.ay.bringToFront();
            this.bb.startCountdown();
        } else {
            this.ay.setVisibility(8);
        }
        if (this.bt == null || !nyl.e(this.as) || this.aa || !this.bt.isRestart()) {
            return;
        }
        az();
    }

    private boolean av() {
        SportLaunchParams sportLaunchParams = this.bt;
        if (sportLaunchParams == null) {
            return false;
        }
        return (!nyl.e(this.as) || this.bt.isRestart() || ((Boolean) sportLaunchParams.getExtra("KEY_IS_SWITCH_TO_HORIZONTAL_SCREEN", Boolean.class, false)).booleanValue()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void be() {
        if (this.ax != null) {
            this.ax.onStartSport();
        }
    }

    private void az() {
        be();
    }

    private void as() {
        ImageView imageView;
        aw();
        an();
        nyk nykVar = new nyk(getSupportFragmentManager(), this.bn);
        this.av = nykVar;
        this.bu.setAdapter(nykVar);
        this.bu.setCurrentItem(0);
        int i = this.bg;
        if (i != 0) {
            LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "initData mCurrentSelectedPosition is", Integer.valueOf(i));
            this.bu.setCurrentItem(this.bg);
        }
        this.bu.addOnPageChangeListener(new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.indoorequip.activity.IndoorEquipDisplayActivity.1
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i2, float f, int i3) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i2) {
                IndoorEquipDisplayActivity.this.bg = i2;
                if (i2 == 1) {
                    LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "setOnPageChangeListener position = 1");
                } else if (i2 != 0 || !IndoorEquipDisplayActivity.this.r) {
                    LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "setOnPageChangeListener position:", Integer.valueOf(i2));
                } else {
                    LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "setOnPageChangeListener position = 0 && hasRunPostureDevice = true");
                }
            }
        });
        al();
        aq();
        ay();
        if (this.ax != null) {
            this.ax.w();
        }
        am();
        if (!isInMultiWindowMode() || (imageView = this.bo) == null) {
            return;
        }
        imageView.setVisibility(8);
    }

    private void am() {
        this.e = (CircleProgressButtonForIndoorEquip) findViewById(R.id.track_main_page_btn_stop);
        p();
        if (this.as == 283) {
            this.e.setVisibility(8);
        } else {
            this.bc.setVisibility(8);
        }
    }

    private void aq() {
        this.bc = (LinearLayout) findViewById(R.id.control_button_linearlayout);
        ControlButtonLayout controlButtonLayout = (ControlButtonLayout) findViewById(R.id.control_button);
        this.ba = controlButtonLayout;
        controlButtonLayout.setClickCallback(new IBaseResponseCallback() { // from class: nwz
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.d(i, obj);
            }
        });
        this.ba.setScreenSwitchLength(this.bo, this.bw);
        if (this.as == 283) {
            this.ba.setPauseButtonPading();
        }
    }

    public /* synthetic */ void d(int i, Object obj) {
        if (this.ax == null) {
            LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "mViewModel == null ", Integer.valueOf(i));
            return;
        }
        LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "mControlButtonLayout click code= ", Integer.valueOf(i));
        if (i == 101) {
            this.ax.onPauseSport();
            return;
        }
        if (i == 100) {
            this.ax.onResumeSport();
        } else if (i == 102) {
            this.ax.b(true);
        } else {
            LogUtil.j("Track_IDEQ_IndoorEquipDisplayActivity", "error code ", Integer.valueOf(i));
        }
    }

    private void ba() {
        elh elhVarD = ResourceManager.c().d(this.ak);
        if (elhVarD == null) {
            LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "saveDeviceName productInfo is null");
            return;
        }
        String strA = elo.a(this.ak, elhVarD.l().d());
        this.bt.addExtra("deviceName", strA);
        SharedPreferences.Editor editorEdit = BaseApplication.getContext().getSharedPreferences("device_name", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString("device_name_key", strA);
            editorEdit.apply();
        }
    }

    private void ay() {
        if (!era.b(this.as, this.ap)) {
            this.ba.setHidePauseAndStopButton();
        }
        if (this.aq == 2) {
            this.ba.d();
        }
    }

    private void al() {
        if (lql.a(this.h)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.indoorequip.activity.IndoorEquipDisplayActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "updateProductMapConfig is ", Boolean.valueOf(lql.b(IndoorEquipDisplayActivity.this.h, 2)));
                }
            });
        } else {
            LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "loadProductMapConfig is ", Boolean.valueOf(ProductMapParseUtil.a(this.h)));
        }
    }

    private void aw() {
        this.bl = e(Locale.getDefault());
        this.am = (ImageView) findViewById(R.id.runway);
        this.al = (ImageView) findViewById(R.id.runwayBackground);
        this.be = (LinearLayout) findViewById(R.id.dots_layout);
        this.bo = (ImageView) findViewById(R.id.horizontal_screen);
        this.bw = (ImageView) findViewById(R.id.voice_image);
        this.bu = (HealthViewPager) findViewById(R.id.mViewPager);
        bc();
        if (nzc.b(this.as)) {
            LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "mVoiceIcon hide");
            this.bw.setVisibility(4);
        } else {
            this.bw.setOnClickListener(this);
            this.bj = jaq.a();
            bg();
        }
        this.bo.setOnClickListener(this);
        if (this.az == null) {
            this.az = new nyi(this.h, this.be, 2);
        }
        this.bu.addOnPageChangeListener(this.az);
        this.bn = new ArrayList(16);
        Bundle bundle = new Bundle();
        bundle.putInt("deviceType", this.as);
        bundle.putInt("currentSkipperTargetType", this.ap);
        bundle.putInt("currentSkipperTarget", (int) this.ao);
        if (this.as == 283 && this.ap == 8) {
            bundle.putParcelable("type_intermittent_jump_mode_data", this.s);
        }
        this.bf = DataFirstPageFragment.c(bundle);
        if (at()) {
            this.bs = new DataSecondPageFragment();
            this.bn.add(this.bf);
            this.bn.add(this.bs);
        } else {
            this.be.setVisibility(8);
            this.bn.add(this.bf);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        ImageView imageView = this.bo;
        if (imageView == null) {
            LogUtil.j("Track_IDEQ_IndoorEquipDisplayActivity", "onMultiWindowModeChanged mScreenSwitch is null.");
        } else {
            imageView.setVisibility(z ? 8 : 0);
        }
    }

    private void bg() {
        if (this.bj) {
            this.bw.setImageDrawable(getResources().getDrawable(R.drawable.ic_rope_volume));
        } else {
            this.bw.setImageDrawable(getResources().getDrawable(R.drawable.ic_rope_volume_mute));
        }
    }

    private void bc() {
        BitmapDrawable bitmapDrawableE;
        int dimensionPixelOffset;
        if (this.as == 283) {
            LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "set skipping");
            try {
                findViewById(R.id.linearlayout_display).setBackgroundResource(R.drawable.ic_ropeskipping_bg);
            } catch (Resources.NotFoundException unused) {
                LogUtil.e("Track_IDEQ_IndoorEquipDisplayActivity", "Resources NotFoundException");
            }
            this.am.setVisibility(8);
            this.al.setVisibility(8);
            if (!"1".equals(era.a("pageVersion", this.ak))) {
                this.bo.setVisibility(4);
            }
            this.bo.setImageDrawable(getResources().getDrawable(R.drawable.ic_rope_horizontalscreen));
            this.bu.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (qqv.c(this.h)) {
                dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.health_common_20dp);
            } else {
                dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.health_common_0dp);
            }
            layoutParams.bottomMargin = dimensionPixelOffset;
            ((RelativeLayout) findViewById(R.id.bottom_layout)).setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = 0;
            layoutParams2.addRule(14);
            ((HealthColumnRelativeLayout) findViewById(R.id.btn_layout)).setLayoutParams(layoutParams2);
            bd();
            return;
        }
        if (!LanguageUtil.ba(this.h) || (bitmapDrawableE = qqz.e(this.h, R.drawable.ic_rope_horizontalscreen)) == null) {
            return;
        }
        this.bo.setImageDrawable(bitmapDrawableE);
    }

    private void bd() {
        int iD = qrs.d(this.h, 50.0f);
        if (this.bw != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iD, iD);
            layoutParams.addRule(15);
            layoutParams.addRule(21);
            this.bw.setLayoutParams(layoutParams);
        }
        ImageView imageView = this.bo;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                layoutParams3.width = iD;
                layoutParams3.height = iD;
                this.bo.setLayoutParams(layoutParams3);
            }
        }
    }

    private boolean at() {
        if (this.as == 283) {
            return false;
        }
        if (au()) {
            return true;
        }
        return (this.as == 264 || this.as == 281) ? false : true;
    }

    private boolean au() {
        if (this.ax != null) {
            return this.ax.t() || this.ax.p();
        }
        return false;
    }

    public boolean ag() {
        return this.o;
    }

    public boolean af() {
        return this.ax != null && this.ax.p();
    }

    public int ah() {
        if (this.ax == null) {
            return 0;
        }
        return this.ax.o();
    }

    @Override // com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip
    protected void a(Map<Integer, Object> map) {
        if (this.ai == null) {
            return;
        }
        if (this.aq == 1 && !this.bm && a(this.h, this.as) && SportMusicController.c().h() != null) {
            SportMusicController.c().e(this.as);
            this.bm = true;
            LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "play song list:", Integer.valueOf(SportMusicController.c().h().getState()));
        }
        if (map == null) {
            return;
        }
        LogUtil.a("Track_IDEQ_IndoorEquipDisplayActivity", "indoorEquipData: ", map.toString());
        if (this.au != null) {
            this.au.b(map);
        }
        if (this.as == 274 && (map.get(26) instanceof Float)) {
            f17768a = ((Float) map.get(26)).floatValue();
        } else if (this.as != 283 && (map.get(3) instanceof Integer)) {
            f17768a = ((Integer) map.get(3)).intValue() / 100.0f;
        } else {
            LogUtil.e("Track_IDEQ_IndoorEquipDisplayActivity", "mSportType is ", Integer.valueOf(this.as));
        }
    }

    public void ai() {
        if (this.k != null) {
            this.k.startWirelessProjection();
        }
    }
}
