package defpackage;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;

/* JADX INFO: loaded from: classes7.dex */
public class qb3 extends gv5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f31305a;

    public qb3(Context context) {
        this(0);
        this.f31305a = context;
    }

    public final String a(RecyclerBarEntry recyclerBarEntry) {
        if (AppUtil.isRTLDirection()) {
            return this.f31305a.getResources().getQuantityString(qxi.common_unit_calorie, xr5.j(recyclerBarEntry.getY())) + gv5.CONNECT_VALUE_STR + getFormattedValue(recyclerBarEntry.getY());
        }
        return getFormattedValue(recyclerBarEntry.getY()) + gv5.CONNECT_VALUE_STR + this.f31305a.getResources().getQuantityString(qxi.common_unit_calorie, xr5.j(recyclerBarEntry.getY()));
    }

    @Override // defpackage.gv5, defpackage.onq
    public String getBarLabel(RecyclerBarEntry recyclerBarEntry) {
        return recyclerBarEntry.getY() > 0.0f ? a(recyclerBarEntry) + gv5.CONNECT_STR + TimeDateUtil.getDateYYYYMMddLocalFormat(recyclerBarEntry.localDate) : "";
    }

    public qb3(int i) {
        super(i);
    }
}
