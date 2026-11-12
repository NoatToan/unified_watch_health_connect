package cw;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static l f55933c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55935b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55936a;

        static {
            int[] iArr = new int[al2.b.values().length];
            f55936a = iArr;
            try {
                iArr[al2.b.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55936a[al2.b.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55936a[al2.b.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private l() {
        if (GCMSettingManager.f41536b.getLong(GCMSettingManager.f41535a.getString(R.string.key_feedback_ready_timestamp), 0L) == 0) {
            GCMSettingManager.f41536b.edit().putLong(GCMSettingManager.f41535a.getString(R.string.key_feedback_ready_timestamp), DateTime.now().getMillis() + 432000000).apply();
        }
    }

    public static void a() {
        Bundle bundleD = b71.i.d("DismissType", "AskMeLater");
        ht.a.f85464a.getClass();
        ht.a.a(bundleD, "FeedbackLoop");
        b().getClass();
        com.airbnb.lottie.animation.keyframe.a.p(GCMSettingManager.f41535a, R.string.key_feedback_syncs_successful, GCMSettingManager.f41536b.edit(), 0);
        GCMSettingManager.f41536b.edit().putInt(GCMSettingManager.f41535a.getString(R.string.key_feedback_count), 0).apply();
        b().getClass();
        GCMSettingManager.f41536b.edit().putLong(GCMSettingManager.f41535a.getString(R.string.key_feedback_ready_timestamp), DateTime.now().getMillis() + 86400000).apply();
    }

    public static l b() {
        if (f55933c == null) {
            f55933c = new l();
        }
        return f55933c;
    }

    public static void c() {
        com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_feedback_shown, GCMSettingManager.f41536b.edit(), true);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0055  */
    public static boolean d() {
        if (!GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_feedback_shown), false) && DateTime.now().getMillis() > GCMSettingManager.f41536b.getLong(GCMSettingManager.f41535a.getString(R.string.key_feedback_ready_timestamp), 0L)) {
            long j8 = GCMSettingManager.f41536b.getLong(GCMSettingManager.f41535a.getString(R.string.key_feedback_last_crash_timestamp), 0L);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (j8 != 0) {
                long j14 = jCurrentTimeMillis - j8;
                if (j14 > 0 && j14 / 86400000 > 5) {
                    if (GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_feedback_count), 0) < 5 && GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_feedback_syncs_successful), 0) >= 5) {
                        return true;
                    }
                }
            } else if (GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_feedback_count), 0) < 5) {
            }
        }
        return false;
    }
}
