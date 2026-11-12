package xj1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.camera.core.impl.l2;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.m1;
import androidx.core.view.z;
import androidx.fragment.app.m;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import ch1.f3;
import ch1.g2;
import ch1.h2;
import ch1.y0;
import ch1.y2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.annual_report.preprocess.AnnualReportPreProcessWorker;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive3Music.Vivoactive3MusicSoundsAndAlertsSettingActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableTwoLineRow;
import j20.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOSupplier;
import p005kotlin.jvm.internal.s;
import p13.y;
import q03.u;
import tn.k;
import tt.j;
import xn2.v;
import yt.n;
import z0.a0;
import z0.a0.c;
import z0.a0.d;
import z0.h0;
import z0.i0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements GCMCheckableTwoLineRow.a, SwipeRefreshLayout.f, IOConsumer, IOSupplier, e22.c, u, z, androidx.concurrent.futures.b.c, l7.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f191159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f191160c;

    public /* synthetic */ b(int i14, Object obj, Object obj2) {
        this.f191158a = i14;
        this.f191159b = obj;
        this.f191160c = obj2;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void M7() {
        WebView webView = (WebView) this.f191159b;
        String str = (String) this.f191160c;
        v.a aVar = v.f191738e;
        webView.loadUrl(str);
    }

    @Override // com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableTwoLineRow.a
    public void a(View view2, boolean z14) {
        c.a aVar = (c.a) this.f191159b;
        wj1.b bVar = (wj1.b) this.f191160c;
        int i14 = c.a.f191163d;
        if (!z14) {
            ((GCMCheckableTwoLineRow) view2).b(true);
        }
        aVar.f191164a.invoke(bVar);
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public void accept(Object obj) {
        switch (this.f191158a) {
            case 2:
                ((IOConsumer) this.f191159b).lambda$andThen$0((IOConsumer) this.f191160c, obj);
                break;
            case 3:
                ((IOFunction) this.f191159b).lambda$andThen$6((IOConsumer) this.f191160c, obj);
                break;
            default:
                ((IOFunction) this.f191159b).lambda$andThen$7((Consumer) this.f191160c, obj);
                break;
        }
    }

    @Override // q03.u
    public void c(e13.a.C1312a c1312a) throws Exception {
        if (!((ul2.c) this.f191159b).l((byte[]) this.f191160c, new yr2.d(c1312a), AbstractComponentTracker.LINGERING_TIMEOUT)) {
            throw new Exception();
        }
    }

    @Override // androidx.concurrent.futures.b.c
    public Object d(androidx.concurrent.futures.b.a aVar) {
        int i14 = this.f191158a;
        Object obj = this.f191160c;
        Object obj2 = this.f191159b;
        switch (i14) {
            case 10:
                a0 a0Var = (a0) obj2;
                Set<a0.j> set = a0.f200502h0;
                m0.c cVar = new m0.c(6, a0Var, aVar);
                androidx.camera.video.internal.audio.b bVar = a0Var.C;
                k0.h hVar = a0Var.f200519e;
                bVar.f5929a.execute(new a8.d(bVar, 10, hVar, a0Var.new c(cVar)));
                a0Var.F.k(a0Var.new d(aVar, cVar, (a0.h) obj), hVar);
                return "audioEncodingFuture";
            default:
                l2.b bVar2 = (l2.b) obj;
                h0.c cVar2 = h0.G;
                bVar2.f5612b.f5827g.f5841a.put("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                i0 i0Var = new i0((h0) obj2, atomicBoolean, aVar, bVar2);
                aVar.a(new uj2.b(atomicBoolean, 12, bVar2, i0Var), k0.b.a());
                bVar2.f5612b.b(i0Var);
                return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
        }
    }

    @Override // org.apache.commons.io.function.IOSupplier
    public Object get() {
        switch (this.f191158a) {
            case 5:
                return ((IOFunction) this.f191159b).lambda$compose$2((IOSupplier) this.f191160c);
            default:
                return ((IOFunction) this.f191159b).lambda$compose$3((Supplier) this.f191160c);
        }
    }

    @Override // e22.c
    public void k(Object obj) {
        Vivoactive3MusicSoundsAndAlertsSettingActivity vivoactive3MusicSoundsAndAlertsSettingActivity = (Vivoactive3MusicSoundsAndAlertsSettingActivity) this.f191159b;
        LinearLayout linearLayout = (LinearLayout) this.f191160c;
        fb2.e eVar = (fb2.e) obj;
        int i14 = Vivoactive3MusicSoundsAndAlertsSettingActivity.f43169p;
        if (eVar.h(vivoactive3MusicSoundsAndAlertsSettingActivity.f125985k)) {
            boolean z14 = eVar instanceof f3;
            if (z14 || (eVar instanceof g2) || (eVar instanceof y2)) {
                linearLayout.addView(fb2.g.a(vivoactive3MusicSoundsAndAlertsSettingActivity));
            }
            linearLayout.addView(eVar.a());
            if (eVar instanceof g2) {
                linearLayout.addView(fb2.g.c(vivoactive3MusicSoundsAndAlertsSettingActivity, vivoactive3MusicSoundsAndAlertsSettingActivity.getString(R.string.device_settings_key_tones_help)));
            }
            if (eVar instanceof h2) {
                linearLayout.addView(fb2.g.c(vivoactive3MusicSoundsAndAlertsSettingActivity, vivoactive3MusicSoundsAndAlertsSettingActivity.getString(R.string.device_settings_key_vibration_help)));
            }
            if (z14) {
                linearLayout.addView(fb2.g.a(vivoactive3MusicSoundsAndAlertsSettingActivity));
            }
            if (eVar instanceof y0) {
                linearLayout.addView(fb2.g.a(vivoactive3MusicSoundsAndAlertsSettingActivity));
            }
        }
    }

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        boolean z14;
        yt.h hVar = (yt.h) this.f191159b;
        View view3 = (View) this.f191160c;
        int i14 = yt.h.f199301x;
        view2.getClass();
        c7.e eVarI = m1Var.f6508a.i(519);
        eVarI.getClass();
        hVar.f199317p = eVarI.f25191b;
        hVar.f199318q = eVarI.f25193d;
        ut.a aVar = hVar.f199303b;
        if (aVar == null) {
            s.m("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = aVar.f172547g;
        constraintLayout.getClass();
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            x.l("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return null;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = hVar.f199317p;
        constraintLayout.setLayoutParams(bVar);
        ut.a aVar2 = hVar.f199303b;
        if (aVar2 == null) {
            s.m("binding");
            throw null;
        }
        int i15 = 0;
        int i16 = 1;
        aVar2.f172543c.setContent(new z3.e(522533060, true, new yt.c(hVar, i15)));
        ut.a aVar3 = hVar.f199303b;
        if (aVar3 == null) {
            s.m("binding");
            throw null;
        }
        aVar3.f172544d.setContent(new z3.e(22008685, true, new yt.c(hVar, i16)));
        ut.a aVar4 = hVar.f199303b;
        if (aVar4 == null) {
            s.m("binding");
            throw null;
        }
        aVar4.f172550j.setContent(new z3.e(-370990260, true, new yt.c(hVar, 2)));
        ut.a aVar5 = hVar.f199303b;
        if (aVar5 == null) {
            s.m("binding");
            throw null;
        }
        aVar5.f172546f.setContent(new z3.e(1785219560, true, new yt.c(hVar, 8)));
        ut.a aVar6 = hVar.f199303b;
        if (aVar6 == null) {
            s.m("binding");
            throw null;
        }
        aVar6.f172541a.setOnTouchListener(new b00.g(hVar, 12));
        androidx.lifecycle.y0<Boolean> y0Var = hVar.w6().f199347h;
        n0 viewLifecycleOwner = hVar.getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(y0Var, viewLifecycleOwner, new yt.h.c(new yt.b(hVar, i15)));
        n nVarW6 = hVar.w6();
        com.garmin.android.apps.connectmobile.annual_report.preprocess.a aVar7 = nVarW6.f199342c;
        Context contextRequireContext = hVar.requireContext();
        contextRequireContext.getClass();
        xt.a aVar8 = nVarW6.f199341b;
        rt.a aVar9 = aVar8.f192134c;
        boolean z15 = (aVar9.f() == null || aVar9.k(aVar8.f192132a)) ? false : true;
        String strG = com.airbnb.lottie.animation.keyframe.a.g("checkHasTodayReportCache: hasReportCacheOfToday=[", "]", z15);
        i2.a aVar10 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar10.getClass();
        i2.a.b(a2Var, "AnnualReportPlayerViewModel", strG);
        tt.i iVarF = aVar8.f192134c.f();
        bu.f.f21180a.getClass();
        if (iVarF == null) {
            z14 = false;
        } else {
            i2.a.b(a2Var, "AnnualReportRemoteResourceManager", "isResourceReady: Checking if resource's ready.");
            List listG = bu.f.g(iVarF);
            ArrayList arrayList = new ArrayList(y.r(listG, 10));
            Iterator it = listG.iterator();
            while (it.hasNext()) {
                String strG2 = k.g(((bu.h) it.next()).getF21187b(), ".zip");
                String strConcat = "isResourceReady: Checking ".concat(strG2);
                i2.a aVar11 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar11.getClass();
                i2.a.b(a2Var2, "AnnualReportRemoteResourceManager", strConcat);
                bu.f.f21180a.getClass();
                arrayList.add(Boolean.valueOf(bu.f.c(contextRequireContext, strG2)));
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (!((Boolean) it3.next()).booleanValue()) {
                            z14 = false;
                        }
                    }
                }
            }
            z14 = true;
        }
        String strG3 = com.airbnb.lottie.animation.keyframe.a.g("checkHasTodayReportCache: isResourceReady=[", "]", z14);
        i2.a aVar12 = i2.f36769a;
        a2 a2Var3 = a2.GENERAL;
        aVar12.getClass();
        i2.a.b(a2Var3, "AnnualReportPlayerViewModel", strG3);
        if (z15 && z14) {
            aVar7.getClass();
            com.garmin.android.apps.connectmobile.annual_report.preprocess.a.d(j.REPORT_READY);
        } else {
            i2.a.b(a2Var3, "AnnualReportPlayerViewModel", "checkHasTodayReportCache: has no today cache or some resource is not ready, start preprocess worker");
            aVar7.getClass();
            AnnualReportPreProcessWorker.f30176j.getClass();
            AnnualReportPreProcessWorker.a.a(contextRequireContext, false);
        }
        b0 lifecycle = hVar.getViewLifecycleOwner().getF158016a();
        m mVarRequireActivity = hVar.requireActivity();
        mVarRequireActivity.getClass();
        lifecycle.a(new cv.k(mVarRequireActivity, new yt.a(hVar, i16)));
        view3.post(new yt.e(hVar, 2));
        return m1.f6507b;
    }

    @Override // l7.h
    public boolean perform(View view2, l7.h.a aVar) {
        int i14 = this.f191158a;
        Object obj = this.f191160c;
        Object obj2 = this.f191159b;
        switch (i14) {
            case 12:
                int i15 = zy.i.a.f207391h;
                int bindingAdapterPosition = ((zy.i.a) obj2).getBindingAdapterPosition();
                zy.g gVar = ((zy.i) obj).f207390b;
                if (gVar != null && bindingAdapterPosition != -1) {
                    gVar.R(bindingAdapterPosition);
                }
                break;
            default:
                int i16 = zy.i.c.f207404e;
                int bindingAdapterPosition2 = ((zy.i.c) obj2).getBindingAdapterPosition();
                zy.g gVar2 = ((zy.i) obj).f207390b;
                if (gVar2 != null && bindingAdapterPosition2 != -1) {
                    gVar2.R(bindingAdapterPosition2);
                }
                break;
        }
        return true;
    }
}
