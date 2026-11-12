package com.huami.message.ui.notification;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.message.dto.GroupExType;
import com.huami.message.ui.base.ext.MessageStatusExKt;
import com.huami.message.ui.base.ext.NotificationItemVoExKt;
import com.huami.message.ui.submessage.viewholder.GroupViewHolder;
import com.huami.message.utils.CountListItemVisitHelper;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.huami.message.vo.NotificationItemVo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\b*\u0001\u001b\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001!BK\u0012:\u0010\u0016\u001a6\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00040\u000fj\u0002`\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016RJ\u0010\u0016\u001a6\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00040\u000fj\u0002`\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/huami/message/ui/notification/NotificationAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/huami/message/vo/NotificationItemVo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "resetCountHelper", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "onBindViewHolder", "getItemViewType", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "vo", "Lcom/huami/message/ui/notification/OnItemNotificationListener;", "a", "Lkotlin/jvm/functions/Function2;", "mOnItemNotificationListener", "", "b", "Z", "isOutSide", "com/huami/message/ui/notification/NotificationAdapter$viewItemHelper$1", "c", "Lcom/huami/message/ui/notification/NotificationAdapter$viewItemHelper$1;", "viewItemHelper", "<init>", "(Lkotlin/jvm/functions/Function2;Z)V", "Companion", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class NotificationAdapter extends PagedListAdapter<NotificationItemVo, RecyclerView.ViewHolder> {
    public static final int ITEM_TYPE_NEWS = 3;
    public static final int ITEM_TYPE_NORMAL = 2;
    public static final int ITEM_TYPE_READ = 4;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function2<Integer, NotificationItemVo, Unit> mOnItemNotificationListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isOutSide;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final NotificationAdapter$viewItemHelper$1 viewItemHelper;

    @NotNull
    private static final NotificationAdapter$Companion$DIFF_CALLBACK$1 d = new DiffUtil.ItemCallback<NotificationItemVo>() { // from class: com.huami.message.ui.notification.NotificationAdapter$Companion$DIFF_CALLBACK$1
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(@NotNull NotificationItemVo oldItem, @NotNull NotificationItemVo newItem) {
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(@NotNull NotificationItemVo oldItem, @NotNull NotificationItemVo newItem) {
            return oldItem.getMessageId() == newItem.getMessageId() && Intrinsics.areEqual(oldItem.getGenerateTime(), newItem.getGenerateTime());
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.huami.message.ui.notification.NotificationAdapter$viewItemHelper$1] */
    public NotificationAdapter(@NotNull Function2<? super Integer, ? super NotificationItemVo, Unit> function2, boolean z) {
        super(d);
        this.mOnItemNotificationListener = function2;
        this.isOutSide = z;
        this.viewItemHelper = new CountListItemVisitHelper<NotificationItemVo>() { // from class: com.huami.message.ui.notification.NotificationAdapter$viewItemHelper$1
            @Override // com.huami.message.utils.CountListItemVisitHelper
            public void count(int position, @NotNull NotificationItemVo item) {
                MessageRecorderEventHelper.MessageCenterEventHelper.INSTANCE.viewNotification(NotificationItemVoExKt.getTypeForRecord(item), String.valueOf(item.getMessageId()), MessageStatusExKt.getStatusForRecord(item.getStatus()));
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        NotificationItemVo item = getItem(position);
        if (item == null) {
            return 2;
        }
        if (TextUtils.equals(item.getGroupExType(), GroupExType.NOTICE_LATEST.getValue())) {
            return 3;
        }
        return TextUtils.equals(item.getGroupExType(), GroupExType.NOTICE_HISTORY.getValue()) ? 4 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == 3) {
            ((GroupViewHolder) holder).bind(3);
            return;
        }
        if (getItemViewType(position) == 4) {
            ((GroupViewHolder) holder).bind(4);
            return;
        }
        ((NotificationViewHolder) holder).bind(getItem(position));
        NotificationItemVo item = getItem(position);
        if (item == null) {
            return;
        }
        put(item, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return (viewType == 3 || viewType == 4) ? new GroupViewHolder(parent) : new NotificationViewHolder(parent, this.mOnItemNotificationListener, this.isOutSide);
    }

    public final void resetCountHelper() {
        clear();
    }
}
