package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.m;
import androidx.camera.core.impl.r;
import androidx.camera.core.s;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class ytf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeferrableSurface f40518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SessionConfig f40519b;
    public final zpo c = new zpo();

    public class a implements jua<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Surface f40520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f40521b;

        public a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f40520a = surface;
            this.f40521b = surfaceTexture;
        }

        @Override // defpackage.jua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r1) {
            this.f40520a.release();
            this.f40521b.release();
        }

        @Override // defpackage.jua
        public void onFailure(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }
    }

    public static class b implements r<s> {
        public final Config z;

        public b() {
            m mVarO = m.O();
            mVarO.z(r.u, new se3());
            this.z = mVarO;
        }

        @Override // androidx.camera.core.impl.p
        public Config e() {
            return this.z;
        }
    }

    public ytf(vf3 vf3Var, hz6 hz6Var) {
        b bVar = new b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size sizeD = d(vf3Var, hz6Var);
        zpe.a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + sizeD);
        surfaceTexture.setDefaultBufferSize(sizeD.getWidth(), sizeD.getHeight());
        Surface surface = new Surface(surfaceTexture);
        SessionConfig.b bVarO = SessionConfig.b.o(bVar);
        bVarO.s(1);
        n6d n6dVar = new n6d(surface);
        this.f40518a = n6dVar;
        oua.b(n6dVar.i(), new a(surface, surfaceTexture), li3.a());
        bVarO.k(this.f40518a);
        this.f40519b = bVarO.m();
    }

    public static /* synthetic */ int f(Size size, Size size2) {
        return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
    }

    public void b() {
        zpe.a("MeteringRepeating", "MeteringRepeating clear!");
        DeferrableSurface deferrableSurface = this.f40518a;
        if (deferrableSurface != null) {
            deferrableSurface.c();
        }
        this.f40518a = null;
    }

    public String c() {
        return "MeteringRepeating";
    }

    public final Size d(vf3 vf3Var, hz6 hz6Var) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) vf3Var.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            zpe.c("MeteringRepeating", "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
            return new Size(0, 0);
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(34);
        if (outputSizes == null) {
            zpe.c("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] sizeArrA = this.c.a(outputSizes);
        List listAsList = Arrays.asList(sizeArrA);
        Collections.sort(listAsList, new Comparator() { // from class: xtf
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ytf.f((Size) obj, (Size) obj2);
            }
        });
        Size sizeD = hz6Var.d();
        long jMin = Math.min(((long) sizeD.getWidth()) * ((long) sizeD.getHeight()), 307200L);
        int length = sizeArrA.length;
        Size size = null;
        int i = 0;
        while (i < length) {
            Size size2 = sizeArrA[i];
            long width = ((long) size2.getWidth()) * ((long) size2.getHeight());
            if (width == jMin) {
                return size2;
            }
            if (width > jMin) {
                if (size == null) {
                    break;
                }
                return size;
            }
            i++;
            size = size2;
        }
        return (Size) listAsList.get(0);
    }

    public SessionConfig e() {
        return this.f40519b;
    }
}
