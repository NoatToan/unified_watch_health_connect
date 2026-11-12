package bm;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import android.util.Size;
import android.widget.RadioButton;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.a1;
import androidx.camera.core.impl.c1;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.n2;
import b0.w0;
import c22.b1;
import c22.b2;
import c22.l3;
import c22.m3;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.u0;
import o53.s0;
import p005kotlin.Unit;
import r22.s1;
import v.e2;
import v.g2;
import v.x1;
import v.y1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h0 implements s1.e, l52.u, fa.j.a, com.garmin.android.library.mapsdkadapter.i.o, l0.a, androidx.concurrent.futures.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18812e;

    public /* synthetic */ h0(ja.b.a aVar, sa.i iVar, sa.j jVar, IOException iOException, boolean z14) {
        this.f18808a = 2;
        this.f18809b = aVar;
        this.f18810c = iVar;
        this.f18811d = jVar;
        this.f18812e = iOException;
    }

    @Override // r22.s1.e
    public void a(int i14, int i15) {
        String string;
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar = (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d) this.f18809b;
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e eVar = (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e) this.f18810c;
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.g gVar = (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.g) this.f18811d;
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a aVar = (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a) this.f18812e;
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar2 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
        Context context = eVar.getContext();
        RadioButton radioButton = gVar.C;
        boolean zIsChecked = radioButton != null ? radioButton.isChecked() : false;
        dVar.getClass();
        aVar.getClass();
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar = dVar.f28864b;
        if (cVar != null) {
            if (i15 < 10) {
                string = i14 + b2.f23010b + "0" + i15;
            } else {
                char c14 = b2.f23010b;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i14);
                sb3.append(c14);
                sb3.append(i15);
                string = sb3.toString();
            }
            l3.a aVar3 = l3.f23124b;
            double dB = b1.b(string);
            m3 m3Var = !zIsChecked ? m3.MILE : m3.KILOMETER;
            m3 m3Var2 = m3.METER;
            aVar3.getClass();
            double dG = l3.a.g(dB, m3Var, m3Var2);
            int i16 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.b.f28860b[aVar.ordinal()];
            if (i16 == 1) {
                cVar.r(dG);
            } else if (i16 == 2) {
                cVar.p(dG);
            } else {
                if (i16 != 3) {
                    u0.r();
                    return;
                }
                cVar.m(dG);
            }
        }
        dVar.N4(context);
        eVar.z6(dVar, aVar);
    }

    @Override // l0.a
    public ListenableFuture apply(Object obj) {
        DeferrableSurface deferrableSurfaceF;
        androidx.camera.core.impl.m mVar;
        int i14 = this.f18808a;
        Object obj2 = this.f18812e;
        Object obj3 = this.f18811d;
        Object obj4 = this.f18810c;
        Object obj5 = this.f18809b;
        switch (i14) {
            case 4:
                y1 y1Var = (y1) obj5;
                l2 l2Var = (l2) obj4;
                CameraDevice cameraDevice = (CameraDevice) obj3;
                g2 g2Var = (g2) obj2;
                List list = (List) obj;
                Executor executor = y1Var.f174120b;
                if (y1Var.f174127i == y1.b.DE_INITIALIZED) {
                    IllegalStateException illegalStateException = new IllegalStateException("SessionProcessorCaptureSession is closed.");
                    l0.j.a aVar = l0.j.f107810a;
                    return new l0.m.a(illegalStateException);
                }
                if (list.contains(null)) {
                    DeferrableSurface.SurfaceClosedException surfaceClosedException = new DeferrableSurface.SurfaceClosedException("Surface closed", l2Var.b().get(list.indexOf(null)));
                    l0.j.a aVar2 = l0.j.f107810a;
                    return new l0.m.a(surfaceClosedException);
                }
                androidx.camera.core.impl.m mVar2 = null;
                androidx.camera.core.impl.m mVar3 = null;
                androidx.camera.core.impl.m mVar4 = null;
                for (int i15 = 0; i15 < l2Var.b().size(); i15++) {
                    DeferrableSurface deferrableSurface = l2Var.b().get(i15);
                    boolean zEquals = Objects.equals(deferrableSurface.f5476j, w0.class);
                    int i16 = deferrableSurface.f5475i;
                    Size size = deferrableSurface.f5474h;
                    if (zEquals || Objects.equals(deferrableSurface.f5476j, v0.d.class)) {
                        mVar2 = new androidx.camera.core.impl.m(deferrableSurface.c().get(), size, i16);
                    } else if (Objects.equals(deferrableSurface.f5476j, b0.l0.class)) {
                        mVar3 = new androidx.camera.core.impl.m(deferrableSurface.c().get(), size, i16);
                    } else if (Objects.equals(deferrableSurface.f5476j, b0.g0.class)) {
                        mVar4 = new androidx.camera.core.impl.m(deferrableSurface.c().get(), size, i16);
                    }
                }
                l2.f fVar = l2Var.f5603b;
                if (fVar != null) {
                    deferrableSurfaceF = fVar.f();
                    mVar = new androidx.camera.core.impl.m(deferrableSurfaceF.c().get(), deferrableSurfaceF.f5474h, deferrableSurfaceF.f5475i);
                } else {
                    deferrableSurfaceF = null;
                    mVar = null;
                }
                y1Var.f174127i = y1.b.SESSION_INITIALIZED;
                try {
                    ArrayList arrayList = new ArrayList(y1Var.f174123e);
                    if (deferrableSurfaceF != null) {
                        arrayList.add(deferrableSurfaceF);
                    }
                    c1.b(arrayList);
                    try {
                        n2 n2Var = y1Var.f174119a;
                        new androidx.camera.core.impl.n(mVar2, mVar3, mVar4, mVar);
                        l2 l2VarD = n2Var.d();
                        y1Var.f174126h = l2VarD;
                        l0.j.f(l2VarD.b().get(0).f5471e).addListener(new r0.h(25, y1Var, deferrableSurfaceF), k0.b.a());
                        for (DeferrableSurface deferrableSurface2 : y1Var.f174126h.b()) {
                            y1.f174117m.add(deferrableSurface2);
                            l0.j.f(deferrableSurface2.f5471e).addListener(new a1(deferrableSurface2, 3), executor);
                        }
                        l2.h hVar = new l2.h();
                        hVar.a(l2Var);
                        hVar.f5611a.clear();
                        hVar.f5612b.f5821a.clear();
                        hVar.a(y1Var.f174126h);
                        k7.h.b(hVar.c(), "Cannot transform the SessionConfig");
                        l2 l2VarB = hVar.b();
                        v.c1 c1Var = y1Var.f174122d;
                        cameraDevice.getClass();
                        ListenableFuture listenableFutureD = c1Var.d(l2VarB, cameraDevice, g2Var);
                        l0.j.a(listenableFutureD, new x1(y1Var), executor);
                        return listenableFutureD;
                    } catch (Throwable th3) {
                        c1.a(y1Var.f174123e);
                        if (deferrableSurfaceF != null) {
                            deferrableSurfaceF.b();
                        }
                        throw th3;
                    }
                } catch (DeferrableSurface.SurfaceClosedException e4) {
                    l0.j.a aVar3 = l0.j.f107810a;
                    return new l0.m.a(e4);
                }
            default:
                return g2.y((g2) obj5, (CameraDevice) obj4, (w.n) obj3, (List) obj2);
        }
    }

    @Override // androidx.concurrent.futures.b.c
    public Object d(androidx.concurrent.futures.b.a aVar) {
        String str;
        e2 e2Var = (e2) this.f18809b;
        List<DeferrableSurface> list = (List) this.f18810c;
        androidx.camera.camera2.internal.compat.k kVar = (androidx.camera.camera2.internal.compat.k) this.f18811d;
        w.n nVar = (w.n) this.f18812e;
        synchronized (e2Var.f173784a) {
            try {
                synchronized (e2Var.f173784a) {
                    e2Var.v();
                    c1.b(list);
                    e2Var.f173794k = list;
                }
                k7.h.f(e2Var.f173792i == null, "The openCaptureSessionCompleter can only set once!");
                e2Var.f173792i = aVar;
                androidx.camera.camera2.internal.compat.n nVar2 = kVar.f5360a;
                nVar2.getClass();
                SessionConfiguration sessionConfiguration = ((w.n.a) nVar.f180987a).f180988a;
                sessionConfiguration.getClass();
                try {
                    nVar2.f5363a.createCaptureSession(sessionConfiguration);
                    str = "openCaptureSession[session=" + e2Var + "]";
                } catch (CameraAccessException e4) {
                    throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e4);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return str;
    }

    @Override // fa.j.a
    public void invoke(Object obj) {
        ((ja.b) obj).g((ja.b.a) this.f18809b, (sa.i) this.f18810c, (sa.j) this.f18811d, (IOException) this.f18812e);
    }

    @Override // l52.u
    public void o(l52.i.a aVar) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f18809b;
        AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f18810c;
        AtomicBoolean atomicBoolean3 = (AtomicBoolean) this.f18811d;
        AtomicBoolean atomicBoolean4 = (AtomicBoolean) this.f18812e;
        int i14 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
        com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData();
        if ((j0Var != null ? j0Var.f48226k0 : null) != null && j0Var.f48226k0 == qs.f.KICK && !atomicBoolean.get()) {
            atomicBoolean.set(true);
        }
        if ((j0Var != null ? j0Var.f48226k0 : null) != null && j0Var.f48226k0 == qs.f.PULL && !atomicBoolean2.get()) {
            atomicBoolean2.set(true);
        }
        if ((j0Var != null ? j0Var.E : null) != null && !atomicBoolean3.get()) {
            atomicBoolean3.set(true);
        }
        if ((j0Var != null ? j0Var.X : null) != m52.f.INDIVIDUAL_MEDLEY_BY_ROUND) {
            if ((j0Var != null ? j0Var.X : null) != m52.f.REVERSE_INDIVIDUAL_MEDLEY_ORDER || atomicBoolean4.get()) {
                return;
            }
        }
        atomicBoolean4.set(true);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.o
    public void onSnapshotReady(Bitmap bitmap) {
        ot.f fVar = (ot.f) this.f18809b;
        o53.b0 b0Var = (o53.b0) this.f18810c;
        ps.m mVar = (ps.m) this.f18811d;
        Context context = (Context) this.f18812e;
        String str = ot.f.f133585v;
        if (bitmap != null) {
            x53.c cVar = s0.f129406a;
            ge1.b.T(b0Var, x53.b.f189152a, null, new ot.g(bitmap, fVar, mVar, context, null), 2);
            return;
        }
        nt.a aVar = nt.a.f127827a;
        String str2 = fVar.f133587s;
        aVar.getClass();
        str2.getClass();
        ht.s sVar = ht.s.f85508a;
        lt.a.e eVar = new lt.a.e(str2, lt.a.d.MAP_VIEW_FAILED);
        sVar.getClass();
        ht.s.a(eVar);
        Unit unit = Unit.INSTANCE;
    }

    public /* synthetic */ h0(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f18808a = i14;
        this.f18809b = obj;
        this.f18810c = obj2;
        this.f18811d = obj3;
        this.f18812e = obj4;
    }
}
