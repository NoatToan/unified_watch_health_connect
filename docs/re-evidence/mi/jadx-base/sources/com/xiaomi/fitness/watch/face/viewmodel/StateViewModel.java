package com.xiaomi.fitness.watch.face.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.recyclerview.StateData;

/* JADX INFO: loaded from: classes10.dex */
public abstract class StateViewModel<D> extends BaseStateViewModel {
    public MutableLiveData<StateData<D>> liveData;
    protected StateData<D> mState = new StateData<>();

    public StateViewModel() {
        MutableLiveData<StateData<D>> liveData = getLiveData();
        this.liveData = liveData == null ? new MutableLiveData<>() : liveData;
    }

    public MutableLiveData<StateData<D>> getLiveData() {
        return null;
    }

    public void postError(int i) {
        this.liveData.postValue(this.mState.d(i));
    }

    public void postSuccess(D d) {
        this.liveData.postValue(this.mState.r(d));
    }

    public void setEmpty() {
        this.liveData.postValue(this.mState.a());
    }

    public void setError() {
        this.liveData.postValue(this.mState.c());
    }

    public void setLoading() {
        this.liveData.postValue(this.mState.l());
    }

    public void setSuccess(D d) {
        this.liveData.postValue(this.mState.r(d));
    }

    public void setError(int i) {
        this.liveData.postValue(this.mState.d(i));
    }
}
