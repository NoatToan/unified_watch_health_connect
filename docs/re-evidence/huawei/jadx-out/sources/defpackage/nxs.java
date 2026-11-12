package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.btsportdevice.callback.MessageOrStateCallback;
import com.huawei.health.device.model.DeviceInformation;
import com.huawei.hiai.awareness.client.AwarenessRequest;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class nxs {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile nxs f43912c;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private nxd f43913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f43914b;

    private nxs() {
    }

    public static nxs d() {
        nxs nxsVar;
        if (f43912c == null) {
            synchronized (e) {
                if (f43912c == null) {
                    f43912c = new nxs();
                }
                nxsVar = f43912c;
            }
            return nxsVar;
        }
        return f43912c;
    }

    public void f() {
        ReleaseLogUtil.d("R_EcologyDevice_FitnessDeviceManager", "initBackground()");
        if (this.f43913a instanceof nxh) {
            return;
        }
        nxh nxhVar = new nxh();
        this.f43913a = nxhVar;
        nxhVar.h();
    }

    public void e() {
        LogUtil.d("FitnessDeviceManager", "init()");
        nxd nxdVar = this.f43913a;
        if (nxdVar == null || (nxdVar instanceof nxh)) {
            nxd nxdVar2 = new nxd();
            this.f43913a = nxdVar2;
            nxdVar2.h();
        }
    }

    public void a(String str, MessageOrStateCallback messageOrStateCallback) {
        if (this.f43913a != null) {
            LogUtil.d("FitnessDeviceManager", "callbackKey=" + str);
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
            nxd nxdVar = new nxd();
            this.f43913a = nxdVar;
            nxdVar.h();
        }
        this.f43913a.e(str, messageOrStateCallback);
    }

    public void a(boolean z) {
        ReleaseLogUtil.d("R_EcologyDevice_FitnessDeviceManager", AwarenessRequest.MessageType.DISCONNECT);
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.disconnect(z);
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public void e(boolean z, String str) {
        if (this.f43913a != null && !TextUtils.isEmpty(str)) {
            this.f43913a.connectByMac(z, str);
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public boolean j() {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            return nxdVar.reConnect();
        }
        LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        return false;
    }

    public void c(boolean z, String str) {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.connectByName(z, str);
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public void a(String str, String str2) {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.e(str, str2);
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public void o() {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.o();
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public DeviceInformation a() {
        nxd nxdVar = this.f43913a;
        DeviceInformation deviceInformationJ = nxdVar != null ? nxdVar.j() : null;
        return deviceInformationJ == null ? new DeviceInformation() : deviceInformationJ;
    }

    public void l() {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.l();
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public void k() {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.k();
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public void b() {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.cancelPairing();
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public void d(byte[] bArr) {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.sendByteToEquip(bArr);
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public void c(int[] iArr) {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.d(iArr);
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public void e(Map<String, String> map) {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.d(map);
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public void e(int i, int[] iArr) {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.e(i, iArr);
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    @Deprecated
    public void d(int i, int[] iArr) {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.setFitnessMachineControl(i, iArr);
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public void d(int i, int i2, int[] iArr) {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.setFitnessMachineControl(i, i2, iArr);
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public boolean c(int i, int i2) {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            return nxdVar.a(i, i2);
        }
        LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        return false;
    }

    public void d(int i) {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.setHeartRateFromWearable(i);
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public void n() {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.setRealStartWorkout();
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public String c() {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            return nxdVar.getCurrentMacAddress();
        }
        LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        return "";
    }

    public void d(String str, boolean z) {
        if (this.f43913a != null) {
            LogUtil.a("FitnessDeviceManager", "releaseResource, callbackKey = ", str);
            this.f43913a.removeMessageOrStateCallback(str, z);
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public void m() {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.releaseResource();
            this.f43913a = null;
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public void q() {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.stopThreadsInCsafeController();
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public void d(boolean z) {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.setHasExperiencedStateOfStartForFtmp(z);
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public void a(String str) {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.setDeviceType(str);
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public void b(boolean z) {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.d(z);
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public boolean g() {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            return nxdVar.m();
        }
        LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        return false;
    }

    public void r() {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.t();
        } else {
            LogUtil.e("FitnessDeviceManager", "mFitnessClient is null");
        }
    }

    public boolean h() {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            return nxdVar.f();
        }
        return false;
    }

    public void d(String str) {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            nxdVar.a(str);
        }
    }

    public boolean i() {
        return this.f43914b;
    }

    public void c(boolean z) {
        this.f43914b = z;
    }

    public boolean c(Bundle bundle) {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            return nxdVar.a(bundle);
        }
        LogUtil.j("FitnessDeviceManager", "mFitnessClient is null");
        return false;
    }

    public boolean b(Bundle bundle) {
        nxd nxdVar = this.f43913a;
        if (nxdVar != null) {
            return nxdVar.e(bundle);
        }
        LogUtil.j("FitnessDeviceManager", "mFitnessClient is null");
        return false;
    }
}
