package defpackage;

import android.app.Notification;
import android.os.Bundle;
import android.os.Handler;
import androidx.media.MediaBrowserProtocol;
import com.huawei.bone.ui.setting.voip.VoipCallHandle;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes23.dex */
class chd extends cgy {
    chd() {
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
        for (Notification.Action action : actionArr) {
            String strC = cgl.c(action);
            if (strC.equals("com.whatsapp.calling.reject_call") || strC.equals(chbVar.f1594a.get(string))) {
                str = strC;
                z2 = true;
            }
            if (strC.equals("com.whatsapp.calling.hangup_call") || strC.equals(chbVar.f1595b.get(string))) {
                z3 = true;
            }
        }
        ReleaseLogUtil.d(VoipCallHandle.TAG_RELEASE, "isContainsRejectIntent is:", Boolean.valueOf(z2), ", isContainsHangupIntent is:", Boolean.valueOf(z3));
        if (actionArr.length == 1 && z3) {
            bundle.putInt("voip_type", 2);
            handler.removeMessages(12);
            ReleaseLogUtil.d(VoipCallHandle.TAG_RELEASE, "onNotificationPosted mHandler MSG_ACTION_REMOVE_VOIP_CALLING.");
            return true;
        }
        if (z2) {
            bundle.putInt("voip_type", 1);
            bundle.putString("reject_button_key", str);
            bundle.putInt("incoming_type", 8);
            handler.removeMessages(12);
            ReleaseLogUtil.d(VoipCallHandle.TAG_RELEASE, "onNotificationPosted mHandler MSG_ACTION_REMOVE_VOIP_CALLING.");
            if (z) {
                if (chb.e.containsKey(string)) {
                    ReleaseLogUtil.d(VoipCallHandle.TAG_RELEASE, string, "mResendLongVibrateCache contains key,filter is true.");
                    return false;
                }
                ReleaseLogUtil.d(VoipCallHandle.TAG_RELEASE, string, "mResendLongVibrateCache not contains key,filter is false.");
                chbVar.d(string);
                return true;
            }
        }
        return false;
    }
}
