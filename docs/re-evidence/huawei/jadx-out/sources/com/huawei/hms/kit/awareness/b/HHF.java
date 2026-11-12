package com.huawei.hms.kit.awareness.b;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcelable;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.kit.awareness.internal.hmscore.AwarenessInBean;
import com.huawei.hms.kit.awareness.internal.hmscore.AwarenessOutBean;
import com.huawei.hms.kit.awareness.quickapp.SubAppInfo;
import com.huawei.hms.kit.awareness.sdk.R;
import com.huawei.hms.support.common.ActivityMgr;
import com.huawei.hms.utils.UIUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
class HHF implements AvailableAdapter.AvailableCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13870a = "AwarenessConnection";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f13871b = 5000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile HHF f13872c;
    private HHC d;
    private final Context e;
    private volatile Intent g;
    private volatile com.huawei.hms.kit.awareness.a h;
    private com.huawei.hms.kit.awareness.b.a.b.a i = com.huawei.hms.kit.awareness.b.a.b.a.a();
    private com.huawei.hms.kit.awareness.b.a.b.a j = com.huawei.hms.kit.awareness.b.a.b.a.a();
    private volatile int k = 0;
    private volatile boolean l = true;
    private int m = 0;
    private final ServiceConnection f = new ServiceConnection() { // from class: com.huawei.hms.kit.awareness.b.HHF.1
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            HHF.this.b();
            HHF.this.c();
            com.huawei.hms.kit.awareness.b.a.c.b(HHF.f13870a, "AwarenessService Connect Failed.", new Object[0]);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            HHF.this.h = com.huawei.hms.kit.awareness.a.AbstractBinderC0139a.a(iBinder);
            HHF.this.i.b();
            com.huawei.hms.kit.awareness.b.a.c.b(HHF.f13870a, "AwarenessService Connect Success.", new Object[0]);
        }
    };

    @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
    public void onComplete(int i) {
        b();
        com.huawei.hms.kit.awareness.b.a.c.b(f13870a, "Update HWID Complete", new Object[0]);
    }

    void a(boolean z) {
        com.huawei.hms.kit.awareness.b.a.c.b(f13870a, "setEnableUpdateWindow: " + z, new Object[0]);
        this.l = z;
    }

    void a(SubAppInfo subAppInfo) {
        try {
            HHC hhc = new HHC(this.e);
            this.d = hhc;
            hhc.setSubAppId(subAppInfo.getSubAppId());
            com.huawei.hms.kit.awareness.b.a.c.b(f13870a, "sub appId : " + subAppInfo.getSubAppId() + "sub URL: " + subAppInfo.getUrls() + "sub pkg : " + subAppInfo.getSubAppId(), new Object[0]);
            AwarenessInBean awarenessInBean = new AwarenessInBean();
            awarenessInBean.setInBeanJsonString(subAppInfo);
            this.d.a(awarenessInBean);
        } catch (ApiException unused) {
            com.huawei.hms.kit.awareness.b.a.c.d(f13870a, "set Awareness API failed", new Object[0]);
        }
    }

    final void a(int i) {
        synchronized (this) {
            b(i);
            if (this.g == null || this.h == null) {
                if (this.m >= 3) {
                    throw new HHG(10001, "failed time of binding service is more than three.");
                }
                d();
                if (!this.j.a(5000L)) {
                    com.huawei.hms.kit.awareness.b.a.c.d(f13870a, "Waiting intent timeout!", new Object[0]);
                    throw new HHG(10003, "Wait Intent.");
                }
                if (!this.i.a(5000L)) {
                    com.huawei.hms.kit.awareness.b.a.c.d(f13870a, "Binding service timeout!", new Object[0]);
                    throw new HHG(10003, "Bind Service.");
                }
                if (this.k != 0) {
                    c();
                    throw new HHJ(this.k);
                }
            }
        }
    }

    com.huawei.hms.kit.awareness.a a() {
        return this.h;
    }

    private String e() {
        JSONObject jSONObjectB = HHA.a().b();
        if (jSONObjectB == null) {
            return null;
        }
        try {
            int callingUid = Binder.getCallingUid();
            String nameForUid = this.e.getPackageManager().getNameForUid(callingUid);
            String string = jSONObjectB.getString("packageName");
            if (!com.huawei.hms.kit.awareness.barrier.internal.f.c.a(nameForUid) && nameForUid.equals(string)) {
                jSONObjectB.put("uid", callingUid);
                return jSONObjectB.toString();
            }
            com.huawei.hms.kit.awareness.b.a.c.d(f13870a, "pkg name from agcFile is not equals pkg name from PackageManager: " + string, new Object[0]);
            return null;
        } catch (JSONException unused) {
            com.huawei.hms.kit.awareness.b.a.c.d(f13870a, "set uid failed ", new Object[0]);
            return null;
        }
    }

    private void d() {
        this.d.c().addOnSuccessListener(new OnSuccessListener() { // from class: com.huawei.hms.kit.awareness.b.HHF$$ExternalSyntheticLambda0
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f$0.a((AwarenessOutBean) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.hms.kit.awareness.b.HHF$$ExternalSyntheticLambda1
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                HHF.a(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.i = com.huawei.hms.kit.awareness.b.a.b.a.a();
        this.j = com.huawei.hms.kit.awareness.b.a.b.a.a();
    }

    private boolean b(Intent intent) {
        Activity activityA = HHB.a();
        if (activityA == null) {
            return false;
        }
        try {
            activityA.startActivityForResult(intent, 0);
            return true;
        } catch (ActivityNotFoundException e) {
            com.huawei.hms.kit.awareness.b.a.c.d(f13870a, "AwarenessKit apk showDialog error: " + e.getMessage(), new Object[0]);
            return false;
        }
    }

    private void b(Context context) {
        AvailableAdapter availableAdapter;
        int iIsHuaweiMobileServicesAvailable;
        if (this.l && (iIsHuaweiMobileServicesAvailable = (availableAdapter = new AvailableAdapter(context.getResources().getInteger(R.integer.HMS_FWK_MINI_VERSION))).isHuaweiMobileServicesAvailable(context)) != 0 && availableAdapter.isUserResolvableError(iIsHuaweiMobileServicesAvailable)) {
            Activity currentActivity = ActivityMgr.INST.getCurrentActivity();
            if (currentActivity != null) {
                availableAdapter.startResolution(currentActivity, this);
                return;
            }
            Activity activityA = HHB.a();
            if (activityA == null || activityA.isDestroyed()) {
                return;
            }
            availableAdapter.startResolution(activityA, this);
        }
    }

    private void b(int i) {
        com.huawei.hms.kit.awareness.b.a.c.b(f13870a, "set current api level : " + i + " last success api level: " + this.d.b(), new Object[0]);
        if (i > this.d.b()) {
            if (this.h != null) {
                try {
                    this.e.unbindService(this.f);
                    com.huawei.hms.kit.awareness.b.a.c.b(f13870a, "setApiLevel, Unbind service success", new Object[0]);
                } catch (IllegalArgumentException unused) {
                    com.huawei.hms.kit.awareness.b.a.c.d(f13870a, "setApiLevel, unbindService IllegalArgumentException!", new Object[0]);
                }
            }
            c();
            b();
        }
        this.d.a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.g = null;
        this.h = null;
    }

    private boolean a(Parcelable parcelable) {
        if (!this.l) {
            return false;
        }
        if (parcelable instanceof Intent) {
            return b((Intent) parcelable);
        }
        if (parcelable instanceof PendingIntent) {
            return a((PendingIntent) parcelable);
        }
        return false;
    }

    private boolean a(Intent intent) {
        com.huawei.hms.kit.awareness.b.a.c.b(f13870a, "bindService: get intent from core successfully", new Object[0]);
        String strE = e();
        if (!com.huawei.hms.kit.awareness.barrier.internal.f.c.a(strE)) {
            this.g = intent;
            this.g.putExtra(com.huawei.hms.kit.awareness.b.a.a.f13878a, strE);
            this.g.setType(this.e.getPackageName() + Binder.getCallingUid());
            try {
                this.e.bindService(this.g, this.f, 1);
                return true;
            } catch (SecurityException unused) {
                com.huawei.hms.kit.awareness.b.a.c.d(f13870a, "bind AwarenessService failed!", new Object[0]);
                this.m++;
            }
        }
        return false;
    }

    private boolean a(PendingIntent pendingIntent) {
        if (!this.l) {
            return false;
        }
        if (UIUtil.isBackground(this.e)) {
            com.huawei.hms.kit.awareness.b.a.c.a(f13870a, "is background, do not show Dialog", new Object[0]);
            return false;
        }
        Activity activityA = HHB.a();
        if (activityA == null) {
            return false;
        }
        try {
            activityA.startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 0, 0, 0);
            return true;
        } catch (IntentSender.SendIntentException e) {
            com.huawei.hms.kit.awareness.b.a.c.d(f13870a, "AwarenessKit apk showDialog error: " + e.getMessage(), new Object[0]);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Exception exc) {
        com.huawei.hms.kit.awareness.b.a.c.d(f13870a, "Connect to Core Error.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AwarenessOutBean awarenessOutBean) {
        this.k = awarenessOutBean.getCode();
        int code = awarenessOutBean.getCode();
        if (code == 0) {
            this.d.a();
            Intent intent = awarenessOutBean.getIntent();
            if (intent == null || !a(intent)) {
                return;
            }
            this.j.b();
            return;
        }
        if (code == 1212) {
            this.j.b();
            this.i.b();
            b();
            com.huawei.hms.kit.awareness.b.a.c.a(f13870a, "showDialog: " + a(awarenessOutBean.getParcelable()), new Object[0]);
            return;
        }
        if (code != 907135003) {
            this.j.b();
            this.i.b();
            return;
        }
        this.j.b();
        this.i.b();
        PendingIntent pendingIntent = awarenessOutBean.getPendingIntent();
        if (pendingIntent != null) {
            a(pendingIntent);
        } else {
            b(this.e);
        }
    }

    static HHF a(Context context) {
        if (f13872c == null) {
            synchronized (HHF.class) {
                if (f13872c == null) {
                    f13872c = new HHF(context);
                }
            }
        }
        return f13872c;
    }

    private HHF(Context context) {
        this.d = new HHC(context);
        this.e = context.getApplicationContext();
    }
}
