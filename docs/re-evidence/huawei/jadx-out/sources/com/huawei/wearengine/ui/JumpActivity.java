package com.huawei.wearengine.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.wearengine.auth.AuthListenerManagerProxy;
import defpackage.yit;
import defpackage.yiv;
import defpackage.ykz;
import defpackage.yln;
import defpackage.ylo;
import java.util.List;

/* JADX INFO: loaded from: classes46.dex */
public class JumpActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HandlerThread f30817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f30818c;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        yit.e("JumpActivity", "JumpActivity onCreate");
        super.onCreate(bundle);
        yiv.c(this);
        a();
        Intent intent = getIntent();
        if (intent == null) {
            d(5, "JumpActivity start invalid intent");
        } else {
            b(intent);
        }
    }

    private void a() {
        HandlerThread handlerThread = new HandlerThread("JumpActivityHandlerThread");
        this.f30817b = handlerThread;
        handlerThread.start();
        if (this.f30817b.getLooper() == null) {
            yit.c("JumpActivity", "initHandler mWorkThread getLooper is null!");
            this.f30817b.quit();
            d(12, "initHandler looper is null");
            return;
        }
        this.f30818c = new Handler(this.f30817b.getLooper()) { // from class: com.huawei.wearengine.ui.JumpActivity.3
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                int i = message.what;
                if (i == 1001) {
                    JumpActivity.this.e(message);
                } else {
                    if (i != 1002) {
                        return;
                    }
                    JumpActivity.this.b(message);
                }
            }
        };
    }

    private void b(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("start_request_json");
            if (TextUtils.isEmpty(stringExtra)) {
                d(5, "JumpActivity start requestDataJson is empty");
                return;
            }
            String strB = ykz.b(stringExtra);
            if (TextUtils.isEmpty(strB)) {
                d(5, "JumpActivity start requestType data is empty");
            } else if (strB.equals("request_auth")) {
                d(stringExtra);
            } else {
                d(5, "JumpActivity start no have requestType");
            }
        } catch (BadParcelableException unused) {
            yit.b("JumpActivity", "getStringExtra catch a BadParcelableException");
            d(12, "resolveData exception");
        } catch (RuntimeException unused2) {
            yit.b("JumpActivity", "getStringExtra catch a RuntimeException");
            d(12, "resolveData exception");
        }
    }

    private void d(String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1002;
        messageObtain.obj = str;
        d(messageObtain);
    }

    private void d(Message message) {
        Handler handler = this.f30818c;
        if (handler == null) {
            yit.c("JumpActivity", "JumpActivity sendMessageToHandler is null");
        } else {
            handler.sendMessage(message);
        }
    }

    private boolean a(String str) {
        String callingPackage = getCallingPackage();
        if (TextUtils.isEmpty(callingPackage)) {
            yit.c("JumpActivity", "checkPackageName callingPackage is invalid");
            return false;
        }
        if ("com.huawei.health".equals(callingPackage)) {
            yit.c("JumpActivity", "callingPackage is health");
            return true;
        }
        if (callingPackage.equals(str)) {
            return true;
        }
        yit.c("JumpActivity", "packageName is different, callingPackage:" + callingPackage + ", packageName from intent:" + str);
        return false;
    }

    private void d(int i, String str) {
        yit.c("JumpActivity", "errorReturn:" + str + ", resultCode:" + i);
        setResult(i + 1000);
        finish();
    }

    private void d(String str, String[] strArr) {
        yit.e("JumpActivity", "startAuthActivity");
        Intent intentA = ylo.a(str, strArr);
        if (intentA == null) {
            d(12, "startAuthActivity intent is null");
            return;
        }
        startActivity(intentA);
        setResult(1000);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        yit.e("JumpActivity", "Start handleScopeAuthMessage" + getCallingPackage());
        if (!(message.obj instanceof String)) {
            yit.c("JumpActivity", "handleScopeAuthMessage message.obj is not string");
            return;
        }
        String str = (String) message.obj;
        String strC = ykz.c(str);
        String[] strArrE = ykz.e(str);
        if (TextUtils.isEmpty(strC) || strArrE.length == 0) {
            d(5, "JumpActivity start requestPackageName is empty or permissionTypes is null or permissionTypes length is 0");
            return;
        }
        if (!a(strC)) {
            d(5, "handleScopeAuthMessage JumpActivity start requestPackageName failed");
            return;
        }
        List<String> listD = ylo.d(strC);
        if (ylo.e(strArrE, listD)) {
            AuthListenerManagerProxy authListenerManagerProxy = new AuthListenerManagerProxy(getApplicationContext());
            try {
                yit.e("JumpActivity", "handleScopeAuthMessage authListener.onOk");
                authListenerManagerProxy.authListenerOnOk(strC, ylo.e(listD));
                d(0, " authListener.onOk");
                return;
            } catch (RemoteException unused) {
                yit.b("JumpActivity", "handleScopeAuthMessage RemoteException");
                d(12, "handleScopeAuthMessage RemoteException");
                return;
            }
        }
        if (!ylo.d(getCallingPackage(), ylo.e(yln.j(yiv.a(), getCallingPackage())))) {
            d(12, "handleScopeAuthMessage invalid external invoking");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1001;
        messageObtain.obj = strC;
        Bundle bundle = new Bundle();
        bundle.putStringArray("permissions", strArrE);
        messageObtain.setData(bundle);
        d(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        yit.e("JumpActivity", "Start handleAuthMessage");
        Bundle data = message.getData();
        if (data == null) {
            d(12, "handleAuthMessage bundle is null");
        } else {
            if (!(message.obj instanceof String)) {
                d(12, "handleAuthMessage message.obj is not string");
                return;
            }
            try {
                d((String) message.obj, data.getStringArray("permissions"));
            } catch (ArrayIndexOutOfBoundsException unused) {
                d(12, "handleAuthMessage getStringArray ArrayIndexOutOfBoundsException");
            }
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Handler handler = this.f30818c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f30818c = null;
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
