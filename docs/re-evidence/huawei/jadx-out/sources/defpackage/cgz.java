package defpackage;

import android.app.Notification;
import android.os.Bundle;
import android.os.Handler;
import androidx.media.MediaBrowserProtocol;
import com.huawei.bone.ui.setting.voip.VoipCallHandle;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes23.dex */
class cgz extends cgy {
    cgz() {
    }

    @Override // defpackage.cgy, com.huawei.bone.ui.setting.voip.VoipCallHandle
    public boolean isPushVoipCalling(chb chbVar, Handler handler, Bundle bundle, Notification notification, boolean z) {
        Notification.Action[] actionArr = notification.actions;
        String string = bundle.getString(MediaBrowserProtocol.DATA_PACKAGE_NAME);
        if (actionArr == null || actionArr.length == 0) {
            LogUtil.j(VoipCallHandle.TAG, "onNotificationPosted VOIP! ", string, " has no action button in statusBar");
            return false;
        }
        boolean z2 = false;
        boolean z3 = false;
        String str = "";
        for (Notification.Action action : actionArr) {
            String strC = cgl.c(action);
            if (strC.equals(chbVar.f1594a.get(string))) {
                bundle.putString("telegramMissCallName", bundle.getString("data_extra_title", ""));
                str = strC;
                z2 = true;
            }
            if (strC.equals(chbVar.f1595b.get(string))) {
                z3 = true;
            }
        }
        ReleaseLogUtil.d(VoipCallHandle.TAG_RELEASE, "isContainsRejectIntent is:", Boolean.valueOf(z2), ", isContainsHangupIntent is:", Boolean.valueOf(z3));
        if (actionArr.length == 1 && z3) {
            bundle.putInt("voip_type", 2);
            return true;
        }
        if (!z2) {
            return false;
        }
        bundle.putInt("voip_type", 1);
        bundle.putString("reject_button_key", str);
        bundle.putInt("incoming_type", 8);
        return true;
    }
}
