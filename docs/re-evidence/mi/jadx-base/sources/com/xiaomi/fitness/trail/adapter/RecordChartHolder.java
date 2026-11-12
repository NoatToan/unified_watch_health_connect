package com.xiaomi.fitness.trail.adapter;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.annotation.SportCategory;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.api.SportSummaryApi;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.trail.adapter.RecordChartHolder;
import com.xiaomi.fitness.trail.data.BarData;
import com.xiaomi.fitness.trail.data.RecordUtilKt;
import com.xiaomi.fitness.trail.data.ValueType;
import defpackage.byi;
import defpackage.dki;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.pz6;
import defpackage.vop;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010!¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/RecordChartHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/trail/data/BarData;", "data", "", "setDurDisCalNum", "(Lcom/xiaomi/fitness/trail/data/BarData;)V", "", "category", "setDurCalNum", "(Ljava/lang/String;Lcom/xiaomi/fitness/trail/data/BarData;)V", "barData", "", "showDistance", "setTalkbackStr", "(Lcom/xiaomi/fitness/trail/data/BarData;Z)V", "", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "setData", "(Ljava/util/List;Ljava/lang/String;)V", "Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;", "summaryApi", "setSummaryApi", "(Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;)V", "Lvop;", "binding", "Lvop;", "Ljava/lang/String;", "timeDim", "", StatConstants.PARAM_START, "J", StatConstants.PARAM_END, "Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;", "<init>", "(Lvop;Ljava/lang/String;Ljava/lang/String;JJ)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRecordChartHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordChartHolder.kt\ncom/xiaomi/fitness/trail/adapter/RecordChartHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n1#2:160\n*E\n"})
public final class RecordChartHolder extends RecyclerView.d0 {

    @NotNull
    private final vop binding;

    @NotNull
    private String category;
    private final long end;
    private final long start;
    private SportSummaryApi summaryApi;

    @NotNull
    private final String timeDim;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordChartHolder(@NotNull vop binding, @NotNull String category, @NotNull String timeDim, long j, long j2) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(timeDim, "timeDim");
        this.binding = binding;
        this.category = category;
        this.timeDim = timeDim;
        this.start = j;
        this.end = j2;
        binding.A.observerSummary(new Function1() { // from class: qjj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordChartHolder._init_$lambda$2(this.f31571a, (BarData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(RecordChartHolder this$0, BarData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.d("SRecordChartHolder", "final = " + it);
        if (it.getTotal()) {
            this$0.binding.F.setBackground(null);
            this$0.binding.B.setTextColor(ExtUtilsKt.getColor(dki.Q0));
            ConstraintLayout constraintLayout = this$0.binding.F;
            constraintLayout.setPadding(0, constraintLayout.getPaddingTop(), 0, constraintLayout.getPaddingBottom());
        } else {
            this$0.binding.F.setBackgroundResource(hoi.O1);
            this$0.binding.B.setTextColor(ExtUtilsKt.getColor(dki.M0));
            ConstraintLayout constraintLayout2 = this$0.binding.F;
            constraintLayout2.setPadding(ExtUtilsKt.getDp(13), constraintLayout2.getPaddingTop(), ExtUtilsKt.getDp(13), constraintLayout2.getPaddingBottom());
        }
        SportCategory.Companion companion = SportCategory.INSTANCE;
        if (companion.showDistance(this$0.category)) {
            this$0.setDurDisCalNum(it);
        } else {
            this$0.setDurCalNum(this$0.category, it);
        }
        this$0.setTalkbackStr(it, companion.showDistance(this$0.category));
        return Unit.INSTANCE;
    }

    private final void setDurCalNum(String category, BarData data) {
        TextView data1View = this.binding.B;
        Intrinsics.checkNotNullExpressionValue(data1View, "data1View");
        ViewExtKt.visible(data1View);
        TextView data2View = this.binding.C;
        Intrinsics.checkNotNullExpressionValue(data2View, "data2View");
        ViewExtKt.visible(data2View);
        TextView data3View = this.binding.D;
        Intrinsics.checkNotNullExpressionValue(data3View, "data3View");
        ViewExtKt.visible(data3View);
        TextView data4View = this.binding.E;
        Intrinsics.checkNotNullExpressionValue(data4View, "data4View");
        ViewExtKt.gone(data4View);
        TextView data1View2 = this.binding.B;
        Intrinsics.checkNotNullExpressionValue(data1View2, "data1View");
        RecordUtilKt.setDataStr$default(data1View2, ValueType.DURATION.INSTANCE, TimeDateUtil.getTimeStrWithSecDef(data.getDuration()), 0, 0, 24, null);
        if (Intrinsics.areEqual(category, "diving")) {
            TextView data2View2 = this.binding.C;
            Intrinsics.checkNotNullExpressionValue(data2View2, "data2View");
            RecordUtilKt.setDataFormat$default(data2View2, "", "", 0, 8, null);
        } else {
            TextView data2View3 = this.binding.C;
            Intrinsics.checkNotNullExpressionValue(data2View3, "data2View");
            RecordUtilKt.setDataStr$default(data2View3, ValueType.CALORIE.INSTANCE, String.valueOf(data.getCalorie()), 0, 0, 24, null);
        }
        TextView data3View2 = this.binding.D;
        Intrinsics.checkNotNullExpressionValue(data3View2, "data3View");
        RecordUtilKt.setDataStr$default(data3View2, ValueType.TIMES.INSTANCE, String.valueOf(data.getNum()), 0, data.getNum(), 8, null);
    }

    private final void setDurDisCalNum(BarData data) {
        TextView data1View = this.binding.B;
        Intrinsics.checkNotNullExpressionValue(data1View, "data1View");
        ViewExtKt.visible(data1View);
        TextView data2View = this.binding.C;
        Intrinsics.checkNotNullExpressionValue(data2View, "data2View");
        ViewExtKt.visible(data2View);
        TextView data3View = this.binding.D;
        Intrinsics.checkNotNullExpressionValue(data3View, "data3View");
        ViewExtKt.visible(data3View);
        TextView data4View = this.binding.E;
        Intrinsics.checkNotNullExpressionValue(data4View, "data4View");
        ViewExtKt.visible(data4View);
        TextView data1View2 = this.binding.B;
        Intrinsics.checkNotNullExpressionValue(data1View2, "data1View");
        RecordUtilKt.setDataStr$default(data1View2, ValueType.DURATION.INSTANCE, TimeDateUtil.getTimeStrWithSecDef(data.getDuration()), 0, 0, 24, null);
        TextView data2View2 = this.binding.C;
        Intrinsics.checkNotNullExpressionValue(data2View2, "data2View");
        String strE = pz6.e(data.getDistance());
        Intrinsics.checkNotNullExpressionValue(strE, "getDistanceStrWithoutUnit(...)");
        String strG = pz6.g(data.getDistance());
        Intrinsics.checkNotNullExpressionValue(strG, "getDistanceUnit(...)");
        RecordUtilKt.setDataFormat$default(data2View2, strE, strG, 0, 8, null);
        TextView data3View2 = this.binding.D;
        Intrinsics.checkNotNullExpressionValue(data3View2, "data3View");
        RecordUtilKt.setDataStr$default(data3View2, ValueType.CALORIE.INSTANCE, String.valueOf(data.getCalorie()), 0, 0, 24, null);
        TextView data4View2 = this.binding.E;
        Intrinsics.checkNotNullExpressionValue(data4View2, "data4View");
        RecordUtilKt.setDataStr$default(data4View2, ValueType.TIMES.INSTANCE, String.valueOf(data.getNum()), 0, data.getNum(), 8, null);
    }

    private final void setTalkbackStr(BarData barData, boolean showDistance) {
        String string;
        String durationHrMinSecInMills = TimeDateUtil.getDurationHrMinSecInMills(ApplicationExtKt.getApplication(), barData.getDuration() * 1000);
        String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(byi.common_unit_calorie_desc, barData.getCalorie(), Integer.valueOf(barData.getCalorie()));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String quantityString2 = ApplicationExtKt.getApplication().getResources().getQuantityString(byi.W, barData.getNum(), Integer.valueOf(barData.getNum()));
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        if (showDistance) {
            string = ResourceExtKt.getString(j1j.ja, durationHrMinSecInMills, pz6.e(barData.getDistance()) + pz6.g(barData.getDistance()), quantityString, quantityString2);
        } else {
            string = ResourceExtKt.getString(j1j.ia, durationHrMinSecInMills, quantityString, quantityString2);
        }
        this.binding.getRoot().setContentDescription(string);
    }

    public final void setData(@NotNull List<SportBasicReport> data, @NotNull String category) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(category, "category");
        this.category = category;
        Logger.i("RecordChartHolder", "category=" + category + " dataSize=" + data.size() + " data=" + data);
        this.binding.A.setData(data, category, this.timeDim, this.start, this.end);
    }

    public final void setSummaryApi(@NotNull SportSummaryApi summaryApi) {
        Intrinsics.checkNotNullParameter(summaryApi, "summaryApi");
        this.summaryApi = summaryApi;
    }
}
