package com.xiaomi.fitness.notify.callnotify.smsreply;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import com.xiaomi.fitness.notify.callnotify.smsreply.SmsReplyPopupMenu;
import com.xiaomi.fitness.notify.extension.ExtUtilsKt;
import defpackage.m4i;
import defpackage.ozg;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u0007\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsReplyPopupMenu;", "Landroid/widget/PopupWindow;", "Lkotlin/Function1;", "Landroid/view/View;", "", "editListener", "deleteListener", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsReplyPopupMenu;", "anchor", "", "xoff", "yoff", "gravity", "show", "(Landroid/view/View;III)V", "Lozg;", "mViewBinding", "Lozg;", "viewBinding", "width", "height", "", "focusable", "<init>", "(Lozg;IIZ)V", "Companion", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SmsReplyPopupMenu extends PopupWindow {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ozg mViewBinding;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsReplyPopupMenu$Companion;", "", "<init>", "()V", "create", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsReplyPopupMenu;", "context", "Landroid/content/Context;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SmsReplyPopupMenu create(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ozg ozgVarA0 = ozg.A0(LayoutInflater.from(context), null, false);
            Intrinsics.checkNotNullExpressionValue(ozgVarA0, "inflate(...)");
            return new SmsReplyPopupMenu(ozgVarA0, ExtUtilsKt.getDp2px(167), -2, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmsReplyPopupMenu(@NotNull ozg viewBinding, int i, int i2, boolean z) {
        super(viewBinding.getRoot(), i, i2, z);
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        this.mViewBinding = viewBinding;
        viewBinding.getRoot().setFocusableInTouchMode(true);
        viewBinding.getRoot().setElevation(com.xiaomi.fitness.common.utils.ExtUtilsKt.getDp(1));
        setOutsideTouchable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnItemClickListener$lambda$0(Function1 function1, SmsReplyPopupMenu this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (function1 != null) {
            Intrinsics.checkNotNull(view);
            function1.invoke2(view);
        }
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnItemClickListener$lambda$1(Function1 function1, SmsReplyPopupMenu this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (function1 != null) {
            Intrinsics.checkNotNull(view);
            function1.invoke2(view);
        }
        this$0.dismiss();
    }

    @NotNull
    public final SmsReplyPopupMenu setOnItemClickListener(@Nullable final Function1<? super View, Unit> editListener, @Nullable final Function1<? super View, Unit> deleteListener) {
        this.mViewBinding.B.setOnClickListener(new View.OnClickListener() { // from class: n3n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SmsReplyPopupMenu.setOnItemClickListener$lambda$0(editListener, this, view);
            }
        });
        this.mViewBinding.A.setOnClickListener(new View.OnClickListener() { // from class: o3n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SmsReplyPopupMenu.setOnItemClickListener$lambda$1(deleteListener, this, view);
            }
        });
        return this;
    }

    public final void show(@NotNull View anchor, int xoff, int yoff, int gravity) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        m4i.a(this, true);
        showAsDropDown(anchor, xoff, yoff, gravity);
    }

    public /* synthetic */ SmsReplyPopupMenu(ozg ozgVar, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(ozgVar, i, i2, (i3 & 8) != 0 ? true : z);
    }
}
