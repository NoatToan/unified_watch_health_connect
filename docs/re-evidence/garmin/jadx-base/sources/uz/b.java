package uz;

import android.graphics.drawable.ColorDrawable;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BaseDataSet;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import xz.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\f\b\u0003\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00042\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006:\u0001\fB/\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Luz/b;", "ChartType", "OverlayType", "Data", "Lcom/github/mikephil/charting/interfaces/datasets/IBarLineScatterCandleBubbleDataSet;", "DataSet", "Lqz/c;", "chartType", "Luz/c;", "dataConfigFactory", "<init>", "(Ljava/lang/Object;Luz/c;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class b<ChartType, OverlayType, Data, DataSet extends IBarLineScatterCandleBubbleDataSet<?>> implements qz.c<Data, DataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChartType f173475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c<ChartType, OverlayType, Data, DataSet> f173476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qz.c<Data, DataSet> f173477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qz.c<Data, DataSet> f173478d;

    static {
        new a(null);
    }

    public b(ChartType charttype, c<ChartType, OverlayType, Data, DataSet> cVar) {
        cVar.getClass();
        this.f173475a = charttype;
        this.f173476b = cVar;
        this.f173477c = cVar.b(charttype, null);
        this.f173478d = cVar.a(null, null);
    }

    @Override // qz.c
    public final List<DataSet> a(Data data) {
        List<DataSet> listA;
        ArrayList arrayList = new ArrayList();
        List<DataSet> listA2 = this.f173477c.a(data);
        for (DataSet dataset : listA2) {
            dataset.setAxisDependency(YAxis.AxisDependency.LEFT);
            LineDataSet lineDataSet = dataset instanceof LineDataSet ? (LineDataSet) dataset : null;
            if (lineDataSet != null) {
                int iX = x();
                ColorDrawable colorDrawable = new ColorDrawable(lineDataSet.getColor());
                colorDrawable.setAlpha(iX);
                lineDataSet.setFillDrawable(colorDrawable);
            }
            BaseDataSet baseDataSet = dataset instanceof BaseDataSet ? (BaseDataSet) dataset : null;
            if (baseDataSet != null) {
                int iX2 = x();
                List<Integer> colors = baseDataSet.getColors();
                colors.getClass();
                baseDataSet.setColors(h0.a1(colors), iX2);
            }
        }
        arrayList.addAll(listA2);
        qz.c<Data, DataSet> cVar = this.f173478d;
        if (cVar != null && (listA = cVar.a(data)) != null) {
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                ((IBarLineScatterCandleBubbleDataSet) it.next()).setAxisDependency(YAxis.AxisDependency.RIGHT);
            }
            arrayList.addAll(listA);
        }
        return arrayList;
    }

    @Override // qz.c
    public final Integer c(Data data) {
        return this.f173477c.c(data);
    }

    @Override // qz.c
    public final float e(Data data) {
        return this.f173477c.e(data);
    }

    @Override // qz.c
    public final List<LimitLine> f(Data data) {
        return this.f173477c.f(data);
    }

    @Override // qz.c
    public final List<h> g(Data data) {
        return this.f173477c.g(data);
    }

    @Override // qz.c
    public final float i(Data data) {
        return this.f173477c.i(data);
    }

    @Override // qz.c
    public final Integer j(Data data) {
        return this.f173477c.j(data);
    }

    @Override // qz.c
    public final boolean l() {
        qz.c<Data, DataSet> cVar = this.f173478d;
        return cVar != null ? cVar.l() : this.f173477c.l();
    }

    @Override // qz.c
    public final float m(Data data) {
        qz.c<Data, DataSet> cVar = this.f173478d;
        if (cVar != null) {
            return cVar.m(data);
        }
        return 0.0f;
    }

    @Override // qz.c
    public final List<String> o(Data data) {
        return this.f173477c.o(data);
    }

    @Override // qz.c
    public final Integer p(Data data) {
        Integer numP;
        qz.c<Data, DataSet> cVar = this.f173478d;
        if (cVar == null || (numP = cVar.p(data)) == null) {
            return null;
        }
        return numP;
    }

    @Override // qz.c
    public final float q(Data data) {
        return this.f173477c.q(data);
    }

    @Override // qz.c
    public final float t(Data data) {
        return this.f173477c.t(data);
    }

    @Override // qz.c
    public List<xz.f> u(Data data) {
        List<xz.f> listU;
        qz.c<Data, DataSet> cVar = this.f173478d;
        return (cVar == null || (listU = cVar.u(data)) == null) ? this.f173477c.u(data) : listU;
    }

    @Override // qz.c
    public final List<LimitLine> v(Data data) {
        return this.f173477c.v(data);
    }

    @Override // qz.c
    public final float w(Data data) {
        qz.c<Data, DataSet> cVar = this.f173478d;
        if (cVar != null) {
            return cVar.w(data);
        }
        return 0.0f;
    }

    public int x() {
        return this.f173478d != null ? 128 : 255;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Luz/b$a;", "", "<init>", "()V", "", "COLOR_NO_OPACITY_ALPHA", "I", "COLOR_OPACITY_ALPHA", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
