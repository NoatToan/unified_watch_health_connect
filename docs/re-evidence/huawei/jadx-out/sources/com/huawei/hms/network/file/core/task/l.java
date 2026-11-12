package com.huawei.hms.network.file.core.task;

import com.huawei.hms.network.file.core.Constants;
import com.huawei.hms.network.file.core.FileManagerException;
import com.huawei.hms.network.file.core.task.k;
import java.io.Closeable;

/* JADX INFO: loaded from: classes10.dex */
public class l<R extends k> implements ITaskResult<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f15767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f15768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    FileManagerException f15769c;
    Closeable d;
    R e;

    public String toString() {
        return "TaskResult{errorCode=" + this.f15767a + ", message='" + this.f15768b + "', rawResponse=" + this.d + '}';
    }

    @Override // com.huawei.hms.network.file.core.task.ITaskResult
    public void setTask(R r) {
        this.e = r;
    }

    @Override // com.huawei.hms.network.file.core.task.ITaskResult
    public void setRawResponse(Closeable closeable) {
        this.d = closeable;
    }

    @Override // com.huawei.hms.network.file.core.task.ITaskResult
    public void setException(FileManagerException fileManagerException) {
        this.f15769c = fileManagerException;
    }

    @Override // com.huawei.hms.network.file.core.task.ITaskResult
    public e getTask() {
        return this.e;
    }

    @Override // com.huawei.hms.network.file.core.task.ITaskResult
    public Closeable getRawResponse() {
        return this.d;
    }

    @Override // com.huawei.hms.network.file.core.task.ITaskResult
    public FileManagerException getException() {
        return this.f15769c;
    }

    @Override // com.huawei.hms.network.file.core.task.ITaskResult
    public String getErrorMessage() {
        return this.f15768b;
    }

    @Override // com.huawei.hms.network.file.core.task.ITaskResult
    public int getErrorCode() {
        return this.f15767a;
    }

    public void a(String str) {
        this.f15768b = str;
    }

    public l(Constants.ErrorCode errorCode) {
        this.f15767a = errorCode.getErrorCode();
        this.f15768b = errorCode.getErrorMessage();
    }
}
