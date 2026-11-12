package com.huawei.hms.network.embedded;

import android.os.Build;
import java.net.InetSocketAddress;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes34.dex */
public class r8 {
    public static s8 a(CopyOnWriteArrayList<InetSocketAddress> copyOnWriteArrayList, int i, int i2, int i3) {
        int iA = a();
        String property = System.getProperty("openConcurrent");
        boolean z = property == null || !property.trim().equalsIgnoreCase("false");
        if ((iA < 29 || !z) && iA < 30) {
            return new s8(copyOnWriteArrayList, i, i2, i3);
        }
        return new q8(copyOnWriteArrayList, i, i2, i3);
    }

    public static int a() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }
}
