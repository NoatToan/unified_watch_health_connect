package com.huawei.hmf.tasks;

/* JADX INFO: loaded from: classes33.dex */
public interface SuccessContinuation<TResult, TContinuationResult> {
    Task<TContinuationResult> then(TResult tresult) throws Exception;
}
