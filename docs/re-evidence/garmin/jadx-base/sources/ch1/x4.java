package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lch1/x4;", "Lfb2/t;", "Lcom/garmin/android/apps/connectmobile/devices/model/f;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x4 extends fb2.t<com.garmin.android.apps.connectmobile.devices.model.f, String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((com.garmin.android.apps.connectmobile.devices.model.f) obj).getClass();
        return true;
    }

    @Override // fb2.t
    public final Map<String, CharSequence> q(String[] strArr) {
        strArr.getClass();
        HashMap map = new HashMap();
        map.put(gg1.o0.METRIC.f77291a, b(R.string.common_meters_string));
        map.put(gg1.o0.STATUTE_US.f77291a, b(R.string.common_yards_string));
        return map;
    }

    @Override // fb2.t
    public final String r(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        fVar2.getClass();
        am.g2 g2VarA = am.g2.a(fVar2.k0(), fVar2.o0());
        g2VarA.getClass();
        return g2VarA != am.g2.f3980i ? gg1.o0.METRIC.f77291a : fVar2.o0();
    }

    @Override // fb2.t
    public final int t() {
        return View.generateViewId();
    }

    @Override // fb2.t
    public final String u() {
        String strB = b(R.string.lbl_units);
        strB.getClass();
        return strB;
    }

    @Override // fb2.t
    public final String[] v(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        fVar.getClass();
        return new String[]{gg1.o0.METRIC.f77291a, gg1.o0.STATUTE_US.f77291a};
    }

    @Override // fb2.t
    public final void w(String str, com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        double dG;
        String str2 = str;
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        fVar2.getClass();
        if (!p005kotlin.jvm.internal.s.g(str2, fVar2.o0())) {
            if (p005kotlin.jvm.internal.s.g(str2, gg1.o0.METRIC.f77291a)) {
                c22.l3.a aVar = c22.l3.f23124b;
                double dK0 = fVar2.k0();
                c22.m3 m3Var = c22.m3.METER;
                c22.m3 m3Var2 = c22.m3.YARD;
                aVar.getClass();
                dG = c22.l3.a.g(dK0, m3Var, m3Var2);
            } else {
                if (fVar2.k0() == 14.0d) {
                    fVar2.J1(15.0d);
                }
                c22.l3.a aVar2 = c22.l3.f23124b;
                double dK1 = fVar2.k0();
                c22.m3 m3Var3 = c22.m3.YARD;
                c22.m3 m3Var4 = c22.m3.METER;
                aVar2.getClass();
                dG = c22.l3.a.g(dK1, m3Var3, m3Var4);
            }
            fVar2.J1(dG);
        }
        if (str2 != null) {
            fVar2.A1(str2, "poolLengthUnit");
        }
    }
}
