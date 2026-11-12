package com.xiaomi.fitness.detail.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.detail.recycler.SportDetailAdapter;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.q3b;
import defpackage.rz5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 &2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002'&B\u001d\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b \u0010!B'\b\u0016\u0012\u0006\u0010\"\u001a\u00020\u0013\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u0003¢\u0006\u0004\b \u0010$B/\b\u0016\u0012\u0006\u0010\"\u001a\u00020\u0013\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b \u0010%J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u00052\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportDetailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/detail/recycler/SportDetailAdapter$ContentViewHolder;", "", "itemPosition", "", "setItemPosition", "(I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/detail/recycler/SportDetailAdapter$ContentViewHolder;", "contentViewHolder", "position", "onBindViewHolder", "(Lcom/xiaomi/fitness/detail/recycler/SportDetailAdapter$ContentViewHolder;I)V", "getItemCount", "()I", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "", "Lrz5;", "mDataList", "Ljava/util/List;", "Landroid/view/LayoutInflater;", "mLayoutInflater", "Landroid/view/LayoutInflater;", "layoutResourceId", "I", "spanCount", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "context", "dataList", "(Landroid/content/Context;Ljava/util/List;I)V", "(Landroid/content/Context;Ljava/util/List;II)V", "Companion", "ContentViewHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailAdapter extends RecyclerView.Adapter<ContentViewHolder> {
    public static final int POSITION_AUTO = 0;
    public static final int POSITION_CENTER = -1;
    public static final int POSITION_END = 2;
    public static final int POSITION_START = 1;
    private int itemPosition;
    private int layoutResourceId;

    @NotNull
    private final Context mContext;

    @NotNull
    private final List<rz5> mDataList;

    @NotNull
    private final LayoutInflater mLayoutInflater;
    private int spanCount;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\u0006J#\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportDetailAdapter$ContentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lrz5;", "model", "", "bindData", "(Lrz5;)V", "", "position", "(Lrz5;I)V", "bindDataStart", "bindDataEnd", "icon", "setModelClickListener", "(Lrz5;Ljava/lang/Integer;)V", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "detailItemView", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "getDetailItemView", "()Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "setDetailItemView", "(Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;)V", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/detail/recycler/SportDetailAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ContentViewHolder extends RecyclerView.d0 {

        @NotNull
        private SportDetailItemView detailItemView;
        final /* synthetic */ SportDetailAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContentViewHolder(@NotNull SportDetailAdapter sportDetailAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sportDetailAdapter;
            this.detailItemView = (SportDetailItemView) itemView.findViewById(bsi.j1);
        }

        public static /* synthetic */ void setModelClickListener$default(ContentViewHolder contentViewHolder, rz5 rz5Var, Integer num, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            contentViewHolder.setModelClickListener(rz5Var, num);
        }

        public final void bindData(@Nullable rz5 model) {
            SportDetailItemView.bindData$default(this.detailItemView, model, false, 2, null);
        }

        public final void bindDataEnd(@Nullable rz5 model) {
            SportDetailItemView.bindData$default(this.detailItemView, model, 2, true, false, 8, null);
        }

        public final void bindDataStart(@Nullable rz5 model) {
            SportDetailItemView.bindData$default(this.detailItemView, model, 1, true, false, 8, null);
        }

        @NotNull
        public final SportDetailItemView getDetailItemView() {
            return this.detailItemView;
        }

        public final void setDetailItemView(@NotNull SportDetailItemView sportDetailItemView) {
            Intrinsics.checkNotNullParameter(sportDetailItemView, "<set-?>");
            this.detailItemView = sportDetailItemView;
        }

        public final void setModelClickListener(@Nullable rz5 model, @Nullable Integer icon) {
            this.detailItemView.setTypeClickListener(model, icon);
        }

        public final void bindData(@Nullable rz5 model, int position) {
            SportDetailItemView.bindData$default(this.detailItemView, model, q3b.a(this.this$0.spanCount, position), true, false, 8, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SportDetailAdapter(@NotNull Context mContext, @NotNull List<? extends rz5> mDataList) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mDataList, "mDataList");
        this.mContext = mContext;
        this.mDataList = mDataList;
        this.layoutResourceId = -1;
        this.itemPosition = -1;
        this.spanCount = 3;
        this.mLayoutInflater = LayoutInflater.from(mContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(rz5 model, View view) {
        Intrinsics.checkNotNullParameter(model, "$model");
        Logger.d("SportDetailAdapter ", "OnClickListener");
        AnyExtKt.main$default(null, new SportDetailAdapter$onBindViewHolder$1$1(model, null), 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mDataList.size();
    }

    public final void setItemPosition(int itemPosition) {
        this.itemPosition = itemPosition;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ContentViewHolder contentViewHolder, int position) {
        Intrinsics.checkNotNullParameter(contentViewHolder, "contentViewHolder");
        final rz5 rz5Var = this.mDataList.get(position);
        int i = this.itemPosition;
        if (i == 0) {
            contentViewHolder.bindData(rz5Var, position);
        } else if (i == 1) {
            contentViewHolder.bindDataStart(rz5Var);
        } else if (i == 2) {
            contentViewHolder.bindDataEnd(rz5Var);
        } else {
            contentViewHolder.bindData(rz5Var);
        }
        String str = rz5Var.h;
        if (str != null && str.length() != 0) {
            rz5Var.j = new View.OnClickListener() { // from class: een
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportDetailAdapter.onBindViewHolder$lambda$0(rz5Var, view);
                }
            };
            contentViewHolder.setModelClickListener(rz5Var, Integer.valueOf(hoi.K0));
        } else if (rz5Var.i.booleanValue()) {
            ContentViewHolder.setModelClickListener$default(contentViewHolder, rz5Var, null, 2, null);
        } else {
            ContentViewHolder.setModelClickListener$default(contentViewHolder, null, null, 2, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ContentViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i = this.layoutResourceId;
        if (i == -1) {
            i = ivi.N1;
        }
        View viewInflate = this.mLayoutInflater.inflate(i, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new ContentViewHolder(this, viewInflate);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportDetailAdapter(@NotNull Context context, @NotNull List<? extends rz5> dataList, int i) {
        this(context, dataList);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.layoutResourceId = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportDetailAdapter(@NotNull Context context, @NotNull List<? extends rz5> dataList, int i, int i2) {
        this(context, dataList);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.layoutResourceId = i;
        this.spanCount = i2;
    }
}
