package com.xiaomi.fitness.common.recycer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import defpackage.eri;
import defpackage.jui;
import defpackage.q3b;
import defpackage.rz5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001(B\u001d\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\"\u0010#B'\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0014\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\"\u0010&B/\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0014\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u001e\u001a\u00020\n\u0012\u0006\u0010!\u001a\u00020\n¢\u0006\u0004\b\"\u0010'J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00020\u00052\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/common/recycer/adapter/DataDetailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/common/recycer/adapter/DataDetailAdapter$ContentViewHolder;", "", "flagItemLayoutParams", "", "setFlagItemLayoutParams", "(Z)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/common/recycer/adapter/DataDetailAdapter$ContentViewHolder;", "contentViewHolder", "position", "onBindViewHolder", "(Lcom/xiaomi/fitness/common/recycer/adapter/DataDetailAdapter$ContentViewHolder;I)V", "getItemCount", "()I", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "", "Lrz5;", "mDataList", "Ljava/util/List;", "Landroid/view/LayoutInflater;", "mLayoutInflater", "Landroid/view/LayoutInflater;", "layoutResourceId", "I", "Z", "spanCount", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "context", "dataList", "(Landroid/content/Context;Ljava/util/List;I)V", "(Landroid/content/Context;Ljava/util/List;II)V", "ContentViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DataDetailAdapter extends RecyclerView.Adapter<ContentViewHolder> {
    private boolean flagItemLayoutParams;
    private int layoutResourceId;

    @NotNull
    private final Context mContext;

    @NotNull
    private final List<rz5> mDataList;

    @NotNull
    private final LayoutInflater mLayoutInflater;
    private int spanCount;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/common/recycer/adapter/DataDetailAdapter$ContentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lrz5;", "model", "", "bindData", "(Lrz5;)V", "", "position", "(Lrz5;I)V", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "detailItemView", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "getDetailItemView", "()Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "setDetailItemView", "(Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;)V", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/common/recycer/adapter/DataDetailAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ContentViewHolder extends RecyclerView.d0 {

        @NotNull
        private SportDetailItemView detailItemView;
        final /* synthetic */ DataDetailAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContentViewHolder(@NotNull DataDetailAdapter dataDetailAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = dataDetailAdapter;
            this.detailItemView = (SportDetailItemView) itemView.findViewById(eri.p3);
        }

        public final void bindData(@Nullable rz5 model) {
            SportDetailItemView.bindData$default(this.detailItemView, model, false, 2, null);
        }

        @NotNull
        public final SportDetailItemView getDetailItemView() {
            return this.detailItemView;
        }

        public final void setDetailItemView(@NotNull SportDetailItemView sportDetailItemView) {
            Intrinsics.checkNotNullParameter(sportDetailItemView, "<set-?>");
            this.detailItemView = sportDetailItemView;
        }

        public final void bindData(@Nullable rz5 model, int position) {
            SportDetailItemView.bindData$default(this.detailItemView, model, q3b.a(this.this$0.spanCount, position), false, false, 12, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DataDetailAdapter(@NotNull Context mContext, @NotNull List<? extends rz5> mDataList) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mDataList, "mDataList");
        this.mContext = mContext;
        this.mDataList = mDataList;
        this.layoutResourceId = -1;
        this.spanCount = 3;
        this.mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDataList.size();
    }

    public final void setFlagItemLayoutParams(boolean flagItemLayoutParams) {
        this.flagItemLayoutParams = flagItemLayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ContentViewHolder contentViewHolder, int position) {
        Intrinsics.checkNotNullParameter(contentViewHolder, "contentViewHolder");
        rz5 rz5Var = this.mDataList.get(position);
        if (this.flagItemLayoutParams) {
            contentViewHolder.bindData(rz5Var, position);
        } else {
            contentViewHolder.bindData(rz5Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ContentViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i = this.layoutResourceId;
        if (i == -1) {
            i = jui.z6;
        }
        View viewInflate = this.mLayoutInflater.inflate(i, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new ContentViewHolder(this, viewInflate);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DataDetailAdapter(@NotNull Context context, @NotNull List<? extends rz5> dataList, int i) {
        this(context, dataList);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.layoutResourceId = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DataDetailAdapter(@NotNull Context context, @NotNull List<? extends rz5> dataList, int i, int i2) {
        this(context, dataList);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.layoutResourceId = i;
        this.spanCount = i2;
    }
}
