package fr1;

import android.net.Uri;
import android.widget.Toast;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.strava.StravaConfigActivity;
import fw.p;
import lc.u0;
import o53.f0;
import p005kotlin.Unit;
import q92.v;
import q92.x;
import z10.d3;
import z10.e3;
import z10.f3;
import z10.z2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StravaConfigActivity f73305b;

    public /* synthetic */ g(StravaConfigActivity stravaConfigActivity, int i14) {
        this.f73304a = i14;
        this.f73305b = stravaConfigActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        s92.g gVar;
        int i14 = this.f73304a;
        int i15 = 3;
        int i16 = 2;
        int i17 = 1;
        StravaConfigActivity stravaConfigActivity = this.f73305b;
        switch (i14) {
            case 0:
                z2 z2Var = (z2) obj;
                if (z2Var instanceof z2.a) {
                    d20.f fVar = stravaConfigActivity.f44957n;
                    if (fVar != null && fVar.f57283a != null) {
                        stravaConfigActivity.showProgressOverlay();
                        d20.f fVar2 = stravaConfigActivity.f44957n;
                        s92.g gVar2 = fVar2 != null ? fVar2.f57283a : null;
                        if (gVar2 != null) {
                            f3 f3VarEa = stravaConfigActivity.ea();
                            x xVar = x.DI_CONNECT_STRAVA;
                            xVar.getClass();
                            androidx.lifecycle.m.a(v1.a(f3VarEa).f183565a, new d3(xVar, gVar2, null), 2).f(stravaConfigActivity, new StravaConfigActivity.g(new g(stravaConfigActivity, i17)));
                        }
                    }
                } else if (z2Var instanceof z2.d) {
                    d20.f fVar3 = stravaConfigActivity.f44957n;
                    if (fVar3 != null && fVar3.f57283a != null) {
                        stravaConfigActivity.showProgressOverlay();
                        d20.f fVar4 = stravaConfigActivity.f44957n;
                        if (fVar4 != null && (gVar = fVar4.f57283a) != null) {
                            f3 f3VarEa2 = stravaConfigActivity.ea();
                            x xVar2 = x.DI_CONNECT_STRAVA;
                            xVar2.getClass();
                            androidx.lifecycle.m.a(v1.a(f3VarEa2).f183565a, new e3(xVar2, gVar, null), 2).f(stravaConfigActivity, new StravaConfigActivity.g(new g(stravaConfigActivity, i16)));
                        }
                    }
                } else {
                    StravaConfigActivity.a aVar = StravaConfigActivity.f44941r;
                    if (z2Var instanceof z2.c) {
                        stravaConfigActivity.ca();
                    } else if (z2Var instanceof z2.b) {
                        Uri uri = Uri.parse(((z2.b) z2Var).f201348a);
                        uri.getClass();
                        g22.a.c(stravaConfigActivity, uri);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                v vVar = (v) obj;
                StravaConfigActivity.a aVar2 = StravaConfigActivity.f44941r;
                stravaConfigActivity.hideProgressOverlay();
                if (vVar != null) {
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.b(a2Var, "StravaConfigActivity", "Consent grant SUCCESS (status = " + vVar + ")");
                    f0.N(new k((m) stravaConfigActivity.f44959p.getValue(), null)).f(stravaConfigActivity, new StravaConfigActivity.g(new g(stravaConfigActivity, i15)));
                } else {
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.f(a2Var2, "StravaConfigActivity", "Consent grant ERROR");
                    Toast.makeText(stravaConfigActivity, R.string.txt_error_occurred, 0).show();
                }
                return Unit.INSTANCE;
            case 2:
                v vVar2 = (v) obj;
                StravaConfigActivity.a aVar5 = StravaConfigActivity.f44941r;
                stravaConfigActivity.hideProgressOverlay();
                if (vVar2 != null) {
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.b(a2Var3, "StravaConfigActivity", "Consent revoke SUCCESS (status = " + vVar2 + ")");
                    stravaConfigActivity.showProgressOverlay();
                    cw.v.f55954b.getClass();
                    cw.v vVarA = cw.v.a.a();
                    if (vVarA != null) {
                        stravaConfigActivity.f44960q.add(Long.valueOf(vVarA.M(true, stravaConfigActivity.f44950g)));
                    }
                } else {
                    i2.a aVar7 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar7.getClass();
                    i2.a.f(a2Var4, "StravaConfigActivity", "Consent revoke ERROR");
                    Toast.makeText(stravaConfigActivity, R.string.txt_error_occurred, 0).show();
                }
                return Unit.INSTANCE;
            default:
                g3 g3Var = (g3) obj;
                StravaConfigActivity.a aVar8 = StravaConfigActivity.f44941r;
                g3Var.getClass();
                p pVar = g3Var.f35300a;
                String str = (String) g3Var.f35301b;
                int i18 = StravaConfigActivity.b.f44961a[pVar.ordinal()];
                if (i18 != 1) {
                    if (i18 != 2 && i18 != 3) {
                        u0.r();
                        return null;
                    }
                    stravaConfigActivity.hideProgressOverlay();
                    if (!stravaConfigActivity.isFinishing()) {
                        try {
                            Uri uriFa = StravaConfigActivity.fa(Uri.parse(str));
                            uriFa.getClass();
                            g22.a.d(stravaConfigActivity, uriFa);
                        } catch (Exception e4) {
                            a2 a2Var5 = a2.GENERAL;
                            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Error opening Strava app connect page ");
                            i2.f36769a.getClass();
                            i2.a.e(a2Var5, strD);
                            Uri uriFa2 = StravaConfigActivity.fa(null);
                            uriFa2.getClass();
                            g22.a.d(stravaConfigActivity, uriFa2);
                        }
                    }
                    break;
                } else {
                    stravaConfigActivity.showProgressOverlay();
                }
                return Unit.INSTANCE;
        }
    }
}
