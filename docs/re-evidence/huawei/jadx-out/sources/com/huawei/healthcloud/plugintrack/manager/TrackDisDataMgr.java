package com.huawei.healthcloud.plugintrack.manager;

import android.content.Context;
import com.huawei.hwfoundationmodel.trackmodel.TrackDistanceData;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class TrackDisDataMgr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<TrackDistanceData> f10465b = new ArrayList<>(10);
    private final ArrayList<TrackDistanceData> e = new ArrayList<>(10);

    public TrackDisDataMgr(Context context) {
        if (context == null) {
            ReleaseLogUtil.d("Track_TrackDisDataMgr", "new TrackDisDataMgr system error with null context");
        } else {
            LogUtil.a("Track_TrackDisDataMgr", "new TrackDisDataMgr");
        }
    }

    public void d() {
        LogUtil.a("Track_TrackDisDataMgr", "startDisDataMgr");
        this.f10465b.clear();
    }

    public void b() {
        LogUtil.a("Track_TrackDisDataMgr", "stopDisDataMgr mDisDataList", Integer.valueOf(this.f10465b.size()));
        this.f10465b.clear();
    }

    public void d(long j, int i) {
        double d = j / 1000.0d;
        float f = i;
        this.f10465b.add(new TrackDistanceData((int) Math.round(d), f));
        this.e.add(new TrackDistanceData((int) Math.round(d), f));
    }

    public void d(List<TrackDistanceData> list) {
        ReleaseLogUtil.d("Track_TrackDisDataMgr", "recoveryDisDataList");
        this.f10465b.clear();
        this.e.clear();
        if (njy.e(list)) {
            return;
        }
        this.f10465b.addAll(list);
        ReleaseLogUtil.d("Track_TrackDisDataMgr", "recovery DisDataList size", Integer.valueOf(list.size()));
    }

    public ArrayList<TrackDistanceData> a(boolean z) {
        ArrayList<TrackDistanceData> arrayList = new ArrayList<>(this.e.size());
        if (!this.e.isEmpty()) {
            arrayList.addAll(this.e);
            if (z) {
                this.e.clear();
            }
        }
        return arrayList;
    }
}
