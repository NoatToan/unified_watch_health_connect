package defpackage;

import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsport.helper.DeviceInterface;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes15.dex */
public class pqm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<Long, IBaseResponseCallback> f45842b;
    private DeviceInterface d;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final pqm f45843a = new pqm();
    }

    private pqm() {
        this.f45842b = new ConcurrentHashMap<>();
    }

    public static pqm a() {
        return a.f45843a;
    }

    public void a(DeviceInterface deviceInterface) {
        LogUtil.a("Track_HWhealthLinkage_DeviceStateHelper", "registerCallback");
        this.d = deviceInterface;
        c(deviceInterface);
    }

    public void e(IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("Track_HWhealthLinkage_DeviceStateHelper", "getSportState ", this.d);
        if (this.d != null) {
            ReleaseLogUtil.d("Track_HWhealthLinkage_DeviceStateHelper", "getSportState ", "into");
            this.d.getOperator(iBaseResponseCallback);
        } else {
            this.f45842b.put(Long.valueOf(System.currentTimeMillis()), iBaseResponseCallback);
        }
    }

    public void b(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Track_HWhealthLinkage_DeviceStateHelper", "getDeviceStepRateAlgorithmEnterprise ", this.d);
        DeviceInterface deviceInterface = this.d;
        if (deviceInterface != null) {
            deviceInterface.getDeviceStepRateAlgorithmEnterprise(iBaseResponseCallback);
        }
    }

    public void e(String str, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Track_HWhealthLinkage_DeviceStateHelper", "setBoltWearStatusListener ");
        DeviceInterface deviceInterface = this.d;
        if (deviceInterface != null) {
            deviceInterface.setBoltWearStatusListener(str, iBaseResponseCallback);
        }
    }

    public void d(String str) {
        LogUtil.a("Track_HWhealthLinkage_DeviceStateHelper", "unreg AbnormalStatus");
        DeviceInterface deviceInterface = this.d;
        if (deviceInterface != null) {
            deviceInterface.unregBoltWearStatusListener(str);
        }
    }

    private void c(DeviceInterface deviceInterface) {
        if (this.f45842b.isEmpty()) {
            ReleaseLogUtil.e("Track_HWhealthLinkage_DeviceStateHelper", "mSavedActionMap is empty");
            return;
        }
        for (Map.Entry<Long, IBaseResponseCallback> entry : this.f45842b.entrySet()) {
            if (System.currentTimeMillis() - entry.getKey().longValue() < 1000) {
                ReleaseLogUtil.e("Track_HWhealthLinkage_DeviceStateHelper", "mSavedActionMap getOperator");
                deviceInterface.getOperator(entry.getValue());
            }
        }
        this.f45842b.clear();
    }
}
