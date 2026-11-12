package vq1;

import android.content.Context;
import android.view.MotionEvent;
import b00.h;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zz.j;
import zz.k;
import zz.q;
import zz.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lvq1/b;", "Lqz/e;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lkotlin/Function0;", "", "onChartInteraction", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Le23/a;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements qz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineChartBase<?> f179433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Unit> f179434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b00.b f179435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f179436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f179437e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements l<MotionEvent, Unit> {
        public a(Object obj) {
            super(1, obj, pz.d.class, "toggleSingleHighlight", "toggleSingleHighlight(Lcom/github/mikephil/charting/charts/BarLineChartBase;Landroid/view/MotionEvent;)V", 1);
        }

        @Override // e23.l
        public final Unit invoke(MotionEvent motionEvent) {
            pz.d.h((BarLineChartBase) this.receiver, motionEvent);
            return Unit.INSTANCE;
        }
    }

    public b(BarLineChartBase<?> barLineChartBase, e23.a<Unit> aVar) {
        BarLineChartBase<?> barLineChartBase2;
        b00.b hVar;
        barLineChartBase.getClass();
        this.f179433a = barLineChartBase;
        this.f179434b = aVar;
        if (barLineChartBase.getContext().getResources().getConfiguration().orientation == 2) {
            final int i14 = 0;
            hVar = new b00.e(barLineChartBase, new a(barLineChartBase), new e23.a(this) { // from class: vq1.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f179432b;

                {
                    this.f179432b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    e23.a<Unit> aVar2;
                    e23.a<Unit> aVar3;
                    switch (i14) {
                        case 0:
                            b bVar = this.f179432b;
                            if (!bVar.f179433a.isEmpty() && (aVar2 = bVar.f179434b) != null) {
                                aVar2.invoke();
                            }
                            break;
                        default:
                            b bVar2 = this.f179432b;
                            if (!bVar2.f179433a.isEmpty() && (aVar3 = bVar2.f179434b) != null) {
                                aVar3.invoke();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
            barLineChartBase2 = barLineChartBase;
        } else {
            final int i15 = 1;
            barLineChartBase2 = barLineChartBase;
            hVar = new h(barLineChartBase2, new e23.a(this) { // from class: vq1.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f179432b;

                {
                    this.f179432b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    e23.a<Unit> aVar2;
                    e23.a<Unit> aVar3;
                    switch (i15) {
                        case 0:
                            b bVar = this.f179432b;
                            if (!bVar.f179433a.isEmpty() && (aVar2 = bVar.f179434b) != null) {
                                aVar2.invoke();
                            }
                            break;
                        default:
                            b bVar2 = this.f179432b;
                            if (!bVar2.f179433a.isEmpty() && (aVar3 = bVar2.f179434b) != null) {
                                aVar3.invoke();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, null, 4, null);
        }
        this.f179435c = hVar;
        ViewPortHandler viewPortHandler = barLineChartBase2.getViewPortHandler();
        viewPortHandler.getClass();
        this.f179436d = new v(viewPortHandler, 0.0f, 2, null);
        Context context = barLineChartBase2.getContext();
        context.getClass();
        this.f179437e = new q(context, 0, null, 6, null);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f179437e;
    }

    @Override // qz.e
    public final j c() {
        return this.f179436d;
    }

    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        Entry entryForHighlight = ((BarLineScatterCandleBubbleData) this.f179433a.getData()).getEntryForHighlight(highlight);
        entryForHighlight.getClass();
        return entryForHighlight;
    }

    @Override // qz.e
    public final k e() {
        return null;
    }

    @Override // qz.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final b00.b getF179435c() {
        return this.f179435c;
    }

    @Override // qz.e
    public final Entry g(Highlight[] highlightArr) {
        highlightArr.getClass();
        return new Entry();
    }

    public /* synthetic */ b(BarLineChartBase barLineChartBase, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(barLineChartBase, (i14 & 2) != 0 ? null : aVar);
    }
}
