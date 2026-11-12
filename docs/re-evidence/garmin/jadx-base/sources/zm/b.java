package zm;

import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements IFillFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f205200b;

    public /* synthetic */ b(c cVar, int i14) {
        this.f205199a = i14;
        this.f205200b = cVar;
    }

    @Override // com.github.mikephil.charting.formatter.IFillFormatter
    public final float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
        int i14 = this.f205199a;
        c cVar = this.f205200b;
        switch (i14) {
            case 0:
                int i15 = c.f205201y;
                break;
            default:
                int i16 = c.f205201y;
                break;
        }
        return cVar.n().getAxisLeft().getAxisMaximum();
    }
}
