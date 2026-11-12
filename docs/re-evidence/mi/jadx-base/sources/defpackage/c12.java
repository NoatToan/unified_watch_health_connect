package defpackage;

import android.graphics.Color;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c12<T extends Entry> extends DataSet<T> implements hpc<T> {
    public int v;

    public c12(List<T> list, String str) {
        super(list, str);
        this.v = Color.rgb(255, SportReportBaseParser.ReportType.avgAscentRate, 115);
    }

    @Override // defpackage.hpc
    public int N0() {
        return this.v;
    }
}
