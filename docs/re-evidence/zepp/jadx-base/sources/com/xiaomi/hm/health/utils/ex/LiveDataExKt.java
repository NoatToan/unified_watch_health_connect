package com.xiaomi.hm.health.utils.ex;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.watch.transport.httpsupport.model.DataItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "t", "", DataItem.HTTP_METHOD_PUT, "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class LiveDataExKt {
    public static final <T> void put(@NotNull MutableLiveData<T> mutableLiveData, @Nullable T t) {
        if (ArchTaskExecutor.getInstance().isMainThread()) {
            mutableLiveData.setValue(t);
        } else {
            mutableLiveData.postValue(t);
        }
    }
}
