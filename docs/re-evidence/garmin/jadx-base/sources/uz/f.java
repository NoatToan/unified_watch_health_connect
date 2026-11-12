package uz;

import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\f\b\u0003\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00042\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006B/\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Luz/f;", "ChartType", "OverlayType", "Data", "Lcom/github/mikephil/charting/interfaces/datasets/IBarLineScatterCandleBubbleDataSet;", "DataSet", "Luz/b;", "chartType", "Luz/c;", "dataConfigFactory", "<init>", "(Ljava/lang/Object;Luz/c;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f<ChartType, OverlayType, Data, DataSet extends IBarLineScatterCandleBubbleDataSet<?>> extends b<ChartType, OverlayType, Data, DataSet> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ChartType charttype, c<ChartType, OverlayType, Data, DataSet> cVar) {
        super(charttype, cVar);
        cVar.getClass();
    }

    @Override // uz.b, qz.c
    public final List<xz.f> u(Data data) {
        List<xz.f> listU = this.f173477c.u(data);
        qz.c<Data, DataSet> cVar = this.f173478d;
        List<xz.f> listU2 = cVar != null ? cVar.u(data) : null;
        if (listU == null) {
            return listU2;
        }
        return listU2 == null ? listU : h0.C0(listU, listU2);
    }

    @Override // uz.b
    public final int x() {
        return 255;
    }
}
