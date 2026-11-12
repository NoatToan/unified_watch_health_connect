package com.huawei.health.airsharing.helper;

import android.content.Context;
import android.os.CountDownTimer;
import android.provider.Settings;
import com.huawei.android.airsharing.api.Event;
import com.huawei.android.airsharing.api.IEventListener;
import com.huawei.android.airsharing.api.ProjectionDevice;
import com.huawei.android.airsharing.client.PlayerClient;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes24.dex */
public class AirSharingHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f6186b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile AirSharingHelper f6187c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f6188a;
    private EventCallback e;
    private PlayerClient q;
    private boolean g = false;
    private String n = null;
    private ProjectionDevice m = null;
    private boolean l = false;
    private boolean j = false;
    private boolean k = false;
    private boolean f = false;
    private int s = -1;
    private boolean o = false;
    private boolean h = true;
    private CountDownTimer d = new CountDownTimer(120000, 1000) { // from class: com.huawei.health.airsharing.helper.AirSharingHelper.4
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            LogUtil.a("Distribute_AirSharingHelper", "PreSearch CountDownTimer Finished");
            AirSharingHelper.this.j = false;
            AirSharingHelper.this.f = false;
        }
    };
    private IEventListener i = new IEventListener() { // from class: com.huawei.health.airsharing.helper.AirSharingHelper.5
        @Override // com.huawei.android.airsharing.api.IEventListener
        public boolean onEvent(int i, String str) {
            LogUtil.a("Distribute_AirSharingHelper", "onEvent...id ", Integer.valueOf(i), "---string ", str);
            if (i == 3005) {
                AirSharingHelper.this.g = false;
                if (AirSharingHelper.this.j) {
                    AirSharingHelper.this.o();
                }
                if (AirSharingHelper.this.o) {
                    AirSharingHelper.this.p();
                    AirSharingHelper.this.o = false;
                    AirSharingHelper.this.k();
                }
            } else if (i == 3006 && AirSharingHelper.this.f && !AirSharingHelper.this.g && !AirSharingHelper.this.j) {
                AirSharingHelper.this.n();
            }
            if (AirSharingHelper.this.e != null) {
                LogUtil.d("Distribute_AirSharingHelper", "mEventCallback onEvent isSuccess = ", Boolean.valueOf(AirSharingHelper.this.e.onEvent(i, str)));
            }
            return false;
        }

        @Override // com.huawei.android.airsharing.api.IEventListener
        public void onDisplayUpdate(int i, String str, String str2, int i2) {
            ReleaseLogUtil.d("R_Distribute_AirSharingHelper", "onDisplayUpdate...");
            if (AirSharingHelper.this.e != null) {
                AirSharingHelper.this.e.onDisplayUpdate(i, str, str2, i2);
            }
        }

        @Override // com.huawei.android.airsharing.api.IEventListener
        public void onMirrorUpdate(int i, String str, String str2, int i2, boolean z) {
            ReleaseLogUtil.d("R_Distribute_AirSharingHelper", "onMirrorUpdate...");
            if (AirSharingHelper.this.e != null) {
                AirSharingHelper.this.e.onMirrorUpdate(i, str, str2, i2, z);
            }
        }

        @Override // com.huawei.android.airsharing.api.IEventListener
        public void onProjectionDeviceUpdate(int i, ProjectionDevice projectionDevice) {
            ReleaseLogUtil.d("R_Distribute_AirSharingHelper", "onProjectionDeviceUpdate...id ", Integer.valueOf(i));
            AirSharingHelper.this.d(i, projectionDevice);
            if (AirSharingHelper.this.e != null) {
                AirSharingHelper.this.e.onProjectionDeviceUpdate(i, projectionDevice);
            }
        }

        @Override // com.huawei.android.airsharing.api.IEventListener
        public void onEventHandle(Event event) {
            LogUtil.a("Distribute_AirSharingHelper", "onEventHandle...id ", Integer.valueOf(event.getEventId()));
        }
    };

    public interface EventCallback {
        void onDisplayUpdate(int i, String str, String str2, int i2);

        boolean onEvent(int i, String str);

        void onMirrorUpdate(int i, String str, String str2, int i2, boolean z);

        void onProjectionDeviceUpdate(int i, ProjectionDevice projectionDevice);
    }

    private AirSharingHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, ProjectionDevice projectionDevice) {
        String str;
        if (projectionDevice == null) {
            LogUtil.j("Distribute_AirSharingHelper", "device is null");
        }
        switch (i) {
            case 3001:
                LogUtil.a("Distribute_AirSharingHelper", "Device add:", projectionDevice.getIndication());
                int capability = projectionDevice.getCapability();
                LogUtil.a("Distribute_AirSharingHelper", "device capability:", Integer.valueOf(capability));
                if ((capability & 1) == 1 && (str = this.n) != null && this.j && str.equals(projectionDevice.getIndication())) {
                    LogUtil.a("Distribute_AirSharingHelper", "is last device exist:", this.n);
                    this.l = true;
                    this.m = projectionDevice;
                    break;
                }
                break;
            case 3002:
                LogUtil.a("Distribute_AirSharingHelper", "Device remove");
                break;
            case 3003:
                e(projectionDevice);
                break;
            case 3004:
                LogUtil.a("Distribute_AirSharingHelper", "Device connect failed");
                if (this.o) {
                    p();
                    this.o = false;
                } else if (this.j) {
                    o();
                }
                this.g = false;
                this.f = false;
                k();
                break;
        }
    }

    private void e(ProjectionDevice projectionDevice) {
        LogUtil.a("Distribute_AirSharingHelper", "Device connect succeed", projectionDevice.getIndication());
        if (this.o) {
            SharedPreferenceManager.e(this.f6188a, Integer.toString(1019), "projection_last_device_id", projectionDevice.getIndication(), new StorageParams());
        } else if (this.j) {
            o();
        }
        this.g = true;
        this.f = false;
    }

    public static AirSharingHelper e() {
        LogUtil.a("Distribute_AirSharingHelper", "getInstance...");
        if (f6187c == null) {
            synchronized (f6186b) {
                if (f6187c == null) {
                    f6187c = new AirSharingHelper();
                }
            }
        }
        return f6187c;
    }

    public boolean d(Context context) {
        LogUtil.a("Distribute_AirSharingHelper", "init...");
        if (this.k) {
            return true;
        }
        this.f6188a = context;
        PlayerClient playerClientE = PlayerClient.e();
        this.q = playerClientE;
        if (playerClientE == null) {
            LogUtil.j("Distribute_AirSharingHelper", "playerclient is null");
            return false;
        }
        try {
            if (!playerClientE.init(this.f6188a)) {
                LogUtil.j("Distribute_AirSharingHelper", "init failed ....");
                return false;
            }
        } catch (SecurityException e) {
            LogUtil.e("Distribute_AirSharingHelper", "init failed ", LogAnonymous.b(e));
        }
        this.k = true;
        LogUtil.a("Distribute_AirSharingHelper", "init success 01");
        this.q.d(this.i);
        this.q.subscribServers("7");
        LogUtil.a("Distribute_AirSharingHelper", "init success 02");
        return true;
    }

    public void e(EventCallback eventCallback) {
        LogUtil.a("Distribute_AirSharingHelper", "setEventCallback...");
        this.e = eventCallback;
    }

    public void d(String str) {
        if (i()) {
            LogUtil.a("Distribute_AirSharingHelper", "startPreSearch.", str);
            this.n = str;
            this.j = true;
            LogUtil.a("Distribute_AirSharingHelper", "PreSearch CountDownTimer start...");
            this.d.start();
            n();
        }
    }

    public void o() {
        LogUtil.a("Distribute_AirSharingHelper", "stopPreSearch...");
        this.d.cancel();
        m();
    }

    public void l() {
        LogUtil.a("Distribute_AirSharingHelper", "resetPreSearch...");
        this.l = false;
    }

    public boolean h() {
        LogUtil.a("Distribute_AirSharingHelper", "isInPreSearch:", Boolean.valueOf(this.j));
        return this.j;
    }

    public boolean f() {
        LogUtil.a("Distribute_AirSharingHelper", "isLastDeviceExist:", Boolean.valueOf(this.l), Boolean.valueOf(this.j));
        return this.l && this.j;
    }

    public ProjectionDevice c() {
        LogUtil.a("Distribute_AirSharingHelper", "getLastDevice...");
        return this.m;
    }

    public void n() {
        LogUtil.a("Distribute_AirSharingHelper", "startScanDevice...");
        PlayerClient playerClient = this.q;
        if (playerClient != null) {
            if (this.f) {
                playerClient.d(true);
            }
            this.q.b(true);
            this.f = true;
            if (this.j) {
                return;
            }
            t();
        }
    }

    public void m() {
        LogUtil.a("Distribute_AirSharingHelper", "stopScanDevice...");
        PlayerClient playerClient = this.q;
        if (playerClient != null) {
            playerClient.d(true);
            this.f = false;
            if (!this.j) {
                k();
            }
            this.j = false;
        }
    }

    private void q() {
        LogUtil.a("Distribute_AirSharingHelper", "releaseResource...");
        IEventListener iEventListener = this.i;
        if (iEventListener != null) {
            this.q.c(iEventListener);
            this.q.unsubscribServers();
        }
        this.q.deInit();
    }

    public boolean g() {
        PlayerClient playerClient = this.q;
        if (playerClient != null) {
            boolean zG = playerClient.g();
            LogUtil.a("Distribute_AirSharingHelper", "isConnected:", Boolean.valueOf(zG));
            return zG;
        }
        LogUtil.a("Distribute_AirSharingHelper", "isConnected:mPlayerClient is null");
        return false;
    }

    public void b() {
        LogUtil.a("Distribute_AirSharingHelper", "disconnected...");
        PlayerClient playerClient = this.q;
        if (playerClient == null || !this.o) {
            return;
        }
        playerClient.d();
    }

    public void a() {
        LogUtil.a("Distribute_AirSharingHelper", "forceDisconnect...");
        PlayerClient playerClient = this.q;
        if (playerClient != null) {
            playerClient.d();
        }
    }

    public void c(ProjectionDevice projectionDevice) {
        if (projectionDevice == null) {
            LogUtil.e("Distribute_AirSharingHelper", "device is null");
            return;
        }
        LogUtil.a("Distribute_AirSharingHelper", "connectToDevice:", projectionDevice.getDeviceName(), projectionDevice);
        if (this.q != null) {
            int iR = r();
            this.s = iR;
            LogUtil.a("Distribute_AirSharingHelper", "mOriginMode:", Integer.valueOf(iR));
            if (this.s != 0) {
                x();
            }
            this.q.a(projectionDevice);
            t();
            this.o = true;
        }
    }

    public String j() {
        LogUtil.a("Distribute_AirSharingHelper", "getTargetDevName...");
        PlayerClient playerClient = this.q;
        if (playerClient == null) {
            return null;
        }
        String strB = playerClient.b();
        LogUtil.a("Distribute_AirSharingHelper", "Target device name is ", strB);
        return strB;
    }

    private void x() {
        LogUtil.a("Distribute_AirSharingHelper", "setPhoneMode:", 0);
        Context context = this.f6188a;
        if (context != null) {
            Settings.Secure.putInt(context.getContentResolver(), "selected-proj-mode", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        LogUtil.a("Distribute_AirSharingHelper", "setOriginMode:", Integer.valueOf(this.s));
        Context context = this.f6188a;
        if (context != null) {
            Settings.Secure.putInt(context.getContentResolver(), "selected-proj-mode", this.s);
        }
    }

    private int r() {
        Context context = this.f6188a;
        if (context != null) {
            return Settings.Secure.getInt(context.getContentResolver(), "selected-proj-mode", -1);
        }
        return 0;
    }

    private void t() {
        LogUtil.a("Distribute_AirSharingHelper", "lightWirelessProjectionIcon...");
        Context context = this.f6188a;
        if (context != null) {
            Settings.Global.putInt(context.getContentResolver(), "wireless_projection_state", 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        LogUtil.a("Distribute_AirSharingHelper", "extinguishWirelessProjectionIcon...");
        Context context = this.f6188a;
        if (context != null) {
            Settings.Global.putInt(context.getContentResolver(), "wireless_projection_state", 0);
        }
    }

    public void a(boolean z) {
        LogUtil.a("Distribute_AirSharingHelper", "setIsCanPreSearch:", Boolean.valueOf(z));
        this.h = z;
    }

    public void d() {
        LogUtil.a("Distribute_AirSharingHelper", "finish...");
        if (this.o) {
            k();
            p();
        }
        if (g()) {
            b();
        }
        if (this.j) {
            o();
        }
        if (this.f) {
            m();
        }
        q();
        this.k = false;
        s();
        this.l = false;
        this.n = null;
        this.m = null;
        this.o = false;
        this.j = false;
        this.f = false;
        this.g = false;
        this.e = null;
    }

    private static void s() {
        synchronized (f6186b) {
            f6187c = null;
        }
    }

    public boolean i() {
        LogUtil.a("Distribute_AirSharingHelper", "isCanPreSearch...");
        return this.h && !this.j;
    }

    public void c(boolean z) {
        LogUtil.a("Distribute_AirSharingHelper", "setIsInit:", Boolean.valueOf(z));
        this.k = z;
        if (z) {
            return;
        }
        q();
    }
}
