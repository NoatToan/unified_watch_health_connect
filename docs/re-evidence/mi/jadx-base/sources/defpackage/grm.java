package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.sleep.view.wm.SleepRegularView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public class grm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SleepRegularView f19277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19278b;
    public final View c;
    public final Context d;

    public grm(View view, int i) {
        this.d = view.getContext();
        this.c = view.findViewById(eri.da);
        this.f19278b = i;
        a(view);
    }

    public final void a(View view) {
        TextView textView = (TextView) view.findViewById(eri.Bl);
        ((AppCompatImageView) view.findViewById(eri.X8)).setBackgroundDrawable(ni4.e(this.d, pni.d2));
        textView.setText(c0j.hi);
        this.f19277a = (SleepRegularView) view.findViewById(eri.ig);
        b();
    }

    public void b() {
        if (this.f19278b == 1) {
            this.f19277a.setViewType(0);
        } else {
            this.f19277a.setViewType(1);
        }
    }

    public void c(LocalDate localDate, AllDaySleepReport allDaySleepReport) {
        if (allDaySleepReport == null || ArrayUtils.isEmpty(allDaySleepReport.getDayReportList())) {
            this.c.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        List<AllDaySleepReport> dayReportList = allDaySleepReport.getDayReportList();
        LinkedList linkedList = new LinkedList();
        Objects.requireNonNull(dayReportList);
        Iterator<AllDaySleepReport> it = dayReportList.iterator();
        while (it.hasNext()) {
            List<SleepSegmentReport> sleepSegments = it.next().getSleepSegments();
            if (!ArrayUtils.isEmpty(sleepSegments)) {
                Objects.requireNonNull(sleepSegments);
                for (SleepSegmentReport sleepSegmentReport : sleepSegments) {
                    SleepRegularView.b bVar = new SleepRegularView.b();
                    bVar.f12291a = sleepSegmentReport.getBedTime();
                    bVar.f12292b = sleepSegmentReport.getWakeupTime();
                    bVar.c = TimeDateUtil.changZeroOfTheDay(sleepSegmentReport.getTimestamp());
                    linkedList.add(bVar);
                }
            }
        }
        List<SleepRegularView.a<SleepRegularView.b>> listK = SleepRegularView.K(linkedList);
        this.f19277a.A(TimeDateUtil.changZeroOfTheDay(localDate), TimeDateUtil.localDateToTimestamp(BarChartRecyclerHelper.INSTANCE.getWeekOrMonthEndDate(this.f19278b, localDate)));
        this.f19277a.setDataList(listK);
    }
}
