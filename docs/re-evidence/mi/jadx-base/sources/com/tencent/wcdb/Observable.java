package com.tencent.wcdb;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Observable<T> {
    protected final ArrayList<T> mObservers = new ArrayList<>();

    public void registerObserver(T t) {
        if (t == null) {
            throw new IllegalArgumentException("The observer is null.");
        }
        synchronized (this.mObservers) {
            try {
                if (this.mObservers.contains(t)) {
                    throw new IllegalStateException("Observer " + t + " is already registered.");
                }
                this.mObservers.add(t);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unregisterAll() {
        synchronized (this.mObservers) {
            this.mObservers.clear();
        }
    }

    public void unregisterObserver(T t) {
        if (t == null) {
            throw new IllegalArgumentException("The observer is null.");
        }
        synchronized (this.mObservers) {
            try {
                int iIndexOf = this.mObservers.indexOf(t);
                if (iIndexOf == -1) {
                    throw new IllegalStateException("Observer " + t + " was not registered.");
                }
                this.mObservers.remove(iIndexOf);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
