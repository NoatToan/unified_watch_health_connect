package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hms.kit.awareness.AwarenessStatusCodes;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class iwd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private StepRateData f38121a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f38123c;
    private boolean d;
    private long i = 0;
    private boolean e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38122b = false;
    private boolean f = false;
    private long j = System.currentTimeMillis();
    private int o = 0;
    private float h = 0.0f;
    private int n = 0;
    private int g = 0;

    public iwd(Context context, boolean z) {
        this.d = false;
        if (context == null) {
            throw new RuntimeException("AutoTrackManager init with null context.");
        }
        this.f38123c = context;
        this.d = z;
    }

    public void b(boolean z) {
        this.e = z;
    }

    public void a(boolean z) {
        this.f = z;
    }

    public boolean d(float f, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.j > TimeUnit.SECONDS.toMillis(30L)) {
            if (f - this.h > c()) {
                this.o = 0;
            } else {
                this.o++;
            }
            if (this.d) {
                if (i - this.g > 20) {
                    this.n = 0;
                } else {
                    this.n++;
                }
            }
            this.h = f;
            this.g = i;
            this.j = jCurrentTimeMillis;
            ReleaseLogUtil.d("Track_AutoTrackManager", "isStopAutoTrack(), distance: ", LogAnonymous.d((int) f), " mTimesForLostGps: ", Integer.valueOf(this.o), " Time: ", LogAnonymous.a(this.j), " mTimesForLowSteps: ", Integer.valueOf(this.n));
        }
        return this.o >= 4 || this.n >= 6;
    }

    private int c() {
        return ppt.a() ? 25 : 50;
    }

    public boolean e() {
        return this.f38122b;
    }

    public boolean d() {
        if (!this.f38122b) {
            LogUtil.a("Track_AutoTrackManager", "recoveryAutoTrackSnapshotInfo() mIsEndSnapshot is false,");
            return false;
        }
        if (this.i == 0) {
            LogUtil.a("Track_AutoTrackManager", "isNeedSaveAutoTrack(), mMotionTrackFileLine is 0");
            return false;
        }
        a();
        return true;
    }

    public void d(boolean z, long j, long j2, float f) {
        LogUtil.a("Track_AutoTrackManager", "sendNotification, toSaveData: ", Boolean.valueOf(z), " ; mIsEndSnapshot: ", Boolean.valueOf(this.f38122b));
        Context context = this.f38123c;
        if (context == null) {
            LogUtil.a("Track_AutoTrackManager", "sendNotification failed with null context.");
            return;
        }
        if (this.f38122b && z) {
            String strE = SharedPreferenceManager.e(context, Integer.toString(10000), "health_msg_switch_noticebar");
            LogUtil.a("Track_AutoTrackManager", "showNotification() noticeBarRecommend", strE);
            if ("0".equals(strE)) {
                return;
            }
            b(this.f38123c, j, j2, f);
        }
    }

    public void b() {
        LogUtil.a("Track_AutoTrackManager", "destroy()");
        i();
        this.f38123c = null;
        this.g = 0;
        this.h = 0.0f;
        this.o = 0;
        this.n = 0;
        this.j = 0L;
    }

    private void i() {
        LogUtil.a("Track_AutoTrackManager", "removeSnapshot");
        if (this.e || this.f38122b || this.i > 0) {
            this.e = false;
            this.f38122b = false;
            this.f = false;
            this.i = 0L;
            jaf.c(this.f38123c, "simplemotionbuffer.txt");
        }
    }

    private void a() {
        LogUtil.a("Track_AutoTrackManager", "recoveryAutoTrackSnapshotInfo start");
        if (this.f38123c == null) {
            LogUtil.a("Track_AutoTrackManager", "recoveryAutoTrackSnapshotInfo failed with null context.");
            return;
        }
        if (jaf.d(Long.valueOf(this.i), this.f38123c) && jaf.c(this.f38123c, "simplemotionbuffer.txt", "simplemotion.txt")) {
            iwy iwyVarA = iwy.a(this.f38123c);
            iwyVarA.q();
            iwyVarA.e(true);
            iwyVarA.a(this.f38121a);
            LogUtil.a("Track_AutoTrackManager", "recoveryAutoTrackSnapshotInfo success recoveryMotionPathFile:", Long.valueOf(this.i), " copySimpleFile: SIMPLE_MOTION_FILE_NAME_BUFFER");
        }
    }

    private void b(Context context, long j, long j2, float f) {
        String string;
        int i = (int) f;
        LogUtil.a("Track_AutoTrackManager", "createNotification() startTime: ", LogAnonymous.a(j), " ;endTime: ", LogAnonymous.a(j2), " ;totalSportDistance: ", LogAnonymous.d(i));
        Intent intentE = e(context, j, j2);
        if (intentE == null) {
            LogUtil.j("Track_AutoTrackManager", "Notification intent is null.");
            return;
        }
        if (j == 0 || j2 == 0 || f == 0.0f) {
            LogUtil.j("Track_AutoTrackManager", "startTime: ", LogAnonymous.a(j), " ;endTime: ", LogAnonymous.a(j2), " ;totalSportDistance: ", LogAnonymous.d(i));
            return;
        }
        PendingIntent service = PendingIntent.getService(context, 0, intentE, 201326592);
        if (UnitUtil.f()) {
            string = context.getResources().getString(R.string.IDS_hw_show_motiontrack_autotrack_finish, context.getResources().getString(R.string.IDS_hw_show_sport_kms_string_en, UnitUtil.e(f, 1, 2)));
        } else {
            string = context.getResources().getString(R.string.IDS_hw_show_motiontrack_autotrack_finish, context.getResources().getString(R.string.IDS_hw_show_sport_kms_string, UnitUtil.e(f, 1, 2)));
        }
        lsb.d().c(AwarenessStatusCodes.AWARENESS_LOCATION_PERMISSION_CODE, a(string, context.getString(context.getApplicationInfo().labelRes), string, service));
    }

    private Notification a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, PendingIntent pendingIntent) {
        Notification.Builder builderC = lsb.d().c();
        qrs.c(builderC);
        builderC.setTicker(charSequence);
        builderC.setContentTitle(charSequence2);
        builderC.setContentText(charSequence3);
        builderC.setContentIntent(pendingIntent);
        builderC.setAutoCancel(true);
        builderC.setOngoing(false);
        builderC.setOnlyAlertOnce(true);
        builderC.setPriority(0);
        builderC.setDefaults(2);
        return builderC.build();
    }

    private Intent e(Context context, long j, long j2) {
        Intent intent;
        try {
            intent = new Intent(context, Class.forName("com.huawei.health.receiver.MainProcessHelperService"));
            try {
                intent.putExtra("startTime", j);
                intent.putExtra("endTime", j2);
                intent.setAction("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.setFlags(268435456);
                return intent;
            } catch (ClassNotFoundException unused) {
                LogUtil.e("Track_AutoTrackManager", "getAutoTrackNotificationServiceIntent() AutoTrackNotificationService not found");
                return intent;
            }
        } catch (ClassNotFoundException unused2) {
            intent = null;
        }
    }
}
