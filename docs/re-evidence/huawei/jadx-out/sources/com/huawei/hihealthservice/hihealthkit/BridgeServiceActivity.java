package com.huawei.hihealthservice.hihealthkit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import defpackage.kwi;
import defpackage.led;
import defpackage.ljp;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes33.dex */
public class BridgeServiceActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f12362c = BaseApplication.getAppPackage();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HandlerThread f12363b;
    private Handler d;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        ReleaseLogUtil.d("HiH_BridgeServiceActivity", "BridgeServiceActivity onCreate");
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            b(7, "BridgeServiceActivity start invalid intent");
        } else {
            e();
            a(intent);
        }
    }

    private void e() {
        HandlerThread handlerThread = new HandlerThread("BridgeServiceActivity");
        this.f12363b = handlerThread;
        handlerThread.start();
        if (this.f12363b.getLooper() == null) {
            ReleaseLogUtil.e("HiH_BridgeServiceActivity", "initData mWorkThread getLooper is null");
        } else {
            this.d = new Handler(this.f12363b.getLooper()) { // from class: com.huawei.hihealthservice.hihealthkit.BridgeServiceActivity.4
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    super.handleMessage(message);
                    if (message.what == 101) {
                        BridgeServiceActivity.this.d(message);
                    } else {
                        ReleaseLogUtil.e("HiH_BridgeServiceActivity", "Unmatched msg.what = ", Integer.valueOf(message.what));
                    }
                }
            };
        }
    }

    private void a(Intent intent) {
        String stringExtra;
        try {
            stringExtra = intent.getStringExtra("request_json_data");
        } catch (BadParcelableException e) {
            ReleaseLogUtil.a("HiH_BridgeServiceActivity", "parseData getStringExtra catch BadParcelableException", LogAnonymous.b(e));
            stringExtra = null;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            b(2, "parseData requestDataJson is empty");
            return;
        }
        String strD = led.d(stringExtra);
        if (TextUtils.isEmpty(strD)) {
            b(2, "parseData requestType data is empty");
        } else if (strD.equals("request_auth")) {
            a(stringExtra);
        } else {
            b(4, "parseData no have requestType");
        }
    }

    private void a(String str) {
        String strA = led.a(str);
        int[] iArrB = led.b(str);
        int[] iArrC = led.c(str);
        if (TextUtils.isEmpty(strA)) {
            b(2, "startAuthActivity requestPackageName is empty");
            return;
        }
        if (iArrB.length == 0 && iArrC.length == 0) {
            b(2, "startAuthActivity scopeReadTypes length is 0 or scopeWriteTypes length is 0");
            return;
        }
        if (!d(strA)) {
            b(2, "startAuthActivity start requestPackageName failed");
            return;
        }
        int iE = led.e(str);
        Message messageObtain = Message.obtain();
        messageObtain.what = 101;
        messageObtain.obj = strA;
        messageObtain.arg1 = iE;
        Bundle bundle = new Bundle();
        bundle.putIntArray("writeTypes", iArrC);
        bundle.putIntArray("readTypes", iArrB);
        messageObtain.setData(bundle);
        c(messageObtain);
    }

    private void c(Message message) {
        Handler handler = this.d;
        if (handler == null) {
            b(4, "BridgeServiceActivity sendMessageToHandler is null");
        } else {
            handler.sendMessage(message);
        }
    }

    private boolean d(String str) {
        String callingPackage = getCallingPackage();
        if (TextUtils.isEmpty(callingPackage)) {
            ReleaseLogUtil.e("HiH_BridgeServiceActivity", "checkPackageName callingPackage is invalid");
            return false;
        }
        if (f12362c.equals(callingPackage)) {
            ReleaseLogUtil.e("HiH_BridgeServiceActivity", "checkPackageName callingPackage is health");
            return true;
        }
        if (callingPackage.equals(str)) {
            return true;
        }
        ReleaseLogUtil.e("HiH_BridgeServiceActivity", "checkPackageName packageName is different, callingPackage:" + callingPackage + ", packageName from intent:" + str);
        return false;
    }

    private void b(int i, String str) {
        ReleaseLogUtil.e("HiH_BridgeServiceActivity", "finishErrorReturn:" + str + ", resultCode:" + i);
        setResult(i);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        LogUtil.a("BridgeServiceActivity", "start handleAuthMessage");
        if (message.getData() == null) {
            b(2, "handleAuthMessage bundle is null");
            return;
        }
        if (!(message.obj instanceof String)) {
            b(2, "handleAuthMessage message.obj is not string");
            return;
        }
        Intent intentA = a();
        b(intentA, message);
        startActivity(intentA);
        setResult(0);
        finish();
    }

    private Intent a() {
        Intent intent = new Intent();
        String str = f12362c;
        intent.setClassName(str, "com.huawei.ui.main.stories.me.activity.thirdparty.HealthKitThirdPartyAuthActivity");
        intent.setPackage(str);
        intent.setFlags(268435456);
        intent.addFlags(134217728);
        intent.addFlags(524288);
        intent.addFlags(8388608);
        return intent;
    }

    private void b(Intent intent, Message message) {
        if (message.obj instanceof String) {
            try {
                Bundle data = message.getData();
                String str = (String) message.obj;
                int[] intArray = data.getIntArray("writeTypes");
                int[] intArray2 = data.getIntArray("readTypes");
                intent.putExtra("third_party_package_name", str);
                intent.putExtra("writeTypes", intArray);
                intent.putExtra("readTypes", intArray2);
                intent.putExtra("uidTypes", message.arg1);
                intent.putExtra(MapKeyNames.APP_INFO, c(getApplicationContext(), str));
            } catch (ArrayIndexOutOfBoundsException e) {
                ReleaseLogUtil.a("HiH_BridgeServiceActivity", "addExtraAuthIntentData ArrayIndexOutOfBoundsException", LogAnonymous.b(e));
            }
        }
    }

    private HiAppInfo c(Context context, String str) {
        HiAppInfo hiAppInfoD = kwi.b().d(str);
        if (hiAppInfoD != null) {
            return hiAppInfoD;
        }
        HiAppInfo hiAppInfoA = ljp.a(context, str);
        if (hiAppInfoA == null) {
            return hiAppInfoA;
        }
        kwi.b().d(hiAppInfoA, 0);
        return kwi.b().d(str);
    }

    private void c() {
        HandlerThread handlerThread = this.f12363b;
        if (handlerThread == null || handlerThread.getLooper() == null) {
            return;
        }
        ReleaseLogUtil.d("HiH_BridgeServiceActivity", "enter quitHandlerThread.");
        this.f12363b.getLooper().quit();
        this.f12363b = null;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        c();
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.d = null;
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
