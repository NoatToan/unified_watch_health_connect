package com.huami.watch.companion.sync;

import android.content.Context;
import com.huami.watch.companion.R;
import com.huami.watch.companion.cloud.httpsupport.WearHttpSupportInterface;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.transport.httpsupport.StageFright.ProcessStateMonitor;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.huami.watch.util.TimeUtil;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public class SyncSportHealthHelper extends BaseSyncHelper {
    public static final String PKG_OF_HEALTH = "com.huami.watch.health";
    public static final String PKG_OF_NEW_SPORT = "com.huami.watch.newsport";
    public static final String PKG_OF_SPORT = "com.huami.watch.sport";
    private static final String i = "SyncHelper-SportHealth";
    private static final int j = 30;
    private static final int k = 120;
    private int e;
    private String f;
    private volatile SyncListener g;
    private Disposable h;

    public interface SyncListener {
        void onSyncFinish(int i, boolean z);

        void onSyncStart(int i);

        void onSyncing(int i, int i2, int i3, int i4, String str);
    }

    public class a implements Consumer<Integer> {
        public a() {
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(@NonNull Integer num) throws Exception {
            Log.w(SyncSportHealthHelper.i, "Sync : " + num + ", Timeout!!", new Object[0]);
            SyncSportHealthHelper.this.h(num.intValue(), false);
        }
    }

    public class b implements ProcessStateMonitor.Jack {
        private String a;

        private b(String str) {
            this.a = str;
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.ProcessStateMonitor.Jack
        public void onFinish(int i, boolean z, long j) {
            int iL = SyncSportHealthHelper.l(targetAtPackage());
            SyncSportHealthHelper.this.m();
            SyncSportHealthHelper.this.i(iL, i == 0, z, j);
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.ProcessStateMonitor.Jack
        public void onUpdate(int i, int i2, int i3) {
            int iL = SyncSportHealthHelper.l(targetAtPackage());
            SyncSportHealthHelper.this.g(iL);
            SyncSportHealthHelper.this.k(iL, i, i2, i3);
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.ProcessStateMonitor.Jack
        public String targetAtAction() {
            return "*";
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.ProcessStateMonitor.Jack
        public String targetAtPackage() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i2) {
        m();
        this.h = Rx.delayMainThread(Integer.valueOf(i2), new a(), 30L, TimeUnit.SECONDS);
    }

    public static SyncSportHealthHelper getHelper(Context context) {
        return (SyncSportHealthHelper) BaseSyncHelper.getHelper(context, null, SyncSportHealthHelper.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i2, boolean z) {
        i(i2, z, false, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int i2, boolean z, boolean z2, long j2) {
        Log.d(i, "OnSyncFinish : " + this.f + ", " + i2, new Object[0]);
        if (z) {
            Log.d(i, "OnSyncFinish Success : " + this.f + ", HasNewData : " + z2 + ", " + TimeUtil.formatDateTime(j2), new Object[0]);
            if (i2 == 1) {
                long lastSportDataSyncTime = Box.getLastSportDataSyncTime();
                if (z2 || lastSportDataSyncTime <= 0) {
                    Box.putSportDataSyncTime(j2);
                }
            } else if (i2 == 2) {
                long lastHealthDataSyncTime = Box.getLastHealthDataSyncTime();
                if (z2 || lastHealthDataSyncTime <= 0) {
                    Box.putHealthDataSyncTime(j2);
                }
            }
        }
        this.a = false;
        this.b = z;
        try {
            if (this.g != null) {
                this.g.onSyncFinish(i2, this.b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void j(int i2) {
        Log.d(i, "OnSyncStart : " + this.f + ", " + i2, new Object[0]);
        try {
            if (this.g != null) {
                this.g.onSyncStart(i2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i2, int i3, int i4, int i5) {
        String string;
        if (i3 == 1) {
            string = this.mContext.getString(R.string.sync_sporthealth_data_update_watch, Integer.valueOf(i5), Integer.valueOf(i4));
        } else if (i3 == 2 || i3 == 3) {
            string = this.mContext.getString(R.string.sync_sporthealth_data_upload_cloud, Integer.valueOf(i5), Integer.valueOf(i4));
        } else if (i3 != 4) {
            string = i3 != 5 ? "" : this.mContext.getString(R.string.sync_data_ing);
        } else {
            string = this.mContext.getString(R.string.sync_sporthealth_data_update_watch, Integer.valueOf(i5), Integer.valueOf(i4));
        }
        String str = string;
        Log.d(i, "OnSyncingData : " + this.f + ", " + i2 + ", State : " + i3 + ", Desc : " + str, new Object[0]);
        try {
            if (this.g != null) {
                this.g.onSyncing(i2, i3, i4, i5, str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(String str) {
        if ("com.huami.watch.sport".equals(str) || "com.huami.watch.newsport".equals(str)) {
            return 1;
        }
        return "com.huami.watch.health".equals(str) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        Disposable disposable = this.h;
        if (disposable != null) {
            disposable.dispose();
            this.h = null;
        }
    }

    private static String n(Context context, int i2) {
        if (i2 == 1) {
            return DeviceUtil.isRomWOS2(context) ? "com.huami.watch.newsport" : "com.huami.watch.sport";
        }
        if (i2 == 2) {
            return "com.huami.watch.health";
        }
        return null;
    }

    public void clearListener() {
        this.g = null;
    }

    public SyncSportHealthHelper listen(SyncListener syncListener) {
        this.g = syncListener;
        return this;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public void onRelease() {
        super.onRelease();
        this.e = 0;
        clearListener();
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public boolean onStart() {
        j(this.e);
        g(this.e);
        WearHttpSupportInterface.startNewSyncAndMonitor(this.mContext, new b(this.f));
        boolean zDoSync = doSync(1000, 120);
        m();
        clearListener();
        return zDoSync;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public String tag() {
        return i;
    }

    public SyncSportHealthHelper type(int i2) {
        this.e = i2;
        this.f = n(this.mContext, i2);
        return this;
    }
}
