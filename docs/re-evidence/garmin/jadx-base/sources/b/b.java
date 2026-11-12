package b;

import android.app.Notification;
import android.companion.ObservingDevicePresenceRequest;
import android.health.connect.datatypes.ActivityIntensityRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.MindfulnessSessionRecord;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b {
    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ Notification.ProgressStyle d() {
        return new Notification.ProgressStyle();
    }

    public static /* synthetic */ ObservingDevicePresenceRequest.Builder e() {
        return new ObservingDevicePresenceRequest.Builder();
    }

    public static /* synthetic */ ActivityIntensityRecord.Builder i(Metadata metadata, Instant instant, Instant instant2, int i14) {
        return new ActivityIntensityRecord.Builder(metadata, instant, instant2, i14);
    }

    public static /* synthetic */ MindfulnessSessionRecord.Builder k(Metadata metadata, Instant instant, Instant instant2, int i14) {
        return new MindfulnessSessionRecord.Builder(metadata, instant, instant2, i14);
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return MindfulnessSessionRecord.class;
    }

    public static /* synthetic */ void n() {
    }

    public static /* bridge */ /* synthetic */ Class t() {
        return ActivityIntensityRecord.class;
    }

    public static /* synthetic */ void u() {
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return Notification.ProgressStyle.class;
    }
}
