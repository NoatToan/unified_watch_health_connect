package com.huawei.hms.network.file.core.task;

import com.huawei.hms.network.file.api.Request;
import com.huawei.hms.network.file.core.task.k;
import java.io.Closeable;

/* JADX INFO: loaded from: classes10.dex */
public interface b<R extends Request, T extends k> {
    Closeable a(T t, f fVar);
}
