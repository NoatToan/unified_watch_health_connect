package a73;

import android.os.SystemClock;
import android.util.Range;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.t1;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import b0.a1;
import b0.l1;
import c22.l3;
import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesActivity;
import com.garmin.android.apps.connectmobile.q1;
import com.google.common.util.concurrent.ListenableFuture;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.lang3.function.FailableCallable;
import org.apache.commons.lang3.function.FailableSupplier;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import r22.a2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements FailableSupplier, a2.d, Preference.c, q1.a, p.a, androidx.concurrent.futures.b.c, fa.j.a, androidx.media3.exoplayer.f0.a, u03.d, u03.a, u03.f, xz2.p, wc.l, b0.g0.a, u0.b, o1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1851b;

    public /* synthetic */ j(ag0.b.InterfaceC0051b interfaceC0051b, ag0.b bVar, int i14) {
        this.f1850a = i14;
        this.f1851b = interfaceC0051b;
    }

    @Override // androidx.camera.core.impl.o1.a
    public void a(o1 o1Var) {
        androidx.camera.core.f fVar = (androidx.camera.core.f) this.f1851b;
        synchronized (fVar.f5441a) {
            fVar.f5443c++;
        }
        fVar.j(o1Var);
    }

    @Override // u03.d
    public void accept(Object obj) {
        int i14 = this.f1850a;
        Object obj2 = this.f1851b;
        switch (i14) {
            case 18:
                Logger logger = as2.f.f12699e;
                ((ad0.f) obj2).invoke(obj);
                break;
            default:
                Logger logger2 = as2.f.f12699e;
                ((androidx.room.w0) obj2).invoke(obj);
                break;
        }
    }

    @Override // p.a, u03.f
    /* JADX INFO: renamed from: apply */
    public Object mo330apply(Object obj) {
        int i14 = this.f1850a;
        Object obj2 = this.f1851b;
        switch (i14) {
            case 7:
                Range range = (Range) obj2;
                l1 l1Var = (l1) obj;
                return new m0.a(l1Var.b(), ((Float) range.getUpper()).floatValue(), ((Float) range.getLower()).floatValue(), androidx.camera.core.impl.c.y(l1Var.b(), ((Float) range.getLower()).floatValue(), ((Float) range.getUpper()).floatValue()));
            case 21:
                Logger logger = as2.f.f12699e;
                obj.getClass();
                return (q03.v) ((as2.d) obj2).invoke(obj);
            case 22:
                Logger logger2 = as2.f.f12699e;
                obj.getClass();
                return (Unit) ((a42.i) obj2).invoke(obj);
            default:
                obj.getClass();
                return (byte[]) ((defpackage.b) obj2).invoke(obj);
        }
    }

    @Override // xz2.p
    public void b(MaterialCalendarView materialCalendarView, xz2.b bVar) {
        com.garmin.android.apps.connectmobile.training.atp.create.steps.h hVar = (com.garmin.android.apps.connectmobile.training.atp.create.steps.h) this.f1851b;
        com.garmin.android.apps.connectmobile.training.atp.create.steps.h.a aVar = com.garmin.android.apps.connectmobile.training.atp.create.steps.h.f45276k;
        bVar.getClass();
        hVar.f45278i = LocalDate.fromDateFields(bVar.g());
        materialCalendarView.f();
    }

    @Override // androidx.concurrent.futures.b.c
    public Object d(androidx.concurrent.futures.b.a aVar) {
        ListenableFuture listenableFuture;
        switch (this.f1850a) {
            case 8:
                t1 t1Var = (t1) this.f1851b;
                k0.b.d().execute(new ab.j(8, t1Var, aVar));
                return t1Var + " [fetch@" + SystemClock.uptimeMillis() + "]";
            default:
                b0.x xVar = (b0.x) this.f1851b;
                xVar.f14102n.d();
                androidx.camera.core.impl.r0 r0Var = xVar.f14089a;
                synchronized (r0Var.f5725a) {
                    try {
                        boolean zIsEmpty = r0Var.f5726b.isEmpty();
                        androidx.concurrent.futures.b.d dVar = r0Var.f5728d;
                        ListenableFuture listenableFuture2 = dVar;
                        androidx.concurrent.futures.b.d dVar2 = dVar;
                        if (zIsEmpty) {
                            if (dVar == null) {
                                l0.j.a aVar2 = l0.j.f107810a;
                                listenableFuture2 = l0.m.c.f107817b;
                            }
                            listenableFuture = listenableFuture2;
                        } else {
                            if (dVar == null) {
                                androidx.concurrent.futures.b.a<Void> aVar3 = new androidx.concurrent.futures.b.a<>();
                                androidx.concurrent.futures.b.d dVar3 = new androidx.concurrent.futures.b.d(aVar3);
                                aVar3.f6080b = dVar3;
                                aVar3.f6079a = v.h.class;
                                try {
                                    synchronized (r0Var.f5725a) {
                                        r0Var.f5729e = aVar3;
                                        break;
                                    }
                                    aVar3.f6079a = "CameraRepository-deinit";
                                } catch (Exception e4) {
                                    dVar3.a(e4);
                                }
                                r0Var.f5728d = dVar3;
                                dVar2 = dVar3;
                            }
                            r0Var.f5727c.addAll(r0Var.f5726b.values());
                            for (androidx.camera.core.impl.l0 l0Var : r0Var.f5726b.values()) {
                                l0Var.release().addListener(new ab.j(5, r0Var, l0Var), k0.b.a());
                            }
                            r0Var.f5726b.clear();
                            listenableFuture = dVar2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                listenableFuture.addListener(new ab.j(17, xVar, aVar), xVar.f14092d);
                return "CameraX shutdownInternal";
        }
    }

    @Override // b0.g0.a
    public void e(a1 a1Var) {
        b0.g0.a aVar = (b0.g0.a) this.f1851b;
        b0.g0.d dVar = b0.g0.A;
        aVar.e(a1Var);
    }

    @Override // androidx.preference.Preference.c
    public boolean f(Preference preference, Object obj) {
        int i14 = this.f1850a;
        Object obj2 = this.f1851b;
        switch (i14) {
            case 4:
                com.garmin.android.apps.connectmobile.settings.notifications.a aVar = (com.garmin.android.apps.connectmobile.settings.notifications.a) obj2;
                com.garmin.android.apps.connectmobile.settings.notifications.a.C0807a c0807a = com.garmin.android.apps.connectmobile.settings.notifications.a.Q0;
                boolean zG = p005kotlin.jvm.internal.s.g(obj instanceof Boolean ? (Boolean) obj : null, Boolean.TRUE);
                boolean z14 = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f() || ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).n() || ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).y();
                if (!zG || !z14) {
                    aVar.w6(zG);
                    return true;
                }
                if (!((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).c("pnr_enabled")) {
                    aVar.w6(zG);
                    return true;
                }
                g22.e.l(aVar);
                ge1.b.T(o53.f0.w(aVar), null, null, new aj1.a(aVar, zG, null), 3);
                return false;
            default:
                com.garmin.android.apps.connectmobile.settings.notifications.b bVar = (com.garmin.android.apps.connectmobile.settings.notifications.b) obj2;
                com.garmin.android.apps.connectmobile.settings.notifications.b.a aVar2 = com.garmin.android.apps.connectmobile.settings.notifications.b.f43597f1;
                boolean zG2 = p005kotlin.jvm.internal.s.g(obj instanceof Boolean ? (Boolean) obj : null, Boolean.TRUE);
                SwitchPreferenceCompat switchPreferenceCompat = bVar.f43609n;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.E(zG2);
                }
                ArrayList arrayList = bVar.f43607l;
                if (arrayList == null) {
                    p005kotlin.jvm.internal.s.m("mPreferenceList");
                    throw null;
                }
                for (Preference preference2 : p13.h0.b1(arrayList)) {
                    if (preference2 != bVar.f43609n) {
                        preference2.A(zG2);
                    }
                }
                return true;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        switch (this.f1850a) {
            case 6:
                com.garmin.android.apps.connectmobile.settings.thirdparty.a aVar = (com.garmin.android.apps.connectmobile.settings.thirdparty.a) this.f1851b;
                if (!z14) {
                    q1 q1Var = aVar.f43963c;
                    if (q1Var != null) {
                        q1Var.dismiss();
                    }
                } else {
                    ak1.c cVar = aVar.f43961a;
                    if (cVar != null) {
                        cVar.z0();
                    }
                }
                break;
            default:
                EditExercisesActivity.ca((EditExercisesActivity) this.f1851b, z14);
                break;
        }
    }

    @Override // org.apache.commons.lang3.function.FailableSupplier
    public Object get() {
        return ((FailableCallable) this.f1851b).call();
    }

    @Override // r22.a2.d
    public void i(String str, int i14, int i15, String str2, String str3, int i16) {
        int i17 = this.f1850a;
        Object obj = this.f1851b;
        switch (i17) {
            case 1:
                ag0.b.a aVar = ag0.b.Z0;
                ((ag0.b.InterfaceC0051b) obj).a((((long) i14) * 60) + ((long) i15));
                break;
            case 2:
                ag0.b.a aVar2 = ag0.b.Z0;
                ((og0.a.b) obj).a((((long) i14) * 60) + ((long) i15));
                break;
            default:
                int i18 = aq.c0.f11852i;
                l3.f23124b.getClass();
                int iY = l3.a.y(i14, i15, i16);
                aq.i0 i0VarV6 = ((aq.c0) obj).v6();
                ArrayList arrayList = i0VarV6.f11990a;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((aq.x) it.next()).f12286b.g0(Double.valueOf(iY));
                }
                i0VarV6.x4(arrayList);
                break;
        }
    }

    @Override // fa.j.a
    public void invoke(Object obj) {
        int i14 = this.f1850a;
        Object obj2 = this.f1851b;
        switch (i14) {
            case 9:
                int i15 = androidx.media3.exoplayer.v.f9731j0;
                ((androidx.media3.common.z.d) obj).N0((androidx.media3.common.v) obj2);
                break;
            case 10:
                int i16 = androidx.media3.exoplayer.v.f9731j0;
                ((androidx.media3.common.z.d) obj).F7((androidx.media3.common.g0) obj2);
                break;
            case 11:
                ((androidx.media3.common.z.d) obj).n((ea.b) obj2);
                break;
            case 12:
                ((androidx.media3.common.z.d) obj).N0(androidx.media3.exoplayer.v.this.O);
                break;
            case 13:
                ((androidx.media3.common.z.d) obj).Y((androidx.media3.common.w) obj2);
                break;
            default:
                ((androidx.media3.common.z.d) obj).k((androidx.media3.common.k0) obj2);
                break;
        }
    }

    @Override // u03.a
    public void run() {
        ((as2.f) this.f1851b).f12703d.set(false);
    }

    public /* synthetic */ j(Object obj, int i14) {
        this.f1850a = i14;
        this.f1851b = obj;
    }
}
