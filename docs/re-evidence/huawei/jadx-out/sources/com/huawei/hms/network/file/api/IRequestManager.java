package com.huawei.hms.network.file.api;

import com.huawei.hms.network.file.api.Request;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface IRequestManager<R extends Request> {
    Result cancelRequest(long j);

    Result closeThreadPools();

    Result destoryRequests();

    List<R> getAllRequests();

    R getRequest(long j);

    Result.STATUS getRequestStatus(long j);

    Result start(R r, Callback callback);
}
