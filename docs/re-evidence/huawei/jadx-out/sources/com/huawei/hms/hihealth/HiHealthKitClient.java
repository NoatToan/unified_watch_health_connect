package com.huawei.hms.hihealth;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.api.Api;
import com.huawei.hms.health.aabz;
import com.huawei.hms.health.aacb;
import com.huawei.hms.health.aaci;
import com.huawei.hms.health.aack;
import com.huawei.hms.health.aacn;
import com.huawei.hms.health.aacs;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.hwid.HuaweiIdAuthManager;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthService;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class HiHealthKitClient {
    private HandlerThread aab;
    private Handler aaba;
    private List<Scope> aabb;
    private Activity aabd;
    private long aabf;
    private Timer aabg;
    private TimerTask aabh;
    private com.huawei.hms.hihealth.aabh aabi;
    private CountDownLatch aabj;
    private Context aabc = null;
    private Activity aabe = null;
    private AtomicBoolean aabk = new AtomicBoolean(false);
    private AtomicBoolean aabl = new AtomicBoolean(false);
    private ExecutorService aabm = Executors.newSingleThreadExecutor();
    private aabd aabn = new aabd(null);
    private List<aabg> aabo = new CopyOnWriteArrayList();
    private ServiceConnection aabp = new aab();

    static class aabd extends com.huawei.hms.hihealth.aab.AbstractBinderC0117aab {
        /* synthetic */ aabd(aab aabVar) {
        }
    }

    public interface aabg {
    }

    static class aabh {
        public static final HiHealthKitClient aab = new HiHealthKitClient();
    }

    /* JADX INFO: loaded from: classes34.dex */
    static class aabi implements OnSuccessListener<AuthHuaweiId> {
        /* synthetic */ aabi(aab aabVar) {
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        public void onSuccess(AuthHuaweiId authHuaweiId) {
            aabz.aabb("HiHealthKitClient", authHuaweiId == null ? "silentSignIn huaweiId is null" : "silentSignIn success");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aab(boolean z) {
        TimerTask timerTask = this.aabh;
        if (timerTask != null) {
            timerTask.cancel();
            this.aabh = null;
            if (z) {
                aabz.aabb("HiHealthKitClient", "disconnect delay timer task delay");
                if (this.aabh == null) {
                    com.huawei.hms.hihealth.aaba aabaVar = new com.huawei.hms.hihealth.aaba(this);
                    this.aabh = aabaVar;
                    this.aabg.schedule(aabaVar, 10000L);
                }
            }
        }
    }

    static /* synthetic */ void aabh(HiHealthKitClient hiHealthKitClient) {
        List<Scope> list = hiHealthKitClient.aabb;
        if (list == null || list.isEmpty()) {
            aabz.aabc("HiHealthKitClient", "scope list is invalid");
            return;
        }
        if (hiHealthKitClient.aabd == null) {
            aabz.aab("HiHealthKitClient", "mActivity is null");
            return;
        }
        Iterator<Scope> it = hiHealthKitClient.aabb.iterator();
        while (it.hasNext()) {
            if (it.next().getScopeUri() == null) {
                aabz.aabc("HiHealthKitClient", "some scope url is null");
                it.remove();
            }
        }
        HuaweiIdAuthParamsHelper huaweiIdAuthParamsHelper = new HuaweiIdAuthParamsHelper();
        if (hiHealthKitClient.aabb.isEmpty()) {
            aabz.aabb("HiHealthKitClient", "requestScopes scope array is empty");
        } else {
            aabz.aabb("HiHealthKitClient", "requestScopes scope array is not empty");
            huaweiIdAuthParamsHelper = huaweiIdAuthParamsHelper.setScopeList(hiHealthKitClient.aabb);
        }
        HuaweiIdAuthParams huaweiIdAuthParamsCreateParams = huaweiIdAuthParamsHelper.createParams();
        if (huaweiIdAuthParamsCreateParams == null) {
            aabz.aab("HiHealthKitClient", "signIn authParams is null");
            return;
        }
        Activity activity = hiHealthKitClient.aabd;
        if (activity == null) {
            aabz.aab("HiHealthKitClient", "signIn mActivity is null");
        } else {
            HuaweiIdAuthService service = HuaweiIdAuthManager.getService(activity.getApplicationContext(), huaweiIdAuthParamsCreateParams);
            service.silentSignIn().addOnSuccessListener(new aabi(null)).addOnFailureListener(new com.huawei.hms.hihealth.aabb(hiHealthKitClient, service));
        }
    }

    static /* synthetic */ void aabj(HiHealthKitClient hiHealthKitClient) {
        if (hiHealthKitClient.aabk.get()) {
            hiHealthKitClient.aaba.removeMessages(1000);
            hiHealthKitClient.aaba();
            hiHealthKitClient.aabf = System.currentTimeMillis();
        }
    }

    public IInterface bindServiceWithOutCheckEmui(int i) throws SecurityException {
        this.aaba.removeMessages(1000);
        aab(true);
        IInterface iInterfaceAab = aack.aabe().aab(i);
        if (iInterfaceAab != null && isConnected()) {
            return iInterfaceAab;
        }
        aab();
        IBinder iBinderQueryBinder = queryBinder(i);
        if (iBinderQueryBinder != null) {
            return new aabf(i, iBinderQueryBinder).aab();
        }
        aabz.aab("HiHealthKitClient", "queryBinder binder is null");
        return null;
    }

    public void connectHmsWithTransActivity(Activity activity) {
        com.huawei.hms.health.aabn aabnVarAab = com.huawei.hms.health.aabk.aab(activity, new com.huawei.hms.health.aabl());
        if (this.aabj == null) {
            this.aabj = new CountDownLatch(1);
        }
        Checker.checkNonNull(new com.huawei.hms.health.aabo());
        Task<com.huawei.hms.health.aabp> taskDoWrite = ((com.huawei.hms.health.aabj) aabnVarAab).doWrite(new com.huawei.hms.health.aabm("hihealth.getHmsHealthService", "HealthHmsInputBean"));
        if (com.huawei.hms.health.aabf.aaba() != null) {
            com.huawei.hms.health.aabf.aaba().sendEmptyMessageDelayed(2388, 1000L);
        }
        aab(taskDoWrite);
    }

    public void disconnect() {
        if (!aacs.aab(this.aabf, 30000L)) {
            if (this.aabh == null) {
                com.huawei.hms.hihealth.aaba aabaVar = new com.huawei.hms.hihealth.aaba(this);
                this.aabh = aabaVar;
                this.aabg.schedule(aabaVar, 10000L);
                return;
            }
            return;
        }
        aabz.aabb("HiHealthKitClient", "disconnect immediately");
        if (this.aabk.get()) {
            this.aaba.removeMessages(1000);
            aaba();
            this.aabf = System.currentTimeMillis();
        }
    }

    public IBinder queryBinder(int i) {
        String appId = Util.getAppId(this.aabc);
        if (!this.aabk.get()) {
            for (int i2 = 0; i2 < 5; i2++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException unused) {
                    aabz.aabb("HiHealthKitClient", "sleep error!");
                }
                if (this.aabk.get()) {
                    break;
                }
            }
            if (!this.aabk.get()) {
                aabz.aabc("HiHealthKitClient", "queryBinder not connected");
                if (this.aabl.get()) {
                    try {
                        this.aabc.unbindService(this.aabp);
                    } catch (IllegalArgumentException unused2) {
                        aabz.aab("HiHealthKitClient", "unbindService error");
                    }
                    this.aabl.getAndSet(false);
                    aabz.aabc("HiHealthKitClient", "unbind hmsService");
                }
                return null;
            }
        }
        com.huawei.hms.hihealth.aabh aabhVar = this.aabi;
        if (aabhVar != null) {
            try {
                ((com.huawei.hms.hihealth.aabh.aab.C0121aab) aabhVar).aab(this.aabn);
                return ((com.huawei.hms.hihealth.aabh.aab.C0121aab) this.aabi).aab(i, appId);
            } catch (RemoteException unused3) {
                aabz.aabc("HiHealthKitClient", "queryBinder query failed");
                if (this.aabl.get()) {
                    try {
                        this.aabc.unbindService(this.aabp);
                    } catch (IllegalArgumentException unused4) {
                        aabz.aab("HiHealthKitClient", "unbind hmsService error");
                    }
                    this.aabl.getAndSet(false);
                    aabz.aabc("HiHealthKitClient", "unbind hmsService");
                }
                this.aabk.getAndSet(false);
            }
        }
        aabz.aabc("HiHealthKitClient", "queryBinder failed something happened");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aab() {
        com.huawei.hms.health.aabn aabnVarAab;
        this.aaba.removeMessages(1000);
        if (this.aabk.get()) {
            return;
        }
        this.aabj = new CountDownLatch(1);
        if (this.aabe != null) {
            aabz.aabb("HiHealthKitClient", "enter connectWithHms with activity");
            aabnVarAab = com.huawei.hms.health.aabk.aab(this.aabe, new com.huawei.hms.health.aabl());
            this.aabe = null;
        } else {
            aabz.aabb("HiHealthKitClient", "enter connectWithHms with context");
            aabnVarAab = com.huawei.hms.health.aabk.aab(this.aabc, new com.huawei.hms.health.aabl());
        }
        if (this.aabj == null) {
            this.aabj = new CountDownLatch(1);
        }
        aab(((com.huawei.hms.health.aabj) aabnVarAab).aab(new com.huawei.hms.health.aabo()));
    }

    public void setContext(Context context) {
        aabz.aabb("HiHealthKitClient", "entry setContext,sdkVersion=6.15.0.301");
        this.aabc = context.getApplicationContext();
        if (context instanceof Activity) {
            this.aabe = (Activity) context;
        }
        aabc();
        this.aabg = new Timer();
    }

    public boolean isConnected() {
        return this.aabk.get();
    }

    public Context getContext() {
        return this.aabc;
    }

    public void delayedDisconnect() {
        if (this.aaba.hasMessages(1000)) {
            aabz.aabb("HiHealthKitClient", "delayedDisconnect remove first");
            this.aaba.removeMessages(1000);
        }
        if (this.aabc == null) {
            this.aaba.sendEmptyMessageDelayed(1000, 30000L);
            return;
        }
        int iAabb = aaci.aabc().aabb();
        aabz.aabb("HiHealthKitClient", "delayedDisconnect " + iAabb);
        this.aaba.sendEmptyMessageDelayed(1000, (long) iAabb);
    }

    public void countDownChange() {
        this.aabj.countDown();
    }

    public void connect() {
        if (this.aabk.get()) {
            return;
        }
        this.aabm.execute(new aaba());
    }

    public IInterface bindService(int i) throws SecurityException {
        aacb.aab();
        return bindServiceWithOutCheckEmui(i);
    }

    public void addServiceDisconnectedListener(aabg aabgVar) {
        this.aabo.add(aabgVar);
    }

    public static HiHealthKitClient getInstance() {
        return aabh.aab;
    }

    private void aabc() {
        synchronized (this) {
            if (this.aab == null) {
                HandlerThread handlerThread = new HandlerThread("kit_thread_handler");
                this.aab = handlerThread;
                handlerThread.start();
                this.aaba = new aabc(this.aab.getLooper());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aabb() {
        aabz.aabb("HiHealthKitClient", "begin executeServiceDisconnectedListener");
        Iterator<aabg> it = this.aabo.iterator();
        while (it.hasNext()) {
            ((aacn) it.next()).aab();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aaba() {
        String str;
        if (this.aabc == null) {
            aabz.aab("HiHealthKitClient", "disconnectWithHms, mContext is null");
            return;
        }
        if (this.aabl.get()) {
            aabz.aabb("HiHealthKitClient", "enter disconnectWithHms");
            try {
                this.aabc.unbindService(this.aabp);
            } catch (IllegalArgumentException unused) {
                str = "disconnectWithHms catch IllegalArgumentException";
                aabz.aaba("HiHealthKitClient", str);
            } catch (Exception unused2) {
                str = "disconnectWithHms catch basic exception";
                aabz.aaba("HiHealthKitClient", str);
            }
            this.aabl.getAndSet(false);
            this.aabk.getAndSet(false);
            aabb();
            aabz.aabc("HiHealthKitClient", "unbind hmsService success");
        }
    }

    private void aab(Task<com.huawei.hms.health.aabp> task) {
        task.addOnFailureListener(new aabe(null)).addOnSuccessListener(new aabb(task));
        try {
            if (this.aabj.await(5000L, TimeUnit.MILLISECONDS)) {
                return;
            }
        } catch (InterruptedException unused) {
            aabz.aabc("HiHealthKitClient", "connectWithHms connect service time out");
        }
        aabz.aabc("HiHealthKitClient", "connectWithHms connect service time out without interruption");
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class Builder {
        private Context aab;
        private Activity aaba;
        private final List<Scope> aabb;
        private final Map<Api<?>, Api.ApiOptions> aabc;

        public HiHealthKitClient build() {
            HiHealthKitClient hiHealthKitClient = HiHealthKitClient.getInstance();
            hiHealthKitClient.setContext(this.aab);
            hiHealthKitClient.aabb = this.aabb;
            hiHealthKitClient.aabd = this.aaba;
            return hiHealthKitClient;
        }

        public Builder addScope(Scope scope) {
            this.aabb.add(scope);
            return this;
        }

        public Builder addApi(Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            this.aabc.put(api, null);
            return this;
        }

        public Builder(Context context) {
            this.aabb = new ArrayList();
            this.aabc = new HashMap();
            this.aab = context;
            this.aaba = null;
            HiHealthKitClient.getInstance().setContext(this.aab);
        }

        public Builder(Activity activity) {
            this.aabb = new ArrayList();
            this.aabc = new HashMap();
            this.aab = activity.getApplicationContext();
            this.aaba = activity;
            HiHealthKitClient.getInstance().setContext(this.aab);
        }
    }

    class aab implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            aabz.aabb("ServiceConnection", "onServiceDisconnected success!");
            HiHealthKitClient.this.aabk.getAndSet(false);
            HiHealthKitClient.this.aabb();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            aabz.aabb("ServiceConnection", "onServiceConnected success!");
            HiHealthKitClient.this.aabi = com.huawei.hms.hihealth.aabh.aab.aab(iBinder);
            HiHealthKitClient.this.aabj.countDown();
            HiHealthKitClient.this.aabk.getAndSet(true);
        }

        aab() {
        }
    }

    class aaba implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            HiHealthKitClient.aabh(HiHealthKitClient.this);
            HiHealthKitClient.this.aab();
        }

        aaba() {
        }
    }

    class aabc extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            StringBuilder sbAab = com.huawei.hms.health.aab.aab("sync message begin to handle ");
            sbAab.append(message.what);
            aabz.aabb("HiHealthKitClient", sbAab.toString());
            if (message.what != 1000) {
                aabz.aabb("HiHealthKitClient", "unknown msg");
            } else {
                HiHealthKitClient.this.aaba();
                HiHealthKitClient.this.aab(false);
            }
        }

        aabc(Looper looper) {
            super(looper);
        }
    }

    static class aabf {
        private int aab;
        private IBinder aaba;

        public IInterface aab() {
            int i = this.aab;
            if (i == 1) {
                aabl aablVarAab = aabl.aab.aab(this.aaba);
                aack.aabe().aab(aablVarAab);
                return aablVarAab;
            }
            if (i == 2) {
                com.huawei.hms.hihealth.aabc aabcVarAab = com.huawei.hms.hihealth.aabc.aab.aab(this.aaba);
                aack.aabe().aab(aabcVarAab);
                return aabcVarAab;
            }
            if (i == 4) {
                com.huawei.hms.hihealth.aabg aabgVarAab = com.huawei.hms.hihealth.aabg.aab.aab(this.aaba);
                aack.aabe().aab(aabgVarAab);
                return aabgVarAab;
            }
            if (i == 5) {
                aabp aabpVarAab = aabp.aab.aab(this.aaba);
                aack.aabe().aab(aabpVarAab);
                return aabpVarAab;
            }
            if (i == 100) {
                com.huawei.hms.hihealth.aabi aabiVarAab = com.huawei.hms.hihealth.aabi.aab.aab(this.aaba);
                aack.aabe().aab(aabiVarAab);
                return aabiVarAab;
            }
            if (i == 7) {
                com.huawei.hms.hihealth.aabe aabeVarAab = com.huawei.hms.hihealth.aabe.aab.aab(this.aaba);
                aack.aabe().aab(aabeVarAab);
                return aabeVarAab;
            }
            if (i == 8) {
                aabj aabjVarAab = aabj.aab.aab(this.aaba);
                aack.aabe().aab(aabjVarAab);
                return aabjVarAab;
            }
            if (i != 9) {
                aabz.aab("HiHealthKitClient", "unknown apiType");
                return null;
            }
            aabn aabnVarAab = aabn.aab.aab(this.aaba);
            aack.aabe().aab(aabnVarAab);
            return aabnVarAab;
        }

        aabf(int i, IBinder iBinder) {
            this.aab = i;
            this.aaba = iBinder;
        }
    }

    class aabb implements OnSuccessListener<com.huawei.hms.health.aabp> {
        final /* synthetic */ Task aab;

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        public void onSuccess(com.huawei.hms.health.aabp aabpVar) {
            Intent intentAab = ((com.huawei.hms.health.aabp) this.aab.getResult()).aab();
            if (intentAab == null) {
                aabz.aabb("HiHealthKitClient", "onSuccess : Task optApkService fail. get intent failed!");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("sdkVersion", "6.15.0.301");
            intentAab.putExtras(bundle);
            if (HiHealthKitClient.this.aabc == null) {
                aabz.aab("HiHealthKitClient", "HiHealthClient connect onSuccess,  context is null");
                return;
            }
            aacs.aab(intentAab, HMSPackageManager.getInstance(HiHealthKitClient.this.aabc).getHMSPackageName());
            boolean zBindService = HiHealthKitClient.this.aabc.bindService(intentAab, HiHealthKitClient.this.aabp, 1);
            HiHealthKitClient.this.aabl.getAndSet(zBindService);
            aabz.aabb("HiHealthKitClient", "connectWithHms result " + zBindService);
        }

        aabb(Task task) {
            this.aab = task;
        }
    }

    static class aabe implements OnFailureListener {
        /* synthetic */ aabe(aab aabVar) {
        }

        @Override // com.huawei.hmf.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            aabz.aabb("HiHealthKitClient", "onFailure : Task optApkService fail.");
        }
    }
}
