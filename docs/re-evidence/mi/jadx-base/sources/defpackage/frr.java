package defpackage;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class frr extends onq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f18137a;

    public frr(Context context) {
        this.f18137a = context;
    }

    @Override // defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        LocalDate localDate = recyclerBarEntry.localDate;
        int i = recyclerBarEntry.type;
        return (i == 4 || i == 2) ? TimeDateUtil.getDateMMddNumberFormat(localDate) : "";
    }
}
