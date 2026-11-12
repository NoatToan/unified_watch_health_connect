package com.huami.message.ui.submessage.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.text.HtmlCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.android.image.RoundImageView;
import com.huami.message.dto.MessageSubType;
import com.huami.message.dto.ResourceType;
import com.huami.message.ui.R;
import com.huami.message.ui.base.date.DateExKt;
import com.huami.message.ui.base.ext.ImageViewExKt;
import com.huami.message.ui.base.ext.ViewExKt;
import com.huami.message.ui.submessage.viewholder.ReplyCommentViewHolder;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.huami.message.vo.SubMessageItemVo;
import com.huami.message.vo.SubMessageItemVoKt;
import com.huami.widget.typeface.TypefaceTextView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BÕ\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012@\b\u0002\u0010\u000f\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\u0004\u0018\u0001`\f\u0012@\b\u0002\u0010\u0012\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\u0004\u0018\u0001`\u0010\u0012@\b\u0002\u0010\u0015\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002RN\u0010\u000f\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\u0004\u0018\u0001`\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eRN\u0010\u0012\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\u0004\u0018\u0001`\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eRN\u0010\u0015\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\u0004\u0018\u0001`\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/huami/message/ui/submessage/viewholder/ReplyCommentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/message/vo/SubMessageItemVo;", "item", "", "bind", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "position", "message", "Lcom/huami/message/ui/submessage/viewholder/OnSubMessageItemClickListener;", "a", "Lkotlin/jvm/functions/Function2;", "onSubMessageItemClickListener", "Lcom/huami/message/ui/submessage/viewholder/OnAvatarClickListener;", "b", "onAvatarClickListener", "Lcom/huami/message/ui/submessage/viewholder/OnReplyClickListener;", "c", "onReplyClickListener", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class ReplyCommentViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Function2<Integer, SubMessageItemVo, Unit> onSubMessageItemClickListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Function2<Integer, SubMessageItemVo, Unit> onAvatarClickListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final Function2<Integer, SubMessageItemVo, Unit> onReplyClickListener;

    public /* synthetic */ ReplyCommentViewHolder(ViewGroup viewGroup, Function2 function2, Function2 function3, Function2 function4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, (i & 2) != 0 ? null : function2, (i & 4) != 0 ? null : function3, (i & 8) != 0 ? null : function4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ReplyCommentViewHolder replyCommentViewHolder, SubMessageItemVo subMessageItemVo, View view) {
        Function2<Integer, SubMessageItemVo, Unit> function2 = replyCommentViewHolder.onAvatarClickListener;
        if (function2 == null) {
            return;
        }
        function2.invoke(Integer.valueOf(replyCommentViewHolder.getAdapterPosition()), subMessageItemVo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ReplyCommentViewHolder replyCommentViewHolder, SubMessageItemVo subMessageItemVo, View view) {
        Function2<Integer, SubMessageItemVo, Unit> function2 = replyCommentViewHolder.onSubMessageItemClickListener;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(replyCommentViewHolder.getAdapterPosition()), subMessageItemVo);
        }
        MessageRecorderEventHelper.CommentReplyHelper commentReplyHelper = MessageRecorderEventHelper.CommentReplyHelper.INSTANCE;
        commentReplyHelper.commentReplyMessage(commentReplyHelper.getCOMMENT_REPLY(), SubMessageItemVoKt.getStatus(subMessageItemVo), String.valueOf(subMessageItemVo.getMessageId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ReplyCommentViewHolder replyCommentViewHolder, SubMessageItemVo subMessageItemVo, View view) {
        Function2<Integer, SubMessageItemVo, Unit> function2 = replyCommentViewHolder.onReplyClickListener;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(replyCommentViewHolder.getAdapterPosition()), subMessageItemVo);
        }
        MessageRecorderEventHelper.CommentReplyHelper.INSTANCE.commentReplyReplyClick(String.valueOf(subMessageItemVo.getMessageId()), String.valueOf(subMessageItemVo.getFolloweeId()), String.valueOf(subMessageItemVo.getFromFirstCommentId()), String.valueOf(subMessageItemVo.getFromPostId()));
    }

    public final void bind(@NotNull final SubMessageItemVo item) {
        View view = this.itemView;
        if (TextUtils.isEmpty(item.getIconUrl())) {
            ((RoundImageView) view.findViewById(R.id.iv_avatar)).setImageResource(R.drawable.mc_icon_avatar);
        }
        int i = R.id.iv_avatar;
        RoundImageView roundImageView = (RoundImageView) view.findViewById(i);
        if (roundImageView != null) {
            roundImageView.setOnClickListener(new View.OnClickListener() { // from class: xb6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ReplyCommentViewHolder.d(this.a, item, view2);
                }
            });
        }
        if (!TextUtils.isEmpty(item.getIconUrl()) && !Intrinsics.areEqual(item.getIconUrl(), ((RoundImageView) view.findViewById(i)).getTag(i))) {
            ImageViewExKt.loadUrlWithCorner((RoundImageView) view.findViewById(i), item.getIconUrl());
            ((RoundImageView) view.findViewById(i)).setTag(i, item.getIconUrl());
        }
        ((TypefaceTextView) view.findViewById(R.id.tv_nickname)).setText(item.getNickName());
        if (item.getGenerateTime() != null) {
            ((TypefaceTextView) view.findViewById(R.id.tv_time)).setText(DateExKt.parseMillisToShow(view.getContext(), item.getGenerateTime().longValue()));
        }
        String str = null;
        if (MessageSubType.REPLY_COMMENT == item.getMessageSubType()) {
            ((TypefaceTextView) view.findViewById(R.id.tv_type_label)).setText(view.getContext().getString(R.string.mc_reply_comment));
            ((TypefaceTextView) view.findViewById(R.id.tv_text)).setText(item.getText());
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] objArr = new Object[2];
            objArr[0] = view.getContext().getString(R.string.mc_sub_message_comment);
            String subText = item.getSubText();
            if (subText == null) {
                subText = "";
            }
            objArr[1] = subText;
            str = String.format("<font color='#d8d8d8'>%s</font><font color='#333333'>%s</font>", Arrays.copyOf(objArr, 2));
        }
        if (str != null) {
            ((TypefaceTextView) view.findViewById(R.id.iv_sub_text)).setText(HtmlCompat.fromHtml(str, 0));
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: vb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ReplyCommentViewHolder.e(this.a, item, view2);
            }
        });
        TypefaceTextView typefaceTextView = (TypefaceTextView) view.findViewById(R.id.tv_reply_label);
        if (typefaceTextView != null) {
            typefaceTextView.setOnClickListener(new View.OnClickListener() { // from class: wb6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ReplyCommentViewHolder.f(this.a, item, view2);
                }
            });
            ViewExKt.expendTouchArea(typefaceTextView, 12);
        }
        if (ResourceType.VIDEO == item.getResourceType()) {
            ((ImageView) view.findViewById(R.id.iv_iv_thumbnail_icon)).setVisibility(0);
            ((TypefaceTextView) view.findViewById(R.id.iv_thumbnail_text)).setVisibility(4);
            int i2 = R.id.iv_thumbnail;
            ((ImageView) view.findViewById(i2)).setVisibility(0);
            ImageViewExKt.loadUrlWithCorner((ImageView) view.findViewById(i2), item.getResource(), Float.valueOf(ViewExKt.dpToPx(view, 4.0f)));
            return;
        }
        if (ResourceType.IMAGE == item.getResourceType()) {
            ((ImageView) view.findViewById(R.id.iv_iv_thumbnail_icon)).setVisibility(4);
            ((TypefaceTextView) view.findViewById(R.id.iv_thumbnail_text)).setVisibility(4);
            int i3 = R.id.iv_thumbnail;
            ((ImageView) view.findViewById(i3)).setVisibility(0);
            ImageViewExKt.loadUrlWithCorner((ImageView) view.findViewById(i3), item.getResource(), Float.valueOf(ViewExKt.dpToPx(view, 4.0f)));
            return;
        }
        if (TextUtils.isEmpty(item.getDescription())) {
            return;
        }
        ((ImageView) view.findViewById(R.id.iv_thumbnail)).setVisibility(4);
        ((ImageView) view.findViewById(R.id.iv_iv_thumbnail_icon)).setVisibility(4);
        int i4 = R.id.iv_thumbnail_text;
        ((TypefaceTextView) view.findViewById(i4)).setVisibility(0);
        ((TypefaceTextView) view.findViewById(i4)).setText(item.getDescription());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplyCommentViewHolder(@NotNull ViewGroup viewGroup, @Nullable Function2<? super Integer, ? super SubMessageItemVo, Unit> function2, @Nullable Function2<? super Integer, ? super SubMessageItemVo, Unit> function3, @Nullable Function2<? super Integer, ? super SubMessageItemVo, Unit> function4) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mc_item_sub_message_reply_comment, viewGroup, false));
        this.onSubMessageItemClickListener = function2;
        this.onAvatarClickListener = function3;
        this.onReplyClickListener = function4;
    }
}
