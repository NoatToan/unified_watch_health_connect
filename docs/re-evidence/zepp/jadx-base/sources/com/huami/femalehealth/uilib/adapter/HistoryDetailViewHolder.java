package com.huami.femalehealth.uilib.adapter;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.ChartHelper;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.femalehealth.uilib.widget.chart.FHBarChart;
import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0010H\u0002J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0012¨\u0006\u0018"}, d2 = {"Lcom/huami/femalehealth/uilib/adapter/HistoryDetailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/femalehealth/uilib/adapter/DetailSummaryVo;", "vo", "", "e", "", "time", "Lcom/huami/hmdateformat/date/HMPattern;", GoogleApiAvailabilityLight.a, "", "a", "", "day", "", "c", "Lcom/huami/femalehealth/uilib/adapter/DetailSymptomVo;", "b", "Lcom/huami/femalehealth/uilib/adapter/HistoryDetailVo;", "bind", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class HistoryDetailViewHolder extends RecyclerView.ViewHolder {
    public HistoryDetailViewHolder(@NotNull View view) {
        super(view);
    }

    private final void a(DetailSummaryVo vo) {
        HMPattern hMPatternD = d(vo.getStart());
        HMPattern hMPatternD2 = d(vo.getEnd());
        View view = this.itemView;
        if (!e(vo)) {
            TextView textView = (TextView) view.findViewById(R.id.tv_date);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            ResourceHelper resourceHelper = ResourceHelper.INSTANCE;
            textView.setText(String.format(resourceHelper.getString(R.string.fh_time_from), Arrays.copyOf(new Object[]{HMDataFormatKt.getFormatTime$default(vo.getStart(), hMPatternD, (Locale) null, 2, (Object) null), HMDataFormatKt.getFormatTime$default(vo.getEnd(), hMPatternD2, (Locale) null, 2, (Object) null)}, 2)));
            ((TextView) view.findViewById(R.id.tv_desc)).setText(String.format(resourceHelper.getString(R.string.fh_menstruation_periodicity_desc), Arrays.copyOf(new Object[]{c(vo.getCycle()), c(vo.getPeriod())}, 2)));
            return;
        }
        TextView textView2 = (TextView) view.findViewById(R.id.tv_date);
        ResourceHelper resourceHelper2 = ResourceHelper.INSTANCE;
        textView2.setText(resourceHelper2.getString(R.string.fh_current_menstruation));
        TextView textView3 = (TextView) view.findViewById(R.id.tv_desc);
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        textView3.setText(String.format(resourceHelper2.getString(R.string.fh_menstruation_from), Arrays.copyOf(new Object[]{HMDataFormatKt.getFormatTime$default(vo.getStart(), hMPatternD, (Locale) null, 2, (Object) null)}, 1)));
    }

    private final void b(DetailSymptomVo vo) {
        View view = this.itemView;
        TextView textView = (TextView) view.findViewById(R.id.tv_name);
        ChartHelper chartHelper = ChartHelper.INSTANCE;
        textView.setText(chartHelper.getSymptomName(vo.getType()));
        FHBarChart fHBarChart = (FHBarChart) view.findViewById(R.id.bar_chart);
        chartHelper.scaleHorizontally(fHBarChart, ChartHelper.initFemaleHealthSymptomChart$default(chartHelper, fHBarChart, vo.getType(), chartHelper.fillSymptomListIfNecessary(vo.getSymptoms(), vo.getStart(), vo.getEnd(), vo.getType()), false, 8, null), true);
        fHBarChart.animateY(500);
    }

    private final String c(int day) {
        String quantityString;
        Resources resources = ResourceHelper.INSTANCE.getResources();
        return (resources == null || (quantityString = resources.getQuantityString(R.plurals.fh_time_day_var, day, Integer.valueOf(day))) == null) ? "" : quantityString;
    }

    private final HMPattern d(long time) {
        return DateHelper.INSTANCE.isCurrentYear(time) ? HMPattern.ABBR_MONTH_DAY : HMPattern.YEAR_ABBR_MONTH_DAY;
    }

    private final boolean e(DetailSummaryVo vo) {
        return !vo.isEnd();
    }

    public final void bind(@NotNull HistoryDetailVo vo) {
        if (vo instanceof DetailSymptomVo) {
            b((DetailSymptomVo) vo);
        } else if (vo instanceof DetailSummaryVo) {
            a((DetailSummaryVo) vo);
        }
    }
}
