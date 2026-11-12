package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class d6 extends xg1.r<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e6 f27323a;

    public d6(e6 e6Var) {
        this.f27323a = e6Var;
    }

    @Override // xg1.r
    public final String a(Double d14) {
        Double d15 = d14;
        e6 e6Var = this.f27323a;
        if (d15 == null || d15.doubleValue() <= 0.0d) {
            int i14 = e6.f27337e;
            return e6Var.b(R.string.no_value);
        }
        f12.l.f68084a.getClass();
        f12.l lVarA = f12.l.a.a();
        int i15 = e6.f27337e;
        return c22.l3.l(d15.doubleValue(), e6Var.f70343a, lVarA.y());
    }

    @Override // xg1.r
    public final String b(Context context, Double d14) {
        return oi0.d.a(context, super.b(context, d14), new cg1.e(13));
    }
}
