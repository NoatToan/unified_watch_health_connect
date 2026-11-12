package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepRHeartRateDayHolder;
import com.xiaomi.fitness.relative.sleep.sleepadapter.SleepRSpo2DayHolder;
import com.xiaomi.fitness.view.CollapsiblePanel;

/* JADX INFO: loaded from: classes9.dex */
public class cxm extends RecyclerView.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CollapsiblePanel f14845b;
    public TextView c;
    public View d;
    public amm e;
    public SleepRHeartRateDayHolder f;
    public SleepRSpo2DayHolder g;
    public him h;
    public pym i;

    public cxm(View view) {
        super(view);
        this.f14844a = view.getContext();
        initViewAndHolder(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        if (this.f14845b.j()) {
            this.f14845b.k();
            this.c.setText(c0j.r5);
        } else {
            this.f14845b.f();
            this.c.setText(c0j.q5);
        }
    }

    private void initViewAndHolder(View view) {
        this.e = new amm(view.findViewById(eri.X9));
        this.f14845b = (CollapsiblePanel) view.findViewById(eri.Df);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f14844a);
        View viewInflate = layoutInflaterFrom.inflate(jui.s7, (ViewGroup) this.f14845b, false);
        LinearLayout linearLayout = (LinearLayout) layoutInflaterFrom.inflate(jui.E7, (ViewGroup) this.f14845b, false);
        this.c = (TextView) linearLayout.findViewById(eri.d1);
        this.d = linearLayout.findViewById(eri.X3);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: bxm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f4711a.c(view2);
            }
        });
        this.f14845b.e(viewInflate);
        this.f14845b.setBottomView(linearLayout);
        this.f = new SleepRHeartRateDayHolder(this.f14845b);
        this.g = new SleepRSpo2DayHolder(this.f14845b);
        this.h = new him(this.f14845b);
        this.i = new pym(this.f14845b);
    }

    public void b(SleepSegmentReport sleepSegmentReport) {
        Logger.i("MiHealthRelative", "SleepSegmentRDetailViewHolder...SleepSegmentReport:" + sleepSegmentReport.toString());
        this.e.i(sleepSegmentReport);
        if ((sleepSegmentReport.getAvgSpo2() == null || sleepSegmentReport.getAvgSpo2().intValue() <= 0) && ((sleepSegmentReport.getAvgHr() == null || sleepSegmentReport.getAvgHr().intValue() <= 0) && sleepSegmentReport.getBreathQuality() == null && sleepSegmentReport.getSnoreRecordInfo() == null)) {
            this.f14845b.setVisibility(8);
            return;
        }
        this.f14845b.setVisibility(0);
        this.f.updateReport(sleepSegmentReport);
        this.g.updateReport(sleepSegmentReport);
        this.h.e(sleepSegmentReport);
        this.i.p(sleepSegmentReport, false);
    }
}
