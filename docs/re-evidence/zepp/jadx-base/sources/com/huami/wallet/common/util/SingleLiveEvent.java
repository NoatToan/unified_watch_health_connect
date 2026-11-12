package com.huami.wallet.common.util;

import androidx.annotation.MainThread;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import com.huami.wallet.common.util.SingleLiveEvent;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0013*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\b\u0000\u0012\u0004\u0018\u00018\u00000\u0005H\u0017J\u0019\u0010\n\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0007H\u0007R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/wallet/common/util/SingleLiveEvent;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "Landroidx/lifecycle/Observer;", "observer", "", "observe", "t", "setValue", "(Ljava/lang/Object;)V", NotificationCompat.CATEGORY_CALL, "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mPending", "<init>", "()V", "Companion", "common_release"}, k = 1, mv = {1, 5, 1})
public final class SingleLiveEvent<T> extends MutableLiveData<T> {

    @NotNull
    private static final String b = "SingleLiveEvent";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean mPending = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SingleLiveEvent singleLiveEvent, Observer observer, Object obj) {
        if (singleLiveEvent.mPending.compareAndSet(true, false)) {
            observer.onChanged(obj);
        }
    }

    @MainThread
    public final void call() {
        setValue(null);
    }

    @Override // androidx.p008lifecycle.LiveData
    @MainThread
    public void observe(@NotNull LifecycleOwner owner, @NotNull final Observer<? super T> observer) {
        super.observe(owner, new Observer() { // from class: dv6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SingleLiveEvent.b(this.a, observer, obj);
            }
        });
    }

    @Override // androidx.p008lifecycle.MutableLiveData, androidx.p008lifecycle.LiveData
    @MainThread
    public void setValue(@Nullable T t) {
        this.mPending.set(true);
        super.setValue(t);
    }
}
