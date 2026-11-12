package defpackage;

import android.location.Location;
import androidx.media3.common.C;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.healthcloud.plugintrack.manager.inteface.ITrackStrategy;
import com.huawei.hwlocationmgr.model.ILoactionCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes10.dex */
public class iza implements ITrackStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Queue<Float> f38236c = new LinkedList();
    private boolean e;

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ITrackStrategy
    public void dispatchPhoneCurrentState(int i) {
    }

    public iza() {
        LogUtil.a("Track_BikeAutoPauseResumeStrategy", "BikeAutoPauseResumeStrategy");
        HandlerCenter.a().d(new Runnable() { // from class: izc
            @Override // java.lang.Runnable
            public final void run() {
                this.f38240a.b();
            }
        }, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
        npg.d().a(new ILoactionCallback() { // from class: izj
            @Override // com.huawei.hwlocationmgr.model.ILoactionCallback
            public final void dispatchLocationChanged(Location location) {
                this.f38251c.c(location);
            }
        }, "Track_BikeAutoPauseResumeStrategy");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f38235b = true;
        ReleaseLogUtil.d("Track_BikeAutoPauseResumeStrategy", "BikeAutoPauseResumeStrategy mIsStartStrategy");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Location location) {
        if (location == null || !location.hasSpeed() || "network".equals(location.getProvider())) {
            return;
        }
        d(location.getSpeed());
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ITrackStrategy
    public void start() {
        ReleaseLogUtil.d("Track_BikeAutoPauseResumeStrategy", "start BikeAutoPauseResumeStrategy");
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ITrackStrategy
    public void stop() {
        ReleaseLogUtil.d("Track_BikeAutoPauseResumeStrategy", "stop BikeAutoPauseResumeStrategy");
        npg.d().c("Track_BikeAutoPauseResumeStrategy");
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ITrackStrategy
    public void notifyUserOperateSportState(int i) {
        if (i == 1) {
            this.f38236c.clear();
            this.f38234a = false;
            this.e = false;
            ReleaseLogUtil.d("Track_BikeAutoPauseResumeStrategy", "IS SPORT_STATUS_SPORTING");
            return;
        }
        if (i != 2) {
            if (i != 5) {
                return;
            }
            ReleaseLogUtil.d("Track_BikeAutoPauseResumeStrategy", "notifyUserOperateSportState is SPORT_STATUS_STOP_END");
            return;
        }
        ReleaseLogUtil.d("Track_BikeAutoPauseResumeStrategy", "IS SPORT_STATUS_PAUSE start： ", Integer.valueOf(i), ", mIsPauseByAuto: ", Boolean.valueOf(this.e), ", mIsPauseByUser: ", Boolean.valueOf(this.f38234a));
        this.f38236c.clear();
        if (!this.e) {
            this.f38234a = true;
            ReleaseLogUtil.d("Track_BikeAutoPauseResumeStrategy", "IS mIsPauseByUser");
        } else {
            this.f38234a = false;
            ReleaseLogUtil.d("Track_BikeAutoPauseResumeStrategy", "IS mIsPauseByAuto");
        }
        ReleaseLogUtil.d("Track_BikeAutoPauseResumeStrategy", "IS SPORT_STATUS_PAUSE end： ", Integer.valueOf(i), ", mIsPauseByAuto: ", Boolean.valueOf(this.e), ", mIsPauseByUser: ", Boolean.valueOf(this.f38234a));
    }

    public void d(float f) {
        if (this.f38235b) {
            if (this.f38236c.size() >= 4) {
                this.f38236c.poll();
            }
            this.f38236c.offer(Float.valueOf(f));
            if (this.f38236c.size() != 4) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f38236c);
            if (b(arrayList, 2, 2.3611112f)) {
                LogUtil.a("Track_BikeAutoPauseResumeStrategy", "auto resume by 1: ", arrayList);
                c();
                return;
            }
            if (b(arrayList, 3, 2.0833335f)) {
                LogUtil.a("Track_BikeAutoPauseResumeStrategy", "auto resume by 2: ", arrayList);
                c();
                return;
            }
            if (b(arrayList, 4, 1.8055556f)) {
                LogUtil.a("Track_BikeAutoPauseResumeStrategy", "auto resume by 3: ", arrayList);
                c();
            } else if (a(arrayList)) {
                LogUtil.a("Track_BikeAutoPauseResumeStrategy", "auto resume by 4: ", arrayList);
                c();
            } else if (e(arrayList)) {
                LogUtil.a("Track_BikeAutoPauseResumeStrategy", "auto auto by : ", arrayList);
                e();
            }
        }
    }

    private void e() {
        LogUtil.a("Track_BikeAutoPauseResumeStrategy", "autoPauseSport enter, mIsPauseByAuto: ", Boolean.valueOf(this.e), ", mIsPauseByUser: ", Boolean.valueOf(this.f38234a));
        if (this.f38234a || ive.c().g() != 1) {
            return;
        }
        ReleaseLogUtil.d("Track_BikeAutoPauseResumeStrategy", "autoPauseSport go");
        this.e = true;
        ive.c().v();
    }

    private void c() {
        LogUtil.a("Track_BikeAutoPauseResumeStrategy", "autoResumeSport enter, mIsPauseByAuto: ", Boolean.valueOf(this.e), ", mIsPauseByUser: ", Boolean.valueOf(this.f38234a));
        if (this.e && ive.c().g() == 2) {
            ReleaseLogUtil.d("Track_BikeAutoPauseResumeStrategy", "autoResumeSport go ");
            this.f38234a = false;
            this.e = false;
            ive.c().y();
        }
    }

    private static boolean b(List<Float> list, int i, float f) {
        for (int i2 = 0; i2 <= 4 - i; i2++) {
            int i3 = i2;
            while (true) {
                int i4 = (i - 1) + i2;
                if (i3 < i4) {
                    int i5 = i3 + 1;
                    if (njy.c(list, i5) && list.get(i3) != null && list.get(i5) != null && list.get(i3).floatValue() >= list.get(i5).floatValue()) {
                        break;
                    }
                    i3 = i5;
                } else {
                    if (!njy.c(list, i4) || list.get(i4) == null || list.get(i4).floatValue() < f) {
                        break;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(List<Float> list) {
        for (int i = 0; i <= 1; i++) {
            int i2 = 0;
            for (int i3 = i; i3 <= i + 2; i3++) {
                if (njy.c(list, i3) && list.get(i3) != null && list.get(i3).floatValue() > 1.6666667f) {
                    i2++;
                }
            }
            if (i2 >= 3) {
                return true;
            }
        }
        return false;
    }

    private static boolean e(List<Float> list) {
        int i = 0;
        while (i <= 2) {
            int i2 = i + 1;
            if (njy.c(list, i2) && list.get(i) != null && list.get(i2) != null && list.get(i).floatValue() < 0.5555556f && list.get(i2).floatValue() < 0.5555556f) {
                return true;
            }
            i = i2;
        }
        return false;
    }
}
