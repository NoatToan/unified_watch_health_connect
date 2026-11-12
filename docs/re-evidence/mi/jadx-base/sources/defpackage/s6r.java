package defpackage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class s6r<T> implements Observer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LiveData<T> f33356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<Observer<T>> f33357b;

    public s6r(LiveData<T> liveData, Observer<T> observer) {
        Objects.requireNonNull(liveData);
        this.f33356a = liveData;
        Objects.requireNonNull(observer);
        this.f33357b = new WeakReference<>(observer);
    }

    public static <T> void a(LiveData<T> liveData, Observer<T> observer) {
        liveData.observeForever(new s6r(liveData, observer));
    }

    @Override // androidx.lifecycle.Observer
    public void onChanged(T t) {
        Observer<T> observer = this.f33357b.get();
        if (observer != null) {
            observer.onChanged(t);
        } else {
            this.f33356a.removeObserver(this);
        }
    }
}
