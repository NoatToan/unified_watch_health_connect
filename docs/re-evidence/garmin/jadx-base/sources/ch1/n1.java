package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class n1 extends xg1.r<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1 f27420a;

    public n1(o1 o1Var) {
        this.f27420a = o1Var;
    }

    @Override // xg1.r
    public final String a(Double d14) {
        Double d15 = d14;
        o1 o1Var = this.f27420a;
        if (d15 == null || d15.doubleValue() <= 0.0d) {
            int i14 = o1.f27424e;
            return o1Var.b(R.string.no_value);
        }
        boolean zY = ((f12.l) KoinJavaComponent.get(f12.l.class)).y();
        int i15 = o1.f27424e;
        return c22.l3.f(d15.floatValue(), o1Var.f70343a, zY);
    }

    @Override // xg1.r
    public final String b(Context context, Double d14) {
        return oi0.d.a(context, super.b(context, d14), new cg1.e(11));
    }
}
