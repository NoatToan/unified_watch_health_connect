package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.activity.notification.data.StorageType;
import com.huawei.ui.device.activity.notification.data.storage.NotificationStorage;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class qxr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<StorageType, NotificationStorage> f46937c = new HashMap();
    private static final Object e = new Object();

    public static NotificationStorage b(StorageType storageType) {
        synchronized (e) {
            a();
            Map<StorageType, NotificationStorage> map = f46937c;
            if (map.get(storageType) != null) {
                return map.get(storageType);
            }
            LogUtil.a("StorageStrategyFactory", storageType);
            return new qyc();
        }
    }

    private static void a() {
        Map<StorageType, NotificationStorage> map = f46937c;
        if (njy.e(map)) {
            map.put(StorageType.LOCAL, new qye());
            map.put(StorageType.DATA_PLATFORM, new qxs());
            map.put(StorageType.DATABASE, new qya());
            map.put(StorageType.DEVICE, new qyb());
            map.put(StorageType.SYSTEM, new qyd());
        }
    }

    public static void d() {
        synchronized (e) {
            f46937c.clear();
        }
    }
}
