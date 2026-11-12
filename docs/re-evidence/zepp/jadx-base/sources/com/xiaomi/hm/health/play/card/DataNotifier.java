package com.xiaomi.hm.health.play.card;

import androidx.exifinterface.media.ExifInterface;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0014\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0014\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/play/card/DataNotifier;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/xiaomi/hm/health/play/card/DataNotifier$Observer;", "observer", "", "addWeakObserver", "addObserver", "removeObserver", "data", "notifyInvalidated", "(Ljava/lang/Object;)V", "Ljava/util/concurrent/CopyOnWriteArraySet;", "a", "Ljava/util/concurrent/CopyOnWriteArraySet;", "observers", "<init>", "()V", "Observer", "WeakObserver", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DataNotifier<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArraySet<Observer<T>> observers = new CopyOnWriteArraySet<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/play/card/DataNotifier$Observer;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "", "onInvalidated", "(Ljava/lang/Object;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public interface Observer<T> {
        void onInvalidated(T data);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B#\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/play/card/DataNotifier$WeakObserver;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/play/card/DataNotifier$Observer;", "data", "", "onInvalidated", "(Ljava/lang/Object;)V", "Lcom/xiaomi/hm/health/play/card/DataNotifier;", "a", "Lcom/xiaomi/hm/health/play/card/DataNotifier;", "notifier", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "delegateRef", "delegate", "<init>", "(Lcom/xiaomi/hm/health/play/card/DataNotifier;Lcom/xiaomi/hm/health/play/card/DataNotifier$Observer;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class WeakObserver<T> implements Observer<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final DataNotifier<T> notifier;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final WeakReference<Observer<T>> delegateRef;

        public WeakObserver(@NotNull DataNotifier<T> dataNotifier, @NotNull Observer<T> observer) {
            this.notifier = dataNotifier;
            this.delegateRef = new WeakReference<>(observer);
        }

        @Override // com.xiaomi.hm.health.play.card.DataNotifier.Observer
        public void onInvalidated(T data) {
            Observer<T> observer = this.delegateRef.get();
            if (observer == null) {
                this.notifier.removeObserver(this);
            } else {
                observer.onInvalidated(data);
            }
        }
    }

    public final void addObserver(@NotNull Observer<T> observer) {
        this.observers.add(observer);
    }

    public final void addWeakObserver(@NotNull Observer<T> observer) {
        addObserver(new WeakObserver(this, observer));
    }

    public final void notifyInvalidated(T data) {
        Iterator<Observer<T>> it2 = this.observers.iterator();
        while (it2.hasNext()) {
            it2.next().onInvalidated(data);
        }
    }

    public final void removeObserver(@NotNull Observer<T> observer) {
        this.observers.remove(observer);
    }
}
