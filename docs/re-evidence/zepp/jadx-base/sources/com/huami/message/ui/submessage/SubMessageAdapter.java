package com.huami.message.ui.submessage;

import android.view.ViewGroup;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.message.dto.MessageSubType;
import com.huami.message.ui.base.adapter.AdapterDataObserverProxy;
import com.huami.message.ui.submessage.viewholder.AgreeCommentViewHolder;
import com.huami.message.ui.submessage.viewholder.AgreePostViewHolder;
import com.huami.message.ui.submessage.viewholder.FollowViewHolder;
import com.huami.message.ui.submessage.viewholder.GroupViewHolder;
import com.huami.message.ui.submessage.viewholder.MessageCommentViewHolder;
import com.huami.message.ui.submessage.viewholder.ReplyCommentViewHolder;
import com.huami.message.utils.CountListItemVisitHelper;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.huami.message.vo.SubMessageItemVo;
import com.huami.message.vo.SubMessageItemVoKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\b*\u0001$\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001*B\u0083\u0002\u0012:\u0010\u0016\u001a6\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00040\u000fj\u0002`\u0013\u0012>\u0010\u0019\u001a:\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fj\u0004\u0018\u0001`\u0017\u0012>\u0010\u001c\u001a:\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fj\u0004\u0018\u0001`\u001a\u0012>\u0010\u001f\u001a:\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fj\u0004\u0018\u0001`\u001d¢\u0006\u0004\b(\u0010)J\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016RJ\u0010\u0016\u001a6\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00040\u000fj\u0002`\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015RN\u0010\u0019\u001a:\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fj\u0004\u0018\u0001`\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015RN\u0010\u001c\u001a:\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fj\u0004\u0018\u0001`\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015RN\u0010\u001f\u001a:\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fj\u0004\u0018\u0001`\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/huami/message/ui/submessage/SubMessageAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/huami/message/vo/SubMessageItemVo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "resetCountHelper", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "onBindViewHolder", "getItemViewType", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "message", "Lcom/huami/message/ui/submessage/viewholder/OnSubMessageItemClickListener;", "a", "Lkotlin/jvm/functions/Function2;", "onMessageItemClickListener", "Lcom/huami/message/ui/submessage/viewholder/OnAvatarClickListener;", "b", "onAvatarClickListener", "Lcom/huami/message/ui/submessage/viewholder/OnReplyClickListener;", "c", "onReplyClickListener", "Lcom/huami/message/ui/submessage/viewholder/OnFollowClickListener;", GoogleApiAvailabilityLight.a, "onFollowClickListener", "Lcom/huami/message/ui/base/adapter/AdapterDataObserverProxy;", "e", "Lcom/huami/message/ui/base/adapter/AdapterDataObserverProxy;", "adapterDataObserverProxy", "com/huami/message/ui/submessage/SubMessageAdapter$messageHelper$1", "f", "Lcom/huami/message/ui/submessage/SubMessageAdapter$messageHelper$1;", "messageHelper", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "Companion", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class SubMessageAdapter extends PagedListAdapter<SubMessageItemVo, RecyclerView.ViewHolder> {
    public static final int ITEM_TYPE_NEWS = 0;
    public static final int ITEM_TYPE_READ = 1;
    private static final int g = 2;
    private static final int h = 3;
    private static final int i = 4;
    private static final int j = 5;
    private static final int k = 6;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function2<Integer, SubMessageItemVo, Unit> onMessageItemClickListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Function2<Integer, SubMessageItemVo, Unit> onAvatarClickListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final Function2<Integer, SubMessageItemVo, Unit> onReplyClickListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final Function2<Integer, SubMessageItemVo, Unit> onFollowClickListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private AdapterDataObserverProxy adapterDataObserverProxy;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final SubMessageAdapter$messageHelper$1 messageHelper;

    @NotNull
    private static final SubMessageAdapter$Companion$DIFF_CALLBACK$1 l = new DiffUtil.ItemCallback<SubMessageItemVo>() { // from class: com.huami.message.ui.submessage.SubMessageAdapter$Companion$DIFF_CALLBACK$1
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(@NotNull SubMessageItemVo oldItem, @NotNull SubMessageItemVo newItem) {
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(@NotNull SubMessageItemVo oldItem, @NotNull SubMessageItemVo newItem) {
            return oldItem.getMessageId() == newItem.getMessageId() && Intrinsics.areEqual(oldItem.getGeneratedTime(), newItem.getGeneratedTime());
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.huami.message.ui.submessage.SubMessageAdapter$messageHelper$1] */
    public SubMessageAdapter(@NotNull Function2<? super Integer, ? super SubMessageItemVo, Unit> function2, @Nullable Function2<? super Integer, ? super SubMessageItemVo, Unit> function3, @Nullable Function2<? super Integer, ? super SubMessageItemVo, Unit> function4, @Nullable Function2<? super Integer, ? super SubMessageItemVo, Unit> function5) {
        super(l);
        this.onMessageItemClickListener = function2;
        this.onAvatarClickListener = function3;
        this.onReplyClickListener = function4;
        this.onFollowClickListener = function5;
        this.messageHelper = new CountListItemVisitHelper<SubMessageItemVo>() { // from class: com.huami.message.ui.submessage.SubMessageAdapter$messageHelper$1

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[MessageSubType.values().length];
                    iArr[MessageSubType.AGREE_COMMENT.ordinal()] = 1;
                    iArr[MessageSubType.AGREE_SECOND_COMMENT.ordinal()] = 2;
                    iArr[MessageSubType.AGREE_POST.ordinal()] = 3;
                    iArr[MessageSubType.COLLECT.ordinal()] = 4;
                    iArr[MessageSubType.COMMENT.ordinal()] = 5;
                    iArr[MessageSubType.REPLY_SECOND_COMMENT.ordinal()] = 6;
                    iArr[MessageSubType.REPLY_COMMENT.ordinal()] = 7;
                    iArr[MessageSubType.FOLLOW.ordinal()] = 8;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.huami.message.utils.CountListItemVisitHelper
            public void count(int position, @NotNull SubMessageItemVo item) {
                MessageSubType messageSubType = item.getMessageSubType();
                switch (messageSubType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[messageSubType.ordinal()]) {
                    case 1:
                        MessageRecorderEventHelper.AwesomeAttentionCollectionHelper awesomeAttentionCollectionHelper = MessageRecorderEventHelper.AwesomeAttentionCollectionHelper.INSTANCE;
                        awesomeAttentionCollectionHelper.awesomeAttentionCollectionMessageShow(awesomeAttentionCollectionHelper.getTYPE_MESSAGE_AGREE_COMMENT(), SubMessageItemVoKt.getStatus(item), String.valueOf(item.getMessageId()));
                        break;
                    case 2:
                        MessageRecorderEventHelper.AwesomeAttentionCollectionHelper awesomeAttentionCollectionHelper2 = MessageRecorderEventHelper.AwesomeAttentionCollectionHelper.INSTANCE;
                        awesomeAttentionCollectionHelper2.awesomeAttentionCollectionMessageShow(awesomeAttentionCollectionHelper2.getTYPE_MESSAGE_AGREE_REPLY(), SubMessageItemVoKt.getStatus(item), String.valueOf(item.getMessageId()));
                        break;
                    case 3:
                        MessageRecorderEventHelper.AwesomeAttentionCollectionHelper awesomeAttentionCollectionHelper3 = MessageRecorderEventHelper.AwesomeAttentionCollectionHelper.INSTANCE;
                        awesomeAttentionCollectionHelper3.awesomeAttentionCollectionMessageShow(awesomeAttentionCollectionHelper3.getTYPE_MESSAGE_AGREE_DYNAMIC(), SubMessageItemVoKt.getStatus(item), String.valueOf(item.getMessageId()));
                        break;
                    case 4:
                        MessageRecorderEventHelper.AwesomeAttentionCollectionHelper awesomeAttentionCollectionHelper4 = MessageRecorderEventHelper.AwesomeAttentionCollectionHelper.INSTANCE;
                        awesomeAttentionCollectionHelper4.awesomeAttentionCollectionMessageShow(awesomeAttentionCollectionHelper4.getTYPE_MESSAGE_COLLECT_DYNAMIC(), SubMessageItemVoKt.getStatus(item), String.valueOf(item.getMessageId()));
                        break;
                    case 5:
                        MessageRecorderEventHelper.CommentReplyHelper commentReplyHelper = MessageRecorderEventHelper.CommentReplyHelper.INSTANCE;
                        commentReplyHelper.commentReplyMessage(commentReplyHelper.getCOMMENT_DYNAMIC(), SubMessageItemVoKt.getStatus(item), String.valueOf(item.getMessageId()));
                        break;
                    case 6:
                        MessageRecorderEventHelper.CommentReplyHelper commentReplyHelper2 = MessageRecorderEventHelper.CommentReplyHelper.INSTANCE;
                        commentReplyHelper2.commentReplyMessage(commentReplyHelper2.getCOMMENT_REPLY(), SubMessageItemVoKt.getStatus(item), String.valueOf(item.getMessageId()));
                        break;
                    case 7:
                        MessageRecorderEventHelper.CommentReplyHelper commentReplyHelper3 = MessageRecorderEventHelper.CommentReplyHelper.INSTANCE;
                        commentReplyHelper3.commentReplyMessage(commentReplyHelper3.getCOMMENT_COMMENT(), SubMessageItemVoKt.getStatus(item), String.valueOf(item.getMessageId()));
                        break;
                    case 8:
                        MessageRecorderEventHelper.AwesomeAttentionCollectionHelper awesomeAttentionCollectionHelper5 = MessageRecorderEventHelper.AwesomeAttentionCollectionHelper.INSTANCE;
                        awesomeAttentionCollectionHelper5.awesomeAttentionCollectionMessageShow(awesomeAttentionCollectionHelper5.getTYPE_MESSAGE_AGREE_FOLLOW(), SubMessageItemVoKt.getStatus(item), String.valueOf(item.getMessageId()));
                        break;
                }
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        SubMessageItemVo item = getItem(position);
        if (item != null) {
            MessageSubType messageSubType = item.getMessageSubType();
            if (MessageSubType.COMMENT_LATEST == messageSubType || MessageSubType.AGREE_LATEST == messageSubType) {
                return 0;
            }
            if (MessageSubType.COMMENT_HISTORY == messageSubType || MessageSubType.AGREE_HISTORY == messageSubType) {
                return 1;
            }
            if (MessageSubType.AGREE_POST == messageSubType || MessageSubType.COLLECT == messageSubType) {
                return 2;
            }
            if (MessageSubType.FOLLOW == messageSubType) {
                return 3;
            }
            if (MessageSubType.AGREE_COMMENT == messageSubType || MessageSubType.AGREE_SECOND_COMMENT == messageSubType) {
                return 4;
            }
            if (MessageSubType.COMMENT == messageSubType || MessageSubType.REPLY_SECOND_COMMENT == messageSubType) {
                return 5;
            }
            if (MessageSubType.REPLY_COMMENT == messageSubType) {
                return 6;
            }
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        SubMessageItemVo item;
        SubMessageItemVo item2;
        SubMessageItemVo item3;
        SubMessageItemVo item4;
        SubMessageItemVo item5;
        SubMessageItemVo item6;
        if (getItemViewType(position) == 0) {
            ((GroupViewHolder) holder).bind(0);
        }
        if (getItemViewType(position) == 1) {
            ((GroupViewHolder) holder).bind(1);
        }
        if (getItemViewType(position) == 2 && (item6 = getItem(position)) != null) {
            ((AgreePostViewHolder) holder).bind(item6);
        }
        if (getItemViewType(position) == 3 && (item5 = getItem(position)) != null) {
            ((FollowViewHolder) holder).bind(item5);
        }
        if (getItemViewType(position) == 4 && (item4 = getItem(position)) != null) {
            ((AgreeCommentViewHolder) holder).bind(item4);
        }
        if (getItemViewType(position) == 5 && (item3 = getItem(position)) != null) {
            ((MessageCommentViewHolder) holder).bind(item3);
        }
        if (getItemViewType(position) == 6 && (item2 = getItem(position)) != null) {
            ((ReplyCommentViewHolder) holder).bind(item2);
        }
        if ((getItemViewType(position) == 2 || getItemViewType(position) == 3 || getItemViewType(position) == 4 || getItemViewType(position) == 5 || getItemViewType(position) == 6) && (item = getItem(position)) != null) {
            put(item, position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case 0:
            case 1:
                return new GroupViewHolder(parent);
            case 2:
                return new AgreePostViewHolder(parent, this.onMessageItemClickListener, this.onAvatarClickListener);
            case 3:
                return new FollowViewHolder(parent, this.onMessageItemClickListener, this.onFollowClickListener, this.onAvatarClickListener);
            case 4:
                return new AgreeCommentViewHolder(parent, this.onMessageItemClickListener, this.onAvatarClickListener);
            case 5:
                return new MessageCommentViewHolder(parent, this.onMessageItemClickListener, this.onAvatarClickListener, this.onReplyClickListener);
            case 6:
                return new ReplyCommentViewHolder(parent, this.onMessageItemClickListener, this.onAvatarClickListener, this.onReplyClickListener);
            default:
                return new AgreePostViewHolder(parent, this.onMessageItemClickListener, this.onAvatarClickListener);
        }
    }

    public final void resetCountHelper() {
        clear();
    }
}
