package com.huawei.hms.network.file.core.task;

import com.huawei.hms.network.file.core.FileManagerException;
import com.huawei.hms.network.file.core.task.k;
import java.io.Closeable;

/* JADX INFO: loaded from: classes10.dex */
public interface ITaskResult<R extends k> {
    int getErrorCode();

    String getErrorMessage();

    FileManagerException getException();

    Closeable getRawResponse();

    e getTask();

    void setException(FileManagerException fileManagerException);

    void setRawResponse(Closeable closeable);

    void setTask(R r);
}
