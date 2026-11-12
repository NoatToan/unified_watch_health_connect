package androidx.media3.exoplayer;

import android.view.View;
import android.widget.Toast;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;
import v.c2;
import v.e1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8811c;

    public /* synthetic */ d(com.garmin.android.apps.connectmobile.settings.devices.common.c cVar, com.garmin.android.apps.connectmobile.settings.devices.common.c.C0799c c0799c, int i14) {
        this.f8809a = 15;
        this.f8811c = cVar;
        this.f8810b = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8809a) {
            case 0:
                e.a aVar = (e.a) this.f8811c;
                int i14 = this.f8810b;
                e eVar = e.this;
                eVar.getClass();
                if (i14 == -3 || i14 == -2) {
                    if (i14 != -2) {
                        eVar.c(4);
                        return;
                    } else {
                        eVar.b(0);
                        eVar.c(3);
                        return;
                    }
                }
                if (i14 == -1) {
                    eVar.b(-1);
                    eVar.a();
                    eVar.c(1);
                    return;
                } else if (i14 != 1) {
                    fb1.c.r(i14, "Unknown focus change type: ");
                    return;
                } else {
                    eVar.c(2);
                    eVar.b(1);
                    return;
                }
            case 1:
                ((b7.g.c) this.f8811c).lambda$callbackFailAsync$1(this.f8810b);
                return;
            case 2:
                androidx.camera.video.internal.audio.f fVar = (androidx.camera.video.internal.audio.f) this.f8811c;
                int i15 = this.f8810b;
                if (fVar.f5981l == i15) {
                    return;
                }
                int i16 = fVar.f5977h;
                fVar.f5981l = (i15 / i16) * i16;
                return;
            case 3:
                ((SideSheetBehavior) this.f8811c).lambda$setState$0(this.f8810b);
                return;
            case 4:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.l lVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.l) this.f8811c;
                int i17 = this.f8810b;
                ViewPager viewPager = lVar.f40698j;
                if (viewPager == null) {
                    p005kotlin.jvm.internal.s.m("mViewPager");
                    throw null;
                }
                if (viewPager.getCurrentItem() != i17) {
                    ViewPager viewPager2 = lVar.f40698j;
                    if (viewPager2 != null) {
                        viewPager2.C(i17, false);
                        return;
                    } else {
                        p005kotlin.jvm.internal.s.m("mViewPager");
                        throw null;
                    }
                }
                return;
            case 5:
                g1.r.d dVar = (g1.r.d) this.f8811c;
                int i18 = this.f8810b;
                boolean z14 = dVar.f74778j;
                g1.r rVar = g1.r.this;
                if (z14) {
                    String str = rVar.f74727a;
                    return;
                }
                switch (rVar.f74749w.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        rVar.f74738l.offer(Integer.valueOf(i18));
                        rVar.d();
                        return;
                    default:
                        androidx.room.a0.s(rVar.f74749w, "Unknown state: ");
                        return;
                }
            case 6:
                go1.k kVar = (go1.k) this.f8811c;
                int i19 = this.f8810b;
                int i24 = go1.k.C;
                RecyclerView.p layoutManager = kVar.A6().getLayoutManager();
                if (layoutManager != null) {
                    go1.o oVar = new go1.o(kVar.getContext());
                    oVar.setTargetPosition(i19);
                    layoutManager.startSmoothScroll(oVar);
                    return;
                }
                return;
            case 7:
                i10.c cVar = (i10.c) this.f8811c;
                int i25 = this.f8810b;
                LinearLayoutManager linearLayoutManager = cVar.f87006k;
                if (linearLayoutManager != null) {
                    linearLayoutManager.scrollToPositionWithOffset(i25, cVar.f87019z);
                    return;
                }
                return;
            case 8:
                i80.a aVar2 = (i80.a) this.f8811c;
                int i26 = this.f8810b;
                int i27 = i80.a.f92217a;
                aVar2.u6(i26 + " selected");
                return;
            case 9:
                j1.q.c cVar2 = (j1.q.c) this.f8811c;
                int i28 = this.f8810b;
                if (cVar2.f96305c.get()) {
                    j1.b bVar = ((j1.a) cVar2.f96303a).f96201a;
                    bVar.f96220s = i28;
                    b0.g0 g0Var = bVar.f96208g;
                    if (g0Var.B(i28)) {
                        g0Var.K();
                    }
                    b0.l0 l0Var = bVar.f96205d;
                    int iL = l0Var.l();
                    if (l0Var.B(i28) && l0Var.f14019v != null) {
                        l0Var.f14019v = ImageUtil.b(l0Var.f14019v, Math.abs(j0.c.b(i28) - j0.c.b(iL)));
                    }
                    z0.h0<z0.a0> h0Var = bVar.f96209h;
                    if (h0Var.B(i28)) {
                        h0Var.P();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                DeveloperSettingsActivity developerSettingsActivity = (DeveloperSettingsActivity) this.f8811c;
                int i29 = this.f8810b;
                String str2 = DeveloperSettingsActivity.f51946n;
                String strF = androidx.core.view.j.f(i29, "%");
                o13.t tVar = developerSettingsActivity.f51961m;
                Object value = tVar.getValue();
                value.getClass();
                ((Toast) value).setText(strF);
                Object value2 = tVar.getValue();
                value2.getClass();
                ((Toast) value2).setDuration(0);
                Object value3 = tVar.getValue();
                value3.getClass();
                ((Toast) value3).show();
                return;
            case 11:
                ((View) this.f8811c).setVisibility(this.f8810b);
                return;
            case 12:
                nl2.d dVar2 = (nl2.d) this.f8811c;
                int i30 = this.f8810b;
                synchronized (dVar2.f126506a) {
                    dVar2.f126506a.remove(i30);
                    break;
                }
                return;
            case 13:
                ((androidx.camera.core.impl.s) this.f8811c).a(this.f8810b);
                return;
            case 14:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f8811c;
                int i34 = this.f8810b;
                int i35 = e1.a.f173782b;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((c2) it.next()).e(i34);
                }
                return;
            default:
                com.garmin.android.apps.connectmobile.settings.devices.common.c cVar3 = (com.garmin.android.apps.connectmobile.settings.devices.common.c) this.f8811c;
                int i36 = this.f8810b;
                com.garmin.android.apps.connectmobile.settings.devices.common.c.a aVar3 = cVar3.f42824b;
                if (aVar3 != null) {
                    aVar3.i5(com.garmin.android.apps.connectmobile.settings.devices.common.c.b.FAILURE, null);
                }
                a2 a2Var = a2.SETTINGS;
                String strH = am.j.h(i36, "on Response Failed: ");
                i2.f36769a.getClass();
                i2.a.k(a2Var, "BikeAlarmProto", strH);
                return;
        }
    }

    public /* synthetic */ d(Object obj, int i14, int i15) {
        this.f8809a = i15;
        this.f8811c = obj;
        this.f8810b = i14;
    }
}
