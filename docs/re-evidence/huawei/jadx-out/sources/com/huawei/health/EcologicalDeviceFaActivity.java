package com.huawei.health;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.alipay.sdk.m.s.e;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.ecologydevice.util.FAUtil;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity;
import com.huawei.hwauthutil.HsfSignValidator;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.activity.IndoorEquipConnectedActivity;
import com.huawei.indoorequip.datastruct.QrCodeOrNfcInfo;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.main.stories.health.activity.healthdata.KnitBloodPressureActivity;
import com.huawei.ui.main.stories.history.SportHistoryActivity;
import defpackage.emh;
import defpackage.era;
import defpackage.etp;
import defpackage.iov;
import defpackage.ive;
import defpackage.jxh;
import defpackage.lsy;
import defpackage.njd;
import defpackage.nwa;
import defpackage.peh;
import defpackage.wvd;
import health.compact.a.AuthorizationUtils;
import health.compact.a.Utils;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class EcologicalDeviceFaActivity extends Activity {
    private static final Set<String> d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6108b;
    private Context e;
    private String g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f6107a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6109c = "com.huawei.ohos.health.device";

    static {
        HashSet hashSet = new HashSet();
        d = hashSet;
        hashSet.add("B2881B2EE3D4EFA03342AE07DAFC0466B63EDE959EC2E2F58C05A54266F45748");
        hashSet.add("3775339A90423293F6F60055FE4484130CF90E5D4A83E9B8713EDB97F5A094B0");
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("EcologicalDeviceFaActivity", "onCreate");
        this.e = this;
        if (!d()) {
            finish();
            return;
        }
        if (!AuthorizationUtils.c(this.e)) {
            LogUtil.a("EcologicalDeviceFaActivity", "privacy not agree");
            j();
            finish();
            return;
        }
        if (Utils.h() && !Utils.i()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: dba
                @Override // java.lang.Runnable
                public final void run() {
                    FAUtil.a(new FAUtil.ResultCallback() { // from class: day
                        @Override // com.huawei.health.ecologydevice.util.FAUtil.ResultCallback
                        public final void onResult(boolean z) {
                            LogUtil.a("EcologicalDeviceFaActivity", "download and bind device:" + z);
                        }
                    });
                }
            });
        }
        if (nwa.n().r() || nwa.n().y()) {
            Toast.makeText(this, this.e.getString(com.huawei.indoorequip.R.string.ie_last_connection_continue), 0).show();
            finish();
        } else {
            e();
            a();
            g();
        }
    }

    private void j() {
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage != null) {
            startActivity(launchIntentForPackage);
        } else {
            LogUtil.j("EcologicalDeviceFaActivity", "launchIntentForPackage is null");
        }
    }

    private boolean d() {
        String stringExtra;
        if (getIntent() == null) {
            return false;
        }
        try {
            stringExtra = getIntent().getStringExtra("packageName");
        } catch (Exception unused) {
            LogUtil.e("EcologicalDeviceFaActivity", "checkCallingPermission Exception.");
            stringExtra = "";
        }
        if (!this.f6109c.equals(stringExtra)) {
            LogUtil.j("EcologicalDeviceFaActivity", "packageName is null");
            return false;
        }
        String strA = HsfSignValidator.a(this, stringExtra);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("EcologicalDeviceFaActivity", "fingerprint is null");
            return false;
        }
        return d.contains(strA);
    }

    private void e() {
        LogUtil.a("EcologicalDeviceFaActivity", "parseIntent");
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("EcologicalDeviceFaActivity", "intent is null");
            finish();
        } else {
            this.f6108b = intent.getAction();
            if (intent.hasExtra(e.n)) {
                this.f6107a = peh.b(intent.getStringExtra(e.n));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void a() {
        LogUtil.a("EcologicalDeviceFaActivity", "jumpToActivity");
        if (this.f6108b == null) {
            this.f6108b = "";
        }
        String str = this.f6107a.get("closeBLEConnection");
        this.g = this.f6107a.get(Constants.CA_PAYLOAD);
        byte b2 = 0;
        boolean z = !TextUtils.isEmpty(str) && Boolean.parseBoolean(str);
        LogUtil.a("EcologicalDeviceFaActivity", "closeBLEConnection:", Boolean.valueOf(z));
        String str2 = this.f6108b;
        str2.hashCode();
        switch (str2.hashCode()) {
            case -1584340942:
                if (!str2.equals("startSport")) {
                    b2 = -1;
                }
                break;
            case -229915964:
                if (!str2.equals("blood_pressure_page")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 811700604:
                if (!str2.equals("trackDetail")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 1212015996:
                if (!str2.equals("trackRecord")) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            c(z);
            return;
        }
        if (b2 == 1) {
            a(z);
            return;
        }
        if (b2 == 2) {
            b(z);
        } else if (b2 == 3) {
            e(z);
        } else {
            LogUtil.a("EcologicalDeviceFaActivity", "jumpToActivity default patch");
            finish();
        }
    }

    private void g() {
        String str = this.f6107a.get("sn");
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("EcologicalDeviceFaActivity", "sn is null");
        } else {
            new etp.b().d(str).b().e();
        }
    }

    private void b(final boolean z) {
        LogUtil.a("EcologicalDeviceFaActivity", "queryAndJumpToTrackDetailActivity");
        h();
        try {
            jxh.a(Long.parseLong((String) Objects.requireNonNull(this.f6107a.get("startTime"))), Long.parseLong((String) Objects.requireNonNull(this.f6107a.get("endTime"))), new IBaseResponseCallback() { // from class: dbb
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f31588b.d(z, i, obj);
                }
            });
        } catch (NumberFormatException unused) {
        }
    }

    public /* synthetic */ void d(boolean z, int i, Object obj) {
        LogUtil.a("EcologicalDeviceFaActivity", "onResponse code: " + i);
        if (i == 0 && (obj instanceof njd)) {
            njd njdVar = (njd) obj;
            ive.c().init(this.e);
            LogUtil.a("EcologicalDeviceFaActivity", "JumpToTrackDetailActivity");
            Bundle bundleC = ive.c().c(njdVar.b(), njdVar.c(), Collections.EMPTY_LIST, false, false);
            bundleC.putBoolean("closeBLEConnection", z);
            bundleC.putBoolean("moveTaskToBack", true);
            Intent intent = new Intent(this, (Class<?>) TrackDetailActivity.class);
            intent.putExtras(bundleC);
            intent.addFlags(268435456);
            if (z) {
                startActivityForResult(intent, 1001);
            } else {
                iov.d(this.e, intent);
                finish();
            }
        }
    }

    private void h() {
        String str = this.f6107a.get("deviceType");
        String str2 = this.f6107a.get(BleConstants.SPORT_TYPE);
        LogUtil.a("EcologicalDeviceFaActivity", "sportType = ", str2);
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str2, String.valueOf(283))) {
            try {
                wvd.e(wvd.e(Integer.parseInt(str)));
                return;
            } catch (NumberFormatException e) {
                LogUtil.e("EcologicalDeviceFaActivity", "deviceType format error msg is ", e.getMessage());
                return;
            }
        }
        LogUtil.j("EcologicalDeviceFaActivity", "sportType is not equals SPORT_TYPE_ROPE_SKIPPING or deviceType is null");
    }

    private void e(boolean z) {
        int i;
        Intent intent = new Intent(this, (Class<?>) SportHistoryActivity.class);
        try {
            i = Integer.parseInt(this.f6107a.get(BleConstants.SPORT_TYPE));
        } catch (NumberFormatException unused) {
            LogUtil.j("EcologicalDeviceFaActivity", "sportType is illegal");
            i = 0;
        }
        intent.putExtra(BleConstants.SPORT_TYPE, i);
        if (z) {
            intent.putExtra("ExitApp", true);
            intent.addFlags(335577088);
            startActivityForResult(intent, 1001);
        } else {
            iov.d(this.e, intent);
            finish();
        }
    }

    private void a(boolean z) {
        Intent intent = new Intent();
        intent.setClass(this, KnitBloodPressureActivity.class);
        if (z) {
            intent.addFlags(67108864);
            startActivityForResult(intent, 1001);
        } else {
            iov.d(this.e, intent);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        LogUtil.a("EcologicalDeviceFaActivity", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        String str = this.f6107a.get("closeBLEConnection");
        LogUtil.a("EcologicalDeviceFaActivity", "enter connection:" + str);
        if (TextUtils.isEmpty(str) || !Boolean.parseBoolean(str)) {
            finish();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 int, still in use, count: 2, list:
      (r4v2 int) from 0x004b: IF  (r4v2 int) != (1630 int)  -> B:9:0x004d A[HIDDEN]
      (r4v2 int) from 0x0050: IF  (r4v2 int) != (49750 int)  -> B:11:0x0052 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    private void c(boolean z) {
        byte b2;
        LogUtil.a("EcologicalDeviceFaActivity", "enter jumpToSportActivity");
        String str = this.f6107a.get(BleConstants.SPORT_TYPE);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.g)) {
            finish();
            return;
        }
        LogUtil.a("EcologicalDeviceFaActivity", "sportType:", str, "  payload:", this.g);
        Intent intent = new Intent();
        intent.putExtra("PAYLOAD_FROM_NFC", this.g);
        str.hashCode();
        if (iHashCode != 1630) {
            if (iHashCode != 49750) {
                switch (str) {
                    case "260":
                        b2 = 2;
                        break;
                    case "261":
                        b2 = 3;
                        break;
                    case "262":
                        b2 = 4;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
            } else if (str.equals(BleConstants.SPORT_TYPE_BIKE)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("31")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0 || b2 == 1 || b2 == 2 || b2 == 3) {
            intent.putExtra("isFromHarmonyFa", true);
            intent.setClass(this, IndoorEquipConnectedActivity.class);
        } else if (b2 == 4) {
            String str2 = this.f6107a.get("uniqueId");
            if (!TextUtils.isEmpty(str2)) {
                emh.b().j();
                emh.b().c((String) Objects.requireNonNull(this.f6107a.get("productId")));
                emh.b().a(true, str2);
            } else {
                LogUtil.e("EcologicalDeviceFaActivity", "query device mac is error");
            }
            intent.setClassName(this, "com.huawei.health.MainActivity");
            intent.setFlags(131072);
            intent.putExtra(BleConstants.SPORT_TYPE, 283);
            intent.putExtra("mLaunchSource", 11);
            intent.putExtra("isToSportTab", true);
        } else {
            intent.setClass(this, MainActivity.class);
        }
        if (z) {
            startActivityForResult(intent, 1001);
        } else {
            startActivity(intent);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("EcologicalDeviceFaActivity", "onActivityResult:", Integer.valueOf(i), ",resultCode:", Integer.valueOf(i2));
        if (i == 1001) {
            if (TextUtils.isEmpty(this.g)) {
                LogUtil.j("EcologicalDeviceFaActivity", "mPayLoad is empty，disconnect fail");
                finish();
            } else {
                lsy.a(new Runnable() { // from class: daz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.c();
                    }
                });
            }
        }
    }

    public /* synthetic */ void c() {
        LogUtil.a("EcologicalDeviceFaActivity", "disconnect bluetooth:", this.g);
        String btMac = QrCodeOrNfcInfo.analysisQrCodeOrNfc(this.g).getBtMac();
        if (TextUtils.isEmpty(btMac)) {
            LogUtil.j("EcologicalDeviceFaActivity", "mac is empty， disconnect fail");
        } else {
            LogUtil.j("EcologicalDeviceFaActivity", "disconnect result :" + era.a(btMac));
        }
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
