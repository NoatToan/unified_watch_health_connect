package com.xiaomi.hm.health.databases.invalidation;

import java.lang.ref.WeakReference;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/databases/invalidation/WeakObserver;", "Lcom/xiaomi/hm/health/databases/invalidation/Observer;", "", "", "tables", "", "onInvalidated", "Lcom/xiaomi/hm/health/databases/invalidation/InvalidationTracker;", "b", "Lcom/xiaomi/hm/health/databases/invalidation/InvalidationTracker;", "tracker", "Ljava/lang/ref/WeakReference;", "c", "Ljava/lang/ref/WeakReference;", "delegateRef", "delegate", "<init>", "(Lcom/xiaomi/hm/health/databases/invalidation/InvalidationTracker;Lcom/xiaomi/hm/health/databases/invalidation/Observer;)V", "database_release"}, k = 1, mv = {1, 5, 1})
public final class WeakObserver extends Observer {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final InvalidationTracker tracker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final WeakReference<Observer> delegateRef;

    public WeakObserver(@NotNull InvalidationTracker invalidationTracker, @NotNull Observer observer) {
        super(observer.getMTables());
        this.tracker = invalidationTracker;
        this.delegateRef = new WeakReference<>(observer);
    }

    @Override // com.xiaomi.hm.health.databases.invalidation.Observer
    public void onInvalidated(@NotNull Set<String> tables) {
        Observer observer = this.delegateRef.get();
        if (observer == null) {
            this.tracker.removeObserver(this);
        } else {
            observer.onInvalidated(tables);
        }
    }
}
