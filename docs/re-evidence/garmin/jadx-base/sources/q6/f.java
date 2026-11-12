package q6;

import android.content.Context;
import android.widget.TextView;
import c22.l3;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.formatter.XAxisValueFormatter;
import com.github.mikephil.chartingv2.formatter.YAxisValueFormatter;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import e23.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.jvm.internal.x0;
import p005kotlin.math.MathKt;
import qm.c0;
import qm.g0;
import r53.p2;
import vh.j0;
import vh.k0;
import vh.l0;
import vh.z;
import xz2.p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements p, YAxisValueFormatter, qm.h.a, XAxisValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143083a;

    public static float c(float f14, float f15, float f16, float f17) {
        return ((f14 - f15) / f16) + f17;
    }

    public static int d(float f14, int i14, int i15) {
        return (Float.hashCode(f14) + i14) * i15;
    }

    public static int e(int i14, int i15, long j8) {
        return (Long.hashCode(j8) + i14) * i15;
    }

    public static int f(int i14, int i15, e23.a aVar) {
        return (aVar.hashCode() + i14) * i15;
    }

    public static int g(int i14, int i15, boolean z14) {
        return (Boolean.hashCode(z14) + i14) * i15;
    }

    public static int h(int i14, l lVar, int i15) {
        return (lVar.hashCode() + i14) * i15;
    }

    public static int i(o82.g gVar, int i14, int i15) {
        return (gVar.hashCode() + i14) * i15;
    }

    public static Expression.ExpressionBuilder j(Expression[] expressionArr, String str) {
        expressionArr.getClass();
        return new Expression.ExpressionBuilder(str);
    }

    public static Expression k(l lVar, String str) {
        lVar.getClass();
        Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder(str);
        lVar.invoke(expressionBuilder);
        return expressionBuilder.build();
    }

    public static Object l(int i14, Map map) {
        return map.get(new Integer(i14));
    }

    public static Object m(vh.a aVar, zh.f fVar, z zVar) {
        return new k0(aVar).b(fVar, zVar);
    }

    public static Object n(j0 j0Var, zh.f fVar, z zVar) {
        return new k0(j0Var).b(fVar, zVar);
    }

    public static Object o(l0 l0Var, zh.f fVar, z zVar) {
        return new k0(l0Var).b(fVar, zVar);
    }

    public static String p(StringBuilder sb3, float f14, char c14) {
        sb3.append(f14);
        sb3.append(c14);
        return sb3.toString();
    }

    public static void q(int i14, String str, String str2, String str3, StringBuilder sb3) {
        sb3.append(str);
        sb3.append(str2);
        sb3.append(i14);
        sb3.append(str3);
    }

    public static void r(int i14, HashMap map, String str, int i15, String str2) {
        map.put(str, Integer.valueOf(i14));
        map.put(str2, Integer.valueOf(i15));
    }

    public static void s(long j8, ArrayList arrayList) {
        arrayList.add(new Long(j8));
    }

    public static void t(Context context, int i14, ArrayList arrayList) {
        arrayList.add(Integer.valueOf(a7.b.getColor(context, i14)));
    }

    public static void u(c9.d dVar, androidx.health.platform.client.proto.p.a aVar, String str) {
        aVar.k(q8.d.a(dVar.a()), str);
    }

    public static /* synthetic */ void v(Object obj, String str, int i14, Object obj2) {
        throw new IllegalArgumentException((str + i14 + obj + obj2).toString());
    }

    public static void w(StringBuilder sb3, i53.c cVar, String str, i53.c cVar2, String str2) {
        sb3.append(cVar);
        sb3.append(str);
        sb3.append(cVar2);
        sb3.append(str2);
    }

    public static void x(boolean z14, vh.c.b bVar, zh.g gVar, z zVar, String str) {
        bVar.a(gVar, zVar, Boolean.valueOf(z14));
        gVar.v1(str);
    }

    public static void y(Object[] objArr, int i14, String str, TextView textView) {
        textView.setText(String.format(str, Arrays.copyOf(objArr, i14)));
    }

    public static boolean z(int i14, p2 p2Var, Object obj) {
        return p2Var.b(obj, new Integer(i14));
    }

    @Override // qm.h.a
    public void a(float f14) {
    }

    @Override // xz2.p
    public void b(MaterialCalendarView materialCalendarView, xz2.b bVar) {
        int i14 = qb1.e.f144043e;
        bVar.getClass();
        materialCalendarView.f();
    }

    @Override // com.github.mikephil.chartingv2.formatter.YAxisValueFormatter
    public String getFormattedValue(float f14, YAxis yAxis) {
        switch (this.f143083a) {
            case 9:
                return l3.f23126d.format(f14);
            case 12:
                int i14 = c0.f145331z;
                int i15 = (int) f14;
                int i16 = i15 / 60;
                x0 x0Var = x0.f105818a;
                return String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i16), Integer.valueOf(i15 % 60)}, 2));
            default:
                int i17 = g0.C;
                return String.valueOf(MathKt.c(f14));
        }
    }

    @Override // com.github.mikephil.chartingv2.formatter.XAxisValueFormatter
    public String getXValue(String str, int i14, ViewPortHandler viewPortHandler) {
        int i15 = g0.C;
        int i16 = Integer.parseInt(str);
        if (i16 < 3600) {
            return l3.a.t1(l3.f23124b, i16);
        }
        l3.f23124b.getClass();
        return l3.a.n1(i16);
    }
}
