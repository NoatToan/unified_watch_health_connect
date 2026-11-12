package lm;

import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.data.LineDataSet;
import com.google.firebase.messaging.Constants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llm/e;", "Lcom/github/mikephil/chartingv2/data/LineDataSet;", "", "Lcom/github/mikephil/chartingv2/data/Entry;", "yVals", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends LineDataSet {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List<? extends Entry> list, String str) {
        super(list, str);
        list.getClass();
        str.getClass();
    }

    @Override // com.github.mikephil.chartingv2.data.DataSet, com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public final void calcMinMax(int i14, int i15) {
        int size;
        List<T> list = this.mYVals;
        if (list == 0 || (size = list.size()) == 0) {
            return;
        }
        if (i15 == 0 || i15 >= size) {
            i15 = size - 1;
        }
        this.mYMin = Float.MAX_VALUE;
        this.mYMax = -3.4028235E38f;
        if (i14 <= i15) {
            while (true) {
                Entry entry = (Entry) this.mYVals.get(i14);
                if (entry != null && !Float.isNaN(entry.getVal()) && entry.getVal() != 300.0f) {
                    if (entry.getVal() < this.mYMin) {
                        this.mYMin = entry.getVal();
                    }
                    if (entry.getVal() > this.mYMax) {
                        this.mYMax = entry.getVal();
                    }
                }
                if (i14 == i15) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        if (this.mYMin == Float.MAX_VALUE) {
            this.mYMin = 0.0f;
            this.mYMax = 0.0f;
        }
    }
}
