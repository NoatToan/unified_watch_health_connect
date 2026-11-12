package yz;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyz/a;", "Lcom/github/mikephil/charting/formatter/IFillFormatter;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "boundaryDataSet", "<init>", "(Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements IFillFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ILineDataSet f200224a;

    public /* synthetic */ a(ILineDataSet iLineDataSet, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : iLineDataSet);
    }

    public final List<Entry> a() {
        ILineDataSet iLineDataSet = this.f200224a;
        if (iLineDataSet == null) {
            return null;
        }
        iLineDataSet.getClass();
        return ((LineDataSet) iLineDataSet).getValues();
    }

    @Override // com.github.mikephil.charting.formatter.IFillFormatter
    public final float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
        ILineDataSet iLineDataSet2 = this.f200224a;
        if (iLineDataSet2 != null) {
            return iLineDataSet2.getYMin();
        }
        return 0.0f;
    }

    public a(ILineDataSet iLineDataSet) {
        this.f200224a = iLineDataSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
