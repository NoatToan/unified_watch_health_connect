package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.IBaseCommonCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import com.huawei.syncmgr.SyncOption;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public class mld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static mld f41859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f41860b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BroadcastReceiver f41861c = new BroadcastReceiver() { // from class: mld.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("KitCoreSleepManager", "mNotifyRestartReceiver(): intent is ", intent.getAction());
            if (context != null) {
                if (mld.this.e != null) {
                    mld.this.d.removeTasksAndMessages();
                    if ("com.huawei.health.action.ACTION_CORE_SLEEP_ERROR_CODE".equals(intent.getAction())) {
                        mld.this.a(intent.getIntExtra("errorCode", -1), intent.getStringExtra("message"));
                        BaseApplication.getContext().unregisterReceiver(mld.this.f41861c);
                        return;
                    }
                    return;
                }
                LogUtil.j("KitCoreSleepManager", "no kit need message.");
                return;
            }
            LogUtil.j("KitCoreSleepManager", "mNotifyRestartReceiver context is null.");
        }
    };
    private ExtendHandler d;
    private IBaseCommonCallback e;
    private Timer i;

    private mld() {
        if (!CompileParameterUtil.d("IS_RELEASE_VERSION")) {
            String strB = CommonUtil.b(Process.myPid());
            if (!TextUtils.isEmpty(strB) && !cip.e.equals(strB)) {
                throw new RuntimeException("KitCoreSleepManager do not init in process process." + strB);
            }
        }
        this.d = HandlerCenter.b(new e(), "KitCoreSleepManager");
    }

    public static mld d() {
        mld mldVar;
        synchronized (f41860b) {
            if (f41859a == null) {
                f41859a = new mld();
            }
            LogUtil.a("KitCoreSleepManager", "return KitCoreSleepManager");
            mldVar = f41859a;
        }
        return mldVar;
    }

    public void c(IBaseCommonCallback iBaseCommonCallback) {
        LogUtil.a("KitCoreSleepManager", "enter KitCoreSleepManager startCoreSleep2");
        if (iBaseCommonCallback == null) {
            LogUtil.j("KitCoreSleepManager", "set startCoreSleep callback is null.");
            return;
        }
        this.d.removeTasksAndMessages();
        this.e = iBaseCommonCallback;
        this.d.sendEmptyMessage(100, 1200000L);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.action.ACTION_CORE_SLEEP_ERROR_CODE");
        BroadcastManagerUtil.a(BaseApplication.getContext(), this.f41861c, intentFilter);
        LogUtil.a("KitCoreSleepManager", "kit triggle sleep sync");
        qec.e().startSynCoreSleep(SyncOption.builder().c(), new IBaseResponseCallback() { // from class: mld.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.d("KitCoreSleepManager", "kit startCoreSleep : ", Integer.valueOf(i));
            }
        });
        b();
    }

    public void e(int i, String str) {
        if (this.e == null) {
            LogUtil.j("KitCoreSleepManager", "no kit need message.");
            return;
        }
        this.d.removeTasksAndMessages();
        if (str == null) {
            LogUtil.j("KitCoreSleepManager", "message is null. errorCode : ", Integer.valueOf(i));
        } else {
            a(i, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        IBaseCommonCallback iBaseCommonCallback = this.e;
        if (iBaseCommonCallback != null) {
            LogUtil.a("KitCoreSleepManager", "errorCode : ", Integer.valueOf(i), "message : ", str);
            try {
                iBaseCommonCallback.onResponse(i, str);
            } catch (RemoteException unused) {
                LogUtil.e("KitCoreSleepManager", "toKitMessage remote exception.");
            }
            this.e = null;
        } else {
            LogUtil.j("KitCoreSleepManager", "toKitMessage callback is null.");
        }
        Timer timer = this.i;
        if (timer != null) {
            timer.cancel();
            this.i = null;
        }
    }

    private void b() {
        Timer timer = this.i;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer("KitCoreSleepManager");
        this.i = timer2;
        timer2.schedule(new TimerTask() { // from class: mld.5
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                mld.this.b(90, "");
            }
        }, 30000L, 30000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, String str) {
        IBaseCommonCallback iBaseCommonCallback = this.e;
        if (iBaseCommonCallback != null) {
            try {
                iBaseCommonCallback.onResponse(i, str);
            } catch (RemoteException unused) {
                LogUtil.e("KitCoreSleepManager", "toKitMessage remote exception.");
            }
        } else {
            Timer timer = this.i;
            if (timer != null) {
                timer.cancel();
                this.i = null;
            }
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    class e implements Handler.Callback {
        private e() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 100) {
                mld.this.a(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, "timeout");
                return true;
            }
            LogUtil.j("KitCoreSleepManager", "no support what : ", Integer.valueOf(message.what));
            return false;
        }
    }
}
