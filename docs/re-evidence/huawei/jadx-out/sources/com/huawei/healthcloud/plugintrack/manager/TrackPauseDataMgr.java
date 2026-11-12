package com.huawei.healthcloud.plugintrack.manager;

import android.content.Context;
import com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener;
import com.huawei.hwfoundationmodel.trackmodel.TrackPauseData;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class TrackPauseDataMgr implements ISportStateChangeListener {
    private final ArrayList<TrackPauseData> d = new ArrayList<>(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<TrackPauseData> f10466c = new ArrayList<>(10);

    public TrackPauseDataMgr(Context context) {
        if (context == null) {
            ReleaseLogUtil.d("Track_TrackPauseDataMgr", "new TrackPauseDataMgr system error with null context");
        } else {
            LogUtil.a("Track_TrackPauseDataMgr", "new TrackPauseDataMgr");
        }
    }

    public void c() {
        LogUtil.a("Track_TrackPauseDataMgr", "startAltitudeMgr");
        this.d.clear();
    }

    public void b() {
        LogUtil.a("Track_TrackPauseDataMgr", "stopPauseDataMgr mPauseDataList", Integer.valueOf(this.d.size()));
        this.d.clear();
    }

    public void b(List<TrackPauseData> list) {
        ReleaseLogUtil.d("Track_TrackPauseDataMgr", "recoveryPauseDataList");
        this.d.clear();
        this.f10466c.clear();
        if (njy.e(list)) {
            return;
        }
        this.d.addAll(list);
        ReleaseLogUtil.d("Track_TrackPauseDataMgr", "recovery PauseDataList size", Integer.valueOf(list.size()));
    }

    public ArrayList<TrackPauseData> c(boolean z) {
        ArrayList<TrackPauseData> arrayList = new ArrayList<>(this.f10466c.size());
        if (!this.f10466c.isEmpty()) {
            arrayList.addAll(this.f10466c);
            if (z) {
                this.f10466c.clear();
            }
        }
        return arrayList;
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener, com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        LogUtil.a("Track_TrackPauseDataMgr", "onStartSport");
        e(TrackPauseData.Type.RESUME);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener, com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        LogUtil.a("Track_TrackPauseDataMgr", "onPauseSport");
        e(TrackPauseData.Type.PAUSE);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener, com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        LogUtil.a("Track_TrackPauseDataMgr", "onResumeSport");
        e(TrackPauseData.Type.RESUME);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener, com.huawei.health.sportservice.SportLifecycle
    public void onStopSport() {
        LogUtil.a("Track_TrackPauseDataMgr", "onStopSport");
        e(TrackPauseData.Type.END);
    }

    private void e(TrackPauseData.Type type) {
        this.d.add(new TrackPauseData(System.currentTimeMillis(), 0, type.getValue()));
        this.f10466c.add(new TrackPauseData(System.currentTimeMillis(), 0, type.getValue()));
    }
}
