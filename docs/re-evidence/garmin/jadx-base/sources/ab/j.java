package ab;

import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.util.Range;
import android.util.TypedValue;
import android.view.Surface;
import android.widget.TextView;
import androidx.camera.core.impl.k0;
import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.o0;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.r0;
import androidx.camera.core.impl.t1;
import androidx.camera.core.impl.y0;
import androidx.camera.core.impl.z1;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.lifecycle.p;
import androidx.lifecycle.z0;
import androidx.media3.common.d0;
import androidx.media3.exoplayer.p0;
import androidx.media3.exoplayer.s0;
import androidx.media3.exoplayer.v;
import androidx.media3.exoplayer.z;
import b0.g0;
import b0.g1;
import b0.o;
import b0.u;
import b0.w0;
import b0.x;
import bd0.a0;
import bd0.y;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.BLEDeviceSetupActivity;
import com.garmin.android.apps.connectmobile.devices.setup.DeviceSetupProgressListViewFragment;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.C;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2477c;

    public /* synthetic */ j(int i14, Object obj, Object obj2) {
        this.f2475a = i14;
        this.f2476b = obj;
        this.f2477c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j8;
        boolean z14;
        a0 a0Var;
        boolean z15 = true;
        switch (this.f2475a) {
            case 0:
                k kVar = (k) this.f2476b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f2477c;
                SurfaceTexture surfaceTexture2 = kVar.f2485g;
                Surface surface = kVar.f2486h;
                Surface surface2 = new Surface(surfaceTexture);
                kVar.f2485g = surfaceTexture;
                kVar.f2486h = surface2;
                Iterator<k.b> it = kVar.f2479a.iterator();
                while (it.hasNext()) {
                    it.next().onVideoSurfaceCreated(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 1:
                List list = (List) this.f2476b;
                af.g gVar = (af.g) this.f2477c;
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    ((ye.a) it3.next()).a(gVar.f3022e);
                }
                return;
            case 2:
                com.garmin.android.apps.connectmobile.settings.thirdparty.b bVar = (com.garmin.android.apps.connectmobile.settings.thirdparty.b) this.f2476b;
                String str = (String) this.f2477c;
                ak1.c cVar = bVar.f43969b;
                if (cVar != null) {
                    cVar.n2(str);
                    return;
                }
                return;
            case 3:
                l0 l0Var = (l0) this.f2476b;
                z0<? super u> z0Var = (z0) this.f2477c;
                int i14 = o0.f5664l;
                l0Var.c().getCameraState().k(z0Var);
                return;
            case 4:
                k0 k0Var = (k0) this.f2476b;
                a4.b bVar2 = (a4.b) this.f2477c;
                int i15 = o0.f5664l;
                k0Var.getCameraState().g(bVar2);
                return;
            case 5:
                r0 r0Var = (r0) this.f2476b;
                l0 l0Var2 = (l0) this.f2477c;
                synchronized (r0Var.f5725a) {
                    try {
                        r0Var.f5727c.remove(l0Var2);
                        if (r0Var.f5727c.isEmpty()) {
                            r0Var.f5729e.getClass();
                            r0Var.f5729e.b(null);
                            r0Var.f5729e = null;
                            r0Var.f5728d = null;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            case 6:
                y0 y0Var = (y0) this.f2476b;
                z1.a aVar = (z1.a) this.f2477c;
                y0<Object> y0Var2 = y0.f5863b;
                try {
                    aVar.a(y0Var.f5864a.f107818a);
                    return;
                } catch (InterruptedException | ExecutionException e4) {
                    aVar.onError(e4);
                    return;
                }
            case 7:
                t1 t1Var = (t1) this.f2476b;
                z1.a aVar2 = (z1.a) this.f2477c;
                t1.a aVar3 = (t1.a) t1Var.f5753a.d();
                if (aVar3 == null) {
                    return;
                }
                Throwable th4 = aVar3.f5757b;
                if (th4 != null) {
                    th4.getClass();
                    aVar2.onError(th4);
                    return;
                } else if (th4 == null) {
                    aVar2.a(aVar3.f5756a);
                    return;
                } else {
                    vb.h.z("Result contains an error. Does not contain a value.");
                    return;
                }
            case 8:
                t1 t1Var2 = (t1) this.f2476b;
                androidx.concurrent.futures.b.a aVar4 = (androidx.concurrent.futures.b.a) this.f2477c;
                t1.a aVar5 = (t1.a) t1Var2.f5753a.d();
                if (aVar5 == null) {
                    aVar4.d(new IllegalStateException("Observable has not yet been initialized with a value."));
                    return;
                }
                Throwable th5 = aVar5.f5757b;
                if (th5 != null) {
                    th5.getClass();
                    aVar4.d(th5);
                    return;
                } else if (th5 == null) {
                    aVar4.b(aVar5.f5756a);
                    return;
                } else {
                    vb.h.z("Result contains an error. Does not contain a value.");
                    return;
                }
            case 9:
                Map.Entry entry = (Map.Entry) this.f2476b;
                t1.a aVar6 = (t1.a) this.f2477c;
                z1.a aVar7 = (z1.a) entry.getKey();
                Throwable th6 = aVar6.f5757b;
                if (!(th6 == null)) {
                    th6.getClass();
                    aVar7.onError(th6);
                    return;
                } else if (th6 == null) {
                    aVar7.a(aVar6.f5756a);
                    return;
                } else {
                    vb.h.z("Result contains an error. Does not contain a value.");
                    return;
                }
            case 10:
                p pVar = (p) this.f2476b;
                if (pVar.f7986d.offer((Runnable) this.f2477c)) {
                    pVar.a();
                    return;
                } else {
                    vb.h.z("cannot enqueue any more runnables");
                    return;
                }
            case 11:
                v vVar = (v) this.f2476b;
                z.d dVar = (z.d) this.f2477c;
                int i16 = vVar.H - dVar.f9924c;
                vVar.H = i16;
                if (dVar.f9925d) {
                    vVar.I = dVar.f9926e;
                    vVar.J = true;
                }
                if (i16 == 0) {
                    d0 d0Var = dVar.f9923b.f9318a;
                    if (!vVar.f9744g0.f9318a.p() && d0Var.p()) {
                        vVar.f9746h0 = -1;
                        vVar.f9748i0 = 0L;
                    }
                    if (!d0Var.p()) {
                        List listAsList = Arrays.asList(((s0) d0Var).f9362j);
                        fa.a.d(listAsList.size() == vVar.f9754o.size());
                        for (int i17 = 0; i17 < listAsList.size(); i17++) {
                            ((v.d) vVar.f9754o.get(i17)).f9772b = (d0) listAsList.get(i17);
                        }
                    }
                    boolean z16 = vVar.J;
                    long j14 = C.TIME_UNSET;
                    if (z16) {
                        if (dVar.f9923b.f9319b.equals(vVar.f9744g0.f9319b) && dVar.f9923b.f9321d == vVar.f9744g0.f9336s) {
                            z15 = false;
                        }
                        if (z15) {
                            if (d0Var.p() || dVar.f9923b.f9319b.b()) {
                                j14 = dVar.f9923b.f9321d;
                            } else {
                                p0 p0Var = dVar.f9923b;
                                androidx.media3.exoplayer.source.j.b bVar3 = p0Var.f9319b;
                                long j15 = p0Var.f9321d;
                                Object obj = bVar3.f9519a;
                                d0.b bVar4 = vVar.f9753n;
                                d0Var.g(obj, bVar4);
                                j14 = j15 + bVar4.f8191e;
                            }
                        }
                        j8 = j14;
                        z14 = z15;
                    } else {
                        j8 = -9223372036854775807L;
                        z14 = false;
                    }
                    vVar.J = false;
                    vVar.C(dVar.f9923b, 1, z14, vVar.I, j8, -1, false);
                    return;
                }
                return;
            case 12:
                Runnable runnable = (Runnable) this.f2476b;
                androidx.room.s0 s0Var = (androidx.room.s0) this.f2477c;
                try {
                    runnable.run();
                    return;
                } finally {
                    s0Var.a();
                }
            case 13:
                TextView textView = (TextView) this.f2476b;
                Resources resources = (Resources) this.f2477c;
                textView.setAutoSizeTextTypeUniformWithConfiguration((int) TypedValue.applyDimension(2, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(2, 14.0f, resources.getDisplayMetrics()), 1, 0);
                return;
            case 14:
                bx2.b bVar5 = (bx2.b) this.f2476b;
                bv2.p pVar2 = (bv2.p) this.f2477c;
                if (!bVar5.m()) {
                    pVar2.e(false);
                    return;
                }
                pVar2.e(true);
                if (bVar5.l()) {
                    pVar2.d();
                    return;
                }
                return;
            case 15:
                ((b.g) this.f2476b).addObserverForBackInvoker((b.u) this.f2477c);
                return;
            case 16:
                ((o1.a) this.f2477c).a((b0.b) this.f2476b);
                return;
            case 17:
                x xVar = (x) this.f2476b;
                androidx.concurrent.futures.b.a aVar8 = (androidx.concurrent.futures.b.a) this.f2477c;
                xVar.f14095g.shutdown();
                if (xVar.f14094f != null) {
                    Executor executor = xVar.f14092d;
                    if (executor instanceof o) {
                        o oVar = (o) executor;
                        synchronized (oVar.f14040a) {
                            try {
                                if (!oVar.f14041b.isShutdown()) {
                                    oVar.f14041b.shutdown();
                                }
                            } catch (Throwable th7) {
                                throw th7;
                            }
                        }
                    }
                    xVar.f14094f.quit();
                    break;
                }
                aVar8.b(null);
                return;
            case 18:
                androidx.camera.core.g gVar2 = (androidx.camera.core.g) this.f2476b;
                androidx.camera.core.g gVar3 = (androidx.camera.core.g) this.f2477c;
                g0.d dVar2 = g0.A;
                gVar2.e();
                if (gVar3 != null) {
                    gVar3.e();
                    return;
                }
                return;
            case 19:
                ((o1.a) this.f2477c).a((androidx.camera.core.f) this.f2476b);
                return;
            case 20:
                w0 w0Var = (w0) this.f2476b;
                l0 l0Var3 = (l0) this.f2477c;
                r0.o oVar2 = w0Var.f14081v;
                j0.u.a();
                if (l0Var3 == w0Var.c()) {
                    oVar2.e();
                    return;
                }
                return;
            case 21:
                w0.c cVar2 = (w0.c) this.f2476b;
                g1 g1Var = (g1) this.f2477c;
                w0.b bVar6 = w0.f14076z;
                cVar2.a(g1Var);
                return;
            case 22:
                g1.h hVar = (g1.h) this.f2476b;
                b0.j jVar = (b0.j) this.f2477c;
                Range<Integer> range = g1.f13904q;
                hVar.l(jVar);
                return;
            case 23:
                g1.h hVar2 = (g1.h) this.f2476b;
                g1.g gVar4 = (g1.g) this.f2477c;
                Range<Integer> range2 = g1.f13904q;
                hVar2.l(gVar4);
                return;
            case 24:
                ((b7.g.c) this.f2476b).lambda$callbackSuccessAsync$0((Typeface) this.f2477c);
                return;
            case 25:
                BLEDeviceSetupActivity bLEDeviceSetupActivity = (BLEDeviceSetupActivity) this.f2476b;
                bd0.z zVar = (bd0.z) this.f2477c;
                int i18 = BLEDeviceSetupActivity.f34387q;
                DeviceSetupProgressListViewFragment deviceSetupProgressListViewFragmentJa = bLEDeviceSetupActivity.ja();
                if (deviceSetupProgressListViewFragmentJa == null || (a0Var = deviceSetupProgressListViewFragmentJa.f34439j) == null) {
                    return;
                }
                a0Var.a(y.AUTHENTICATING);
                a0Var.a(y.DISCONNECTING);
                a0Var.a(y.CONNECTING);
                a0Var.a(y.CHECKING_DEVICE_REGISTRATION_STATUS);
                a0Var.a(y.RETRIEVING_GARMIN_DEVICE_XML);
                a0Var.a(y.REGISTERING_DEVICE);
                a0Var.a(y.SENDING_DEVICE_RESET_COMMAND);
                a0Var.a(y.RESETTING_DEVICE);
                a0Var.a(y.CHECKING_FOR_FIRMWARE_UPDATE);
                a0Var.a(y.SYNC_DOWNLOAD_SOFTWARE_UPDATE_SENDING);
                a0Var.add(zVar);
                a0Var.notifyDataSetChanged();
                return;
            case 26:
                androidx.camera.video.internal.audio.b bVar7 = (androidx.camera.video.internal.audio.b) this.f2476b;
                androidx.concurrent.futures.b.a aVar9 = (androidx.concurrent.futures.b.a) this.f2477c;
                bVar7.getClass();
                androidx.camera.video.internal.audio.f fVar = bVar7.f5932d;
                try {
                    int iOrdinal = bVar7.f5935g.ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        bVar7.b(null);
                        bVar7.f5933e.release();
                        fVar.release();
                        if (bVar7.f5937i) {
                            bVar7.f5937i = false;
                            fVar.stop();
                        }
                        androidx.camera.video.internal.audio.b.c cVar3 = androidx.camera.video.internal.audio.b.c.RELEASED;
                        Objects.toString(bVar7.f5935g);
                        Objects.toString(cVar3);
                        bVar7.f5935g = cVar3;
                    }
                    aVar9.b(null);
                    return;
                } catch (Throwable th8) {
                    aVar9.d(th8);
                    return;
                }
            case 27:
                z0.a0.this.f200516c0 = ((androidx.camera.video.internal.audio.b) this.f2476b).f5947s;
                return;
            case 28:
                androidx.camera.video.internal.audio.b.a aVar10 = (androidx.camera.video.internal.audio.b.a) this.f2476b;
                Throwable th9 = (Throwable) this.f2477c;
                z0.a0.c cVar4 = (z0.a0.c) aVar10;
                if (th9 instanceof AudioSourceAccessException) {
                    cVar4.f200548a.accept(th9);
                    return;
                } else {
                    cVar4.getClass();
                    return;
                }
            default:
                hk0.a.f().l(hk0.a.EnumC1667a.FINISHED_WITH_FAILURE, ((cd0.c) this.f2476b).c(), (yl2.e) this.f2477c, "Failed to register device.");
                i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", ".handleDeviceRegistrationFailure(): sent milestone PAIRING FAILED to device");
                return;
        }
    }
}
