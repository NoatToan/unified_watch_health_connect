package com.huawei.hwdevice.mainprocess.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.SyncMusicBinder;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.NegotiationData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IBaseCallback;
import defpackage.lyy;
import defpackage.lzl;
import defpackage.lzt;
import defpackage.lzu;
import defpackage.maa;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SyncMusicService extends Service {
    private SyncMusicBinder e = new SyncMusicBinder(this);

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        LogUtil.a("SyncMusicService", "OnCreate");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        LogUtil.a("SyncMusicService", "onStartCommand");
        if (intent == null) {
            stopSelf(i2);
            return 2;
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            LogUtil.a("SyncMusicService", "onStartCommand failed, action is null");
            stopSelf(i2);
            return 2;
        }
        lyy.b().e(maa.b().o());
        LogUtil.a("SyncMusicService", action);
        action.hashCode();
        if (action.equals("StartServiceFromHealthKit")) {
            LogUtil.a("SyncMusicService", "StartServiceFromHealthKit！");
            lzl.a(BaseApplication.getContext()).b(maa.b().g());
            stopSelf(i2);
        } else if (action.equals("syncMusicListTaskBegin")) {
            j();
            stopSelf(i2);
        } else {
            LogUtil.j("SyncMusicService", "unknown actions！");
            stopSelf(i2);
        }
        return 2;
    }

    @Override // android.app.Service
    public void onDestroy() {
        LogUtil.a("SyncMusicService", "onDestroy");
        maa.b().e();
        SyncMusicBinder syncMusicBinder = this.e;
        if (syncMusicBinder != null) {
            syncMusicBinder.setSyncMusicListener(null);
            this.e = null;
        }
        lyy.b().e((IBaseCallback) null);
        super.onDestroy();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String stringExtra;
        LogUtil.a("onBind", new Object[0]);
        if (intent == null) {
            stringExtra = "";
        } else {
            stringExtra = intent.getStringExtra("device_id");
        }
        maa.b().b(this.e, stringExtra);
        return this.e;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        LogUtil.a("onUnbind", new Object[0]);
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        LogUtil.a("onTaskRemoved", new Object[0]);
        maa.b().e();
        super.onTaskRemoved(intent);
    }

    public boolean f() {
        return maa.b().m();
    }

    public int b() {
        return maa.b().a();
    }

    public String d() {
        return maa.b().j();
    }

    public MusicSong a() {
        return maa.b().d();
    }

    public String c() {
        return maa.b().d().getSongName();
    }

    public List<MusicSong> h() {
        return maa.b().i();
    }

    public List<MusicSong> g() {
        return maa.b().f();
    }

    public void b(List<Integer> list) {
        lzt.d().a(list);
    }

    public void c(List<NegotiationData.TypeStruct> list) {
        lzt.d().d(list);
    }

    public void a(List<String> list) {
        lzt.d().c(list);
    }

    public void b(boolean z) {
        lzt.d().a(z);
    }

    public void e() {
        maa.b().c();
    }

    private void j() {
        LogUtil.a("SyncMusicService", "startSyncMusicTaskByAction enter");
        ArrayList<MusicSong> arrayListA = lzu.c().a();
        if (njy.e(arrayListA)) {
            LogUtil.a("SyncMusicService", "get mToBeTransferedMusicList empty");
            stopSelf();
        } else if (maa.b().h()) {
            LogUtil.a("SyncMusicService", "add more songs to Transferlist！");
            maa.b().c(arrayListA);
        } else {
            LogUtil.a("SyncMusicService", "dealNewTransferTask！");
            maa.b().a(arrayListA);
        }
    }
}
