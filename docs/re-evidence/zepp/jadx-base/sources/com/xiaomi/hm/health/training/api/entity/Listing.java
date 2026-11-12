package com.xiaomi.hm.health.training.api.entity;

import androidx.p008lifecycle.LiveData;
import androidx.paging.PagedList;

/* JADX INFO: loaded from: classes21.dex */
public class Listing<T> {
    private LiveData<PagedList<T>> a;
    private LiveData<Resource<Void>> b;
    private LiveData<Resource<Void>> c;
    private Runnable d;
    private Runnable e;

    public Listing(LiveData<PagedList<T>> liveData, LiveData<Resource<Void>> liveData2, LiveData<Resource<Void>> liveData3, Runnable runnable, Runnable runnable2) {
        this.a = liveData;
        this.b = liveData2;
        this.c = liveData3;
        this.d = runnable;
        this.e = runnable2;
    }

    public LiveData<Resource<Void>> getNetworkState() {
        return this.b;
    }

    public LiveData<PagedList<T>> getPagedList() {
        return this.a;
    }

    public Runnable getRefresh() {
        return this.d;
    }

    public LiveData<Resource<Void>> getRefreshState() {
        return this.c;
    }

    public Runnable getRetry() {
        return this.e;
    }
}
