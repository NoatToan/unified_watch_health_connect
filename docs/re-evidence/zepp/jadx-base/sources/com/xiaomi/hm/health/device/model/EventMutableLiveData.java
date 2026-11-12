package com.xiaomi.hm.health.device.model;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\f\u0010\rJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0005H\u0016J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/model/EventMutableLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "Landroidx/lifecycle/Observer;", "observer", "", "observe", "value", "postValue", "(Ljava/lang/Object;)V", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EventMutableLiveData<T> extends MutableLiveData<T> {
    @Override // androidx.p008lifecycle.LiveData
    public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super T> observer) {
        LiveEventObserver.INSTANCE.bind(this, owner, observer);
    }

    @Override // androidx.p008lifecycle.MutableLiveData, androidx.p008lifecycle.LiveData
    public void postValue(T value) {
        LiveDataUtils.INSTANCE.setValue(this, value);
    }
}
