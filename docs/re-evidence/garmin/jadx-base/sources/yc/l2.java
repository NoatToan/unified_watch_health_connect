package yc;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.apollographql.apollo3.exception.JsonDataException;
import com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l2 implements androidx.core.view.z, g1.l, b1.f, IFillFormatter, n83.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196145a;

    public /* synthetic */ l2(int i14) {
        this.f196145a = i14;
    }

    public static int a(i53.c cVar, int i14, int i15) {
        return (cVar.hashCode() + i14) * i15;
    }

    public static int b(i53.d dVar, int i14, int i15) {
        return (dVar.hashCode() + i14) * i15;
    }

    public static int c(LocalTime localTime, int i14, int i15) {
        return (localTime.hashCode() + i14) * i15;
    }

    public static Intent d(Context context, Class cls, String str, long j8) {
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra(str, j8);
        return intent;
    }

    public static String e(StringBuilder sb3, i53.c cVar, String str) {
        sb3.append(cVar);
        sb3.append(str);
        return sb3.toString();
    }

    public static StringBuilder f(String str, Integer num, String str2, String str3, String str4) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(num);
        sb3.append(str2);
        sb3.append(str3);
        sb3.append(str4);
        return sb3;
    }

    public static StringBuilder g(String str, String str2, String str3, List list, String str4) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(str2);
        sb3.append(str3);
        sb3.append(list);
        sb3.append(str4);
        return sb3;
    }

    public static s5.c.b h(p3.o0 o0Var, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        o0Var.C(i14);
        return new s5.c.b(i15, i16, jVar);
    }

    public static void i(int i14, int i15, int i16, int i17, int i18) {
        z4.f.a(i14);
        z4.f.a(i15);
        z4.f.a(i16);
        z4.f.a(i17);
        z4.f.a(i18);
    }

    public static /* synthetic */ void j(int i14, StringBuilder sb3) {
        sb3.append(i14);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public static /* synthetic */ void k(Object obj, Object obj2) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append((Object) obj.toString());
        sb3.append(obj2);
        throw new ClassCastException(sb3.toString());
    }

    public static /* synthetic */ void l(Object obj, Object obj2, Object obj3, Object obj4, String str) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static void n(StringBuilder sb3, float f14, String str, float f15, String str2) {
        sb3.append(f14);
        sb3.append(str);
        sb3.append(f15);
        sb3.append(str2);
    }

    public static /* synthetic */ void o(StringBuilder sb3, Object obj) {
        sb3.append(" at path ");
        sb3.append(obj);
        throw new JsonDataException(sb3.toString());
    }

    public static /* synthetic */ void p(Throwable th3) {
        throw new IllegalStateException(th3);
    }

    public static boolean q(SupportedCapability supportedCapability, Set set) {
        return set.contains(Integer.valueOf(supportedCapability.ordinal()));
    }

    public static /* synthetic */ void r(int i14, StringBuilder sb3) {
        sb3.append(i14);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static /* synthetic */ void s(String str, Object obj, Object obj2) {
        throw new JsonDataException(str + obj + ((Object) " at path ") + obj2);
    }

    public static /* synthetic */ void t(Throwable th3) {
        throw new IllegalArgumentException(th3);
    }

    @Override // n83.d
    public Object call(Object obj) {
        switch (this.f196145a) {
            case 23:
                return j83.e.e(new o83.g((List) obj));
            default:
                Map<zb0.u0, vg1.t> map = zb0.n0.f203577a;
                return j83.e.e(new o83.f(new hc0.d((sd2.f) obj, 1)));
        }
    }

    @Override // com.github.mikephil.charting.formatter.IFillFormatter
    public float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
        switch (this.f196145a) {
            case 19:
                int i14 = za1.e.f203298h;
                return lineDataProvider.getYChartMin();
            default:
                int i15 = zh0.c.f204780l;
                return 0.0f;
        }
    }

    @Override // androidx.core.view.z
    public androidx.core.view.m1 onApplyWindowInsets(View view2, androidx.core.view.m1 m1Var) {
        switch (this.f196145a) {
            case 9:
                int i14 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                view2.getClass();
                c7.e eVarI = m1Var.f6508a.i(1);
                eVarI.getClass();
                view2.setPadding(view2.getPaddingLeft(), eVarI.f25191b, view2.getPaddingRight(), view2.getPaddingBottom());
                return m1Var;
            case 10:
                int i15 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                view2.getClass();
                c7.e eVarI2 = m1Var.f6508a.i(2);
                eVarI2.getClass();
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), eVarI2.f25193d);
                return m1Var;
            case 11:
                com.garmin.realtimesettings.app.presentationlayer.c.a aVar = com.garmin.realtimesettings.app.presentationlayer.c.f52641v;
                view2.getClass();
                androidx.core.view.m1.r rVar = m1Var.f6508a;
                c7.e eVarI3 = rVar.i(8);
                eVarI3.getClass();
                c7.e eVarI4 = rVar.i(519);
                eVarI4.getClass();
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), Math.max(eVarI3.f25193d, eVarI4.f25193d));
                return m1Var;
            default:
                int i16 = DeviceDetailsActivity.f33804q;
                c7.e eVarI5 = m1Var.f6508a.i(519);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                marginLayoutParams.topMargin = eVarI5.f25191b;
                marginLayoutParams.leftMargin = eVarI5.f25190a;
                marginLayoutParams.rightMargin = eVarI5.f25192c;
                view2.setLayoutParams(marginLayoutParams);
                return androidx.core.view.m1.f6507b;
        }
    }
}
