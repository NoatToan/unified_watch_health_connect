package defpackage;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class brr extends onq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f4525a;

    public brr(Context context) {
        this.f4525a = context;
    }

    @Override // defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        LocalDate localDate = recyclerBarEntry.localDate;
        int i = recyclerBarEntry.type;
        return (i == 4 || i == 2) ? TimeDateUtil.getDayFormat(localDate) : "";
    }
}
