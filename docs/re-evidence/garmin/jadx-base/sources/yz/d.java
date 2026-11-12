package yz;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.formatter.ValueFormatter;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyz/d;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends ValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f200226a;

    public d(Context context) {
        context.getClass();
        this.f200226a = context;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        String string = this.f200226a.getString(R.string.common_hour_small_abbreviation, Integer.valueOf((int) f14));
        string.getClass();
        return string;
    }
}
