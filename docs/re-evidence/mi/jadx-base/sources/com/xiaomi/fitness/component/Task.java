package com.xiaomi.fitness.component;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eB1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\u0016\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001dJ^\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\t\u0010+\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u001b\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/component/Task;", "", "next", "namespace", "", "taskId", "", "name", "multiProcess", "", "processName", "events", "", "<init>", "(Lcom/xiaomi/fitness/component/Task;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;[Ljava/lang/String;)V", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)V", "getNext", "()Lcom/xiaomi/fitness/component/Task;", "setNext", "(Lcom/xiaomi/fitness/component/Task;)V", "getNamespace", "()Ljava/lang/String;", "getTaskId", "()I", "getName", "getMultiProcess", "()Z", "getProcessName", "getEvents", "()[Ljava/lang/String;", "[Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/xiaomi/fitness/component/Task;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;[Ljava/lang/String;)Lcom/xiaomi/fitness/component/Task;", "equals", "other", "hashCode", "toString", "component-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Task {

    @Nullable
    private final String[] events;
    private final boolean multiProcess;

    @NotNull
    private final String name;

    @NotNull
    private final String namespace;

    @Nullable
    private Task next;

    @NotNull
    private final String processName;
    private final int taskId;

    public Task(@Nullable Task task, @NotNull String namespace, int i, @NotNull String name, boolean z, @NotNull String processName, @Nullable String[] strArr) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(processName, "processName");
        this.next = task;
        this.namespace = namespace;
        this.taskId = i;
        this.name = name;
        this.multiProcess = z;
        this.processName = processName;
        this.events = strArr;
    }

    public static /* synthetic */ Task copy$default(Task task, Task task2, String str, int i, String str2, boolean z, String str3, String[] strArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            task2 = task.next;
        }
        if ((i2 & 2) != 0) {
            str = task.namespace;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            i = task.taskId;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = task.name;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            z = task.multiProcess;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            str3 = task.processName;
        }
        String str6 = str3;
        if ((i2 & 64) != 0) {
            strArr = task.events;
        }
        return task.copy(task2, str4, i3, str5, z2, str6, strArr);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Task getNext() {
        return this.next;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNamespace() {
        return this.namespace;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTaskId() {
        return this.taskId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getMultiProcess() {
        return this.multiProcess;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getProcessName() {
        return this.processName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String[] getEvents() {
        return this.events;
    }

    @NotNull
    public final Task copy(@Nullable Task next, @NotNull String namespace, int taskId, @NotNull String name, boolean multiProcess, @NotNull String processName, @Nullable String[] events) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(processName, "processName");
        return new Task(next, namespace, taskId, name, multiProcess, processName, events);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Task)) {
            return false;
        }
        Task task = (Task) other;
        return Intrinsics.areEqual(this.next, task.next) && Intrinsics.areEqual(this.namespace, task.namespace) && this.taskId == task.taskId && Intrinsics.areEqual(this.name, task.name) && this.multiProcess == task.multiProcess && Intrinsics.areEqual(this.processName, task.processName) && Intrinsics.areEqual(this.events, task.events);
    }

    @Nullable
    public final String[] getEvents() {
        return this.events;
    }

    public final boolean getMultiProcess() {
        return this.multiProcess;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNamespace() {
        return this.namespace;
    }

    @Nullable
    public final Task getNext() {
        return this.next;
    }

    @NotNull
    public final String getProcessName() {
        return this.processName;
    }

    public final int getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        Task task = this.next;
        int iHashCode = (((((((((((task == null ? 0 : task.hashCode()) * 31) + this.namespace.hashCode()) * 31) + Integer.hashCode(this.taskId)) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.multiProcess)) * 31) + this.processName.hashCode()) * 31;
        String[] strArr = this.events;
        return iHashCode + (strArr != null ? Arrays.hashCode(strArr) : 0);
    }

    public final void setNext(@Nullable Task task) {
        this.next = task;
    }

    @NotNull
    public String toString() {
        return "Task(next=" + this.next + ", namespace=" + this.namespace + ", taskId=" + this.taskId + ", name=" + this.name + ", multiProcess=" + this.multiProcess + ", processName=" + this.processName + ", events=" + Arrays.toString(this.events) + ")";
    }

    public /* synthetic */ Task(Task task, String str, int i, String str2, boolean z, String str3, String[] strArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : task, str, i, str2, z, str3, (i2 & 64) != 0 ? null : strArr);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Task(@NotNull String namespace, int i, @NotNull String name, boolean z, @NotNull String processName) {
        this(null, namespace, i, name, z, processName, null);
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(processName, "processName");
    }
}
