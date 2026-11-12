package defpackage;

import android.content.Context;
import android.content.Intent;
import com.huawei.basichealthmodel.service.SyncService;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes23.dex */
public class bys {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile bys f1324c;
    private Timer d = new Timer("HL_SyncManager");
    private Context e;

    private bys() {
        a();
        this.e = BaseApplication.getContext();
    }

    public static bys c() {
        bys bysVar;
        if (f1324c == null) {
            synchronized (bys.class) {
                if (f1324c == null) {
                    f1324c = new bys();
                }
                bysVar = f1324c;
            }
            return bysVar;
        }
        return f1324c;
    }

    private void a() {
        this.d.schedule(new TimerTask() { // from class: bys.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                boolean zAg = cbg.ag();
                LogUtil.a("HL_SyncManager", "startTimer isSupportStartService ", Boolean.valueOf(zAg));
                if (zAg) {
                    try {
                        Intent intent = new Intent(bys.this.e, (Class<?>) SyncService.class);
                        intent.putExtra("sync_type", 1);
                        intent.putExtra("sync_user_id", cbg.q());
                        bys.this.e.startService(intent);
                    } catch (IllegalStateException | SecurityException e) {
                        LogUtil.e("HL_SyncManager", "startTimer exception ", LogAnonymous.b(e));
                    }
                }
            }
        }, 3600000L, 3600000L);
    }

    public void b(String str, int i, int i2, int i3) {
        boolean zAe = cbg.ae();
        boolean zAg = cbg.ag();
        LogUtil.a("HL_SyncManager", "startSync isUseNewHealthModel ", Boolean.valueOf(zAe), " isSupportStartService ", Boolean.valueOf(zAg), " type ", Integer.valueOf(i3), " startTime ", Integer.valueOf(i), " endTime ", Integer.valueOf(i2));
        if (zAe || (!zAg)) {
            return;
        }
        try {
            Intent intent = new Intent(this.e, (Class<?>) SyncService.class);
            intent.putExtra("sync_starttime", i);
            intent.putExtra("sync_endtime", i2);
            intent.putExtra("sync_type", i3);
            intent.putExtra("sync_user_id", str);
            this.e.startService(intent);
        } catch (IllegalStateException | SecurityException e) {
            LogUtil.e("HL_SyncManager", "startSync exception ", LogAnonymous.b(e));
        }
    }
}
