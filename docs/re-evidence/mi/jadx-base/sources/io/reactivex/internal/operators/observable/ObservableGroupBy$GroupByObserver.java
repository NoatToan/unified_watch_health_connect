package io.reactivex.internal.operators.observable;

import defpackage.bua;
import defpackage.c5h;
import defpackage.jz6;
import defpackage.qf8;
import defpackage.x3h;
import defpackage.y3b;
import defpackage.z5h;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableGroupBy$GroupByObserver<T, K, V> extends AtomicInteger implements z5h<T>, jz6 {
    static final Object NULL_KEY = new Object();
    private static final long serialVersionUID = -3688291656102519502L;
    final int bufferSize;
    final boolean delayError;
    final z5h<? super y3b<K, V>> downstream;
    final bua<? super T, ? extends K> keySelector;
    jz6 upstream;
    final bua<? super T, ? extends V> valueSelector;
    final AtomicBoolean cancelled = new AtomicBoolean();
    final Map<Object, c5h<K, V>> groups = new ConcurrentHashMap();

    public ObservableGroupBy$GroupByObserver(z5h<? super y3b<K, V>> z5hVar, bua<? super T, ? extends K> buaVar, bua<? super T, ? extends V> buaVar2, int i, boolean z) {
        this.downstream = z5hVar;
        this.keySelector = buaVar;
        this.valueSelector = buaVar2;
        this.bufferSize = i;
        this.delayError = z;
        lazySet(1);
    }

    public void cancel(K k2) {
        if (k2 == null) {
            k2 = (K) NULL_KEY;
        }
        this.groups.remove(k2);
        if (decrementAndGet() == 0) {
            this.upstream.dispose();
        }
    }

    @Override // defpackage.jz6
    public void dispose() {
        if (this.cancelled.compareAndSet(false, true) && decrementAndGet() == 0) {
            this.upstream.dispose();
        }
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return this.cancelled.get();
    }

    @Override // defpackage.z5h
    public void onComplete() {
        ArrayList arrayList = new ArrayList(this.groups.values());
        this.groups.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c5h) it.next()).onComplete();
        }
        this.downstream.onComplete();
    }

    @Override // defpackage.z5h
    public void onError(Throwable th) {
        ArrayList arrayList = new ArrayList(this.groups.values());
        this.groups.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c5h) it.next()).onError(th);
        }
        this.downstream.onError(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z5h
    public void onNext(T t) {
        try {
            K kApply = this.keySelector.apply(t);
            Object obj = kApply != null ? kApply : NULL_KEY;
            c5h<K, V> c5hVar = this.groups.get(obj);
            c5h c5hVar2 = c5hVar;
            if (c5hVar == false) {
                if (this.cancelled.get()) {
                    return;
                }
                c5h<K, V> c5hVarJ0 = c5h.j0(kApply, this.bufferSize, this, this.delayError);
                this.groups.put(obj, c5hVarJ0);
                getAndIncrement();
                this.downstream.onNext(c5hVarJ0);
                c5hVar2 = c5hVarJ0;
            }
            try {
                c5hVar2.onNext(x3h.d(this.valueSelector.apply(t), "The value supplied is null"));
            } catch (Throwable th) {
                qf8.b(th);
                this.upstream.dispose();
                onError(th);
            }
        } catch (Throwable th2) {
            qf8.b(th2);
            this.upstream.dispose();
            onError(th2);
        }
    }

    @Override // defpackage.z5h
    public void onSubscribe(jz6 jz6Var) {
        if (DisposableHelper.validate(this.upstream, jz6Var)) {
            this.upstream = jz6Var;
            this.downstream.onSubscribe(this);
        }
    }
}
