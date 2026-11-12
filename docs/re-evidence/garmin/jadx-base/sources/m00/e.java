package m00;

import com.github.mikephil.charting.formatter.ValueFormatter;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lm00/e;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "Lm00/a;", "formatter", "<init>", "(Lm00/a;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends ValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f115527a;

    public e(a aVar) {
        aVar.getClass();
        this.f115527a = aVar;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        return this.f115527a.a(Double.valueOf(f14), false);
    }
}
