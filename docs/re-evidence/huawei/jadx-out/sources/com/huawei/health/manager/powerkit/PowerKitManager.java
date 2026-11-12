package com.huawei.health.manager.powerkit;

import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.android.powerkit.PowerKitConnection;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.hianalytics.framework.policy.IStoragePolicy;
import defpackage.bdi;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class PowerKitManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f8099b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile PowerKitManager f8100c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<PowerKitCallback> f8101a;
    private volatile CountDownLatch e;
    private volatile bdi g;
    private volatile boolean f = true;
    private volatile boolean d = false;
    private final Map<Integer, List<String>> j = new ConcurrentHashMap(3);

    /* JADX INFO: loaded from: classes2.dex */
    interface PowerKitCallback {
        void connected();
    }

    private PowerKitManager() {
    }

    public static PowerKitManager a() {
        if (f8100c == null) {
            synchronized (PowerKitManager.class) {
                if (f8100c == null) {
                    f8100c = new PowerKitManager();
                }
            }
        }
        return f8100c;
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class ResourceType {
        private ResourceType() {
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class PowerMode {
        private PowerMode() {
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class PowerOptimizeType {
        private PowerOptimizeType() {
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class StateType {
        private StateType() {
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class EventType {
        private EventType() {
        }
    }

    public boolean b() {
        if (!CommonUtil.at() || ScreenUtil.d()) {
            return false;
        }
        bdi bdiVarE = e();
        if (!this.d || bdiVarE == null) {
            return false;
        }
        try {
            return bdiVarE.b();
        } catch (RemoteException e) {
            LogUtil.d("PowerKitManager", "calling isUserSleeping err, ", LogUtil.c(e));
            return false;
        }
    }

    public void b(String str, int i, String str2) {
        d(str, i, 0L, str2);
    }

    public void d(String str, int i, long j, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("moduleTag is empty");
        }
        LogUtil.b("PowerKitManager", "applyForResourceUse moduleTag=", str, ", resType=", Integer.valueOf(i), ", timeout=", Long.valueOf(j), ", reason=", str2);
        synchronized (f8099b) {
            e(str, i, j, str2, true);
        }
    }

    public void a(String str, int i, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("moduleTag is empty");
        }
        LogUtil.b("PowerKitManager", "unapplyForResourceUse moduleTag=", str, ", resType=", Integer.valueOf(i), ", reason=", str2);
        synchronized (f8099b) {
            e(str, i, 0L, str2, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public bdi e() {
        if (this.g != null || !this.f) {
            return this.g;
        }
        return f();
    }

    private bdi f() {
        synchronized (this) {
            if (this.g == null && this.f) {
                if (!CommonUtil.ay()) {
                    this.f = false;
                    return this.g;
                }
                if (this.e == null) {
                    this.e = new CountDownLatch(1);
                }
                try {
                    this.g = bdi.d(BaseApplication.b(), new InnerPowerKitConnection(this));
                    if (!this.e.await(3L, TimeUnit.SECONDS)) {
                        LogUtil.e("PowerKitManager", "bind service await timeout");
                    }
                    e = null;
                } catch (SecurityException e) {
                    e = e;
                } catch (Exception e2) {
                    e = e2;
                }
                if (e != null) {
                    this.f = false;
                    this.g = null;
                    LogUtil.d("PowerKitManager", "getHuaweiPowerKit Exception = ", LogUtil.c(e));
                }
                this.e = null;
                return this.g;
            }
            return this.g;
        }
    }

    private void e(final String str, final int i, final long j, final String str2, final boolean z) {
        if (e() == null) {
            return;
        }
        if (this.d) {
            b(str, i, j, str2, z);
            return;
        }
        PowerKitCallback powerKitCallback = new PowerKitCallback() { // from class: com.huawei.health.manager.powerkit.PowerKitManager.1
            @Override // com.huawei.health.manager.powerkit.PowerKitManager.PowerKitCallback
            public void connected() {
                bdi bdiVarE = PowerKitManager.this.e();
                if (!PowerKitManager.this.d || bdiVarE == null) {
                    return;
                }
                PowerKitManager.this.b(str, i, j, str2, z);
            }
        };
        if (this.f8101a == null) {
            this.f8101a = new ArrayList(3);
        }
        this.f8101a.add(powerKitCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, int i, long j, String str2, boolean z) {
        if (!EnvironmentInfo.l()) {
            if (z) {
                e(str, i);
            } else if (!d(str, i)) {
                LogUtil.e("PowerKitManager", "handlePowerKitResource can't unapply, resoureType=", Integer.valueOf(i), ", moduleTag=", str);
                return;
            }
        }
        try {
            bdi bdiVarE = e();
            if (bdiVarE == null) {
                return;
            }
            if (i == 100) {
                d(str, bdiVarE, str2, z);
            } else if (i == 512) {
                e(bdiVarE, j, str2, z);
            } else if (i == 65535) {
                c(bdiVarE, j, str2, z);
            }
            e = null;
            if (e != null) {
                d(str, i);
                LogUtil.d("PowerKitManager", "handlePowerKitResource exception = ", LogUtil.c(e));
            }
        } catch (RemoteException e) {
            e = e;
        } catch (Exception e2) {
            e = e2;
        }
    }

    private void e(bdi bdiVar, long j, String str, boolean z) throws RemoteException {
        if (TextUtils.isEmpty(str)) {
            str = IStoragePolicy.PolicyType.NETWORK;
        }
        String str2 = str;
        if (!z) {
            LogUtil.b("PowerKitManager", "handleNetworkResource isClose is ", Boolean.valueOf(bdiVar.a(BaseApplication.d(), 512, str2)));
            return;
        }
        String strD = BaseApplication.d();
        if (j <= 0) {
            j = 180000;
        }
        LogUtil.b("PowerKitManager", "handleNetworkResource isOpen is ", Boolean.valueOf(bdiVar.b(strD, 512, j, str2)));
    }

    private void c(bdi bdiVar, long j, String str, boolean z) throws RemoteException {
        if (TextUtils.isEmpty(str)) {
            str = "ALL";
        }
        String str2 = str;
        if (!z) {
            LogUtil.b("PowerKitManager", "handleAllResource isClose is ", Boolean.valueOf(bdiVar.a(BaseApplication.d(), 65535, str2)));
            return;
        }
        String strD = BaseApplication.d();
        if (j <= 0) {
            j = 600000;
        }
        LogUtil.b("PowerKitManager", "handleAllResource isOpen is ", Boolean.valueOf(bdiVar.b(strD, 65535, j, str2)));
    }

    private void d(String str, bdi bdiVar, String str2, boolean z) throws RemoteException {
        if (TextUtils.isEmpty(str2)) {
            str2 = "ALL";
        }
        String str3 = str2;
        if (z) {
            LogUtil.b("PowerKitManager", "applyForHuaweiMusicUnfreeze isOpen is ", Boolean.valueOf(bdiVar.b(str, 65535, 5000L, str3)));
        } else {
            LogUtil.b("PowerKitManager", "applyForHuaweiMusicUnfreeze isClose is ", Boolean.valueOf(bdiVar.a(str, 65535, str3)));
        }
    }

    private void e(String str, int i) {
        int iB;
        List<String> arrayList = this.j.get(Integer.valueOf(i));
        if (arrayList == null) {
            arrayList = new ArrayList<>(3);
            this.j.put(Integer.valueOf(i), arrayList);
            iB = 0;
        } else {
            iB = b(str, arrayList);
        }
        if (iB < 5) {
            if (arrayList.size() >= 30) {
                LogUtil.c("PowerKitManager", "putModuleTag, resType=", Integer.valueOf(i), ", modules=", arrayList);
                return;
            } else {
                arrayList.add(str);
                return;
            }
        }
        LogUtil.c("PowerKitManager", "putModuleTag multiple calls, resType=", Integer.valueOf(i), ", module=", str, ", size=", Integer.valueOf(arrayList.size()));
    }

    private boolean d(String str, int i) {
        List<String> list = this.j.get(Integer.valueOf(i));
        if (list != null) {
            if (!list.remove(str)) {
                LogUtil.c("PowerKitManager", "removeModuleTag incorrect matching call, resType=", Integer.valueOf(i), ", module=", str);
            }
            if (list.isEmpty()) {
                this.j.remove(Integer.valueOf(i));
            }
        }
        return list == null || list.isEmpty();
    }

    private int b(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (str.equals(it.next())) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.d = true;
        CountDownLatch countDownLatch = this.e;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        bdi bdiVarE = e();
        if (bdiVarE != null) {
            try {
                LogUtil.b("PowerKitManager", "PowerKit Version=", bdiVarE.d());
            } catch (RemoteException e) {
                LogUtil.d("PowerKitManager", "calling getPowerKitVersion err, ", LogUtil.c(e));
            }
        }
        synchronized (f8099b) {
            List<PowerKitCallback> list = this.f8101a;
            if (list != null) {
                Iterator<PowerKitCallback> it = list.iterator();
                while (it.hasNext()) {
                    it.next().connected();
                }
                this.f8101a.clear();
                this.f8101a = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.d = false;
        synchronized (f8099b) {
            List<PowerKitCallback> list = this.f8101a;
            if (list != null) {
                list.clear();
                this.f8101a = null;
            }
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class InnerPowerKitConnection implements PowerKitConnection {
        private PowerKitManager d;

        InnerPowerKitConnection(PowerKitManager powerKitManager) {
            this.d = powerKitManager;
        }

        @Override // com.huawei.android.powerkit.PowerKitConnection
        public void onServiceConnected() {
            LogUtil.b("PowerKitManager", "PowerKitConnection service connected");
            PowerKitManager powerKitManager = this.d;
            if (powerKitManager != null) {
                powerKitManager.d();
            }
        }

        @Override // com.huawei.android.powerkit.PowerKitConnection
        public void onServiceDisconnected() {
            LogUtil.b("PowerKitManager", "PowerKitConnection service disconnected");
            this.d.c();
        }
    }

    public boolean e(List<String> list) {
        boolean[] zArr = new boolean[1];
        if (!CommonUtil.av()) {
            return true;
        }
        bdi bdiVarE = e();
        if (this.d && bdiVarE != null) {
            try {
                return bdiVarE.a(list);
            } catch (RemoteException e) {
                ReleaseLogUtil.b("PowerKitManager", "calling applyForAlarmExemption ex=, ", ExceptionUtils.c(e));
            } catch (NullPointerException unused) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                a(list, bdiVarE, countDownLatch, zArr);
                try {
                    if (countDownLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                        return zArr[0];
                    }
                } catch (InterruptedException e2) {
                    ReleaseLogUtil.b("PowerKitManager", "PowerKitManager InterruptedException ex=, ", ExceptionUtils.c(e2));
                }
            }
        }
        return true;
    }

    public void a(final List<String> list, final bdi bdiVar, final CountDownLatch countDownLatch, final boolean[] zArr) {
        HandlerCenter.a().d(new Runnable() { // from class: com.huawei.health.manager.powerkit.PowerKitManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PowerKitManager.c(zArr, bdiVar, list, countDownLatch);
            }
        }, 2000L);
    }

    static /* synthetic */ void c(boolean[] zArr, bdi bdiVar, List list, CountDownLatch countDownLatch) {
        try {
            zArr[0] = bdiVar.a(list);
        } catch (Exception e) {
            ReleaseLogUtil.b("PowerKitManager", "calling delayApplyForAlarmExemption ex=, ", ExceptionUtils.c(e));
        }
        countDownLatch.countDown();
    }

    public boolean b(List<String> list) {
        if (!CommonUtil.av()) {
            return true;
        }
        bdi bdiVarE = e();
        if (!this.d || bdiVarE == null) {
            return true;
        }
        try {
            return bdiVarE.b(list);
        } catch (RemoteException e) {
            LogUtil.d("PowerKitManager", "calling unApplyForAlarmExemption ex=, ", LogUtil.c(e));
            return true;
        }
    }
}
