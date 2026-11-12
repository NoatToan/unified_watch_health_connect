package com.huami.message.ui.submessage.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.android.image.RoundImageView;
import com.huami.message.dto.FollowStatus;
import com.huami.message.ui.R;
import com.huami.message.ui.base.date.DateExKt;
import com.huami.message.ui.base.ext.ImageViewExKt;
import com.huami.message.ui.submessage.viewholder.FollowViewHolder;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.huami.message.vo.SubMessageItemVo;
import com.huami.message.vo.SubMessageItemVoKt;
import com.huami.widget.typeface.TypefaceTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BÕ\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012@\b\u0002\u0010\u000f\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\u0004\u0018\u0001`\f\u0012@\b\u0002\u0010\u0012\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\u0004\u0018\u0001`\u0010\u0012@\b\u0002\u0010\u0015\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002RN\u0010\u000f\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\u0004\u0018\u0001`\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eRN\u0010\u0012\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\u0004\u0018\u0001`\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eRN\u0010\u0015\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\u0004\u0018\u0001`\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/huami/message/ui/submessage/viewholder/FollowViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/message/vo/SubMessageItemVo;", "item", "", "bind", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "position", "message", "Lcom/huami/message/ui/submessage/viewholder/OnSubMessageItemClickListener;", "a", "Lkotlin/jvm/functions/Function2;", "onSubMessageItemClickListener", "Lcom/huami/message/ui/submessage/viewholder/OnFollowClickListener;", "b", "onFollowClickListener", "Lcom/huami/message/ui/submessage/viewholder/OnAvatarClickListener;", "c", "onAvatarClickListener", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class FollowViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Function2<Integer, SubMessageItemVo, Unit> onSubMessageItemClickListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Function2<Integer, SubMessageItemVo, Unit> onFollowClickListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final Function2<Integer, SubMessageItemVo, Unit> onAvatarClickListener;

    public /* synthetic */ FollowViewHolder(ViewGroup viewGroup, Function2 function2, Function2 function3, Function2 function4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, (i & 2) != 0 ? null : function2, (i & 4) != 0 ? null : function3, (i & 8) != 0 ? null : function4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(FollowViewHolder followViewHolder, SubMessageItemVo subMessageItemVo, View view) {
        Function2<Integer, SubMessageItemVo, Unit> function2 = followViewHolder.onAvatarClickListener;
        if (function2 == null) {
            return;
        }
        function2.invoke(Integer.valueOf(followViewHolder.getAdapterPosition()), subMessageItemVo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(FollowViewHolder followViewHolder, SubMessageItemVo subMessageItemVo, View view) {
        Function2<Integer, SubMessageItemVo, Unit> function2 = followViewHolder.onFollowClickListener;
        if (function2 == null) {
            return;
        }
        function2.invoke(Integer.valueOf(followViewHolder.getAdapterPosition()), subMessageItemVo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(FollowViewHolder followViewHolder, SubMessageItemVo subMessageItemVo, View view) {
        Function2<Integer, SubMessageItemVo, Unit> function2 = followViewHolder.onSubMessageItemClickListener;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(followViewHolder.getAdapterPosition()), subMessageItemVo);
        }
        MessageRecorderEventHelper.AwesomeAttentionCollectionHelper awesomeAttentionCollectionHelper = MessageRecorderEventHelper.AwesomeAttentionCollectionHelper.INSTANCE;
        awesomeAttentionCollectionHelper.awesomeAttentionCollectionMessageClick(awesomeAttentionCollectionHelper.getTYPE_MESSAGE_AGREE_FOLLOW(), SubMessageItemVoKt.getStatus(subMessageItemVo), String.valueOf(subMessageItemVo.getMessageId()));
    }

    public final void bind(@NotNull final SubMessageItemVo item) {
        View view = this.itemView;
        if (TextUtils.isEmpty(item.getIconUrl())) {
            ((RoundImageView) view.findViewById(R.id.iv_avatar)).setImageResource(R.drawable.mc_icon_avatar);
        }
        int i = R.id.iv_avatar;
        RoundImageView roundImageView = (RoundImageView) view.findViewById(i);
        if (roundImageView != null) {
            roundImageView.setOnClickListener(new View.OnClickListener() { // from class: w92
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    FollowViewHolder.d(this.a, item, view2);
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
        int i2 = R.id.bt_follow;
        TextView textView = (TextView) view.findViewById(i2);
        if (FollowStatus.FOLLOW == item.getFollowStatus() || FollowStatus.FOLLOW_EACH == item.getFollowStatus()) {
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), R.color.mc_btn_grey_text));
            textView.setBackground(ContextCompat.getDrawable(textView.getContext(), R.drawable.mc_shape_corner_grey_bg));
            textView.setText(textView.getContext().getText(R.string.mc_follow_btn_label));
        } else {
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), R.color.mc_orange));
            textView.setBackground(ContextCompat.getDrawable(textView.getContext(), R.drawable.mc_shape_corner_white_bg_orange_stroke));
            textView.setText(textView.getContext().getText(R.string.mc_un_follow_btn_label));
        }
        ((TextView) view.findViewById(i2)).setOnClickListener(new View.OnClickListener() { // from class: x92
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FollowViewHolder.e(this.a, item, view2);
            }
        });
        view.setOnClickListener(new View.OnClickListener() { // from class: v92
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FollowViewHolder.f(this.a, item, view2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FollowViewHolder(@NotNull ViewGroup viewGroup, @Nullable Function2<? super Integer, ? super SubMessageItemVo, Unit> function2, @Nullable Function2<? super Integer, ? super SubMessageItemVo, Unit> function3, @Nullable Function2<? super Integer, ? super SubMessageItemVo, Unit> function4) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mc_item_sub_message_follow, viewGroup, false));
        this.onSubMessageItemClickListener = function2;
        this.onFollowClickListener = function3;
        this.onAvatarClickListener = function4;
    }
}
