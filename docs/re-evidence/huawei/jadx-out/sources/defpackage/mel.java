package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.mgr.device.ProfileAgent;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.client.profile.ProfileClient;
import com.huawei.profile.profile.DeviceProfile;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class mel {
    private static mel e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f41507b = false;
    private boolean d = false;
    private Map<String, IBaseResponseCallback> h = new ConcurrentHashMap(16);
    private List<DeviceProfile> i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41506c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41505a = new Object();

    public static mel e() {
        mel melVar;
        synchronized (f41506c) {
            if (e == null) {
                e = new mel();
            }
            melVar = e;
        }
        return melVar;
    }

    public void d(final String str, final IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("R_IntellLifeCloudDevice", "getDevicesFromCloud mode:", str);
        if (!cin.f1618a.contains(str)) {
            d(iBaseResponseCallback, -1);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: mek
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41503a.b(iBaseResponseCallback, str);
                }
            });
        }
    }

    /* synthetic */ void b(IBaseResponseCallback iBaseResponseCallback, String str) {
        if (Utils.o() || !yln.d(BaseApplication.getContext())) {
            ReleaseLogUtil.d("R_IntellLifeCloudDevice", "oversea or not authorized");
            synchronized (f41505a) {
                d(iBaseResponseCallback, -1);
            }
            return;
        }
        Object obj = f41505a;
        synchronized (obj) {
            this.h.put(str, iBaseResponseCallback);
            ReleaseLogUtil.d("R_IntellLifeCloudDevice", "getDevicesFromCloud isGettingDevice ", Boolean.valueOf(this.d));
            if (this.d) {
                return;
            }
            this.d = true;
            try {
                if (!c(BaseApplication.getContext(), str)) {
                    LogUtil.a("IntellLifeCloudDevice", "getDevicesFromCloud isLessTenMinutes");
                    synchronized (obj) {
                        Iterator<Map.Entry<String, IBaseResponseCallback>> it = this.h.entrySet().iterator();
                        while (it.hasNext()) {
                            d(it.next().getValue(), 0);
                        }
                        this.h.clear();
                    }
                    this.d = false;
                    return;
                }
                this.f41507b = false;
                c(str);
                this.d = false;
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        }
    }

    private void d(IBaseResponseCallback iBaseResponseCallback, int i) {
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(i, this.i);
        } else {
            LogUtil.j("IntellLifeCloudDevice", "callbackResponse callback is null");
        }
    }

    private void c(String str) {
        ReleaseLogUtil.d("R_IntellLifeCloudDevice", "getDevicesFromCloudData start, mode ", str);
        List<DeviceProfile> devices = ProfileAgent.PROFILE_AGENT.getClientAgent().getDevices(true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        this.i = devices;
        if (devices != null) {
            ReleaseLogUtil.d("R_IntellLifeCloudDevice", "getDevicesFromCloudData getDevices success, mode ", str);
            synchronized (f41505a) {
                Iterator<Map.Entry<String, IBaseResponseCallback>> it = this.h.entrySet().iterator();
                while (it.hasNext()) {
                    d(it.next().getValue(), 0);
                }
                this.h.clear();
            }
            KeyValDbManager.d(BaseApplication.getContext()).b("profile_devices_last_query_time_01" + str, String.valueOf(System.currentTimeMillis()));
            return;
        }
        ReleaseLogUtil.d("R_IntellLifeCloudDevice", "getDevicesFromCloudData null, isRetryGetDevice:", Boolean.valueOf(this.f41507b));
        if (this.f41507b) {
            synchronized (f41505a) {
                Iterator<Map.Entry<String, IBaseResponseCallback>> it2 = this.h.entrySet().iterator();
                while (it2.hasNext()) {
                    d(it2.next().getValue(), -1);
                }
                this.h.clear();
            }
            KeyValDbManager.d(BaseApplication.getContext()).b("profile_devices_last_query_time_01" + str, String.valueOf(System.currentTimeMillis()));
            return;
        }
        try {
            Thread.sleep(20000L);
        } catch (InterruptedException e2) {
            LogUtil.e("IntellLifeCloudDevice", "InterruptedException: ", e2.getMessage());
        }
        this.f41507b = true;
        c(str);
    }

    private boolean c(Context context, String str) {
        if (!CommonUtil.af(context)) {
            LogUtil.a("IntellLifeCloudDevice", "beta isMoreTenMinutes true");
            return true;
        }
        if (context == null) {
            LogUtil.j("IntellLifeCloudDevice", "isMoreTenMinutes context is null");
            return false;
        }
        String strC = KeyValDbManager.d(context).c("profile_devices_last_query_time_01" + str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(strC)) {
            LogUtil.a("IntellLifeCloudDevice", "nowTime:", Long.valueOf(jCurrentTimeMillis), " lastScanTime:", strC);
            if (jCurrentTimeMillis - CommonUtil.m(context, strC) <= 600000.0f) {
                return false;
            }
            KeyValDbManager.d(context).b("profile_devices_last_query_time_01" + str, String.valueOf(jCurrentTimeMillis));
            return true;
        }
        LogUtil.a("IntellLifeCloudDevice", "first update nowTime:", Long.valueOf(jCurrentTimeMillis));
        KeyValDbManager.d(context).b("profile_devices_last_query_time_01" + str, String.valueOf(jCurrentTimeMillis));
        return true;
    }
}
