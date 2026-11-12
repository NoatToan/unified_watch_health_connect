package com.xiaomi.fitness.health.todayhealth.ui;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.iji;
import defpackage.pni;
import defpackage.sob;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/HealthCheckHistoryRecordViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "time", "name", "", "totalCount", "", "texts", "sourceName", "", "updateView", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;)V", "setAbnormalTexts", "(Ljava/util/List;)V", "Lsob;", "binding", "Lsob;", "Lcom/google/android/flexbox/FlexboxLayout;", "layoutAbnormalItems", "Lcom/google/android/flexbox/FlexboxLayout;", "<init>", "(Lsob;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHealthCheckHistoryRecordViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthCheckHistoryRecordViewHolder.kt\ncom/xiaomi/fitness/health/todayhealth/ui/HealthCheckHistoryRecordViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,72:1\n1863#2:73\n1864#2:76\n172#3,2:74\n*S KotlinDebug\n*F\n+ 1 HealthCheckHistoryRecordViewHolder.kt\ncom/xiaomi/fitness/health/todayhealth/ui/HealthCheckHistoryRecordViewHolder\n*L\n49#1:73\n49#1:76\n54#1:74,2\n*E\n"})
public final class HealthCheckHistoryRecordViewHolder extends RecyclerView.d0 {

    @NotNull
    private final sob binding;

    @NotNull
    private final FlexboxLayout layoutAbnormalItems;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthCheckHistoryRecordViewHolder(@NotNull sob binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        FlexboxLayout layoutAbnormalItems = binding.B;
        Intrinsics.checkNotNullExpressionValue(layoutAbnormalItems, "layoutAbnormalItems");
        this.layoutAbnormalItems = layoutAbnormalItems;
    }

    public final void setAbnormalTexts(@NotNull List<Integer> texts) {
        Intrinsics.checkNotNullParameter(texts, "texts");
        this.layoutAbnormalItems.removeAllViews();
        if (texts.isEmpty()) {
            this.binding.D.setTextColor(ExtUtilsKt.getColor(iji.X));
            return;
        }
        this.binding.D.setTextColor(ExtUtilsKt.getColor(iji.W));
        Iterator<T> it = texts.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            TextView textView = new TextView(this.binding.getRoot().getContext());
            textView.setText(ExtUtilKt.getString(iIntValue));
            textView.setTextColor(ViewExtKt.getColor(textView, iji.W));
            textView.setBackgroundResource(pni.y);
            textView.setPadding(5, 5, 5, 5);
            FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 0, ExtUtilsKt.getDp(8));
            this.layoutAbnormalItems.addView(textView, layoutParams);
        }
    }

    public final void updateView(@NotNull String time, @NotNull String name, int totalCount, @NotNull List<Integer> texts, @NotNull String sourceName) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(texts, "texts");
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        this.binding.E.setText(time);
        this.binding.F.setText(name);
        setAbnormalTexts(texts);
        this.binding.G.setText(ApplicationExtKt.getApplication().getString(c0j.j5, sourceName));
    }
}
