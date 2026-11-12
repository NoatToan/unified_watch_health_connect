package com.huami.message.ui.notification;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.message.ui.R;
import com.huami.message.ui.base.date.DateExKt;
import com.huami.message.ui.base.ext.ImageViewExKt;
import com.huami.message.ui.base.ext.ViewExKt;
import com.huami.message.ui.notification.NotificationViewHolder;
import com.huami.message.vo.NotificationItemVo;
import com.huami.tools.log.HMLog;
import com.huami.widget.typeface.TypefaceTextView;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012:\u0010\u000f\u001a6\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\u0006j\u0002`\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002RJ\u0010\u000f\u001a6\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\u0006j\u0002`\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/huami/message/ui/notification/NotificationViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/message/vo/NotificationItemVo;", "item", "", "bind", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "position", "vo", "Lcom/huami/message/ui/notification/OnItemNotificationListener;", "a", "Lkotlin/jvm/functions/Function2;", "mOnItemNotificationListener", "", "b", "Z", "isOutSide", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function2;Z)V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class NotificationViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function2<Integer, NotificationItemVo, Unit> mOnItemNotificationListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isOutSide;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public final /* synthetic */ NotificationItemVo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NotificationItemVo notificationItemVo) {
            super(1);
            this.b = notificationItemVo;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            NotificationViewHolder.this.mOnItemNotificationListener.invoke(0, this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationViewHolder(@NotNull ViewGroup viewGroup, @NotNull Function2<? super Integer, ? super NotificationItemVo, Unit> function2, boolean z) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mc_item_notifitcation, viewGroup, false));
        this.mOnItemNotificationListener = function2;
        this.isOutSide = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(View view, NotificationItemVo notificationItemVo) {
        try {
            int i = R.id.mc_notification_sub_title;
            SpannableString spannableString = new SpannableString(Intrinsics.stringPlus(new StringBuilder(notificationItemVo == null ? null : notificationItemVo.getText()).insert(((int) Math.floor(((TypefaceTextView) view.findViewById(i)).getWidth() / (((TypefaceTextView) view.findViewById(i)).getLayout().getLineWidth(0) / (((TypefaceTextView) view.findViewById(i)).getLayout().getLineEnd(0) + 1)))) - 1, " ").toString(), "  "));
            Drawable drawable = view.getResources().getDrawable(R.drawable.mc_notification_more);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            spannableString.setSpan(new ImageSpan(drawable, 1), spannableString.length() - 1, spannableString.length(), 17);
            ((TypefaceTextView) view.findViewById(i)).setText(spannableString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void bind(@Nullable final NotificationItemVo item) {
        Long generateTime;
        final View view = this.itemView;
        ((TypefaceTextView) view.findViewById(R.id.mc_tv_title)).setText(item == null ? null : item.getTitle());
        int i = R.id.mc_notification_sub_title;
        ((TypefaceTextView) view.findViewById(i)).setText(item == null ? null : item.getText());
        ((TypefaceTextView) view.findViewById(i)).post(new Runnable() { // from class: lh5
            @Override // java.lang.Runnable
            public final void run() {
                NotificationViewHolder.b(view, item);
            }
        });
        String subTypeName = item == null ? null : item.getSubTypeName();
        if (TextUtils.isEmpty(subTypeName)) {
            subTypeName = item == null ? null : item.getTypeName();
        }
        int i2 = R.id.mc_notification_lable;
        ((TypefaceTextView) view.findViewById(i2)).setText(subTypeName);
        int i3 = R.id.mc_image_notification;
        ImageViewExKt.loadUrlWithCorner((ImageView) view.findViewById(i3), item != null ? item.getIconUrl() : null);
        int i4 = R.id.mc_notitfitcation_time;
        TypefaceTextView typefaceTextView = (TypefaceTextView) view.findViewById(i4);
        Context context = view.getContext();
        long jLongValue = 0;
        if (item != null && (generateTime = item.getGenerateTime()) != null) {
            jLongValue = generateTime.longValue();
        }
        typefaceTextView.setText(DateExKt.parseMillisToShow(context, jLongValue));
        HMLog.i("NotificationViewHolder", Intrinsics.stringPlus("isOutSide:", Boolean.valueOf(this.isOutSide)), new Object[0]);
        if (this.isOutSide) {
            ViewExKt.setVisible((TypefaceTextView) view.findViewById(i2), false);
            ViewGroup.LayoutParams layoutParams = ((TypefaceTextView) view.findViewById(i4)).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topToBottom = R.id.mc_lin;
            layoutParams2.leftToRight = i3;
            layoutParams2.rightToRight = -1;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = ViewExKt.dpToPx(view, 6);
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = ViewExKt.dpToPx(view, 8);
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = ViewExKt.dpToPx(view, 12);
        }
        ViewExKt.smartClick$default(view, 0L, new a(item), 1, null);
    }
}
