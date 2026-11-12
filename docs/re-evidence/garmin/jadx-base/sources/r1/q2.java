package r1;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayer;
import com.mapbox.maps.extension.style.layers.generated.FillLayer;
import com.mapbox.maps.extension.style.layers.generated.LineLayer;
import com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayer;
import com.mapbox.maps.extension.style.layers.generated.ModelLayer;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q2 implements androidx.core.view.z, rv.a.b, s5.n0, fa.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149214a;

    public /* synthetic */ q2(int i14) {
        this.f149214a = i14;
    }

    private final void b(Object obj) {
    }

    public static int d(int i14, int i15, int i16) {
        return (Integer.hashCode(i14) + i15) * i16;
    }

    public static long e(d92.b bVar, p3.m mVar) {
        bVar.getClass();
        return d92.b.a(mVar).j().c();
    }

    public static long f(p3.m mVar) {
        return d92.b.a(mVar).j().c();
    }

    public static c2.j.i g(j92.b bVar, c2.j jVar, float f14) {
        bVar.getClass();
        jVar.getClass();
        return c2.j.i(f14);
    }

    public static Object h(p3.o0 o0Var, int i14, p3.m.a aVar) {
        o0Var.C(i14);
        Object objQ = o0Var.q();
        aVar.getClass();
        return objQ;
    }

    public static String i(String str, String str2, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        return bundle.getString(str2);
    }

    public static String j(n63.b bVar, i63.i iVar, Object obj) {
        String strEncode = Uri.encode(bVar.b(iVar, obj));
        strEncode.getClass();
        return strEncode;
    }

    public static u4.e k(float f14, float f15, float f16, float f17, float f18) {
        u4.e eVar = new u4.e();
        eVar.k(f14, f15);
        eVar.o(f16);
        eVar.i(f17, f18);
        return eVar;
    }

    public static u53.d l(String str) {
        return o53.c0.a(new o53.a0(str));
    }

    public static void m(long j8, String str, StringBuilder sb3) {
        sb3.append((Object) o4.d0.j(j8));
        sb3.append(str);
    }

    public static void n(Expression expression, String str, Expression expression2, FillExtrusionLayer fillExtrusionLayer) {
        expression.getClass();
        fillExtrusionLayer.setProperty$extension_style_release(new PropertyValue<>(str, expression2));
    }

    public static void o(Expression expression, String str, Expression expression2, FillLayer fillLayer) {
        expression.getClass();
        fillLayer.setProperty$extension_style_release(new PropertyValue<>(str, expression2));
    }

    public static void p(Expression expression, String str, Expression expression2, LineLayer lineLayer) {
        expression.getClass();
        lineLayer.setProperty$extension_style_release(new PropertyValue<>(str, expression2));
    }

    public static void q(Expression expression, String str, Expression expression2, LocationIndicatorLayer locationIndicatorLayer) {
        expression.getClass();
        locationIndicatorLayer.setProperty$extension_style_release(new PropertyValue<>(str, expression2));
    }

    public static void r(Expression expression, String str, Expression expression2, ModelLayer modelLayer) {
        expression.getClass();
        modelLayer.setProperty$extension_style_release(new PropertyValue<>(str, expression2));
    }

    public static void s(Expression expression, String str, Expression expression2, SymbolLayer symbolLayer) {
        expression.getClass();
        symbolLayer.setProperty$extension_style_release(new PropertyValue<>(str, expression2));
    }

    public static void t(Integer num, l lVar, lc.v vVar) {
        num.getClass();
        lVar.getClass();
        vVar.getClass();
    }

    public static /* synthetic */ void u(String str) throws Exception {
        throw new Exception(str);
    }

    public static /* synthetic */ void v(String str, Throwable th3) {
        throw new RuntimeException(str, th3);
    }

    public static void w(u4.e eVar, float f14, float f15, float f16) {
        eVar.g(f14);
        eVar.o(f15);
        eVar.g(f16);
    }

    public static void x(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.g(f14);
        eVar.o(f15);
        eVar.g(f16);
        eVar.o(f17);
    }

    public static void y(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.i(f14, f15);
        eVar.c();
        eVar.k(f16, f17);
    }

    @Override // s5.n0
    public boolean a(n4.d dVar, n4.d dVar2) {
        switch (this.f149214a) {
            case 22:
                s5.n0.a aVar = s5.n0.a.f157249a;
                return dVar.m(dVar2);
            default:
                s5.n0.a aVar2 = s5.n0.a.f157249a;
                return dVar2.a(dVar.f());
        }
    }

    @Override // fa.g
    public void accept(Object obj) {
        switch (this.f149214a) {
            case 28:
                ((androidx.media3.exoplayer.source.r.c) obj).f9649b.release();
                break;
        }
    }

    @Override // rv.a.b
    public void c() {
        rv.b.a aVar = rv.b.f154590r;
    }

    @Override // androidx.core.view.z
    public androidx.core.view.m1 onApplyWindowInsets(View view2, androidx.core.view.m1 m1Var) {
        switch (this.f149214a) {
            case 2:
                int i14 = com.garmin.android.apps.connectmobile.view.a.f47558d;
                c7.e eVarI = m1Var.f6508a.i(519);
                view2.setPadding(eVarI.f25190a, eVarI.f25191b, eVarI.f25192c, 0);
                return androidx.core.view.m1.f6507b;
            default:
                CoursePointListActivity.a aVar = CoursePointListActivity.f33079c;
                view2.getClass();
                c7.e eVarI2 = m1Var.f6508a.i(3);
                eVarI2.getClass();
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    j20.x.l("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = eVarI2.f25191b;
                marginLayoutParams.bottomMargin = eVarI2.f25193d;
                view2.setLayoutParams(marginLayoutParams);
                return androidx.core.view.m1.f6507b;
        }
    }
}
