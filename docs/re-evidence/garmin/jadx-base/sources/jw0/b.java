package jw0;

import android.content.Context;
import android.graphics.Paint;
import b63.i;
import b63.o;
import b63.q;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import g22.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import qz.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljw0/b;", "Lqz/h;", "Lf00/c;", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "Lkw0/f;", "Lkw0/e;", "summaryChartData", "Lj23/g;", "Lb63/o;", "dateInterval", "", "isDaily", "<init>", "(Lcom/github/mikephil/charting/charts/LineChart;Lkw0/f;Lj23/g;Z)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements h<f00.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j23.g<o> f101325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f101326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewPortHandler f101327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Transformer f101328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f101329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f101330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jw0.a f101331g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"jw0/b$a", "Li00/b;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends i00.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final yz.e f101332i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
            super(viewPortHandler, yAxis, transformer);
            vb.h.o(viewPortHandler, yAxis, transformer);
            this.f101332i = new yz.e();
        }

        @Override // i00.b
        /* JADX INFO: renamed from: e */
        public final ValueFormatter getF63194k() {
            return this.f101332i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    public b(LineChart lineChart, kw0.f<kw0.e> fVar, j23.g<o> gVar, boolean z14) {
        ?? arrayList;
        Object next;
        Object next2;
        lineChart.getClass();
        fVar.getClass();
        gVar.getClass();
        this.f101325a = gVar;
        this.f101326b = z14;
        List<kw0.a> list = fVar.f106949f;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                kw0.a aVar = (kw0.a) obj;
                Iterator it = fVar.f106947d.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!s.g(aVar.f106903a, ((kw0.e) next2).getF106917a()));
                kw0.e eVar = (kw0.e) next2;
                if ((eVar != null ? eVar.getF106918b() : null) == null) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = 0;
        }
        arrayList = arrayList == 0 ? j0.f134944a : arrayList;
        ArrayList arrayList2 = new ArrayList();
        Object start = gVar.getStart();
        while (true) {
            o oVar = (o) start;
            if (oVar.compareTo((o) gVar.b()) > 0) {
                break;
            }
            Iterator it3 = ((Iterable) arrayList).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                kw0.a aVar2 = (kw0.a) next;
                if (s.g(aVar2.f106903a, start) && aVar2.f106904b != null) {
                    break;
                }
            }
            kw0.a aVar3 = (kw0.a) next;
            arrayList2.add(aVar3 != null ? new kw0.a(oVar, aVar3.f106904b, false, 4, null) : null);
            int i14 = z14 ? 1 : 7;
            i.INSTANCE.getClass();
            start = q.e(oVar, i14, i.f16190d);
        }
        ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
        this.f101327c = viewPortHandler;
        Transformer transformer = lineChart.getTransformer(YAxis.AxisDependency.LEFT);
        this.f101328d = transformer;
        viewPortHandler.getClass();
        XAxis xAxisE = com.nimbusds.jose.shaded.gson.internal.a.e(lineChart, transformer);
        Context context = lineChart.getContext();
        context.getClass();
        c cVar = new c(viewPortHandler, xAxisE, transformer, context, arrayList2, this.f101326b);
        int iB = lw0.b.b(this.f101325a, this.f101326b);
        ArrayList arrayList3 = new ArrayList(iB);
        for (int i15 = 0; i15 < iB; i15++) {
            arrayList3.add("");
        }
        c22.j0 j0Var = c22.j0.f23099a;
        LocalDate localDateH = l.h((o) this.f101325a.getStart());
        j0Var.getClass();
        arrayList3.set(0, c22.j0.l(localDateH));
        arrayList3.set(arrayList3.size() - 1, c22.j0.l(l.h((o) this.f101325a.b())));
        cVar.f80601e = new IndexAxisValueFormatter(arrayList3);
        cVar.f80602f = iB;
        this.f101329e = cVar;
        this.f101330f = new a(this.f101327c, lineChart.getAxisLeft(), this.f101328d);
        ChartAnimator animator = lineChart.getAnimator();
        animator.getClass();
        ViewPortHandler viewPortHandler2 = this.f101327c;
        viewPortHandler2.getClass();
        jw0.a aVar4 = new jw0.a(lineChart, animator, viewPortHandler2);
        aVar4.f101324i = Paint.Cap.ROUND;
        this.f101331g = aVar4;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: b */
    public final h00.b getF63186d() {
        return this.f101329e;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: c */
    public final DataRenderer getF173486i() {
        return this.f101331g;
    }

    @Override // qz.h
    /* JADX INFO: renamed from: d */
    public final i00.b getF63187e() {
        return this.f101330f;
    }
}
