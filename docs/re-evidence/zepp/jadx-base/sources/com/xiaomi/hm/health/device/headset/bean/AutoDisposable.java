package com.xiaomi.hm.health.device.headset.bean;

import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.OnLifecycleEvent;
import com.huami.watch.notification.TransportUri;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0004H\u0007R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/bean/AutoDisposable;", "Landroidx/lifecycle/LifecycleObserver;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "", "bind", "Lio/reactivex/disposables/Disposable;", "disposable", TransportUri.ACTION_ADD, "onDestroy", "Lio/reactivex/disposables/CompositeDisposable;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "setCompositeDisposable", "(Lio/reactivex/disposables/CompositeDisposable;)V", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AutoDisposable implements LifecycleObserver {
    public CompositeDisposable compositeDisposable;

    public final void add(@NotNull Disposable disposable) {
        if (this.compositeDisposable == null) {
            throw new NotImplementedError("must bind AutoDisposable to a Lifecycle first");
        }
        getCompositeDisposable().add(disposable);
    }

    public final void bind(@NotNull Lifecycle lifecycle) {
        lifecycle.addObserver(this);
        setCompositeDisposable(new CompositeDisposable());
    }

    @NotNull
    public final CompositeDisposable getCompositeDisposable() {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Objects.requireNonNull(compositeDisposable);
        return compositeDisposable;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        getCompositeDisposable().clear();
    }

    public final void setCompositeDisposable(@NotNull CompositeDisposable compositeDisposable) {
        this.compositeDisposable = compositeDisposable;
    }
}
