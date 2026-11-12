package qr1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqr1/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f146892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f146894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f146895d;

    public a(Context context) {
        context.getClass();
        this.f146892a = context;
        String string = context.getString(R.string.no_value);
        string.getClass();
        this.f146893b = string;
        String string2 = context.getString(R.string.sleep_my_day_hour_unit);
        string2.getClass();
        this.f146894c = string2;
        String string3 = context.getString(R.string.sleep_my_day_minute_unit);
        string3.getClass();
        this.f146895d = string3;
    }

    public static String a(a aVar, int i14) {
        int i15;
        int i16;
        aVar.getClass();
        if (i14 < 3600) {
            i15 = i14 / 60;
            i16 = 0;
        } else {
            int i17 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
            i15 = (i14 % DateTimeConstants.SECONDS_PER_HOUR) / 60;
            i16 = i17;
        }
        StringBuilder sb3 = new StringBuilder(15);
        if (i16 > 0) {
            sb3.append(i16);
            sb3.append(StringUtils.SPACE);
            sb3.append(aVar.f146894c);
            sb3.append(StringUtils.SPACE);
        }
        if (i15 > 0) {
            sb3.append(i15);
            sb3.append(StringUtils.SPACE);
            sb3.append(aVar.f146895d);
        }
        return hb.a.i(sb3.toString());
    }
}
