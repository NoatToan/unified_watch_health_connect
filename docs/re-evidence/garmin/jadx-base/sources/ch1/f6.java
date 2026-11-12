package ch1;

import android.content.Context;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lch1/f6;", "Lxg1/r;", "", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f6 extends xg1.r<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g6 f27347a;

    public f6(g6 g6Var) {
        this.f27347a = g6Var;
    }

    @Override // xg1.r
    public final String a(Double d14) {
        Double d15 = d14;
        g6 g6Var = this.f27347a;
        if (d15 == null || d15.doubleValue() <= 0.0d) {
            int i14 = g6.f27356e;
            return g6Var.b(R.string.no_value);
        }
        c22.l3.a aVar = c22.l3.f23124b;
        int i15 = g6.f27356e;
        String strC1 = c22.l3.a.C1(aVar, g6Var.f70343a, d15.doubleValue(), ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), false, null, 56);
        return TextUtils.isEmpty(strC1) ? g6Var.b(R.string.no_value) : strC1;
    }

    @Override // xg1.r
    public final String b(Context context, Double d14) {
        context.getClass();
        return oi0.c.A(context, new f(1), super.b(context, d14));
    }
}
