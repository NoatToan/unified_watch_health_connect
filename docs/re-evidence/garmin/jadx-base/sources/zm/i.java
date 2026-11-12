package zm;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.formatter.ValueFormatter;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzm/i;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends ValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f205244a;

    public i(Context context) {
        this.f205244a = context;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        Context context = this.f205244a;
        if (f14 == 0.0f) {
            String string = context.getString(R.string.lbl_run);
            string.getClass();
            return string;
        }
        if (f14 == 1.0f) {
            String string2 = context.getString(R.string.activity_options_walk_title);
            string2.getClass();
            return string2;
        }
        if (f14 != 2.0f) {
            return "";
        }
        String string3 = context.getString(R.string.lbl_rwd_idle);
        string3.getClass();
        return string3;
    }
}
