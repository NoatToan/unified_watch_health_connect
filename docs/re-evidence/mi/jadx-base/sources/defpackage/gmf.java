package defpackage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class gmf<T> extends MutableLiveData<T> {
    private d9l<LiveData<?>, a<?>> mSources;

    public static class a<V> implements Observer<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LiveData<V> f19135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Observer<? super V> f19136b;
        public int c = -1;

        public a(LiveData<V> liveData, Observer<? super V> observer) {
            this.f19135a = liveData;
            this.f19136b = observer;
        }

        public void a() {
            this.f19135a.observeForever(this);
        }

        public void b() {
            this.f19135a.removeObserver(this);
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(V v) {
            if (this.c != this.f19135a.getVersion()) {
                this.c = this.f19135a.getVersion();
                this.f19136b.onChanged(v);
            }
        }
    }

    public gmf() {
        this.mSources = new d9l<>();
    }

    public <S> void addSource(LiveData<S> liveData, Observer<? super S> observer) {
        if (liveData == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(liveData, observer);
        a<?> aVarJ = this.mSources.j(liveData, aVar);
        if (aVarJ != null && aVarJ.f19136b != observer) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVarJ == null && hasActiveObservers()) {
            aVar.a();
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.mSources.iterator();
        while (it.hasNext()) {
            it.next().getValue().a();
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.mSources.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    public <S> void removeSource(LiveData<S> liveData) {
        a<?> aVarK = this.mSources.k(liveData);
        if (aVarK != null) {
            aVarK.b();
        }
    }

    public gmf(T t) {
        super(t);
        this.mSources = new d9l<>();
    }
}
