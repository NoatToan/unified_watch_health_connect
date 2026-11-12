package com.xiaomi.fitness.relative.ui.recycler;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.relative.server.model.AccountUserInfo;
import com.xiaomi.fitness.relative.ui.recycler.ShareDataToFamilyAdapter;
import com.xiaomi.fitness.relative.ui.util.RelativeCareUtil;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.nuf;
import defpackage.qli;
import defpackage.qri;
import defpackage.xui;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000523456B\u0011\u0012\b\b\u0002\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0017\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010#R\u0014\u0010(\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010#R\u0014\u0010)\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010#R\u0018\u0010*\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataToFamilyAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "getItemViewType", "(I)I", "", "Lcom/xiaomi/fitness/relative/server/model/AccountUserInfo;", "list", "", "updateDataList", "(Ljava/util/List;)V", "titleResId", "showHeader", "(I)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataToFamilyAdapter$OnItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "(Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataToFamilyAdapter$OnItemClickListener;)V", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "colCountPerRow", "I", "headerTitleResId", "onItemClickListener", "Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataToFamilyAdapter$OnItemClickListener;", "paddingHorizontal", "paddingBetweenModelItem", "iconWidth", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dataList", "Ljava/util/List;", "", "isExpandedState", "<init>", "(Z)V", "Companion", "OnItemClickListener", "HeaderViewHolder", "ItemViewHolder", "FooterViewHolder", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ShareDataToFamilyAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int EXPANDED_STATE_COL_NUM = 8;
    public static final int FOLDED_STATE_COL_NUM = 5;
    public static final int ITEM_TYPE_CONTENT = 2;
    public static final int ITEM_TYPE_FOOTER = 3;
    public static final int ITEM_TYPE_HEADER = 1;
    public static final int RELATIVE_LIST_MAX_COUNT = 8;

    @NotNull
    public static final String TAG = "ShareDataToFamilyAdapter";
    private int colCountPerRow;

    @Nullable
    private List<AccountUserInfo> dataList;
    private int headerTitleResId;
    private final int iconWidth;

    @Nullable
    private RecyclerView mRecyclerView;

    @Nullable
    private OnItemClickListener onItemClickListener;
    private final int paddingBetweenModelItem;
    private final int paddingHorizontal;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataToFamilyAdapter$FooterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataToFamilyAdapter;Landroid/view/View;)V", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class FooterViewHolder extends RecyclerView.d0 {
        final /* synthetic */ ShareDataToFamilyAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FooterViewHolder(@NotNull ShareDataToFamilyAdapter shareDataToFamilyAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = shareDataToFamilyAdapter;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataToFamilyAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "titleResId", "", "bindData", "(I)V", "Landroid/widget/TextView;", "headerTxtView", "Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataToFamilyAdapter;Landroid/view/View;)V", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class HeaderViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView headerTxtView;
        final /* synthetic */ ShareDataToFamilyAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderViewHolder(@NotNull ShareDataToFamilyAdapter shareDataToFamilyAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = shareDataToFamilyAdapter;
            View viewFindViewById = itemView.findViewById(qri.e0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.headerTxtView = (TextView) viewFindViewById;
        }

        public final void bindData(int titleResId) {
            this.headerTxtView.setText(ResourceExtKt.getString(titleResId));
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataToFamilyAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/relative/server/model/AccountUserInfo;", "userInfo", "", "bindData", "(Lcom/xiaomi/fitness/relative/server/model/AccountUserInfo;)V", "Landroid/widget/TextView;", "usernameTv", "Landroid/widget/TextView;", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "iconIv", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataToFamilyAdapter;Landroid/view/View;)V", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final RoundImageView iconIv;
        final /* synthetic */ ShareDataToFamilyAdapter this$0;

        @NotNull
        private final TextView usernameTv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(@NotNull ShareDataToFamilyAdapter shareDataToFamilyAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = shareDataToFamilyAdapter;
            View viewFindViewById = itemView.findViewById(qri.d0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.usernameTv = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(qri.f);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.iconIv = (RoundImageView) viewFindViewById2;
        }

        public final void bindData(@NotNull AccountUserInfo userInfo) {
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            this.usernameTv.setText(userInfo.getNickName());
            this.usernameTv.setMaxLines(2);
            this.usernameTv.setEllipsize(TextUtils.TruncateAt.END);
            this.iconIv.setInnerStrokeWidth(ExtUtilsKt.getDp(1));
            RelativeCareUtil.INSTANCE.loadImageWithUrl(this.iconIv, userInfo.getIcon(), this.this$0.iconWidth);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataToFamilyAdapter$OnItemClickListener;", "", "onClick", "", "userInfo", "Lcom/xiaomi/fitness/relative/server/model/AccountUserInfo;", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onClick(@NotNull AccountUserInfo userInfo);
    }

    public ShareDataToFamilyAdapter() {
        this(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(ShareDataToFamilyAdapter this$0, AccountUserInfo userinfo, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(userinfo, "$userinfo");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        Intrinsics.checkNotNull(onItemClickListener);
        onItemClickListener.onClick(userinfo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        List<AccountUserInfo> list = this.dataList;
        if (list == null) {
            return 0;
        }
        Intrinsics.checkNotNull(list);
        if (list.size() > 8) {
            return 10;
        }
        List<AccountUserInfo> list2 = this.dataList;
        Intrinsics.checkNotNull(list2);
        return list2.size() + 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (position == 0) {
            return 1;
        }
        return position == getCount() - 1 ? 3 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.mRecyclerView = recyclerView;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), this.colCountPerRow);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.relative.ui.recycler.ShareDataToFamilyAdapter.onAttachedToRecyclerView.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                if (position != 0 && position != ShareDataToFamilyAdapter.this.getCount() - 1) {
                    return 1;
                }
                return ShareDataToFamilyAdapter.this.colCountPerRow;
            }
        });
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(gridLayoutManager);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        final AccountUserInfo accountUserInfo;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof HeaderViewHolder) {
            ((HeaderViewHolder) holder).bindData(this.headerTitleResId);
            Logger.d(TAG, "onBindViewHolder position=" + position + " HeaderViewHolder");
            return;
        }
        if (holder instanceof ItemViewHolder) {
            Logger.d(TAG, "onBindViewHolder position=" + position + " ItemViewHolder");
            List<AccountUserInfo> list = this.dataList;
            if (list == null || (accountUserInfo = list.get(position - 1)) == null) {
                return;
            }
            ((ItemViewHolder) holder).bindData(accountUserInfo);
            if (this.onItemClickListener != null) {
                nuf.f(holder.itemView);
                holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o5m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ShareDataToFamilyAdapter.onBindViewHolder$lambda$0(this.f28772a, accountUserInfo, view);
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 2) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(xui.n, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new ItemViewHolder(this, viewInflate);
        }
        if (viewType != 3) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(xui.m, parent, false);
            Intrinsics.checkNotNull(viewInflate2);
            return new HeaderViewHolder(this, viewInflate2);
        }
        View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(xui.d, parent, false);
        Intrinsics.checkNotNull(viewInflate3);
        return new FooterViewHolder(this, viewInflate3);
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onItemClickListener = listener;
    }

    public final void showHeader(int titleResId) {
        this.headerTitleResId = titleResId;
    }

    public final void updateDataList(@Nullable List<AccountUserInfo> list) {
        if (list == null) {
            return;
        }
        this.dataList = list;
        notifyDataSetChanged();
    }

    public /* synthetic */ ShareDataToFamilyAdapter(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public ShareDataToFamilyAdapter(boolean z) {
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
