package mz;

import com.github.mikephil.chartingv2.charts.CombinedChart;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet;
import java.util.ArrayList;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\f\rB'\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB%\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u000b¨\u0006\u000e"}, d2 = {"Lmz/e;", "Lmz/a;", "Lcom/github/mikephil/chartingv2/charts/LineChart;", "chart", "Lmz/d;", "options", "Lmz/e$b;", "filter", "<init>", "(Lcom/github/mikephil/chartingv2/charts/LineChart;Lmz/d;Lmz/e$b;)V", "Lcom/github/mikephil/chartingv2/charts/CombinedChart;", "(Lcom/github/mikephil/chartingv2/charts/CombinedChart;Lmz/d;Lmz/e$b;)V", "b", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends mz.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f121621i = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f121622h;

    public interface b {
        boolean c(Entry entry, ILineDataSet iLineDataSet);
    }

    static {
        new a(null);
    }

    public /* synthetic */ e(LineChart lineChart, d dVar, b bVar, int i14, j jVar) {
        this(lineChart, (i14 & 2) != 0 ? new d() : dVar, (i14 & 4) != 0 ? new u0(28) : bVar);
    }

    @Override // mz.a
    public final ArrayList a(ILineDataSet iLineDataSet) {
        int i14 = 0;
        int entryCount = iLineDataSet != null ? iLineDataSet.getEntryCount() : 0;
        if (entryCount <= 1) {
            return super.a(iLineDataSet);
        }
        ArrayList arrayList = new ArrayList();
        while (i14 < entryCount) {
            Entry entryForIndex = null;
            Entry entryForIndex2 = iLineDataSet != null ? iLineDataSet.getEntryForIndex(i14) : null;
            if (!c(entryForIndex2, iLineDataSet)) {
                Entry entryForIndex3 = (i14 <= 0 || iLineDataSet == null) ? null : iLineDataSet.getEntryForIndex(i14 - 1);
                if (i14 < entryCount - 1 && iLineDataSet != null) {
                    entryForIndex = iLineDataSet.getEntryForIndex(i14 + 1);
                }
                if (c(entryForIndex3, iLineDataSet) && c(entryForIndex, iLineDataSet) && entryForIndex2 != null) {
                    arrayList.add(entryForIndex2);
                }
            }
            i14++;
        }
        return arrayList;
    }

    @Override // mz.a
    public final boolean c(Entry entry, ILineDataSet iLineDataSet) {
        if (entry != null) {
            return iLineDataSet != null && this.f121622h.c(entry, iLineDataSet);
        }
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmz/e$a;", "", "<init>", "()V", "", "DEFAULT_ENTRY_SKIP_VALUE", "F", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public e(LineChart lineChart) {
        this(lineChart, (d) null, (b) null, 6, (j) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(LineChart lineChart, d dVar) {
        this(lineChart, dVar, (b) null, 4, (j) null);
        dVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(CombinedChart combinedChart, d dVar) {
        this(combinedChart, dVar, (b) null, 4, (j) null);
        dVar.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LineChart lineChart, d dVar, b bVar) {
        super(lineChart, dVar);
        dVar.getClass();
        bVar.getClass();
        this.f121622h = bVar;
    }

    public /* synthetic */ e(CombinedChart combinedChart, d dVar, b bVar, int i14, j jVar) {
        this(combinedChart, dVar, (i14 & 4) != 0 ? new u0(29) : bVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CombinedChart combinedChart, d dVar, b bVar) {
        super(combinedChart, dVar);
        dVar.getClass();
        bVar.getClass();
        this.f121622h = bVar;
    }
}
