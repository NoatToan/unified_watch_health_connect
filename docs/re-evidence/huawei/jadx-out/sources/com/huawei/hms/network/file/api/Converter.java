package com.huawei.hms.network.file.api;

import com.huawei.hms.network.file.api.Request;
import com.huawei.hms.network.file.core.task.ITaskResult;

/* JADX INFO: loaded from: classes10.dex */
public interface Converter<R extends Request, T> {
    T convertResponse(R r, ITaskResult iTaskResult);
}
