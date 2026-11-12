package clc.utils.taskmanager;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Task {
    private AtomicBoolean a;
    private int b;
    private String c;
    private volatile RunningStatus d;
    private volatile Status e;

    public enum RunningStatus {
        WORK_THREAD,
        UI_THREAD;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static RunningStatus[] valuesCustom() {
            RunningStatus[] runningStatusArrValuesCustom = values();
            int length = runningStatusArrValuesCustom.length;
            RunningStatus[] runningStatusArr = new RunningStatus[length];
            System.arraycopy(runningStatusArrValuesCustom, 0, runningStatusArr, 0, length);
            return runningStatusArr;
        }
    }

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Status[] valuesCustom() {
            Status[] statusArrValuesCustom = values();
            int length = statusArrValuesCustom.length;
            Status[] statusArr = new Status[length];
            System.arraycopy(statusArrValuesCustom, 0, statusArr, 0, length);
            return statusArr;
        }
    }

    public Task(RunningStatus runningStatus) {
        this(runningStatus, null);
    }

    public Task(RunningStatus runningStatus, String str) {
        this.b = 0;
        this.c = null;
        this.a = new AtomicBoolean(false);
        this.e = Status.PENDING;
        this.d = RunningStatus.UI_THREAD;
        this.d = runningStatus;
        this.c = str;
    }

    public Task(Task task) {
        this.b = 0;
        this.c = null;
        this.a = new AtomicBoolean(false);
        this.e = Status.PENDING;
        this.d = RunningStatus.UI_THREAD;
        this.d = task.d;
        this.c = task.c;
        this.e = task.e;
    }

    public void cancel() {
        this.a.set(true);
    }

    public RunningStatus getRunningStatus() {
        return this.d;
    }

    public Status getStatus() {
        return this.e;
    }

    public int getTaskId() {
        return this.b;
    }

    public String getTaskName() {
        return this.c;
    }

    public boolean isCancelled() {
        return this.a.get();
    }

    public abstract TaskOperation onExecute(TaskOperation taskOperation);

    public void onProgressUpdate(Object obj) {
    }

    public void setStatus(Status status) {
        this.e = status;
    }

    public void setTaskId(int i) {
        this.b = i;
    }

    public void setTaskName(String str) {
        this.c = str;
    }

    public String toString() {
        return "name = " + this.c + "  id = " + this.b + "  " + super.toString();
    }
}
