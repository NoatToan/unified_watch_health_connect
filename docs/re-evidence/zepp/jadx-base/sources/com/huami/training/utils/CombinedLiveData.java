package com.huami.training.utils;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.Observer;
import com.huami.assistant.model.bean.Update;
import com.huami.training.utils.CombinedLiveData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B_\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012:\u0010\u0014\u001a6\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00028\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\n\u001a\u00020\t\"\u0004\b\u0003\u0010\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00030\u00052\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00030\u0007H\u0016J\u001c\u0010\f\u001a\u00020\t\"\u0004\b\u0003\u0010\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00030\u0005H\u0016RJ\u0010\u0014\u001a6\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00028\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0010\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/huami/training/utils/CombinedLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "K", ExifInterface.LATITUDE_SOUTH, "Landroidx/lifecycle/MediatorLiveData;", "Landroidx/lifecycle/LiveData;", "source", "Landroidx/lifecycle/Observer;", "onChanged", "", "addSource", "toRemote", "removeSource", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", Update.COLUMN_DATA1, "data2", "a", "Lkotlin/jvm/functions/Function2;", "combine", "b", "Ljava/lang/Object;", "c", "source1", "source2", "<init>", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function2;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class CombinedLiveData<T, K, S> extends MediatorLiveData<S> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function2<T, K, S> combine;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private T data1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private K data2;

    /* JADX WARN: Multi-variable type inference failed */
    public CombinedLiveData(@NotNull LiveData<T> liveData, @NotNull LiveData<K> liveData2, @NotNull Function2<? super T, ? super K, ? extends S> function2) {
        this.combine = function2;
        super.addSource(liveData, new Observer() { // from class: bx0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CombinedLiveData.c(this.a, obj);
            }
        });
        super.addSource(liveData2, new Observer() { // from class: ax0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CombinedLiveData.d(this.a, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(CombinedLiveData combinedLiveData, Object obj) {
        combinedLiveData.data1 = obj;
        combinedLiveData.setValue(combinedLiveData.combine.invoke(obj, combinedLiveData.data2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(CombinedLiveData combinedLiveData, Object obj) {
        combinedLiveData.data2 = obj;
        combinedLiveData.setValue(combinedLiveData.combine.invoke(combinedLiveData.data1, obj));
    }

    @Override // androidx.p008lifecycle.MediatorLiveData
    public <S> void addSource(@NotNull LiveData<S> source, @NotNull Observer<? super S> onChanged) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.p008lifecycle.MediatorLiveData
    public <T> void removeSource(@NotNull LiveData<T> toRemote) {
        throw new UnsupportedOperationException();
    }
}
