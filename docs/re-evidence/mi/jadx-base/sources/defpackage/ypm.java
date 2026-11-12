package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.health.sleep.ui.adapter.SleepEfficiencyHolder;
import com.xiaomi.fitness.health.sleep.ui.adapter.SleepInterpretationHolder;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepBreathDayHolderV2;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepHeartRateDayHolderV2;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepSpo2DayHolderV2;
import com.xiaomi.fitness.view.CollapsiblePanel;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class ypm extends RecyclerView.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CollapsiblePanel f40408b;
    public TextView c;
    public View d;
    public ylm e;
    public SleepHeartRateDayHolderV2 f;
    public SleepSpo2DayHolderV2 g;
    public SleepBreathDayHolderV2 h;
    public pym i;
    public SleepInterpretationHolder j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SleepEfficiencyHolder f40409k;
    public final LifecycleCoroutineScope l;

    public ypm(View view, LifecycleCoroutineScope lifecycleCoroutineScope) {
        super(view);
        this.f40407a = view.getContext();
        this.l = lifecycleCoroutineScope;
        initViewAndHolder(view);
    }

    public void b(SleepSegmentReport sleepSegmentReport, int i, AllDaySleepReport allDaySleepReport, boolean z) {
        Logger.i("MiHealth", "SleepSegmentDetailViewHolder...SleepSegmentReport:" + sleepSegmentReport);
        Logger.i("MiHealth", "SleepSegmentDetailViewHolder sleepEfficiency... , sleepEfficiency = " + sleepSegmentReport.getSleepEfficiency() + ", linBedDuration = " + sleepSegmentReport.getLinBedDuration() + ", entrySleepDuration = " + sleepSegmentReport.getEntrySleepDuration() + ", leaveBedTime = " + sleepSegmentReport.getLeaveBedTime() + ", goBedTime = " + sleepSegmentReport.getGoBedTime());
        this.e.t(sleepSegmentReport, i);
        if ((sleepSegmentReport.getAvgSpo2() == null || sleepSegmentReport.getAvgSpo2().intValue() <= 0 || ArrayUtils.isEmpty(sleepSegmentReport.getSpo2Records())) && ((sleepSegmentReport.getAvgHr() == null || sleepSegmentReport.getAvgHr().intValue() <= 0 || ArrayUtils.isEmpty(sleepSegmentReport.getHrRecords())) && sleepSegmentReport.getBreathQuality() == null && sleepSegmentReport.getAvgBreathRate() == null && sleepSegmentReport.getSnoreRecordInfo() == null && ArrayUtils.isEmpty(sleepSegmentReport.getDreamTalkAudioList()) && ArrayUtils.isEmpty(sleepSegmentReport.getSnoreAudioList()) && ((sleepSegmentReport.getSleepDuration() < 180 || Objects.equals(sleepSegmentReport.getSid(), "xiaomiwear_app_manually")) && sleepSegmentReport.getSleepEfficiency() == null))) {
            this.f40408b.setVisibility(8);
            return;
        }
        this.f40408b.setVisibility(0);
        if ((sleepSegmentReport.getAvgSpo2() == null || sleepSegmentReport.getAvgSpo2().intValue() <= 0) && ((sleepSegmentReport.getAvgHr() == null || sleepSegmentReport.getAvgHr().intValue() <= 0) && sleepSegmentReport.getBreathQuality() == null)) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
        }
        this.f.updateReport(sleepSegmentReport);
        this.g.updateReport(sleepSegmentReport);
        this.h.updateReport(sleepSegmentReport);
        this.i.p(sleepSegmentReport, z);
        this.j.bindSleepInterprAndAdvice(sleepSegmentReport, allDaySleepReport);
        this.f40409k.updateSleepSegmentReport(sleepSegmentReport, allDaySleepReport, this.l);
    }

    public final /* synthetic */ void c(View view) {
        if (this.f40408b.j()) {
            this.f40408b.k();
            this.c.setText(c0j.r5);
        } else {
            this.f40408b.f();
            this.c.setText(c0j.q5);
        }
    }

    public final void initViewAndHolder(View view) {
        this.e = new ylm(view.findViewById(eri.U9));
        this.f40408b = (CollapsiblePanel) view.findViewById(eri.Df);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f40407a);
        View viewInflate = layoutInflaterFrom.inflate(jui.s7, (ViewGroup) this.f40408b, false);
        this.d = viewInflate.findViewById(eri.Pg);
        LinearLayout linearLayout = (LinearLayout) layoutInflaterFrom.inflate(jui.E7, (ViewGroup) this.f40408b, false);
        this.c = (TextView) linearLayout.findViewById(eri.d1);
        linearLayout.setVisibility(8);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: xpm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f39339a.c(view2);
            }
        });
        this.f40408b.e(viewInflate);
        this.f40408b.setBottomView(linearLayout);
        this.f = new SleepHeartRateDayHolderV2(this.f40408b);
        this.g = new SleepSpo2DayHolderV2(this.f40408b);
        this.h = new SleepBreathDayHolderV2(this.f40408b);
        this.i = new pym(this.f40408b);
        this.j = new SleepInterpretationHolder(this.f40408b, this.l);
        this.f40409k = new SleepEfficiencyHolder(this.f40408b);
    }
}
