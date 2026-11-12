package com.xiaomi.fitness.baseui.recyclerview.adapter;

import androidx.databinding.f;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJM\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/adapter/AdapterReferenceCollector;", "", "T", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseAdapter;", "A", "adapter", "Landroidx/databinding/f;", "items", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/WeakReferenceOnListChangedCallback;", "callback", "Ljava/lang/ref/WeakReference;", "createRef", "(Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseAdapter;Landroidx/databinding/f;Lcom/xiaomi/fitness/baseui/recyclerview/adapter/WeakReferenceOnListChangedCallback;)Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/ReferenceQueue;", "QUEUE", "Ljava/lang/ref/ReferenceQueue;", "getQUEUE", "()Ljava/lang/ref/ReferenceQueue;", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/AdapterReferenceCollector$PollReferenceThread;", "thread", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/AdapterReferenceCollector$PollReferenceThread;", "getThread", "()Lcom/xiaomi/fitness/baseui/recyclerview/adapter/AdapterReferenceCollector$PollReferenceThread;", "setThread", "(Lcom/xiaomi/fitness/baseui/recyclerview/adapter/AdapterReferenceCollector$PollReferenceThread;)V", "<init>", "()V", "PollReferenceThread", "AdapterRef", "ui_release"}, k = 1, mv = {2, 0, 0})
public final class AdapterReferenceCollector {

    @NotNull
    public static final AdapterReferenceCollector INSTANCE = new AdapterReferenceCollector();

    @NotNull
    private static final ReferenceQueue<Object> QUEUE = new ReferenceQueue<>();

    @Nullable
    private static PollReferenceThread thread;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\u0006\u0010\u000e\u001a\u00028\u0001\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/adapter/AdapterReferenceCollector$AdapterRef;", "T", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseAdapter;", "A", "Ljava/lang/ref/WeakReference;", "", "unregister", "()V", "Landroidx/databinding/f;", "items", "Landroidx/databinding/f;", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/WeakReferenceOnListChangedCallback;", "callback", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/WeakReferenceOnListChangedCallback;", "referent", "<init>", "(Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseAdapter;Landroidx/databinding/f;Lcom/xiaomi/fitness/baseui/recyclerview/adapter/WeakReferenceOnListChangedCallback;)V", "ui_release"}, k = 1, mv = {2, 0, 0})
    public static final class AdapterRef<T, A extends BaseAdapter<T>> extends WeakReference<A> {

        @NotNull
        private final WeakReferenceOnListChangedCallback<T> callback;

        @NotNull
        private final f<T> items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdapterRef(@NotNull A referent, @NotNull f<T> items, @NotNull WeakReferenceOnListChangedCallback<T> callback) {
            super(referent, AdapterReferenceCollector.INSTANCE.getQUEUE());
            Intrinsics.checkNotNullParameter(referent, "referent");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.items = items;
            this.callback = callback;
        }

        public final void unregister() {
            this.items.removeOnListChangedCallback(this.callback);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/adapter/AdapterReferenceCollector$PollReferenceThread;", "Ljava/lang/Thread;", "<init>", "()V", "run", "", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PollReferenceThread extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    Reference<? extends Object> referenceRemove = AdapterReferenceCollector.INSTANCE.getQUEUE().remove();
                    if (referenceRemove instanceof AdapterRef) {
                        ((AdapterRef) referenceRemove).unregister();
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    private AdapterReferenceCollector() {
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    @NotNull
    public final <T, A extends BaseAdapter<T>> WeakReference<A> createRef(@NotNull A adapter, @NotNull f<T> items, @NotNull WeakReferenceOnListChangedCallback<T> callback) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(callback, "callback");
        PollReferenceThread pollReferenceThread = thread;
        if (pollReferenceThread != null) {
            Intrinsics.checkNotNull(pollReferenceThread);
            if (!pollReferenceThread.isAlive()) {
                PollReferenceThread pollReferenceThread2 = new PollReferenceThread();
                thread = pollReferenceThread2;
                Intrinsics.checkNotNull(pollReferenceThread2);
                pollReferenceThread2.start();
            }
        } else {
            PollReferenceThread pollReferenceThread3 = new PollReferenceThread();
            thread = pollReferenceThread3;
            Intrinsics.checkNotNull(pollReferenceThread3);
            pollReferenceThread3.start();
        }
        return new AdapterRef(adapter, items, callback);
    }

    @NotNull
    public final ReferenceQueue<Object> getQUEUE() {
        return QUEUE;
    }

    @Nullable
    public final PollReferenceThread getThread() {
        return thread;
    }

    public final void setThread(@Nullable PollReferenceThread pollReferenceThread) {
        thread = pollReferenceThread;
    }
}
