package com.huawei.watchface;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.kit.awareness.status.CapabilityStatus;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.hwid.SignInResult;
import com.huawei.hms.support.api.pay.HuaweiPay;
import com.huawei.hms.support.api.pay.PayResultInfo;
import com.huawei.hms.support.common.ActivityMgr;
import com.huawei.hms.support.hwid.HuaweiIdAuthAPIManager;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.secure.android.common.intent.SafeIntent;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.ui.activity.HMSSignAuthAgentActivity;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import defpackage.orf;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes45.dex */
public class k1 {
    public static k1 g = new k1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30260c;
    public volatile boolean d = false;
    public List e = new CopyOnWriteArrayList();
    public List f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile HuaweiApiClient f30258a = a(new b(), new c());

    public interface a {
        void a();

        void b();
    }

    public class b implements HuaweiApiClient.ConnectionCallbacks {
        public b() {
        }

        @Override // com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks
        public void onConnected() {
            k1 k1Var = k1.this;
            if (k1Var.f30260c) {
                k1Var.b((d) null);
            }
            HwLog.i("HMSSignHelper", "HuaweiApiClient Connect Successfully!");
            k1.this.c();
        }

        @Override // com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            HwLog.i("HMSSignHelper", "HuaweiApiClient Disconnected!");
            k1.this.d();
            Activity currentActivity = ActivityMgr.INST.getCurrentActivity();
            if (currentActivity != null) {
                k1.this.a().connect(currentActivity);
            }
        }
    }

    public class c implements HuaweiApiClient.OnConnectionFailedListener {
        public c() {
        }

        @Override // com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener
        public void onConnectionFailed(ConnectionResult connectionResult) {
            HwLog.i("HMSSignHelper", "HuaweiApiClient Connect Failed!  Error code：" + connectionResult.getErrorCode());
            if (connectionResult.getErrorCode() == 6) {
                PayResultInfo payResultInfo = new PayResultInfo();
                payResultInfo.setReturnCode(CapabilityStatus.AWA_CAP_CODE_WIFI);
                i2.a((Context) Environment.getApplicationContext()).b(payResultInfo);
            }
            i2.a((Context) Environment.getApplicationContext()).b(connectionResult);
            k1.this.d();
            k1.this.e();
            if (!k1.this.f30259b && HuaweiApiAvailability.getInstance().isUserResolvableError(connectionResult.getErrorCode())) {
                Activity currentActivity = ActivityMgr.INST.getCurrentActivity();
                if (currentActivity == null) {
                    HwLog.i("HMSSignHelper", "null == lastActivity");
                    return;
                }
                HwLog.e("HMSSignHelper", "resolveError");
                if (CommonUtils.x()) {
                    HuaweiApiAvailability.getInstance().resolveError(currentActivity, connectionResult.getErrorCode(), 1000);
                    k1.this.f30259b = true;
                }
            }
        }
    }

    public interface d {
    }

    public class e implements ResultCallback {
        public e() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(SignInResult signInResult) {
            if (signInResult == null) {
                k1.this.e();
                k1.this.g();
                return;
            }
            if (signInResult.isSuccess()) {
                HwLog.i("HMSSignHelper", "Login successful!");
                AuthHuaweiId authHuaweiId = signInResult.getAuthHuaweiId();
                if (authHuaweiId != null) {
                    k1.this.a(authHuaweiId.getAccessToken());
                    k1.this.g();
                    return;
                }
                return;
            }
            HwLog.i("HMSSignHelper", "onResult : result is Success false");
            if (signInResult.getStatus().getStatusCode() != 2002) {
                if (signInResult.getStatus().getStatusCode() == 2005) {
                    HwLog.i("HMSSignHelper", "result.getStatus().getStatusCode() == HuaweiIdStatusCodes.SIGN_IN_NETWORK_ERROR");
                    k1.this.e();
                    k1.this.g();
                    return;
                } else {
                    HwLog.i("HMSSignHelper", "last branch");
                    k1.this.e();
                    k1.this.g();
                    return;
                }
            }
            HwLog.i("HMSSignHelper", "Account is logged in and requires user authorization!");
            Intent data = signInResult.getData();
            if (data == null) {
                k1.this.e();
                k1.this.g();
                return;
            }
            HwLog.i("HMSSignHelper", "SignInResult startActivityForResult");
            Activity currentActivity = ActivityMgr.INST.getCurrentActivity();
            if (currentActivity == null) {
                k1.this.e();
                k1.this.g();
            } else {
                Intent intent = new Intent(currentActivity, (Class<?>) HMSSignAuthAgentActivity.class);
                intent.putExtra(HMSSignAuthAgentActivity.EXTRA_INTENT, data);
                orf.a(currentActivity, intent);
            }
        }
    }

    public static k1 b() {
        return g;
    }

    public HuaweiApiClient a() {
        synchronized (k1.class) {
            if (this.f30258a == null) {
                this.f30258a = a(new b(), new c());
            }
        }
        return this.f30258a;
    }

    public final void c() {
        HwLog.i("HMSSignHelper", "notifyConnectCallBacks " + this.f.size());
        for (a aVar : this.f) {
            this.f.remove(aVar);
            aVar.b();
        }
    }

    public final void d() {
        HwLog.i("HMSSignHelper", "notifyConnectCallBacksFail : " + this.f.size());
        for (a aVar : this.f) {
            this.f.remove(aVar);
            aVar.a();
        }
    }

    public final void e() {
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            j1.a(it.next());
            this.e.remove((Object) null);
            throw null;
        }
    }

    public final void f() {
        a(ActivityMgr.INST.getCurrentActivity());
    }

    public final void g() {
        HwLog.i("HMSSignHelper", "resetStatus");
        this.f30260c = false;
        this.d = false;
        this.e.clear();
    }

    public void b(a aVar) {
        a(ActivityMgr.INST.getCurrentActivity(), aVar);
    }

    public void b(d dVar) {
        HuaweiApiClient huaweiApiClientA = a();
        if (dVar != null) {
            a(dVar);
        }
        if (!huaweiApiClientA.isConnected()) {
            if (ActivityMgr.INST.getCurrentActivity() == null) {
                HwLog.i("HMSSignHelper", "ActivityMgr.INST.getLastActivity() == null");
                e();
                return;
            } else {
                f();
                this.f30260c = true;
                return;
            }
        }
        if (this.d) {
            HwLog.i("HMSSignHelper", "isSignIning");
        } else if (ActivityMgr.INST.getCurrentActivity() == null) {
            HwLog.i("HMSSignHelper", "lastActivity == null");
        } else {
            HuaweiIdAuthAPIManager.HuaweiIdAuthAPIService.signInBackend(huaweiApiClientA).setResultCallback(new e());
        }
    }

    public final HuaweiApiClient a(HuaweiApiClient.ConnectionCallbacks connectionCallbacks, HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new HuaweiApiClient.Builder(Environment.getApplicationContext()).addApi(HuaweiIdAuthAPIManager.HUAWEI_OAUTH_API, HuaweiIdAuthParams.DEFAULT_AUTH_REQUEST_PARAM).addApi(HuaweiPay.PAY_API).addScope(HuaweiIdAuthAPIManager.HUAWEIID_BASE_SCOPE).addConnectionCallbacks(connectionCallbacks).addOnConnectionFailedListener(onConnectionFailedListener).build();
    }

    public final void a(Activity activity) {
        a(activity, (a) null);
    }

    public void a(Activity activity, a aVar) {
        a(aVar);
        HuaweiApiClient huaweiApiClientA = a();
        if (huaweiApiClientA.isConnected()) {
            c();
            return;
        }
        if (activity == null) {
            HwLog.i("HMSSignHelper", "activity == null");
            d();
        } else if (huaweiApiClientA.isConnecting()) {
            HwLog.i("HMSSignHelper", "mClient.isConnecting()");
        } else {
            huaweiApiClientA.connect(activity);
        }
    }

    public final void a(a aVar) {
        HwLog.i("HMSSignHelper", "addConnectCallbacks");
        if (aVar == null) {
            HwLog.i("HMSSignHelper", "null == connectCallback");
        } else {
            if (this.f.contains(aVar)) {
                return;
            }
            this.f.add(aVar);
        }
    }

    public final void a(d dVar) {
        HwLog.i("HMSSignHelper", "addSignInCallbacks");
        if (this.e.contains(dVar)) {
            return;
        }
        this.e.add(dVar);
    }

    public final void a(String str) {
        HwLog.i("HMSSignHelper", "notifySignInCallBacks : " + this.e.size());
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            j1.a(it.next());
            this.e.remove((Object) null);
            throw null;
        }
    }

    public void a(int i, int i2, Intent intent) {
        SafeIntent safeIntent = new SafeIntent(intent);
        if (i != 1001) {
            if (i == 1000) {
                e();
                g();
                a(i2, safeIntent);
                return;
            }
            return;
        }
        if (i2 == -1) {
            HwLog.i("HMSSignHelper", "User has authorized!");
            SignInResult hwIdSignInResultFromIntent = HuaweiIdAuthAPIManager.HuaweiIdAuthAPIService.getHwIdSignInResultFromIntent(safeIntent);
            if (hwIdSignInResultFromIntent == null) {
                e();
                g();
                return;
            }
            if (hwIdSignInResultFromIntent.isSuccess()) {
                HwLog.i("HMSSignHelper", "User authorization successful, return account information");
                AuthHuaweiId authHuaweiId = hwIdSignInResultFromIntent.getAuthHuaweiId();
                if (authHuaweiId != null) {
                    a(authHuaweiId.getAccessToken());
                    g();
                    return;
                }
                return;
            }
            HwLog.i("HMSSignHelper", "Failed authorization! Reason:" + hwIdSignInResultFromIntent.getStatus().toString());
            e();
            g();
            return;
        }
        HwLog.i("HMSSignHelper", "User not authorized!");
        e();
        g();
    }

    public final void a(int i, Intent intent) {
        SafeIntent safeIntent = new SafeIntent(intent);
        this.f30259b = false;
        if (i == -1) {
            int intExtra = safeIntent.getIntExtra(BridgeActivity.EXTRA_RESULT, -1);
            if (intExtra == 0) {
                HwLog.i("HMSSignHelper", "Error resolved successfully!");
                f();
                return;
            } else if (intExtra == 13) {
                HwLog.i("HMSSignHelper", "Resolve error process canceled by user!");
                return;
            } else if (intExtra == 8) {
                HwLog.i("HMSSignHelper", "Internal error occurred, recommended retry.");
                return;
            } else {
                HwLog.i("HMSSignHelper", "Other error codes.");
                return;
            }
        }
        HwLog.i("HMSSignHelper", "An error occurred invoking the solution!");
    }
}
