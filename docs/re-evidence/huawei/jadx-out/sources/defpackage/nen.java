package defpackage;

import com.huawei.haf.common.base.BaseNotification;

/* JADX INFO: loaded from: classes11.dex */
final class nen extends BaseNotification {
    private static volatile nen d;

    private nen() {
    }

    static nen d() {
        if (d == null) {
            synchronized (nen.class) {
                if (d == null) {
                    nen nenVar = new nen();
                    nenVar.e("device_connect_id", e("IDS_hw_app_name", "IDS_app_name_health"), 3);
                    d = nenVar;
                }
            }
        }
        return d;
    }
}
