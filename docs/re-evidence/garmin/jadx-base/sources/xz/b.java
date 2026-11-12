package xz;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static final List<LegendEntry> a(List<f> list) {
        if (list == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        for (f fVar : list) {
            a00.b bVar = new a00.b();
            String str = fVar.f192738a;
            g gVar = fVar.f192742e;
            bVar.label = str;
            Integer num = fVar.f192740c;
            bVar.formColor = num != null ? num.intValue() : -1;
            bVar.f42d = fVar.f192739b;
            List<Integer> list2 = fVar.f192741d;
            bVar.f41c = list2 != null ? h0.a1(list2) : null;
            Float f14 = fVar.f192743f;
            if (f14 != null) {
                bVar.formSize = f14.floatValue();
            }
            if (s.g(gVar, g.a.f192745a)) {
                bVar.form = Legend.LegendForm.CIRCLE;
            } else if (s.g(gVar, g.h.f192753a)) {
                bVar.form = Legend.LegendForm.CIRCLE;
                bVar.f39a = Paint.Style.STROKE;
                bVar.formLineWidth = 2.0f;
            } else if (s.g(gVar, g.d.f192749a)) {
                bVar.form = Legend.LegendForm.CIRCLE;
                bVar.f39a = Paint.Style.FILL_AND_STROKE;
                bVar.formLineWidth = 2.0f;
                bVar.f40b = -1;
            } else if (s.g(gVar, g.C3605g.f192752a)) {
                bVar.form = Legend.LegendForm.SQUARE;
            } else if (gVar instanceof g.e) {
                bVar.form = Legend.LegendForm.LINE;
                bVar.formLineWidth = ((g.e) gVar).f192750a;
            } else if (gVar instanceof g.c) {
                bVar.form = Legend.LegendForm.LINE;
                g.c cVar = (g.c) gVar;
                bVar.formLineWidth = cVar.f192748b;
                float fConvertDpToPixel = Utils.convertDpToPixel(16.0f / cVar.f192747a);
                bVar.formLineDashEffect = new DashPathEffect(new float[]{0.75f * fConvertDpToPixel, fConvertDpToPixel * 0.25f}, 0.0f);
            } else if (gVar instanceof g.b) {
                bVar.f42d = ((g.b) gVar).f192746a;
            } else if (s.g(gVar, g.f.f192751a)) {
                bVar.form = Legend.LegendForm.NONE;
            } else {
                bVar.form = Legend.LegendForm.DEFAULT;
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }
}
