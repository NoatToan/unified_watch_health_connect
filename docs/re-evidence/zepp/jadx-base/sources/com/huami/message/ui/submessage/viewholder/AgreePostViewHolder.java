package com.huami.message.ui.submessage.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.android.image.RoundImageView;
import com.huami.message.dto.MessageSubType;
import com.huami.message.dto.ResourceType;
import com.huami.message.ui.R;
import com.huami.message.ui.base.date.DateExKt;
import com.huami.message.ui.base.ext.ImageViewExKt;
import com.huami.message.ui.base.ext.ViewExKt;
import com.huami.message.ui.submessage.viewholder.AgreePostViewHolder;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012@\b\u0002\u0010\u000f\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\u0004\u0018\u0001`\f\u0012@\b\u0002\u0010\u0012\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002RN\u0010\u000f\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\u0004\u0018\u0001`\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eRN\u0010\u0012\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\u0004\u0018\u0001`\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/huami/message/ui/submessage/viewholder/AgreePostViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/message/vo/SubMessageItemVo;", "item", "", "bind", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "position", "message", "Lcom/huami/message/ui/submessage/viewholder/OnSubMessageItemClickListener;", "a", "Lkotlin/jvm/functions/Function2;", "onSubMessageItemClickListener", "Lcom/huami/message/ui/submessage/viewholder/OnAvatarClickListener;", "b", "onAvatarClickListener", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class AgreePostViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Function2<Integer, SubMessageItemVo, Unit> onSubMessageItemClickListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Function2<Integer, SubMessageItemVo, Unit> onAvatarClickListener;

    public /* synthetic */ AgreePostViewHolder(ViewGroup viewGroup, Function2 function2, Function2 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, (i & 2) != 0 ? null : function2, (i & 4) != 0 ? null : function3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AgreePostViewHolder agreePostViewHolder, SubMessageItemVo subMessageItemVo, View view) {
        Function2<Integer, SubMessageItemVo, Unit> function2 = agreePostViewHolder.onAvatarClickListener;
        if (function2 == null) {
            return;
        }
        function2.invoke(Integer.valueOf(agreePostViewHolder.getAdapterPosition()), subMessageItemVo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AgreePostViewHolder agreePostViewHolder, SubMessageItemVo subMessageItemVo, View view) {
        Function2<Integer, SubMessageItemVo, Unit> function2 = agreePostViewHolder.onSubMessageItemClickListener;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(agreePostViewHolder.getAdapterPosition()), subMessageItemVo);
        }
        if (MessageSubType.AGREE_POST == subMessageItemVo.getMessageSubType()) {
            MessageRecorderEventHelper.AwesomeAttentionCollectionHelper awesomeAttentionCollectionHelper = MessageRecorderEventHelper.AwesomeAttentionCollectionHelper.INSTANCE;
            awesomeAttentionCollectionHelper.awesomeAttentionCollectionMessageClick(awesomeAttentionCollectionHelper.getTYPE_MESSAGE_AGREE_DYNAMIC(), SubMessageItemVoKt.getStatus(subMessageItemVo), String.valueOf(subMessageItemVo.getMessageId()));
        }
        if (MessageSubType.COLLECT == subMessageItemVo.getMessageSubType()) {
            MessageRecorderEventHelper.AwesomeAttentionCollectionHelper awesomeAttentionCollectionHelper2 = MessageRecorderEventHelper.AwesomeAttentionCollectionHelper.INSTANCE;
            awesomeAttentionCollectionHelper2.awesomeAttentionCollectionMessageClick(awesomeAttentionCollectionHelper2.getTYPE_MESSAGE_COLLECT_DYNAMIC(), SubMessageItemVoKt.getStatus(subMessageItemVo), String.valueOf(subMessageItemVo.getMessageId()));
        }
    }

    public final void bind(@NotNull final SubMessageItemVo item) {
        View view = this.itemView;
        if (TextUtils.isEmpty(item.getIconUrl())) {
            ((RoundImageView) view.findViewById(R.id.iv_avatar)).setImageResource(R.drawable.mc_icon_avatar);
        }
        int i = R.id.iv_avatar;
        RoundImageView roundImageView = (RoundImageView) view.findViewById(i);
        if (roundImageView != null) {
            roundImageView.setOnClickListener(new View.OnClickListener() { // from class: la
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AgreePostViewHolder.c(this.a, item, view2);
                }
            });
        }
        if (!TextUtils.isEmpty(item.getIconUrl()) && !Intrinsics.areEqual(item.getIconUrl(), ((RoundImageView) view.findViewById(i)).getTag(i))) {
            ImageViewExKt.loadUrlWithCorner((RoundImageView) view.findViewById(i), item.getIconUrl());
            ((RoundImageView) view.findViewById(i)).setTag(i, item.getIconUrl());
        }
        ((TypefaceTextView) view.findViewById(R.id.tv_nickname)).setText(item.getNickName());
        if (MessageSubType.AGREE_POST == item.getMessageSubType()) {
            ((TypefaceTextView) view.findViewById(R.id.tv_type_label)).setText(view.getContext().getString(R.string.mc_likes_post));
        }
        if (MessageSubType.COLLECT == item.getMessageSubType()) {
            ((TypefaceTextView) view.findViewById(R.id.tv_type_label)).setText(view.getContext().getString(R.string.mc_collect_post));
        }
        if (item.getGenerateTime() != null) {
            ((TypefaceTextView) view.findViewById(R.id.tv_time)).setText(DateExKt.parseMillisToShow(view.getContext(), item.getGenerateTime().longValue()));
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: ka
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AgreePostViewHolder.d(this.a, item, view2);
            }
        });
        if (ResourceType.VIDEO == item.getResourceType()) {
            ((ImageView) view.findViewById(R.id.iv_iv_thumbnail_icon)).setVisibility(0);
            ((TypefaceTextView) view.findViewById(R.id.iv_thumbnail_text)).setVisibility(8);
            int i2 = R.id.iv_thumbnail;
            ((ImageView) ((ImageView) view.findViewById(i2)).findViewById(i2)).setVisibility(0);
            ImageViewExKt.loadUrlWithCorner((ImageView) view.findViewById(i2), item.getResource(), Float.valueOf(ViewExKt.dpToPx(view, 4.0f)));
            return;
        }
        if (ResourceType.IMAGE != item.getResourceType()) {
            if (TextUtils.isEmpty(item.getDescription())) {
                return;
            }
            ((ImageView) view.findViewById(R.id.iv_thumbnail)).setVisibility(8);
            ((ImageView) view.findViewById(R.id.iv_iv_thumbnail_icon)).setVisibility(8);
            int i3 = R.id.iv_thumbnail_text;
            ((TypefaceTextView) view.findViewById(i3)).setVisibility(0);
            ((TypefaceTextView) view.findViewById(i3)).setText(item.getDescription());
            return;
        }
        ((ImageView) view.findViewById(R.id.iv_iv_thumbnail_icon)).setVisibility(8);
        ((TypefaceTextView) view.findViewById(R.id.iv_thumbnail_text)).setVisibility(8);
        int i4 = R.id.iv_thumbnail;
        ((ImageView) ((ImageView) view.findViewById(i4)).findViewById(i4)).setVisibility(0);
        ImageView imageView = (ImageView) view.findViewById(i4);
        if (imageView == null) {
            return;
        }
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ImageViewExKt.loadUrlWithCorner(imageView, item.getResource(), Float.valueOf(ViewExKt.dpToPx((View) imageView, 4.0f)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgreePostViewHolder(@NotNull ViewGroup viewGroup, @Nullable Function2<? super Integer, ? super SubMessageItemVo, Unit> function2, @Nullable Function2<? super Integer, ? super SubMessageItemVo, Unit> function3) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mc_item_sub_message_agree_post, viewGroup, false));
        this.onSubMessageItemClickListener = function2;
        this.onAvatarClickListener = function3;
    }
}
