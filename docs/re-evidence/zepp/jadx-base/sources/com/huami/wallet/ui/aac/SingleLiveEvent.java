package com.huami.wallet.ui.aac;

import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes16.dex */
public class SingleLiveEvent<T> extends MutableLiveData<T> {
    private static final String b = "SingleLiveEvent";
    private final AtomicBoolean a = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Observer observer, Object obj) {
        if (this.a.compareAndSet(true, false)) {
            observer.onChanged(obj);
        }
    }

    @MainThread
    public void call() {
        setValue(null);
    }

    @Override // androidx.p008lifecycle.LiveData
    @MainThread
    public void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull final Observer<? super T> observer) {
        if (hasActiveObservers()) {
            Log.w(b, "Multiple observers registered but only one will be notified of changes.");
        }
        super.observe(lifecycleOwner, new Observer() { // from class: ev6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.b(observer, obj);
            }
        });
    }

    @Override // androidx.p008lifecycle.MutableLiveData, androidx.p008lifecycle.LiveData
    @MainThread
    public void setValue(@Nullable T t) {
        this.a.set(true);
        super.setValue(t);
    }
}
