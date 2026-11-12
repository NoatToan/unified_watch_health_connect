package com.huawei.healthcloud.plugintrack.open;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class TrackService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TrackDataRemoteProxy f10556a = null;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        LogUtil.a("Track_TrackService", "onCreate");
        this.f10556a = new TrackDataRemoteProxy(this);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        LogUtil.a("Track_TrackService", "TrackService onStartCommand");
        super.onStartCommand(intent, i, i2);
        return 2;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f10556a;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("Track_TrackService", "TrackService onDestroy");
        this.f10556a.onServiceDestroy();
        this.f10556a = null;
    }
}
