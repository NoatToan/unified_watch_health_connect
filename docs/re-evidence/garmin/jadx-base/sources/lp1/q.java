package lp1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llp1/q;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f114191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114193c;

    public q(Context context) {
        context.getClass();
        this.f114191a = context;
        String string = context.getString(R.string.sleep_my_day_hour_unit);
        string.getClass();
        this.f114192b = string;
        String string2 = context.getString(R.string.sleep_my_day_minute_unit);
        string2.getClass();
        this.f114193c = string2;
    }

    public final String a(long j8) {
        String strC;
        if (j8 <= 0) {
            strC = getF114198d();
        } else {
            String str = this.f114193c;
            if (j8 >= 60) {
                long j14 = DateTimeConstants.SECONDS_PER_HOUR;
                long j15 = j8 / j14;
                long j16 = (j8 % j14) / ((long) 60);
                String str2 = this.f114192b;
                if (j15 > 0 && j16 > 0) {
                    strC = j15 + StringUtils.SPACE + str2 + StringUtils.SPACE + j16 + StringUtils.SPACE + str;
                } else if (j15 > 0) {
                    strC = j15 + StringUtils.SPACE + str2;
                } else {
                    strC = j16 + StringUtils.SPACE + str;
                }
            } else {
                String string = this.f114191a.getString(R.string.less_than_string_pattern, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                strC = zl.a.c(string, string, StringUtils.SPACE, str);
            }
        }
        return hb.a.i(strC);
    }

    /* JADX INFO: renamed from: b */
    public abstract String getF114198d();
}
