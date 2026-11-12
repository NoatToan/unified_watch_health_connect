package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.valueformatter.RateHighLightMarkValueFormatter;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.SleepChartHelper;
import com.xiaomi.fitness.view.DataTitleView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public class umm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f35938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35939b;
    public final Context c;
    public DataTitleView d;
    public BarChartRecyclerView e;
    public ubj<rtr> f;
    public List<SegmentBarEntry> g;
    public r02 h;
    public rtr i;
    public s02 j;

    public class a extends xcm {
        public a() {
        }

        @Override // defpackage.xcm, defpackage.u8h
        public void onItemSelected(RecyclerBarEntry recyclerBarEntry, int i) {
            if (recyclerBarEntry == null || !recyclerBarEntry.isSelected()) {
                umm.this.d.setVisibility(0);
            } else {
                umm.this.d.setVisibility(8);
            }
        }
    }

    public umm(View view, int i) {
        this.c = view.getContext();
        this.f35938a = view;
        this.f35939b = i;
        d(view);
    }

    @NotNull
    public final Map<Long, TimesDataRecordInt> b(@NotNull AllDaySleepReport allDaySleepReport) {
        HashMap map = new HashMap();
        List<AllDaySleepReport> dayReportList = allDaySleepReport.getDayReportList();
        Objects.requireNonNull(dayReportList);
        for (AllDaySleepReport allDaySleepReport2 : dayReportList) {
            List<SleepSegmentReport> sleepSegments = allDaySleepReport2.getSleepSegments();
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(allDaySleepReport2.getTime());
            if (!ArrayUtils.isEmpty(sleepSegments)) {
                ArrayList arrayList = new ArrayList();
                Objects.requireNonNull(sleepSegments);
                Iterator<SleepSegmentReport> it = sleepSegments.iterator();
                while (it.hasNext()) {
                    List<TimesDataRecordInt> hrRecords = it.next().getHrRecords();
                    if (!ArrayUtils.isEmpty(hrRecords)) {
                        Iterator<TimesDataRecordInt> it2 = hrRecords.iterator();
                        while (it2.hasNext()) {
                            arrayList.addAll(ArrayUtils.toIntegerList(it2.next().getValueArray()));
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    Integer avgHr = allDaySleepReport2.getAvgHr();
                    Integer maxHr = allDaySleepReport2.getMaxHr();
                    Integer minHr = allDaySleepReport2.getMinHr();
                    map.put(Long.valueOf(jChangZeroOfTheDay), new TimesDataRecordInt(jChangZeroOfTheDay, avgHr == null ? 0 : avgHr.intValue(), maxHr == null ? 0 : maxHr.intValue(), minHr == null ? 0 : minHr.intValue(), ArrayUtils.INSTANCE.toIntArray(arrayList)));
                }
            }
        }
        return map;
    }

    public final void c() {
        this.e.addOnItemTouchListener(new hak(this.c, this.e, new a()));
    }

    public final void d(View view) {
        TextView textView = (TextView) view.findViewById(eri.Bl);
        ((AppCompatImageView) view.findViewById(eri.X8)).setBackgroundDrawable(ni4.e(this.c, pni.S1));
        textView.setText(c0j.Q);
        this.d = (DataTitleView) view.findViewById(eri.Y6);
        BarChartRecyclerView barChartRecyclerView = (BarChartRecyclerView) view.findViewById(eri.c7);
        this.e = barChartRecyclerView;
        this.h = (r02) barChartRecyclerView.mAttrs;
        onq onqVarCreateXAxisFormatter = BarChartRecyclerHelper.INSTANCE.createXAxisFormatter(this.c, this.f35939b);
        r02 r02Var = this.h;
        vqr vqrVar = new vqr(r02Var, r02Var.c, onqVarCreateXAxisFormatter);
        this.i = new rtr(this.h);
        this.e.setLayoutManager(new SpeedRatioLayoutManager(this.c, this.h));
        s02 s02Var = new s02(this.i, vqrVar, this.h);
        this.j = s02Var;
        s02Var.setHighLightValueFormatter(new RateHighLightMarkValueFormatter(0));
        this.e.addItemDecoration(this.j);
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        ubj<rtr> ubjVar = new ubj<>(this.c, arrayList, this.e, vqrVar, this.h);
        this.f = ubjVar;
        this.e.setAdapter(ubjVar);
        this.e.setNestedScrollingEnabled(false);
        c();
    }

    public void e(LocalDate localDate, AllDaySleepReport allDaySleepReport) {
        this.g.clear();
        this.f.notifyDataSetChanged();
        if (allDaySleepReport == null || ArrayUtils.isEmpty(allDaySleepReport.getDayReportList())) {
            this.f35938a.setVisibility(8);
            return;
        }
        Map<Long, TimesDataRecordInt> mapB = b(allDaySleepReport);
        if (mapB.isEmpty() || allDaySleepReport.getAvgHr() == null) {
            this.f35938a.setVisibility(8);
            return;
        }
        this.f35938a.setVisibility(0);
        List<SegmentBarEntry> listCreateEntriesFromRecordMap = SleepChartHelper.INSTANCE.createEntriesFromRecordMap(BarChartRecyclerHelper.INSTANCE.getWeekOrMonthEndDate(this.f35939b, localDate), localDate, mapB, this.h, this.f35939b == 1);
        this.g.clear();
        this.g.addAll(listCreateEntriesFromRecordMap);
        float theMaxNumber = HealthUtil.getTheMaxNumber(this.g);
        rtr rtrVar = this.i;
        rtr rtrVarL = rtrVar.l(rtrVar, theMaxNumber);
        this.i = rtrVarL;
        this.j.setYAxis(rtrVarL);
        this.f.setYAxis(this.i);
        this.f.notifyDataSetChanged();
        this.d.a(this.c, this.c.getResources().getQuantityString(qxi.common_unit_heart_rate_desc, allDaySleepReport.getAvgHr().intValue(), allDaySleepReport.getAvgHr()), allDaySleepReport.getAvgHr().toString(), "");
    }
}
