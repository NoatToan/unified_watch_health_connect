package com.google.firebase.sessions;

import am.j;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/google/firebase/sessions/ProcessDetails;", "", "processName", "", "pid", "", "importance", "isDefaultProcess", "", "<init>", "(Ljava/lang/String;IIZ)V", "getProcessName", "()Ljava/lang/String;", "getPid", "()I", "getImportance", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProcessDetails {
    private final int importance;
    private final boolean isDefaultProcess;
    private final int pid;
    private final String processName;

    public ProcessDetails(String str, int i14, int i15, boolean z14) {
        str.getClass();
        this.processName = str;
        this.pid = i14;
        this.importance = i15;
        this.isDefaultProcess = z14;
    }

    public static /* synthetic */ ProcessDetails copy$default(ProcessDetails processDetails, String str, int i14, int i15, boolean z14, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            str = processDetails.processName;
        }
        if ((i16 & 2) != 0) {
            i14 = processDetails.pid;
        }
        if ((i16 & 4) != 0) {
            i15 = processDetails.importance;
        }
        if ((i16 & 8) != 0) {
            z14 = processDetails.isDefaultProcess;
        }
        return processDetails.copy(str, i14, i15, z14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProcessName() {
        return this.processName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPid() {
        return this.pid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getImportance() {
        return this.importance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsDefaultProcess() {
        return this.isDefaultProcess;
    }

    public final ProcessDetails copy(String processName, int pid, int importance, boolean isDefaultProcess) {
        processName.getClass();
        return new ProcessDetails(processName, pid, importance, isDefaultProcess);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessDetails)) {
            return false;
        }
        ProcessDetails processDetails = (ProcessDetails) other;
        return s.g(this.processName, processDetails.processName) && this.pid == processDetails.pid && this.importance == processDetails.importance && this.isDefaultProcess == processDetails.isDefaultProcess;
    }

    public final int getImportance() {
        return this.importance;
    }

    public final int getPid() {
        return this.pid;
    }

    public final String getProcessName() {
        return this.processName;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isDefaultProcess) + q2.d(this.importance, q2.d(this.pid, this.processName.hashCode() * 31, 31), 31);
    }

    public final boolean isDefaultProcess() {
        return this.isDefaultProcess;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("ProcessDetails(processName=");
        sb3.append(this.processName);
        sb3.append(", pid=");
        sb3.append(this.pid);
        sb3.append(", importance=");
        sb3.append(this.importance);
        sb3.append(", isDefaultProcess=");
        return j.t(sb3, this.isDefaultProcess, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
