package defpackage;

import android.app.Notification;
import android.os.Bundle;
import android.os.Handler;
import androidx.media.MediaBrowserProtocol;
import com.huawei.bone.ui.setting.voip.VoipCallHandle;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes23.dex */
class che extends cgy {
    che() {
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
        for (Notification.Action action : actionArr) {
            String strC = cgl.c(action);
            if (strC.equals(chbVar.f1594a.get(string))) {
                str = strC;
                z2 = true;
            }
        }
        String strA = cgl.a(bundle, "data_channel_id", (String) null);
        int i = bundle.getInt("data_flags");
        LogUtil.j(VoipCallHandle.TAG, "chanelId is:", strA, ", flags is:", Integer.valueOf(i));
        boolean z3 = strA != null && strA.contains("system_") && (i & 32) == 32;
        ReleaseLogUtil.d(VoipCallHandle.TAG_RELEASE, "isContainsRejectIntent is:", Boolean.valueOf(z2), ", isContainsHangupIntent is:", Boolean.valueOf(z3));
        if (z3) {
            bundle.putInt("voip_type", 2);
            handler.removeMessages(12);
            ReleaseLogUtil.d(VoipCallHandle.TAG_RELEASE, "onNotificationPosted mHandler MSG_ACTION_REMOVE_VOIP_CALLING.");
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
