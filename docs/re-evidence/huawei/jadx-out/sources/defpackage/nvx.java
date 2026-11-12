package defpackage;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes11.dex */
public class nvx {
    public static void b(int i) {
        try {
            LogUtil.a("DataSyncCycleUtil", "initDataSyncCycle type:", Integer.valueOf(i));
            Class<?> cls = Class.forName("com.huawei.health.receiver.DataSyncActivityCycle");
            cls.getDeclaredMethod("registerDataSyncReceiver", Integer.TYPE).invoke(cls.newInstance(), Integer.valueOf(i));
        } catch (ClassNotFoundException unused) {
            LogUtil.e("DataSyncCycleUtil", "initDataSyncCycle ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            LogUtil.e("DataSyncCycleUtil", "initDataSyncCycle IllegalAccessException");
        } catch (InstantiationException unused3) {
            LogUtil.e("DataSyncCycleUtil", "initDataSyncCycle InstantiationException");
        } catch (NoSuchMethodException unused4) {
            LogUtil.e("DataSyncCycleUtil", "initDataSyncCycle NoSuchMethodException");
        } catch (InvocationTargetException unused5) {
            LogUtil.e("DataSyncCycleUtil", "initDataSyncCycle InvocationTargetException");
        }
    }

    public static void d(BroadcastReceiver broadcastReceiver) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.DataSyncActivityCycle.Sleep");
        LocalBroadcastManager.getInstance().registerReceiver(broadcastReceiver, intentFilter);
    }

    public static void a(BroadcastReceiver broadcastReceiver) {
        LocalBroadcastManager.getInstance().unregisterReceiver(broadcastReceiver);
    }

    public static void d() {
        BaseApplication.getContext().sendBroadcast(new Intent("com.huawei.health.DataSyncActivityCycle.Exercise"), LocalBroadcast.f36595c);
    }

    public static void b(BroadcastReceiver broadcastReceiver) {
        BroadcastManagerUtil.c(BaseApplication.getContext(), broadcastReceiver, new IntentFilter("com.huawei.health.DataSyncActivityCycle.Exercise"), LocalBroadcast.f36595c, null);
    }

    public static void c(BroadcastReceiver broadcastReceiver) {
        BaseApplication.getContext().unregisterReceiver(broadcastReceiver);
    }
}
