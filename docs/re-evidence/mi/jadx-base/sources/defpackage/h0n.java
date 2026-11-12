package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.common.utils.TimeDateUtil;

/* JADX INFO: loaded from: classes9.dex */
public class h0n extends RecyclerView.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f19548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f19549b;
    public final ImageView c;
    public final Context d;

    public h0n(View view) {
        super(view);
        this.d = view.getContext();
        this.f19548a = (TextView) view.findViewById(eri.bn);
        this.f19549b = (TextView) view.findViewById(eri.qn);
        this.c = (ImageView) view.findViewById(eri.X8);
    }

    public void a(SleepSegmentReport sleepSegmentReport, int i) {
        long bedTime = sleepSegmentReport.getBedTime();
        long wakeupTime = sleepSegmentReport.getWakeupTime();
        long sleepDuration = sleepSegmentReport.getSleepDuration();
        String dateHHmm24Format = TimeDateUtil.getDateHHmm24Format(bedTime);
        String dateHHmm24Format2 = TimeDateUtil.getDateHHmm24Format(wakeupTime);
        String hMFormatInMinutes = TimeDateUtil.getHMFormatInMinutes(this.d, sleepDuration);
        String str = String.format("%s-%s", dateHHmm24Format, dateHHmm24Format2);
        this.f19548a.setText(hMFormatInMinutes);
        this.f19549b.setText(str);
    }
}
