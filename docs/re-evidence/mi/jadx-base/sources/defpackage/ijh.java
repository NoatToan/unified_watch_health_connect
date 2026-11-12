package defpackage;

import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;

/* JADX INFO: loaded from: classes7.dex */
public class ijh extends onq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f21227a = TimeDateUtil.changZeroOfTheDay(System.currentTimeMillis() / 1000);

    @Override // defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        long j = this.f21227a;
        long j2 = recyclerBarEntry.timestamp;
        return j == j2 ? AppUtil.getApp().getString(c0j.v5) : TimeDateUtil.getDateMMddNumberFormat(TimeDateUtil.timestampToLocalDate(j2));
    }
}
