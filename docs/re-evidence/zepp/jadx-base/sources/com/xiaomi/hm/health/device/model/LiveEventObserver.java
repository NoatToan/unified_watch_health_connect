package com.xiaomi.hm.health.device.model;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.OnLifecycleEvent;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 \u001f*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001fB-\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0003J\b\u0010\f\u001a\u00020\nH\u0003J\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0018\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/model/LiveEventObserver;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LifecycleObserver;", "Landroidx/lifecycle/Observer;", "", "a", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "onEvent", "onDestroy", "t", "onChanged", "(Ljava/lang/Object;)V", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LiveData;", "mLiveData", "b", "Landroidx/lifecycle/LifecycleOwner;", "mOwner", "c", "Landroidx/lifecycle/Observer;", "mObserver", "", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "mPendingData", "<init>", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class LiveEventObserver<T> implements LifecycleObserver, Observer<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private LiveData<T> mLiveData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private LifecycleOwner mOwner;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private Observer<? super T> mObserver;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<T> mPendingData = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\n\u001a\u00020\t\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0007¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/model/LiveEventObserver$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveData;", "liveData", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "Landroidx/lifecycle/Observer;", "observer", "", "bind", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> void bind(@NotNull LiveData<T> liveData, @NotNull LifecycleOwner owner, @NotNull Observer<? super T> observer) {
            if (owner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                return;
            }
            new LiveEventObserver(liveData, owner, observer);
        }
    }

    public LiveEventObserver(@NotNull LiveData<T> liveData, @NotNull LifecycleOwner lifecycleOwner, @NotNull Observer<? super T> observer) {
        this.mLiveData = liveData;
        this.mOwner = lifecycleOwner;
        this.mObserver = observer;
        this.mOwner.getLifecycle().addObserver(this);
        this.mLiveData.observeForever(this);
    }

    private final boolean a() {
        return this.mOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        this.mLiveData.removeObserver(this);
        this.mOwner.getLifecycle().removeObserver(this);
        this.mPendingData.clear();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    private final void onEvent(LifecycleOwner owner, Lifecycle.Event event) {
        if (owner != this.mOwner) {
            return;
        }
        if (event == Lifecycle.Event.ON_START || event == Lifecycle.Event.ON_RESUME) {
            int i = 0;
            int size = this.mPendingData.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = i + 1;
                    this.mObserver.onChanged(this.mPendingData.get(i));
                    if (i2 > size) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
            this.mPendingData.clear();
        }
    }

    @Override // androidx.p008lifecycle.Observer
    public void onChanged(T t) {
        if (a()) {
            this.mObserver.onChanged(t);
        } else {
            this.mPendingData.add(t);
        }
    }
}
