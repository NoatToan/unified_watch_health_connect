package com.xiaomi.fitness.active.pk.ui.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.active.pk.net.model.AggregatePkInfo;
import com.xiaomi.fitness.active.pk.net.model.UserInfo;
import com.xiaomi.fitness.active.pk.ui.recyclerview.PkHistoryBriefAdapter;
import com.xiaomi.fitness.active.pk.ui.recyclerview.holder.TitleSubTitleViewHolder;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.bui;
import defpackage.myi;
import defpackage.ozi;
import defpackage.wqi;
import defpackage.zii;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003./0B\u0007¢\u0006\u0004\b,\u0010-J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00072\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u000bJ\u0015\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/recyclerview/PkHistoryBriefAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/holder/TitleSubTitleViewHolder;", "holder", "", "position", "", "bindContentViewHolder", "(Lcom/xiaomi/fitness/active/pk/ui/recyclerview/holder/TitleSubTitleViewHolder;I)V", "getContentItemCount", "()I", "", "isHeaderView", "(I)Z", "", "Lcom/xiaomi/fitness/active/pk/net/model/AggregatePkInfo;", "list", "updateDataList", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemViewType", "(I)I", "getItemCount", "titleResId", "showHeader", "(I)V", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/PkHistoryBriefAdapter$OnItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "(Lcom/xiaomi/fitness/active/pk/ui/recyclerview/PkHistoryBriefAdapter$OnItemClickListener;)V", "headerCount", "I", "headerTitleResId", "onItemClickListener", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/PkHistoryBriefAdapter$OnItemClickListener;", "dataList", "Ljava/util/List;", "<init>", "()V", "Companion", "OnItemClickListener", "HeaderViewHolder", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PkHistoryBriefAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int ITEM_TYPE_CONTENT = 2;
    public static final int ITEM_TYPE_HEADER = 1;

    @Nullable
    private List<AggregatePkInfo> dataList;
    private int headerCount;
    private int headerTitleResId;

    @Nullable
    private OnItemClickListener onItemClickListener;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/recyclerview/PkHistoryBriefAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "titleResId", "", "bindData", "(I)V", "Landroid/widget/TextView;", "headerTxtView", "Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/recyclerview/PkHistoryBriefAdapter$OnItemClickListener;", "", "onClick", "", "recordDetail", "Lcom/xiaomi/fitness/active/pk/net/model/AggregatePkInfo;", "isClickAcceptDirectly", "", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onClick$default(OnItemClickListener onItemClickListener, AggregatePkInfo aggregatePkInfo, boolean z, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClick");
                }
                if ((i & 2) != 0) {
                    z = false;
                }
                onItemClickListener.onClick(aggregatePkInfo, z);
            }
        }

        void onClick(@NotNull AggregatePkInfo recordDetail, boolean isClickAcceptDirectly);
    }

    private final void bindContentViewHolder(TitleSubTitleViewHolder holder, int position) {
        final AggregatePkInfo aggregatePkInfo;
        String str;
        List<AggregatePkInfo> list = this.dataList;
        if (list == null || (aggregatePkInfo = list.get(position - this.headerCount)) == null) {
            return;
        }
        float ownWinPercent = aggregatePkInfo.getOwnWinPercent();
        int pkCount = aggregatePkInfo.getPkCount();
        String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(myi.f27348a, pkCount, Integer.valueOf(pkCount), Integer.valueOf((int) ownWinPercent));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        UserInfo oppUserInfo = aggregatePkInfo.getOppUserInfo();
        if (oppUserInfo == null || (string = oppUserInfo.getNickName()) == null) {
            UserInfo oppUserInfo2 = aggregatePkInfo.getOppUserInfo();
            if (oppUserInfo2 != null) {
                String string = Long.valueOf(oppUserInfo2.getUserId()).toString();
                str = string;
            } else {
                str = null;
            }
        } else {
            str = string;
        }
        TitleSubTitleViewHolder.setTitleAndSubTitle$default(holder, str, quantityString, false, false, 12, null);
        holder.applyGrayStyleAction();
        if (aggregatePkInfo.getInviteStatus() == 1) {
            holder.setActionText(ResourceExtKt.getString(ozi.a0), false, zii.o);
        } else if (aggregatePkInfo.getRejectTimes() >= 3) {
            holder.setActionText(ResourceExtKt.getString(ozi.j), false, zii.o);
        } else {
            holder.setActionText(ResourceExtKt.getString(ozi.j), true, zii.f);
        }
        UserInfo oppUserInfo3 = aggregatePkInfo.getOppUserInfo();
        holder.loadAvatar(oppUserInfo3 != null ? oppUserInfo3.getIcon() : null);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: vxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PkHistoryBriefAdapter.bindContentViewHolder$lambda$0(this.f37331a, aggregatePkInfo, view);
            }
        });
        holder.setActionClickListener(new View.OnClickListener() { // from class: wxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PkHistoryBriefAdapter.bindContentViewHolder$lambda$1(this.f38459a, aggregatePkInfo, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindContentViewHolder$lambda$0(PkHistoryBriefAdapter this$0, AggregatePkInfo aggregatePkInfo, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(aggregatePkInfo, "$aggregatePkInfo");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onClick(aggregatePkInfo, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindContentViewHolder$lambda$1(PkHistoryBriefAdapter this$0, AggregatePkInfo aggregatePkInfo, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(aggregatePkInfo, "$aggregatePkInfo");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onClick(aggregatePkInfo, true);
        }
    }

    private final int getContentItemCount() {
        List<AggregatePkInfo> list = this.dataList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    private final boolean isHeaderView(int position) {
        int i = this.headerCount;
        return i != 0 && position < i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.headerCount + getContentItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return isHeaderView(position) ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof HeaderViewHolder) {
            ((HeaderViewHolder) holder).bindData(this.headerTitleResId);
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
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(bui.f4619r, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new TitleSubTitleViewHolder(viewInflate2);
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onItemClickListener = listener;
    }

    public final void showHeader(int titleResId) {
        this.headerTitleResId = titleResId;
        this.headerCount = 1;
    }

    public final void updateDataList(@Nullable List<AggregatePkInfo> list) {
        this.dataList = list;
        notifyDataSetChanged();
    }
}
