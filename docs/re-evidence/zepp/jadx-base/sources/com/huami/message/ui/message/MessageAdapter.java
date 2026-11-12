package com.huami.message.ui.message;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.message.ui.R;
import com.huami.message.ui.base.adapter.AdapterDataObserverProxy;
import com.huami.message.ui.base.ext.IntExKt;
import com.huami.message.ui.base.ext.ViewExKt;
import com.huami.message.utils.CountListItemVisitHelper;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.huami.message.vo.PrivateMessageItemVo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\t*\u0001-\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000234BC\u0012:\u0010%\u001a6\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00040\u001ej\u0002`\"¢\u0006\u0004\b1\u00102J\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014J\u0017\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001c\u0010\u001aJ\u0006\u0010\u001d\u001a\u00020\u0004RJ\u0010%\u001a6\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00040\u001ej\u0002`\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00065"}, d2 = {"Lcom/huami/message/ui/message/MessageAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/huami/message/vo/PrivateMessageItemVo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "resetCountHelper", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "onBindViewHolder", "getItemViewType", "getItemCount", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "observer", "registerAdapterDataObserver", "onViewAttachedToWindow", "Landroid/view/View;", "headerView", "setHeaderView", "getHeaderView", "praiseFavFollow", "setPraiseFavCollectRedDotVisible", "(Ljava/lang/Integer;)V", "commentCnt", "setCommentRedDotVisible", "refresh", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "message", "Lcom/huami/message/ui/message/OnPrivateMsgItemClickListener;", "a", "Lkotlin/jvm/functions/Function2;", "onMessageItemClickListener", "b", "Landroid/view/View;", "mHeaderView", "Lcom/huami/message/ui/base/adapter/AdapterDataObserverProxy;", "c", "Lcom/huami/message/ui/base/adapter/AdapterDataObserverProxy;", "adapterDataObserverProxy", "com/huami/message/ui/message/MessageAdapter$viewItemHelper$1", GoogleApiAvailabilityLight.a, "Lcom/huami/message/ui/message/MessageAdapter$viewItemHelper$1;", "viewItemHelper", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Companion", "HeaderViewHolder", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class MessageAdapter extends PagedListAdapter<PrivateMessageItemVo, RecyclerView.ViewHolder> {
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 99;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function2<Integer, PrivateMessageItemVo, Unit> onMessageItemClickListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private View mHeaderView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private AdapterDataObserverProxy adapterDataObserverProxy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MessageAdapter$viewItemHelper$1 viewItemHelper;

    @NotNull
    private static final MessageAdapter$Companion$DIFF_CALLBACK$1 h = new DiffUtil.ItemCallback<PrivateMessageItemVo>() { // from class: com.huami.message.ui.message.MessageAdapter$Companion$DIFF_CALLBACK$1
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(@NotNull PrivateMessageItemVo oldItem, @NotNull PrivateMessageItemVo newItem) {
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(@NotNull PrivateMessageItemVo oldItem, @NotNull PrivateMessageItemVo newItem) {
            return oldItem.getId() == newItem.getId() && oldItem.getGenerateTime() == newItem.getGenerateTime();
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/message/ui/message/MessageAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
    public static final class HeaderViewHolder extends RecyclerView.ViewHolder {
        public HeaderViewHolder(@NotNull View view) {
            super(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.huami.message.ui.message.MessageAdapter$viewItemHelper$1] */
    public MessageAdapter(@NotNull Function2<? super Integer, ? super PrivateMessageItemVo, Unit> function2) {
        super(h);
        this.onMessageItemClickListener = function2;
        this.viewItemHelper = new CountListItemVisitHelper<PrivateMessageItemVo>() { // from class: com.huami.message.ui.message.MessageAdapter$viewItemHelper$1
            @Override // com.huami.message.utils.CountListItemVisitHelper
            public void count(int position, @NotNull PrivateMessageItemVo item) {
                if (item.getUserId() != null) {
                    MessageRecorderEventHelper.MessageCenterEventHelper.INSTANCE.messageChatView(item.getUserId());
                }
            }
        };
    }

    @Nullable
    /* JADX INFO: renamed from: getHeaderView, reason: from getter */
    public final View getMHeaderView() {
        return this.mHeaderView;
    }

    @Override // androidx.paging.PagedListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return super.getPagerCount() + (this.mHeaderView == null ? 0 : 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return (this.mHeaderView == null || position != 0) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        PrivateMessageItemVo item;
        int i = this.mHeaderView == null ? position : position - 1;
        if (getItemViewType(position) != 1 || (item = getItem(i)) == null) {
            return;
        }
        ((PrivateMessageViewHolder) holder).bind(item);
        put(item, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return viewType == 0 ? new HeaderViewHolder(this.mHeaderView) : new PrivateMessageViewHolder(parent, this.onMessageItemClickListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            return;
        }
        ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(holder.getItemViewType() == 0);
    }

    public final void refresh() {
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(@NotNull RecyclerView.AdapterDataObserver observer) {
        AdapterDataObserverProxy adapterDataObserverProxy = new AdapterDataObserverProxy(observer, this.mHeaderView == null ? 0 : 1);
        this.adapterDataObserverProxy = adapterDataObserverProxy;
        super.registerAdapterDataObserver(adapterDataObserverProxy);
    }

    public final void resetCountHelper() {
        clear();
    }

    public final void setCommentRedDotVisible(@Nullable Integer commentCnt) {
        View view = this.mHeaderView;
        if (view == null || commentCnt == null) {
            return;
        }
        commentCnt.intValue();
        TextView textView = (TextView) view.findViewById(R.id.tv_red_dot_comment);
        if (textView == null) {
            return;
        }
        textView.setTag(commentCnt);
        textView.setText(IntExKt.formatRedDotCount(commentCnt.intValue()));
        ViewExKt.setVisible(textView, commentCnt.intValue() > 0);
    }

    public final void setHeaderView(@NotNull View headerView) {
        this.mHeaderView = headerView;
        AdapterDataObserverProxy adapterDataObserverProxy = this.adapterDataObserverProxy;
        if (adapterDataObserverProxy != null) {
            adapterDataObserverProxy.setHeaderCount(1);
        }
        notifyItemInserted(0);
    }

    public final void setPraiseFavCollectRedDotVisible(@Nullable Integer praiseFavFollow) {
        View view = this.mHeaderView;
        if (view == null || praiseFavFollow == null) {
            return;
        }
        praiseFavFollow.intValue();
        TextView textView = (TextView) view.findViewById(R.id.tv_red_dot_like);
        if (textView == null) {
            return;
        }
        textView.setTag(praiseFavFollow);
        textView.setText(IntExKt.formatRedDotCount(praiseFavFollow.intValue()));
        ViewExKt.setVisible(textView, praiseFavFollow.intValue() > 0);
    }
}
