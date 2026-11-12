package hb;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.m1;
import androidx.core.view.z;
import bb.n;
import bb.r;
import c2.j;
import c2.q2;
import c2.s2;
import c22.o;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.feature.garminpay.GarminPayInitializer;
import h4.g;
import hc.e0;
import hc.y;
import hf.e;
import j20.x;
import java.util.Locale;
import java.util.Observable;
import kotlinx.serialization.UnknownFieldException;
import o13.p;
import org.slf4j.Logger;
import p005kotlin.KotlinNothingValueException;
import p3.c2;
import p3.o0;
import p3.p0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements r, q1.a, e.c, u03.b, z, u03.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82721a;

    public /* synthetic */ a(int i14) {
        this.f82721a = i14;
    }

    public static float c(float f14, float f15, float f16, float f17) {
        return (f16 - (f14 * f15)) / f17;
    }

    public static long d(d92.b bVar, o0 o0Var) {
        bVar.getClass();
        return d92.b.a(o0Var).f().b();
    }

    public static long e(o0 o0Var) {
        return d92.b.a(o0Var).k().a();
    }

    public static s2 f(j jVar, float f14, g.b bVar, o0 o0Var, int i14) {
        jVar.getClass();
        return q2.a(j.i(f14), bVar, o0Var, i14);
    }

    public static String h(o oVar, int i14) {
        String string = oVar.c().getString(i14);
        string.getClass();
        return string;
    }

    public static String i(String str) {
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        return lowerCase;
    }

    public static String j(String str, Observable observable, String str2, Object obj) {
        return str + observable + str2 + obj;
    }

    public static String k(StringBuilder sb3, boolean z14, String str) {
        sb3.append(z14);
        sb3.append(str);
        return sb3.toString();
    }

    public static StringBuilder l(String str, String str2, String str3) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(str2);
        sb3.append(str3);
        return sb3;
    }

    public static KotlinNothingValueException m(String str) {
        i6.b.c(str);
        return new KotlinNothingValueException();
    }

    public static c2 n(boolean z14, o0 o0Var) {
        c2 c2VarN = p0.n(Boolean.valueOf(z14));
        o0Var.K(c2VarN);
        return c2VarN;
    }

    public static /* synthetic */ void o(int i14) {
        throw new UnknownFieldException(i14);
    }

    public static void p(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
    }

    public static void q(lj0.c cVar, StringBuilder sb3, String str, a2 a2Var, String str2) {
        sb3.append(cVar.name());
        sb3.append(str);
        i2.f(a2Var, str2, sb3.toString());
    }

    public static void r(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.c();
        eVar.k(f14, f15);
        eVar.i(f16, f17);
    }

    public static long s(o0 o0Var) {
        return d92.b.a(o0Var).f().a();
    }

    public static void t(u4.e eVar, float f14, float f15, float f16, float f17) {
        eVar.i(f14, f15);
        eVar.h(f16);
        eVar.p(f17);
        eVar.c();
    }

    @Override // u03.b
    public Object apply(Object obj, Object obj2) {
        return new p(obj, obj2);
    }

    @Override // bb.r
    public n[] createExtractors() {
        switch (this.f82721a) {
            case 0:
                return new n[]{new b()};
            case 1:
                return new n[]{new hc.a()};
            case 2:
                return new n[]{new hc.c()};
            case 3:
                return new n[]{new hc.e()};
            case 4:
                return new n[]{new y()};
            default:
                return new n[]{new e0(1, yb.n.a.f195662a)};
        }
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
    }

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        switch (this.f82721a) {
            case 12:
                Logger logger = hn2.c.f84546f;
                view2.getClass();
                c7.e eVarI = m1Var.f6508a.i(519);
                eVarI.getClass();
                view2.setPadding(eVarI.f25190a, eVarI.f25191b, eVarI.f25192c, view2.getPaddingBottom());
                return m1Var;
            default:
                Logger logger2 = hn2.c.f84546f;
                view2.getClass();
                c7.e eVarI2 = m1Var.f6508a.i(519);
                eVarI2.getClass();
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    x.l("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = eVarI2.f25193d;
                view2.setLayoutParams(marginLayoutParams);
                return m1Var;
        }
    }

    @Override // u03.a
    public void run() {
        switch (this.f82721a) {
            case 14:
                GarminPayInitializer.notifyProviderOnFeatureEnter$lambda$0();
                break;
            default:
                GarminPayInitializer.signOut$lambda$0();
                break;
        }
    }
}
