package pr0;

import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import e23.l;
import p005kotlin.Metadata;
import po2.o;

/* JADX INFO: loaded from: classes8.dex */
@o13.e
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpr0/k;", "Lkz/a;", "Lcom/github/mikephil/chartingv2/interfaces/dataprovider/BarLineScatterCandleBubbleDataProvider;", "chart", "Lkotlin/Function1;", "Lcom/github/mikephil/chartingv2/highlight/Highlight;", "", "skipHighlight", "<init>", "(Lcom/github/mikephil/chartingv2/interfaces/dataprovider/BarLineScatterCandleBubbleDataProvider;Le23/l;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends kz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<Highlight, Boolean> f139629a;

    public /* synthetic */ k(BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider, l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(barLineScatterCandleBubbleDataProvider, (i14 & 2) != 0 ? new o(15) : lVar);
    }

    @Override // kz.a, com.github.mikephil.chartingv2.highlight.ChartHighlighter
    public final Highlight getHighlight(float f14, float f15) {
        Highlight highlight = super.getHighlight(f14, f15);
        if (this.f139629a.invoke(highlight).booleanValue()) {
            return null;
        }
        return highlight;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider, l<? super Highlight, Boolean> lVar) {
        super(barLineScatterCandleBubbleDataProvider);
        barLineScatterCandleBubbleDataProvider.getClass();
        lVar.getClass();
        this.f139629a = lVar;
    }
}
