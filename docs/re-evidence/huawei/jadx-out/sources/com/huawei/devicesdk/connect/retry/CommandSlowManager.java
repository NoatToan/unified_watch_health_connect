package com.huawei.devicesdk.connect.retry;

import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.cmb;
import defpackage.cmd;
import defpackage.cmf;
import defpackage.cmg;
import defpackage.eec;
import defpackage.eee;
import defpackage.xiq;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import java.util.function.Supplier;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.huawei.devicesdk.connect.retry.CommandSlowManager, still in use, count: 1, list:
  (r0v0 com.huawei.devicesdk.connect.retry.CommandSlowManager) from 0x0016: IGET (r0v0 com.huawei.devicesdk.connect.retry.CommandSlowManager) A[WRAPPED] com.huawei.devicesdk.connect.retry.CommandSlowManager.callback com.huawei.health.devicemgr.business.callback.DataReceiveCallback
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class CommandSlowManager {
    INSTANCE;

    private static final int COMMAND_DELAY = 500;
    public static final long EVENT_ID = 800100032;
    private static final int PACKAGE_INTERVAL = 20;
    public static final String SRC_PKG = "hw.phone.jmconnection";
    private static final String TAG = "CommandSlowManager";
    private final DataReceiveCallback callback;
    private final Condition condition;
    private final Lock conditionLock;
    private final ExtendHandler handler;
    private final AtomicBoolean needSlow;
    private final Object needSlowLock;

    private CommandSlowManager() {
        super(str, i);
        this.handler = HandlerCenter.e(TAG);
        this.needSlow = new AtomicBoolean(false);
        this.needSlowLock = new Object();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.conditionLock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.callback = new DataReceiveCallback() { // from class: clv
            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public final void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
                this.f1750b.m817x12a03358(i, deviceInfo, eecVar);
            }
        };
    }

    public static CommandSlowManager valueOf(String str) {
        return (CommandSlowManager) Enum.valueOf(CommandSlowManager.class, str);
    }

    public static CommandSlowManager[] values() {
        return (CommandSlowManager[]) $VALUES.clone();
    }

    static {
        xiq.a().b(SRC_PKG, new CommandSlowManager().callback);
    }

    /* JADX INFO: renamed from: lambda$new$1$com-huawei-devicesdk-connect-retry-CommandSlowManager, reason: not valid java name */
    public /* synthetic */ void m817x12a03358(int i, DeviceInfo deviceInfo, eec eecVar) {
        if (deviceInfo == null) {
            LogUtil.j(TAG, "onDataReceived deviceInfo is null");
            return;
        }
        if (!(eecVar instanceof eee)) {
            LogUtil.j(TAG, "handle the event failed, because the event not SampleEvent");
            return;
        }
        eee eeeVar = (eee) eecVar;
        if (eeeVar.d() != EVENT_ID) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(eeeVar.c()));
            if (jSONObject.getInt("status") == 0) {
                setSlowCommandOpen();
                long j = jSONObject.getLong("time");
                LogUtil.a(TAG, "begin delay task with time:" + j);
                this.handler.postTask(new Runnable() { // from class: cly
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1754a.m816xe94bde17();
                    }
                }, j);
            } else {
                setSlowCommandClose(false);
            }
        } catch (JSONException unused) {
            LogUtil.e(TAG, "get status failed");
        }
    }

    /* JADX INFO: renamed from: lambda$new$0$com-huawei-devicesdk-connect-retry-CommandSlowManager, reason: not valid java name */
    public /* synthetic */ void m816xe94bde17() {
        setSlowCommandClose(true);
    }

    public void setInterval(cmg cmgVar, List<cmd> list) {
        if (isEnableSlow() && cmgVar.j() == 0) {
            if (cmgVar.b().length > 1) {
                LogUtil.j(TAG, "task set internal ", Byte.valueOf(cmgVar.b()[0]), " " + ((int) cmgVar.b()[1]));
            }
            Iterator<cmd> it = list.iterator();
            while (it.hasNext()) {
                Iterator<cmb> it2 = it.next().a().iterator();
                while (it2.hasNext()) {
                    it2.next().c(20);
                }
            }
        }
    }

    public Boolean doActionAndSignal(cmf cmfVar, Function<cmf, Boolean> function) {
        this.conditionLock.lock();
        try {
            Boolean boolApply = function.apply(cmfVar);
            if (cmfVar.e().j() != 0) {
                this.condition.signal();
            }
            return boolApply;
        } finally {
            this.conditionLock.unlock();
        }
    }

    public void doSleep(Supplier<cmf> supplier) {
        cmf cmfVar;
        if (isEnableSlow() && (cmfVar = supplier.get()) != null && cmfVar.e().j() == 0) {
            try {
                if (cmfVar.e().b().length > 1) {
                    LogUtil.j(TAG, "task begin sleep ", Byte.valueOf(cmfVar.e().b()[0]), " " + ((int) cmfVar.e().b()[1]));
                }
                this.conditionLock.lock();
                try {
                    this.condition.await(500L, TimeUnit.MILLISECONDS);
                } finally {
                    this.conditionLock.unlock();
                }
            } catch (InterruptedException unused) {
                LogUtil.e(TAG, "doSleep failed");
            }
        }
    }

    private void setSlowCommandOpen() {
        LogUtil.j(TAG, "task set slow true");
        synchronized (this.needSlowLock) {
            this.needSlow.set(true);
        }
    }

    private void setSlowCommandClose(boolean z) {
        if (z) {
            LogUtil.j(TAG, "task time out set slow false");
        } else {
            LogUtil.j(TAG, "task set slow false");
            this.handler.removeTasksAndMessages();
            LogUtil.j(TAG, "remove task succeed");
        }
        synchronized (this.needSlowLock) {
            this.needSlow.set(false);
        }
    }

    private boolean isEnableSlow() {
        boolean z;
        synchronized (this.needSlowLock) {
            z = this.needSlow.get();
        }
        return z;
    }
}
