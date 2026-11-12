package com.xiaomi.fitness.detail.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.detail.model.SportRecordShareModel;
import com.xiaomi.fitness.detail.recycler.SportShareWatermarkAdapter;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.ivi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000489:;B\u000f\u0012\u0006\u0010#\u001a\u00020\u0003¢\u0006\u0004\b7\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00052\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010\u000bR\u0014\u0010#\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010'\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u000bR\"\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010$\u001a\u0004\b0\u0010!\"\u0004\b1\u0010\u0007R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportShareWatermarkAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "selectedPos", "", "resetWholeAdapterSelected", "(I)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/xiaomi/fitness/detail/recycler/SportShareWatermarkAdapter$OnItemClickListener;", "onItemClickListener", "setOnItemClickListener", "(Lcom/xiaomi/fitness/detail/recycler/SportShareWatermarkAdapter$OnItemClickListener;)V", "", "Lcom/xiaomi/fitness/detail/model/SportRecordShareModel;", "itemList", "bindListData", "(Ljava/util/List;)V", "getItemList", "()Ljava/util/List;", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "onAttachedToRecyclerView", "editViewType", "I", "mItemList", "Ljava/util/List;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRecyclerView", "", "posVHMap", "Ljava/util/Map;", "prevSelectedPos", "getPrevSelectedPos", "setPrevSelectedPos", "", "initialState", "Z", "mOnItemClickListener", "Lcom/xiaomi/fitness/detail/recycler/SportShareWatermarkAdapter$OnItemClickListener;", "<init>", "Companion", "OnItemClickListener", "PatternStyleItemViewHolder", "PatternDrawableItemViewHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportShareWatermarkAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "PatternStyleAdapter";
    public static final int viewTypeLongImage = 1;
    public static final int viewTypeNormalImage = 2;
    public static final int viewTypeString = 3;
    private final int editViewType;

    @Nullable
    private OnItemClickListener mOnItemClickListener;
    public RecyclerView mRecyclerView;
    private int prevSelectedPos;

    @NotNull
    private List<SportRecordShareModel> mItemList = new ArrayList();

    @NotNull
    private Map<Integer, RecyclerView.d0> posVHMap = new LinkedHashMap();
    private boolean initialState = true;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportShareWatermarkAdapter$OnItemClickListener;", "", "onItemClick", "", "styleItem", "Lcom/xiaomi/fitness/detail/model/SportRecordShareModel;", "position", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onItemClick(@NotNull SportRecordShareModel styleItem, int position);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportShareWatermarkAdapter$PatternDrawableItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/detail/model/SportRecordShareModel;", "styleItem", "", "position", "", "bindItem", "(Lcom/xiaomi/fitness/detail/model/SportRecordShareModel;I)V", "", "selected", "setSelected", "(Z)V", "Landroid/widget/ImageView;", "styleIconIv", "Landroid/widget/ImageView;", "Landroid/view/View;", "editDrawableItem", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/detail/recycler/SportShareWatermarkAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class PatternDrawableItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final View editDrawableItem;

        @NotNull
        private final ImageView styleIconIv;
        final /* synthetic */ SportShareWatermarkAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PatternDrawableItemViewHolder(@NotNull SportShareWatermarkAdapter sportShareWatermarkAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sportShareWatermarkAdapter;
            View viewFindViewById = itemView.findViewById(bsi.L1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.styleIconIv = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(bsi.T1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.editDrawableItem = viewFindViewById2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindItem$lambda$0(SportShareWatermarkAdapter this$0, SportRecordShareModel styleItem, int i, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(styleItem, "$styleItem");
            OnItemClickListener onItemClickListener = this$0.mOnItemClickListener;
            Intrinsics.checkNotNull(onItemClickListener);
            onItemClickListener.onItemClick(styleItem, i);
        }

        public final void bindItem(@NotNull final SportRecordShareModel styleItem, final int position) {
            Intrinsics.checkNotNullParameter(styleItem, "styleItem");
            if (styleItem.getDrawableID() != null) {
                this.styleIconIv.setImageDrawable(AppUtil.getApp().getDrawable(styleItem.getDrawableID().intValue()));
            }
            setSelected(styleItem.isSelect());
            ImageView imageView = this.styleIconIv;
            final SportShareWatermarkAdapter sportShareWatermarkAdapter = this.this$0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: b1o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportShareWatermarkAdapter.PatternDrawableItemViewHolder.bindItem$lambda$0(sportShareWatermarkAdapter, styleItem, position, view);
                }
            });
        }

        public final void setSelected(boolean selected) {
            if (selected) {
                this.editDrawableItem.setBackground(AppUtil.getApp().getDrawable(hoi.j0));
            } else {
                this.editDrawableItem.setBackground(AppUtil.getApp().getDrawable(hoi.i0));
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportShareWatermarkAdapter$PatternStyleItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/detail/model/SportRecordShareModel;", "styleItem", "", "position", "", "bindItem", "(Lcom/xiaomi/fitness/detail/model/SportRecordShareModel;I)V", "", "selected", "setSelected", "(Z)V", "Landroid/widget/TextView;", "styleIconIv", "Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/detail/recycler/SportShareWatermarkAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class PatternStyleItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView styleIconIv;
        final /* synthetic */ SportShareWatermarkAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PatternStyleItemViewHolder(@NotNull SportShareWatermarkAdapter sportShareWatermarkAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sportShareWatermarkAdapter;
            View viewFindViewById = itemView.findViewById(bsi.w3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.styleIconIv = (TextView) viewFindViewById;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindItem$lambda$0(SportShareWatermarkAdapter this$0, SportRecordShareModel styleItem, int i, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(styleItem, "$styleItem");
            OnItemClickListener onItemClickListener = this$0.mOnItemClickListener;
            Intrinsics.checkNotNull(onItemClickListener);
            onItemClickListener.onItemClick(styleItem, i);
        }

        public final void bindItem(@NotNull final SportRecordShareModel styleItem, final int position) {
            Intrinsics.checkNotNullParameter(styleItem, "styleItem");
            this.styleIconIv.setText(styleItem.getEditString());
            setSelected(styleItem.isSelect());
            TextView textView = this.styleIconIv;
            final SportShareWatermarkAdapter sportShareWatermarkAdapter = this.this$0;
            textView.setOnClickListener(new View.OnClickListener() { // from class: c1o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportShareWatermarkAdapter.PatternStyleItemViewHolder.bindItem$lambda$0(sportShareWatermarkAdapter, styleItem, position, view);
                }
            });
        }

        public final void setSelected(boolean selected) {
            if (selected) {
                this.styleIconIv.setBackground(AppUtil.getApp().getDrawable(hoi.h0));
            } else {
                this.styleIconIv.setBackground(AppUtil.getApp().getDrawable(hoi.g0));
            }
        }
    }

    public SportShareWatermarkAdapter(int i) {
        this.editViewType = i;
    }

    private final void resetWholeAdapterSelected(int selectedPos) {
        RecyclerView.d0 d0Var = this.posVHMap.get(Integer.valueOf(this.prevSelectedPos));
        RecyclerView.d0 d0Var2 = this.posVHMap.get(Integer.valueOf(selectedPos));
        if ((d0Var instanceof PatternStyleItemViewHolder) && (d0Var2 instanceof PatternStyleItemViewHolder)) {
            ((PatternStyleItemViewHolder) d0Var).setSelected(false);
            ((PatternStyleItemViewHolder) d0Var2).setSelected(true);
            this.prevSelectedPos = selectedPos;
        }
        if ((d0Var instanceof PatternDrawableItemViewHolder) && (d0Var2 instanceof PatternDrawableItemViewHolder)) {
            ((PatternDrawableItemViewHolder) d0Var).setSelected(false);
            ((PatternDrawableItemViewHolder) d0Var2).setSelected(true);
            this.prevSelectedPos = selectedPos;
        }
    }

    public final void bindListData(@Nullable List<SportRecordShareModel> itemList) {
        List<SportRecordShareModel> list = itemList;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.mItemList = itemList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.mItemList.isEmpty()) {
            return 0;
        }
        return this.mItemList.size();
    }

    @NotNull
    public final List<SportRecordShareModel> getItemList() {
        return this.mItemList;
    }

    @NotNull
    public final RecyclerView getMRecyclerView() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        return null;
    }

    public final int getPrevSelectedPos() {
        return this.prevSelectedPos;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        setMRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (!(holder instanceof PatternStyleItemViewHolder)) {
            if (holder instanceof PatternDrawableItemViewHolder) {
                ((PatternDrawableItemViewHolder) holder).bindItem(this.mItemList.get(position), position);
                return;
            }
            return;
        }
        holder.setIsRecyclable(false);
        this.posVHMap.put(Integer.valueOf(position), holder);
        ((PatternStyleItemViewHolder) holder).bindItem(this.mItemList.get(position), position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i = this.editViewType;
        if (i == 1) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(ivi.r2, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new PatternDrawableItemViewHolder(this, viewInflate);
        }
        if (i == 2) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(ivi.t2, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
            return new PatternDrawableItemViewHolder(this, viewInflate2);
        }
        if (i != 3) {
            View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(ivi.s2, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate3, "inflate(...)");
            return new PatternStyleItemViewHolder(this, viewInflate3);
        }
        View viewInflate4 = LayoutInflater.from(parent.getContext()).inflate(ivi.s2, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate4, "inflate(...)");
        return new PatternStyleItemViewHolder(this, viewInflate4);
    }

    public final void setMRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.mRecyclerView = recyclerView;
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener onItemClickListener) {
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.mOnItemClickListener = onItemClickListener;
    }

    public final void setPrevSelectedPos(int i) {
        this.prevSelectedPos = i;
    }

    public final void setRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        setMRecyclerView(recyclerView);
    }
}
