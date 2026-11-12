package com.huawei.hms.common.internal;

import com.huawei.hmf.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public class TaskApiCallWrapper<TResult> extends BaseContentWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TaskApiCall<? extends AnyClient, TResult> f13075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource<TResult> f13076b;

    public TaskApiCallWrapper(TaskApiCall<? extends AnyClient, TResult> taskApiCall, TaskCompletionSource<TResult> taskCompletionSource) {
        super(1);
        this.f13075a = taskApiCall;
        this.f13076b = taskCompletionSource;
    }

    public TaskApiCall<? extends AnyClient, TResult> getTaskApiCall() {
        return this.f13075a;
    }

    public TaskCompletionSource<TResult> getTaskCompletionSource() {
        return this.f13076b;
    }
}
