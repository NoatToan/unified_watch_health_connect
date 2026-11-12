package u00;

import am.j;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import java.util.Locale;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.e;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lu00/a;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "a", "formatter_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f167335c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f167336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f167337b;

    static {
        new C3146a(null);
    }

    public a(l22.b bVar) {
        bVar.getClass();
        this.f167336a = bVar;
        this.f167337b = bVar.getString(R.string.no_value_card);
    }

    public static String h(String str) {
        return s.g(Locale.getDefault().getLanguage(), Locale.GERMAN.getLanguage()) ? str : hb.a.i(str);
    }

    public final p<String, String> a(int i14) {
        int i15;
        int i16;
        int i17 = 0;
        if (i14 < 3600.0d) {
            i16 = i14 / 60;
            i15 = i14 % 60;
        } else {
            i17 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
            int i18 = i14 % DateTimeConstants.SECONDS_PER_HOUR;
            i15 = i18 % 60;
            i16 = i18 / 60;
        }
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        int i19 = R.string.lbl_plural_more_than_one_second;
        l22.b bVar = this.f167336a;
        if (i14 == 0) {
            sb3.append(bVar.a(R.string.common_sec_abbrev_lbl, 0));
            sb4.append(bVar.a(R.string.lbl_plural_more_than_one_second, 0));
        }
        if (i17 > 1) {
            sb3.append(bVar.a(R.string.plural_num_hour_abbrebiation, Integer.valueOf(i17)).concat(StringUtils.SPACE));
            sb4.append(bVar.a(R.string.lbl_plural_more_than_one_hour, Integer.valueOf(i17)).concat(StringUtils.SPACE));
        } else if (i17 == 1) {
            sb3.append(bVar.a(R.string.singular_num_hour_abbreviation, Integer.valueOf(i17)).concat(StringUtils.SPACE));
            sb4.append(bVar.a(R.string.lbl_plural_one_hour, Integer.valueOf(i17)));
        }
        if (i16 > 0) {
            sb3.append(bVar.a(R.string.common_mins_lbl, Integer.valueOf(i16)).concat(StringUtils.SPACE));
            sb4.append(bVar.a(i16 > 1 ? R.string.lbl_plural_more_than_one_minute : R.string.lbl_plural_one_minute, Integer.valueOf(i16)).concat(StringUtils.SPACE));
        }
        if (i15 > 0) {
            sb3.append(bVar.a(R.string.common_sec_abbrev_lbl, Integer.valueOf(i15)));
            if (i15 <= 1) {
                i19 = R.string.lbl_plural_one_second;
            }
            sb4.append(bVar.a(i19, Integer.valueOf(i15)));
        }
        return new p<>(w.k0(sb3).toString(), sb4.toString());
    }

    public final String b(int i14) {
        int i15;
        int i16;
        int i17 = 0;
        if (i14 < 3600) {
            i16 = i14 / 60;
            i15 = 0;
        } else if (i14 < 86400) {
            i15 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
            i16 = (i14 % DateTimeConstants.SECONDS_PER_HOUR) / 60;
        } else {
            i17 = i14 / DateTimeConstants.SECONDS_PER_DAY;
            int i18 = i14 % DateTimeConstants.SECONDS_PER_DAY;
            i15 = i18 / DateTimeConstants.SECONDS_PER_HOUR;
            i16 = (i18 % DateTimeConstants.SECONDS_PER_HOUR) / 60;
        }
        StringBuilder sb3 = new StringBuilder(20);
        if (i17 > 0) {
            sb3.append(i17);
            sb3.append("d");
        }
        if (i15 > 0) {
            if (i17 > 0) {
                sb3.append(StringUtils.SPACE);
            }
            sb3.append(i15);
            sb3.append(this.f167336a.getString(R.string.sleep_my_day_hour_unit));
        }
        if (i16 > 0) {
            if (i17 > 0 || i15 > 0) {
                sb3.append(StringUtils.SPACE);
            }
            sb3.append(i16);
            sb3.append(g());
        }
        return hb.a.i(sb3.toString());
    }

    public final String c(int i14) {
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
        StringBuilder sb3 = new StringBuilder(15);
        if (i16 > 0) {
            sb3.append(i16);
            sb3.append(this.f167336a.getString(R.string.sleep_my_day_hour_unit));
        }
        if (i15 > 0) {
            if (i16 > 0) {
                sb3.append(StringUtils.SPACE);
            }
            sb3.append(i15);
            sb3.append(g());
        }
        return hb.a.i(sb3.toString());
    }

    public final String d(int i14) {
        if (i14 == 0) {
            return this.f167337b;
        }
        double d14 = i14;
        int i15 = R.string.lbl_time_unit_minute;
        l22.b bVar = this.f167336a;
        if (d14 < 3600.0d) {
            l3.f23124b.getClass();
            int i16 = (int) (d14 / 60.0d);
            if (i16 != 1) {
                i15 = R.string.lbl_time_unit_minutes;
            }
            return e.d(i16, StringUtils.SPACE, h(bVar.getString(i15)));
        }
        if (d14 % 3600.0d < 60.0d) {
            l3.f23124b.getClass();
            int i17 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
            return e.d(i17, StringUtils.SPACE, f(i17 != 1));
        }
        long j8 = i14;
        l3.f23124b.getClass();
        int i18 = ((int) j8) / DateTimeConstants.SECONDS_PER_HOUR;
        int iL1 = l3.a.L1(j8);
        String strF = f(i18 != 1);
        if (iL1 != 1) {
            i15 = R.string.lbl_time_unit_minutes;
        }
        String strH = h(bVar.getString(i15));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i18);
        sb3.append(StringUtils.SPACE);
        sb3.append(strF);
        sb3.append(StringUtils.SPACE);
        sb3.append(iL1);
        return j.o(StringUtils.SPACE, strH, sb3);
    }

    public final String e(int i14) {
        int i15 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
        int i16 = (i14 % DateTimeConstants.SECONDS_PER_HOUR) / 60;
        l22.b bVar = this.f167336a;
        if (i15 > 0) {
            return i16 > 0 ? bVar.a(R.string.lbl_hours_and_minutes, String.valueOf(i15), String.valueOf(i16)) : bVar.a(R.string.lbl_plural_more_than_one_hour, String.valueOf(i15));
        }
        return bVar.a(R.string.lbl_plural_more_than_one_minute, String.valueOf(i16));
    }

    public final String f(boolean z14) {
        return h(this.f167336a.getString(z14 ? R.string.lbl_hours : R.string.lbl_time_unit_an_hour));
    }

    public final String g() {
        return this.f167336a.getString(R.string.sleep_my_day_minute_unit);
    }

    /* JADX INFO: renamed from: u00.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lu00/a$a;", "", "<init>", "()V", "", "MINUTES_IN_HOUR", "I", "SECONDS_IN_MINUTES", "SECONDS_IN_HOUR", "formatter_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3146a {
        public /* synthetic */ C3146a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3146a() {
        }
    }
}
