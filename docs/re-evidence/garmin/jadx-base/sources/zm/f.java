package zm;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class f extends p005kotlin.jvm.internal.q implements e23.l<Integer, Entry> {
    public f(Object obj) {
        super(1, obj, IBarLineScatterCandleBubbleDataSet.class, "getEntryForIndex", "getEntryForIndex(I)Lcom/github/mikephil/charting/data/Entry;", 0);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.github.mikephil.charting.data.Entry] */
    @Override // e23.l
    public final Entry invoke(Integer num) {
        return ((IBarLineScatterCandleBubbleDataSet) this.receiver).getEntryForIndex(num.intValue());
    }
}
