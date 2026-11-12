package com.xiaomi.smarthome;

import androidx.lifecycle.LiveData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\r\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0004J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/xiaomi/smarthome/KotlinLiveData;", "T", "Landroidx/lifecycle/LiveData;", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "postValue", "", "setValue", "base-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class KotlinLiveData<T> extends LiveData<T> {
    public KotlinLiveData(T t) {
        super(t);
    }

    @Override // androidx.lifecycle.LiveData
    public T getValue() {
        T t = (T) super.getValue();
        Intrinsics.checkNotNull(t);
        return t;
    }

    @Override // androidx.lifecycle.LiveData
    public void postValue(T value) {
        super.postValue(value);
    }

    @Override // androidx.lifecycle.LiveData
    public void setValue(T value) {
        super.setValue(value);
    }
}
