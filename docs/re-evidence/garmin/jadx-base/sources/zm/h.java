package zm;

import android.content.Context;
import com.github.mikephil.charting.formatter.ValueFormatter;
import p005kotlin.Metadata;
import ps.h1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzm/h;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends ValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f205243a;

    public h(Context context) {
        this.f205243a = context;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        Context context = this.f205243a;
        if (f14 == -2.0f) {
            return h1.DYN.a(context);
        }
        if (f14 == -1.0f) {
            return h1.STA.a(context);
        }
        return f14 == 1.0f ? h1.REST.a(context) : "";
    }
}
