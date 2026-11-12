package hz;

import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.data.LineDataSet;
import com.google.firebase.messaging.Constants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lhz/e;", "Lcom/github/mikephil/chartingv2/data/LineDataSet;", "", "Lcom/github/mikephil/chartingv2/data/Entry;", "yVals", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class e extends LineDataSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f86390a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List<? extends Entry> list, String str) {
        super(list, str);
        list.getClass();
        this.f86390a = true;
    }

    public /* synthetic */ e(List list, String str, int i14, j jVar) {
        this(list, (i14 & 2) != 0 ? null : str);
    }
}
