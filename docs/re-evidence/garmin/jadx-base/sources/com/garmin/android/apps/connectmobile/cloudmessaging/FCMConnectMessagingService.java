package com.garmin.android.apps.connectmobile.cloudmessaging;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import f12.b;
import gt2.c;
import java.util.Map;
import lg1.d;
import n00.e;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/cloudmessaging/FCMConnectMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FCMConnectMessagingService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f31355a = c.b(a2.CLOUD_MESSAGING.f28756a);

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        remoteMessage.getClass();
        com.airbnb.lottie.animation.keyframe.a.w("FCMConnectMessagingService -> onMessageReceived: from ", remoteMessage.getFrom(), this.f31355a);
        e eVar = (e) KoinJavaComponent.get$default(e.class, null, null, 6, null);
        Map<String, String> data = remoteMessage.getData();
        data.getClass();
        Bundle bundle = new Bundle();
        for (String str : data.keySet()) {
            bundle.putString(str, data.get(str));
        }
        eVar.d(bundle);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) {
        str.getClass();
        String strConcat = "FCMConnectMessagingService -> onNewToken() newToken=".concat(str);
        Logger logger = this.f31355a;
        logger.debug(strConcat);
        if (!((b) KoinJavaComponent.get$default(b.class, null, null, 6, null)).c() || ((b) KoinJavaComponent.get$default(b.class, null, null, 6, null)).f() || GCMSettingManager.f41536b.getBoolean(d.BAIDU_CLOUD_PUSH.f112244a, false)) {
            return;
        }
        logger.debug("FCMConnectMessagingService -> enqueue FCMRegistrationGCWorker");
        FCMRegistrationGCWorker.f31356e.getClass();
        FCMRegistrationGCWorker.a.b(this, str);
    }
}
