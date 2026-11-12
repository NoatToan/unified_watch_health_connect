package com.xiaomi.fitness.share.report.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.report.adapter.BottomWindowAdapter;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.ivi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003()*B\u0017\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b&\u0010'J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/share/report/adapter/BottomWindowAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/share/report/adapter/BottomWindowAdapter$OnItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnItemClickListener", "(Lcom/xiaomi/fitness/share/report/adapter/BottomWindowAdapter$OnItemClickListener;)V", "Landroidx/lifecycle/MutableLiveData;", "", "liveData", "setSquarePatternSelectedPosition", "(Landroidx/lifecycle/MutableLiveData;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "", "indicatorResList", "Ljava/util/List;", "mOnItemClickListener", "Lcom/xiaomi/fitness/share/report/adapter/BottomWindowAdapter$OnItemClickListener;", "mSquarePatternSelectedPosition", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportReport", "<init>", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "OnItemClickListener", "ItemViewHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BottomWindowAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "WhiteBottomIndicatorAdapter";

    @NotNull
    private final List<Integer> indicatorResList;

    @NotNull
    private final LifecycleOwner lifecycleOwner;

    @Nullable
    private OnItemClickListener mOnItemClickListener;

    @NotNull
    private MutableLiveData<Integer> mSquarePatternSelectedPosition;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0000R\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/share/report/adapter/BottomWindowAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "Lcom/xiaomi/fitness/share/report/adapter/BottomWindowAdapter;", "holder", "", "bindData", "(ILcom/xiaomi/fitness/share/report/adapter/BottomWindowAdapter$ItemViewHolder;)V", "Landroid/widget/ImageView;", "indicatorIv", "Landroid/widget/ImageView;", "pressedFrame", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/share/report/adapter/BottomWindowAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView indicatorIv;

        @NotNull
        private final ImageView pressedFrame;
        final /* synthetic */ BottomWindowAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(@NotNull BottomWindowAdapter bottomWindowAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = bottomWindowAdapter;
            View viewFindViewById = itemView.findViewById(bsi.R2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.indicatorIv = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(bsi.Y4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.pressedFrame = (ImageView) viewFindViewById2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$0(BottomWindowAdapter this$0, int i, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            OnItemClickListener onItemClickListener = this$0.mOnItemClickListener;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(i);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$1(int i, ItemViewHolder holder, Integer num) {
            Intrinsics.checkNotNullParameter(holder, "$holder");
            if (num != null && i == num.intValue()) {
                ViewExtKt.visible(holder.pressedFrame);
            } else {
                ViewExtKt.invisible(holder.pressedFrame);
            }
            return Unit.INSTANCE;
        }

        public final void bindData(final int position, @NotNull final ItemViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            this.indicatorIv.setImageResource(((Number) this.this$0.indicatorResList.get(position)).intValue());
            View view = this.itemView;
            final BottomWindowAdapter bottomWindowAdapter = this.this$0;
            ViewExtKt.clickWithTrigger$default(view, 0L, new Function1() { // from class: z43
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BottomWindowAdapter.ItemViewHolder.bindData$lambda$0(bottomWindowAdapter, position, (View) obj);
                }
            }, 1, null);
            this.this$0.mSquarePatternSelectedPosition.observe(this.this$0.getLifecycleOwner(), new BottomWindowAdapter$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: a53
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BottomWindowAdapter.ItemViewHolder.bindData$lambda$1(position, holder, (Integer) obj);
                }
            }));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/share/report/adapter/BottomWindowAdapter$OnItemClickListener;", "", "onItemClick", "", "position", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public BottomWindowAdapter(@NotNull SportBasicReport sportReport, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.lifecycleOwner = lifecycleOwner;
        this.indicatorResList = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(hoi.B1), Integer.valueOf(hoi.A1)});
        this.mSquarePatternSelectedPosition = new MutableLiveData<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return 2;
    }

    @NotNull
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setIsRecyclable(false);
        if (holder instanceof ItemViewHolder) {
            ItemViewHolder itemViewHolder = (ItemViewHolder) holder;
            itemViewHolder.bindData(position, itemViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(ivi.V1, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new ItemViewHolder(this, viewInflate);
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mOnItemClickListener = listener;
    }

    public final void setSquarePatternSelectedPosition(@NotNull MutableLiveData<Integer> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        this.mSquarePatternSelectedPosition = liveData;
    }
}
