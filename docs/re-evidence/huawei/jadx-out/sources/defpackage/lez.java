package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.suggestion.ResultCallback;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.ICommonReport;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hihealthservice.hihealthkit.model.DataObservableNoCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class lez {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static CountDownLatch f40010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ICommonReport f40011c;
    private static volatile boolean e;
    private static List<Integer> h;
    private static HealthOpenSDK i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<DataObservableNoCallback> f40009a = new CopyOnWriteArraySet();
    private static lem d = new lem();

    private lez() {
    }

    public static boolean a(DataObservableNoCallback dataObservableNoCallback) {
        l();
        if (!e) {
            return false;
        }
        f40009a.add(dataObservableNoCallback);
        d.e(new ResultCallback() { // from class: lfb
            @Override // com.huawei.health.suggestion.ResultCallback
            public final void onResult(int i2, Object obj) {
                lez.d(i2, obj);
            }
        });
        return true;
    }

    static /* synthetic */ void d(int i2, Object obj) {
        if ((obj instanceof Intent) && "com.huawei.hihealth.action.get.step".equals(((Intent) obj).getAction())) {
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o() {
        HealthOpenSDK healthOpenSDK = i;
        if (healthOpenSDK == null) {
            ReleaseLogUtil.e("HiH_OpenSdkManger", "opensdk is null, cancel scheduled job");
        } else {
            healthOpenSDK.a(new IExecuteResult() { // from class: lez.4
                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onSuccess(Object obj) {
                    LogUtil.a("OpenSdkManger", "step counter report success ", Integer.valueOf(((Bundle) obj).getInt("standSteps", 0)));
                }

                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onFailed(Object obj) {
                    ReleaseLogUtil.a("HiH_OpenSdkManger", "openSDK getStandSteps failed");
                }

                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onServiceException(Object obj) {
                    ReleaseLogUtil.a("HiH_OpenSdkManger", "openSDK getStandSteps onServiceException");
                }
            });
        }
    }

    public static boolean c(DataObservableNoCallback dataObservableNoCallback) {
        Set<DataObservableNoCallback> set = f40009a;
        if (!set.remove(dataObservableNoCallback)) {
            return false;
        }
        if (!set.isEmpty() || i == null) {
            return true;
        }
        m();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l() {
        synchronized (lez.class) {
            LogUtil.a("OpenSdkManger", "start init sdk, init result before ", Boolean.valueOf(e));
            if (!e) {
                try {
                    try {
                        i = new HealthOpenSDK();
                        f40010b = new CountDownLatch(1);
                        i.initSDK(BaseApplication.b(), new b(), "Health Kit");
                        ReleaseLogUtil.d("HiH_OpenSdkManger", "registerOpenSdk isOnTime: ", Boolean.valueOf(f40010b.await(2000L, TimeUnit.MILLISECONDS)));
                    } catch (Exception e2) {
                        ReleaseLogUtil.a("HiH_OpenSdkManger", "initOpenSDK error", LogAnonymous.b(e2));
                    }
                } catch (InterruptedException e3) {
                    ReleaseLogUtil.a("HiH_OpenSdkManger", "initOpenSDK interrupt", LogAnonymous.b(e3));
                }
            }
        }
    }

    public static void f() {
        if (i != null) {
            ReleaseLogUtil.d("HiH_OpenSdkManger", "destroy openSdk");
            i.e(f40011c);
            i.destorySDK();
            i = null;
            f40011c = null;
            e = false;
            f40010b = null;
        }
    }

    public static void h() {
        LogUtil.a("OpenSdkManger", "report now once");
        HealthOpenSDK healthOpenSDK = i;
        if (healthOpenSDK == null) {
            ReleaseLogUtil.e("HiH_OpenSdkManger", "opensdk is null");
        } else {
            healthOpenSDK.c(new IExecuteResult() { // from class: lez.5
                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onSuccess(Object obj) {
                    if (obj instanceof Bundle) {
                        Iterator it = lez.f40009a.iterator();
                        while (it.hasNext()) {
                            ((DataObservableNoCallback) it.next()).notifyDataChanged((Bundle) obj);
                        }
                        return;
                    }
                    ReleaseLogUtil.e("HiH_OpenSdkManger", "get sport data success, but object is not instance of bundle", obj);
                }

                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onFailed(Object obj) {
                    ReleaseLogUtil.a("HiH_OpenSdkManger", "failed to get today sport data", obj);
                }

                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onServiceException(Object obj) {
                    ReleaseLogUtil.a("HiH_OpenSdkManger", "service error when get today sport data", obj);
                }
            });
        }
    }

    public static void k() {
        m();
        d.c(new ResultCallback() { // from class: lfa
            @Override // com.huawei.health.suggestion.ResultCallback
            public final void onResult(int i2, Object obj) {
                lez.c(i2, obj);
            }
        });
    }

    static /* synthetic */ void c(int i2, Object obj) {
        if ((obj instanceof Intent) && "com.huawei.hihealth.action.subscribe.data".equals(((Intent) obj).getAction())) {
            n();
            d.e();
        }
    }

    public static void m() {
        d.a();
        f();
    }

    /* JADX INFO: renamed from: lez$1, reason: invalid class name */
    class AnonymousClass1 implements HiSubscribeListener {
        AnonymousClass1() {
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            ReleaseLogUtil.d("HiH_OpenSdkManger", "register ", list.isEmpty() ? " success " : " fail ");
            List unused = lez.h = list;
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            lez.l();
            lez.d.e(new ResultCallback() { // from class: lex
                @Override // com.huawei.health.suggestion.ResultCallback
                public final void onResult(int i2, Object obj) {
                    lez.AnonymousClass1.d(i2, obj);
                }
            });
            HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(lez.h, new HiUnSubscribeListener() { // from class: lfd
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    ReleaseLogUtil.d("HiH_OpenSdkManger", "unregister ", z ? " success " : " fail ");
                }
            });
        }

        static /* synthetic */ void d(int i, Object obj) {
            if ((obj instanceof Intent) && "com.huawei.hihealth.action.get.step".equals(((Intent) obj).getAction())) {
                lez.o();
            }
        }
    }

    private static void n() {
        HiHealthNativeApi.a(BaseApplication.b()).subscribeHiHealthData(40002, new AnonymousClass1());
    }

    static class b implements IExecuteResult {
        private b() {
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onSuccess(Object obj) {
            ReleaseLogUtil.d("HiH_OpenSdkManger", "healthOpenSDKCallback initSDK success");
            ICommonReport unused = lez.f40011c = new e();
            if (lez.i != null) {
                lez.i.a(lez.f40011c, new a());
            } else {
                ReleaseLogUtil.e("HiH_OpenSdkManger", "opensdk is null");
            }
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onFailed(Object obj) {
            lez.f40010b.countDown();
            ReleaseLogUtil.e("HiH_OpenSdkManger", "healthOpenSDKCallback : initSDK Failed");
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onServiceException(Object obj) {
            lez.f40010b.countDown();
            ReleaseLogUtil.e("HiH_OpenSdkManger", "healthOpenSDKCallback : onServiceException");
        }
    }

    static class e implements ICommonReport {
        private e() {
        }

        @Override // com.huawei.hihealth.motion.ICommonReport
        public void report(Bundle bundle) {
            ReleaseLogUtil.d("HiH_OpenSdkManger", "total step value ", Integer.valueOf(bundle.getInt("step")));
            if (bundle == null || !lez.d.d()) {
                return;
            }
            Iterator it = lez.f40009a.iterator();
            while (it.hasNext()) {
                ((DataObservableNoCallback) it.next()).notifyDataChanged(bundle);
            }
        }
    }

    static class a implements IExecuteResult {
        a() {
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onSuccess(Object obj) {
            boolean unused = lez.e = true;
            ReleaseLogUtil.d("HiH_OpenSdkManger", "registerStepReport success");
            lez.f40010b.countDown();
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onFailed(Object obj) {
            lez.f40010b.countDown();
            ReleaseLogUtil.e("HiH_OpenSdkManger", "registerStepReport fail");
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onServiceException(Object obj) {
            lez.f40010b.countDown();
            ReleaseLogUtil.e("HiH_OpenSdkManger", "registerStepReport exception");
        }
    }
}
