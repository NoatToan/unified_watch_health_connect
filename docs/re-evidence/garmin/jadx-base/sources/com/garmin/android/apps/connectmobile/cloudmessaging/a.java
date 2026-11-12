package com.garmin.android.apps.connectmobile.cloudmessaging;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import f12.b;
import lg1.d;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static final void a(Context context) {
        context.getClass();
        if (((b) KoinJavaComponent.get$default(b.class, null, null, 6, null)).f() || GCMSettingManager.f41536b.getBoolean(d.BAIDU_CLOUD_PUSH.f112244a, false)) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.CLOUD_MESSAGING;
            aVar.getClass();
            i2.a.a(a2Var, "bindBaiduCloudPush");
            int i14 = l00.a.f107830a;
            return;
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.CLOUD_MESSAGING;
        aVar2.getClass();
        i2.a.a(a2Var2, "Enqueue FCMRegistrationGCWorker");
        FCMRegistrationGCWorker.f31356e.getClass();
        FCMRegistrationGCWorker.a.a(context);
    }
}
