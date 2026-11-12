package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.SystemClock;
import com.huawei.basefitnessadvice.model.Media;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.courseplanservice.api.OnStateListener;
import com.huawei.health.plan.model.data.DataSyncService;
import com.huawei.health.plan.model.ui.fitness.service.DeviceRecordSyncService;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class glr {
    public static boolean e(String str) {
        Plan currentPlan = gls.b().getCurrentPlan();
        return currentPlan != null && str.equals(currentPlan.acquireId());
    }

    public static void d(JSONObject jSONObject) {
        if (jSONObject != null) {
            jSONObject.remove("resultCode");
            jSONObject.remove("resultDesc");
        }
    }

    public static String d(int i) {
        return "";
    }

    public static void d() {
        b.a().a((OnStateListener) null);
    }

    public static void a(OnStateListener onStateListener) {
        if (!CommonUtil.ab(btx.c())) {
            LogUtil.a("Suggestion_DataImplHelper", "the isNetworkConnected is false, stop to to sync data");
        } else if (LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) == null) {
            LogUtil.a("Suggestion_DataImplHelper", "the userId is null, User is not login, stop to sync data");
        } else {
            b.a().a(onStateListener);
        }
    }

    public static Media c(List<Media> list) {
        for (Media media : list) {
            if (!media.isFinished()) {
                return media;
            }
        }
        return null;
    }

    public static long b(List<Media> list) {
        long downloadLength = 0;
        if (list == null) {
            return 0L;
        }
        for (Media media : list) {
            if (media != null) {
                downloadLength += media.getDownloadLength();
            }
        }
        return downloadLength;
    }

    public static void d(int i, int i2, int i3) {
        buh.d("finishPlanCount", String.valueOf(i));
        buh.d("totalTrainingDays", String.valueOf(i3));
        buh.d("totalCalorie", String.valueOf(i2));
    }

    public static boolean e(WorkoutRecord workoutRecord) {
        if (workoutRecord == null) {
            return false;
        }
        return ((double) workoutRecord.acquireActualCalorie()) >= 1.0E-6d || ((double) workoutRecord.acquireActualDistance()) >= 1.0E-6d;
    }

    /* JADX INFO: renamed from: glr$3, reason: invalid class name */
    class AnonymousClass3 implements ServiceConnection {
        final /* synthetic */ OnStateListener d;

        AnonymousClass3(OnStateListener onStateListener) {
            this.d = onStateListener;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            DeviceRecordSyncService.DeviceDataSyncBinder deviceDataSyncBinder = (DeviceRecordSyncService.DeviceDataSyncBinder) iBinder;
            deviceDataSyncBinder.setListener(new OnStateListener() { // from class: glr.3.5
                @Override // com.huawei.health.courseplanservice.api.OnStateListener
                public void onFailure(int i, String str) {
                    AnonymousClass3.this.onServiceDisconnected(null);
                    AnonymousClass3.this.d.onFailure(i, str);
                }

                @Override // com.huawei.health.courseplanservice.api.OnStateListener
                public void onFinish() {
                    AnonymousClass3.this.onServiceDisconnected(null);
                    AnonymousClass3.this.d.onFinish();
                }
            });
            deviceDataSyncBinder.dataSync();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            try {
                BaseApplication.getContext().unbindService(this);
            } catch (IllegalArgumentException e) {
                LogUtil.j("Suggestion_DataImplHelper", "startDeviceRecordSyncService " + e.getMessage());
            }
        }
    }

    public static void b(OnStateListener onStateListener) {
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(onStateListener);
        BaseApplication.getContext().bindService(new Intent(btx.c(), (Class<?>) DeviceRecordSyncService.class), anonymousClass3, 1);
    }

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static volatile Map<OnStateListener, Long> f35636b = new ConcurrentHashMap();
        private static DataSyncService.DataSyncBinder d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f35637a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final OnStateListener f35638c;
        private final OnStateListener e;
        private final ServiceConnection h;

        /* synthetic */ b(AnonymousClass3 anonymousClass3) {
            this();
        }

        private b() {
            this.f35637a = new Object();
            this.h = new ServiceConnection() { // from class: glr.b.3
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    LogUtil.a("Suggestion_DataSyncServiceInnerControl", "bind DataSyncService onServiceConnected.");
                    if (iBinder instanceof DataSyncService.DataSyncBinder) {
                        DataSyncService.DataSyncBinder unused = b.d = (DataSyncService.DataSyncBinder) iBinder;
                        synchronized (b.this.f35637a) {
                            b.this.f35637a.notifyAll();
                        }
                        return;
                    }
                    LogUtil.e("Suggestion_DataSyncServiceInnerControl", "ClassCastException occurred: ");
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    ReleaseLogUtil.d("Suggestion_DataSyncServiceInnerControl", "start to onServiceDisconnected");
                }
            };
            this.f35638c = new OnStateListener() { // from class: glr.b.2
                @Override // com.huawei.health.courseplanservice.api.OnStateListener
                public void onFailure(int i, String str) {
                }

                @Override // com.huawei.health.courseplanservice.api.OnStateListener
                public void onFinish() {
                }
            };
            this.e = new OnStateListener() { // from class: glr.b.1
                @Override // com.huawei.health.courseplanservice.api.OnStateListener
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.a("Suggestion_DataSyncServiceInnerControl", "Sync Data Failed.");
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    for (OnStateListener onStateListener : b.f35636b.keySet()) {
                        onStateListener.onFailure(i, str);
                        Long l = (Long) b.f35636b.remove(onStateListener);
                        if (l != null) {
                            LogUtil.a("Suggestion_DataSyncServiceInnerControl", "startDataSyncToCloud failed in ", Long.valueOf(jElapsedRealtime - l.longValue()), " ms");
                        }
                    }
                    b.this.e();
                }

                @Override // com.huawei.health.courseplanservice.api.OnStateListener
                public void onFinish() {
                    ReleaseLogUtil.d("Suggestion_DataSyncServiceInnerControl", "Sync Data Finished.");
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    for (OnStateListener onStateListener : b.f35636b.keySet()) {
                        onStateListener.onFinish();
                        Long l = (Long) b.f35636b.remove(onStateListener);
                        if (l != null) {
                            LogUtil.a("Suggestion_DataSyncServiceInnerControl", "startDataSyncToCloud finish in ", Long.valueOf(jElapsedRealtime - l.longValue()), " ms");
                        }
                    }
                    b.this.e();
                }
            };
        }

        static class e {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final b f35640c = new b(null);
        }

        public static b a() {
            return e.f35640c;
        }

        public void a(final OnStateListener onStateListener) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: glp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35634c.c(onStateListener);
                }
            });
        }

        /* synthetic */ void c(OnStateListener onStateListener) {
            synchronized (b.class) {
                DataSyncService.DataSyncBinder dataSyncBinderD = d();
                d = dataSyncBinderD;
                if (dataSyncBinderD == null) {
                    ReleaseLogUtil.d("Suggestion_DataSyncServiceInnerControl", "the mBinder is null, can‘t execute data sync.");
                    if (onStateListener != null) {
                        onStateListener.onFailure(-6, "bindService fail.");
                    }
                    return;
                }
                if (!f35636b.isEmpty()) {
                    Map<OnStateListener, Long> map = f35636b;
                    if (onStateListener == null) {
                        onStateListener = this.f35638c;
                    }
                    map.put(onStateListener, Long.valueOf(SystemClock.elapsedRealtime()));
                    ReleaseLogUtil.e("Suggestion_DataSyncServiceInnerControl", "startDataSyncToCloud duplicate, [", Integer.valueOf(f35636b.size()), "] task in query");
                    return;
                }
                Map<OnStateListener, Long> map2 = f35636b;
                if (onStateListener == null) {
                    onStateListener = this.f35638c;
                }
                map2.put(onStateListener, Long.valueOf(SystemClock.elapsedRealtime()));
                d.setListener(this.e);
                DataSyncService dataSyncService = d.getDataSyncService();
                if (dataSyncService != null) {
                    dataSyncService.d();
                }
            }
        }

        private DataSyncService.DataSyncBinder d() {
            DataSyncService.DataSyncBinder dataSyncBinder = d;
            if (dataSyncBinder != null) {
                return dataSyncBinder;
            }
            LogUtil.d("Suggestion_DataSyncServiceInnerControl", "start to bind DataSyncService");
            BaseApplication.getContext().bindService(new Intent(btx.c(), (Class<?>) DataSyncService.class), this.h, 1);
            synchronized (this.f35637a) {
                try {
                    DataSyncService.DataSyncBinder dataSyncBinder2 = d;
                    if (dataSyncBinder2 != null) {
                        LogUtil.a("Suggestion_DataSyncServiceInnerControl", "bindService() bind mBinder is not null = ", dataSyncBinder2);
                        return d;
                    }
                    this.f35637a.wait(5000L);
                    LogUtil.d("Suggestion_DataSyncServiceInnerControl", "bind DataSyncService finish, mBinder:", d);
                    return d;
                } catch (InterruptedException unused) {
                    LogUtil.e("Suggestion_DataSyncServiceInnerControl", "bindService() InterruptedException");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            synchronized (b.class) {
                if (d != null) {
                    LogUtil.a("Suggestion_DataSyncServiceInnerControl", "unBind DataSyncService");
                    try {
                        BaseApplication.getContext().unbindService(this.h);
                    } catch (IllegalArgumentException unused) {
                        ReleaseLogUtil.a("Suggestion_DataSyncServiceInnerControl", "unBind DataSyncService appear IllegalArgumentException");
                    }
                    d = null;
                }
            }
        }
    }
}
