package com.xiaomi.smarthome.frame.cancel;

import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class CancelableRef<T> implements Cancelable {
    private final CancelHandle cancelHandle;
    private final LinkedList<OnCancelListener> listeners = new LinkedList<>();
    private T t;

    public CancelableRef(CancelHandle cancelHandle, T t) {
        this.t = t;
        this.cancelHandle = cancelHandle;
        cancelHandle.add(this);
    }

    public void addOnCancelListener(OnCancelListener onCancelListener) {
        synchronized (this.listeners) {
            this.listeners.add(onCancelListener);
        }
    }

    @Override // com.xiaomi.smarthome.frame.cancel.Cancelable
    public void cancel() {
        this.t = null;
        synchronized (this.listeners) {
            try {
                if (this.listeners.size() == 0) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.listeners);
                this.listeners.clear();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((OnCancelListener) arrayList.get(size)).onCancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public T get() {
        return this.t;
    }

    public T getAndClear() {
        T t = this.t;
        this.t = null;
        return t;
    }

    public CancelHandle getCancelHandle() {
        return this.cancelHandle;
    }
}
