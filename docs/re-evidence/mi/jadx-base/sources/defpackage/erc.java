package defpackage;

import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface erc<T extends Entry> {
    float A();

    DashPathEffect C();

    boolean D();

    int E0(int i);

    float G();

    boolean G0();

    T H0(float f, float f2, DataSet.Rounding rounding);

    float L();

    int O0();

    wye P0();

    boolean R();

    float V();

    float Z();

    int c(T t);

    k0d d0();

    Legend.LegendForm e();

    boolean g0(T t);

    String getLabel();

    T i(int i);

    List<Integer> i0();

    boolean isVisible();

    float j();

    void j0();

    Typeface l();

    boolean l0();

    YAxis.AxisDependency m0();

    int n(int i);

    int n0();

    void q(float f, float f2);

    List<T> r(float f);

    void t0(k0d k0dVar);

    T v0(float f, float f2);

    float z0();
}
