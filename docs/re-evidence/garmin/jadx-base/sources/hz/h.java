package hz;

import com.github.mikephil.chartingv2.data.DataSet;
import com.github.mikephil.chartingv2.data.Entry;
import com.google.firebase.messaging.Constants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B!\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\nB)\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lhz/h;", "Lhz/g;", "", "Lcom/github/mikephil/chartingv2/data/Entry;", "yVals", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "entryList", "(Ljava/util/List;)V", "", "delta", "(Ljava/util/List;Ljava/lang/String;I)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class h extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f86401c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List<? extends Entry> list, String str, int i14) {
        super(list, str);
        list.getClass();
        this.f86401c = i14;
    }

    @Override // com.github.mikephil.chartingv2.data.DataSet, com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public final int getEntryIndex(int i14, DataSet.Rounding rounding) {
        rounding.getClass();
        int size = this.mYVals.size() - 1;
        int i15 = 0;
        while (i15 < size) {
            int i16 = (size + i15) / 2;
            if (i14 == ((Entry) this.mYVals.get(i16)).getXIndex()) {
                while (i16 > 0 && ((Entry) this.mYVals.get(i16 - 1)).getXIndex() == i14) {
                    i16--;
                }
                return i16;
            }
            int i17 = i16 + 1;
            if (((int) Math.abs(((Entry) this.mYVals.get(i17)).getXIndex() - i14)) <= ((int) Math.abs(((Entry) this.mYVals.get(i16)).getXIndex() - i14))) {
                i15 = i17;
            } else {
                size = i16;
            }
        }
        if (size == -1) {
            return size;
        }
        int xIndex = ((Entry) this.mYVals.get(size)).getXIndex();
        if (rounding == DataSet.Rounding.UP) {
            return (xIndex >= i14 || size >= this.mYVals.size() + (-1)) ? size : size + 1;
        }
        return (rounding != DataSet.Rounding.DOWN || xIndex <= i14 || size <= 0) ? size : size - 1;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [com.github.mikephil.chartingv2.data.Entry] */
    @Override // com.github.mikephil.chartingv2.data.DataSet, com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public final float getYValForXIndex(int i14) {
        ?? entryForXIndex;
        List<T> list = this.mYVals;
        if (list != 0 && !list.isEmpty()) {
            int i15 = this.f86401c;
            if (i14 + i15 >= ((Entry) this.mYVals.get(0)).getXIndex() && i14 - i15 <= ((Entry) com.airbnb.lottie.animation.keyframe.a.c(1, this.mYVals)).getXIndex() && (entryForXIndex = getEntryForXIndex(i14)) != 0) {
                return entryForXIndex.getVal();
            }
        }
        return Float.NaN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List<? extends Entry> list) {
        super(list, null);
        list.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List<? extends Entry> list, String str) {
        super(list, str);
        list.getClass();
    }
}
