package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lch1/m2;", "Lch1/a5;", "Lcom/garmin/android/apps/connectmobile/devices/model/f;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m2 extends a5<com.garmin.android.apps.connectmobile.devices.model.f, Integer> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f27415e = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((com.garmin.android.apps.connectmobile.devices.model.f) obj).getClass();
        return true;
    }

    @Override // ch1.a5
    public final Integer s(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        fVar2.getClass();
        am.g2 g2VarA = am.g2.a(fVar2.k0(), fVar2.o0());
        g2VarA.getClass();
        if (g2VarA != am.g2.f3980i) {
            return 14;
        }
        if (p005kotlin.jvm.internal.s.g(fVar2.o0(), gg1.o0.METRIC.f77291a)) {
            return Integer.valueOf((int) fVar2.k0());
        }
        c22.l3.a aVar = c22.l3.f23124b;
        double dK0 = fVar2.k0();
        c22.m3 m3Var = c22.m3.METER;
        c22.m3 m3Var2 = c22.m3.YARD;
        aVar.getClass();
        return Integer.valueOf((int) c22.l3.a.g(dK0, m3Var, m3Var2));
    }

    @Override // ch1.a5
    /* JADX INFO: renamed from: t */
    public final int getF27326f() {
        return View.generateViewId();
    }

    @Override // ch1.a5
    public final String u() {
        String strB = b(R.string.lbl_distance);
        strB.getClass();
        return strB;
    }

    @Override // ch1.a5
    public final xg1.c<Integer> v(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        fVar2.getClass();
        return new bd0.e(fVar2, 7);
    }

    @Override // ch1.a5
    public final xg1.r<Integer> w() {
        return new l2();
    }

    @Override // ch1.a5
    public final void x(Integer num, com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        double dG;
        Integer num2 = num;
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        fVar2.getClass();
        if (num2 != null) {
            gg1.o0.a aVar = gg1.o0.f77285d;
            String strO0 = fVar2.o0();
            aVar.getClass();
            if (gg1.o0.a.b(strO0).a()) {
                dG = num2.intValue();
            } else {
                c22.l3.a aVar2 = c22.l3.f23124b;
                double dIntValue = num2.intValue();
                c22.m3 m3Var = c22.m3.YARD;
                c22.m3 m3Var2 = c22.m3.METER;
                aVar2.getClass();
                dG = c22.l3.a.g(dIntValue, m3Var, m3Var2);
            }
            fVar2.J1(dG);
        }
    }
}
