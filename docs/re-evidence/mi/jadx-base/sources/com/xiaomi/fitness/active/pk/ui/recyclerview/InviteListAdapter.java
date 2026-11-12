package com.xiaomi.fitness.active.pk.ui.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.active.pk.net.model.InviteRecordDetail;
import com.xiaomi.fitness.active.pk.net.model.UserInfo;
import com.xiaomi.fitness.active.pk.ui.recyclerview.InviteListAdapter;
import com.xiaomi.fitness.active.pk.ui.recyclerview.holder.TitleSubTitleViewHolder;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.bui;
import defpackage.fni;
import defpackage.ozi;
import defpackage.wqi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000489:;B\u0007¢\u0006\u0004\b7\u0010#J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u000bJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\f¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0007¢\u0006\u0004\b'\u0010#J\u0015\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0016\u0010/\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00103¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/recyclerview/InviteListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/holder/TitleSubTitleViewHolder;", "holder", "", "position", "", "bindContentViewHolder", "(Lcom/xiaomi/fitness/active/pk/ui/recyclerview/holder/TitleSubTitleViewHolder;I)V", "getContentItemCount", "()I", "", "isHeaderView", "(I)Z", "isFooterView", "", "Lcom/xiaomi/fitness/active/pk/net/model/InviteRecordDetail;", "list", "updateDataList", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemViewType", "(I)I", "getItemCount", "titleResId", "showHeader", "(I)V", "hideHeader", "()V", "isFold", "showFooterFold", "(Z)V", "hideFooterFold", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/InviteListAdapter$OnItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "(Lcom/xiaomi/fitness/active/pk/ui/recyclerview/InviteListAdapter$OnItemClickListener;)V", "headerCount", "I", "footerCount", "headerTitleResId", "onItemClickListener", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/InviteListAdapter$OnItemClickListener;", "mDataList", "Ljava/util/List;", "footerFoldStatus", "Z", "dataSrcList", "<init>", "Companion", "OnItemClickListener", "HeaderViewHolder", "FooterViewHolder", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class InviteListAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int ITEM_TYPE_CONTENT = 2;
    public static final int ITEM_TYPE_FOOTER = 3;
    public static final int ITEM_TYPE_HEADER = 1;

    @Nullable
    private List<InviteRecordDetail> dataSrcList;
    private int footerCount;
    private int headerCount;
    private int headerTitleResId;

    @Nullable
    private OnItemClickListener onItemClickListener;

    @NotNull
    private List<InviteRecordDetail> mDataList = new ArrayList();
    private boolean footerFoldStatus = true;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/recyclerview/InviteListAdapter$FooterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "isFold", "", "bindData", "(Z)V", "Landroid/widget/TextView;", "footerTxtView", "Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class FooterViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView footerTxtView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FooterViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(wqi.V0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.footerTxtView = (TextView) viewFindViewById;
        }

        public final void bindData(boolean isFold) {
            this.footerTxtView.setText(ResourceExtKt.getString(isFold ? ozi.F : ozi.E));
            this.footerTxtView.setCompoundDrawablesWithIntrinsicBounds(0, 0, isFold ? fni.l : fni.f17959k, 0);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/recyclerview/InviteListAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "titleResId", "", "bindData", "(I)V", "Landroid/widget/TextView;", "headerTxtView", "Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class HeaderViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView headerTxtView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(wqi.y1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.headerTxtView = (TextView) viewFindViewById;
        }

        public final void bindData(int titleResId) {
            this.headerTxtView.setText(ResourceExtKt.getString(titleResId));
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001a\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/recyclerview/InviteListAdapter$OnItemClickListener;", "", "onHeaderClick", "", "onClick", "recordDetail", "Lcom/xiaomi/fitness/active/pk/net/model/InviteRecordDetail;", "isClickAcceptDirectly", "", "onBottomClick", "fold", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void onBottomClick(@NotNull OnItemClickListener onItemClickListener, boolean z) {
            }

            public static /* synthetic */ void onClick$default(OnItemClickListener onItemClickListener, InviteRecordDetail inviteRecordDetail, boolean z, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClick");
                }
                if ((i & 2) != 0) {
                    z = false;
                }
                onItemClickListener.onClick(inviteRecordDetail, z);
            }

            public static void onHeaderClick(@NotNull OnItemClickListener onItemClickListener) {
            }
        }

        void onBottomClick(boolean fold);

        void onClick(@NotNull InviteRecordDetail recordDetail, boolean isClickAcceptDirectly);

        void onHeaderClick();
    }

    private final void bindContentViewHolder(TitleSubTitleViewHolder holder, int position) {
        final InviteRecordDetail inviteRecordDetail = this.mDataList.get(position - this.headerCount);
        UserInfo inviterUserInfo = inviteRecordDetail.getInviterUserInfo();
        if (inviterUserInfo == null) {
            return;
        }
        String nickName = inviterUserInfo.getNickName();
        if (nickName == null) {
            nickName = String.valueOf(inviterUserInfo.getUserId());
        }
        TitleSubTitleViewHolder.setTitleAndSubTitle$default(holder, nickName, null, true, false, 10, null);
        TitleSubTitleViewHolder.setActionText$default(holder, ResourceExtKt.getString(ozi.t), false, 0, 6, null);
        holder.applyPrimaryStyleAction();
        holder.loadAvatar(inviterUserInfo.getIcon());
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: nhd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InviteListAdapter.bindContentViewHolder$lambda$1(this.f27933a, inviteRecordDetail, view);
            }
        });
        holder.setActionClickListener(new View.OnClickListener() { // from class: ohd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InviteListAdapter.bindContentViewHolder$lambda$2(this.f29172a, inviteRecordDetail, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindContentViewHolder$lambda$1(InviteListAdapter this$0, InviteRecordDetail recordDetail, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(recordDetail, "$recordDetail");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener != null) {
            OnItemClickListener.DefaultImpls.onClick$default(onItemClickListener, recordDetail, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindContentViewHolder$lambda$2(InviteListAdapter this$0, InviteRecordDetail recordDetail, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(recordDetail, "$recordDetail");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onClick(recordDetail, true);
        }
    }

    private final int getContentItemCount() {
        return this.mDataList.size();
    }

    private final boolean isFooterView(int position) {
        return this.footerCount != 0 && position == getItemCount() - 1;
    }

    private final boolean isHeaderView(int position) {
        int i = this.headerCount;
        return i != 0 && position < i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(InviteListAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.footerFoldStatus) {
            this$0.showFooterFold(false);
            this$0.mDataList.clear();
            List<InviteRecordDetail> list = this$0.mDataList;
            List<InviteRecordDetail> list2 = this$0.dataSrcList;
            Intrinsics.checkNotNull(list2);
            list.addAll(list2);
            this$0.notifyDataSetChanged();
            return;
        }
        this$0.showFooterFold(true);
        List<InviteRecordDetail> list3 = this$0.dataSrcList;
        if (list3 == null || list3.size() <= 1) {
            return;
        }
        this$0.mDataList.clear();
        List<InviteRecordDetail> list4 = this$0.mDataList;
        List<InviteRecordDetail> list5 = this$0.dataSrcList;
        Intrinsics.checkNotNull(list5);
        list4.addAll(list5.subList(0, 2));
        this$0.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.headerCount + getContentItemCount() + this.footerCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (isHeaderView(position)) {
            return 1;
        }
        return isFooterView(position) ? 3 : 2;
    }

    public final void hideFooterFold() {
        this.footerCount = 0;
    }

    public final void hideHeader() {
        this.headerCount = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof HeaderViewHolder) {
            ((HeaderViewHolder) holder).bindData(this.headerTitleResId);
            return;
        }
        if (holder instanceof FooterViewHolder) {
            ((FooterViewHolder) holder).bindData(this.footerFoldStatus);
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: phd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InviteListAdapter.onBindViewHolder$lambda$0(this.f30392a, view);
                }
            });
        } else if (holder instanceof TitleSubTitleViewHolder) {
            bindContentViewHolder((TitleSubTitleViewHolder) holder, position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(bui.t, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new HeaderViewHolder(viewInflate);
        }
        if (viewType != 3) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(bui.f4619r, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
            return new TitleSubTitleViewHolder(viewInflate2);
        }
        View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(bui.s, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate3, "inflate(...)");
        return new FooterViewHolder(viewInflate3);
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onItemClickListener = listener;
    }

    public final void showFooterFold(boolean isFold) {
        this.footerFoldStatus = isFold;
        this.footerCount = 1;
    }

    public final void showHeader(int titleResId) {
        this.headerTitleResId = titleResId;
        this.headerCount = 1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    public final void updateDataList(@Nullable List<InviteRecordDetail> list) {
        List<InviteRecordDetail> listEmptyList;
        this.dataSrcList = list;
        this.mDataList.clear();
        List<InviteRecordDetail> list2 = this.dataSrcList;
        if (list2 != null) {
            Intrinsics.checkNotNull(list2);
            if (list2.size() > 2) {
                showFooterFold(this.footerFoldStatus);
                if (this.footerFoldStatus) {
                    List<InviteRecordDetail> list3 = this.mDataList;
                    List<InviteRecordDetail> list4 = this.dataSrcList;
                    Intrinsics.checkNotNull(list4);
                    list3.addAll(list4.subList(0, 2));
                } else {
                    List<InviteRecordDetail> list5 = this.mDataList;
                    List<InviteRecordDetail> list6 = this.dataSrcList;
                    Intrinsics.checkNotNull(list6);
                    list5.addAll(list6);
                }
            } else {
                List<InviteRecordDetail> list7 = this.mDataList;
                listEmptyList = this.dataSrcList;
                if (listEmptyList == null) {
                    listEmptyList = Collections.emptyList();
                    Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
                }
                list7.addAll(listEmptyList);
                hideFooterFold();
            }
        } else {
            List<InviteRecordDetail> list8 = this.mDataList;
            listEmptyList = this.dataSrcList;
            if (listEmptyList == null) {
                listEmptyList = Collections.emptyList();
                Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
            }
            list8.addAll(listEmptyList);
            hideFooterFold();
        }
        notifyDataSetChanged();
    }
}
