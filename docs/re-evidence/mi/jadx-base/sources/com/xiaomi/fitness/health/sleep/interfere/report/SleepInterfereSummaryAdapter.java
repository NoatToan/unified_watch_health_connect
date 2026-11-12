package com.xiaomi.fitness.health.sleep.interfere.report;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.p;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.SpanPropKey;
import com.xiaomi.fitness.common.utils.StyledStringUtils;
import com.xiaomi.fitness.health.sleep.interfere.net.ReportTask;
import defpackage.c0j;
import defpackage.god;
import defpackage.iji;
import defpackage.qxi;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereSummaryAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fitness/health/sleep/interfere/net/ReportTask;", "Lcom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereSummaryAdapter$SummaryVH;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereSummaryAdapter$SummaryVH;", "holder", "position", "", "onBindViewHolder", "(Lcom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereSummaryAdapter$SummaryVH;I)V", "<init>", "()V", "Companion", "SummaryVH", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepInterfereSummaryAdapter extends p<ReportTask, SummaryVH> {

    @NotNull
    private static final SleepInterfereSummaryAdapter$Companion$DIFF_CALLBACK$1 DIFF_CALLBACK = new h.f<ReportTask>() { // from class: com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereSummaryAdapter$Companion$DIFF_CALLBACK$1
        @Override // androidx.recyclerview.widget.h.f
        public boolean areContentsTheSame(ReportTask oldItem, ReportTask newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(ReportTask oldItem, ReportTask newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getType(), newItem.getType());
        }
    };

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereSummaryAdapter$SummaryVH;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/sleep/interfere/net/ReportTask;", "item", "", "bind", "(Lcom/xiaomi/fitness/health/sleep/interfere/net/ReportTask;)V", "", "type", "mapTypeToTitleRes", "(Ljava/lang/String;)Ljava/lang/String;", "Lgod;", "binding", "Lgod;", "<init>", "(Lgod;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class SummaryVH extends RecyclerView.d0 {

        @NotNull
        private final god binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SummaryVH(@NotNull god binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        public final void bind(@NotNull ReportTask item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.binding.C.setText(mapTypeToTitleRes(item.getType()));
            int completeCount = item.getCompleteCount();
            god godVar = this.binding;
            TextView textView = godVar.B;
            StyledStringUtils styledStringUtils = StyledStringUtils.INSTANCE;
            Context context = godVar.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int i = qxi.M1;
            SpanPropKey spanPropKey = SpanPropKey.FONT_WEIGHT;
            textView.setText(styledStringUtils.getStyledString(context, i, completeCount, (1008 & 4) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(TuplesKt.to(spanPropKey, "330"), TuplesKt.to(SpanPropKey.FONT_SIZE, "54.5%"), TuplesKt.to(SpanPropKey.FONT_COLOR, Integer.valueOf(iji.w3)))), (1008 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : CollectionsKt__CollectionsJVMKt.listOf(new StyledStringUtils.StyledArg(Integer.valueOf(completeCount), new StyledStringUtils.CssStyle(MapsKt__MapsJVMKt.mapOf(TuplesKt.to(spanPropKey, "450"))))), (1008 & 16) != 0, (1008 & 32) != 0 ? Locale.getDefault() : null, (1008 & 64) != 0, (1008 & 128) != 0 ? null : null, (1008 & 256) != 0 ? MapsKt__MapsKt.emptyMap() : null, (1008 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null));
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @NotNull
        public final String mapTypeToTitleRes(@NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            switch (type.hashCode()) {
                case -1647799055:
                    if (type.equals("TIMELY_WAKE_UP")) {
                        return ResourceExtKt.getString(c0j.Gg);
                    }
                    return "";
                case -1519814925:
                    if (type.equals("SLEEP_TIP")) {
                        return ResourceExtKt.getString(c0j.Pg);
                    }
                    return "";
                case -1234640614:
                    if (type.equals("LIMIT_NAPS")) {
                        return ResourceExtKt.getString(c0j.Hg);
                    }
                    return "";
                case -945987119:
                    if (type.equals("BREATH_RELAX")) {
                        return ResourceExtKt.getString(c0j.Dg);
                    }
                    return "";
                case 1304408914:
                    if (type.equals("TIMELY_SLEEP")) {
                        return ResourceExtKt.getString(c0j.Jg);
                    }
                    return "";
                case 1841446286:
                    if (type.equals("EXERCISE_30MIN")) {
                        Context context = this.binding.getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        return ResourceExtKt.getQuantityString(context, qxi.I0, 30, 30);
                    }
                    return "";
                default:
                    return "";
            }
        }
    }

    public SleepInterfereSummaryAdapter() {
        super(DIFF_CALLBACK);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SummaryVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ReportTask item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SummaryVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        god godVarA0 = god.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(godVarA0, "inflate(...)");
        return new SummaryVH(godVarA0);
    }
}
