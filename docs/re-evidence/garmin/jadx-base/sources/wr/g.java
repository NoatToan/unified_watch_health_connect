package wr;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.m1;
import androidx.core.view.z;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.powerguide.edit.PowerGuideFullscreenChartActivity;
import com.garmin.android.apps.connectmobile.promotions.CampaignInfoFullScreenActivity;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import j20.x;
import java.io.File;
import java.time.Instant;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import o13.r;
import org.apache.commons.io.function.IOFunction;
import org.slf4j.Logger;
import p005kotlin.jvm.internal.r0;
import wt1.q;
import xm0.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements z, p.a, fa.g, IFillFormatter, TabLayoutMediator.TabConfigurationStrategy, IOFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186739a;

    public /* synthetic */ g(wy2.c cVar) {
        this.f186739a = 3;
    }

    public static int j(int i14, int i15, String str) {
        return (str.hashCode() + i14) * i15;
    }

    public static int k(Instant instant, int i14, int i15) {
        return (instant.hashCode() + i14) * i15;
    }

    public static int l(tv2.c cVar, int i14, int i15) {
        return (cVar.hashCode() + i14) * i15;
    }

    public static Integer m(int i14, Integer num) {
        return Integer.valueOf(num.intValue() + i14);
    }

    public static String n(String str, long j8, String str2, Exception exc) {
        return str + j8 + str2 + exc;
    }

    public static String o(String str, File file, String str2) {
        return str + file + str2;
    }

    public static String p(StringBuilder sb3, Object obj, char c14) {
        sb3.append(obj);
        sb3.append(c14);
        return sb3.toString();
    }

    public static String q(StringBuilder sb3, z8.c cVar, char c14) {
        sb3.append(cVar);
        sb3.append(c14);
        return sb3.toString();
    }

    public static StringBuilder r(int i14, String str, String str2, String str3, String str4) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(i14);
        sb3.append(str2);
        sb3.append(str3);
        sb3.append(str4);
        return sb3;
    }

    public static r0 s(Object obj) {
        r.b(obj);
        return new r0();
    }

    public static void t(int i14, String str, String str2, String str3, StringBuilder sb3) {
        sb3.append(i14);
        sb3.append(str);
        sb3.append(str2);
        sb3.append(str3);
    }

    public static /* synthetic */ void u(Object obj, Object obj2) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append(obj2);
        throw new ClassCastException(sb3.toString());
    }

    public static void v(String str, long j8, String str2, Logger logger) {
        logger.debug(str + j8 + str2);
    }

    public static void w(String str, long j8, Logger logger) {
        logger.debug(str + j8);
    }

    public static /* synthetic */ void x(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static void y(String str, boolean z14, Logger logger) {
        logger.debug(str + z14);
    }

    public static void z(q.a aVar, String str, ArrayList arrayList) {
        aVar.getClass();
        arrayList.add(q.a.a(str));
    }

    @Override // fa.g
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // p.a, u03.f
    /* JADX INFO: renamed from: apply */
    public Object mo330apply(Object obj) {
        switch (this.f186739a) {
            case 3:
                return x0.f.f188231c;
            case 13:
                return null;
            default:
                return IOFunction.lambda$identity$8(obj);
        }
    }

    @Override // com.github.mikephil.charting.formatter.IFillFormatter
    public float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
        int i14 = xl1.a.f191306d;
        return 0.0f;
    }

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        switch (this.f186739a) {
            case 0:
                k.a aVar = k.f186755l;
                view2.getClass();
                c7.e eVarI = m1Var.f6508a.i(3);
                eVarI.getClass();
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    x.l("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = eVarI.f25191b;
                marginLayoutParams.leftMargin = eVarI.f25190a;
                marginLayoutParams.rightMargin = eVarI.f25192c;
                view2.setLayoutParams(marginLayoutParams);
                return m1.f6507b;
            case 4:
                CreateCustomCourseActivity.a aVar2 = CreateCustomCourseActivity.f33013f;
                view2.getClass();
                c7.e eVarI2 = m1Var.f6508a.i(3);
                eVarI2.getClass();
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 == null) {
                    x.l("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = eVarI2.f25191b;
                marginLayoutParams2.bottomMargin = eVarI2.f25193d;
                view2.setLayoutParams(marginLayoutParams2);
                return m1.f6507b;
            case 6:
                EditPowerGuideStrategyActivity.a aVar3 = EditPowerGuideStrategyActivity.f40384t;
                view2.getClass();
                c7.e eVarI3 = m1Var.f6508a.i(647);
                eVarI3.getClass();
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 == null) {
                    x.l("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams3.topMargin = eVarI3.f25191b;
                marginLayoutParams3.leftMargin = eVarI3.f25190a;
                marginLayoutParams3.rightMargin = eVarI3.f25192c;
                view2.setLayoutParams(marginLayoutParams3);
                return m1.f6507b;
            case 7:
                PowerGuideFullscreenChartActivity.a aVar4 = PowerGuideFullscreenChartActivity.f40409a;
                view2.getClass();
                c7.e eVarI4 = m1Var.f6508a.i(647);
                eVarI4.getClass();
                ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                layoutParams4.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams4.rightMargin = eVarI4.f25192c;
                view2.setLayoutParams(marginLayoutParams4);
                return m1Var;
            case 24:
                int i14 = ya2.a.f195635c;
                view2.getClass();
                c7.e eVarI5 = m1Var.f6508a.i(519);
                eVarI5.getClass();
                view2.setPadding(view2.getPaddingLeft(), eVarI5.f25191b, view2.getPaddingRight(), view2.getPaddingBottom());
                return m1.f6507b;
            case 25:
                int i15 = ya2.a.f195635c;
                view2.getClass();
                c7.e eVarI6 = m1Var.f6508a.i(2);
                eVarI6.getClass();
                view2.setPadding(eVarI6.f25190a, eVarI6.f25192c, view2.getPaddingRight(), eVarI6.f25193d);
                return m1.f6507b;
            default:
                CampaignInfoFullScreenActivity.a aVar5 = CampaignInfoFullScreenActivity.f41033o;
                view2.getClass();
                view2.setPadding(0, m1Var.f6508a.i(1).f25191b, 0, 0);
                return m1Var;
        }
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i14) {
        tab.getClass();
        w.f191472b.getClass();
        Object[] array = w.f191478h.toArray(new w[0]);
        tab.setText(((w) ((i14 < 0 || i14 >= array.length) ? w.f191473c : array[i14])).f191479a);
        tab.setTag(Integer.valueOf(i14));
    }

    public /* synthetic */ g(int i14) {
        this.f186739a = i14;
    }
}
