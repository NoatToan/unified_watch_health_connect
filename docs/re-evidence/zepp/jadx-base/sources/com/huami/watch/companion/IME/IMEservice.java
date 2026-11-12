package com.huami.watch.companion.IME;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.R;
import com.huami.watch.companion.util.NotificationUtils;
import com.xiaomi.hm.health.baseutil.GlobalUtil;
import com.xiaomi.hm.health.baseutil.SdkVersionUtil;

/* JADX INFO: loaded from: classes16.dex */
public class IMEservice extends Service implements IMETransportCmd.callback {
    public static final int IME_NOTIFICATION_ID = 65536;
    private static final String b = "IMEservice";
    private IMETransportCmd a;

    @Override // com.huami.watch.companion.IME.IMETransportCmd.callback
    public void dataChannelChanged(boolean z) {
    }

    @Override // com.huami.watch.companion.IME.IMETransportCmd.callback
    public void inputCancel() {
        if (SdkVersionUtil.isQ()) {
            stopForeground(true);
        }
    }

    @Override // com.huami.watch.companion.IME.IMETransportCmd.callback
    public void inputMsgReceive(String str) {
    }

    @Override // com.huami.watch.companion.IME.IMETransportCmd.callback
    public void inputRequestReceive() {
        Log.d(b, "inputRequestReceive");
        Intent intent = new Intent(getBaseContext(), (Class<?>) InputEditActivity.class);
        intent.addFlags(268435456);
        if (!SdkVersionUtil.isQ() || GlobalUtil.isRunningForeground(this, getPackageName())) {
            getApplication().startActivity(intent);
        } else {
            HMLog.i(b, "App in background, notify user open verify password input page", new Object[0]);
            startForeground(65536, NotificationUtils.createNotificationForQ(this, intent, IMEservice.class.getSimpleName(), getString(R.string.input_auth_info)));
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.d(b, "onCreate 122");
        if (this.a == null) {
            this.a = IMETransportCmd.getInstance(this);
        }
        this.a.registerCallback(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.a.unregisterCallback(this);
    }
}
