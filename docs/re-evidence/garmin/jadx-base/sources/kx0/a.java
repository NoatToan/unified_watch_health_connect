package kx0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkx0/a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a {
    ON_START,
    DAILY,
    WEEKLY;

    /* JADX INFO: renamed from: kx0.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C2064a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f107036a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.DAILY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.WEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f107036a = iArr;
        }
    }

    public final String a(Context context) {
        int i14 = C2064a.f107036a[ordinal()];
        if (i14 == 1) {
            String string = context.getString(R.string.mct_frequency_period_start);
            string.getClass();
            return string;
        }
        if (i14 == 2) {
            String string2 = context.getString(R.string.device_settings_frequency_daily);
            string2.getClass();
            return string2;
        }
        if (i14 != 3) {
            u0.r();
            return null;
        }
        String string3 = context.getString(R.string.common_weekly);
        string3.getClass();
        return string3;
    }
}
