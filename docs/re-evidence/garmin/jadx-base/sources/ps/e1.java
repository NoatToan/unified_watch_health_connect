package ps;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lps/e1;", "Lps/t1;", "Lps/b1;", "metric", "", "", "values", "intervals", "<init>", "(Lps/b1;Ljava/util/List;Ljava/util/List;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e1 extends t1 {
    public e1(b1 b1Var, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(b1Var, (i14 & 2) != 0 ? p13.j0.f134944a : list, (i14 & 4) != 0 ? p13.j0.f134944a : list2);
    }

    @Override // ps.t1
    public final int b(Context context, Double d14) {
        context.getClass();
        return (d14 == null || !Double.isNaN(d14.doubleValue())) ? super.b(context, d14) : a7.b.getColor(context, R.color.gds_data_viz_neutral_secondary);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(b1 b1Var, List<Double> list, List<Double> list2) {
        super(b1Var, list, list2);
        b1Var.getClass();
        list.getClass();
        list2.getClass();
    }
}
