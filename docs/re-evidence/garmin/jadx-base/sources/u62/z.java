package u62;

import android.hardware.camera2.TotalCaptureResult;
import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.library.geolocationrestapi.CountrySettingActivity;
import java.util.List;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z implements pb.g.a, androidx.core.view.z, p.a, v.a0.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169065a;

    public static String b(int i14, View view2) {
        String string = view2.getContext().getString(i14);
        string.getClass();
        return string;
    }

    public static String c(StringBuilder sb3, List list, String str) {
        sb3.append(list);
        sb3.append(str);
        return sb3.toString();
    }

    public static u4.e d(float f14, float f15, float f16, float f17, float f18) {
        u4.e eVar = new u4.e();
        eVar.k(f14, f15);
        eVar.g(f16);
        eVar.i(f17, f18);
        return eVar;
    }

    public static u4.e e(o4.h1.a aVar, float f14, float f15, float f16) {
        aVar.getClass();
        u4.e eVar = new u4.e();
        eVar.k(f14, f15);
        eVar.o(f16);
        return eVar;
    }

    public static u4.e f(o4.h1.a aVar, float f14, float f15, float f16, float f17) {
        aVar.getClass();
        u4.e eVar = new u4.e();
        eVar.k(f14, f15);
        eVar.o(f16);
        eVar.g(f17);
        return eVar;
    }

    public static vh.m0 g(String str) {
        return new vh.m0.a(str).a();
    }

    public static void h(com.garmin.android.apps.connectmobile.g3.a aVar, Object obj, androidx.lifecycle.y0 y0Var) {
        aVar.getClass();
        y0Var.j(com.garmin.android.apps.connectmobile.g3.a.d(obj));
    }

    public static void i(String str, int i14, Logger logger) {
        logger.debug(str + i14);
    }

    public static void j(u4.e eVar, float f14, float f15, float f16) {
        eVar.c();
        eVar.k(f14, f15);
        eVar.g(f16);
    }

    public static void k(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.g(f14);
        eVar.i(f15, f16);
        eVar.g(f17);
        eVar.c();
    }

    public static u4.e l(float f14, float f15, float f16, float f17, float f18) {
        u4.e eVar = new u4.e();
        eVar.k(f14, f15);
        eVar.g(f16);
        eVar.o(f17);
        eVar.g(f18);
        return eVar;
    }

    public static u4.e m(o4.h1.a aVar, float f14, float f15, float f16) {
        aVar.getClass();
        u4.e eVar = new u4.e();
        eVar.k(f14, f15);
        eVar.g(f16);
        return eVar;
    }

    public static u4.e n(o4.h1.a aVar, float f14, float f15, float f16, float f17) {
        aVar.getClass();
        u4.e eVar = new u4.e();
        eVar.k(f14, f15);
        eVar.g(f16);
        eVar.o(f17);
        return eVar;
    }

    public static void o(u4.e eVar, float f14, float f15, float f16) {
        eVar.o(f14);
        eVar.g(f15);
        eVar.o(f16);
    }

    public static void p(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.o(f14);
        eVar.i(f15, f16);
        eVar.g(f17);
    }

    public static u4.e q(float f14, float f15, float f16, float f17, float f18) {
        u4.e eVar = new u4.e();
        eVar.k(f14, f15);
        eVar.o(f16);
        eVar.g(f17);
        eVar.o(f18);
        return eVar;
    }

    public static void r(u4.e eVar, float f14, float f15, float f16) {
        eVar.g(f14);
        eVar.o(f15);
        eVar.g(f16);
        eVar.c();
    }

    public static void s(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.o(f14);
        eVar.i(f15, f16);
        eVar.o(f17);
    }

    public static void t(u4.e eVar, float f14, float f15, float f16) {
        eVar.o(f14);
        eVar.i(f15, f16);
        eVar.c();
    }

    public static void u(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.g(f14);
        eVar.o(f15);
        eVar.c();
        eVar.k(f16, f17);
    }

    public static void v(u4.e eVar, float f14, float f15, float f16) {
        eVar.o(f14);
        eVar.g(f15);
        eVar.o(f16);
        eVar.c();
    }

    public static void w(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.c();
        eVar.k(f14, f15);
        eVar.g(f16);
        eVar.o(f17);
    }

    public static void x(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.k(f14, f15);
        eVar.g(f16);
        eVar.o(f17);
    }

    public static void y(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.o(f14);
        eVar.g(f15);
        eVar.o(f16);
        eVar.g(f17);
    }

    @Override // v.a0.f.a
    public boolean a(TotalCaptureResult totalCaptureResult) {
        return v.a0.b(totalCaptureResult, false);
    }

    @Override // p.a, u03.f
    /* JADX INFO: renamed from: apply */
    public Object mo330apply(Object obj) {
        switch (this.f169065a) {
            case 26:
                return Boolean.TRUE;
            case 27:
                return null;
            default:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
        }
    }

    @Override // pb.g.a
    public boolean evaluate(int i14, int i15, int i16, int i17, int i18) {
        if (i15 == 67 && i16 == 79 && i17 == 77 && (i18 == 77 || i14 == 2)) {
            return true;
        }
        if (i15 == 77 && i16 == 76 && i17 == 76) {
            return i18 == 84 || i14 == 2;
        }
        return false;
    }

    @Override // androidx.core.view.z
    public androidx.core.view.m1 onApplyWindowInsets(View view2, androidx.core.view.m1 m1Var) {
        CountrySettingActivity.a aVar = CountrySettingActivity.f50141g;
        view2.getClass();
        c7.e eVarI = m1Var.f6508a.i(519);
        eVarI.getClass();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            j20.x.l("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = eVarI.f25191b;
        marginLayoutParams.bottomMargin = eVarI.f25193d;
        view2.setLayoutParams(marginLayoutParams);
        return androidx.core.view.m1.f6507b;
    }
}
