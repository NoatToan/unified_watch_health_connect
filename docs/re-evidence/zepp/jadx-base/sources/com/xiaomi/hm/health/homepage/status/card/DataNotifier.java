package com.xiaomi.hm.health.homepage.status.card;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0004R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/homepage/status/card/DataNotifier;", "", "Lcom/xiaomi/hm/health/homepage/status/card/DataNotifier$Observer;", "observer", "", "addWeakObserver", "addObserver", "removeObserver", "notifyInvalidated", "Ljava/util/concurrent/CopyOnWriteArraySet;", "a", "Ljava/util/concurrent/CopyOnWriteArraySet;", "observers", "<init>", "()V", "Observer", "WeakObserver", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DataNotifier {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArraySet<Observer> observers = new CopyOnWriteArraySet<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/homepage/status/card/DataNotifier$Observer;", "", "", "onInvalidated", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public interface Observer {
        void onInvalidated();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/homepage/status/card/DataNotifier$WeakObserver;", "Lcom/xiaomi/hm/health/homepage/status/card/DataNotifier$Observer;", "", "onInvalidated", "Lcom/xiaomi/hm/health/homepage/status/card/DataNotifier;", "a", "Lcom/xiaomi/hm/health/homepage/status/card/DataNotifier;", "notifier", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "delegateRef", "delegate", "<init>", "(Lcom/xiaomi/hm/health/homepage/status/card/DataNotifier;Lcom/xiaomi/hm/health/homepage/status/card/DataNotifier$Observer;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class WeakObserver implements Observer {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final DataNotifier notifier;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final WeakReference<Observer> delegateRef;

        public WeakObserver(@NotNull DataNotifier dataNotifier, @NotNull Observer observer) {
            this.notifier = dataNotifier;
            this.delegateRef = new WeakReference<>(observer);
        }

        @Override // com.xiaomi.hm.health.homepage.status.card.DataNotifier.Observer
        public void onInvalidated() {
            Observer observer = this.delegateRef.get();
            if (observer == null) {
                this.notifier.removeObserver(this);
            } else {
                observer.onInvalidated();
            }
        }
    }

    public final void addObserver(@NotNull Observer observer) {
        this.observers.add(observer);
    }

    public final void addWeakObserver(@NotNull Observer observer) {
        addObserver(new WeakObserver(this, observer));
    }

    public final void notifyInvalidated() {
        Iterator<Observer> it2 = this.observers.iterator();
        while (it2.hasNext()) {
            it2.next().onInvalidated();
        }
    }

    public final void removeObserver(@NotNull Observer observer) {
        this.observers.remove(observer);
    }
}
