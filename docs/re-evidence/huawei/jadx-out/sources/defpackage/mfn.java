package defpackage;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.mainprocess.mgr.settings.sendswitchcommandtask.SendSwitchTask;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes10.dex */
public class mfn {
    private static mfn d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList<SendSwitchTask> f41615c = new LinkedList<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41614a = new Object();
    private static final Object e = new Object();

    private mfn() {
    }

    public static mfn e() {
        mfn mfnVar;
        synchronized (f41614a) {
            if (d == null) {
                d = new mfn();
            }
            mfnVar = d;
        }
        return mfnVar;
    }

    public void c(SendSwitchTask sendSwitchTask) {
        if (sendSwitchTask == null) {
            LogUtil.j("SendSwitchTaskHandler", "addTask task is null.");
            return;
        }
        LogUtil.j("SendSwitchTaskHandler", "add task tag : ", sendSwitchTask.getTaskTag(), "type : ", Integer.valueOf(sendSwitchTask.getTaskType()));
        synchronized (e) {
            if (!sendSwitchTask.isWillRunTask()) {
                LogUtil.j("SendSwitchTaskHandler", "task will not run. no add queue.");
                return;
            }
            if (this.f41615c.contains(sendSwitchTask)) {
                if (sendSwitchTask.getTaskType() == 2) {
                    boolean zRemove = this.f41615c.remove(sendSwitchTask);
                    this.f41615c.addFirst(sendSwitchTask);
                    LogUtil.a("SendSwitchTaskHandler", "isRemoved : ", Boolean.valueOf(zRemove), "add high task");
                } else {
                    LogUtil.j("SendSwitchTaskHandler", "low task, not run.");
                }
            } else {
                LogUtil.a("SendSwitchTaskHandler", "add task : ", Boolean.valueOf(this.f41615c.add(sendSwitchTask)));
            }
        }
    }

    public void d(final int i) {
        ThreadPoolManager.c().a("SendSwitchTaskHandler", new Runnable() { // from class: mfn.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (mfn.e) {
                    LogUtil.a("SendSwitchTaskHandler", "runTask");
                    if (!mfn.this.f41615c.isEmpty()) {
                        Iterator it = mfn.this.f41615c.iterator();
                        while (it.hasNext()) {
                            SendSwitchTask sendSwitchTask = (SendSwitchTask) it.next();
                            if (sendSwitchTask.getTaskType() == 2) {
                                LogUtil.a("SendSwitchTaskHandler", "immediately task run and remove");
                                sendSwitchTask.run();
                                it.remove();
                            } else {
                                LogUtil.a("SendSwitchTaskHandler", "wait task, not run now.");
                            }
                        }
                        if ((i & 1) == 1 && !mfn.this.f41615c.isEmpty()) {
                            new Timer("SendSwitchTaskHandler").schedule(new TimerTask() { // from class: mfn.3.1
                                @Override // java.util.TimerTask, java.lang.Runnable
                                public void run() {
                                    LogUtil.a("SendSwitchTaskHandler", "run RUN_TASK_RUN_WAIT");
                                    mfn.this.c((IBaseResponseCallback) null);
                                }
                            }, 5000L);
                        }
                        if ((i & 2) == 2) {
                            LogUtil.a("SendSwitchTaskHandler", "run RUN_IMMEDIATELY_TASK");
                            mfn.this.f41615c.clear();
                        }
                        return;
                    }
                    LogUtil.j("SendSwitchTaskHandler", "runTask is empty.");
                }
            }
        });
    }

    public void c(final IBaseResponseCallback iBaseResponseCallback) {
        ThreadPoolManager.c().a("SendSwitchTaskHandler", new Runnable() { // from class: mfn.5
            @Override // java.lang.Runnable
            public void run() {
                LinkedList linkedList = new LinkedList();
                synchronized (mfn.e) {
                    LogUtil.a("SendSwitchTaskHandler", "runAllTask");
                    if (!mfn.this.f41615c.isEmpty()) {
                        Iterator it = mfn.this.f41615c.iterator();
                        while (it.hasNext()) {
                            SendSwitchTask sendSwitchTask = (SendSwitchTask) it.next();
                            sendSwitchTask.run();
                            if (iBaseResponseCallback == null) {
                                it.remove();
                            } else {
                                LogUtil.a("SendSwitchTaskHandler", "removeTaskList add task");
                                linkedList.add(sendSwitchTask);
                            }
                        }
                        if (iBaseResponseCallback != null) {
                            LogUtil.a("SendSwitchTaskHandler", "all task runned, response success.");
                            iBaseResponseCallback.onResponse(0, linkedList);
                            return;
                        }
                        return;
                    }
                    LogUtil.j("SendSwitchTaskHandler", "runAllTask is empty.");
                    IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                    if (iBaseResponseCallback2 != null) {
                        iBaseResponseCallback2.onResponse(0, null);
                    }
                }
            }
        });
    }

    public void b() {
        synchronized (e) {
            if (this.f41615c.isEmpty()) {
                LogUtil.a("SendSwitchTaskHandler", "runImmediatelyTask task is empty.");
            } else {
                ThreadPoolManager.c().a("SendSwitchTaskHandler", new AnonymousClass1());
            }
        }
    }

    /* JADX INFO: renamed from: mfn$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            mfn.this.c(new IBaseResponseCallback() { // from class: mfn.1.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                public void onResponse(int i, Object obj) {
                    final List list = obj instanceof List ? (List) obj : null;
                    new Timer("SendSwitchTaskHandler").schedule(new TimerTask() { // from class: mfn.1.2.2
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            LogUtil.a("SendSwitchTaskHandler", "isRunningImmediately set false.");
                            List list2 = list;
                            if (list2 == null || list2.isEmpty()) {
                                return;
                            }
                            synchronized (mfn.e) {
                                LogUtil.a("SendSwitchTaskHandler", "remove removeTaskList");
                                mfn.this.f41615c.removeAll(list);
                            }
                        }
                    }, 5000L);
                }
            });
        }
    }
}
