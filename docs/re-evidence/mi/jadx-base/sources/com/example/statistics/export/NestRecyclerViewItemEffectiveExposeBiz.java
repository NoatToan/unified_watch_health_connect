package com.example.statistics.export;

import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.NestRecyclerViewItemEffectiveExposeBiz;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 !2\u00020\u0001:\u0003\u001f !B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00102\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0016J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eJ0\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00052\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0016H\u0002J&\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\b2\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0016J0\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\b2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0018\u00010\nR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0018\u00010\fR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;", "", "<init>", "()V", "firstDataVisible", "", "trackedRecord", "", "", "onScrollListener", "Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz$ExposeScrollListener;", "dataObserver", "Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz$DataObserverListener;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "mParentBottomHeight", "", "startTrackItemExpose", "", "recyclerView", "parentBottomHeight", "itemExposeListener", "Lkotlin/Function1;", "Lcom/example/statistics/export/TrackContent;", "endTrackItemExpose", "updateAdapterObserver", LoginPreferenceConfig.TYPE_REGISTER, "trackOnDataChange", "reason", "effectiveExposeTrack", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "ExposeScrollListener", "DataObserverListener", "Companion", "statistics-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NestRecyclerViewItemEffectiveExposeBiz {

    @NotNull
    public static final String TAG = "NestEffectiveExpose";

    @Nullable
    private DataObserverListener dataObserver;
    private boolean firstDataVisible;
    private int mParentBottomHeight;

    @Nullable
    private RecyclerView mRecyclerView;

    @Nullable
    private ExposeScrollListener onScrollListener;

    @NotNull
    private Set<String> trackedRecord = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: private */
    public final void effectiveExposeTrack(RecyclerView recyclerView, String reason, Function1<? super TrackContent, Unit> listener) {
        Logger.i(TAG, "effectiveExposeTrack.. " + reason);
        if (recyclerView.getVisibility() == 0 && recyclerView.isShown()) {
            try {
                EffectiveExposeExtKt.trackViewExposeIfNeed(recyclerView, this.trackedRecord, this.mParentBottomHeight, listener);
            } catch (Exception e) {
                Logger.e(TAG, "effectiveExposeTrack exception " + e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void effectiveExposeTrack$default(NestRecyclerViewItemEffectiveExposeBiz nestRecyclerViewItemEffectiveExposeBiz, RecyclerView recyclerView, String str, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        nestRecyclerViewItemEffectiveExposeBiz.effectiveExposeTrack(recyclerView, str, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startTrackItemExpose$default(NestRecyclerViewItemEffectiveExposeBiz nestRecyclerViewItemEffectiveExposeBiz, RecyclerView recyclerView, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        nestRecyclerViewItemEffectiveExposeBiz.startTrackItemExpose(recyclerView, i, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackOnDataChange$default(NestRecyclerViewItemEffectiveExposeBiz nestRecyclerViewItemEffectiveExposeBiz, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        nestRecyclerViewItemEffectiveExposeBiz.trackOnDataChange(str, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trackOnDataChange$lambda$2(NestRecyclerViewItemEffectiveExposeBiz this$0, String reason, Function1 function1) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reason, "$reason");
        RecyclerView recyclerView = this$0.mRecyclerView;
        if (recyclerView != null) {
            this$0.effectiveExposeTrack(recyclerView, reason, function1);
        }
    }

    private final void updateAdapterObserver(RecyclerView recyclerView, boolean register, Function1<? super TrackContent, Unit> itemExposeListener) {
        try {
            if (register) {
                this.dataObserver = new DataObserverListener(itemExposeListener);
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    DataObserverListener dataObserverListener = this.dataObserver;
                    Intrinsics.checkNotNull(dataObserverListener);
                    adapter.registerAdapterDataObserver(dataObserverListener);
                }
            } else {
                RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                if (adapter2 != null) {
                    DataObserverListener dataObserverListener2 = this.dataObserver;
                    Intrinsics.checkNotNull(dataObserverListener2);
                    adapter2.unregisterAdapterDataObserver(dataObserverListener2);
                }
            }
        } catch (Exception e) {
            Logger.e(TAG, "updateAdapterObserver exception " + e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAdapterObserver$default(NestRecyclerViewItemEffectiveExposeBiz nestRecyclerViewItemEffectiveExposeBiz, RecyclerView recyclerView, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        nestRecyclerViewItemEffectiveExposeBiz.updateAdapterObserver(recyclerView, z, function1);
    }

    public final void endTrackItemExpose(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Logger.i(TAG, "endTrackItemExpose");
        this.firstDataVisible = false;
        this.trackedRecord.clear();
        ExposeScrollListener exposeScrollListener = this.onScrollListener;
        if (exposeScrollListener != null) {
            recyclerView.removeOnScrollListener(exposeScrollListener);
        }
        updateAdapterObserver$default(this, recyclerView, false, null, 4, null);
    }

    public final void startTrackItemExpose(@NotNull RecyclerView recyclerView, int parentBottomHeight, @Nullable Function1<? super TrackContent, Unit> itemExposeListener) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Logger.i(TAG, "startTrackItemExpose");
        this.mRecyclerView = recyclerView;
        this.mParentBottomHeight = parentBottomHeight;
        endTrackItemExpose(recyclerView);
        ExposeScrollListener exposeScrollListener = new ExposeScrollListener(itemExposeListener);
        this.onScrollListener = exposeScrollListener;
        Intrinsics.checkNotNull(exposeScrollListener);
        recyclerView.addOnScrollListener(exposeScrollListener);
        updateAdapterObserver(recyclerView, true, itemExposeListener);
    }

    public final void trackOnDataChange(@NotNull final String reason, @Nullable final Function1<? super TrackContent, Unit> itemExposeListener) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.postDelayed(new Runnable() { // from class: wig
                @Override // java.lang.Runnable
                public final void run() {
                    NestRecyclerViewItemEffectiveExposeBiz.trackOnDataChange$lambda$2(this.f38006a, reason, itemExposeListener);
                }
            }, 1000L);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz$DataObserverListener;", "Landroidx/recyclerview/widget/RecyclerView$i;", "", "onChanged", "()V", "", "positionStart", "itemCount", "onItemRangeInserted", "(II)V", "Lkotlin/Function1;", "Lcom/example/statistics/export/TrackContent;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/jvm/functions/Function1;", "<init>", "(Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;Lkotlin/jvm/functions/Function1;)V", "statistics-export_release"}, k = 1, mv = {2, 0, 0})
    public final class DataObserverListener extends RecyclerView.i {

        @Nullable
        private final Function1<TrackContent, Unit> listener;

        /* JADX WARN: Multi-variable type inference failed */
        public DataObserverListener(Function1<? super TrackContent, Unit> function1) {
            this.listener = function1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            super.onChanged();
            NestRecyclerViewItemEffectiveExposeBiz.this.trackOnDataChange("dataObserver onChanged", this.listener);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeInserted(int positionStart, int itemCount) {
            super.onItemRangeInserted(positionStart, itemCount);
            NestRecyclerViewItemEffectiveExposeBiz.this.trackOnDataChange("onItemRangeInserted " + positionStart + " " + itemCount, this.listener);
        }

        public /* synthetic */ DataObserverListener(NestRecyclerViewItemEffectiveExposeBiz nestRecyclerViewItemEffectiveExposeBiz, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : function1);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz$ExposeScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$s;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "Lkotlin/Function1;", "Lcom/example/statistics/export/TrackContent;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/jvm/functions/Function1;", "<init>", "(Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;Lkotlin/jvm/functions/Function1;)V", "statistics-export_release"}, k = 1, mv = {2, 0, 0})
    public final class ExposeScrollListener extends RecyclerView.s {

        @Nullable
        private final Function1<TrackContent, Unit> listener;

        /* JADX WARN: Multi-variable type inference failed */
        public ExposeScrollListener(Function1<? super TrackContent, Unit> function1) {
            this.listener = function1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                NestRecyclerViewItemEffectiveExposeBiz.this.effectiveExposeTrack(recyclerView, "onScrollStateChanged", this.listener);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, dx, dy);
            if (!NestRecyclerViewItemEffectiveExposeBiz.this.firstDataVisible) {
                NestRecyclerViewItemEffectiveExposeBiz.this.firstDataVisible = true;
                return;
            }
            NestRecyclerViewItemEffectiveExposeBiz.this.effectiveExposeTrack(recyclerView, "onScrolled " + dx + " " + dy, this.listener);
        }

        public /* synthetic */ ExposeScrollListener(NestRecyclerViewItemEffectiveExposeBiz nestRecyclerViewItemEffectiveExposeBiz, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : function1);
        }
    }
}
