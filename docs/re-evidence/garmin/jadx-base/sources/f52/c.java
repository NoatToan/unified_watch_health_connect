package f52;

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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf52/c;", "Lqz/e;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lkotlin/Function0;", "", "onChartInteraction", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Le23/a;)V", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements qz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineChartBase<?> f69175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Unit> f69176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b00.b f69177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f69178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f69179e;

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

    public c(BarLineChartBase<?> barLineChartBase, e23.a<Unit> aVar) {
        BarLineChartBase<?> barLineChartBase2;
        b00.b hVar;
        barLineChartBase.getClass();
        this.f69175a = barLineChartBase;
        this.f69176b = aVar;
        if (barLineChartBase.getContext().getResources().getConfiguration().orientation == 2) {
            final int i14 = 0;
            hVar = new b00.e(barLineChartBase, new a(barLineChartBase), new e23.a(this) { // from class: f52.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f69174b;

                {
                    this.f69174b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    e23.a<Unit> aVar2;
                    e23.a<Unit> aVar3;
                    switch (i14) {
                        case 0:
                            c cVar = this.f69174b;
                            if (!cVar.f69175a.isEmpty() && (aVar2 = cVar.f69176b) != null) {
                                aVar2.invoke();
                            }
                            break;
                        default:
                            c cVar2 = this.f69174b;
                            if (!cVar2.f69175a.isEmpty() && (aVar3 = cVar2.f69176b) != null) {
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
            hVar = new h(barLineChartBase2, new e23.a(this) { // from class: f52.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f69174b;

                {
                    this.f69174b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    e23.a<Unit> aVar2;
                    e23.a<Unit> aVar3;
                    switch (i15) {
                        case 0:
                            c cVar = this.f69174b;
                            if (!cVar.f69175a.isEmpty() && (aVar2 = cVar.f69176b) != null) {
                                aVar2.invoke();
                            }
                            break;
                        default:
                            c cVar2 = this.f69174b;
                            if (!cVar2.f69175a.isEmpty() && (aVar3 = cVar2.f69176b) != null) {
                                aVar3.invoke();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, null, 4, null);
        }
        this.f69177c = hVar;
        ViewPortHandler viewPortHandler = barLineChartBase2.getViewPortHandler();
        viewPortHandler.getClass();
        this.f69178d = new v(viewPortHandler, 0.0f, 2, null);
        Context context = barLineChartBase2.getContext();
        context.getClass();
        this.f69179e = new q(context, 0, null, 6, null);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f69179e;
    }

    @Override // qz.e
    public final j c() {
        return this.f69178d;
    }

    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        Entry entryForHighlight = ((BarLineScatterCandleBubbleData) this.f69175a.getData()).getEntryForHighlight(highlight);
        entryForHighlight.getClass();
        return entryForHighlight;
    }

    @Override // qz.e
    public final k e() {
        return null;
    }

    @Override // qz.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final b00.b getF69177c() {
        return this.f69177c;
    }

    @Override // qz.e
    public final Entry g(Highlight[] highlightArr) {
        highlightArr.getClass();
        return new Entry();
    }

    public /* synthetic */ c(BarLineChartBase barLineChartBase, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(barLineChartBase, (i14 & 2) != 0 ? null : aVar);
    }
}
