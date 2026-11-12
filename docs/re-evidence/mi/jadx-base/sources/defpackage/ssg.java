package defpackage;

import com.miui.tsmclient.entity.MifareTag;
import com.miui.tsmclient.entity.ProbeParam;
import com.miui.tsmclient.entity.SectorKey;
import com.miui.tsmclient.sesdk.MifareClassicTag;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.bean.CardSwitcherBean;
import com.xiaomi.fitness.nfc.bean.NfcResponse;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ssg implements byc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s10 f33947a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static ssg f33948a = new ssg();
    }

    public interface b<T> {
        void onResult(T t);
    }

    public ssg() {
    }

    public static ssg u() {
        return a.f33948a;
    }

    @Override // defpackage.byc
    public int a(String str) throws Exception {
        s10 s10Var = this.f33947a;
        if (s10Var == null) {
            return 0;
        }
        return s10Var.a(str);
    }

    @Override // defpackage.byc
    public void b(String str, int i, int i2, int i3, y64.o oVar) {
        s10 s10Var = this.f33947a;
        if (s10Var == null) {
            return;
        }
        s10Var.b(str, i, i2, i3, oVar);
    }

    @Override // defpackage.byc
    public synchronized NfcResponse c(int i, byte[] bArr) throws Exception {
        s10 s10Var = this.f33947a;
        if (s10Var == null) {
            return null;
        }
        return s10Var.c(i, bArr);
    }

    @Override // defpackage.byc
    public void checkCRSStatus(b bVar) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (this.f33947a == null) {
            v(wearableDeviceModel);
        }
        this.f33947a.checkCRSStatus(bVar);
    }

    @Override // defpackage.byc
    public void closeTai(b<Boolean> bVar) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (this.f33947a == null) {
            v(wearableDeviceModel);
        }
        this.f33947a.closeTai(bVar);
    }

    @Override // defpackage.byc
    public void d(wrg wrgVar) {
        s10 s10Var = this.f33947a;
        if (s10Var == null) {
            return;
        }
        s10Var.d(wrgVar);
    }

    @Override // defpackage.byc
    public void e(boolean z, wrg[] wrgVarArr) {
        s10 s10Var = this.f33947a;
        if (s10Var == null) {
            return;
        }
        s10Var.e(z, wrgVarArr);
    }

    @Override // defpackage.byc
    public void f(String str, int i) {
        s10 s10Var = this.f33947a;
        if (s10Var == null) {
            return;
        }
        s10Var.f(str, i);
    }

    @Override // defpackage.byc
    public NfcResponse g(byte[] bArr) throws Exception {
        s10 s10Var = this.f33947a;
        if (s10Var == null) {
            return null;
        }
        return s10Var.g(bArr);
    }

    @Override // defpackage.byc
    public void h(String str, int i, int i2, int i3) {
        s10 s10Var = this.f33947a;
        if (s10Var == null) {
            return;
        }
        s10Var.h(str, i, i2, i3);
    }

    @Override // defpackage.byc
    public String i() throws Exception {
        s10 s10Var = this.f33947a;
        if (s10Var == null) {
            return null;
        }
        return s10Var.i();
    }

    @Override // defpackage.byc
    public boolean j(String str, int i) throws Exception {
        s10 s10Var = this.f33947a;
        if (s10Var == null) {
            return false;
        }
        return s10Var.j(str, i);
    }

    @Override // defpackage.byc
    public boolean k() {
        s10 s10Var = this.f33947a;
        if (s10Var == null) {
            return false;
        }
        return s10Var.k();
    }

    @Override // defpackage.byc
    public CardSwitcherBean l(String str, int i) throws Exception {
        s10 s10Var = this.f33947a;
        if (s10Var == null) {
            return null;
        }
        return s10Var.l(str, i);
    }

    @Override // defpackage.byc
    public MifareClassicTag m(List<SectorKey> list) throws Exception {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (this.f33947a == null) {
            v(wearableDeviceModel);
        }
        return this.f33947a.m(list);
    }

    @Override // defpackage.byc
    public int n(int i, int i2, String str, String str2) {
        s10 s10Var = this.f33947a;
        if (s10Var == null) {
            return 0;
        }
        return s10Var.n(i, i2, str, str2);
    }

    @Override // defpackage.byc
    public void o(wrg wrgVar) {
        s10 s10Var = this.f33947a;
        if (s10Var == null) {
            return;
        }
        s10Var.o(wrgVar);
    }

    @Override // defpackage.byc
    public void openTai(b<Boolean> bVar) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (this.f33947a == null) {
            v(wearableDeviceModel);
        }
        this.f33947a.openTai(bVar);
    }

    @Override // defpackage.byc
    public void p(String str, int i) {
        s10 s10Var = this.f33947a;
        if (s10Var == null) {
            return;
        }
        s10Var.p(str, i);
    }

    @Override // defpackage.byc
    public void pinStatus(b bVar) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (this.f33947a == null) {
            v(wearableDeviceModel);
        }
        this.f33947a.pinStatus(bVar);
    }

    @Override // defpackage.byc
    public hsg q(ProbeParam probeParam) throws Exception {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (this.f33947a == null) {
            v(wearableDeviceModel);
        }
        return this.f33947a.q(probeParam);
    }

    @Override // defpackage.byc
    public MifareTag r(int i) throws Exception {
        s10 s10Var = this.f33947a;
        if (s10Var == null) {
            return null;
        }
        return s10Var.r(i);
    }

    public void s() {
        s10 s10Var = this.f33947a;
        if (s10Var != null) {
            s10Var.s();
            this.f33947a = null;
        }
    }

    public int t() {
        if (this.f33947a == null) {
            return bmg.f4367b;
        }
        try {
            vqg.d("getCapability start");
            int iT = this.f33947a.t();
            vqg.d("getCapability end = " + iT);
            return iT;
        } catch (Exception e) {
            vqg.c("getCapability error", e);
            return bmg.f4367b;
        }
    }

    public void v(WearableDeviceModel wearableDeviceModel) {
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            this.f33947a = new zic(wearableDeviceModel);
        } else {
            this.f33947a = new y64(wearableDeviceModel);
        }
    }

    public void w() {
        s10 s10Var = this.f33947a;
        if (s10Var != null) {
            s10Var.u();
        }
    }

    public yrg.a x(yrg.a aVar) throws Exception {
        s10 s10Var = this.f33947a;
        if (s10Var == null) {
            return null;
        }
        return s10Var.v(aVar);
    }
}
