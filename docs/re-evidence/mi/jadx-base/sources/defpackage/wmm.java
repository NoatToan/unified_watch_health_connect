package defpackage;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;

/* JADX INFO: loaded from: classes7.dex */
public class wmm extends gv5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f38135a;

    public wmm(Context context) {
        this(0);
        this.f38135a = context;
    }

    @Override // defpackage.gv5, defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        String str;
        String str2;
        int iRound = Math.round(recyclerBarEntry.getY() * 60.0f);
        int i = iRound / 60;
        int i2 = iRound % 60;
        if (i > 0) {
            str = i + gv5.CONNECT_VALUE_STR + this.f38135a.getResources().getQuantityString(qxi.N1, i, Integer.valueOf(i));
        } else {
            str = "";
        }
        if (i2 > 0) {
            str2 = i2 + gv5.CONNECT_VALUE_STR + this.f38135a.getResources().getQuantityString(qxi.P1, i2, Integer.valueOf(i2));
            if (!str.isEmpty()) {
                str2 = gv5.CONNECT_VALUE_STR + str2;
            }
        } else {
            str2 = "";
        }
        return recyclerBarEntry.getY() > 0.0f ? String.format("%s%s", str, str2) + gv5.CONNECT_STR + TimeDateUtil.getDateFormated(TimeDateUtil.localDateToTimestamp(recyclerBarEntry.localDate) * 1000, this.f38135a.getString(c0j.l)) : "";
    }

    public wmm(int i) {
        super(i);
    }
}
