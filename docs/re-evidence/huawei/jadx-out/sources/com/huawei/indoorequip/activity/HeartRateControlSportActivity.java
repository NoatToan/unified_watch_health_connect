package com.huawei.indoorequip.activity;

import android.content.DialogInterface;
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
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.distributedservice.api.DistributedApi;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.datastruct.SupportDataRange;
import com.huawei.indoorequip.ui.CircleProgressButtonForIndoorEquip;
import com.huawei.openalliance.ad.constant.ErrorCode;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.det;
import defpackage.izw;
import defpackage.jaq;
import defpackage.njy;
import defpackage.nwa;
import defpackage.nwb;
import defpackage.nwd;
import defpackage.nyh;
import defpackage.nyl;
import defpackage.nzc;
import defpackage.nze;
import defpackage.qpx;
import defpackage.qqz;
import health.compact.a.CommonUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class HeartRateControlSportActivity extends BaseActivityOfIndoorEquip implements View.OnClickListener {
    private ImageView av;
    private String ay;
    private String bb;
    private boolean bd;
    private HealthImageView bj;
    private HealthImageView bk;
    private HealthImageView bl;
    private nze bm;
    private HealthImageView bo;
    private boolean be = true;
    private boolean bf = false;
    private boolean bh = false;
    private boolean bg = false;
    private int bi = 0;
    private CustomAlertDialog bc = null;
    private CustomAlertDialog bq = null;
    private NoTitleCustomAlertDialog az = null;
    private NoTitleCustomAlertDialog ba = null;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("HeartRateControlSportActivity", "onCreate");
        c(true);
        ae();
        this.h = this;
        this.q = new nwb(this, this.ai, false);
        this.k = (DistributedApi) Services.d("DistributedService", DistributedApi.class);
        if (this.k != null) {
            this.k.init(this.h);
            this.k.detectLastWirelessDevice();
        } else {
            LogUtil.e("HeartRateControlSportActivity", "can not get DistributedApi");
        }
        this.d = new nwd(null, null, null);
        this.d.c(this.h);
        this.d.e(this.ai);
        clearBackgroundDrawable();
        y();
        Intent intent = getIntent();
        if (intent != null) {
            this.u = getIntent().getBooleanExtra("ExitApp", false);
            this.z = intent.getBooleanExtra("key_is_keep_connect", false);
            this.ak = intent.getStringExtra("productId");
            this.bb = intent.getStringExtra("deviceType");
            c(intent);
            LogUtil.a("HeartRateControlSportActivity", "mCourseId is ", this.ay, "mProductId is ", this.ak);
        }
        LogUtil.d("HeartRateControlSportActivity", "acquireDataFromIntent ExitApp ", Boolean.valueOf(this.u));
        if (this.ax != null) {
            this.aq = this.ax.getSportStatus();
        }
        ag();
        r();
    }

    @Override // com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip
    protected void r() {
        LogUtil.a("HeartRateControlSportActivity", "initView");
        setContentView(R.layout.activity_heart_rate_control_sport);
        Window window = getWindow();
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-8193));
        window.addFlags(134217728);
        window.setStatusBarColor(getColor(R.color.hw_show_black_0alpha));
        window.setNavigationBarColor(getColor(R.color.hw_show_black_0alpha));
        ai();
        q();
        ac();
        this.bf = true;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("HeartRateControlSportActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        getWindow().addFlags(128);
        s();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        LogUtil.a("HeartRateControlSportActivity", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        super.onPause();
        if (!this.ac || this.af == null) {
            return;
        }
        LogUtil.a("HeartRateControlSportActivity", "NFC DisableForegroundDispatch");
        this.af.disableForegroundDispatch(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        LogUtil.a("HeartRateControlSportActivity", "enter onNewIntent");
        if (intent == null) {
            LogUtil.j("HeartRateControlSportActivity", "on NewIntent intent is null");
            return;
        }
        if (this.d != null && intent.getBooleanExtra("show tips key", false)) {
            this.d.c(this);
            Toast.makeText(HuaweiHealth.a(), this.h.getString(R.string.ie_last_connection_continue), 0).show();
        }
        if ("android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction())) {
            LogUtil.a("HeartRateControlSportActivity", "onNewIntent, action is equal to ACTION_NDEF_DISCOVERED");
            Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES");
            if (parcelableArrayExtra == null || parcelableArrayExtra.length == 0) {
                LogUtil.j("HeartRateControlSportActivity", "NDEF_MESSAGES is null");
                return;
            }
            Parcelable parcelable = parcelableArrayExtra[0];
            String str = null;
            NdefMessage ndefMessage = parcelable instanceof NdefMessage ? (NdefMessage) parcelable : null;
            if (ndefMessage != null) {
                try {
                    if (njy.c(ndefMessage.getRecords(), 0) && ndefMessage.getRecords()[0] != null) {
                        str = new String(ndefMessage.getRecords()[0].getPayload(), "UTF-8");
                    }
                } catch (UnsupportedEncodingException unused) {
                    LogUtil.e("HeartRateControlSportActivity", "onNewIntent, UnsupportedEncodingException");
                }
            }
            c(str);
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

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("HeartRateControlSportActivity", "onDestroy");
        if (!this.x) {
            af();
            if (this.k != null) {
                this.k.setIsInit(false);
            }
        } else {
            LogUtil.a("HeartRateControlSportActivity", "normal onDestroy");
            if (this.au != null) {
                this.au.a();
            }
            if (this.k != null && this.v) {
                this.k.destroyWirelessProjection();
                LogUtil.a("HeartRateControlSportActivity", "exit the treadmill exercise, you need to disconnect the Projection.");
            }
        }
        this.p.d(false);
        d();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.ie_voice_icon) {
            boolean zA = jaq.a();
            this.be = !zA;
            if (!zA) {
                this.bo.setImageDrawable(getResources().getDrawable(R.drawable.ic_rope_volume));
            } else {
                this.bo.setImageDrawable(getResources().getDrawable(R.drawable.ic_rope_volume_mute));
            }
            jaq.d(this.be);
            return;
        }
        if (id == R.id.ie_music_icon) {
            if (CommonUtil.bh() && CommonUtil.w(izw.p)) {
                Intent intent = new Intent("android.intent.action.MUSIC_PLAYER");
                intent.setFlags(268435456);
                intent.setPackage(izw.p);
                startActivity(intent);
                return;
            }
            LogUtil.j("HeartRateControlSportActivity", "Don't play music");
            return;
        }
        if (id == R.id.ie_lock_icon) {
            d(this.bg);
        } else {
            if (id == R.id.ie_miracast_icon) {
                if (this.k != null) {
                    this.k.startWirelessProjection();
                    return;
                }
                return;
            }
            LogUtil.d("HeartRateControlSportActivity", "onClick");
        }
    }

    private void d(final boolean z) {
        LogUtil.a("HeartRateControlSportActivity", "enter showControlSportSwitchDialog isOpen: ", Boolean.valueOf(z));
        CustomAlertDialog customAlertDialog = this.bc;
        if (customAlertDialog != null && customAlertDialog.isShowing()) {
            LogUtil.a("HeartRateControlSportActivity", "showControlSportSwitchDialog is showing");
            return;
        }
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this.h).d(nyh.b(this.as, z)).c(nyh.e(this.as, z)).a(R.string.hiad_dialog_cancel, new DialogInterface.OnClickListener() { // from class: nwh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).d(z ? R.string.ie_enable_wlan : R.string.hiad_dialog_close, new DialogInterface.OnClickListener() { // from class: nwf
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.e.d(z, dialogInterface, i);
            }
        }).b();
        this.bc = customAlertDialogB;
        customAlertDialogB.setCancelable(false);
        this.bc.show();
    }

    public /* synthetic */ void d(boolean z, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (z) {
            this.bg = false;
            aj();
            a(this.bg);
            nzc.a(this.ak, this.ay, this.bb, 10);
            return;
        }
        this.bg = true;
        an();
        a(this.bg);
        nzc.a(this.ak, this.ay, this.bb, 9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ao() {
        String string;
        if (!HandlerExecutor.c()) {
            HandlerExecutor.b(new Runnable() { // from class: nwl
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.ao();
                }
            });
            return;
        }
        LogUtil.a("HeartRateControlSportActivity", "enter showWearDeviceDisconnectedDialog");
        CustomAlertDialog customAlertDialog = this.bq;
        if (customAlertDialog != null && customAlertDialog.isShowing()) {
            LogUtil.a("HeartRateControlSportActivity", "showWearDeviceDisconnectedDialog is showing");
            return;
        }
        if (this.as == 265) {
            string = getString(R.string.IDS_wear_detection_resistance_msg);
        } else {
            string = getString(R.string.IDS_wear_detection_speed_msg);
        }
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this.h).d(R.string.IDS_wear_detection_title).e(string).d(R.string.ie_button_i_know, new DialogInterface.OnClickListener() { // from class: nwn
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).b();
        this.bq = customAlertDialogB;
        customAlertDialogB.setCancelable(false);
        this.bq.show();
    }

    private void am() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.az;
        if (noTitleCustomAlertDialog == null || !noTitleCustomAlertDialog.isShowing()) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
            builder.b(R.string.IDS_course_finish_content_instrument);
            builder.c(R.string.ie_button_i_know, new View.OnClickListener() { // from class: nwi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f43861c.e(view);
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            this.az = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCancelable(false);
            this.az.show();
        }
    }

    public /* synthetic */ void e(View view) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.az;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.az = null;
        }
    }

    private void ak() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.ba;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            LogUtil.j("HeartRateControlSportActivity", "");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.b(R.string.IDS_course_resume);
        builder.c(R.string.ie_button_i_know, new View.OnClickListener() { // from class: nwg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f43860a.c(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.ba = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.ba.show();
    }

    public /* synthetic */ void c(View view) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.ba;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.ba = null;
        }
    }

    @Override // com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip
    protected void a(Map<Integer, Object> map) {
        if (!this.bf) {
            LogUtil.e("HeartRateControlSportActivity", "View is not init");
            return;
        }
        if (map == null) {
            LogUtil.e("HeartRateControlSportActivity", "updateUi, indoorEquipDataStructForShow = null");
            return;
        }
        nze nzeVar = this.bm;
        if (nzeVar != null) {
            nzeVar.a(map);
        }
        if (this.au != null) {
            this.au.b(map);
        }
        if (this.as == 274) {
            f17768a = ((Float) map.get(26)).floatValue();
            return;
        }
        Object obj = map.get(3);
        if (obj instanceof Integer) {
            f17768a = ((Integer) obj).intValue() / 100.0f;
        } else {
            LogUtil.a("HeartRateControlSportActivity", "updateUi, UiDataType.SPEED is not integer, object = ", obj);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    private void af() {
        LogUtil.a("HeartRateControlSportActivity", "unnormal onDestroy");
        ThreadPoolManager.c().execute(new Runnable() { // from class: nwj
            @Override // java.lang.Runnable
            public final void run() {
                this.f43862a.ah();
            }
        });
    }

    public /* synthetic */ void ah() {
        SystemClock.sleep(2000L);
        SportLaunchParams sportLaunchParamsE = det.e();
        LogUtil.a("HeartRateControlSportActivity", "sportLaunchParams == null", Boolean.valueOf(sportLaunchParamsE == null));
        if (sportLaunchParamsE != null) {
            sportLaunchParamsE.addExtra("musicPlayConfirm", Boolean.valueOf(this.bd));
            sportLaunchParamsE.addExtra("has_heart_rate_device_connect", Boolean.valueOf(this.o));
            LogUtil.a("HeartRateControlSportActivity", "onDestroy, mHasWear = ", Boolean.valueOf(this.o));
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
            intent.putExtra("key_is_keep_connect", this.z);
            intent.setClass(getApplication(), HeartRateControlSportActivity.class);
            getApplication().startActivity(intent);
        }
    }

    private void ai() {
        nze nzeVar = new nze(this, getWindow().getDecorView().getRootView(), this.ax, false);
        this.bm = nzeVar;
        nzeVar.a(this.ar);
        this.f17769b = (HealthProgressBar) findViewById(R.id.hw_recycler_loading_hpb);
        this.i = (ImageView) findViewById(R.id.ie_bt_icon);
        this.av = (ImageView) findViewById(R.id.ie_bolt_icon);
        this.i.setImageDrawable(nzc.b(this.h, nyh.a(this.as, true)));
        e(true);
        this.am = (ImageView) findViewById(R.id.runway);
        this.al = (ImageView) findViewById(R.id.runwayBack);
        this.bk = (HealthImageView) findViewById(R.id.ie_music_icon);
        this.bl = (HealthImageView) findViewById(R.id.ie_lock_icon);
        al();
        this.bl.setOnClickListener(this);
        a(false);
        if (this.ax != null) {
            this.ax.w();
        }
    }

    private void al() {
        this.bj = (HealthImageView) findViewById(R.id.ie_miracast_icon);
        if (Utils.c() == 1 && CommonUtil.bg() && CommonUtil.bb()) {
            this.bj.setVisibility(0);
            this.bj.setOnClickListener(this);
        } else {
            this.bj.setVisibility(8);
        }
        this.e = (CircleProgressButtonForIndoorEquip) findViewById(R.id.ie_track_main_page_btn_stop);
        p();
        this.bo = (HealthImageView) findViewById(R.id.ie_voice_icon);
        if (nzc.b(this.as)) {
            LogUtil.a("HeartRateControlSportActivity", "mVoiceIcon hide");
            this.bo.setVisibility(8);
        } else {
            LogUtil.a("HeartRateControlSportActivity", "isRealChineseMainLand");
            this.bo.setOnClickListener(this);
            boolean zA = jaq.a();
            this.be = zA;
            if (zA) {
                LogUtil.a("HeartRateControlSportActivity", "mIsVoiceEnable is:", Boolean.valueOf(zA));
                this.bo.setImageDrawable(getResources().getDrawable(R.drawable.ic_rope_volume));
            } else {
                this.bo.setImageDrawable(getResources().getDrawable(R.drawable.ic_rope_volume_mute));
            }
        }
        as();
    }

    private void as() {
        if (nyl.b(this.as)) {
            this.bk.setVisibility(8);
            return;
        }
        this.bk.setVisibility(0);
        if (LanguageUtil.ba(this.h)) {
            BitmapDrawable bitmapDrawableE = qqz.e(this.h, R.drawable.ic_rope_music);
            if (bitmapDrawableE != null) {
                this.bk.setImageDrawable(bitmapDrawableE);
            }
        } else {
            this.bk.setImageDrawable(getResources().getDrawable(R.drawable.ic_rope_music));
        }
        this.bk.setOnClickListener(this);
    }

    private void ag() {
        this.p = nwa.n();
        this.q.b(true);
        this.ae = false;
        this.ah = false;
        this.ac = getPackageManager().hasSystemFeature("android.hardware.nfc");
        LogUtil.a("HeartRateControlSportActivity", "this phone supports Nfc? ", Boolean.valueOf(this.ac));
    }

    private void c(Intent intent) {
        SportLaunchParams sportLaunchParams = (SportLaunchParams) intent.getParcelableExtra("bundle_key_sport_launch_paras");
        if (sportLaunchParams != null) {
            sportLaunchParams.setLaunchActivity(HeartRateControlSportActivity.class.getName());
            this.as = sportLaunchParams.getSportType();
            this.ap = sportLaunchParams.getSportTarget();
            this.ao = (int) sportLaunchParams.getTargetValue();
            this.ay = (String) sportLaunchParams.getExtra("HEART_RATE_CONTROL_COURSE_ID", String.class);
            this.bd = ((Boolean) sportLaunchParams.getExtra("musicPlayConfirm", Boolean.class, false)).booleanValue();
            this.ar = (SupportDataRange) sportLaunchParams.getExtra("supportDataRange", SupportDataRange.class);
            this.p = nwa.n();
            this.p.d(true);
            if (this.as != 0) {
                this.p.e(this.as);
            } else {
                this.as = this.p.p();
            }
            sportLaunchParams.setSportTarget(4);
            a(sportLaunchParams, this.ai, this.as);
            this.o = this.o ? true : ((Boolean) sportLaunchParams.getExtra("has_heart_rate_device_connect", Boolean.class, false)).booleanValue();
            LogUtil.a("HeartRateControlSportActivity", "setSportLaunchParams HAS_HEART_RATE_DEVICE_CONNECT ", Boolean.valueOf(this.o));
        }
    }

    private void ae() {
        this.ai = new Handler(new Handler.Callback() { // from class: nwe
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f43858b.c(message);
            }
        });
    }

    public /* synthetic */ boolean c(Message message) {
        c(message.what);
        d(message.what);
        b(message.what);
        e(message);
        int i = message.what;
        if (i == 908) {
            LogUtil.a("HeartRateControlSportActivity", "in handleMessage, case is FINISH_ACT");
            nzc.a(this.ak, this.ay, this.bb, this.bh ? 2 : 3);
            this.x = true;
            finish();
            return false;
        }
        if (i != 1014) {
            if (i != 1015) {
                return false;
            }
            r();
            return false;
        }
        if (!(message.obj instanceof HashMap)) {
            return false;
        }
        LogUtil.a("HeartRateControlSportActivity", "MSG_UPDATE_UI", message.obj);
        a((HashMap) message.obj);
        return false;
    }

    private void e(Message message) {
        switch (message.what) {
            case 801:
                if (message.obj instanceof HashMap) {
                    LogUtil.a("HeartRateControlSportActivity", "MSG_HR_CONTROL_UPDATE_DATA", message.obj);
                    HashMap map = (HashMap) message.obj;
                    nze nzeVar = this.bm;
                    if (nzeVar != null) {
                        nzeVar.b(map);
                    }
                    if (this.au != null) {
                        this.au.e(map);
                    }
                    break;
                }
                break;
            case ErrorCode.ERROR_PLACEMENT_EMPTY_AD_IDS /* 802 */:
                int iIntValue = ((Integer) message.obj).intValue();
                a(iIntValue);
                if (this.au != null) {
                    this.au.c(iIntValue);
                }
                break;
            case 803:
                ak();
                break;
        }
    }

    private void a(int i) {
        switch (i) {
            case 1001:
            case 1002:
                ao();
                nzc.a(this.ak, this.ay, this.bb, 4);
                break;
            case 1003:
                this.bh = true;
                am();
                break;
            case 1004:
                qpx.e(HuaweiHealth.a(), getString(R.string.IDS_low_tread_frequency_msg, new Object[]{50}));
                break;
            case 1005:
                nzc.a(this.ak, this.ay, this.bb, 5);
                break;
            case 1006:
                nzc.a(this.ak, this.ay, this.bb, 6);
                break;
            case 1007:
                nzc.a(this.ak, this.ay, this.bb, 7);
                break;
            case 1008:
                nzc.a(this.ak, this.ay, this.bb, 8);
                break;
            case 1009:
                nzc.a(this.ak, this.ay, this.bb, 11);
                break;
        }
    }

    private void e(boolean z) {
        this.av.setVisibility(0);
        this.av.setImageDrawable(nzc.b(this.h, z ? R.drawable.ic_wear_connected : R.drawable.ic_wear_disconnect));
    }

    private void an() {
        if (this.ax != null) {
            this.bi = 2;
            this.ax.b(SportParamsType.HEART_RATE_CONTROL_LOCK, 2);
        }
    }

    private void aj() {
        if (this.ax != null) {
            this.bi = 1;
            this.ax.b(SportParamsType.HEART_RATE_CONTROL_LOCK, 1);
        }
    }

    private void a(boolean z) {
        this.bl.setImageDrawable(nzc.b(this.h, z ? R.drawable.icon_control_locked : R.drawable.icon_control_unlocked));
    }

    @Override // com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip, com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        super.onResumeSport();
        if (this.as != 264 || this.bg) {
            return;
        }
        this.ai.sendEmptyMessage(803);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
