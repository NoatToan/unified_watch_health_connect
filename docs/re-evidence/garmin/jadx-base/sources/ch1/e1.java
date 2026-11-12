package ch1;

import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class e1 extends xg1.r<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1 f27332a;

    public e1(f1 f1Var) {
        this.f27332a = f1Var;
    }

    @Override // xg1.r
    public final String a(Double d14) {
        Double d15 = d14;
        if (d15 != null) {
            return Integer.toString(d15.intValue());
        }
        int i14 = f1.f27339f;
        return this.f27332a.b(R.string.no_value);
    }
}
