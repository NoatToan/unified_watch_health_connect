package defpackage;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.healthcloud.plugintrack.manager.inteface.IActivityRecognitionStateListener;
import com.huawei.healthcloud.plugintrack.manager.inteface.ITrackStrategy;
import com.huawei.healthcloud.plugintrack.manager.inteface.IUpGpsStatusListener;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class ixy {
    private iwc d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<ITrackStrategy> f38189b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38190c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IActivityRecognitionStateListener f38188a = new IActivityRecognitionStateListener() { // from class: ixy.1
        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IActivityRecognitionStateListener
        public void onStateChange(int i) {
            ixy.this.c(i);
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IActivityRecognitionStateListener
        public String getCurrentState() {
            if (ixy.this.d == null) {
                LogUtil.j("Track_StrategyManager", "getCurrentState mActivityRecognitionMotionDetector null");
                return "unkwon";
            }
            return ixy.this.d.c();
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IActivityRecognitionStateListener
        public boolean isCurrentStateIsStill() {
            if (ixy.this.d == null) {
                LogUtil.j("Track_StrategyManager", "isCurrentStateIsStill mActivityRecognitionMotionDetector null");
                return false;
            }
            return ixy.this.d.e();
        }
    };

    public ixy(IUpGpsStatusListener iUpGpsStatusListener, int i) {
        if (!jaq.b()) {
            if (i == 259) {
                e(259);
            }
        } else {
            if (iUpGpsStatusListener == null) {
                return;
            }
            e(iUpGpsStatusListener, i);
            c();
            a();
        }
    }

    private void c() {
        for (ITrackStrategy iTrackStrategy : this.f38189b) {
            if (iTrackStrategy != null) {
                iTrackStrategy.start();
            } else {
                LogUtil.j("Track_StrategyManager", " start iTrackStrategy is null");
            }
        }
    }

    public void e() {
        b();
    }

    public void a(int i) {
        LogUtil.a("Track_StrategyManager", "notifyUserOperateSportState is ", Integer.valueOf(i));
        this.f38190c = i;
        if (i == 4) {
            LogUtil.a("Track_StrategyManager", " dispatchPhoneState IS mPhoneState=", Integer.valueOf(i));
            return;
        }
        List<ITrackStrategy> list = this.f38189b;
        if (list == null) {
            LogUtil.j("Track_StrategyManager", "notifyUserOperateSportState null");
            return;
        }
        for (ITrackStrategy iTrackStrategy : list) {
            if (iTrackStrategy != null) {
                iTrackStrategy.notifyUserOperateSportState(i);
            } else {
                LogUtil.a("Track_StrategyManager", "notifyUserOperateSportState is null");
            }
        }
    }

    private void e(IUpGpsStatusListener iUpGpsStatusListener, int i) {
        e(i);
        if (i != 264) {
            this.f38189b.add(new izh(iUpGpsStatusListener, this.f38188a));
        } else {
            izh.d(false);
        }
        LogUtil.a("Track_StrategyManager", "initAllStrategy");
    }

    private void e(int i) {
        if (i == 259) {
            jxk.a((ResponseCallback<Boolean>) new ResponseCallback() { // from class: ixx
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    this.e.d(i2, (Boolean) obj);
                }
            });
        } else if (jaq.c(BaseApplication.getContext())) {
            this.f38189b.add(new izb());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i, Boolean bool) {
        if (bool.booleanValue()) {
            iza izaVar = new iza();
            izaVar.start();
            this.f38189b.add(izaVar);
        }
    }

    public void b(boolean z) {
        LogUtil.a("Track_StrategyManager", "updateBikeAutoPauseStrategy enable: ", Boolean.valueOf(z));
        if (z) {
            iza izaVar = new iza();
            izaVar.start();
            this.f38189b.add(izaVar);
            return;
        }
        for (ITrackStrategy iTrackStrategy : this.f38189b) {
            if (iTrackStrategy instanceof iza) {
                iTrackStrategy.stop();
                this.f38189b.remove(iTrackStrategy);
                return;
            }
        }
    }

    private void b() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: ixz
            @Override // java.lang.Runnable
            public final void run() {
                this.d.d();
            }
        });
        List<ITrackStrategy> list = this.f38189b;
        if (list == null) {
            return;
        }
        for (ITrackStrategy iTrackStrategy : list) {
            if (iTrackStrategy != null) {
                iTrackStrategy.stop();
            } else {
                LogUtil.a("Track_StrategyManager", " stop iTrackStategy is null");
            }
        }
        this.f38189b.clear();
        ReleaseLogUtil.d("Track_StrategyManager", "destoryAllStrategy");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        iwc iwcVar = this.d;
        if (iwcVar != null) {
            iwcVar.d();
            this.d = null;
            ReleaseLogUtil.d("Track_StrategyManager", "stop mActivityRecognitionMotionDetector is success");
            return;
        }
        ReleaseLogUtil.d("Track_StrategyManager", "stop mActivityRecognitionMotionDetector is null");
    }

    private void a() {
        iwc iwcVar = new iwc(this.f38188a);
        this.d = iwcVar;
        iwcVar.b();
        ReleaseLogUtil.d("Track_StrategyManager", "initMotionDetector");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        List<ITrackStrategy> list = this.f38189b;
        if (list == null) {
            LogUtil.j("Track_StrategyManager", "dispatchPhoneState null");
            return;
        }
        int i2 = this.f38190c;
        if (i2 == 4) {
            LogUtil.a("Track_StrategyManager", " dispatchPhoneState IS mPhoneState=", Integer.valueOf(i2));
            return;
        }
        for (ITrackStrategy iTrackStrategy : list) {
            if (iTrackStrategy != null) {
                iTrackStrategy.dispatchPhoneCurrentState(i);
            } else {
                LogUtil.a("Track_StrategyManager", "dispatchPhoneState is null");
            }
        }
    }
}
