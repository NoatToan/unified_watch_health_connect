package i3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity;
import com.garmin.android.apps.connectmobile.activities.charts.TankPressureFullscreenChartActivity;
import com.garmin.android.apps.connectmobile.garminpayfeature.GarminPayLaunchScreenActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.charts.ActivityTimeChartFullscreenActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.charts.ElevationChartFullscreenActivity;
import java.util.ArrayList;
import java.util.Iterator;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.module.Module;
import org.koin.ext.KClassExtKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e5 implements bb.r, u03.a, androidx.core.view.z, p.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87947a;

    public /* synthetic */ e5(int i14) {
        this.f87947a = i14;
    }

    public static int c(int i14, int i15, int i16, int i17) {
        return ((i14 * i15) + i16) * i17;
    }

    public static int d(int i14, int i15, ArrayList arrayList, int i16) {
        arrayList.add(Integer.valueOf(i14));
        return i15 + i16;
    }

    public static View e(ViewGroup viewGroup, int i14, ViewGroup viewGroup2, boolean z14) {
        viewGroup.getClass();
        return LayoutInflater.from(viewGroup.getContext()).inflate(i14, viewGroup2, z14);
    }

    public static String f(Object obj, String str) {
        return str + obj;
    }

    public static String g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String h(StringBuilder sb3, String str, String str2, String str3, String str4) {
        sb3.append(str);
        sb3.append(str2);
        sb3.append(str3);
        sb3.append(str4);
        return sb3.toString();
    }

    public static String i(p005kotlin.jvm.internal.t0 t0Var, Class cls, StringBuilder sb3, char c14) {
        sb3.append(KClassExtKt.getFullName(t0Var.b(cls)));
        sb3.append(c14);
        return sb3.toString();
    }

    public static StringBuilder j(int i14, int i15, String str, String str2, String str3) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(i14);
        sb3.append(str2);
        sb3.append(i15);
        sb3.append(str3);
        return sb3;
    }

    public static StringBuilder k(String str) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        return sb3;
    }

    public static StringBuilder l(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(str2);
        sb3.append(str3);
        sb3.append(str4);
        sb3.append(str5);
        return sb3;
    }

    public static KotlinNothingValueException m(String str) {
        e5.a.c(str);
        return new KotlinNothingValueException();
    }

    public static FactoryInstanceFactory n(BeanDefinition beanDefinition, Module module) {
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
        module.indexPrimaryType(factoryInstanceFactory);
        return factoryInstanceFactory;
    }

    public static p3.a2 o(int i14, p3.o0 o0Var) {
        p3.a2 a2Var = new p3.a2(i14);
        o0Var.K(a2Var);
        return a2Var;
    }

    public static void p(double d14, double d15, im.b bVar) {
        bVar.b(new o20.a(d14, d15));
    }

    public static void q(int i14, e23.p pVar, p3.o0 o0Var, boolean z14) {
        pVar.invoke(o0Var, Integer.valueOf(i14));
        o0Var.g0(z14);
    }

    public static void r(int i14, e23.p pVar, p3.o0 o0Var, boolean z14, boolean z15) {
        pVar.invoke(o0Var, Integer.valueOf(i14));
        o0Var.g0(z14);
        o0Var.g0(z15);
    }

    public static void s(long j8, String str, String str2, StringBuilder sb3) {
        sb3.append(str);
        sb3.append(str2);
        sb3.append(j8);
    }

    public static void t(h4.r.a aVar, float f14, p3.o0 o0Var, boolean z14) {
        c2.l.f(c2.x2.h(aVar, f14), o0Var);
        o0Var.g0(z14);
    }

    public static void u(p3.o0 o0Var, boolean z14, boolean z15, boolean z16) {
        o0Var.g0(z14);
        o0Var.g0(z15);
        o0Var.g0(z16);
    }

    @Override // p.a, u03.f
    /* JADX INFO: renamed from: apply */
    public Object mo330apply(Object obj) {
        switch (this.f87947a) {
            case 25:
                return obj;
            case 26:
            default:
                return new j1.o((x0.f) obj);
            case 27:
                return Integer.valueOf(((j1.x) obj).f96327a);
        }
    }

    @Override // bb.r
    public bb.n[] createExtractors() {
        return new bb.n[]{new ic.a()};
    }

    @Override // androidx.core.view.z
    public androidx.core.view.m1 onApplyWindowInsets(View view2, androidx.core.view.m1 m1Var) {
        switch (this.f87947a) {
            case 16:
                int i14 = FullscreenChartActivity.f28936o;
                c7.e eVarI = m1Var.f6508a.i(647);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                marginLayoutParams.rightMargin = eVarI.f25192c;
                view2.setLayoutParams(marginLayoutParams);
                return m1Var;
            case 17:
                int i15 = FullscreenChartActivity.f28936o;
                c7.e eVarI2 = m1Var.f6508a.i(647);
                view2.setPadding(eVarI2.f25190a, 0, eVarI2.f25192c, eVarI2.f25193d);
                return m1Var;
            case 18:
                TankPressureFullscreenChartActivity.a aVar = TankPressureFullscreenChartActivity.f28951t;
                view2.getClass();
                c7.e eVarI3 = m1Var.f6508a.i(647);
                eVarI3.getClass();
                view2.setPadding(eVarI3.f25190a, view2.getPaddingTop(), eVarI3.f25192c, view2.getPaddingBottom());
                return m1Var;
            case 19:
                TankPressureFullscreenChartActivity.a aVar2 = TankPressureFullscreenChartActivity.f28951t;
                view2.getClass();
                c7.e eVarI4 = m1Var.f6508a.i(647);
                eVarI4.getClass();
                view2.setPadding(eVarI4.f25190a, view2.getPaddingTop(), eVarI4.f25192c, view2.getPaddingBottom());
                return m1Var;
            case 20:
            default:
                ElevationChartFullscreenActivity.a aVar3 = ElevationChartFullscreenActivity.f39227a;
                view2.getClass();
                c7.e eVarI5 = m1Var.f6508a.i(130);
                eVarI5.getClass();
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    j20.x.l("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams2.leftMargin = eVarI5.f25190a;
                marginLayoutParams2.rightMargin = eVarI5.f25192c;
                view2.setLayoutParams(marginLayoutParams2);
                return m1Var;
            case 21:
                ActivityTimeChartFullscreenActivity.a aVar4 = ActivityTimeChartFullscreenActivity.f39226a;
                view2.getClass();
                c7.e eVarI6 = m1Var.f6508a.i(130);
                eVarI6.getClass();
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 == null) {
                    j20.x.l("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams3.leftMargin = eVarI6.f25190a;
                marginLayoutParams3.rightMargin = eVarI6.f25192c;
                view2.setLayoutParams(marginLayoutParams3);
                return m1Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v7, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v8, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    @Override // u03.a
    public void run() {
        ?? arrayList;
        GarminPayLaunchScreenActivity.a aVar = GarminPayLaunchScreenActivity.f35305d;
        kj0.c.f104941a.getClass();
        kj0.a aVar2 = kj0.c.f104947g.get();
        if (aVar2 instanceof kj0.a.d) {
            rd2.f.a().f152045a.getClass();
            ArrayList arrayListE = rd2.j.e();
            if (arrayListE == null) {
                vb.h.z("Failed to get device list.");
                return;
            }
            arrayList = new ArrayList(p13.y.r(arrayListE, 10));
            Iterator it = arrayListE.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((sd2.f) it.next()).getUnitID()));
            }
        } else if (aVar2 instanceof kj0.a.c) {
            Long l14 = ((kj0.a.c) aVar2).f104934a;
            if (l14 == null) {
                vb.h.z("No unit ID in context");
                return;
            }
            arrayList = p13.w.c(l14);
        } else if (aVar2 instanceof kj0.a.e) {
            rd2.f.a().f152045a.getClass();
            ArrayList arrayListE2 = rd2.j.e();
            if (arrayListE2 == null) {
                vb.h.z("Failed to get device list.");
                return;
            }
            arrayList = new ArrayList(p13.y.r(arrayListE2, 10));
            Iterator it3 = arrayListE2.iterator();
            while (it3.hasNext()) {
                arrayList.add(Long.valueOf(((sd2.f) it3.next()).getUnitID()));
            }
        } else {
            if (!(aVar2 instanceof kj0.a.b) && !(aVar2 instanceof kj0.a.f) && !(aVar2 instanceof kj0.a.C2012a)) {
                if (aVar2 == null) {
                    vb.h.z("Entry context shouldn't be null here");
                    return;
                } else {
                    lc.u0.r();
                    return;
                }
            }
            arrayList = p13.j0.f134944a;
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            long jLongValue = ((Number) it4.next()).longValue();
            kj0.c.f104941a.getClass();
            ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).m(jLongValue);
        }
    }
}
