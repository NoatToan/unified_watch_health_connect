package clc.utils.taskmanager;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class TaskOperation {
    private Object[] a;
    private TaskManager.TaskManagerState b;

    public TaskOperation() {
        this.a = null;
        this.b = TaskManager.TaskManagerState.CONTINUE;
    }

    public TaskOperation(TaskOperation taskOperation) {
        this.a = null;
        this.b = TaskManager.TaskManagerState.CONTINUE;
        setTaskParams(taskOperation);
    }

    public TaskOperation(Object[] objArr) {
        this.a = null;
        this.b = TaskManager.TaskManagerState.CONTINUE;
        this.a = objArr;
    }

    public void appendTaskParam(Object obj) {
        appendTaskParams(new Object[]{obj});
    }

    public void appendTaskParams(Object[] objArr) {
        if (objArr != null) {
            setTaskParams(new TaskOperation(objArr));
        }
    }

    public TaskManager.TaskManagerState getTaskManagerStatus() {
        return this.b;
    }

    public Object[] getTaskParams() {
        return this.a;
    }

    public void setTaskManagerStatus(TaskManager.TaskManagerState taskManagerState) {
        this.b = taskManagerState;
    }

    public void setTaskParams(TaskOperation taskOperation) {
        Object[] taskParams;
        if (taskOperation == this) {
            throw new IllegalArgumentException("The argument can NOT be self.");
        }
        if (taskOperation == null || (taskParams = taskOperation.getTaskParams()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object[] objArr = this.a;
        if (objArr != null) {
            for (Object obj : objArr) {
                arrayList.add(obj);
            }
        }
        for (Object obj2 : taskParams) {
            arrayList.add(obj2);
        }
        this.a = arrayList.toArray();
    }

    public void setTaskParams(Object[] objArr) {
        this.a = objArr;
    }

    public void setTaskParamsEmpty() {
        this.a = null;
    }
}
