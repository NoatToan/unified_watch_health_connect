package clc.utils.taskmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class TaskManager {
    private static final boolean k = false;
    private static final int l = 1;
    private static final int m = 2;
    private static final String n = "TaskManager";
    private boolean a;
    private Task b;
    private IStateChangeListener c;
    private String d;
    private State e;
    private LinkedList<Task> f;
    private TaskOperation g;
    private Handler h;
    private ThreadWorker i;
    private Handler j;
    private static HashMap<String, TaskManager> p = new HashMap<>();
    private static ExceptionListener o = null;

    public interface ExceptionListener {
        void error(Throwable th, Task task);
    }

    public interface IStateChangeListener {
        void onStateChanged(TaskManager taskManager, State state, State state2);
    }

    public enum State {
        NEW,
        RUNNING,
        PAUSED,
        FINISHED,
        READY
    }

    public enum TaskManagerState {
        CONTINUE,
        PAUSE
    }

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                TaskManager.this.l(message.obj);
            } else {
                TaskManager.this.h((Task) message.obj);
                TaskManager.this.o();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                TaskManager.this.g();
            } catch (Exception e) {
                e.printStackTrace();
                if (TaskManager.o != null) {
                    TaskManager.o.error(e, null);
                }
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Task b;

        public c(Task task) {
            this.b = task;
        }

        @Override // java.lang.Runnable
        public void run() {
            TaskManager.this.h(this.b);
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ State b;
        public final /* synthetic */ State c;

        public d(State state, State state2) {
            this.c = state;
            this.b = state2;
        }

        @Override // java.lang.Runnable
        public void run() {
            TaskManager.this.c.onStateChanged(TaskManager.this, this.c, this.b);
        }
    }

    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Task.RunningStatus.valuesCustom().length];
            a = iArr;
            try {
                iArr[Task.RunningStatus.WORK_THREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Task.RunningStatus.UI_THREAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public TaskManager() {
        this.f = new LinkedList<>();
        this.g = new TaskOperation();
        this.i = null;
        this.b = null;
        this.e = State.NEW;
        this.d = null;
        this.c = null;
        this.h = null;
        this.a = true;
        this.j = new a(Looper.getMainLooper());
    }

    public TaskManager(String str) {
        this(str, true);
    }

    public TaskManager(String str, boolean z) {
        this.f = new LinkedList<>();
        this.g = new TaskOperation();
        this.i = null;
        this.b = null;
        this.e = State.NEW;
        this.d = null;
        this.c = null;
        this.h = null;
        this.a = true;
        this.j = new a(Looper.getMainLooper());
        this.d = str;
        this.a = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.b = null;
        if (this.f.isEmpty()) {
            return;
        }
        Task task = this.f.get(0);
        try {
            this.b = task;
            synchronized (this.f) {
                LinkedList<Task> linkedList = this.f;
                if (linkedList != null && linkedList.size() > 0) {
                    this.f.remove(0);
                }
            }
            int i = e.a[task.getRunningStatus().ordinal()];
            if (i == 1) {
                h(task);
                o();
            } else {
                if (i != 2) {
                    return;
                }
                this.j.obtainMessage(1, task).sendToTarget();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            ExceptionListener exceptionListener = o;
            if (exceptionListener != null) {
                exceptionListener.error(e2, task);
            }
        }
    }

    public static HashMap<String, TaskManager> getTaskManagers() {
        return p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(Task task) {
        if (task != null) {
            task.setStatus(Task.Status.RUNNING);
            printExecuteTaskState(task);
            try {
                this.g = task.onExecute(this.g);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            task.setStatus(Task.Status.FINISHED);
        }
    }

    private boolean i() {
        TaskOperation taskOperation = this.g;
        boolean z = taskOperation == null || taskOperation.getTaskManagerStatus() == TaskManagerState.CONTINUE;
        LinkedList<Task> linkedList = this.f;
        boolean z2 = linkedList != null && linkedList.size() > 0;
        if (!z2) {
            if (this.a) {
                quitLooper();
            } else {
                p(State.READY);
            }
        }
        return z && z2;
    }

    private void j(State state, State state2) {
        if (this.c != null) {
            this.j.post(new d(state, state2));
        }
    }

    private static void k(TaskManager taskManager) {
        if (taskManager != null) {
            p.remove(taskManager.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(Object obj) {
        Task task = this.b;
        if (task != null) {
            task.onProgressUpdate(obj);
        }
    }

    private void m(State state, State state2) {
    }

    private static void n(TaskManager taskManager) {
        if (taskManager != null) {
            String name = taskManager.getName();
            if (TextUtils.isEmpty(name)) {
                return;
            }
            p.put(name, taskManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (i()) {
            execute();
        }
    }

    private void p(State state) {
        State state2 = this.e;
        this.e = state;
        if (state == State.FINISHED) {
            k(this);
        } else {
            n(this);
        }
        if (state2 != state) {
            m(state2, state);
            j(state2, state);
        }
    }

    private void q() {
        if (this.i == null) {
            this.i = new ThreadWorker("TaskManager_Thread_" + (TextUtils.isEmpty(this.d) ? toString() : this.d));
            this.h = new Handler(this.i.getLooper());
            p(State.READY);
        }
    }

    public static void setExceptionListener(ExceptionListener exceptionListener) {
        o = exceptionListener;
    }

    public void cancelCurrentTask() {
        Task task = this.b;
        if (task != null) {
            task.cancel();
        }
    }

    public void execute() {
        if (this.f.size() <= 0) {
            if (this.a) {
                quitLooper();
                return;
            } else {
                p(State.READY);
                return;
            }
        }
        q();
        p(State.RUNNING);
        Handler handler = this.h;
        if (handler != null) {
            handler.post(new b());
        }
    }

    public void execute(TaskOperation taskOperation) {
        if (taskOperation != null) {
            this.g = taskOperation;
        }
        execute();
    }

    public String getName() {
        return this.d;
    }

    public State getState() {
        return this.e;
    }

    public TaskOperation getTaskOperation() {
        return this.g;
    }

    public boolean isFinished() {
        return this.e == State.FINISHED;
    }

    public final void join() {
        ThreadWorker threadWorker = this.i;
        if (threadWorker != null) {
            threadWorker.join();
        }
    }

    public TaskManager next(Task task) {
        Objects.requireNonNull(task, "task is null");
        synchronized (this.f) {
            task.setTaskId(this.f.size() + 1);
            this.f.add(task);
        }
        return this;
    }

    public void pause() {
        if (this.i != null) {
            p(State.PAUSED);
            this.i.pause();
        }
    }

    public void postExecute(Task task) {
        Objects.requireNonNull(task, "Task can NOT be null.");
        if (Task.RunningStatus.UI_THREAD == task.getRunningStatus()) {
            this.j.post(new c(task));
        }
    }

    public void printExecuteTaskState(Task task) {
    }

    public void publishProgress(Object obj) {
        this.j.obtainMessage(2, obj).sendToTarget();
    }

    public void quitLooper() {
        ThreadWorker threadWorker = this.i;
        if (threadWorker != null) {
            threadWorker.quit();
            this.i = null;
        }
        this.h = null;
        p(State.FINISHED);
    }

    public void removeTask(Task task) {
        LinkedList<Task> linkedList = this.f;
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        synchronized (this.f) {
            this.f.remove(task);
            if (this.f.isEmpty()) {
                quitLooper();
            }
        }
    }

    public void removeTasks() {
        LinkedList<Task> linkedList = this.f;
        if (linkedList == null) {
            return;
        }
        synchronized (linkedList) {
            if (this.f.size() > 0) {
                this.f.clear();
                quitLooper();
            }
        }
    }

    public void resume() {
        if (this.i != null) {
            p(State.RUNNING);
            this.i.restart();
        }
    }

    public void setStateChangeListener(IStateChangeListener iStateChangeListener) {
        this.c = iStateChangeListener;
    }

    public String toString() {
        return "Name = " + this.d + "  State = " + this.e + "  " + super.toString();
    }
}
