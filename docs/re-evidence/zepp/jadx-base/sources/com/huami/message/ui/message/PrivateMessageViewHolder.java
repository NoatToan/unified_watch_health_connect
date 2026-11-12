package com.huami.message.ui.message;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.android.image.RoundImageView;
import com.huami.message.dto.MessageStatus;
import com.huami.message.ui.R;
import com.huami.message.ui.base.date.DateExKt;
import com.huami.message.ui.base.ext.ImageViewExKt;
import com.huami.message.ui.base.ext.IntExKt;
import com.huami.message.ui.message.PrivateMessageViewHolder;
import com.huami.message.vo.PrivateMessageItemVo;
import com.huami.widget.typeface.TypefaceTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012@\b\u0002\u0010\u000f\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\u0004\u0018\u0001`\f¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002RN\u0010\u000f\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\u0004\u0018\u0001`\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/huami/message/ui/message/PrivateMessageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/message/vo/PrivateMessageItemVo;", "item", "", "bind", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "position", "message", "Lcom/huami/message/ui/message/OnPrivateMsgItemClickListener;", "a", "Lkotlin/jvm/functions/Function2;", "onPrivateMsgItemClickListener", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function2;)V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class PrivateMessageViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Function2<Integer, PrivateMessageItemVo, Unit> onPrivateMsgItemClickListener;

    public /* synthetic */ PrivateMessageViewHolder(ViewGroup viewGroup, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, (i & 2) != 0 ? null : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(PrivateMessageViewHolder privateMessageViewHolder, PrivateMessageItemVo privateMessageItemVo, View view) {
        Function2<Integer, PrivateMessageItemVo, Unit> function2 = privateMessageViewHolder.onPrivateMsgItemClickListener;
        if (function2 == null) {
            return;
        }
        function2.invoke(Integer.valueOf(privateMessageViewHolder.getAdapterPosition()), privateMessageItemVo);
    }

    public final void bind(@NotNull final PrivateMessageItemVo item) {
        View view = this.itemView;
        if (TextUtils.isEmpty(item.getAvatar())) {
            ((RoundImageView) view.findViewById(R.id.iv_avatar)).setImageResource(R.drawable.mc_icon_avatar);
        }
        if (!TextUtils.isEmpty(item.getAvatar())) {
            String avatar = item.getAvatar();
            int i = R.id.iv_avatar;
            if (!Intrinsics.areEqual(avatar, ((RoundImageView) view.findViewById(i)).getTag(i))) {
                ImageViewExKt.loadUrlWithCorner((RoundImageView) view.findViewById(i), item.getAvatar());
                ((RoundImageView) view.findViewById(i)).setTag(i, item.getAvatar());
            }
        }
        ((TypefaceTextView) view.findViewById(R.id.tv_nickname)).setText(item.getNickName());
        ((TypefaceTextView) view.findViewById(R.id.tv_text)).setText(item.getContent());
        ((TypefaceTextView) view.findViewById(R.id.tv_time)).setText(DateExKt.parseMillisToShow(view.getContext(), item.getGenerateTime()));
        if (item.getMsgStatus() == MessageStatus.NEW) {
            int i2 = R.id.tv_badge;
            ((TypefaceTextView) view.findViewById(i2)).setVisibility(0);
            TypefaceTextView typefaceTextView = (TypefaceTextView) view.findViewById(i2);
            Integer count = item.getCount();
            typefaceTextView.setText(count == null ? null : IntExKt.formatRedDotCount(count.intValue()));
        } else {
            ((TypefaceTextView) view.findViewById(R.id.tv_badge)).setVisibility(4);
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: q36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PrivateMessageViewHolder.b(this.a, item, view2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PrivateMessageViewHolder(@NotNull ViewGroup viewGroup, @Nullable Function2<? super Integer, ? super PrivateMessageItemVo, Unit> function2) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mc_item_message, viewGroup, false));
        this.onPrivateMsgItemClickListener = function2;
    }
}
