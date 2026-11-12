package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.chart.barchart.SpO2BarChartAdapter;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
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
public class nzm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f28592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28593b;
    public final Context c;
    public DataTitleView d;
    public BarChartRecyclerView e;
    public SpO2BarChartAdapter<rtr> f;
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
                nzm.this.d.setVisibility(0);
            } else {
                nzm.this.d.setVisibility(8);
            }
        }
    }

    public nzm(View view, int i) {
        this.f28592a = view;
        this.c = view.getContext();
        this.f28593b = i;
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
                    List<TimesDataRecordInt> spo2Records = it.next().getSpo2Records();
                    if (!ArrayUtils.isEmpty(spo2Records)) {
                        Iterator<TimesDataRecordInt> it2 = spo2Records.iterator();
                        while (it2.hasNext()) {
                            arrayList.addAll(ArrayUtils.toIntegerList(it2.next().getValueArray()));
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    Integer avgSpo2 = allDaySleepReport2.getAvgSpo2();
                    Integer maxSpo2 = allDaySleepReport2.getMaxSpo2();
                    Integer minSpo2 = allDaySleepReport2.getMinSpo2();
                    map.put(Long.valueOf(jChangZeroOfTheDay), new TimesDataRecordInt(jChangZeroOfTheDay, avgSpo2 == null ? 0 : avgSpo2.intValue(), maxSpo2 == null ? 0 : maxSpo2.intValue(), minSpo2 == null ? 0 : minSpo2.intValue(), ArrayUtils.INSTANCE.toIntArray(arrayList)));
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
        ((AppCompatImageView) view.findViewById(eri.X8)).setBackgroundDrawable(ni4.e(this.c, pni.i2));
        textView.setText(c0j.Rd);
        this.d = (DataTitleView) view.findViewById(eri.Qg);
        BarChartRecyclerView barChartRecyclerView = (BarChartRecyclerView) view.findViewById(eri.Sg);
        this.e = barChartRecyclerView;
        this.h = (r02) barChartRecyclerView.mAttrs;
        onq onqVarCreateXAxisFormatter = BarChartRecyclerHelper.INSTANCE.createXAxisFormatter(this.c, this.f28593b);
        r02 r02Var = this.h;
        vqr vqrVar = new vqr(r02Var, r02Var.c, onqVarCreateXAxisFormatter);
        rtr rtrVar = new rtr(this.h);
        this.i = rtrVar;
        this.j = new s02(rtrVar, vqrVar, this.h);
        er5 er5Var = new er5(0, false);
        this.j.setHighLightValueFormatter(er5Var);
        this.e.addItemDecoration(this.j);
        this.e.setLayoutManager(new SpeedRatioLayoutManager(this.c, this.h));
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        SpO2BarChartAdapter<rtr> spO2BarChartAdapter = new SpO2BarChartAdapter<>(this.c, arrayList, this.e, vqrVar, this.h, er5Var);
        this.f = spO2BarChartAdapter;
        this.e.setAdapter(spO2BarChartAdapter);
        this.e.setNestedScrollingEnabled(false);
        c();
    }

    public void e(LocalDate localDate, AllDaySleepReport allDaySleepReport) {
        if (allDaySleepReport == null || ArrayUtils.isEmpty(allDaySleepReport.getDayReportList())) {
            this.f28592a.setVisibility(8);
            return;
        }
        Map<Long, TimesDataRecordInt> mapB = b(allDaySleepReport);
        if (mapB.isEmpty() || allDaySleepReport.getAvgSpo2() == null) {
            this.f28592a.setVisibility(8);
            return;
        }
        this.f28592a.setVisibility(0);
        this.g.addAll(SleepChartHelper.INSTANCE.createEntriesFromRecordMap(BarChartRecyclerHelper.INSTANCE.getWeekOrMonthEndDate(this.f28593b, localDate), localDate, mapB, this.h, this.f28593b == 1));
        float theMaxNumber = HealthUtil.getTheMaxNumber(this.g);
        rtr rtrVar = this.i;
        rtr rtrVarL = rtrVar.l(rtrVar, theMaxNumber);
        this.i = rtrVarL;
        this.j.setYAxis(rtrVarL);
        this.f.notifyDataSetChanged();
        this.d.a(this.c, this.c.getResources().getQuantityString(qxi.z1, allDaySleepReport.getAvgSpo2().intValue(), allDaySleepReport.getAvgSpo2()), allDaySleepReport.getAvgSpo2().toString(), "");
    }
}
