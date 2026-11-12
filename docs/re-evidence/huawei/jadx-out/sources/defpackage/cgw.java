package defpackage;

import android.app.Notification;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes23.dex */
class cgw extends cgy {
    cgw() {
    }

    @Override // defpackage.cgy, com.huawei.bone.ui.setting.voip.VoipCallHandle
    public boolean isPushVoipCalling(chb chbVar, Handler handler, Bundle bundle, Notification notification, boolean z) {
        if (new cgv().isPushVoipCalling(chbVar, handler, bundle, notification, z)) {
            return true;
        }
        return new cgz().isPushVoipCalling(chbVar, handler, bundle, notification, z);
    }
}
