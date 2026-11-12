package ih0;

import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lih0/i;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.a f93454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pi0.e f93455b;

    public i(Context context) {
        context.getClass();
        this.f93454a = new l22.a(context);
        this.f93455b = new pi0.e(context);
    }

    public static String c(Double d14) {
        double dDoubleValue = 0.0d;
        if (d14 != null && !Double.isNaN(d14.doubleValue()) && d14.doubleValue() > 0.0d) {
            dDoubleValue = d14.doubleValue();
        }
        String str = l3.f23126d.format(dDoubleValue);
        str.getClass();
        return str;
    }

    public static String d(Double d14) {
        double dDoubleValue = 0.0d;
        if (d14 != null && !Double.isNaN(d14.doubleValue()) && d14.doubleValue() > 0.0d) {
            dDoubleValue = d14.doubleValue();
        }
        l3.f23124b.getClass();
        String str = l3.f23130h.format(dDoubleValue);
        str.getClass();
        return str;
    }

    public final String a(Double d14, boolean z14) {
        String strD = d(d14);
        return z14 ? strD.concat(this.f93454a.getString(R.string.lbl_percentage_simple)) : strD;
    }

    public final String b(Double d14) {
        return (d14 == null || d14.doubleValue() <= 0.0d) ? this.f93454a.getString(R.string.no_value_card) : c(d14);
    }
}
