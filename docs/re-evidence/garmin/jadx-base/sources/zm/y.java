package zm;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzm/y;", "Lf00/e$b$a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y implements f00.e.b.a {
    @Override // f00.e.b.a
    public final boolean a(Entry entry, ILineDataSet iLineDataSet) {
        entry.getClass();
        return Float.isNaN(entry.getY()) || Float.isNaN(entry.getX());
    }
}
