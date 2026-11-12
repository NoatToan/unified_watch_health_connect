package com.xiaomi.fitness.health.sleep.ui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.k47;
import defpackage.n1c;
import defpackage.ni4;
import defpackage.pni;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepAnimalScheduleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/ScheduleItem;", "scheduleItem", "", "isLast", "", "update", "(Lcom/xiaomi/fitness/health/sleep/ui/adapter/ScheduleItem;Z)V", "Ln1c;", "binding", "Ln1c;", "getBinding", "()Ln1c;", "<init>", "(Ln1c;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepAnimalScheduleViewHolder extends RecyclerView.d0 {

    @NotNull
    private final n1c binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepAnimalScheduleViewHolder(@NotNull n1c binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    @NotNull
    public final n1c getBinding() {
        return this.binding;
    }

    public final void update(@NotNull ScheduleItem scheduleItem, boolean isLast) {
        Intrinsics.checkNotNullParameter(scheduleItem, "scheduleItem");
        Context context = this.binding.getRoot().getContext();
        Drawable drawableE = ni4.e(context, pni.w0);
        if (drawableE != null) {
            k47.n(drawableE, context.getColor(scheduleItem.getColor()));
            drawableE.setBounds(0, 0, ExtUtilsKt.getDp(8), ExtUtilsKt.getDp(8));
            this.binding.B.setImageDrawable(drawableE);
        }
        View dividerLine = this.binding.A;
        Intrinsics.checkNotNullExpressionValue(dividerLine, "dividerLine");
        ViewExtKt.setVisible(dividerLine, !isLast);
        this.binding.D.setText(scheduleItem.getTimeStr());
        this.binding.C.setText(scheduleItem.getDescStr());
    }
}
