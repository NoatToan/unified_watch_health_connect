package mn;

import am.x0;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import d53.u;
import l22.b;
import lc.u0;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmn/a;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f119688a;

    /* JADX INFO: renamed from: mn.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C2274a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f119689a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.f4309n1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.f4322q2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.f4326r2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.C2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f119689a = iArr;
        }
    }

    public a(b bVar) {
        bVar.getClass();
        this.f119688a = bVar;
    }

    public static String b(int i14, x0 x0Var, Context context) {
        String string;
        x0Var.getClass();
        int i15 = C2274a.f119689a[x0Var.ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 != 3) {
                    if (i15 != 4) {
                        string = "";
                    } else if (i14 == 1) {
                        string = context.getString(R.string.golf_course_num_round_label);
                        string.getClass();
                    } else {
                        string = context.getString(R.string.golf_course_num_rounds_label, Integer.valueOf(i14));
                        string.getClass();
                    }
                } else if (i14 == 1) {
                    string = context.getString(R.string.lbl_one_move);
                    string.getClass();
                } else {
                    string = context.getString(R.string.lbl_moves, Integer.valueOf(i14));
                    string.getClass();
                }
            } else if (i14 == 1) {
                string = context.getString(R.string.lbl_pose_count_singular, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                string.getClass();
            } else {
                string = context.getString(R.string.lbl_poses_count, Integer.valueOf(i14));
                string.getClass();
            }
        } else if (i14 == 1) {
            string = context.getString(R.string.lbl_set_count, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            string.getClass();
        } else {
            string = context.getString(R.string.lbl_sets, String.valueOf(i14));
            string.getClass();
        }
        if (i14 != 0) {
            return string;
        }
        String string2 = context.getString(R.string.no_value);
        string2.getClass();
        return u.v(string, "0", string2, false);
    }

    public static String c(Context context, double d14, String str) {
        return (d14 <= 0.0d || Double.isNaN(d14)) ? u0.j(context.getString(R.string.string_space_string_pattern, str, context.getString(R.string.lbl_rowing_strokes))) : context.getString(R.string.lbl_rowing_strokes_value, Long.valueOf(Math.round(d14)));
    }

    public final String a(String str) {
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return this.f119688a.getString(R.string.txt_untitle);
    }

    public final String d(long j8) {
        b bVar = this.f119688a;
        if (j8 <= 0) {
            return bVar.getString(R.string.no_value_card);
        }
        long j14 = j8 / ((long) DateTimeConstants.MILLIS_PER_HOUR);
        long j15 = 1000;
        long j16 = j8 - ((j14 * j15) * ((long) DateTimeConstants.SECONDS_PER_HOUR));
        long j17 = j16 / ((long) DateTimeConstants.MILLIS_PER_MINUTE);
        long j18 = (j16 - ((j17 * j15) * ((long) 60))) / j15;
        long jRound = Math.round((j8 % j15) / 10.0f);
        return j14 == 0 ? bVar.a(R.string.race_lap_time_format_to_hundredths, Long.valueOf(j17), Long.valueOf(j18), Long.valueOf(jRound)) : bVar.a(R.string.race_lap_time_format_to_hundredths_with_hour, Long.valueOf(j14), Long.valueOf(j17), Long.valueOf(j18), Long.valueOf(jRound));
    }
}
