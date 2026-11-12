package v;

import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageWriter;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.h f174069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f174070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0.d f174071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f174072d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f174073e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f174074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f174075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.camera.core.g f174076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.camera.core.impl.p1 f174077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f174078j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageWriter f174079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f174080b = new AtomicBoolean(true);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Executor f174081c;

        public a(Executor executor) {
            this.f174081c = executor;
        }
    }

    public s2(androidx.camera.camera2.internal.compat.h hVar, Executor executor) {
        boolean z14;
        this.f174074f = false;
        this.f174075g = false;
        this.f174069a = hVar;
        this.f174070b = executor;
        int[] iArr = (int[]) hVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null) {
            z14 = false;
            break;
        }
        int length = iArr.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                z14 = false;
                break;
            } else {
                if (iArr[i14] == 4) {
                    z14 = true;
                    break;
                }
                i14++;
            }
        }
        this.f174074f = z14;
        this.f174075g = x.c.f188202a.b(ZslDisablerQuirk.class) != null;
        this.f174071c = new q0.d(3, new e0(12));
    }

    public final void a() throws Exception {
        androidx.camera.core.g gVar = this.f174076h;
        if (gVar != null) {
            gVar.c();
            this.f174076h = null;
        }
        a aVar = this.f174078j;
        if (aVar != null) {
            aVar.f174080b.set(false);
            this.f174078j = null;
        }
        while (true) {
            q0.d dVar = this.f174071c;
            if (dVar.c()) {
                break;
            } else {
                dVar.a().close();
            }
        }
        androidx.camera.core.impl.p1 p1Var = this.f174077i;
        if (p1Var != null) {
            p1Var.a();
            this.f174077i = null;
        }
    }
}
