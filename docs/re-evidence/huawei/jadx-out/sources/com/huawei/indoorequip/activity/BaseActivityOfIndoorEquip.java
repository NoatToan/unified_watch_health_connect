package com.huawei.indoorequip.activity;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.tech.NfcF;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModelProvider;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.device.base.AbstractFitnessClient;
import com.huawei.health.device.datatype.IntermitentJumpData;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.distributedservice.api.DistributedApi;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.datastruct.SupportDataRange;
import com.huawei.indoorequip.ui.CircleProgressButtonForIndoorEquip;
import com.huawei.indoorequip.viewmodel.IndoorEquipViewModel;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.ecu;
import defpackage.nwa;
import defpackage.nwb;
import defpackage.nwd;
import defpackage.nxx;
import defpackage.nyh;
import defpackage.nyl;
import defpackage.nzc;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class BaseActivityOfIndoorEquip extends BaseActivity implements SportLifecycle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static float f17768a;
    protected boolean ad;
    protected NfcAdapter af;
    protected IntentFilter ag;
    protected Handler ai;
    protected String aj;
    protected String ak;
    protected ImageView al;
    protected ImageView am;
    protected PendingIntent an;
    protected float ao;
    protected String[][] at;
    protected nxx au;
    protected IndoorEquipViewModel ax;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected HealthProgressBar f17769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected d f17770c;
    protected CircleProgressButtonForIndoorEquip e;
    protected Context h;
    protected ImageView i;
    protected DistributedApi k;
    protected a l;
    protected nwa p;
    protected nwb q;
    protected boolean r;
    protected IntermitentJumpData s;
    protected IntentFilter[] t;
    protected boolean w;
    protected boolean y;
    protected boolean z;
    protected boolean v = true;
    protected boolean u = false;
    protected NoTitleCustomAlertDialog m = null;
    protected boolean ac = false;
    protected boolean x = false;
    protected NoTitleCustomAlertDialog f = null;
    protected NoTitleCustomAlertDialog j = null;
    protected NoTitleCustomAlertDialog n = null;
    protected NoTitleCustomAlertDialog aw = null;
    protected int aq = 0;
    protected boolean ab = false;
    protected NoTitleCustomAlertDialog g = null;
    protected nwd d = null;
    protected boolean ae = false;
    protected boolean ah = false;
    protected boolean o = false;
    protected int as = 0;
    protected SupportDataRange ar = null;
    protected int ap = 6;
    protected boolean aa = false;

    protected void a(Map<Integer, Object> map) {
    }

    protected void r() {
    }

    protected void a(SportLaunchParams sportLaunchParams, Handler handler, int i) {
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "initViewModel: sportType=", Integer.valueOf(i));
        this.ax = (IndoorEquipViewModel) new ViewModelProvider(this).get(IndoorEquipViewModel.class);
        LogUtil.d("IDEQ_BaseActivityOfIndoorEquip", "initViewModel: ExitApp=", Boolean.valueOf(this.u));
        this.ax.b(sportLaunchParams, this.u, handler);
        this.ax.requestData();
        this.ax.d(this.z);
        ah();
        if (ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "IDEQ_BaseActivityOfIndoorEquip") != null) {
            this.o = true;
        } else {
            this.o = false;
        }
        SupportDataRange supportDataRange = this.ar;
        if (supportDataRange != null) {
            this.ax.b(supportDataRange);
        }
        boolean zR = this.ax.r();
        this.r = zR;
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "initViewModel: hasRunPostureDevice=", Boolean.valueOf(zR));
        c(sportLaunchParams, i);
        this.aj = this.ax.s();
    }

    public IndoorEquipViewModel o() {
        return this.ax;
    }

    private void ah() {
        ai();
    }

    private void ai() {
        this.ax.observeSportLifeCycle(m(), this);
    }

    protected String m() {
        return "IDEQ_BaseActivityOfIndoorEquip";
    }

    protected void t() {
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "onCreate, start to init NFC");
        if (this.ac) {
            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this);
            this.af = defaultAdapter;
            if (defaultAdapter != null) {
                Intent intent = new Intent(this, getClass());
                intent.setPackage(BaseApplication.d());
                intent.setFlags(536870912);
                this.an = PendingIntent.getActivity(this, 0, intent, 67108864);
            } else {
                LogUtil.e("IDEQ_BaseActivityOfIndoorEquip", "initNfcModule: mNfcAdapter is null");
                this.an = null;
            }
            if (this.an != null) {
                this.ag = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
            } else {
                LogUtil.e("IDEQ_BaseActivityOfIndoorEquip", "initNfcModule: mNdef is null");
                this.ag = null;
            }
            IntentFilter intentFilter = this.ag;
            if (intentFilter != null) {
                try {
                    intentFilter.addDataType("huawei.sports/address");
                } catch (IntentFilter.MalformedMimeTypeException unused) {
                    LogUtil.e("IDEQ_BaseActivityOfIndoorEquip", "mNdef.addDataType exception");
                    this.ag = null;
                }
            }
            IntentFilter intentFilter2 = this.ag;
            if (intentFilter2 != null) {
                this.t = new IntentFilter[]{intentFilter2};
            } else {
                this.t = null;
            }
            if (this.t != null) {
                this.at = new String[][]{new String[]{NfcF.class.getName()}};
                LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "onCreate, NFC init success");
            } else {
                this.at = null;
                LogUtil.e("IDEQ_BaseActivityOfIndoorEquip", "onCreate, NFC init failed");
            }
        }
    }

    protected void q() {
        af();
        n();
        t();
        IndoorEquipViewModel indoorEquipViewModel = this.ax;
        if (indoorEquipViewModel == null || indoorEquipViewModel.c() || this.ax.g()) {
            return;
        }
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "mViewModel.isSportServiceRunning() = ", Boolean.valueOf(this.ax.g()));
        x();
    }

    private void af() {
        if (AbstractFitnessClient.ACTION_GATT_STATE_CONNECTING.equals(this.p.m()) || AbstractFitnessClient.ACTION_GATT_STATE_RECONNECTING.equals(this.p.m()) || AbstractFitnessClient.ACTION_GATT_STATE_CONNECTED.equals(this.p.m())) {
            if (AbstractFitnessClient.ACTION_GATT_STATE_CONNECTED.equals(this.p.m())) {
                Handler handler = this.ai;
                if (handler != null) {
                    handler.sendEmptyMessage(305);
                    return;
                }
                return;
            }
            Handler handler2 = this.ai;
            if (handler2 != null) {
                handler2.sendEmptyMessage(307);
                return;
            }
            return;
        }
        if (!AbstractFitnessClient.ACTION_SERVICE_DISCOVERIED.equals(this.p.m())) {
            Handler handler3 = this.ai;
            if (handler3 != null) {
                handler3.sendEmptyMessage(304);
                return;
            }
            return;
        }
        LogUtil.d("IDEQ_BaseActivityOfIndoorEquip", "BT Connected");
    }

    protected void n() {
        Handler handler;
        Handler handler2;
        this.ad = getRequestedOrientation() == 0;
        ae();
        int i = this.as;
        if (i == 283) {
            LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "sport type is SPORT_TYPE_ROPE_SKIPPING");
            return;
        }
        if (i == 274) {
            if (this.ab || (handler2 = this.ai) == null) {
                return;
            }
            this.ab = true;
            handler2.sendEmptyMessage(10020);
            return;
        }
        if (this.ab || (handler = this.ai) == null) {
            return;
        }
        this.ab = true;
        handler.sendEmptyMessage(10010);
    }

    protected void e() {
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "====enter dismissTipsForTooShortTwoButton()=====");
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.m;
        if (noTitleCustomAlertDialog == null || !noTitleCustomAlertDialog.isShowing()) {
            return;
        }
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "mDialogForTooShortTwoButton is showing, dismiss it now");
        this.ae = false;
        this.m.dismiss();
    }

    protected void a() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.f;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            this.f.dismiss();
            if (this instanceof IndoorEquipDisplayActivity) {
                this.x = false;
            }
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog2 = this.m;
        if (noTitleCustomAlertDialog2 != null && noTitleCustomAlertDialog2.isShowing()) {
            this.m.dismiss();
            this.ae = false;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog3 = this.j;
        if (noTitleCustomAlertDialog3 == null || !noTitleCustomAlertDialog3.isShowing()) {
            return;
        }
        this.j.dismiss();
    }

    protected void x() {
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "====enter showTipsForTooShortOneButton()=====");
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.g;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "DialogForTooShortOneButton and is showing, not show this dialog");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog2 = this.f;
        if (noTitleCustomAlertDialog2 != null && noTitleCustomAlertDialog2.isShowing()) {
            LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "TipsForTooShortOneButton is showing");
            return;
        }
        a();
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(getString(R.string.ie_connection_unnormal)).a(getString(R.string.ie_button_i_know), new View.OnClickListener() { // from class: com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BaseActivityOfIndoorEquip.this.isFinishing()) {
                    return;
                }
                BaseActivityOfIndoorEquip.this.x = true;
                BaseActivityOfIndoorEquip.this.finish();
            }
        }).c();
        this.f = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.f.show();
        this.x = true;
    }

    protected void v() {
        String string;
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "====enter showTipsForNotStartFromZero()=====");
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.g;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "DialogForTooShortOneButton is showing, not show this dialog");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog2 = this.j;
        if (noTitleCustomAlertDialog2 != null && noTitleCustomAlertDialog2.isShowing()) {
            LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "mDialogForNotStartFromZero is showing");
            return;
        }
        a();
        if (this.as == 264) {
            string = getString(R.string.ie_tips_for_not_start_from_zero);
        } else {
            string = getString(R.string.ie_tips_for_equipments_not_start_from_zero);
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(string).a(getString(R.string.ie_button_i_know), new View.OnClickListener() { // from class: com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).c();
        this.j = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.j.show();
    }

    protected void z() {
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "enter showTipsStartOverTarget()");
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.n;
        if (noTitleCustomAlertDialog == null || !noTitleCustomAlertDialog.isShowing()) {
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(getString(R.string.IDS_start_over_target_tips)).a(getString(R.string.ie_button_i_know), new View.OnClickListener() { // from class: nvz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f43850b.a(view);
                }
            }).c();
            this.n = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCancelable(false);
            this.n.show();
        }
    }

    public /* synthetic */ void a(View view) {
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "click stop");
        this.ax.b(false);
    }

    protected void ad() {
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "====enter mWearIsSportingDialog()=====");
        if (!nyl.h(this.as)) {
            LogUtil.e("IDEQ_BaseActivityOfIndoorEquip", "not support indoor link not show this dialog");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.g;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            LogUtil.e("IDEQ_BaseActivityOfIndoorEquip", "DialogForTooShortOneButton is showing, not show this dialog");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog2 = this.aw;
        if (noTitleCustomAlertDialog2 != null && noTitleCustomAlertDialog2.isShowing()) {
            LogUtil.e("IDEQ_BaseActivityOfIndoorEquip", "mWearIsSportingDialog is showing");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(getString(R.string.IDS_wearable_sporting_tips)).a(getString(R.string.ie_button_i_know), new View.OnClickListener() { // from class: com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).c();
        this.aw = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.aw.show();
    }

    protected void ab() {
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "====enter showTipsForTooShortTwoButton()=====");
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.g;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "DialogForTooShortOneButton is showing, not show this dialog!");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog2 = this.m;
        if (noTitleCustomAlertDialog2 != null && noTitleCustomAlertDialog2.isShowing()) {
            LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "mDialogForTooShortTwoButton is showing");
            return;
        }
        a();
        this.ae = true;
        String strAg = ag();
        if (this instanceof IndoorEquipLandDisplayActivity) {
            if (this.aq == 0) {
                strAg = getString(R.string.ie_tips_u_havenot_started_sport_ask);
            } else {
                strAg = ag();
            }
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(strAg).a(getString(R.string.ie_button_resume_sport), new View.OnClickListener() { // from class: com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseActivityOfIndoorEquip.this.ae = false;
                if (BaseActivityOfIndoorEquip.this.p.s()) {
                    LogUtil.d("IDEQ_BaseActivityOfIndoorEquip", "SHOW_WAIT_START_FLOAT_WINDOW");
                } else {
                    LogUtil.e("IDEQ_BaseActivityOfIndoorEquip", "service is null (6)");
                }
            }
        }).d(getString(R.string.ie_button_finish_sport), new View.OnClickListener() { // from class: com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "call finishThisSession  (1)");
                if (BaseActivityOfIndoorEquip.this.ax != null) {
                    BaseActivityOfIndoorEquip.this.ax.b(false);
                } else {
                    BaseActivityOfIndoorEquip.this.g();
                }
            }
        }).c();
        this.m = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.m.show();
    }

    private String ag() {
        if (this.as == 283) {
            return this.h.getResources().getString(R.string.IDS_indoor_skipper_rope_times_less_tips);
        }
        return this.h.getResources().getString(R.string.ie_tips_distance_too_short_ask);
    }

    protected void w() {
        String string;
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "====enter showTipsForTooShortOneButton()=====");
        a();
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.g;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "TipsForTooShortOneButton is showing");
            return;
        }
        if (this.as == 283) {
            string = this.h.getResources().getString(R.string.IDS_indoor_skipper_rope_times_no_record_tips);
        } else {
            string = this.h.getResources().getString(R.string.ie_tips_distance_too_short);
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(string).a(getString(R.string.ie_button_i_know), new View.OnClickListener() { // from class: com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseActivityOfIndoorEquip.this.ae = false;
                BaseActivityOfIndoorEquip.this.g();
            }
        }).c();
        this.g = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.g.show();
        this.x = true;
    }

    protected void g() {
        LogUtil.e("IDEQ_BaseActivityOfIndoorEquip", "finishActivity,mService is null");
        if (isFinishing()) {
            return;
        }
        this.x = true;
        finish();
    }

    protected void s() {
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "mIsSupportNfc", Boolean.valueOf(this.ac), "mNfcAdapter != null", Boolean.valueOf(this.af != null), "mPendingIntentForNfc != null ", Boolean.valueOf(this.an != null), "mIntentFiltersArray != null", Boolean.valueOf(this.t != null), "mTechListsArray != null", Boolean.valueOf(this.at != null));
        if (this.ac && this.af != null && this.an != null && this.t != null && this.at != null) {
            LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "NFC EnableForegroundDispatch");
            this.af.enableForegroundDispatch(this, this.an, this.t, this.at);
        }
        if (this.ax == null || nyl.e(this.as)) {
            LogUtil.e("IDEQ_BaseActivityOfIndoorEquip", "skipping not support engine");
        }
    }

    protected void ac() {
        if (this.ax == null) {
            return;
        }
        if (this.au == null) {
            nxx nxxVarD = nxx.d(getApplicationContext(), this.o, this.ax);
            this.au = nxxVarD;
            nxxVarD.e(this.y);
        }
        this.ax.observeSportLifeCycle(this.au.d(), this.au);
        nwd nwdVar = this.d;
        if (nwdVar != null) {
            nwdVar.e(this.au);
        }
        this.au.c();
        if (this.aq == 2) {
            this.ax.w();
        }
    }

    private void c(SportLaunchParams sportLaunchParams, int i) {
        boolean zBooleanValue = ((Boolean) sportLaunchParams.getExtra("KEY_IS_SWITCH_TO_HORIZONTAL_SCREEN", Boolean.class, false)).booleanValue();
        if ((i != 283 || zBooleanValue) && !sportLaunchParams.isRestart()) {
            return;
        }
        this.ax.onPreSport();
    }

    protected void u() {
        nxx nxxVar = this.au;
        if (nxxVar != null) {
            nxxVar.a();
            this.au.b(true);
            this.au.c();
        }
    }

    protected void c(boolean z) {
        this.y = z;
    }

    protected void c(String str) {
        if (str != null && str.contains("&tvn=")) {
            String strE = nzc.e(str);
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            Intent intent = new Intent("com.huawei.health.BROADCAST_INTENT_CONNECT_TV");
            intent.putExtra("KEY_OF_TV_DEVICE_NAME", strE);
            LocalBroadcastManager.getInstance().sendBroadcast(intent);
            return;
        }
        LogUtil.e("IDEQ_BaseActivityOfIndoorEquip", "partOfOnNewIntent, payload is null");
    }

    public SupportDataRange k() {
        return this.ar;
    }

    public int l() {
        return this.as;
    }

    public void b(boolean z) {
        IndoorEquipViewModel indoorEquipViewModel = this.ax;
        if (indoorEquipViewModel != null) {
            indoorEquipViewModel.a(z);
            if (z) {
                return;
            }
            this.ax.unregisterAll();
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        this.aq = 2;
        ReleaseLogUtil.d("IDEQ_BaseActivityOfIndoorEquip", "sport state: ", 2);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        this.aq = 1;
        n();
        ReleaseLogUtil.d("IDEQ_BaseActivityOfIndoorEquip", "sport state: ", Integer.valueOf(this.aq));
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        this.aq = 1;
        ReleaseLogUtil.d("IDEQ_BaseActivityOfIndoorEquip", "sport state: ", 1);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        this.aq = 3;
        ReleaseLogUtil.d("IDEQ_BaseActivityOfIndoorEquip", "sport state: ", 3);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = this.as;
        if (i == 264) {
            Toast.makeText(this.h, getString(R.string.ie_back_tips_u_need_press_stop_button), 0).show();
        } else if (i == 283) {
            Toast.makeText(this.h, getString(R.string.IDS_motiontrack_show_sport_sporting_key_down_back), 0).show();
        } else {
            Toast.makeText(this.h, getString(R.string.ie_back_tips_u_need_stop_machine), 0).show();
        }
    }

    private void ae() {
        int i = this.as;
        if (i == 283) {
            this.al.setVisibility(8);
            this.am.setVisibility(8);
        } else if (i == 274) {
            this.al.setBackgroundResource(this.ad ? R.drawable.ripple2 : R.drawable.ripple);
            this.am.setBackgroundResource(this.ad ? R.drawable.ripple2_0 : R.drawable.ripple1_0);
        } else {
            this.al.setBackgroundResource(this.ad ? R.drawable.runway2 : R.drawable.runway1);
            this.am.setBackgroundResource(this.ad ? R.drawable.runway2_2 : R.drawable.runway1_2);
        }
    }

    protected void d() {
        this.ae = false;
        this.x = false;
        this.q.b(false);
        aa();
        this.q = null;
        this.d = null;
        this.ai = null;
        this.ax = null;
    }

    protected void b(int i) {
        if (i == 10010) {
            this.am.setBackgroundResource(this.ad ? R.drawable.runway2_2 : R.drawable.runway1_2);
            e(10011);
            return;
        }
        if (i == 10011) {
            this.am.setBackgroundResource(this.ad ? R.drawable.runway2_3 : R.drawable.runway1_3);
            e(10010);
            return;
        }
        switch (i) {
            case 10020:
                this.am.setBackgroundResource(this.ad ? R.drawable.ripple2_0 : R.drawable.ripple1_0);
                a(10021);
                break;
            case 10021:
                this.am.setBackgroundResource(this.ad ? R.drawable.ripple2_1 : R.drawable.ripple1_1);
                a(10022);
                break;
            case 10022:
                this.am.setBackgroundResource(this.ad ? R.drawable.ripple2_2 : R.drawable.ripple1_2);
                a(10023);
                break;
            case 10023:
                this.am.setBackgroundResource(this.ad ? R.drawable.ripple2_3 : R.drawable.ripple1_3);
                a(10024);
                break;
            case 10024:
                this.am.setBackgroundResource(this.ad ? R.drawable.ripple2_4 : R.drawable.ripple1_4);
                a(10020);
                break;
        }
    }

    private void e(int i) {
        Handler handler = this.ai;
        if (handler != null && this.aq == 1) {
            handler.sendEmptyMessageDelayed(i, nzc.b(f17768a));
        } else if (handler != null) {
            handler.removeMessages(10010);
            this.ai.removeMessages(10011);
            this.ab = false;
        }
    }

    private void a(int i) {
        Handler handler = this.ai;
        if (handler != null && this.aq == 1) {
            handler.sendEmptyMessageDelayed(i, nzc.b(f17768a));
            return;
        }
        if (handler != null) {
            handler.removeMessages(10020);
            this.ai.removeMessages(10021);
            this.ai.removeMessages(10022);
            this.ai.removeMessages(10023);
            this.ai.removeMessages(10024);
            this.ab = false;
        }
    }

    protected void p() {
        CircleProgressButtonForIndoorEquip circleProgressButtonForIndoorEquip = this.e;
        if (circleProgressButtonForIndoorEquip != null) {
            circleProgressButtonForIndoorEquip.c(new CircleProgressButtonForIndoorEquip.CircleProcessListener() { // from class: com.huawei.indoorequip.activity.BaseActivityOfIndoorEquip.10
                @Override // com.huawei.indoorequip.ui.CircleProgressButtonForIndoorEquip.CircleProcessListener
                public void onCancel() {
                }

                @Override // com.huawei.indoorequip.ui.CircleProgressButtonForIndoorEquip.CircleProcessListener
                public void onFinished() {
                    if (BaseActivityOfIndoorEquip.this.ax != null) {
                        BaseActivityOfIndoorEquip.this.ax.b(true);
                    } else {
                        LogUtil.e("IDEQ_BaseActivityOfIndoorEquip", "mService is null");
                    }
                }

                @Override // com.huawei.indoorequip.ui.CircleProgressButtonForIndoorEquip.CircleProcessListener
                public void onStarted() {
                    if (BaseActivityOfIndoorEquip.this.e.getState() == 6) {
                        Toast.makeText(BaseActivityOfIndoorEquip.this.h, BaseActivityOfIndoorEquip.this.getString(R.string.tips_when_press_connecting_button_on_phone), 0).show();
                    }
                }
            });
        }
    }

    protected void c(int i) {
        if (i == 301) {
            b();
            return;
        }
        if (i == 307) {
            f();
            return;
        }
        if (i == 309) {
            i();
            return;
        }
        if (i == 702) {
            j();
        } else if (i == 304) {
            c();
        } else {
            if (i != 305) {
                return;
            }
            h();
        }
    }

    protected void b() {
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "in handleMessage, MSG_BT_CONNECTING_SHOW");
        Handler handler = this.ai;
        if (handler != null) {
            handler.sendEmptyMessage(702);
        }
        this.e.setState(6);
    }

    protected void f() {
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "in handleMessage, MSG_BT_RECONNECTING_SHOW");
        Handler handler = this.ai;
        if (handler != null) {
            handler.sendEmptyMessage(702);
            this.ai.sendEmptyMessage(503);
        }
        CircleProgressButtonForIndoorEquip circleProgressButtonForIndoorEquip = this.e;
        if (circleProgressButtonForIndoorEquip != null) {
            circleProgressButtonForIndoorEquip.setState(6);
        }
        Toast.makeText(this.h, getString(R.string.ie_devicestate_connecting_again), 0).show();
    }

    protected void c() {
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "in handleMessage, case is MSG_BT_DISCONNECTED_SHOW");
        HealthProgressBar healthProgressBar = this.f17769b;
        if (healthProgressBar != null) {
            healthProgressBar.setVisibility(8);
        }
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setImageDrawable(nzc.b(this.h, nyh.a(this.as, false)));
        }
        nwd nwdVar = this.d;
        if (nwdVar != null) {
            nwdVar.d(AbstractFitnessClient.ACTION_GATT_STATE_DISCONNECTED);
        }
    }

    protected void h() {
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "in handleMessage, case is MSG_BT_SERVICE_DISCOVER_SHOW");
        HealthProgressBar healthProgressBar = this.f17769b;
        if (healthProgressBar != null) {
            healthProgressBar.setVisibility(8);
        }
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setImageDrawable(nzc.b(this.h, nyh.a(this.as, true)));
        }
        CircleProgressButtonForIndoorEquip circleProgressButtonForIndoorEquip = this.e;
        if (circleProgressButtonForIndoorEquip != null) {
            circleProgressButtonForIndoorEquip.setState(0);
        }
        nwd nwdVar = this.d;
        if (nwdVar != null) {
            nwdVar.d(AbstractFitnessClient.ACTION_SERVICE_DISCOVERIED);
        }
    }

    protected void i() {
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "in handleMessage, case is MSG_BT_SERVICE_REDISCOVER_SHOW");
        HealthProgressBar healthProgressBar = this.f17769b;
        if (healthProgressBar != null) {
            healthProgressBar.setVisibility(8);
        }
        CircleProgressButtonForIndoorEquip circleProgressButtonForIndoorEquip = this.e;
        if (circleProgressButtonForIndoorEquip != null) {
            circleProgressButtonForIndoorEquip.setState(0);
        }
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setImageDrawable(nzc.b(this.h, nyh.a(this.as, true)));
        }
        Toast.makeText(this.h, getString(R.string.ie_devicestate_connected_again), 1).show();
        nwd nwdVar = this.d;
        if (nwdVar != null) {
            nwdVar.d(AbstractFitnessClient.ACTION_SERVICE_REDISCOVERIED);
        }
    }

    protected void j() {
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "in handleMessage, case is BT_ICON_CONNECTING");
        HealthProgressBar healthProgressBar = this.f17769b;
        if (healthProgressBar != null) {
            healthProgressBar.setVisibility(0);
        }
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setImageDrawable(nzc.b(this.h, nyh.a(this.as)));
        }
        nwd nwdVar = this.d;
        if (nwdVar != null) {
            nwdVar.d(AbstractFitnessClient.ACTION_GATT_STATE_RECONNECTING);
        }
    }

    protected void d(int i) {
        if (i == 507) {
            LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "in handleMessage,  MSG_SHOW_TIPS_FOR_NOT_START_FROM_0");
            if (this.ah) {
                return;
            }
            this.ah = true;
            v();
            return;
        }
        if (i == 511) {
            LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "in handleMessage, SHOW_TIPS_FOR_JUMP_TO_ZERO");
            Toast.makeText(this.h, getString(R.string.ie_tips_for_jump_to_zero), 0).show();
            return;
        }
        if (i == 514) {
            LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "in handleMessage, MSG_DIALOG_WEAR_SPORTING");
            ad();
            return;
        }
        if (i != 515) {
            switch (i) {
                case 501:
                    LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "in handleMessage, MSG_SHOW_TIPS_FOR_TOO_SHORT");
                    if (!this.ae) {
                        this.ae = true;
                        w();
                    }
                    break;
                case TypedValues.PositionType.TYPE_DRAWPATH /* 502 */:
                    LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "in handleMessage, MSG_SHOW_TIPS_FOR_TOO_SHORT_TWO_BUTTON");
                    ab();
                    break;
                case 503:
                    LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "in handleMessage, MSG_DISMISS_TIPS_FOR_TOO_SHORT_TWO_BUTTON");
                    e();
                    break;
            }
            return;
        }
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "in handleMessage,  MSG_SHOW_TIPS_START_OVER_TARGET");
        z();
    }

    protected void y() {
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "register BroadcastReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.FINISH_DISPLAY_ACTIVITY");
        intentFilter.addAction("com.huawei.health.FINISH_THIS_SESSION");
        this.f17770c = new d();
        LocalBroadcastManager.getInstance().registerReceiver(this.f17770c, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.huawei.hardware.display.action.WIFI_DISPLAY_CASTING");
        a aVar = new a();
        this.l = aVar;
        BroadcastManagerUtil.c(this, aVar, intentFilter2, "com.huawei.wfd.permission.ACCESS_WIFI_DISPLAY_CASTING", null);
    }

    protected void aa() {
        LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "unregisterBroadcastReceiver");
        if (this.l != null) {
            LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "mDoubleScreenBroadcast is not null");
            unregisterReceiver(this.l);
            this.l = null;
        }
        if (this.f17770c != null) {
            LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "mBroadcastReceiverInner is not null");
            LocalBroadcastManager.getInstance().unregisterReceiver(this.f17770c);
            this.f17770c = null;
        }
    }

    final class d extends BroadcastReceiver {
        private d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "Receive localBroadcast and action is ", intent.getAction());
                if ("com.huawei.health.FINISH_THIS_SESSION".equals(intent.getAction())) {
                    if (BaseActivityOfIndoorEquip.this.ax != null) {
                        BaseActivityOfIndoorEquip.this.ax.b(intent);
                    }
                } else if ("com.huawei.health.FINISH_DISPLAY_ACTIVITY".equals(intent.getAction())) {
                    BaseActivityOfIndoorEquip.this.x = true;
                    BaseActivityOfIndoorEquip.this.finish();
                } else {
                    LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "BroadcastReceiverInner other");
                }
            }
        }
    }

    class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("IDEQ_BaseActivityOfIndoorEquip", "DoubleScreenBroadcast");
            if (BaseActivityOfIndoorEquip.this.ax == null) {
                LogUtil.j("IDEQ_BaseActivityOfIndoorEquip", "mViewModel == null");
            } else {
                BaseActivityOfIndoorEquip.this.ac();
            }
        }
    }
}
