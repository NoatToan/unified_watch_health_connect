package com.xiaomi.fitness.relative.ui.recycler;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.relative.server.model.RelativeUserInfo;
import com.xiaomi.fitness.relative.ui.recycler.RelativeListAdapter;
import com.xiaomi.fitness.relative.ui.util.RelativeCareUtil;
import defpackage.aoi;
import defpackage.nuf;
import defpackage.qli;
import defpackage.qri;
import defpackage.t0j;
import defpackage.xui;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003%&'B\u0011\u0012\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u000b2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/relative/ui/recycler/RelativeListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "", "Lcom/xiaomi/fitness/relative/server/model/RelativeUserInfo;", "relativeList", "updateDataList", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/relative/ui/recycler/RelativeListAdapter$OnItemClickListener;", "onItemClickListener", "setOnItemClickListener", "(Lcom/xiaomi/fitness/relative/ui/recycler/RelativeListAdapter$OnItemClickListener;)V", "getItemCount", "()I", "mRelativeList", "Ljava/util/List;", "Lcom/xiaomi/fitness/relative/ui/recycler/RelativeListAdapter$OnItemClickListener;", "colCountPerRow", "I", "paddingHorizontal", "paddingBetweenModelItem", "iconWidth", "", "isExpandedState", "<init>", "(Z)V", "Companion", "OnItemClickListener", "ItemViewHolder", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RelativeListAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int EXPANDED_STATE_COL_NUM = 8;
    public static final int FOLDED_STATE_COL_NUM = 5;
    private int colCountPerRow;
    private final int iconWidth;

    @Nullable
    private List<RelativeUserInfo> mRelativeList;

    @Nullable
    private OnItemClickListener onItemClickListener;
    private final int paddingBetweenModelItem;
    private final int paddingHorizontal;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/recycler/RelativeListAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/relative/server/model/RelativeUserInfo;", "userInfo", "", "dataUpdatedTimestamp", "", "showDataExceptionBadge", "showSmallRedDot", "showFamilyIcon", "", "bindData", "(Lcom/xiaomi/fitness/relative/server/model/RelativeUserInfo;JZZZ)V", "Landroid/widget/TextView;", "relativeUsername", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "relativeAvatar", "Landroid/widget/ImageView;", "smallRedDot", "updateDescriptionTv", "dataExceptionTv", "Landroid/graphics/drawable/Drawable;", "familyIconDrawable", "Landroid/graphics/drawable/Drawable;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/relative/ui/recycler/RelativeListAdapter;Landroid/view/View;)V", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView dataExceptionTv;

        @Nullable
        private final Drawable familyIconDrawable;

        @NotNull
        private final ImageView relativeAvatar;

        @NotNull
        private final TextView relativeUsername;

        @NotNull
        private final ImageView smallRedDot;
        final /* synthetic */ RelativeListAdapter this$0;

        @NotNull
        private final TextView updateDescriptionTv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(@NotNull RelativeListAdapter relativeListAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = relativeListAdapter;
            View viewFindViewById = itemView.findViewById(qri.Q);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.relativeUsername = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(qri.M);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.relativeAvatar = (ImageView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(qri.U);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.smallRedDot = (ImageView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(qri.g0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.updateDescriptionTv = (TextView) viewFindViewById4;
            View viewFindViewById5 = itemView.findViewById(qri.p);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.dataExceptionTv = (TextView) viewFindViewById5;
            this.familyIconDrawable = ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), aoi.f);
        }

        public static /* synthetic */ void bindData$default(ItemViewHolder itemViewHolder, RelativeUserInfo relativeUserInfo, long j, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 16) != 0) {
                z3 = false;
            }
            itemViewHolder.bindData(relativeUserInfo, j, z, z2, z3);
        }

        public final void bindData(@NotNull RelativeUserInfo userInfo, long dataUpdatedTimestamp, boolean showDataExceptionBadge, boolean showSmallRedDot, boolean showFamilyIcon) {
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            this.relativeUsername.setText(userInfo.getNote());
            RelativeCareUtil.INSTANCE.loadImageWithUrl(this.relativeAvatar, userInfo.getIcon(), this.this$0.iconWidth);
            String hHmmLocalFormat = TimeDateUtil.getHHmmLocalFormat(dataUpdatedTimestamp);
            String string = ApplicationExtKt.getApplication().getString(t0j.w0, TimeDateUtil.getDateMMddFormat(dataUpdatedTimestamp), hHmmLocalFormat);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this.updateDescriptionTv.setText(string);
            if (dataUpdatedTimestamp == 0) {
                ViewExtKt.invisible(this.updateDescriptionTv);
            } else {
                ViewExtKt.visible(this.updateDescriptionTv);
            }
            if (showDataExceptionBadge) {
                ViewExtKt.visible(this.dataExceptionTv);
            } else {
                ViewExtKt.gone(this.dataExceptionTv);
            }
            if (showSmallRedDot) {
                ViewExtKt.visible(this.smallRedDot);
            } else {
                ViewExtKt.gone(this.smallRedDot);
            }
            if (showFamilyIcon) {
                this.relativeUsername.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.familyIconDrawable, (Drawable) null);
            } else {
                this.relativeUsername.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/recycler/RelativeListAdapter$OnItemClickListener;", "", "onClick", "", "userInfo", "Lcom/xiaomi/fitness/relative/server/model/RelativeUserInfo;", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onClick(@NotNull RelativeUserInfo userInfo);
    }

    public RelativeListAdapter() {
        this(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(RelativeListAdapter this$0, RelativeUserInfo dataItem, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dataItem, "$dataItem");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener != null) {
            Intrinsics.checkNotNull(onItemClickListener);
            onItemClickListener.onClick(dataItem);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        List<RelativeUserInfo> list = this.mRelativeList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List<RelativeUserInfo> list = this.mRelativeList;
        if (list == null) {
            return;
        }
        Intrinsics.checkNotNull(list);
        final RelativeUserInfo relativeUserInfo = list.get(position);
        boolean hasNewData = relativeUserInfo.getHasNewData();
        ((ItemViewHolder) holder).bindData(relativeUserInfo, relativeUserInfo.getLatestDataTime(), relativeUserInfo.getHasNewAbnormalRecord(), hasNewData, relativeUserInfo.getTag() == 1);
        nuf.f(holder.itemView);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: iik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RelativeListAdapter.onBindViewHolder$lambda$0(this.f21177a, relativeUserInfo, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(xui.h, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new ItemViewHolder(this, viewInflate);
    }

    public final void setOnItemClickListener(@Nullable OnItemClickListener onItemClickListener) {
        if (onItemClickListener != null) {
            this.onItemClickListener = onItemClickListener;
        }
    }

    public final void updateDataList(@Nullable List<RelativeUserInfo> relativeList) {
        this.mRelativeList = relativeList;
        notifyDataSetChanged();
    }

    public /* synthetic */ RelativeListAdapter(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public RelativeListAdapter(boolean z) {
        this.colCountPerRow = z ? 8 : 5;
        int dimension = ExtUtilsKt.getDimension(qli.f31638b);
        this.paddingHorizontal = dimension;
        int dp = ExtUtilsKt.getDp(15);
        this.paddingBetweenModelItem = dp;
        int screenWidth = UIUtils.INSTANCE.getScreenWidth(ApplicationExtKt.getApplication()) - (dimension * 2);
        int i = this.colCountPerRow;
        this.iconWidth = (screenWidth - ((i - 1) * dp)) / i;
    }
}
