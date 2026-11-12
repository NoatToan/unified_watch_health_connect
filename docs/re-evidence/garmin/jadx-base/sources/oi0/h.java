package oi0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Loi0/h;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f132249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f132250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f132251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f132252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f132253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f132254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f132255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f132256h;

    public h(l22.b bVar) {
        bVar.getClass();
        this.f132249a = bVar;
        this.f132250b = bVar.getString(R.string.lbl_time_unit_an_hour);
        this.f132251c = bVar.getString(R.string.lbl_time_unit_hours);
        this.f132252d = bVar.getString(R.string.lbl_time_unit_a_minute);
        this.f132253e = bVar.getString(R.string.lbl_time_unit_minutes);
        this.f132254f = bVar.getString(R.string.lbl_time_unit_a_second);
        this.f132255g = bVar.getString(R.string.lbl_time_unit_seconds);
        this.f132256h = bVar.getString(R.string.lbl_hundredths);
    }

    public static String e(long j8) {
        long j14 = DateTimeConstants.SECONDS_PER_HOUR;
        int i14 = (int) (j8 / j14);
        int i15 = (int) (j8 % j14);
        int i16 = i15 / 60;
        int i17 = i15 % 60;
        if (i14 == 0) {
            x0 x0Var = x0.f105818a;
            return String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i16), Integer.valueOf(i17)}, 2));
        }
        x0 x0Var2 = x0.f105818a;
        return String.format(Locale.getDefault(), "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i14), Integer.valueOf(i16), Integer.valueOf(i17)}, 3));
    }

    public final String a(long j8, boolean z14) {
        int i14 = (int) (j8 / ((long) DateTimeConstants.MILLIS_PER_HOUR));
        long j14 = j8 - ((long) (DateTimeConstants.MILLIS_PER_HOUR * i14));
        int i15 = (int) (j14 / ((long) DateTimeConstants.MILLIS_PER_MINUTE));
        long j15 = 1000;
        int i16 = (int) ((j14 - ((long) (DateTimeConstants.MILLIS_PER_MINUTE * i15))) / j15);
        int iC = MathKt.c((j8 % j15) / 10.0f);
        StringBuilder sb3 = new StringBuilder();
        if (i14 > 0) {
            sb3.append(i14);
            sb3.append(StringUtils.SPACE);
            if (i14 == 1) {
                sb3.append(this.f132250b);
            } else {
                sb3.append(this.f132251c);
            }
            sb3.append(StringUtils.SPACE);
        }
        if (i15 > 0 || z14) {
            sb3.append(i15);
            sb3.append(StringUtils.SPACE);
            if (i15 == 1) {
                sb3.append(this.f132252d);
            } else {
                sb3.append(this.f132253e);
            }
            sb3.append(StringUtils.SPACE);
        }
        if (i16 > 0 || z14) {
            sb3.append(i16);
            sb3.append(StringUtils.SPACE);
            if (i16 == 1) {
                sb3.append(this.f132254f);
            } else {
                sb3.append(this.f132255g);
            }
            sb3.append(StringUtils.SPACE);
        }
        if (iC > 0 || z14) {
            sb3.append(iC);
            sb3.append(StringUtils.SPACE);
            sb3.append(this.f132256h);
        }
        return sb3.toString();
    }

    public final String b(long j8) {
        long j14 = DateTimeConstants.SECONDS_PER_DAY;
        int i14 = (int) (j8 / j14);
        int i15 = (int) (j8 % j14);
        StringBuilder sb3 = new StringBuilder();
        if (i14 > 0) {
            sb3.append(this.f132249a.c(R.plurals.lbl_duration_day, i14, Integer.valueOf(i14)));
            sb3.append(StringUtils.SPACE);
        }
        sb3.append(d(i15, false));
        String string = sb3.toString();
        int length = string.length() - 1;
        int i16 = 0;
        boolean z14 = false;
        while (i16 <= length) {
            boolean z15 = s.h(string.charAt(!z14 ? i16 : length), 32) <= 0;
            if (z14) {
                if (!z15) {
                    break;
                }
                length--;
            } else if (z15) {
                i16++;
            } else {
                z14 = true;
            }
        }
        return string.subSequence(i16, length + 1).toString();
    }

    public final String c(int i14, boolean z14) {
        int i15;
        int i16;
        if (i14 < 3600) {
            i15 = i14 / 60;
            i16 = 0;
        } else {
            int i17 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
            i15 = (i14 % DateTimeConstants.SECONDS_PER_HOUR) / 60;
            i16 = i17;
        }
        StringBuilder sb3 = new StringBuilder();
        if (i16 > 0) {
            sb3.append(i16);
            sb3.append(StringUtils.SPACE);
            if (i16 == 1) {
                sb3.append(this.f132250b);
            } else {
                sb3.append(this.f132251c);
            }
            sb3.append(StringUtils.SPACE);
        }
        if (i15 > 0 || z14) {
            sb3.append(i15);
            sb3.append(StringUtils.SPACE);
            if (i15 == 1) {
                sb3.append(this.f132252d);
            } else {
                sb3.append(this.f132253e);
            }
        }
        return sb3.toString();
    }

    public final String d(long j8, boolean z14) {
        int i14;
        int i15;
        int i16;
        if (j8 < 3600) {
            long j14 = 60;
            i16 = (int) (j8 / j14);
            i14 = (int) (j8 % j14);
            i15 = 0;
        } else {
            long j15 = DateTimeConstants.SECONDS_PER_HOUR;
            int i17 = (int) (j8 / j15);
            long j16 = j8 % j15;
            long j17 = 60;
            int i18 = (int) (j16 / j17);
            i14 = (int) (j16 % j17);
            i15 = i17;
            i16 = i18;
        }
        StringBuilder sb3 = new StringBuilder();
        if (i15 > 0) {
            sb3.append(i15);
            sb3.append(StringUtils.SPACE);
            if (i15 == 1) {
                sb3.append(this.f132250b);
            } else {
                sb3.append(this.f132251c);
            }
            sb3.append(StringUtils.SPACE);
        }
        if (i16 > 0 || z14) {
            sb3.append(i16);
            sb3.append(StringUtils.SPACE);
            if (i16 == 1) {
                sb3.append(this.f132252d);
            } else {
                sb3.append(this.f132253e);
            }
            sb3.append(StringUtils.SPACE);
        }
        if (i14 > 0 || z14) {
            sb3.append(i14);
            sb3.append(StringUtils.SPACE);
            if (i14 == 1) {
                sb3.append(this.f132254f);
            } else {
                sb3.append(this.f132255g);
            }
        }
        return sb3.toString();
    }

    public final String f(int i14) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i14);
        sb3.append(StringUtils.SPACE);
        if (i14 == 0) {
            sb3.append("");
        }
        if (i14 == 1) {
            sb3.append(this.f132252d);
        } else {
            sb3.append(this.f132253e);
        }
        return sb3.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        this(new l22.a(context));
        context.getClass();
    }
}
