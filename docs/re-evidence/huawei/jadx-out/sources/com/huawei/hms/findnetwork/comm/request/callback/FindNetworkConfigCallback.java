package com.huawei.hms.findnetwork.comm.request.callback;

import com.huawei.hms.findnetwork.comm.request.result.FindNetworkConfigResult;

/* JADX INFO: loaded from: classes33.dex */
public interface FindNetworkConfigCallback<T> {
    void onFail(FindNetworkConfigResult<T> findNetworkConfigResult);

    void onSuccess(FindNetworkConfigResult<T> findNetworkConfigResult);
}
