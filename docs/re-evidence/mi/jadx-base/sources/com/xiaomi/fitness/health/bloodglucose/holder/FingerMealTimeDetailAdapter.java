package com.xiaomi.fitness.health.bloodglucose.holder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.bloodglucose.HealthSegmentView;
import com.xiaomi.fitness.health.bloodglucose.util.BloodGlucoseDataUtil;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002,-B\u001d\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b*\u0010+J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00058\u0006X\u0086D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u001c\u001a\u00020\u00058\u0006X\u0086D¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u001e\u001a\u00020\u00058\u0006X\u0086D¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\nR\u001a\u0010 \u001a\u00020\u00058\u0006X\u0086D¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\nR\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0014\u0010#\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001f\u0010&\u001a\n %*\u0004\u0018\u00010$0$8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/holder/FingerMealTimeDetailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "", "Lcom/xiaomi/fitness/health/bloodglucose/util/BloodGlucoseDataUtil$FingerMealTimeRecycleModel;", "mDataList", "Ljava/util/List;", "ITEM_TYPE_BOTTOM", "I", "getITEM_TYPE_BOTTOM", "ITEM_TYPE_HEADER", "getITEM_TYPE_HEADER", "TYPE_CONTENT", "getTYPE_CONTENT", "TYPE_CONTENT_SUMMARY", "getTYPE_CONTENT_SUMMARY", "mHeaderCount", "mBottomCount", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "mInflater", "Landroid/view/LayoutInflater;", "getMInflater", "()Landroid/view/LayoutInflater;", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "HeaderViewHolder", "ContentViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FingerMealTimeDetailAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    private final int ITEM_TYPE_BOTTOM;
    private final int ITEM_TYPE_HEADER;
    private final int TYPE_CONTENT;
    private final int TYPE_CONTENT_SUMMARY;
    private final int mBottomCount;

    @NotNull
    private final Context mContext;

    @NotNull
    private final List<BloodGlucoseDataUtil.FingerMealTimeRecycleModel> mDataList;
    private final int mHeaderCount;
    private final LayoutInflater mInflater;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/holder/FingerMealTimeDetailAdapter$ContentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/bloodglucose/util/BloodGlucoseDataUtil$FingerMealTimeRecycleModel;", "model", "", "bindData", "(Lcom/xiaomi/fitness/health/bloodglucose/util/BloodGlucoseDataUtil$FingerMealTimeRecycleModel;)V", "Landroid/view/View;", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "setContentView", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "txtDistance", "Landroid/widget/TextView;", "getTxtDistance", "()Landroid/widget/TextView;", "setTxtDistance", "(Landroid/widget/TextView;)V", "Lcom/xiaomi/fitness/health/bloodglucose/HealthSegmentView;", "paceSegmentView", "Lcom/xiaomi/fitness/health/bloodglucose/HealthSegmentView;", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class ContentViewHolder extends RecyclerView.d0 {

        @NotNull
        private View contentView;

        @NotNull
        private HealthSegmentView<BloodGlucoseDataUtil.FingerMealTimeRecycleModel> paceSegmentView;

        @NotNull
        private TextView txtDistance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContentViewHolder(@NotNull View contentView) {
            super(contentView);
            Intrinsics.checkNotNullParameter(contentView, "contentView");
            this.contentView = contentView;
            View viewFindViewById = this.itemView.findViewById(eri.Ji);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.txtDistance = (TextView) viewFindViewById;
            View viewFindViewById2 = this.itemView.findViewById(eri.tc);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.paceSegmentView = (HealthSegmentView) viewFindViewById2;
        }

        public final void bindData(@NotNull BloodGlucoseDataUtil.FingerMealTimeRecycleModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            this.txtDistance.setText(model.getTypeTitleText());
            this.paceSegmentView.setModel(model);
        }

        @NotNull
        public final View getContentView() {
            return this.contentView;
        }

        @NotNull
        public final TextView getTxtDistance() {
            return this.txtDistance;
        }

        public final void setContentView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.contentView = view;
        }

        public final void setTxtDistance(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.txtDistance = textView;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/holder/FingerMealTimeDetailAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "bindData", "()V", "Landroid/widget/TextView;", "txtUnit", "Landroid/widget/TextView;", "txtMealTitle", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "Landroid/view/View;", "itemView", "context", "<init>", "(Landroid/view/View;Landroid/content/Context;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class HeaderViewHolder extends RecyclerView.d0 {

        @NotNull
        private final Context mContext;

        @NotNull
        private TextView txtMealTitle;

        @NotNull
        private TextView txtUnit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderViewHolder(@NotNull View itemView, @NotNull Context context) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            Intrinsics.checkNotNullParameter(context, "context");
            this.txtUnit = (TextView) itemView.findViewById(eri.fo);
            this.txtMealTitle = (TextView) itemView.findViewById(eri.Qn);
            this.mContext = context;
        }

        public final void bindData() {
            this.txtUnit.setText(this.mContext.getString(c0j.v0));
            this.txtMealTitle.setText(this.mContext.getString(c0j.u0));
        }

        @NotNull
        public final Context getMContext() {
            return this.mContext;
        }
    }

    public FingerMealTimeDetailAdapter(@NotNull Context mContext, @NotNull List<BloodGlucoseDataUtil.FingerMealTimeRecycleModel> mDataList) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mDataList, "mDataList");
        this.mContext = mContext;
        this.mDataList = mDataList;
        this.ITEM_TYPE_BOTTOM = -1;
        this.ITEM_TYPE_HEADER = -2;
        this.TYPE_CONTENT_SUMMARY = 1;
        this.mHeaderCount = 1;
        this.mInflater = LayoutInflater.from(mContext);
    }

    public final int getITEM_TYPE_BOTTOM() {
        return this.ITEM_TYPE_BOTTOM;
    }

    public final int getITEM_TYPE_HEADER() {
        return this.ITEM_TYPE_HEADER;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDataList.size() + this.mHeaderCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        int i = this.mHeaderCount;
        return (i == 0 || position >= i) ? this.TYPE_CONTENT : this.ITEM_TYPE_HEADER;
    }

    public final LayoutInflater getMInflater() {
        return this.mInflater;
    }

    public final int getTYPE_CONTENT() {
        return this.TYPE_CONTENT;
    }

    public final int getTYPE_CONTENT_SUMMARY() {
        return this.TYPE_CONTENT_SUMMARY;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof HeaderViewHolder) {
            ((HeaderViewHolder) holder).bindData();
        } else if (holder instanceof ContentViewHolder) {
            ((ContentViewHolder) holder).bindData(this.mDataList.get(position - this.mHeaderCount));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == this.ITEM_TYPE_HEADER) {
            View viewInflate = this.mInflater.inflate(jui.d7, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new HeaderViewHolder(viewInflate, this.mContext);
        }
        View viewInflate2 = this.mInflater.inflate(jui.c7, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new ContentViewHolder(viewInflate2);
    }
}
