package defpackage;

import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;

/* JADX INFO: loaded from: classes4.dex */
public class m1s extends iwq {
    public static e4h<m1s> m;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public YAxis.AxisDependency f25659k;
    public Matrix l;

    static {
        e4h<m1s> e4hVarA = e4h.a(1, new m1s(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null));
        m = e4hVarA;
        e4hVarA.g(0.5f);
    }

    public m1s(hwq hwqVar, float f, float f2, float f3, float f4, ryp rypVar, YAxis.AxisDependency axisDependency, View view) {
        super(hwqVar, f3, f4, rypVar, view);
        this.l = new Matrix();
        this.i = f;
        this.j = f2;
        this.f25659k = axisDependency;
    }

    public static m1s b(hwq hwqVar, float f, float f2, float f3, float f4, ryp rypVar, YAxis.AxisDependency axisDependency, View view) {
        m1s m1sVar = (m1s) m.b();
        m1sVar.e = f3;
        m1sVar.f = f4;
        m1sVar.i = f;
        m1sVar.j = f2;
        m1sVar.d = hwqVar;
        m1sVar.g = rypVar;
        m1sVar.f25659k = axisDependency;
        m1sVar.h = view;
        return m1sVar;
    }

    public static void c(m1s m1sVar) {
        m.c(m1sVar);
    }

    @Override // e4h.a
    public e4h.a a() {
        return new m1s(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null);
    }

    @Override // java.lang.Runnable
    public void run() {
        Matrix matrix = this.l;
        this.d.a0(this.i, this.j, matrix);
        this.d.L(matrix, this.h, false);
        float fS = ((BarLineChartBase) this.h).getAxis(this.f25659k).mAxisRange / this.d.s();
        float fR = ((BarLineChartBase) this.h).getXAxis().mAxisRange / this.d.r();
        float[] fArr = this.c;
        fArr[0] = this.e - (fR / 2.0f);
        fArr[1] = this.f + (fS / 2.0f);
        this.g.k(fArr);
        this.d.Y(this.c, matrix);
        this.d.L(matrix, this.h, false);
        ((BarLineChartBase) this.h).calculateOffsets();
        this.h.postInvalidate();
        c(this);
    }
}
