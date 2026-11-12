package defpackage;

import android.app.Notification;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.media.MediaBrowserProtocol;
import com.huawei.bone.ui.setting.voip.VoipCallHandle;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes23.dex */
class cgv extends cgy {
    cgv() {
    }

    @Override // defpackage.cgy, com.huawei.bone.ui.setting.voip.VoipCallHandle
    public boolean isPushVoipCalling(chb chbVar, Handler handler, Bundle bundle, Notification notification, boolean z) {
        Notification.Action[] actionArr = notification.actions;
        String string = bundle.getString(MediaBrowserProtocol.DATA_PACKAGE_NAME);
        if (actionArr == null || actionArr.length == 0) {
            LogUtil.j(VoipCallHandle.TAG, "onNotificationPosted VOIP! ", string, " has no action button in statusBar");
            return false;
        }
        String str = "";
        boolean z2 = false;
        boolean z3 = false;
        for (int i = 0; i < actionArr.length; i++) {
            String strC = cgl.c(actionArr[i]);
            if (cgl.b(actionArr[i]).equals("com.linecorp.voip2.common.VoIPActionReceiver")) {
                str = strC;
                z2 = true;
                z3 = true;
            }
        }
        ReleaseLogUtil.d(VoipCallHandle.TAG_RELEASE, "isContainsRejectIntent is:", Boolean.valueOf(z2), ", isContainsHangupIntent is:", Boolean.valueOf(z3));
        if (actionArr.length == 1 && z3) {
            bundle.putInt("voip_type", 2);
            return true;
        }
        String strC2 = cgl.c(notification);
        if (!z2 || !TextUtils.equals(NotificationCompat.CATEGORY_CALL, strC2)) {
            return false;
        }
        bundle.putInt("voip_type", 1);
        bundle.putString("reject_button_key", str);
        bundle.putInt("incoming_type", 8);
        return true;
    }
}
