package defpackage;

import com.github.mikephil.charting.components.YAxis;

/* JADX INFO: loaded from: classes4.dex */
public interface b12 extends hu3 {
    @Override // defpackage.hu3
    a12 getData();

    float getHighestVisibleX();

    float getLowestVisibleX();

    ryp getTransformer(YAxis.AxisDependency axisDependency);

    boolean isInverted(YAxis.AxisDependency axisDependency);
}
