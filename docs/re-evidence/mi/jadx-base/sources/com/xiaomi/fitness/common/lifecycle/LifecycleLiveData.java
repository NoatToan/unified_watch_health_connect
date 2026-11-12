package com.xiaomi.fitness.common.lifecycle;

import androidx.collection.ArrayMap;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import defpackage.nfe;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public abstract class LifecycleLiveData<T> extends LiveData<T> implements DefaultLifecycleObserver {
    private final a mLifecycleDelegate = new a(this);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Observer, LifecycleOwner> f11809a = new ArrayMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nfe f11810b;

        public a(nfe nfeVar) {
            Objects.requireNonNull(nfeVar);
            this.f11810b = nfeVar;
        }

        public void a(Observer observer, LifecycleOwner lifecycleOwner) {
            lifecycleOwner.getLifecycle().addObserver(this.f11810b);
            this.f11809a.put(observer, lifecycleOwner);
        }

        public void b(LifecycleOwner lifecycleOwner) {
            List listEmptyList = Collections.emptyList();
            for (Map.Entry<Observer, LifecycleOwner> entry : this.f11809a.entrySet()) {
                if (lifecycleOwner.equals(entry.getValue())) {
                    if (listEmptyList == Collections.emptyList()) {
                        listEmptyList = new LinkedList();
                    }
                    listEmptyList.add(entry.getKey());
                }
            }
            Iterator it = listEmptyList.iterator();
            while (it.hasNext()) {
                LifecycleOwner lifecycleOwnerRemove = this.f11809a.remove((Observer) it.next());
                if (lifecycleOwnerRemove != null) {
                    lifecycleOwnerRemove.getLifecycle().removeObserver(this.f11810b);
                }
            }
        }

        public void c(Observer observer) {
            LifecycleOwner lifecycleOwnerRemove = this.f11809a.remove(observer);
            if (lifecycleOwnerRemove != null) {
                lifecycleOwnerRemove.getLifecycle().removeObserver(this.f11810b);
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        super.observe(lifecycleOwner, observer);
        this.mLifecycleDelegate.a(observer, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(Observer<? super T> observer) {
        super.removeObserver(observer);
        this.mLifecycleDelegate.c(observer);
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObservers(LifecycleOwner lifecycleOwner) {
        super.removeObservers(lifecycleOwner);
        this.mLifecycleDelegate.b(lifecycleOwner);
    }
}
