package ch1;

import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class e2 extends xg1.r<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f2 f27333a;

    public e2(f2 f2Var) {
        this.f27333a = f2Var;
    }

    @Override // xg1.r
    public final String a(Double d14) {
        Double d15 = d14;
        if (d15 != null) {
            return Integer.toString(d15.intValue());
        }
        int i14 = f2.f27341f;
        return this.f27333a.b(R.string.no_value);
    }
}
