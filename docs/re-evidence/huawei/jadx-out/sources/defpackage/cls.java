package defpackage;

import android.os.PowerManager;
import com.huawei.devicesdk.connect.retry.CommandPriorAdapter;
import com.huawei.devicesdk.connect.retry.CommandSlowManager;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.strategy.SendStrategy;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes4.dex */
public class cls extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PriorityBlockingQueue<cmf> f1746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceInfo f1747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f1748c;
    private PowerManager.WakeLock d;
    private final AtomicLong e = new AtomicLong(1);

    public cls(DeviceInfo deviceInfo) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f1748c = atomicBoolean;
        this.f1746a = new PriorityBlockingQueue<>(10000, new Comparator<cmf>() { // from class: cls.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public int compare(cmf cmfVar, cmf cmfVar2) {
                int iCompare;
                if (cmfVar == null || cmfVar2 == null) {
                    return 0;
                }
                return (cmfVar.e() == null || cmfVar2.e() == null || (iCompare = Integer.compare(cmfVar2.e().j(), cmfVar.e().j())) == 0) ? Long.compare(cmfVar.c(), cmfVar2.c()) : iCompare;
            }
        });
        Object systemService = BaseApplication.b().getSystemService("power");
        if (systemService instanceof PowerManager) {
            LogUtil.b("CommandMessageSender", "init WakeLock");
            this.d = ((PowerManager) systemService).newWakeLock(1, "PhoneService_SendDataLock");
        }
        this.f1747b = deviceInfo;
        atomicBoolean.set(true);
        if (deviceInfo == null) {
            LogUtil.d("CommandMessageSender", "deviceInfo is null");
            return;
        }
        setName("DeviceCommandThread-" + deviceInfo.getDeviceMac());
    }

    public boolean d(cmg cmgVar, SendStrategy sendStrategy) {
        if (this.f1746a == null || this.f1747b == null) {
            LogUtil.d("CommandMessageSender", "command queue is invalid.");
            return false;
        }
        if (cmgVar == null || sendStrategy == null) {
            LogUtil.d("CommandMessageSender", "command message or send strategy is invalid.");
            return false;
        }
        CommandPriorAdapter.INSTANCE.updateCommandPrior(cmgVar);
        LogUtil.b("CommandMessageSender", "add command message.", cpl.a(this.f1747b.getDeviceMac()), " characterId:", cmgVar.c(), "socketchannel: ", Integer.valueOf(cmgVar.g()));
        cmf cmfVar = new cmf(this.e.incrementAndGet(), cmgVar, sendStrategy);
        CommandSlowManager commandSlowManager = CommandSlowManager.INSTANCE;
        final PriorityBlockingQueue<cmf> priorityBlockingQueue = this.f1746a;
        Objects.requireNonNull(priorityBlockingQueue);
        return commandSlowManager.doActionAndSignal(cmfVar, new Function() { // from class: clr
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(priorityBlockingQueue.offer((cmf) obj));
            }
        }).booleanValue();
    }

    public void b() {
        DeviceInfo deviceInfo = this.f1747b;
        if (deviceInfo == null) {
            LogUtil.d("CommandMessageSender", "mDeviceInfo is invalid.");
            return;
        }
        LogUtil.b("CommandMessageSender", "stop device command thread.", cpl.a(deviceInfo.getDeviceMac()));
        this.f1748c.set(false);
        PriorityBlockingQueue<cmf> priorityBlockingQueue = this.f1746a;
        if (priorityBlockingQueue != null) {
            priorityBlockingQueue.clear();
            LogUtil.b("CommandMessageSender", "close thread.", cpl.a(this.f1747b.getDeviceMac()));
            this.f1746a.offer(new cmf(0L, null, null));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        DeviceInfo deviceInfo = this.f1747b;
        if (deviceInfo == null) {
            LogUtil.d("CommandMessageSender", "mDeviceInfo is invalid.");
            return;
        }
        LogUtil.b("CommandMessageSender", "device command thread start.", cpl.a(deviceInfo.getDeviceMac()));
        if (this.f1746a == null) {
            LogUtil.e("CommandMessageSender", "command queue is invalid.");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (true) {
            long j = 0;
            do {
                if (this.f1748c.get()) {
                    try {
                        cmf cmfVarTake = this.f1746a.take();
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        if (jCurrentTimeMillis2 > j) {
                            j = 60000 + jCurrentTimeMillis2;
                            e();
                        }
                        if (jCurrentTimeMillis2 > jCurrentTimeMillis) {
                            c();
                            jCurrentTimeMillis = 10000 + jCurrentTimeMillis2;
                        }
                        if (cmfVarTake != null) {
                            c(cmfVarTake);
                            CommandSlowManager commandSlowManager = CommandSlowManager.INSTANCE;
                            final PriorityBlockingQueue<cmf> priorityBlockingQueue = this.f1746a;
                            Objects.requireNonNull(priorityBlockingQueue);
                            commandSlowManager.doSleep(new Supplier() { // from class: clt
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return (cmf) priorityBlockingQueue.peek();
                                }
                            });
                        }
                    } catch (Exception unused) {
                        LogUtil.d("CommandMessageSender", "mCommandQueue take Exception");
                    }
                } else {
                    LogUtil.b("CommandMessageSender", "device command thread stop.", cpl.a(this.f1747b.getDeviceMac()));
                    return;
                }
            } while (!this.f1746a.isEmpty());
            d();
        }
    }

    private void c() {
        for (cmf cmfVar : (cmf[]) this.f1746a.toArray(new cmf[0])) {
            if (!cmfVar.e().o()) {
                cmfVar.e().d(true);
            } else {
                LogUtil.e("CommandMessageSender", "task will be time out, need be set normal");
                cmfVar.e().b(1);
            }
        }
    }

    private void c(cmf cmfVar) {
        cmg cmgVarE = cmfVar.e();
        SendStrategy sendStrategyA = cmfVar.a();
        if (cmgVarE == null || sendStrategyA == null) {
            return;
        }
        LogUtil.b("CommandMessageSender", "start send command. characterId:", cmgVarE.c(), cpl.a(this.f1747b.getDeviceMac()), " operationType:", cmgVarE.e(), " chanel: ", Integer.valueOf(cmgVarE.g()));
        ArrayList<cmd> sendFrames = sendStrategyA.getSendFrames(cmgVarE, this.f1747b);
        CommandSlowManager.INSTANCE.setInterval(cmgVarE, sendFrames);
        cll.c().b(this.f1747b.getDeviceMac(), sendFrames);
    }

    private void e() {
        PowerManager.WakeLock wakeLock = this.d;
        if (wakeLock != null) {
            wakeLock.acquire(60000L);
        }
    }

    private void d() {
        PowerManager.WakeLock wakeLock = this.d;
        if (wakeLock != null) {
            try {
                if (wakeLock.isHeld()) {
                    this.d.release();
                }
            } catch (Exception e) {
                LogUtil.d("CommandMessageSender", "releaseSendDataLock occur e: ", ExceptionUtils.c(e));
            }
        }
    }

    public int a() {
        return this.f1746a.size();
    }
}
