package com.chad.library.adapter.base.diff;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.h;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.ghe;
import defpackage.tge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001<B'\u0012\u0010\u00105\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u000304\u0012\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000007¢\u0006\u0004\b:\u0010;J/\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\t2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00028\u00002\b\u0010\u001a\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00028\u0000¢\u0006\u0004\b \u0010\u0015J+\u0010!\u001a\u00020\t2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b!\u0010\u000fJ\u001d\u0010$\u001a\u00020\t2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\t2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\t¢\u0006\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R \u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001e\u00105\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;", "T", "", "", "newList", "Landroidx/recyclerview/widget/h$e;", "diffResult", "Ljava/lang/Runnable;", "commitCallback", "", "latchList", "(Ljava/util/List;Landroidx/recyclerview/widget/h$e;Ljava/lang/Runnable;)V", "", "previousList", "onCurrentListChanged", "(Ljava/util/List;Ljava/lang/Runnable;)V", "", "index", "data", "addData", "(ILjava/lang/Object;)V", "(Ljava/lang/Object;)V", "list", "addList", "(Ljava/util/List;)V", "newData", TSMAuthContants.PARAM_PAYLOAD, "changeData", "(ILjava/lang/Object;Ljava/lang/Object;)V", "removeAt", "(I)V", DeviceTagInterface.CUSTOM_TAG_TYPE, "remove", "submitList", "Ltge;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListListener", "(Ltge;)V", "removeListListener", "clearAllListListener", "()V", "Lghe;", "mUpdateCallback", "Lghe;", "Ljava/util/concurrent/Executor;", "mMainThreadExecutor", "Ljava/util/concurrent/Executor;", "sMainThreadExecutor", "mListeners", "Ljava/util/List;", "mMaxScheduledGeneration", "I", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "adapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", q.f13857a, "Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "<init>", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;)V", "MainThreadExecutor", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
public final class BrvahAsyncDiffer<T> {
    private final BaseQuickAdapter<T, ?> adapter;
    private final BrvahAsyncDifferConfig<T> config;
    private final List<tge<T>> mListeners;
    private Executor mMainThreadExecutor;
    private int mMaxScheduledGeneration;
    private final ghe mUpdateCallback;
    private final Executor sMainThreadExecutor;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer$MainThreadExecutor;", "Ljava/util/concurrent/Executor;", "()V", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "execute", "", "command", "Ljava/lang/Runnable;", "com.github.CymChad.brvah"}, k = 1, mv = {1, 1, 16})
    public static final class MainThreadExecutor implements Executor {

        @NotNull
        private final Handler mHandler = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@NotNull Runnable command) {
            this.mHandler.post(command);
        }

        @NotNull
        public final Handler getMHandler() {
            return this.mHandler;
        }
    }

    /* JADX INFO: renamed from: com.chad.library.adapter.base.diff.BrvahAsyncDiffer$submitList$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "run"}, k = 3, mv = {1, 1, 16})
    public static final class AnonymousClass1 implements Runnable {
        final /* synthetic */ Runnable $commitCallback;
        final /* synthetic */ List $newList;
        final /* synthetic */ List $oldList;
        final /* synthetic */ int $runGeneration;

        public AnonymousClass1(List list, List list2, int i, Runnable runnable) {
            this.$oldList = list;
            this.$newList = list2;
            this.$runGeneration = i;
            this.$commitCallback = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final h.e eVarB = h.b(new h.b() { // from class: com.chad.library.adapter.base.diff.BrvahAsyncDiffer$submitList$1$result$1
                @Override // androidx.recyclerview.widget.h.b
                public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
                    Object obj = this.this$0.$oldList.get(oldItemPosition);
                    Object obj2 = this.this$0.$newList.get(newItemPosition);
                    if (obj != null && obj2 != null) {
                        return BrvahAsyncDiffer.this.config.getDiffCallback().areContentsTheSame(obj, obj2);
                    }
                    if (obj == null && obj2 == null) {
                        return true;
                    }
                    throw new AssertionError();
                }

                @Override // androidx.recyclerview.widget.h.b
                public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
                    Object obj = this.this$0.$oldList.get(oldItemPosition);
                    Object obj2 = this.this$0.$newList.get(newItemPosition);
                    if (obj == null || obj2 == null) {
                        return obj == null && obj2 == null;
                    }
                    return BrvahAsyncDiffer.this.config.getDiffCallback().areItemsTheSame(obj, obj2);
                }

                @Override // androidx.recyclerview.widget.h.b
                @Nullable
                public Object getChangePayload(int oldItemPosition, int newItemPosition) {
                    Object obj = this.this$0.$oldList.get(oldItemPosition);
                    Object obj2 = this.this$0.$newList.get(newItemPosition);
                    if (obj == null || obj2 == null) {
                        throw new AssertionError();
                    }
                    return BrvahAsyncDiffer.this.config.getDiffCallback().getChangePayload(obj, obj2);
                }

                @Override // androidx.recyclerview.widget.h.b
                public int getNewListSize() {
                    return this.this$0.$newList.size();
                }

                @Override // androidx.recyclerview.widget.h.b
                public int getOldListSize() {
                    return this.this$0.$oldList.size();
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(eVarB, "DiffUtil.calculateDiff(o…         }\n            })");
            BrvahAsyncDiffer.this.mMainThreadExecutor.execute(new Runnable() { // from class: com.chad.library.adapter.base.diff.BrvahAsyncDiffer.submitList.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    int i = BrvahAsyncDiffer.this.mMaxScheduledGeneration;
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    if (i == anonymousClass1.$runGeneration) {
                        BrvahAsyncDiffer.this.latchList(anonymousClass1.$newList, eVarB, anonymousClass1.$commitCallback);
                    }
                }
            });
        }
    }

    public BrvahAsyncDiffer(@NotNull BaseQuickAdapter<T, ?> baseQuickAdapter, @NotNull BrvahAsyncDifferConfig<T> brvahAsyncDifferConfig) {
        this.adapter = baseQuickAdapter;
        this.config = brvahAsyncDifferConfig;
        this.mUpdateCallback = new BrvahListUpdateCallback(baseQuickAdapter);
        Executor mainThreadExecutor = new MainThreadExecutor();
        this.sMainThreadExecutor = mainThreadExecutor;
        Executor mainThreadExecutor2 = brvahAsyncDifferConfig.getMainThreadExecutor();
        this.mMainThreadExecutor = mainThreadExecutor2 != null ? mainThreadExecutor2 : mainThreadExecutor;
        this.mListeners = new CopyOnWriteArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void latchList(List<T> newList, h.e diffResult, Runnable commitCallback) {
        List<? extends T> data = this.adapter.getData();
        this.adapter.setData$com_github_CymChad_brvah(newList);
        diffResult.c(this.mUpdateCallback);
        onCurrentListChanged(data, commitCallback);
    }

    private final void onCurrentListChanged(List<? extends T> previousList, Runnable commitCallback) {
        Iterator<tge<T>> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().a(previousList, this.adapter.getData());
        }
        if (commitCallback != null) {
            commitCallback.run();
        }
    }

    public static /* synthetic */ void submitList$default(BrvahAsyncDiffer brvahAsyncDiffer, List list, Runnable runnable, int i, Object obj) {
        if ((i & 2) != 0) {
            runnable = null;
        }
        brvahAsyncDiffer.submitList(list, runnable);
    }

    public final void addData(int index, T data) {
        List<? extends T> data2 = this.adapter.getData();
        this.adapter.getData().add(index, data);
        this.mUpdateCallback.onInserted(index, 1);
        onCurrentListChanged(data2, null);
    }

    public final void addList(@Nullable List<? extends T> list) {
        if (list == null) {
            return;
        }
        List<? extends T> data = this.adapter.getData();
        this.adapter.getData().addAll(list);
        this.mUpdateCallback.onInserted(data.size(), list.size());
        onCurrentListChanged(data, null);
    }

    public void addListListener(@NotNull tge<T> listener) {
        this.mListeners.add(listener);
    }

    public final void changeData(int index, T newData, @Nullable T payload) {
        List<? extends T> data = this.adapter.getData();
        this.adapter.getData().set(index, newData);
        this.mUpdateCallback.onChanged(index, 1, payload);
        onCurrentListChanged(data, null);
    }

    public final void clearAllListListener() {
        this.mListeners.clear();
    }

    public final void remove(T t) {
        List<? extends T> data = this.adapter.getData();
        int iIndexOf = this.adapter.getData().indexOf(t);
        if (iIndexOf == -1) {
            return;
        }
        this.adapter.getData().remove(iIndexOf);
        this.mUpdateCallback.onRemoved(iIndexOf, 1);
        onCurrentListChanged(data, null);
    }

    public final void removeAt(int index) {
        List<? extends T> data = this.adapter.getData();
        this.adapter.getData().remove(index);
        this.mUpdateCallback.onRemoved(index, 1);
        onCurrentListChanged(data, null);
    }

    public final void removeListListener(@NotNull tge<T> listener) {
        this.mListeners.remove(listener);
    }

    @JvmOverloads
    public final void submitList(@Nullable List<T> list) {
        submitList$default(this, list, null, 2, null);
    }

    @JvmOverloads
    public final void submitList(@Nullable List<T> newList, @Nullable Runnable commitCallback) {
        int i = this.mMaxScheduledGeneration + 1;
        this.mMaxScheduledGeneration = i;
        if (newList == this.adapter.getData()) {
            if (commitCallback != null) {
                commitCallback.run();
                return;
            }
            return;
        }
        List<? extends T> data = this.adapter.getData();
        if (newList == null) {
            int size = this.adapter.getData().size();
            this.adapter.setData$com_github_CymChad_brvah(new ArrayList());
            this.mUpdateCallback.onRemoved(0, size);
            onCurrentListChanged(data, commitCallback);
            return;
        }
        if (!this.adapter.getData().isEmpty()) {
            this.config.getBackgroundThreadExecutor().execute(new AnonymousClass1(data, newList, i, commitCallback));
            return;
        }
        this.adapter.setData$com_github_CymChad_brvah(newList);
        this.mUpdateCallback.onInserted(0, newList.size());
        onCurrentListChanged(data, commitCallback);
    }

    public final void addData(T data) {
        List<? extends T> data2 = this.adapter.getData();
        this.adapter.getData().add(data);
        this.mUpdateCallback.onInserted(data2.size(), 1);
        onCurrentListChanged(data2, null);
    }
}
