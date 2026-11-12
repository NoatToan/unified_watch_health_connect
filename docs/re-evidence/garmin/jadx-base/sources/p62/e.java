package p62;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import android.view.Surface;
import android.widget.Toast;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.v0;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import b0.g1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import com.garmin.garminpay.wallet.PasscodeMissingException;
import com.google.common.util.concurrent.ListenableFuture;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import o53.l1;
import org.joda.time.LocalDate;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.x0;
import p3.p1;
import v.c1;
import v.f2;
import v.g2;
import v.h2;
import z0.m0;
import zn2.z0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements SpinnerDialogView.c, r22.c0.b, com.garmin.android.library.mapsdkadapter.i.k, u03.a, q03.u, fa.g, androidx.concurrent.futures.b.c, l0.a, l52.u, y52.b.a, q03.e, g1.i.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f136222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f136223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f136224d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e(t13.g gVar, o53.d0 d0Var, e23.p pVar) {
        this.f136221a = 11;
        this.f136224d = gVar;
        this.f136222b = d0Var;
        this.f136223c = (v13.i) pVar;
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView.c
    public boolean a(DialogInterface dialogInterface, int i14, int[] iArr) {
        int i15 = this.f136221a;
        Object obj = this.f136223c;
        Object obj2 = this.f136222b;
        Object obj3 = this.f136224d;
        switch (i15) {
            case 0:
                f fVar = (f) obj3;
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) obj2;
                Context context = (Context) obj;
                dialogInterface.getClass();
                iArr.getClass();
                if (i14 == -1) {
                    double dJ = fVar.j(iArr);
                    double dN = fVar.n(j0Var);
                    double dO = fVar.o(j0Var);
                    if (dJ <= dO) {
                        x0 x0Var = x0.f105818a;
                        String string = context.getString(R.string.workout_higher_than_valid_value_confirmation);
                        string.getClass();
                        Toast.makeText(context, String.format(string, Arrays.copyOf(new Object[]{fVar.g(dO)}, 1)), 0).show();
                        return false;
                    }
                    if (dJ >= dN) {
                        x0 x0Var2 = x0.f105818a;
                        String string2 = context.getString(R.string.workout_lower_than_valid_value_confirmation);
                        string2.getClass();
                        Toast.makeText(context, String.format(string2, Arrays.copyOf(new Object[]{fVar.g(dN)}, 1)), 0).show();
                        return false;
                    }
                }
                return true;
            case 1:
                i iVar = (i) obj3;
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) obj2;
                Context context2 = (Context) obj;
                dialogInterface.getClass();
                iArr.getClass();
                if (i14 == -1) {
                    double dJ2 = iVar.j(iArr);
                    if (m52.j.values()[iArr[2]] == m52.j.f116747g) {
                        dJ2 = i.p(iArr);
                    }
                    double dN2 = iVar.n(j0Var2);
                    double dO2 = iVar.o(j0Var2);
                    if (dJ2 <= dO2) {
                        x0 x0Var3 = x0.f105818a;
                        String string3 = context2.getString(R.string.workout_higher_than_valid_value_confirmation);
                        string3.getClass();
                        Toast.makeText(context2, String.format(string3, Arrays.copyOf(new Object[]{iVar.g(dO2)}, 1)), 0).show();
                        return false;
                    }
                    if (dJ2 >= dN2) {
                        x0 x0Var4 = x0.f105818a;
                        String string4 = context2.getString(R.string.workout_lower_than_valid_value_confirmation);
                        string4.getClass();
                        Toast.makeText(context2, String.format(string4, Arrays.copyOf(new Object[]{iVar.g(dN2)}, 1)), 0).show();
                        return false;
                    }
                }
                return true;
            case 2:
                o oVar = (o) obj3;
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var3 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) obj2;
                Context context3 = (Context) obj;
                int i16 = o.f136234e;
                dialogInterface.getClass();
                iArr.getClass();
                if (i14 == -1) {
                    double dJ3 = oVar.j(iArr);
                    double dO3 = oVar.o(j0Var3);
                    double dN3 = oVar.n(j0Var3);
                    if (dJ3 < dO3) {
                        x0 x0Var5 = x0.f105818a;
                        String string5 = context3.getString(R.string.workout_higher_than_valid_value_confirmation);
                        string5.getClass();
                        Toast.makeText(context3, String.format(string5, Arrays.copyOf(new Object[]{oVar.g(dO3 - 1.0d)}, 1)), 0).show();
                        return false;
                    }
                    if (dJ3 > dN3) {
                        x0 x0Var6 = x0.f105818a;
                        String string6 = context3.getString(R.string.workout_lower_than_valid_value_confirmation);
                        string6.getClass();
                        Toast.makeText(context3, String.format(string6, Arrays.copyOf(new Object[]{oVar.g(dN3 + 1.0d)}, 1)), 0).show();
                        return false;
                    }
                }
                return true;
            case 3:
                a0 a0Var = (a0) obj3;
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var4 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) obj2;
                Context context4 = (Context) obj;
                dialogInterface.getClass();
                iArr.getClass();
                if (i14 != -1) {
                    return true;
                }
                int length = iArr.length / 2;
                p13.l.a(length, iArr.length);
                int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, 0, length);
                iArrCopyOfRange.getClass();
                double dJ4 = a0Var.j(iArrCopyOfRange);
                int length2 = iArr.length / 2;
                int length3 = iArr.length;
                p13.l.a(length3, iArr.length);
                int[] iArrCopyOfRange2 = Arrays.copyOfRange(iArr, length2, length3);
                iArrCopyOfRange2.getClass();
                return a0Var.t(context4, dJ4, a0Var.j(iArrCopyOfRange2), a0Var.q(j0Var4), a0Var.p(j0Var4));
            default:
                j0 j0Var5 = (j0) obj3;
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var6 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) obj2;
                Context context5 = (Context) obj;
                int i17 = j0.f136230g;
                dialogInterface.getClass();
                iArr.getClass();
                if (i14 != -1) {
                    return true;
                }
                return j0Var5.t(context5, j0Var5.j(iArr), -1.0d, j0Var5.q(j0Var6), j0Var5.p(j0Var6));
        }
    }

    @Override // fa.g
    public void accept(Object obj) {
        androidx.media3.exoplayer.source.k.a aVar = (androidx.media3.exoplayer.source.k.a) this.f136224d;
        ((androidx.media3.exoplayer.source.k) obj).g(aVar.f9524a, (androidx.media3.exoplayer.source.j.b) this.f136222b, (sa.j) this.f136223c);
    }

    @Override // l0.a
    public ListenableFuture apply(Object obj) {
        InputConfiguration inputConfiguration;
        c1 c1Var = (c1) this.f136224d;
        l2 l2Var = (l2) this.f136222b;
        CameraDevice cameraDevice = (CameraDevice) this.f136223c;
        List list = (List) obj;
        synchronized (c1Var.f173719a) {
            try {
                int iOrdinal = c1Var.f173728j.ordinal();
                if (iOrdinal == 0 || iOrdinal == 7 || iOrdinal == 2) {
                    IllegalStateException illegalStateException = new IllegalStateException("openCaptureSession() should not be possible in state: " + c1Var.f173728j);
                    l0.j.a aVar = l0.j.f107810a;
                    return new l0.m.a(illegalStateException);
                }
                if (iOrdinal != 3) {
                    CancellationException cancellationException = new CancellationException("openCaptureSession() not execute in state: " + c1Var.f173728j);
                    l0.j.a aVar2 = l0.j.f107810a;
                    return new l0.m.a(cancellationException);
                }
                c1Var.f173725g.clear();
                for (int i14 = 0; i14 < list.size(); i14++) {
                    c1Var.f173725g.put(c1Var.f173726h.get(i14), (Surface) list.get(i14));
                }
                c1Var.r(c1.a.OPENING);
                h2 h2Var = new h2(Arrays.asList(c1Var.f173721c, new h2.a(l2Var.f5605d)));
                u.a aVar3 = new u.a(l2Var.f5608g.f5814b);
                v0.a aVarF = v0.a.f(l2Var.f5608g);
                HashMap map = new HashMap();
                int i15 = 35;
                if (c1Var.f173737s && Build.VERSION.SDK_INT >= 35) {
                    map = c1.k(c1.o(l2Var.f5602a), c1Var.f173725g);
                }
                ArrayList arrayList = new ArrayList();
                w.h hVar = null;
                String str = (String) aVar3.N.f(u.a.T, null);
                for (l2.f fVar : l2Var.f5602a) {
                    w.h hVarM = (!c1Var.f173737s || Build.VERSION.SDK_INT < i15) ? hVar : (w.h) map.get(fVar);
                    if (hVarM == null) {
                        hVarM = c1Var.m(fVar, c1Var.f173725g, str);
                        if (c1Var.f173731m.containsKey(fVar.f())) {
                            hVarM.f180969a.c(((Long) c1Var.f173731m.get(fVar.f())).longValue());
                        }
                    }
                    arrayList.add(hVarM);
                    i15 = 35;
                    hVar = null;
                }
                ArrayList arrayListN = c1.n(arrayList);
                g2 g2Var = c1Var.f173722d;
                int i16 = l2Var.f5609h;
                g2Var.f173789f = h2Var;
                w.n nVar = new w.n(i16, arrayListN, g2Var.f173787d, new f2(g2Var));
                if (l2Var.f5608g.f5815c == 5 && (inputConfiguration = l2Var.f5610i) != null) {
                    ((w.n.a) nVar.f180987a).f180988a.setInputConfiguration(w.g.a(inputConfiguration).f180967a.a());
                }
                try {
                    CaptureRequest captureRequestD = v.g0.d(aVarF.e(), cameraDevice, c1Var.f173736r);
                    if (captureRequestD != null) {
                        a0.f fVar2 = c1Var.f173738t;
                        if (fVar2 != null) {
                            fVar2.a();
                        }
                        ((w.n.a) nVar.f180987a).f180988a.setSessionParameters(captureRequestD);
                    }
                    return c1Var.f173722d.u(cameraDevice, nVar, c1Var.f173726h);
                } catch (CameraAccessException e4) {
                    l0.j.a aVar4 = l0.j.f107810a;
                    return new l0.m.a(e4);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // g1.i.c.a
    public void b(Surface surface) {
        k0.h hVar;
        m0 m0Var = (m0) this.f136224d;
        androidx.concurrent.futures.b.a aVar = (androidx.concurrent.futures.b.a) this.f136222b;
        g1 g1Var = (g1) this.f136223c;
        int iOrdinal = m0Var.f200684i.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (g1Var.a()) {
                    Objects.toString(g1Var, "EMPTY");
                    aVar.b(null);
                    m0Var.a();
                    return;
                } else {
                    m0Var.f200680e = surface;
                    Objects.toString(surface);
                    g1Var.b(surface, m0Var.f200677b, new j1.v(m0Var, 6));
                    m0Var.f200684i = m0.a.READY;
                    aVar.b(m0Var.f200679d);
                    return;
                }
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    if (m0Var.f200683h != null && (hVar = m0Var.f200682g) != null) {
                        hVar.execute(new vg1.d(27, m0Var, surface));
                    }
                    Objects.toString(surface);
                    return;
                }
                if (iOrdinal != 4) {
                    wr.g.x("State ", m0Var.f200684i, " is not handled");
                    return;
                }
            }
        }
        Objects.toString(m0Var.f200684i);
        aVar.b(null);
    }

    @Override // q03.u
    public void c(e13.a.C1312a c1312a) throws PasscodeMissingException {
        ps2.n nVar = (ps2.n) this.f136224d;
        String str = (String) this.f136222b;
        String str2 = (String) this.f136223c;
        if (p005kotlin.jvm.internal.s.g(nVar.f140513p.f100665f, Boolean.FALSE)) {
            throw new PasscodeMissingException();
        }
        nVar.f140499b.t(str, str2, new ps2.m(c1312a, 1));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [e23.p, v13.i] */
    @Override // androidx.concurrent.futures.b.c
    public Object d(androidx.concurrent.futures.b.a aVar) {
        switch (this.f136221a) {
            case 11:
                t13.g gVar = (t13.g) this.f136224d;
                o53.d0 d0Var = (o53.d0) this.f136222b;
                ?? r14 = (v13.i) this.f136223c;
                aVar.a(new po.g((l1) gVar.get(l1.f129368i0), 27), ue.j.INSTANCE);
                return ge1.b.T(o53.c0.a(gVar), null, d0Var, new ue.s(r14, aVar, null), 1);
            default:
                m0 m0Var = (m0) this.f136224d;
                g1 g1Var = (g1) this.f136222b;
                g1.d0 d0Var2 = (g1.d0) this.f136223c;
                try {
                    g1.l lVar = m0Var.f200678c;
                    Executor executor = m0Var.f200676a;
                    int i14 = g1Var.f13911g;
                    ((yc.l2) lVar).getClass();
                    g1.r rVar = new g1.r(executor, d0Var2, i14);
                    m0Var.f200679d = rVar;
                    g1.i.b bVar = rVar.f74733g;
                    if (bVar instanceof g1.i.c) {
                        ((g1.i.c) bVar).a(m0Var.f200677b, new e(m0Var, 19, aVar, g1Var));
                    } else {
                        aVar.d(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
                    }
                } catch (InvalidConfigException e4) {
                    aVar.d(e4);
                }
                return "ConfigureVideoEncoderFuture " + m0Var;
        }
    }

    public void e(String str) {
        String str2 = (String) this.f136224d;
        p1 p1Var = (p1) this.f136222b;
        p1 p1Var2 = (p1) this.f136223c;
        p1Var.setValue(str);
        if (p005kotlin.jvm.internal.s.g(str, str2)) {
            return;
        }
        ((e23.l) p1Var2.getF182175a()).invoke(str);
    }

    @Override // q03.e
    public void f(z03.c.a aVar) {
        o53.b0 b0Var = (o53.b0) this.f136224d;
        t13.g gVar = (t13.g) this.f136222b;
        z0.i iVar = (z0.i) this.f136223c;
        o53.a dVar = new w53.d(o53.y.b(b0Var, gVar), aVar);
        v03.c.e(aVar, new v03.a(new w53.c(dVar)));
        dVar.v0(o53.d0.DEFAULT, dVar, iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r22.c0.b
    public void h(Calendar calendar) {
        pb1.l lVar = (pb1.l) this.f136224d;
        r0 r0Var = (r0) this.f136222b;
        db1.m mVar = (db1.m) this.f136223c;
        pb1.l.a aVar = pb1.l.f136861l;
        kx0.m mVarV6 = lVar.v6();
        LocalDate localDate = new LocalDate(calendar.getTimeInMillis());
        ArrayList arrayList = new ArrayList();
        ArrayList<db1.m> arrayList2 = mVarV6.f107066i;
        boolean zIsAfter = true;
        if (arrayList2 != null) {
            for (db1.m mVar2 : arrayList2) {
                if (mVar2 != null) {
                    LocalDate deliveryDate = mVar2.getDeliveryDate();
                    if (deliveryDate != null) {
                        arrayList.add(deliveryDate);
                    } else {
                        LocalDate endDate = mVar2.getEndDate();
                        if (endDate != null) {
                            arrayList.add(endDate);
                        }
                    }
                }
            }
            LocalDate localDate2 = (LocalDate) p13.h0.o0(arrayList);
            if (localDate2 != null) {
                zIsAfter = localDate.isAfter(localDate2.plusDays(279));
            }
        }
        if (zIsAfter) {
            r0Var.f105810a = calendar;
            lVar.u6().setButtonValueLabel(DateFormat.getDateInstance(2, Locale.getDefault()).format(new Date(calendar.getTimeInMillis())));
            mVar.r(new LocalDate(calendar.getTimeInMillis()));
            return;
        }
        androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(lVar.requireContext());
        aVar2.setTitle(R.string.pregnancy_conflicting_dates);
        aVar2.setMessage(lVar.getString(R.string.pregnancy_selected_date_conflict));
        aVar2.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
        androidx.appcompat.app.e eVarCreate = aVar2.create();
        eVarCreate.getClass();
        eVarCreate.show();
    }

    @Override // l52.u
    public void o(l52.i.a aVar) {
        List<String> list;
        com.garmin.android.apps.connectmobile.repcounting.model.d dVarD;
        int i14 = this.f136221a;
        com.garmin.android.apps.connectmobile.repcounting.model.d dVarD2 = null;
        Object obj = this.f136223c;
        Object obj2 = this.f136222b;
        Object obj3 = this.f136224d;
        switch (i14) {
            case 13:
                com.garmin.android.apps.connectmobile.repcounting.model.c cVar = (com.garmin.android.apps.connectmobile.repcounting.model.c) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData();
                m52.d dVar = j0Var.f48217c;
                o13.t tVar = k52.g.f102952a;
                int i15 = dVar == null ? -1 : k52.g.a.f102957c[dVar.ordinal()];
                if (i15 == 1 || i15 == 2) {
                    com.garmin.android.apps.connectmobile.repcounting.model.d dVarD3 = cVar.D(j0Var.H0, j0Var.g());
                    List<String> list2 = dVarD3 != null ? dVarD3.f41108g : null;
                    List<String> list3 = dVarD3 != null ? dVarD3.f41109h : null;
                    if (list2 != null) {
                        arrayList.addAll(list2);
                    }
                    if (list3 != null) {
                        arrayList2.addAll(list3);
                    }
                }
                break;
            default:
                Map map = (Map) obj3;
                com.garmin.android.apps.connectmobile.workouts.data.model.h0 h0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.h0) obj2;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                v52.g gVar = v52.g.f175774a;
                com.garmin.android.apps.connectmobile.repcounting.model.c cVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.c) map.get(Integer.valueOf(h0Var.f48193h.f116766b));
                if (cVar2 == null || (dVarD = cVar2.D(((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData()).H0, ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData()).g())) == null) {
                    com.garmin.android.apps.connectmobile.repcounting.model.c cVar3 = (com.garmin.android.apps.connectmobile.repcounting.model.c) map.get(Integer.valueOf(h0Var.getSegmentOrder()));
                    if (cVar3 != null) {
                        dVarD2 = cVar3.D(((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData()).H0, ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData()).g());
                    }
                } else {
                    dVarD2 = dVarD;
                }
                if (dVarD2 != null && (list = dVarD2.f41108g) != null) {
                    linkedHashSet.addAll(list);
                    break;
                }
                break;
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.k
    public void onMapLoaded() {
        po.h hVar = (po.h) this.f136224d;
        GCMMapView gCMMapView = (GCMMapView) this.f136222b;
        com.garmin.android.library.mapsdkadapter.e eVar = (com.garmin.android.library.mapsdkadapter.e) this.f136223c;
        int i14 = po.h.E1;
        gCMMapView.getMapProxy().v(eVar, -1);
        hVar.C1.a(true);
    }

    @Override // u03.a
    public void run() {
        switch (this.f136221a) {
            case 7:
                ps2.n nVar = (ps2.n) this.f136224d;
                js2.d dVar = (js2.d) this.f136222b;
                e13.a.C1312a c1312a = (e13.a.C1312a) this.f136223c;
                js2.d dVarA = js2.d.a(dVar, new js2.b(nVar.f140500c, nVar.f140501d), js2.c.OWNER_DATA_SET);
                nVar.f140513p = dVarA;
                c1312a.c(dVarA);
                break;
            case 10:
                tn2.r0 r0Var = (tn2.r0) this.f136224d;
                rn2.i iVar = (rn2.i) this.f136222b;
                e23.l lVar = (e23.l) this.f136223c;
                r0Var.f165642k.a(iVar, qs2.f.ACTIVE, null);
                lVar.invoke(100);
                break;
            default:
                vn2.s.e2((vn2.s) this.f136224d, (String) this.f136222b, (qs2.f) this.f136223c);
                break;
        }
    }

    public /* synthetic */ e(Object obj, int i14, Object obj2, Object obj3) {
        this.f136221a = i14;
        this.f136224d = obj;
        this.f136222b = obj2;
        this.f136223c = obj3;
    }
}
