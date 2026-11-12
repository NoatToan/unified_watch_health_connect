package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.text.WordUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lch1/h3;", "Lfb2/r;", "Lcom/garmin/android/apps/connectmobile/devices/model/f;", "Lam/g2;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzb0/u0;", "garminDeviceEnum", "<init>", "(Landroid/content/Context;Lzb0/u0;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h3 extends fb2.r<com.garmin.android.apps.connectmobile.devices.model.f, am.g2> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<am.g2, Integer> f27363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap<am.g2, CharSequence> f27364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final am.g2[] f27365h;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27366a;

        static {
            int[] iArr = new int[zb0.u0.values().length];
            try {
                iArr[zb0.u0.f203764l2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f27366a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(Context context, zb0.u0 u0Var) {
        super(context);
        context.getClass();
        u0Var.getClass();
        this.f27363f = new HashMap<>();
        this.f27364g = new HashMap<>();
        am.g2[] g2VarArrValues = a.f27366a[u0Var.ordinal()] == 1 ? new am.g2[]{am.g2.f3977f, am.g2.f3979h, am.g2.f3976e} : am.g2.values();
        this.f27365h = g2VarArrValues;
        for (am.g2 g2Var : g2VarArrValues) {
            this.f27363f.put(g2Var, Integer.valueOf(View.generateViewId()));
            this.f27364g.put(g2Var, WordUtils.capitalize(context.getString(g2Var.f3983b, g2Var.f3982a)));
        }
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((com.garmin.android.apps.connectmobile.devices.model.f) obj).getClass();
        return true;
    }

    @Override // fb2.r
    public final Map<am.g2, CharSequence> r(am.g2[] g2VarArr) {
        g2VarArr.getClass();
        return this.f27364g;
    }

    @Override // fb2.r
    public final am.g2 s(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        fVar2.getClass();
        am.g2 g2VarA = am.g2.a(fVar2.k0(), fVar2.o0());
        g2VarA.getClass();
        return g2VarA;
    }

    @Override // fb2.r
    public final int t() {
        return View.generateViewId();
    }

    @Override // fb2.r
    public final am.g2[] v(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        return this.f27365h;
    }

    @Override // fb2.r
    public final int w() {
        return 0;
    }

    @Override // fb2.r
    public final Map<am.g2, Integer> x() {
        return this.f27363f;
    }

    @Override // fb2.r
    public final void z(am.g2 g2Var, com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        am.g2 g2Var2 = g2Var;
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        fVar2.getClass();
        if (g2Var2 == null) {
            return;
        }
        if (p005kotlin.jvm.internal.s.g(g2Var2.f3985d, qs.y.UNIT_DISTANCE_METER.f147239a)) {
            fVar2.J1(g2Var2.f3984c);
            String str = gg1.o0.METRIC.f77291a;
            str.getClass();
            fVar2.A1(str, "poolLengthUnit");
            return;
        }
        c22.l3.a aVar = c22.l3.f23124b;
        double d14 = g2Var2.f3984c;
        c22.m3 m3Var = c22.m3.YARD;
        c22.m3 m3Var2 = c22.m3.METER;
        aVar.getClass();
        fVar2.J1(c22.l3.a.g(d14, m3Var, m3Var2));
        String str2 = gg1.o0.STATUTE_US.f77291a;
        str2.getClass();
        fVar2.A1(str2, "poolLengthUnit");
    }
}
