package k00;

import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.DataRenderer;
import java.util.List;
import org.joda.time.Weeks;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk00/d;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends ValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e<DataRenderer> f101964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h00.i f101965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<String> f101966c;

    public d(e<DataRenderer> eVar, h00.i iVar, List<String> list) {
        this.f101964a = eVar;
        this.f101965b = iVar;
        this.f101966c = list;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        e<DataRenderer> eVar = this.f101964a;
        float weeks = Weeks.weeksBetween(eVar.f101968b, eVar.f101969c).getWeeks() + 1;
        h00.i iVar = this.f101965b;
        int iC = MathKt.c(f14 / (weeks / (iVar.f80602f - 1.0f)));
        return (iC < 0 || iC >= iVar.f80602f) ? "" : this.f101966c.get(iC);
    }
}
