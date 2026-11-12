package ch1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lch1/g6;", "Lch1/m3;", "Lzk0/e;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g6 extends m3<zk0.e, Double> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f27356e = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((zk0.e) obj).getClass();
        return true;
    }

    @Override // ch1.a5
    public final Object s(Object obj) {
        zk0.e eVar = (zk0.e) obj;
        eVar.getClass();
        c22.l3.a aVar = c22.l3.f23124b;
        double goalValue = eVar.getGoalValue();
        aVar.getClass();
        return Double.valueOf(c22.l3.a.P1(goalValue));
    }

    @Override // ch1.a5
    public final int t() {
        return R.id.user_settings_weight_goal;
    }

    @Override // ch1.a5
    public final String u() {
        String strB = b(R.string.lbl_weight_goal);
        strB.getClass();
        return strB;
    }

    @Override // ch1.a5
    public final xg1.c v(Object obj) {
        zk0.e eVar = (zk0.e) obj;
        eVar.getClass();
        return new a0.h(21, this, eVar);
    }

    @Override // ch1.a5
    public final xg1.r<Double> w() {
        return new f6(this);
    }

    @Override // ch1.a5
    public final void x(Object obj, Object obj2) {
        Double d14 = (Double) obj;
        zk0.e eVar = (zk0.e) obj2;
        eVar.getClass();
        c22.l3.a aVar = c22.l3.f23124b;
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        aVar.getClass();
        eVar.k(dDoubleValue * ((double) 1000));
    }

    @Override // ch1.m3
    public final /* bridge */ /* synthetic */ Double y() {
        return Double.valueOf(0.0d);
    }
}
