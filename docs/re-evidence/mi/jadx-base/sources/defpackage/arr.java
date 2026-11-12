package defpackage;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;

/* JADX INFO: loaded from: classes7.dex */
public class arr extends onq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f3396a;

    public arr(Context context) {
        this.f3396a = context;
    }

    @Override // defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        int i = recyclerBarEntry.type;
        return (i == 4 || i == 2) ? TimeDateUtil.getDateMMddNumberFormat(recyclerBarEntry.timestamp * 1000) : "";
    }
}
