package j1;

import android.content.Intent;
import android.net.Uri;
import android.view.Surface;
import b0.g1;
import java.util.Map;
import z0.a0;
import z0.m0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements k7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f96316b;

    public /* synthetic */ v(Object obj, int i14) {
        this.f96315a = i14;
        this.f96316b = obj;
    }

    @Override // k7.b
    public final void accept(Object obj) {
        switch (this.f96315a) {
            case 0:
                l.a aVar = (l.a) this.f96316b;
                if (aVar != null) {
                    ((a73.f) aVar).a();
                }
                break;
            case 1:
                ((androidx.concurrent.futures.b.a) this.f96316b).b((g1.f) obj);
                break;
            case 2:
                ((km2.b.a) this.f96316b).onComplete(((Boolean) obj).booleanValue());
                break;
            case 3:
                com.garmin.android.apps.connectmobile.c cVar = (com.garmin.android.apps.connectmobile.c) this.f96316b;
                Intent intent = (Intent) obj;
                intent.getClass();
                cVar.startActivity(intent);
                cVar.finish();
                break;
            case 4:
                g1.g gVar = (g1.g) obj;
                for (Map.Entry entry : ((Map) this.f96316b).entrySet()) {
                    int iB = gVar.b() - ((t0.f) entry.getKey()).c();
                    if (((t0.f) entry.getKey()).g()) {
                        iB = -iB;
                    }
                    int iL = j0.v.l(iB);
                    r0.o oVar = (r0.o) entry.getValue();
                    oVar.getClass();
                    j0.u.c(new com.mapbox.maps.d(oVar, iL, -1, 4));
                }
                break;
            case 5:
                ((a0) this.f96316b).I = (Uri) obj;
                break;
            default:
                m0 m0Var = (m0) this.f96316b;
                g1.f fVar = (g1.f) obj;
                fVar.b().hashCode();
                Surface surfaceB = fVar.b();
                if (surfaceB == m0Var.f200680e) {
                    m0Var.f200680e = null;
                    m0Var.f200688m.b(m0Var.f200679d);
                    m0Var.a();
                } else {
                    surfaceB.release();
                }
                break;
        }
    }
}
