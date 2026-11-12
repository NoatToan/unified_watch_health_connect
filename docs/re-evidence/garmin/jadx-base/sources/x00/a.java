package x00;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p13.h0;
import p13.x;
import pi0.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lx00/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "formatter_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.a f188233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f188234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f188235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f188236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f188237e;

    public a(Context context) {
        context.getClass();
        this.f188233a = new l22.a(context);
        this.f188234b = new e(context);
        this.f188235c = "0";
        this.f188236d = Marker.ANY_NON_NULL_MARKER;
        this.f188237e = "=";
    }

    public final String a(Integer num, Integer num2, Integer num3) {
        l22.a aVar = this.f188233a;
        if (num == null || num2 == null || num3 == null) {
            return aVar.getString(R.string.no_data_label);
        }
        return h0.k0(x.k(e5.g(aVar.a(R.string.lbl_plural_more_than_one_minute, num), StringUtils.SPACE, aVar.getString(R.string.lbl_intensity_moderate_short)), this.f188236d, j20.x.d(aVar.a(R.string.lbl_plural_more_than_one_minute, num2), StringUtils.SPACE, aVar.getString(R.string.lbl_intensity_vigorous_short), StringUtils.SPACE, aVar.getString(R.string.lbl_times_two)), this.f188237e, e5.g(aVar.a(R.string.lbl_plural_more_than_one_minute, num3), StringUtils.SPACE, aVar.getString(R.string.challenge_leaderboard_header_total_label))), ". ", null, null, null, 62);
    }

    public final String b(Integer num) {
        return (num == null || num.intValue() < 0) ? this.f188235c : String.valueOf(num.intValue());
    }

    public final String c(Integer num) {
        return (num == null || num.intValue() < 0) ? this.f188235c : b(num);
    }

    public final String d() {
        return this.f188233a.getString(R.string.no_value_card);
    }

    public final String e() {
        return this.f188233a.getString(R.string.common_min_abbreviated_without_period);
    }
}
