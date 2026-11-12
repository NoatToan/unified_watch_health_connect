package m0;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import b0.c1;
import com.garmin.android.gfdi.framework.DeviceManager;
import java.io.File;
import java.io.IOException;
import z0.a0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements k7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f115493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f115494c;

    public /* synthetic */ c(int i14, Object obj, Object obj2) {
        this.f115492a = i14;
        this.f115493b = obj;
        this.f115494c = obj2;
    }

    @Override // k7.b
    public final void accept(Object obj) throws IOException {
        int i14 = this.f115492a;
        Object obj2 = this.f115494c;
        Object obj3 = this.f115493b;
        switch (i14) {
            case 0:
                ((Surface) obj3).release();
                ((SurfaceTexture) obj2).release();
                break;
            case 1:
                ((DeviceManager) obj2).terminate();
                ((na2.c) obj3).f125221e.error("Failed to start GFDI device", (Throwable) obj);
                break;
            case 2:
                r0.e eVar = (r0.e) obj3;
                c1 c1Var = (c1) obj2;
                c1Var.close();
                Surface surface = (Surface) eVar.f148714h.remove(c1Var);
                if (surface != null) {
                    r0.j jVar = eVar.f148707a;
                    t0.d.d(true, jVar.f148726a);
                    t0.d.c(jVar.f148728c);
                    jVar.i(surface, true);
                }
                break;
            case 3:
                SidecarCompat sidecarCompat = (SidecarCompat) obj3;
                Activity activity = (Activity) obj2;
                SidecarCompat.b bVar = sidecarCompat.f11405e;
                if (bVar != null) {
                    bVar.a(activity, sidecarCompat.d(activity));
                }
                break;
            case 4:
                s0.e eVar2 = (s0.e) obj3;
                c1 c1Var2 = (c1) obj2;
                c1Var2.close();
                Surface surface2 = (Surface) eVar2.f155267h.remove(c1Var2);
                if (surface2 != null) {
                    s0.c cVar = eVar2.f155260a;
                    t0.d.d(true, cVar.f148726a);
                    t0.d.c(cVar.f148728c);
                    cVar.i(surface2, true);
                }
                break;
            case 5:
                wt2.a aVar = (wt2.a) obj3;
                File file = (File) obj2;
                wt2.k.c cVar2 = (wt2.k.c) obj;
                wt2.a.C3482a c3482a = wt2.a.f187141k;
                if (cVar2 != null) {
                    aVar.f(null, "sendGpsEphemerisEpoData", cVar2.name() + " for file [" + file.getAbsolutePath() + ']');
                }
                break;
            default:
                a0 a0Var = (a0) obj3;
                androidx.concurrent.futures.b.a aVar2 = (androidx.concurrent.futures.b.a) obj2;
                Throwable th3 = (Throwable) obj;
                if (a0Var.W == null) {
                    if (th3 instanceof EncodeException) {
                        a0Var.s(a0.f.ERROR_ENCODER);
                    } else {
                        a0Var.s(a0.f.ERROR_SOURCE);
                    }
                    a0Var.W = th3;
                    a0Var.y(true);
                    aVar2.b(null);
                }
                break;
        }
    }
}
