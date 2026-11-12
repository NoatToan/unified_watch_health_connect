package a10;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import pi0.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La10/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "formatter_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.a f242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f244c;

    public a(Context context) {
        context.getClass();
        l22.a aVar = new l22.a(context);
        this.f242a = aVar;
        this.f243b = new e(context);
        this.f244c = aVar.getString(R.string.activities_brpm_common_lbl);
    }

    public final String a(double d14) {
        return d14 > 0.0d ? e5.g(c(d14), StringUtils.SPACE, f()) : e5.g(f(), StringUtils.SPACE, this.f242a.getString(R.string.txt_empty_page_no_data));
    }

    public final String b(double d14) {
        return this.f242a.a(R.string.common_abbrev_brpm, String.valueOf((int) d14));
    }

    public final String c(double d14) {
        return this.f242a.a(R.string.lbl_breaths_per_minute_value, String.valueOf((int) d14));
    }

    public final String d(Float f14, boolean z14, boolean z15) {
        if (f14 != null && f14.floatValue() > 0.0f) {
            return z14 ? b(f14.floatValue()) : String.valueOf((int) f14.floatValue());
        }
        l22.a aVar = this.f242a;
        return z15 ? aVar.a(R.string.common_abbrev_brpm, aVar.getString(R.string.no_value_card)) : aVar.getString(R.string.no_value_card);
    }

    public final String f() {
        l22.a aVar = this.f242a;
        return e5.g(aVar.getString(R.string.lbl_average), StringUtils.SPACE, aVar.getString(R.string.activities_respiration_title));
    }
}
