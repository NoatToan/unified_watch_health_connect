package tl1;

import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.google.firebase.messaging.Constants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltl1/b;", "Lcom/github/mikephil/charting/data/BarDataSet;", "", "Lcom/github/mikephil/charting/data/BarEntry;", "yValues", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends BarDataSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f165272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f165273b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List<? extends BarEntry> list, String str) {
        super(list, str);
        list.getClass();
        str.getClass();
    }

    @Override // com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final int getEntryIndex(Entry entry) {
        return super.getEntryIndex((BarEntry) entry);
    }
}
