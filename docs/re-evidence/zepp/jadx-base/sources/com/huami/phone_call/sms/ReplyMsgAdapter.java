package com.huami.phone_call.sms;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.phone_call.sms.ReplyMsgAdapter;
import com.huami.phone_call.sms.ReplyMsgAdapter.MsgItem;
import com.huami.phone_call.sms.base.XRecyclerViewDragAdapter;
import com.huami.phone_call.sms.ktx.ViewKt;
import com.huami.tools.analytics.DbUtils;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.zhouyou.recyclerview.adapter.HelperRecyclerViewHolder;
import com.zhouyou.recyclerview.swipemenu.SwipeMenuLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 %*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002&'B=\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0014\u0012\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0017¢\u0006\u0004\b#\u0010$J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J'\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0012H\u0016R\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R(\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010 \u001a\u00020\u001b8\u0014@\u0014X\u0094D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006("}, d2 = {"Lcom/huami/phone_call/sms/ReplyMsgAdapter;", "Lcom/huami/phone_call/sms/ReplyMsgAdapter$MsgItem;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/phone_call/sms/base/XRecyclerViewDragAdapter;", "Landroid/view/View;", "itemView", "", "position", "", "l", ViewHierarchyConstants.VIEW_KEY, DTransferConstants.SEARCH_KEY, "Lcom/zhouyou/recyclerview/adapter/HelperRecyclerViewHolder;", "viewHolder", "m", "item", "HelperBindData", "(Lcom/zhouyou/recyclerview/adapter/HelperRecyclerViewHolder;ILcom/huami/phone_call/sms/ReplyMsgAdapter$MsgItem;)V", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onItemDragEnd", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "onEdit", "Lkotlin/Function2;", "r", "Lkotlin/jvm/functions/Function2;", "onDelete", "", SOAP.XMLNS, "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "t", "a", "MsgItem", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
public final class ReplyMsgAdapter<T extends MsgItem> extends XRecyclerViewDragAdapter<T> {

    @Deprecated
    public static final float MENU_END_MARGIN = 15.0f;

    @Deprecated
    @NotNull
    public static final String TAG = "ReplyMsgAdapter";

    @NotNull
    private static final a t = new a(null);

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final Function1<T, Unit> onEdit;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final Function2<Integer, T, Unit> onDelete;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/huami/phone_call/sms/ReplyMsgAdapter$MsgItem;", "", "", "content", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
    public interface MsgItem {
        @NotNull
        String content();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/huami/phone_call/sms/ReplyMsgAdapter$a", "", "", "MENU_END_MARGIN", "F", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplyMsgAdapter(@NotNull Context context, @NotNull Function1<? super T, Unit> function1, @NotNull Function2<? super Integer, ? super T, Unit> function2) {
        super(context, R.layout.item_call_reply_msg_with_menu);
        this.onEdit = function1;
        this.onDelete = function2;
        this.tag = TAG;
    }

    private final void l(View itemView, int position) {
        if (position == 0) {
            itemView.setBackgroundResource(R.drawable.bg_round_corner_item_first);
        } else if (position == getFragmentsCount() - 1) {
            itemView.setBackgroundResource(R.drawable.bg_round_corner_item_last);
        } else {
            itemView.setBackgroundColor(-1);
        }
    }

    private final void m(HelperRecyclerViewHolder viewHolder, final int position) {
        viewHolder.setOnClickListener(R.id.iv_quick_delete, new View.OnClickListener() { // from class: ac6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReplyMsgAdapter.n(this.a, position, view);
            }
        });
        viewHolder.setOnClickListener(R.id.iv_edit, new View.OnClickListener() { // from class: zb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReplyMsgAdapter.o(this.a, position, view);
            }
        });
        viewHolder.setOnClickListener(R.id.iv_delete, new View.OnClickListener() { // from class: yb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReplyMsgAdapter.p(this.a, position, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(ReplyMsgAdapter replyMsgAdapter, int i, View view) {
        MsgItem msgItem = (MsgItem) replyMsgAdapter.getData(i);
        if (msgItem == null) {
            return;
        }
        replyMsgAdapter.onDelete.invoke(Integer.valueOf(i), (T) msgItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(ReplyMsgAdapter replyMsgAdapter, int i, View view) {
        MsgItem msgItem = (MsgItem) replyMsgAdapter.getData(i);
        if (msgItem == null) {
            return;
        }
        replyMsgAdapter.onEdit.invoke((T) msgItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(ReplyMsgAdapter replyMsgAdapter, int i, View view) {
        MsgItem msgItem = (MsgItem) replyMsgAdapter.getData(i);
        if (msgItem == null) {
            return;
        }
        replyMsgAdapter.onDelete.invoke(Integer.valueOf(i), (T) msgItem);
    }

    private final void q(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd((int) ViewKt.dp2px(view, 15.0f));
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // com.huami.phone_call.sms.base.XRecyclerViewDragAdapter
    @NotNull
    public String getTag() {
        return this.tag;
    }

    @Override // com.huami.phone_call.sms.base.XRecyclerViewDragAdapter, com.zhouyou.recyclerview.adapter.HelperRecyclerViewDragAdapter
    public void onItemDragEnd(@NotNull RecyclerView.ViewHolder viewHolder) {
        super.onItemDragEnd(viewHolder);
        if (isItemDraggable()) {
            notifyDataSetChanged();
        }
    }

    @Override // com.zhouyou.recyclerview.adapter.HelperRecyclerViewAdapter
    public void HelperBindData(@NotNull HelperRecyclerViewHolder viewHolder, int position, @NotNull T item) {
        viewHolder.setText(R.id.tv_text, item.content());
        viewHolder.setVisible(R.id.iv_quick_delete, isItemDraggable());
        viewHolder.setVisible(R.id.iv_drag, isItemDraggable());
        m(viewHolder, position);
        q(viewHolder.getView(R.id.iv_delete));
        View view = viewHolder.itemView;
        if (view instanceof SwipeMenuLayout) {
            ((SwipeMenuLayout) view).setSwipeEnable(!isItemDraggable());
        }
    }
}
