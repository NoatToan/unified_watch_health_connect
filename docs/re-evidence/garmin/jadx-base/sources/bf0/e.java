package bf0;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import b21.s4;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import e23.l;
import i3.e5;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p13.x;
import zz.j;
import zz.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB%\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lbf0/e;", "Lqz/e;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lkotlin/Function0;", "", "onChartInteraction", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Le23/a;)V", "a", "gcm-domain-heartrate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements qz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineChartBase<?> f17810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Unit> f17811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b00.e f17812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zz.a f17813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zz.g f17814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bf0.b f17815f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements l<MotionEvent, Unit> {
        public b(Object obj) {
            super(1, obj, pz.d.class, "toggleDoubleHighlight", "toggleDoubleHighlight(Lcom/github/mikephil/charting/charts/BarLineChartBase;Landroid/view/MotionEvent;)V", 1);
        }

        @Override // e23.l
        public final Unit invoke(MotionEvent motionEvent) {
            pz.d.g((BarLineChartBase) this.receiver, motionEvent);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public e(BarLineChartBase<?> barLineChartBase, e23.a<Unit> aVar) {
        barLineChartBase.getClass();
        this.f17810a = barLineChartBase;
        this.f17811b = aVar;
        this.f17812c = new b00.e(barLineChartBase, new b(barLineChartBase), new s4(this, 13));
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        viewPortHandler.getClass();
        zz.a aVar2 = new zz.a(viewPortHandler, 10.0f);
        this.f17813d = aVar2;
        ViewPortHandler viewPortHandler2 = barLineChartBase.getViewPortHandler();
        viewPortHandler2.getClass();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(a7.b.getColor(barLineChartBase.getContext(), R.color.white));
        paint.setAlpha(10);
        paint.setPathEffect(null);
        Unit unit = Unit.INSTANCE;
        this.f17814e = new zz.g(viewPortHandler2, paint);
        Context context = barLineChartBase.getContext();
        context.getClass();
        this.f17815f = new bf0.b(context, 0, aVar2, 2, null);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f17815f;
    }

    @Override // qz.e
    public final j c() {
        return this.f17813d;
    }

    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        return xy2.b.x(highlight, this.f17810a);
    }

    @Override // qz.e
    public final k e() {
        return this.f17814e;
    }

    @Override // qz.e
    /* JADX INFO: renamed from: f */
    public final b00.b getF179435c() {
        return this.f17812c;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.github.mikephil.charting.data.ChartData] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.github.mikephil.charting.data.ChartData] */
    /* JADX WARN: Type inference failed for: r4v15, types: [com.github.mikephil.charting.data.ChartData] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.github.mikephil.charting.data.ChartData] */
    @Override // qz.e
    public final Entry g(Highlight[] highlightArr) {
        highlightArr.getClass();
        BarLineChartBase<?> barLineChartBase = this.f17810a;
        barLineChartBase.getClass();
        if (highlightArr.length != 2) {
            return new Entry();
        }
        List listK = highlightArr[0].getX() < highlightArr[1].getX() ? x.k(barLineChartBase.getData().getEntryForHighlight(highlightArr[0]), barLineChartBase.getData().getEntryForHighlight(highlightArr[1])) : x.k(barLineChartBase.getData().getEntryForHighlight(highlightArr[1]), barLineChartBase.getData().getEntryForHighlight(highlightArr[0]));
        Entry entry = (Entry) listK.get(0);
        Entry entry2 = (Entry) listK.get(1);
        Object data = entry.getData();
        data.getClass();
        cf0.a aVar = (cf0.a) data;
        Object data2 = entry2.getData();
        data2.getClass();
        cf0.a aVar2 = (cf0.a) data2;
        int i14 = ((aVar2.f27012j - aVar.f27012j) + aVar.f27005c) / ((aVar2.f27011i - aVar.f27011i) + 1);
        String strG = e5.g(aVar.f27003a, " - ", aVar2.f27004b);
        df0.b bVar = df0.b.f59440a;
        Integer numValueOf = Integer.valueOf(i14);
        bVar.getClass();
        df0.c cVar = df0.c.f59441a;
        cVar.getClass();
        int iA = df0.b.a(df0.c.a(numValueOf));
        Integer numValueOf2 = Integer.valueOf(i14);
        cVar.getClass();
        int iA2 = df0.c.a(numValueOf2);
        String strValueOf = iA2 == 0 ? "<1" : String.valueOf(iA2);
        Entry entry3 = new Entry();
        entry3.setData(x.k(new zz.l(strG, String.valueOf(i14), aVar.f27007e, aVar.f27006d, null, Integer.valueOf(iA), null, null, 208, null), new zz.l(strG, strValueOf, aVar.f27010h, null, null, null, null, null, 248, null)));
        return entry3;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lbf0/e$a;", "", "<init>", "()V", "", "HIGHLIGHT_OVERLAY_ALPHA", "I", "", "LANDSCAPE_HIGHLIGHT_TOP_PADDING", "F", "gcm-domain-heartrate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ e(BarLineChartBase barLineChartBase, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(barLineChartBase, (i14 & 2) != 0 ? null : aVar);
    }
}
