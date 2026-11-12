package defpackage;

import android.content.Context;
import android.os.CountDownTimer;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C;
import com.huawei.health.device.wifi.entity.model.Entity;
import com.huawei.health.device.wifi.interfaces.BaseCallbackInterface;
import com.huawei.health.device.wifi.interfaces.ScanDeviceCallbackInterface;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.profile.profile.ProfileExtendConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ecx {
    private static final Object d = new Object();
    private static volatile ecx e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private eax f32764b;
    private BaseCallbackInterface g;
    private ScanDeviceCallbackInterface j;
    private d l;
    private ebv o;
    private int i = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32765c = false;
    private elh f = null;
    private CountDownTimer h = new CountDownTimer(60000, ProfileExtendConstants.TIME_OUT) { // from class: ecx.4
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            dyg.a(false, "ScanManager", "mScanDeviceWifiStatusTimer: onTick");
            String strD = ecx.this.f32764b.d(ecx.this.a());
            if (ecx.this.g != null) {
                ecx.this.g.onSuccess(strD);
            }
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            dyg.a(false, "ScanManager", "mScanDeviceWifiStatusTimer: onFinish");
            if (ecx.this.j != null) {
                ecx.this.j.onDeviceDiscoveryFinished();
            }
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ebg f32763a = new ebg();

    static /* synthetic */ int g(ecx ecxVar) {
        int i = ecxVar.i - 1;
        ecxVar.i = i;
        return i;
    }

    private ecx(Context context) {
        this.l = null;
        this.f32764b = eax.a(context);
        if (this.l == null) {
            HandlerThread handlerThread = new HandlerThread("wifi_scan");
            handlerThread.start();
            this.l = new d(this, handlerThread.getLooper());
        }
    }

    private void d(elh elhVar) {
        this.f = elhVar;
    }

    public static ecx d(Context context) {
        if (e == null) {
            synchronized (d) {
                if (e == null) {
                    e = new ecx(context);
                }
            }
        }
        return e;
    }

    public void d(elh elhVar, int i, ScanDeviceCallbackInterface scanDeviceCallbackInterface) {
        d(elhVar);
        d(i, scanDeviceCallbackInterface);
    }

    private void d(int i, ScanDeviceCallbackInterface scanDeviceCallbackInterface) {
        dyg.a(false, "ScanManager", "scanDeviceWifiAp: in");
        if (scanDeviceCallbackInterface == null) {
            return;
        }
        this.j = scanDeviceCallbackInterface;
        this.i = i;
        d dVar = this.l;
        if (dVar != null) {
            dVar.removeMessages(1001);
            this.l.removeMessages(1000);
            this.l.sendEmptyMessage(1000);
        }
    }

    static class d extends StaticHandler<ecx> {
        d(ecx ecxVar, Looper looper) {
            super(ecxVar, looper);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessage(ecx ecxVar, Message message) {
            if (ecxVar == null || message == null) {
                dyg.a(false, "ScanManager", "ScanDevice TimerHandler object or msg is null");
                return;
            }
            int i = message.what;
            if (i == 1000) {
                dyg.a(false, "ScanManager", "ScanDevice TimerHandler: start...");
                ecs.o(dxw.d());
                if (ecxVar.f32765c) {
                    ecxVar.c();
                }
                sendEmptyMessageDelayed(1001, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                return;
            }
            if (i != 1001) {
                dyg.d(false, "ScanManager", "TimerHandler default");
                return;
            }
            dyg.a(false, "ScanManager", "ScanDevice TimerHandler: query...");
            List<ebv> listD = ecxVar.f32764b.d(ecxVar.f);
            if (ecxVar.j != null && listD.size() > 0) {
                ecxVar.j.onDeviceDiscovered(listD);
            }
            if (ecx.g(ecxVar) <= 0) {
                dyg.a(false, "ScanManager", "ScanDevice TimerHandler Finished!");
                if (ecxVar.j != null) {
                    ecxVar.j.onDeviceDiscoveryFinished();
                    return;
                }
                return;
            }
            sendEmptyMessageDelayed(1000, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        ebt ebtVar = new ebt();
        ebtVar.a("1.0");
        ebtVar.e(ecn.a(8));
        this.f32763a.b(ebtVar, new Entity.EntityResponseCallback() { // from class: ecx.3
            @Override // com.huawei.health.device.wifi.entity.model.Entity.EntityResponseCallback
            public void onResponse(ebl eblVar) {
                ebu ebuVar;
                dyg.a(false, "ScanManager", "startScanDeviceCoap: onResponse");
                if (eblVar != null) {
                    if (eblVar instanceof ebu) {
                        ebuVar = (ebu) eblVar;
                        dyg.e(true, "ScanManager", "startScanDeviceCoap: response ", ebuVar.toString());
                    } else {
                        ebuVar = null;
                    }
                    ebv ebvVarC = ecx.this.f32764b.c(ebuVar);
                    if (ebvVarC.e() != null && !ebvVarC.e().isEmpty()) {
                        dyg.e(true, "ScanManager", "startScanDeviceCoap: device has been registered, deviceId is ", ebvVarC.e(), ",Scan device info is", ebvVarC);
                        return;
                    }
                    if (ebvVarC.d() == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList(16);
                    if (ecx.this.f == null || ecx.this.f.x().b(ebvVarC.j())) {
                        arrayList.add(ebvVarC);
                    }
                    dyg.a(false, "ScanManager", "startScanDeviceCoap infos size ", Integer.valueOf(arrayList.size()));
                    if (arrayList.size() <= 0 || ecx.this.j == null) {
                        return;
                    }
                    ecx.this.j.onDeviceDiscovered(arrayList);
                    return;
                }
                dyg.d(false, "ScanManager", "startScanDeviceCoap: response is null");
            }
        });
    }

    public void d() {
        d dVar = this.l;
        if (dVar != null) {
            dVar.removeMessages(1000);
            this.l.removeMessages(1001);
            this.l.removeCallbacksAndMessages(null);
            this.i = 0;
            this.j = null;
        }
    }

    public void a(ebv ebvVar) {
        this.o = ebvVar;
    }

    public ebv a() {
        return this.o;
    }

    public void b(ebv ebvVar, BaseCallbackInterface baseCallbackInterface) {
        dyg.a(false, "ScanManager", "Scan the specified device, temporarily set to 60 seconds, 1.5 times/sec to perform the check once");
        this.g = baseCallbackInterface;
        a(ebvVar);
        CountDownTimer countDownTimer = this.h;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
    }

    public void b() {
        CountDownTimer countDownTimer = this.h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }
}
