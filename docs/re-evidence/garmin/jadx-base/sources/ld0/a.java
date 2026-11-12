package ld0;

import android.content.Context;
import c22.b0;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.performance.acclimation.presentation.HeatAltitudeAcclimationActivity;
import gg1.o0;
import il.b;
import java.util.Locale;
import p005kotlin.Metadata;
import ro0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lld0/a;", "Lil/b;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements b {
    @Override // il.b
    public final void a(Context context) {
        context.getClass();
        HeatAltitudeAcclimationActivity.a aVar = HeatAltitudeAcclimationActivity.f39835o;
        c61.a aVar2 = c61.a.HEAT;
        aVar.getClass();
        HeatAltitudeAcclimationActivity.a.a(context, aVar2);
    }

    @Override // il.b
    public final String b(Context context, String str) {
        String strA = gm.b.a(context, str);
        strA.getClass();
        return strA;
    }

    @Override // il.b
    public final void c(Context context) {
        context.getClass();
        String str = b0.b(null).equalsIgnoreCase(Locale.JAPAN.getCountry()) ? "BLOOD_EFFICIENCY_ACTION" : null;
        HelpActivity.a aVar = HelpActivity.f36653a;
        l lVar = l.PULSE_OX;
        aVar.getClass();
        HelpActivity.a.d(context, lVar, str, null);
    }

    @Override // il.b
    public final String d(l22.a aVar, Integer num, o0 o0Var, boolean z14) {
        b61.a.f16163a.getClass();
        return b61.a.b(aVar, num, o0Var, z14);
    }

    @Override // il.b
    public final void e(Context context) {
        context.getClass();
        HeatAltitudeAcclimationActivity.a aVar = HeatAltitudeAcclimationActivity.f39835o;
        c61.a aVar2 = c61.a.ALTITUDE;
        aVar.getClass();
        HeatAltitudeAcclimationActivity.a.a(context, aVar2);
    }
}
