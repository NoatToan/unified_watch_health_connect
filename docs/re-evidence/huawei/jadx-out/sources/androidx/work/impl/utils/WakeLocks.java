package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.Logger;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.yzc;
import defpackage.zcp;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001c\u0010\u0004\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"TAG", "", "checkWakeLocks", "", "newWakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", RemoteMessageConst.Notification.TAG, "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WakeLocks {
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WakeLocks");
        zcp.b((Object) strTagWithPrefix, "");
        TAG = strTagWithPrefix;
    }

    public static final PowerManager.WakeLock newWakeLock(Context context, String str) {
        zcp.c(context, "");
        zcp.c(str, "");
        Object systemService = context.getApplicationContext().getSystemService("power");
        zcp.e(systemService, "");
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, str2);
        synchronized (WakeLocksHolder.INSTANCE) {
            WakeLocksHolder.INSTANCE.getWakeLocks().put(wakeLockNewWakeLock, str2);
        }
        zcp.b((Object) wakeLockNewWakeLock, "");
        return wakeLockNewWakeLock;
    }

    public static final void checkWakeLocks() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (WakeLocksHolder.INSTANCE) {
            linkedHashMap.putAll(WakeLocksHolder.INSTANCE.getWakeLocks());
            yzc yzcVar = yzc.e;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                Logger.get().warning(TAG, "WakeLock held for " + str);
            }
        }
    }
}
