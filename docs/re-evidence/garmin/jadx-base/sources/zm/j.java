package zm;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.formatter.ValueFormatter;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzm/j;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends ValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f205245a;

    public j(Context context) {
        this.f205245a = context;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        int f168272d = zp1.a.f206594h.getF168272d();
        int iC = MathKt.c(f14);
        if (1 > iC || iC > f168272d) {
            return "";
        }
        String string = this.f205245a.getString(R.string.lbl_zone_index, String.valueOf(MathKt.c(f14)));
        string.getClass();
        return string;
    }
}
