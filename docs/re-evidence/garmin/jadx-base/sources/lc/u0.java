package lc;

import android.graphics.SurfaceTexture;
import android.os.Parcel;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.m1;
import b0.g1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripSetupActivity;
import com.garmin.android.lib.legal.LegalGatewayActivity;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet;
import com.google.android.gms.maps.GoogleMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import n23.w3;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.json.JSONException;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import p005kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u0 implements androidx.core.view.z, ld.a.b, b0.w0.c, GoogleMap.OnCameraMoveListener, mz.e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111879a;

    public static int b(int i14, int i15, List list) {
        return (list.hashCode() + i14) * i15;
    }

    public static int d(Class cls, Parcel parcel, ArrayList arrayList, int i14, int i15) {
        arrayList.add(parcel.readParcelable(cls.getClassLoader()));
        return i14 + i15;
    }

    public static int e(LocalDate localDate, LocalDate localDate2, int i14) {
        return Days.daysBetween(localDate, localDate2).getDays() + i14;
    }

    public static long f(p3.m mVar) {
        return d92.b.a(mVar).f().b();
    }

    public static d60.b g(d60.b.a aVar) {
        aVar.getClass();
        return new d60.b();
    }

    public static Double h(double d14, Double d15) {
        return Double.valueOf(d15.doubleValue() / d14);
    }

    public static String i(Integer num, String str, String str2, String str3) {
        return str + num + str2 + str3;
    }

    public static String j(String str) {
        str.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        return lowerCase;
    }

    public static String k(StringBuilder sb3, String str, int i14, String str2) {
        sb3.append(str);
        sb3.append(i14);
        sb3.append(str2);
        return sb3.toString();
    }

    public static String l(p3.o0 o0Var, int i14, Integer num, p3.o0 o0Var2, boolean z14) {
        o0Var.C(i14);
        String strQ = gl1.y.Q(o0Var2, num.intValue());
        o0Var.g0(z14);
        return strQ;
    }

    public static StringBuilder m(String str, Integer num, String str2, Double d14, String str3) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(num);
        sb3.append(str2);
        sb3.append(d14);
        sb3.append(str3);
        return sb3;
    }

    public static StringBuilder n(String str, Integer num, String str2, String str3, String str4) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(str2);
        sb3.append(str3);
        sb3.append(num);
        sb3.append(str4);
        return sb3;
    }

    public static Iterator o(Parcel parcel, List list, int i14) {
        parcel.writeInt(i14);
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static SingleInstanceFactory p(BeanDefinition beanDefinition, Module module) {
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(beanDefinition);
        module.indexPrimaryType(singleInstanceFactory);
        return singleInstanceFactory;
    }

    public static p3.o0 q(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        rVar.getClass();
        qVar.getClass();
        return mVar.E(i14);
    }

    public static /* synthetic */ void r() {
        throw new NoWhenBranchMatchedException();
    }

    public static void s(int i14, HashMap map, String str, int i15, String str2) {
        map.put(Integer.valueOf(i14), str);
        map.put(Integer.valueOf(i15), str2);
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new w3(str + obj);
    }

    public static /* synthetic */ void u(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static void v(JSONException jSONException, StringBuilder sb3, a2 a2Var, String str) {
        sb3.append(jSONException.getMessage());
        i2.f(a2Var, str, sb3.toString());
    }

    @Override // b0.w0.c
    public void a(g1 g1Var) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(g1Var.f13906b.getWidth(), g1Var.f13906b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        g1Var.b(surface, k0.b.a(), new m0.c(0, surface, surfaceTexture));
    }

    @Override // mz.e.b
    public boolean c(Entry entry, ILineDataSet iLineDataSet) {
        switch (this.f111879a) {
            case 28:
                int i14 = mz.e.f121621i;
                entry.getClass();
                return entry.getVal() == 0.0f;
            default:
                int i15 = mz.e.f121621i;
                entry.getClass();
                return entry.getVal() == 0.0f;
        }
    }

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        switch (this.f111879a) {
            case 1:
                LegalGatewayActivity.a aVar = LegalGatewayActivity.f49928n;
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
                return m1.f6507b;
            case 15:
                com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.a.C0664a c0664a = com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.a.f37094a;
                view2.getClass();
                c7.e eVarI2 = m1Var.f6508a.i(519);
                eVarI2.getClass();
                view2.setPadding(eVarI2.f25190a, eVarI2.f25191b, eVarI2.f25192c, view2.getPaddingBottom());
                return m1Var;
            case 16:
                TripSetupActivity.a aVar2 = TripSetupActivity.f37081g;
                view2.getClass();
                c7.e eVarI3 = m1Var.f6508a.i(1);
                eVarI3.getClass();
                view2.setPadding(view2.getPaddingLeft(), eVarI3.f25191b, view2.getPaddingRight(), view2.getPaddingBottom());
                return m1Var;
            default:
                TripSetupActivity.a aVar3 = TripSetupActivity.f37081g;
                view2.getClass();
                c7.e eVarI4 = m1Var.f6508a.i(2);
                eVarI4.getClass();
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), eVarI4.f25193d);
                return m1Var;
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveListener
    public void onCameraMove() {
        int i14 = me2.l.Z;
    }

    public /* synthetic */ u0(int i14) {
        this.f111879a = i14;
    }
}
