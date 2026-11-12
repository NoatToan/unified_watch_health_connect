package com.xiaomi.fitness.relative.ui.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.relative.ui.recycler.InviteRelativeApproachAdapter;
import com.xiaomi.fitness.relative.ui.util.RelativeCareUtil;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.aoi;
import defpackage.nuf;
import defpackage.qli;
import defpackage.qri;
import defpackage.t0j;
import defpackage.xui;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000556789B\u0011\u0012\b\b\u0002\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010*\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'R\u0014\u0010+\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020%0,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0019¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "updateRecyclerView", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter$OnItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "(Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter$OnItemClickListener;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "titleResId", "showHeader", "(I)V", "getItemViewType", "(I)I", "paddingHorizontal", "I", "paddingBetweenModelItem", "headerTitleResId", "mOnItemClickListener", "Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter$OnItemClickListener;", "Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter$IconUiItem;", "iconWechat", "Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter$IconUiItem;", "iconMiAccount", "iconMessage", "iconQrCode", "iconUrlLink", "", "iconItemList", "Ljava/util/List;", "getColCountPerRow", "colCountPerRow", "", "isExpandedState", "<init>", "(Z)V", "Companion", "IconUiItem", "OnItemClickListener", "ItemViewHolder", "HeaderViewHolder", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class InviteRelativeApproachAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int EXPANDED_STATE_COL_COUNT = 7;
    public static final int FOLDED_STATE_COL_COUNT = 5;
    public static final int ICON_ITEM_LINK = 4;
    public static final int ICON_ITEM_MESSAGE_INVITATION = 2;
    public static final int ICON_ITEM_MI_ACCOUNT = 1;
    public static final int ICON_ITEM_QR_CODE_INVITATION = 3;
    public static final int ICON_ITEM_WECHAT = 0;
    public static final int ITEM_TYPE_CONTENT = 1;
    public static final int ITEM_TYPE_HEADER = 0;
    private int headerTitleResId;

    @NotNull
    private List<IconUiItem> iconItemList;

    @NotNull
    private final IconUiItem iconMessage;

    @NotNull
    private final IconUiItem iconMiAccount;

    @NotNull
    private final IconUiItem iconQrCode;

    @NotNull
    private final IconUiItem iconUrlLink;

    @NotNull
    private final IconUiItem iconWechat;

    @Nullable
    private OnItemClickListener mOnItemClickListener;
    private final int paddingBetweenModelItem;
    private final int paddingHorizontal;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "titleResId", "", "bindData", "(I)V", "Landroid/widget/TextView;", "headerTxtView", "Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter;Landroid/view/View;)V", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class HeaderViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView headerTxtView;
        final /* synthetic */ InviteRelativeApproachAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderViewHolder(@NotNull InviteRelativeApproachAdapter inviteRelativeApproachAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = inviteRelativeApproachAdapter;
            View viewFindViewById = itemView.findViewById(qri.e0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.headerTxtView = (TextView) viewFindViewById;
        }

        public final void bindData(int titleResId) {
            this.headerTxtView.setText(ResourceExtKt.getString(titleResId));
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter$IconUiItem;", "", "iconId", "", "imageResId", "textResId", "<init>", "(III)V", "getIconId", "()I", "getImageResId", "getTextResId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconUiItem {
        private final int iconId;
        private final int imageResId;
        private final int textResId;

        public IconUiItem(int i, int i2, int i3) {
            this.iconId = i;
            this.imageResId = i2;
            this.textResId = i3;
        }

        public static /* synthetic */ IconUiItem copy$default(IconUiItem iconUiItem, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = iconUiItem.iconId;
            }
            if ((i4 & 2) != 0) {
                i2 = iconUiItem.imageResId;
            }
            if ((i4 & 4) != 0) {
                i3 = iconUiItem.textResId;
            }
            return iconUiItem.copy(i, i2, i3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getIconId() {
            return this.iconId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getImageResId() {
            return this.imageResId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getTextResId() {
            return this.textResId;
        }

        @NotNull
        public final IconUiItem copy(int iconId, int imageResId, int textResId) {
            return new IconUiItem(iconId, imageResId, textResId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconUiItem)) {
                return false;
            }
            IconUiItem iconUiItem = (IconUiItem) other;
            return this.iconId == iconUiItem.iconId && this.imageResId == iconUiItem.imageResId && this.textResId == iconUiItem.textResId;
        }

        public final int getIconId() {
            return this.iconId;
        }

        public final int getImageResId() {
            return this.imageResId;
        }

        public final int getTextResId() {
            return this.textResId;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.iconId) * 31) + Integer.hashCode(this.imageResId)) * 31) + Integer.hashCode(this.textResId);
        }

        @NotNull
        public String toString() {
            return "IconUiItem(iconId=" + this.iconId + ", imageResId=" + this.imageResId + ", textResId=" + this.textResId + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter$IconUiItem;", "iconItem", "", "bindData", "(Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter$IconUiItem;)V", "Landroid/widget/TextView;", "usernameTv", "Landroid/widget/TextView;", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "iconIv", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter;Landroid/view/View;)V", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final RoundImageView iconIv;
        final /* synthetic */ InviteRelativeApproachAdapter this$0;

        @NotNull
        private final TextView usernameTv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(@NotNull InviteRelativeApproachAdapter inviteRelativeApproachAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = inviteRelativeApproachAdapter;
            View viewFindViewById = itemView.findViewById(qri.d0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.usernameTv = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(qri.f);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.iconIv = (RoundImageView) viewFindViewById2;
        }

        public final void bindData(@NotNull IconUiItem iconItem) {
            Intrinsics.checkNotNullParameter(iconItem, "iconItem");
            this.usernameTv.setText(iconItem.getTextResId());
            int screenWidth = ((UIUtils.INSTANCE.getScreenWidth(ApplicationExtKt.getApplication()) - (this.this$0.paddingHorizontal * 2)) - ((this.this$0.getColCountPerRow() - 1) * this.this$0.paddingBetweenModelItem)) / this.this$0.getColCountPerRow();
            RelativeCareUtil.INSTANCE.loadDrawableWithResId(this.iconIv, iconItem.getImageResId(), screenWidth, screenWidth);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter$OnItemClickListener;", "", "onClick", "", "itemViewHolder", "Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter$ItemViewHolder;", "Lcom/xiaomi/fitness/relative/ui/recycler/InviteRelativeApproachAdapter;", "iconId", "", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onClick(@NotNull ItemViewHolder itemViewHolder, int iconId);
    }

    public InviteRelativeApproachAdapter() {
        this(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getColCountPerRow() {
        return 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(InviteRelativeApproachAdapter this$0, RecyclerView.d0 holder, IconUiItem iconItem, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(iconItem, "$iconItem");
        OnItemClickListener onItemClickListener = this$0.mOnItemClickListener;
        Intrinsics.checkNotNull(onItemClickListener);
        onItemClickListener.onClick((ItemViewHolder) holder, iconItem.getIconId());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.iconItemList.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position == 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof HeaderViewHolder) {
            ((HeaderViewHolder) holder).bindData(this.headerTitleResId);
            return;
        }
        if (holder instanceof ItemViewHolder) {
            final IconUiItem iconUiItem = this.iconItemList.get(position - 1);
            ((ItemViewHolder) holder).bindData(iconUiItem);
            if (this.mOnItemClickListener != null) {
                nuf.f(holder.itemView);
                holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: xhd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        InviteRelativeApproachAdapter.onBindViewHolder$lambda$0(this.f39125a, holder, iconUiItem, view);
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(xui.m, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new HeaderViewHolder(this, viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(xui.n, parent, false);
        Intrinsics.checkNotNull(viewInflate2);
        return new ItemViewHolder(this, viewInflate2);
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mOnItemClickListener = listener;
    }

    public final void showHeader(int titleResId) {
        this.headerTitleResId = titleResId;
    }

    public final void updateRecyclerView() {
        notifyDataSetChanged();
    }

    public /* synthetic */ InviteRelativeApproachAdapter(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public InviteRelativeApproachAdapter(boolean z) {
        this.paddingHorizontal = ExtUtilsKt.getDimension(qli.f31637a);
        this.paddingBetweenModelItem = ExtUtilsKt.getDp(Float.valueOf(10.8f));
        IconUiItem iconUiItem = new IconUiItem(0, aoi.l, t0j.x0);
        this.iconWechat = iconUiItem;
        IconUiItem iconUiItem2 = new IconUiItem(1, aoi.i, t0j.b0);
        this.iconMiAccount = iconUiItem2;
        IconUiItem iconUiItem3 = new IconUiItem(2, aoi.h, t0j.V);
        this.iconMessage = iconUiItem3;
        IconUiItem iconUiItem4 = new IconUiItem(3, aoi.f3301k, t0j.W);
        this.iconQrCode = iconUiItem4;
        IconUiItem iconUiItem5 = new IconUiItem(4, aoi.g, t0j.Y);
        this.iconUrlLink = iconUiItem5;
        ArrayList arrayList = new ArrayList();
        this.iconItemList = arrayList;
        ListExtKt.add(arrayList, iconUiItem);
        ListExtKt.add(this.iconItemList, iconUiItem2);
        if (ApplicationExtKt.getApplication().getPackageManager().hasSystemFeature("android.hardware.telephony")) {
            ListExtKt.add(this.iconItemList, iconUiItem3);
        }
        ListExtKt.add(this.iconItemList, iconUiItem4);
        ListExtKt.add(this.iconItemList, iconUiItem5);
    }
}
