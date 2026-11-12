package vn2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.m1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.view.audiorecording.AudioRecordingView;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.util.concurrent.ListenableFuture;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import ps.x1;
import r22.y1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class t0 implements u03.d, u03.a, SearchView.l, AudioRecordingView.c, wa.e.i.a, j42.b.InterfaceC1852b, q1.a, y1.d, l0.a, x82.h, xz2.p, androidx.core.view.z, jt2.a.InterfaceC1941a, e22.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f178952b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ t0(e23.p pVar) {
        this.f178951a = 24;
        this.f178952b = (v13.i) pVar;
    }

    @Override // u03.d
    public void accept(Object obj) {
        int i14 = this.f178951a;
        Object obj2 = this.f178952b;
        switch (i14) {
            case 0:
                Logger logger = v0.f178959c;
                ((r0) obj2).invoke(obj);
                break;
            case 1:
                Logger logger2 = v0.f178959c;
                ((r0) obj2).invoke(obj);
                break;
            case 2:
                Logger logger3 = v0.f178959c;
                ((r0) obj2).invoke(obj);
                break;
            case 3:
                Logger logger4 = v0.f178959c;
                ((r0) obj2).invoke(obj);
                break;
            case 4:
                Logger logger5 = v0.f178959c;
                ((r0) obj2).invoke(obj);
                break;
            case 5:
                Logger logger6 = v0.f178959c;
                ((r0) obj2).invoke(obj);
                break;
            case 6:
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                ((w02.b) obj2).invoke(obj);
                break;
            case 7:
                Logger logger7 = vr2.c.f179562o;
                ((b1) obj2).invoke(obj);
                break;
            case 8:
                Logger logger8 = vr2.i.C;
                ((b1) obj2).invoke(obj);
                break;
            case 10:
                ((t42.l) obj2).invoke(obj);
                break;
            case 16:
                ((vu1.b) obj2).invoke(obj);
                break;
            case 17:
                ((wn2.f) obj2).invoke(obj);
                break;
        }
    }

    @Override // l0.a
    public ListenableFuture apply(Object obj) {
        return (ListenableFuture) ((vu1.b) this.f178952b).invoke(obj);
    }

    @Override // xz2.p
    public void b(MaterialCalendarView materialCalendarView, xz2.b bVar) {
        int i14 = this.f178951a;
        Object obj = this.f178952b;
        switch (i14) {
            case 25:
                xa2.d dVar = (xa2.d) obj;
                xa2.d.a aVar = xa2.d.f189842f;
                bVar.getClass();
                xa2.d.f189843g.getClass();
                sa2.n nVar = dVar.f189844a;
                if (nVar == null) {
                    p005kotlin.jvm.internal.s.m("reportsSelectedEndDatesPresenter");
                    throw null;
                }
                Date date = new Date(bVar.f().getTimeInMillis());
                qa2.e eVar = nVar.f158383a;
                wa2.b bVar2 = sa2.n.f158382b;
                date.toString();
                bVar2.getClass();
                eVar.f143902b = date;
                ta2.b bVar3 = dVar.f189848e;
                if (bVar3 == null) {
                    p005kotlin.jvm.internal.s.m("selectedDayDecorator");
                    throw null;
                }
                bVar3.f163508b = new xz2.b(bVar.f());
                MaterialCalendarView materialCalendarView2 = dVar.f189845b;
                if (materialCalendarView2 != null) {
                    materialCalendarView2.f();
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("endDateCalendarView");
                    throw null;
                }
            default:
                xa2.e eVar2 = (xa2.e) obj;
                xa2.e.a aVar2 = xa2.e.f189849g;
                bVar.getClass();
                xa2.e.f189850h.getClass();
                sa2.o oVar = eVar2.f189851a;
                if (oVar == null) {
                    p005kotlin.jvm.internal.s.m("reportsSelectedStartDatesPresenter");
                    throw null;
                }
                Date date2 = new Date(bVar.f().getTimeInMillis());
                qa2.e eVar3 = oVar.f158385a;
                wa2.b bVar4 = sa2.o.f158384b;
                date2.toString();
                bVar4.getClass();
                eVar3.f143901a = date2;
                ta2.b bVar5 = eVar2.f189856f;
                if (bVar5 == null) {
                    p005kotlin.jvm.internal.s.m("selectedDayDecorator");
                    throw null;
                }
                bVar5.f163508b = new xz2.b(bVar.f());
                MaterialCalendarView materialCalendarView3 = eVar2.f189852b;
                if (materialCalendarView3 != null) {
                    materialCalendarView3.f();
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("startDateCalendarView");
                    throw null;
                }
        }
    }

    @Override // r22.y1.d
    public void c(Object obj) {
        switch (this.f178951a) {
            case 19:
                wq.b bVar = (wq.b) this.f178952b;
                qs.w wVar = obj instanceof qs.w ? (qs.w) obj : null;
                if (wVar != null) {
                    bVar.invoke(wVar);
                }
                break;
            default:
                b81.b bVar2 = (b81.b) this.f178952b;
                String str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    bVar2.invoke(str);
                }
                break;
        }
    }

    @Override // jt2.a.InterfaceC1941a
    public void d(int i14) {
        ((xe2.k0) this.f178952b).u6().n6(i14);
    }

    @Override // wa.e.i.a
    public ImmutableList e(androidx.media3.common.e0 e0Var, int[] iArr, int i14) {
        wa.e.C3405e c3405e = (wa.e.C3405e) this.f178952b;
        Ordering<Integer> ordering = wa.e.f183652k;
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i15 = 0; i15 < e0Var.f8214a; i15++) {
            builder.add(new wa.e.c(i14, e0Var, i15, c3405e, iArr[i15]));
        }
        return builder.build();
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        int i14 = this.f178951a;
        Object obj = this.f178952b;
        switch (i14) {
            case 15:
                ((com.garmin.android.apps.connectmobile.golf.truswing.h.a) obj).f35854a.getClass();
                return;
            case 21:
                wr.k kVar = (wr.k) obj;
                if (!z14) {
                    wr.k.a aVar = wr.k.f186755l;
                    kVar.y6();
                    return;
                }
                tq.a aVar2 = kVar.f186757b;
                if (aVar2 == null) {
                    p005kotlin.jvm.internal.s.m("splitsViewModel");
                    throw null;
                }
                androidx.lifecycle.y0 y0Var = new androidx.lifecycle.y0();
                List<x1> listD = aVar2.f166002j.d();
                if (listD != null) {
                    ArrayList<x1> arrayList = new ArrayList();
                    for (Object obj2 : listD) {
                        if (!aVar2.f165997e.contains((x1) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                    for (x1 x1Var : arrayList) {
                        Integer numV0 = x1Var.getMessageIndex();
                        qs.x xVarA2 = x1Var.a2();
                        String str = xVarA2 != null ? xVarA2.f147220a : null;
                        qs.w wVarG1 = x1Var.G1();
                        arrayList2.add(new uq.l(numV0, str, wVarG1 != null ? wVarG1.f147194a : null, x1Var.getDifficulty(), x1Var.getNumFalls(), x1Var.getPackWeight()));
                    }
                    ge1.b.T(v1.a(aVar2), null, null, new tq.b(y0Var, aVar2, arrayList2, listD, null), 3);
                }
                y0Var.f(kVar, new wr.k.e(new wr.i(kVar, 0)));
                return;
            default:
                CreateCustomCourseActivity.ca((CreateCustomCourseActivity) obj, z14);
                return;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.view.audiorecording.AudioRecordingView.c
    public void h(String str, String str2, s22.d dVar) {
        e23.q qVar = (e23.q) this.f178952b;
        str.getClass();
        str2.getClass();
        if (qVar != null) {
            qVar.invoke(str, str2, dVar);
        }
    }

    @Override // j42.b.InterfaceC1852b
    public void j(double d14) {
        ((wa1.c) this.f178952b).a(d14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0042  */
    @Override // e22.c
    public void k(Object obj) {
        boolean z14;
        com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b bVar = (com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b) this.f178952b;
        fb2.e eVar = (fb2.e) obj;
        com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b.a aVar = com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b.J0;
        eVar.getClass();
        i2.a aVar2 = i2.f36769a;
        aVar2.getClass();
        i2.a.n(a2.SETTINGS, "SportHRZonesFragment2", "Initializing: " + eVar);
        if (bVar.getActivity() != null) {
            androidx.fragment.app.m mVarRequireActivity = bVar.requireActivity();
            mVarRequireActivity.getClass();
            vk1.f fVar = bVar.f44098a;
            fVar.getClass();
            if (eVar.g((i.c) mVarRequireActivity, fVar)) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        eVar.m(z14);
        eVar.addObserver(bVar);
        eVar.l(true);
    }

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        com.garmin.android.library.mobileauth.ui.a aVar = (com.garmin.android.library.mobileauth.ui.a) this.f178952b;
        int i14 = com.garmin.android.library.mobileauth.ui.a.f50411l;
        view2.getClass();
        c7.e eVarI = m1Var.f6508a.i(519);
        eVarI.getClass();
        int i15 = eVarI.f25193d;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            j20.x.l("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        aVar.f50421j = p13.u.m0(new Integer[]{Integer.valueOf(eVarI.f25191b), Integer.valueOf(i15)});
        if (i15 > 0) {
            View view3 = aVar.f50418g;
            if (view3 == null) {
                p005kotlin.jvm.internal.s.m("noInternetConnBanner");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            layoutParams2.getClass();
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
            layoutParams3.bottomMargin = i15;
            View view4 = aVar.f50418g;
            if (view4 == null) {
                p005kotlin.jvm.internal.s.m("noInternetConnBanner");
                throw null;
            }
            view4.setLayoutParams(layoutParams3);
        }
        view2.setLayoutParams(marginLayoutParams);
        return m1.f6507b;
    }

    @Override // androidx.appcompat.widget.SearchView.l
    public void onClose() {
        vy1.e eVar = (vy1.e) this.f178952b;
        vy1.e.a aVar = vy1.e.T;
        eVar.H6(false);
        SearchView searchView = eVar.f180806e;
        if (searchView != null) {
            searchView.clearFocus();
        } else {
            p005kotlin.jvm.internal.s.m("locationSearchView");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.util.List] */
    @Override // u03.a
    public void run() {
        p005kotlin.jvm.internal.r0 r0Var = (p005kotlin.jvm.internal.r0) this.f178952b;
        Logger logger = vr2.c.f179562o;
        GarminPayCoreDatabase.b bVar = GarminPayCoreDatabase.f52316a;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        bVar.getClass();
        r0Var.f105810a = GarminPayCoreDatabase.b.a(contextC).e().h();
    }

    public /* synthetic */ t0(Object obj, int i14) {
        this.f178951a = i14;
        this.f178952b = obj;
    }
}
