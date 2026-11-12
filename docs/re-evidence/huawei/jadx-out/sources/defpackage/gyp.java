package defpackage;

import android.os.Bundle;
import com.huawei.health.R;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.hwbasemgr.IBaseStatusCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwvoiceplaymodel.IVoiceHandler;

/* JADX INFO: loaded from: classes8.dex */
public class gyp implements IVoiceHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f36237a = new Object();
    private static gyp e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IBaseStatusCallback f36238c = new IBaseStatusCallback() { // from class: gyp.1
        @Override // com.huawei.hwbasemgr.IBaseStatusCallback
        public void onAvailable() {
            LogUtil.a("Track_PluginTrackVoiceHandler", "onAvailable invoke");
            gyw.c(0);
        }

        @Override // com.huawei.hwbasemgr.IBaseStatusCallback
        public void onOccupied() {
            LogUtil.a("Track_PluginTrackVoiceHandler", "onOccupied invoke");
            gyw.c(1);
        }
    };

    private gyp() {
    }

    public static gyp d() {
        gyp gypVar;
        synchronized (f36237a) {
            if (e == null) {
                e = new gyp();
            }
            gypVar = e;
        }
        return gypVar;
    }

    public void b() {
        ive.c().d(this.f36238c);
    }

    @Override // com.huawei.hwvoiceplaymodel.IVoiceHandler
    public int handleVoiceEvent(Bundle bundle) {
        if (bundle == null) {
            LogUtil.j("Track_PluginTrackVoiceHandler", "handleVoiceEvent voiceMsg is null");
            return -4;
        }
        String string = bundle.getString("voiceMessage");
        if (string == null) {
            LogUtil.j("Track_PluginTrackVoiceHandler", "handleVoiceEvent message is null");
            return -4;
        }
        int iE = e(string);
        LogUtil.a("Track_PluginTrackVoiceHandler", "handleVoiceEvent message = ", string, ", result = ", Integer.valueOf(iE));
        return iE;
    }

    private int e(String str) {
        int iG = ive.c().g();
        LogUtil.a("Track_PluginTrackVoiceHandler", "dispatchVoiceEvent currentSportState = ", Integer.valueOf(iG));
        if (nwa.n().s()) {
            LogUtil.a("Track_PluginTrackVoiceHandler", "indoor run ", Integer.valueOf(iG));
            return -1;
        }
        if (iG == 0) {
            gyq.e().a(R.raw.girls_handle_failed_start_sport_during_idle);
            return -1;
        }
        if (str.endsWith("queryHeartRate")) {
            gyw.d("queryHeartRate");
            if (iG != 1) {
                gyq.e().a(R.raw.girls_handle_failed_control_during_pause);
                return -1;
            }
            ive.c().e(iem.d(), iem.a(jbg.a(), iem.b()));
            return ive.c().e(IndoorEquipManagerApi.KEY_HEART_RATE);
        }
        if (str.endsWith("queryCurrentDuration")) {
            gyw.d("queryCurrentDuration");
            return ive.c().e("duration");
        }
        if (str.endsWith("queryCurrentPace")) {
            if (iG != 1) {
                gyq.e().a(R.raw.girls_handle_failed_control_during_pause);
                return -1;
            }
            gyw.d("queryCurrentPace");
            return ive.c().e("speed");
        }
        if (str.endsWith("queryAll")) {
            gyw.d("queryAll");
            return ive.c().e("sportState");
        }
        if (str.endsWith("queryCurrentDistance")) {
            gyw.d("queryCurrentDistance");
            return ive.c().e("distance");
        }
        if (str.endsWith("queryLastKilometerPace")) {
            gyw.d("queryLastKilometerPace");
            return ive.c().e("pace");
        }
        LogUtil.a("Track_PluginTrackVoiceHandler", "dispatchVoiceEvent other condition");
        return -1;
    }
}
