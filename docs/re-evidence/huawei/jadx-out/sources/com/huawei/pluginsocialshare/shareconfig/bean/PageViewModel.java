package com.huawei.pluginsocialshare.shareconfig.bean;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes42.dex */
public class PageViewModel extends ViewModel {
    private final MutableLiveData<Integer> d = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MutableLiveData<Integer> f22567c = new MutableLiveData<>();

    public LiveData<Integer> b() {
        return this.d;
    }

    public void e(int i) {
        this.d.setValue(Integer.valueOf(i));
    }

    public LiveData<Integer> c() {
        return this.f22567c;
    }

    public void d(int i) {
        this.f22567c.setValue(Integer.valueOf(i));
    }
}
