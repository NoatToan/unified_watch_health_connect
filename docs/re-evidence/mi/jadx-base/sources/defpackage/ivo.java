package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ivo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f22148a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f22149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f22150b;
        public final Handler c;
        public final pk3 d;
        public final lgi e;
        public final lgi f;
        public final boolean g;

        public a(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, pk3 pk3Var, lgi lgiVar, lgi lgiVar2) {
            this.f22149a = executor;
            this.f22150b = scheduledExecutorService;
            this.c = handler;
            this.d = pk3Var;
            this.e = lgiVar;
            this.f = lgiVar2;
            this.g = new l0a(lgiVar, lgiVar2).b() || new r3r(lgiVar).i() || new k0a(lgiVar2).d();
        }

        public ivo a() {
            return new ivo(this.g ? new hvo(this.e, this.f, this.d, this.f22149a, this.f22150b, this.c) : new cvo(this.d, this.f22149a, this.f22150b, this.c));
        }
    }

    public interface b {
        pyl a(int i, List<jeh> list, wuo.a aVar);

        Executor c();

        lhe<List<Surface>> k(List<DeferrableSurface> list, long j);

        lhe<Void> l(CameraDevice cameraDevice, pyl pylVar, List<DeferrableSurface> list);

        boolean stop();
    }

    public ivo(b bVar) {
        this.f22148a = bVar;
    }

    public pyl a(int i, List<jeh> list, wuo.a aVar) {
        return this.f22148a.a(i, list, aVar);
    }

    public Executor b() {
        return this.f22148a.c();
    }

    public lhe<Void> c(CameraDevice cameraDevice, pyl pylVar, List<DeferrableSurface> list) {
        return this.f22148a.l(cameraDevice, pylVar, list);
    }

    public lhe<List<Surface>> d(List<DeferrableSurface> list, long j) {
        return this.f22148a.k(list, j);
    }

    public boolean e() {
        return this.f22148a.stop();
    }
}
