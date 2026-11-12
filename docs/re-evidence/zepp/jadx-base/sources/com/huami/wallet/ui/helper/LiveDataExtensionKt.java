package com.huami.wallet.ui.helper;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.ui.helper.LiveDataExtensionKt;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\n\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004\u001aC\u0010\r\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001d\u0010\t\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\f\u001aC\u0010\u000e\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001d\u0010\t\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\f¨\u0006\u000f"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "data", "", "action", "observeWithNotNull", "Lcom/huami/wallet/lib/entity/Resource;", "Lkotlin/ExtensionFunctionType;", "observeResourceWithNotNull", "observeResourceWithCompleted", "core-ui_release"}, k = 2, mv = {1, 5, 1})
public final class LiveDataExtensionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function1 function1, Resource resource) {
        if (resource == null || resource.status == Status.LOADING) {
            return;
        }
        function1.invoke(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Resource resource) {
        if (resource == null) {
            return;
        }
        function1.invoke(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Function1 function1, Object obj) {
        if (obj == null) {
            return;
        }
        function1.invoke(obj);
    }

    public static final <T> void observeResourceWithCompleted(@NotNull LiveData<Resource<T>> liveData, @NotNull LifecycleOwner lifecycleOwner, @NotNull final Function1<? super Resource<T>, Unit> function1) {
        liveData.observe(lifecycleOwner, new Observer() { // from class: lp4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LiveDataExtensionKt.d(function1, (Resource) obj);
            }
        });
    }

    public static final <T> void observeResourceWithNotNull(@NotNull LiveData<Resource<T>> liveData, @NotNull LifecycleOwner lifecycleOwner, @NotNull final Function1<? super Resource<T>, Unit> function1) {
        liveData.observe(lifecycleOwner, new Observer() { // from class: mp4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LiveDataExtensionKt.e(function1, (Resource) obj);
            }
        });
    }

    public static final <T> void observeWithNotNull(@NotNull LiveData<T> liveData, @NotNull LifecycleOwner lifecycleOwner, @NotNull final Function1<? super T, Unit> function1) {
        liveData.observe(lifecycleOwner, new Observer() { // from class: np4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LiveDataExtensionKt.f(function1, obj);
            }
        });
    }
}
