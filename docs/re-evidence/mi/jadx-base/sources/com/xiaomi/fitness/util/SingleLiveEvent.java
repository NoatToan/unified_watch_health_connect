package com.xiaomi.fitness.util;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.util.SingleLiveEvent;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\fH\u0017J\u0019\u0010\r\u001a\u00020\b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\bH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/util/SingleLiveEvent;", "T", "Landroidx/lifecycle/MutableLiveData;", "<init>", "()V", "mPending", "Ljava/util/concurrent/atomic/AtomicBoolean;", "observe", "", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "setValue", DeviceTagInterface.CUSTOM_TAG_TYPE, "(Ljava/lang/Object;)V", "call", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SingleLiveEvent<T> extends MutableLiveData<T> {

    @NotNull
    private final AtomicBoolean mPending = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe$lambda$0(SingleLiveEvent this$0, Observer observer, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(observer, "$observer");
        if (this$0.mPending.compareAndSet(true, false)) {
            observer.onChanged(obj);
        }
    }

    public final void call() {
        setValue(null);
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(@NotNull LifecycleOwner owner, @NotNull final Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        super.observe(owner, new Observer() { // from class: jem
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SingleLiveEvent.observe$lambda$0(this.f22711a, observer, obj);
            }
        });
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(@Nullable T t) {
        this.mPending.set(true);
        super.setValue(t);
    }
}
