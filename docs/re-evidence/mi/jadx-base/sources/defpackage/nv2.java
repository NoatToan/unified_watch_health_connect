package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.smarthome.core.ota.OTAException;
import com.smarthome.core.scan.BleSearchResponse;
import com.smarthome.core.scan.DeviceScanManager;
import com.smarthome.core.scan.SDKBleDevice;
import com.xiaomi.smarthome.bluetooth.Response;
import com.xiaomi.smarthome.cache.BleCacheManager;
import com.xiaomi.smarthome.cache.SmartConfigCache;
import com.xiaomi.smarthome.core.entity.device.BtDevice;
import com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetError;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.device.api.BleMeshFirmwareUpdateInfo;
import com.xiaomi.smarthome.device.api.Callback;
import com.xiaomi.smarthome.device.api.McuUpdateInfo;
import com.xiaomi.smarthome.library.bluetooth.OTAErrorCode;
import com.xiaomi.smarthome.library.bluetooth.connect.Code;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class nv2 extends j0d {
    public static int w = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Device f28393b;
    public BleMeshFirmwareUpdateInfo c;
    public int d;
    public volatile boolean e;
    public i0d f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f28395r;
    public boolean t;
    public Context u;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f28394k = null;
    public long l = -1;
    public long m = -1;
    public long n = -1;
    public int p = -1;
    public Handler q = new k(Looper.getMainLooper());
    public Map<Integer, Long> s = new HashMap();
    public int v = -1;

    public class a implements bua<String, o5h<String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f28396a;

        /* JADX INFO: renamed from: nv2$a$a, reason: collision with other inner class name */
        public class C1054a implements j5h<String> {

            /* JADX INFO: renamed from: nv2$a$a$a, reason: collision with other inner class name */
            public class C1055a implements Response.FirmwareUpgradeResponse {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f28399a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ v4h f28400b;

                public C1055a(long j, v4h v4hVar) {
                    this.f28399a = j;
                    this.f28400b = v4hVar;
                }

                @Override // com.xiaomi.smarthome.bluetooth.Response.ProgressResponse
                public void onProgress(int i) {
                    nv2.this.h0("downloadFirmware,progress:" + i, new Object[0]);
                }

                @Override // com.xiaomi.smarthome.bluetooth.Response.FirmwareUpgradeResponse
                public void onResponse(int i, String str, String str2) {
                    String str3 = nv2.this.f0() ? nv2.this.i : nv2.this.c.md5;
                    nv2.this.h0("download firmware ,remote md5 %s,download fileMd5 %s", str3, str2);
                    if (i != 0 || TextUtils.isEmpty(str)) {
                        nv2.this.h0(String.format("downloadFirmware failed,error code: %d , path: %s", Integer.valueOf(i), str), new Object[0]);
                        this.f28400b.onError(new OTAException(OTAErrorCode.DOWNLOAD_FAIL));
                        return;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f28399a;
                    nv2.this.f.showLog("下载固件时间" + (jCurrentTimeMillis / 1000) + "秒");
                    File file = new File(str);
                    if (file.exists()) {
                        nv2.this.f.showLog("固件大小" + (file.length() / 1024) + "kb");
                    }
                    if (str3 != null && (TextUtils.isEmpty(str3) || !str3.equals(str2))) {
                        this.f28400b.onError(new OTAException(OTAErrorCode.DOWNLOAD_MD5_NOT_EQUAL));
                        return;
                    }
                    this.f28400b.onNext(str);
                    this.f28400b.onComplete();
                    nv2.this.f.showLog("固件md5 校验通过");
                    nv2.this.s.put(4, Long.valueOf(jCurrentTimeMillis));
                }
            }

            public C1054a() {
            }

            @Override // defpackage.j5h
            public void subscribe(v4h<String> v4hVar) throws Exception {
                nv2.this.h0("start downloadFirmware ", new Object[0]);
                if (nv2.this.e) {
                    v4hVar.onError(new OTAException(2));
                    return;
                }
                if (nv2.this.c == null && !nv2.this.f0()) {
                    v4hVar.onError(new OTAException(1));
                    return;
                }
                nv2.this.l0(1);
                nv2 nv2Var = nv2.this;
                nv2Var.f22290a = 1;
                String str = TextUtils.isEmpty(nv2Var.g) ? nv2.this.c.safeUrl : nv2.this.g;
                if (!TextUtils.isEmpty(str)) {
                    nv2.this.a(str, new C1055a(System.currentTimeMillis(), v4hVar));
                } else {
                    nv2.this.h0("start download Firmware,but url is null!", new Object[0]);
                    v4hVar.onError(new OTAException(OTAErrorCode.DOWNLOAD_URL_IS_EMPTY));
                }
            }
        }

        public a(long j) {
            this.f28396a = j;
        }

        @Override // defpackage.bua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o5h<String> apply(String str) throws Exception {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f28396a;
            if (jCurrentTimeMillis > 1000) {
                nv2.this.s.put(1, Long.valueOf(jCurrentTimeMillis));
            }
            return o4h.f(new C1054a());
        }
    }

    public class a0 implements bua<Boolean, o5h<Boolean>> {
        public a0() {
        }

        @Override // defpackage.bua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o5h<Boolean> apply(Boolean bool) throws Exception {
            if (!bool.booleanValue()) {
                return nv2.this.Y(false);
            }
            nv2 nv2Var = nv2.this;
            return nv2Var.V(nv2Var.f28393b);
        }
    }

    public class b implements bua<String, o5h<String>> {
        public b() {
        }

        @Override // defpackage.bua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o5h<String> apply(String str) throws Exception {
            return TextUtils.isEmpty(str) ? nv2.this.Z() : nv2.this.k0(str);
        }
    }

    public class b0 implements bua<Boolean, o5h<Boolean>> {
        public b0() {
        }

        @Override // defpackage.bua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o5h<Boolean> apply(Boolean bool) throws Exception {
            if (!bool.booleanValue()) {
                return nv2.this.Y(false);
            }
            nv2 nv2Var = nv2.this;
            return nv2Var.X(nv2Var.f28393b);
        }
    }

    public class c implements bua<Boolean, o5h<String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BleMeshFirmwareUpdateInfo f28404a;

        public c(BleMeshFirmwareUpdateInfo bleMeshFirmwareUpdateInfo) {
            this.f28404a = bleMeshFirmwareUpdateInfo;
        }

        @Override // defpackage.bua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o5h<String> apply(Boolean bool) throws Exception {
            McuUpdateInfo mcuUpdateInfo = this.f28404a.mcuUpdateInfo;
            if (mcuUpdateInfo != null && nv2.this.e0()) {
                return nv2.this.g0(mcuUpdateInfo.url, mcuUpdateInfo.md5);
            }
            nv2.this.h0("mcuUpdateInfo is null or current mcu version latest, no need mcu upgrade", new Object[0]);
            return nv2.this.Z();
        }
    }

    public class c0 implements bua<String, o5h<Boolean>> {

        public class a implements j5h<Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f28407a;

            /* JADX INFO: renamed from: nv2$c0$a$a, reason: collision with other inner class name */
            public class C1056a implements IBleMeshUpgradeResponse {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f28409a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ v4h f28410b;

                public C1056a(int i, v4h v4hVar) {
                    this.f28409a = i;
                    this.f28410b = v4hVar;
                }

                @Override // android.os.IInterface
                public IBinder asBinder() {
                    return null;
                }

                @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse
                public boolean isMeshDevice() {
                    return nv2.this.f28395r == 5;
                }

                @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse
                public void onProgress(int i) {
                    if (nv2.this.v != i) {
                        nv2.this.v = i;
                        nv2.this.h0("startBleMeshUpgrade, progress:" + i, new Object[0]);
                        if (i <= 100) {
                            int i2 = this.f28409a;
                            nv2.this.f.showProgress((100 - i2) + ((i2 * i) / 100));
                        }
                        if (i == 100) {
                            nv2.this.f.onInstalling();
                        }
                        if (nv2.this.m <= 0 || i <= 99) {
                            return;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis() - nv2.this.m;
                        nv2.this.m = -1L;
                        nv2.this.f.showLog("ota 固件传输成功到开始切换固件耗时：" + (jCurrentTimeMillis / 1000) + "秒");
                        nv2.this.s.put(5, Long.valueOf(jCurrentTimeMillis));
                        nv2.this.n = System.currentTimeMillis();
                    }
                }

                @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse
                public void onResponse(int i, String str) {
                    nv2.this.l0(0);
                    if (i == 0) {
                        this.f28410b.onNext(Boolean.TRUE);
                        this.f28410b.onComplete();
                    } else {
                        String str2 = String.format("upgrade error,error code:%d", Integer.valueOf(i));
                        nv2.this.h0(str2, new Object[0]);
                        this.f28410b.onError(new OTAException(i, str2));
                    }
                }
            }

            public a(String str) {
                this.f28407a = str;
            }

            @Override // defpackage.j5h
            public void subscribe(v4h<Boolean> v4hVar) throws Exception {
                if (!nv2.this.d0()) {
                    nv2 nv2Var = nv2.this;
                    nv2Var.h0("current firmware version(%s) is latest, and no need firmware upgrade ", nv2Var.o);
                    v4hVar.onNext(Boolean.FALSE);
                    v4hVar.onComplete();
                    return;
                }
                nv2.this.h0("startBleMeshUpgrade ", new Object[0]);
                if (nv2.this.e) {
                    v4hVar.onError(new OTAException(2));
                    return;
                }
                nv2.this.l0(2);
                nv2.this.m = System.currentTimeMillis();
                BluetoothService.getInstance(nv2.this.u).startBleMeshUpgrade(nv2.this.f28393b.mac, nv2.this.f28393b.did, nv2.this.o, this.f28407a, new C1056a(nv2.this.p > 0 ? 100 - nv2.this.p : 100, v4hVar));
            }
        }

        public c0() {
        }

        @Override // defpackage.bua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o5h<Boolean> apply(String str) throws Exception {
            if (new File(str).exists()) {
                return o4h.f(new a(str));
            }
            throw new Exception("upgrade file not exist.");
        }
    }

    public class d implements bua<Device, o5h<Boolean>> {
        public d() {
        }

        @Override // defpackage.bua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o5h<Boolean> apply(Device device) throws Exception {
            return nv2.this.W(device, true);
        }
    }

    public static class d0 extends Exception {
        public d0(String str) {
            super(str);
        }
    }

    public class e implements j5h<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28412a;

        public class a implements IBleMeshUpgradeResponse {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f28414a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v4h f28415b;
            public final /* synthetic */ boolean c;

            public a(int i, v4h v4hVar, boolean z) {
                this.f28414a = i;
                this.f28415b = v4hVar;
                this.c = z;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse
            public boolean isMeshDevice() {
                return nv2.this.f28395r == 5;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse
            public void onProgress(int i) {
                if (nv2.this.e) {
                    return;
                }
                nv2.this.h0("send mcu data ,progress=" + i, new Object[0]);
                if (i <= 0 || i >= 100) {
                    return;
                }
                nv2.this.f.showProgress((this.f28414a * i) / 100);
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse
            public void onResponse(int i, String str) {
                if (nv2.this.e) {
                    return;
                }
                if (i == 0) {
                    nv2.this.h0("mcu upgrade success!", new Object[0]);
                    nv2.this.q.removeMessages(1);
                    this.f28415b.onNext("not empty");
                    this.f28415b.onComplete();
                    return;
                }
                if (i != 4) {
                    nv2.this.h0("mcu upgrade fail, code=%d,msg =%s", Integer.valueOf(i), str);
                    this.f28415b.onError(new OTAException(i, str));
                } else if (!this.c) {
                    nv2.this.f.onInstalling();
                } else {
                    nv2.this.p = 40;
                    nv2.this.q.sendEmptyMessageDelayed(1, 1500L);
                }
            }
        }

        public e(String str) {
            this.f28412a = str;
        }

        @Override // defpackage.j5h
        public void subscribe(v4h<String> v4hVar) throws Exception {
            if (!new File(this.f28412a).exists()) {
                nv2.this.h0("local mcu file not exist", new Object[0]);
                v4hVar.onError(new OTAException(OTAErrorCode.LOCAL_MCU_FILE_NOT_EXIST));
                return;
            }
            McuUpdateInfo mcuUpdateInfo = nv2.this.c.mcuUpdateInfo;
            boolean zD0 = nv2.this.d0();
            int i = !zD0 ? 100 : 40;
            nv2 nv2Var = nv2.this;
            nv2Var.h0("startMcuUpgrade, current mcu version %s, currentFirmware Version %s", mcuUpdateInfo.currentMcuVersion, nv2Var.o);
            nv2.this.l0(2);
            BluetoothService.getInstance(nv2.this.u).startMcuUpgrade(nv2.this.f28393b.mac, mcuUpdateInfo.currentMcuVersion, nv2.this.o, zD0, this.f28412a, nv2.this.c.timeout, new a(i, v4hVar, zD0));
        }
    }

    public class f implements j5h<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28417b;

        public class a implements Response.FirmwareUpgradeResponse {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ v4h f28418a;

            public a(v4h v4hVar) {
                this.f28418a = v4hVar;
            }

            @Override // com.xiaomi.smarthome.bluetooth.Response.ProgressResponse
            public void onProgress(int i) {
                nv2.this.h0("download mcu firmware progress =" + i, new Object[0]);
            }

            @Override // com.xiaomi.smarthome.bluetooth.Response.FirmwareUpgradeResponse
            public void onResponse(int i, String str, String str2) {
                if (i != 0 || TextUtils.isEmpty(str)) {
                    this.f28418a.onError(new OTAException(OTAErrorCode.DOWNLOAD_MCU_FIRMWARE_FAIL));
                } else if (!TextUtils.isEmpty(f.this.f28417b) && !TextUtils.equals(f.this.f28417b, str2)) {
                    this.f28418a.onError(new OTAException(OTAErrorCode.MCU_CHECK_MD5_NOT_EQUAL));
                } else {
                    this.f28418a.onNext(str);
                    this.f28418a.onComplete();
                }
            }
        }

        public f(String str, String str2) {
            this.f28416a = str;
            this.f28417b = str2;
        }

        @Override // defpackage.j5h
        public void subscribe(v4h<String> v4hVar) throws Exception {
            nv2.this.h0("start download mcu firmware,mcuUrl=%s,fileMd5=%s", this.f28416a, this.f28417b);
            nv2.this.l0(1);
            nv2.this.a(this.f28416a, new a(v4hVar));
        }
    }

    public class g implements j5h<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Device f28420a;

        public g(Device device) {
            this.f28420a = device;
        }

        @Override // defpackage.j5h
        public void subscribe(v4h<Boolean> v4hVar) throws Exception {
            if (!nv2.this.c0()) {
                nv2 nv2Var = nv2.this;
                nv2Var.U(this.f28420a, nv2Var.f28395r, v4hVar);
            } else {
                nv2.this.h0("ble Connect:already connected", new Object[0]);
                v4hVar.onNext(Boolean.TRUE);
                v4hVar.onComplete();
            }
        }
    }

    public class h implements Response.BleConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Device f28423b;
        public final /* synthetic */ v4h c;

        public h(String str, Device device, v4h v4hVar) {
            this.f28422a = str;
            this.f28423b = device;
            this.c = v4hVar;
        }

        @Override // com.xiaomi.smarthome.bluetooth.Response.BleResponse
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, Bundle bundle) {
            if (-10 == i) {
                f23.j(this.f28422a);
                nv2.this.U(this.f28423b, 0, this.c);
                return;
            }
            if (i == 0) {
                this.c.onNext(Boolean.TRUE);
                this.c.onComplete();
                return;
            }
            nv2.this.h0(String.format("%s ,connect  fail,secureConnect, error code %d", "Ble-OTA", Integer.valueOf(i)), new Object[0]);
            String string = Code.toString(i);
            nv2.this.f.showLog("blue tooth error: code " + i + ",msg:" + string);
            this.c.onError(new OTAException(i, i + ":" + string));
        }
    }

    public class i implements Response.BleConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v4h f28424a;

        public i(v4h v4hVar) {
            this.f28424a = v4hVar;
        }

        @Override // com.xiaomi.smarthome.bluetooth.Response.BleResponse
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, Bundle bundle) {
            if (i == 0) {
                this.f28424a.onNext(Boolean.TRUE);
                this.f28424a.onComplete();
                return;
            }
            nv2.this.h0(String.format("%s ,connect fail,securityChipConnect, error code %d", "Ble-OTA", Integer.valueOf(i)), new Object[0]);
            String string = Code.toString(i);
            nv2.this.f.showLog("blue tooth error: code " + i + ",msg:" + string);
            this.f28424a.onError(new OTAException(i, i + ":" + string));
        }
    }

    public class j implements Response.BleConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v4h f28426a;

        public j(v4h v4hVar) {
            this.f28426a = v4hVar;
        }

        @Override // com.xiaomi.smarthome.bluetooth.Response.BleResponse
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, Bundle bundle) {
            if (i == 0) {
                this.f28426a.onNext(Boolean.TRUE);
                this.f28426a.onComplete();
                return;
            }
            nv2.this.h0(String.format("%s ,connect fail,securityChipSharedDeviceConnect, error code %d", "Ble-OTA", Integer.valueOf(i)), new Object[0]);
            String string = Code.toString(i);
            nv2.this.f.showLog("blue tooth error: code " + i + ",msg:" + string);
            this.f28426a.onError(new OTAException(i, i + ":" + string));
        }
    }

    public class k extends Handler {
        public k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1 || nv2.this.p >= 60) {
                return;
            }
            nv2.this.p++;
            nv2.this.f.showProgress(nv2.this.p);
            nv2.this.q.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    public class l implements Response.BleConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v4h f28429a;

        public l(v4h v4hVar) {
            this.f28429a = v4hVar;
        }

        @Override // com.xiaomi.smarthome.bluetooth.Response.BleResponse
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, Bundle bundle) {
            if (i == 0) {
                this.f28429a.onNext(Boolean.TRUE);
                this.f28429a.onComplete();
                return;
            }
            nv2.this.h0(String.format("%s ,connect  fail,normal connect, error code %d", "Ble-OTA", Integer.valueOf(i)), new Object[0]);
            String string = Code.toString(i);
            nv2.this.f.showLog("blue tooth error: code " + i + ",msg:" + string);
            this.f28429a.onError(new OTAException(i, i + ":" + string));
        }
    }

    public class m implements Response.BleConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v4h f28431a;

        public m(v4h v4hVar) {
            this.f28431a = v4hVar;
        }

        @Override // com.xiaomi.smarthome.bluetooth.Response.BleResponse
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, Bundle bundle) {
            if (i == 0) {
                this.f28431a.onNext(Boolean.TRUE);
                this.f28431a.onComplete();
                return;
            }
            nv2.this.h0(String.format("%s ,connect fail,bleStandardAuth connect, error code %d", "Ble-OTA", Integer.valueOf(i)), new Object[0]);
            String string = Code.toString(i);
            nv2.this.f.showLog("blue tooth error: code " + i + ",msg:" + string);
            this.f28431a.onError(new OTAException(i, i + ":" + string));
        }
    }

    public class n implements Response.BleConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v4h f28433a;

        public n(v4h v4hVar) {
            this.f28433a = v4hVar;
        }

        @Override // com.xiaomi.smarthome.bluetooth.Response.BleResponse
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, Bundle bundle) {
            if (i == 0) {
                this.f28433a.onNext(Boolean.TRUE);
                this.f28433a.onComplete();
                return;
            }
            nv2.this.h0(String.format("%s ,connect fail,bleMesh connect, error code %d", "Ble-OTA", Integer.valueOf(i)), new Object[0]);
            String string = Code.toString(i);
            nv2.this.f.showLog("blue tooth error: code " + i + ",msg:" + string);
            this.f28433a.onError(new OTAException(i, i + ":" + string));
        }
    }

    public class o implements j5h<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Device f28435a;

        public o(Device device) {
            this.f28435a = device;
        }

        @Override // defpackage.j5h
        public void subscribe(v4h<Boolean> v4hVar) throws Exception {
            if (nv2.this.c0()) {
                nv2.this.h0("start disconnect", new Object[0]);
                f23.f(this.f28435a.mac);
            } else {
                nv2.this.h0("disconnect:already disconnected", new Object[0]);
            }
            v4hVar.onNext(Boolean.TRUE);
            v4hVar.onComplete();
        }
    }

    public class p implements j5h<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f28437a;

        public p(boolean z) {
            this.f28437a = z;
        }

        @Override // defpackage.j5h
        public void subscribe(v4h<Boolean> v4hVar) throws Exception {
            v4hVar.onNext(Boolean.valueOf(this.f28437a));
            v4hVar.onComplete();
        }
    }

    public class q implements j5h<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Device f28439a;

        public class a implements Response.BleReadFirmwareVersionResponse {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ v4h f28441a;

            public a(v4h v4hVar) {
                this.f28441a = v4hVar;
            }

            @Override // com.xiaomi.smarthome.bluetooth.Response.BleResponse
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i, String str) {
                if (i == 0) {
                    nv2.this.h0("ota read ble version %s", str);
                    q.this.f28439a.setVersion(str);
                    nv2.this.o = str;
                    this.f28441a.onNext(str);
                    this.f28441a.onComplete();
                    return;
                }
                nv2.this.h0(String.format("read version error, code:%d", Integer.valueOf(i)), new Object[0]);
                this.f28441a.onError(new OTAException(OTAErrorCode.READ_FRIMWARE_VERSION_FAIL, "read firmware version fail,code=" + i));
            }
        }

        public q(Device device) {
            this.f28439a = device;
        }

        @Override // defpackage.j5h
        public void subscribe(v4h<String> v4hVar) throws Exception {
            f23.h(this.f28439a.mac, new a(v4hVar));
        }
    }

    public class r implements j5h<String> {
        public r() {
        }

        @Override // defpackage.j5h
        public void subscribe(v4h<String> v4hVar) throws Exception {
            nv2.this.h0("create null observable", new Object[0]);
            v4hVar.onNext("");
            v4hVar.onComplete();
        }
    }

    public class s implements j5h<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Device f28444a;

        public class a implements Callback<BleMeshFirmwareUpdateInfo> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ v4h f28446a;

            public a(v4h v4hVar) {
                this.f28446a = v4hVar;
            }

            @Override // com.xiaomi.smarthome.device.api.Callback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(BleMeshFirmwareUpdateInfo bleMeshFirmwareUpdateInfo) {
                if (bleMeshFirmwareUpdateInfo == null) {
                    this.f28446a.onError(new OTAException(1));
                    return;
                }
                nv2.this.h0("ota read online version ,update info =" + bleMeshFirmwareUpdateInfo.toString(), new Object[0]);
                nv2.this.c = bleMeshFirmwareUpdateInfo;
                if (nv2.this.c.mcuUpdateInfo != null) {
                    nv2.this.c.mcuUpdateInfo.currentMcuVersion = nv2.this.f28394k;
                }
                this.f28446a.onNext(Boolean.TRUE);
                this.f28446a.onComplete();
            }

            @Override // com.xiaomi.smarthome.device.api.Callback
            public void onFailure(int i, String str) {
                nv2.this.h0(String.format("requestUpdateInfo error, error code: %d ,errorMsg: %s", Integer.valueOf(i), str), new Object[0]);
                this.f28446a.onError(new OTAException(OTAErrorCode.READ_REMOTE_VERSION_INFO_FAIL, i + ":" + str));
            }
        }

        public s(Device device) {
            this.f28444a = device;
        }

        @Override // defpackage.j5h
        public void subscribe(v4h<Boolean> v4hVar) throws Exception {
            Device device = this.f28444a;
            f23.g(device.model, device.did, device.mac, new a(v4hVar));
        }
    }

    public class t implements bua<o4h<Throwable>, o5h<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AtomicInteger f28448a = new AtomicInteger(nv2.w);

        public class a implements bua<Throwable, o5h<?>> {
            public a() {
            }

            @Override // defpackage.bua
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public o5h<?> apply(Throwable th) throws Exception {
                nv2.this.h0("retry startScan after 3 seconds", new Object[0]);
                return o4h.b0(3L, TimeUnit.SECONDS);
            }
        }

        public class b implements i6i<Throwable> {
            public b() {
            }

            @Override // defpackage.i6i
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean test(Throwable th) throws Exception {
                if (!(th instanceof d0) || t.this.f28448a.getAndDecrement() <= 0) {
                    throw new Exception(th.getCause());
                }
                return true;
            }
        }

        public t() {
        }

        @Override // defpackage.bua
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public o5h<?> apply(o4h<Throwable> o4hVar) throws Exception {
            return o4hVar.W(new b()).r(new a());
        }
    }

    public class u implements j5h<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AtomicBoolean f28452a = new AtomicBoolean(false);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Device f28453b;

        public class a implements BleSearchResponse {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ v4h f28454a;

            /* JADX INFO: renamed from: nv2$u$a$a, reason: collision with other inner class name */
            public class C1057a extends BleAsyncCallback<Void, BleNetError> {
                public C1057a() {
                }

                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                public void onFailure(BleNetError bleNetError) {
                    nv2 nv2Var = nv2.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append("report ble firmware version fail, ");
                    sb.append(bleNetError != null ? bleNetError.getDetail() : "no detail message");
                    nv2Var.h0(sb.toString(), new Object[0]);
                }

                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                public void onSuccess(Void r3) {
                    nv2.this.f28393b.setVersion(nv2.this.c.version);
                    nv2.this.h0("report ble firmware version success", new Object[0]);
                }
            }

            public a(v4h v4hVar) {
                this.f28454a = v4hVar;
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onDeviceFounded(BtDevice btDevice) {
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onSearchCanceled() {
                if (u.this.f28452a.get()) {
                    return;
                }
                nv2.this.h0("onSearchCanceled: haven't found target device yet", new Object[0]);
                this.f28454a.onError(new d0("onSearchCanceled,haven't found target device yet"));
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onSearchStarted() {
                nv2.this.h0("onSearchStarted: start search", new Object[0]);
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onSearchStopped() {
                if (u.this.f28452a.get()) {
                    return;
                }
                nv2.this.h0("onSearchStopped: haven't found target device yet", new Object[0]);
                this.f28454a.onError(new d0("onSearchStopped,haven't found target device yet"));
            }

            @Override // com.smarthome.core.scan.BleSearchResponse
            public void onDeviceFounded(SDKBleDevice sDKBleDevice) {
                if (u.this.f28452a.get()) {
                    nv2.this.h0("onDeviceFounded: device already found,just ignore", new Object[0]);
                    return;
                }
                if (TextUtils.isEmpty(u.this.f28453b.mac) || !u.this.f28453b.mac.equalsIgnoreCase(sDKBleDevice.getMac())) {
                    return;
                }
                u.this.f28452a.set(true);
                if (nv2.this.c != null && nv2.this.f28393b != null) {
                    DeviceApi.reportCommonBleVersion(nv2.this.f28393b.did, nv2.this.c.version, new C1057a());
                    nv2 nv2Var = nv2.this;
                    nv2Var.h0("found device success, report ble firmware version=%s, did=%s", nv2Var.c.version, nv2.this.f28393b.did);
                }
                if (nv2.this.n > 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - nv2.this.n;
                    nv2.this.f.showLog("切换固件激活耗时：" + (jCurrentTimeMillis / 1000) + "秒");
                    nv2.this.s.put(6, Long.valueOf(jCurrentTimeMillis));
                }
                nv2.this.h0("onDeviceFounded: device found, upgrade success", new Object[0]);
                DeviceScanManager.INSTANCE.stopSearch();
                if (this.f28454a.isDisposed()) {
                    return;
                }
                this.f28454a.onNext(Boolean.TRUE);
                this.f28454a.onComplete();
            }
        }

        public u(Device device) {
            this.f28453b = device;
        }

        @Override // defpackage.j5h
        public void subscribe(v4h<Boolean> v4hVar) throws Exception {
            f23.n(5000, new a(v4hVar));
        }
    }

    public class v implements z5h<Boolean> {
        public v() {
        }

        @Override // defpackage.z5h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean bool) {
        }

        @Override // defpackage.z5h
        public void onComplete() {
            long jCurrentTimeMillis = System.currentTimeMillis() - nv2.this.l;
            nv2.this.l = -1L;
            nv2.this.f.showLog("读取远程版本号时间" + (jCurrentTimeMillis / 1000) + "秒");
            nv2.this.s.put(3, Long.valueOf(jCurrentTimeMillis));
            nv2.this.f.checkBleUpdateInfo(nv2.this.o, nv2.this.c);
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            nv2.this.h0("checkIfNeedUpdate error:" + Log.getStackTraceString(th), new Object[0]);
            nv2.this.f.onCheckFail(-1);
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
        }
    }

    public class w implements bua<String, o5h<Boolean>> {
        public w() {
        }

        @Override // defpackage.bua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o5h<Boolean> apply(String str) throws Exception {
            long jCurrentTimeMillis = System.currentTimeMillis() - nv2.this.l;
            nv2.this.l = System.currentTimeMillis();
            nv2.this.s.put(2, Long.valueOf(jCurrentTimeMillis));
            nv2.this.f.showLog("读取固件版本号时间" + (jCurrentTimeMillis / 1000) + "秒");
            nv2 nv2Var = nv2.this;
            return nv2Var.b0(nv2Var.f28393b);
        }
    }

    public class x implements bua<Boolean, o5h<String>> {
        public x() {
        }

        @Override // defpackage.bua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o5h<String> apply(Boolean bool) throws Exception {
            long jCurrentTimeMillis = System.currentTimeMillis() - nv2.this.l;
            nv2.this.l = System.currentTimeMillis();
            nv2.this.s.put(1, Long.valueOf(jCurrentTimeMillis));
            nv2.this.f.showLog("设备连接时间" + (jCurrentTimeMillis / 1000) + "秒");
            nv2.this.f28394k = SmartConfigCache.getInstance().getMcuVersion(nv2.this.f28393b.mac);
            nv2 nv2Var = nv2.this;
            return nv2Var.a0(nv2Var.f28393b);
        }
    }

    public class y implements bua<Device, o5h<Boolean>> {
        public y() {
        }

        @Override // defpackage.bua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o5h<Boolean> apply(Device device) throws Exception {
            return nv2.this.W(device, false);
        }
    }

    public class z implements z5h<Boolean> {
        public z() {
        }

        @Override // defpackage.z5h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean bool) {
        }

        @Override // defpackage.z5h
        public void onComplete() {
            nv2.this.l0(0);
            nv2.this.h0("upgrade finished.", new Object[0]);
            nv2.this.f.onSuccess();
            nv2.this.j0();
            nv2.this.i0("model: " + nv2.this.j + ", code: 0");
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            nv2.this.l0(0);
            if (th instanceof OTAException) {
                int code = ((OTAException) th).getCode();
                nv2.this.h0("start upgrade failed ,code =" + code, new Object[0]);
                nv2.this.i0("model: " + nv2.this.j + ", code: " + code);
                nv2.this.f.onUpgradeFail(code);
            } else {
                nv2.this.f.onUpgradeFail(-1);
            }
            nv2.this.h0("start upgrade failed, error msg:" + th.getMessage(), new Object[0]);
            nv2.this.f.showLog(th.getMessage());
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
        }
    }

    public nv2(Context context, i0d i0dVar, int i2, Device device, String str, String str2, String str3) {
        this.t = true;
        this.u = context;
        this.f = i0dVar;
        this.f28393b = device;
        this.j = device.model;
        this.f28395r = i2;
        String firmwareVersion = BluetoothCache.getFirmwareVersion(device.mac);
        if (TextUtils.isEmpty(firmwareVersion)) {
            this.o = this.f28393b.getFwVersion();
        } else {
            this.o = firmwareVersion;
        }
        this.g = URLUtil.isNetworkUrl(str) ? str : null;
        this.h = str2;
        this.i = str3;
        this.t = !c0();
        if (f0()) {
            BleMeshFirmwareUpdateInfo bleMeshFirmwareUpdateInfo = new BleMeshFirmwareUpdateInfo();
            this.c = bleMeshFirmwareUpdateInfo;
            bleMeshFirmwareUpdateInfo.version = str2;
            bleMeshFirmwareUpdateInfo.safeUrl = str;
            bleMeshFirmwareUpdateInfo.md5 = str3;
        }
        h0("ble ota presenter model %s,testVersion name %s, file md5 %s,test Url %s", this.j, str2, str3, str);
    }

    public void T() {
        this.l = System.currentTimeMillis();
        o4h.E(this.f28393b).H(ofl.c()).r(new y()).r(new x()).r(new w()).a(new v());
    }

    public final void U(Device device, int i2, v4h<Boolean> v4hVar) {
        String str = device.mac;
        if (i2 == 0) {
            f23.k(str, new h(str, device, v4hVar));
            return;
        }
        if (i2 == 1) {
            f23.l(str, new i(v4hVar));
            return;
        }
        if (i2 == 2) {
            f23.m(str, new j(v4hVar));
            return;
        }
        if (i2 == 3) {
            f23.e(str, new l(v4hVar));
        } else if (i2 == 4) {
            f23.c(str, new m(v4hVar));
        } else if (i2 == 5) {
            f23.b(str, device, new n(v4hVar));
        }
    }

    public final o4h<Boolean> V(Device device) {
        int i2;
        BleMeshFirmwareUpdateInfo bleMeshFirmwareUpdateInfo = this.c;
        if (bleMeshFirmwareUpdateInfo == null || (i2 = bleMeshFirmwareUpdateInfo.timeout) <= 32) {
            w = 4;
        } else {
            w = i2 / 8;
        }
        h0("firmware install retry count = " + w, new Object[0]);
        return o4h.f(new u(device)).J(new t());
    }

    public final o4h<Boolean> W(Device device, boolean z2) {
        return o4h.f(new g(device));
    }

    public final o4h<Boolean> X(Device device) {
        return o4h.f(new o(device));
    }

    public final o4h<Boolean> Y(boolean z2) {
        return o4h.f(new p(z2));
    }

    public final o4h<String> Z() {
        return o4h.f(new r());
    }

    public final o4h<String> a0(Device device) {
        return o4h.f(new q(device));
    }

    public final o4h<Boolean> b0(Device device) {
        return o4h.f(new s(device));
    }

    public final boolean c0() {
        return BluetoothUtils.getConnectionState(this.f28393b.mac) == 2;
    }

    public final boolean d0() {
        BleMeshFirmwareUpdateInfo bleMeshFirmwareUpdateInfo = this.c;
        return bleMeshFirmwareUpdateInfo != null && f23.d(bleMeshFirmwareUpdateInfo.version, this.o) > 0;
    }

    public final boolean e0() {
        McuUpdateInfo mcuUpdateInfo;
        BleMeshFirmwareUpdateInfo bleMeshFirmwareUpdateInfo = this.c;
        return (bleMeshFirmwareUpdateInfo == null || (mcuUpdateInfo = bleMeshFirmwareUpdateInfo.mcuUpdateInfo) == null || f23.d(mcuUpdateInfo.version, mcuUpdateInfo.currentMcuVersion) <= 0) ? false : true;
    }

    public boolean f0() {
        return !TextUtils.isEmpty(this.g) && URLUtil.isNetworkUrl(this.g);
    }

    public final o4h<String> g0(String str, String str2) {
        return o4h.f(new f(str, str2));
    }

    public final void h0(String str, Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            str = String.format(str, objArr);
        }
        MiJiaLog.writeLogOnAll(LogType.OTA, "Ble-OTA", str);
    }

    public final void i0(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("log OTA Result: ");
        sb.append(str);
    }

    public final void j0() {
        for (Map.Entry<Integer, Long> entry : this.s.entrySet()) {
            h0("reportSuccessTime, step %d, time %s", entry.getKey(), String.valueOf(entry.getValue()));
            i0("model: " + this.j + ", key: " + entry.getKey() + ", value: " + entry.getValue());
        }
        this.s.clear();
    }

    public final o4h<String> k0(String str) {
        return o4h.f(new e(str));
    }

    public final synchronized void l0(int i2) {
        this.d = i2;
    }

    public void m0(BleMeshFirmwareUpdateInfo bleMeshFirmwareUpdateInfo) {
        BleCacheManager.getInstance().getBleDeviceState(this.f28393b.mac).setOTAStatus(true);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f.onUpgrading();
        if (bleMeshFirmwareUpdateInfo != null && this.c == null) {
            this.c = bleMeshFirmwareUpdateInfo;
        }
        o4h.E(this.f28393b).H(ofl.c()).r(new d()).r(new c(bleMeshFirmwareUpdateInfo)).r(new b()).r(new a(jCurrentTimeMillis)).r(new c0()).r(new b0()).g(5L, TimeUnit.SECONDS).r(new a0()).a(new z());
    }
}
