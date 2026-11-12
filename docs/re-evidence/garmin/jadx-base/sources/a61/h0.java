package a61;

import com.github.mikephil.charting.formatter.ValueFormatter;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"La61/h0;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 extends ValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h00.b f1601a;

    public h0(h00.b bVar) {
        this.f1601a = bVar;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        String str;
        List<String> list = this.f1601a.f80597a;
        return (list == null || (str = (String) p13.h0.e0(MathKt.c(f14), list)) == null) ? "" : str;
    }
}
