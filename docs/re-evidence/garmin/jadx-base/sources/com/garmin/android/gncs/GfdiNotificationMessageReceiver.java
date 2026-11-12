package com.garmin.android.gncs;

import android.text.TextUtils;
import com.garmin.android.ancs.ANCSMessageManager;
import com.garmin.device.datatypes.DeviceProfile;
import la2.h;

/* JADX INFO: loaded from: classes11.dex */
class GfdiNotificationMessageReceiver implements la2.a {
    @Override // la2.a
    public void onDeviceConnected(la2.b bVar) {
    }

    @Override // la2.a
    public void onDeviceConnectingFailure(la2.c cVar) {
    }

    @Override // la2.a
    public void onDeviceDisconnected(h hVar) {
        DeviceProfile deviceProfile = hVar.f111673a;
        if (deviceProfile.getF172498f() && deviceProfile.getConnectionType() == 2) {
            return;
        }
        String f172493a = hVar.f111673a.getF172493a();
        if (TextUtils.isEmpty(f172493a)) {
            return;
        }
        ((ANCSMessageManager) jb2.b.a(ANCSMessageManager.class)).unsubscribe(f172493a);
    }
}
