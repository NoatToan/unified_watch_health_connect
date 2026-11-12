package defpackage;

import android.os.Handler;
import android.os.Message;
import com.huawei.healthcloud.plugintrack.manager.inteface.ITrackStrategy;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class izb implements ITrackStrategy {
    private static final String d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f38238b = new Handler(new Handler.Callback() { // from class: izb.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null) {
                return false;
            }
            if (izb.this.f38238b == null) {
                LogUtil.j("Track_AutoPauseResumeStrategy", "handleMessage handler is null");
                return false;
            }
            int i = message.what;
            if (i != 0) {
                if (i == 100) {
                    izb.this.f38238b.removeCallbacksAndMessages(izb.d);
                    if (ive.c().g() == 2 && izb.this.e) {
                        LogUtil.a("Track_AutoPauseResumeStrategy", "mMotion = TrackConstants.EXIT_STATE_STILL AND AUTO_RESUME_SPORT ", 1);
                        izb.this.d();
                    }
                    return true;
                }
                if (i != 102) {
                    return false;
                }
            }
            izb.this.f38238b.removeCallbacksAndMessages(izb.d);
            if (ive.c().g() == 1 && !izb.this.f38239c) {
                LogUtil.a("Track_AutoPauseResumeStrategy", "mMotion =ENTER_STATE_STILL ", 0);
                izb.this.b();
            }
            return true;
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38239c;
    private boolean e;
    private int h;

    public izb() {
        LogUtil.a("Track_AutoPauseResumeStrategy", "AutoPauseResumeStrategy");
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ITrackStrategy
    public void start() {
        LogUtil.a("Track_AutoPauseResumeStrategy", "start AutoPauseResumeStrategy");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        LogUtil.a("Track_AutoPauseResumeStrategy", "autoPauseSport at ", Long.valueOf(System.currentTimeMillis()));
        this.e = true;
        ive.c().v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.a("Track_AutoPauseResumeStrategy", "autoResumeSport at ", Long.valueOf(System.currentTimeMillis()));
        this.e = false;
        ive.c().y();
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ITrackStrategy
    public void notifyUserOperateSportState(int i) {
        if (this.f38238b == null) {
            LogUtil.j("Track_AutoPauseResumeStrategy", "notifyUserOperateSportState handler is null");
            return;
        }
        if (i == 1) {
            this.e = false;
            this.f38239c = false;
            if (this.f38237a) {
                LogUtil.a("Track_AutoPauseResumeStrategy", "IS isIndoorSport");
                this.f38238b.sendMessageDelayed(this.f38238b.obtainMessage(102), 10000L);
            }
            LogUtil.a("Track_AutoPauseResumeStrategy", "IS SPORT_STATUS_SPORTING");
            return;
        }
        if (i != 2) {
            if (i != 5) {
                return;
            }
            LogUtil.a("Track_AutoPauseResumeStrategy", "notifyUserOperateSportState is SPORT_STATUS_STOP_END");
        } else {
            if (!this.e) {
                this.f38239c = true;
                LogUtil.a("Track_AutoPauseResumeStrategy", "IS mIsPauseByUser");
            } else {
                this.f38239c = false;
                LogUtil.a("Track_AutoPauseResumeStrategy", "IS mIsPauseByAuto");
            }
            this.f38238b.removeCallbacksAndMessages(d);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ITrackStrategy
    public void dispatchPhoneCurrentState(int i) {
        Handler handler = this.f38238b;
        if (handler == null) {
            LogUtil.j("Track_AutoPauseResumeStrategy", "dispatchPhoneCurrentState handler is null");
            return;
        }
        if (i == 0) {
            this.h = 0;
            if (handler.hasMessages(0)) {
                return;
            }
            this.f38238b.sendMessageDelayed(this.f38238b.obtainMessage(this.h), 10000L);
            this.f38237a = true;
            LogUtil.a("Track_AutoPauseResumeStrategy", "getPhoneCurrentState is ENTER_STATE_STILL");
            return;
        }
        if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
            this.f38237a = false;
            this.h = 100;
            if (handler.hasMessages(100)) {
                return;
            }
            this.f38238b.sendMessage(this.f38238b.obtainMessage(this.h));
            LogUtil.a("Track_AutoPauseResumeStrategy", "getPhoneCurrentState is AUTO_RESUME_SPORT");
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ITrackStrategy
    public void stop() {
        this.f38238b.removeCallbacksAndMessages(d);
        this.f38238b = null;
    }
}
