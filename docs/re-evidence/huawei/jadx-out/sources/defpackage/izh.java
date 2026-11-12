package defpackage;

import android.os.Handler;
import android.os.Message;
import com.huawei.healthcloud.plugintrack.manager.inteface.IActivityRecognitionStateListener;
import com.huawei.healthcloud.plugintrack.manager.inteface.ITrackStrategy;
import com.huawei.healthcloud.plugintrack.manager.inteface.IUpGpsStatusListener;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class izh implements ITrackStrategy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f38247c = null;
    private static boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IActivityRecognitionStateListener f38248a;
    private IUpGpsStatusListener d;
    private int f = 0;
    private boolean j = false;
    private boolean g = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f38249b = new Handler(new Handler.Callback() { // from class: izh.2
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (izh.this.j) {
                return true;
            }
            if (message == null) {
                return false;
            }
            int i = message.what;
            if (i != 0) {
                if (i == 100) {
                    izh.this.f38249b.removeCallbacksAndMessages(izh.f38247c);
                    LogUtil.a("Track_PowerSaveStrategy", "handleMessage is registerGps");
                    izh.this.a();
                    return true;
                }
                if (i != 102) {
                    return false;
                }
            }
            izh.this.f38249b.removeCallbacksAndMessages(izh.f38247c);
            izh.this.b();
            LogUtil.a("Track_PowerSaveStrategy", "handleMessage is ENTER_STATE_STILL");
            return true;
        }
    });

    public izh(IUpGpsStatusListener iUpGpsStatusListener, IActivityRecognitionStateListener iActivityRecognitionStateListener) {
        this.d = iUpGpsStatusListener;
        this.f38248a = iActivityRecognitionStateListener;
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ITrackStrategy
    public void start() {
        LogUtil.a("Track_PowerSaveStrategy", "start");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        IUpGpsStatusListener iUpGpsStatusListener = this.d;
        if (iUpGpsStatusListener != null) {
            iUpGpsStatusListener.registerGps();
            e = false;
            LogUtil.a("Track_PowerSaveStrategy", "registerGps");
            return;
        }
        LogUtil.j("Track_PowerSaveStrategy", "registerGps GpsControler is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        IActivityRecognitionStateListener iActivityRecognitionStateListener = this.f38248a;
        if (iActivityRecognitionStateListener != null) {
            String currentState = iActivityRecognitionStateListener.getCurrentState();
            if (this.f38248a.isCurrentStateIsStill()) {
                IUpGpsStatusListener iUpGpsStatusListener = this.d;
                if (iUpGpsStatusListener != null) {
                    iUpGpsStatusListener.unregisterGps();
                    e = true;
                    LogUtil.a("Track_PowerSaveStrategy", "unRegisterGps", "and CurState is still");
                    return;
                }
                LogUtil.j("Track_PowerSaveStrategy", "unRegisterGps GpsController is null");
                return;
            }
            LogUtil.a("Track_PowerSaveStrategy", " CurState is not still", " and CurState is", currentState);
            return;
        }
        LogUtil.j("Track_PowerSaveStrategy", "unRegisterGps mActivityRecognitionStateListener is null");
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ITrackStrategy
    public void stop() {
        this.f38249b.removeCallbacksAndMessages(f38247c);
        this.d = null;
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ITrackStrategy
    public void notifyUserOperateSportState(int i) {
        if (this.f38249b == null) {
            LogUtil.j("Track_PowerSaveStrategy", "notifyUserOperateSportState mHandler is null");
            return;
        }
        if (i != 1) {
            if (i != 2) {
                return;
            }
            LogUtil.a("Track_PowerSaveStrategy", "mIsPause");
            this.f38249b.removeCallbacksAndMessages(f38247c);
            this.j = true;
            return;
        }
        LogUtil.a("Track_PowerSaveStrategy", "is sporting");
        if (this.g) {
            this.f38249b.sendMessageDelayed(this.f38249b.obtainMessage(102), 120000L);
        }
        this.j = false;
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ITrackStrategy
    public void dispatchPhoneCurrentState(int i) {
        Handler handler = this.f38249b;
        if (handler == null) {
            LogUtil.j("Track_PowerSaveStrategy", "dispatchPhoneCurrentState handler null");
            return;
        }
        if (i == 0) {
            this.f = 0;
            if (handler.hasMessages(0)) {
                return;
            }
            this.f38249b.sendMessageDelayed(this.f38249b.obtainMessage(this.f), 120000L);
            this.g = true;
            LogUtil.a("Track_PowerSaveStrategy", "getPhoneCurrentState is ENTER_STATE_STILL");
            return;
        }
        if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
            this.f = 100;
            if (handler.hasMessages(100)) {
                return;
            }
            if (!this.f38249b.sendMessage(this.f38249b.obtainMessage(this.f))) {
                LogUtil.a("Track_PowerSaveStrategy", "send failed");
                this.f38249b.sendMessage(this.f38249b.obtainMessage(this.f));
            }
            this.g = false;
            LogUtil.a("Track_PowerSaveStrategy", "getPhoneCurrentState not still");
        }
    }

    public static boolean e() {
        return e;
    }

    public static void d(boolean z) {
        e = z;
    }
}
