package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes14.dex */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class FinalizableWeakReference<T> extends WeakReference<T> implements FinalizableReference {
    public FinalizableWeakReference(T t7, FinalizableReferenceQueue finalizableReferenceQueue) {
        super(t7, finalizableReferenceQueue.queue);
        finalizableReferenceQueue.cleanUp();
    }
}
