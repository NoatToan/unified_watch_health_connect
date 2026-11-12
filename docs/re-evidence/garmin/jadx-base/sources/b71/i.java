package b71;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.m1;
import androidx.core.view.z;
import com.garmin.android.apps.connectmobile.activities.advancedactivityediting.TrimActivityChartFullScreenActivity;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.fit.FitRuntimeException;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import j20.x;
import java.lang.reflect.Constructor;
import java.util.List;
import o4.h1;
import p3.o0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements IFillFormatter, bb.j.a.InterfaceC0242a, z, androidx.camera.video.internal.audio.c, ActivityDetailChartDTO.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16341a;

    public /* synthetic */ i(int i14) {
        this.f16341a = i14;
    }

    public static int b(int i14, int i15, int i16, int i17) {
        return ((i14 - i15) * i16) + i17;
    }

    public static Bundle d(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static Integer e(int i14, Integer num) {
        return Integer.valueOf(num.intValue() - i14);
    }

    public static String f(String str, v2 v2Var) {
        return str + v2Var;
    }

    public static String g(StringBuilder sb3, Double d14, String str) {
        sb3.append(d14);
        sb3.append(str);
        return sb3.toString();
    }

    public static String h(StringBuilder sb3, Integer num, String str, Integer num2, String str2) {
        sb3.append(num);
        sb3.append(str);
        sb3.append(num2);
        sb3.append(str2);
        return sb3.toString();
    }

    public static StringBuilder i(int i14, String str, String str2) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(i14);
        sb3.append(str2);
        return sb3;
    }

    public static StringBuilder j(String str, String str2, String str3, Long l14, String str4) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(l14);
        sb3.append(str2);
        sb3.append(str3);
        sb3.append(str4);
        return sb3;
    }

    public static u4.e k(h1.a aVar, float f14, float f15) {
        aVar.getClass();
        u4.e eVar = new u4.e();
        eVar.k(f14, f15);
        return eVar;
    }

    public static u4.e l(h1.a aVar, float f14, float f15, float f16, float f17) {
        aVar.getClass();
        u4.e eVar = new u4.e();
        eVar.k(f14, f15);
        eVar.i(f16, f17);
        return eVar;
    }

    public static /* synthetic */ void m(int i14, String str) {
        throw new FitRuntimeException(str + i14);
    }

    public static void n(int i14, z3.e eVar, o0 o0Var, boolean z14) {
        eVar.invoke(o0Var, Integer.valueOf(i14));
        o0Var.g0(z14);
    }

    public static void o(Boolean bool, Boolean bool2, String str, String str2, StringBuilder sb3) {
        sb3.append(bool);
        sb3.append(str);
        sb3.append(bool2);
        sb3.append(str2);
    }

    public static void p(Double d14, Double d15, String str, String str2, StringBuilder sb3) {
        sb3.append(d14);
        sb3.append(str);
        sb3.append(d15);
        sb3.append(str2);
    }

    public static void q(Long l14, String str, String str2, String str3, StringBuilder sb3) {
        sb3.append(l14);
        sb3.append(str);
        sb3.append(str2);
        sb3.append(str3);
    }

    public static /* synthetic */ void r(Object obj, int i14, int i15, String str) {
        throw new FitRuntimeException(str + i14 + obj + i15);
    }

    public static void s(StringBuilder sb3, Boolean bool, String str, String str2, String str3) {
        sb3.append(bool);
        sb3.append(str);
        sb3.append(str2);
        sb3.append(str3);
    }

    public static void t(StringBuilder sb3, Double d14, String str, Integer num, String str2) {
        sb3.append(d14);
        sb3.append(str);
        sb3.append(num);
        sb3.append(str2);
    }

    public static void u(StringBuilder sb3, Double d14, String str, String str2, String str3) {
        sb3.append(d14);
        sb3.append(str);
        sb3.append(str2);
        sb3.append(str3);
    }

    public static void v(StringBuilder sb3, Integer num, String str, Double d14, String str2) {
        sb3.append(num);
        sb3.append(str);
        sb3.append(d14);
        sb3.append(str2);
    }

    public static void w(StringBuilder sb3, String str, String str2, Boolean bool, String str3) {
        sb3.append(str);
        sb3.append(str2);
        sb3.append(bool);
        sb3.append(str3);
    }

    public static void x(StringBuilder sb3, String str, String str2, Double d14, String str3) {
        sb3.append(str);
        sb3.append(str2);
        sb3.append(d14);
        sb3.append(str3);
    }

    public static void y(u4.e eVar, float f14, float f15, float f16) {
        eVar.g(f14);
        eVar.c();
        eVar.k(f15, f16);
    }

    public static void z(u4.e eVar, float f14, float f15, float f16) {
        eVar.o(f14);
        eVar.c();
        eVar.k(f15, f16);
    }

    @Override // bb.j.a.InterfaceC0242a
    public Constructor a() {
        switch (this.f16341a) {
            case 1:
                int[] iArr = bb.j.f17202e;
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(bb.n.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                int[] iArr2 = bb.j.f17202e;
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(bb.n.class).getConstructor(null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO.b
    public double c(int i14, List list, int i15, double d14, double d15, double d16) {
        double dDoubleValue = 0.0d;
        if (i14 == 0) {
            return 0.0d;
        }
        for (int i16 = 0; i16 < i14; i16++) {
            dDoubleValue += ((com.garmin.android.apps.connectmobile.activities.newmodel.b) list.get(i16)).C().get(i15).doubleValue();
        }
        return dDoubleValue;
    }

    @Override // com.github.mikephil.charting.formatter.IFillFormatter
    public float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
        j.a aVar = j.f16342m;
        return 0.8f;
    }

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        TrimActivityChartFullScreenActivity.a aVar = TrimActivityChartFullScreenActivity.f28831c;
        view2.getClass();
        c7.e eVarI = m1Var.f6508a.i(519);
        eVarI.getClass();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            x.l("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = eVarI.f25190a;
        marginLayoutParams.rightMargin = eVarI.f25192c;
        view2.setLayoutParams(marginLayoutParams);
        return m1Var;
    }
}
