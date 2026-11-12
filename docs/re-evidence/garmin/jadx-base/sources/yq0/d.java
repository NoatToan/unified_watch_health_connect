package yq0;

import android.content.Context;
import c22.l3;
import c22.m3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyq0/d;", "", "<init>", "()V", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f198741a;

        static {
            int[] iArr = new int[mq0.a.values().length];
            try {
                iArr[mq0.a.HOUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mq0.a.MINUTES_PER_KILOMETER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mq0.a.MINUTES_PER_MILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mq0.a.MINUTES_PER_100_YARDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[mq0.a.MINUTES_PER_100_METERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[mq0.a.MILES_PER_HOUR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[mq0.a.KILOMETERS_PER_HOUR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[mq0.a.MILE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[mq0.a.KILOMETER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[mq0.a.METER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[mq0.a.YARD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[mq0.a.WATT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[mq0.a.MINUTE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f198741a = iArr;
        }
    }

    public static String a(Context context, tq0.b bVar) {
        context.getClass();
        if (bVar == null) {
            return null;
        }
        String str = bVar.f166042c;
        String str2 = bVar.f166041b;
        if (str2 == null || str2.length() == 0 || str2.equals("NONE")) {
            return str;
        }
        mq0.a.f120195b.getClass();
        mq0.a aVarA = mq0.a.C2281a.a(str2);
        String string = "";
        switch (aVarA == null ? -1 : a.f198741a[aVarA.ordinal()]) {
            case 1:
                string = context.getString(R.string.lbl_hours);
                string.getClass();
                if (string.length() > 1) {
                    string = sn.a.g(string.substring(0, 1)).concat(string.substring(1));
                }
                break;
            case 2:
                l3.f23124b.getClass();
                string = u.v(new l22.a(context).getString(l3.a.N1(true)), ".", "", false);
                break;
            case 3:
                l3.f23124b.getClass();
                string = u.v(new l22.a(context).getString(l3.a.N1(false)), ".", "", false);
                break;
            case 4:
                string = context.getString(R.string.lbl_minute_100_yards);
                string.getClass();
                break;
            case 5:
                string = context.getString(R.string.lbl_minute_100_meters);
                string.getClass();
                break;
            case 6:
                string = context.getString(q3.MILE_PER_HOUR.f23223e);
                string.getClass();
                break;
            case 7:
                string = context.getString(q3.KILOMETER_PER_HOUR.f23223e);
                string.getClass();
                break;
            case 8:
                string = context.getString(m3.MILE.f23164e);
                string.getClass();
                break;
            case 9:
                string = context.getString(m3.KILOMETER.f23164e);
                string.getClass();
                break;
            case 10:
                string = context.getString(m3.METER.f23164e);
                string.getClass();
                break;
            case 11:
                string = context.getString(m3.YARD.f23164e);
                string.getClass();
                break;
            case 12:
                string = context.getString(R.string.lbl_watts);
                string.getClass();
                break;
            case 13:
                string = context.getString(R.string.lbl_minute);
                string.getClass();
                break;
        }
        return context.getString(R.string.string_string_bracket_pattern, str, string);
    }
}
