package com.garmin.android.library.backgroundtaskmanagement;

import am.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/library/backgroundtaskmanagement/BizOperationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$c;", "status", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b$c;)V", "Lcom/garmin/android/library/backgroundtaskmanagement/b$c;", "getStatus", "()Lcom/garmin/android/library/backgroundtaskmanagement/b$c;", "", "getMessage", "()Ljava/lang/String;", "message", "background-task-management_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BizOperationException extends Exception {
    private final b.c status;

    public BizOperationException(b.c cVar) {
        cVar.getClass();
        this.status = cVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return j.m("Biz Operation Error Status [", this.status.name(), "]");
    }

    public final b.c getStatus() {
        return this.status;
    }
}
