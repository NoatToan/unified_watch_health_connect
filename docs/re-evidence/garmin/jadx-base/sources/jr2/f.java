package jr2;

import android.util.Pair;
import c83.a0;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p13.w;
import q03.r;
import vg1.t;
import zb0.n0;
import zb0.u0;
import zn2.r0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100564a;

    public /* synthetic */ f(int i14) {
        this.f100564a = i14;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f100564a) {
            case 0:
                String str = DeveloperSettingsActivity.f51946n;
                rd2.f.a().f152045a.getClass();
                return rd2.j.e();
            case 1:
                com.garmin.feature.garminpay.ui.developer.b.C1089b c1089b = com.garmin.feature.garminpay.ui.developer.b.f51982d;
                gh2.a.a().getClass();
                gh2.a.f77421a.error("getConfigurationPairs(): config not initialized");
                return new Pair[0];
            case 2:
                return vn2.i.Y0();
            case 3:
                Map<u0, t> map = n0.f203577a;
                rd2.f.a().f152045a.getClass();
                ArrayList arrayListE = rd2.j.e();
                return arrayListE == null ? new ArrayList() : arrayListE;
            case 4:
                zn2.u0 u0Var = zn2.u0.f205864a;
                String str2 = (String) ge1.b.W(t13.h.f161748a, new r0(null));
                zn2.u0.f205864a.getClass();
                r<a0<fo2.n0>> rVarC = zn2.u0.g().c(str2);
                xw.b bVar = new xw.b(new z81.b(17), 12);
                rVarC.getClass();
                int i14 = w03.b.f181178a;
                return new e13.j(rVarC, bVar);
            default:
                zn2.u0 u0Var2 = zn2.u0.f205864a;
                List<String> listC = w.c("PROFILE");
                zn2.u0.f205864a.getClass();
                return zn2.u0.h().a(listC);
        }
    }
}
