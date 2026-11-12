package com.xiaomi.fitness.common.recycer.expandable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.ayb;
import defpackage.iji;
import defpackage.pni;
import defpackage.yxb;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\b&\u0018\u0000 3*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u00043456B\u0007¢\u0006\u0004\b1\u00102J-\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0001H&¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0015H\u0016¢\u0006\u0004\b(\u0010)R.\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\u000eR\u0018\u0010/\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter;", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableItem;", "list", "", "notifyImmediately", "", "setData", "(Ljava/util/List;Z)V", "addData", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter$OnItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter$OnItemClickListener;)V", "getListener", "()Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter$OnItemClickListener;", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "onCreateHeaderViewHolder", "onCreateDataViewHolder", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter$CommonDataViewHolder;", "viewHolder", "data", "onBindCommonDataViewHolder", "(Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter$CommonDataViewHolder;Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;)V", "getItemCount", "()I", "dataList", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "setDataList", "onItemClickListener", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter$OnItemClickListener;", "<init>", "()V", "Companion", "CommonExpandableHeaderViewHolder", "CommonDataViewHolder", "OnItemClickListener", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class BaseExpandableAdapter<T extends ExpandableBaseDataItem> extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int VIEW_TYPE_DATA = 2;
    public static final int VIEW_TYPE_HEADER = 1;

    @NotNull
    private List<ExpandableItem<T>> dataList = new ArrayList();

    @Nullable
    private OnItemClickListener onItemClickListener;

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u001f\u0010\u0006\u001a\u00020\u00052\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007Jg\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter$CommonDataViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableItem;", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "nextItem", "", "refreshBottomView", "(Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableItem;)V", "", "title", Column.SUBTITLE, "endTitle", "abnormalTitle", "", "showTitle", "showSubtitle", "showEndTitle", "showArrow", "showAbnormal", "updateView", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZ)V", "Landroid/graphics/drawable/Drawable;", "abnormalBg", "", "textColor", "updateAbnormalBg", "(Landroid/graphics/drawable/Drawable;I)V", "Landroid/widget/TextView;", "tvTitle", "Landroid/widget/TextView;", "tvSubtitle", "tvAbnormal", "tvEndDesc", "Landroid/widget/ImageView;", "ivArrow", "Landroid/widget/ImageView;", "Landroid/view/View;", "containerView", "Landroid/view/View;", "Lyxb;", "binding", "<init>", "(Lyxb;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class CommonDataViewHolder extends RecyclerView.d0 {

        @NotNull
        private final View containerView;

        @NotNull
        private final ImageView ivArrow;

        @NotNull
        private final TextView tvAbnormal;

        @NotNull
        private final TextView tvEndDesc;

        @NotNull
        private final TextView tvSubtitle;

        @NotNull
        private final TextView tvTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CommonDataViewHolder(@NotNull yxb binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            TextView tvTitle = binding.G;
            Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
            this.tvTitle = tvTitle;
            TextView tvSubtitle = binding.F;
            Intrinsics.checkNotNullExpressionValue(tvSubtitle, "tvSubtitle");
            this.tvSubtitle = tvSubtitle;
            TextView tvAbnormal = binding.D;
            Intrinsics.checkNotNullExpressionValue(tvAbnormal, "tvAbnormal");
            this.tvAbnormal = tvAbnormal;
            TextView tvEnd = binding.E;
            Intrinsics.checkNotNullExpressionValue(tvEnd, "tvEnd");
            this.tvEndDesc = tvEnd;
            ImageView ivArrow = binding.B;
            Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
            this.ivArrow = ivArrow;
            LinearLayout mainContainer = binding.C;
            Intrinsics.checkNotNullExpressionValue(mainContainer, "mainContainer");
            this.containerView = mainContainer;
        }

        public static /* synthetic */ void updateView$default(CommonDataViewHolder commonDataViewHolder, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                str3 = "";
            }
            if ((i & 8) != 0) {
                str4 = "";
            }
            if ((i & 16) != 0) {
                z = true;
            }
            if ((i & 32) != 0) {
                z2 = true;
            }
            if ((i & 64) != 0) {
                z3 = true;
            }
            if ((i & 128) != 0) {
                z4 = true;
            }
            if ((i & 256) != 0) {
                z5 = false;
            }
            commonDataViewHolder.updateView(str, str2, str3, str4, z, z2, z3, z4, z5);
        }

        public final void refreshBottomView(@Nullable ExpandableItem<? extends ExpandableBaseDataItem> nextItem) {
            boolean z = nextItem == null || nextItem.getHeadItem() != null;
            Resources resources = this.itemView.getResources();
            View view = this.containerView;
            view.setPadding(view.getPaddingLeft(), this.containerView.getPaddingTop(), this.containerView.getPaddingRight(), ExtUtilsKt.getDp(Double.valueOf(z ? 27.3d : 17.3d)));
            if (z) {
                this.containerView.setBackgroundResource(pni.P2);
            } else {
                this.containerView.setBackgroundColor(resources.getColor(iji.m, null));
            }
        }

        public final void updateAbnormalBg(@NotNull Drawable abnormalBg, int textColor) {
            Intrinsics.checkNotNullParameter(abnormalBg, "abnormalBg");
            this.tvAbnormal.setBackground(abnormalBg);
            this.tvAbnormal.setTextColor(textColor);
        }

        public final void updateView(@NotNull String title, @NotNull String subtitle, @NotNull String endTitle, @NotNull String abnormalTitle, boolean showTitle, boolean showSubtitle, boolean showEndTitle, boolean showArrow, boolean showAbnormal) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(endTitle, "endTitle");
            Intrinsics.checkNotNullParameter(abnormalTitle, "abnormalTitle");
            this.itemView.setClickable(showArrow);
            this.ivArrow.setVisibility(showArrow ? 0 : 4);
            ViewExtKt.setVisible(this.tvTitle, showTitle);
            ViewExtKt.setVisible(this.tvSubtitle, showSubtitle);
            ViewExtKt.setVisible(this.tvEndDesc, showEndTitle);
            ViewExtKt.setVisible(this.tvAbnormal, showAbnormal);
            this.tvTitle.setText(title);
            this.tvSubtitle.setText(subtitle);
            this.tvEndDesc.setText(endTitle);
            this.tvAbnormal.setText(abnormalTitle);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter$CommonExpandableHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/common/recycer/expandable/HeaderItem;", "headerItem", "", "bindData", "(Lcom/xiaomi/fitness/common/recycer/expandable/HeaderItem;)V", "Landroid/widget/TextView;", "tvTime", "Landroid/widget/TextView;", "Landroidx/appcompat/widget/AppCompatImageView;", "ivArrow", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/view/View;", "dividerLine", "Landroid/view/View;", "containerView", "Layb;", "binding", "<init>", "(Layb;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class CommonExpandableHeaderViewHolder extends RecyclerView.d0 {

        @NotNull
        private final View containerView;

        @NotNull
        private final View dividerLine;

        @NotNull
        private final AppCompatImageView ivArrow;

        @NotNull
        private final TextView tvTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CommonExpandableHeaderViewHolder(@NotNull ayb binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            TextView tvGroupTitle = binding.D;
            Intrinsics.checkNotNullExpressionValue(tvGroupTitle, "tvGroupTitle");
            this.tvTime = tvGroupTitle;
            AppCompatImageView ivArrow = binding.B;
            Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
            this.ivArrow = ivArrow;
            View dividerLine = binding.A;
            Intrinsics.checkNotNullExpressionValue(dividerLine, "dividerLine");
            this.dividerLine = dividerLine;
            RelativeLayout rlContainer = binding.C;
            Intrinsics.checkNotNullExpressionValue(rlContainer, "rlContainer");
            this.containerView = rlContainer;
        }

        public final void bindData(@NotNull HeaderItem headerItem) {
            Intrinsics.checkNotNullParameter(headerItem, "headerItem");
            this.tvTime.setText(TimeUtils.formatDate(headerItem.getHeaderFormat(), Long.valueOf(headerItem.getHeaderTimeMillis())));
            boolean expandStatus = headerItem.getExpandStatus();
            if (headerItem.getShowArrow()) {
                ViewExtKt.setVisible(this.ivArrow, true);
                this.ivArrow.setImageResource(expandStatus ? pni.j0 : pni.i0);
            } else {
                ViewExtKt.setVisible(this.ivArrow, false);
            }
            ViewExtKt.setVisible(this.dividerLine, expandStatus);
            this.containerView.setBackgroundResource(expandStatus ? pni.Q2 : pni.N2);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter$OnItemClickListener;", "", "onClickHeader", "", "position", "", "headerItem", "Lcom/xiaomi/fitness/common/recycer/expandable/HeaderItem;", "onClickData", "data", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onClickData(@NotNull ExpandableBaseDataItem data);

        void onClickHeader(int position, @NotNull HeaderItem headerItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(BaseExpandableAdapter this$0, int i, ExpandableItem expandableItem, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(expandableItem, "$expandableItem");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener != null) {
            Intrinsics.checkNotNull(onItemClickListener);
            HeaderItem headItem = expandableItem.getHeadItem();
            Intrinsics.checkNotNull(headItem);
            onItemClickListener.onClickHeader(i, headItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(BaseExpandableAdapter this$0, ExpandableItem expandableItem, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(expandableItem, "$expandableItem");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener != null) {
            Intrinsics.checkNotNull(onItemClickListener);
            ExpandableBaseDataItem itemDetail = expandableItem.getItemDetail();
            Intrinsics.checkNotNull(itemDetail);
            onItemClickListener.onClickData(itemDetail);
        }
    }

    public static /* synthetic */ void setData$default(BaseExpandableAdapter baseExpandableAdapter, List list, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setData");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        baseExpandableAdapter.setData(list, z);
    }

    public void addData(@NotNull List<ExpandableItem<T>> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        int size = this.dataList.size();
        ListExtKt.addAll(this.dataList, list);
        int i = size - 1;
        if (i > 0) {
            size = i;
        }
        notifyItemRangeChanged(size, list.size());
    }

    @NotNull
    public final List<ExpandableItem<T>> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.dataList.get(position).getHeadItem() != null ? 1 : 2;
    }

    @Nullable
    /* JADX INFO: renamed from: getListener, reason: from getter */
    public final OnItemClickListener getOnItemClickListener() {
        return this.onItemClickListener;
    }

    public abstract void onBindCommonDataViewHolder(@NotNull CommonDataViewHolder viewHolder, @NotNull ExpandableBaseDataItem data);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final ExpandableItem<T> expandableItem = this.dataList.get(position);
        int i = position + 1;
        ExpandableItem<T> expandableItem2 = i < getCount() ? this.dataList.get(i) : null;
        if (holder instanceof CommonExpandableHeaderViewHolder) {
            HeaderItem headItem = expandableItem.getHeadItem();
            Intrinsics.checkNotNull(headItem);
            ((CommonExpandableHeaderViewHolder) holder).bindData(headItem);
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: l72
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseExpandableAdapter.onBindViewHolder$lambda$0(this.f24731a, position, expandableItem, view);
                }
            });
            return;
        }
        if (holder instanceof CommonDataViewHolder) {
            CommonDataViewHolder commonDataViewHolder = (CommonDataViewHolder) holder;
            commonDataViewHolder.refreshBottomView(expandableItem2);
            ExpandableBaseDataItem itemDetail = expandableItem.getItemDetail();
            Intrinsics.checkNotNull(itemDetail);
            onBindCommonDataViewHolder(commonDataViewHolder, itemDetail);
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: m72
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseExpandableAdapter.onBindViewHolder$lambda$1(this.f25830a, expandableItem, view);
                }
            });
        }
    }

    @NotNull
    public RecyclerView.d0 onCreateDataViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        yxb yxbVarA0 = yxb.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(yxbVarA0, "inflate(...)");
        return new CommonDataViewHolder(yxbVarA0);
    }

    @NotNull
    public RecyclerView.d0 onCreateHeaderViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ayb aybVarA0 = ayb.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(aybVarA0, "inflate(...)");
        return new CommonExpandableHeaderViewHolder(aybVarA0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return viewType == 1 ? onCreateHeaderViewHolder(parent, viewType) : onCreateDataViewHolder(parent, viewType);
    }

    public void setData(@NotNull List<ExpandableItem<T>> list, boolean notifyImmediately) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.dataList = list;
        if (notifyImmediately) {
            notifyDataSetChanged();
        }
    }

    public final void setDataList(@NotNull List<ExpandableItem<T>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public void setListener(@NotNull OnItemClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onItemClickListener = listener;
    }
}
